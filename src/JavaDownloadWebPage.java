import java.io.*;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;

    public class JavaDownloadWebPage {

        public static void main(String[] args) throws IOException {

            String result = downloadWebPage("https://portretor.ru/");
            writeToFile(result.replaceAll("Portretor", "Terminator" ));

        }

        private static String downloadWebPage(String url) throws IOException {

            StringBuilder result = new StringBuilder();
            String line;

            URLConnection urlConnection = new URL(url).openConnection();
//            urlConnection.addRequestProperty("User-Agent", "Mozilla");
//            urlConnection.setReadTimeout(5000);
//            urlConnection.setConnectTimeout(5000);

            try (InputStream is = urlConnection.getInputStream();
                 BufferedReader br = new BufferedReader(new InputStreamReader(is))) {

                while ((line = br.readLine()) != null) {
                    result.append(line);
                }

            }

            return result.toString();

        }

        public static  void writeToFile(String str) throws IOException {
            BufferedWriter writer = new BufferedWriter(new FileWriter ("/Users/hlopkovmihail/Documents/mygeneratedpage.html"));
            writer.write (str);
            writer.close();
        }

    }
