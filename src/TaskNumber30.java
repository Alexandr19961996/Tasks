
// Путешествуя, ВАЛЛ-И попал в логово к Дракону. Чтобы остаться в живых ему надо угадать число,
// которое задумали его головы. Первая голова называет любое целое число, вторая - увеличивает
// его на 3, а третья результат уменьшает в 2 раза. Составьте программу, которая позволит ВАЛЛ-И
// безошибочно вычислять результат.
//
// Входные данные: на вход подается натуральное число.
// Выходные данные: выведите ответ на задачу.
//
// Sample Input:
//      10
// Sample Output:
//      6.5

import java.util.Scanner;

public class TaskNumber30 {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        int number = line.nextInt();
        System.out.println((double) (number + 3) / 2);
    }
}
