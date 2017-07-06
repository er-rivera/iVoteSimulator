import java.util.Random;

public class Student{
    private String id;
    private char answer;

    public Student(){
        generateID();
    }

    private void generateID() {
        char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random();
        for(int i = 0; i < 15; i++){
            char c = chars[random.nextInt(chars.length)];
            stringBuilder.append(c);
        }
        id = stringBuilder.toString();
    }

    public char getAnswer() {
        return answer;
    }

    public String getId() {
        return id;
    }

    public void setAnswer(char answer) {
        this.answer = answer;
    }
}
