# HW2
AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA


I'd like to write this out in plain text to help myself and others understand what 
the program does and what order it accomplishes these tasks in

from Homework2 we create a matrixReader

matrixreader's read function returns a sparsematrix, so by calling it we will completely 
create a sparse matrix with values assigned by the file

read takes in a filepath, and uses scanner to read through the selected file line by line
the first two lines initialize the array with the sparsematrix constructor, supplying the row and column length

after that the scanner will go through line by line, separating the text file based on spaces and commas
or each set of a values it will insert the selected value at its correct coordinates, this is done by calling insert from
sparsematrix which calls insert from matrix row and matrix column

once read finishes we should have a complete sparse matrix of 0's with other values at their given coordinates

CURRENTLY WORKING ON MAKING SURE INSERT WORKS

we can print this matrix once that function is written, most likely a carefully formatted system of forloops can call
the value of each Node/ValueNode and return their values to the console

after that we need to make the transpose and product functions

WE HAVE 9 HOURS TO DO THIS BECAUSE EVERYONE WAS LAZY
