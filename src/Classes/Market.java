package Classes;

import java.util.List;


import java.util.ArrayList;
import java.util.HashMap;
public class Market{
    private List<Laptop> listLap;

    public Market() {
        listLap = new ArrayList<Laptop>();
    }

    public void addItem(Laptop laptop){
        listLap.add(laptop);
    }

    
    public List<Laptop> LaptopFilter(HashMap<String, String> filters) {
        List<Laptop> filterLaptops = new ArrayList<>();
        for (Laptop laptop : listLap) {
            boolean FilterOK = false;

            for (String filterField : filters.keySet()) {
                String filterValue = filters.get(filterField).toLowerCase();

                switch (filterField) {
                    case "ram":
                        if (laptop.getRAM() >= Integer.parseInt(filterValue)) {
                            FilterOK = true;
                        }
                        break;
                    case "hdd":
                        if (laptop.getHDD() >= Integer.parseInt(filterValue)) {
                            FilterOK = true;
                        }
                        break;
                    case "os":
                        if (laptop.getOs().toLowerCase().equals(filterValue))
                        FilterOK = true;
                        break;
                        
                    case "color":
                        if(laptop.getColor().toLowerCase().equals(filterValue))
                        FilterOK = true;  
                        break;
                        
                    default:
                        throw new IllegalArgumentException("Некорректный критерий фильтрации:" + filterField);
                }
            }
            if (FilterOK) {
                filterLaptops.add(laptop);
            }
            
        }
        return filterLaptops;
    }

    
    public String getFilterValue(String filter) {
        switch (filter) {
            case "1":
                return "ram";
            case "2":
                return "hdd";
            case "3":
                return "os";
            case "4":
                return "color";
            default:
                throw new IllegalArgumentException("Неверный критерий фильтрации");
        }
        
    }


    
}
