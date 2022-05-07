package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;

/**
 * Campaign objective type.
 **/

public enum ObjectiveType {

    AWARENESS(String.valueOf("AWARENESS")), CONSIDERATION(String.valueOf("CONSIDERATION")), VIDEO_VIEW(String.valueOf("VIDEO_VIEW")), WEB_CONVERSION(String.valueOf("WEB_CONVERSION")), CATALOG_SALES(String.valueOf("CATALOG_SALES")), WEB_SESSIONS(String.valueOf("WEB_SESSIONS")), AWARENESS_RESERVED(String.valueOf("AWARENESS_RESERVED")), ENGAGEMENT(String.valueOf("ENGAGEMENT"));


    private String value;

    ObjectiveType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ObjectiveType fromValue(String value) {
        for (ObjectiveType b : ObjectiveType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



