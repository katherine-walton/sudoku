
import java.io.*; 
import java.util.*; 


class Solver {


	public static void solve(int[][] input) {

		for(int row=0; row < input.length; row++) {
			for(int col = 0; col < input[0].length; col++) {

				//if input has a zero, set arraylist to be values 1-9
				if(input[row][col] == 0){
					matrix[row][col] = new ArrayList<Integer>(); 
					//System.out.println("Here");
					matrix[row][col].add(1);
					//System.out.println("Here");
					matrix[row][col].add(2);
					matrix[row][col].add(3);
					matrix[row][col].add(4);
					matrix[row][col].add(5);
					matrix[row][col].add(6);
					matrix[row][col].add(7);
					matrix[row][col].add(8);
					matrix[row][col].add(9);

				}

				//if input has a nonzero, as well as between 1 and 9,
				//make the array list of length one
				else {
					matrix[row][col] = new ArrayList<Integer>();
					matrix[row][col].add(input[row][col]);
				}
			}
		}

	boolean change = true;
	int changeCount = 0; 

	while(change){

		changeCount = 0; 

		//goes through eliminating
		for(int row=0; row < matrix.length; row++) {
			for(int col = 0; col < matrix[0].length; col++) {
				if(matrix[row][col].size() > 1) {
					for(int list = 0; list<matrix[row][col].size(); list++) {
						if(rowCheck(matrix[row][col].get(list),row) == false) {
							//remove offending number
							matrix[row][col].remove(list);
							changeCount++; 

						} else if(colCheck(matrix[row][col].get(list),col) == false) {
							//remove offending number
							matrix[row][col].remove(list);
							changeCount++; 

						} else if(squareCheck(matrix[row][col].get(list), row, col) == false) {
							//remove offending number
							matrix[row][col].remove(list);
							changeCount++; 

						}
					}
				}
			}
		}

		if(changeCount == 0){
			change = false;
		}
		//System.out.println("Change: " + changeCount);
		}
	}

	public static Boolean rowCheck(int num, int row) {
		for(int col=0; col < matrix[0].length; col++) {
			if(matrix[row][col].size() == 1) {
				if(matrix[row][col].contains(num)){
					return false; 
				}
			}
		}
		return true; 
	}

	public static Boolean colCheck(int num, int col) {

		for(int row=0; row < matrix.length; row++) {
			if(matrix[row][col].size() == 1) {
				if(matrix[row][col].contains(num)){
					return false; 
				}
			}
		}
		return true; 
	}

	public static Boolean squareCheck(int num, int row, int col) {
		if(row <=2 ){
			if(col <=2) {
				for(int i=0; i<3; i++) {
					for(int j=0; j<3; j++) {
						if(matrix[i][j].size() == 1) {
							if(matrix[i][j].contains(num)){
								return false; 
							}
						}
					}
				}
			} else if(col <=5) {
				for(int i=0; i<3; i++) {
					for(int j=3; j<6; j++) {
						if(matrix[i][j].size() == 1) {
							if(matrix[i][j].contains(num)){
								return false; 
							}
						}
					}
				}
				
			} else if(col <=8) {
				for(int i=0; i<3; i++) {
					for(int j=6; j<9; j++) {
						if(matrix[i][j].size() == 1) {
							if(matrix[i][j].contains(num)){
								return false; 
							}
						}
					}
				}
				
			}
		} else if(row <= 5) {
			if(col <=2) {
				for(int i=3; i<6; i++) {
					for(int j=0; j<3; j++) {
						if(matrix[i][j].size() == 1) {
							if(matrix[i][j].contains(num)){
								return false; 
							}
						}
					}
				}

			} else if(col <=5) {
				for(int i=3; i<6; i++) {
					for(int j=3; j<6; j++) {
						if(matrix[i][j].size() == 1) {
							if(matrix[i][j].contains(num)){
								return false; 
							}
						}
					}
				}
			} else if(col <=8) {
				for(int i=3; i<6; i++) {
					for(int j=6; j<9; j++) {
						if(matrix[i][j].size() == 1) {
							if(matrix[i][j].contains(num)){
								return false; 
							}
						}
					}
				}
				
			}
		} else if(row <= 8) {
			if(col <=2) {
				for(int i=6; i<9; i++) {
					for(int j=0; j<3; j++) {
						if(matrix[i][j].size() == 1) {
							if(matrix[i][j].contains(num)){
								return false; 
							}
						}
					}
				}
			} else if(col <=5) {
				for(int i=6; i<9; i++) {
					for(int j=3; j<6; j++) {
						if(matrix[i][j].size() == 1) {
							if(matrix[i][j].contains(num)){
								return false; 
							}
						}
					}
				}
			} else if(col <=8) {
				for(int i=6; i<9; i++) {
					for(int j=6; j<9; j++) {
						if(matrix[i][j].size() == 1) {
							if(matrix[i][j].contains(num)){
								return false; 
							}
						}
					}
				}
			}
		}

		return true; 
	}
}