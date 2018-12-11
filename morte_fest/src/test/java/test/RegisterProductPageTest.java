package test;

import static org.junit.Assert.*;

import org.fest.swing.fixture.FrameFixture;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import lux.RegisterProductPage;

public class RegisterProductPageTest {

	private FrameFixture frame;
	private RegisterProductPage regprod;
	
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

	@Test
	public void test() {
		regprod = new RegisterProductPage();
		frame = new FrameFixture(regprod.ReturnFrame());	
		CorrectProduct(frame);
	}
	
	public void CorrectProduct(FrameFixture frame2) {
		frame2.textBox("textFieldCodigo").setText("codigo");
		frame2.textBox("textFieldDescricao").setText("descricao");
		frame2.textBox("textFieldValor").setText("10");
		frame2.button("btnSalvar").click();
		frame2.label("labelok").requireText("Ok!");

	}
}
