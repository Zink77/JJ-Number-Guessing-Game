# JJ-Number-Guessing-Game
A number guessing game coded in JavaScript.

## Description
This program is was created in JavaScript using the Itellij compiler. This code is used as an example of how to correctly import new Java packages to impliment within one's own code. At the top you will be able to see the correct import statements needed to use the function later in the body block of code. 

### Features
* Basic number guessing game
* Ability to be customized to broader number ranges
* Ability to constrict the number of guesses a user is allowed

### Background
This program was created for a lab assignment in my CS 232 class. I created this code over the course of a day using a trail and error method until the code worked flawlessly.

## Installation/Use
In order to use this code, you will need a Java Compiler (linked the the Support section). From there you will be able to use one of two methods to access this code: 
1. If you are trained in accessing github files directlly from your code, you may simply copy the link to my exact code files and run them from there.
2. If you are new to coding in Java, I reccomend you simply:
    - Highlight all the code listed in my .java file
    - Right click
    - Left click "copy"
    - Enter your java file
    - Right click
    - Left click "paste"
3. For both mehtods make sure to save your file before compiling.

## Usage
This program is very simple and all required instructions are displayed to you on the user interaction window built into your complier of choice, however, listed below is the series of events that will take place as your run my program.
1. The computer will greet the user and inform them that a random number between the set boundaries has been selected for the user to guess.
2. The computer will ask for you to enter a number in between the set boundaries (default is set between 1 and 100)
3. The user will enter their guess
4. If the guess is within boundaries the code will continue
  - else, it will inform the user that their input is invalid 
  - another input will be asked for
5. The computer will compute the number and return to the user whether their guess was: correct, too high, or too low
6. If the guess was too high/too low, the computer will state which and then ask for another guess
7. Once the user has correctly guess the number, or run out of attempts, the computer will begin the final portion of the code
8. The computer will display to the user: the correct number, number of guesses taken, and a thank you message
9. the program will terminate correctly
