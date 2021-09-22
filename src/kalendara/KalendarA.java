/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalendara;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class KalendarA {
 public static void main(String[] args) {
        int correctAnswers = 0;
        Random numGenerator = new Random();
        Scanner inputScanner = new Scanner(System.in);
        int[] nums =  new int[2];
        while(correctAnswers != 5) {
            nums[0] = numGenerator.nextInt(9)+1;
            nums[1] = numGenerator.nextInt(9)+1;
            System.out.print(nums[0]+" * "+nums[1]+" = ");
            int answer = inputScanner.nextInt();
            if(answer == nums[0]*nums[1]) {
                System.out.println("Правильно.");
                ++correctAnswers;
            }
            else
                System.out.println("Неправильно. Попробуйте еще раз.");
        }
        System.out.println("Завершение.");
    }   
}
