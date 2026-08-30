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
import org.openapitools.server.api.model.LeadsExportResponseData
import org.openapitools.server.api.model.LeadsExports
import org.openapitools.server.api.model.LeadsExportsCreate
import org.openapitools.server.api.model.PinterestLibError

/**
* @TODO("Fill out implementation")
*/
@Singleton
class LeadsExportApiAction @Inject constructor(
) : WebAction {

    @Post("/ad_accounts/{ad_account_id}/leads_export")
    @Description("Create a request to export leads collected from a lead ad")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun leadsExportCreate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
        @Valid @RequestBody leadsExportsCreate: LeadsExportsCreate
    ): LeadsExports {
        TODO()
    }

    @Get("/ad_accounts/{ad_account_id}/leads_export/{leads_export_id}")
    @Description("Get the lead export from the lead export create call")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun leadsExportGet(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
        @Pattern(regexp="^\\d+$") @PathParam("leads_export_id") leadsExportId: kotlin.String
    ): LeadsExportResponseData {
        TODO()
    }
}
