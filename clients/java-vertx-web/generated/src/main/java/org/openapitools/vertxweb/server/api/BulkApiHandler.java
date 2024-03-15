package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.BulkDownloadRequest;
import org.openapitools.vertxweb.server.model.BulkDownloadResponse;
import org.openapitools.vertxweb.server.model.BulkUpsertRequest;
import org.openapitools.vertxweb.server.model.BulkUpsertResponse;
import org.openapitools.vertxweb.server.model.BulkUpsertStatusResponse;
import org.openapitools.vertxweb.server.model.Error;

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

public class BulkApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(BulkApiHandler.class);

    private final BulkApi api;

    public BulkApiHandler(BulkApi api) {
        this.api = api;
    }

    @Deprecated
    public BulkApiHandler() {
        this(new BulkApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("bulkDownloadCreate").handler(this::bulkDownloadCreate);
        builder.operation("bulkRequestGet").handler(this::bulkRequestGet);
        builder.operation("bulkUpsertCreate").handler(this::bulkUpsertCreate);
    }

    private void bulkDownloadCreate(RoutingContext routingContext) {
        logger.info("bulkDownloadCreate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        RequestParameter body = requestParameters.body();
        BulkDownloadRequest bulkDownloadRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<BulkDownloadRequest>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter bulkDownloadRequest is {}", bulkDownloadRequest);

        api.bulkDownloadCreate(adAccountId, bulkDownloadRequest)
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

    private void bulkRequestGet(RoutingContext routingContext) {
        logger.info("bulkRequestGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        String bulkRequestId = requestParameters.pathParameter("bulk_request_id") != null ? requestParameters.pathParameter("bulk_request_id").getString() : null;
        Boolean includeDetails = requestParameters.queryParameter("include_details") != null ? requestParameters.queryParameter("include_details").getBoolean() : false;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter bulkRequestId is {}", bulkRequestId);
        logger.debug("Parameter includeDetails is {}", includeDetails);

        api.bulkRequestGet(adAccountId, bulkRequestId, includeDetails)
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

    private void bulkUpsertCreate(RoutingContext routingContext) {
        logger.info("bulkUpsertCreate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        RequestParameter body = requestParameters.body();
        BulkUpsertRequest bulkUpsertRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<BulkUpsertRequest>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter bulkUpsertRequest is {}", bulkUpsertRequest);

        api.bulkUpsertCreate(adAccountId, bulkUpsertRequest)
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
