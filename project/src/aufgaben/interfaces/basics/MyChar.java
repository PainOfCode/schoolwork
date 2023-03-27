package aufgaben.interfaces.basics;

public class MyChar implements Commentable, Flagable {

    char zeichen;
    String comment;
    boolean flag;

    public MyChar(char zeichen) {
        this.zeichen = zeichen;
    }

    @Override
    public String getComment() {
        return this.comment;
    }

    @Override
    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public void clearComment() {
        this.comment = "";
    }

    @Override
    public String toString() {
        return "MyChar{" +
                "zeichen=" + zeichen +
                ", comment='" + comment + '\'' +
                ", flag=" + flag +
                '}';
    }

    public char getZeichen() {
        return zeichen;
    }

    public void setZeichen(char zeichen) {
        this.zeichen = zeichen;
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
