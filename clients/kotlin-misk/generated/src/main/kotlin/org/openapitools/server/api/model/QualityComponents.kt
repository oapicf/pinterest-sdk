package org.openapitools.server.api.model

import org.openapitools.server.api.model.QualityComponentDetails
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class QualityComponents(
    val advertiserExternalId: kotlin.collections.Map<kotlin.String, QualityComponentDetails>? = null,
    val clickIdEpik: kotlin.collections.Map<kotlin.String, QualityComponentDetails>? = null,
    /** Dedup components. */
    val externalEventId: kotlin.collections.Map<kotlin.String, QualityComponentDetails>? = null,
    /** User matching identifiers. */
    val hashedEmail: kotlin.collections.Map<kotlin.String, QualityComponentDetails>? = null,
    val hashedMaid: kotlin.collections.Map<kotlin.String, QualityComponentDetails>? = null,
    val ipAddress: kotlin.collections.Map<kotlin.String, QualityComponentDetails>? = null,
    val orderId: kotlin.collections.Map<kotlin.String, QualityComponentDetails>? = null,
    val orderValue: kotlin.collections.Map<kotlin.String, QualityComponentDetails>? = null,
    /** Product/event metadata. */
    val productId: kotlin.collections.Map<kotlin.String, QualityComponentDetails>? = null,
    val sourceUrl: kotlin.collections.Map<kotlin.String, QualityComponentDetails>? = null,
    val userAgent: kotlin.collections.Map<kotlin.String, QualityComponentDetails>? = null
)
