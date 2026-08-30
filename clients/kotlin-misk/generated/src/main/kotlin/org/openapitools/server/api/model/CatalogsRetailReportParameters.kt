package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsRetailReportParametersReport
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsRetailReportParameters(
    val catalogType: kotlin.String,
    val report: CatalogsRetailReportParametersReport
)
