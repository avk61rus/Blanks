package geekbrains.lesson4;

import java.util.Random;
import java.util.Scanner;

/**
 * Project java_core_1_0321
 *
 * @Author Alexander Grigorev
 * Created 20.03.2021
 * v1.0
 * with comments Andrei Kirichko
 */

public class TicTacToe {
    private static final Random RANDOM = new Random();            // переменная Random (для случайного выбора координат компа);
    private static final Scanner SCANNER = new Scanner(System.in);//перем. SCANNER для считывания координат с консоли;
    private static final char DOT_HUMAN = 'X';                    //символ (фишка) игрока;
    private static final char DOT_AI = '0';                       //символ (фишка) комьютера;
    private static final char DOT_EMPTY = '.';                    //символ пустого поля;

    private static char[][] field;                                //объявлятся двумерный символьный массив (игровое поле);
    private static int fieldSizeX;                                //размер игрового поля по х;
    private static int fieldSizeY;                                //размер игрового поля по х;
    private static String playerOneName = "";                     //объявляеся строчная переменная с именем игрока;

    private static int scoreHuman = 0;              //объявляется целочисленная переменная для подсчета очков игрока;
    private static int scoreAI = 0;                 //объявляется целочисленная переменная для подсчета очков компа;


    public static void main(String[] args) {
        fieldSizeY = 3;                             //устанавливаются границиы игрового поля по х равное 3;
        fieldSizeX = 3;                             //устанавливаются границиы игрового поля по у равное 3;
        while (true) {
            System.out.print("Представьтесь пожалуйста >>> ");
            playerOneName = SCANNER.nextLine();
            initField();                            //запуск метода инициализации (очистки) игрового поля;
            printField();                           //запуск метода прорисовки границ ячеек игрового поля;

            while (true) {                          //ход игрока, прорисовка хода, проверка на победу;
                humanTurn();
                printField();
                if (gameCheck(DOT_HUMAN, String.format("%s, вы великолепны! Победа!", playerOneName))) break;
                aiTurn();                            //ход игрока, прорисовка хода, проверка на победу;
                printField();                        //прорисовка хода, проверка на победу
                if (gameCheck(DOT_AI, "Компьютер победил!")) break;
            }           //подсчет очков
            System.out.printf("SCORE IS:\n%s: %d || AI: %d\n", playerOneName, scoreHuman, scoreAI);
            System.out.println("Wanna play again? >>> Y or N >>");  //запрос на продолжение
            if (!SCANNER.next().toLowerCase().equals("y")) break;   //equalsIgnoreCase
        }
    }

    private static boolean gameCheck(char dot, String s) {      //проверка не победил ли кто;
        if (checkWin(dot)) {
            if (dot == DOT_HUMAN) {                             //при выигрыше проверяется не победил ли игрок;
                scoreHuman++;                                   //запись очков при победе игрока;
            } else {                                            //если игрок не победил, то победа компа;
                scoreAI++;                                      //запись очков при победе игрока;
            }
            System.out.println(s);
            return true;
        }
        if (checkDraw()) {                                      //запуск метода проверки на ничью;
            System.out.println("DRAW!!!");                      //метод проверяет не заняты ли все ячейки игрового поля
            return true;                                        //если все ячейки заняты то вывод в консоль "ничья";
        }
        return false;
    }

    private static boolean checkWin(char c) {               // проверка на победу (проверка наличия 3 фишек в ряд)
        //horiz
        if (field[0][0] == c && field[0][1] == c && field[0][2] == c) return true; //проверка первой строки;
        if (field[1][0] == c && field[1][1] == c && field[1][2] == c) return true; //проверка второй строки;
        if (field[2][0] == c && field[2][1] == c && field[2][2] == c) return true; //проверка третьей строки;

        //vert
        if (field[0][0] == c && field[1][0] == c && field[2][0] == c) return true; //проверка первого столбца;
        if (field[0][1] == c && field[1][1] == c && field[2][1] == c) return true; //проверка второго столбца;
        if (field[0][2] == c && field[1][2] == c && field[2][2] == c) return true; //проверка третьего столбца;

        if (field[0][0] == c && field[1][1] == c && field[2][2] == c) return true; //проверка диагонали сверху вниз;
        if (field[0][2] == c && field[1][1] == c && field[2][0] == c) return true; //проверка диагонали снизу вверх;
                                                             //оператор if можно упростить
        return false;
    }

