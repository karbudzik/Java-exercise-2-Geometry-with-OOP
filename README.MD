#### 1. Add new shape
This feature allows user to add new shape to shapes list. User should be able to choose what kind of shapes he/she wants to add. Then he/she should specify attributes that a given shape requires.

#### 5. Show formulas
This feature should allow user to choose shape type and print it's formulas (perimeter, area).

## Classes
This is the most important part of this assignment. You've got to implement all of them in `shapes` and `containers` packages in their own files.

### Shape Class
This is a so called _abstract class_. It means that we don't create instances of it. We only use it as a parent class for other concrete classes. This parent is a boilerplate for it's children. It contains attributes and methods that should be implemented in child classes.

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

<!-- ...........................

### Circle Class
This class represents circle shape.   
![alt](http://img.sparknotes.com/figures/4/4952adc59740c12b78738934e639a08a/circle.gif "Circle")
#### Parent class
Shape
#### Attributes
* `r`
  * data_type: float
  * description: circle radius length

#### Methods
`Circle(float r)` - constructor of the Cricle

Override (implement) other methods inherited from the parent class.  
Required formulas:
Perimeter = 2×π×r
Area = π×r<sup>2</sup>  

### Triangle Class
This class represents triangle shape.  
![alt](http://mathworld.wolfram.com/images/eps-gif/Triangle_700.gif "Triangle")
#### Parent class
Shape
#### Attributes
* `a`
  * data_type: float
  * description: one side's length of a triangle
* `b`
  * data_type: float
  * description: second side's length of a triangle
* `c`
  * data_type: float
  * description: third side's length of a triangle

#### Methods
`Triangle(float a, float b, float c)` - constructor of the Triangle

Override (implement) methods inherited from the parent class.     
Required formulas:  
Perimeter = a + b + c  
Area = sqrt(s(s-a)(s-b)(s-c)),  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; where s = (a+b+c)/2  
<sup>[Heron's Formula](https://en.wikipedia.org/wiki/Heron's_formula)</sup>

### Equilateral triangle Class
This is a triangle that has all sides equal.  
![alt](http://mathworld.wolfram.com/images/eps-gif/EquilateralTriangle_1000.gif "Equilateral triangle")
#### Parent class
Triangle
#### Attributes
Hint: check if you can reuse attributes from the parent class
* `a`
  * data_type: float
  * description: side's length of a triangle

#### Methods
`EquilateralTriangle(float a)` - constructor of the Equilateral Triangle

Decide on your own if you have to override inherited methods.

### Rectangle Class
This class represents rectangle shape.  
![alt](http://www.numberempire.com/shapes/images/rectangle_main.png "Rectangle")
##### Parent class
Shape
#### Attributes
* `a`
  * data_type: float
  * description: one side length
* `b`
  * data_type: float
  * description: second side length

#### Methods
`Rectangle(float a, float b)` - constructor of the Rectangle

Override (implement) other methods inherited from the parent class.      
Required formulas:  
Perimeter = 2a + 2b  
Area = a×b

### Square Class
This is a rectangle that has all sides equal.  
![alt](http://mathworld.wolfram.com/images/eps-gif/Square_1000.gif "Square")

#### Parent class
Rectangle
#### Attributes
Hint: check if you can reuse attributes from the parent class
* `a`
  * data_type: float
  * description: side's length of the square

#### Methods
`Square(float a)` - constructor of the Square

Decide on your own if you have to override inherited methods.

### Regular pentagon Class
This is a shape with 5 sides. All sides are of the same length.  
![alt](http://www.zdamy.pl/data/mat/planimetria/polepieciokata/rys1.gif "Regular pentagon")
#### Parent class
Shape
#### Attributes
* `a`
  * data_type: float
  * description: side's length of the pentagon -->
<!-- 
#### Methods
`RegularPentagon(float a)` - constructor of the RegularPentagon

Override (implement) other methods inherited from the parent class.      
Required formulas:  
Perimeter = 5a  
Area = (a<sup>2</sup> sqrt(5(5+2sqrt(5))))/4 (see image above) -->

<!-- ### ShapeList Class
This class is meant to hold geometrical shapes (objects that inherit from Shape class).
#### Attributes
* `shapes`
  * data_type: list
  * description: list of Shape objects

#### Methods
##### `ShapeList()`
Constructs ShapeList object

##### `void addShape(Shape shape)`
Adds shape to shapes list.
######  Arguments
* `shape`
  * description: object to be added to the shapes list

##### `Shape getShapeAt(int index)`
Gets shape stored in `shapes` list under specified index.
######  Arguments
* `index`
  * description: index of element to be returned
###### Return value
`String` object

##### `String getShapesTable()`
This method returns shapes list as string formatted into table. This is sample output:  
~~~
 /------------------------------------------------------------------------------------------------------\
 |  idx   |       Class    |       toString       |   Perimeter  |   Formula   |   Area    |  Formula   |
 |--------|----------------|----------------------|--------------|-------------|-----------|------------|
 |   0    |      Circle    |    Circle, r = 3     |     18.85    |     2×π×r   |   28.27   |   π×r^2    |
 |--------|----------------|----------------------|--------------|-------------|-----------|------------|
 |   1    |      Square    |    Square, a = 2     |      8.00    |      4×a    |    4.00   |    a^2     |
 \------------------------------------------------------------------------------------------------------/
~~~
###### Return value
`String` object

##### `getLargestShapeByPerimeter()`
Returns shape with largest perimeter.
###### Return value
`Shape` object

##### `getLargestShapeByArea()`
Returns shape with largest area.
###### Return value
`Shape` object -->


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
