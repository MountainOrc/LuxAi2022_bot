package com.luxai.lux.action;

import java.util.HashMap;
import java.util.Map;

public class UnitAction {

    public Map<String, Integer> actions;

    public UnitAction() {
        this.actions = new HashMap<>();
    }

    public void add(String unit_id, Integer action) {
        actions.put(unit_id, action);
    }

}