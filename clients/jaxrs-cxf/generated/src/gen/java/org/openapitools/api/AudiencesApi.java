package org.openapitools.api;

import org.openapitools.model.Audience;
import org.openapitools.model.AudienceCreateCustomRequest;
import org.openapitools.model.AudienceCreateRequest;
import org.openapitools.model.AudienceUpdateRequest;
import org.openapitools.model.AudiencesList200Response;
import org.openapitools.model.Error;

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
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Pinterest REST API
 *
 * <p>Pinterest's REST API
 *
 */
@Path("/ad_accounts/{ad_account_id}/audiences")
@Api(value = "/", description = "")
public interface AudiencesApi  {

    /**
     * Create audience
     *
     * Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with the ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude specific audience_ids when you create an ad group. &lt;p/&gt; For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/audience-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audience targeting&lt;/a&gt;.
     *
     */
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create audience", tags={ "audiences" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = Audience.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Audience audiencesCreate(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @Valid @NotNull AudienceCreateRequest audienceCreateRequest);

    /**
     * Create custom audience
     *
     * Create a custom audience and find the audiences you want your ads to reach.
     *
     */
    @POST
    @Path("/custom")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create custom audience", tags={ "audiences" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = Audience.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Audience audiencesCreateCustom(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @Valid @NotNull AudienceCreateCustomRequest audienceCreateCustomRequest);

    /**
     * Get audience
     *
     * Get a specific audience given the audience ID.
     *
     */
    @GET
    @Path("/{audience_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get audience", tags={ "audiences" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = Audience.class),
        @ApiResponse(code = 404, message = "Audience not found.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = Error.class) })
    public Audience audiencesGet(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @PathParam("audience_id") @Pattern(regexp="^\\d+$") @Size(max=18) String audienceId);

    /**
     * List audiences
     *
     * Get list of audiences for the ad account.
     *
     */
    @GET
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List audiences", tags={ "audiences" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AudiencesList200Response.class),
        @ApiResponse(code = 400, message = "Invalid ad account audience parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public AudiencesList200Response audiencesList(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @QueryParam("bookmark") String bookmark, @QueryParam("order") String order, @QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25")Integer pageSize, @QueryParam("ownership_type") @DefaultValue("OWNED")String ownershipType);

    /**
     * Update audience
     *
     * Update (edit or remove) an existing targeting audience.
     *
     */
    @PATCH
    @Path("/{audience_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update audience", tags={ "audiences" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = Audience.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Audience audiencesUpdate(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @PathParam("audience_id") @Pattern(regexp="^\\d+$") @Size(max=18) String audienceId, @Valid AudienceUpdateRequest audienceUpdateRequest);
}
