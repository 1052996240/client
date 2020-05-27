package com.example.demo.config;

import com.example.demo.controller.MyAuthenticationProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 对 security 权限的配置类
 *
 * @author yiaz
 * @date 2019年3月18日14:04:55
 */
@EnableWebSecurity
public class WebSecurityConfig {

    /**
     * 创建 springSecurityFilterChain 拦截器
     *
     * @return
     */
//    @Bean
//    public WebMvcConfigurer webMvcConfigurer() {
//        return new WebMvcConfigurer() {
//        };
//    }

    /**
     * 注册 springSecurityFilterChain 拦截器
     *
     * @return
     */
//    @Bean
//    public AbstractSecurityWebApplicationInitializer abstractSecurityWebApplicationInitializer() {
//        return new AbstractSecurityWebApplicationInitializer() {
//        };
//    }


    /**
     * 配置用户名和密码和拥有的角色，此时只做硬编码，后面会改成数据库中动态获取
     *
     * @return
     * @throws Exception
     */
//    @Bean
//    public UserDetailsService userDetailsService() throws Exception {
//        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
//        manager.createUser(User.withDefaultPasswordEncoder().username("user").password("password").roles("USER").build());
//        return manager;
//    }


    /**
     * security 配置
     *
     * @param myAuthenticationProvider
     * @return
     */

    @Autowired
    @Bean
    public WebSecurityConfigurerAdapter webSecurityConfigurerAdapter(MyAuthenticationProvider myAuthenticationProvider) {
        /**
         * 配置对哪些路径进行拦截,如果方法里面什么都不写，则不拦截任何路径；
         * <p>
         * 如果，使用 super.configure(http)，父类的方法：
         * ((HttpSecurity)((HttpSecurity)((AuthorizedUrl)http.authorizeRequests().anyRequest()).authenticated().and()).formLogin().and()).httpBasic();
         * <p>
         * 我们自定义下拦截规则,表单等一系列规则；
         */
        return new WebSecurityConfigurerAdapter() {
            @Override
            protected void configure(HttpSecurity http) throws Exception {
                //权限设置拦截
                http
                        .authorizeRequests()
                        // 放行登录
                        .antMatchers("/machine/**", "/error/**").permitAll() //放行文件
//                        .antMatchers("/**").hasRole("/admin")
//                        .antMatchers("/level1/**").hasRole("ONE")
//                        .antMatchers("/level2/**").hasRole("TWO")
//                        .antMatchers("/level3/**").hasRole("ONE")
                        .anyRequest().authenticated();

                // 开启表单认证
                http
                        .formLogin()
                        // 处理登录的页面
                        .loginPage("/login")
                        // 表单提交调用的页面
                        .loginProcessingUrl("/login")
                        .permitAll();
                // 第二个参数，如果不写成true，则默认登录成功以后，访问之前被拦截的页面，而非去我们规定的页面
//                        .defaultSuccessUrl("/welcome");

                //注销功能
                http.logout().logoutUrl("/logout");

                http.csrf().disable().httpBasic();

                //开启记住我功能
//                http.rememberMe().rememberMeParameter("remeber");
                //登陆成功以后，将cookie发给浏览器保存，以后访问页面带上这个cookie，只要通过检查就可以免登录
                //点击注销会删除cookie
            }

            @Override
            public void configure(WebSecurity web) throws Exception {
                //解决静态资源被拦截的问题
                web.ignoring().antMatchers("/css/**", "/js/**","/static/**","/Bootstrap-3.3.7-dist/**","/layui/**");
            }


            /**
             * 配置自定义校验规则，密码编码，使用我们自定义的校验器
             * @param auth
             * @throws Exception
             */
            @Override
            protected void configure(AuthenticationManagerBuilder auth) throws Exception {
                auth.authenticationProvider(myAuthenticationProvider);
            }

        };
    }

}

