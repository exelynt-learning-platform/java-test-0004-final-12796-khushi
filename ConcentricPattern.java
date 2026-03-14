public class ConcentricPattern {
    public static void main(String[] args) {
        int n = 4; // The starting maximum number
        int size = 2 * n - 1; // Total rows and columns

        // Outer loop for rows
        for (int i = 0; i < size; i++) {
            // Inner loop for columns
            for (int j = 0; j < size; j++) {
                
                // Calculate distance to the closest of the four edges
                int top = i;
                int left = j;
                int bottom = (size - 1) - i;
                int right = (size - 1) - j;

                // The value is n minus the minimum distance to an edge
                int minDistance = Math.min(Math.min(top, bottom), Math.min(left, right));
                
                System.out.print((n - minDistance) + " ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}