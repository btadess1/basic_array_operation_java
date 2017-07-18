package basicArrayOperations;

public class BasicJava {
	/**
	 * This method simply prints numbers from 1 to 225 inclusive
	 */
	public void print1to1225(){
		for(int i = 1; i <= 225; i++)
			System.out.println(i);
	}
	
	/**
	 * This method prints odd numbers between 1 and 225 inclusive
	 */
	public void printOddNumberBetween1And225(){
		for(int i = 1; i <= 225; i++)
			if(i%2 != 0)
				System.out.println(i);
	}

	/**
	 * This method successively prints the sum of the numbers from 0 t0 225
	 */
	public void printSumFrom0To225(){
		int sum = 0;
		for(int i = 0; i <=225; i++){
			sum += i;
			System.out.println(sum);
		}
	}
	
	/**
	 * This method receives an Integer array and prints out all its values
	 * @param array
	 */
	public void iterateThroughArrayAndPrintValues(int[] array){
		for(int x:array)
			System.out.println(x);
		
	}
	
	/**
	 * This method finds and prints out the max value; 
	 * @param array an integer array
	 */
	public void printMax(int[]array){
		int max =array[0];
		for(int i =1; i < array.length; i++){
			if(array[i] > max)
				max = array[i];
		}
		
		System.out.println(max);
	}
	
	/**
	 * This method prints out the average value of an array of Integers
	 * @param array Integer array
	 */
	public void getAvg(int[]array){
		int sum =0;
		for(int i = 0; i <array.length; i++)
			sum += array[i];
		System.out.println(sum/array.length);
	}
	
	/**
	 * This method creates an array of odd integers
	 * @return an array 
	 */
	public int[] arrayOfOddNumbers(){
		int[]y = new int[225/2];
		for(int i =1, j = 0; i <=225; i =+ 2, j++)
			y[j] = y[i];
		return y;
	}
	
	/**
	 * This method receives an array of Integers and a number, and returns the number
	 * of values greater than y
	 * @param array an array
	 * @param y a number
	 */
	public void printNumberofValuesGreaterThanY(int[]array, int y){
		int count = 0;
		for(int value:array)
			if(value > y)
				count++;
		System.out.println(count);
		
	}
	
	/**
	 * This method squares each array value and returns the modified array
	 * @param array an array
	 * @return an array
	 */
	public int[] squareTheValues(int[]array){
		for(int i = 0; i < array.length; i++)
			array[i] = array[i]*array[i];
		return array;
		
	}
	
	/**
	 * This method simply replaces any value of the given array by zero if the 
	 * value is a negative number
	 * @param array an array
	 * @return an array
	 */
	public int[]eliminateNegativeNumber(int[]array){
		for(int i = 0; i < array.length; i++)
			if(array[i] < 0)
				array[i] = 0;
		return array;
	}
	
	public int[] maxMinAvg(int[]array){
		int[]arr = new int[3];
		int avg, sum = 0, max = array[0], min = array[0];
		for(int i = 1; i < array.length; i++){
			sum += array[i];
			if(array[i] > max){
				max = array[i];
			}
			
			if(array[i] < min){
				min = array[i];
			}
		}
		
		avg = sum/array.length;
		arr[0] = max;
		arr[1]= min;
		arr[3] = avg;
		
		return arr;
		
	}
	
	/**
	 * This method shifts the values of a given array by one to the front
	 * @param array an array
	 * @return an array
	 */
	public int[]shiftArrayValues(int[]array){
		for(int i = 0; i < array.length-1; i++)
			array[i] = array[i+1];
		array[array.length-1] = 0;
		
		return array;
		
	}
	public static void main(String[] args) {
		
		int[]arr = {1, 5, 9, 2, 3};
		BasicJava jav = new BasicJava();
		//jav.print1to1225();
		//jav.printOddNumberBetween1And225();
		//jav.printSumFrom0To225();
		//jav.printNumberofValuesGreaterThanY(arr, 2);
		//jav.iterateThroughArrayAndPrintValues(arr);
		//jav.getAvg(arr);
		int [] array = jav.shiftArrayValues(arr);
		for(int value: array)
			System.out.print(value +" ");

	}

}
