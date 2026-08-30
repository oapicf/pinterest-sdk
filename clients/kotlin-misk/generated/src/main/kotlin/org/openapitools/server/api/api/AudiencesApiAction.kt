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
import org.openapitools.server.api.model.AdAccountsAudience
import org.openapitools.server.api.model.AdAccountsAudienceCreate
import org.openapitools.server.api.model.AdAccountsAudienceUpdate
import org.openapitools.server.api.model.AudienceOwnershipType
import org.openapitools.server.api.model.AudiencesList200Response
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.PinterestLibPaginationOrder

/**
* @TODO("Fill out implementation")
*/
@Singleton
class AudiencesApiAction @Inject constructor(
) : WebAction {

    @Post("/ad_accounts/{ad_account_id}/audiences")
    @Description("Create audience")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun audiencesCreate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
        @Valid @RequestBody adAccountsAudienceCreate: AdAccountsAudienceCreate
    ): AdAccountsAudience {
        TODO()
    }

    @Get("/ad_accounts/{ad_account_id}/audiences/{audience_id}")
    @Description("Get audience")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun audiencesGet(
        @Pattern(regexp="^\\d+$") @PathParam("audience_id") audienceId: kotlin.String, 
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String
    ): AdAccountsAudience {
        TODO()
    }

    @Get("/ad_accounts/{ad_account_id}/audiences")
    @Description("List audiences")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun audiencesList(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
         @QueryParam(value = "bookmark") bookmark: kotlin.String?, 
         @QueryParam(value = "page_size") pageSize: kotlin.Int, 
         @QueryParam(value = "order") order: PinterestLibPaginationOrder?, 
         @QueryParam(value = "ownership_type") ownershipType: AudienceOwnershipType?, 
         @QueryParam(value = "exclude_nca") excludeNca: kotlin.Boolean
    ): AudiencesList200Response {
        TODO()
    }

    @Patch("/ad_accounts/{ad_account_id}/audiences/{audience_id}")
    @Description("Update audience")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun audiencesUpdate(
        @Pattern(regexp="^\\d+$") @PathParam("audience_id") audienceId: kotlin.String, 
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
        @Valid @RequestBody adAccountsAudienceUpdate: AdAccountsAudienceUpdate
    ): AdAccountsAudience {
        TODO()
    }
}
