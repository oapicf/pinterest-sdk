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
import org.openapitools.vertxweb.server.model.TrendsEditorial;
import org.openapitools.vertxweb.server.model.VerticalProductCategory;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class TrendsApiImpl implements TrendsApi {
    public Future<ApiResponse<List<TrendsEditorial>>> trendsEditorialArticlesList(ProductCategoryRegion region) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<List<FeaturedTrend>>> trendsFeaturedTopicsList(ProductCategoryRegion region, InterestsEnum interest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<List<ProductCategoryDetails>>> trendsProductCategoriesDetailsList(List<ProductCategoryEnum> productCategories, ProductCategoryRegion region, ProductCategoryDetailLookbackWindow lookbackWindow, ProductCategoriesEngagementType engagementType) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<List<TrendingProductCategory>>> trendsProductCategoriesTrendingList(ProductCategoryRegion region, List<VerticalProductCategory> verticals, List<AgeTrendsBucket> ages, List<GenderBucket> genders, ProductCategoriesEngagementType engagementType) {
        return Future.failedFuture(new HttpException(501));
    }

}
