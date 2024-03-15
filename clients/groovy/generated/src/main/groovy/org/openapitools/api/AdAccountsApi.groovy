package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.AdAccount
import org.openapitools.model.AdAccountAnalyticsResponseInner
import org.openapitools.model.AdAccountCreateRequest
import org.openapitools.model.AdAccountsList200Response
import org.openapitools.model.AdsAnalyticsCreateAsyncRequest
import org.openapitools.model.AdsAnalyticsCreateAsyncResponse
import org.openapitools.model.AdsAnalyticsGetAsyncResponse
import org.openapitools.model.AdsAnalyticsTargetingType
import org.openapitools.model.ConversionReportAttributionType
import org.openapitools.model.CreateMMMReportRequest
import org.openapitools.model.CreateMMMReportResponse
import org.openapitools.model.Error
import org.openapitools.model.GetMMMReportResponse
import org.openapitools.model.Granularity
import org.openapitools.model.MetricsResponse
import org.openapitools.model.TemplatesList200Response

class AdAccountsApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def adAccountAnalytics ( String adAccountId, Date startDate, Date endDate, List<String> columns, Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/analytics"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }
        // verify required params are set
        if (startDate == null) {
            throw new RuntimeException("missing required params startDate")
        }
        // verify required params are set
        if (endDate == null) {
            throw new RuntimeException("missing required params endDate")
        }
        // verify required params are set
        if (columns == null) {
            throw new RuntimeException("missing required params columns")
        }
        // verify required params are set
        if (granularity == null) {
            throw new RuntimeException("missing required params granularity")
        }

        if (startDate != null) {
            queryParams.put("start_date", startDate)
        }
        if (endDate != null) {
            queryParams.put("end_date", endDate)
        }
        if (columns != null) {
            queryParams.put("columns", columns)
        }
        if (granularity != null) {
            queryParams.put("granularity", granularity)
        }
        if (clickWindowDays != null) {
            queryParams.put("click_window_days", clickWindowDays)
        }
        if (engagementWindowDays != null) {
            queryParams.put("engagement_window_days", engagementWindowDays)
        }
        if (viewWindowDays != null) {
            queryParams.put("view_window_days", viewWindowDays)
        }
        if (conversionReportTime != null) {
            queryParams.put("conversion_report_time", conversionReportTime)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    AdAccountAnalyticsResponseInner.class )

    }

    def adAccountTargetingAnalyticsGet ( String adAccountId, Date startDate, Date endDate, List<AdsAnalyticsTargetingType> targetingTypes, List<String> columns, Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime, ConversionReportAttributionType attributionTypes, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/targeting_analytics"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }
        // verify required params are set
        if (startDate == null) {
            throw new RuntimeException("missing required params startDate")
        }
        // verify required params are set
        if (endDate == null) {
            throw new RuntimeException("missing required params endDate")
        }
        // verify required params are set
        if (targetingTypes == null) {
            throw new RuntimeException("missing required params targetingTypes")
        }
        // verify required params are set
        if (columns == null) {
            throw new RuntimeException("missing required params columns")
        }
        // verify required params are set
        if (granularity == null) {
            throw new RuntimeException("missing required params granularity")
        }

        if (startDate != null) {
            queryParams.put("start_date", startDate)
        }
        if (endDate != null) {
            queryParams.put("end_date", endDate)
        }
        if (targetingTypes != null) {
            queryParams.put("targeting_types", targetingTypes)
        }
        if (columns != null) {
            queryParams.put("columns", columns)
        }
        if (granularity != null) {
            queryParams.put("granularity", granularity)
        }
        if (clickWindowDays != null) {
            queryParams.put("click_window_days", clickWindowDays)
        }
        if (engagementWindowDays != null) {
            queryParams.put("engagement_window_days", engagementWindowDays)
        }
        if (viewWindowDays != null) {
            queryParams.put("view_window_days", viewWindowDays)
        }
        if (conversionReportTime != null) {
            queryParams.put("conversion_report_time", conversionReportTime)
        }
        if (attributionTypes != null) {
            queryParams.put("attribution_types", attributionTypes)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    MetricsResponse.class )

    }

    def adAccountsCreate ( AdAccountCreateRequest adAccountCreateRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (adAccountCreateRequest == null) {
            throw new RuntimeException("missing required params adAccountCreateRequest")
        }



        contentType = 'application/json';
        bodyParams = adAccountCreateRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    AdAccount.class )

    }

    def adAccountsGet ( String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    AdAccount.class )

    }

    def adAccountsList ( String bookmark, Integer pageSize, Boolean includeSharedAccounts, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }
        if (includeSharedAccounts != null) {
            queryParams.put("include_shared_accounts", includeSharedAccounts)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    AdAccountsList200Response.class )

    }

    def analyticsCreateMmmReport ( String adAccountId, CreateMMMReportRequest createMMMReportRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/mmm_reports"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }
        // verify required params are set
        if (createMMMReportRequest == null) {
            throw new RuntimeException("missing required params createMMMReportRequest")
        }



        contentType = 'application/json';
        bodyParams = createMMMReportRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    CreateMMMReportResponse.class )

    }

    def analyticsCreateReport ( String adAccountId, AdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/reports"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }
        // verify required params are set
        if (adsAnalyticsCreateAsyncRequest == null) {
            throw new RuntimeException("missing required params adsAnalyticsCreateAsyncRequest")
        }



        contentType = 'application/json';
        bodyParams = adsAnalyticsCreateAsyncRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    AdsAnalyticsCreateAsyncResponse.class )

    }

    def analyticsCreateTemplateReport ( String adAccountId, String templateId, Date startDate, Date endDate, Granularity granularity, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/templates/${template_id}/reports"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }
        // verify required params are set
        if (templateId == null) {
            throw new RuntimeException("missing required params templateId")
        }

        if (startDate != null) {
            queryParams.put("start_date", startDate)
        }
        if (endDate != null) {
            queryParams.put("end_date", endDate)
        }
        if (granularity != null) {
            queryParams.put("granularity", granularity)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    AdsAnalyticsCreateAsyncResponse.class )

    }

    def analyticsGetMmmReport ( String adAccountId, String token, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/mmm_reports"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }
        // verify required params are set
        if (token == null) {
            throw new RuntimeException("missing required params token")
        }

        if (token != null) {
            queryParams.put("token", token)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetMMMReportResponse.class )

    }

    def analyticsGetReport ( String adAccountId, String token, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/reports"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }
        // verify required params are set
        if (token == null) {
            throw new RuntimeException("missing required params token")
        }

        if (token != null) {
            queryParams.put("token", token)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    AdsAnalyticsGetAsyncResponse.class )

    }

    def sandboxDelete ( String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/sandbox"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    String.class )

    }

    def templatesList ( String adAccountId, Integer pageSize, String order, String bookmark, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/templates"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }

        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }
        if (order != null) {
            queryParams.put("order", order)
        }
        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    TemplatesList200Response.class )

    }

}
