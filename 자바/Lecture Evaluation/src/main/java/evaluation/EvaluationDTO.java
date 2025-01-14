package evaluation;

public class EvaluationDTO {
	
	int evaluationID;
	String userID;
	String lectureName;
	String professorName;
	int lectureYear;
	String semesterDivide;
	String lectureDivide;
	String evaluationTitle;
	String evaluationContent;
	String totalScore;
	String creditScore;
	String homeworkScore;
	String contentScore;
	int likeCount;
	
	public int getEvaluationID() {
		return evaluationID;
	}
	public void setEvaluationID(int evaluationID) {
		this.evaluationID = evaluationID;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getLectureName() {
		return lectureName;
	}
	public void setLectureName(String lectureName) {
		this.lectureName = lectureName;
	}
	public String getProfessorName() {
		return professorName;
	}
	public void setProfessorName(String professorName) {
		this.professorName = professorName;
	}
	public int getLectureYear() {
		return lectureYear;
	}
	public void setLectureYear(int lectureYear) {
		this.lectureYear = lectureYear;
	}
	public String getSemesterDivide() {
		return semesterDivide;
	}
	public void setSemesterDivide(String semesterDivide) {
		this.semesterDivide = semesterDivide;
	}
	public String getLectureDivide() {
		return lectureDivide;
	}
	public void setLectureDivide(String lectureDivide) {
		this.lectureDivide = lectureDivide;
	}
	public String getEvaluationTitle() {
		return evaluationTitle;
	}
	public void setEvaluationTitle(String evaluationTitle) {
		this.evaluationTitle = evaluationTitle;
	}
	public String getEvaluationContent() {
		return evaluationContent;
	}
	public void setEvaluationContent(String evaluationContent) {
		this.evaluationContent = evaluationContent;
	}
	public String getTotalScore() {
		return totalScore;
	}
	public void setTotalScore(String totalScore) {
		this.totalScore = totalScore;
	}
	public String getCreditScore() {
		return creditScore;
	}
	public void setCreditScore(String creditScore) {
		this.creditScore = creditScore;
	}
	public String getHomeworkScore() {
		return homeworkScore;
	}
	public void setHomeworkScore(String homeworkScore) {
		this.homeworkScore = homeworkScore;
	}
	public String getContentScore() {
		return contentScore;
	}
	public void setContentScore(String contentScore) {
		this.contentScore = contentScore;
	}
	public int getLikeCount() {
		return likeCount;
	}
	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}
	
	public EvaluationDTO() {
		
	}
	
	public EvaluationDTO(int evaluationID, String userID, String lectureName, String professorName, int lectureYear,
			String semesterDivide, String lectureDivide, String evaluationTitle, String evaluationContent,
			String totalScore, String creditScore, String homeworkScore, String contentScore, int likeCount) {
		super();
		this.evaluationID = evaluationID;
		this.userID = userID;
		this.lectureName = lectureName;
		this.professorName = professorName;
		this.lectureYear = lectureYear;
		this.semesterDivide = semesterDivide;
		this.lectureDivide = lectureDivide;
		this.evaluationTitle = evaluationTitle;
		this.evaluationContent = evaluationContent;
		this.totalScore = totalScore;
		this.creditScore = creditScore;
		this.homeworkScore = homeworkScore;
		this.contentScore = contentScore;
		this.likeCount = likeCount;
	}
	
	
}
