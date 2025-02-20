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

import org.openapitools.client.models.DataStatus

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Array with metrics, status, and pin id for the requested metric
 *
 * @param metrics The metric name and daily value for each requested metric
 * @param dataStatus 
 * @param pinId The pin id
 */


data class TopVideoPinsAnalyticsResponsePinsInner (

    /* The metric name and daily value for each requested metric */
    @Json(name = "metrics")
    val metrics: kotlin.collections.Map<kotlin.String, java.math.BigDecimal>? = null,

    @Json(name = "data_status")
    val dataStatus: kotlin.collections.Map<kotlin.String, DataStatus>? = null,

    /* The pin id */
    @Json(name = "pin_id")
    val pinId: kotlin.String? = null

) {


}

