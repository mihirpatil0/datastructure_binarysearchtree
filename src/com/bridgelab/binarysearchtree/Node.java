package com.bridgelab.binarysearchtree;

/*********************************************
 * @author mihir
 * 
 * This class is representing nodes
 * which are present in a binary tree
 * that is root node, left node and right node.
 *********************************************/
public class Node
{
	int key;
    Node left, right;

    public Node(int item)
    {
        key = item;
        left = right = null;
    }
}
