package com.step.calculator;

import java.util.Scanner;

public class Game {
    public void game() {
        int num = (int) Math.floor(Math.random() * 30);
        int number = 1;
        int count = 0;
        Scanner input = new Scanner(System.in);
        do {
            count++;
            System.out.print("Введите ваше число: ");
            number = input.nextInt();
            if (number < num)
                System.out.println(" Ваше число меньше");
            else if (number > num)
                System.out.println(" Ваше число больше");
            else
                System.out.println(" Вы угадали");
            System.out.println(" Введите число ");
        } while (number != num);
    System.out.println("Вы угадали число с " + count + " попыток.");
    }
}
