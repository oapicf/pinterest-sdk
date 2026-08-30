package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Disclosure label for AI-generated or AI-modified content in a catalog item asset.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum CatalogsAiContentDisclosureLabel {

    @JsonProperty("ai_modified") AI_MODIFIED(String.valueOf("ai_modified")), @JsonProperty("synthetic_performer") SYNTHETIC_PERFORMER(String.valueOf("synthetic_performer"));


    private String value;

    CatalogsAiContentDisclosureLabel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CatalogsAiContentDisclosureLabel fromValue(String value) {
        for (CatalogsAiContentDisclosureLabel b : CatalogsAiContentDisclosureLabel.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



