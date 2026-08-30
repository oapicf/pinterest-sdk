package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Type of network connection.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum NetworkType {

    @JsonProperty("wifi") WIFI(String.valueOf("wifi")), @JsonProperty("cellular_2g") CELLULAR_2G(String.valueOf("cellular_2g")), @JsonProperty("cellular_3g") CELLULAR_3G(String.valueOf("cellular_3g")), @JsonProperty("cellular_4g") CELLULAR_4G(String.valueOf("cellular_4g")), @JsonProperty("cellular_5g") CELLULAR_5G(String.valueOf("cellular_5g")), @JsonProperty("cellular_6g") CELLULAR_6G(String.valueOf("cellular_6g")), @JsonProperty("ethernet") ETHERNET(String.valueOf("ethernet")), @JsonProperty("unknown") UNKNOWN(String.valueOf("unknown"));


    private String value;

    NetworkType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static NetworkType fromValue(String value) {
        for (NetworkType b : NetworkType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



