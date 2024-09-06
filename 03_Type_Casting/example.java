
public class example {
    public static void main(String[] args) {
        int maxScore = 500;

        // The actual score of the user
        int userScore = 423;

        // Calculate the percantage of the user's score 
        float percentage = (float) userScore / maxScore * 100.0f;

        System.out.println("User's percentage is " + percentage);
    }
}
