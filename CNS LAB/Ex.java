public class Ex{
	public static void main(String[] args){
		String input = "Mcet";
		int[] res = new int[input.length()];
		char[] output = new char[input.length()];
		for(int i = 0 ; i< input.length() ; i++){
			output[i] = (char)(input.charAt(i)+5);
			res[i] = (input.charAt(i)^0);
		}	
		System.out.println(output.toString()); 	
		System.out.println(res.toString());
		for(int i = 0 ; i< input.length() ; i++){
			
			System.out.print((char)res[i]);
		}	
		for(int i = 0 ; i< input.length() ; i++){
			
			System.out.print((char)(output[i]-5));
		}	
	}
}