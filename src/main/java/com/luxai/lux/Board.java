package com.luxai.lux;

import java.util.ArrayList;
import java.util.Map;

public class Board {

    public int[][] rubble;
    public int[][] ore;
    public int[][] ice;
    public int[][] lichen;
    public int[][] lichen_strains;

    public Map<String, ArrayList<ArrayList<Integer>>> spawns;

    public int factories_per_team;

}
