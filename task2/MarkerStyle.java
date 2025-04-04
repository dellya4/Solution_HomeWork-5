public class MarkerStyle { // Class for MarkerStyle
    private final String icon;
    private final String color;
    private final String labelFront;

    // Constructor for MarkerStyle
    public MarkerStyle(String icon, String color, String labelFront) {
        this.icon = icon;
        this.color = color;
        this.labelFront = labelFront;
    }

    // Function which draw marker with style
    public void draw(String label, int x, int y) {
        System.out.printf("Draw [%s] at (%d, %d) with icon %s, color %s and front '%s'\n", label, x, y, icon, color, labelFront);
    }
}
