package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.Error;
import org.openapitools.model.Granularity;
import org.joda.time.LocalDate;
import org.openapitools.model.ProductGroupAnalyticsResponseInner;
import org.openapitools.model.ProductGroupPromotionCreateRequest;
import org.openapitools.model.ProductGroupPromotionResponse;
import org.openapitools.model.ProductGroupPromotionUpdateRequest;
import org.openapitools.model.ProductGroupPromotionsList200Response;

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
    public ProductGroupPromotionResponse productGroupPromotionsCreate(String adAccountId, ProductGroupPromotionCreateRequest productGroupPromotionCreateRequest) {
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
    public ProductGroupPromotionResponse productGroupPromotionsGet(String adAccountId, String productGroupPromotionId) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get product group promotions
     *
     * List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  &lt;b&gt;Note:&lt;/b&gt; ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.
     *
     */
    @Override
    public ProductGroupPromotionsList200Response productGroupPromotionsList(String adAccountId, List<@Pattern(regexp = "^\\d+$")String> productGroupPromotionIds, List<String> entityStatuses, String adGroupId, Integer pageSize, String order, String bookmark) {
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
    public ProductGroupPromotionResponse productGroupPromotionsUpdate(String adAccountId, ProductGroupPromotionUpdateRequest productGroupPromotionUpdateRequest) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get product group analytics
     *
     * Get analytics for the specified product groups in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
     *
     */
    @Override
    public List<ProductGroupAnalyticsResponseInner> productGroupsAnalytics(String adAccountId, LocalDate startDate, LocalDate endDate, List<@Pattern(regexp = "^\\d+$")String> productGroupIds, List<String> columns, Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime) {
        // TODO: Implement...
        return null;
    }

}
