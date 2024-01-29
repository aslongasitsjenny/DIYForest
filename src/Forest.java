
import java.util.Random;

class Forest {
    private Tree[] trees;

    public Forest(int numTrees, int maxHeight) {
        trees = new Tree[numTrees];
        Random random = new Random();

        for (int i = 0; i < numTrees; i++) {
            int treeType = random.nextInt(3); // Randomly choose tree type: 0, 1, or 2
            int height = random.nextInt(maxHeight) + 1; // Randomly choose height from 1 to maxHeight

            switch (treeType) { // allows you to perform different actions based on the value of a variable
                case 0:
                    trees[i] = new Bamboo(height);
                    break;
                case 1:
                    trees[i] = new BroadleafTree(height);
                    break;
                case 2:
                    trees[i] = new PineTree(height);
                    break;
                default:
                    break;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(); // Initialise string builder
        int maxHeight = 0; // Initialise maxHeight to 0

        // Find the maximum height among all trees
        for (Tree tree : trees) { //for-each loop that iterates over each element in the trees ArrayList, where each element is of type Tree
            if (tree.getHeight() > maxHeight) { // If the tree's height is greater than the maxHeight, set maxHeight to tree's height
                maxHeight = tree.getHeight();
            }
        }

        // Print each tree side by side
        for (int i = maxHeight - 1; i >= 0; i--) { // iterates from maxHeight - 1 to 0, with each iteration decrementing the loop variable i by 1
            for (Tree tree : trees) { //for-each loop that iterates over each element in the trees ArrayList, where each element is of type Tree
                if (i < tree.getHeight()) { // If the tree's height is less than the loop variable i, append the segment to the string builder
                    sb.append(tree.getSegment()).append(" "); // Add tree segment to string builder with a space between each tree segment
                } else {
                    sb.append("   "); // Three spaces for each tree segment
                }
            }
            sb.append("\n"); // Add newline after each row
        }

        return sb.toString();
    }
}