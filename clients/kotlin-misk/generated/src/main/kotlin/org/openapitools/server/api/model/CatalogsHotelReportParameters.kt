package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsHotelReportParametersReport
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsHotelReportParameters(
    val catalogType: kotlin.String,
    val report: CatalogsHotelReportParametersReport
)
