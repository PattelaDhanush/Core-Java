package team_email_id_details.com.utility;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class EmployeeBO {

	private Map<String, List<String>> teamEmailMap=new LinkedHashMap<>();	
	public EmployeeBO() {
		super();
	}
	public Map<String, List<String>> getTeamEmailMap() {
		return teamEmailMap;
	}
	public void setTeamEmailMap(Map<String, List<String>> teamEmailMap) {
		this.teamEmailMap = teamEmailMap;
	}
	
	public void addEmployeeDetails(String teamName, String officialMail){
		List<String> l=new ArrayList<>();
		teamName=teamName.toLowerCase();
		if(teamEmailMap.containsKey(teamName))
			l=teamEmailMap.get(teamName);
			l.add(officialMail);
			teamEmailMap.put(teamName,l);
	}
	public int countOfOfficialMailIds(String teamName){
		teamName=teamName.toLowerCase();
		
		if(teamEmailMap.containsKey(teamName))
		{
			return (teamEmailMap.get(teamName)).size();
		}
		else
			return -1;
	}
}
