package Wires;

public class Wires {
    public Wire[] wire;
    public int length;

    public Wires(String input){
        String[] tab = input.split(" ");
        this.wire = new Wire[tab.length];
        for(int i =0; i<tab.length;i++){
            Wire res;

            if(tab[i].toLowerCase().equals("rouge")){
                res=Wire.ROUGE;
            }else if(tab[i].toLowerCase().equals("jaune")){
                res=Wire.JAUNE;
            }else if(tab[i].toLowerCase().equals("blanc")){
                res=Wire.BLANC;
            }else if(tab[i].toLowerCase().equals("noir")){
                res=Wire.NOIR;
            }else if(tab[i].toLowerCase().equals("bleu")){
                res=Wire.BLEU;
            }else{
                res=Wire.NONE;
            }
            
            this.wire[i]=res;
        }
        this.length=this.wire.length;
    }

    public int contains(Wire color){
        int res = 0;
        for(int i =0;i<this.length;i++){
            if(this.wire[i]==color){
                res++;
            }
        }
        return res;
    }

    public void print(){
        for(int i = 0; i<this.wire.length; i++){
            System.out.println(i+" : "+wire[i]);
        }
    }
}
