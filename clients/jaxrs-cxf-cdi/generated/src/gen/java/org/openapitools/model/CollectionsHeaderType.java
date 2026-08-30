package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Collections ad header type
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum CollectionsHeaderType {

    @JsonProperty("SHOP_THIS_COLLECTION") SHOP_THIS_COLLECTION(String.valueOf("SHOP_THIS_COLLECTION")), @JsonProperty("EXPLORE_THIS_COLLECTION") EXPLORE_THIS_COLLECTION(String.valueOf("EXPLORE_THIS_COLLECTION")), @JsonProperty("NO_HEADER") NO_HEADER(String.valueOf("NO_HEADER")), @JsonProperty("ON_SALE") ON_SALE(String.valueOf("ON_SALE")), @JsonProperty("GET_DEAL") GET_DEAL(String.valueOf("GET_DEAL"));


    private String value;

    CollectionsHeaderType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CollectionsHeaderType fromValue(String value) {
        for (CollectionsHeaderType b : CollectionsHeaderType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return null;
    }
}



