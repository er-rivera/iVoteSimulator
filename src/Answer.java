public class Answer {
    private final boolean isCorrectAnswer;
    private String answer;

    public Answer(String answer, boolean isCorrectAnswer){
        this.answer = answer;
        this.isCorrectAnswer = isCorrectAnswer;
    }

    public String getAnswer() {
        return answer;
    }

    public boolean isCorrectAnswer() {
        return isCorrectAnswer;
    }
}
