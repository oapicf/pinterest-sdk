package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Type of information in the page referenced by `disclosure_url`, provided either by the Food and Drug Administration (FDA) or the manufacturer.
 */

public enum DisclosureType {

    NO_DISCLOSURE("NO_DISCLOSURE"),
    PRESCRIBING_INFORMATION("PRESCRIBING_INFORMATION"),
    PRESCRIBING_INFORMATION_BOX_WARNING("PRESCRIBING_INFORMATION_BOX_WARNING"),
    IMPORTANT_SAFETY_INFO("IMPORTANT_SAFETY_INFO"),
    MED_GUIDE("MED_GUIDE"),
    PATIENT_INFORMATION("PATIENT_INFORMATION");

    private String value;

    DisclosureType(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static DisclosureType fromValue(String text) {
        for (DisclosureType b : DisclosureType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

