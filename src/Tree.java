
public abstract class Tree {
    private int height;
    private int numRows; // Added numRows variable


    public Tree(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public abstract String getSegment();
}

