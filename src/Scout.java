import java.util.HashMap;


public class Scout {

	private HashMap<Integer, Team> matchTeamMap; 
	
	public Scout() {
		matchTeamMap = new HashMap<>(); 
	}
	
	@Override
	public String toString() {
		return matchTeamMap.toString(); 
	}
	
	public void assign(int matchNum, Team teamToScout) {
		matchTeamMap.put(matchNum, teamToScout); 
	}
}
