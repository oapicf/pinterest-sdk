package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Type of information in the page referenced by &#x60;disclosure_url&#x60;, provided either by the Food and Drug Administration (FDA) or the manufacturer.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum DisclosureType {

    @JsonProperty("NO_DISCLOSURE") NO_DISCLOSURE(String.valueOf("NO_DISCLOSURE")), @JsonProperty("PRESCRIBING_INFORMATION") PRESCRIBING_INFORMATION(String.valueOf("PRESCRIBING_INFORMATION")), @JsonProperty("PRESCRIBING_INFORMATION_BOX_WARNING") PRESCRIBING_INFORMATION_BOX_WARNING(String.valueOf("PRESCRIBING_INFORMATION_BOX_WARNING")), @JsonProperty("IMPORTANT_SAFETY_INFO") IMPORTANT_SAFETY_INFO(String.valueOf("IMPORTANT_SAFETY_INFO")), @JsonProperty("MED_GUIDE") MED_GUIDE(String.valueOf("MED_GUIDE")), @JsonProperty("PATIENT_INFORMATION") PATIENT_INFORMATION(String.valueOf("PATIENT_INFORMATION"));


    private String value;

    DisclosureType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static DisclosureType fromValue(String value) {
        for (DisclosureType b : DisclosureType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return null;
    }
}



