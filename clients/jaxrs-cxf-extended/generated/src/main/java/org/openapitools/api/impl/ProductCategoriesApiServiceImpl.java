package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.AgeTrendsBucket;
import org.openapitools.model.FeaturedTrend;
import org.openapitools.model.GenderBucket;
import org.openapitools.model.InterestsEnum;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.ProductCategoriesEngagementType;
import org.openapitools.model.ProductCategoryDetailLookbackWindow;
import org.openapitools.model.ProductCategoryDetails;
import org.openapitools.model.ProductCategoryEnum;
import org.openapitools.model.ProductCategoryRegion;
import org.openapitools.model.TrendingProductCategory;
import org.openapitools.model.VerticalProductCategory;

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
public class ProductCategoriesApiServiceImpl implements ProductCategoriesApi {
    /**
     * Get featured topics
     *
     *   Enables advertisers to pull top five trending topics by interest and market, at full parity with the Pinterest Trends UI.
     *
     */
    @Override
    public List<FeaturedTrend> trendsFeaturedTopicsList(ProductCategoryRegion region, InterestsEnum interest) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get product category details
     *
     *   Enables advertisers to retrieve demographic information, related pins, and trend lines for specified product categories
     *
     */
    @Override
    public List<ProductCategoryDetails> trendsProductCategoriesDetailsList(List<ProductCategoryEnum> productCategories, ProductCategoryRegion region, ProductCategoryDetailLookbackWindow lookbackWindow, ProductCategoriesEngagementType engagementType) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get a list of growing Shopping Product Categories
     *
     *   Get a list of growing Shopping Product Categories in ranked order allowing filtering by engagement type, vertical, age, and gender.
     *
     */
    @Override
    public List<TrendingProductCategory> trendsProductCategoriesTrendingList(ProductCategoryRegion region, List<VerticalProductCategory> verticals, List<AgeTrendsBucket> ages, List<GenderBucket> genders, ProductCategoriesEngagementType engagementType) {
        // TODO: Implement...
        return null;
    }

}
