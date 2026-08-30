package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.LeadsExportResponseData;
import org.openapitools.vertxweb.server.model.LeadsExports;
import org.openapitools.vertxweb.server.model.LeadsExportsCreate;
import org.openapitools.vertxweb.server.model.PinterestLibError;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface LeadsExportApi  {
    Future<ApiResponse<LeadsExports>> leadsExportCreate(String adAccountId, LeadsExportsCreate leadsExportsCreate);
    Future<ApiResponse<LeadsExportResponseData>> leadsExportGet(String adAccountId, String leadsExportId);
}
