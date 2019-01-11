public class Softmax {
	public static void main(String[] args) {

		int[] data=randomInt(100);
		// Timeit with: long startTime = System.nanoTime();
		double[] list = softmax(data);
		// Timeit with: long endTime = System.nanoTime();
		// Timeit with: long duration = (endTime - startTime);
		// Timeit with: System.out.println("Duration:"+duration+" Nanoseconds");
		// Timeit: adopted from https://stackoverflow.com/questions/180158/how-do-i-time-a-methods-execution-in-java
		for(int i=0; i<data.length;i++)
                        System.out.print(list[i] + " ");
		System.out.println(" ");
	}

	public static double[] softmax(int data[]) { 
		//takes as input a array of numbers, and returns
		//the array of values given by the softmax function.
		double sum = 0;
		double[] result = new double[data.length];
        	for(int i=0; i<data.length;i++)
                        sum += Math.exp(data[i]);

        	for(int i=0; i<data.length;i++)
                        result[i] = Math.exp(data[i])/sum;
		return result;
     	} 
	
	public static int[] randomInt(int n) { 
                //takes number of elements as input and returns array of random int
		int[] result = new int[n];
        	for(int i=0; i<n; i++)
                        result[i] = ThreadLocalRandom.current().nextInt(1, 9);
		return result;
     	} 
}
