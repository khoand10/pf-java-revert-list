import java.util.Queue;
import java.util.Stack;

public class app {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        Stack<Integer> list = new Stack<>();
        list.push(numbers[0]);
        list.push(numbers[1]);
        list.push(numbers[2]);
        list.push(numbers[3]);
        list.push(numbers[4]);
        System.out.print("Reverted :");
        for (int a : list) {
            System.out.print(String.format(a + "\t"));
        }
    }
}
