package github.flaschenpost.DynamicDijkstra;

import java.util.ArrayList;
import java.util.Collections;

/** 
 * Optimization Core Dijkstra 
 * @param Class T1 of application data for knot 
 * @param Class T2 Description-type for Edges
 * 
 */
public class DDOptimizer<T1, T2> {
	private DDKnotSet<T1, T2> active;
	private DDKnotSet<T1, T2> finished;
	private DDKnot<T1, T2> end;
	private ArrayList<DDEdgeProducer<T1,T2>> steps;
	
	public DDOptimizer(ArrayList<DDEdgeProducer<T1, T2>> steps, DDKnot<T1, T2> start){
		active = new DDKnotSet<T1, T2>();
		finished = new DDKnotSet<T1, T2>();
		active.modifyAdd(start);
		this.steps = steps;
		end = null;
	}
	
	public ArrayList<DDEdge<T1, T2>> optimize(){
		DDKnot<T1, T2> currentKnot;
		while(active.size() > 0){
			currentKnot = active.pollFirst();
			if(currentKnot.isEnd()){
				end = currentKnot;
				break;
			}
			finished.modifyAdd(currentKnot);
			for(DDEdgeProducer<T1,T2> p : steps){
				DDEdge<T1,T2> edge = p.getEdge(currentKnot);
				if(edge != null){
					active.modifyAdd(edge.getEnd());
				}
			}
		}
		ArrayList<DDEdge<T1, T2>> result = new ArrayList<DDEdge<T1,T2>>();
		currentKnot = end;
		DDEdge<T1, T2> currentEdge = currentKnot.getArrival();
		do{
			result.add(currentEdge);
			currentKnot = currentEdge.getStart();
		}
		while(! currentKnot.isStart());
		Collections.reverse(result);
		return result;
	}
}
