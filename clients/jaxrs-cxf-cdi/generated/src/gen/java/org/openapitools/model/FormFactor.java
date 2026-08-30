package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Device form factor
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum FormFactor {

    @JsonProperty("desktop") DESKTOP(String.valueOf("desktop")), @JsonProperty("laptop") LAPTOP(String.valueOf("laptop")), @JsonProperty("cellphone") CELLPHONE(String.valueOf("cellphone")), @JsonProperty("tablet") TABLET(String.valueOf("tablet")), @JsonProperty("smartwatch") SMARTWATCH(String.valueOf("smartwatch")), @JsonProperty("tv") TV(String.valueOf("tv")), @JsonProperty("vr") VR(String.valueOf("vr")), @JsonProperty("console") CONSOLE(String.valueOf("console")), @JsonProperty("other") OTHER(String.valueOf("other"));


    private String value;

    FormFactor(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static FormFactor fromValue(String value) {
        for (FormFactor b : FormFactor.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



