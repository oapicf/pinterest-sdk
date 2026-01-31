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

import com.google.inject.Inject;
import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import play.mvc.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import openapitools.OpenAPIUtils;
import openapitools.SecurityAPIUtils;
import static play.mvc.Results.ok;
import static play.mvc.Results.unauthorized;
import play.libs.Files.TemporaryFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

@SuppressWarnings("RedundantThrows")
public abstract class ProductCategoriesApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result trendsFeaturedTopicsListHttp(Http.Request request, @NotNull ProductCategoryRegion region, InterestsEnum interest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        List<FeaturedTrend> obj = trendsFeaturedTopicsList(request, region, interest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (FeaturedTrend curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<FeaturedTrend> trendsFeaturedTopicsList(Http.Request request, @NotNull ProductCategoryRegion region, InterestsEnum interest) throws Exception;

    public Result trendsProductCategoriesDetailsListHttp(Http.Request request, @NotNull  @Size(min=1,max=20)List<ProductCategoryEnum> productCategories, @NotNull ProductCategoryRegion region, ProductCategoryDetailLookbackWindow lookbackWindow, ProductCategoriesEngagementType engagementType) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        List<ProductCategoryDetails> obj = trendsProductCategoriesDetailsList(request, productCategories, region, lookbackWindow, engagementType);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (ProductCategoryDetails curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<ProductCategoryDetails> trendsProductCategoriesDetailsList(Http.Request request, @NotNull  @Size(min=1,max=20)List<ProductCategoryEnum> productCategories, @NotNull ProductCategoryRegion region, ProductCategoryDetailLookbackWindow lookbackWindow, ProductCategoriesEngagementType engagementType) throws Exception;

    public Result trendsProductCategoriesTrendingListHttp(Http.Request request, @NotNull ProductCategoryRegion region, List<VerticalProductCategory> verticals, List<AgeTrendsBucket> ages, List<GenderBucket> genders, ProductCategoriesEngagementType engagementType) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        List<TrendingProductCategory> obj = trendsProductCategoriesTrendingList(request, region, verticals, ages, genders, engagementType);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (TrendingProductCategory curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<TrendingProductCategory> trendsProductCategoriesTrendingList(Http.Request request, @NotNull ProductCategoryRegion region, List<VerticalProductCategory> verticals, List<AgeTrendsBucket> ages, List<GenderBucket> genders, ProductCategoriesEngagementType engagementType) throws Exception;

}
