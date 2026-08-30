package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.LeadsExportResponseData;
import org.openapitools.vertxweb.server.model.LeadsExports;
import org.openapitools.vertxweb.server.model.LeadsExportsCreate;
import org.openapitools.vertxweb.server.model.PinterestLibError;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class LeadsExportApiImpl implements LeadsExportApi {
    public Future<ApiResponse<LeadsExports>> leadsExportCreate(String adAccountId, LeadsExportsCreate leadsExportsCreate) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<LeadsExportResponseData>> leadsExportGet(String adAccountId, String leadsExportId) {
        return Future.failedFuture(new HttpException(501));
    }

}
