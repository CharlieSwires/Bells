package test.java.adi;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.adi.Bells;
import main.java.adi.BellsRoll;



class BellsTest {

    @BeforeEach
    void setUp() throws Exception {
    }

    @Test
    void test() {
        List<Bells> lb = new ArrayList<Bells>();
        int[] bells = {1,2,3,4,5,6};
        Bells b = new Bells(bells);
        lb.add(b);
        int[]  bells2 = {2,1,4,3,6,5};
        b = new Bells(bells2);
        lb.add(b);
        int[]  bells3 = {2,4,1,6,3,5};
        b = new Bells(bells3);
        lb.add(b);
        int[]  bells4 = {4,2,6,1,5,3};
        b = new Bells(bells4);
        lb.add(b);
        int[]  bells5 = {4,6,2,5,1,3};
        b = new Bells(bells5);
        lb.add(b);

        BellsRoll br = new BellsRoll(lb);
        Assert.assertTrue(br.isUnique());
        Assert.assertTrue(br.onePosition());
        Assert.assertTrue(br.oneOccurance());

    }    

    @Test
    void test2() {
        List<Bells> lb = new ArrayList<Bells>();
        int[] bells = {1,2,3,4,5,6};
        Bells b = new Bells(bells);
        lb.add(b);
        int[]  bells2 = {3,2,1,6,5,4};
        b = new Bells(bells2);
        lb.add(b);
        int[]  bells3 = {2,3,1,5,6,4};
        b = new Bells(bells3);
        lb.add(b);
        int[]  bells4 = {3,2,1,6,5,4};
        b = new Bells(bells4);
        lb.add(b);

        BellsRoll br = new BellsRoll(lb);
        Assert.assertTrue(br.isUnique());
        Assert.assertTrue(!br.onePosition()); //false
        Assert.assertTrue(!br.oneOccurance());//false

    }

    @Test
    void test3() {
        try {
            int[] bells = {1,2,3,4,5,-6};
            Bells b = new Bells(bells);
        } catch (AssertionError e) {
            Assert.assertTrue(true);;
        }
    }
    @Test
    void test4() {
        List<Bells> lb = new ArrayList<Bells>();
        int[] bells = {1,2,3,4,5,7};
        Bells b = new Bells(bells);
        lb.add(b);
        int[]  bells2 = {2,1,4,3,6,5};
        b = new Bells(bells2);
        lb.add(b);
        BellsRoll br = new BellsRoll(lb);
        Assert.assertTrue(!br.onePosition()); //false
    }

}
