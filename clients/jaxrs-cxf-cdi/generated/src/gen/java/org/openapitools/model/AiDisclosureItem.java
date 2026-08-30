package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * AI disclosure declaration the creator has made about the Pin.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum AiDisclosureItem {

    @JsonProperty("AI_MODIFIED") AI_MODIFIED(String.valueOf("AI_MODIFIED")), @JsonProperty("SYNTHETIC_PERFORMER") SYNTHETIC_PERFORMER(String.valueOf("SYNTHETIC_PERFORMER"));


    private String value;

    AiDisclosureItem(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AiDisclosureItem fromValue(String value) {
        for (AiDisclosureItem b : AiDisclosureItem.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



