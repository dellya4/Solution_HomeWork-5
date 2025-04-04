public class main {
    public static void main(String[] args) {
        PropertyImage image = new ImageProxy("image1.jpg"); // Creat image

        image.displayThumbnail(); // Show "small" picture
        System.out.println("You click 'increase' button");  // Warning
        image.displayFullImage(); // Loading and showing "full" image
    }
}
