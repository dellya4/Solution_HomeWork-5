public class MapMarker { // Class MapMarker
    private final int x;
    private final int y;
    private final String label;
    private final MarkerStyle style;

    // Constructor for MapMarker
    MapMarker(int x, int y, String label, MarkerStyle style) {
        this.x = x;
        this.y = y;
        this.label = label;
        this.style = style;
    }

    // Function for draw marker
    public void render() {
        style.draw(label, x, y);
    }
}
