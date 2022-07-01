/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.3.0
 * Maintained by: blah@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Catalog product group type
 */

/**
 * Catalog product group type
 */
public enum CatalogsProductGroupType {
    
        MERCHANT_CREATED("MERCHANT_CREATED"),
        
        ALL_PRODUCTS("ALL_PRODUCTS"),
        
        BEST_DEALS("BEST_DEALS"),
        
        PINNER_FAVORITES("PINNER_FAVORITES"),
        
        TOP_SELLERS("TOP_SELLERS"),
        
        BACK_IN_STOCK("BACK_IN_STOCK"),
        
        NEW_ARRIVALS("NEW_ARRIVALS");

private String value;

CatalogsProductGroupType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static CatalogsProductGroupType fromValue(String text) {
for (CatalogsProductGroupType b : CatalogsProductGroupType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


