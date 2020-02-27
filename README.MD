#### 1. Add new shape
This feature allows user to add new shape to shapes list. User should be able to choose what kind of shapes he/she wants to add. Then he/she should specify attributes that a given shape requires.

#### 5. Show formulas
This feature should allow user to choose shape type and print it's formulas (perimeter, area).

## Classes
This is the most important part of this assignment. You've got to implement all of them in `shapes` and `containers` packages in their own fie.

#### Instance methods

##### ```double getArea()```
Returns the area of the shape.
##### ```double getPerimeter()```
Returns the perimeter of the shape.
##### ```String toString()```
Returns information about given shape as string.
##### ```String getAreaFormula()```
Returns formula for the area of the shape as a string.
##### ```String getPerimeterFormula()```
Returns formula for the perimeter of the shape.


#### Static methods
##### ```boolean checkIfArgsGreaterThanZero(float... args)```
That method should be used in constructor of each specific shape. Returns true if any of args are greater than 0. Should raise `IllegalArgumentException` if any of the parameters is 0 or less (e.g. circle with negative radius doesn't exist).

# Extra
If you've fulfilled all the basic requirements and you're ambitious enough to continue, here's idea what you can do.

Help Zigy even more and implement quiz feature. This feature should generate random shape. Tell the user the type of shape and it's attributes. The user should calculate the perimeter and area. The program should check users answer.


You can also add more shapes to the geometry class.


## Running your app
As we started to use packages, source files are placed deep in the hierarchy in different directories. We will show you one of possible ways to handle this.

1. Save paths to all source files with your production code to a file:

    `find src/main -name "*.java" > production.txt`

2. Create output directory for compiled classes of your production code (thanks to `-p` parameter it will be created only if it does not exist without an error if it exists already):

    `mkdir -p out/production`

3. Compile all source files saved in `production.txt` file into specified directory:

    `javac @production.txt -d out/production`

4. To run `Main` class you have run `java` command with the path to all compiled files and specified name of class including the name of the package it belongs to:

    `java -cp out/production/ com.codecool.java.geometry.Main`

If you want to run your program after each change, it will be annoying to do all those steps all the time.  You can do all steps needed to compile your code in one line by joining commands with `&&`:

`find src/main -name "*.java" > production.txt && mkdir -p out/production && javac @production.txt -d out/production`

If you want to run it right after compiling, just join the above line add command that is used to run your program with another `&&`.

## Running tests
You will need to download jar file from: https://mvnrepository.com/artifact/org.junit.platform/junit-platform-console-standalone
You can try with the latest version. Put this file to `lib` directory in your project and then you will be able to run the test suite,
e.g. (adjust for your version number):

`java -jar lib/junit-platform-console-standalone-1.1.0.jar -cp out/test/:out/production/ --scan-classpath`

Of course, you need to compile the *Tests.java files first:

1. Save paths to all source files with test code to a file:

    `find src/test -name "*.java" > test.txt`

2. Create output directory for compiled classes of test code:

    `mkdir -p out/test`

3. Show compiler directories to look for your JUnit jar and your compiled production classes and compile all source files saved in `test.txt` file into specified directory:

    `javac -cp lib/\*:out/production:. @test.txt -d out/test`


If you want to compile and run tests in one go, just join all commands with `&&`:

`find src/test -name "*.java" > test.txt && mkdir -p out/test && javac -cp lib/\*:out/production:. @test.txt -d out/test && java -jar lib/junit-platform-console-standalone-1.1.0.jar -cp out/test/:out/production/ --scan-classpath`
