package org.openapitools.api;

import org.openapitools.model.BusinessAssetMembersGet200Response;
import org.openapitools.model.BusinessAssetPartnersGet200Response;
import org.openapitools.model.BusinessAssetsGet200Response;
import org.openapitools.model.BusinessMemberAssetsGet200Response;
import org.openapitools.model.BusinessMembersAssetAccessDeleteRequest;
import org.openapitools.model.BusinessPartnerAssetAccessGet200Response;
import org.openapitools.model.CreateAssetGroupBody;
import org.openapitools.model.CreateAssetGroupResponse;
import org.openapitools.model.DeleteAssetGroupBody;
import org.openapitools.model.DeleteAssetGroupResponse;
import org.openapitools.model.DeleteMemberAccessResultsResponseArray;
import org.openapitools.model.DeletePartnerAssetAccessBody;
import org.openapitools.model.DeletePartnerAssetsResultsResponseArray;
import org.openapitools.model.Error;
import org.openapitools.model.PartnerType;
import org.openapitools.model.PermissionsWithOwner;
import org.openapitools.model.UpdateAssetGroupBody;
import org.openapitools.model.UpdateAssetGroupResponse;
import org.openapitools.model.UpdateMemberAssetAccessBody;
import org.openapitools.model.UpdateMemberAssetsResultsResponseArray;
import org.openapitools.model.UpdatePartnerAssetAccessBody;
import org.openapitools.model.UpdatePartnerAssetsResultsResponseArray;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;

/**
 * Pinterest REST API
 *
 * <p>Pinterest's REST API
 *
 */
@Path("/businesses/{business_id}")
@Api(value = "/", description = "")
public interface BusinessAccessAssetsApi  {

