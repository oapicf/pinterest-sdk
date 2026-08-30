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
 * Collections ad header type for ads
 */

/**
 * Collections ad header type for ads
 */
public enum AdCollectionsHeaderType {
    
        SHOP_THIS_COLLECTION("SHOP_THIS_COLLECTION"),
        
        EXPLORE_THIS_COLLECTION("EXPLORE_THIS_COLLECTION"),
        
        NO_HEADER("NO_HEADER");

private String value;

AdCollectionsHeaderType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static AdCollectionsHeaderType fromValue(String text) {
for (AdCollectionsHeaderType b : AdCollectionsHeaderType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
return null;
}
}


