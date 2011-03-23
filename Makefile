all : com/github/twoodfin/DupFinder.class

%.class : %.java
	javac $^

