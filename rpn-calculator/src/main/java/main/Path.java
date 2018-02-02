/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Lovro
 */
public interface Path<T>  { //Generic variable, stands for str/int in the later implementation of the interface
    T getFirst();
    Path<T> getRest();
}
