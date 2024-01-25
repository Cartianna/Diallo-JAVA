import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите количество элементов массива: ");
        Scanner in = new Scanner(System.in);
        int nums = in.nextInt();
        int[] user_nums = new int[nums];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < nums; i++) {
            user_nums[i] = in.nextInt();
        }
        System.out.println("Элементы массива кратные 3:");

        for (int i = 0; i < nums; i++) {
            if (user_nums[i] >=3 && user_nums[i]% 3 == 0) System.out.println(user_nums[i]);
            

        }
    }
}
