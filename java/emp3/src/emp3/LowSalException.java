package emp3;
import java.util.Arrays;
public class LowSalException extends Exception{

	@Override
	public String toString() {
		return "There is low balance than 500 Rupees";
	}

}
