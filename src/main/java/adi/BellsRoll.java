package main.java.adi;
import java.util.HashSet;
import java.util.List;

public class BellsRoll {

    private List<Bells> list = null;
    private HashSet<Integer> unique = new HashSet<Integer>();
    public BellsRoll(List<Bells> lb) {
        list = lb;
        for (Bells bells : list) {
            unique.add(bells.hashCode());
        }
    }

    public boolean isUnique() {
        for (Bells bells : list) {
            if (!bells.isUnique()) {
                return false;
            }
        } return true;
    }

    public boolean onePosition() {
        for (int i = 0; i < list.size() - 1; i++) {
            if (!list.get(i).positionCompare(list.get(i + 1))) {
                return false;
            }
        }
        return true;
    }

    public boolean oneOccurance() {
        return unique.size() == list.size();
    }

    @Override
    public String toString() {
        return "BellsRoll [list=" + list + "]";
    }

}
