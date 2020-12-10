import java.util.ArrayList;

public class NoNullArrayList<T> extends ArrayList<T> {
    public boolean add(T element) {
        if (element == null) {
            throw new IllegalArgumentException("Cannot add a null into a NoNullArrayList.");
        }

        return add(element);
    }
}