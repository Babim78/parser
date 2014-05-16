package com.codenvy.testtask.qname.parser;

import com.codenvy.testtask.qname.entity.QName;
import com.codenvy.testtask.qname.exception.IllegalNameException;
import com.codenvy.testtask.qname.regex.Regex;

import java.util.StringTokenizer;

/**
 * Class parser implements interface Parser
 */
public class QNameParser implements Parser {


    /**
     * thist method takes a string and returns a QName object
     * if input string is incorrect, method throws exception
     * @param inputString
     * @return QName
     * @throws IllegalNameException
     */
    @Override
    public QName parse(String inputString) throws IllegalNameException {

        int count = 0;
        String[] arrayString = new String[2];
        String prefix = null;
        String localName = null;

        if (!inputString.contains(":")) {

            if (inputString.matches(Regex.SIMPLE_NAME)) {

                return new QName(inputString);
            } else {
                throw new IllegalNameException("incorrect simple name format...");
            }

        } else {

            StringTokenizer token = new StringTokenizer(inputString, ":");
            while (token.hasMoreTokens()) {
                if (count < 2) {
                    arrayString[count] = token.nextToken();
                    count++;
                } else {
                    throw new IllegalNameException("Incorrect input format... ");
                }
            }
            prefix = arrayString[0];
            localName = arrayString[1];
            if (prefix!=null && localName!=null) {
                if (prefix.matches(Regex.PREFIX) && localName.matches(Regex.LOCAL_NAME)) {

                    return new QName(prefix, localName);

                } else {
                    throw new IllegalNameException("incorrect prefix or local name...");
                }
            }else {
                throw new IllegalNameException("prefix or local name is null");
            }
        }
    }

}
