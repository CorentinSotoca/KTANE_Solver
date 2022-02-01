package Bomb;
public class Serial {
    public String value;

    public Serial(){
        this.value=new String();
    }

    public boolean isLastIndexEven(){
        char ascii=this.value.charAt(this.value.length()-1);
        int value = ascii -'0';

        return (value%2 == 0);
    }
}
