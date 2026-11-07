package org.openapitools.controller;

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
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.MutableHttpRequest;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.uri.UriTemplate;
import io.micronaut.http.cookie.Cookie;
import io.micronaut.http.client.multipart.MultipartBody;
import io.micronaut.core.type.Argument;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Assertions;
import jakarta.inject.Inject;
import reactor.core.publisher.Mono;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;


/**
 * API tests for KeywordsController
 */
@MicronautTest
public class KeywordsControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    KeywordsController controller;

    /**
     * This test is used to validate the implementation of countryKeywordsMetricsGet() method
     *
     * The method should: Get country&#39;s keyword metrics
     *
     *   See keyword metrics for a specified country, aggregated across all of Pinterest.   (Definitions are available from the \&quot;Get delivery metrics definitions\&quot;   [API endpoint](/docs/api/v5/#operation/delivery_metrics/get)).
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void countryKeywordsMetricsGetMethodTest() {
        // given
        String adAccountId = "example";
        String countryCode = "example";
        List<String> keywords = Arrays.asList("example");

        // when
        KeywordsMetricsArrayResponse result = controller.countryKeywordsMetricsGet(adAccountId, countryCode, keywords).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/keywords/metrics' to the features of countryKeywordsMetricsGet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void countryKeywordsMetricsGetClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/keywords/metrics").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@3292c1d3");
        request.getParameters()
            .add("country_code", "example") // The query parameter format should be 
            .add("keywords", String.valueOf(Arrays.asList("example"))); // The query parameter format should be csv

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, KeywordsMetricsArrayResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of keywordsCreate() method
     *
     * The method should: Create keywords
     *
     *   Create keywords for the following entity types (advertiser, campaign, ad group, or ad). For more information, see [Keyword targeting](https://help.pinterest.com/en/business/article/keyword-targeting).    **Notes:**   - Advertisers and campaigns can only be assigned keywords with excluding (&#x60;_NEGATIVE&#x60;).   - All keyword match types are available for ad groups.    For more information on match types, see [match type enums](/docs/api-features/targeting-overview/).    **Returns:**   - A successful call returns an object containing an array of new keyword objects and an empty &#x60;errors&#x60; object array.   - An unsuccessful call returns an empty keywords array, and instead, inserts the entire object with nulled/negated properties into the &#x60;errors&#x60; object array:     &#x60;&#x60;&#x60;json     {       \&quot;keywords\&quot;: [],       \&quot;errors\&quot;: [         {           \&quot;data\&quot;: {             \&quot;archived\&quot;: null,             \&quot;match_type\&quot;: \&quot;EXACT\&quot;,             \&quot;parent_type\&quot;: null,             \&quot;value\&quot;: \&quot;foobar\&quot;,             \&quot;parent_id\&quot;: null,             \&quot;type\&quot;: \&quot;keyword\&quot;,             \&quot;id\&quot;: null           },           \&quot;error_messages\&quot;: [             \&quot;Advertisers and Campaigns only accept excluded targeting attributes.\&quot;           ]         }       ]     }
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void keywordsCreateMethodTest() {
        // given
        String adAccountId = "example";
        KeywordsCreate keywordsCreate = new KeywordsCreate(Arrays.asList(), "example");

        // when
        Keywords result = controller.keywordsCreate(adAccountId, keywordsCreate).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/keywords' to the features of keywordsCreate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void keywordsCreateClientApiTest() throws IOException {
        // given
        KeywordsCreate body = new KeywordsCreate(Arrays.asList(), "example");
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/keywords").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@4f68e31a");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Keywords.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of keywordsGet() method
     *
     * The method should: Get keywords
     *
     *     Get a list of keywords based on the filters provided. If no filter is provided, it will default to the &#x60;ad_account_id&#x60; filter, which means it will only return keywords that specifically have &#x60;parent_id&#x60; set to the &#x60;ad_account_id&#x60;. Note: Keywords can have &#x60;ad_account_ids&#x60;, &#x60;campaign_ids&#x60;, and &#x60;ad_group_ids&#x60; set as their &#x60;parent_ids&#x60;. Keywords created through Ads Manager will have their &#x60;parent_id&#x60; set to an &#x60;ad_group_id&#x60;, not &#x60;ad_account_id&#x60;.      For more information, see [Keyword targeting](https://help.pinterest.com/en/business/article/keyword-targeting).      **Notes:**     - Advertisers and campaigns can only be assigned keywords with excluding (&#x60;_NEGATIVE&#x60;).     - All keyword match types are available for ad groups.      For more information on match types, see [match type enums](/docs/api-features/targeting-overview/).      **Returns:**     - A successful call returns an object containing an array of new keyword objects and an empty &#x60;errors&#x60; object array.     - An unsuccessful call returns an empty keywords array, and instead, inserts the entire object with nulled/negated properties into the &#x60;errors&#x60; object array:       &#x60;&#x60;&#x60;json       {         \&quot;keywords\&quot;: [],         \&quot;errors\&quot;: [           {             \&quot;data\&quot;: {               \&quot;archived\&quot;: null,               \&quot;match_type\&quot;: \&quot;EXACT\&quot;,               \&quot;parent_type\&quot;: null,               \&quot;value\&quot;: \&quot;foobar\&quot;,               \&quot;parent_id\&quot;: null,               \&quot;type\&quot;: \&quot;keyword\&quot;,               \&quot;id\&quot;: null             },             \&quot;error_messages\&quot;: [               \&quot;Advertisers and Campaigns only accept excluded targeting attributes.\&quot;             ]           }         ]       }
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void keywordsGetMethodTest() {
        // given
        String adAccountId = "example";
        String campaignId = "example";
        String adGroupId = "example";
        List<@Pattern(regexp = "^\\d+$")String> adGroupIds = Arrays.asList("example");
        List<MatchType> matchTypes = Arrays.asList();
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        KeywordsGet200Response result = controller.keywordsGet(adAccountId, campaignId, adGroupId, adGroupIds, matchTypes, bookmark, pageSize).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/keywords' to the features of keywordsGet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void keywordsGetClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/keywords").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@ec228d4");
        request.getParameters()
            .add("campaign_id", "example") // The query parameter format should be 
            .add("ad_group_id", "example") // The query parameter format should be 
            .add("ad_group_ids", Arrays.asList("example")) // The query format should be multi
            .add("match_types", Arrays.asList()) // The query format should be multi
            .add("bookmark", "example") // The query parameter format should be 
            .add("page_size", String.valueOf(25)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, KeywordsGet200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of keywordsUpdate() method
     *
     * The method should: Update keywords
     *
     *   Update one or more keywords&#39; bid and archived fields. Archiving   a keyword effectively deletes it - keywords no longer receive metrics and   are no longer visible within the parent entity&#39;s keywords list.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void keywordsUpdateMethodTest() {
        // given
        String adAccountId = "example";
        KeywordsUpdate keywordsUpdate = new KeywordsUpdate();

        // when
        Keywords result = controller.keywordsUpdate(adAccountId, keywordsUpdate).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/keywords' to the features of keywordsUpdate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void keywordsUpdateClientApiTest() throws IOException {
        // given
        KeywordsUpdate body = new KeywordsUpdate();
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/keywords").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.PATCH(uri, body)
            .accept("[Ljava.lang.String;@6209e275");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Keywords.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of trendingKeywordsList() method
     *
     * The method should: List trending keywords
     *
     * Get the top trending search keywords among the Pinterest user audience.  Trending keywords can be used to inform ad targeting, budget strategy, and creative decisions about which products and Pins will resonate with your audience.  Geographic, demographic and interest-based filters are available to narrow down to the top trends among a specific audience. Multiple trend types are supported that can be used to identify newly-popular, evergreen or seasonal keywords.  For an interactive way to explore this data, please visit [trends.pinterest.com](https://trends.pinterest.com).
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void trendingKeywordsListMethodTest() {
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
        TrendingKeywordsResponse result = controller.trendingKeywordsList(region, trendType, interests, genders, ages, includeKeywords, normalizeAgainstGroup, limit, includeDemographics).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/trends/keywords/{region}/top/{trend_type}' to the features of trendingKeywordsList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void trendingKeywordsListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/trends/keywords/{region}/top/{trend_type}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("region", TrendsSupportedRegion.fromValue("US"));
            put("trend_type", TrendType.fromValue("growing"));
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@46312bbe");
        request.getParameters()
            .add("interests", Arrays.asList()) // The query format should be multi
            .add("genders", Arrays.asList()) // The query format should be multi
            .add("ages", Arrays.asList()) // The query format should be multi
            .add("include_keywords", Arrays.asList("example")) // The query format should be multi
            .add("normalize_against_group", String.valueOf(false)) // The query parameter format should be 
            .add("limit", String.valueOf(50)) // The query parameter format should be 
            .add("include_demographics", String.valueOf(false)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, TrendingKeywordsResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
