import java.io.*;
import java.util.*;

public class WikipediaSample {
    public static void main(String[] args) {
        Map<String, String> pages = new TreeMap<String, String>();
        Map<String, Set<String>> links = new TreeMap<String, Set<String>>();

        try {
            File pageFile = new File("data/pages_small.txt");
            Scanner pageReader = new Scanner(pageFile);
            while (pageReader.hasNextLine()) {
                String[] page = pageReader.nextLine().split("\t", 0);
                // page[0]: id, page[1]: title
                pages.put(page[0], page[1]);
            }
            pageReader.close();

            File linkFile = new File("data/links_small.txt");
            Scanner linkReader = new Scanner(linkFile);
            while (linkReader.hasNextLine()) {
                String[] link = linkReader.nextLine().split("\t", 0);
                // link[0]: id (from), links[1]: id (to)
                if (!links.containsKey(link[0])) {
                    links.put(link[0], new TreeSet<String>());
                }
                links.get(link[0]).add(link[1]);
            }
            linkReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            return;
        }

        for (Map.Entry<String, String> page : pages.entrySet()) {
            if (page.getValue().equals("Google")) {
                System.out.println(page.getValue() + " " + page.getKey());
                break;
            }
        }
    }
}
