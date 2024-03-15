package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.BulkDownloadRequest;
import org.openapitools.vertxweb.server.model.BulkDownloadResponse;
import org.openapitools.vertxweb.server.model.BulkUpsertRequest;
import org.openapitools.vertxweb.server.model.BulkUpsertResponse;
import org.openapitools.vertxweb.server.model.BulkUpsertStatusResponse;
import org.openapitools.vertxweb.server.model.Error;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class BulkApiImpl implements BulkApi {
    public Future<ApiResponse<BulkDownloadResponse>> bulkDownloadCreate(String adAccountId, BulkDownloadRequest bulkDownloadRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<BulkUpsertStatusResponse>> bulkRequestGet(String adAccountId, String bulkRequestId, Boolean includeDetails) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<BulkUpsertResponse>> bulkUpsertCreate(String adAccountId, BulkUpsertRequest bulkUpsertRequest) {
        return Future.failedFuture(new HttpException(501));
    }

}
