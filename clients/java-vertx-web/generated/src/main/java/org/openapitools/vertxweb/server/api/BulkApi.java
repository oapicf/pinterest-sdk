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

import java.util.List;
import java.util.Map;

public interface BulkApi  {
    Future<ApiResponse<BulkDownloadResponse>> bulkDownloadCreate(String adAccountId, BulkDownloadRequest bulkDownloadRequest);
    Future<ApiResponse<BulkUpsertStatusResponse>> bulkRequestGet(String adAccountId, String bulkRequestId, Boolean includeDetails);
    Future<ApiResponse<BulkUpsertResponse>> bulkUpsertCreate(String adAccountId, BulkUpsertRequest bulkUpsertRequest);
}
