
public class DataTypeOperators {

	public static void main(String[] args) {
		numberSquareCube();
	}
	
	
	static void numberSquareCube(){
		int number = 0; 
		int squared = 0;;
		int cubed = 0; 
		
		System.out.println("Number\tSquared\tCubed");
	
		for (number =0; number <= 10;number++) {
			squared = number * number;
			cubed = number * squared;
			System.out.println(number+"\t"+squared+"\t"+cubed);
		}
	}
}

//
//1. Using only the programming techniques you learned in this lesson, write an application that calculates the squares and cubes of between two numbers and prints the resulting values in table format, as shown below. 
//number square cube  [ dont use any java built in method]
//enter two enters : 0  10
//
//0               0             0 
//1               1             1 
//2               4             8 
//.
//.
//.
//10            100         1000
