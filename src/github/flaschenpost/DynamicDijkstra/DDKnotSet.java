package github.flaschenpost.DynamicDijkstra;

import java.util.Comparator;
import java.util.TreeSet;

/** 
 * KnotSet of Dijkstra-Algorithm, Collection of Knots
 * @param Class T1 of application data for knot 
 * @param Class T2 Description-type for Edges
 * 
 */
public class DDKnotSet<T1, T2> {
	private TreeSet<DDKnot<T1, T2>> content;
	
	private class Cheaper implements Comparator<DDKnot<T1,T2>>{
		public int compare(DDKnot<T1,T2> d1, DDKnot<T1,T2> d2){
			if( d1.getDistance() < d2.getDistance()){
				return -1;
			}
			if( d1.getDistance() > d2.getDistance()){
				return 1;
			}
			if( d1.getId() < d2.getId()){
				return -1;
			}
			if( d1.getId() > d2.getId()){
				return 1;
			}
			return 0;
		}
	}
	
	public DDKnotSet(){
		Comparator<DDKnot<T1,T2>> comp = new Cheaper();
		content = new TreeSet<DDKnot<T1,T2>>(comp);
	}
	
	public int size(){
		return content.size();
	}
	
	public DDKnot<T1,T2> modifyAdd(DDKnot<T1,T2> k){
		// can't use content.contains because that would match only the same price
		DDKnot<T1,T2> ret = null;
		for(DDKnot<T1,T2> ik : content){
			if(ik.getId() == k.getId() && ik.getDistance() > k.getDistance()){
				content.remove(ik);
				ret = ik;
				break;
			}
		}
		content.add(k);
		return ret;
	}
	
	public DDKnot<T1,T2> pollFirst(){
		return content.pollFirst();
	}

}
