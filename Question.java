public abstract class Question{

	protected String questionText;
	protected int pointsPossible, pointsEarned;
	protected int difficulty;
	protected String correctAnswer;
	protected int answerSpace;
	
	public abstract String toString();
	
	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	public void setPointsPossible(int pointsPossible) {
		this.pointsPossible = pointsPossible;
	}

	public void setPointsEarned(int pointsEarned) {
		this.pointsEarned = pointsEarned;
	}
	
	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}
	
	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}
	
	public void setAnswerSpace(int answerSpace) {
		this.answerSpace = answerSpace;
	}
	
	public String getQuestionText() {
		return this.questionText;
	}

	public int getPointsPossible() {
		return this.pointsPossible;
	}
	
	public int getPointsEarned() {
		return this.pointsEarned;
	}
	
	public int getDifficulty() {
		return this.difficulty;
	}
	
	public String getCorrectAnswer() {
		return this.correctAnswer;
	}

	public int getAnswerSpace() {
		return answerSpace;
	}

}