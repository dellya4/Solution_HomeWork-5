import java.util.HashMap;
import java.util.Map;

class MarkerStyleFactory { // Class for MarkerStyleFactory
    private static final Map<String, MarkerStyle> styles = new HashMap<>();

    // Function for receipt style marker for type
    public static MarkerStyle getStyle(String type) {
        // If we have style, return it
        return styles.computeIfAbsent(type, t -> {
            // Create style if we don't have it
            switch (t) {
                case "hospital":
                    return new MarkerStyle("\uD83C\uDFE5", "red", "Arial Bold");
                case "restaurant":
                    return new MarkerStyle("\uD83C\uDF74", "green", "Verdana");
                case "gas":
                    return new MarkerStyle("⛽", "blue", "Tahoma");
                case "hotel":
                    return new MarkerStyle("\uD83C\uDFE8", "yellow", "Times New Roman");
                case "supermarket":
                    return new MarkerStyle("\uD83C\uDFEA", "purple", "Archangelsk");
                default:
                    return new MarkerStyle("❓", "gray", "Sans");
            }
        });
    }
    // Count unique style
    public static int getTotalStyles() {
        return styles.size();
    }
}