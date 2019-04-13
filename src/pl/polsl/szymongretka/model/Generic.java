package pl.polsl.szymongretka.model;

import java.util.HashMap;
import java.util.Map;

public class Generic<K, V>{

    Map<K, V> map = new HashMap<>();

    public Map<K, V> getMap(Map<K, V> map){
        return map;
    }

}
