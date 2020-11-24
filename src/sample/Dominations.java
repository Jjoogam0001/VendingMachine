package sample;

public enum Dominations {

    Domination1(1),
    Domination2(2),
    Domination3(5),
    Domination4(10),
    Domination5(20),
    Domination6(50),
    Domination7(100),
    Domination8(200),
    Domination9(500),
    Domination10(1000);



   private int Value;



    Dominations(int value) {
       this.Value = value;
    }

    int getValue(){
        return this.Value;
    }


}
