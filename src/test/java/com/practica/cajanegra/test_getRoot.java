package com.practica.cajanegra;

import org.junit.Assert;
import org.junit.Test;

import com.binarytree.BinaryTree;

/*
Parece que este método no tiene errores
 */
public class test_getRoot {
    private BinaryTree<String> prueba;

    @Test
    public void testConstructorCP1() {
        prueba = new BinaryTree<>("6");
        Assert.assertEquals(prueba.getRoot().getContent(), "6");
    }

    @Test
    public void testConstructorCP2() {
        prueba = new BinaryTree<>("6");
        prueba.insert("7", prueba.getRoot(), true);
        prueba.insert("8", prueba.getRoot(), false);
        System.out.println(prueba);
        Assert.assertEquals(prueba.getRoot().getContent(), "6");
    }

    @Test(expected=Exception.class)
    public void testConstructorCP3() {
        prueba = new BinaryTree<>(null);
        Assert.assertEquals(prueba.getRoot().getContent(), "");
    }

}
