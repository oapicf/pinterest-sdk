package org.openapitools.controller;

import org.openapitools.model.Error;
import org.openapitools.model.Granularity;
import java.time.LocalDate;
import org.openapitools.model.ProductGroupAnalyticsResponseInner;
import org.openapitools.model.ProductGroupPromotionCreateRequest;
import org.openapitools.model.ProductGroupPromotionResponse;
import org.openapitools.model.ProductGroupPromotionUpdateRequest;
import org.openapitools.model.ProductGroupPromotionsList200Response;
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
 * API tests for ProductGroupPromotionsController
 */
@MicronautTest
public class ProductGroupPromotionsControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    ProductGroupPromotionsController controller;

    /**
     * This test is used to validate the implementation of productGroupPromotionsCreate() method
     *
     * The method should: Create product group promotions
     *
     * Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a &#39;product group promotion.&#39;)
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void productGroupPromotionsCreateMethodTest() {
        // given
        String adAccountId = "example";
        ProductGroupPromotionCreateRequest productGroupPromotionCreateRequest = new ProductGroupPromotionCreateRequest("2680059592705", Arrays.asList());

        // when
        ProductGroupPromotionResponse result = controller.productGroupPromotionsCreate(adAccountId, productGroupPromotionCreateRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/product_group_promotions' to the features of productGroupPromotionsCreate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void productGroupPromotionsCreateClientApiTest() throws IOException {
        // given
        ProductGroupPromotionCreateRequest body = new ProductGroupPromotionCreateRequest("2680059592705", Arrays.asList());
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/product_group_promotions").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@1218679a");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ProductGroupPromotionResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of productGroupPromotionsGet() method
     *
     * The method should: Get a product group promotion by id
     *
     * Get a product group promotion by id
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void productGroupPromotionsGetMethodTest() {
        // given
        String adAccountId = "example";
        String productGroupPromotionId = "example";

        // when
        ProductGroupPromotionResponse result = controller.productGroupPromotionsGet(adAccountId, productGroupPromotionId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id}' to the features of productGroupPromotionsGet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void productGroupPromotionsGetClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
            put("product_group_promotion_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@47222fcd");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ProductGroupPromotionResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of productGroupPromotionsList() method
     *
     * The method should: Get product group promotions
     *
     * List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  &lt;b&gt;Note:&lt;/b&gt; ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void productGroupPromotionsListMethodTest() {
        // given
        String adAccountId = "example";
        List<@Pattern(regexp = "^\\d+$")String> productGroupPromotionIds = Arrays.asList("example");
        List<String> entityStatuses = Arrays.asList("example");
        String adGroupId = "123123123";
        Integer pageSize = 25;
        String order = "ASCENDING";
        String bookmark = "example";

        // when
        ProductGroupPromotionsList200Response result = controller.productGroupPromotionsList(adAccountId, productGroupPromotionIds, entityStatuses, adGroupId, pageSize, order, bookmark).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/product_group_promotions' to the features of productGroupPromotionsList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void productGroupPromotionsListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/product_group_promotions").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@119a7fd2");
        request.getParameters()
            .add("product_group_promotion_ids", Arrays.asList("example")) // The query format should be multi
            .add("entity_statuses", Arrays.asList("example")) // The query format should be multi
            .add("ad_group_id", "123123123") // The query parameter format should be 
            .add("page_size", String.valueOf(25)) // The query parameter format should be 
            .add("order", "ASCENDING") // The query parameter format should be 
            .add("bookmark", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ProductGroupPromotionsList200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of productGroupPromotionsUpdate() method
     *
     * The method should: Update product group promotions
     *
     * Update multiple existing Product Group Promotions (by product_group_id)
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void productGroupPromotionsUpdateMethodTest() {
        // given
        String adAccountId = "example";
        ProductGroupPromotionUpdateRequest productGroupPromotionUpdateRequest = new ProductGroupPromotionUpdateRequest("2680059592705", Arrays.asList());

        // when
        ProductGroupPromotionResponse result = controller.productGroupPromotionsUpdate(adAccountId, productGroupPromotionUpdateRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/product_group_promotions' to the features of productGroupPromotionsUpdate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void productGroupPromotionsUpdateClientApiTest() throws IOException {
        // given
        ProductGroupPromotionUpdateRequest body = new ProductGroupPromotionUpdateRequest("2680059592705", Arrays.asList());
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/product_group_promotions").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.PATCH(uri, body)
            .accept("[Ljava.lang.String;@3756acb1");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ProductGroupPromotionResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of productGroupsAnalytics() method
     *
     * The method should: Get product group analytics
     *
     * Get analytics for the specified product groups in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void productGroupsAnalyticsMethodTest() {
        // given
        String adAccountId = "example";
        LocalDate startDate = LocalDate.of(2001, 2, 3);
        LocalDate endDate = LocalDate.of(2001, 2, 3);
        List<@Pattern(regexp = "^\\d+$")String> productGroupIds = Arrays.asList("example");
        List<String> columns = Arrays.asList("example");
        Granularity granularity = Granularity.fromValue("DAY");
        Integer clickWindowDays = 30;
        Integer engagementWindowDays = 30;
        Integer viewWindowDays = 1;
        String conversionReportTime = "TIME_OF_AD_ACTION";

        // when
        List<ProductGroupAnalyticsResponseInner> result = controller.productGroupsAnalytics(adAccountId, startDate, endDate, productGroupIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/product_groups/analytics' to the features of productGroupsAnalytics() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void productGroupsAnalyticsClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/product_groups/analytics").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@66233976");
        request.getParameters()
            .add("start_date", String.valueOf(LocalDate.of(2001, 2, 3))) // The query parameter format should be 
            .add("end_date", String.valueOf(LocalDate.of(2001, 2, 3))) // The query parameter format should be 
            .add("product_group_ids", Arrays.asList("example")) // The query format should be multi
            .add("columns", String.valueOf(Arrays.asList("example"))) // The query parameter format should be csv
            .add("granularity", String.valueOf(Granularity.fromValue("DAY"))) // The query parameter format should be 
            .add("click_window_days", String.valueOf(30)) // The query parameter format should be 
            .add("engagement_window_days", String.valueOf(30)) // The query parameter format should be 
            .add("view_window_days", String.valueOf(1)) // The query parameter format should be 
            .add("conversion_report_time", "TIME_OF_AD_ACTION"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Argument.of(List.class, ProductGroupAnalyticsResponseInner.class));

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
