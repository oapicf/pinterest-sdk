package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.LabelCreateRequest;
import org.openapitools.vertxweb.server.model.LabelUpdateRequest;
import org.openapitools.vertxweb.server.model.LabelsList200Response;
import org.openapitools.vertxweb.server.model.LabelsResponse;

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

public class LabelsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(LabelsApiHandler.class);

    private final LabelsApi api;

    public LabelsApiHandler(LabelsApi api) {
        this.api = api;
    }

    @Deprecated
    public LabelsApiHandler() {
        this(new LabelsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("labelsCreate").handler(this::labelsCreate);
        builder.operation("labelsList").handler(this::labelsList);
        builder.operation("labelsUpdate").handler(this::labelsUpdate);
    }

    private void labelsCreate(RoutingContext routingContext) {
        logger.info("labelsCreate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        RequestParameter body = requestParameters.body();
        LabelCreateRequest labelCreateRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<LabelCreateRequest>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter labelCreateRequest is {}", labelCreateRequest);

        api.labelsCreate(adAccountId, labelCreateRequest)
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

    private void labelsList(RoutingContext routingContext) {
        logger.info("labelsList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        List<String> campaignIds = requestParameters.queryParameter("campaign_ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("campaign_ids").get(), new TypeReference<List<String>>(){}) : null;
        List<String> labelIds = requestParameters.queryParameter("label_ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("label_ids").get(), new TypeReference<List<String>>(){}) : null;
        List<String> entityStatuses = requestParameters.queryParameter("entity_statuses") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("entity_statuses").get(), new TypeReference<List<String>>(){}) : null;
        List<String> labelTypes = requestParameters.queryParameter("label_types") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("label_types").get(), new TypeReference<List<String>>(){}) : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter campaignIds is {}", campaignIds);
        logger.debug("Parameter labelIds is {}", labelIds);
        logger.debug("Parameter entityStatuses is {}", entityStatuses);
        logger.debug("Parameter labelTypes is {}", labelTypes);
        logger.debug("Parameter pageSize is {}", pageSize);
        logger.debug("Parameter bookmark is {}", bookmark);

        api.labelsList(adAccountId, campaignIds, labelIds, entityStatuses, labelTypes, pageSize, bookmark)
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

    private void labelsUpdate(RoutingContext routingContext) {
        logger.info("labelsUpdate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        RequestParameter body = requestParameters.body();
        LabelUpdateRequest labelUpdateRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<LabelUpdateRequest>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter labelUpdateRequest is {}", labelUpdateRequest);

        api.labelsUpdate(adAccountId, labelUpdateRequest)
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
