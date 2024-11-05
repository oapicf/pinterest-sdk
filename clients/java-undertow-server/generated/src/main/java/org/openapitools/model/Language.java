/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.14.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Language code, which is among the offical ISO 639-1 language list.
 */

/**
 * Language code, which is among the offical ISO 639-1 language list.
 */
public enum Language {
    
        AM("AM"),
        
        AR("AR"),
        
        AZ("AZ"),
        
        BG("BG"),
        
        BN("BN"),
        
        BS("BS"),
        
        CA("CA"),
        
        CS("CS"),
        
        DA("DA"),
        
        DV("DV"),
        
        DZ("DZ"),
        
        DE("DE"),
        
        EL("EL"),
        
        EN("EN"),
        
        ES("ES"),
        
        ET("ET"),
        
        FA("FA"),
        
        FI("FI"),
        
        FR("FR"),
        
        HE("HE"),
        
        HI("HI"),
        
        HR("HR"),
        
        HU("HU"),
        
        HY("HY"),
        
        ID("ID"),
        
        IN("IN"),
        
        IS("IS"),
        
        IT("IT"),
        
        IW("IW"),
        
        JA("JA"),
        
        KA("KA"),
        
        KM("KM"),
        
        KO("KO"),
        
        LO("LO"),
        
        LT("LT"),
        
        LV("LV"),
        
        MK("MK"),
        
        MN("MN"),
        
        MS("MS"),
        
        MY("MY"),
        
        NB("NB"),
        
        NE("NE"),
        
        NL("NL"),
        
        NO("NO"),
        
        PL("PL"),
        
        PT("PT"),
        
        RO("RO"),
        
        RU("RU"),
        
        SK("SK"),
        
        SL("SL"),
        
        SQ("SQ"),
        
        SR("SR"),
        
        SV("SV"),
        
        TL("TL"),
        
        UK("UK"),
        
        VI("VI"),
        
        TE("TE"),
        
        TH("TH"),
        
        TR("TR"),
        
        XX("XX"),
        
        ZH("ZH");

private String value;

Language(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static Language fromValue(String text) {
for (Language b : Language.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


