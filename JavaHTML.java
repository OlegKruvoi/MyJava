import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class HTMLParser {
    public static void main(String[] args) {
        String url = "https://example.com"; // Замените на адрес страницы, которую вы хотите распарсить

        try {
            // Получаем HTML-код страницы
            Document doc = Jsoup.connect(url).get();

            // Парсим и выводим заголовок страницы
            String title = doc.title();
            System.out.println("Title: " + title);

            // Парсим и выводим все ссылки на странице
            Elements links = doc.select("a");
            System.out.println("\nLinks:");
            for (Element link : links) {
                String linkHref = link.attr("href");
                String linkText = link.text();
                System.out.println(linkText + ": " + linkHref);
            }

            // Парсим и выводим все изображения на странице
            Elements images = doc.select("img");
            System.out.println("\nImages:");
            for (Element image : images) {
                String imageUrl = image.attr("src");
                System.out.println(imageUrl);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
