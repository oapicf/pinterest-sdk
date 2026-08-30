package org.openapitools.model;

import groovy.transform.Canonical

enum QueryvideopinmetrictypesItems {

    IMPRESSION("IMPRESSION"),
    
    SAVE("SAVE"),
    
    VIDEO_MRC_VIEW("VIDEO_MRC_VIEW"),
    
    VIDEO_AVG_WATCH_TIME("VIDEO_AVG_WATCH_TIME"),
    
    VIDEO_V50_WATCH_TIME("VIDEO_V50_WATCH_TIME"),
    
    QUARTILE_95_PERCENT_VIEW("QUARTILE_95_PERCENT_VIEW"),
    
    VIDEO_10_S_VIEW("VIDEO_10S_VIEW"),
    
    VIDEO_START("VIDEO_START"),
    
    OUTBOUND_CLICK("OUTBOUND_CLICK")

    private final String value

    QueryvideopinmetrictypesItems(String value) {
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
