package Bomb;
public class Bomb {
    public Serial serial;
    public Light light;
    public Battery battery;
    public Port port;


    public Bomb(){
        this.serial=new Serial();
        this.light=new Light();
        this.battery=new Battery();
        this.port=new Port();
    }

    public Bomb(Serial serial, Light light, Battery battery, Port port){
        this.serial=serial;
        this.light=light;
        this.battery=battery;
        this.port=port;
    }
}
