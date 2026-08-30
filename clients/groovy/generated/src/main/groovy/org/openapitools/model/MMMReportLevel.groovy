package org.openapitools.model;

import groovy.transform.Canonical

enum MMMReportLevel {

    CAMPAIGN_TARGETING("CAMPAIGN_TARGETING"),
    
    AD_GROUP_TARGETING("AD_GROUP_TARGETING")

    private final String value

    MMMReportLevel(String value) {
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
