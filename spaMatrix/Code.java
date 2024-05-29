import java.io.*;

public class Code {
	    public static void main(String[] args) {
		            try {
				                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
						            System.out.println("Enter the path of the first matrix file:");
							                String matrixFilePath1 = reader.readLine().trim();
									            Matrix matrix1 = new Matrix(matrixFilePath1);

										                System.out.println("Enter the path of the second matrix file:");
												            String matrixFilePath2 = reader.readLine().trim();
													                Matrix matrix2 = new Matrix(matrixFilePath2);

															            System.out.println("Select operation (add, subtract, multiply):");
																                String operation = reader.readLine().trim();

																		            Matrix result = null;

																			                switch (operation.toLowerCase()) {
																						                case "add":
																									                    result = matrix1.add(matrix2);
																											                        break;
																														                case "subtract":
																														                    result = matrix1.subtract(matrix2);
																																                        break;
																																			                case "multiply":
																																			                    result = matrix1.multiply(matrix2);
																																					                        break;
																																								                default:
																																								                    System.out.println("Invalid operation");
																																										                        return;
																																													            }

																					            System.out.println("Resultant matrix:");
																						                result.printMatrix();

																								        } catch (IOException e) {
																										            e.printStackTrace();
																											            } catch (IllegalArgumentException e) {
																													                System.out.println(e.getMessage());
																															        }
			        }
}

