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
 * Method used to verify website ownership.
 */

/**
 * Method used to verify website ownership.
 */
public enum WebsiteVerificationMethod {
    
        FILENAME("FILENAME"),
        
        METATAG("METATAG"),
        
        DNSTXT("DNSTXT");

private String value;

WebsiteVerificationMethod(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static WebsiteVerificationMethod fromValue(String text) {
for (WebsiteVerificationMethod b : WebsiteVerificationMethod.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


