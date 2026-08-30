package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Collections ad header type for ads
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum AdCollectionsHeaderType {

    @JsonProperty("SHOP_THIS_COLLECTION") SHOP_THIS_COLLECTION(String.valueOf("SHOP_THIS_COLLECTION")), @JsonProperty("EXPLORE_THIS_COLLECTION") EXPLORE_THIS_COLLECTION(String.valueOf("EXPLORE_THIS_COLLECTION")), @JsonProperty("NO_HEADER") NO_HEADER(String.valueOf("NO_HEADER"));


    private String value;

    AdCollectionsHeaderType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AdCollectionsHeaderType fromValue(String value) {
        for (AdCollectionsHeaderType b : AdCollectionsHeaderType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return null;
    }
}



