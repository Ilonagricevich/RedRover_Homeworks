public class Main {
    public static void main(String[] args) {

      //  first_task();
     //   System.out.println();
      //  second_task();
     //   System.out.println();
     //   third_task();
     //   System.out.println();
      extra_task();
    }

    static void first_task() {
        String s = "Перестановочный алгоритм быстрого действия";

        for (int i = 0; i<s.length(); i++) {
            if (s.charAt(i) == 'о') {
                System.out.println (s.charAt(i));
            }
        }
    }

    static void second_task() {
        int counter = 0;
        String s = "Перевыборы выбранного президента";
        for (int i = 0; i<s.length(); i++) {
            if (s.charAt(i) == 'е') {
                counter++;}
        }
        System.out.println ("Количество букв е в строке: "+counter);
    }


    static void third_task() {

        String s = "Посмотрите как Рите нравится ритм";
        s=s.toLowerCase();
        for (int i = 0; i<s.length()-2; i++) {
            if (s.charAt(i) == 'р' & s.charAt(i+1) == 'и' & s.charAt(i+2) == 'т')
           System.out.println(i);}
        }


    static void extra_task() {

        String[][] array = {
                {"Привет", "всем", "кто" },
                {"изучает", "язык", "программирования" },
                {"java" }};
        int counter = 0;
        for (int rows = 0; rows < array.length; rows++) {
            for (int cols = 0; cols < array[rows].length; cols++) {
                for (int i = 0; i < array[rows][cols].length(); i++) {
                    if (array[rows][cols].charAt(i) != 'е') {
                        counter++;
                    }

                }

            }

        }
        System.out.println(counter);
    }}