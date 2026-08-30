package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.OrderLine;
import org.openapitools.vertxweb.server.model.OrderLinesList200Response;
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

public class OrderLinesApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(OrderLinesApiHandler.class);

    private final OrderLinesApi api;

    public OrderLinesApiHandler(OrderLinesApi api) {
        this.api = api;
    }

    @Deprecated
    public OrderLinesApiHandler() {
        this(new OrderLinesApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("orderLinesGet").handler(this::orderLinesGet);
        builder.operation("orderLinesList").handler(this::orderLinesList);
    }

    private void orderLinesGet(RoutingContext routingContext) {
        logger.info("orderLinesGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String orderLineId = requestParameters.pathParameter("order_line_id") != null ? requestParameters.pathParameter("order_line_id").getString() : null;
        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;

        logger.debug("Parameter orderLineId is {}", orderLineId);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.orderLinesGet(orderLineId, adAccountId)
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

    private void orderLinesList(RoutingContext routingContext) {
        logger.info("orderLinesList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;
        PinterestLibPaginationOrder order = requestParameters.queryParameter("order") != null ? requestParameters.queryParameter("order").getPinterestLibPaginationOrder() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter pageSize is {}", pageSize);
        logger.debug("Parameter order is {}", order);

        api.orderLinesList(adAccountId, bookmark, pageSize, order)
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
