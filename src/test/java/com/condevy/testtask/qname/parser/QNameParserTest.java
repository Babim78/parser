package com.condevy.testtask.qname.parser;

import com.codenvy.testtask.qname.entity.QName;
import com.codenvy.testtask.qname.exception.IllegalNameException;
import com.codenvy.testtask.qname.parser.Parser;
import com.codenvy.testtask.qname.parser.QNameParser;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by Dimashnurenko on 16.05.2014.
 */
public class QNameParserTest {

    Parser parser;

    @Before
    public void init(){
        parser = new QNameParser();
    }

    @Test
    public void correctSimpleNameTest() throws IllegalNameException {
        QName name = parser.parse("first");
        assertEquals("first", name.toString());
    }

    @Test(expected = IllegalNameException.class)
    public void incorrectSimpleNameTest() throws IllegalNameException{
        parser.parse("fir st");
    }

    @Test
    public void  getCorrectPrefixTest() throws IllegalNameException {
        QName name = parser.parse("hello:world");
        assertEquals("hello",name.getPrefix());
    }

    @Test
    public void  getCorrectLocaleNameTest() throws IllegalNameException {
        QName name = parser.parse("hello:world");
        assertEquals("world",name.getLocalName());
    }

    @Test(expected = IllegalNameException.class)
    public void incorrectInputTest() throws IllegalNameException{
        parser.parse("prefix:name:name");
    }

    @Test
    public void correctInputTest() throws IllegalNameException{
        assertEquals("hello:wo rld",parser.parse("hello:wo rld").toString());
    }

    @Test(expected = IllegalNameException.class)
    public void incorretctInputWithSpace()throws IllegalNameException{
        parser.parse("hello: world");
    }

    @Test(expected = IllegalNameException.class)
    public void incorretctInputWithEndSpace()throws IllegalNameException{
        parser.parse("hello:world ");
    }

    @Test(expected = IllegalNameException.class)
    public void notPrefixTest() throws IllegalNameException{
        parser.parse(":name");
    }

    @Test(expected = IllegalNameException.class)
    public void notLocalNameTest() throws IllegalNameException{
        parser.parse("prefix:");
    }

    @Test(expected = IllegalNameException.class)
    public void noInputStringTest() throws IllegalNameException{
        parser.parse("");
    }

    @Test
    public void getCorrectQNameObject() throws IllegalNameException{
        QName expected = new QName("hello","world");
        assertEquals(expected,parser.parse("hello:world"));
    }
}
