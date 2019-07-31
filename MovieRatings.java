import java.util.Scanner;

public class MovieRatings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int movies = Integer.parseInt(scanner.nextLine());
        double maxRating = Double.NEGATIVE_INFINITY;
        double minRating = Double.MAX_VALUE;
        double totalRating = 0;
        String winnerMovie = "";
        String loserMovie = "";

        for (int i = 1; i <= movies ; i++) {
            String movie = scanner.nextLine();
            double ratings = Double.parseDouble(scanner.nextLine());
            totalRating += ratings;

            if (maxRating < ratings) {
                maxRating = ratings;
                winnerMovie = movie;
            }
            if (minRating > ratings) {
                minRating = ratings;
                loserMovie = movie;
            }

        }
        double avgRating = totalRating / movies;

        System.out.printf("%s is with highest rating: %.1f%n", winnerMovie, maxRating);
        System.out.printf("%s is with lowest rating: %.1f%n", loserMovie, minRating);
        System.out.printf("Average rating: %.1f", avgRating);

    }
}
