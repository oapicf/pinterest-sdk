package org.openapitools.api;

import org.openapitools.model.AdAccountsAudiencesSharedAccountsList200Response;
import org.openapitools.model.AssetGroupDeletion;
import org.openapitools.model.AssetGroupDeletionDelete;
import org.openapitools.model.AssetGroupInput;
import org.openapitools.model.AssetGroupInputCreate;
import org.openapitools.model.AssetGroupModification;
import org.openapitools.model.AssetGroupModificationReadOrUpdate;
import org.openapitools.model.AssetPermissionType;
import org.openapitools.model.AssetSearchBy;
import org.openapitools.model.AssetSortBy;
import org.openapitools.model.AudienceAccountType;
import org.openapitools.model.AuthRespondInvitesBody;
import org.openapitools.model.BusinessAssetMembersGet200Response;
import org.openapitools.model.BusinessAssetsGet200Response;
import org.openapitools.model.BusinessMemberAssetsGetResponse;
import org.openapitools.model.BusinessMembersAssetAccessDeleteBody;
import org.openapitools.model.BusinessMembershipMember;
import org.openapitools.model.BusinessPartnerAssetAccessGet200Response;
import org.openapitools.model.BusinessToAdAccountSharedAudience;
import org.openapitools.model.BusinessToAdAccountSharedAudienceUpdateWithRequiredBody;
import org.openapitools.model.BusinessToBusinessSharedAudience;
import org.openapitools.model.BusinessToBusinessSharedAudienceUpdateWithRequiredBody;
import org.openapitools.model.CancelInvitesRequest;
import org.openapitools.model.CancelInvitesResponse;
import org.openapitools.model.CreateAssetAccessRequestBody;
import org.openapitools.model.CreateAssetAccessRequestResponse;
import org.openapitools.model.CreateAssetInvitesRequest;
import org.openapitools.model.CreateInvitesResultsResponseArray;
import org.openapitools.model.CreateMembershipOrPartnershipInvitesBody;
import org.openapitools.model.DeleteBusinessMembership200Response;
import org.openapitools.model.DeleteBusinessMembershipBody;
import org.openapitools.model.DeleteBusinessPartners;
import org.openapitools.model.DeleteBusinessPartnersDelete;
import org.openapitools.model.DeleteMemberAccessResultsResponseArray;
import org.openapitools.model.DeletePartnerAssetAccessBody;
import org.openapitools.model.DeletePartnerAssetAccessResultsResponseArray;
import org.openapitools.model.GetBusinessEmployers200Response;
import org.openapitools.model.GetInvites200Response;
import org.openapitools.model.InviteFilterStatus;
import org.openapitools.model.InviteType;
import org.openapitools.model.MemberBusinessRole;
import org.openapitools.model.NonDraftEntityStatus;
import org.openapitools.model.Order;
import org.openapitools.model.PartnerType;
import org.openapitools.model.PermissionsWithOwner;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.RespondToInvitesResponseArray;
import org.openapitools.model.SharedAudiencesForBusinessList200Response;
import org.openapitools.model.SystemUserUpdateWithRequiredBody;
import org.openapitools.model.UpdateBusinessMembershipsResponse;
import org.openapitools.model.UpdateInvitesResultsResponseArray;
import org.openapitools.model.UpdateMemberAssetAccessBody;
import org.openapitools.model.UpdateMemberAssetsResultsResponseArray;
import org.openapitools.model.UpdatePartnerAssetAccessBody;
import org.openapitools.model.UpdatePartnerAssetsResultsResponseArray;
import org.openapitools.api.BusinessesApiService;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import io.swagger.annotations.*;
import java.io.InputStream;

import org.apache.cxf.jaxrs.ext.PATCH;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
@Path("/businesses")
@RequestScoped

@Api


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2026-08-30T09:54:04.171825690Z[Etc/UTC]", comments = "Generator version: 7.24.0")

public class BusinessesApi  {

  @Context SecurityContext securityContext;

  @Inject BusinessesApiService delegate;


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
        @ApiResponse(code = 200, message = "The request has succeeded.", response = CreateAssetAccessRequestResponse.class),
        @ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = CreateAssetAccessRequestResponse.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response assetAccessRequestsCreate( @Pattern(regexp="^\\d+$") @Size(min=1,max=20)@ApiParam(value = "Unique identifier of the requesting business.",required=true) @PathParam("business_id") String businessId, @ApiParam(value = "" ,required=true) CreateAssetAccessRequestBody createAssetAccessRequestBody) {
        return delegate.assetAccessRequestsCreate(businessId, createAssetAccessRequestBody, securityContext);
    }

