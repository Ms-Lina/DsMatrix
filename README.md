# Sparse Matrix Operations

This project provides a Java implementation for handling sparse matrices and performing matrix operations such as addition, subtraction, and multiplication.

## Directory Structure

/DsMatrix

├──spaMatrix

│ └── Matrix.java

│ └── Code.java

├── hw02

    └── sample_inputs/

    └── sample_results/

## How to Compile and Run

### Prerequisites

- Java Development Kit (JDK) installed on your system.
- Ensure the `sample_inputs` directory contains the input files.

### Compilation

1. Navigate to the source code directory:
    ```bash
    cd /dsa/sparse_matrix/code/src/
    ```

2. Compile the Java files:
    ```bash
    javac Matrix.java Code.java
    ```

### Running the Program

1. Run the program:
    ```bash
    java Code
    ```

2. Follow the prompts to enter the paths of the matrix files and select the operation to perform (add, subtract, multiply).

### Sample Input Files

Sample input files are placed in the `sample_inputs` directory. 


### Operations

The program supports the following operations:

- **Addition**: Adds two matrices.
- **Subtraction**: Subtracts the second matrix from the first matrix.
- **Multiplication**: Multiplies two matrices.

### Example Usage

1. Start the program:
    ```bash
    java Code
    ```

2. Enter the path to the first matrix file when prompted:
    ```
    Enter the path of the first matrix file:
    /dsa/sparse_matrix/sample_inputs/easy_sample_01_1.txt
    ```

3. Enter the path to the second matrix file when prompted:
    ```
    Enter the path of the second matrix file:
    /dsa/sparse_matrix/sample_inputs/easy_sample_01_2.txt
    ```

4. Choose the operation:
    ```
    Select operation (add, subtract, multiply):
    add
    ```

5. The resultant matrix will be printed on the console.

## Error Handling

- The program throws an `IllegalArgumentException` if the input file has the wrong format.
- The program ensures matrix dimensions are compatible for the chosen operations and throws an `IllegalArgumentException` if they are not.

## Author

Done by Lina IRATWE
