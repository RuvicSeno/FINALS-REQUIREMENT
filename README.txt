PURPOSE:
The purpose of this program is to develop a program to 
calculate the hyperbolic arc sine function (asinh) using BigDecimal.

APPROACH:
The first thing I did was research how I can calculate the inverse of 
the hyperbolic sin function (asinh). I followed the formula and put it to work in the code. 
I also realized that I have to add input validation in the program based on the rubrics,
fortunately I have a Java program made months ago that uses input validation, so I used
my previous programming code to add input validation.  
The second thing I did was to try and find out how bufferreader works, I watched a YouTube 
tutorial to get the program working to avoid hard coding. 
And for the finishing touch, I added comments for readability.

INSTRUCTIONS:
Unzip the file and open the Java program FOLDER in a Java IDE application.
There will be 2 .txt files called README.txt and input.txt and 1 folder called src.
And inside the src folder is Seno_RuvicChristian_MidtermReq.java.

To use the program, run the program first to check if it's working.
The default output should be: asinh(2.0) = 1.4436354751788103012444253181456588208675384521484375
PS: You can change the number value in the <input.txt> 

If it's not working, look at the console if there's any ERROR message.
If there is an ERROR message, there will be 2 possible ERROR messages:
	1. "Error! No input found in the file."
	2. "Error! Unable to read from file."

If it's ERROR #1 then put any positive number above the input.txt
If it's ERROR #2 then the <input.txt> file is missing or corrupted. 
To fix it, create a new <input.txt> and put it outside the src folder.