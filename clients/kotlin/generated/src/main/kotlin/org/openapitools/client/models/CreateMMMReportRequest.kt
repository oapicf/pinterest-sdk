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

import org.openapitools.client.models.MMMReportingColumn
import org.openapitools.client.models.MMMReportingTargetingType
import org.openapitools.client.models.TargetingAdvertiserCountry

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param countries A List of countries for filtering
 */


data class CreateMMMReportRequest (

    /* A List of countries for filtering */
    @Json(name = "countries")
    val countries: kotlin.collections.List<TargetingAdvertiserCountry>? = null

) {

    /**
     * DAY - metrics are broken down daily.<br> WEEK - metrics are broken down weekly.
     *
     * Values: DAY,WEEK
     */
    @JsonClass(generateAdapter = false)
    enum class Granularity(val value: kotlin.String) {
        @Json(name = "DAY") DAY("DAY"),
        @Json(name = "WEEK") WEEK("WEEK");
    }
    /**
     * Level of the report
     *
     * Values: CAMPAIGN_TARGETING,AD_GROUP_TARGETING
     */
    @JsonClass(generateAdapter = false)
    enum class Level(val value: kotlin.String) {
        @Json(name = "CAMPAIGN_TARGETING") CAMPAIGN_TARGETING("CAMPAIGN_TARGETING"),
        @Json(name = "AD_GROUP_TARGETING") AD_GROUP_TARGETING("AD_GROUP_TARGETING");
    }

}

