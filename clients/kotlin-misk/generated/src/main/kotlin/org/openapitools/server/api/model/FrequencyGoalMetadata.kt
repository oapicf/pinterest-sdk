package org.openapitools.server.api.model

import org.openapitools.server.api.model.FrequencyGoalMetadataTimerange
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class FrequencyGoalMetadata(
    val frequency: kotlin.Int? = null,
    val timerange: FrequencyGoalMetadataTimerange? = null
)
