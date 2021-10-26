package ru.sapteh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Program1 {
    public static void main(String[] args) {
        String[] strings = new String[]{"Vasya", "Roman","ale", "Dima"};
        System.out.println(Arrays.toString(minMaxWord(strings)));
        System.out.println(sum(7, 5));
        System.out.println(sumArr(6,12,42,65,32));
        System.out.println(degree(5,2));
        System.out.println(Arrays.toString(random(10, 100)));
        List<Integer> list = new ArrayList<>();
        list.add(45);
        list.add(34);
        list.add(-45);
        list.add(-34);
        list.add(-5);
        list.add(2);
        list.add(-54);
        list.add(-20);
        System.out.println(negativeValue(list));
    }

    public static int sum (int a, int b) {
        return a + b;

    }

    public static int sumArr (int... a) {
        int res = 0;
        for (int i = 0; i < a.length; i++) {
            res += a[i];
        }
        return res;
    }

    public static int degree (int num, int degree){
        int res = 1;
        for (int i = 0; i < degree; i++) {
            res *= num;
        }
        return res;
    }

    public static String[] minMaxWord (String[] strings) {
        int min = strings[0].length();
        int max = strings[0].length();
        String min1 = strings[0];
        String max1 = strings[0];

        for (int i = 0; i < strings.length; i++) {

            if (strings[i].length() < min ) {
                min = strings[i].length();
                min1 = strings[i];
            }
            if (strings[i].length() > max ) {
                max = strings[i].length();
                max1 = strings[i];

            }

        }
        return new String[] {max1, min1};
    }

    public static int[] random (int count, int bound) {
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = new  Random().nextInt(bound);
        }
        return array;
    }

    public static int negativeValue (List<Integer> list) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0){
                count++;
            }

        }
        return count;
    }





}
