package lab_6_1;

import java.io.InvalidObjectException;

public class Lab_6_1 {

    public static void main(String[] args) {
        //создание и запись объекта 
        Subject subj = new Subject("Math", "Tuesday", "Д-504");
        Teacher teach = new Teacher("Иванов Иван Иванович", 2);
        Employment employ1 = new Employment("PI-1-16", 18, subj, teach);
        //Сериализация
        String file = "serial.data";//ser.txt serial.data
        Serializator sz = new Serializator();
        boolean b = sz.serialization(employ1, file);
        if (b == true) {
            System.out.println("Сериализация прошла успешно в файл " + file);
        } else {
            System.out.println("Произошла ошибка");
        }
        // чтение и вывод объекта
        Employment res = null;
        try {
            //Десериализация
            res = sz.deserialization(file);
        } catch (InvalidObjectException e) {
            e.printStackTrace();
        }
        System.out.println("Десериализация");
        System.out.println(res);
    }

}