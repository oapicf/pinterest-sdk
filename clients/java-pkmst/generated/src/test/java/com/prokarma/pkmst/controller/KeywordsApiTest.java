/*
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.prokarma.pkmst.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.prokarma.pkmst.model.Error;
import com.prokarma.pkmst.model.KeywordUpdateBody;
import com.prokarma.pkmst.model.KeywordsGet200Response;
import com.prokarma.pkmst.model.KeywordsMetricsArrayResponse;
import com.prokarma.pkmst.model.KeywordsRequest;
import com.prokarma.pkmst.model.KeywordsResponse;
import java.util.List;
import com.prokarma.pkmst.model.MatchType;
import com.prokarma.pkmst.model.TrendType;
import com.prokarma.pkmst.model.TrendingKeywordsResponse;
import com.prokarma.pkmst.model.TrendsSupportedRegion;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

/**
 * API tests for KeywordsApi
 */
@Ignore
public class KeywordsApiTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    private final KeywordsApi api = new KeywordsApiController(objectMapper);

    private final String accept = "application/json";

    
    /**
     * Get country&#39;s keyword metrics
     *
     * See keyword metrics for a specified country, aggregated across all of Pinterest. (Definitions are available from the \&quot;Get delivery metrics definitions\&quot; &lt;a href&#x3D;\&quot;/docs/api/v5/#operation/delivery_metrics/get\&quot;&gt;API endpoint&lt;/a&gt;).
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void countryKeywordsMetricsGetTest() throws Exception {
        String adAccountId = null;
        String countryCode = null;
        List<String> keywords = null;
    ResponseEntity<KeywordsMetricsArrayResponse> response = api.countryKeywordsMetricsGet(adAccountId, countryCode, keywords , accept);

        // TODO: test validations
    }
    
    /**
     * Create keywords
     *
     * &lt;p&gt;Create keywords for following entity types(advertiser, campaign, ad group or ad).&lt;/p&gt; &lt;p&gt;For more information, see &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/keyword-targeting\&quot;&gt;Keyword targeting&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Notes:&lt;/b&gt;&lt;/p&gt; &lt;ul style&#x3D;\&quot;list-style-type: square;\&quot;&gt; &lt;li&gt;Advertisers and campaigns can only be assigned keywords with excluding (&#39;_NEGATIVE&#39;).&lt;/li&gt; &lt;li&gt;All keyword match types are available for ad groups.&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;For more information on match types, see &lt;a  target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;/docs/ads/targeting/#Match%20type%20and%20targeting%20level\&quot;&gt;match type enums&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Returns:&lt;/b&gt;&lt;/p&gt; &lt;ul style&#x3D;\&quot;list-style-type: square;\&quot;&gt; &lt;li&gt;&lt;p&gt;A successful call returns an object containing an array of new keyword objects and an empty &amp;quot;errors&amp;quot; object array.&lt;/p&gt;&lt;/li&gt; &lt;li&gt;&lt;p&gt;An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &amp;quot;errors&amp;quot; object array:&lt;/p&gt; &lt;pre class&#x3D;\&quot;last literal-block\&quot;&gt; { \&quot;keywords\&quot;: [], \&quot;errors\&quot;: [ { \&quot;data\&quot;: { \&quot;archived\&quot;: null, \&quot;match_type\&quot;: \&quot;EXACT\&quot;, \&quot;parent_type\&quot;: null, \&quot;value\&quot;: \&quot;foobar\&quot;, \&quot;parent_id\&quot;: null, \&quot;type\&quot;: \&quot;keyword\&quot;, \&quot;id\&quot;: null }, \&quot;error_messages\&quot;: [ \&quot;Advertisers and Campaigns only accept excluded targeting attributes.\&quot; ] } } &lt;/pre&gt;&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;&lt;b&gt;Rate limit&lt;/b&gt;: &lt;a href&#x3D;\&quot;/docs/redoc/#tag/Rate-Limits\&quot;&gt;WRITE&lt;/a&gt;.&lt;/p&gt;
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void keywordsCreateTest() throws Exception {
        String adAccountId = null;
        KeywordsRequest keywordsRequest = null;
    ResponseEntity<KeywordsResponse> response = api.keywordsCreate(adAccountId, keywordsRequest , accept);

        // TODO: test validations
    }
    
    /**
     * Get keywords
     *
     * &lt;p&gt;Get a list of keywords based on the filters provided. If no filter is provided, it will default to the ad_account_id filter, which means it will only return keywords that specifically have parent_id set to the ad_account_id. Note: Keywords can have ad_account_ids, campaign_ids, and ad_group_ids set as their parent_ids. Keywords created through Ads Manager will have their parent_id set to an ad_group_id, not ad_account_id.&lt;/p&gt; &lt;p&gt;For more information, see &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/keyword-targeting\&quot;&gt;Keyword targeting&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Notes:&lt;/b&gt;&lt;/p&gt; &lt;ul style&#x3D;\&quot;list-style-type: square;\&quot;&gt; &lt;li&gt;Advertisers and campaigns can only be assigned keywords with excluding (&#39;_NEGATIVE&#39;).&lt;/li&gt; &lt;li&gt;All keyword match types are available for ad groups.&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;For more information on match types, see &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;/docs/ads/targeting/#Match%20type%20and%20targeting%20level\&quot;&gt;match type enums&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Returns:&lt;/b&gt;&lt;/p&gt; &lt;ul style&#x3D;\&quot;list-style-type: square;\&quot;&gt; &lt;li&gt;&lt;p&gt;A successful call returns an object containing an array of new keyword objects and an empty &amp;quot;errors&amp;quot; object array.&lt;/p&gt;&lt;/li&gt; &lt;li&gt;&lt;p&gt;An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &amp;quot;errors&amp;quot; object array:&lt;/p&gt; &lt;pre class&#x3D;\&quot;last literal-block\&quot;&gt; { \&quot;keywords\&quot;: [], \&quot;errors\&quot;: [ { \&quot;data\&quot;: { \&quot;archived\&quot;: null, \&quot;match_type\&quot;: \&quot;EXACT\&quot;, \&quot;parent_type\&quot;: null, \&quot;value\&quot;: \&quot;foobar\&quot;, \&quot;parent_id\&quot;: null, \&quot;type\&quot;: \&quot;keyword\&quot;, \&quot;id\&quot;: null }, \&quot;error_messages\&quot;: [ \&quot;Advertisers and Campaigns only accept excluded targeting attributes.\&quot; ] } } &lt;/pre&gt;&lt;/li&gt; &lt;/ul&gt;
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void keywordsGetTest() throws Exception {
        String adAccountId = null;
        String campaignId = null;
        String adGroupId = null;
        List<MatchType> matchTypes = null;
        Integer pageSize = null;
        String bookmark = null;
    ResponseEntity<KeywordsGet200Response> response = api.keywordsGet(adAccountId, campaignId, adGroupId, matchTypes, pageSize, bookmark , accept);

        // TODO: test validations
    }
    
    /**
     * Update keywords
     *
     * &lt;p&gt;Update one or more keywords&#39; bid and archived fields.&lt;/p&gt; &lt;p&gt;Archiving a keyword effectively deletes it - keywords no longer receive metrics and no longer visible within the parent entity&#39;s keywords list.&lt;/p&gt;
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void keywordsUpdateTest() throws Exception {
        String adAccountId = null;
        KeywordUpdateBody keywordUpdateBody = null;
    ResponseEntity<KeywordsResponse> response = api.keywordsUpdate(adAccountId, keywordUpdateBody , accept);

        // TODO: test validations
    }
    
    /**
     * List trending keywords
     *
     * &lt;p&gt;Get the top trending search keywords among the Pinterest user audience.&lt;/p&gt; &lt;p&gt;Trending keywords can be used to inform ad targeting, budget strategy, and creative decisions about which products and Pins will resonate with your audience.&lt;/p&gt; &lt;p&gt;Geographic, demographic and interest-based filters are available to narrow down to the top trends among a specific audience. Multiple trend types are supported that can be used to identify newly-popular, evergreen or seasonal keywords.&lt;/p&gt; &lt;p&gt;For an interactive way to explore this data, please visit &lt;a href&#x3D;\&quot;https://trends.pinterest.com\&quot;&gt;trends.pinterest.com&lt;/a&gt;.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void trendingKeywordsListTest() throws Exception {
        TrendsSupportedRegion region = null;
        TrendType trendType = null;
        List<String> interests = null;
        List<String> genders = null;
        List<String> ages = null;
        Boolean normalizeAgainstGroup = null;
        Integer limit = null;
    ResponseEntity<TrendingKeywordsResponse> response = api.trendingKeywordsList(region, trendType, interests, genders, ages, normalizeAgainstGroup, limit , accept);

        // TODO: test validations
    }
    
}