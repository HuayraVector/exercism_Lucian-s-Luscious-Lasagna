package namespace;
import java.util.Scanner; 

public class main {
	public static int EXPECTED_MINUTES_IN_OVEN = 40;
	public static void main(String[] argv) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many layers want to cook?");
		int layerNum = sc.nextInt();
		System.out.println("Cooked time?");
		int RemainMin =sc.nextInt();
		System.out.println(totalTimeInMinutes(layerNum,RemainMin));
		
	}
	public static int remainingMinutesInOven(int cooked_Min) {
		return(EXPECTED_MINUTES_IN_OVEN - cooked_Min);
	}
	public static int preparationTimeInMinutes(int layer) {
		return(layer*2);
	}
	public static int totalTimeInMinutes(int numberOfLayers,int actualMinutesInOven) {
		return(preparationTimeInMinutes(numberOfLayers) + remainingMinutesInOven(actualMinutesInOven));
	}
   
}
