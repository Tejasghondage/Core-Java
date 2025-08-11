package whileLoop.second;

public class FiboSeries {
    void printFibo(int n) {
        int first = 0;
        int second = 1;

        System.out.print(first + " ");

        while (second <= n) {
            System.out.print(second + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {
        FiboSeries f = new FiboSeries();
        f.printFibo(45); 
    }
}
