@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class IntegrationLog(
    @field:JsonProperty("client_timestamp")
    val clientTimestamp: kotlin.Int,

    @field:JsonProperty("event_type")
    val eventType: IntegrationLogEventType,

    @field:JsonProperty("log_level")
    val logLevel: IntegrationLogLevel,

    @field:JsonProperty("advertiser_id")
    val advertiserId: kotlin.String? = null,

    @field:JsonProperty("app_version_number")
    val appVersionNumber: kotlin.String? = null,

    @field:JsonProperty("error")
    val error: IntegrationLogClientError? = null,

    @field:JsonProperty("external_business_id")
    val externalBusinessId: kotlin.String? = null,

    @field:JsonProperty("feed_profile_id")
    val feedProfileId: kotlin.String? = null,

    @field:JsonProperty("merchant_id")
    val merchantId: kotlin.String? = null,

    @field:JsonProperty("message")
    val message: kotlin.String? = null,

    @field:JsonProperty("platform_version_number")
    val platformVersionNumber: kotlin.String? = null,

    @field:JsonProperty("request")
    val request: IntegrationLogClientRequest? = null,

    @field:JsonProperty("tag_id")
    val tagId: kotlin.String? = null,

)
