
import java.io.*; 
import java.util.*; 


class Solver {


//aw fuck this doesn't solve at all 
	// public static int[][] input = {
	// 	{0, 0, 0,   0, 0, 0,   0, 0, 0},
	// 	{0, 0, 0,   0, 0, 3,   0, 8, 5},
	// 	{0, 0, 1,   0, 2, 0,   0, 0, 0},

	// 	{0, 0, 0,   5, 0, 7,   0, 0, 0},
	// 	{0, 0, 4,   0, 0, 0,   1, 0, 0},
	// 	{0, 9, 0,   0, 0, 0,   0, 0, 0},

	// 	{5, 0, 0,   0, 0, 0,   0, 7, 3},
	// 	{0, 0, 2,   0, 1, 0,   0, 0, 0},
	// 	{0, 0, 0,   0, 4, 0,   0, 0, 9} };


	//sudoku that kiki solved from book
	//gets solved completely
	// public static int[][] input = {
	// 	{0, 0, 0, 7, 0, 0, 0, 0, 4},
	// 	{0, 3, 0, 0, 6, 5, 0, 0, 0},
	// 	{5, 7, 0, 0, 1, 0, 0, 0, 6},

	// 	{0, 5, 3, 0, 0, 8, 0, 6, 2},
	// 	{7, 0, 0, 4, 0, 2, 5, 3, 1},
	// 	{4, 0, 0, 0, 0, 0, 8, 7, 0},

	// 	{0, 0, 0, 0, 0, 7, 0, 0, 0},
	// 	{0, 0, 0, 6, 0, 3, 0, 0, 0},
	// 	{6, 8, 0, 2, 0, 0, 0, 0, 0} };


//this puzzle gets solved *almost* to completion
	public static int[][] input = {
		{0, 8, 2,   7, 0, 0,   0, 0, 3},
		{7, 0, 0,   0, 4, 0,   5, 0, 0},
		{0, 4, 0,   0, 0, 2,   0, 8, 0},

		{6, 7, 0,   0, 0, 0,   4, 0, 0},
		{3, 0, 4,   0, 0, 0,   6, 0, 7},
		{0, 0, 8,   0, 0, 0,   0, 9, 5},

		{0, 6, 0,   1, 0, 0,   0, 5, 0},
		{0, 0, 5,   0, 9, 0,   0, 0, 1},
		{4, 0, 0,   0, 0, 5,   2, 3, 0} };



//this puzzle gets solved no probelm 
	// public static int[][] input = {
	// 	{0, 0, 0, 0, 5, 0, 1, 0, 0},
	// 	{2, 5, 4, 1, 3, 0, 8, 0, 0},
	// 	{0, 3, 0, 0, 7, 0, 0, 2, 9},
	// 	{0, 4, 2, 0, 6, 0, 0, 0, 5},
	// 	{7, 0, 5, 0, 0, 0, 3, 0, 1},
	// 	{6, 0, 0, 0, 1, 0, 2, 4, 0},
	// 	{5, 2, 0, 0, 9, 0, 0, 1, 0},
	// 	{0, 0, 6, 0, 2, 4, 9, 8, 7},
	// 	{0, 0, 9, 0, 8, 0, 0, 0, 0} };


//this gets solvd to completion

// public static int[][] input = {
// 		{0, 8, 2,   7, 0, 0,   0, 0, 3},
// 		{7, 0, 0,   0, 4, 0,   5, 0, 0},
// 		{0, 4, 0,   0, 0, 2,   0, 8, 0},

// 		{6, 7, 0,   0, 0, 0,   4, 0, 0},
// 		{3, 0, 4,   0, 0, 0,   6, 0, 7},
// 		{0, 0, 8,   0, 0, 0,   0, 9, 5},

// 		{0, 6, 0,   1, 0, 0,   0, 5, 0},
// 		{0, 0, 5,   0, 9, 0,   0, 0, 1},
// 		{4, 0, 0,   0, 0, 5,   2, 3, 0} };


	public static ArrayList<Integer>[][] matrix = new ArrayList[9][9];

	public static void main(String args[]) { 

		//System.out.println(Arrays.toString(solve(input)));

		//System.out.println(30%8);


		// for(int row=0; row < input.length; row++) {
		//  	for(int col = 0; col < input[0].length; col++) {
		//  		System.out.print(Arrays.toString(matrix[row][col].toArray())+ " ");

		//  	}
		//  	System.out.println(" ");
		//  	System.out.println(" ");
		//  	System.out.println(" ");
		//  }

		solve(input); 
		//backtrack(input);

		//System.out.println(Arrays.toString(matrix));


		for(int row=0; row < input.length; row++) {
		 	for(int col = 0; col < input[0].length; col++) {
		 		System.out.print(Arrays.toString(matrix[row][col].toArray())+ " ");

		 	}
		 	System.out.println(" ");
		 	System.out.println(" ");
		 	System.out.println(" ");
		 }

		//matrix = new int[9][9];



		// int[][] matrix = {
		// {0, 0, 0, 0, 0, 0, 0, 0, 0},
		// {0, 0, 0, 0, 0, 0, 0, 0, 0},
		// {0, 0, 0, 0, 0, 0, 0, 0, 0},
		// {0, 0, 0, 0, 0, 0, 0, 0, 0},
		// {0, 0, 0, 0, 0, 0, 0, 0, 0},
		// {0, 0, 0, 0, 0, 0, 0, 0, 0},
		// {0, 0, 0, 0, 0, 0, 0, 0, 0},
		// {0, 0, 0, 0, 0, 0, 0, 0, 0},
		// {0, 0, 0, 0, 0, 0, 0, 0, 0} };


		//List<List<Integer>> test = new ArrayList<List<Integer>>();

		//ArrayList<String>[] group = new ArrayList[4];

	}


	public static void backtrack(int[][] input) {

	}

	//if a number is the only one that appears in the array list
	//for the row, col, or square, then it is the one

	//first enter into the array list 
	//if the number is equal, then return back to the list thats being checked
	//continue on in that list

	public static void eliminate(ArrayList<Integer>[][] input) {

	}


	public static void solve(int[][] input) {

		//gotta construct arraylist to do solution

		//List<List<Integer>> matrix = new ArrayList<List<Integer>>();

		//int[][] input1 = new int[9][9];
		//input = copy; 


//constructs array list of array lists
		//ArrayList<Integer>[][] matrix = new ArrayList[9][9];




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