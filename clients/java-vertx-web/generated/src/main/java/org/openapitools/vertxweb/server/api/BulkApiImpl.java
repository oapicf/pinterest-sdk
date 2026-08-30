package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.BulkDownload;
import org.openapitools.vertxweb.server.model.BulkDownloadCreate;
import org.openapitools.vertxweb.server.model.BulkJobData;
import org.openapitools.vertxweb.server.model.BulkUpsertRequest;
import org.openapitools.vertxweb.server.model.BulkUpsertResponse;
import org.openapitools.vertxweb.server.model.PinterestLibError;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class BulkApiImpl implements BulkApi {
    public Future<ApiResponse<BulkDownload>> bulkDownloadCreate(String adAccountId, BulkDownloadCreate bulkDownloadCreate) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<BulkJobData>> bulkRequestGet(String adAccountId, String bulkRequestId, Boolean includeDetails) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<BulkUpsertResponse>> bulkUpsertCreate(String adAccountId, BulkUpsertRequest bulkUpsertRequest) {
        return Future.failedFuture(new HttpException(501));
    }

}
