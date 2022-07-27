package En;

class Elevator {
	
	int floor;
	int minFloor = 0;
	int maxFloor;
	
	Elevator(int floor) {
		setFloor(floor);
		setMaxFloor(5);
	}
	
	Elevator(int floor, int maxFloor) {
		setFloor(floor);
		setMaxFloor(maxFloor);
	}
	
	
	void setFloor(int floor) {
		this.floor = floor;
	}
	
	void setMaxFloor(int nb) {
		this.maxFloor = nb;
	}
	
	
	int getFloor() {
		return floor;
	}
	
	int getMinFloor() {
		System.out.println(minFloor);
		return minFloor;
	}
	
	int goUp(int nb) {
		if(nb > maxFloor || nb < getFloor()) {
			System.out.println("the floor that you want to reach isn't accessible.");
		}
		
		if(nb < getFloor()) {
			System.out.println("the floor that you want to reach isn't accessible by this button, try the down button");
		}
		else {
			setFloor(nb);
			return floor;
		}
		return floor;
	}
	
	int goDown(int nb) {
		if(nb < minFloor || nb > getFloor()) {
			System.out.println("the floor that you want to reach isn't accessible.");
		}
		if(nb > getFloor()) {
			System.out.println("the floor that you want to reach isn't accessible by this button, try the up button");
		}

		setFloor(nb);
		return floor;

	}
}
