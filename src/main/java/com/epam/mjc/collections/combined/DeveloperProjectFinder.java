package com.epam.mjc.collections.combined;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> listOfCompany = new ArrayList<>();

        for (Map.Entry<String, Set<String>> entry : projects.entrySet()) {
            if (entry.getValue().contains(developer)) {
                listOfCompany.add(entry.getKey());
            }
        }
        listOfCompany.sort(new DescendingByLengthNameComparator());
        return listOfCompany;
    }

    class DescendingByLengthNameComparator implements Comparator<String> {

        @Override
        public int compare(String nameCompany1, String nameCompany2) {
            int sizeNameCompany1 = nameCompany1.length();
            int sizeNameCompany2 = nameCompany2.length();
            int result = 0;

            if (sizeNameCompany1 > sizeNameCompany2) {
                result = -1;
            } else if (sizeNameCompany1 < sizeNameCompany2) {
                result = 1;
            } else {
                int resCompareByLetter = nameCompany1.compareTo(nameCompany2);
                if (resCompareByLetter > 0){
                    result = 1;
                } else if (resCompareByLetter < 0) {
                    result = -1;
                }
            }
            return result;
        }
    }

}
