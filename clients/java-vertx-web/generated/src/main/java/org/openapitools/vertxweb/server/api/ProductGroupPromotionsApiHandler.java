package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.Granularity;
import java.time.LocalDate;
import org.openapitools.vertxweb.server.model.ProductGroupAnalyticsResponseInner;
import org.openapitools.vertxweb.server.model.ProductGroupPromotionCreateRequest;
import org.openapitools.vertxweb.server.model.ProductGroupPromotionResponse;
import org.openapitools.vertxweb.server.model.ProductGroupPromotionUpdateRequest;
import org.openapitools.vertxweb.server.model.ProductGroupPromotionsList200Response;

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

public class ProductGroupPromotionsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(ProductGroupPromotionsApiHandler.class);

    private final ProductGroupPromotionsApi api;

    public ProductGroupPromotionsApiHandler(ProductGroupPromotionsApi api) {
        this.api = api;
    }

    @Deprecated
    public ProductGroupPromotionsApiHandler() {
        this(new ProductGroupPromotionsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("productGroupPromotionsCreate").handler(this::productGroupPromotionsCreate);
        builder.operation("productGroupPromotionsGet").handler(this::productGroupPromotionsGet);
        builder.operation("productGroupPromotionsList").handler(this::productGroupPromotionsList);
        builder.operation("productGroupPromotionsUpdate").handler(this::productGroupPromotionsUpdate);
        builder.operation("productGroupsAnalytics").handler(this::productGroupsAnalytics);
    }

    private void productGroupPromotionsCreate(RoutingContext routingContext) {
        logger.info("productGroupPromotionsCreate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        RequestParameter body = requestParameters.body();
        ProductGroupPromotionCreateRequest productGroupPromotionCreateRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<ProductGroupPromotionCreateRequest>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter productGroupPromotionCreateRequest is {}", productGroupPromotionCreateRequest);

        api.productGroupPromotionsCreate(adAccountId, productGroupPromotionCreateRequest)
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

    private void productGroupPromotionsGet(RoutingContext routingContext) {
        logger.info("productGroupPromotionsGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        String productGroupPromotionId = requestParameters.pathParameter("product_group_promotion_id") != null ? requestParameters.pathParameter("product_group_promotion_id").getString() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter productGroupPromotionId is {}", productGroupPromotionId);

        api.productGroupPromotionsGet(adAccountId, productGroupPromotionId)
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

    private void productGroupPromotionsList(RoutingContext routingContext) {
        logger.info("productGroupPromotionsList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        List<String> productGroupPromotionIds = requestParameters.queryParameter("product_group_promotion_ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("product_group_promotion_ids").get(), new TypeReference<List<String>>(){}) : null;
        List<String> entityStatuses = requestParameters.queryParameter("entity_statuses") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("entity_statuses").get(), new TypeReference<List<String>>(){}) : null;
        String adGroupId = requestParameters.queryParameter("ad_group_id") != null ? requestParameters.queryParameter("ad_group_id").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;
        String order = requestParameters.queryParameter("order") != null ? requestParameters.queryParameter("order").getString() : null;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter productGroupPromotionIds is {}", productGroupPromotionIds);
        logger.debug("Parameter entityStatuses is {}", entityStatuses);
        logger.debug("Parameter adGroupId is {}", adGroupId);
        logger.debug("Parameter pageSize is {}", pageSize);
        logger.debug("Parameter order is {}", order);
        logger.debug("Parameter bookmark is {}", bookmark);

        api.productGroupPromotionsList(adAccountId, productGroupPromotionIds, entityStatuses, adGroupId, pageSize, order, bookmark)
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

    private void productGroupPromotionsUpdate(RoutingContext routingContext) {
        logger.info("productGroupPromotionsUpdate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        RequestParameter body = requestParameters.body();
        ProductGroupPromotionUpdateRequest productGroupPromotionUpdateRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<ProductGroupPromotionUpdateRequest>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter productGroupPromotionUpdateRequest is {}", productGroupPromotionUpdateRequest);

        api.productGroupPromotionsUpdate(adAccountId, productGroupPromotionUpdateRequest)
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

    private void productGroupsAnalytics(RoutingContext routingContext) {
        logger.info("productGroupsAnalytics()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        LocalDate startDate = requestParameters.queryParameter("start_date") != null ? requestParameters.queryParameter("start_date").getLocalDate() : null;
        LocalDate endDate = requestParameters.queryParameter("end_date") != null ? requestParameters.queryParameter("end_date").getLocalDate() : null;
        List<String> productGroupIds = requestParameters.queryParameter("product_group_ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("product_group_ids").get(), new TypeReference<List<String>>(){}) : null;
        List<String> columns = requestParameters.queryParameter("columns") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("columns").get(), new TypeReference<List<String>>(){}) : null;
        Granularity granularity = requestParameters.queryParameter("granularity") != null ? requestParameters.queryParameter("granularity").getGranularity() : null;
        Integer clickWindowDays = requestParameters.queryParameter("click_window_days") != null ? requestParameters.queryParameter("click_window_days").getInteger() : 30;
        Integer engagementWindowDays = requestParameters.queryParameter("engagement_window_days") != null ? requestParameters.queryParameter("engagement_window_days").getInteger() : 30;
        Integer viewWindowDays = requestParameters.queryParameter("view_window_days") != null ? requestParameters.queryParameter("view_window_days").getInteger() : 1;
        String conversionReportTime = requestParameters.queryParameter("conversion_report_time") != null ? requestParameters.queryParameter("conversion_report_time").getString() : "TIME_OF_AD_ACTION";

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter startDate is {}", startDate);
        logger.debug("Parameter endDate is {}", endDate);
        logger.debug("Parameter productGroupIds is {}", productGroupIds);
        logger.debug("Parameter columns is {}", columns);
        logger.debug("Parameter granularity is {}", granularity);
        logger.debug("Parameter clickWindowDays is {}", clickWindowDays);
        logger.debug("Parameter engagementWindowDays is {}", engagementWindowDays);
        logger.debug("Parameter viewWindowDays is {}", viewWindowDays);
        logger.debug("Parameter conversionReportTime is {}", conversionReportTime);

        api.productGroupsAnalytics(adAccountId, startDate, endDate, productGroupIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime)
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
