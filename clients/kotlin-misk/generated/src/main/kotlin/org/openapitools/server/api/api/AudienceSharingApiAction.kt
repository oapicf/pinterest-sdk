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
import org.openapitools.server.api.model.AdAccountToAdAccountSharedAudience
import org.openapitools.server.api.model.AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody
import org.openapitools.server.api.model.AdAccountToBusinessSharedAudience
import org.openapitools.server.api.model.AdAccountToBusinessSharedAudienceUpdateWithRequiredBody
import org.openapitools.server.api.model.AdAccountsAudiencesSharedAccountsList200Response
import org.openapitools.server.api.model.AudienceAccountType
import org.openapitools.server.api.model.BusinessToAdAccountSharedAudience
import org.openapitools.server.api.model.BusinessToAdAccountSharedAudienceUpdateWithRequiredBody
import org.openapitools.server.api.model.BusinessToBusinessSharedAudience
import org.openapitools.server.api.model.BusinessToBusinessSharedAudienceUpdateWithRequiredBody
import org.openapitools.server.api.model.Order
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.SharedAudiencesForBusinessList200Response

/**
* @TODO("Fill out implementation")
*/
@Singleton
class AudienceSharingApiAction @Inject constructor(
) : WebAction {

    @Get("/ad_accounts/{ad_account_id}/audiences/shared/accounts")
    @Description("List accounts with access to an audience owned by an ad account")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun adAccountsAudiencesSharedAccountsList(
         @QueryParam(value = "audience_id") audienceId: kotlin.String, 
         @QueryParam(value = "account_type") accountType: AudienceAccountType, 
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
         @QueryParam(value = "bookmark") bookmark: kotlin.String?, 
         @QueryParam(value = "page_size") pageSize: kotlin.Int
    ): AdAccountsAudiencesSharedAccountsList200Response {
        TODO()
    }

    @Get("/businesses/{business_id}/audiences/shared/accounts")
    @Description("List accounts with access to an audience owned by a business")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun businessAccountAudiencesSharedAccountsList(
        @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") businessId: kotlin.String, 
         @QueryParam(value = "audience_id") audienceId: kotlin.String, 
         @QueryParam(value = "account_type") accountType: AudienceAccountType, 
         @QueryParam(value = "bookmark") bookmark: kotlin.String?, 
         @QueryParam(value = "page_size") pageSize: kotlin.Int
    ): AdAccountsAudiencesSharedAccountsList200Response {
        TODO()
    }

    @Get("/businesses/{business_id}/audiences")
    @Description("List received audiences for a business")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun sharedAudiencesForBusinessList(
        @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") businessId: kotlin.String, 
         @QueryParam(value = "order") order: Order?, 
         @QueryParam(value = "bookmark") bookmark: kotlin.String?, 
         @QueryParam(value = "page_size") pageSize: kotlin.Int
    ): SharedAudiencesForBusinessList200Response {
        TODO()
    }

    @Patch("/ad_accounts/{ad_account_id}/audiences/ad_accounts/shared")
    @Description("Update audience sharing between ad accounts")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun updateAdAccountToAdAccountSharedAudience(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
        @Valid @RequestBody adAccountToAdAccountSharedAudienceUpdateWithRequiredBody: AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody
    ): AdAccountToAdAccountSharedAudience {
        TODO()
    }

    @Patch("/ad_accounts/{ad_account_id}/audiences/businesses/shared")
    @Description("Update audience sharing from an ad account to businesses")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun updateAdAccountToBusinessSharedAudience(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
        @Valid @RequestBody adAccountToBusinessSharedAudienceUpdateWithRequiredBody: AdAccountToBusinessSharedAudienceUpdateWithRequiredBody
    ): AdAccountToBusinessSharedAudience {
        TODO()
    }

    @Patch("/businesses/{business_id}/audiences/ad_accounts/shared")
    @Description("Update audience sharing from a business to ad accounts")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun updateBusinessToAdAccountSharedAudience(
        @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") businessId: kotlin.String, 
        @Valid @RequestBody businessToAdAccountSharedAudienceUpdateWithRequiredBody: BusinessToAdAccountSharedAudienceUpdateWithRequiredBody
    ): BusinessToAdAccountSharedAudience {
        TODO()
    }

    @Patch("/businesses/{business_id}/audiences/businesses/shared")
    @Description("Update audience sharing between businesses")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun updateBusinessToBusinessSharedAudience(
        @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") businessId: kotlin.String, 
        @Valid @RequestBody businessToBusinessSharedAudienceUpdateWithRequiredBody: BusinessToBusinessSharedAudienceUpdateWithRequiredBody
    ): BusinessToBusinessSharedAudience {
        TODO()
    }
}
