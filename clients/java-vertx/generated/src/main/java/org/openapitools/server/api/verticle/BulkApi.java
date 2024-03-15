package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.BulkDownloadRequest;
import org.openapitools.server.api.model.BulkDownloadResponse;
import org.openapitools.server.api.model.BulkUpsertRequest;
import org.openapitools.server.api.model.BulkUpsertResponse;
import org.openapitools.server.api.model.BulkUpsertStatusResponse;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface BulkApi  {
    //bulk_download/create
    void bulkDownloadCreate(String adAccountId, BulkDownloadRequest bulkDownloadRequest, Handler<AsyncResult<BulkDownloadResponse>> handler);

    //bulk_request/get
    void bulkRequestGet(String adAccountId, String bulkRequestId, Boolean includeDetails, Handler<AsyncResult<BulkUpsertStatusResponse>> handler);

    //bulk_upsert/create
    void bulkUpsertCreate(String adAccountId, BulkUpsertRequest bulkUpsertRequest, Handler<AsyncResult<BulkUpsertResponse>> handler);

}
