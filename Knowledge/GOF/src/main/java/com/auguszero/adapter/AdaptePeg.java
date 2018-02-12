package com.auguszero.adapter;

/**
 * @author haisong
 * @create 2018/02/12 13:40
 */
public class AdaptePeg implements IRoundPeg,ISquarePeg {

    private  RoundPeg roundPeg = RoundPeg.getInstance();

    private SquarePeg squarePeg = SquarePeg.getInstance();



    @Override
    public void insert(String str) {

    }

    @Override
    public void insertRound(String str) {

    }
}
