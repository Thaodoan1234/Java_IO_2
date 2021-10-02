import java.io.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
//        try {
//            FileOutputStream fos = new FileOutputStream("data.txt", true);
//            PrintWriter writer = new PrintWriter(fos);
//            writer.println("1/6");
//
//            writer.flush();
//            writer.close();

//            FileInputStream fis = new FileInputStream("data.txt");
//            InputStreamReader isr = new InputStreamReader(fis);
//            BufferedReader reader = new BufferedReader(isr);
//            String line =  reader.readLine();
//            while (line != null) {
//                System.out.println(line);
//                line = reader.readLine();
//            }
//
//            reader.close();
//        }
//        catch (IOException e) {
//            e.printStackTrace();
//        }
//        catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

      //dùng Scanner
//      try {
//          FileInputStream fis = new FileInputStream("data.txt");
//          Scanner sc = new Scanner(fis);
//          while (sc.hasNextLine()) {
//              String line = sc.nextLine();
//              System.out.println(line);
//          }
//          sc.close();
//      }
//      catch (FileNotFoundException e) {
//          e.printStackTrace();
//      }

/** Bài tập
 * Viết ct java ghép nội dung 2 tập tin sang tập tin khác
 * thông tin của 3 tập tin sẽ được cung cấp bởi user
 * */

        try {
            FileOutputStream fos = new FileOutputStream("data.txt", true);
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fos));

            FileInputStream fis1 = new FileInputStream("data1.txt");
            InputStreamReader isr1 = new InputStreamReader(fis1);
            BufferedReader reader1 = new BufferedReader(isr1);
            String line1 =  reader1.readLine();
            if (line1 != null) {
                writer.write(line1);
            }

            FileInputStream fis2 = new FileInputStream("data2.txt");
            InputStreamReader isr2 = new InputStreamReader(fis2);
            BufferedReader reader2 = new BufferedReader(isr2);
            String line2 =  reader2.readLine();
            if (line2 != null) {
                writer.write(line2);
            }

            writer.flush();
            writer.close();

        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
