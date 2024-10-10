package lv.rvt;

public class Stars {
    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print('*');
        }
    }
    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            printStars(size);
            System.out.println();
        }
        

    }
    public static void printRectangle(int h, int w) {
        for (int i = 0; i < h; i++) {
            printStars(w);
            System.out.println();
        }
    }
    public static void printTriangle(int h) {
        for (int i = 1; i < h + 1; i++) {
            printStars(i);
            System.out.println();
        }
    }
}
