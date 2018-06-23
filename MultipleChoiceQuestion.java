import java.util.ArrayList;

public class MultipleChoiceQuestion extends Question {
	List<String> possibleAnswer = new ArrayList<String>();

	public void addAnswer(String answer) {
		this.getPossibleAnswer.add(answer);
	}
}