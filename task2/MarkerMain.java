import java.util.ArrayList;
import java.util.List;

public class MarkerMain {
    public static void main(String[] args) {
        List<MapMarker> markers = new ArrayList<>(); // List for markers
        int total = 100;

        for (int i = 0; i < total; i++) { // Get tip marker for index
            String type = switch (i % 5) {
                case 0 -> "hospital";
                case 1 -> "restaurant";
                case 2 -> "gas";
                case 3 -> "hotel";
                case 4 -> "supermarket";
                default -> throw new IllegalStateException("Unexpected value: " + i % 5);
            };
            MarkerStyle style = MarkerStyleFactory.getStyle(type);
            markers.add(new MapMarker(i, i+1, "Place #" + i, style)); // Create marker in list
        }

        for (int i = 0; i < 8; i++) {
            markers.get(i).render();
        }

        // Return statistic for unique styles
        System.out.println("\nTotal unique style objects: " + MarkerStyleFactory.getTotalStyles());
        System.out.println("Total number of markers: " + total);
        System.out.println("If styles were not shared, the number of style objects would be: " + total);
        System.out.println("Style objects saved by sharing: " + (total - MarkerStyleFactory.getTotalStyles()));
    }
}
