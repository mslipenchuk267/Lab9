import java.util.ArrayList;
import java.util.List;

public class Test {
	
	protected List<Question> questions = new ArrayList<Question>();
	protected int totalPossiblePoints;
	protected int pointsEarned;

	public void setTotalPossiblePoints() {
		// Add each question's possible points to totalPossiblePoints via loop
		for (int i=0; i < this.questions.size(); i++) {
			this.totalPossiblePoints += this.questions.get(i).getPointsPossible();
		}
	}

	public int getTotalPossiblePoints() {
		return this.totalPossiblePoints;
	}
}