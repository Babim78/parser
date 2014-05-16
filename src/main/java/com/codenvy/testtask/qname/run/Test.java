package com.codenvy.testtask.qname.run;

import com.codenvy.testtask.qname.exception.IllegalNameException;
import com.codenvy.testtask.qname.parser.QNameParser;

import java.util.Scanner;

/**
 * Run programe
 */
public class Test {

    public static void main(String[] args) throws IllegalNameException {

        Scanner sc = new Scanner(System.in);
        QNameParser parser = new QNameParser();
        while (true) {
            System.out.println("input string...  input 'end' to exit programme");
            String str = sc.nextLine();
            if (str.equals("end")){
                throw new IllegalNameException("exit programme");
            }
            try {
                System.out.println(parser.parse(str));
            } catch (IllegalNameException e) {
                System.out.println("input incorrect " + e);
            }
        }

    }
}

