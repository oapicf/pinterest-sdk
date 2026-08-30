package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsCreateReportResponse(
    /** Token to be used to get the report */
    val token: kotlin.String? = null
)
