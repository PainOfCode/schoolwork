package aufgaben.interfaces.basics;

public class MyNumber implements Commentable, Flagable {

    private String comment;
    private int number;
    boolean flag;

    @Override
    public String getComment() {
        return comment;
    }

    @Override
    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public void clearComment() {
        this.comment = "";
    }

    public MyNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "MyNumber{" +
                "comment='" + comment + '\'' +
                ", number=" + number +
                ", flag=" + flag +
                '}';
    }

    @Override
    public void setFlag(boolean b) {
        this.flag = b;
    }

    @Override
    public void resetFlag() {
        this.flag = false;
    }

    @Override
    public boolean getFlag() {
        return this.flag;
    }
}
