package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AgeTrendsBucket;
import org.openapitools.vertxweb.server.model.FeaturedTrend;
import org.openapitools.vertxweb.server.model.GenderBucket;
import org.openapitools.vertxweb.server.model.InterestsEnum;
import org.openapitools.vertxweb.server.model.PinterestLibError;
import org.openapitools.vertxweb.server.model.ProductCategoriesEngagementType;
import org.openapitools.vertxweb.server.model.ProductCategoryDetailLookbackWindow;
import org.openapitools.vertxweb.server.model.ProductCategoryDetails;
import org.openapitools.vertxweb.server.model.ProductCategoryEnum;
import org.openapitools.vertxweb.server.model.ProductCategoryRegion;
import org.openapitools.vertxweb.server.model.TrendingProductCategory;
import org.openapitools.vertxweb.server.model.VerticalProductCategory;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface ProductCategoriesApi  {
    Future<ApiResponse<List<FeaturedTrend>>> trendsFeaturedTopicsList(ProductCategoryRegion region, InterestsEnum interest);
    Future<ApiResponse<List<ProductCategoryDetails>>> trendsProductCategoriesDetailsList(List<ProductCategoryEnum> productCategories, ProductCategoryRegion region, ProductCategoryDetailLookbackWindow lookbackWindow, ProductCategoriesEngagementType engagementType);
    Future<ApiResponse<List<TrendingProductCategory>>> trendsProductCategoriesTrendingList(ProductCategoryRegion region, List<VerticalProductCategory> verticals, List<AgeTrendsBucket> ages, List<GenderBucket> genders, ProductCategoriesEngagementType engagementType);
}
