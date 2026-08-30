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
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class CatalogReportsApiImpl implements CatalogReportsApi {
    public Future<ApiResponse<CatalogsCreateReportResponse>> reportsCreate(CatalogsReportParameters catalogsReportParameters, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CatalogsReport>> reportsGet(String token, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ReportsStats200Response>> reportsStats(CatalogsReportStatsParameters parameters, String adAccountId, String bookmark, Integer pageSize) {
        return Future.failedFuture(new HttpException(501));
    }

}
