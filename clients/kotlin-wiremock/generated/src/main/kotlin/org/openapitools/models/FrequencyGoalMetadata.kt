@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class FrequencyGoalMetadata(
    @field:JsonProperty("frequency")
    val frequency: kotlin.Int? = null,

    @field:JsonProperty("timerange")
    val timerange: FrequencyGoalMetadataTimerange? = null,

)
