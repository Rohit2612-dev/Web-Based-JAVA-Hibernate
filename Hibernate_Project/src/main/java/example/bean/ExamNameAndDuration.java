package example.bean;

public class ExamNameAndDuration {
	private String examName;
	private int examDuration;

	public ExamNameAndDuration() {
		// TODO Auto-generated constructor stub
	}

	public ExamNameAndDuration(String examName, int examDuration) {
		super();
		this.examName = examName;
		this.examDuration = examDuration;
	}

	public String getExamName() {
		return examName;
	}

	public void setExamName(String examName) {
		this.examName = examName;
	}

	public int getExamDuration() {
		return examDuration;
	}

	public void setExamDuration(int examDuration) {
		this.examDuration = examDuration;
	}

	@Override
	public String toString() {
		return "ExamNameAndDuration [examName=" + examName + ", examDuration=" + examDuration + "]";
	}
}
