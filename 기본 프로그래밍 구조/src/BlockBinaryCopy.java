package Stream;
import java.io.*;
public class BlockBinaryCopy {
    public static void main(String[] args){
        File src = new File("c:\\Users\\Public\\dessert.jpg");
        File dest = new File("c:\\tmp\\dessert.jpg");

        try{
            FileInputStream fi = new FileInputStream(src);
            FileOutputStream fo = new FileOutputStream(dest);
            byte[] buf = new byte[1024*10];
            while(true){
                int n = fi.read(buf);
                fo.write(buf, 0, n);
                if ( n< buf.length)
                    break;
            }
            fi.close();
            fo.close();
            System.out.println(src.getPath() +"를"+ dest.getPath()+"로 복사 하였습니다 ");
        }catch (IOException e){System.out.println("파일 복사 오류 ");}
    }
}
