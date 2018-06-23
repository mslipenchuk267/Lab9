import java.util.ArrayList;

public class MultipleChoiceQuestion extends Question {
	List<String> possibleAnswer = new ArrayList<String>();

	public void addAnswer(String userAnswer) {
		this.getPossibleAnswer.add(userAnswer);
	}

	public void removeAnswer(String userAnswer) {
		this.getPossibleAnswer.remove(userAnswer);
	}

	public void setPossibleAnswer(List<String> userAnswer) {
		this.possibleAnswer = userAnswer;
	}

	public List<String> getPossibleAnswer() {
		return this.possibleAnswer;

	}
}