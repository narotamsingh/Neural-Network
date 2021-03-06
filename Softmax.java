public class Softmax {
	public static void main(String[] args) {

		int[] data=randomInt(100);
		double[] list = softmax(data);
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
	
	public static void timeIt(int data[]) { 
		//adopted from https://stackoverflow.com/questions/180158/how-do-i-time-a-methods-execution-in-java
		long startTime = System.nanoTime();
		double[] list = softmax(data);
		long endTime = System.nanoTime();
		long duration = (endTime - startTime);
		System.out.println("Duration:"+duration+" Nanoseconds");
     	} 
}
