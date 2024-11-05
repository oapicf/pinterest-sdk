package org.openapitools.api;

import org.openapitools.model.Error;
import org.openapitools.model.TargetingTemplateCreate;
import org.openapitools.model.TargetingTemplateGetResponseData;
import org.openapitools.model.TargetingTemplateList200Response;
import org.openapitools.model.TargetingTemplateUpdateRequest;

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
@Path("/ad_accounts/{ad_account_id}/targeting_templates")
@Api(value = "/", description = "")
public interface TargetingTemplateApi  {

    /**
     * Create targeting templates
     *
     * &lt;p&gt;Targeting templates allow advertisers to save a set of targeting details including audience lists,  keywords &amp; interest, demographics, and placements to use more than once during the campaign creation process.&lt;/p&gt;  &lt;p&gt;Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse   performance targeting from prior campaigns for new campaigns.&lt;/p&gt;
     *
     */
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create targeting templates", tags={ "targeting_template" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = TargetingTemplateGetResponseData.class),
        @ApiResponse(code = 400, message = "Invalid ad account id.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public TargetingTemplateGetResponseData targetingTemplateCreate(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @Valid @NotNull TargetingTemplateCreate targetingTemplateCreate);

    /**
     * List targeting templates
     *
     * Get a list of the targeting templates in the specified &lt;code&gt;ad_account_id&lt;/code&gt;
     *
     */
    @GET
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List targeting templates", tags={ "targeting_template" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = TargetingTemplateList200Response.class),
        @ApiResponse(code = 400, message = "Invalid ad account id.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public TargetingTemplateList200Response targetingTemplateList(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @QueryParam("order") String order, @QueryParam("include_sizing") @DefaultValue("false")Boolean includeSizing, @QueryParam("search_query") String searchQuery, @QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25")Integer pageSize, @QueryParam("bookmark") String bookmark);

    /**
     * Update targeting templates
     *
     * &lt;p&gt;Update the targeting template given advertiser ID and targeting template ID&lt;/p&gt;
     *
     */
    @PATCH
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update targeting templates", tags={ "targeting_template" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success"),
        @ApiResponse(code = 400, message = "Invalid ad account id.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public void targetingTemplateUpdate(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @Valid @NotNull TargetingTemplateUpdateRequest targetingTemplateUpdateRequest);
}
