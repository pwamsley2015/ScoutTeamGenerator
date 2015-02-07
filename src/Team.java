
/**
 * @author Patrick Wamsley
 *
 * This class represents a Team
 */

public class Team {

	private int teamNum; 
	
	public Team(int teamNum) {
	
		this.teamNum = teamNum; 
	}
	
	@Override
	public String toString() {
		return "Team: " + teamNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		return obj instanceof Team && obj != null &&
			   this.teamNum == ((Team)obj).teamNum; 
	}
}
