/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param frequency 
 * @param timerange User entity counts time range
 */


data class OptimizationGoalMetadataFrequencyGoalMetadata (

    @Json(name = "frequency")
    val frequency: kotlin.Int? = null,

    /* User entity counts time range */
    @Json(name = "timerange")
    val timerange: OptimizationGoalMetadataFrequencyGoalMetadata.Timerange? = null

) {

    /**
     * User entity counts time range
     *
     * Values: THIRTY_DAY,DAY,SEVEN_DAY,TWENTY_MINUTE,TEN_MINUTE,TWENTY_FOUR_HOUR
     */
    @JsonClass(generateAdapter = false)
    enum class Timerange(val value: kotlin.String) {
        @Json(name = "THIRTY_DAY") THIRTY_DAY("THIRTY_DAY"),
        @Json(name = "DAY") DAY("DAY"),
        @Json(name = "SEVEN_DAY") SEVEN_DAY("SEVEN_DAY"),
        @Json(name = "TWENTY_MINUTE") TWENTY_MINUTE("TWENTY_MINUTE"),
        @Json(name = "TEN_MINUTE") TEN_MINUTE("TEN_MINUTE"),
        @Json(name = "TWENTY_FOUR_HOUR") TWENTY_FOUR_HOUR("TWENTY_FOUR_HOUR");
    }

}

