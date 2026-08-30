package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsRetailReportStatsParametersReport
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsRetailReportStatsParameters(
    val catalogType: kotlin.String,
    val report: CatalogsRetailReportStatsParametersReport
)