    @POST
    @Path("/{business_id}/asset_groups")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create a new asset group.", notes = "Create a new asset group with the specified parameters. - An [asset group](https://help.pinterest.com/en/business/article/asset-groups) is a custom group of assets based on how you would like to manage your accounts.", response = AssetGroupInput.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "biz_access:read", description = "See business access data"),
            @AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data") })
         }, tags={ "business_access_assets" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = AssetGroupInput.class),
        @ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = AssetGroupInput.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response assetGroupCreate( @Pattern(regexp="^\\d+$") @Size(min=1,max=20)@ApiParam(value = "Unique identifier of the requesting business.",required=true) @PathParam("business_id") String businessId, @ApiParam(value = "" ,required=true) AssetGroupInputCreate assetGroupInputCreate) {
        return delegate.assetGroupCreate(businessId, assetGroupInputCreate, securityContext);
    }

    @DELETE
    @Path("/{business_id}/asset_groups")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete asset groups.", notes = "Delete a batch of asset groups.", response = AssetGroupDeletion.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "biz_access:read", description = "See business access data"),
            @AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data") })
         }, tags={ "business_access_assets" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = AssetGroupDeletion.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response assetGroupDelete( @Pattern(regexp="^\\d+$") @Size(min=1,max=20)@ApiParam(value = "Unique identifier of the requesting business.",required=true) @PathParam("business_id") String businessId, @ApiParam(value = "" ,required=true) AssetGroupDeletionDelete assetGroupDeletionDelete) {
        return delegate.assetGroupDelete(businessId, assetGroupDeletionDelete, securityContext);
    }

    @PATCH
    @Path("/{business_id}/asset_groups")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update asset groups.", notes = "Update a batch of asset groups with the specified parameters.", response = AssetGroupModification.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "biz_access:read", description = "See business access data"),
            @AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data") })
         }, tags={ "business_access_assets" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = AssetGroupModification.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response assetGroupUpdate( @Pattern(regexp="^\\d+$") @Size(min=1,max=20)@ApiParam(value = "Unique identifier of the requesting business.",required=true) @PathParam("business_id") String businessId, @ApiParam(value = "" ,required=true) AssetGroupModificationReadOrUpdate assetGroupModificationReadOrUpdate) {
        return delegate.assetGroupUpdate(businessId, assetGroupModificationReadOrUpdate, securityContext);
    }

    @GET
    @Path("/{business_id}/audiences/shared/accounts")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List accounts with access to an audience owned by a business", notes = "List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.", response = AdAccountsAudiencesSharedAccountsList200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "biz_access:read", description = "See business access data") })
         }, tags={ "audience_sharing" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = AdAccountsAudiencesSharedAccountsList200Response.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response businessAccountAudiencesSharedAccountsList( @Pattern(regexp="^\\d+$") @Size(min=1,max=20)@ApiParam(value = "Unique identifier of the requesting business.",required=true) @PathParam("business_id") String businessId,  @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of the audience to use to filter the results.",required=true)  @QueryParam("audience_id") String audienceId,  @NotNull @ApiParam(value = "Filter accounts by account type.",required=true, allowableValues="AD_ACCOUNT, BUSINESS_ACCOUNT")  @QueryParam("account_type") AudienceAccountType accountType, @ApiParam(value = "Cursor used to fetch the next page of items")  @QueryParam("bookmark") String bookmark,  @Min(1) @Max(250)@ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue="25") @DefaultValue("25")  @QueryParam("page_size") Integer pageSize) {
        return delegate.businessAccountAudiencesSharedAccountsList(businessId, audienceId, accountType, bookmark, pageSize, securityContext);
    }

    @GET
    @Path("/{business_id}/assets/{asset_id}/members")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get members with access to asset", notes = "Get all the members the requesting business has granted access to on the given asset.", response = BusinessAssetMembersGet200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "biz_access:read", description = "See business access data") })
         }, tags={ "business_access_assets" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = BusinessAssetMembersGet200Response.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response businessAssetMembersGet( @Pattern(regexp="^\\d+$") @Size(min=1,max=20)@ApiParam(value = "Unique identifier of the requesting business.",required=true) @PathParam("business_id") String businessId,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)@ApiParam(value = "Unique identifier of a business asset.",required=true) @PathParam("asset_id") String assetId,  @Min(0)@ApiParam(value = "An index to start fetching the results from. Only the results starting from this index will be returned.", defaultValue="0") @DefaultValue("0")  @QueryParam("start_index") Integer startIndex, @ApiParam(value = "Fetches system users if True. Fetches regular user employees if False.", defaultValue="false") @DefaultValue("false")  @QueryParam("fetch_system_users") Boolean fetchSystemUsers, @ApiParam(value = "Cursor used to fetch the next page of items")  @QueryParam("bookmark") String bookmark,  @Min(1) @Max(250)@ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue="25") @DefaultValue("25")  @QueryParam("page_size") Integer pageSize) {
        return delegate.businessAssetMembersGet(businessId, assetId, startIndex, fetchSystemUsers, bookmark, pageSize, securityContext);
    }

    @GET
    @Path("/{business_id}/assets/{asset_id}/partners")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get partners with access to asset", notes = "Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.", response = BusinessAssetMembersGet200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "biz_access:read", description = "See business access data") })
         }, tags={ "business_access_assets" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = BusinessAssetMembersGet200Response.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response businessAssetPartnersGet( @Pattern(regexp="^\\d+$") @Size(min=1,max=20)@ApiParam(value = "Unique identifier of the requesting business.",required=true) @PathParam("business_id") String businessId,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)@ApiParam(value = "Unique identifier of a business asset.",required=true) @PathParam("asset_id") String assetId,  @Min(0)@ApiParam(value = "An index to start fetching the results from. Only the results starting from this index will be returned.", defaultValue="0") @DefaultValue("0")  @QueryParam("start_index") Integer startIndex, @ApiParam(value = "Cursor used to fetch the next page of items")  @QueryParam("bookmark") String bookmark,  @Min(1) @Max(250)@ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue="25") @DefaultValue("25")  @QueryParam("page_size") Integer pageSize) {
        return delegate.businessAssetPartnersGet(businessId, assetId, startIndex, bookmark, pageSize, securityContext);
    }

    @GET
    @Path("/{business_id}/assets")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List business assets", notes = "Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.", response = BusinessAssetsGet200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "biz_access:read", description = "See business access data") })
         }, tags={ "business_access_assets" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = BusinessAssetsGet200Response.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response businessAssetsGet( @Pattern(regexp="^\\d+$") @Size(min=1,max=20)@ApiParam(value = "Unique identifier of the requesting business.",required=true) @PathParam("business_id") String businessId, @ApiParam(value = "A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned.")  @QueryParam("permissions") List<PermissionsWithOwner> permissions,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)@ApiParam(value = "A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child.")  @QueryParam("child_asset_id") String childAssetId,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)@ApiParam(value = "An asset group unique identifier. Used to fetch assets contained within the specified asset group.")  @QueryParam("asset_group_id") String assetGroupId, @ApiParam(value = "A resource type to filter the assets by. Only assets of the specified type will be returned.", allowableValues="AD_ACCOUNT, PROFILE, ASSET_GROUP, CATALOG, CONSUMER", defaultValue="AD_ACCOUNT") @DefaultValue("AD_ACCOUNT")  @QueryParam("asset_type") String assetType,  @Min(0)@ApiParam(value = "An index to start fetching the results from. Only the results starting from this index will be returned.", defaultValue="0") @DefaultValue("0")  @QueryParam("start_index") Integer startIndex, @ApiParam(value = "Cursor used to fetch the next page of items")  @QueryParam("bookmark") String bookmark,  @Min(1) @Max(250)@ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue="25") @DefaultValue("25")  @QueryParam("page_size") Integer pageSize) {
        return delegate.businessAssetsGet(businessId, permissions, childAssetId, assetGroupId, assetType, startIndex, bookmark, pageSize, securityContext);
    }

    @GET
    @Path("/{business_id}/members/{member_id}/assets")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get assets assigned to a member", notes = "Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.", response = BusinessMemberAssetsGetResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "biz_access:read", description = "See business access data") })
         }, tags={ "business_access_assets" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = BusinessMemberAssetsGetResponse.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response businessMemberAssetsGet( @Pattern(regexp="^\\d+$") @Size(min=1,max=20)@ApiParam(value = "Unique identifier of the requesting business.",required=true) @PathParam("business_id") String businessId,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)@ApiParam(value = "The member id to fetch assets for.",required=true) @PathParam("member_id") String memberId, @ApiParam(value = "A resource type to filter the assets by. Only assets of the specified type will be returned.", allowableValues="AD_ACCOUNT, PROFILE, ASSET_GROUP, CATALOG, CONSUMER, CONVERSION_TAG", defaultValue="AD_ACCOUNT") @DefaultValue("AD_ACCOUNT")  @QueryParam("asset_type") String assetType,  @Min(0)@ApiParam(value = "An index to start fetching the results from. Only the results starting from this index will be returned.", defaultValue="0") @DefaultValue("0")  @QueryParam("start_index") Integer startIndex, @ApiParam(value = "The field to sort member assets by", allowableValues="NAME, ID, PERMISSIONS")  @QueryParam("sort_by") AssetSortBy sortBy, @ApiParam(value = "Sort assets in ascending order", defaultValue="true") @DefaultValue("true")  @QueryParam("sort_ascending") Boolean sortAscending, @ApiParam(value = "The field to search member assets by", allowableValues="NAME, ID, NAME_OR_ID, OWNER_NAME, NAME_OR_OWNER")  @QueryParam("search_by") AssetSearchBy searchBy, @ApiParam(value = "The value to search for")  @QueryParam("search_value") String searchValue, @ApiParam(value = "The type of asset permission to filter by", allowableValues="AGGREGATED_PERMISSION, DIRECT_PERMISSION")  @QueryParam("asset_permission_type") AssetPermissionType assetPermissionType, @ApiParam(value = "A list of ad account statuses to filter the assets by. Only used when asset_type is AD_ACCOUNT.")  @QueryParam("ad_account_statuses") List<NonDraftEntityStatus> adAccountStatuses, @ApiParam(value = "Cursor used to fetch the next page of items")  @QueryParam("bookmark") String bookmark,  @Min(1) @Max(250)@ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue="25") @DefaultValue("25")  @QueryParam("page_size") Integer pageSize) {
        return delegate.businessMemberAssetsGet(businessId, memberId, assetType, startIndex, sortBy, sortAscending, searchBy, searchValue, assetPermissionType, adAccountStatuses, bookmark, pageSize, securityContext);
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
        @ApiResponse(code = 200, message = "The request has succeeded.", response = DeleteMemberAccessResultsResponseArray.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response businessMembersAssetAccessDelete( @Pattern(regexp="^\\d+$") @Size(min=1,max=20)@ApiParam(value = "Unique identifier of the requesting business.",required=true) @PathParam("business_id") String businessId, @ApiParam(value = "" ,required=true) BusinessMembersAssetAccessDeleteBody businessMembersAssetAccessDeleteBody) {
        return delegate.businessMembersAssetAccessDelete(businessId, businessMembersAssetAccessDeleteBody, securityContext);
    }

    @PATCH
    @Path("/{business_id}/members/assets/access")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Assign/Update member asset permissions", notes = "Grant multiple members access to assets and/or update multiple member's exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.", response = UpdateMemberAssetsResultsResponseArray.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data") })
         }, tags={ "business_access_assets" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = UpdateMemberAssetsResultsResponseArray.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response businessMembersAssetAccessUpdate( @Pattern(regexp="^\\d+$") @Size(min=1,max=20)@ApiParam(value = "Unique identifier of the requesting business.",required=true) @PathParam("business_id") String businessId, @ApiParam(value = "" ,required=true) UpdateMemberAssetAccessBody updateMemberAssetAccessBody) {
        return delegate.businessMembersAssetAccessUpdate(businessId, updateMemberAssetAccessBody, securityContext);
    }

    @GET
    @Path("/{business_id}/partners/{partner_id}/assets")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get assets assigned to a partner or assets assigned by a partner", notes = "Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type=INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type=EXTERNAL, you will retrieve the partner's business assets that the partner has granted you access to.", response = BusinessPartnerAssetAccessGet200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "biz_access:read", description = "See business access data") })
         }, tags={ "business_access_assets" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = BusinessPartnerAssetAccessGet200Response.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response businessPartnerAssetAccessGet( @Pattern(regexp="^\\d+$") @Size(min=1,max=20)@ApiParam(value = "Unique identifier of the requesting business.",required=true) @PathParam("business_id") String businessId,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)@ApiParam(value = "The partner id to be bound to the Business",required=true) @PathParam("partner_id") String partnerId, @ApiParam(value = "Specifies whether to fetch internal or external (shared) partners.  If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.  If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset.", allowableValues="INTERNAL, EXTERNAL", defaultValue="INTERNAL") @DefaultValue("INTERNAL")  @QueryParam("partner_type") String partnerType, @ApiParam(value = "A resource type to filter the assets by. Only assets of the specified type will be returned.", allowableValues="AD_ACCOUNT, PROFILE, ASSET_GROUP, PINNER_LIST, CONVERSION_TAG, CATALOG, CONSUMER, CONVERSION_SEGMENT", defaultValue="AD_ACCOUNT") @DefaultValue("AD_ACCOUNT")  @QueryParam("asset_type") String assetType,  @Min(0)@ApiParam(value = "An index to start fetching the results from. Only the results starting from this index will be returned.", defaultValue="0") @DefaultValue("0")  @QueryParam("start_index") Integer startIndex, @ApiParam(value = "The field to sort member assets by", allowableValues="NAME, ID, PERMISSIONS")  @QueryParam("sort_by") AssetSortBy sortBy, @ApiParam(value = "Sort assets in ascending order", defaultValue="true") @DefaultValue("true")  @QueryParam("sort_ascending") Boolean sortAscending, @ApiParam(value = "The field to search member assets by", allowableValues="NAME, ID, NAME_OR_ID, OWNER_NAME, NAME_OR_OWNER")  @QueryParam("search_by") AssetSearchBy searchBy, @ApiParam(value = "The value to search for")  @QueryParam("search_value") String searchValue, @ApiParam(value = "Cursor used to fetch the next page of items")  @QueryParam("bookmark") String bookmark,  @Min(1) @Max(250)@ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue="25") @DefaultValue("25")  @QueryParam("page_size") Integer pageSize) {
        return delegate.businessPartnerAssetAccessGet(businessId, partnerId, partnerType, assetType, startIndex, sortBy, sortAscending, searchBy, searchValue, bookmark, pageSize, securityContext);
    }

    @DELETE
    @Path("/{business_id}/invites")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Cancel invites/requests", notes = "Cancel membership/partnership invites and/or requests.", response = CancelInvitesResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data") })
         }, tags={ "business_access_invite" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = CancelInvitesResponse.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response cancelInvitesOrRequests( @Pattern(regexp="^\\d+$") @Size(min=1)@ApiParam(value = "Unique identifier of the requesting business.",required=true) @PathParam("business_id") String businessId, @ApiParam(value = "" ,required=true) CancelInvitesRequest cancelInvitesRequest) {
        return delegate.cancelInvitesOrRequests(businessId, cancelInvitesRequest, securityContext);
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
        @ApiResponse(code = 200, message = "The request has succeeded.", response = UpdateInvitesResultsResponseArray.class),
        @ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = UpdateInvitesResultsResponseArray.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response createAssetInvites( @Pattern(regexp="^\\d+$") @Size(min=1,max=20)@ApiParam(value = "Unique identifier of the requesting business.",required=true) @PathParam("business_id") String businessId, @ApiParam(value = "" ,required=true) CreateAssetInvitesRequest createAssetInvitesRequest) {
        return delegate.createAssetInvites(businessId, createAssetInvitesRequest, securityContext);
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
        @ApiResponse(code = 200, message = "The request has succeeded.", response = CreateInvitesResultsResponseArray.class),
        @ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = CreateInvitesResultsResponseArray.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response createMembershipOrPartnershipInvites( @Pattern(regexp="^\\d+$") @Size(min=1)@ApiParam(value = "Unique identifier of the requesting business.",required=true) @PathParam("business_id") String businessId, @ApiParam(value = "" ,required=true) CreateMembershipOrPartnershipInvitesBody createMembershipOrPartnershipInvitesBody) {
        return delegate.createMembershipOrPartnershipInvites(businessId, createMembershipOrPartnershipInvitesBody, securityContext);
    }

    @DELETE
    @Path("/{business_id}/members")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Terminate business memberships", notes = "Terminate memberships between the specified members and your business.", response = DeleteBusinessMembership200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "biz_access:read", description = "See business access data"),
            @AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data") })
         }, tags={ "business_access_relationships" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = DeleteBusinessMembership200Response.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response deleteBusinessMembership( @Pattern(regexp="^\\d+$") @Size(min=1,max=20)@ApiParam(value = "Business id",required=true) @PathParam("business_id") String businessId, @ApiParam(value = "" ,required=true) DeleteBusinessMembershipBody deleteBusinessMembershipBody) {
        return delegate.deleteBusinessMembership(businessId, deleteBusinessMembershipBody, securityContext);
    }

    @DELETE
    @Path("/{business_id}/partners")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Terminate business partnerships", notes = "Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.", response = DeleteBusinessPartners.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data") })
         }, tags={ "business_access_relationships" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = DeleteBusinessPartners.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response deleteBusinessPartners( @Pattern(regexp="^\\d+$") @Size(min=1,max=20)@ApiParam(value = "Unique identifier of the requesting business.",required=true) @PathParam("business_id") String businessId, @ApiParam(value = "" ,required=true) DeleteBusinessPartnersDelete deleteBusinessPartnersDelete) {
        return delegate.deleteBusinessPartners(businessId, deleteBusinessPartnersDelete, securityContext);
    }

    @DELETE
    @Path("/{business_id}/partners/assets")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete partner access to asset", notes = "Terminate multiple partners' access to an asset. If - partner_type=INTERNAL: You will terminate a partner's asset access to your business assets. - partner_type=EXTERNAL: You will terminate your own access to your partner's business assets.", response = DeletePartnerAssetAccessResultsResponseArray.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data") })
         }, tags={ "business_access_assets" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = DeletePartnerAssetAccessResultsResponseArray.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response deletePartnerAssetAccessHandlerImpl( @Pattern(regexp="^\\d+$") @Size(min=1,max=20)@ApiParam(value = "Unique identifier of the requesting business.",required=true) @PathParam("business_id") String businessId, @ApiParam(value = "" ,required=true) DeletePartnerAssetAccessBody deletePartnerAssetAccessBody) {
        return delegate.deletePartnerAssetAccessHandlerImpl(businessId, deletePartnerAssetAccessBody, securityContext);
    }

    @GET
    @Path("/employers")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List business employers for user", notes = "Get all of the viewing user's business employers.", response = GetBusinessEmployers200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "biz_access:read", description = "See business access data") })
         }, tags={ "business_access_relationships" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = GetBusinessEmployers200Response.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response getBusinessEmployers(@ApiParam(value = "Include assets summary in the response if this is true. Defaults to true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are", defaultValue="true") @DefaultValue("true")  @QueryParam("assets_summary") Boolean assetsSummary, @ApiParam(value = "Cursor used to fetch the next page of items")  @QueryParam("bookmark") String bookmark,  @Min(1) @Max(250)@ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue="25") @DefaultValue("25")  @QueryParam("page_size") Integer pageSize) {
        return delegate.getBusinessEmployers(assetsSummary, bookmark, pageSize, securityContext);
    }

    @GET
    @Path("/{business_id}/members")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get business members", notes = "Get all members of the specified business. The return response will include the member's business_role and assets they have access to if assets_summary=TRUE", response = GetBusinessEmployers200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "biz_access:read", description = "See business access data") })
         }, tags={ "business_access_relationships" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = GetBusinessEmployers200Response.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response getBusinessMembers( @Pattern(regexp="^\\d+$") @Size(min=1,max=20)@ApiParam(value = "Unique identifier of the requesting business.",required=true) @PathParam("business_id") String businessId, @ApiParam(value = "Fetches system users if True. Fetches regular user employees if False.", defaultValue="false") @DefaultValue("false")  @QueryParam("fetch_system_users") Boolean fetchSystemUsers, @ApiParam(value = "Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are", defaultValue="false") @DefaultValue("false")  @QueryParam("assets_summary") Boolean assetsSummary, @ApiParam(value = "A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned.")  @QueryParam("business_roles") List<MemberBusinessRole> businessRoles,  @Size(max=500)@ApiParam(value = "A list of business members ids separated by comma.")  @QueryParam("member_ids") String memberIds,  @Min(0)@ApiParam(value = "An index to start fetching the results from. Only the results starting from this index will be returned.", defaultValue="0") @DefaultValue("0")  @QueryParam("start_index") Integer startIndex, @ApiParam(value = "Cursor used to fetch the next page of items")  @QueryParam("bookmark") String bookmark,  @Min(1) @Max(250)@ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue="25") @DefaultValue("25")  @QueryParam("page_size") Integer pageSize) {
        return delegate.getBusinessMembers(businessId, fetchSystemUsers, assetsSummary, businessRoles, memberIds, startIndex, bookmark, pageSize, securityContext);
    }

    @GET
    @Path("/{business_id}/partners")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get business partners", notes = "Get all partners of the specified business.  If the assets_summary=TRUE and: - partner_type=INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type=EXTERNAL, the business assets returned are your partner's business assets the partner has granted you   access to.", response = GetBusinessEmployers200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "biz_access:read", description = "See business access data") })
         }, tags={ "business_access_relationships" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = GetBusinessEmployers200Response.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response getBusinessPartners( @Pattern(regexp="^\\d+$") @Size(min=1,max=20)@ApiParam(value = "Unique identifier of the requesting business.",required=true) @PathParam("business_id") String businessId, @ApiParam(value = "Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are", defaultValue="false") @DefaultValue("false")  @QueryParam("assets_summary") Boolean assetsSummary, @ApiParam(value = "Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets. If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset.", allowableValues="INTERNAL, EXTERNAL")  @QueryParam("partner_type") PartnerType partnerType,  @Size(max=500)@ApiParam(value = "A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned.")  @QueryParam("partner_ids") String partnerIds,  @Min(0)@ApiParam(value = "An index to start fetching the results from. Only the results starting from this index will be returned.", defaultValue="0") @DefaultValue("0")  @QueryParam("start_index") Integer startIndex, @ApiParam(value = "Sort ascending.")  @QueryParam("sort_ascending") Boolean sortAscending, @ApiParam(value = "Cursor used to fetch the next page of items")  @QueryParam("bookmark") String bookmark,  @Min(1) @Max(250)@ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue="25") @DefaultValue("25")  @QueryParam("page_size") Integer pageSize) {
        return delegate.getBusinessPartners(businessId, assetsSummary, partnerType, partnerIds, startIndex, sortAscending, bookmark, pageSize, securityContext);
    }

    @GET
    @Path("/{business_id}/invites")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get invites/requests", notes = "Get the membership/partnership invites and/or requests for the authorized user.", response = GetInvites200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "biz_access:read", description = "See business access data") })
         }, tags={ "business_access_invite" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = GetInvites200Response.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response getInvites( @Pattern(regexp="^\\d+$") @Size(min=1)@ApiParam(value = "Unique identifier of the requesting business.",required=true) @PathParam("business_id") String businessId, @ApiParam(value = "A boolean field to indicate whether the invite is to create a partnership or a membership.", defaultValue="true") @DefaultValue("true")  @QueryParam("is_member") Boolean isMember,  @Size(min=1)@ApiParam(value = "A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned.")  @QueryParam("invite_status") List<InviteFilterStatus> inviteStatus, @ApiParam(value = "Invite type to filter invites by. Only invites of the specified type will be returned.", allowableValues="MEMBER_INVITE, PARTNER_INVITE, PARTNER_REQUEST")  @QueryParam("invite_type") InviteType inviteType, @ApiParam(value = "Cursor used to fetch the next page of items")  @QueryParam("bookmark") String bookmark,  @Min(1) @Max(250)@ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue="25") @DefaultValue("25")  @QueryParam("page_size") Integer pageSize) {
        return delegate.getInvites(businessId, isMember, inviteStatus, inviteType, bookmark, pageSize, securityContext);
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
        @ApiResponse(code = 200, message = "The request has succeeded.", response = RespondToInvitesResponseArray.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response respondBusinessAccessInvites(@ApiParam(value = "" ,required=true) AuthRespondInvitesBody authRespondInvitesBody) {
        return delegate.respondBusinessAccessInvites(authRespondInvitesBody, securityContext);
    }

    @GET
    @Path("/{business_id}/audiences")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List received audiences for a business", notes = "Get a list of received audiences for the given business.", response = SharedAudiencesForBusinessList200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "biz_access:read", description = "See business access data") })
         }, tags={ "audience_sharing" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = SharedAudiencesForBusinessList200Response.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response sharedAudiencesForBusinessList( @Pattern(regexp="^\\d+$") @Size(min=1,max=20)@ApiParam(value = "Unique identifier of the requesting business.",required=true) @PathParam("business_id") String businessId, @ApiParam(value = "The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues="ASCENDING, DESCENDING")  @QueryParam("order") Order order, @ApiParam(value = "Cursor used to fetch the next page of items")  @QueryParam("bookmark") String bookmark,  @Min(1) @Max(250)@ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue="25") @DefaultValue("25")  @QueryParam("page_size") Integer pageSize) {
        return delegate.sharedAudiencesForBusinessList(businessId, order, bookmark, pageSize, securityContext);
    }

    @PATCH
    @Path("/{business_id}/system_users/{system_user_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update a system user information.", notes = "Update a system user information such as name.", response = Void.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "biz_access:read", description = "See business access data"),
            @AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data") })
         }, tags={ "business_access_relationships" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = Void.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response systemUserUpdate( @Pattern(regexp="^\\d+$") @Size(min=1,max=20)@ApiParam(value = "Unique identifier of the requesting business.",required=true) @PathParam("business_id") String businessId,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)@ApiParam(value = "Unique identifier of a system user.",required=true) @PathParam("system_user_id") String systemUserId, @ApiParam(value = "" ,required=true) SystemUserUpdateWithRequiredBody systemUserUpdateWithRequiredBody) {
        return delegate.systemUserUpdate(businessId, systemUserId, systemUserUpdateWithRequiredBody, securityContext);
    }

    @PATCH
    @Path("/{business_id}/members")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update member's business role", notes = "Update a member's business role within the business.", response = UpdateBusinessMembershipsResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data") })
         }, tags={ "business_access_relationships" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = UpdateBusinessMembershipsResponse.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response updateBusinessMemberships( @Pattern(regexp="^\\d+$") @Size(min=1,max=20)@ApiParam(value = "Business id",required=true) @PathParam("business_id") String businessId, @ApiParam(value = "" ,required=true) List<@Valid BusinessMembershipMember> businessMembershipMember) {
        return delegate.updateBusinessMemberships(businessId, businessMembershipMember, securityContext);
    }

    @PATCH
    @Path("/{business_id}/audiences/ad_accounts/shared")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update audience sharing from a business to ad accounts", notes = "From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience.  - If the business is the owner of the audience, it can share with any ad account within the same business hierarchy. - If the business is the recipient of the audience, it can share with any of its owned ad accounts.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).", response = BusinessToAdAccountSharedAudience.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data") })
         }, tags={ "audience_sharing" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = BusinessToAdAccountSharedAudience.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response updateBusinessToAdAccountSharedAudience( @Pattern(regexp="^\\d+$") @Size(min=1,max=20)@ApiParam(value = "Unique identifier of the requesting business.",required=true) @PathParam("business_id") String businessId, @ApiParam(value = "" ,required=true) BusinessToAdAccountSharedAudienceUpdateWithRequiredBody businessToAdAccountSharedAudienceUpdateWithRequiredBody) {
        return delegate.updateBusinessToAdAccountSharedAudience(businessId, businessToAdAccountSharedAudienceUpdateWithRequiredBody, securityContext);
    }

    @PATCH
    @Path("/{business_id}/audiences/businesses/shared")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update audience sharing between businesses", notes = "From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).", response = BusinessToBusinessSharedAudience.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data") })
         }, tags={ "audience_sharing" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = BusinessToBusinessSharedAudience.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response updateBusinessToBusinessSharedAudience( @Pattern(regexp="^\\d+$") @Size(min=1,max=20)@ApiParam(value = "Unique identifier of the requesting business.",required=true) @PathParam("business_id") String businessId, @ApiParam(value = "" ,required=true) BusinessToBusinessSharedAudienceUpdateWithRequiredBody businessToBusinessSharedAudienceUpdateWithRequiredBody) {
        return delegate.updateBusinessToBusinessSharedAudience(businessId, businessToBusinessSharedAudienceUpdateWithRequiredBody, securityContext);
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
        @ApiResponse(code = 200, message = "The request has succeeded.", response = UpdatePartnerAssetsResultsResponseArray.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response updatePartnerAssetAccessHandlerImpl( @Pattern(regexp="^\\d+$") @Size(min=1,max=20)@ApiParam(value = "Unique identifier of the requesting business.",required=true) @PathParam("business_id") String businessId, @ApiParam(value = "" ,required=true) UpdatePartnerAssetAccessBody updatePartnerAssetAccessBody) {
        return delegate.updatePartnerAssetAccessHandlerImpl(businessId, updatePartnerAssetAccessBody, securityContext);
    }
}
