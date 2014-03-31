package Strings;
public class StringPermutation {

	public static void main(String args[]){
		String originalString = "ABC";
		String prefixString = "";
		findPermutation(prefixString,originalString);
	}

	private static void findPermutation(String prefixString,String remainingString) {
		// TODO Auto-generated method stub

		int strLength = remainingString.length();
		if(strLength==0){
			System.out.println(prefixString);
		}else{
			for(int i=0;i<strLength;i++){
				findPermutation(prefixString+remainingString.charAt(i), remainingString.substring(0, i)+remainingString.substring(i+1, strLength));
			}			
		}		
	}  
}