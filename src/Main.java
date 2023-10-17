public class Main {
        public static void main(String[] args) {

       first_task();
        System.out.println();
        first_task();
       System.out.println();
       second_task();
       System.out.println();

       third_task();

            System.out.println();
            forth_task();
        }
        static void first_task() {
            int[][] array = new int [][]{{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int sum =0;
            for (int rows = 0; rows < array.length; rows++) {
                for (int cols = 0; cols < array[rows].length; cols++) {
                    sum =sum + array[rows][cols];
                }
    }
            System.out.println ("Сумма чисел массива составляет: "+sum);
    }

    static void second_task() {

        int[][] array = new int[][]{{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int max = 0;
        for (int rows = 0; rows < array.length; rows++) {
            for (int cols = 0; cols < array[rows].length; cols++) {
                if (array[rows][cols]>max){
                max =array[rows][cols]; }
            }
            }
        System.out.println ("Максимальное число в массиве равно: "+max);
    }

    static void third_task() {

        int[][] array = new int [][]{{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int min = array[0][0];
        for (int rows = 0; rows < array.length; rows++) {
            for (int cols = 0; cols < array[rows].length; cols++) {

                if (array[rows][cols]<min){
                    min =array[rows][cols]; }
            }
        }
        System.out.println ("Минимальное число в массиве равно: "+min);
    }

    static void forth_task() {

        int[][] array = new int [][]{{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int num = 0;
        for (int rows = 0; rows < array.length; rows++) {
            for (int cols = 0; cols < array[rows].length; cols++) {
                num++;
            }}

        System.out.println ("Количество элементов в массиве равно: "+num);}}









