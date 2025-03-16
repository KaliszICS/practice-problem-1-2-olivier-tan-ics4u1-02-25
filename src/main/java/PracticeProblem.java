public class PracticeProblem {

	public static boolean validIndex (int[] arr, int index){

	//q1	
	try	{
		arr[index] = arr[index];
		return true;
	}	
		catch (ArrayIndexOutOfBoundsException e) {
			return false;
		}
	}
	//q2
	public static int divide(int x, int y){

		try{
			return x/y;
		}
		catch (ArithmeticException e){
			return 0;
		}
	} 
	//q3
	public static int safeConvertStringtoInt(String word){

		try{
			return Integer.parseInt(word);
		}
		catch (NumberFormatException e){
			return 0;
		}
	}

}