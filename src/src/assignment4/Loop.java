package assignment4;

public class Loop {
    public void printPiramide(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Loop loop = new Loop();
        loop.printPiramide(5);
        loop.printPiramide(10);
        loop.printPiramide(30);
    }
}
