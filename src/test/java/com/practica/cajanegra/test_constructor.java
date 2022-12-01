package com.practica.cajanegra;

import org.junit.Assert;
import org.junit.Test;

import com.binarytree.BinaryTree;

public class test_constructor {
	private BinaryTree<String> prueba;
	
	@Test
	public void testConstructorCP1() {
		prueba = new BinaryTree<>("100");
		Assert.assertEquals(prueba.getRoot().getContent(), "100");
    }

    // Este test no pasa, es que hay algo mal por dentro
	@Test
	public void testConstructorCP2() {
		prueba = new BinaryTree<>("Prueba");
		Assert.assertEquals(prueba.getRoot().getContent(), "Prueba");
	}

	@Test
	public void testConstructorCP3() {
		prueba = new BinaryTree<>("Prueba100");
		Assert.assertEquals(prueba.getRoot().getContent(), "Prueba100");
	}

	@Test(expected=Exception.class)
	public void testConstructorCP4() {
		prueba = new BinaryTree<>("");
		Assert.assertEquals(prueba.getRoot().getContent(), "");
	}

	// Este también está mal porque no lanza una excepción, hay algún error
	@Test(expected=Exception.class)
	public void testConstructorCP5() {
		prueba = new BinaryTree<>("Prueba!!!!");
		Assert.assertEquals(prueba.getRoot().getContent(), "Prueba!!!!");
	}

	@Test(expected=Exception.class)
	public void testConstructorCP6() {
		prueba = new BinaryTree<>(null);
		Assert.assertNull(prueba.getRoot().getContent());
	}
}
