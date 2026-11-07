package org.openapitools.controller;

import java.math.BigDecimal;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.Granularity;
import java.time.LocalDate;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.PinterestLibPaginationOrder;
import org.openapitools.model.ProductGroupAnalyticsItems;
import org.openapitools.model.ProductGroupPromotion;
import org.openapitools.model.ProductGroupPromotions;
import org.openapitools.model.ProductGroupPromotionsCreate;
import org.openapitools.model.ProductGroupPromotionsList200Response;
import org.openapitools.model.ProductGroupPromotionsUpdateWithRequiredBody;
import org.openapitools.model.ReportingColumnSync;
import org.openapitools.model.ReportingTimeZone;
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
        ProductGroupPromotionsCreate productGroupPromotionsCreate = new ProductGroupPromotionsCreate("2680059592705", Arrays.asList());

        // when
        ProductGroupPromotions result = controller.productGroupPromotionsCreate(adAccountId, productGroupPromotionsCreate).block();

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
        ProductGroupPromotionsCreate body = new ProductGroupPromotionsCreate("2680059592705", Arrays.asList());
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/product_group_promotions").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@45ed3a9b");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ProductGroupPromotions.class);

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
        ProductGroupPromotion result = controller.productGroupPromotionsGet(adAccountId, productGroupPromotionId).block();

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
            .accept("[Ljava.lang.String;@3659574b");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ProductGroupPromotion.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of productGroupPromotionsList() method
     *
     * The method should: Get product group promotions
     *
     * List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  **Note:** ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void productGroupPromotionsListMethodTest() {
        // given
        String adAccountId = "example";
        String bookmark = "example";
        Integer pageSize = 25;
        PinterestLibPaginationOrder order = PinterestLibPaginationOrder.fromValue("ASCENDING");
        List<@Pattern(regexp = "^\\d+$")String> productGroupPromotionIds = Arrays.asList("example");
        List<EntityStatus> entityStatuses = Arrays.asList();
        String adGroupId = "example";

        // when
        ProductGroupPromotionsList200Response result = controller.productGroupPromotionsList(adAccountId, bookmark, pageSize, order, productGroupPromotionIds, entityStatuses, adGroupId).block();

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
            .accept("[Ljava.lang.String;@5d25fe35");
        request.getParameters()
            .add("bookmark", "example") // The query parameter format should be 
            .add("page_size", String.valueOf(25)) // The query parameter format should be 
            .add("order", String.valueOf(PinterestLibPaginationOrder.fromValue("ASCENDING"))) // The query parameter format should be 
            .add("product_group_promotion_ids", Arrays.asList("example")) // The query format should be multi
            .add("entity_statuses", Arrays.asList()) // The query format should be multi
            .add("ad_group_id", "example"); // The query parameter format should be 

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
        ProductGroupPromotionsUpdateWithRequiredBody productGroupPromotionsUpdateWithRequiredBody = new ProductGroupPromotionsUpdateWithRequiredBody("2680059592705", Arrays.asList());

        // when
        ProductGroupPromotions result = controller.productGroupPromotionsUpdate(adAccountId, productGroupPromotionsUpdateWithRequiredBody).block();

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
        ProductGroupPromotionsUpdateWithRequiredBody body = new ProductGroupPromotionsUpdateWithRequiredBody("2680059592705", Arrays.asList());
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/product_group_promotions").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.PATCH(uri, body)
            .accept("[Ljava.lang.String;@17ca2a05");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ProductGroupPromotions.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of productGroupsAnalytics() method
     *
     * The method should: Get product group analytics
     *
     * Get analytics for the specified product groups in the specified &#x60;ad_account_id&#x60;, filtered by the specified options.  - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void productGroupsAnalyticsMethodTest() {
        // given
        LocalDate startDate = LocalDate.of(2001, 2, 3);
        LocalDate endDate = LocalDate.of(2001, 2, 3);
        List<@Pattern(regexp = "^\\d+$")String> productGroupIds = Arrays.asList("example");
        List<ReportingColumnSync> columns = Arrays.asList();
        Granularity granularity = Granularity.fromValue("TOTAL");
        String adAccountId = "example";
        BigDecimal clickWindowDays = new BigDecimal(78);
        BigDecimal engagementWindowDays = new BigDecimal(78);
        BigDecimal viewWindowDays = new BigDecimal(78);
        String conversionReportTime = "TIME_OF_AD_ACTION";
        ReportingTimeZone reportingTimezone = ReportingTimeZone.fromValue("PINTEREST_TIME_ZONE");

        // when
        List<ProductGroupAnalyticsItems> result = controller.productGroupsAnalytics(startDate, endDate, productGroupIds, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, reportingTimezone).block();

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
            .accept("[Ljava.lang.String;@3b5ff385");
        request.getParameters()
            .add("start_date", String.valueOf(LocalDate.of(2001, 2, 3))) // The query parameter format should be 
            .add("end_date", String.valueOf(LocalDate.of(2001, 2, 3))) // The query parameter format should be 
            .add("product_group_ids", Arrays.asList("example")) // The query format should be multi
            .add("columns", String.valueOf(Arrays.asList())) // The query parameter format should be csv
            .add("granularity", String.valueOf(Granularity.fromValue("TOTAL"))) // The query parameter format should be 
            .add("click_window_days", String.valueOf(new BigDecimal(78))) // The query parameter format should be 
            .add("engagement_window_days", String.valueOf(new BigDecimal(78))) // The query parameter format should be 
            .add("view_window_days", String.valueOf(new BigDecimal(78))) // The query parameter format should be 
            .add("conversion_report_time", "TIME_OF_AD_ACTION") // The query parameter format should be 
            .add("reporting_timezone", String.valueOf(ReportingTimeZone.fromValue("PINTEREST_TIME_ZONE"))); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Argument.of(List.class, ProductGroupAnalyticsItems.class));

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
