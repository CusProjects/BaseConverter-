
public class ChangeBase  {
	
	public static int toBase3(int decimal) throws NumberFormatException{
		int res = 0;
		String result= "";
		do{
			res = decimal % 3;
			decimal = decimal / 3;
			result = String.valueOf(res) + result;
			
		}while(decimal > 0);
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
	
	public static int toDecimal3(long n3) throws NumberFormatException{
		char[] array = String.valueOf(n3).toCharArray();
		double decimal = 0;
		int pow = array.length - 1;
		for(char n : array){
			decimal += Integer.parseInt(String.valueOf(n)) * Math.pow(3, pow);
			pow --;
		}
		return (int)decimal;
	}
	
	public static int to2From3(long bin) {
		return ChangeBase.toBase3(ChangeBase.toDecimal2(bin));
	}
	
	public static int to3From2(long ter){
		return ChangeBase.toBase2(ChangeBase.toDecimal3(ter));
	}
	
	
	public static void main(String[] args){
		//System.out.println(ChangeBase.toBase3(Integer.parseInt(args[0])));
		//System.out.println(ChangeBase.toBase2(Integer.parseInt(args[0])));
		//System.out.println(ChangeBase.toDecimal2(Long.parseLong (args[0])));
		//System.out.println(toDecimal3(Long.parseLong(args[0])));
		System.out.println(ChangeBase.to3From2(Long.parseLong(args[0]))); 
		//System.out.println(ChangeBase.to2From3(Long.parseLong(args[0])));
	}
}