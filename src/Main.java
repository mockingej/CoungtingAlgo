import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println(countLessThan(List.of(1, 3, 3, 4, 8), 5));
        System.out.println(countLessThan(List.of(7, 8, 9, 9, 10), 9));
    }

    public static int countLessThan(List<Integer> numbers, int threshold) {
        int count = 0;
        int start = 0;
        int end = numbers.size() - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (numbers.get(mid) < threshold) {
                count = mid + 1;
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return count;
    }
}
