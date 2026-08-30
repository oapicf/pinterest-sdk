@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AudienceInsights(
    @field:JsonProperty("categories")
    val categories: kotlin.collections.List<AudienceCategory>? = null,

    @field:JsonProperty("date")
    val date: kotlin.String? = null,

    @field:JsonProperty("demographics")
    val demographics: AudienceDemographics? = null,

    @field:JsonProperty("size")
    val propertySize: kotlin.Int? = null,

    @field:JsonProperty("size_is_upper_bound")
    val sizeIsUpperBound: kotlin.Boolean? = null,

    @field:JsonProperty("type")
    val type: AudienceInsightType? = null,

)
