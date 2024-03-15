package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.BulkDownloadRequest;
import org.openapitools.server.api.model.BulkDownloadResponse;
import org.openapitools.server.api.model.BulkUpsertRequest;
import org.openapitools.server.api.model.BulkUpsertResponse;
import org.openapitools.server.api.model.BulkUpsertStatusResponse;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;

public final class BulkApiException extends MainApiException {
    public BulkApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final BulkApiException Bulk_bulkDownloadCreate_200_Exception = new BulkApiException(200, "Success");
    public static final BulkApiException Bulk_bulkRequestGet_200_Exception = new BulkApiException(200, "Success");
    public static final BulkApiException Bulk_bulkUpsertCreate_200_Exception = new BulkApiException(200, "Success");
    

}