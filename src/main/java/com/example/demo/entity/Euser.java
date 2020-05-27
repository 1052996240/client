package com.example.demo.entity;

import java.io.Serializable;

public class Euser implements Serializable {
    private String u001;

    private String u002;

    private String u003;

    private String u004;

    private String u005;

    private String u006;

    private String u007;

    private String u008;

    private String u009;

    private String u0010;

    public String getU001() {
        return u001;
    }

    public void setU001(String u001) {
        this.u001 = u001 == null ? null : u001.trim();
    }

    public String getU002() {
        return u002;
    }

    public void setU002(String u002) {
        this.u002 = u002 == null ? null : u002.trim();
    }

    public String getU003() {
        return u003;
    }

    public void setU003(String u003) {
        this.u003 = u003 == null ? null : u003.trim();
    }

    public String getU004() {
        return u004;
    }

    public void setU004(String u004) {
        this.u004 = u004 == null ? null : u004.trim();
    }

    public String getU005() {
        return u005;
    }

    public void setU005(String u005) {
        this.u005 = u005 == null ? null : u005.trim();
    }

    public String getU006() {
        return u006;
    }

    public void setU006(String u006) {
        this.u006 = u006 == null ? null : u006.trim();
    }

    public String getU007() {
        return u007;
    }

    public void setU007(String u007) {
        this.u007 = u007 == null ? null : u007.trim();
    }

    public String getU008() {
        return u008;
    }

    public void setU008(String u008) {
        this.u008 = u008 == null ? null : u008.trim();
    }

    public String getU009() {
        return u009;
    }

    public void setU009(String u009) {
        this.u009 = u009 == null ? null : u009.trim();
    }

    public String getU0010() {
        return u0010;
    }

    public void setU0010(String u0010) {
        this.u0010 = u0010 == null ? null : u0010.trim();
    }

    public Euser() {
    }

    public Euser(String u001, String u002, String u003, String u004, String u005, String u006, String u007, String u008, String u009, String u0010) {
        this.u001 = u001;
        this.u002 = u002;
        this.u003 = u003;
        this.u004 = u004;
        this.u005 = u005;
        this.u006 = u006;
        this.u007 = u007;
        this.u008 = u008;
        this.u009 = u009;
        this.u0010 = u0010;
    }

    @Override
    public String toString() {
        return "Euser{" +
                "u001='" + u001 + '\'' +
                ", u002='" + u002 + '\'' +
                ", u003='" + u003 + '\'' +
                ", u004='" + u004 + '\'' +
                ", u005='" + u005 + '\'' +
                ", u006='" + u006 + '\'' +
                ", u007='" + u007 + '\'' +
                ", u008='" + u008 + '\'' +
                ", u009='" + u009 + '\'' +
                ", u0010='" + u0010 + '\'' +
                '}';
    }
}