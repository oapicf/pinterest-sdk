package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.Granularity;
import org.joda.time.LocalDate;
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

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;

/**
 * Pinterest REST API
 *
 * <p>Pinterest's REST API
 *
 */
public class ProductGroupPromotionsApiServiceImpl implements ProductGroupPromotionsApi {
    /**
     * Create product group promotions
     *
     * Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a &#39;product group promotion.&#39;)
     *
     */
    @Override
    public ProductGroupPromotions productGroupPromotionsCreate(String adAccountId, ProductGroupPromotionsCreate productGroupPromotionsCreate) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get a product group promotion by id
     *
     * Get a product group promotion by id
     *
     */
    @Override
    public ProductGroupPromotion productGroupPromotionsGet(String adAccountId, String productGroupPromotionId) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get product group promotions
     *
     * List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  **Note:** ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.
     *
     */
    @Override
    public ProductGroupPromotionsList200Response productGroupPromotionsList(String adAccountId, String bookmark, Integer pageSize, PinterestLibPaginationOrder order, List<@Pattern(regexp = "^\\d+$")String> productGroupPromotionIds, List<EntityStatus> entityStatuses, String adGroupId) {
        // TODO: Implement...
        return null;
    }

    /**
     * Update product group promotions
     *
     * Update multiple existing Product Group Promotions (by product_group_id)
     *
     */
    @Override
    public ProductGroupPromotions productGroupPromotionsUpdate(String adAccountId, ProductGroupPromotionsUpdateWithRequiredBody productGroupPromotionsUpdateWithRequiredBody) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get product group analytics
     *
     * Get analytics for the specified product groups in the specified &#x60;ad_account_id&#x60;, filtered by the specified options.  - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
     *
     */
    @Override
    public List<ProductGroupAnalyticsItems> productGroupsAnalytics(LocalDate startDate, LocalDate endDate, List<@Pattern(regexp = "^\\d+$")String> productGroupIds, List<ReportingColumnSync> columns, Granularity granularity, String adAccountId, BigDecimal clickWindowDays, BigDecimal engagementWindowDays, BigDecimal viewWindowDays, String conversionReportTime, ReportingTimeZone reportingTimezone) {
        // TODO: Implement...
        return null;
    }

}
