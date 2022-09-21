package com.company;

import com.company.factory.MemberManager;
import com.company.singleton.ApplicationManager;

public class Main {

    public static void main(String[] args) {

        //Singleton
        //Bizda ma'lum bir class bor, undan olingan object dastur ishlash davomida
        //faqat bir marotaba yaralishi kerak
//        ApplicationManager manager;
//        manager = ApplicationManager.getInstance("Windows 10 Pro", "Jaxedev");
//        manager.checkManagerData();
//        manager = ApplicationManager.getInstance("Mac Os", "Ozodbek");
//        manager.checkManagerData();

        //Co-Working uchun registration dastur yaratish kerak
        //Bizda LifeTime, Annual, Temporary Member'lar bor va ularni ro'yxatga oluvchi dastur kerak

        MemberManager manager = new MemberManager();
        manager.start();


    }
}
