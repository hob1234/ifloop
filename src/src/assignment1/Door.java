package assignment1;

public class Door {
    int width;
    int height;
    boolean open;

    Door(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void openDoor() {
        open = true;
        System.out.println("Opening door");
    }

    public void closeDoor() {
        open = false;
        System.out.println("Closing door");
    }

    public void isOpen() {
        System.out.println("The door is open: " + open);
    }

    public void calculateSurface() {
        System.out.println("Surface = " + width * height);
    }

    public static void main(String[] args) {
        Door door = new Door(10, 20);
        door.openDoor();
        door.closeDoor();
        door.isOpen();
        door.calculateSurface();
    }
}
