package primitives;

public class Integers {
    int baseDecimal = 1_342_322;
    int octValue = 04_02;
    int octValue1 = 0_412;
    int hexValue = 0x10_AB_32;
    int binaryValue = 0b1111_1101;

    //**********************************
//    int baseDecimal1=_10;
//    int baseDecimal2=1_;
//    int getOctValue1=0_123_;
//    int binaryValue1=0b_10;
//    int binaryValue2=0B_10;
//    int binaryValue3=0X_10;
//    int binaryValue4=0X_10;

//    long number=10_L;

    //int i = Integer.parseInt("12_33");  //Number Format exception
    int a = 1;

    public void display() {
        System.out.printf("base decimal:%d  octal values: %d %d\n", baseDecimal, octValue, octValue1);
        System.out.printf("hex:%d  binary: %d  ", hexValue, binaryValue);
    }
}

