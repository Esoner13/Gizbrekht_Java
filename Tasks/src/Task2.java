import java.util.Scanner;

class Slava {
    public static void main(String[] args) {
        Scanner stringScanner = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = stringScanner.next();
        if (name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        }
        else {
            System.out.println("Нет такого имени");

        }
    }
}
