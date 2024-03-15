package org.openapitools.api;

import org.openapitools.model.Error;
import org.openapitools.model.OrderLine;
import org.openapitools.model.OrderLinesList200Response;

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
@Path("/ad_accounts/{ad_account_id}/order_lines")
@Api(value = "/", description = "")
public interface OrderLinesApi  {

    /**
     * Get order line
     *
     * Get a specific existing order line associated with an ad account.
     *
     */
    @GET
    @Path("/{order_line_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get order line", tags={ "order_lines" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = OrderLine.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public OrderLine orderLinesGet(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @PathParam("order_line_id") @Pattern(regexp="^\\d+$") @Size(max=18) String orderLineId);

    /**
     * Get order lines
     *
     * List existing order lines associated with an ad account.
     *
     */
    @GET
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get order lines", tags={ "order_lines" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = OrderLinesList200Response.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public OrderLinesList200Response orderLinesList(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25")Integer pageSize, @QueryParam("order") String order, @QueryParam("bookmark") String bookmark);
}
