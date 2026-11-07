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
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;

/**
 * API tests for KeywordsApi
 */
@MicronautTest
public class KeywordsApiTest {

    @Inject
    KeywordsApi api;

    
    /**
     * Get country&#39;s keyword metrics
     *
     *   See keyword metrics for a specified country, aggregated across all of Pinterest.   (Definitions are available from the \&quot;Get delivery metrics definitions\&quot;   [API endpoint](/docs/api/v5/#operation/delivery_metrics/get)).
     */
    @Test
    @Disabled("Not Implemented")
    public void countryKeywordsMetricsGetTest() {
        // given
        String adAccountId = "example";
        String countryCode = "example";
        List<String> keywords = Arrays.asList("example");

        // when
        KeywordsMetricsArrayResponse body = api.countryKeywordsMetricsGet(adAccountId, countryCode, keywords).block();

        // then
        // TODO implement the countryKeywordsMetricsGetTest()
    }

    
    /**
     * Create keywords
     *
     *   Create keywords for the following entity types (advertiser, campaign, ad group, or ad). For more information, see [Keyword targeting](https://help.pinterest.com/en/business/article/keyword-targeting).    **Notes:**   - Advertisers and campaigns can only be assigned keywords with excluding (&#x60;_NEGATIVE&#x60;).   - All keyword match types are available for ad groups.    For more information on match types, see [match type enums](/docs/api-features/targeting-overview/).    **Returns:**   - A successful call returns an object containing an array of new keyword objects and an empty &#x60;errors&#x60; object array.   - An unsuccessful call returns an empty keywords array, and instead, inserts the entire object with nulled/negated properties into the &#x60;errors&#x60; object array:     &#x60;&#x60;&#x60;json     {       \&quot;keywords\&quot;: [],       \&quot;errors\&quot;: [         {           \&quot;data\&quot;: {             \&quot;archived\&quot;: null,             \&quot;match_type\&quot;: \&quot;EXACT\&quot;,             \&quot;parent_type\&quot;: null,             \&quot;value\&quot;: \&quot;foobar\&quot;,             \&quot;parent_id\&quot;: null,             \&quot;type\&quot;: \&quot;keyword\&quot;,             \&quot;id\&quot;: null           },           \&quot;error_messages\&quot;: [             \&quot;Advertisers and Campaigns only accept excluded targeting attributes.\&quot;           ]         }       ]     }
     */
    @Test
    @Disabled("Not Implemented")
    public void keywordsCreateTest() {
        // given
        String adAccountId = "example";
        KeywordsCreate keywordsCreate = new KeywordsCreate(Arrays.asList(), "example");

        // when
        Keywords body = api.keywordsCreate(adAccountId, keywordsCreate).block();

        // then
        // TODO implement the keywordsCreateTest()
    }

    
    /**
     * Get keywords
     *
     *     Get a list of keywords based on the filters provided. If no filter is provided, it will default to the &#x60;ad_account_id&#x60; filter, which means it will only return keywords that specifically have &#x60;parent_id&#x60; set to the &#x60;ad_account_id&#x60;. Note: Keywords can have &#x60;ad_account_ids&#x60;, &#x60;campaign_ids&#x60;, and &#x60;ad_group_ids&#x60; set as their &#x60;parent_ids&#x60;. Keywords created through Ads Manager will have their &#x60;parent_id&#x60; set to an &#x60;ad_group_id&#x60;, not &#x60;ad_account_id&#x60;.      For more information, see [Keyword targeting](https://help.pinterest.com/en/business/article/keyword-targeting).      **Notes:**     - Advertisers and campaigns can only be assigned keywords with excluding (&#x60;_NEGATIVE&#x60;).     - All keyword match types are available for ad groups.      For more information on match types, see [match type enums](/docs/api-features/targeting-overview/).      **Returns:**     - A successful call returns an object containing an array of new keyword objects and an empty &#x60;errors&#x60; object array.     - An unsuccessful call returns an empty keywords array, and instead, inserts the entire object with nulled/negated properties into the &#x60;errors&#x60; object array:       &#x60;&#x60;&#x60;json       {         \&quot;keywords\&quot;: [],         \&quot;errors\&quot;: [           {             \&quot;data\&quot;: {               \&quot;archived\&quot;: null,               \&quot;match_type\&quot;: \&quot;EXACT\&quot;,               \&quot;parent_type\&quot;: null,               \&quot;value\&quot;: \&quot;foobar\&quot;,               \&quot;parent_id\&quot;: null,               \&quot;type\&quot;: \&quot;keyword\&quot;,               \&quot;id\&quot;: null             },             \&quot;error_messages\&quot;: [               \&quot;Advertisers and Campaigns only accept excluded targeting attributes.\&quot;             ]           }         ]       }
     */
    @Test
    @Disabled("Not Implemented")
    public void keywordsGetTest() {
        // given
        String adAccountId = "example";
        String campaignId = "example";
        String adGroupId = "example";
        List<@Pattern(regexp = "^\\d+$")String> adGroupIds = Arrays.asList("example");
        List<MatchType> matchTypes = Arrays.asList();
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        KeywordsGet200Response body = api.keywordsGet(adAccountId, campaignId, adGroupId, adGroupIds, matchTypes, bookmark, pageSize).block();

        // then
        // TODO implement the keywordsGetTest()
    }

    
    /**
     * Update keywords
     *
     *   Update one or more keywords&#39; bid and archived fields. Archiving   a keyword effectively deletes it - keywords no longer receive metrics and   are no longer visible within the parent entity&#39;s keywords list.
     */
    @Test
    @Disabled("Not Implemented")
    public void keywordsUpdateTest() {
        // given
        String adAccountId = "example";
        KeywordsUpdate keywordsUpdate = new KeywordsUpdate();

        // when
        Keywords body = api.keywordsUpdate(adAccountId, keywordsUpdate).block();

        // then
        // TODO implement the keywordsUpdateTest()
    }

    
    /**
     * List trending keywords
     *
     * Get the top trending search keywords among the Pinterest user audience.  Trending keywords can be used to inform ad targeting, budget strategy, and creative decisions about which products and Pins will resonate with your audience.  Geographic, demographic and interest-based filters are available to narrow down to the top trends among a specific audience. Multiple trend types are supported that can be used to identify newly-popular, evergreen or seasonal keywords.  For an interactive way to explore this data, please visit [trends.pinterest.com](https://trends.pinterest.com).
     */
    @Test
    @Disabled("Not Implemented")
    public void trendingKeywordsListTest() {
        // given
        TrendsSupportedRegion region = TrendsSupportedRegion.fromValue("US");
        TrendType trendType = TrendType.fromValue("growing");
        List<TrendsL1Interest> interests = Arrays.asList();
        List<TrendsGenderFilter> genders = Arrays.asList();
        List<TrendsAgeBucket> ages = Arrays.asList();
        List<@Size(min = 1, max = 100)String> includeKeywords = Arrays.asList("example");
        Boolean normalizeAgainstGroup = false;
        Integer limit = 50;
        Boolean includeDemographics = false;

        // when
        TrendingKeywordsResponse body = api.trendingKeywordsList(region, trendType, interests, genders, ages, includeKeywords, normalizeAgainstGroup, limit, includeDemographics).block();

        // then
        // TODO implement the trendingKeywordsListTest()
    }

    
}
