package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Summary status for campaign
 */

public enum SummaryStatus {

    RUNNING("RUNNING"),
    PAUSED("PAUSED"),
    NOT_STARTED("NOT_STARTED"),
    COMPLETED("COMPLETED"),
    ADVERTISER_DISABLED("ADVERTISER_DISABLED"),
    ARCHIVED("ARCHIVED"),
    DRAFT("DRAFT"),
    DELETED_DRAFT("DELETED_DRAFT");

    private String value;

    SummaryStatus(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static SummaryStatus fromValue(String text) {
        for (SummaryStatus b : SummaryStatus.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

