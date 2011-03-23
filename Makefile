all : com/github/twoodfin/DupFinder.class

%.class : %.java
	javac $^

test : com/github/twoodfin/DupFinder.class
	java com.github.twoodfin.DupFinder
