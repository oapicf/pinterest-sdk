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
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class CustomerSegmentApiImpl implements CustomerSegmentApi {
    public Future<ApiResponse<CustomerSegment>> customerSegmentCreate(String adAccountId, CustomerSegmentCreate customerSegmentCreate) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CustomerSegmentList200Response>> customerSegmentList(String adAccountId, String bookmark, Integer pageSize, PinterestLibPaginationOrder order, Boolean includeSizing, String searchQuery) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Void>> customerSegmentUpdate(String adAccountId, CustomerSegmentUpdateRequestUpdateWithRequiredBody customerSegmentUpdateRequestUpdateWithRequiredBody) {
        return Future.failedFuture(new HttpException(501));
    }

}
