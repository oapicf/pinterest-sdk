package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Audience;
import org.openapitools.vertxweb.server.model.AudienceCreateCustomRequest;
import org.openapitools.vertxweb.server.model.AudienceCreateRequest;
import org.openapitools.vertxweb.server.model.AudienceUpdateRequest;
import org.openapitools.vertxweb.server.model.AudiencesList200Response;
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

public class AudiencesApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(AudiencesApiHandler.class);

    private final AudiencesApi api;

    public AudiencesApiHandler(AudiencesApi api) {
        this.api = api;
    }

    @Deprecated
    public AudiencesApiHandler() {
        this(new AudiencesApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("audiencesCreate").handler(this::audiencesCreate);
        builder.operation("audiencesCreateCustom").handler(this::audiencesCreateCustom);
        builder.operation("audiencesGet").handler(this::audiencesGet);
        builder.operation("audiencesList").handler(this::audiencesList);
        builder.operation("audiencesUpdate").handler(this::audiencesUpdate);
    }

    private void audiencesCreate(RoutingContext routingContext) {
        logger.info("audiencesCreate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        RequestParameter body = requestParameters.body();
        AudienceCreateRequest audienceCreateRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<AudienceCreateRequest>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter audienceCreateRequest is {}", audienceCreateRequest);

        api.audiencesCreate(adAccountId, audienceCreateRequest)
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

    private void audiencesCreateCustom(RoutingContext routingContext) {
        logger.info("audiencesCreateCustom()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        RequestParameter body = requestParameters.body();
        AudienceCreateCustomRequest audienceCreateCustomRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<AudienceCreateCustomRequest>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter audienceCreateCustomRequest is {}", audienceCreateCustomRequest);

        api.audiencesCreateCustom(adAccountId, audienceCreateCustomRequest)
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

    private void audiencesGet(RoutingContext routingContext) {
        logger.info("audiencesGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        String audienceId = requestParameters.pathParameter("audience_id") != null ? requestParameters.pathParameter("audience_id").getString() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter audienceId is {}", audienceId);

        api.audiencesGet(adAccountId, audienceId)
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

    private void audiencesList(RoutingContext routingContext) {
        logger.info("audiencesList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        String order = requestParameters.queryParameter("order") != null ? requestParameters.queryParameter("order").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;
        String ownershipType = requestParameters.queryParameter("ownership_type") != null ? requestParameters.queryParameter("ownership_type").getString() : "OWNED";

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter order is {}", order);
        logger.debug("Parameter pageSize is {}", pageSize);
        logger.debug("Parameter ownershipType is {}", ownershipType);

        api.audiencesList(adAccountId, bookmark, order, pageSize, ownershipType)
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

    private void audiencesUpdate(RoutingContext routingContext) {
        logger.info("audiencesUpdate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        String audienceId = requestParameters.pathParameter("audience_id") != null ? requestParameters.pathParameter("audience_id").getString() : null;
        RequestParameter body = requestParameters.body();
        AudienceUpdateRequest audienceUpdateRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<AudienceUpdateRequest>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter audienceId is {}", audienceId);
        logger.debug("Parameter audienceUpdateRequest is {}", audienceUpdateRequest);

        api.audiencesUpdate(adAccountId, audienceId, audienceUpdateRequest)
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
