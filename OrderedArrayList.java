public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
    private int searchForIndex(T element) {
        for (int i = 0; i < super.size(); i++) {
            if (super.get(i).compareTo(element) >= 0) {
                return i;
            }
        }
        return super.size();
    }
    
    public boolean add(T element) {
        if (element == null) {
            throw new IllegalArgumentException("You can't add a null to an OrderedArrayList dummy, try again.");
        }
        super.add(searchForIndex(element), element);
        return true;
    }

    public void add(int index, T element) {
        add(element); // index is irrelevant now
    }
}