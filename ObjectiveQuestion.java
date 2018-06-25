public class ObjectiveQuestion extends Question {
	
	public ObjectiveQuestion() {/*Default*/}
	
	public ObjectiveQuestion(String questionText, int pointsPossible, int pointsEarned, int difficulty,
			String correctAnswer, int answerSpace) {
		this.questionText = questionText;
		this.pointsPossible = pointsPossible;
		this.pointsEarned = pointsEarned;
		this.difficulty = difficulty;
		this.correctAnswer = correctAnswer;
		this.answerSpace = answerSpace;
	}
	
	public String toString() {
		return this.questionText + "\n";
	}
}