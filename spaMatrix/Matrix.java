import java.io.*;
import java.util.*;

class Matrix {
	    private int numRows;
	        private int numCols;
		    private Map<Integer, Map<Integer, Integer>> matrix;

		        public Matrix(String matrixFilePath) throws IOException {
				        matrix = new HashMap<>();
					        loadMatrixFromFile(matrixFilePath);
						    }

			    public Matrix(int numRows, int numCols) {
				            this.numRows = numRows;
					            this.numCols = numCols;
						            matrix = new HashMap<>();
							        }

			        private void loadMatrixFromFile(String matrixFilePath) throws IOException {
					        BufferedReader reader = new BufferedReader(new FileReader(matrixFilePath));
						        String line = reader.readLine().trim();
							        if (!line.startsWith("rows=")) {
									            throw new IllegalArgumentException("Input file has wrong format");
										            }
								        numRows = Integer.parseInt(line.substring(5).trim());

									        line = reader.readLine().trim();
										        if (!line.startsWith("cols=")) {
												            throw new IllegalArgumentException("Input file has wrong format");
													            }
											        numCols = Integer.parseInt(line.substring(5).trim());

												        while ((line = reader.readLine()) != null) {
														            line = line.trim();
															                if (line.isEmpty()) continue;
																	            if (!line.matches("\\(\\d+,\\s*\\d+,\\s*-?\\d+\\)")) {
																			                    throw new IllegalArgumentException("Input file has wrong format");
																					                }
																		                String[] parts = line.substring(1, line.length() - 1).split(",");
																				            int row = Integer.parseInt(parts[0].trim());
																					                int col = Integer.parseInt(parts[1].trim());
																							            int value = Integer.parseInt(parts[2].trim());
																								                setElement(row, col, value);
																										        }
													        reader.close();
														    }

				    public int getElement(int currRow, int currCol) {
					            return matrix.getOrDefault(currRow, Collections.emptyMap()).getOrDefault(currCol, 0);
						        }

				        public void setElement(int currRow, int currCol, int value) {
						        if (!matrix.containsKey(currRow)) {
								            matrix.put(currRow, new HashMap<>());
									            }
							        matrix.get(currRow).put(currCol, value);
								    }

					    public Matrix add(Matrix other) {
						            if (this.numRows != other.numRows || this.numCols != other.numCols) {
								                throw new IllegalArgumentException("Matrices dimensions do not match for addition");
										        }

							            Matrix result = new Matrix(this.numRows, this.numCols);

								            for (int row : this.matrix.keySet()) {
										                for (int col : this.matrix.get(row).keySet()) {
													                result.setElement(row, col, this.getElement(row, col));
															            }
												        }

									            for (int row : other.matrix.keySet()) {
											                for (int col : other.matrix.get(row).keySet()) {
														                result.setElement(row, col, result.getElement(row, col) + other.getElement(row, col));
																            }
													        }

										            return result;
											        }

					        public Matrix subtract(Matrix other) {
							        if (this.numRows != other.numRows || this.numCols != other.numCols) {
									            throw new IllegalArgumentException("Matrices dimensions do not match for subtraction");
										            }

								        Matrix result = new Matrix(this.numRows, this.numCols);

									        for (int row : this.matrix.keySet()) {
											            for (int col : this.matrix.get(row).keySet()) {
													                    result.setElement(row, col, this.getElement(row, col));
															                }
												            }

										        for (int row : other.matrix.keySet()) {
												            for (int col : other.matrix.get(row).keySet()) {
														                    result.setElement(row, col, result.getElement(row, col) - other.getElement(row, col));
																                }
													            }

											        return result;
												    }

						    public Matrix multiply(Matrix other) {
							            if (this.numCols != other.numRows) {
									                throw new IllegalArgumentException("Matrices dimensions do not match for multiplication");
											        }

								            Matrix result = new Matrix(this.numRows, other.numCols);

									            for (int row : this.matrix.keySet()) {
											                for (int col : this.matrix.get(row).keySet()) {
														                int value = this.getElement(row, col);
																                for (int k = 0; k < other.numCols; k++) {
																			                    int otherValue = other.getElement(col, k);
																					                        if (otherValue != 0) {
																									                        result.setElement(row, k, result.getElement(row, k) + value * otherValue);
																												                    }
																								                }
																		            }
													        }

										            return result;
											        }

						        public void printMatrix() {
								        for (int row : matrix.keySet()) {
										            for (int col : matrix.get(row).keySet()) {
												                    System.out.println("(" + row + ", " + col + ", " + matrix.get(row).get(col) + ")");
														                }
											            }
									    }
}

