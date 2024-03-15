package org.openapitools.api;

import org.openapitools.model.Error;
import org.openapitools.model.TermsOfService;

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
@Path("/ad_accounts/{ad_account_id}/terms_of_service")
@Api(value = "/", description = "")
public interface TermsOfServiceApi  {

    /**
     * Get terms of service
     *
     * Get the text of the terms of service and see whether the advertiser has accepted the terms of service.
     *
     */
    @GET
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get terms of service", tags={ "terms_of_service" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = TermsOfService.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public TermsOfService termsOfServiceGet(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @QueryParam("include_html") @DefaultValue("false")Boolean includeHtml, @QueryParam("tos_type") String tosType);
}
