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
 * Advertiser's ISO two character country code.
 */

/**
 * Advertiser's ISO two character country code.
 */
public enum TargetingAdvertiserCountry {
    
        US("US"),
        
        GB("GB"),
        
        CA("CA"),
        
        IE("IE"),
        
        AU("AU"),
        
        NZ("NZ"),
        
        FR("FR"),
        
        SE("SE"),
        
        IL("IL"),
        
        DE("DE"),
        
        AT("AT"),
        
        IT("IT"),
        
        ES("ES"),
        
        NL("NL"),
        
        BE("BE"),
        
        PT("PT"),
        
        CH("CH"),
        
        HK("HK"),
        
        JP("JP"),
        
        KR("KR"),
        
        SG("SG"),
        
        NO("NO"),
        
        DK("DK"),
        
        FI("FI"),
        
        CY("CY"),
        
        LU("LU"),
        
        MT("MT"),
        
        PL("PL"),
        
        RO("RO"),
        
        HU("HU"),
        
        CZ("CZ"),
        
        GR("GR"),
        
        SK("SK"),
        
        BR("BR"),
        
        MX("MX"),
        
        AR("AR"),
        
        CL("CL"),
        
        CO("CO");

private String value;

TargetingAdvertiserCountry(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static TargetingAdvertiserCountry fromValue(String text) {
for (TargetingAdvertiserCountry b : TargetingAdvertiserCountry.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
return null;
}
}


