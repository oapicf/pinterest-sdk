package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum TrendsSupportedRegion {

    @JsonProperty("US") US(String.valueOf("US")), @JsonProperty("CA") CA(String.valueOf("CA")), @JsonProperty("DE") DE(String.valueOf("DE")), @JsonProperty("FR") FR(String.valueOf("FR")), @JsonProperty("ES") ES(String.valueOf("ES")), @JsonProperty("IT") IT(String.valueOf("IT")), @JsonProperty("DE+AT+CH") DE_AT_CH(String.valueOf("DE+AT+CH")), @JsonProperty("GB+IE") GB_IE(String.valueOf("GB+IE")), @JsonProperty("IT+ES+PT+GR+MT") IT_ES_PT_GR_MT(String.valueOf("IT+ES+PT+GR+MT")), @JsonProperty("PL+RO+HU+SK+CZ") PL_RO_HU_SK_CZ(String.valueOf("PL+RO+HU+SK+CZ")), @JsonProperty("SE+DK+FI+NO") SE_DK_FI_NO(String.valueOf("SE+DK+FI+NO")), @JsonProperty("NL+BE+LU") NL_BE_LU(String.valueOf("NL+BE+LU")), @JsonProperty("AR") AR(String.valueOf("AR")), @JsonProperty("BR") BR(String.valueOf("BR")), @JsonProperty("CO") CO(String.valueOf("CO")), @JsonProperty("MX") MX(String.valueOf("MX")), @JsonProperty("MX+AR+CO+CL") MX_AR_CO_CL(String.valueOf("MX+AR+CO+CL")), @JsonProperty("AU+NZ") AU_NZ(String.valueOf("AU+NZ"));


    private String value;

    TrendsSupportedRegion(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TrendsSupportedRegion fromValue(String value) {
        for (TrendsSupportedRegion b : TrendsSupportedRegion.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



