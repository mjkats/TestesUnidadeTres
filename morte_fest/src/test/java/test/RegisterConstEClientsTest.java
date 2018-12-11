package test;

import org.fest.swing.fixture.FrameFixture;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import lux.RegisterConstEClients;

public class RegisterConstEClientsTest {
	
	private RegisterConstEClients rcc;
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

	@Test
	public void allTests() throws InterruptedException {
		rcc = new RegisterConstEClients();
		frame = new FrameFixture(rcc.returnFrame());
		
		register(frame);
		cancel(frame);
		missingInfo(frame);
	}
	
	public void cancel(FrameFixture frame) throws InterruptedException {
		frame.button("btnCancelar").click();
		frame.textBox("textFieldEmpresa").requireText("");
		frame.textBox("textFieldObra").requireText("");
		frame.textBox("textFieldLocal").requireText("");
		frame.textBox("textFieldPrioridade").requireText("");
		frame.textBox("textFieldResponsavel").requireText("");
		frame.textBox("txtFieldAnotacoes").requireText("");
	}
	
	public void register(FrameFixture frame) throws InterruptedException {
		frame.textBox("textFieldEmpresa").setText("Nasa");
		frame.textBox("textFieldObra").setText("obra");
		frame.textBox("textFieldLocal").setText("Natal");
		frame.textBox("textFieldPrioridade").setText("alta");
		frame.textBox("textFieldResponsavel").setText("Marcos Pontes");
		frame.textBox("txtFieldAnotacoes").setText("Metade de 2020");
		frame.button("btnSalvar").click();
		frame.label("lblOk").requireText("Ok!");
	}
	
	public void missingInfo(FrameFixture frame) throws InterruptedException {
		frame.textBox("textFieldEmpresa").setText("");
		frame.textBox("textFieldObra").setText("obra");
		frame.textBox("textFieldLocal").setText("Natal");
		frame.textBox("textFieldPrioridade").setText("alta");
		frame.textBox("textFieldResponsavel").setText("Marcos Pontes");
		frame.textBox("txtFieldAnotacoes").setText("Metade de 2020");
		frame.button("btnSalvar").click();
		frame.label("lblCampoVazio").requireText("Campo vazio!");
	}
}
