package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.JsonCreator
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
* Values: KEYWORD,APPTYPE,GENDER,LOCATION,PLACEMENT,COUNTRY,TARGETED_INTEREST,PINNER_INTEREST,AUDIENCE_INCLUDE,GEO,AGE_BUCKET,REGION,MEDIA_TYPE,AGE_BUCKET_AND_GENDER,AUDIENCE_MULTIPLIER,CREATIVE_ENHANCEMENTS,LOCAL_ADS_STORE_CODE
*/
enum class AdAdsAnalyticsAsyncTargetingTypes(@get:JsonValue val value: kotlin.String) {

    KEYWORD("KEYWORD"),
    APPTYPE("APPTYPE"),
    GENDER("GENDER"),
    LOCATION("LOCATION"),
    PLACEMENT("PLACEMENT"),
    COUNTRY("COUNTRY"),
    TARGETED_INTEREST("TARGETED_INTEREST"),
    PINNER_INTEREST("PINNER_INTEREST"),
    AUDIENCE_INCLUDE("AUDIENCE_INCLUDE"),
    GEO("GEO"),
    AGE_BUCKET("AGE_BUCKET"),
    REGION("REGION"),
    MEDIA_TYPE("MEDIA_TYPE"),
    AGE_BUCKET_AND_GENDER("AGE_BUCKET_AND_GENDER"),
    AUDIENCE_MULTIPLIER("AUDIENCE_MULTIPLIER"),
    CREATIVE_ENHANCEMENTS("CREATIVE_ENHANCEMENTS"),
    LOCAL_ADS_STORE_CODE("LOCAL_ADS_STORE_CODE");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): AdAdsAnalyticsAsyncTargetingTypes {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'AdAdsAnalyticsAsyncTargetingTypes'")
        }
    }
}

