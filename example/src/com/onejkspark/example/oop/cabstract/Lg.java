package com.onejkspark.example.oop.cabstract;

public class Lg extends Tv {

    public Lg(String serialNum, int channel) {
        super(serialNum, channel);
    }

    @Override
    void upChannel() {
        int channel = this.getChannel() + 1;
        setChannel(channel);
    }

    @Override
    void downChannel() {
        int channel = this.getChannel() - 1;
        setChannel(channel);
    }

    @Override
    void callChannel() {
        System.out.println(this.getSerialNum() + "\t Now Channel [" + this.getChannel() + "]");
    }
}
