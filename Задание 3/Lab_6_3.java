package lab_6_3;

public class Lab_6_3 {

    public static void main(String[] args) {
        //Экземпляр класса Validation
        Validation valid = new Validation();
        //Проверка валидации XML по XSD 
        valid.validet();
        //Экземпляр класса marshDemarsh
        marshDemarsh marsh = new marshDemarsh();
        System.out.println("Маршализация");
        //Маршализация
        marsh.marching();
        System.out.println("Демаршализация");
        //Демаршализация
        marsh.unMarching();

    }

}
