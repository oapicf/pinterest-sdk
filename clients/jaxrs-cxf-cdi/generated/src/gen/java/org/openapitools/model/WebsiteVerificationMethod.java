package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Method used to verify website ownership.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum WebsiteVerificationMethod {

    @JsonProperty("FILENAME") FILENAME(String.valueOf("FILENAME")), @JsonProperty("METATAG") METATAG(String.valueOf("METATAG")), @JsonProperty("DNSTXT") DNSTXT(String.valueOf("DNSTXT"));


    private String value;

    WebsiteVerificationMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static WebsiteVerificationMethod fromValue(String value) {
        for (WebsiteVerificationMethod b : WebsiteVerificationMethod.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



