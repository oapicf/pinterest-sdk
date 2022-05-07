package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Account;
import org.openapitools.vertxweb.server.model.AnalyticsMetricsResponse;
import org.openapitools.vertxweb.server.model.Error;
import java.time.LocalDate;

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

public class UserAccountApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(UserAccountApiHandler.class);

    private final UserAccountApi api;

    public UserAccountApiHandler(UserAccountApi api) {
        this.api = api;
    }

    @Deprecated
    public UserAccountApiHandler() {
        this(new UserAccountApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("userAccountAnalytics").handler(this::userAccountAnalytics);
        builder.operation("userAccountGet").handler(this::userAccountGet);
    }

    private void userAccountAnalytics(RoutingContext routingContext) {
        logger.info("userAccountAnalytics()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        LocalDate startDate = requestParameters.queryParameter("start_date") != null ? requestParameters.queryParameter("start_date").getLocalDate() : null;
        LocalDate endDate = requestParameters.queryParameter("end_date") != null ? requestParameters.queryParameter("end_date").getLocalDate() : null;
        String fromClaimedContent = requestParameters.queryParameter("from_claimed_content") != null ? requestParameters.queryParameter("from_claimed_content").getString() : null;
        String pinFormat = requestParameters.queryParameter("pin_format") != null ? requestParameters.queryParameter("pin_format").getString() : null;
        String appTypes = requestParameters.queryParameter("app_types") != null ? requestParameters.queryParameter("app_types").getString() : null;
        List<String> metricTypes = requestParameters.queryParameter("metric_types") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("metric_types").get(), new TypeReference<List<String>>(){}) : null;
        String splitField = requestParameters.queryParameter("split_field") != null ? requestParameters.queryParameter("split_field").getString() : null;
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;

        logger.debug("Parameter startDate is {}", startDate);
        logger.debug("Parameter endDate is {}", endDate);
        logger.debug("Parameter fromClaimedContent is {}", fromClaimedContent);
        logger.debug("Parameter pinFormat is {}", pinFormat);
        logger.debug("Parameter appTypes is {}", appTypes);
        logger.debug("Parameter metricTypes is {}", metricTypes);
        logger.debug("Parameter splitField is {}", splitField);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.userAccountAnalytics(startDate, endDate, fromClaimedContent, pinFormat, appTypes, metricTypes, splitField, adAccountId)
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

    private void userAccountGet(RoutingContext routingContext) {
        logger.info("userAccountGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.userAccountGet(adAccountId)
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
