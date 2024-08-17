package birthday;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {

    public static void main(String[] args) {
        String output = "C:\\gitty\\output.txt";
try (BufferedReader reader = new BufferedReader(new FileReader("C:\\gitty\\input.txt"))){

    String firstPerson = reader.readLine();
    String secondPerson = reader.readLine();
    System.out.println(firstPerson);
    System.out.println(secondPerson);

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yy");

    Date date1 = simpleDateFormat.parse(firstPerson);
    Date date2 = simpleDateFormat.parse(secondPerson);
    System.out.println(date1);
    System.out.println(date2);

    long result = date2.getTime() - date1.getTime();
    long resultInDays = result / (1000 * 60 * 60 * 24);

    PrintWriter printWriter = new PrintWriter(output);
    printWriter.println(resultInDays);
    printWriter.close();

} catch (FileNotFoundException e) {
    throw new RuntimeException(e);
} catch (IOException e) {
    throw new RuntimeException(e);
} catch (ParseException e) {
    throw new RuntimeException(e);
}
    }

}
