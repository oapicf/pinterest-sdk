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
import org.openapitools.server.api.model.AuthRespondInvitesBody
import org.openapitools.server.api.model.CancelInvitesRequest
import org.openapitools.server.api.model.CancelInvitesResponse
import org.openapitools.server.api.model.CreateAssetAccessRequestBody
import org.openapitools.server.api.model.CreateAssetAccessRequestResponse
import org.openapitools.server.api.model.CreateAssetInvitesRequest
import org.openapitools.server.api.model.CreateInvitesResultsResponseArray
import org.openapitools.server.api.model.CreateMembershipOrPartnershipInvitesBody
import org.openapitools.server.api.model.GetInvites200Response
import org.openapitools.server.api.model.InviteFilterStatus
import org.openapitools.server.api.model.InviteType
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.RespondToInvitesResponseArray
import org.openapitools.server.api.model.UpdateInvitesResultsResponseArray

/**
* @TODO("Fill out implementation")
*/
@Singleton
class BusinessAccessInviteApiAction @Inject constructor(
) : WebAction {

    @Post("/businesses/{business_id}/requests/assets/access")
    @Description("Create a request to access an existing partner's assets.")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun assetAccessRequestsCreate(
        @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") businessId: kotlin.String, 
        @Valid @RequestBody createAssetAccessRequestBody: CreateAssetAccessRequestBody
    ): CreateAssetAccessRequestResponse {
        TODO()
    }

    @Delete("/businesses/{business_id}/invites")
    @Description("Cancel invites/requests")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun cancelInvitesOrRequests(
        @Pattern(regexp="^\\d+$") @Size(min=1) @PathParam("business_id") businessId: kotlin.String, 
        @Valid @RequestBody cancelInvitesRequest: CancelInvitesRequest
    ): CancelInvitesResponse {
        TODO()
    }

    @Post("/businesses/{business_id}/invites/assets/access")
    @Description("Update invite/request with an asset permission")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun createAssetInvites(
        @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") businessId: kotlin.String, 
        @Valid @RequestBody createAssetInvitesRequest: CreateAssetInvitesRequest
    ): UpdateInvitesResultsResponseArray {
        TODO()
    }

    @Post("/businesses/{business_id}/invites")
    @Description("Create invites or requests")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun createMembershipOrPartnershipInvites(
        @Pattern(regexp="^\\d+$") @Size(min=1) @PathParam("business_id") businessId: kotlin.String, 
        @Valid @RequestBody createMembershipOrPartnershipInvitesBody: CreateMembershipOrPartnershipInvitesBody
    ): CreateInvitesResultsResponseArray {
        TODO()
    }

    @Get("/businesses/{business_id}/invites")
    @Description("Get invites/requests")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun getInvites(
        @Pattern(regexp="^\\d+$") @Size(min=1) @PathParam("business_id") businessId: kotlin.String, 
         @QueryParam(value = "is_member") isMember: kotlin.Boolean, 
         @QueryParam(value = "invite_status") inviteStatus: kotlin.collections.List<InviteFilterStatus>?, 
         @QueryParam(value = "invite_type") inviteType: InviteType?, 
         @QueryParam(value = "bookmark") bookmark: kotlin.String?, 
         @QueryParam(value = "page_size") pageSize: kotlin.Int
    ): GetInvites200Response {
        TODO()
    }

    @Patch("/businesses/invites")
    @Description("Accept or decline an invite/request")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun respondBusinessAccessInvites(
        @Valid @RequestBody authRespondInvitesBody: AuthRespondInvitesBody
    ): RespondToInvitesResponseArray {
        TODO()
    }
}
