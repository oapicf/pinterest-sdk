package org.openapitools.api;

import org.openapitools.model.AudienceDefinitionResponse;
import org.openapitools.model.AudienceInsightType;
import org.openapitools.model.AudienceInsightsResponse;
import org.openapitools.model.Error;

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
@Path("/ad_accounts/{ad_account_id}")
@Api(value = "/", description = "")
public interface AudienceInsightsApi  {

    /**
     * Get audience insights
     *
     * Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the ad account&#39;s engaged audience on Pinterest, the ad account&#39;s total audience on Pinterest and Pinterest&#39;s total audience.&lt;p/&gt; &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/audience-insights\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Learn more about Audience Insights&lt;/a&gt;.
     *
     */
    @GET
    @Path("/audience_insights")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get audience insights", tags={ "audience_insights" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AudienceInsightsResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public AudienceInsightsResponse audienceInsightsGet(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @QueryParam("audience_insight_type") @NotNull @DefaultValue("YOUR_TOTAL_AUDIENCE") AudienceInsightType audienceInsightType);

    /**
     * Get audience insights scope and type
     *
     * Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience.
     *
     */
    @GET
    @Path("/insights/audiences")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get audience insights scope and type", tags={ "audience_insights" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AudienceDefinitionResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public AudienceDefinitionResponse audienceInsightsScopeAndTypeGet(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId);
}
