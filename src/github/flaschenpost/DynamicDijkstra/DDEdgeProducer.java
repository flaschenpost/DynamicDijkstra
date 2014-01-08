package github.flaschenpost.DynamicDijkstra;

/** 
 * Edge producer for Dynamic Dijkstra 
 * @param Class T1 of application data for knot 
 * @param Class T2 Description-type for Edges
 * 
 */
public interface DDEdgeProducer<T1, T2> {
	public DDEdge<T1, T2> getEdge(DDKnot<T1,T2> current);
}
