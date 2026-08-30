package org.openapitools.server.api.api

import jakarta.inject.Inject
import jakarta.inject.Singleton
import jakarta.validation.Valid
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import misk.web.actions.WebAction
import misk.web.interceptors.LogRequestResponse
import misk.web.Delete
import misk.web.Description
import misk.web.Get
import misk.web.HttpCall
import misk.web.Patch
import misk.web.PathParam
import misk.web.Post
import misk.web.Put
import misk.web.QueryParam
import misk.web.RequestBody
import misk.web.RequestContentType
import misk.web.RequestHeader
import misk.web.Response
import misk.web.ResponseContentType
import misk.web.mediatype.MediaTypes
import org.openapitools.server.api.model.CatalogsCreateReportResponse
import org.openapitools.server.api.model.CatalogsReport
import org.openapitools.server.api.model.CatalogsReportParameters
import org.openapitools.server.api.model.CatalogsReportStatsParameters
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.ReportsStats200Response

/**
* @TODO("Fill out implementation")
*/
@Singleton
class CatalogReportsApiAction @Inject constructor(
) : WebAction {

    @Post("/catalogs/reports")
    @Description("Build catalogs report")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun reportsCreate(
        @Valid @RequestBody catalogsReportParameters: CatalogsReportParameters, 
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?
    ): CatalogsCreateReportResponse {
        TODO()
    }

    @Get("/catalogs/reports")
    @Description("Get catalogs report")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun reportsGet(
         @QueryParam(value = "token") token: kotlin.String, 
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?
    ): CatalogsReport {
        TODO()
    }

    @Get("/catalogs/reports/stats")
    @Description("List report stats")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun reportsStats(
         parameters: CatalogsReportStatsParameters, 
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?, 
         @QueryParam(value = "bookmark") bookmark: kotlin.String?, 
         @QueryParam(value = "page_size") pageSize: kotlin.Int
    ): ReportsStats200Response {
        TODO()
    }
}
