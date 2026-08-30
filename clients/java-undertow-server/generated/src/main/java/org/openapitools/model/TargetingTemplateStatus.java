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
 * Indicate targeting template is active or Deleted
 */

/**
 * Indicate targeting template is active or Deleted
 */
public enum TargetingTemplateStatus {
    
        ACTIVE("ACTIVE"),
        
        DELETED("DELETED");

private String value;

TargetingTemplateStatus(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static TargetingTemplateStatus fromValue(String text) {
for (TargetingTemplateStatus b : TargetingTemplateStatus.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


