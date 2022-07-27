package En;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class elevatorTest {
	
	@Test
	void constructeurTest(){
		Elevator Elevator1 = new Elevator(2);
		Elevator Elevator2 = new Elevator(0);
		Elevator Elevator3 = new Elevator(5);
		assertEquals(2,Elevator1.getFloor(),"we are at the second floor");
		assertEquals(0,Elevator2.getFloor(),"we are at the ground floor");
		assertEquals(5,Elevator3.getFloor(),"we are at the fifth floor");
		
		Elevator1.goUp(4);
		assertEquals(4,Elevator1.getFloor(),"we are at the fourth floor");
		Elevator2.goUp(6);
		assertNotEquals(4,Elevator2.getFloor(),"we are at the 6 floor but the building is limited at 5 floors");
		
		Elevator1.goDown(0);
		assertEquals(0,Elevator1.getFloor(),"we are at the ground floor");
	}
	
	@Test
	void constructeur2Test() {
		Elevator elev = new Elevator(2,10);
		Elevator elev1 = new Elevator(2,10);
		assertEquals(2,elev.getFloor(),"we are at the second floor");
		
		elev.goUp(9);
		assertEquals(9,elev.getFloor(),"we are at the second floor");
		
		elev1.goDown(0);
		assertEquals(0,elev1.getFloor(),"we are at the underground floor");
		
		elev1.goUp(10);
		assertEquals(10,elev1.getFloor(),"we are at the tenth floor");
		elev1.goUp(5);
		assertNotEquals(5,elev1.getFloor(),"we can't press the up button to go down");
		
		elev1.goDown(0);
		assertEquals(0,elev1.getFloor(),"we are at the underground floor");
		elev1.goDown(5);
		assertNotEquals(0, elev1.getFloor(),"we can't press the down button to go up");
	}
}