package aufgaben.interfaces.basics;

public class IO {


    public void aufgabe1() {

        MyNumber myNumber = new MyNumber(42);
        myNumber.setComment("Answer to the Ultimate question of life, the universe, and everything");
        myNumber.setFlag(true);
        System.out.println(myNumber);

        myNumber.clearComment();
        myNumber.resetFlag();
        System.out.println(myNumber);

        System.out.println("\n");

        MyChar myChar = new MyChar('X');
        myChar.setComment("Answer to the Ultimate question of life, the universe, and everything");
        myChar.setFlag(false);
        System.out.println(myChar);

        myChar.clearComment();
        myChar.setFlag(true);
        System.out.println(myChar);

    }

}
