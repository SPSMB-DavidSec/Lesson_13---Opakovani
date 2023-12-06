package cz.secda1.test1;

import java.util.ArrayList;
import java.util.List;

public class LunchDBService {

    private List<LunchItem> lunchItems;
    static Allergen wheat = new Allergen("01a", "Obiloviny - pšenice");
    static Allergen milk = new Allergen("07", "Mléko");
    static Allergen eggs = new Allergen("03", "Vejce");

    public LunchDBService() {
        initDB();
    }


    private void initDB() {

        lunchItems = new ArrayList<>();
        lunchItems.add(new LunchItem("15.11.2023", LunchItemKind.SOUP, "polevka", "Valašská kyselica", 0, List.of(wheat, milk), "14.11.2023", true));
        lunchItems.add(new LunchItem("15.11.2023", LunchItemKind.MAIN_DISH, "oběd1", "Vepřová plec na žampiónech, rýže", 25, List.of(wheat, milk), "14.11.2023", true));
        lunchItems.add(new LunchItem("15.11.2023", LunchItemKind.MAIN_DISH, "oběd2", "Bulgur s drcenými rajčaty a parmazánem", 25, List.of(wheat, milk), "14.11.2023", false));
        lunchItems.add(new LunchItem("15.11.2023", LunchItemKind.DRINK, "nápoj", "voda, čaj, ochucené mléko", 0, List.of(milk), "14.11.2023", true));


        lunchItems.add(new LunchItem("22.11.2023", LunchItemKind.SOUP, "polevka", "Hovězí s jáhly", 0, List.of(), "21.11.2023", true));
        lunchItems.add(new LunchItem("22.11.2023", LunchItemKind.MAIN_DISH, "oběd1", "Kari rizoto zeleninové se sýrem", 25, List.of(milk), "21.11.2023", true));
        lunchItems.add(new LunchItem("22.11.2023", LunchItemKind.MAIN_DISH, "oběd2", "Ovocné knedlíky se zakysanou smetanou , ovoce", 25, List.of(wheat, milk), "22.11.2023", false));
        lunchItems.add(new LunchItem("22.11.2023", LunchItemKind.DRINK, "nápoj", "voda, čaj, ochucené mléko", 0, List.of(milk), "21.11.2023", true));


        lunchItems.add(new LunchItem("23.11.2023", LunchItemKind.SOUP, "polevka", "Polévka s červenou čočkou", 0, List.of(), "21.11.2023", true));
        lunchItems.add(new LunchItem("23.11.2023", LunchItemKind.MAIN_DISH, "oběd1", "Kotleta s jabky a křenem, brambory", 25, List.of(milk), "21.11.2023", true));
        lunchItems.add(new LunchItem("23.11.2023", LunchItemKind.MAIN_DISH, "oběd2", "Tagliatelle se smetanovou omáčkou a masem", 25, List.of(wheat, milk), "22.11.2023", false));
        lunchItems.add(new LunchItem("23.11.2023", LunchItemKind.DRINK, "nápoj", "Džus, voda, čaj, ochucené mléko", 0, List.of(milk), "21.11.2023", true));


        lunchItems.add(new LunchItem("24.11.2023", LunchItemKind.SOUP, "polevka", "Frankfurtská", 0, List.of(wheat, milk), "23.11.2023", true));
        lunchItems.add(new LunchItem("24.11.2023", LunchItemKind.MAIN_DISH, "oběd1", "Koprovka s vejcem a bramborem", 25, List.of(milk, eggs), "23.11.2023", true));
        lunchItems.add(new LunchItem("24.11.2023", LunchItemKind.MAIN_DISH, "oběd2", "Zapečené těstoviny se sýrem", 25, List.of(wheat, milk), "22.11.2023", false));
        lunchItems.add(new LunchItem("24.11.2023", LunchItemKind.DRINK, "nápoj", "Džus, voda, čaj, ochucené mléko", 0, List.of(milk), "21.11.2023", true));

        lunchItems.add(new LunchItem("28.11.2023", LunchItemKind.SOUP, "polevka", " Gulášová", 0, List.of(wheat, milk), "26.11.2023", true));
        lunchItems.add(new LunchItem("28.11.2023", LunchItemKind.MAIN_DISH, "oběd1", "Maďarský perkelt, rýže", 25, List.of(), "26.11.2023", true));
        lunchItems.add(new LunchItem("28.11.2023", LunchItemKind.MAIN_DISH, "oběd2", "Bramborák se salámem, zeleninový salát", 25, List.of(milk, eggs), "26.11.2023", false));
        lunchItems.add(new LunchItem("28.11.2023", LunchItemKind.DRINK, "nápoj", "Džus, čaj, voda, ochucené mléko", 0, List.of(milk), "26.11.2023", true));

        lunchItems.add(new LunchItem("29.11.2023", LunchItemKind.SOUP, "polevka", "Houbová", 0, List.of(wheat, milk), "28.11.2023", true));
        lunchItems.add(new LunchItem("29.11.2023", LunchItemKind.MAIN_DISH, "oběd1", "Vepřový guláš s cibulí, těstoviny, ovoce", 25, List.of(wheat, milk), "28.11.2023", true));
        lunchItems.add(new LunchItem("29.11.2023", LunchItemKind.MAIN_DISH, "oběd2", "Francouzské brambory, červená řepa, ovoce", 25, List.of(milk), "28.11.2023", false));
        lunchItems.add(new LunchItem("29.11.2023", LunchItemKind.DRINK, "nápoj", "Džus, čaj, voda, ochucené mléko", 0, List.of(milk), "28.11.2023", true));

        lunchItems.add(new LunchItem("30.11.2023", LunchItemKind.SOUP, "polevka", "Zeleninová s vejci", 0, List.of(wheat, eggs), "29.11.2023", true));
        lunchItems.add(new LunchItem("30.11.2023", LunchItemKind.MAIN_DISH, "oběd1", "Svíčková pečeně na smetaně, houskový knedlík", 25, List.of(eggs), "29.11.2023", true));
        lunchItems.add(new LunchItem("30.11.2023", LunchItemKind.MAIN_DISH, "oběd2", "Brokolicová poezie, brambory, rajče", 25, List.of(milk), "29.11.2023", false));
        lunchItems.add(new LunchItem("30.11.2023", LunchItemKind.DRINK, "nápoj", "Ovocný nápoj, čaj, voda, ochucené mléko", 0, List.of(milk), "29.11.2023", true));


        lunchItems.add(new LunchItem("01.12.2023", LunchItemKind.SOUP, "polevka", "Beskydská kmínová", 0, List.of(milk), "30.11.2023", true));
        lunchItems.add(new LunchItem("01.12.2023", LunchItemKind.MAIN_DISH, "oběd1", "Drůbeží špíz, hranolky, dresing tzaziky", 25, List.of(milk), "30.11.2023", true));
        lunchItems.add(new LunchItem("01.12.2023", LunchItemKind.MAIN_DISH, "oběd2", "Jogurtové knedlíky s jahodami", 25, List.of(wheat, milk), "30.11.2023", false));
        lunchItems.add(new LunchItem("01.12.2023", LunchItemKind.DRINK, "nápoj", "Sirup, čaj, voda, ochucené mléko", 0, List.of(milk), "30.11.2023", true));

    }


    public List<LunchItem> getAll() {
        return lunchItems;
    }


}
