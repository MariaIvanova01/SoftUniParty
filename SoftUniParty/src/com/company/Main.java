package com.company;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Set<String> vip = new TreeSet<>();
        Set<String> regular = new TreeSet<>();

        String input = scan.nextLine();

        while (!input.equals("PARTY")){
            if (Character.isDigit(input.charAt(0))){
                vip.add(input);
            }else {
                regular.add(input);
            }
            input = scan.nextLine();
        }
        input = scan.nextLine();
        while (!input.equals("END")){
            if (vip.contains(input)){
                vip.remove(input);
            }
            if (regular.contains(input)){
                regular.remove(input);
            }
            input = scan.nextLine();
        }

        System.out.println(vip.size() + regular.size());
        if (!vip.isEmpty()) {
            System.out.println(String.join(System.lineSeparator(), vip));
        }
        if (!regular.isEmpty()) {
            System.out.println(String.join(System.lineSeparator(), regular));
        }

    }
}
