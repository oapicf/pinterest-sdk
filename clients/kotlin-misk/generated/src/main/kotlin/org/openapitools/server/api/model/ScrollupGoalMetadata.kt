package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ScrollupGoalMetadata(
    val scrollupGoalValueInMicroCurrency: kotlin.String? = null
)
