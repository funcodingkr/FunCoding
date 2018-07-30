import java.net.*;
import java.io.*;

public class Webtoon {
    static String input1 = "https://comic.naver.com/webtoon/weekday.nhn";
    InputStream in = null;
    static OutputStreamWriter out = null;
    int size;

    public static void main(String[] args) throws Exception {
        String data="", result="";
        StringBuffer sb = new StringBuffer();
        URL ocu = new URL(input1);
        URLConnection con = ocu.openConnection();
        con.setDoOutput(true);
        out = new OutputStreamWriter(con.getOutputStream());
        out.write(data);
        out.flush();

        BufferedReader in = new BufferedReader(new InputStreamReader(
                con.getInputStream(), "UTF-8"));
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }
    }
}