    /**
     * Create a new asset group.
     *
     * Create a new asset group with the specified parameters. - An &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/asset-groups\&quot;&gt;asset group&lt;/a&gt; is a custom group of assets based on how you’d like to manage your accounts.
     *
     */
    @POST
    @Path("/asset_groups")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create a new asset group.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = CreateAssetGroupResponse.class),
        @ApiResponse(code = 400, message = "Invalid parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public CreateAssetGroupResponse assetGroupCreate(@PathParam("business_id") String businessId, CreateAssetGroupBody createAssetGroupBody);

    /**
     * Delete asset groups.
     *
     * Delete a batch of asset groups.
     *
     */
    @DELETE
    @Path("/asset_groups")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete asset groups.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = DeleteAssetGroupResponse.class),
        @ApiResponse(code = 400, message = "Invalid parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public DeleteAssetGroupResponse assetGroupDelete(@PathParam("business_id") String businessId, DeleteAssetGroupBody deleteAssetGroupBody);

    /**
     * Update asset groups.
     *
     * Update a batch of asset groups with the specified parameters.
     *
     */
    @PATCH
    @Path("/asset_groups")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update asset groups.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = UpdateAssetGroupResponse.class),
        @ApiResponse(code = 400, message = "Invalid parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public UpdateAssetGroupResponse assetGroupUpdate(@PathParam("business_id") String businessId, UpdateAssetGroupBody updateAssetGroupBody);

    /**
     * Get members with access to asset
     *
     * Get all the members the requesting business has granted access to on the given asset.
     *
     */
    @GET
    @Path("/assets/{asset_id}/members")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get members with access to asset", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Sucess", response = BusinessAssetMembersGet200Response.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public BusinessAssetMembersGet200Response businessAssetMembersGet(@PathParam("business_id") String businessId, @PathParam("asset_id") String assetId, @QueryParam("bookmark") String bookmark, @QueryParam("page_size") @DefaultValue("25")Integer pageSize, @QueryParam("start_index") @DefaultValue("0")Integer startIndex);

    /**
     * Get partners with access to asset
     *
     * Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.
     *
     */
    @GET
    @Path("/assets/{asset_id}/partners")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get partners with access to asset", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Sucess", response = BusinessAssetPartnersGet200Response.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public BusinessAssetPartnersGet200Response businessAssetPartnersGet(@PathParam("business_id") String businessId, @PathParam("asset_id") String assetId, @QueryParam("start_index") @DefaultValue("0")Integer startIndex, @QueryParam("bookmark") String bookmark, @QueryParam("page_size") @DefaultValue("25")Integer pageSize);

    /**
     * List business assets
     *
     * Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.
     *
     */
    @GET
    @Path("/assets")
    @Produces({ "application/json" })
    @ApiOperation(value = "List business assets", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = BusinessAssetsGet200Response.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public BusinessAssetsGet200Response businessAssetsGet(@PathParam("business_id") String businessId, @QueryParam("permissions") List<PermissionsWithOwner> permissions, @QueryParam("child_asset_id") String childAssetId, @QueryParam("asset_group_id") String assetGroupId, @QueryParam("asset_type") @DefaultValue("AD_ACCOUNT")String assetType, @QueryParam("start_index") @DefaultValue("0")Integer startIndex, @QueryParam("bookmark") String bookmark, @QueryParam("page_size") @DefaultValue("25")Integer pageSize);

    /**
     * Get assets assigned to a member
     *
     * Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.
     *
     */
    @GET
    @Path("/members/{member_id}/assets")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get assets assigned to a member", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = BusinessMemberAssetsGet200Response.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public BusinessMemberAssetsGet200Response businessMemberAssetsGet(@PathParam("business_id") String businessId, @PathParam("member_id") String memberId, @QueryParam("asset_type") @DefaultValue("AD_ACCOUNT")String assetType, @QueryParam("start_index") @DefaultValue("0")Integer startIndex, @QueryParam("bookmark") String bookmark, @QueryParam("page_size") @DefaultValue("25")Integer pageSize);

    /**
     * Delete member access to asset
     *
     * Terminate multiple members&#39; access to an asset.
     *
     */
    @DELETE
    @Path("/members/assets/access")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete member access to asset", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = DeleteMemberAccessResultsResponseArray.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public DeleteMemberAccessResultsResponseArray businessMembersAssetAccessDelete(@PathParam("business_id") String businessId, BusinessMembersAssetAccessDeleteRequest businessMembersAssetAccessDeleteRequest);

    /**
     * Assign/Update member asset permissions
     *
     * Grant multiple members access to assets and/or update multiple member&#39;s exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE. 
     *
     */
    @PATCH
    @Path("/members/assets/access")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Assign/Update member asset permissions", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = UpdateMemberAssetsResultsResponseArray.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public UpdateMemberAssetsResultsResponseArray businessMembersAssetAccessUpdate(@PathParam("business_id") String businessId, UpdateMemberAssetAccessBody updateMemberAssetAccessBody);

    /**
     * Get assets assigned to a partner or assets assigned by a partner
     *
     * Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type&#x3D;INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type&#x3D;EXTERNAL, you will retrieve the partner&#39;s business assets that the partner has granted you access to.
     *
     */
    @GET
    @Path("/partners/{partner_id}/assets")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get assets assigned to a partner or assets assigned by a partner", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = BusinessPartnerAssetAccessGet200Response.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public BusinessPartnerAssetAccessGet200Response businessPartnerAssetAccessGet(@PathParam("business_id") String businessId, @PathParam("partner_id") String partnerId, @QueryParam("partner_type") PartnerType partnerType, @QueryParam("asset_type") @DefaultValue("AD_ACCOUNT")String assetType, @QueryParam("start_index") @DefaultValue("0")Integer startIndex, @QueryParam("page_size") @DefaultValue("25")Integer pageSize, @QueryParam("bookmark") String bookmark);

    /**
     * Delete partner access to asset
     *
     * Terminate multiple partners&#39; access to an asset. If - partner_type&#x3D;INTERNAL: You will terminate a partner&#39;s asset access to your business assets. - partner_type&#x3D;EXTERNAL: You will terminate your own access to your partner&#39;s business assets.
     *
     */
    @DELETE
    @Path("/partners/assets")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete partner access to asset", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = DeletePartnerAssetsResultsResponseArray.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public DeletePartnerAssetsResultsResponseArray deletePartnerAssetAccessHandlerImpl(@PathParam("business_id") String businessId, DeletePartnerAssetAccessBody deletePartnerAssetAccessBody);

    /**
     * Assign/Update partner asset permissions
     *
     * Grant multiple partners access to assets and/or update multiple partner&#39;s exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.
     *
     */
    @PATCH
    @Path("/partners/assets")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Assign/Update partner asset permissions", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = UpdatePartnerAssetsResultsResponseArray.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public UpdatePartnerAssetsResultsResponseArray updatePartnerAssetAccessHandlerImpl(@PathParam("business_id") String businessId, UpdatePartnerAssetAccessBody updatePartnerAssetAccessBody);
}
