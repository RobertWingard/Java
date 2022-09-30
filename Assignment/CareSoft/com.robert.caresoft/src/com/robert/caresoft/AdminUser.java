package com.robert.caresoft;

import java.util.ArrayList;
import java.util.Date;

// DONE: Implement HIPAACompliantUser!
// DONE: Implement HIPAACompliantAdmin!
public class AdminUser extends User implements HIPAACompliantUser,HIPAACompliantAdmin {
//... imports class definition...
    
    // Inside class:
    private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents = new ArrayList<String>();
    
    // DONE: Implement a constructor that takes an ID and a role
    public AdminUser() {}
    
    public AdminUser(Integer ID ,String role) {
    	super(ID);
    	this.role = role;
    	
    
    }
    
    
    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
        
        // DONE: Setters & Getters
    }
	public Integer getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public ArrayList<String> getSecurityIncidents() {
		return securityIncidents;
	}
	public void setSecurityIncidents(ArrayList<String> securityIncidents) {
		this.securityIncidents = securityIncidents;
	}

	@Override
	public ArrayList<String> reportSecurityIncidents() {
		return securityIncidents;
		
	}

	@Override
	public boolean assignPin(int pin) {
		int length = String.valueOf(pin).length();
		if (length >= 6) {
			return true;
		}else {
			return false;
		
		}
	}

	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		if (confirmedAuthID == this.id) {
			return true;
		}else {
			authIncident();
			return false;
		
		}
	}




	}



