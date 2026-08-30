package org.openapitools.api;

import org.openapitools.model.Keywords;
import org.openapitools.model.KeywordsCreate;
import org.openapitools.model.KeywordsGet200Response;
import org.openapitools.model.KeywordsMetricsArrayResponse;
import org.openapitools.model.KeywordsUpdate;
import org.openapitools.model.MatchType;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.TrendType;
import org.openapitools.model.TrendingKeywordsResponse;
import org.openapitools.model.TrendsAgeBucket;
import org.openapitools.model.TrendsGenderFilter;
import org.openapitools.model.TrendsL1Interest;
import org.openapitools.model.TrendsSupportedRegion;

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
@Path("")
@Api(value = "/", description = "")
public interface KeywordsApi  {

    /**
     * Get country&#39;s keyword metrics
     *
     *   See keyword metrics for a specified country, aggregated across all of Pinterest.   (Definitions are available from the \&quot;Get delivery metrics definitions\&quot;   [API endpoint](/docs/api/v5/#operation/delivery_metrics/get)).
     *
     */
    @GET
    @Path("/ad_accounts/{ad_account_id}/keywords/metrics")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get country's keyword metrics", tags={ "keywords" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = KeywordsMetricsArrayResponse.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public KeywordsMetricsArrayResponse countryKeywordsMetricsGet(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @QueryParam("country_code") @NotNull String countryCode, @QueryParam("keywords") @NotNull @Size(min=1,max=2000) List<String> keywords);

    /**
     * Create keywords
     *
     *   Create keywords for the following entity types (advertiser, campaign, ad group, or ad). For more information, see [Keyword targeting](https://help.pinterest.com/en/business/article/keyword-targeting).    **Notes:**   - Advertisers and campaigns can only be assigned keywords with excluding (&#x60;_NEGATIVE&#x60;).   - All keyword match types are available for ad groups.    For more information on match types, see [match type enums](/docs/api-features/targeting-overview/).    **Returns:**   - A successful call returns an object containing an array of new keyword objects and an empty &#x60;errors&#x60; object array.   - An unsuccessful call returns an empty keywords array, and instead, inserts the entire object with nulled/negated properties into the &#x60;errors&#x60; object array:     &#x60;&#x60;&#x60;json     {       \&quot;keywords\&quot;: [],       \&quot;errors\&quot;: [         {           \&quot;data\&quot;: {             \&quot;archived\&quot;: null,             \&quot;match_type\&quot;: \&quot;EXACT\&quot;,             \&quot;parent_type\&quot;: null,             \&quot;value\&quot;: \&quot;foobar\&quot;,             \&quot;parent_id\&quot;: null,             \&quot;type\&quot;: \&quot;keyword\&quot;,             \&quot;id\&quot;: null           },           \&quot;error_messages\&quot;: [             \&quot;Advertisers and Campaigns only accept excluded targeting attributes.\&quot;           ]         }       ]     }
     *
     */
    @POST
    @Path("/ad_accounts/{ad_account_id}/keywords")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create keywords", tags={ "keywords" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = Keywords.class),
        @ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = Keywords.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Keywords keywordsCreate(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @Valid KeywordsCreate keywordsCreate);

