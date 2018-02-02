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
public class NumberPath<T> implements Path<T> {

    public T first;
    public final Path <T> rest;

    public NumberPath(T first, Path<T> rest) {
        this.first = first;
        this.rest = rest;
    }

    @Override
    public T getFirst() {
        return first;
    }

    @Override
    public Path<T> getRest() {
        return rest;
    }
private static <T> Path<T> create(T[] elements, int index) {
    if(elements.length == index) return null;
    Path<T> path = new NumberPath(elements[index], create(elements, index + 1));
    return path;   
}
public static<T> Path<T> create(T... elements) {
    return create(elements, 0);
}
}
