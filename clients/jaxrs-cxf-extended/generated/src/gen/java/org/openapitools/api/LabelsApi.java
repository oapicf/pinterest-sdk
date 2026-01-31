package org.openapitools.api;

import org.openapitools.model.Error;
import org.openapitools.model.LabelCreateRequest;
import org.openapitools.model.LabelUpdateRequest;
import org.openapitools.model.LabelsList200Response;
import org.openapitools.model.LabelsResponse;

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
@Path("/ad_accounts/{ad_account_id}/labels")
@Api(value = "/", description = "")
public interface LabelsApi  {

    /**
     * Create labels
     *
     * &lt;p&gt; &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt; This endpoint is not available to all users. &lt;/p&gt; &lt;p&gt;   Apply one or more labels to a campaign.   Currently, you can apply brand and custom labels. Future releases will provide more options.    &lt;b&gt;Note:&lt;/b&gt; You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.  &lt;/p&gt;
     *
     */
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create labels", tags={ "labels" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = LabelsResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public LabelsResponse labelsCreate(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @Valid LabelCreateRequest labelCreateRequest);

    /**
     * List labels
     *
     * &lt;p&gt;   &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt;   This endpoint is not available to all users. &lt;/p&gt; &lt;p&gt;   See a list of labels for assets that your account owns, and filter the list by different criteria. &lt;/p&gt;
     *
     */
    @GET
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List labels", tags={ "labels" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = LabelsList200Response.class),
        @ApiResponse(code = 400, message = "Invalid ad account ads parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public LabelsList200Response labelsList(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @QueryParam("campaign_ids") @Size(min=1,max=250) List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds, @QueryParam("label_ids") @Size(min=1,max=250) List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> labelIds, @QueryParam("entity_statuses") List<String> entityStatuses, @QueryParam("label_types") List<String> labelTypes, @QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25") Integer pageSize, @QueryParam("bookmark") String bookmark);

    /**
     * Update labels
     *
     * &lt;p&gt;   &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt;   This endpoint is not available to all users. &lt;/p&gt; &lt;p&gt;   Change the properties of one or more labels. &lt;/p&gt;
     *
     */
    @PATCH
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update labels", tags={ "labels" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = LabelsResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public LabelsResponse labelsUpdate(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @Valid LabelUpdateRequest labelUpdateRequest);
}
