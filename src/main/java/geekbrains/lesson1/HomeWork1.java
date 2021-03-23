package geekbrains.lesson1;

public class HomeWork1 {
    public static void main(String[] args) {
        int a = 7;                     //for task 1, 2
        int b = 8;                     //for task 1, 2
        int c = 20;                     //for task 1
        int d = 25;                     //for task 1
        int f = 0;                      //for task 3
        String k = "Саша Пушкин";       //for task 4

        float r = calcExp(a, b, c, d);  //for task 1
        System.out.println(r);          //for task 1

        boolean e = compaRison(a, b);   //for task 2
        System.out.println(e);

        positiveNumber(f);              //for task 3

        inputName(k);                   //for task 4

       int year = 1980;                  //for task 5
        fourthYear(year);
    }

    /*------------------------------------------------------*/
    // task_1
    public static float calcExp(int a, int b, int c, int d) {
        float result = a * (b + (1.0f * c / d));
        return result;
    }

    /*---------------------------------------------------*/
    // task_2
    public static boolean compaRison(int a, int b) {
        boolean e;
        if ((a + b) > 10 && (a + b) < 20) {
            boolean result = true;
            return result;
        } else {
            boolean result = false;
            return result;
        }
    }

    /*-------------------------------------------------------*/
    // task_3
    public static void positiveNumber(int f) {
        String number;
        if (f < 0) {
            number = "Число отрицательное!";
        } else {
            number = "Число положительное!";
        }
        System.out.println(number);
    }

    /*--------------------------------------------------------*/
    // task_4
    public static void inputName(String k) {
        String out = "Привет, " + k + "!";
        System.out.println(out);
    }

    /*--------------------------------------------------------*/
    // task_5
    private static void fourthYear(int year) {
        if(year* 1.0f % 400 == 0 || year * 1.0f % 4 == 0 && year * 1.0f % 100 != 0) {
            System.out.println(year + "год високосный");
        } else System.out.println(year + "год не високосный");
    }
}



