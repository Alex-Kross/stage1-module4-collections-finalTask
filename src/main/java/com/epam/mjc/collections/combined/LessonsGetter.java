package com.epam.mjc.collections.combined;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Set<String> lessonsSet = new HashSet<>();
        for (Map.Entry<String, List<String>> entry : timetable.entrySet()) {
            for (String lesson : entry.getValue()) {
                lessonsSet.add(lesson);
            }

        }
        return lessonsSet;
    }
}
