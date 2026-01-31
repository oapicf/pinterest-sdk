package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * 
 * @param targetingTypes List of targeting types. Requires `level` to be a value ending in `_TARGETING`. [\"AUDIENCE_MULTIPLIER\"] is only available in CAMPAIGN_TARGETING level. [\"MEDIA_TYPE\"] is only available in PRODUCT_ITEM_TARGETING level. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
 */
data class TargetingTypeFilter(

    @get:Size(min=1,max=5) 
    @Schema(example = "null", description = "List of targeting types. Requires `level` to be a value ending in `_TARGETING`. [\"AUDIENCE_MULTIPLIER\"] is only available in CAMPAIGN_TARGETING level. [\"MEDIA_TYPE\"] is only available in PRODUCT_ITEM_TARGETING level. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.")
    @get:JsonProperty("targeting_types") val targetingTypes: kotlin.collections.List<TargetingTypeFilter.TargetingTypes>? = null
) {

    /**
    * List of targeting types. Requires `level` to be a value ending in `_TARGETING`. [\"AUDIENCE_MULTIPLIER\"] is only available in CAMPAIGN_TARGETING level. [\"MEDIA_TYPE\"] is only available in PRODUCT_ITEM_TARGETING level. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
    * Values: KEYWORD,APPTYPE,GENDER,LOCATION,PLACEMENT,COUNTRY,TARGETED_INTEREST,PINNER_INTEREST,AUDIENCE_INCLUDE,GEO,AGE_BUCKET,REGION,MEDIA_TYPE,AGE_BUCKET_AND_GENDER,AUDIENCE_MULTIPLIER,CREATIVE_ENHANCEMENTS,LOCAL_ADS_STORE_CODE
    */
    enum class TargetingTypes(@get:JsonValue val value: kotlin.String) {

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
            fun forValue(value: kotlin.String): TargetingTypes {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'TargetingTypeFilter'")
            }
        }
    }

}

