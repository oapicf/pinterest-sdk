package org.openapitools.server.api.model

import org.openapitools.server.api.model.SchedulesCreate200ResponseInnerData
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SchedulesCreate200ResponseInner(
    val `data`: SchedulesCreate200ResponseInnerData
)
