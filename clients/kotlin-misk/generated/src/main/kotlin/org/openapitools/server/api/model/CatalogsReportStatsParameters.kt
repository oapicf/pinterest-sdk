package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsHotelReportStatsParameters
import org.openapitools.server.api.model.CatalogsHotelReportStatsParametersReport
import org.openapitools.server.api.model.CatalogsRetailReportStatsParameters
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsReportStatsParameters(
    val catalogType: kotlin.String,
    val report: CatalogsHotelReportStatsParametersReport
)
