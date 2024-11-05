package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.LeadsExportCreateRequest;
import org.openapitools.vertxweb.server.model.LeadsExportCreateResponse;
import org.openapitools.vertxweb.server.model.LeadsExportResponseData;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface LeadsExportApi  {
    Future<ApiResponse<LeadsExportCreateResponse>> leadsExportCreate(String adAccountId, LeadsExportCreateRequest leadsExportCreateRequest);
    Future<ApiResponse<LeadsExportResponseData>> leadsExportGet(String adAccountId, String leadsExportId);
}
