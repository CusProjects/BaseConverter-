
public class ChangeBase  {
	
	public static int toBase3(int decimal) throws NumberFormatException{
		int res = 0;
		String result= "";
		do{
			res = decimal % 3;
			decimal = decimal / 3;
			
			result = String.valueOf(res) + result;
			
		}while(3 <= decimal);
		result = String.valueOf(res) + result;
		return Integer.parseInt(result);
	}
	
	public static int toBase2(int decimal) throws NumberFormatException{
		int res = 0;
		String result= "";
		
		do{
			res = decimal % 2;
			decimal = decimal / 2;	
			result = String.valueOf(res) + result;
		}while(decimal > 0);
		
		return Integer.parseInt(result);	
	}
	
	public static int toDecimal2(long n2) throws NumberFormatException{
		char[] binaryArray = String.valueOf(n2).toCharArray();
		double binaryCount = Math.pow(2, Double.parseDouble(String.valueOf(binaryArray.length))) / 2;
		
		
		int decimal = 0;
		for(char binary : binaryArray){
			decimal += Integer.parseInt(String.valueOf(binary)) * binaryCount;
			binaryCount = binaryCount / 2;
		}
		return decimal;
	}
	
	public static int toDecimal3(int n3) throws NumberFormatException{
		return 1;
	}
	
	
	
	public static void main(String[] args){
		//System.out.println(ChangeBase.toBase2(Integer.parseInt(args[0])));
		System.out.println(ChangeBase.toDecimal2(Long.parseLong (args[0])));
	}
}