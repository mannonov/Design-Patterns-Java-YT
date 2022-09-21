package com.company.factory;

public interface Member {

    public static final int LIFE_TIME_UNIQUE = 1;
    public static final int ANNUAL_UNIQUE = 2;
    public static final int TEMPORARY_UNIQUE = 3;

    abstract void register();

}
