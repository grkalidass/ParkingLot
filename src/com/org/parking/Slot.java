package com.org.parking;

public abstract class Slot {

	private int slotNumber;
	private boolean isOccupied;
	
	Slot(int slotNumber){
		this.isOccupied = false;
		this.slotNumber = slotNumber;
	}
	public int getSlotNumber() {
		return slotNumber;
	}
	public void setSlotNumber(int slotNumber) {
		this.slotNumber = slotNumber;
	}
	public boolean isOccupied() {
		return isOccupied;
	}
	public void setOccupied(boolean isOccupied) {
		this.isOccupied = isOccupied;
	}
	
	void park(){
		isOccupied=true;
	}
	
	void unPark(){
		isOccupied=false;
	}
	
	@Override
	public boolean equals(Object o){
		return (((Slot)o).slotNumber == this.slotNumber);
	}
	
	@Override
	public int hashCode(){
		int hash = 5;
		hash = 43 * hash + this.slotNumber;
		return hash;
	}
}
