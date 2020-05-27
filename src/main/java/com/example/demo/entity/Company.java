package com.example.demo.entity;

import java.io.Serializable;

public class Company implements Serializable{
    private String c001;

    private String c002;

    private String c003;

    private String c004;

    private String c005;

    private String c006;

    private String c007;

    private String c008;

    private String c009;

    private String c010;

    private String c011;

    public Company() {
    }

    public Company(String c001, String c002, String c003, String c004, String c005, String c006, String c007, String c008, String c009, String c010, String c011) {
        this.c001 = c001;
        this.c002 = c002;
        this.c003 = c003;
        this.c004 = c004;
        this.c005 = c005;
        this.c006 = c006;
        this.c007 = c007;
        this.c008 = c008;
        this.c009 = c009;
        this.c010 = c010;
        this.c011 = c011;
    }

    public String getC001() {
        return c001;
    }

    public void setC001(String c001) {
        this.c001 = c001 == null ? null : c001.trim();
    }

    public String getC002() {
        return c002;
    }

    public void setC002(String c002) {
        this.c002 = c002 == null ? null : c002.trim();
    }

    public String getC003() {
        return c003;
    }

    public void setC003(String c003) {
        this.c003 = c003 == null ? null : c003.trim();
    }

    public String getC004() {
        return c004;
    }

    public void setC004(String c004) {
        this.c004 = c004 == null ? null : c004.trim();
    }

    public String getC005() {
        return c005;
    }

    public void setC005(String c005) {
        this.c005 = c005 == null ? null : c005.trim();
    }

    public String getC006() {
        return c006;
    }

    public void setC006(String c006) {
        this.c006 = c006 == null ? null : c006.trim();
    }

    public String getC007() {
        return c007;
    }

    public void setC007(String c007) {
        this.c007 = c007 == null ? null : c007.trim();
    }

    public String getC008() {
        return c008;
    }

    public void setC008(String c008) {
        this.c008 = c008 == null ? null : c008.trim();
    }

    public String getC009() {
        return c009;
    }

    public void setC009(String c009) {
        this.c009 = c009 == null ? null : c009.trim();
    }

    public String getC010() {
        return c010;
    }

    public void setC010(String c010) {
        this.c010 = c010 == null ? null : c010.trim();
    }

    public String getC011() {
        return c011;
    }

    public void setC011(String c011) {
        this.c011 = c011 == null ? null : c011.trim();
    }

    @Override
    public String toString() {
        return "Company{" +
                "c001='" + c001 + '\'' +
                ", c002='" + c002 + '\'' +
                ", c003='" + c003 + '\'' +
                ", c004='" + c004 + '\'' +
                ", c005='" + c005 + '\'' +
                ", c006='" + c006 + '\'' +
                ", c007='" + c007 + '\'' +
                ", c008='" + c008 + '\'' +
                ", c009='" + c009 + '\'' +
                ", c010='" + c010 + '\'' +
                ", c011='" + c011 + '\'' +
                '}';
    }
}