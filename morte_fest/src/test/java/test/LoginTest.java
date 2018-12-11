package test;

import org.fest.swing.fixture.FrameFixture;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import lux.LoginPage;

public class LoginTest {
	
	private LoginPage lp;
	private FrameFixture frame;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		frame.cleanUp();
	}
	
	// Concentração de todos os testes para provar seu funcionamento
	@Test
	public void allTests() throws InterruptedException {
		lp = new LoginPage();
		frame = new FrameFixture(lp.ReturnFrame());
		
		grantAccess(frame);
		loginIncorrect(frame);
		passwordIncorrect(frame);
		incorrectInfo(frame);
	}
	
	// Deste para baixo, todos os testes apresentam inconsistencia
	/*@Test
	public void grantAccessTest() throws InterruptedException {
		lp = new LoginPage();
		frame = new FrameFixture(lp.ReturnFrame());
		
		grantAccess(frame);
	}
	
	@Test
	public void loginDisapprovedTest() throws InterruptedException {
		lp = new LoginPage();
		frame = new FrameFixture(lp.ReturnFrame());
		
		loginIncorrect(frame);
	}
	
	@Test
	public void passwordDisapprovedTest() throws InterruptedException {
		lp = new LoginPage();
		frame = new FrameFixture(lp.ReturnFrame());
		
		passwordIncorrect(frame);
	}
	
	@Test
	public void incorrectInfoTest() throws InterruptedException {
		lp = new LoginPage();
		frame = new FrameFixture(lp.ReturnFrame());
		
		incorrectInfo(frame);
	}*/
	
	
	public void loginIncorrect(FrameFixture frame) throws InterruptedException {
		frame.textBox("textField").setText("login2");
		frame.textBox("passwordField").setText("login");
		frame.button("btnLogin").click();
		frame.label("lblLoginIncorreto").requireText("Login incorreto!");
	}
	
	public void grantAccess(FrameFixture frame) throws InterruptedException {
		frame.textBox("textField").setText("login");
		frame.textBox("passwordField").setText("login");
		frame.button("btnLogin").click();
		frame.label("lblLoginIncorreto").requireText("Approved");
	}
	
	public void passwordIncorrect(FrameFixture frame) throws InterruptedException {
		frame.textBox("textField").setText("login");
		frame.textBox("passwordField").setText("login2");
		frame.button("btnLogin").click();
		frame.label("lblLoginIncorreto").requireText("Senha incorreta!");
	}
	
	public void incorrectInfo(FrameFixture frame) throws InterruptedException {
		frame.textBox("textField").setText("login1");
		frame.textBox("passwordField").setText("login2");
		frame.button("btnLogin").click();
		frame.label("lblLoginIncorreto").requireText("Login incorreto!");
	}
}
