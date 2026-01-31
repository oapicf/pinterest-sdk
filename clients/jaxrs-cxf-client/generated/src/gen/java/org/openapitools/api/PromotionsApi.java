package org.openapitools.api;

import org.openapitools.model.Error;
import org.openapitools.model.PromotionCreateRequest;
import org.openapitools.model.PromotionResponse;
import org.openapitools.model.PromotionUpdateRequest;
import org.openapitools.model.PromotionsList200Response;
import org.openapitools.model.PromotionsResponse;

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
@Path("/ad_accounts/{ad_account_id}/promotions")
@Api(value = "/", description = "")
public interface PromotionsApi  {

    /**
     * Create promotions
     *
     * Create multiple new promotions.
     *
     */
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create promotions", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = PromotionsResponse.class),
        @ApiResponse(code = 400, message = "Invalid create promotions request parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public PromotionsResponse promotionsCreate(@PathParam("ad_account_id") String adAccountId, List<PromotionCreateRequest> promotionCreateRequest);

    /**
     * Delete promotion by id
     *
     * Delete a promotion within Pinterest.
     *
     */
    @DELETE
    @Path("/{promotion_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete promotion by id", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Promotion deleted successfully"),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public void promotionsDelete(@PathParam("ad_account_id") String adAccountId, @PathParam("promotion_id") String promotionId);

    /**
     * Get promotion by id
     *
     * Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.
     *
     */
    @GET
    @Path("/{promotion_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get promotion by id", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = PromotionResponse.class),
        @ApiResponse(code = 404, message = "The promotion ID for the given ad account ID was not found.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public PromotionResponse promotionsGet(@PathParam("ad_account_id") String adAccountId, @PathParam("promotion_id") String promotionId);

    /**
     * Get promotions
     *
     * Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.
     *
     */
    @GET
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get promotions", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = PromotionsList200Response.class),
        @ApiResponse(code = 400, message = "Invalid ad account promotions parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public PromotionsList200Response promotionsList(@PathParam("ad_account_id") String adAccountId, @QueryParam("page_size") @DefaultValue("25")Integer pageSize, @QueryParam("order") String order, @QueryParam("bookmark") String bookmark);

    /**
     * Update promotions
     *
     * Update multiple promotions.
     *
     */
    @PATCH
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update promotions", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = PromotionsResponse.class),
        @ApiResponse(code = 400, message = "Invalid create promotions request parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public PromotionsResponse promotionsUpdate(@PathParam("ad_account_id") String adAccountId, List<PromotionUpdateRequest> promotionUpdateRequest);
}
