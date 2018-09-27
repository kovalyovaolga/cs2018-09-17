package by.it.kovalyova.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import java.util.ArrayList;

public class TaskB1 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("line1");
        al.add("line2");
        al.add("line3");
        al.add("line4");
        al.add("line5");
        System.out.println(al.size());
        for(int i=0; i<al.size();i++) {
            System.out.println(al.get(i));
        }

    }
}
