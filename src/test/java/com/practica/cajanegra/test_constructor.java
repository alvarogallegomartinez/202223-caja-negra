package com.practica.cajanegra;

import org.junit.Assert;
import org.junit.Test;

import com.binarytree.BinaryTree;

public class test_constructor {
	BinaryTree<String> prueba;
	
	@Test
	public void testConstructorCP1() {
		prueba = new BinaryTree<String>("100");
		Assert.assertEquals(prueba.getRoot().getContent(), "100");
		
    }
	
}
