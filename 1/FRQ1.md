# FRQ 1

Suppose you are given a class Student with instance variables name, grade, classNum, and canGraduate. You are asked to write a method `printStudentInfo()` that prints the student’s name, grade, and class number in the format: “Name: [name], Grade: [grade], Class Number: [classNum]”. If the student can graduate, the string “This student can graduate” should also be printed on a new line. Otherwise, the string “This student cannot graduate” should be printed on a new line.

# Questions
A. Write the complete `printStudentInfo()` method below.

B. Suppose you are given a subclass APStudent that extends Student. APStudent has an additional instance variable numAPClasses. Write a constructor for APStudent that takes four arguments: name (a String), grade (an int), classNum (an int), and numAPClasses (an int). Your constructor should call the superclass constructor to initialize the name, grade, and classNum instance variables and should also initialize the numAPClasses instance variable.

C. Write a method `printAPStudentInfo()` for the APStudent class that overrides the `printStudentInfo()` method. `printAPStudentInfo()` should call the superclass method to print the student’s name, grade, and class number and should also print the student’s number of AP classes in the format: “Number of AP classes: [numAPClasses]”.