public class Arrays {
    public static void main(String[] args) {
        int number = 10; // ����������� ��� ������
        int [] numbers = new int[5];    // numbers -> [������] ��������� ��� ������
        for(int i=0;i<numbers.length; i++){
            numbers[i]=i*10;
            System.out.println(numbers[i]);
            System.out.println();
        }
    }
}
