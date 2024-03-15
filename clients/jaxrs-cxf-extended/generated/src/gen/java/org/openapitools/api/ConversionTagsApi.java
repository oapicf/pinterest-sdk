package org.openapitools.api;

import org.openapitools.model.ConversionEventResponse;
import org.openapitools.model.ConversionTagCreate;
import org.openapitools.model.ConversionTagListResponse;
import org.openapitools.model.ConversionTagResponse;
import org.openapitools.model.Error;
import java.util.Map;
import org.openapitools.model.PageVisitConversionTagsGet200Response;

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
@Path("/ad_accounts/{ad_account_id}/conversion_tags")
@Api(value = "/", description = "")
public interface ConversionTagsApi  {

    /**
     * Create conversion tag
     *
     * Create a conversion tag, also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Pinterest tag&lt;/a&gt;, with the option to enable enhanced match.&lt;p/&gt; The Pinterest Tag tracks actions people take on the ad account’s website after they view the ad account&#39;s ad on Pinterest. The advertiser needs to customize this tag to track conversions.&lt;p/&gt; For more information, see:&lt;p/&gt; &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\&quot;&gt;Set up the Pinterest tag&lt;/a&gt;&lt;p/&gt; &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://developers.pinterest.com/docs/conversions/pinterest-tag/\&quot;&gt;Pinterest Tag&lt;/a&gt;&lt;p/&gt; &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://developers.pinterest.com/docs/conversions/enhanced-match/\&quot;&gt;Enhanced match&lt;/a&gt;
     *
     */
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create conversion tag", tags={ "conversion_tags" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = ConversionTagResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public ConversionTagResponse conversionTagsCreate(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @Valid ConversionTagCreate conversionTagCreate);

    /**
     * Get conversion tag
     *
     * Get information about an existing conversion tag.
     *
     */
    @GET
    @Path("/{conversion_tag_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get conversion tag", tags={ "conversion_tags" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = ConversionTagResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public ConversionTagResponse conversionTagsGet(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @PathParam("conversion_tag_id") @Pattern(regexp="^\\d+$") @Size(max=18) String conversionTagId);

    /**
     * Get conversion tags
     *
     * List conversion tags associated with an ad account.
     *
     */
    @GET
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get conversion tags", tags={ "conversion_tags" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = ConversionTagListResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public ConversionTagListResponse conversionTagsList(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @QueryParam("filter_deleted") @DefaultValue("false") Boolean filterDeleted);

    /**
     * Get Ocpm eligible conversion tags
     *
     * Get Ocpm eligible conversion tag events for an ad account.
     *
     */
    @GET
    @Path("/ocpm_eligible")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Ocpm eligible conversion tags", tags={ "conversion_tags" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = ConversionEventResponse.class, responseContainer = "Map"),
        @ApiResponse(code = 200, message = "Unexpected errors", response = Error.class) })
    public Map<String, List<ConversionEventResponse>> ocpmEligibleConversionTagsGet(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId);

    /**
     * Get page visit conversion tags
     *
     * Get all page visit conversion tag events for an ad account.
     *
     */
    @GET
    @Path("/page_visit")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get page visit conversion tags", tags={ "conversion_tags" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = PageVisitConversionTagsGet200Response.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public PageVisitConversionTagsGet200Response pageVisitConversionTagsGet(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25") Integer pageSize, @QueryParam("order") String order, @QueryParam("bookmark") String bookmark);
}
