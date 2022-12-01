package com.practica.cajanegra;

import com.binarytree.BinaryTree;
import org.junit.Assert;
import org.junit.Test;

public class test_size {
    private BinaryTree<String> prueba;

    @Test
    public void testConstructorCP1() {
        prueba = new BinaryTree<>("6");
        Assert.assertEquals(prueba.size(), 1);
    }

    @Test
    public void testConstructorCP2() {
        prueba = new BinaryTree<>("6");
        prueba.insert("7", prueba.getRoot(), true);
        prueba.insert("8", prueba.getRoot(), false);
        Assert.assertEquals(prueba.size(), 3);
    }

    @Test(expected=Exception.class)
    public void testConstructorCP3() {
        prueba = new BinaryTree<>(null);
        Assert.assertEquals(prueba.size(), 0);
    }
}
