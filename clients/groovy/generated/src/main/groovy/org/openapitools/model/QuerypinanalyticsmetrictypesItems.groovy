package org.openapitools.model;

import groovy.transform.Canonical

enum QuerypinanalyticsmetrictypesItems {

    IMPRESSION("IMPRESSION"),
    
    OUTBOUND_CLICK("OUTBOUND_CLICK"),
    
    PIN_CLICK("PIN_CLICK"),
    
    SAVE("SAVE"),
    
    SAVE_RATE("SAVE_RATE"),
    
    TOTAL_COMMENTS("TOTAL_COMMENTS"),
    
    TOTAL_REACTIONS("TOTAL_REACTIONS"),
    
    USER_FOLLOW("USER_FOLLOW"),
    
    PROFILE_VISIT("PROFILE_VISIT"),
    
    VIDEO_MRC_VIEW("VIDEO_MRC_VIEW"),
    
    VIDEO_10_S_VIEW("VIDEO_10S_VIEW"),
    
    QUARTILE_95_PERCENT_VIEW("QUARTILE_95_PERCENT_VIEW"),
    
    VIDEO_V50_WATCH_TIME("VIDEO_V50_WATCH_TIME"),
    
    VIDEO_START("VIDEO_START"),
    
    VIDEO_AVG_WATCH_TIME("VIDEO_AVG_WATCH_TIME")

    private final String value

    QuerypinanalyticsmetrictypesItems(String value) {
        this.value = value
    }

    String getValue() {
        value
    }

    @Override
    String toString() {
        String.valueOf(value)
    }
}
