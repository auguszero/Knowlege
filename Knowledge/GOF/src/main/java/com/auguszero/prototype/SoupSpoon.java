package com.auguszero.prototype;

/**
 * @author haisong
 * @create 2018/02/12 13:15
 */
public class SoupSpoon extends AbstractSpoon {



    public SoupSpoon() {
        setSpoonName("Soup Spoon");
    }


    public static void main(String[] args) {
        AbstractSpoon soupSpoon = new SoupSpoon();
        AbstractSpoon soupSpoon1 = (AbstractSpoon) soupSpoon.clone();


        System.out.println(soupSpoon);
        System.out.println(soupSpoon1);

    }


}
