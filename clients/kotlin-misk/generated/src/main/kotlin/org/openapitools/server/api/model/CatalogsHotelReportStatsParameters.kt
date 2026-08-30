package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsHotelReportStatsParametersReport
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsHotelReportStatsParameters(
    val catalogType: kotlin.String,
    val report: CatalogsHotelReportStatsParametersReport
)
