package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.CatalogsCreateReportResponse;
import org.openapitools.vertxweb.server.model.CatalogsReport;
import org.openapitools.vertxweb.server.model.CatalogsReportParameters;
import org.openapitools.vertxweb.server.model.CatalogsReportStatsParameters;
import org.openapitools.vertxweb.server.model.PinterestLibError;
import org.openapitools.vertxweb.server.model.ReportsStats200Response;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface CatalogReportsApi  {
    Future<ApiResponse<CatalogsCreateReportResponse>> reportsCreate(CatalogsReportParameters catalogsReportParameters, String adAccountId);
    Future<ApiResponse<CatalogsReport>> reportsGet(String token, String adAccountId);
    Future<ApiResponse<ReportsStats200Response>> reportsStats(CatalogsReportStatsParameters parameters, String adAccountId, String bookmark, Integer pageSize);
}
