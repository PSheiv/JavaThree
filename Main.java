package JavaThree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Person myName = new Person("Иван Иванович"); // Корень(личность)
        Person father = new Person("Иван Олегович"); // Папа
        Person mother = new Person("Анна Павловна"); // Мама
        Person sister = new Person("Виктория Ивановна"); // Сестра
        Person brother = new Person("Сергей Иванович"); // Брат
        Person paternalGrandFather = new Person("Олег Николаевич");  // дедушка по отцовской линии
        Person paternalGrandMother = new Person("Анастасия Борисовна");  // бабушка по отцовской линии
        Person maternalGrandFather = new Person("Павел Иванович");  // дедушка по материнской линии
        Person maternalGrandMother = new Person("Анастасия Александровна");  // бабушка по материнской линии

        father.setFather(paternalGrandFather);
        father.setMother(paternalGrandMother);
        mother.setFather(maternalGrandFather);
        mother.setMother(maternalGrandMother);
        myName.setFather(father);
        myName.setMother(mother);

        sister.setFather(father);
        sister.setMother(mother);
        brother.setFather(father);
        brother.setMother(mother);

        ArrayList<Person> children = new ArrayList<>();
        ArrayList<Person> brothers = new ArrayList<>();
        ArrayList<Person> sisters = new ArrayList<>();

        Collections.addAll(children, sister, brother);
        Collections.addAll(brothers, brother);
        Collections.addAll(sisters, sister);
        myName.setSisters(sisters);
        myName.setBrothers(brothers);
        father.setChildren(children);
        mother.setChildren(children);

        getDataByParameter(myName);

    }


    private static void getAllChildren(Person personality) {
        try {
            int length = personality.getChildren().size();
            for (int i = 0; i < length; i++) {
                String c = personality.getChildren().get(i).name;
                System.out.println(c);
            }
        } catch (Exception e) {
            System.out.println("Не указано или отсутствуют");
        }

    }


    public static void getAllBrother(Person personality) {
        try {
            int length = personality.getSisters().size();
            for (int i = 0; i < length; i++) {
                String br = personality.getBrothers().get(i).name;
                System.out.println(br);
            }
        } catch (Exception e) {
            System.out.println("Не указано или отсутствуют");
        }
    }


    public static void getAllSisters(Person personality) {
        try {
            int length = personality.getSisters().size();
            for (int i = 0; i < length; i++) {
                String st = personality.getSisters().get(i).name;
                System.out.println(st);
            }
        } catch (Exception e) {
            System.out.println("Не указано или отсутствуют");
        }
    }


    public static void getDataByParameter(Person personality) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер из списка по коториму вывести данные личности:\n" +
                "1 - сестры\n" +
                "2 - братья\n" +
                "3 - дети\n" +
                "4 - показать генеалогическое древо");
        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (num == 1) {
                getAllSisters(personality);
            } else if (num == 2) {
                getAllBrother(personality);
            } else if (num == 3) {
                getAllChildren(personality);
            } else if (num == 4) {
                System.out.println(personality);
            } else {
                System.out.println("Такого параметра нет");
            }
        } else {
            System.out.println("Это не число!");
        }
        scanner.close();
    }
}