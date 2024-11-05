package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum AdvancedAuctionOperation {

    @JsonProperty("UPSERT") UPSERT(String.valueOf("UPSERT")), @JsonProperty("DELETE") DELETE(String.valueOf("DELETE"));


    private String value;

    AdvancedAuctionOperation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AdvancedAuctionOperation fromValue(String value) {
        for (AdvancedAuctionOperation b : AdvancedAuctionOperation.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



