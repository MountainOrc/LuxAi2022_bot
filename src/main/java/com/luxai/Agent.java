package com.luxai;

import com.luxai.lux.Environment;
import com.luxai.lux.Info;
import com.luxai.lux.Obs;
import com.luxai.lux.State;
import com.luxai.lux.action.SpawnAction;

import java.util.ArrayList;
import java.util.Random;

public class Agent {

    private Obs obs;
    private int step;
    private int remainingOverageTime;
    private String player;
    private Environment env_cfg;
    private double reward;

    public String early_setup() {
//        # how many factories you have left to place
//        factories_to_place = game_state.teams[self.player].factories_to_place
//        if factories_to_place > 0:
//                # we will spawn our factory in a random location with 100 metal and water
//                potential_spawns = game_state.board.spawns[self.player]
//        spawn_loc = potential_spawns[np.random.randint(0, len(potential_spawns))]
//        return dict(spawn=spawn_loc, metal=100, water=100)
//        return dict()
        Random random = new Random();
        ArrayList<ArrayList<Integer>> mySpawn = this.obs.board.spawns.get(getMe());
        if (this.obs.teams.get(getMe()).factories_to_place > 0)
            return("{IT IS MY LIFE}");
        //SpawnAction spawnAction = new SpawnAction(//new int[], 100, 100);
        return "{}";
    }

    public String act() {
        return "{}";
    }

    public String getMe() {
        return this.player;
    }

    public Obs getObs() {
        return obs;
    }

    public int getStep() {
        return step;
    }

    public int getRemainingOverageTime() {
        return remainingOverageTime;
    }

    public String getPlayer() {
        return player;
    }

    public Environment getEnv_cfg() {
        return env_cfg;
    }

    public double getReward() {
        return reward;
    }

    public void setObs(Obs obs) {
        this.obs = obs;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public void setRemainingOverageTime(int remainingOverageTime) {
        this.remainingOverageTime = remainingOverageTime;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public void setEnv_cfg(Environment env_cfg) {
        this.env_cfg = env_cfg;
    }

    public void setReward(double reward) {
        this.reward = reward;
    }

}
