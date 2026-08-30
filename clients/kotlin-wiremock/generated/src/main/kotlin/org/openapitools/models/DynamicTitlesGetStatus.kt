@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class DynamicTitlesGetStatus(
    @field:JsonProperty("generated_count")
    val generatedCount: kotlin.Int? = null,

    @field:JsonProperty("is_ready")
    val isReady: kotlin.Boolean? = null,

    @field:JsonProperty("reviewed_count")
    val reviewedCount: kotlin.Int? = null,

)
