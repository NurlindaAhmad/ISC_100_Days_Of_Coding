package Linda1;

public class Hari10 {
    public static void main(String[] args) {
        
        int nilai = 9;
        int nilai1 = 3;
        int hasil;
        
       //Bitwise  AND
        hasil = nilai & nilai1;
        System.out.println("nilai & nilai1 adalah:" + hasil);
        
        //Bitwise OR
        hasil = nilai | nilai1;
        System.out.println("nilai | nilai1 adalah:" + hasil);
        
        //Bitwise  XOR
        hasil = nilai ^ nilai1;
        System.out.println("nilai ^ nilai1 adalah :" + hasil);
        
        //Bitwise  NOT
        hasil = ~nilai;
        System.out.println("~nilai adalah:" + hasil);
        
        //Bitwise  LeftShift
        hasil = nilai << 1;
        System.out.println("nilai << 1 adalah:" + hasil);
        
        //Bitwise  RightShift
        hasil = nilai  >> 1 ;
        System.out.println("nilai >> 1 adalah:" + hasil);
    
    } 
}
