package com.company.factory;

import java.util.Scanner;

public class MemberManager {

    public void start() {

        System.out.println("Welcome our Co-Working");
        System.out.println("Choose your membership");
        System.out.println("1. LifeTime");
        System.out.println("2. Annual");
        System.out.println("3. Temporary");

        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();

        Member member = MemberFactory.createMember(userChoice);
        member.register();

    }

}
