Bells
-----

What you need
-------------
<p>eclipse, JDK, maven and git</p>

<p> In git bash: git clone https://github.com/CharlieSwires/Bells </p>
<p> mvn package </p>
<p> from eclipse run JUnit tests </p>
<p> look at the console</p>
<BR>
<p>    @Test</p>
<p>    void test5() {</p>
<p>        List<Bells> lb = new ArrayList<Bells>();</p>
<p>        int[] initial = {1,2,3,4};</p>
<p>        lb.add(new Bells(initial));</p>
<p>        BellsRoll br = new BellsRoll(lb);</p>
<p>        br = br.randomRoll();</p>

