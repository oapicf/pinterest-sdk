package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.CustomerSegment;
import org.openapitools.vertxweb.server.model.CustomerSegmentCreate;
import org.openapitools.vertxweb.server.model.CustomerSegmentList200Response;
import org.openapitools.vertxweb.server.model.CustomerSegmentUpdateRequestUpdateWithRequiredBody;
import org.openapitools.vertxweb.server.model.PinterestLibError;
import org.openapitools.vertxweb.server.model.PinterestLibPaginationOrder;

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

public class CustomerSegmentApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(CustomerSegmentApiHandler.class);

    private final CustomerSegmentApi api;

    public CustomerSegmentApiHandler(CustomerSegmentApi api) {
        this.api = api;
    }

    @Deprecated
    public CustomerSegmentApiHandler() {
        this(new CustomerSegmentApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("customerSegmentCreate").handler(this::customerSegmentCreate);
        builder.operation("customerSegmentList").handler(this::customerSegmentList);
        builder.operation("customerSegmentUpdate").handler(this::customerSegmentUpdate);
    }

    private void customerSegmentCreate(RoutingContext routingContext) {
        logger.info("customerSegmentCreate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        RequestParameter body = requestParameters.body();
        CustomerSegmentCreate customerSegmentCreate = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<CustomerSegmentCreate>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter customerSegmentCreate is {}", customerSegmentCreate);

        api.customerSegmentCreate(adAccountId, customerSegmentCreate)
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

    private void customerSegmentList(RoutingContext routingContext) {
        logger.info("customerSegmentList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;
        PinterestLibPaginationOrder order = requestParameters.queryParameter("order") != null ? requestParameters.queryParameter("order").getPinterestLibPaginationOrder() : null;
        Boolean includeSizing = requestParameters.queryParameter("include_sizing") != null ? requestParameters.queryParameter("include_sizing").getBoolean() : false;
        String searchQuery = requestParameters.queryParameter("search_query") != null ? requestParameters.queryParameter("search_query").getString() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter pageSize is {}", pageSize);
        logger.debug("Parameter order is {}", order);
        logger.debug("Parameter includeSizing is {}", includeSizing);
        logger.debug("Parameter searchQuery is {}", searchQuery);

        api.customerSegmentList(adAccountId, bookmark, pageSize, order, includeSizing, searchQuery)
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

    private void customerSegmentUpdate(RoutingContext routingContext) {
        logger.info("customerSegmentUpdate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        RequestParameter body = requestParameters.body();
        CustomerSegmentUpdateRequestUpdateWithRequiredBody customerSegmentUpdateRequestUpdateWithRequiredBody = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<CustomerSegmentUpdateRequestUpdateWithRequiredBody>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter customerSegmentUpdateRequestUpdateWithRequiredBody is {}", customerSegmentUpdateRequestUpdateWithRequiredBody);

        api.customerSegmentUpdate(adAccountId, customerSegmentUpdateRequestUpdateWithRequiredBody)
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
