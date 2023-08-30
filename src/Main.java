import java.util.Arrays;

public class Main {
        public static void main(String[] args) {

      //  first_task_hw4();
      //  System.out.println();
       // second_task_hw4();
      //  System.out.println();
       // third_task_hw4();
       //  System.out.println();
       //    fourth_task_hw4();
       //  System.out.println();
          //  fifth_task_hw4();
        //  System.out.println();
        //    sixth_task_hw4();
        //  System.out.println();
        //    seventh_task_hw4();
        //  System.out.println();
         //   eighth_task_hw4();
        //  System.out.println();
        //    ninth_task_hw4();
        //  System.out.println();
            tenth_task_hw4();

        }
        static void first_task_hw4() {

        int counter = 0;

        while (counter<=15) {
            System.out.println (counter);
            counter ++;
        }
    }

    static void second_task_hw4() {
            int counter = 0;
            int number = 0;
            while (counter <10000){
                counter = counter+2;
                number = (int) Math.pow(5, counter);
                System.out.println("Степень числа равна "+counter+" Возведение числа 5 в степень равно "+number);
            }
    }
    static void third_task_hw4() {
            int number = 40;
        for (int i=0; number <=60; i++){
            if (number%4==0){
                System.out.println(number);
            }
            number++;
        }
        System.out.println();
            int second_number = 40;
            while (second_number <=60) {
                System.out.println (second_number);
                second_number = second_number+4;
            }
    }
    static void fourth_task_hw4() {
        int sum = 0;
        int[] array = new int[] {9, 2, 6, 4, 5, 12, 7, 8, 6};
        for (int i=0; i< array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println (sum);
    }
    static void fifth_task_hw4() {

        int[] array = new int[] {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int max=array[0];
        for (int i=0; i<array.length; i++){
        if (max<array[i]) {
            max = array [i];
        }}
        System.out.println ("Максимальное значение массива: "+max);
        }

        static void sixth_task_hw4() {
        int[] array = new int[] {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int min = array [0];
            for (int i=0; i<array.length; i++){
                if (min>array[i]) {
                    min = array [i];
                }}
            System.out.println ("Минимальное значение массива: "+min);
        }

         static void seventh_task_hw4() {
         int sum =0;
         int[] array = new int[]  {1, 2, 3, 4, 5, 6, 7, 8, 9};
             for (int i=0; i<array.length; i++){
                 sum = sum+array[i];
             }
         System.out.println ("Среднее арифметическое массива: "+(sum/ (array.length-1)));
         }

         static void eighth_task_hw4() {
         int[] array = new int[]  {-2, -1, 22, 83, 4, -5, 6, 7, -8, 9};
         int positive = 0;
         int negative = 0;
         for (int i=0; i<array.length; i++) {
             if (array[i] > 0) {
                 positive++;
             } else {
                 negative++;
             }
         }
         System.out.println("В массиве " + positive+" положительных чисел и "+negative + " отрицательных чисел");

          }

    static void ninth_task_hw4() {
        int[] array = new int[] {5,6,7,8};
        int counter = 0;
        int number = array[0];
        for (int i=0; i<array.length-1; i++) {
        if (array [i+1]>number){
        counter ++;}
        number = array[i];

        }
        if (counter == (array.length-1)) {
            System.out.println ("Массив отсортирован");}
        else {
            System.out.println ("Массив не отсортирован");}
        }

    static void tenth_task_hw4() {
            int n = 7;
            int[] array = new int[n];
            array [0] =1;
            array [1]=1;
        for (int i=2; i<array.length; i++) {
            array[i] = array[i-1]+array [i-2];
        }
        System.out.println (Arrays.toString(array));
        }
}


















