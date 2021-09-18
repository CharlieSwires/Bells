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
<p><t/>       List<Bells> lb = new ArrayList<Bells>();</p>
<p><t/>        int[] initial = {1,2,3,4};</p>
<p><t/>        lb.add(new Bells(initial));</p>
<p><t/>        BellsRoll br = new BellsRoll(lb);</p>
<p><t/>        br = br.randomRoll();</p>

