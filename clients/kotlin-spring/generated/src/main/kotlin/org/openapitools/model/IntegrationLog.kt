package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.IntegrationLogClientError
import org.openapitools.model.IntegrationLogClientRequest
import org.openapitools.model.IntegrationLogEventType
import org.openapitools.model.IntegrationLogLevel
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
 * @param advertiserId 
 * @param appVersionNumber Version number of the integration application.
 * @param error 
 * @param externalBusinessId 
 * @param feedProfileId 
 * @param merchantId 
 * @param message Explanation of the event that occured.
 * @param platformVersionNumber Version number of the platform the integration application is running on.
 * @param request 
 * @param tagId 
 */
data class IntegrationLog(

    @Schema(required = true, description = "Timestamp in milliseconds of when the log was executed at the client.")
    @param:JsonProperty("client_timestamp")
    @get:JsonProperty("client_timestamp", required = true) val clientTimestamp: kotlin.Int,

    @field:Valid
    @Schema(required = true, description = "Log event type")
    @param:JsonProperty("event_type")
    @get:JsonProperty("event_type", required = true) val eventType: IntegrationLogEventType,

    @field:Valid
    @Schema(required = true, description = "Log level type")
    @param:JsonProperty("log_level")
    @get:JsonProperty("log_level", required = true) val logLevel: IntegrationLogLevel,

    @get:Size(max=128)
    @Schema(description = "")
    @param:JsonProperty("advertiser_id")
    @get:JsonProperty("advertiser_id") val advertiserId: kotlin.String? = null,

    @get:Size(max=20)
    @Schema(description = "Version number of the integration application.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("app_version_number")
    @get:JsonProperty("app_version_number") val appVersionNumber: kotlin.String? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("error")
    @get:JsonProperty("error") val error: IntegrationLogClientError? = null,

    @get:Size(max=2048)
    @Schema(description = "")
    @param:JsonProperty("external_business_id")
    @get:JsonProperty("external_business_id") val externalBusinessId: kotlin.String? = null,

    @get:Size(max=128)
    @Schema(description = "")
    @param:JsonProperty("feed_profile_id")
    @get:JsonProperty("feed_profile_id") val feedProfileId: kotlin.String? = null,

    @get:Size(max=128)
    @Schema(description = "")
    @param:JsonProperty("merchant_id")
    @get:JsonProperty("merchant_id") val merchantId: kotlin.String? = null,

    @get:Size(max=8192)
    @Schema(description = "Explanation of the event that occured.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("message")
    @get:JsonProperty("message") val message: kotlin.String? = null,

    @get:Size(max=20)
    @Schema(description = "Version number of the platform the integration application is running on.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("platform_version_number")
    @get:JsonProperty("platform_version_number") val platformVersionNumber: kotlin.String? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("request")
    @get:JsonProperty("request") val request: IntegrationLogClientRequest? = null,

    @get:Size(max=128)
    @Schema(description = "")
    @param:JsonProperty("tag_id")
    @get:JsonProperty("tag_id") val tagId: kotlin.String? = null
) {

}

