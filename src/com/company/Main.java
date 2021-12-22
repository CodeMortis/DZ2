package com.company;

public class Main {

    public static void main(String[] args) {
        temperatureAndAge();
        temperatureAndAge();
        temperatureAndAge();
        temperatureAndAge();
        temperatureAndAge();
    }

    public static void temperatureAndAge() {
        int tmptr = (int) (Math.random() * 60 - Math.random() * 50);
        System.out.println("Температура на улице:" + tmptr);
        int g = (int) (Math.random() * 60);
        System.out.println("Возраст:" + g);
        if(20<g && g<45 && -20<tmptr && tmptr<30){
            System.out.println("Можно идти гулять");
        }else if(20>g && -1<tmptr && tmptr<29){
            System.out.println("Можно идти гулять");
        }else if(45<g && -11<tmptr && tmptr<26) {
            System.out.println("Можно идти гулять");
        }else{
            System.out.println("Остовайся дома!");
        }
        return;
    }
}
