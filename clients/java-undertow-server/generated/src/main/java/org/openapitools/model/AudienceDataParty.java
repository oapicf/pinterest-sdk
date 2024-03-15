/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.12.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Whether the data is owned by the partner (1p) or by the data provider (3p)
 */

/**
 * Whether the data is owned by the partner (1p) or by the data provider (3p)
 */
public enum AudienceDataParty {
    
        _1P("1p"),
        
        _3P("3p");

private String value;

AudienceDataParty(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static AudienceDataParty fromValue(String text) {
for (AudienceDataParty b : AudienceDataParty.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


