package com.zhou.homework01.Door;

import com.zhou.homework01.User.Guest;

import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("--------------请输入要模拟的用户类型---------------");
            System.out.println("1.外来人员,2.普通职工,3.管理员");

            String choose = scanner.next();
            switch (choose) {
                case "1":
                    testGuest();

                    break;
                case "2":
                    break;
                case "3":
                    break;
                default:
                    System.out.println("输入有误");
                    break;
            }
        }
        
    }

    private static void testGuest() {
        Door door = new Door(new Door.Bell());
        Guest guest = new Guest("张三");
        guest.pressBell(door.getBell());

    }
}

