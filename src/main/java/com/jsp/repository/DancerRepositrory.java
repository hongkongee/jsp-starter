package com.jsp.repository;

import com.jsp.entity.Dancer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DancerRepositrory {
    // DB 역할을 할 static final Map -> 나중에는 진짜 DB로
    private static final Map<String, Dancer> dancerMap = new HashMap<>();

    // 댄서 저장 기능
    public static void save(String name, String crewName,
                     String danceLevel, String[] genresArray) {
        // Dancer 객체로 포장
        Dancer dancer = new Dancer();
        dancer.setName(name);
        dancer.setCrewName(crewName);
        dancer.setDanceLevel(Dancer.DanceLevel.valueOf(danceLevel));

        List<Dancer.Genre> genres = new ArrayList<>();
        if (genresArray != null) {
            for (String g : genresArray) {
                genres.add(Dancer.Genre.valueOf(g));
            }
        }
        dancer.setGenres(genres);

        System.out.println("dancer = " + dancer);


        // dancerMap에 저장
        dancerMap.put(name, dancer);
    }

    // 댄서 맵을 리스트로 변환해서 리턴하는 메서드
    public static List<Dancer> findAll() {

        return new ArrayList<>(dancerMap.values());

        /*return dancerMap.values().stream()
                .collect(Collectors.toList());*/

        /*List<Dancer> dancerList = new ArrayList<>();
        for (Dancer dancer : dancerMap.values()) {
            dancerList.add(dancer);
        }
        return dancerList;*/
    }

    // 댄서 맵에서 댄서 객체를 삭제하는 기능
    public static void delete(String name) {
        dancerMap.remove(name);
    }
}
