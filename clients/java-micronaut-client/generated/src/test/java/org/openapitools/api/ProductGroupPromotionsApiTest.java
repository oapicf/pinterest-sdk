package org.openapitools.api;

import org.openapitools.model.Error;
import org.openapitools.model.Granularity;
import java.time.LocalDate;
import org.openapitools.model.ProductGroupAnalyticsResponseInner;
import org.openapitools.model.ProductGroupPromotionCreateRequest;
import org.openapitools.model.ProductGroupPromotionResponse;
import org.openapitools.model.ProductGroupPromotionUpdateRequest;
import org.openapitools.model.ProductGroupPromotionsList200Response;
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
 * API tests for ProductGroupPromotionsApi
 */
@MicronautTest
public class ProductGroupPromotionsApiTest {

    @Inject
    ProductGroupPromotionsApi api;

    
    /**
     * Create product group promotions
     *
     * Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a &#39;product group promotion.&#39;)
     */
    @Test
    @Disabled("Not Implemented")
    public void productGroupPromotionsCreateTest() {
        // given
        String adAccountId = "example";
        ProductGroupPromotionCreateRequest productGroupPromotionCreateRequest = new ProductGroupPromotionCreateRequest("2680059592705", Arrays.asList());

        // when
        ProductGroupPromotionResponse body = api.productGroupPromotionsCreate(adAccountId, productGroupPromotionCreateRequest).block();

        // then
        // TODO implement the productGroupPromotionsCreateTest()
    }

    
    /**
     * Get a product group promotion by id
     *
     * Get a product group promotion by id
     */
    @Test
    @Disabled("Not Implemented")
    public void productGroupPromotionsGetTest() {
        // given
        String adAccountId = "example";
        String productGroupPromotionId = "example";

        // when
        ProductGroupPromotionResponse body = api.productGroupPromotionsGet(adAccountId, productGroupPromotionId).block();

        // then
        // TODO implement the productGroupPromotionsGetTest()
    }

    
    /**
     * Get product group promotions
     *
     * List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  &lt;b&gt;Note:&lt;/b&gt; ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.
     */
    @Test
    @Disabled("Not Implemented")
    public void productGroupPromotionsListTest() {
        // given
        String adAccountId = "example";
        List<@Pattern(regexp = "^\\d+$")String> productGroupPromotionIds = Arrays.asList("example");
        List<String> entityStatuses = Arrays.asList("example");
        String adGroupId = "123123123";
        Integer pageSize = 25;
        String order = "ASCENDING";
        String bookmark = "example";

        // when
        ProductGroupPromotionsList200Response body = api.productGroupPromotionsList(adAccountId, productGroupPromotionIds, entityStatuses, adGroupId, pageSize, order, bookmark).block();

        // then
        // TODO implement the productGroupPromotionsListTest()
    }

    
    /**
     * Update product group promotions
     *
     * Update multiple existing Product Group Promotions (by product_group_id)
     */
    @Test
    @Disabled("Not Implemented")
    public void productGroupPromotionsUpdateTest() {
        // given
        String adAccountId = "example";
        ProductGroupPromotionUpdateRequest productGroupPromotionUpdateRequest = new ProductGroupPromotionUpdateRequest("2680059592705", Arrays.asList());

        // when
        ProductGroupPromotionResponse body = api.productGroupPromotionsUpdate(adAccountId, productGroupPromotionUpdateRequest).block();

        // then
        // TODO implement the productGroupPromotionsUpdateTest()
    }

    
    /**
     * Get product group analytics
     *
     * Get analytics for the specified product groups in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
     */
    @Test
    @Disabled("Not Implemented")
    public void productGroupsAnalyticsTest() {
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
        List<ProductGroupAnalyticsResponseInner> body = api.productGroupsAnalytics(adAccountId, startDate, endDate, productGroupIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime).block();

        // then
        // TODO implement the productGroupsAnalyticsTest()
    }

    
}
