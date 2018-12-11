package test;

import org.fest.swing.fixture.FrameFixture;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import lux.PrincipalPage;

public class PrincipalPageTest {
	
	private PrincipalPage pg;
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

	@Test
	public void allTests() throws InterruptedException, ClassNotFoundException {
		pg = new PrincipalPage();
		frame = new FrameFixture(pg.ReturnFrame());
		
		adicionaOrcamento(frame);
		missingInfo(frame);
		cancelaOrcamento(frame);
	}

	public void adicionaOrcamento(FrameFixture frame) throws InterruptedException {
		frame.textBox("textNome").setText("Michel Jean");
		frame.textBox("textObra").setText("Instituo Metropole Digital");
		frame.textBox("textPagamento").setText("CD50");
		frame.textBox("textFrete").setText("CIF");
		frame.textBox("textObs").setText("Para ser feito no segundo turno de 2019");
		frame.textBox("textCodigo").setText("FSB-02");
		frame.button("btnSalvar").click();
	}
	
	public void cancelaOrcamento(FrameFixture frame) throws InterruptedException {

		frame.button("btnCancelar").click();
		frame.textBox("textNome").requireText("");
		frame.textBox("textObra").requireText("");
		frame.textBox("textPagamento").requireText("");
		frame.textBox("textFrete").requireText("");
		frame.textBox("textObs").requireText("");
		frame.textBox("textCodigo").requireText("");
	}
	
	public void missingInfo(FrameFixture frame) throws InterruptedException {
		frame.textBox("textPagamento").setText("");
		frame.textBox("textCodigo").setText("FSB-02");
		frame.button("btnSalvar").click();
	}
}
