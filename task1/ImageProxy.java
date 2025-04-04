class ImageProxy implements PropertyImage { // Class for ImageProxy

    private String fileName;
    private HighImage highImage;

    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void displayThumbnail() { // Function for showing miniature (proxy)
        System.out.println("This is a miniature (proxy): " + fileName);
    }

    @Override
    public void displayFullImage() { // Function for showing full image
        if (highImage == null) { // Check having HighImage
            highImage = new HighImage(fileName); // Create HighImage if we don't have it
        }
        highImage.displayFullImage(); // Show picture
    }

}
