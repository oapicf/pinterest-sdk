package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.OrderLine;
import org.openapitools.vertxweb.server.model.OrderLinesList200Response;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface OrderLinesApi  {
    Future<ApiResponse<OrderLine>> orderLinesGet(String adAccountId, String orderLineId);
    Future<ApiResponse<OrderLinesList200Response>> orderLinesList(String adAccountId, Integer pageSize, String order, String bookmark);
}
