class HighImage implements PropertyImage { // Class for HighImage

    private String fileName;

    HighImage(String fileName) { // Constructor for HighImage
        this.fileName = fileName;
        loadFullImage(); // Loading image
    }

    private void loadFullImage() { // Function for loading full image
        System.out.println("Loading full image: " + fileName);
    }

    @Override
    public void displayThumbnail() { // Function for showing miniature
        System.out.println("This is a miniature: " + fileName);
    }

    @Override
    public void displayFullImage() { // Function for showing full image
        System.out.println("This is the full image: " + fileName);
    }

}
