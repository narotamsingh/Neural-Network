public class Softmax {
	public static void main(String[] args) {

		int[] data={5,6,7,8,9};
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
}
