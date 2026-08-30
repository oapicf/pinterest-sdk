package org.openapitools.api;

import org.openapitools.model.BrandAccount;
import org.openapitools.model.BrandAccountCreate;
import org.openapitools.model.BrandAccountUpdate;
import org.openapitools.model.BusinessMembershipMember;
import org.openapitools.model.DeleteBusinessMembership200Response;
import org.openapitools.model.DeleteBusinessMembershipBody;
import org.openapitools.model.DeleteBusinessPartners;
import org.openapitools.model.DeleteBusinessPartnersDelete;
import org.openapitools.model.GetBusinessEmployers200Response;
import org.openapitools.model.MemberBusinessRole;
import org.openapitools.model.PartnerType;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.SystemUserUpdateWithRequiredBody;
import org.openapitools.model.UpdateBusinessMembershipsResponse;

import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
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
@Path("")
@Api(value = "/", description = "")
public interface BusinessAccessRelationshipsApi  {

    /**
     * Create a Brand Account
     *
     * Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country.
     *
     */
    @POST
    @Path("/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create a Brand Account", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = BrandAccount.class),
        @ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = BrandAccount.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public BrandAccount brandAccountsCreate(@PathParam("business_hierarchy_id") String businessHierarchyId, BrandAccountCreate brandAccountCreate);

    /**
     * Update a Brand Account
     *
     * Update an existing Brand Account
     *
     */
    @PATCH
    @Path("/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update a Brand Account", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = BrandAccount.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 409, message = "The request could not be processed because of a conflict in the current state of the resource.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public BrandAccount brandAccountsUpdate(@PathParam("brand_account_id") String brandAccountId, @PathParam("business_hierarchy_id") String businessHierarchyId, BrandAccountUpdate brandAccountUpdate);

    /**
     * Terminate business memberships
     *
     * Terminate memberships between the specified members and your business.
     *
     */
    @DELETE
    @Path("/businesses/{business_id}/members")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Terminate business memberships", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = DeleteBusinessMembership200Response.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public DeleteBusinessMembership200Response deleteBusinessMembership(@PathParam("business_id") String businessId, DeleteBusinessMembershipBody deleteBusinessMembershipBody);

    /**
     * Terminate business partnerships
     *
     * Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.
     *
     */
    @DELETE
    @Path("/businesses/{business_id}/partners")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Terminate business partnerships", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = DeleteBusinessPartners.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public DeleteBusinessPartners deleteBusinessPartners(@PathParam("business_id") String businessId, DeleteBusinessPartnersDelete deleteBusinessPartnersDelete);

    /**
     * List business employers for user
     *
     * Get all of the viewing user&#39;s business employers.
     *
     */
    @GET
    @Path("/businesses/employers")
    @Produces({ "application/json" })
    @ApiOperation(value = "List business employers for user", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = GetBusinessEmployers200Response.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public GetBusinessEmployers200Response getBusinessEmployers(@QueryParam("assets_summary") @DefaultValue("true")Boolean assetsSummary, @QueryParam("bookmark") String bookmark, @QueryParam("page_size") @DefaultValue("25")Integer pageSize);

    /**
     * Get business members
     *
     * Get all members of the specified business. The return response will include the member&#39;s business_role and assets they have access to if assets_summary&#x3D;TRUE
     *
     */
    @GET
    @Path("/businesses/{business_id}/members")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get business members", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = GetBusinessEmployers200Response.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public GetBusinessEmployers200Response getBusinessMembers(@PathParam("business_id") String businessId, @QueryParam("fetch_system_users") @DefaultValue("false")Boolean fetchSystemUsers, @QueryParam("assets_summary") @DefaultValue("false")Boolean assetsSummary, @QueryParam("business_roles") List<MemberBusinessRole> businessRoles, @QueryParam("member_ids") String memberIds, @QueryParam("start_index") @DefaultValue("0")Integer startIndex, @QueryParam("bookmark") String bookmark, @QueryParam("page_size") @DefaultValue("25")Integer pageSize);

    /**
     * Get business partners
     *
     * Get all partners of the specified business.  If the assets_summary&#x3D;TRUE and: - partner_type&#x3D;INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type&#x3D;EXTERNAL, the business assets returned are your partner&#39;s business assets the partner has granted you   access to.
     *
     */
    @GET
    @Path("/businesses/{business_id}/partners")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get business partners", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = GetBusinessEmployers200Response.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public GetBusinessEmployers200Response getBusinessPartners(@PathParam("business_id") String businessId, @QueryParam("assets_summary") @DefaultValue("false")Boolean assetsSummary, @QueryParam("partner_type") PartnerType partnerType, @QueryParam("partner_ids") String partnerIds, @QueryParam("start_index") @DefaultValue("0")Integer startIndex, @QueryParam("sort_ascending") Boolean sortAscending, @QueryParam("bookmark") String bookmark, @QueryParam("page_size") @DefaultValue("25")Integer pageSize);

    /**
     * Update a system user information.
     *
     * Update a system user information such as name.
     *
     */
    @PATCH
    @Path("/businesses/{business_id}/system_users/{system_user_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update a system user information.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded."),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public void systemUserUpdate(@PathParam("business_id") String businessId, @PathParam("system_user_id") String systemUserId, SystemUserUpdateWithRequiredBody systemUserUpdateWithRequiredBody);

    /**
     * Update member&#39;s business role
     *
     * Update a member&#39;s business role within the business.
     *
     */
    @PATCH
    @Path("/businesses/{business_id}/members")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update member's business role", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = UpdateBusinessMembershipsResponse.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public UpdateBusinessMembershipsResponse updateBusinessMemberships(@PathParam("business_id") String businessId, List<BusinessMembershipMember> businessMembershipMember);
}
