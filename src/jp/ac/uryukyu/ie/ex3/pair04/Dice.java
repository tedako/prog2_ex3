package jp.ac.uryukyu.ie.ex3.pair04;
public class Dice{
    private int value;

    public void Dice(){
	play();
    }
    public int getValue(){
	return value;
    }

    public void setValue(int value){
	this.value = value;
    }

    public void play(){
	this.value = (int)(Math.random()*6)+1;
    }
}