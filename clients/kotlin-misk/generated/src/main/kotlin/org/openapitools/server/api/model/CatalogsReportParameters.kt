package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsHotelReportParameters
import org.openapitools.server.api.model.CatalogsHotelReportParametersReport
import org.openapitools.server.api.model.CatalogsRetailReportParameters
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsReportParameters(
    val catalogType: kotlin.String,
    val report: CatalogsHotelReportParametersReport
)
