public class Test {
	protected List<Question> questions = new ArrayList<Question>();
	protected int totalPossiblePoints;
	protected int pointsEarned;

	public void setTotalPossiblePoints() {
		for (int i=0; i < this.getQuestion.size(); i++) {
			this.totalPossiblePoints = this.getQuestion.get(i).getPointsPossible();
		}
	}

	public int getTotalPossible() {
		return this.totalPossiblePoints;
	}
}