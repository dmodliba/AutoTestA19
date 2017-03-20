package modliba;

import org.junit.*;

import static org.junit.Assert.*;

import java.awt.Color;

/**
 * git@github.com:dmodliba/AutoTestA19.git
 * @author Daniel Modliba
 * @version 20-03-2017
 */
public class AutoTest {

	private Auto a;

	@Before
	public void start(){
		a = new Auto();
	}
	
	@Test
	public void testCreateCar() {
		assertEquals("Ford, rot, 160PS", a.toString());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testCreateCarIllegal() {
		a = new Auto("", null, 0);
	}

	@Test
	public void testColorBlack() {
		a.setFarbe(Color.BLACK);
		assertEquals("Ford, schwarz, 160PS", a.toString());
	}

	@Test
	public void testColorRed() {
		a.setFarbe(Color.RED);
		assertEquals("Ford, rot, 160PS", a.toString());
	}

	@Test
	public void testColorWhite() {
		a.setFarbe(Color.WHITE);
		assertEquals("Ford, weiﬂ, 160PS", a.toString());
	}

	@Test
	public void testColorBlue() {
		a.setFarbe(Color.BLUE);
		assertEquals("Ford, blau, 160PS", a.toString());
	}

	@Test
	public void testTypeAccepted() {
		a.setFarbe(Color.RED);
		a.setType("BMW 3er");
		assertEquals("BMW 3er, rot, 160PS", a.toString());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testTypeIllegal() {
		a.setType("");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testColorIllegal() {
		a.setFarbe(null);
	}

	@Test
	public void testLeistung(){
		a.setLeistung(120);
		assertEquals("Ford, rot, 120PS", a.toString());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testLeistungIllegal() {
		a.setLeistung(0);
	}

	@After
	public void end() {
		System.out.println("Test done!");
	}

}
