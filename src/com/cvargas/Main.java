package com.cvargas;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static boolean esCapicua(int num) {
        return num==invertirNumero(num);
    }

    private static int invertirNumero(int num){
        int cifra, inverso = 0;
        while(num>0){
            cifra = num%10;
            inverso = cifra + inverso * 10;
            num /= 10;
        }
        return inverso;
    }
    public static void main(String[] args) {
        // write your code here
        List<Integer> list=new ArrayList<Integer>();
        int i = 0;
        while(i <= 100) {
            boolean capicua = esCapicua(i);
            if(capicua){
                list.add(i);
            }
            i++;
        }
        System.out.println(list);

        List<Integer> list1 =new ArrayList<Integer>();
        int x = 100;
        while(x <= 1000) {
            boolean capicua = esCapicua(x);
            if(capicua){
                list1.add(x);
            }
            x++;
        }
        System.out.println(list1);

        List<Integer> list2 =new ArrayList<Integer>();
        int y = 1000;
        while(y <= 10000) {
            boolean capicua = esCapicua(y);
            if(capicua){
                list2.add(y);
            }
            y++;
        }
        System.out.println(list2);


    }

}