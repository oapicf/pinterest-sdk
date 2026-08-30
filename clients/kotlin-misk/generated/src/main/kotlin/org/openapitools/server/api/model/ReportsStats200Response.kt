package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsReportStats
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ReportsStats200Response(
    val items: kotlin.collections.List<CatalogsReportStats>,
    val bookmark: kotlin.String? = null
)
