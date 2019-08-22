public class power {
    public static void main(String[] args) {
        System.out.println(pow(13, 3));
    }

    private static int pow(int a, int b) {
        if (b == 1) {
            return a;
        }
        else
            if (b == 0) {
                return 1;
            }
            else
            if (b < 0)
            {
                throw new ArithmeticException(" В рамках дз не предусмотрено с отрицательной степенью");
            }
            else
                return a * pow(a, b-1);

    }
}