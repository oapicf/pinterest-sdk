@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AttributionWindows(
    @field:JsonProperty("click_window_days")
    val clickWindowDays: kotlin.Int? = null,

    @field:JsonProperty("engagement_window_days")
    val engagementWindowDays: kotlin.Int? = null,

    @field:JsonProperty("view_window_days")
    val viewWindowDays: kotlin.Int? = null,

)
