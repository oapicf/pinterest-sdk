package org.openapitools.api;

import org.openapitools.model.ConversionEventResponse;
import org.openapitools.model.ConversionTag;
import org.openapitools.model.ConversionTagCreate;
import org.openapitools.model.ConversionTagsList200Response;
import org.openapitools.model.Error;
import java.util.Map;
import org.openapitools.model.PageVisitConversionTagsGet200Response;
import org.openapitools.model.PinterestLibError;

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
     * Create a conversion tag, also known as [Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag), with the option to enable enhanced match.  The Pinterest Tag tracks actions people take on the ad account&#39;s website after they view the ad account&#39;s ad on Pinterest. The advertiser needs to customize this tag to track conversions.  For more information, see:  [Set up the Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag)  [Pinterest Tag](/docs/track-conversions/pinterest-tag/)  [Enhanced match](/docs/track-conversions/pinterest-tag/#enhanced-match)
     *
     */
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create conversion tag", tags={ "conversion_tags" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = ConversionTag.class),
        @ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = ConversionTag.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public ConversionTag conversionTagsCreate(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @Valid ConversionTagCreate conversionTagCreate);

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
        @ApiResponse(code = 200, message = "Success", response = ConversionTag.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public ConversionTag conversionTagsGet(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @PathParam("conversion_tag_id") @Pattern(regexp="^\\d+$") @Size(max=18) String conversionTagId);

    /**
     * List conversion tags
     *
     * List conversion tags associated with an ad account.
     *
     */
    @GET
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List conversion tags", tags={ "conversion_tags" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = ConversionTagsList200Response.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public ConversionTagsList200Response conversionTagsList(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @QueryParam("filter_deleted") @DefaultValue("false") Boolean filterDeleted);

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
