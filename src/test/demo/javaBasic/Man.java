package javaBasic;

/**
 * Created by MrSpin on 2017/8/12.
 */
public class Man extends User{

        private Integer mongey;

        public void makeMoney(){
            System.out.print("男人要好好挣钱！");
        }

       public Integer getMongey() {
        return mongey;
       }

        public void setMongey(Integer mongey) {
        this.mongey = mongey;
       }
}
