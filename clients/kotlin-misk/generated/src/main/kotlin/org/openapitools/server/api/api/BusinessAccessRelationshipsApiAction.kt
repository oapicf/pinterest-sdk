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
import org.openapitools.server.api.model.BrandAccount
import org.openapitools.server.api.model.BrandAccountCreate
import org.openapitools.server.api.model.BrandAccountUpdate
import org.openapitools.server.api.model.BusinessMembershipMember
import org.openapitools.server.api.model.DeleteBusinessMembership200Response
import org.openapitools.server.api.model.DeleteBusinessMembershipBody
import org.openapitools.server.api.model.DeleteBusinessPartners
import org.openapitools.server.api.model.DeleteBusinessPartnersDelete
import org.openapitools.server.api.model.GetBusinessEmployers200Response
import org.openapitools.server.api.model.MemberBusinessRole
import org.openapitools.server.api.model.PartnerType
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.SystemUserUpdateWithRequiredBody
import org.openapitools.server.api.model.UpdateBusinessMembershipsResponse

/**
* @TODO("Fill out implementation")
*/
@Singleton
class BusinessAccessRelationshipsApiAction @Inject constructor(
) : WebAction {

    @Post("/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts")
    @Description("Create a Brand Account")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun brandAccountsCreate(
        @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_hierarchy_id") businessHierarchyId: kotlin.String, 
        @Valid @RequestBody brandAccountCreate: BrandAccountCreate
    ): BrandAccount {
        TODO()
    }

    @Patch("/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id}")
    @Description("Update a Brand Account")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun brandAccountsUpdate(
        @PathParam("brand_account_id") brandAccountId: kotlin.String, 
        @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_hierarchy_id") businessHierarchyId: kotlin.String, 
        @Valid @RequestBody brandAccountUpdate: BrandAccountUpdate
    ): BrandAccount {
        TODO()
    }

    @Delete("/businesses/{business_id}/members")
    @Description("Terminate business memberships")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun deleteBusinessMembership(
        @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") businessId: kotlin.String, 
        @Valid @RequestBody deleteBusinessMembershipBody: DeleteBusinessMembershipBody
    ): DeleteBusinessMembership200Response {
        TODO()
    }

    @Delete("/businesses/{business_id}/partners")
    @Description("Terminate business partnerships")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun deleteBusinessPartners(
        @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") businessId: kotlin.String, 
        @Valid @RequestBody deleteBusinessPartnersDelete: DeleteBusinessPartnersDelete
    ): DeleteBusinessPartners {
        TODO()
    }

    @Get("/businesses/employers")
    @Description("List business employers for user")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun getBusinessEmployers(
         @QueryParam(value = "assets_summary") assetsSummary: kotlin.Boolean, 
         @QueryParam(value = "bookmark") bookmark: kotlin.String?, 
         @QueryParam(value = "page_size") pageSize: kotlin.Int
    ): GetBusinessEmployers200Response {
        TODO()
    }

    @Get("/businesses/{business_id}/members")
    @Description("Get business members")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun getBusinessMembers(
        @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") businessId: kotlin.String, 
         @QueryParam(value = "fetch_system_users") fetchSystemUsers: kotlin.Boolean, 
         @QueryParam(value = "assets_summary") assetsSummary: kotlin.Boolean, 
         @QueryParam(value = "business_roles") businessRoles: kotlin.collections.List<MemberBusinessRole>?, 
         @QueryParam(value = "member_ids") memberIds: kotlin.String?, 
         @QueryParam(value = "start_index") startIndex: kotlin.Int, 
         @QueryParam(value = "bookmark") bookmark: kotlin.String?, 
         @QueryParam(value = "page_size") pageSize: kotlin.Int
    ): GetBusinessEmployers200Response {
        TODO()
    }

    @Get("/businesses/{business_id}/partners")
    @Description("Get business partners")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun getBusinessPartners(
        @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") businessId: kotlin.String, 
         @QueryParam(value = "assets_summary") assetsSummary: kotlin.Boolean, 
         @QueryParam(value = "partner_type") partnerType: PartnerType?, 
         @QueryParam(value = "partner_ids") partnerIds: kotlin.String?, 
         @QueryParam(value = "start_index") startIndex: kotlin.Int, 
         @QueryParam(value = "sort_ascending") sortAscending: kotlin.Boolean?, 
         @QueryParam(value = "bookmark") bookmark: kotlin.String?, 
         @QueryParam(value = "page_size") pageSize: kotlin.Int
    ): GetBusinessEmployers200Response {
        TODO()
    }

    @Patch("/businesses/{business_id}/system_users/{system_user_id}")
    @Description("Update a system user information.")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun systemUserUpdate(
        @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") businessId: kotlin.String, 
        @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("system_user_id") systemUserId: kotlin.String, 
        @Valid @RequestBody systemUserUpdateWithRequiredBody: SystemUserUpdateWithRequiredBody
    ): Response<Unit> {
        TODO()
    }

    @Patch("/businesses/{business_id}/members")
    @Description("Update member's business role")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun updateBusinessMemberships(
        @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") businessId: kotlin.String, 
        @Valid@Size(min=1)  @RequestBody businessMembershipMember: kotlin.collections.List<BusinessMembershipMember>
    ): UpdateBusinessMembershipsResponse {
        TODO()
    }
}
