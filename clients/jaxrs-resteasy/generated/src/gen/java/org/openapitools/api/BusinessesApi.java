package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.BusinessesApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-11-05T02:20:31.447227872Z[Etc/UTC]", comments = "Generator version: 7.9.0")
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
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = CreateAssetAccessRequestResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response assetAccessRequestsCreate( @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") String businessId,@ApiParam(value = "" ,required=true) @NotNull @Valid CreateAssetAccessRequestBody createAssetAccessRequestBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.assetAccessRequestsCreate(businessId,createAssetAccessRequestBody,securityContext);
    }
    @POST
    @Path("/{business_id}/asset_groups")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create a new asset group.", notes = "Create a new asset group with the specified parameters. - An <a href=\"https://help.pinterest.com/en/business/article/asset-groups\">asset group</a> is a custom group of assets based on how you’d like to manage your accounts.", response = CreateAssetGroupResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:read", description = "See business access data"),
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data")
        })
    }, tags={ "business_access_assets", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = CreateAssetGroupResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid parameters.", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response assetGroupCreate( @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") String businessId,@ApiParam(value = "" ,required=true) @NotNull @Valid CreateAssetGroupBody createAssetGroupBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.assetGroupCreate(businessId,createAssetGroupBody,securityContext);
    }
    @DELETE
    @Path("/{business_id}/asset_groups")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete asset groups.", notes = "Delete a batch of asset groups.", response = DeleteAssetGroupResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:read", description = "See business access data"),
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data")
        })
    }, tags={ "business_access_assets", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = DeleteAssetGroupResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid parameters.", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response assetGroupDelete( @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") String businessId,@ApiParam(value = "" ,required=true) @NotNull @Valid DeleteAssetGroupBody deleteAssetGroupBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.assetGroupDelete(businessId,deleteAssetGroupBody,securityContext);
    }
    @PATCH
    @Path("/{business_id}/asset_groups")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update asset groups.", notes = "Update a batch of asset groups with the specified parameters.", response = UpdateAssetGroupResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:read", description = "See business access data"),
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data")
        })
    }, tags={ "business_access_assets", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = UpdateAssetGroupResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid parameters.", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response assetGroupUpdate( @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") String businessId,@ApiParam(value = "" ,required=true) @NotNull @Valid UpdateAssetGroupBody updateAssetGroupBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.assetGroupUpdate(businessId,updateAssetGroupBody,securityContext);
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
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = AdAccountsAudiencesSharedAccountsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid business audiences shared accounts parameters.", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Shared accounts not found.", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = Error.class) })
    public Response businessAccountAudiencesSharedAccountsList( @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") String businessId, @NotNull @Pattern(regexp="^\\d+$") @Size(max=18) @QueryParam("audience_id") String audienceId, @NotNull, allowableValues="AD_ACCOUNT, BUSINESS_ACCOUNT" @DefaultValue("AD_ACCOUNT") @QueryParam("account_type") AudienceAccountType accountType, @Min(1) @Max(250) @DefaultValue("25") @QueryParam("page_size") Integer pageSize, @QueryParam("bookmark") String bookmark,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.businessAccountAudiencesSharedAccountsList(businessId,audienceId,accountType,pageSize,bookmark,securityContext);
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
        @io.swagger.annotations.ApiResponse(code = 200, message = "Sucess", response = BusinessAssetMembersGet200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response businessAssetMembersGet( @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") String businessId, @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("asset_id") String assetId, @QueryParam("bookmark") String bookmark, @Min(1) @Max(250) @DefaultValue("25") @QueryParam("page_size") Integer pageSize, @Min(0) @DefaultValue("0") @QueryParam("start_index") Integer startIndex,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.businessAssetMembersGet(businessId,assetId,bookmark,pageSize,startIndex,securityContext);
    }
    @GET
    @Path("/{business_id}/assets/{asset_id}/partners")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get partners with access to asset", notes = "Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.", response = BusinessAssetPartnersGet200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:read", description = "See business access data")
        })
    }, tags={ "business_access_assets", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Sucess", response = BusinessAssetPartnersGet200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
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
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = BusinessAssetsGet200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response businessAssetsGet( @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") String businessId, @QueryParam("permissions") List<PermissionsWithOwner> permissions, @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @QueryParam("child_asset_id") String childAssetId, @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @QueryParam("asset_group_id") String assetGroupId,, allowableValues="AD_ACCOUNT, PROFILE, ASSET_GROUP" @DefaultValue("AD_ACCOUNT") @QueryParam("asset_type") String assetType, @Min(0) @DefaultValue("0") @QueryParam("start_index") Integer startIndex, @QueryParam("bookmark") String bookmark, @Min(1) @Max(250) @DefaultValue("25") @QueryParam("page_size") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.businessAssetsGet(businessId,permissions,childAssetId,assetGroupId,assetType,startIndex,bookmark,pageSize,securityContext);
    }
    @GET
    @Path("/{business_id}/members/{member_id}/assets")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get assets assigned to a member", notes = "Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.", response = BusinessMemberAssetsGet200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:read", description = "See business access data")
        })
    }, tags={ "business_access_assets", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = BusinessMemberAssetsGet200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response businessMemberAssetsGet( @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") String businessId, @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("member_id") String memberId,, allowableValues="AD_ACCOUNT, PROFILE, ASSET_GROUP" @DefaultValue("AD_ACCOUNT") @QueryParam("asset_type") String assetType, @Min(0) @DefaultValue("0") @QueryParam("start_index") Integer startIndex, @QueryParam("bookmark") String bookmark, @Min(1) @Max(250) @DefaultValue("25") @QueryParam("page_size") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.businessMemberAssetsGet(businessId,memberId,assetType,startIndex,bookmark,pageSize,securityContext);
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
        @io.swagger.annotations.ApiResponse(code = 200, message = "response", response = DeleteMemberAccessResultsResponseArray.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response businessMembersAssetAccessDelete( @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") String businessId,@ApiParam(value = "List member assset permissions to delete." ,required=true) @NotNull @Valid BusinessMembersAssetAccessDeleteRequest businessMembersAssetAccessDeleteRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.businessMembersAssetAccessDelete(businessId,businessMembersAssetAccessDeleteRequest,securityContext);
    }
    @PATCH
    @Path("/{business_id}/members/assets/access")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Assign/Update member asset permissions", notes = "Grant multiple members access to assets and/or update multiple member's exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE. ", response = UpdateMemberAssetsResultsResponseArray.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data")
        })
    }, tags={ "business_access_assets", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "response", response = UpdateMemberAssetsResultsResponseArray.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response businessMembersAssetAccessUpdate( @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") String businessId,@ApiParam(value = "List of member asset permissions to create or update." ,required=true) @NotNull @Valid UpdateMemberAssetAccessBody updateMemberAssetAccessBody,@Context SecurityContext securityContext)
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
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = BusinessPartnerAssetAccessGet200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response businessPartnerAssetAccessGet( @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") String businessId, @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("partner_id") String partnerId, @QueryParam("partner_type") PartnerType partnerType,, allowableValues="AD_ACCOUNT, PROFILE, ASSET_GROUP" @DefaultValue("AD_ACCOUNT") @QueryParam("asset_type") String assetType, @Min(0) @DefaultValue("0") @QueryParam("start_index") Integer startIndex, @Min(1) @Max(250) @DefaultValue("25") @QueryParam("page_size") Integer pageSize, @QueryParam("bookmark") String bookmark,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.businessPartnerAssetAccessGet(businessId,partnerId,partnerType,assetType,startIndex,pageSize,bookmark,securityContext);
    }
    @DELETE
    @Path("/{business_id}/invites")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Cancel invites/requests", notes = "Cancel membership/partnership invites and/or requests.", response = DeleteInvitesResultsResponseArray.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data")
        })
    }, tags={ "business_access_invite", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = DeleteInvitesResultsResponseArray.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response cancelInvitesOrRequests( @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") String businessId,@ApiParam(value = "A list with invite ids" ,required=true) @NotNull @Valid CancelInvitesBody cancelInvitesBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.cancelInvitesOrRequests(businessId,cancelInvitesBody,securityContext);
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
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = UpdateInvitesResultsResponseArray.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response createAssetInvites( @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") String businessId,@ApiParam(value = "A list of invites/requests together with the asset permissions to be assigned to the invite/request. " ,required=true) @NotNull @Valid CreateAssetInvitesRequest createAssetInvitesRequest,@Context SecurityContext securityContext)
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
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = CreateInvitesResultsResponseArray.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response createMembershipOrPartnershipInvites( @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") String businessId,@ApiParam(value = "An object with the properties: invite_type, partners, members, business_role" ,required=true) @NotNull @Valid CreateMembershipOrPartnershipInvitesBody createMembershipOrPartnershipInvitesBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createMembershipOrPartnershipInvites(businessId,createMembershipOrPartnershipInvitesBody,securityContext);
    }
    @DELETE
    @Path("/{business_id}/members")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Terminate business memberships", notes = "Terminate memberships between the specified members and your business.", response = DeletedMembersResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:read", description = "See business access data"),
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data")
        })
    }, tags={ "business_access_relationships", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = DeletedMembersResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response deleteBusinessMembership( @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") String businessId,@ApiParam(value = "List of members with role to delete." ,required=true) @NotNull @Valid MembersToDeleteBody membersToDeleteBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteBusinessMembership(businessId,membersToDeleteBody,securityContext);
    }
    @DELETE
    @Path("/{business_id}/partners")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Terminate business partnerships", notes = "Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.", response = DeletePartnersResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data")
        })
    }, tags={ "business_access_relationships", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = DeletePartnersResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "A supplied partner id doesn't exist", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response deleteBusinessPartners( @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") String businessId,@ApiParam(value = "An object containing a \"partner_ids\" property composed of a list of partner IDs and a \"partners_type\" property specifying the type of partners to delete. " ,required=true) @NotNull @Valid DeletePartnersRequest deletePartnersRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteBusinessPartners(businessId,deletePartnersRequest,securityContext);
    }
    @DELETE
    @Path("/{business_id}/partners/assets")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete partner access to asset", notes = "Terminate multiple partners' access to an asset. If - partner_type=INTERNAL: You will terminate a partner's asset access to your business assets. - partner_type=EXTERNAL: You will terminate your own access to your partner's business assets.", response = DeletePartnerAssetsResultsResponseArray.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data")
        })
    }, tags={ "business_access_assets", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = DeletePartnerAssetsResultsResponseArray.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
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
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = GetBusinessEmployers200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response getBusinessEmployers( @Min(1) @Max(250) @DefaultValue("25") @QueryParam("page_size") Integer pageSize, @QueryParam("bookmark") String bookmark,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getBusinessEmployers(pageSize,bookmark,securityContext);
    }
    @GET
    @Path("/{business_id}/members")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get business members", notes = "Get all members of the specified business. The return response will include the member's business_role and assets they have access to if assets_summary=TRUE", response = GetBusinessMembers200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:read", description = "See business access data")
        })
    }, tags={ "business_access_relationships", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = GetBusinessMembers200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response getBusinessMembers( @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") String businessId, @DefaultValue("false") @QueryParam("assets_summary") Boolean assetsSummary, @QueryParam("business_roles") List<MemberBusinessRole> businessRoles, @Size(max=500) @QueryParam("member_ids") String memberIds, @Min(0) @DefaultValue("0") @QueryParam("start_index") Integer startIndex, @QueryParam("bookmark") String bookmark, @Min(1) @Max(250) @DefaultValue("25") @QueryParam("page_size") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getBusinessMembers(businessId,assetsSummary,businessRoles,memberIds,startIndex,bookmark,pageSize,securityContext);
    }
    @GET
    @Path("/{business_id}/partners")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get business partners", notes = "Get all partners of the specified business.  If the assets_summary=TRUE and: - partner_type=INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type=EXTERNAL, the business assets returned are your partner's business assets the partner has granted you   access to.", response = GetBusinessPartners200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:read", description = "See business access data")
        })
    }, tags={ "business_access_relationships", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = GetBusinessPartners200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response getBusinessPartners( @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") String businessId, @DefaultValue("false") @QueryParam("assets_summary") Boolean assetsSummary,, allowableValues="INTERNAL, EXTERNAL" @QueryParam("partner_type") PartnerType partnerType, @Size(max=500) @QueryParam("partner_ids") String partnerIds, @Min(0) @DefaultValue("0") @QueryParam("start_index") Integer startIndex, @Min(1) @Max(250) @DefaultValue("25") @QueryParam("page_size") Integer pageSize, @QueryParam("bookmark") String bookmark,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getBusinessPartners(businessId,assetsSummary,partnerType,partnerIds,startIndex,pageSize,bookmark,securityContext);
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
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = GetInvites200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response getInvites( @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") String businessId, @DefaultValue("true") @QueryParam("is_member") Boolean isMember, @Size(min=1) @QueryParam("invite_status") List<String> inviteStatus,, allowableValues="MEMBER_INVITE, PARTNER_INVITE, PARTNER_REQUEST" @QueryParam("invite_type") InviteType inviteType, @QueryParam("bookmark") String bookmark, @Min(1) @Max(250) @DefaultValue("25") @QueryParam("page_size") Integer pageSize,@Context SecurityContext securityContext)
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
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = RespondToInvitesResponseArray.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response respondBusinessAccessInvites(@ApiParam(value = "" ,required=true) @NotNull @Valid AuthRespondInvitesBody authRespondInvitesBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.respondBusinessAccessInvites(authRespondInvitesBody,securityContext);
    }
    @GET
    @Path("/{business_id}/audiences")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List received audiences for a business", notes = "Get a list of received audiences for the given business.", response = AudiencesList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:read", description = "See business access data")
        })
    }, tags={ "audience_sharing", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = AudiencesList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid parameters.", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response sharedAudiencesForBusinessList( @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") String businessId, @QueryParam("bookmark") String bookmark,, allowableValues="ASCENDING, DESCENDING" @QueryParam("order") String order, @Min(1) @Max(250) @DefaultValue("25") @QueryParam("page_size") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.sharedAudiencesForBusinessList(businessId,bookmark,order,pageSize,securityContext);
    }
    @PATCH
    @Path("/{business_id}/members")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update member's business role", notes = "Update a member's business role within the business.", response = UpdateMemberResultsResponseArray.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data")
        })
    }, tags={ "business_access_relationships", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "response", response = UpdateMemberResultsResponseArray.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response updateBusinessMemberships( @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") String businessId,@ApiParam(value = "List of objects with the member id and the business_role." ,required=true) @NotNull @Valid List<@Valid UpdateMemberBusinessRoleBody> updateMemberBusinessRoleBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateBusinessMemberships(businessId,updateMemberBusinessRoleBody,securityContext);
    }
    @PATCH
    @Path("/{business_id}/audiences/ad_accounts/shared")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update audience sharing from a business to ad accounts", notes = "From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience. <ul> <li>If the business is the owner of the audience, it can share with any ad account within the same business hierarchy.</li> <li>If the business is the recipient of the audience, it can share with any of its owned ad accounts.</li> </ul> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.", response = SharedAudienceResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data")
        })
    }, tags={ "audience_sharing", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = SharedAudienceResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid parameters.", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response updateBusinessToAdAccountSharedAudience( @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") String businessId,@ApiParam(value = "" ,required=true) @NotNull @Valid SharedAudience sharedAudience,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateBusinessToAdAccountSharedAudience(businessId,sharedAudience,securityContext);
    }
    @PATCH
    @Path("/{business_id}/audiences/businesses/shared")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update audience sharing between businesses", notes = "From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.", response = BusinessSharedAudienceResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data")
        })
    }, tags={ "audience_sharing", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = BusinessSharedAudienceResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid parameters.", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response updateBusinessToBusinessSharedAudience( @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") String businessId,@ApiParam(value = "" ,required=true) @NotNull @Valid BusinessSharedAudience businessSharedAudience,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateBusinessToBusinessSharedAudience(businessId,businessSharedAudience,securityContext);
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
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = UpdatePartnerAssetsResultsResponseArray.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response updatePartnerAssetAccessHandlerImpl( @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") String businessId,@ApiParam(value = "A list of assets and permissions to assign to your partners." ,required=true) @NotNull @Valid UpdatePartnerAssetAccessBody updatePartnerAssetAccessBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updatePartnerAssetAccessHandlerImpl(businessId,updatePartnerAssetAccessBody,securityContext);
    }
}
