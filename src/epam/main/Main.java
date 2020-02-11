package main;

import thread.NameThread;
import utils.NameHelper;

public class Main {

    public static void main(String[] args) {
        NameHelper nameHelper = new NameHelper();
        NameThread a = new NameThread(nameHelper, 0);
        NameThread b = new NameThread(nameHelper, 1);
        NameThread c = new NameThread(nameHelper, 2);

        a.start();
        b.start();
        c.start();
    }
}