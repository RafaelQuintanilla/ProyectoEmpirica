package finalEmpirica;

public class BusquedaPrimeroMejor<T> {

	private T value;
	private double cost;
	
	
	public BusquedaPrimeroMejor(T value , double cost) {
		super();
		this.cost = cost;
		this.value = value;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
}
