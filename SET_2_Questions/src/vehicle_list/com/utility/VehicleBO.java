package vehicle_list.com.utility;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class VehicleBO {
	private Map<String, List<Integer>> map=new LinkedHashMap<>();
	public VehicleBO() {
		super();
	}
	public Map<String, List<Integer>> getMap() {
		return map;
	}
	public void setMap(Map<String, List<Integer>> map) {
		this.map = map;
	}
	
	public void addVehicledetails(String cat, int num) {
		List<Integer> l=new ArrayList<>();
		if(map.containsKey(cat.toLowerCase()))
			l=map.get(cat.toLowerCase());
		l.add(num);
		map.put(cat.toLowerCase(), l);
	}
	
	public int findLastvehicleId(String vehicleType) {
		
		if(map.containsKey(vehicleType.toLowerCase()))
				return ((map.get(vehicleType.toLowerCase())).get(map.size()));
		return -1;
	}
}
