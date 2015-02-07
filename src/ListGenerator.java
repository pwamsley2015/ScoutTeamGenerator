import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


public class ListGenerator {

	private ArrayList<Match> matchSched; 
	private Scout[] scouts = {new Scout(), new Scout(), new Scout(), new Scout(), new Scout(), new Scout()}; 
	
	public ListGenerator(ArrayList<Match> matchSched) {
		
		this.matchSched = matchSched; 
		
//		scouts = new Scout[6];
//		for (Scout s : scouts)
//			s = new Scout(); 
	}
	
	public void assignTeams() {
		
		for (int i = 1; i <= matchSched.size(); i++) 
			for (int currTeamPos = 0; currTeamPos < 6; currTeamPos++) {
				scouts[currTeamPos].assign(i, matchSched.get(i - 1).getTeamsInMatch().get(currTeamPos));
			}
	}
	
	public void printScouts() {
		for (Scout s : scouts) {
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		
		ArrayList<Match> matches = null; 
		try {
			matches = CsvParser.getMatchSchedule(
					CsvParser.loadString(new File("s.csv")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		ListGenerator listGen = new ListGenerator(matches); 
		listGen.assignTeams(); 
		listGen.printScouts();
		
		
	}
}
