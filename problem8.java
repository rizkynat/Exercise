package euler;
import java.io.*;
public class problem8 {
 public static void main(String []args) throws Exception{
    File file = new File("C:\\Users\\A S U S\\Documents\\NetBeansProjects\\PrakSDA_RizkyNathamael\\src\\euler\\hello.txt");
    BufferedReader br = new BufferedReader(new FileReader(file));
    String st;
    String data="";
        while ((st = br.readLine()) != null){
            data+=st; 
        }
        char charSeribuDigit[] = new char[data.length()];
        int seribuDigit[] = new int[data.length()];
        for(int i=0;i<data.length();i++){
            charSeribuDigit[i]=data.charAt(i);
            seribuDigit[i]=Character.getNumericValue(charSeribuDigit[i]);
        }
       // listAngka(4, seribuDigit);
        System.out.println("Produk terbesar: "+listAngka(13, seribuDigit));
    }

    public static long listAngka(int noDigit,int []seribuDigit){
        long produkTerbesar=0;
        int awal;
        for(awal=0;awal<(seribuDigit.length-noDigit);awal++){
            long produk = seribuDigit[awal];
            int j;
            for(j=1;j<noDigit;j++){
                produk=produk*seribuDigit[awal+j];
            }
            if(produk>produkTerbesar){
                produkTerbesar=produk;
            }
            
        }
        return produkTerbesar;
    }
   
}
