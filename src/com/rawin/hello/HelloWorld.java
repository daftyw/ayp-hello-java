package com.rawin.hello;


/**
 * Created by Rawin on 11-Jul-16.
 */
public class HelloWorld {

    public static void
            main(String [] args) {

        ReadableDocument doc1 = new ReadableDocument();
        ReadableDocument doc2 = new ReadableDocument();
        doc1.count();
        doc2.count();
        doc2.count();

        ReadableDocument.down();
        doc2.down();
    }

}
