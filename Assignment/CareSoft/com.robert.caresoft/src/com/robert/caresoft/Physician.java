package com.robert.caresoft;

import java.sql.Date;
import java.util.ArrayList;

public class Physician extends User implements HIPAACompliantUser{
//... imports class definition...
    
    // Inside class:    
    private ArrayList<String> patientNotes;
	
    // DONE: Constructor that takes an ID
    public Physician() {}
    
    public Physician(Integer ID) {
    	super(ID);
    }
    // DONE: Implement HIPAACompliantUser!
	
    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }

    // TODO Auto-generated method stub
	public boolean assignPin(int pin) {
		int length = String.valueOf(pin).length();
		if(length == 4) {
			return true;
		}else {
			return false;
		}
	}
	

	// DONE: Setters & Getters
	public ArrayList<String> getPatientNotes() {
		return patientNotes;
	}

	public void setPatientNotes(ArrayList<String> patientNotes) {
		this.patientNotes = patientNotes;
	}

	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		if (confirmedAuthID == this.id) {
				return true;
			}else {
				return false;
	}
	}
	
}
