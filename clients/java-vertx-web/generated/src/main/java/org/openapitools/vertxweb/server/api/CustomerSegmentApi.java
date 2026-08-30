package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.CustomerSegment;
import org.openapitools.vertxweb.server.model.CustomerSegmentCreate;
import org.openapitools.vertxweb.server.model.CustomerSegmentList200Response;
import org.openapitools.vertxweb.server.model.CustomerSegmentUpdateRequestUpdateWithRequiredBody;
import org.openapitools.vertxweb.server.model.PinterestLibError;
import org.openapitools.vertxweb.server.model.PinterestLibPaginationOrder;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface CustomerSegmentApi  {
    Future<ApiResponse<CustomerSegment>> customerSegmentCreate(String adAccountId, CustomerSegmentCreate customerSegmentCreate);
    Future<ApiResponse<CustomerSegmentList200Response>> customerSegmentList(String adAccountId, String bookmark, Integer pageSize, PinterestLibPaginationOrder order, Boolean includeSizing, String searchQuery);
    Future<ApiResponse<Void>> customerSegmentUpdate(String adAccountId, CustomerSegmentUpdateRequestUpdateWithRequiredBody customerSegmentUpdateRequestUpdateWithRequiredBody);
}
