import java.util.ArrayList;

/**
 * Created by diamo on 02.05.2017.
 */
public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGrocery(String item) {
        groceryList.add(item);
    }


    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + "items ");
        for(int i=0;i<groceryList.size();i++)
            System.out.println((i+1) + " " + groceryList.get(i));
    }

    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if (position >= 0)
            modifyGroceryItem(position, newItem);
    }

    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position,newItem);
        System.out.println("Grocery item " + position + 1 + " has been modified");
    }

    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if (position >= 0)
            removeGroceryItem(position);
    }
    
    public void removeGroceryItem(int position) {
        groceryList.remove(position);
    }

    public int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
     }

     public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if(position >= 0)
            return true;
        return false;
     }
}