    /**
     * Get keywords
     *
     *     Get a list of keywords based on the filters provided. If no filter is provided, it will default to the &#x60;ad_account_id&#x60; filter, which means it will only return keywords that specifically have &#x60;parent_id&#x60; set to the &#x60;ad_account_id&#x60;. Note: Keywords can have &#x60;ad_account_ids&#x60;, &#x60;campaign_ids&#x60;, and &#x60;ad_group_ids&#x60; set as their &#x60;parent_ids&#x60;. Keywords created through Ads Manager will have their &#x60;parent_id&#x60; set to an &#x60;ad_group_id&#x60;, not &#x60;ad_account_id&#x60;.      For more information, see [Keyword targeting](https://help.pinterest.com/en/business/article/keyword-targeting).      **Notes:**     - Advertisers and campaigns can only be assigned keywords with excluding (&#x60;_NEGATIVE&#x60;).     - All keyword match types are available for ad groups.      For more information on match types, see [match type enums](/docs/api-features/targeting-overview/).      **Returns:**     - A successful call returns an object containing an array of new keyword objects and an empty &#x60;errors&#x60; object array.     - An unsuccessful call returns an empty keywords array, and instead, inserts the entire object with nulled/negated properties into the &#x60;errors&#x60; object array:       &#x60;&#x60;&#x60;json       {         \&quot;keywords\&quot;: [],         \&quot;errors\&quot;: [           {             \&quot;data\&quot;: {               \&quot;archived\&quot;: null,               \&quot;match_type\&quot;: \&quot;EXACT\&quot;,               \&quot;parent_type\&quot;: null,               \&quot;value\&quot;: \&quot;foobar\&quot;,               \&quot;parent_id\&quot;: null,               \&quot;type\&quot;: \&quot;keyword\&quot;,               \&quot;id\&quot;: null             },             \&quot;error_messages\&quot;: [               \&quot;Advertisers and Campaigns only accept excluded targeting attributes.\&quot;             ]           }         ]       }
     *
     */
    @GET
    @Path("/ad_accounts/{ad_account_id}/keywords")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get keywords", tags={ "keywords" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = KeywordsGet200Response.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public KeywordsGet200Response keywordsGet(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @QueryParam("campaign_id") @Pattern(regexp="^\\d+$") @Size(max=18) String campaignId, @QueryParam("ad_group_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adGroupId, @QueryParam("ad_group_ids") @Size(min=1,max=250) List<@Pattern(regexp = "^\\d+$")String> adGroupIds, @QueryParam("match_types") @Size(min=1,max=5) List<MatchType> matchTypes, @QueryParam("bookmark") String bookmark, @QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25") Integer pageSize);

    /**
     * Update keywords
     *
     *   Update one or more keywords&#39; bid and archived fields. Archiving   a keyword effectively deletes it - keywords no longer receive metrics and   are no longer visible within the parent entity&#39;s keywords list.
     *
     */
    @PATCH
    @Path("/ad_accounts/{ad_account_id}/keywords")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update keywords", tags={ "keywords" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = Keywords.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Keywords keywordsUpdate(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @Valid KeywordsUpdate keywordsUpdate);

    /**
     * List trending keywords
     *
     * Get the top trending search keywords among the Pinterest user audience.  Trending keywords can be used to inform ad targeting, budget strategy, and creative decisions about which products and Pins will resonate with your audience.  Geographic, demographic and interest-based filters are available to narrow down to the top trends among a specific audience. Multiple trend types are supported that can be used to identify newly-popular, evergreen or seasonal keywords.  For an interactive way to explore this data, please visit [trends.pinterest.com](https://trends.pinterest.com).
     *
     */
    @GET
    @Path("/trends/keywords/{region}/top/{trend_type}")
    @Produces({ "application/json" })
    @ApiOperation(value = "List trending keywords", tags={ "keywords" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = TrendingKeywordsResponse.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public TrendingKeywordsResponse trendingKeywordsList(@PathParam("region") TrendsSupportedRegion region, @PathParam("trend_type") TrendType trendType, @QueryParam("interests") List<TrendsL1Interest> interests, @QueryParam("genders") List<TrendsGenderFilter> genders, @QueryParam("ages") List<TrendsAgeBucket> ages, @QueryParam("include_keywords") @Size(min=1,max=50) List<@Size(min = 1, max = 100)String> includeKeywords, @QueryParam("normalize_against_group") @DefaultValue("false") Boolean normalizeAgainstGroup, @QueryParam("limit") @Min(1) @Max(50) @DefaultValue("50") Integer limit, @QueryParam("include_demographics") @DefaultValue("false") Boolean includeDemographics);
}
