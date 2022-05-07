/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.3.0
 * Maintained by: pinterest-api@pinterest.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Status for catalogs entities. Present in catalogs_feed values. When a feed is deleted, the response will inform DELETED as status.
 */

/**
 * Status for catalogs entities. Present in catalogs_feed values. When a feed is deleted, the response will inform DELETED as status.
 */
public enum CatalogsStatus {
    
        ACTIVE("ACTIVE"),
        
        INACTIVE("INACTIVE");

private String value;

CatalogsStatus(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static CatalogsStatus fromValue(String text) {
for (CatalogsStatus b : CatalogsStatus.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


