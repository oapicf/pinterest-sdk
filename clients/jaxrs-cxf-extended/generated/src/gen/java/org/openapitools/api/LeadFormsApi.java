package org.openapitools.api;

import org.openapitools.model.Error;
import org.openapitools.model.LeadFormResponse;
import org.openapitools.model.LeadFormTestRequest;
import org.openapitools.model.LeadFormTestResponse;
import org.openapitools.model.LeadFormsList200Response;

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
@Path("/ad_accounts/{ad_account_id}/lead_forms")
@Api(value = "/", description = "")
public interface LeadFormsApi  {

    /**
     * Get lead form by id
     *
     * Gets a lead form given it&#39;s ID. It must also be associated with the provided ad account ID. Retrieving an advertiser&#39;s lead form will only contain results if you&#39;re a part of the Lead ads beta. If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
     *
     */
    @GET
    @Path("/{lead_form_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get lead form by id", tags={ "lead_forms" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = LeadFormResponse.class),
        @ApiResponse(code = 400, message = "Invalid ad account lead forms parameters.", response = Error.class),
        @ApiResponse(code = 404, message = "The lead form ID for the given ad account ID does not exist.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public LeadFormResponse leadFormGet(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @PathParam("lead_form_id") @Pattern(regexp="^\\d+$") String leadFormId);

    /**
     * Create lead form test data
     *
     * Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
     *
     */
    @POST
    @Path("/{lead_form_id}/test")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create lead form test data", tags={ "lead_forms" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = LeadFormTestResponse.class),
        @ApiResponse(code = 400, message = "Invalid parameters.", response = Error.class),
        @ApiResponse(code = 404, message = "Lead not found.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public LeadFormTestResponse leadFormTestCreate(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @PathParam("lead_form_id") @Pattern(regexp="^\\d+$") String leadFormId, @Valid LeadFormTestRequest leadFormTestRequest);

    /**
     * Get lead forms
     *
     * Gets all Lead Forms associated with an ad account ID. Retrieving an advertiser&#39;s list of lead forms will only contain results if you&#39;re a part of the Lead ads beta.  If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
     *
     */
    @GET
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get lead forms", tags={ "lead_forms" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = LeadFormsList200Response.class),
        @ApiResponse(code = 400, message = "Invalid ad account lead forms parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public LeadFormsList200Response leadFormsList(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25") Integer pageSize, @QueryParam("order") String order, @QueryParam("bookmark") String bookmark);
}
