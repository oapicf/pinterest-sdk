package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PredictedTimeSeries(
    val date: java.time.LocalDate? = null
)
