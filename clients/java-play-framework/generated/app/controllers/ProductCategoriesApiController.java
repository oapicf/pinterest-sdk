package controllers;

import apimodels.AgeTrendsBucket;
import apimodels.FeaturedTrend;
import apimodels.GenderBucket;
import apimodels.InterestsEnum;
import apimodels.PinterestLibError;
import apimodels.ProductCategoriesEngagementType;
import apimodels.ProductCategoryDetailLookbackWindow;
import apimodels.ProductCategoryDetails;
import apimodels.ProductCategoryEnum;
import apimodels.ProductCategoryRegion;
import apimodels.TrendingProductCategory;
import apimodels.VerticalProductCategory;

import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import play.libs.Files.TemporaryFile;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import javax.validation.Valid;
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-31T04:53:01.455950794Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ProductCategoriesApiController extends Controller {
    private final ProductCategoriesApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private ProductCategoriesApiController(Config configuration, ProductCategoriesApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result trendsFeaturedTopicsList(Http.Request request) throws Exception {
        String valueinterest = request.getQueryString("interest");
        InterestsEnum interest;
        if (valueinterest != null) {
            interest = valueinterest;
        } else {
            interest = null;
        }
        String valueregion = request.getQueryString("region");
        ProductCategoryRegion region;
        if (valueregion != null) {
            region = valueregion;
        } else {
            throw new IllegalArgumentException("'region' parameter is required");
        }
        return imp.trendsFeaturedTopicsListHttp(request, region, interest);
    }

    @ApiAction
    public Result trendsProductCategoriesDetailsList(Http.Request request) throws Exception {
        String[] productCategoriesArray = request.queryString().get("product_categories");
        if (productCategoriesArray == null) {
            throw new IllegalArgumentException("'product_categories' parameter is required");
        }
        List<String> productCategoriesList = OpenAPIUtils.parametersToList("multi", productCategoriesArray);
        List<ProductCategoryEnum> productCategories = new ArrayList<>();
        for (String curParam : productCategoriesList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                productCategories.add(curParam);
            }
        }
        String valueregion = request.getQueryString("region");
        ProductCategoryRegion region;
        if (valueregion != null) {
            region = valueregion;
        } else {
            throw new IllegalArgumentException("'region' parameter is required");
        }
        String valuelookbackWindow = request.getQueryString("lookback_window");
        ProductCategoryDetailLookbackWindow lookbackWindow;
        if (valuelookbackWindow != null) {
            lookbackWindow = valuelookbackWindow;
        } else {
            lookbackWindow = null;
        }
        String valueengagementType = request.getQueryString("engagement_type");
        ProductCategoriesEngagementType engagementType;
        if (valueengagementType != null) {
            engagementType = valueengagementType;
        } else {
            engagementType = null;
        }
        return imp.trendsProductCategoriesDetailsListHttp(request, productCategories, region, lookbackWindow, engagementType);
    }

    @ApiAction
    public Result trendsProductCategoriesTrendingList(Http.Request request) throws Exception {
        String valueregion = request.getQueryString("region");
        ProductCategoryRegion region;
        if (valueregion != null) {
            region = valueregion;
        } else {
            throw new IllegalArgumentException("'region' parameter is required");
        }
        String[] verticalsArray = request.queryString().get("verticals");
        List<String> verticalsList = OpenAPIUtils.parametersToList("multi", verticalsArray);
        List<VerticalProductCategory> verticals = new ArrayList<>();
        for (String curParam : verticalsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                verticals.add(curParam);
            }
        }
        String[] agesArray = request.queryString().get("ages");
        List<String> agesList = OpenAPIUtils.parametersToList("multi", agesArray);
        List<AgeTrendsBucket> ages = new ArrayList<>();
        for (String curParam : agesList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                ages.add(curParam);
            }
        }
        String[] gendersArray = request.queryString().get("genders");
        List<String> gendersList = OpenAPIUtils.parametersToList("multi", gendersArray);
        List<GenderBucket> genders = new ArrayList<>();
        for (String curParam : gendersList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                genders.add(curParam);
            }
        }
        String valueengagementType = request.getQueryString("engagement_type");
        ProductCategoriesEngagementType engagementType;
        if (valueengagementType != null) {
            engagementType = valueengagementType;
        } else {
            engagementType = null;
        }
        return imp.trendsProductCategoriesTrendingListHttp(request, region, verticals, ages, genders, engagementType);
    }

}
