package com.auguszero.prototype;

/**
 * @author haisong
 * @create 2018/02/12 13:13
 */
public abstract class AbstractSpoon implements Cloneable {
    String spoonName;

    public void setSpoonName(String spoonName) {
        this.spoonName = spoonName;
    }

    public String getSpoonName() {
        return this.spoonName;
    }

    @Override
    public String toString() {
        return "AbstractSpoon{" +
                "spoonName='" + spoonName + '\'' +
                '}';
    }

    @Override
    public Object clone() {
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException exception) {
            System.err.println("AbstractSpoon is not Cloneable");
        }
        return object;
    }
}
