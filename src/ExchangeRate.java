import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

// Программа получения курса валют
public class ExchangeRate {
    public static void main(String[] args) throws IOException {
        String page1 = downloadWebPage("https://www.cbr.ru/scripts/XML_dynamic.asp?date_req1=27/08/2025&date_req2=27/08/2025&VAL_NM_RQ=R01235");
        int startIndex1 = page1.lastIndexOf("<Value>"); // Функция возвращающая индекс буквы
        int endIndex1 = page1.lastIndexOf("</Value>");
        String courseStr1 = page1.substring(startIndex1 + 7, endIndex1);

        String page2 = downloadWebPage("https://www.cbr.ru/scripts/XML_dynamic.asp?date_req1=27/08/2024&date_req2=27/08/2024&VAL_NM_RQ=R01235");
        int startIndex2 = page2.lastIndexOf("<Value>"); // Функция возвращающая индекс буквы
        int endIndex2 = page2.lastIndexOf("</Value>");
        String courseStr2 = page2.substring(startIndex2 + 7, endIndex2);

        System.out.println(courseStr1);
        System.out.println(courseStr2);

        double course1 = Double.parseDouble(courseStr1.replace(',','.'));
        double course2 = Double.parseDouble(courseStr2.replace(',','.'));

        if (course1 > course2) {
            System.out.println("За год курс подрос на ");
            System.out.println(course1 - course2);
        } else {
            System.out.println("Год назад курс был больше на ");
            System.out.println(course2 - course1);
        }
    }


        private static String downloadWebPage(String url) throws IOException {
            StringBuilder result = new StringBuilder();
            String line;
            URLConnection urlConnection = new URL(url).openConnection();
            try (InputStream is = urlConnection.getInputStream();
                 BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
                while ((line = br.readLine()) != null) {
                    result.append(line);
                }
            }
            return result.toString();
        }
    }
