package github.flaschenpost.DynamicDijkstra;

/** 
 * Edge of Dijkstra-Algorithm, Connection of two points with lenght and 
 * @param Class T1 of application data for knot 
 * @param Class T2 Description-type for Edges
 * 
 */
public class DDEdge<T1, T2> {
	private DDKnot<T1, T2> start;
	private DDKnot<T1, T2> end;
	private Double length;
	private T2 description;
	
	public DDKnot<T1, T2> getStart() {
		return start;
	}
	public void setStart(DDKnot<T1, T2> start) {
		this.start = start;
	}
	public DDKnot<T1, T2> getEnd() {
		return end;
	}
	public void setEnd(DDKnot<T1, T2> end) {
		this.end = end;
	}
	public Double getLength() {
		return length;
	}
	public void setLength(Double length) {
		this.length = length;
	}
	public T2 getDescription() {
		return description;
	}
	public void setDescription(T2 description) {
		this.description = description;
	}
	

}
