package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum TargetingSpecAgeBucket {

    @JsonProperty("18-24") _18_24(String.valueOf("18-24")), @JsonProperty("19+") _19_(String.valueOf("19+")), @JsonProperty("20+") _20_(String.valueOf("20+")), @JsonProperty("21+") _21_(String.valueOf("21+")), @JsonProperty("25-34") _25_34(String.valueOf("25-34")), @JsonProperty("35-44") _35_44(String.valueOf("35-44")), @JsonProperty("45-49") _45_49(String.valueOf("45-49")), @JsonProperty("50-54") _50_54(String.valueOf("50-54")), @JsonProperty("55-64") _55_64(String.valueOf("55-64")), @JsonProperty("65+") _65_(String.valueOf("65+"));


    private String value;

    TargetingSpecAgeBucket(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TargetingSpecAgeBucket fromValue(String value) {
        for (TargetingSpecAgeBucket b : TargetingSpecAgeBucket.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



