package main.java.adi;
import java.util.ArrayList;
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

    public int size() {
        return list.size();
    }
    
    public BellsRoll randomRoll() {
        List<Bells> lb = new ArrayList<Bells>();
        lb.addAll(list);

        boolean finished = false;
        BellsRoll br = null;
        while(!finished) {
            for(int tries = 0; tries < 100; tries++){
                int rnd = (int)Math.round(Math.random() * (lb.get(0).size()-1));
                int[] newpeel = lb.get(lb.size()-1).swap(rnd);
                lb.add(new Bells(newpeel));

                br = new BellsRoll(lb);
                if (br.isUnique() && br.onePosition() && br.oneOccurance()) {
                    finished = false;
                    break;
                } else {
                    lb.remove(lb.size()-1);
                    finished = true;
                    continue;
                }
            }
        }
        return br;
    }

}
