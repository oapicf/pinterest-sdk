package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.OrderLine;
import org.openapitools.server.api.model.OrderLinesList200Response;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface OrderLinesApi  {
    //order_lines/get
    void orderLinesGet(String adAccountId, String orderLineId, Handler<AsyncResult<OrderLine>> handler);

    //order_lines/list
    void orderLinesList(String adAccountId, Integer pageSize, String order, String bookmark, Handler<AsyncResult<OrderLinesList200Response>> handler);

}
