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
		frame.textBox("textEmpresa").setText("Nasa");
		frame.textBox("textObra").setText("obra");
		frame.textBox("textLocal").setText("Natal");
		frame.textBox("textPrioridade").setText("alta");
		frame.textBox("textResponsavel").setText("Marcos Pontes");
		frame.textBox("textAnotacoes").setText("Metade de 2020");
		frame.button("btnCancelar").click();
	}
	
	public void register(FrameFixture frame) throws InterruptedException {
		frame.textBox("textEmpresa").setText("Nasa");
		frame.textBox("textObra").setText("obra");
		frame.textBox("textLocal").setText("Natal");
		frame.textBox("textPrioridade").setText("alta");
		frame.textBox("textResponsavel").setText("Marcos Pontes");
		frame.textBox("textAnotacoes").setText("Metade de 2020");
		frame.button("btnSalvar").click();
	}
	
	public void missingInfo(FrameFixture frame) throws InterruptedException {
		frame.textBox("textEmpresa").setText("");
		frame.textBox("textObra").setText("obra");
		frame.textBox("textLocal").setText("Natal");
		frame.textBox("textPrioridade").setText("alta");
		frame.textBox("textResponsavel").setText("Marcos Pontes");
		frame.textBox("textAnotacoes").setText("Metade de 2020");
		frame.button("btnSalvar").click();
	}
}
