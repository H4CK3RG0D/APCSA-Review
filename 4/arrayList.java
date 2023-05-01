import java.util.ArrayList;

public class arrayList {
    private ArrayList<int> list;

    public void addElement(int element) {
        list.add(element);
    }

    public void removeElement(int index) {
        list.remove(index);
    }

    public int getElement(int index) {
        return list.get(index);
    }

    public int size() {
        return list.size();
    }

    public int[] removeDuplicates() {
        ArrayList<Integer> uniqueList = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            int element = list.get(i);

            if (!uniqueList.contains(element)) {
                uniqueList.add(element);
            }
        }
        for (int i = 0; i < uniqueList.size(); i++) {
            list.set(i, uniqueList.get(i));
        }
        list = uniqueList;
        return list;
    }

    public class main(String[] args) {
        System.out.println(list.removeDubplicates());
    }
}