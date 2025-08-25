# Battleship

A battleship game that is played entirely in the terminal.
This was a final lab in my intro to CS class. I tried to
condense the code as much as possible.

## Table of Contents
1. [Installation and Usage](#Intalation-and-Usage)
2. [Gameplay](#Gameplay)
3. [Condensing Rules I Follwed](#Condensing-Rules-I-Follwed)
4. [Condensing Strategies I Used](#Condensing-Strategies-I-Used)

## Instalation and Usage
1. Download the file
2. Run Battleship.java

## Gameplay
- Starts on an 8 x 8 board with 1 ship of length 4
- The goal is to sink the ship in 15 shots
- Prompts you to enter the column and row as 1 number
- This means to pick the cloumn number (x-axis) and the row number (y-axis) and merge them
- If you want column 4, row 3 enter "43"

## Condensing Rules I Follwed
- Every non-for-loop semicolon ends the line
- Every method header with open braket, ends the line
- Closing bracket on its own line, only if there is code between its corresponding open bracket
- I only used for-loops if it made sense to use a for-loop, not just to reduce line count
- I Wanted my longest lines to be somewhat equal and "reasonable"
- Must give error information

## Condensing Strategies I Used
- Many variables and statements using for-loops
- I used a lot of for-loop variables so I used jaava.lang.Runtime.getRuntime().addShutdownHook(); to use them "after" the loop
- Used java.util.Scanner.getLine() instead of .getInt() to by pass the otheerwise nessesary try, catch statement
- +=, -=, *=, and /= allowed me to better time variable changes
