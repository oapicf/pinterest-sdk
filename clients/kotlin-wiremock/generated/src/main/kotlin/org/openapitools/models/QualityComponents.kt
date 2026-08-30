@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class QualityComponents(
    @field:JsonProperty("advertiser_external_id")
    val advertiserExternalId: kotlin.collections.Map<kotlin.String, QualityComponentDetails>? = null,

    @field:JsonProperty("click_id_epik")
    val clickIdEpik: kotlin.collections.Map<kotlin.String, QualityComponentDetails>? = null,

    @field:JsonProperty("external_event_id")
    val externalEventId: kotlin.collections.Map<kotlin.String, QualityComponentDetails>? = null,

    @field:JsonProperty("hashed_email")
    val hashedEmail: kotlin.collections.Map<kotlin.String, QualityComponentDetails>? = null,

    @field:JsonProperty("hashed_maid")
    val hashedMaid: kotlin.collections.Map<kotlin.String, QualityComponentDetails>? = null,

    @field:JsonProperty("ip_address")
    val ipAddress: kotlin.collections.Map<kotlin.String, QualityComponentDetails>? = null,

    @field:JsonProperty("order_id")
    val orderId: kotlin.collections.Map<kotlin.String, QualityComponentDetails>? = null,

    @field:JsonProperty("order_value")
    val orderValue: kotlin.collections.Map<kotlin.String, QualityComponentDetails>? = null,

    @field:JsonProperty("product_id")
    val productId: kotlin.collections.Map<kotlin.String, QualityComponentDetails>? = null,

    @field:JsonProperty("source_url")
    val sourceUrl: kotlin.collections.Map<kotlin.String, QualityComponentDetails>? = null,

    @field:JsonProperty("user_agent")
    val userAgent: kotlin.collections.Map<kotlin.String, QualityComponentDetails>? = null,

)
