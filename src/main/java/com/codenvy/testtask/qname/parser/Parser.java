package com.codenvy.testtask.qname.parser;

import com.codenvy.testtask.qname.entity.QName;
import com.codenvy.testtask.qname.exception.IllegalNameException;

/**
 * Interface which must implements all parsers
 */
public interface Parser {

    public QName parse(String inputString) throws IllegalNameException;
}
