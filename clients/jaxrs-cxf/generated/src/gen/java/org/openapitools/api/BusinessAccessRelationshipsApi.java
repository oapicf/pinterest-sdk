package org.openapitools.api;

import org.openapitools.model.BrandAccountsCreate200Response;
import org.openapitools.model.BrandAccountsCreateRequest;
import org.openapitools.model.BrandAccountsUpdateRequest;
import org.openapitools.model.DeletePartnersRequest;
import org.openapitools.model.DeletePartnersResponse;
import org.openapitools.model.DeletedMembersResponse;
import org.openapitools.model.Error;
import org.openapitools.model.GetBusinessEmployers200Response;
import org.openapitools.model.GetBusinessMembers200Response;
import org.openapitools.model.GetBusinessPartners200Response;
import org.openapitools.model.MemberBusinessRole;
import org.openapitools.model.MembersToDeleteBody;
import org.openapitools.model.PartnerType;
import org.openapitools.model.SystemUserUpdateRequest;
import org.openapitools.model.UpdateMemberBusinessRoleBody;
import org.openapitools.model.UpdateMemberResultsResponseArray;

import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

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
    @ApiOperation(value = "Create a Brand Account", tags={ "business_access_relationships" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = BrandAccountsCreate200Response.class),
        @ApiResponse(code = 400, message = "Invalid parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public BrandAccountsCreate200Response brandAccountsCreate(@PathParam("business_hierarchy_id") @Pattern(regexp="^\\d+$") @Size(min=1,max=20) String businessHierarchyId, @Valid @NotNull BrandAccountsCreateRequest brandAccountsCreateRequest);

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
    @ApiOperation(value = "Update a Brand Account", tags={ "business_access_relationships" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = BrandAccountsCreate200Response.class),
        @ApiResponse(code = 400, message = "Invalid parameters.", response = Error.class),
        @ApiResponse(code = 401, message = "Not authenticated to update Brand Account", response = Error.class),
        @ApiResponse(code = 403, message = "Not authorized to update Brand Account", response = Error.class),
        @ApiResponse(code = 404, message = "Brand account not found", response = Error.class),
        @ApiResponse(code = 409, message = "This account is not a brand account.", response = Error.class),
        @ApiResponse(code = 429, message = "This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits within a short time window.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public BrandAccountsCreate200Response brandAccountsUpdate(@PathParam("business_hierarchy_id") @Pattern(regexp="^\\d+$") @Size(min=1,max=20) String businessHierarchyId, @PathParam("brand_account_id") @Pattern(regexp="^\\d+$") @Size(min=1,max=20) String brandAccountId, @Valid @NotNull BrandAccountsUpdateRequest brandAccountsUpdateRequest);

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
    @ApiOperation(value = "Terminate business memberships", tags={ "business_access_relationships" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = DeletedMembersResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public DeletedMembersResponse deleteBusinessMembership(@PathParam("business_id") @Pattern(regexp="^\\d+$") @Size(min=1,max=20) String businessId, @Valid @NotNull MembersToDeleteBody membersToDeleteBody);

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
    @ApiOperation(value = "Terminate business partnerships", tags={ "business_access_relationships" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = DeletePartnersResponse.class),
        @ApiResponse(code = 404, message = "A supplied partner id doesn't exist", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public DeletePartnersResponse deleteBusinessPartners(@PathParam("business_id") @Pattern(regexp="^\\d+$") @Size(min=1,max=20) String businessId, @Valid @NotNull DeletePartnersRequest deletePartnersRequest);

    /**
     * List business employers for user
     *
     * Get all of the viewing user&#39;s business employers.
     *
     */
    @GET
    @Path("/businesses/employers")
    @Produces({ "application/json" })
    @ApiOperation(value = "List business employers for user", tags={ "business_access_relationships" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = GetBusinessEmployers200Response.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public GetBusinessEmployers200Response getBusinessEmployers(@QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25")Integer pageSize, @QueryParam("bookmark") String bookmark);

    /**
     * Get business members
     *
     * Get all members of the specified business. The return response will include the member&#39;s business_role and assets they have access to if assets_summary&#x3D;TRUE
     *
     */
    @GET
    @Path("/businesses/{business_id}/members")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get business members", tags={ "business_access_relationships" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = GetBusinessMembers200Response.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public GetBusinessMembers200Response getBusinessMembers(@PathParam("business_id") @Pattern(regexp="^\\d+$") @Size(min=1,max=20) String businessId, @QueryParam("fetch_system_users") @DefaultValue("false")Boolean fetchSystemUsers, @QueryParam("assets_summary") @DefaultValue("false")Boolean assetsSummary, @QueryParam("business_roles") List<MemberBusinessRole> businessRoles, @QueryParam("member_ids") @Size(max=500) String memberIds, @QueryParam("start_index") @Min(0) @DefaultValue("0")Integer startIndex, @QueryParam("bookmark") String bookmark, @QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25")Integer pageSize);

    /**
     * Get business partners
     *
     * Get all partners of the specified business.  If the assets_summary&#x3D;TRUE and: - partner_type&#x3D;INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type&#x3D;EXTERNAL, the business assets returned are your partner&#39;s business assets the partner has granted you   access to.
     *
     */
    @GET
    @Path("/businesses/{business_id}/partners")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get business partners", tags={ "business_access_relationships" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = GetBusinessPartners200Response.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public GetBusinessPartners200Response getBusinessPartners(@PathParam("business_id") @Pattern(regexp="^\\d+$") @Size(min=1,max=20) String businessId, @QueryParam("assets_summary") @DefaultValue("false")Boolean assetsSummary, @QueryParam("partner_type") PartnerType partnerType, @QueryParam("partner_ids") @Size(max=500) String partnerIds, @QueryParam("start_index") @Min(0) @DefaultValue("0")Integer startIndex, @QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25")Integer pageSize, @QueryParam("bookmark") String bookmark);

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
    @ApiOperation(value = "Update a system user information.", tags={ "business_access_relationships" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "System user updated successfully."),
        @ApiResponse(code = 400, message = "Invalid parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public void systemUserUpdate(@PathParam("business_id") @Pattern(regexp="^\\d+$") @Size(min=1,max=20) String businessId, @PathParam("system_user_id") @Pattern(regexp="^\\d+$") @Size(min=1,max=20) String systemUserId, @Valid @NotNull SystemUserUpdateRequest systemUserUpdateRequest);

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
    @ApiOperation(value = "Update member's business role", tags={ "business_access_relationships" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = UpdateMemberResultsResponseArray.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public UpdateMemberResultsResponseArray updateBusinessMemberships(@PathParam("business_id") @Pattern(regexp="^\\d+$") @Size(min=1,max=20) String businessId, @Valid @NotNull List<@Valid UpdateMemberBusinessRoleBody> updateMemberBusinessRoleBody);
}
