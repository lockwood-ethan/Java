public class IfKeywordAndCodeBlocks {
    
    public static void main(String[] args) {

        boolean gameOver;
        int score;
        int levelCompleted;
        int bonus;

        calculateScore(true, 800, 5, 100);

        gameOver = true;
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        
        calculateScore(gameOver, score, levelCompleted, bonus);
    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        
        int finalScore = score;

        if (gameOver == true) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
