public class Question{


	protected String questionText;
	protected int pointsPossible, pointsEarned;
	protected int difficulty;
	protected String correctAnswer;
	protected int answerSpace;

	public String getQuestionText() {
		return getQuestion;
	}

	public int getPointsPossible() {
		return pointsPossible;
	}

	public int setPointsEarned() {
		return pointsEarned;
	}

	public int getDifficulty() {
		return difficulty;
	}

	public String getCorrectAnswer() {
		return String;
	}

	public int getAnswerSpace() {
		return answerSpace;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	public void setPointsPossible(int pointsPossible) {
		this.pointsPossible = pointsPossible;
	}

	public void setPointsEarned(int pointsEarned) {
		this.pointsEarned = pointsEarned;
	}

	public void getDifficulty(int difficulty) {
		this.difficulty =  difficulty;
	}

	public void getCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	public void getAnswerSpace(int answerSpace) {
		this.answerSpace = answerSpace;
	}


	public String toString() {
			return this.getQuestion();
	}





}