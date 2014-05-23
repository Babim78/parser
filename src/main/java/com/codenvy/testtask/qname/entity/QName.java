package com.codenvy.testtask.qname.entity;

/**
 *change main class
 * this class describes entity QName
 */
public class QName {

    private String simpleName;
    private String prefix;
    private String localName;

    public QName(String simpleName){
        this.simpleName = simpleName;
    }

    public QName(String prefix,String localName){
        this.prefix = prefix;
        this.localName = localName;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getLocalName() {
        return localName;
    }

    public String getAsString(){
        return prefix + ":" + localName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        QName qName = (QName) o;

        if (!localName.equals(qName.localName)) return false;
        if (!prefix.equals(qName.prefix)) return false;

        return true;
    }

    @Override
    public String toString(){
        if (simpleName!=null){
            return simpleName;
        }else {
            return getAsString();
        }
    }
}

