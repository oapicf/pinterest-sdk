package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Advertiser&#39;s ISO two character country code.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum TargetingAdvertiserCountry {

    @JsonProperty("US") US(String.valueOf("US")), @JsonProperty("GB") GB(String.valueOf("GB")), @JsonProperty("CA") CA(String.valueOf("CA")), @JsonProperty("IE") IE(String.valueOf("IE")), @JsonProperty("AU") AU(String.valueOf("AU")), @JsonProperty("NZ") NZ(String.valueOf("NZ")), @JsonProperty("FR") FR(String.valueOf("FR")), @JsonProperty("SE") SE(String.valueOf("SE")), @JsonProperty("IL") IL(String.valueOf("IL")), @JsonProperty("DE") DE(String.valueOf("DE")), @JsonProperty("AT") AT(String.valueOf("AT")), @JsonProperty("IT") IT(String.valueOf("IT")), @JsonProperty("ES") ES(String.valueOf("ES")), @JsonProperty("NL") NL(String.valueOf("NL")), @JsonProperty("BE") BE(String.valueOf("BE")), @JsonProperty("PT") PT(String.valueOf("PT")), @JsonProperty("CH") CH(String.valueOf("CH")), @JsonProperty("HK") HK(String.valueOf("HK")), @JsonProperty("JP") JP(String.valueOf("JP")), @JsonProperty("KR") KR(String.valueOf("KR")), @JsonProperty("SG") SG(String.valueOf("SG")), @JsonProperty("NO") NO(String.valueOf("NO")), @JsonProperty("DK") DK(String.valueOf("DK")), @JsonProperty("FI") FI(String.valueOf("FI")), @JsonProperty("CY") CY(String.valueOf("CY")), @JsonProperty("LU") LU(String.valueOf("LU")), @JsonProperty("MT") MT(String.valueOf("MT")), @JsonProperty("PL") PL(String.valueOf("PL")), @JsonProperty("RO") RO(String.valueOf("RO")), @JsonProperty("HU") HU(String.valueOf("HU")), @JsonProperty("CZ") CZ(String.valueOf("CZ")), @JsonProperty("GR") GR(String.valueOf("GR")), @JsonProperty("SK") SK(String.valueOf("SK")), @JsonProperty("BR") BR(String.valueOf("BR")), @JsonProperty("MX") MX(String.valueOf("MX")), @JsonProperty("AR") AR(String.valueOf("AR")), @JsonProperty("CL") CL(String.valueOf("CL")), @JsonProperty("CO") CO(String.valueOf("CO"));


    private String value;

    TargetingAdvertiserCountry(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TargetingAdvertiserCountry fromValue(String value) {
        for (TargetingAdvertiserCountry b : TargetingAdvertiserCountry.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return null;
    }
}



