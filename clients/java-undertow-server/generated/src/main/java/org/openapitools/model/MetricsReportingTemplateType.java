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
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Reporting template type
 */

/**
 * Reporting template type
 */
public enum MetricsReportingTemplateType {
    
        UNSPECIFIED("UNSPECIFIED"),
        
        BULK("BULK"),
        
        OVERVIEW("OVERVIEW"),
        
        TABLE("TABLE"),
        
        MMM("MMM"),
        
        BRAND_CATEGORY("BRAND_CATEGORY");

private String value;

MetricsReportingTemplateType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static MetricsReportingTemplateType fromValue(String text) {
for (MetricsReportingTemplateType b : MetricsReportingTemplateType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


