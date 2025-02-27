public class Game {
    private String numeral;
    private int year;
    private String location;
    private String winningTeam;
    private String losingTeam;
    private String score;
    public Game(String numeral, int year, String location, String winningTeam, String losingTeam, String score) {
        this.numeral = numeral;
        this.year = year;
        this.location = location;
        this.winningTeam = winningTeam;
        this.losingTeam = losingTeam;
        this.score = score;
    }
    public String getNumeral() {
        return numeral;
    }

    public void setNumeral(String numeral) {
        this.numeral = numeral;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getWinningTeam() {
        return winningTeam;
    }

    public void setWinningTeam(String winningTeam) {
        this.winningTeam = winningTeam;
    }

    public String getLosingTeam() {
        return losingTeam;
    }

    public void setLosingTeam(String losingTeam) {
        this.losingTeam = losingTeam;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
    public String toString() {
        return "Super Bowl " + numeral + " (" + year + "): " + location + " - Winning Team: " + winningTeam + ", Losing Team: " + losingTeam + ", Score: " + score;
    }
    public int getPointDifferential() {
        String[] scoreParts = score.split("-");
        int winningScore = Integer.parseInt(scoreParts[0].trim());
        int losingScore = Integer.parseInt(scoreParts[1].trim());
        return winningScore - losingScore;
    }
}
