package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.CatalogsFeed;
import org.openapitools.vertxweb.server.model.CatalogsFeedIngestion;
import org.openapitools.vertxweb.server.model.CatalogsItemValidationIssue;
import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.FeedProcessingResultsList200Response;
import org.openapitools.vertxweb.server.model.FeedsCreateRequest;
import org.openapitools.vertxweb.server.model.FeedsList200Response;
import org.openapitools.vertxweb.server.model.FeedsUpdateRequest;
import org.openapitools.vertxweb.server.model.ItemsIssuesList200Response;

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

public class CatalogFeedsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(CatalogFeedsApiHandler.class);

    private final CatalogFeedsApi api;

    public CatalogFeedsApiHandler(CatalogFeedsApi api) {
        this.api = api;
    }

    @Deprecated
    public CatalogFeedsApiHandler() {
        this(new CatalogFeedsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("feedProcessingResultsList").handler(this::feedProcessingResultsList);
        builder.operation("feedsCreate").handler(this::feedsCreate);
        builder.operation("feedsDelete").handler(this::feedsDelete);
        builder.operation("feedsGet").handler(this::feedsGet);
        builder.operation("feedsIngest").handler(this::feedsIngest);
        builder.operation("feedsList").handler(this::feedsList);
        builder.operation("feedsUpdate").handler(this::feedsUpdate);
        builder.operation("itemsIssuesList").handler(this::itemsIssuesList);
    }

    private void feedProcessingResultsList(RoutingContext routingContext) {
        logger.info("feedProcessingResultsList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String feedId = requestParameters.pathParameter("feed_id") != null ? requestParameters.pathParameter("feed_id").getString() : null;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;

        logger.debug("Parameter feedId is {}", feedId);
        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter pageSize is {}", pageSize);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.feedProcessingResultsList(feedId, bookmark, pageSize, adAccountId)
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

    private void feedsCreate(RoutingContext routingContext) {
        logger.info("feedsCreate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        FeedsCreateRequest feedsCreateRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<FeedsCreateRequest>(){}) : null;
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;

        logger.debug("Parameter feedsCreateRequest is {}", feedsCreateRequest);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.feedsCreate(feedsCreateRequest, adAccountId)
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

    private void feedsDelete(RoutingContext routingContext) {
        logger.info("feedsDelete()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String feedId = requestParameters.pathParameter("feed_id") != null ? requestParameters.pathParameter("feed_id").getString() : null;
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;

        logger.debug("Parameter feedId is {}", feedId);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.feedsDelete(feedId, adAccountId)
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

    private void feedsGet(RoutingContext routingContext) {
        logger.info("feedsGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String feedId = requestParameters.pathParameter("feed_id") != null ? requestParameters.pathParameter("feed_id").getString() : null;
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;

        logger.debug("Parameter feedId is {}", feedId);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.feedsGet(feedId, adAccountId)
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

    private void feedsIngest(RoutingContext routingContext) {
        logger.info("feedsIngest()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String feedId = requestParameters.pathParameter("feed_id") != null ? requestParameters.pathParameter("feed_id").getString() : null;
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;

        logger.debug("Parameter feedId is {}", feedId);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.feedsIngest(feedId, adAccountId)
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

    private void feedsList(RoutingContext routingContext) {
        logger.info("feedsList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;
        String catalogId = requestParameters.queryParameter("catalog_id") != null ? requestParameters.queryParameter("catalog_id").getString() : null;
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;

        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter pageSize is {}", pageSize);
        logger.debug("Parameter catalogId is {}", catalogId);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.feedsList(bookmark, pageSize, catalogId, adAccountId)
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

    private void feedsUpdate(RoutingContext routingContext) {
        logger.info("feedsUpdate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String feedId = requestParameters.pathParameter("feed_id") != null ? requestParameters.pathParameter("feed_id").getString() : null;
        RequestParameter body = requestParameters.body();
        FeedsUpdateRequest feedsUpdateRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<FeedsUpdateRequest>(){}) : null;
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;

        logger.debug("Parameter feedId is {}", feedId);
        logger.debug("Parameter feedsUpdateRequest is {}", feedsUpdateRequest);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.feedsUpdate(feedId, feedsUpdateRequest, adAccountId)
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

    private void itemsIssuesList(RoutingContext routingContext) {
        logger.info("itemsIssuesList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String processingResultId = requestParameters.pathParameter("processing_result_id") != null ? requestParameters.pathParameter("processing_result_id").getString() : null;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;
        List<Integer> itemNumbers = requestParameters.queryParameter("item_numbers") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("item_numbers").get(), new TypeReference<List<Integer>>(){}) : null;
        CatalogsItemValidationIssue itemValidationIssue = requestParameters.queryParameter("item_validation_issue") != null ? requestParameters.queryParameter("item_validation_issue").getCatalogsItemValidationIssue() : null;
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;

        logger.debug("Parameter processingResultId is {}", processingResultId);
        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter pageSize is {}", pageSize);
        logger.debug("Parameter itemNumbers is {}", itemNumbers);
        logger.debug("Parameter itemValidationIssue is {}", itemValidationIssue);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.itemsIssuesList(processingResultId, bookmark, pageSize, itemNumbers, itemValidationIssue, adAccountId)
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
