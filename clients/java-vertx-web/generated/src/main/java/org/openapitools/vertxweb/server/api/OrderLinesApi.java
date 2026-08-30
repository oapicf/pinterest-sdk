package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.OrderLine;
import org.openapitools.vertxweb.server.model.OrderLinesList200Response;
import org.openapitools.vertxweb.server.model.PinterestLibError;
import org.openapitools.vertxweb.server.model.PinterestLibPaginationOrder;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface OrderLinesApi  {
    Future<ApiResponse<OrderLine>> orderLinesGet(String orderLineId, String adAccountId);
    Future<ApiResponse<OrderLinesList200Response>> orderLinesList(String adAccountId, String bookmark, Integer pageSize, PinterestLibPaginationOrder order);
}
