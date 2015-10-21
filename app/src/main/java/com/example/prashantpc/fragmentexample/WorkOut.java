package com.example.prashantpc.fragmentexample;

/**
 * Created by PrashantPC on 17-10-2015.
 */
public class WorkOut {
    private String name;
    private String Description;

    public static final WorkOut[] workOuts = {
            new WorkOut("The Limb Loosener",
                    "Do The Limm Loosener Do the Limb Loosner"),
            new WorkOut("Core Agony",
                    "Do the Core Agony Do the core Agony"),
            new WorkOut("Strength and Length",
                    "Do the Strngth and Length Do the Strength and Lenght")
    };

    public WorkOut(String name, String Description){
        this.name = name;
        this.Description = Description;
    }

    public String getDescription() {
        return Description;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return this.name;
    }
}
