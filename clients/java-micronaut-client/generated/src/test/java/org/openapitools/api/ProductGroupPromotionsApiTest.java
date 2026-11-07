package org.openapitools.api;

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
        ProductGroupPromotionsCreate productGroupPromotionsCreate = new ProductGroupPromotionsCreate("2680059592705", Arrays.asList());

        // when
        ProductGroupPromotions body = api.productGroupPromotionsCreate(adAccountId, productGroupPromotionsCreate).block();

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
        ProductGroupPromotion body = api.productGroupPromotionsGet(adAccountId, productGroupPromotionId).block();

        // then
        // TODO implement the productGroupPromotionsGetTest()
    }

    
    /**
     * Get product group promotions
     *
     * List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  **Note:** ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.
     */
    @Test
    @Disabled("Not Implemented")
    public void productGroupPromotionsListTest() {
        // given
        String adAccountId = "example";
        String bookmark = "example";
        Integer pageSize = 25;
        PinterestLibPaginationOrder order = PinterestLibPaginationOrder.fromValue("ASCENDING");
        List<@Pattern(regexp = "^\\d+$")String> productGroupPromotionIds = Arrays.asList("example");
        List<EntityStatus> entityStatuses = Arrays.asList();
        String adGroupId = "example";

        // when
        ProductGroupPromotionsList200Response body = api.productGroupPromotionsList(adAccountId, bookmark, pageSize, order, productGroupPromotionIds, entityStatuses, adGroupId).block();

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
        ProductGroupPromotionsUpdateWithRequiredBody productGroupPromotionsUpdateWithRequiredBody = new ProductGroupPromotionsUpdateWithRequiredBody("2680059592705", Arrays.asList());

        // when
        ProductGroupPromotions body = api.productGroupPromotionsUpdate(adAccountId, productGroupPromotionsUpdateWithRequiredBody).block();

        // then
        // TODO implement the productGroupPromotionsUpdateTest()
    }

    
    /**
     * Get product group analytics
     *
     * Get analytics for the specified product groups in the specified &#x60;ad_account_id&#x60;, filtered by the specified options.  - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
     */
    @Test
    @Disabled("Not Implemented")
    public void productGroupsAnalyticsTest() {
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
        List<ProductGroupAnalyticsItems> body = api.productGroupsAnalytics(startDate, endDate, productGroupIds, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, reportingTimezone).block();

        // then
        // TODO implement the productGroupsAnalyticsTest()
    }

    
}
