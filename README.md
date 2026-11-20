# Student Marks Analyzer

A simple Java console program that takes the marks of students and shows some basic statistics about the class. I made this as my first Java project to practice arrays, loops and conditions.

## What it does

- Asks how many students are in the class
- Takes each student's name and marks (out of 100)
- Checks that marks are between 0 and 100, and asks again if they are not
- Shows total students, average, highest and lowest marks
- Shows the topper(s). If two students have the same highest marks, both are shown
- Prints a rank list from highest to lowest marks

## Concepts I used

- Scanner for input
- Arrays (one for names, one for marks)
- for loops and while loop
- if conditions
- Sorting using swapping (I wrote the logic myself, no built-in sort)

## How to run

1. Make sure Java (JDK) is installed
2. Download or clone this repo
3. Open the `src` folder in a terminal
4. Compile and run:

```
javac Project1.java
java Project1
```

You can also open it in IntelliJ IDEA and just press Run.

## Sample output

```
How many students? 4
Enter student 1 name: Rahul
Enter student 1 marks (0-100): 85
Enter student 2 name: Priya
Enter student 2 marks (0-100): 92
Enter student 3 name: Amit
Enter student 3 marks (0-100): 78
Enter student 4 name: Sneha
Enter student 4 marks (0-100): 92

*** CLASS STATISTICS ***
Total students: 4
Average marks: 86.75
Highest marks: 92
Lowest marks: 78

*** TOPPER(S) ***
 Priya
 Sneha

*** RANK LIST ***
1. Priya - 92
2. Sneha - 92
3. Rahul - 85
4. Amit - 78
```

## Things I want to improve

- Right now the program crashes if you type a letter instead of a number. I want to add proper input handling
- Students with the same marks get different ranks (like 1 and 2), they should get the same rank
- Add grades (A, B, C...) based on marks
- Maybe save the data in a file

## About me

Made by Pratyush
GitHub: [pratyushs169-dot](https://github.com/pratyushs169-dot)
