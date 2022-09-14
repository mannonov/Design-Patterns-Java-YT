package com.company.singleton;

public class ApplicationManager {

    private static ApplicationManager instance;

    private String os;
    private String adminName;

    private ApplicationManager(String os, String adminName) {
        this.os = os;
        this.adminName = adminName;
    }

    public static ApplicationManager getInstance(String os, String adminName) {
        if (instance == null) {
            instance = new ApplicationManager(os, adminName);
        }
        return instance;
    }

    public void checkManagerData() {
        System.out.println("os " + os);
        System.out.println("adminName " + adminName);
    }

}
