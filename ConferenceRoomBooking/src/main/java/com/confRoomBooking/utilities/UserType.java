package com.confRoomBooking.utilities;

public enum UserType {
	SUPERADMIN(0),ADMIN(1);
	
	private int type;

	private UserType(int type) {
		this.type = type;
	}

	public int getType() {
		return type;
	}

	
	
	
}	
