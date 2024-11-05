package org.openapitools.api;

import org.openapitools.model.AdAccountsAudiencesSharedAccountsList200Response;
import org.openapitools.model.AudienceAccountType;
import org.openapitools.model.AudiencesList200Response;
import org.openapitools.model.AuthRespondInvitesBody;
import org.openapitools.model.BusinessAssetMembersGet200Response;
import org.openapitools.model.BusinessAssetPartnersGet200Response;
import org.openapitools.model.BusinessAssetsGet200Response;
import org.openapitools.model.BusinessMemberAssetsGet200Response;
import org.openapitools.model.BusinessMembersAssetAccessDeleteRequest;
import org.openapitools.model.BusinessPartnerAssetAccessGet200Response;
import org.openapitools.model.BusinessSharedAudience;
import org.openapitools.model.BusinessSharedAudienceResponse;
import org.openapitools.model.CancelInvitesBody;
import org.openapitools.model.CreateAssetAccessRequestBody;
import org.openapitools.model.CreateAssetAccessRequestResponse;
import org.openapitools.model.CreateAssetGroupBody;
import org.openapitools.model.CreateAssetGroupResponse;
import org.openapitools.model.CreateAssetInvitesRequest;
import org.openapitools.model.CreateInvitesResultsResponseArray;
import org.openapitools.model.CreateMembershipOrPartnershipInvitesBody;
import org.openapitools.model.DeleteAssetGroupBody;
import org.openapitools.model.DeleteAssetGroupResponse;
import org.openapitools.model.DeleteInvitesResultsResponseArray;
import org.openapitools.model.DeleteMemberAccessResultsResponseArray;
import org.openapitools.model.DeletePartnerAssetAccessBody;
import org.openapitools.model.DeletePartnerAssetsResultsResponseArray;
import org.openapitools.model.DeletePartnersRequest;
import org.openapitools.model.DeletePartnersResponse;
import org.openapitools.model.DeletedMembersResponse;
import org.openapitools.model.Error;
import org.openapitools.model.GetBusinessEmployers200Response;
import org.openapitools.model.GetBusinessMembers200Response;
import org.openapitools.model.GetBusinessPartners200Response;
import org.openapitools.model.GetInvites200Response;
import org.openapitools.model.InviteType;
import org.openapitools.model.MemberBusinessRole;
import org.openapitools.model.MembersToDeleteBody;
import org.openapitools.model.PartnerType;
import org.openapitools.model.PermissionsWithOwner;
import org.openapitools.model.RespondToInvitesResponseArray;
import org.openapitools.model.SharedAudience;
import org.openapitools.model.SharedAudienceResponse;
import org.openapitools.model.UpdateAssetGroupBody;
import org.openapitools.model.UpdateAssetGroupResponse;
import org.openapitools.model.UpdateInvitesResultsResponseArray;
import org.openapitools.model.UpdateMemberAssetAccessBody;
import org.openapitools.model.UpdateMemberAssetsResultsResponseArray;
import org.openapitools.model.UpdateMemberBusinessRoleBody;
import org.openapitools.model.UpdateMemberResultsResponseArray;
import org.openapitools.model.UpdatePartnerAssetAccessBody;
import org.openapitools.model.UpdatePartnerAssetsResultsResponseArray;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
* Represents a collection of functions to interact with the API endpoints.
*/
@Path("/businesses")
@Api(description = "the businesses API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class BusinessesApi {

    @POST
    @Path("/{business_id}/requests/assets/access")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create a request to access an existing partner's assets.", notes = "Create a request to access an existing partner's assets with the specified permissions. The request will be sent to the partner for approval. The assets that can be requested are ad accounts and profiles.", response = CreateAssetAccessRequestResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "biz_access:read", description = "See business access data"),
            @AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data") })
         }, tags={ "business_access_invite" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = CreateAssetAccessRequestResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response assetAccessRequestsCreate(@PathParam("business_id") @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @ApiParam("Unique identifier of the requesting business.") String businessId,@Valid @NotNull CreateAssetAccessRequestBody createAssetAccessRequestBody) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{business_id}/asset_groups")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create a new asset group.", notes = "Create a new asset group with the specified parameters. - An <a href=\"https://help.pinterest.com/en/business/article/asset-groups\">asset group</a> is a custom group of assets based on how you’d like to manage your accounts.", response = CreateAssetGroupResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "biz_access:read", description = "See business access data"),
            @AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data") })
         }, tags={ "business_access_assets" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = CreateAssetGroupResponse.class),
        @ApiResponse(code = 400, message = "Invalid parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response assetGroupCreate(@PathParam("business_id") @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @ApiParam("Unique identifier of the requesting business.") String businessId,@Valid @NotNull CreateAssetGroupBody createAssetGroupBody) {
        return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{business_id}/asset_groups")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete asset groups.", notes = "Delete a batch of asset groups.", response = DeleteAssetGroupResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "biz_access:read", description = "See business access data"),
            @AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data") })
         }, tags={ "business_access_assets" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = DeleteAssetGroupResponse.class),
        @ApiResponse(code = 400, message = "Invalid parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response assetGroupDelete(@PathParam("business_id") @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @ApiParam("Unique identifier of the requesting business.") String businessId,@Valid @NotNull DeleteAssetGroupBody deleteAssetGroupBody) {
        return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/{business_id}/asset_groups")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update asset groups.", notes = "Update a batch of asset groups with the specified parameters.", response = UpdateAssetGroupResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "biz_access:read", description = "See business access data"),
            @AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data") })
         }, tags={ "business_access_assets" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = UpdateAssetGroupResponse.class),
        @ApiResponse(code = 400, message = "Invalid parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response assetGroupUpdate(@PathParam("business_id") @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @ApiParam("Unique identifier of the requesting business.") String businessId,@Valid @NotNull UpdateAssetGroupBody updateAssetGroupBody) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{business_id}/audiences/shared/accounts")
    @Produces({ "application/json" })
    @ApiOperation(value = "List accounts with access to an audience owned by a business", notes = "List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.", response = AdAccountsAudiencesSharedAccountsList200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "biz_access:read", description = "See business access data") })
         }, tags={ "audience_sharing" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdAccountsAudiencesSharedAccountsList200Response.class),
        @ApiResponse(code = 400, message = "Invalid business audiences shared accounts parameters.", response = Error.class),
        @ApiResponse(code = 404, message = "Shared accounts not found.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = Error.class)
    })
    public Response businessAccountAudiencesSharedAccountsList(@PathParam("business_id") @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @ApiParam("Unique identifier of the requesting business.") String businessId,@QueryParam("audience_id") @NotNull @Pattern(regexp="^\\d+$") @Size(max=18)  @ApiParam("Unique identifier of the audience to use to filter the results.")  String audienceId,@QueryParam("account_type") @NotNull @DefaultValue("AD_ACCOUNT")  @ApiParam("Filter accounts by account type.")  AudienceAccountType accountType,@QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25")  @ApiParam("Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.")  Integer pageSize,@QueryParam("bookmark")  @ApiParam("Cursor used to fetch the next page of items")  String bookmark) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{business_id}/assets/{asset_id}/members")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get members with access to asset", notes = "Get all the members the requesting business has granted access to on the given asset.", response = BusinessAssetMembersGet200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "biz_access:read", description = "See business access data") })
         }, tags={ "business_access_assets" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Sucess", response = BusinessAssetMembersGet200Response.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response businessAssetMembersGet(@PathParam("business_id") @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @ApiParam("Unique identifier of the requesting business.") String businessId,@PathParam("asset_id") @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @ApiParam("Unique identifier of a business asset.") String assetId,@QueryParam("bookmark")  @ApiParam("Cursor used to fetch the next page of items")  String bookmark,@QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25")  @ApiParam("Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.")  Integer pageSize,@QueryParam("start_index") @Min(0) @DefaultValue("0")  @ApiParam("An index to start fetching the results from. Only the results starting from this index will be returned.")  Integer startIndex) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{business_id}/assets/{asset_id}/partners")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get partners with access to asset", notes = "Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.", response = BusinessAssetPartnersGet200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "biz_access:read", description = "See business access data") })
         }, tags={ "business_access_assets" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Sucess", response = BusinessAssetPartnersGet200Response.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response businessAssetPartnersGet(@PathParam("business_id") @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @ApiParam("Unique identifier of the requesting business.") String businessId,@PathParam("asset_id") @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @ApiParam("Unique identifier of a business asset.") String assetId,@QueryParam("start_index") @Min(0) @DefaultValue("0")  @ApiParam("An index to start fetching the results from. Only the results starting from this index will be returned.")  Integer startIndex,@QueryParam("bookmark")  @ApiParam("Cursor used to fetch the next page of items")  String bookmark,@QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25")  @ApiParam("Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.")  Integer pageSize) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{business_id}/assets")
    @Produces({ "application/json" })
    @ApiOperation(value = "List business assets", notes = "Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.", response = BusinessAssetsGet200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "biz_access:read", description = "See business access data") })
         }, tags={ "business_access_assets" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = BusinessAssetsGet200Response.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response businessAssetsGet(@PathParam("business_id") @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @ApiParam("Unique identifier of the requesting business.") String businessId,@QueryParam("permissions")  @ApiParam("A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned.")  List<PermissionsWithOwner> permissions,@QueryParam("child_asset_id") @Pattern(regexp="^\\d+$") @Size(min=1,max=20)  @ApiParam("A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child.")  String childAssetId,@QueryParam("asset_group_id") @Pattern(regexp="^\\d+$") @Size(min=1,max=20)  @ApiParam("An asset group unique identifier. Used to fetch assets contained within the specified asset group.")  String assetGroupId,@QueryParam("asset_type") @DefaultValue("AD_ACCOUNT")  @ApiParam("A resource type to filter the assets by. Only assets of the specified type will be returned.")  String assetType,@QueryParam("start_index") @Min(0) @DefaultValue("0")  @ApiParam("An index to start fetching the results from. Only the results starting from this index will be returned.")  Integer startIndex,@QueryParam("bookmark")  @ApiParam("Cursor used to fetch the next page of items")  String bookmark,@QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25")  @ApiParam("Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.")  Integer pageSize) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{business_id}/members/{member_id}/assets")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get assets assigned to a member", notes = "Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.", response = BusinessMemberAssetsGet200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "biz_access:read", description = "See business access data") })
         }, tags={ "business_access_assets" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = BusinessMemberAssetsGet200Response.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response businessMemberAssetsGet(@PathParam("business_id") @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @ApiParam("Unique identifier of the requesting business.") String businessId,@PathParam("member_id") @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @ApiParam("The member id to fetch assets for.") String memberId,@QueryParam("asset_type") @DefaultValue("AD_ACCOUNT")  @ApiParam("A resource type to filter the assets by. Only assets of the specified type will be returned.")  String assetType,@QueryParam("start_index") @Min(0) @DefaultValue("0")  @ApiParam("An index to start fetching the results from. Only the results starting from this index will be returned.")  Integer startIndex,@QueryParam("bookmark")  @ApiParam("Cursor used to fetch the next page of items")  String bookmark,@QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25")  @ApiParam("Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.")  Integer pageSize) {
        return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{business_id}/members/assets/access")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete member access to asset", notes = "Terminate multiple members' access to an asset.", response = DeleteMemberAccessResultsResponseArray.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data") })
         }, tags={ "business_access_assets" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = DeleteMemberAccessResultsResponseArray.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response businessMembersAssetAccessDelete(@PathParam("business_id") @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @ApiParam("Unique identifier of the requesting business.") String businessId,@Valid @NotNull BusinessMembersAssetAccessDeleteRequest businessMembersAssetAccessDeleteRequest) {
        return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/{business_id}/members/assets/access")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Assign/Update member asset permissions", notes = "Grant multiple members access to assets and/or update multiple member's exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE. ", response = UpdateMemberAssetsResultsResponseArray.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data") })
         }, tags={ "business_access_assets" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = UpdateMemberAssetsResultsResponseArray.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response businessMembersAssetAccessUpdate(@PathParam("business_id") @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @ApiParam("Unique identifier of the requesting business.") String businessId,@Valid @NotNull UpdateMemberAssetAccessBody updateMemberAssetAccessBody) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{business_id}/partners/{partner_id}/assets")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get assets assigned to a partner or assets assigned by a partner", notes = "Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type=INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type=EXTERNAL, you will retrieve the partner's business assets that the partner has granted you access to.", response = BusinessPartnerAssetAccessGet200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "biz_access:read", description = "See business access data") })
         }, tags={ "business_access_assets" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = BusinessPartnerAssetAccessGet200Response.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response businessPartnerAssetAccessGet(@PathParam("business_id") @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @ApiParam("Unique identifier of the requesting business.") String businessId,@PathParam("partner_id") @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @ApiParam("The partner id to be bound to the Business") String partnerId,@QueryParam("partner_type")  @ApiParam("Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset.")  PartnerType partnerType,@QueryParam("asset_type") @DefaultValue("AD_ACCOUNT")  @ApiParam("A resource type to filter the assets by. Only assets of the specified type will be returned.")  String assetType,@QueryParam("start_index") @Min(0) @DefaultValue("0")  @ApiParam("An index to start fetching the results from. Only the results starting from this index will be returned.")  Integer startIndex,@QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25")  @ApiParam("Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.")  Integer pageSize,@QueryParam("bookmark")  @ApiParam("Cursor used to fetch the next page of items")  String bookmark) {
        return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{business_id}/invites")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Cancel invites/requests", notes = "Cancel membership/partnership invites and/or requests.", response = DeleteInvitesResultsResponseArray.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data") })
         }, tags={ "business_access_invite" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = DeleteInvitesResultsResponseArray.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response cancelInvitesOrRequests(@PathParam("business_id") @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @ApiParam("Business id") String businessId,@Valid @NotNull CancelInvitesBody cancelInvitesBody) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{business_id}/invites/assets/access")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update invite/request with an asset permission", notes = "Assign asset permissions information to an existing invite/request. Can be used to: - Request access to a partner's asset. Note: This is only for when no existing partnership exists. If an existing   partnership exists, use \"Create a request to access an existing partner's assets\" to request access to your   partner's assets.     - invite_type=\"PARTNER_REQUEST\" - Invite a partner to access your business assets. Note: This is only for when there is no existing partnership.   If there is an existing partnership, use \"Assign/Update partner asset permissions\" to assign a partner access to   new assets.     - invite_type=\"PARTNER_INVITE\" - Invite a member to access your business assets. Note: This is only for when there is no existing membership.   If there is an existing membership, use \"Assign/Update member asset permissions\" to assign a member access to new   assets.     - invite_type=\"MEMBER_INVITE\"  To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview.", response = UpdateInvitesResultsResponseArray.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "biz_access:read", description = "See business access data"),
            @AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data") })
         }, tags={ "business_access_invite" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = UpdateInvitesResultsResponseArray.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response createAssetInvites(@PathParam("business_id") @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @ApiParam("Unique identifier of the requesting business.") String businessId,@Valid @NotNull CreateAssetInvitesRequest createAssetInvitesRequest) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{business_id}/invites")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create invites or requests", notes = "Create batch invites or requests. Can create batch invites or requests as described below. - Invite members to join the business. This would required specifying the following:     - invite_type=\"MEMBER_INVITE\"     - business_role=\"EMPLOYEE\" OR business_role=\"BIZ_ADMIN\" (To learn more about business roles, visit     https://help.pinterest.com/en/business/article/profile-permissions-in-business-access.)     - members - Invite partners to access your business assets. This would require specifying the following:     - invite_type=\"PARTNER_INVITE\"     - business_role=\"PARTNER\"     - partners - Request to be a partner so you can access their assets. This would require specifying the following:     - invite_type=\"PARTNER_REQUEST\"     - business_role=\"PARTNER\"     - partners", response = CreateInvitesResultsResponseArray.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data") })
         }, tags={ "business_access_invite" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = CreateInvitesResultsResponseArray.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response createMembershipOrPartnershipInvites(@PathParam("business_id") @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @ApiParam("Business id") String businessId,@Valid @NotNull CreateMembershipOrPartnershipInvitesBody createMembershipOrPartnershipInvitesBody) {
        return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{business_id}/members")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Terminate business memberships", notes = "Terminate memberships between the specified members and your business.", response = DeletedMembersResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "biz_access:read", description = "See business access data"),
            @AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data") })
         }, tags={ "business_access_relationships" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = DeletedMembersResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response deleteBusinessMembership(@PathParam("business_id") @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @ApiParam("Business id") String businessId,@Valid @NotNull MembersToDeleteBody membersToDeleteBody) {
        return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{business_id}/partners")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Terminate business partnerships", notes = "Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.", response = DeletePartnersResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data") })
         }, tags={ "business_access_relationships" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = DeletePartnersResponse.class),
        @ApiResponse(code = 404, message = "A supplied partner id doesn't exist", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response deleteBusinessPartners(@PathParam("business_id") @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @ApiParam("Unique identifier of the requesting business.") String businessId,@Valid @NotNull DeletePartnersRequest deletePartnersRequest) {
        return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{business_id}/partners/assets")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete partner access to asset", notes = "Terminate multiple partners' access to an asset. If - partner_type=INTERNAL: You will terminate a partner's asset access to your business assets. - partner_type=EXTERNAL: You will terminate your own access to your partner's business assets.", response = DeletePartnerAssetsResultsResponseArray.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data") })
         }, tags={ "business_access_assets" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = DeletePartnerAssetsResultsResponseArray.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response deletePartnerAssetAccessHandlerImpl(@PathParam("business_id") @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @ApiParam("Unique identifier of the requesting business.") String businessId,@Valid @NotNull DeletePartnerAssetAccessBody deletePartnerAssetAccessBody) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/employers")
    @Produces({ "application/json" })
    @ApiOperation(value = "List business employers for user", notes = "Get all of the viewing user's business employers.", response = GetBusinessEmployers200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "biz_access:read", description = "See business access data") })
         }, tags={ "business_access_relationships" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = GetBusinessEmployers200Response.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response getBusinessEmployers(@QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25")  @ApiParam("Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.")  Integer pageSize,@QueryParam("bookmark")  @ApiParam("Cursor used to fetch the next page of items")  String bookmark) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{business_id}/members")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get business members", notes = "Get all members of the specified business. The return response will include the member's business_role and assets they have access to if assets_summary=TRUE", response = GetBusinessMembers200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "biz_access:read", description = "See business access data") })
         }, tags={ "business_access_relationships" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = GetBusinessMembers200Response.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response getBusinessMembers(@PathParam("business_id") @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @ApiParam("Unique identifier of the requesting business.") String businessId,@QueryParam("assets_summary") @DefaultValue("false")  @ApiParam("Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are")  Boolean assetsSummary,@QueryParam("business_roles")  @ApiParam("A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned.")  List<MemberBusinessRole> businessRoles,@QueryParam("member_ids") @Size(max=500)  @ApiParam("A list of business members ids separated by comma.")  String memberIds,@QueryParam("start_index") @Min(0) @DefaultValue("0")  @ApiParam("An index to start fetching the results from. Only the results starting from this index will be returned.")  Integer startIndex,@QueryParam("bookmark")  @ApiParam("Cursor used to fetch the next page of items")  String bookmark,@QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25")  @ApiParam("Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.")  Integer pageSize) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{business_id}/partners")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get business partners", notes = "Get all partners of the specified business.  If the assets_summary=TRUE and: - partner_type=INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type=EXTERNAL, the business assets returned are your partner's business assets the partner has granted you   access to.", response = GetBusinessPartners200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "biz_access:read", description = "See business access data") })
         }, tags={ "business_access_relationships" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = GetBusinessPartners200Response.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response getBusinessPartners(@PathParam("business_id") @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @ApiParam("Unique identifier of the requesting business.") String businessId,@QueryParam("assets_summary") @DefaultValue("false")  @ApiParam("Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are")  Boolean assetsSummary,@QueryParam("partner_type")  @ApiParam("Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset.")  PartnerType partnerType,@QueryParam("partner_ids") @Size(max=500)  @ApiParam("A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned.")  String partnerIds,@QueryParam("start_index") @Min(0) @DefaultValue("0")  @ApiParam("An index to start fetching the results from. Only the results starting from this index will be returned.")  Integer startIndex,@QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25")  @ApiParam("Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.")  Integer pageSize,@QueryParam("bookmark")  @ApiParam("Cursor used to fetch the next page of items")  String bookmark) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{business_id}/invites")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get invites/requests", notes = "Get the membership/partnership invites and/or requests for the authorized user.", response = GetInvites200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "biz_access:read", description = "See business access data") })
         }, tags={ "business_access_invite" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = GetInvites200Response.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response getInvites(@PathParam("business_id") @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @ApiParam("Unique identifier of the requesting business.") String businessId,@QueryParam("is_member") @DefaultValue("true")  @ApiParam("A boolean field to indicate whether the invite is to create a partnership or a membership.")  Boolean isMember,@QueryParam("invite_status") @Size(min=1)  @ApiParam("A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned.")  List<String> inviteStatus,@QueryParam("invite_type")  @ApiParam("Invite type to filter invites by. Only invites of the specified type will be returned.")  InviteType inviteType,@QueryParam("bookmark")  @ApiParam("Cursor used to fetch the next page of items")  String bookmark,@QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25")  @ApiParam("Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.")  Integer pageSize) {
        return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/invites")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Accept or decline an invite/request", notes = "Accept or decline invites or requests.", response = RespondToInvitesResponseArray.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "biz_access:read", description = "See business access data"),
            @AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data") })
         }, tags={ "business_access_invite" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = RespondToInvitesResponseArray.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response respondBusinessAccessInvites(@Valid @NotNull AuthRespondInvitesBody authRespondInvitesBody) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{business_id}/audiences")
    @Produces({ "application/json" })
    @ApiOperation(value = "List received audiences for a business", notes = "Get a list of received audiences for the given business.", response = AudiencesList200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "biz_access:read", description = "See business access data") })
         }, tags={ "audience_sharing" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AudiencesList200Response.class),
        @ApiResponse(code = 400, message = "Invalid parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response sharedAudiencesForBusinessList(@PathParam("business_id") @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @ApiParam("Unique identifier of the requesting business.") String businessId,@QueryParam("bookmark")  @ApiParam("Cursor used to fetch the next page of items")  String bookmark,@QueryParam("order")  @ApiParam("The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.")  String order,@QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25")  @ApiParam("Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.")  Integer pageSize) {
        return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/{business_id}/members")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update member's business role", notes = "Update a member's business role within the business.", response = UpdateMemberResultsResponseArray.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data") })
         }, tags={ "business_access_relationships" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = UpdateMemberResultsResponseArray.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response updateBusinessMemberships(@PathParam("business_id") @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @ApiParam("Business id") String businessId,@Valid @NotNull List<@Valid UpdateMemberBusinessRoleBody> updateMemberBusinessRoleBody) {
        return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/{business_id}/audiences/ad_accounts/shared")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update audience sharing from a business to ad accounts", notes = "From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience. <ul> <li>If the business is the owner of the audience, it can share with any ad account within the same business hierarchy.</li> <li>If the business is the recipient of the audience, it can share with any of its owned ad accounts.</li> </ul> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.", response = SharedAudienceResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data") })
         }, tags={ "audience_sharing" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = SharedAudienceResponse.class),
        @ApiResponse(code = 400, message = "Invalid parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response updateBusinessToAdAccountSharedAudience(@PathParam("business_id") @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @ApiParam("Unique identifier of the requesting business.") String businessId,@Valid @NotNull SharedAudience sharedAudience) {
        return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/{business_id}/audiences/businesses/shared")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update audience sharing between businesses", notes = "From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.", response = BusinessSharedAudienceResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data") })
         }, tags={ "audience_sharing" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = BusinessSharedAudienceResponse.class),
        @ApiResponse(code = 400, message = "Invalid parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response updateBusinessToBusinessSharedAudience(@PathParam("business_id") @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @ApiParam("Unique identifier of the requesting business.") String businessId,@Valid @NotNull BusinessSharedAudience businessSharedAudience) {
        return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/{business_id}/partners/assets")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Assign/Update partner asset permissions", notes = "Grant multiple partners access to assets and/or update multiple partner's exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.", response = UpdatePartnerAssetsResultsResponseArray.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data") })
         }, tags={ "business_access_assets" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = UpdatePartnerAssetsResultsResponseArray.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response updatePartnerAssetAccessHandlerImpl(@PathParam("business_id") @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @ApiParam("Unique identifier of the requesting business.") String businessId,@Valid @NotNull UpdatePartnerAssetAccessBody updatePartnerAssetAccessBody) {
        return Response.ok().entity("magic!").build();
    }
}
