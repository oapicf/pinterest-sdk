package org.openapitools.api;

import org.openapitools.model.CatalogsCreateReportResponse;
import org.openapitools.model.CatalogsReport;
import org.openapitools.model.CatalogsReportParameters;
import org.openapitools.model.Error;
import org.openapitools.model.ReportsStats200Response;
import org.openapitools.model.ReportsStatsParametersParameter;

import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
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
@Path("/catalogs/reports")
@Api(value = "/", description = "")
public interface CatalogReportsApi  {

    /**
     * Build catalogs report
     *
     * Async request to create a report of the catalog owned by the \&quot;operation user_account\&quot;. This endpoint generates a report upon receiving the first approved request of the day. Any following requests with identical parameters will yield the same report even if data has changed. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: Access to the All Items report type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
     *
     */
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Build catalogs report", tags={ "catalog_reports" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Response containing the report token", response = CatalogsCreateReportResponse.class),
        @ApiResponse(code = 404, message = "Entity (e.g., catalog, feed or processing_result) not found", response = Error.class),
        @ApiResponse(code = 409, message = "Can't access this feature without an existing catalog.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public CatalogsCreateReportResponse reportsCreate(@Valid @NotNull CatalogsReportParameters catalogsReportParameters, @QueryParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId);

    /**
     * Get catalogs report
     *
     * This returns a URL to a report given a token returned from &lt;a href&#x3D;&#39;/docs/api/v5/#operation/reports/create&#39;&gt;Build catalogs report&lt;/a&gt;. You can use the URL to download the report. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.
     *
     */
    @GET
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get catalogs report", tags={ "catalog_reports" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Response that contains a link to download the report", response = CatalogsReport.class),
        @ApiResponse(code = 400, message = "The token you provided is not valid or has expired.", response = Error.class),
        @ApiResponse(code = 409, message = "Can't access this feature without an existing catalog.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public CatalogsReport reportsGet(@QueryParam("token") @NotNull String token, @QueryParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId);

    /**
     * List report stats
     *
     * List aggregated numbers of issues for a catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.
     *
     */
    @GET
    @Path("/stats")
    @Produces({ "application/json" })
    @ApiOperation(value = "List report stats", tags={ "catalog_reports" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Response containing the diagnostics aggregated counters", response = ReportsStats200Response.class),
        @ApiResponse(code = 401, message = "Not authorized to access catalogs", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public ReportsStats200Response reportsStats(@QueryParam("parameters") @NotNull ReportsStatsParametersParameter parameters, @QueryParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25")Integer pageSize, @QueryParam("bookmark") String bookmark);
}
