public class Main {
        public static void main(String[] args) {

        first_task();
        System.out.println();
        first_task_extra();
       System.out.println();
       second_task_part1();
       System.out.println();
         second_task_part2();
           System.out.println();
         second_task_extra();
           System.out.println();
          third_task_part1();
        System.out.println();
            third_task_part2();
            System.out.println();
            third_task_part3();
        }
        static void first_task() {

        System.out.println("3");
        System.out.println("2");
        System.out.println("1");
        System.out.println("Поехали!");
    }

         static void first_task_extra() {

             System.out.println("____888888______________________________");
             System.out.println("____888888______________________________");
             System.out.println("___8888888888___________________________");
             System.out.println("__888888888888__________________________");
             System.out.println("__8888111188888_________________________");
             System.out.println("_888881111188888___11___________________");
             System.out.println("_8888811111188888_11____________________");
             System.out.println("_8888811111188888_11____________________");
             System.out.println("_8888811111118888_11____________________");
             System.out.println("_8888881111118888_11___11__8888888______");
             System.out.println("_8888881111118888__1__11__88888888888___");
             System.out.println("_8888888111111888____11__8888888888888__");
             System.out.println("__888888111111888_111___88888888888888__");
             System.out.println("__8888888111118881111__888881111118888__");
             System.out.println("___888888811188881111_8888811111111888__");
             System.out.println("____8888888188881111188888111111118888__");
             System.out.println("_____88888888888111118888111111118888___");
             System.out.println("______888888888111118888811111188888____");
             System.out.println("______8888888881111188888888888888______");
             System.out.println("_____888888888811111888888888888________");
             System.out.println("____88888888888111118888888888__________");
             System.out.println("___88881111888811111888888888___________");
             System.out.println("__8888111111888111118888888888__________");
             System.out.println("_888881111118881111188811118888_________");
             System.out.println("_8888881111888811111881111118888________");
             System.out.println("_8888888118888811111888111188888________");
             System.out.println("__888888888888_1111888881188888_________");
             System.out.println("___8888888888___111_8888888888__________");
             System.out.println("____88888888_____1___88888888___________");
             System.out.println("_____888888___________888888____________");
             System.out.println("_______________________8888_____________");
         }

            static void second_task_part1() {

            double a = 10;
            double b = 12;

            System.out.println("a+b = " + (a+b));
            System.out.println("a*b = " + (a*b));
            System.out.println("a-b = " + (a-b));
            System.out.println("a/b = " + (a/b));
            System.out.println("Остаток от деления а на b равен " + (a%b));
            if (a%2==0) {
                System.out.println("Число а четное");}
                else {
                System.out.println("Число а нечетное");
                }
                if (b%2==0) {
                    System.out.println("Число b четное");}
                else {
                    System.out.println("Число b нечетное");
                }
            }

    static void second_task_part2() {
            double salary = 100;
            int numbers = 30;
            double salary_owner = salary/2;
            double salary_other = salary_owner/2/numbers;
            double salary_cap = salary_owner/2+salary_other;
            System.out.println ("Владелец корабля получает: " + salary_owner);
        System.out.println ( "Капитан корабля получает: " + salary_cap);
                System.out.println ("Члены команды корабля получают: " + salary_other);

            if ((salary_owner+salary_cap+salary_other*(numbers-1))==salary) {
                System.out.println ("Расчет верен");}
                else {
                    System.out.println ("Расчет неверен");

                }
            }

    static void second_task_extra() {
        System.out.println ("😏");
    }

    static void third_task_part1() {
            int a = 10;
            int b = 13;

            if (a==b) {
                System.out.println ("a==b");
            }
            if (a>b) {
                System.out.println ("a>b");
            }
        if (a<b) {
            System.out.println ("a<b");
        }

    }
    static void third_task_part2() {

            int a = 100;
        if (a>10) {
            System.out.println ("больше 10");
        }
        if (a<100) {
            System.out.println ("меньше 100");
        }
        if (a/2 > 20) {
            System.out.println ("результат деления на 2 больше 20 ");
        }
        if (a>5 && a<=40) {
            System.out.println ("значение переменной между 5 и 40 включительно");
        }
        if (a<5 || a>40) {
            System.out.println ("значение переменной меньше 5 или больше 40");
        }

    }
    static void third_task_part3() {
        int a =13;
        int b =13;
        if ((a+b)%2==0) {
            System.out.println("maybe a and b are even");}
        else {
            System.out.println("some variable is odd");
        }
    }
    }



