package com.practica.cajanegra;

import org.junit.Assert;
import org.junit.Test;

import com.binarytree.BinaryTree;

public class test_constructor {
	BinaryTree<String> prueba;
	
	@Test
	public void testConstructorCP1() {
		prueba = new BinaryTree<>("100");
		Assert.assertEquals(prueba.getRoot().getContent(), "100");
    }

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
	
}
