package lab_6_1;

import java.io.InvalidObjectException;

public class Lab_6_1 {

    public static void main(String[] args) {
        //Создать объекты классов
        Subject subj = new Subject("Math", "Tuesday", "Д-504");
        Teacher teach = new Teacher("Иванов Иван Иванович", 2);
        Employment employ1 = new Employment("PI-1-16", 18, subj, teach);
        //Сериализация
        String file = "serial.data";
        Serializator sz = new Serializator();
        //Записать объект в файл 
        boolean b = sz.serialization(employ1, file);
        //Если сериализация прошла успешно
        if (b == true) {
            System.out.println("Сериализация прошла успешно в файл " + file);
        } else {
            System.out.println("Произошла ошибка");
        }
        System.out.println("Десериализация");
        //Экземпляр класса Employment
        Employment res = null;
        try {
            //Десериализация
            //Читать из файла, вывести в объект класса Employment
            res = sz.deserialization(file);
        } catch (InvalidObjectException e) {
            e.printStackTrace();
        }
        //Вывести объект
        System.out.println(res);
    }

}
