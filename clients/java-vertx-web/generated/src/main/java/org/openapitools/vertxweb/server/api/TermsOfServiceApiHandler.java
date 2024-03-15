package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.TermsOfService;

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

public class TermsOfServiceApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(TermsOfServiceApiHandler.class);

    private final TermsOfServiceApi api;

    public TermsOfServiceApiHandler(TermsOfServiceApi api) {
        this.api = api;
    }

    @Deprecated
    public TermsOfServiceApiHandler() {
        this(new TermsOfServiceApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("termsOfServiceGet").handler(this::termsOfServiceGet);
    }

    private void termsOfServiceGet(RoutingContext routingContext) {
        logger.info("termsOfServiceGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        Boolean includeHtml = requestParameters.queryParameter("include_html") != null ? requestParameters.queryParameter("include_html").getBoolean() : false;
        String tosType = requestParameters.queryParameter("tos_type") != null ? requestParameters.queryParameter("tos_type").getString() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter includeHtml is {}", includeHtml);
        logger.debug("Parameter tosType is {}", tosType);

        api.termsOfServiceGet(adAccountId, includeHtml, tosType)
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
