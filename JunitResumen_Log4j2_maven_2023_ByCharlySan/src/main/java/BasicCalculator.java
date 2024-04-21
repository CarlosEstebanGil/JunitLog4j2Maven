
public class BasicCalculator {

	private double dMemory=0.0;
	
	public BasicCalculator() {
	
	}

	public double sum(double a, double b) throws Exception{
		try {
			return a + b;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	} 
	
	public double sum(double valueToMemoryAcum) throws Exception{
		try {
			this.dMemory = dMemory + this.dMemory;
			return this.dMemory;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	
	public void clearMemory() {
		this.dMemory=0.0;
	}
	
}
