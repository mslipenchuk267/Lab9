public class FillInTheBlankQuestion extends Question {
	
	public FillInTheBlankQuestion() {/*Default*/}
	
	public FillInTheBlankQuestion(String questionText, int pointsPossible, int pointsEarned, int difficulty,
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