import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

public class telbook {
    public static void main(String[] args) {
        sem1_homework1();
    }

    static void task0() {
        System.out.println("Как тебя зовут?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        LocalTime localTime = LocalTime.now();
        int hour = localTime.getHour();
        if(hour >= 6 && hour < 12) {
            System.out.println("Доброе утро, " + name);
        }
        else if (hour < 18){
            System.out.println("Добрый день, " + name);
        }
        else if (hour < 23){
            System.out.println("Добрый вечер, " + name);
        }
        else {
            System.out.println("Доброй ночи, " + name);
        }
        scanner.close();
    }

    static void task1(){
        int[] arr = {1, 0, 1, 0, 1, 1};
        int count = 0;
        int ones = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1){
                count++;
            }
            else{
                if(count > ones){
                    ones = count;
                }
                count = 0;
            }
        }
        if (count > ones){
            System.out.println(count);
        }
        else {
            System.out.println(ones);
        }
    }

    static void task2() {
        int[] arr = {3, 2, 1, 4, 3, 3, 5, 7, 0, 1};
        int val = 3;
        int[] tempArr = new int[arr.length];
        Arrays.fill(tempArr, val);
        int current = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != val){
                tempArr[current++] = arr[i];

            }
        }
        System.out.println(Arrays.toString(tempArr));
    }

    static  void sem1_task1(){
        String text_nash = "Добро пожаловать на курс по Java";
        String [] text_massiv = text_nash.split(" ");
        String temp_word = "";
        for (int i = 0; i < text_massiv.length; i++) {
            temp_word = temp_word + text_massiv[text_massiv.length - 1 - i] + " ";
        }
        System.out.println(temp_word);
    }

    static void sem1_homework1(){
        int n = 6;
        int count = 1;
        int temp = 0;

        for (int i = 0; i < n; i++){
            temp += count;
            count++;
        }
        System.out.println(temp);
    }
}
