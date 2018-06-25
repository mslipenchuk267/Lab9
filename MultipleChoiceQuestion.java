import java.util.ArrayList;
import java.util.List;

public class MultipleChoiceQuestion extends Question {
	List<String> possibleAnswers = new ArrayList<String>();
	
	public String toString() {
		String answerChoices = "";
		for (int i=0; i < this.possibleAnswers.size(); i++) {
			answerChoices += "-" + this.possibleAnswers.get(i) + "\n";
		}
		return this.getQuestionText() + "\n" + answerChoices;
	}
	
	public void addAnswer(String userAnswer) {
		this.getPossibleAnswer().add(userAnswer);
	}
	
	public void removeAnswer(String userAnswer) {
		this.getPossibleAnswer().remove(userAnswer);
	}

	public void setPossibleAnswer(List<String> userAnswer) {
		this.possibleAnswers = userAnswer;
	}

	public List<String> getPossibleAnswer() {
		return this.possibleAnswers;

	}
	
}