/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.28.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;




/**
 * Gets or Sets MMMReportLevel
 */
public enum MMMReportLevel {
    
        CAMPAIGN_TARGETING("CAMPAIGN_TARGETING"),
        
        AD_GROUP_TARGETING("AD_GROUP_TARGETING");

private String value;

MMMReportLevel(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static MMMReportLevel fromValue(String text) {
for (MMMReportLevel b : MMMReportLevel.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


