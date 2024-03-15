package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.RelatedTerms;

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

public class TermsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(TermsApiHandler.class);

    private final TermsApi api;

    public TermsApiHandler(TermsApi api) {
        this.api = api;
    }

    @Deprecated
    public TermsApiHandler() {
        this(new TermsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("termsRelatedList").handler(this::termsRelatedList);
        builder.operation("termsSuggestedList").handler(this::termsSuggestedList);
    }

    private void termsRelatedList(RoutingContext routingContext) {
        logger.info("termsRelatedList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        List<String> terms = requestParameters.queryParameter("terms") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("terms").get(), new TypeReference<List<String>>(){}) : null;

        logger.debug("Parameter terms is {}", terms);

        api.termsRelatedList(terms)
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

    private void termsSuggestedList(RoutingContext routingContext) {
        logger.info("termsSuggestedList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String term = requestParameters.queryParameter("term") != null ? requestParameters.queryParameter("term").getString() : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : 4;

        logger.debug("Parameter term is {}", term);
        logger.debug("Parameter limit is {}", limit);

        api.termsSuggestedList(term, limit)
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
