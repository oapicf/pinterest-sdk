package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.EventQualityScore;
import org.openapitools.vertxweb.server.model.IngestionSourceOptions;
import org.openapitools.vertxweb.server.model.LookbackPeriodOptions;
import org.openapitools.vertxweb.server.model.PinterestLibError;
import org.openapitools.vertxweb.server.model.SourcePlatformOptions;

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

public class ConversionEqsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(ConversionEqsApiHandler.class);

    private final ConversionEqsApi api;

    public ConversionEqsApiHandler(ConversionEqsApi api) {
        this.api = api;
    }

    @Deprecated
    public ConversionEqsApiHandler() {
        this(new ConversionEqsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("conversionEqsList").handler(this::conversionEqsList);
    }

    private void conversionEqsList(RoutingContext routingContext) {
        logger.info("conversionEqsList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        LookbackPeriodOptions lookbackPeriod = requestParameters.queryParameter("lookback_period") != null ? requestParameters.queryParameter("lookback_period").getLookbackPeriodOptions() : null;
        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        SourcePlatformOptions sourcePlatform = requestParameters.queryParameter("source_platform") != null ? requestParameters.queryParameter("source_platform").getSourcePlatformOptions() : null;
        IngestionSourceOptions ingestionSource = requestParameters.queryParameter("ingestion_source") != null ? requestParameters.queryParameter("ingestion_source").getIngestionSourceOptions() : null;

        logger.debug("Parameter lookbackPeriod is {}", lookbackPeriod);
        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter sourcePlatform is {}", sourcePlatform);
        logger.debug("Parameter ingestionSource is {}", ingestionSource);

        api.conversionEqsList(lookbackPeriod, adAccountId, sourcePlatform, ingestionSource)
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
