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
 * Disclosure label for AI-generated or AI-modified content in a catalog item asset.
 */

/**
 * Disclosure label for AI-generated or AI-modified content in a catalog item asset.
 */
public enum CatalogsAiContentDisclosureLabel {
    
        AI_MODIFIED("ai_modified"),
        
        SYNTHETIC_PERFORMER("synthetic_performer");

private String value;

CatalogsAiContentDisclosureLabel(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static CatalogsAiContentDisclosureLabel fromValue(String text) {
for (CatalogsAiContentDisclosureLabel b : CatalogsAiContentDisclosureLabel.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


