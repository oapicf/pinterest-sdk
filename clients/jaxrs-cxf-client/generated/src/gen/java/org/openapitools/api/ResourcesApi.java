package org.openapitools.api;

import org.openapitools.model.AdAccountsCountryResponse;
import org.openapitools.model.BookClosedResponse;
import org.openapitools.model.DeliveryMetricsResponse;
import org.openapitools.model.Error;
import org.openapitools.model.SingleInterestTargetingOptionResponse;

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
@Path("/resources")
@Api(value = "/", description = "")
public interface ResourcesApi  {

    /**
     * Get ad accounts countries
     *
     * Get Ad Accounts countries
     *
     */
    @GET
    @Path("/ad_account_countries")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get ad accounts countries", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdAccountsCountryResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public AdAccountsCountryResponse adAccountCountriesGet();

    /**
     * Get available metrics&#39; definitions
     *
     * Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The &#x60;display_name&#x60; attribute will match how the metric is named in our native tools like Ads Manager. See &lt;a href&#x3D;&#39;/docs/api-features/analytics-overview/&#39;&gt;Organic Analytics&lt;/a&gt; and &lt;a href&#x3D;&#39;/docs/api-features/ads-reporting/&#39;&gt;Ads Analytics&lt;/a&gt; for more information.
     *
     */
    @GET
    @Path("/delivery_metrics")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get available metrics' definitions", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = DeliveryMetricsResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public DeliveryMetricsResponse deliveryMetricsGet(@QueryParam("report_type") String reportType);

    /**
     * Get interest details
     *
     * &lt;p&gt;Get details of a specific interest given interest ID.&lt;/p&gt; &lt;p&gt;Click &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid&#x3D;118370875\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; for a spreadsheet listing interests and their IDs.&lt;/p&gt;
     *
     */
    @GET
    @Path("/targeting/interests/{interest_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get interest details", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = SingleInterestTargetingOptionResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public SingleInterestTargetingOptionResponse interestTargetingOptionsGet(@PathParam("interest_id") String interestId);

    /**
     * Get lead form questions
     *
     * Get a list of all lead form question type names. Some questions might not be used.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
     *
     */
    @GET
    @Path("/lead_form_questions")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get lead form questions", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success"),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public void leadFormQuestionsGet();

    /**
     * Get metrics ready state
     *
     * Learn whether conversion or non-conversion metrics are finalized and ready to query.
     *
     */
    @GET
    @Path("/metrics_ready_state")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get metrics ready state", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = BookClosedResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public BookClosedResponse metricsReadyStateGet(@QueryParam("date") String date);

    /**
     * Get targeting options
     *
     * &lt;p&gt;You can use targeting values in ads placement to define your intended audience. &lt;/p&gt; &lt;p&gt;Targeting metrics are organized around targeting specifications.&lt;/p&gt; &lt;p&gt;For more information on ads targeting, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/audience-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audience targeting&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Sample return:&lt;/b&gt;&lt;/p&gt; &lt;pre class&#x3D;\&quot;literal-block\&quot;&gt; [{&amp;quot;36313&amp;quot;: &amp;quot;Australia: Moreton Bay - North&amp;quot;, &amp;quot;124735&amp;quot;: &amp;quot;Canada: North Battleford&amp;quot;, &amp;quot;36109&amp;quot;: &amp;quot;Australia: Murray&amp;quot;, &amp;quot;36108&amp;quot;: &amp;quot;Australia: Mid North Coast&amp;quot;, &amp;quot;36101&amp;quot;: &amp;quot;Australia: Capital Region&amp;quot;, &amp;quot;811&amp;quot;: &amp;quot;U.S.: Reno&amp;quot;, &amp;quot;36103&amp;quot;: &amp;quot;Australia: Central West&amp;quot;, &amp;quot;36102&amp;quot;: &amp;quot;Australia: Central Coast&amp;quot;, &amp;quot;36105&amp;quot;: &amp;quot;Australia: Far West and Orana&amp;quot;, &amp;quot;36104&amp;quot;: &amp;quot;Australia: Coffs Harbour - Grafton&amp;quot;, &amp;quot;36107&amp;quot;: &amp;quot;Australia: Illawarra&amp;quot;, &amp;quot;36106&amp;quot;: &amp;quot;Australia: Hunter Valley Exc Newcastle&amp;quot;, &amp;quot;554017&amp;quot;: &amp;quot;New Zealand: Wanganui&amp;quot;, &amp;quot;554016&amp;quot;: &amp;quot;New Zealand: Marlborough&amp;quot;, &amp;quot;554015&amp;quot;: &amp;quot;New Zealand: Gisborne&amp;quot;, &amp;quot;554014&amp;quot;: &amp;quot;New Zealand: Tararua&amp;quot;, &amp;quot;554013&amp;quot;: &amp;quot;New Zealand: Invercargill&amp;quot;, &amp;quot;GR&amp;quot;: &amp;quot;Greece&amp;quot;, &amp;quot;554011&amp;quot;: &amp;quot;New Zealand: Whangarei&amp;quot;, &amp;quot;554010&amp;quot;: &amp;quot;New Zealand: Far North&amp;quot;, &amp;quot;717&amp;quot;: &amp;quot;U.S.: Quincy-Hannibal-Keokuk&amp;quot;, &amp;quot;716&amp;quot;: &amp;quot;U.S.: Baton Rouge&amp;quot;,...}] &lt;/pre&gt;
     *
     */
    @GET
    @Path("/targeting/{targeting_type}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get targeting options", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = Object.class, responseContainer = "List"),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public List<Object> targetingOptionsGet(@PathParam("targeting_type") String targetingType, @QueryParam("client_id") String clientId, @QueryParam("oauth_signature") String oauthSignature, @QueryParam("timestamp") String timestamp, @QueryParam("ad_account_id") String adAccountId);
}
