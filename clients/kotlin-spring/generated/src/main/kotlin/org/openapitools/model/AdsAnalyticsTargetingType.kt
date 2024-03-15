package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
* Reporting targeting type
* Values: KEYWORD,APPTYPE,GENDER,LOCATION,PLACEMENT,COUNTRY,TARGETED_INTEREST,PINNER_INTEREST,AUDIENCE_INCLUDE,GEO,AGE_BUCKET,REGION
*/
enum class AdsAnalyticsTargetingType(val value: kotlin.String) {

    @JsonProperty("KEYWORD") KEYWORD("KEYWORD"),
    @JsonProperty("APPTYPE") APPTYPE("APPTYPE"),
    @JsonProperty("GENDER") GENDER("GENDER"),
    @JsonProperty("LOCATION") LOCATION("LOCATION"),
    @JsonProperty("PLACEMENT") PLACEMENT("PLACEMENT"),
    @JsonProperty("COUNTRY") COUNTRY("COUNTRY"),
    @JsonProperty("TARGETED_INTEREST") TARGETED_INTEREST("TARGETED_INTEREST"),
    @JsonProperty("PINNER_INTEREST") PINNER_INTEREST("PINNER_INTEREST"),
    @JsonProperty("AUDIENCE_INCLUDE") AUDIENCE_INCLUDE("AUDIENCE_INCLUDE"),
    @JsonProperty("GEO") GEO("GEO"),
    @JsonProperty("AGE_BUCKET") AGE_BUCKET("AGE_BUCKET"),
    @JsonProperty("REGION") REGION("REGION")
}

