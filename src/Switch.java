import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("����� �������");
        int age = scanner.nextInt();
        switch (age){
            case 0:
                System.out.println("�� �������");
                break;
            case 7:
                System.out.println("����� � �����");
                break;
            case 18:
                System.out.println("�� �������� ������");
                break;
            default:
                System.out.println("�� ���� �� ���������� ������� �� �������");
        }

    }
}
