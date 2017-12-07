import java.util.ArrayList;
/**
 * Write a description of class Canada here.
 *
 * @author LiKun
 * @version Nov.25.2017
 */
public class Canada
{
    // instance variables - replace the example below with your own
    private ArrayList<ProvinceTerritory> provinces;

    /**
     * Constructor for objects of class Canada
     */
    public Canada()
    {
        provinces = new ArrayList<ProvinceTerritory>();

        provinces.add(new ProvinceTerritory("British Columbia", 4400057));
        provinces.add(new ProvinceTerritory("Alberta", 3645257));
        provinces.add(new ProvinceTerritory("Manitoba", 1208268));
        provinces.add(new ProvinceTerritory("New Brunswick", 751171));
        provinces.add(new ProvinceTerritory("Newfoundland and Labrador", 514536));
        provinces.add(new ProvinceTerritory("Northwest Territories", 41462));
        provinces.add(new ProvinceTerritory("Nova Scotia", 921727));
        provinces.add(null);
        provinces.add(new ProvinceTerritory("Nunavut", 31906));
        provinces.add(new ProvinceTerritory("Ontario", 12851821));
        provinces.add(new ProvinceTerritory("Prince Edward Island", 140204));
        provinces.add(new ProvinceTerritory("Quebec", 7903001));
        provinces.add(new ProvinceTerritory("Saskatchewan", 1033381));
        provinces.add(new ProvinceTerritory("Yukon", 33897));

    }
/**
 * @return total population of Canada
 */
    public int getTotalPopulation()
    {
        int totalpop = 0;
        for(ProvinceTerritory p : provinces)
        {
            if(p != null)
                totalpop += p.getPopulation();
        }
        return totalpop;
    }
/**
 * @return the lowest population province
 */
    public String getLowestPopulation()
    {
        String ProName = null;
        int lowestPop = provinces.get(0).getPopulation();
        for(ProvinceTerritory p : provinces)
        {
            if(p != null && lowestPop > p.getPopulation())
            {
                lowestPop = p.getPopulation();
                ProName = p.getName();
            }
        }
        return ProName;
    }
/**
 * @return the highest population province
 */
        public String getHigestPopulation()
    {
        String ProName = null;
        int lowestPop = provinces.get(0).getPopulation();
        for(ProvinceTerritory p : provinces)
        {
            if(p != null && lowestPop < p.getPopulation())
            {
                lowestPop = p.getPopulation();
                ProName = p.getName();
            }
        }
        return ProName;
    }
/**
 * @return the population of the provinces
 */
    public int getPopulation(String province)
    {
        int NO_SUCH_PROVINCE = -1;
        
        for(ProvinceTerritory p : provinces)
        {
            if(p != null && province.equalsIgnoreCase(p.getName()))
            {
                return p.getPopulation();
            }
        }
        return NO_SUCH_PROVINCE;
    }
/**
 * @return true if the name enter is a province name of canada
 */
    public boolean isProvinceInCanada(String name)
    {
        for(ProvinceTerritory p : provinces)
        {
            if(name.equalsIgnoreCase(p.getName()))
            {
                return true;
            }
        }
        return false;
    }
/**
 * @return a list of provinces that has contains the string entered
 */
    public ProvinceTerritory[] getProvincesWhoseNameContains(String substring)
    {
        substring = substring.toLowerCase();
        ProvinceTerritory[] matchingProvinces;
        int index = 0;
        for(ProvinceTerritory p : provinces)
        {
            if(p != null && p.getName().toLowerCase().contains(substring))
            {
                index++;
            }
        }
        matchingProvinces = new ProvinceTerritory[index];
        int j = 0;
        for(ProvinceTerritory p : provinces)
        {
            if(p != null && p.getName().toLowerCase().contains(substring))
            {
                matchingProvinces[j] = new ProvinceTerritory(p.getName(), p.getPopulation());
                j++;
            }
        }
        return matchingProvinces;
    }
/**
 * @return an arraylist of provinces whos name contains the string entered
 */
    public ArrayList<ProvinceTerritory>
    getMoreProvincesWhoseNameContains(String substring)
    {
        substring = substring.toLowerCase();
        ArrayList<ProvinceTerritory> matchingProvinces;
        matchingProvinces = new ArrayList<ProvinceTerritory>();

        for(ProvinceTerritory p : provinces)
        {
            if(p != null && p.getName().toLowerCase().contains(substring))
            {
                matchingProvinces.add(new ProvinceTerritory(p.getName(),p.getPopulation()));
            }
        }
        return matchingProvinces;
    }
/**
 * @return an arraylist of provinces whose name starts with the char entered
 */
    public ArrayList<String>getProvincesWhoseNameStartsWith(char letter)
    {
        String substring = String.valueOf(letter);
        ArrayList<String> matchingProvinces;
        matchingProvinces = new ArrayList<String>();
        substring = substring.toLowerCase();

        for(ProvinceTerritory p : provinces)
        {
            if(p != null && p.getName().toLowerCase().startsWith(substring))
            {
                matchingProvinces.add(new String (p.getName()));
            }
        }
        
        return matchingProvinces;

    }

}
