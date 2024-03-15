package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.PinsList200Response;
import org.openapitools.vertxweb.server.model.SearchPartnerPins200Response;
import org.openapitools.vertxweb.server.model.SearchUserBoardsGet200Response;

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

public class SearchApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(SearchApiHandler.class);

    private final SearchApi api;

    public SearchApiHandler(SearchApi api) {
        this.api = api;
    }

    @Deprecated
    public SearchApiHandler() {
        this(new SearchApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("searchPartnerPins").handler(this::searchPartnerPins);
        builder.operation("searchUserBoardsGet").handler(this::searchUserBoardsGet);
        builder.operation("searchUserPinsList").handler(this::searchUserPinsList);
    }

    private void searchPartnerPins(RoutingContext routingContext) {
        logger.info("searchPartnerPins()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String term = requestParameters.queryParameter("term") != null ? requestParameters.queryParameter("term").getString() : null;
        String countryCode = requestParameters.queryParameter("country_code") != null ? requestParameters.queryParameter("country_code").getString() : null;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        String locale = requestParameters.queryParameter("locale") != null ? requestParameters.queryParameter("locale").getString() : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : 10;

        logger.debug("Parameter term is {}", term);
        logger.debug("Parameter countryCode is {}", countryCode);
        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter locale is {}", locale);
        logger.debug("Parameter limit is {}", limit);

        api.searchPartnerPins(term, countryCode, bookmark, locale, limit)
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

    private void searchUserBoardsGet(RoutingContext routingContext) {
        logger.info("searchUserBoardsGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;
        String query = requestParameters.queryParameter("query") != null ? requestParameters.queryParameter("query").getString() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter pageSize is {}", pageSize);
        logger.debug("Parameter query is {}", query);

        api.searchUserBoardsGet(adAccountId, bookmark, pageSize, query)
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

    private void searchUserPinsList(RoutingContext routingContext) {
        logger.info("searchUserPinsList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String query = requestParameters.queryParameter("query") != null ? requestParameters.queryParameter("query").getString() : null;
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;

        logger.debug("Parameter query is {}", query);
        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter bookmark is {}", bookmark);

        api.searchUserPinsList(query, adAccountId, bookmark)
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
