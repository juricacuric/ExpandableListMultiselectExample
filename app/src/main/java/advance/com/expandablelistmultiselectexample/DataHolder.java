package advance.com.expandablelistmultiselectexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class DataHolder {

    public static final List<String> CATEGORY;
    public static final Map<String, List<String>> CATEGORY_FIGHTERS;

    private DataHolder() {
        throw new RuntimeException("Can not instantiate this class!");
    }

    static {
        List<String> category = new ArrayList<>();
        category.add("Heavyweight");
        category.add("Light Heavyweight");
        category.add("Middleweight");
        category.add("Welterweight");
        category.add("Lightweight");
        category.add("Featherweight");
        category.add("Bantamweight");
        category.add("Flyweight");
        CATEGORY = Collections.unmodifiableList(category);

        Map<String, List<String>> categoryFighters = new HashMap<>();
        List<String> heavyweightFighters = new ArrayList<>();
        heavyweightFighters.add("Fabricio Werdum");
        heavyweightFighters.add("Cain Velasquez");
        heavyweightFighters.add("Alistair Overeem");
        heavyweightFighters.add("Junior dos Santos");
        heavyweightFighters.add("Stipe Miocic");
        heavyweightFighters.add("Andrei Arlovski");
        heavyweightFighters.add("Ben Rothwell");
        heavyweightFighters.add("Mark Hunt");
        heavyweightFighters.add("Travis Browne");
        heavyweightFighters.add("Vitaly Minakov");
        categoryFighters.put("Heavyweight", Collections.unmodifiableList(heavyweightFighters));

        List<String> lightHeavyweightFighters = new ArrayList<>();
        lightHeavyweightFighters.add("Jon Jones");
        lightHeavyweightFighters.add("Daniel Cormier");
        lightHeavyweightFighters.add("Anthony Johnson");
        lightHeavyweightFighters.add("Alexander Gustafsson");
        lightHeavyweightFighters.add("Ryan Bader");
        lightHeavyweightFighters.add("Phil Davis");
        lightHeavyweightFighters.add("Glover Teixeira");
        lightHeavyweightFighters.add("Ovince St. Preux");
        lightHeavyweightFighters.add("Liam McGeary");
        lightHeavyweightFighters.add("Corey Anderson");
        categoryFighters.put("Light Heavyweight", Collections.unmodifiableList(lightHeavyweightFighters));

        List<String> middleweightFighters = new ArrayList<>();
        middleweightFighters.add("Luke Rockhold");
        middleweightFighters.add("Chris Weidman");
        middleweightFighters.add("Yoel Romero");
        middleweightFighters.add("Ronaldo Souza");
        middleweightFighters.add("Vitor Belfort");
        middleweightFighters.add("Michael Bisping");
        middleweightFighters.add("Lyoto Machida");
        middleweightFighters.add("Derek Brunson");
        middleweightFighters.add("David Branch");
        middleweightFighters.add("Mamed Khalidov");
        categoryFighters.put("Middleweight", Collections.unmodifiableList(middleweightFighters));

        List<String> welterweightFighters = new ArrayList<>();
        welterweightFighters.add("Robbie Lawler");
        welterweightFighters.add("Rory MacDonald");
        welterweightFighters.add("Tyron Woodley");
        welterweightFighters.add("Stephen Thompson");
        welterweightFighters.add("Johny Hendricks");
        welterweightFighters.add("Carlos Condit");
        welterweightFighters.add("Demian Maia");
        welterweightFighters.add("Matt Brown");
        welterweightFighters.add("Neil Magny");
        welterweightFighters.add("Ben Askren");
        categoryFighters.put("Welterweight", Collections.unmodifiableList(welterweightFighters));

        List<String> lightweightFighters = new ArrayList<>();
        lightweightFighters.add("Rafael dos Anjos");
        lightweightFighters.add("Donald Cerrone");
        lightweightFighters.add("Eddie Alvarez");
        lightweightFighters.add("Khabib Nurmagomedov");
        lightweightFighters.add("Anthony Pettis");
        lightweightFighters.add("Tony Ferguson");
        lightweightFighters.add("Will Brooks");
        lightweightFighters.add("Michael Chiesa");
        lightweightFighters.add("Beneil Dariush");
        lightweightFighters.add("Edson Barboza");
        categoryFighters.put("Lightweight", Collections.unmodifiableList(lightweightFighters));

        List<String> featherweightFighters = new ArrayList<>();
        featherweightFighters.add("Conor McGregor");
        featherweightFighters.add("Jose Aldo");
        featherweightFighters.add("Frankie Edgar");
        featherweightFighters.add("Max Holloway");
        featherweightFighters.add("Chad Mendes");
        featherweightFighters.add("Cub Swanson");
        featherweightFighters.add("Charles Oliveira");
        featherweightFighters.add("Ricardo Lamas");
        featherweightFighters.add("Hacran Dias");
        featherweightFighters.add("Jeremy Stephens");
        categoryFighters.put("Featherweight", Collections.unmodifiableList(featherweightFighters));

        List<String> bantamweightFighters = new ArrayList<>();
        bantamweightFighters.add("Dominick Cruz");
        bantamweightFighters.add("T.J. Dillashaw");
        bantamweightFighters.add("Renan Barao");
        bantamweightFighters.add("Urijah Faber");
        bantamweightFighters.add("Aljamain Sterling");
        bantamweightFighters.add("Marlon Moraes");
        bantamweightFighters.add("Takeya Mizugaki");
        bantamweightFighters.add("Thomas Almeida");
        bantamweightFighters.add("Jimmie Rivera");
        bantamweightFighters.add("Frankie Saenz");
        categoryFighters.put("Bantamweight", Collections.unmodifiableList(bantamweightFighters));

        List<String> flyweightFighters = new ArrayList<>();
        flyweightFighters.add("Demetrious Johnson");
        flyweightFighters.add("Joseph Benavidez");
        flyweightFighters.add("John Dodson");
        flyweightFighters.add("Henry Cejudo");
        flyweightFighters.add("Jussier da Silva");
        flyweightFighters.add("Wilson Reis");
        flyweightFighters.add("John Moraga");
        flyweightFighters.add("Kyoji Horiguchi");
        flyweightFighters.add("Dustin Ortiz");
        flyweightFighters.add("Zach Makovsky");
        categoryFighters.put("Flyweight", Collections.unmodifiableList(flyweightFighters));
        CATEGORY_FIGHTERS = Collections.unmodifiableMap(categoryFighters);
    }
}
