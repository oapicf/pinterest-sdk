package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.CatalogsCreateReportResponse
import org.openapitools.model.CatalogsReport
import org.openapitools.model.CatalogsReportParameters
import org.openapitools.model.Error
import org.openapitools.model.ReportsStats200Response
import org.openapitools.model.ReportsStatsParametersParameter

class CatalogReportsApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def reportsCreate ( CatalogsReportParameters catalogsReportParameters, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/reports"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (catalogsReportParameters == null) {
            throw new RuntimeException("missing required params catalogsReportParameters")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }


        contentType = 'application/json';
        bodyParams = catalogsReportParameters


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    CatalogsCreateReportResponse.class )

    }

    def reportsGet ( String token, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/reports"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (token == null) {
            throw new RuntimeException("missing required params token")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }
        if (token != null) {
            queryParams.put("token", token)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    CatalogsReport.class )

    }

    def reportsStats ( ReportsStatsParametersParameter parameters, String adAccountId, Integer pageSize, String bookmark, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/catalogs/reports/stats"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (parameters == null) {
            throw new RuntimeException("missing required params parameters")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }
        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }
        if (parameters != null) {
            queryParams.put("parameters", parameters)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    ReportsStats200Response.class )

    }

}
