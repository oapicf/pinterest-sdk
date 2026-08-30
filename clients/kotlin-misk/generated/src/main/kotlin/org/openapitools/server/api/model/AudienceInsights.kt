package org.openapitools.server.api.model

import org.openapitools.server.api.model.AudienceCategory
import org.openapitools.server.api.model.AudienceDemographics
import org.openapitools.server.api.model.AudienceInsightType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AudienceInsights(
    /** Category interest distribution */
    val categories: kotlin.collections.List<AudienceCategory>? = null,
    /** Generation date */
    val date: kotlin.String? = null,
    val demographics: AudienceDemographics? = null,
    /** Population count. */
    val propertySize: kotlin.Int? = null,
    /** Indicates whether the audience size has been rounded up to the next highest upper boundary. */
    val sizeIsUpperBound: kotlin.Boolean? = null,
    val type: AudienceInsightType? = null
)
