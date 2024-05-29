Sparse Matrix Operations
This Java program performs addition, subtraction, and multiplication on sparse matrices loaded from input files. The matrices are represented using a custom data structure to optimize memory usage and runtime performance.

Directory Structure
Organize the project files as follows:

css
Copy code
/dsa/sparse_matrix/
  ├── code/
  │   └── src/
  │       └── Matrix.java
  │       └── Code.java
  ├── sample_inputs/
  │       └── easy_sample_01_1.txt
  │       └── easy_sample_01_2.txt
  │       └── easy_sample_01_3.txt
  │       └── easy_sample_02_1.txt
  │       └── easy_sample_02_2.txt
  │       └── easy_sample_02_3.txt
  │       └── easy_sample_03_1.txt
  │       └── easy_sample_03_2.txt
  │       └── easy_sample_03_3.txt
  │       └── easy_sample_04_1.txt
  │       └── easy_sample_04_2.txt
  │       └── easy_sample_04_3.txt
  └── sample_results/
Setup
Ensure you have Java installed on your system.

Navigate to the source directory:

bash
Copy code
cd /dsa/sparse_matrix/code/src/
Compile the Java programs:

bash
Copy code
javac Matrix.java Code.java
Running the Program
Execute the program:

bash
Copy code
java Code
Follow the prompts:

Enter the path of the first matrix file:

bash
Copy code
/dsa/sparse_matrix/sample_inputs/easy_sample_01_1.txt
Enter the path of the second matrix file:

bash
Copy code
/dsa/sparse_matrix/sample_inputs/easy_sample_01_2.txt
Select the operation (add, subtract, multiply):

csharp
Copy code
add
The program will display the resultant matrix.

Input File Format
Each input file should follow this format:

php
Copy code
rows=<number_of_rows>
cols=<number_of_columns>
(<row_index>, <col_index>, <value>)
(<row_index>, <col_index>, <value>)
...
Example:
easy_sample_01_1.txt:

scss
Copy code
rows=3
cols=3
(0, 0, 1)
(0, 2, 2)
(1, 1, 3)
easy_sample_01_2.txt:

scss
Copy code
rows=3
cols=3
(0, 1, 4)
(1, 2, 5)
(2, 0, 6)
Operations
Addition: Adds corresponding elements of two matrices.
Subtraction: Subtracts corresponding elements of the second matrix from the first matrix.
Multiplication: Multiplies two matrices following matrix multiplication rules.
Error Handling
The program checks for valid input formats and throws an IllegalArgumentException if the input file format is incorrect.
The program ensures that matrix dimensions are compatible for the selected operations and throws appropriate exceptions for mismatched dimensions.
Example Run
bash
Copy code
java Code
sql
Copy code
Enter the path of the first matrix file:
/dsa/sparse_matrix/sample_inputs/easy_sample_01_1.txt
Enter the path of the second matrix file:
/dsa/sparse_matrix/sample_inputs/easy_sample_01_2.txt
Select operation (add, subtract, multiply):
add
Resultant matrix:
(0, 0, 1)
(0, 1, 4)
(0, 2, 2)
(1, 1, 3)
(1, 2, 5)
(2, 0, 6)
This README provides the necessary instructions to compile, run, and understand the program and its input file format.






