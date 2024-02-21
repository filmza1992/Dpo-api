package com.dpo.constant;


import java.util.HashMap;
import java.util.Map;

public enum CowStatus {

    ACTIVE(0L),INACTIVE(1L);

    private final Long id;

    private static final Map<Long, CowStatus> lookup = new HashMap<>();

    static {
        for (CowStatus d : CowStatus.values()) {
            lookup.put(d.id, d);
        }
    }

    private CowStatus(Long id) {
        this.id = id;
    }

    public static CowStatus get(Long abbreviation) {
        return lookup.get(abbreviation);
    }

    public Long getId() {
        return id;
    }
    
}
