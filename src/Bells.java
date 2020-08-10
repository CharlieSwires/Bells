import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Bells {

    private int bells[] = null;
    private Set<Integer> bellSet = null;

    public Bells(int[] bells) {
        this.bells = bells;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.hashCode(bells);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Bells other = (Bells) obj;
        if (!Arrays.equals(bells, other.bells))
            return false;
        return true;
    }

    public boolean isUnique() {
        bellSet = new HashSet<Integer>();
        for (Integer bell : bells) {
            this.bellSet.add(bell);
        }
        return this.bellSet.size() == bells.length;
    }

    public boolean positionCompare(Bells bells2) {
        Map<Integer, Integer> positionMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < bells.length; i++) {
            positionMap.put(bells[i], i);
        }
        for (int i = 0; i < bells2.getBells().length; i++) {
            if (bells2.getBells().length != bells.length) return false;
            int adjacent = i - positionMap.get(bells2.getBells()[i]);
            if (!(adjacent == 1 || adjacent == -1 || adjacent == 0 ||
                    adjacent == -(bells.length -1) || adjacent == (bells.length -1))) {// I've assumed circular
                return false;
            }
        }
        return true;
    }

    public int[] getBells() {
        return bells;
    }

    public void setBells(int[] bells) {
        this.bells = bells;
    }
}
