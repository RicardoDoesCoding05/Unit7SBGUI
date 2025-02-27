import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;
import java.util.Comparator;
import javax.swing.JButton;


public class Main {
    private ArrayList<Game> superBowls;
    public Main() throws Exception {
        superBowls = new ArrayList<>();
        File file = new File(https:drive.google.com/file/d/1NA0s-sVOzUwMutIgx64x0s-PCde-u_4Y/view)
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] data = line.split(","); 
            String numeral = data[0].trim();
            int year = Integer.parseInt(data[1].trim());
            String location = data[2].trim();
            String winningTeam = data[3].trim();
            String losingTeam = data[4].trim();
            String score = data[5].trim();

            Game game = new Game(numeral, year, location, winningTeam, losingTeam, score);
            superBowls.add(game);
        }

        sc.close();
    }
    public ArrayList<Game> getSuperBowls() {
        return superBowls;
    }
    public int numWins(String teamName) {
        int winCount = 0;
        for (Game game : superBowls) {
            if (game.getWinningTeam().equalsIgnoreCase(teamName)) {
                winCount++;
            }
        }
        return winCount;
    }
    public void sortByYear() {
        superBowls.sort(Comparator.comparingInt(Game::getYear));
    }
    public void sortByWinningTeam() {
        superBowls.sort(Comparator.comparing(Game::getWinningTeam));
    }
    public void sortByPointDifferential() {
        superBowls.sort((game1, game2) -> Integer.compare(game2.getPointDifferential(), game1.getPointDifferential()));
    
    }
}
