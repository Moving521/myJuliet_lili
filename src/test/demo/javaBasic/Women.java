package javaBasic;

/**
 * Created by MrSpin on 2017/8/12.
 */
public class Women  extends User{

    public String family;

    public void careFamily(){
        System.out.print("女人要好好照顾家庭");
    }

    public void careFamily(String careStyle){
        System.out.println("女人要\t"+careStyle+"\t照顾家庭");
    }


    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }
}
