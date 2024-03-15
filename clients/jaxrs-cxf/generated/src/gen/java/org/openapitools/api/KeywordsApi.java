package org.openapitools.api;

import org.openapitools.model.Error;
import org.openapitools.model.KeywordUpdateBody;
import org.openapitools.model.KeywordsGet200Response;
import org.openapitools.model.KeywordsMetricsArrayResponse;
import org.openapitools.model.KeywordsRequest;
import org.openapitools.model.KeywordsResponse;
import org.openapitools.model.MatchType;
import org.openapitools.model.TrendType;
import org.openapitools.model.TrendingKeywordsResponse;
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
     * See keyword metrics for a specified country, aggregated across all of Pinterest. (Definitions are available from the \&quot;Get delivery metrics definitions\&quot; &lt;a href&#x3D;\&quot;/docs/api/v5/#operation/delivery_metrics/get\&quot;&gt;API endpoint&lt;/a&gt;).
     *
     */
    @GET
    @Path("/ad_accounts/{ad_account_id}/keywords/metrics")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get country's keyword metrics", tags={ "keywords" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = KeywordsMetricsArrayResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public KeywordsMetricsArrayResponse countryKeywordsMetricsGet(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @QueryParam("country_code") @NotNull String countryCode, @QueryParam("keywords") @NotNull @Size(min=1,max=2000) List<String> keywords);

    /**
     * Create keywords
     *
     * &lt;p&gt;Create keywords for following entity types(advertiser, campaign, ad group or ad).&lt;/p&gt; &lt;p&gt;For more information, see &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/keyword-targeting\&quot;&gt;Keyword targeting&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Notes:&lt;/b&gt;&lt;/p&gt; &lt;ul style&#x3D;\&quot;list-style-type: square;\&quot;&gt; &lt;li&gt;Advertisers and campaigns can only be assigned keywords with excluding (&#39;_NEGATIVE&#39;).&lt;/li&gt; &lt;li&gt;All keyword match types are available for ad groups.&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;For more information on match types, see &lt;a  target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;/docs/ads/targeting/#Match%20type%20and%20targeting%20level\&quot;&gt;match type enums&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Returns:&lt;/b&gt;&lt;/p&gt; &lt;ul style&#x3D;\&quot;list-style-type: square;\&quot;&gt; &lt;li&gt;&lt;p&gt;A successful call returns an object containing an array of new keyword objects and an empty &amp;quot;errors&amp;quot; object array.&lt;/p&gt;&lt;/li&gt; &lt;li&gt;&lt;p&gt;An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &amp;quot;errors&amp;quot; object array:&lt;/p&gt; &lt;pre class&#x3D;\&quot;last literal-block\&quot;&gt; { \&quot;keywords\&quot;: [], \&quot;errors\&quot;: [ { \&quot;data\&quot;: { \&quot;archived\&quot;: null, \&quot;match_type\&quot;: \&quot;EXACT\&quot;, \&quot;parent_type\&quot;: null, \&quot;value\&quot;: \&quot;foobar\&quot;, \&quot;parent_id\&quot;: null, \&quot;type\&quot;: \&quot;keyword\&quot;, \&quot;id\&quot;: null }, \&quot;error_messages\&quot;: [ \&quot;Advertisers and Campaigns only accept excluded targeting attributes.\&quot; ] } } &lt;/pre&gt;&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;&lt;b&gt;Rate limit&lt;/b&gt;: &lt;a href&#x3D;\&quot;/docs/redoc/#tag/Rate-Limits\&quot;&gt;WRITE&lt;/a&gt;.&lt;/p&gt;
     *
     */
    @POST
    @Path("/ad_accounts/{ad_account_id}/keywords")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create keywords", tags={ "keywords" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = KeywordsResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public KeywordsResponse keywordsCreate(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @Valid @NotNull KeywordsRequest keywordsRequest);

    /**
     * Get keywords
     *
     * &lt;p&gt;Get a list of keywords based on the filters provided. If no filter is provided, it will default to the ad_account_id filter, which means it will only return keywords that specifically have parent_id set to the ad_account_id. Note: Keywords can have ad_account_ids, campaign_ids, and ad_group_ids set as their parent_ids. Keywords created through Ads Manager will have their parent_id set to an ad_group_id, not ad_account_id.&lt;/p&gt; &lt;p&gt;For more information, see &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/keyword-targeting\&quot;&gt;Keyword targeting&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Notes:&lt;/b&gt;&lt;/p&gt; &lt;ul style&#x3D;\&quot;list-style-type: square;\&quot;&gt; &lt;li&gt;Advertisers and campaigns can only be assigned keywords with excluding (&#39;_NEGATIVE&#39;).&lt;/li&gt; &lt;li&gt;All keyword match types are available for ad groups.&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;For more information on match types, see &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;/docs/ads/targeting/#Match%20type%20and%20targeting%20level\&quot;&gt;match type enums&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Returns:&lt;/b&gt;&lt;/p&gt; &lt;ul style&#x3D;\&quot;list-style-type: square;\&quot;&gt; &lt;li&gt;&lt;p&gt;A successful call returns an object containing an array of new keyword objects and an empty &amp;quot;errors&amp;quot; object array.&lt;/p&gt;&lt;/li&gt; &lt;li&gt;&lt;p&gt;An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &amp;quot;errors&amp;quot; object array:&lt;/p&gt; &lt;pre class&#x3D;\&quot;last literal-block\&quot;&gt; { \&quot;keywords\&quot;: [], \&quot;errors\&quot;: [ { \&quot;data\&quot;: { \&quot;archived\&quot;: null, \&quot;match_type\&quot;: \&quot;EXACT\&quot;, \&quot;parent_type\&quot;: null, \&quot;value\&quot;: \&quot;foobar\&quot;, \&quot;parent_id\&quot;: null, \&quot;type\&quot;: \&quot;keyword\&quot;, \&quot;id\&quot;: null }, \&quot;error_messages\&quot;: [ \&quot;Advertisers and Campaigns only accept excluded targeting attributes.\&quot; ] } } &lt;/pre&gt;&lt;/li&gt; &lt;/ul&gt;
     *
     */
    @GET
    @Path("/ad_accounts/{ad_account_id}/keywords")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get keywords", tags={ "keywords" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = KeywordsGet200Response.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public KeywordsGet200Response keywordsGet(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @QueryParam("campaign_id") @Pattern(regexp="^\\d+$") @Size(max=18) String campaignId, @QueryParam("ad_group_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adGroupId, @QueryParam("match_types") @Size(min=1,max=5) List<MatchType> matchTypes, @QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25")Integer pageSize, @QueryParam("bookmark") String bookmark);

    /**
     * Update keywords
     *
     * &lt;p&gt;Update one or more keywords&#39; bid and archived fields.&lt;/p&gt; &lt;p&gt;Archiving a keyword effectively deletes it - keywords no longer receive metrics and no longer visible within the parent entity&#39;s keywords list.&lt;/p&gt;
     *
     */
    @PATCH
    @Path("/ad_accounts/{ad_account_id}/keywords")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update keywords", tags={ "keywords" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = KeywordsResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public KeywordsResponse keywordsUpdate(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @Valid @NotNull KeywordUpdateBody keywordUpdateBody);

    /**
     * List trending keywords
     *
     * &lt;p&gt;Get the top trending search keywords among the Pinterest user audience.&lt;/p&gt; &lt;p&gt;Trending keywords can be used to inform ad targeting, budget strategy, and creative decisions about which products and Pins will resonate with your audience.&lt;/p&gt; &lt;p&gt;Geographic, demographic and interest-based filters are available to narrow down to the top trends among a specific audience. Multiple trend types are supported that can be used to identify newly-popular, evergreen or seasonal keywords.&lt;/p&gt; &lt;p&gt;For an interactive way to explore this data, please visit &lt;a href&#x3D;\&quot;https://trends.pinterest.com\&quot;&gt;trends.pinterest.com&lt;/a&gt;.
     *
     */
    @GET
    @Path("/trends/keywords/{region}/top/{trend_type}")
    @Produces({ "application/json" })
    @ApiOperation(value = "List trending keywords", tags={ "keywords" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = TrendingKeywordsResponse.class),
        @ApiResponse(code = 400, message = "Invalid trending keywords request parameters", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public TrendingKeywordsResponse trendingKeywordsList(@PathParam("region") TrendsSupportedRegion region, @PathParam("trend_type") TrendType trendType, @QueryParam("interests") List<String> interests, @QueryParam("genders") List<String> genders, @QueryParam("ages") List<String> ages, @QueryParam("normalize_against_group") @DefaultValue("false")Boolean normalizeAgainstGroup, @QueryParam("limit") @Min(1) @Max(50) @DefaultValue("50")Integer limit);
}
