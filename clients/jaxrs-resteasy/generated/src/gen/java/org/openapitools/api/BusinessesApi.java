package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.BusinessesApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

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

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/businesses")


@io.swagger.annotations.Api(description = "the businesses API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-08-30T09:54:34.006998108Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BusinessesApi  {

    @Inject BusinessesApiService service;

    @POST
    @Path("/{business_id}/requests/assets/access")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create a request to access an existing partner's assets.", notes = "Create a request to access an existing partner's assets with the specified permissions. The request will be sent to the partner for approval. The assets that can be requested are ad accounts and profiles.", response = CreateAssetAccessRequestResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:read", description = "See business access data"),
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data")
        })
    }, tags={ "business_access_invite", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = CreateAssetAccessRequestResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = CreateAssetAccessRequestResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response assetAccessRequestsCreate( @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") String businessId,@ApiParam(value = "" ,required=true) @NotNull @Valid CreateAssetAccessRequestBody createAssetAccessRequestBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.assetAccessRequestsCreate(businessId,createAssetAccessRequestBody,securityContext);
    }
    @POST
    @Path("/{business_id}/asset_groups")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create a new asset group.", notes = "Create a new asset group with the specified parameters. - An [asset group](https://help.pinterest.com/en/business/article/asset-groups) is a custom group of assets based on how you would like to manage your accounts.", response = AssetGroupInput.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:read", description = "See business access data"),
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data")
        })
    }, tags={ "business_access_assets", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = AssetGroupInput.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = AssetGroupInput.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response assetGroupCreate( @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") String businessId,@ApiParam(value = "" ,required=true) @NotNull @Valid AssetGroupInputCreate assetGroupInputCreate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.assetGroupCreate(businessId,assetGroupInputCreate,securityContext);
    }
    @DELETE
    @Path("/{business_id}/asset_groups")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete asset groups.", notes = "Delete a batch of asset groups.", response = AssetGroupDeletion.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:read", description = "See business access data"),
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data")
        })
    }, tags={ "business_access_assets", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = AssetGroupDeletion.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response assetGroupDelete( @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") String businessId,@ApiParam(value = "" ,required=true) @NotNull @Valid AssetGroupDeletionDelete assetGroupDeletionDelete,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.assetGroupDelete(businessId,assetGroupDeletionDelete,securityContext);
    }
    @PATCH
    @Path("/{business_id}/asset_groups")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update asset groups.", notes = "Update a batch of asset groups with the specified parameters.", response = AssetGroupModification.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:read", description = "See business access data"),
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data")
        })
    }, tags={ "business_access_assets", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = AssetGroupModification.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response assetGroupUpdate( @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") String businessId,@ApiParam(value = "" ,required=true) @NotNull @Valid AssetGroupModificationReadOrUpdate assetGroupModificationReadOrUpdate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.assetGroupUpdate(businessId,assetGroupModificationReadOrUpdate,securityContext);
    }
    @GET
    @Path("/{business_id}/audiences/shared/accounts")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List accounts with access to an audience owned by a business", notes = "List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.", response = AdAccountsAudiencesSharedAccountsList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:read", description = "See business access data")
        })
    }, tags={ "audience_sharing", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = AdAccountsAudiencesSharedAccountsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response businessAccountAudiencesSharedAccountsList( @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") String businessId, @NotNull @Pattern(regexp="^\\d+$") @Size(max=18) @QueryParam("audience_id") String audienceId, @NotNull, allowableValues="AD_ACCOUNT, BUSINESS_ACCOUNT" @QueryParam("account_type") AudienceAccountType accountType, @QueryParam("bookmark") String bookmark, @Min(1) @Max(250) @DefaultValue("25") @QueryParam("page_size") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.businessAccountAudiencesSharedAccountsList(businessId,audienceId,accountType,bookmark,pageSize,securityContext);
    }
    @GET
    @Path("/{business_id}/assets/{asset_id}/members")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get members with access to asset", notes = "Get all the members the requesting business has granted access to on the given asset.", response = BusinessAssetMembersGet200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:read", description = "See business access data")
        })
    }, tags={ "business_access_assets", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = BusinessAssetMembersGet200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response businessAssetMembersGet( @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") String businessId, @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("asset_id") String assetId, @Min(0) @DefaultValue("0") @QueryParam("start_index") Integer startIndex, @DefaultValue("false") @QueryParam("fetch_system_users") Boolean fetchSystemUsers, @QueryParam("bookmark") String bookmark, @Min(1) @Max(250) @DefaultValue("25") @QueryParam("page_size") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.businessAssetMembersGet(businessId,assetId,startIndex,fetchSystemUsers,bookmark,pageSize,securityContext);
    }
    @GET
    @Path("/{business_id}/assets/{asset_id}/partners")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get partners with access to asset", notes = "Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.", response = BusinessAssetMembersGet200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:read", description = "See business access data")
        })
    }, tags={ "business_access_assets", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = BusinessAssetMembersGet200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response businessAssetPartnersGet( @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") String businessId, @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("asset_id") String assetId, @Min(0) @DefaultValue("0") @QueryParam("start_index") Integer startIndex, @QueryParam("bookmark") String bookmark, @Min(1) @Max(250) @DefaultValue("25") @QueryParam("page_size") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.businessAssetPartnersGet(businessId,assetId,startIndex,bookmark,pageSize,securityContext);
    }
    @GET
    @Path("/{business_id}/assets")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List business assets", notes = "Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.", response = BusinessAssetsGet200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:read", description = "See business access data")
        })
    }, tags={ "business_access_assets", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = BusinessAssetsGet200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response businessAssetsGet( @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") String businessId, @QueryParam("permissions") List<PermissionsWithOwner> permissions, @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @QueryParam("child_asset_id") String childAssetId, @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @QueryParam("asset_group_id") String assetGroupId,, allowableValues="AD_ACCOUNT, PROFILE, ASSET_GROUP, CATALOG, CONSUMER" @DefaultValue("AD_ACCOUNT") @QueryParam("asset_type") String assetType, @Min(0) @DefaultValue("0") @QueryParam("start_index") Integer startIndex, @QueryParam("bookmark") String bookmark, @Min(1) @Max(250) @DefaultValue("25") @QueryParam("page_size") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.businessAssetsGet(businessId,permissions,childAssetId,assetGroupId,assetType,startIndex,bookmark,pageSize,securityContext);
    }
    @GET
    @Path("/{business_id}/members/{member_id}/assets")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get assets assigned to a member", notes = "Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.", response = BusinessMemberAssetsGetResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:read", description = "See business access data")
        })
    }, tags={ "business_access_assets", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = BusinessMemberAssetsGetResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response businessMemberAssetsGet( @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") String businessId, @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("member_id") String memberId,, allowableValues="AD_ACCOUNT, PROFILE, ASSET_GROUP, CATALOG, CONSUMER, CONVERSION_TAG" @DefaultValue("AD_ACCOUNT") @QueryParam("asset_type") String assetType, @Min(0) @DefaultValue("0") @QueryParam("start_index") Integer startIndex,, allowableValues="NAME, ID, PERMISSIONS" @QueryParam("sort_by") AssetSortBy sortBy, @DefaultValue("true") @QueryParam("sort_ascending") Boolean sortAscending,, allowableValues="NAME, ID, NAME_OR_ID, OWNER_NAME, NAME_OR_OWNER" @QueryParam("search_by") AssetSearchBy searchBy, @QueryParam("search_value") String searchValue,, allowableValues="AGGREGATED_PERMISSION, DIRECT_PERMISSION" @QueryParam("asset_permission_type") AssetPermissionType assetPermissionType, @QueryParam("ad_account_statuses") List<NonDraftEntityStatus> adAccountStatuses, @QueryParam("bookmark") String bookmark, @Min(1) @Max(250) @DefaultValue("25") @QueryParam("page_size") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.businessMemberAssetsGet(businessId,memberId,assetType,startIndex,sortBy,sortAscending,searchBy,searchValue,assetPermissionType,adAccountStatuses,bookmark,pageSize,securityContext);
    }
    @DELETE
    @Path("/{business_id}/members/assets/access")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete member access to asset", notes = "Terminate multiple members' access to an asset.", response = DeleteMemberAccessResultsResponseArray.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data")
        })
    }, tags={ "business_access_assets", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = DeleteMemberAccessResultsResponseArray.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response businessMembersAssetAccessDelete( @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") String businessId,@ApiParam(value = "" ,required=true) @NotNull @Valid BusinessMembersAssetAccessDeleteBody businessMembersAssetAccessDeleteBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.businessMembersAssetAccessDelete(businessId,businessMembersAssetAccessDeleteBody,securityContext);
    }
    @PATCH
    @Path("/{business_id}/members/assets/access")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Assign/Update member asset permissions", notes = "Grant multiple members access to assets and/or update multiple member's exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.", response = UpdateMemberAssetsResultsResponseArray.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data")
        })
    }, tags={ "business_access_assets", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = UpdateMemberAssetsResultsResponseArray.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response businessMembersAssetAccessUpdate( @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") String businessId,@ApiParam(value = "" ,required=true) @NotNull @Valid UpdateMemberAssetAccessBody updateMemberAssetAccessBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.businessMembersAssetAccessUpdate(businessId,updateMemberAssetAccessBody,securityContext);
    }
    @GET
    @Path("/{business_id}/partners/{partner_id}/assets")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get assets assigned to a partner or assets assigned by a partner", notes = "Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type=INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type=EXTERNAL, you will retrieve the partner's business assets that the partner has granted you access to.", response = BusinessPartnerAssetAccessGet200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:read", description = "See business access data")
        })
    }, tags={ "business_access_assets", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = BusinessPartnerAssetAccessGet200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response businessPartnerAssetAccessGet( @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") String businessId, @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("partner_id") String partnerId,, allowableValues="INTERNAL, EXTERNAL" @DefaultValue("INTERNAL") @QueryParam("partner_type") String partnerType,, allowableValues="AD_ACCOUNT, PROFILE, ASSET_GROUP, PINNER_LIST, CONVERSION_TAG, CATALOG, CONSUMER, CONVERSION_SEGMENT" @DefaultValue("AD_ACCOUNT") @QueryParam("asset_type") String assetType, @Min(0) @DefaultValue("0") @QueryParam("start_index") Integer startIndex,, allowableValues="NAME, ID, PERMISSIONS" @QueryParam("sort_by") AssetSortBy sortBy, @DefaultValue("true") @QueryParam("sort_ascending") Boolean sortAscending,, allowableValues="NAME, ID, NAME_OR_ID, OWNER_NAME, NAME_OR_OWNER" @QueryParam("search_by") AssetSearchBy searchBy, @QueryParam("search_value") String searchValue, @QueryParam("bookmark") String bookmark, @Min(1) @Max(250) @DefaultValue("25") @QueryParam("page_size") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.businessPartnerAssetAccessGet(businessId,partnerId,partnerType,assetType,startIndex,sortBy,sortAscending,searchBy,searchValue,bookmark,pageSize,securityContext);
    }
    @DELETE
    @Path("/{business_id}/invites")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Cancel invites/requests", notes = "Cancel membership/partnership invites and/or requests.", response = CancelInvitesResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data")
        })
    }, tags={ "business_access_invite", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = CancelInvitesResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response cancelInvitesOrRequests( @Pattern(regexp="^\\d+$") @Size(min=1) @PathParam("business_id") String businessId,@ApiParam(value = "" ,required=true) @NotNull @Valid CancelInvitesRequest cancelInvitesRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.cancelInvitesOrRequests(businessId,cancelInvitesRequest,securityContext);
    }
    @POST
    @Path("/{business_id}/invites/assets/access")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update invite/request with an asset permission", notes = "Assign asset permissions information to an existing invite/request. Can be used to: - Request access to a partner's asset. Note: This is only for when no existing partnership exists. If an existing   partnership exists, use \"Create a request to access an existing partner's assets\" to request access to your   partner's assets.     - invite_type=\"PARTNER_REQUEST\" - Invite a partner to access your business assets. Note: This is only for when there is no existing partnership.   If there is an existing partnership, use \"Assign/Update partner asset permissions\" to assign a partner access to   new assets.     - invite_type=\"PARTNER_INVITE\" - Invite a member to access your business assets. Note: This is only for when there is no existing membership.   If there is an existing membership, use \"Assign/Update member asset permissions\" to assign a member access to new   assets.     - invite_type=\"MEMBER_INVITE\"  To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview.", response = UpdateInvitesResultsResponseArray.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:read", description = "See business access data"),
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data")
        })
    }, tags={ "business_access_invite", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = UpdateInvitesResultsResponseArray.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = UpdateInvitesResultsResponseArray.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response createAssetInvites( @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") String businessId,@ApiParam(value = "" ,required=true) @NotNull @Valid CreateAssetInvitesRequest createAssetInvitesRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createAssetInvites(businessId,createAssetInvitesRequest,securityContext);
    }
    @POST
    @Path("/{business_id}/invites")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create invites or requests", notes = "Create batch invites or requests. Can create batch invites or requests as described below. - Invite members to join the business. This would required specifying the following:     - invite_type=\"MEMBER_INVITE\"     - business_role=\"EMPLOYEE\" OR business_role=\"BIZ_ADMIN\" (To learn more about business roles, visit     https://help.pinterest.com/en/business/article/profile-permissions-in-business-access.)     - members - Invite partners to access your business assets. This would require specifying the following:     - invite_type=\"PARTNER_INVITE\"     - business_role=\"PARTNER\"     - partners - Request to be a partner so you can access their assets. This would require specifying the following:     - invite_type=\"PARTNER_REQUEST\"     - business_role=\"PARTNER\"     - partners", response = CreateInvitesResultsResponseArray.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data")
        })
    }, tags={ "business_access_invite", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = CreateInvitesResultsResponseArray.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = CreateInvitesResultsResponseArray.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response createMembershipOrPartnershipInvites( @Pattern(regexp="^\\d+$") @Size(min=1) @PathParam("business_id") String businessId,@ApiParam(value = "" ,required=true) @NotNull @Valid CreateMembershipOrPartnershipInvitesBody createMembershipOrPartnershipInvitesBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createMembershipOrPartnershipInvites(businessId,createMembershipOrPartnershipInvitesBody,securityContext);
    }
    @DELETE
    @Path("/{business_id}/members")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Terminate business memberships", notes = "Terminate memberships between the specified members and your business.", response = DeleteBusinessMembership200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:read", description = "See business access data"),
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data")
        })
    }, tags={ "business_access_relationships", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = DeleteBusinessMembership200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response deleteBusinessMembership( @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") String businessId,@ApiParam(value = "" ,required=true) @NotNull @Valid DeleteBusinessMembershipBody deleteBusinessMembershipBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteBusinessMembership(businessId,deleteBusinessMembershipBody,securityContext);
    }
    @DELETE
    @Path("/{business_id}/partners")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Terminate business partnerships", notes = "Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.", response = DeleteBusinessPartners.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data")
        })
    }, tags={ "business_access_relationships", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = DeleteBusinessPartners.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response deleteBusinessPartners( @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") String businessId,@ApiParam(value = "" ,required=true) @NotNull @Valid DeleteBusinessPartnersDelete deleteBusinessPartnersDelete,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteBusinessPartners(businessId,deleteBusinessPartnersDelete,securityContext);
    }
    @DELETE
    @Path("/{business_id}/partners/assets")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete partner access to asset", notes = "Terminate multiple partners' access to an asset. If - partner_type=INTERNAL: You will terminate a partner's asset access to your business assets. - partner_type=EXTERNAL: You will terminate your own access to your partner's business assets.", response = DeletePartnerAssetAccessResultsResponseArray.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data")
        })
    }, tags={ "business_access_assets", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = DeletePartnerAssetAccessResultsResponseArray.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response deletePartnerAssetAccessHandlerImpl( @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") String businessId,@ApiParam(value = "" ,required=true) @NotNull @Valid DeletePartnerAssetAccessBody deletePartnerAssetAccessBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deletePartnerAssetAccessHandlerImpl(businessId,deletePartnerAssetAccessBody,securityContext);
    }
    @GET
    @Path("/employers")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List business employers for user", notes = "Get all of the viewing user's business employers.", response = GetBusinessEmployers200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:read", description = "See business access data")
        })
    }, tags={ "business_access_relationships", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = GetBusinessEmployers200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response getBusinessEmployers( @DefaultValue("true") @QueryParam("assets_summary") Boolean assetsSummary, @QueryParam("bookmark") String bookmark, @Min(1) @Max(250) @DefaultValue("25") @QueryParam("page_size") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getBusinessEmployers(assetsSummary,bookmark,pageSize,securityContext);
    }
    @GET
    @Path("/{business_id}/members")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get business members", notes = "Get all members of the specified business. The return response will include the member's business_role and assets they have access to if assets_summary=TRUE", response = GetBusinessEmployers200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:read", description = "See business access data")
        })
    }, tags={ "business_access_relationships", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = GetBusinessEmployers200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response getBusinessMembers( @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") String businessId, @DefaultValue("false") @QueryParam("fetch_system_users") Boolean fetchSystemUsers, @DefaultValue("false") @QueryParam("assets_summary") Boolean assetsSummary, @QueryParam("business_roles") List<MemberBusinessRole> businessRoles, @Size(max=500) @QueryParam("member_ids") String memberIds, @Min(0) @DefaultValue("0") @QueryParam("start_index") Integer startIndex, @QueryParam("bookmark") String bookmark, @Min(1) @Max(250) @DefaultValue("25") @QueryParam("page_size") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getBusinessMembers(businessId,fetchSystemUsers,assetsSummary,businessRoles,memberIds,startIndex,bookmark,pageSize,securityContext);
    }
    @GET
    @Path("/{business_id}/partners")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get business partners", notes = "Get all partners of the specified business.  If the assets_summary=TRUE and: - partner_type=INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type=EXTERNAL, the business assets returned are your partner's business assets the partner has granted you   access to.", response = GetBusinessEmployers200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:read", description = "See business access data")
        })
    }, tags={ "business_access_relationships", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = GetBusinessEmployers200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response getBusinessPartners( @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") String businessId, @DefaultValue("false") @QueryParam("assets_summary") Boolean assetsSummary,, allowableValues="INTERNAL, EXTERNAL" @QueryParam("partner_type") PartnerType partnerType, @Size(max=500) @QueryParam("partner_ids") String partnerIds, @Min(0) @DefaultValue("0") @QueryParam("start_index") Integer startIndex, @QueryParam("sort_ascending") Boolean sortAscending, @QueryParam("bookmark") String bookmark, @Min(1) @Max(250) @DefaultValue("25") @QueryParam("page_size") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getBusinessPartners(businessId,assetsSummary,partnerType,partnerIds,startIndex,sortAscending,bookmark,pageSize,securityContext);
    }
    @GET
    @Path("/{business_id}/invites")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get invites/requests", notes = "Get the membership/partnership invites and/or requests for the authorized user.", response = GetInvites200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:read", description = "See business access data")
        })
    }, tags={ "business_access_invite", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = GetInvites200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response getInvites( @Pattern(regexp="^\\d+$") @Size(min=1) @PathParam("business_id") String businessId, @DefaultValue("true") @QueryParam("is_member") Boolean isMember, @Size(min=1) @QueryParam("invite_status") List<InviteFilterStatus> inviteStatus,, allowableValues="MEMBER_INVITE, PARTNER_INVITE, PARTNER_REQUEST" @QueryParam("invite_type") InviteType inviteType, @QueryParam("bookmark") String bookmark, @Min(1) @Max(250) @DefaultValue("25") @QueryParam("page_size") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getInvites(businessId,isMember,inviteStatus,inviteType,bookmark,pageSize,securityContext);
    }
    @PATCH
    @Path("/invites")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Accept or decline an invite/request", notes = "Accept or decline invites or requests.", response = RespondToInvitesResponseArray.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:read", description = "See business access data"),
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data")
        })
    }, tags={ "business_access_invite", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = RespondToInvitesResponseArray.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response respondBusinessAccessInvites(@ApiParam(value = "" ,required=true) @NotNull @Valid AuthRespondInvitesBody authRespondInvitesBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.respondBusinessAccessInvites(authRespondInvitesBody,securityContext);
    }
    @GET
    @Path("/{business_id}/audiences")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List received audiences for a business", notes = "Get a list of received audiences for the given business.", response = SharedAudiencesForBusinessList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:read", description = "See business access data")
        })
    }, tags={ "audience_sharing", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = SharedAudiencesForBusinessList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response sharedAudiencesForBusinessList( @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") String businessId,, allowableValues="ASCENDING, DESCENDING" @QueryParam("order") Order order, @QueryParam("bookmark") String bookmark, @Min(1) @Max(250) @DefaultValue("25") @QueryParam("page_size") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.sharedAudiencesForBusinessList(businessId,order,bookmark,pageSize,securityContext);
    }
    @PATCH
    @Path("/{business_id}/system_users/{system_user_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update a system user information.", notes = "Update a system user information such as name.", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:read", description = "See business access data"),
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data")
        })
    }, tags={ "business_access_relationships", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response systemUserUpdate( @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") String businessId, @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("system_user_id") String systemUserId,@ApiParam(value = "" ,required=true) @NotNull @Valid SystemUserUpdateWithRequiredBody systemUserUpdateWithRequiredBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.systemUserUpdate(businessId,systemUserId,systemUserUpdateWithRequiredBody,securityContext);
    }
    @PATCH
    @Path("/{business_id}/members")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update member's business role", notes = "Update a member's business role within the business.", response = UpdateBusinessMembershipsResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data")
        })
    }, tags={ "business_access_relationships", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = UpdateBusinessMembershipsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response updateBusinessMemberships( @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") String businessId,@ApiParam(value = "" ,required=true) @NotNull @Valid List<@Valid BusinessMembershipMember> businessMembershipMember,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateBusinessMemberships(businessId,businessMembershipMember,securityContext);
    }
    @PATCH
    @Path("/{business_id}/audiences/ad_accounts/shared")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update audience sharing from a business to ad accounts", notes = "From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience.  - If the business is the owner of the audience, it can share with any ad account within the same business hierarchy. - If the business is the recipient of the audience, it can share with any of its owned ad accounts.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).", response = BusinessToAdAccountSharedAudience.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data")
        })
    }, tags={ "audience_sharing", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = BusinessToAdAccountSharedAudience.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response updateBusinessToAdAccountSharedAudience( @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") String businessId,@ApiParam(value = "" ,required=true) @NotNull @Valid BusinessToAdAccountSharedAudienceUpdateWithRequiredBody businessToAdAccountSharedAudienceUpdateWithRequiredBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateBusinessToAdAccountSharedAudience(businessId,businessToAdAccountSharedAudienceUpdateWithRequiredBody,securityContext);
    }
    @PATCH
    @Path("/{business_id}/audiences/businesses/shared")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update audience sharing between businesses", notes = "From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).", response = BusinessToBusinessSharedAudience.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data")
        })
    }, tags={ "audience_sharing", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = BusinessToBusinessSharedAudience.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response updateBusinessToBusinessSharedAudience( @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") String businessId,@ApiParam(value = "" ,required=true) @NotNull @Valid BusinessToBusinessSharedAudienceUpdateWithRequiredBody businessToBusinessSharedAudienceUpdateWithRequiredBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateBusinessToBusinessSharedAudience(businessId,businessToBusinessSharedAudienceUpdateWithRequiredBody,securityContext);
    }
    @PATCH
    @Path("/{business_id}/partners/assets")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Assign/Update partner asset permissions", notes = "Grant multiple partners access to assets and/or update multiple partner's exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.", response = UpdatePartnerAssetsResultsResponseArray.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data")
        })
    }, tags={ "business_access_assets", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = UpdatePartnerAssetsResultsResponseArray.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response updatePartnerAssetAccessHandlerImpl( @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") String businessId,@ApiParam(value = "" ,required=true) @NotNull @Valid UpdatePartnerAssetAccessBody updatePartnerAssetAccessBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updatePartnerAssetAccessHandlerImpl(businessId,updatePartnerAssetAccessBody,securityContext);
    }
}
