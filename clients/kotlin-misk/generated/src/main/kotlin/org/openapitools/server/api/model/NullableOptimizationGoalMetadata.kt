package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConversionTagV3GoalMetadata
import org.openapitools.server.api.model.FrequencyGoalMetadata
import org.openapitools.server.api.model.ScrollupGoalMetadata
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class NullableOptimizationGoalMetadata(
    val conversionTagV3GoalMetadata: ConversionTagV3GoalMetadata? = null,
    val frequencyGoalMetadata: FrequencyGoalMetadata? = null,
    val scrollupGoalMetadata: ScrollupGoalMetadata? = null
)
