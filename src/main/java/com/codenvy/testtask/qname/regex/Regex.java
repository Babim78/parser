package com.codenvy.testtask.qname.regex;

/**
 * Abstract class keeps the test patterns for the input strings
 */
public abstract class Regex {


    private static final String ONE_CHAR_SIMPLE_NAME = "[^\\]\\[:./*'\"|;\\s]";
    private static final String TWO_CHAR_SIMPLE_NAME = "[.][^\\]\\[:/*.'\"|;\\s]|[^\\]\\[:./*'\"|;\\s][.]|[^\\]\\[:./*'\"|;\\s]{2}";

    private static final String ONE_CHAR_LOCAL_NAME = "[^\\]\\[:/*'\";|\\s]";
    private static final String TWO_CHAR_LOCAL_NAME = "[^\\]\\[:/*'\";|\\s]{2}";

    private static final String THREE_OR_MORE_CHAR_SIMPLE_NAME = "[^\\]\\[:/*'\".;|\\s][([^\\]\\[:./*'\";|\\s])]*[^\\]\\[:/*'\";|\\s]$";
    private static final String THREE_OR_MORE_CHAR_LOCAL_NAME = "[^\\]\\[:/*'\";|\\s][([^\\]\\[:/*'\";|\\s]|[ ])]*[^\\]\\[:/*'\";|\\s]$";

    public static final String SIMPLE_NAME = ONE_CHAR_SIMPLE_NAME + "|" + TWO_CHAR_SIMPLE_NAME + "|" + THREE_OR_MORE_CHAR_SIMPLE_NAME;
    public static final String PREFIX = "[a-zA-z0-9_.]*";
    public static final String LOCAL_NAME = ONE_CHAR_LOCAL_NAME + "|" + TWO_CHAR_LOCAL_NAME + "|" + THREE_OR_MORE_CHAR_LOCAL_NAME;
}
