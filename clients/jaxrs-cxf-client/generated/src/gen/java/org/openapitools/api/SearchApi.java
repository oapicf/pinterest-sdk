package org.openapitools.api;

import org.openapitools.model.Error;
import org.openapitools.model.PinsList200Response;
import org.openapitools.model.SearchPartnerPins200Response;
import org.openapitools.model.SearchUserBoardsGet200Response;

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

/**
 * Pinterest REST API
 *
 * <p>Pinterest's REST API
 *
 */
@Path("/search")
@Api(value = "/", description = "")
public interface SearchApi  {

    /**
     * Search pins by a given search term
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get the top 10 Pins by a given search term.
     *
     */
    @GET
    @Path("/partner/pins")
    @Produces({ "application/json" })
    @ApiOperation(value = "Search pins by a given search term", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = SearchPartnerPins200Response.class),
        @ApiResponse(code = 400, message = "Invalid pins", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public SearchPartnerPins200Response searchPartnerPins(@QueryParam("term") String term, @QueryParam("country_code") String countryCode, @QueryParam("bookmark") String bookmark, @QueryParam("locale") String locale, @QueryParam("limit") @DefaultValue("10")Integer limit);

    /**
     * Search user&#39;s boards
     *
     * Search for boards for the \&quot;operation user_account\&quot;. This includes boards of all board types. - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See &lt;a href&#x3D;&#39;/docs/reference/business-access/&#39;&gt;Understanding Business Access&lt;/a&gt; for more information.
     *
     */
    @GET
    @Path("/boards")
    @Produces({ "application/json" })
    @ApiOperation(value = "Search user's boards", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = SearchUserBoardsGet200Response.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public SearchUserBoardsGet200Response searchUserBoardsGet(@QueryParam("ad_account_id") String adAccountId, @QueryParam("bookmark") String bookmark, @QueryParam("page_size") @DefaultValue("25")Integer pageSize, @QueryParam("query") String query);

    /**
     * Search user&#39;s Pins
     *
     * Search for pins for the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See &lt;a href&#x3D;&#39;/docs/reference/business-access/&#39;&gt;Understanding Business Access&lt;/a&gt; for more information.
     *
     */
    @GET
    @Path("/pins")
    @Produces({ "application/json" })
    @ApiOperation(value = "Search user's Pins", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = PinsList200Response.class),
        @ApiResponse(code = 404, message = "User not found", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public PinsList200Response searchUserPinsList(@QueryParam("query") String query, @QueryParam("ad_account_id") String adAccountId, @QueryParam("bookmark") String bookmark);
}
