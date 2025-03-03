package com;

import com.google.common.collect.Lists;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = Lists.newArrayList();
        addToList(list, "Hello ");
        addToList(list, "World1");
        addToList(list, "!");
        addToList(list, ".");
        removeElement(list, ".");
        System.out.println(getConcatenatedString(list));
    }

    public static void addToList(List<String> list, String element) {
        list.add(element);
    }

    public static void removeElement(List<String> list, String element) {
        list.remove(element);
    }

    public static String getConcatenatedString(List<String> list) {
        String concatenatedString = "";
        for (String element : list) {
            concatenatedString += element;
        }
        return concatenatedString;
    }

}