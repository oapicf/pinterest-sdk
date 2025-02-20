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

import org.openapitools.client.models.IntegrationLogClientError
import org.openapitools.client.models.IntegrationLogClientRequest

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Schema for log sent from an integration application.
 *
 * @param clientTimestamp Timestamp in milliseconds of when the log was executed at the client.
 * @param eventType Log event type
 * @param logLevel Log level type
 * @param externalBusinessId 
 * @param advertiserId 
 * @param merchantId 
 * @param tagId 
 * @param feedProfileId 
 * @param message Explanation of the event that occured.
 * @param appVersionNumber Version number of the integration application.
 * @param platformVersionNumber Version number of the platform the integration application is running on.
 * @param error 
 * @param request 
 */


data class IntegrationLog (

    /* Timestamp in milliseconds of when the log was executed at the client. */
    @Json(name = "client_timestamp")
    val clientTimestamp: kotlin.Int,

    /* Log event type */
    @Json(name = "event_type")
    val eventType: IntegrationLog.EventType,

    /* Log level type */
    @Json(name = "log_level")
    val logLevel: IntegrationLog.LogLevel,

    @Json(name = "external_business_id")
    val externalBusinessId: kotlin.String? = null,

    @Json(name = "advertiser_id")
    val advertiserId: kotlin.String? = null,

    @Json(name = "merchant_id")
    val merchantId: kotlin.String? = null,

    @Json(name = "tag_id")
    val tagId: kotlin.String? = null,

    @Json(name = "feed_profile_id")
    val feedProfileId: kotlin.String? = null,

    /* Explanation of the event that occured. */
    @Json(name = "message")
    val message: kotlin.String? = null,

    /* Version number of the integration application. */
    @Json(name = "app_version_number")
    val appVersionNumber: kotlin.String? = null,

    /* Version number of the platform the integration application is running on. */
    @Json(name = "platform_version_number")
    val platformVersionNumber: kotlin.String? = null,

    @Json(name = "error")
    val error: IntegrationLogClientError? = null,

    @Json(name = "request")
    val request: IntegrationLogClientRequest? = null

) {

    /**
     * Log event type
     *
     * Values: APP,API
     */
    @JsonClass(generateAdapter = false)
    enum class EventType(val value: kotlin.String) {
        @Json(name = "APP") APP("APP"),
        @Json(name = "API") API("API");
    }
    /**
     * Log level type
     *
     * Values: INFO,WARN,ERROR
     */
    @JsonClass(generateAdapter = false)
    enum class LogLevel(val value: kotlin.String) {
        @Json(name = "INFO") INFO("INFO"),
        @Json(name = "WARN") WARN("WARN"),
        @Json(name = "ERROR") ERROR("ERROR");
    }

}

