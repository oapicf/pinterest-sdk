package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
* Reporting targeting type
* Values: kEYWORD,aPPTYPE,gENDER,lOCATION,pLACEMENT,cOUNTRY,tARGETEDINTEREST,pINNERINTEREST,aUDIENCEINCLUDE,aUDIENCEEXCLUDE,gEO,aGEBUCKET,rEGION
*/
enum class AdsAnalyticsTargetingType(val value: kotlin.String) {

    @JsonProperty("KEYWORD") kEYWORD("KEYWORD"),

    @JsonProperty("APPTYPE") aPPTYPE("APPTYPE"),

    @JsonProperty("GENDER") gENDER("GENDER"),

    @JsonProperty("LOCATION") lOCATION("LOCATION"),

    @JsonProperty("PLACEMENT") pLACEMENT("PLACEMENT"),

    @JsonProperty("COUNTRY") cOUNTRY("COUNTRY"),

    @JsonProperty("TARGETED_INTEREST") tARGETEDINTEREST("TARGETED_INTEREST"),

    @JsonProperty("PINNER_INTEREST") pINNERINTEREST("PINNER_INTEREST"),

    @JsonProperty("AUDIENCE_INCLUDE") aUDIENCEINCLUDE("AUDIENCE_INCLUDE"),

    @JsonProperty("AUDIENCE_EXCLUDE") aUDIENCEEXCLUDE("AUDIENCE_EXCLUDE"),

    @JsonProperty("GEO") gEO("GEO"),

    @JsonProperty("AGE_BUCKET") aGEBUCKET("AGE_BUCKET"),

    @JsonProperty("REGION") rEGION("REGION");

}

