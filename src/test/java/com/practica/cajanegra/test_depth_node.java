package com.practica.cajanegra;

import com.binarytree.BinaryTree;
import com.binarytree.Node;
import org.junit.Assert;
import org.junit.Test;

public class test_depth_node {
    private BinaryTree<String> prueba;
    private Node<String> pruebaNode;

    @Test
    public void testConstructorCP1() {
        prueba = new BinaryTree<>("6");
        pruebaNode = new Node<>("6");
        Assert.assertEquals(prueba.depth(pruebaNode), 0);
    }

    @Test(expected=Exception.class)
    public void testConstructorCP2() {
        prueba = new BinaryTree<>("6");
        pruebaNode = null;
        Assert.assertEquals(prueba.depth(pruebaNode), 0);
    }

    @Test(expected=Exception.class)
    public void testConstructorCP3() {
        prueba = new BinaryTree<>(null);
        pruebaNode = new Node<>("10");
        Assert.assertEquals(prueba.depth(), 0);
    }

    @Test
    public void testConstructorCP4() {
        prueba = new BinaryTree<>("6");
        prueba.insert("7", prueba.getRoot(), true);
        prueba.insert("8", prueba.getRoot(), false);
        prueba.insert("9", prueba.getRoot().getLeftChild(), true);
        prueba.insert("10", prueba.getRoot().getLeftChild(), false);
        System.out.println(prueba);
        pruebaNode = prueba.getRoot();

        Assert.assertEquals(prueba.depth(pruebaNode), 2);
    }

    @Test
    public void testConstructorCP5() {
        prueba = new BinaryTree<>("6");
        pruebaNode = prueba.insert("7", prueba.getRoot(), true);
        prueba.insert("8", prueba.getRoot(), false);
        prueba.insert("9", prueba.getRoot().getLeftChild(), true);
        prueba.insert("10", prueba.getRoot().getLeftChild(), false);

        Assert.assertEquals(prueba.depth(pruebaNode), 1);
    }

    @Test
    public void testConstructorCP6() {
        prueba = new BinaryTree<>("6");
        prueba.insert("7", prueba.getRoot(), true);
        prueba.insert("8", prueba.getRoot(), false);
        pruebaNode = prueba.insert("9", prueba.getRoot().getLeftChild(), true);
        prueba.insert("10", prueba.getRoot().getLeftChild(), false);

        Assert.assertEquals(prueba.depth(pruebaNode), 1);
    }

    @Test(expected=Exception.class)
    public void testConstructorCP7() {
        prueba = new BinaryTree<>("6");
        prueba.insert("7", prueba.getRoot(), true);
        prueba.insert("8", prueba.getRoot(), false);
        prueba.insert("9", prueba.getRoot().getLeftChild(), true);
        prueba.insert("10", prueba.getRoot().getLeftChild(), false);
        pruebaNode = null;
        Assert.assertEquals(prueba.depth(pruebaNode), 0);
    }

    @Test(expected=Exception.class)
    public void testConstructorCP8() {
        prueba = new BinaryTree<>("6");
        prueba.insert("7", prueba.getRoot(), true);
        prueba.insert("8", prueba.getRoot(), false);
        prueba.insert("9", prueba.getRoot().getLeftChild(), true);
        prueba.insert("10", prueba.getRoot().getLeftChild(), false);
        pruebaNode = new Node<>("3");
        Assert.assertEquals(prueba.depth(pruebaNode), 0);
    }

    @Test(expected=Exception.class)
    public void testConstructorCP9() {
        prueba = new BinaryTree<>(null);
        pruebaNode = null;
        Assert.assertEquals(prueba.depth(pruebaNode), 0);
    }

    @Test(expected=Exception.class)
    public void testConstructorCP10() {
        prueba = new BinaryTree<>(null);
        pruebaNode = new Node<>("15");
        Assert.assertEquals(prueba.depth(pruebaNode), 0);
    }
}
