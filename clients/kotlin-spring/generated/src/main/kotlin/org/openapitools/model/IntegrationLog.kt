package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.IntegrationLogClientError
import org.openapitools.model.IntegrationLogClientRequest
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
 * Schema for log sent from an integration application.
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
data class IntegrationLog(

    @Schema(example = "null", required = true, description = "Timestamp in milliseconds of when the log was executed at the client.")
    @get:JsonProperty("client_timestamp", required = true) val clientTimestamp: kotlin.Int,

    @Schema(example = "null", required = true, description = "Log event type")
    @get:JsonProperty("event_type", required = true) val eventType: IntegrationLog.EventType,

    @Schema(example = "null", required = true, description = "Log level type")
    @get:JsonProperty("log_level", required = true) val logLevel: IntegrationLog.LogLevel,

    @get:Size(max=2048)
    @Schema(example = "null", description = "")
    @get:JsonProperty("external_business_id") val externalBusinessId: kotlin.String? = null,

    @get:Size(max=128)
    @Schema(example = "null", description = "")
    @get:JsonProperty("advertiser_id") val advertiserId: kotlin.String? = null,

    @get:Size(max=128)
    @Schema(example = "null", description = "")
    @get:JsonProperty("merchant_id") val merchantId: kotlin.String? = null,

    @get:Size(max=128)
    @Schema(example = "null", description = "")
    @get:JsonProperty("tag_id") val tagId: kotlin.String? = null,

    @get:Size(max=128)
    @Schema(example = "null", description = "")
    @get:JsonProperty("feed_profile_id") val feedProfileId: kotlin.String? = null,

    @get:Size(max=2048)
    @Schema(example = "null", description = "Explanation of the event that occured.")
    @get:JsonProperty("message") val message: kotlin.String? = null,

    @get:Size(max=20)
    @Schema(example = "null", description = "Version number of the integration application.")
    @get:JsonProperty("app_version_number") val appVersionNumber: kotlin.String? = null,

    @get:Size(max=20)
    @Schema(example = "null", description = "Version number of the platform the integration application is running on.")
    @get:JsonProperty("platform_version_number") val platformVersionNumber: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("error") val error: IntegrationLogClientError? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("request") val request: IntegrationLogClientRequest? = null
    ) {

    /**
    * Log event type
    * Values: APP,API
    */
    enum class EventType(@get:JsonValue val value: kotlin.String) {

        APP("APP"),
        API("API");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): EventType {
                return values().first{it -> it.value == value}
            }
        }
    }

    /**
    * Log level type
    * Values: INFO,WARN,ERROR
    */
    enum class LogLevel(@get:JsonValue val value: kotlin.String) {

        INFO("INFO"),
        WARN("WARN"),
        ERROR("ERROR");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): LogLevel {
                return values().first{it -> it.value == value}
            }
        }
    }

}

