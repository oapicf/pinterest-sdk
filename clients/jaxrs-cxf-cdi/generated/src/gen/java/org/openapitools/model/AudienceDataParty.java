package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Whether the data is owned by the partner (1p) or by the data provider (3p)
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum AudienceDataParty {

    @JsonProperty("1p") _1P(String.valueOf("1p")), @JsonProperty("3p") _3P(String.valueOf("3p"));


    private String value;

    AudienceDataParty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AudienceDataParty fromValue(String value) {
        for (AudienceDataParty b : AudienceDataParty.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



