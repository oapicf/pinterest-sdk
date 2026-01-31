package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.AgeTrendsBucket
import org.openapitools.model.FeaturedTrend
import org.openapitools.model.GenderBucket
import org.openapitools.model.InterestsEnum
import org.openapitools.model.PinterestLibError
import org.openapitools.model.ProductCategoriesEngagementType
import org.openapitools.model.ProductCategoryDetailLookbackWindow
import org.openapitools.model.ProductCategoryDetails
import org.openapitools.model.ProductCategoryEnum
import org.openapitools.model.ProductCategoryRegion
import org.openapitools.model.TrendingProductCategory
import org.openapitools.model.VerticalProductCategory

class ProductCategoriesApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def trendsFeaturedTopicsList ( ProductCategoryRegion region, InterestsEnum interest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/trends/topics/featured"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (region == null) {
            throw new RuntimeException("missing required params region")
        }

        if (interest != null) {
            queryParams.put("interest", interest)
        }
        if (region != null) {
            queryParams.put("region", region)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    FeaturedTrend.class )

    }

    def trendsProductCategoriesDetailsList ( List<ProductCategoryEnum> productCategories, ProductCategoryRegion region, ProductCategoryDetailLookbackWindow lookbackWindow, ProductCategoriesEngagementType engagementType, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/trends/product_categories/details"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (productCategories == null) {
            throw new RuntimeException("missing required params productCategories")
        }
        // verify required params are set
        if (region == null) {
            throw new RuntimeException("missing required params region")
        }

        if (productCategories != null) {
            queryParams.put("product_categories", productCategories)
        }
        if (region != null) {
            queryParams.put("region", region)
        }
        if (lookbackWindow != null) {
            queryParams.put("lookback_window", lookbackWindow)
        }
        if (engagementType != null) {
            queryParams.put("engagement_type", engagementType)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    ProductCategoryDetails.class )

    }

    def trendsProductCategoriesTrendingList ( ProductCategoryRegion region, List<VerticalProductCategory> verticals, List<AgeTrendsBucket> ages, List<GenderBucket> genders, ProductCategoriesEngagementType engagementType, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/trends/product_categories/trending"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (region == null) {
            throw new RuntimeException("missing required params region")
        }

        if (region != null) {
            queryParams.put("region", region)
        }
        if (verticals != null) {
            queryParams.put("verticals", verticals)
        }
        if (ages != null) {
            queryParams.put("ages", ages)
        }
        if (genders != null) {
            queryParams.put("genders", genders)
        }
        if (engagementType != null) {
            queryParams.put("engagement_type", engagementType)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    TrendingProductCategory.class )

    }

}
