package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum DisclosureType {

    NO_DISCLOSURE("NO_DISCLOSURE"),
    
    PRESCRIBING_INFORMATION("PRESCRIBING_INFORMATION"),
    
    PRESCRIBING_INFORMATION_BOX_WARNING("PRESCRIBING_INFORMATION_BOX_WARNING"),
    
    IMPORTANT_SAFETY_INFO("IMPORTANT_SAFETY_INFO"),
    
    MED_GUIDE("MED_GUIDE"),
    
    PATIENT_INFORMATION("PATIENT_INFORMATION")

    private final String value

    DisclosureType(String value) {
        this.value = value
    }

    String getValue() {
        value
    }

    @Override
    String toString() {
        String.valueOf(value)
    }
}
