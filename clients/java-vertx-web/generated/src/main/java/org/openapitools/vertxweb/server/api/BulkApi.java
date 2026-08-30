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

import java.util.List;
import java.util.Map;

public interface BulkApi  {
    Future<ApiResponse<BulkDownload>> bulkDownloadCreate(String adAccountId, BulkDownloadCreate bulkDownloadCreate);
    Future<ApiResponse<BulkJobData>> bulkRequestGet(String adAccountId, String bulkRequestId, Boolean includeDetails);
    Future<ApiResponse<BulkUpsertResponse>> bulkUpsertCreate(String adAccountId, BulkUpsertRequest bulkUpsertRequest);
}
