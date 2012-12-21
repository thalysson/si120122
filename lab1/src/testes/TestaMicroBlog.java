package testes;

import static org.junit.Assert.*;
import mainClasses.MicroBlog;
import org.junit.Before;
import org.junit.Test;

public class TestaMicroBlog {
	
	private MicroBlog microBlog;
	
	@Before
	public void iniciaTeste(){
		this.microBlog = new MicroBlog();
		
	}

	@Test
	public void testCriaUsuario() {
		assertEquals(0,microBlog.getNumeroUsuarios());
		
		microBlog.criaNovoUsuario("login","senha");
		assertEquals(1,microBlog.getNumeroUsuarios());
	}
	
	@Test
	public void testUsuarioPostarLink() {		
		microBlog.criaNovoUsuario("login","senha");

	}

}
