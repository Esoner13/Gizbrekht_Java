import java.util.Scanner;

class Divide {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
            if (array[i]%3 == 0 ) {
                System.out.println(array[i]);


            }
        }
    }
}