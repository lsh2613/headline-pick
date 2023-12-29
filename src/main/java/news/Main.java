package news;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String URL = "https://www.yna.co.kr/news?site=navi_latest_depth01";
        Document doc = Jsoup.connect(URL).get();

        Elements elements = doc.getElementsByClass("tit-news");

        System.out.println("===============================");
        elements.stream().map(e -> e.ownText()).forEach(System.out::println);
        System.out.println("===============================");

    }
}