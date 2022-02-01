import java.util.Scanner;
import Bomb.Bomb;
import Wires.Wire;
import Wires.Wires;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // System.in is a standard input stream
        Bomb bomb = new Bomb();


        wire(sc, bomb);
    }

    static void wire(Scanner sc, Bomb bomb) {
        String input;
        System.out.println("Donnez la combinaison de fils:");
        input = sc.nextLine();
        Wires wire = new Wires(input);
        if(wire.length==3){

            if(wire.contains(Wire.ROUGE)>0){
                if(!(wire.wire[wire.length-1]==Wire.BLANC)){
                    if(!(wire.contains(Wire.BLEU)>1)){
                        System.out.println("Coupez le dernier fil");
                    }else{
                        System.out.println("Coupez le dernier fil bleu");
                    }
                }else{
                    System.out.println("Coupez le dernier fil");
                }
            }else{
                System.out.println("Coupez le deuxiéme fil");
            }

        }else if(wire.length==4){

            if(!bomb.serial.isLastIndexEven() && wire.contains(Wire.ROUGE)>1){
                System.out.println("Coupez le dernier fil rouge");
            }else{
                // TODO 
            }

        }else if(wire.length==5){

        }else if(wire.length==6){

        }else{

        }
    }

    static String ask(String question, Scanner sc) {
        System.out.println(question);
        return sc.nextLine();
    }
}