package com.company.factory;

public class MemberFactory {

    public static Member createMember(int memberUniqueId) {
        Member member;
        if (memberUniqueId == Member.LIFE_TIME_UNIQUE) {
            member = new LifeTime();
        } else if (memberUniqueId == Member.ANNUAL_UNIQUE) {
            member = new Annual();
        } else {
            member = new Temporary();
        }
        return member;
    }
}
