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
		assertEquals(0, microBlog.numeroPostsUsuario());
		
		microBlog.usuarioPostarLink("http://www.google.com.br");
		assertEquals(1, microBlog.numeroPostsUsuario());

		microBlog.usuarioPostarLink("https://www.bradesco.com.br");
		assertEquals(2, microBlog.numeroPostsUsuario());
	}

}
