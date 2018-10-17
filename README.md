# cs100f2018-lab6-starter

Designed for use with [GitHub Classroom](https://classroom.github.com/), this
repository contains the starter files for Laboratory 6 in Computer Science 100.

## Introduction

This assignment requires a programmer to implement and test a Java program,
called `MusicGenerator`, that will produce auditory output demonstrating the
musical pieces while using JFugue library. First, the program will read in
the user's choice of the instrument and a temp. Then, it will create three
distinct musical pieces  and, finally, play the pieces according to the
user's preference. As verified by
[Checkstyle](https://github.com/checkstyle/checkstyle), the source code for the
`MusicGenerator.java` file must adhere to all of the requirements in the [Google
Java Style Guide](https://google.github.io/styleguide/javaguide.html).

The programmer is also responsible for writing a three-paragraph reflection,
stored in the file `writing/reflection.md`, that explains the challenges that
you faced and the solutions you developed while working on this assignment, as
well as the theme outlining your musical pieces and a general team-working strategy.
This is a Markdown file that must adhere to the standards described
in the [Markdown Syntax
Guide](https://guides.github.com/features/mastering-markdown/). Remember, you
can preview the contents of a comitted Markdown file by clicking on the name of
the file in your GitHub repository.

The source code in the `MusicGenerator.java` file must also pass additional tests
set by the [GatorGrader tool](https://github.com/GatorEducator/gatorgrader). As
before, GatorGrader will check to ensure `MusicGenerator` uses the `new Date()`
construct in the Java code. Moreover, GatorGrader will check the following
characteristics of your implementation:

* The `MusicGenerator` program must:
  * Contain at least six single-line comments and two multi-line comments
  * Include at least 5 `println` statements
  * Include at least 1 `else if` statement
  * Create and play music pieces as outlined in the
    assignment sheet

A carefully formatted assignment sheet for this project provides more details
about the steps that a computer scientist should take to complete this
assignment. You can view this assignment sheet by visiting the listing of
laboratories on the course web site.

## Learning

If you have not done so already, please read all of the relevant [GitHub
Guides](https://guides.github.com/) that explain how to use many of the features
that GitHub provides.

To do well on this assignment, you should also review Chapter 3 and study
Sections 5.1 through 5.3. Please see the course instructor or one of the
teaching assistants or tutors if you have questions about any of these reading
assignments.

## Commands

To get started in using the GatorGrader tool, you can change into the directory
for this assignment and type the command `gradle grade` in your terminal.
Running this command will produce a lot of output that you should carefully
inspect. If the output indicates that GatorGrader judges that there are no
mistakes in the assignment, then this means that your source code and writing
are passing all of the automated baseline checks. However, if the output
indicates that there are mistakes, then you will need to understand what they
are and then try to fix them. Travis is not used for this assignment, but
your submission must pass all of the GatorGrader checks locally.

You can also complete several important Java programming tasks by using the
`gradle` tool. For instance, you can compile (i.e., create bytecode from the
program's source code if it is a correct program) the program using the command
`gradle build`. There are other additional commands that you can type:

- `gradle clean`: clean the project of all the derived files
- `gradle check`: check the quality of the code using Checkstyle
- `gradle build`: create the bytecode from the Java source code
- `gradle run`: run the Java program in the command-line
- `gradle tasks`: display details about the Gradle system

To run one of these commands, you must be in the main  directory
for this assignment where the `build.gradle` file is located. Then, you can type
the command in the terminal and study the output.

## Output

Due to the nature of this program, typing the command
`gradle run` in the terminal window produces textual and auditory output. Your program must adhere to
all of the requirements for the assignment and pass all of the verification
checks.

## Problems

If you have found a problem with this assignment's provided source code, then
you can go to the [Computer Science 100 Lab 6
Starter](https://github.com/Allegheny-Computer-Science-100-01-F2018/cs100f2018-lab6-starter)
repository and create an issue by clicking the "Issues" tab and then clicking
the green "New Issue" button. If you have found a problem with the [GatorGrader tool](https://github.com/GatorEducator/gatorgrader) and the way that it checks you
assignment, then you can follow the aforementioned steps to create an issue in
its repository. To ensure that your issue is properly resolved, please provide
as many details as is possible about the problem that you experienced.
Students who find, and use the appropriate GitHub issue tracker to correctly
document, a mistake in any aspect of this laboratory assignment will receive
extra credit towards their grade for it.

## Assistance

If you are having trouble completing any part of this project, then please talk
with either the course instructor or a teaching assistant during the laboratory
session. Alternatively, you may ask questions in the Slack team for this
course. Finally, you can schedule a meeting during the course instructor's
office hours.
