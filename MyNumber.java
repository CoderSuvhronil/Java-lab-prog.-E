class MyNumber {
    private double number;

    public MyNumber(double number) {
        this.number = number;
    }

    public boolean isZero() {
        return number == 0;
    }

    public boolean isPositive() {
        return number > 0;
    }

    public boolean isNegative() {
        return number < 0;
    }

    public boolean isOdd() {
        return number % 2 != 0;
    }

    public boolean isEven() {
        return number % 2 == 0;
    }

    public boolean isPrime() {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public boolean isArmstrong() {
        int n = (int) number;
        int sum = 0, temp = n, digits = 0, last = 0;
        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }
        temp = n;
        while (temp > 0) {
            last = temp % 10;
            sum += Math.pow(last, digits);
            temp = temp / 10;
        }
        return n == sum;
    }

    public double getFactorial() {
        int n = (int) number;
        double factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public double getSqrt() {
        return Math.sqrt(number);
    }

    public double getSqr() {
        return number * number;
    }

    public double sumDigits() {
        int sum = 0, n = (int) number;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }

    public double getReverse() {
        int reverse = 0, n = (int) number;
        while (n != 0) {
            reverse = reverse * 10 + n % 10;
            n = n / 10;
        }
        return reverse;
    }

    public void listFactor() {
        int n = (int) number;
        System.out.print("Factors: ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public void dispBinary() {
        System.out.println("Binary: " + Integer.toBinaryString((int) number));
    }

    public static void main(String[] args) {
        MyNumber myNum = new MyNumber(153);

        System.out.println("Is Zero: " + myNum.isZero());
        System.out.println("Is Positive: " + myNum.isPositive());
        System.out.println("Is Negative: " + myNum.isNegative());
        System.out.println("Is Odd: " + myNum.isOdd());
        System.out.println("Is Even: " + myNum.isEven());
        System.out.println("Is Prime: " + myNum.isPrime());
        System.out.println("Is Armstrong: " + myNum.isArmstrong());
        System.out.println("Factorial: " + myNum.getFactorial());
        System.out.println("Square Root: " + myNum.getSqrt());
        System.out.println("Square: " + myNum.getSqr());
        System.out.println("Sum of Digits: " + myNum.sumDigits());
        System.out.println("Reverse: " + myNum.getReverse());

        myNum.listFactor();
        myNum.dispBinary();
    }
}
