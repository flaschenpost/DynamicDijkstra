package github.flaschenpost.DynamicDijkstra;

/** Knot of Dijkstra algorithm, some point of interest
 * @param Class T1 of application data for knot 
 * @param Class T2 Description-type for Edges
 */

public class DDKnot<T1, T2> {
	private T1 knot;
	private long id;
	private double distance;
	private boolean isStart;
	private boolean isEnd;
	private DDEdge<T1, T2> currentArrival;
	
	public T1 getKnot() {
		return knot;
	}
	public void setKnot(T1 knot) {
		this.knot = knot;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public boolean isStart() {
		return isStart;
	}
	public void setStart(boolean isStart) {
		this.isStart = isStart;
	}
	public boolean isEnd() {
		return isEnd;
	}
	public void setEnd(boolean isEnd) {
		this.isEnd = isEnd;
	}
	
	public DDEdge<T1, T2> getArrival(){
		return currentArrival;
	}
}
