public class Circle {

    public static void emptySquare() {

        int count = 10;

        // Внешний цикл
        for(int i=0; i < count; i++) {
            // Внутренний цикл для печати одной строки
            for(int k=0; k < count; k++) {
                // Вот наше сложное условие
                if(k==0 || k==count-1 || i==0 || i==count-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Переход на следующую строку
            System.out.println();
        }
    }

    public static void triangle() {

        int count = 10;

        // Внешний цикл
        for (int i = 0; i < count; i++) {
            for (int k = 0; k < i + 1; k++) {
                if (k == 0 || k == i || i == count - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Переход на следующую строку
            System.out.println();
        }

    }

    public static void triangleRight() {

        int count = 10;

        // Внешний цикл
        for (int i = 0; i < count; i++) {
            for (int k = 0; k < count; k++) {
                if (k == count - 1 || i == count - 1 || k == count - i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Переход на следующую строку
            System.out.println();
        }

    }

    public static void squareWithDiagonals() {

        int count = 11;

        // Внешний цикл
        for(int i=0; i < count; i++) {
            // Внутренний цикл для печати одной строки
            for(int k=0; k < count; k++) {
                // Вот наше сложное условие
                if(k==0 || k==count-1 || i==0 || i==count-1 || k == i ||  k == count - i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Переход на следующую строку
            System.out.println();
        }
    }


    public static void main(String[] args) {
        emptySquare();
        triangle();
        triangleRight();
        squareWithDiagonals();
    }
}
