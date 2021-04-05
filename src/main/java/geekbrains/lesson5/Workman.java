package geekbrains.lesson5;

import java.io.PrintStream;
import java.util.Arrays;

/**
 * Project HomeWork_core1
 *
 * @Author Andrei Kirichko
 * Created 26.03.2021
 * v1.0
 */

public class Workman {
    private int tab;            //public
    private String name;
    private String post;
    private String gender;
    private int age;
    private String telephone;
    private String e_mail;

        public Workman(int tab, String name, String gender, String post, int age, String telephone, String e_mail) {
        this.tab = tab;
        this.name = name;
        this.post = post;
        this.gender = gender;
        this.age = age;
        this.telephone = telephone;
        this.e_mail = e_mail;
    }

    public  int getAge() {return age;}
    public String getGender() {return gender;}

    public void workmanPrint() {
        System.out.printf("tab: %d, name: %s, post: %s, gender: %s, age: %d, telephone:" +
                " %s, e_mail: %s\n", tab, name, post, gender, age, telephone, e_mail);
    }
//    @Override
//    public String toString() {
//        return "Workman{" +
//                "tab=" + tab +
//                ", name='" + name + '\'' +
//                ", post='" + post + '\'' +
//                ", gender='" + gender + '\'' +
//                ", age=" + age +
//                ", telephone='" + telephone + '\'' +
//                ", e_mail='" + e_mail + '\'' +
//                '}';
//    }
//        System.out.println("Табельный томер: " + tab + "\nФИО сотрудника: " + name + "\nДолжность:      " + post
//                + "\nПол сотрудника: " + gender + "\nГод рождения:   " + age +
//                "\nТелефон:        " + telephone + "\ne-mail:         " + e_mail);
//    }

//        String[][] arrWork = {
//                {"2458", "Иванов И.И.", "Генеральный директор", "муж.", "35", "+7 915 895 1425", "ivanov@gmail.com"},
//                {"2459", "Петров П.П..", "Генеральный директор", "муж.", "50", "+7 915 895 1425", "ivanov@gmail.com"},
//                {"2460", "Сидоров С.С.", "Генеральный директор", "муж.", "55", "+7 915 895 1425", "ivanov@gmail.com"},
//                {"2461", "Зайцева З.А.", "Генеральный директор", "муж.", "45", "+7 915 895 1425", "ivanov@gmail.com"},
//                {"2462", "Волкова М.И.", "Генеральный директор", "муж.", "30", "+7 915 895 1425", "ivanov@gmail.com"}
//        };

//    public static void arrSrtingPrint(String() args) {
//        for(int i = 0; i < arrWork.length; i++) {
//            String intArrayString = Arrays.toString(arrWork[i]);
//            System.out.println(intArrayString);
//        }
//    }
}