    private static boolean checkDraw() {                //метод проверки на ничью, должен запускться поле проверки на
        for (int y = 0; y < fieldSizeY; y++) {          //победу;
            for (int x = 0; x < fieldSizeX; x++) {
                if (isCellEmpty(x, y)) return false;    //проверяются все ячейки, если нет свободных ячеек - ничья!;
            }
        }
        return true;
    }

    private static void humanTurn() {                   //метод ввода хода человека;
        int x, y;
        do {       //цикл приглашения игроку ввести координатыповторяется до тех пор, пока не будут введены правильные значения;
            System.out.printf("%s введите координаты х и у через пробел >>>>>", playerOneName); //запрос и ожидание ввода кординат игроком;
            x = SCANNER.nextInt() - 1;                          //считывание введенной игроком кординаты х из системы (консоли);
            y = SCANNER.nextInt() - 1;                          //считывание введенной игроком кординаты у из системы (консоли;
        } while (!isCellValid(x, y) || !isCellEmpty(x, y));    //провека ячейки на занятость и нахождения в рамках поля;
                                                                //цикл запроса ввода координат повторяется до правильного ввода;
        field[y][x] = DOT_HUMAN;                               //занесение символа игрока в поле
    }

    private static void aiTurn() {                      //ход компютера
        int x, y;                              //цикл проверки введенных координат на свободную ячейку, выполняется от одного раза до тех пор,
        do {                                   // пока не будет выбранная ячейка с коорд. х,у не будет являться свободной;
            x = RANDOM.nextInt(fieldSizeX);    //присваивание х случайного числа в рамка игрового поля;
            y = RANDOM.nextInt(fieldSizeY);    //присваивание у случайного числа в рамка игрового поля;
        } while (!isCellEmpty(x, y));

        field[y][x] = DOT_AI;               //ячейка проверена, запись символа хода компа в игровое поле;
    }

    private static boolean isCellValid(int x, int y) {                  //проверка на выход за границы
        return x >= 0 && y >= 0 && x < fieldSizeX && y < fieldSizeY;
    }

    private static boolean isCellEmpty(int x, int y) {
        return field[y][x] == DOT_EMPTY;
    } //проверка ячеек на занятость


    private static void initField() {                       //метод инициализации (очистки) игрового поля;
        field = new char[fieldSizeY][fieldSizeX];           //формируется массив символов свободных ячеек в границах
        for (int y = 0; y < fieldSizeY; y++) {              //игрового поля;
            for (int x = 0; x < fieldSizeX; x++) {
                field[y][x] = DOT_EMPTY;                    //во все ячейки игрового поля заносится символ "пустое поле";
            }                                                                   //конец цикла по х;
        }                                                                       //конец цикла по у;
    }                                                                           //конец метода;

    private static void printField() {                          //отрисовка границ ячеек;
        System.out.print("+");
        for (int i = 0; i < fieldSizeX * 2 + 1; i++)
            System.out.print((i % 2 == 0) ? "-" : i / 2 + 1);   //отрисовывается строка "+-1-2-3";
        System.out.println();

        for (int i = 0; i < fieldSizeY; i++) {                  //открисовка построчно вертикальных границ между ячейками;
            System.out.print(i + 1 + "|");
            for (int j = 0; j < fieldSizeX; j++)
                System.out.print(field[i][j] + "|");
            System.out.println();
        }

        for (int i = 0; i <= fieldSizeX * 2 + 1; i++)           //отрисовывается горизонтальная черта под игровым полем;
            System.out.print("-");
        System.out.println();
//        for (int y = 0; y < fieldSizeY; y++) {
//            for (int x = 0; x < fieldSizeX; x++) {
//                System.out.print(field[y][x] + " ");
//            }
//            System.out.println();
//        }
    }

}