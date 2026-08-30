package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConversionTagConfigs
import org.openapitools.server.api.model.EnhancedMatchStatusType
import org.openapitools.server.api.model.EntityStatus
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ConversionTagResponse(
    /** Conversion tag name. */
    val name: kotlin.String,
    /** Ad account ID. */
    val adAccountId: kotlin.String,
    /** Tag code snippet. */
    val codeSnippet: kotlin.String? = null,
    val configs: ConversionTagConfigs? = null,
    /** The enhanced match status of the tag */
    val enhancedMatchStatus: EnhancedMatchStatusType? = null,
    /** Tag ID. */
    val id: kotlin.String? = null,
    /** Time for the last event fired. */
    val lastFiredTimeMs: java.math.BigDecimal? = null,
    /** Version number. */
    val version: kotlin.String? = null,
    val status: EntityStatus? = null
)
