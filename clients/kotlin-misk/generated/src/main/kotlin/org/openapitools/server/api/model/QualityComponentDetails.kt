package org.openapitools.server.api.model

import org.openapitools.server.api.model.QualityComponentIssue
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class QualityComponentDetails(
    /** Coverage percentage for this event type. */
    val coverage: java.math.BigDecimal,
    /** List of issues detected for this event type, if any. */
    val issues: kotlin.collections.List<QualityComponentIssue>? = null,
    /** Overlap percentage for this event type. Only populated for external_event_id */
    val overlap: java.math.BigDecimal? = null
)
