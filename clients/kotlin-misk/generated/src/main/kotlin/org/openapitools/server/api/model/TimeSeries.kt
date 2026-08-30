package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TimeSeries(
    val date: java.time.LocalDate? = null
)
