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

import com.fasterxml.jackson.core.type.TypeReference;
import io.vertx.core.json.jackson.DatabindCodec;
import io.vertx.ext.web.openapi.RouterBuilder;
import io.vertx.ext.web.validation.RequestParameters;
import io.vertx.ext.web.validation.RequestParameter;
import io.vertx.ext.web.validation.ValidationHandler;
import io.vertx.ext.web.RoutingContext;
import io.vertx.core.json.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

public class TrendsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(TrendsApiHandler.class);

    private final TrendsApi api;

    public TrendsApiHandler(TrendsApi api) {
        this.api = api;
    }

    @Deprecated
    public TrendsApiHandler() {
        this(new TrendsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("trendsEditorialArticlesList").handler(this::trendsEditorialArticlesList);
        builder.operation("trendsFeaturedTopicsList").handler(this::trendsFeaturedTopicsList);
        builder.operation("trendsProductCategoriesDetailsList").handler(this::trendsProductCategoriesDetailsList);
        builder.operation("trendsProductCategoriesTrendingList").handler(this::trendsProductCategoriesTrendingList);
    }

    private void trendsEditorialArticlesList(RoutingContext routingContext) {
        logger.info("trendsEditorialArticlesList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        ProductCategoryRegion region = requestParameters.queryParameter("region") != null ? requestParameters.queryParameter("region").getProductCategoryRegion() : null;

        logger.debug("Parameter region is {}", region);

        api.trendsEditorialArticlesList(region)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void trendsFeaturedTopicsList(RoutingContext routingContext) {
        logger.info("trendsFeaturedTopicsList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        ProductCategoryRegion region = requestParameters.queryParameter("region") != null ? requestParameters.queryParameter("region").getProductCategoryRegion() : null;
        InterestsEnum interest = requestParameters.queryParameter("interest") != null ? requestParameters.queryParameter("interest").getInterestsEnum() : null;

        logger.debug("Parameter region is {}", region);
        logger.debug("Parameter interest is {}", interest);

        api.trendsFeaturedTopicsList(region, interest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void trendsProductCategoriesDetailsList(RoutingContext routingContext) {
        logger.info("trendsProductCategoriesDetailsList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        List<ProductCategoryEnum> productCategories = requestParameters.queryParameter("product_categories") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("product_categories").get(), new TypeReference<List<ProductCategoryEnum>>(){}) : null;
        ProductCategoryRegion region = requestParameters.queryParameter("region") != null ? requestParameters.queryParameter("region").getProductCategoryRegion() : null;
        ProductCategoryDetailLookbackWindow lookbackWindow = requestParameters.queryParameter("lookback_window") != null ? requestParameters.queryParameter("lookback_window").getProductCategoryDetailLookbackWindow() : null;
        ProductCategoriesEngagementType engagementType = requestParameters.queryParameter("engagement_type") != null ? requestParameters.queryParameter("engagement_type").getProductCategoriesEngagementType() : null;

        logger.debug("Parameter productCategories is {}", productCategories);
        logger.debug("Parameter region is {}", region);
        logger.debug("Parameter lookbackWindow is {}", lookbackWindow);
        logger.debug("Parameter engagementType is {}", engagementType);

        api.trendsProductCategoriesDetailsList(productCategories, region, lookbackWindow, engagementType)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void trendsProductCategoriesTrendingList(RoutingContext routingContext) {
        logger.info("trendsProductCategoriesTrendingList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        ProductCategoryRegion region = requestParameters.queryParameter("region") != null ? requestParameters.queryParameter("region").getProductCategoryRegion() : null;
        List<VerticalProductCategory> verticals = requestParameters.queryParameter("verticals") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("verticals").get(), new TypeReference<List<VerticalProductCategory>>(){}) : null;
        List<AgeTrendsBucket> ages = requestParameters.queryParameter("ages") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("ages").get(), new TypeReference<List<AgeTrendsBucket>>(){}) : null;
        List<GenderBucket> genders = requestParameters.queryParameter("genders") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("genders").get(), new TypeReference<List<GenderBucket>>(){}) : null;
        ProductCategoriesEngagementType engagementType = requestParameters.queryParameter("engagement_type") != null ? requestParameters.queryParameter("engagement_type").getProductCategoriesEngagementType() : null;

        logger.debug("Parameter region is {}", region);
        logger.debug("Parameter verticals is {}", verticals);
        logger.debug("Parameter ages is {}", ages);
        logger.debug("Parameter genders is {}", genders);
        logger.debug("Parameter engagementType is {}", engagementType);

        api.trendsProductCategoriesTrendingList(region, verticals, ages, genders, engagementType)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

}
