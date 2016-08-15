package apine.mentor.com.anasotak.Lit;

import apine.mentor.com.anasotak.R;

/**
 * Created by 99 on 8/15/2016.
 */
public class style {
    public style (){

    }
    int bg1 ,bg2 ,bg3 ,bg4;
    int st;
    public void setSt(int st){
        this.st=st;
    }
    public void rant(int st){
        switch (st){
            case 0:
                bg1= R.color.colorPrimary;
                bg2= R.color.colorAccent;
                bg3= R.color.yes;
                bg4= R.color.no;
                break;

        }
    }

    public style(int bg1, int bg2, int bg3, int bg4) {
        this.bg1 = bg1;
        this.bg2 = bg2;
        this.bg3 = bg3;
        this.bg4 = bg4;
    }

    public int getBg1() {
        return bg1;
    }

    public int getBg2() {
        return bg2;
    }

    public int getBg3() {
        return bg3;
    }

    public int getBg4() {
        return bg4;
    }
}
