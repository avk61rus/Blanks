package geekbrains.lesson3;

import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {

    public static void main(String args[]) {
        gameGuesTheNumber();
        gameGuesTheWord();
    }

    private static void gameGuesTheNumber() {
        int numberGame = 1;
        while (numberGame == 1) {
            Random random = new Random();
            int randomNumber = random.nextInt(10);
//             System.out.println("загаданное число: " + randomNumber);
            System.out.println("\nУ Вас три попытки угадать число от 3 до 10");
            for (int c = 0; c < 3; c++) {
                System.out.print("Введите число >>>>   ");
                Scanner scanner = new Scanner(System.in);
                int numberInput = scanner.nextInt();
//                    System.out.println("Игрок ввел цифру: " + numberInput);
                if (randomNumber == numberInput) {
                    System.out.println("\nВы выиграли!");
                    break;
                } else if (randomNumber < numberInput) {
                    System.out.println("\nЗагаданное число меньше Вашего");
                } else if (randomNumber > numberInput) {
                    System.out.println("\nЗагаданное число больше Вашего");
                } // не смог вывести на экран "Вы проиграли" в случае если
                // за 3 попытки не удалось отгадать число.
            }

            System.out.println("Загаданное число = " + randomNumber);
            System.out.println("\nСыграем еще? <1> - да,  <2> - нет");
            Scanner scanner = new Scanner(System.in);
            numberGame = scanner.nextInt();
        }
        System.out.println("Игра закончена!");
    }

    private static void gameGuesTheWord() {
        String[] words = new String[]{"apple", "orange", "lemon", "banana", "apricot", "avacado",
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak",
                "kivi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
                "pepper", "pineapple", "pumpkin", "potato"};
        Random randomWord = new Random();
        int k = randomWord.nextInt(words.length);
        System.out.println("\nЗагадано: " + words[k]); //узнаем загаданное слово
        System.out.println("Угадайте название овоща или фрукта: >>>");
        Scanner scanner = new Scanner(System.in);
        String wordInput = scanner.next();
        while (!wordInput.equals(words[k])) {
            int c;
            if (words[k].length() > wordInput.length()) c = wordInput.length();
            else c = words[k].length();
            for (int j=0; j < c; j++) {
                char bLetter = wordInput.charAt(j);
                char aLetter = words[k].charAt(j);
                if (aLetter == bLetter) {
                    System.out.print(aLetter);
                } else break;




                }  for (int i = 0; i < 16 - words.length; i++) {System.out.print("+");
            } return;

        } System.out.println("\nВы угадали!");
    }
}