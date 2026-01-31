# CatalogReportsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ReportsCreate**](CatalogReportsApi.md#ReportsCreate) | **POST** /catalogs/reports | Build catalogs report
[**ReportsGet**](CatalogReportsApi.md#ReportsGet) | **GET** /catalogs/reports | Get catalogs report
[**ReportsStats**](CatalogReportsApi.md#ReportsStats) | **GET** /catalogs/reports/stats | List report stats


# **ReportsCreate**
> CatalogsCreateReportResponse ReportsCreate(catalogs_report_parameters, ad_account_id = var.ad_account_id)

Build catalogs report

Async request to create a report of the catalog owned by the \"operation user_account\". This endpoint generates a report upon receiving the first approved request of the day. Any following requests with identical parameters will yield the same report even if data has changed. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: Access to the All Items report type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example
```R
library(openapi)

# Build catalogs report
#
# prepare function argument(s)
var_catalogs_report_parameters <- CatalogsReportParameters$new(CatalogsType$new(), CatalogsHotelReportParameters_report$new("feed_id_example", "FEED_INGESTION_ISSUES", "processing_result_id_example", "catalog_id_example")) # CatalogsReportParameters | Request object to asynchronously create a report.
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- CatalogReportsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ReportsCreate(var_catalogs_report_parameters, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$ReportsCreate(var_catalogs_report_parameters, ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogs_report_parameters** | [**CatalogsReportParameters**](CatalogsReportParameters.md)| Request object to asynchronously create a report. | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsCreateReportResponse**](CatalogsCreateReportResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response containing the report token |  -  |
| **404** | Entity (e.g., catalog, feed or processing_result) not found |  -  |
| **409** | Can&#39;t access this feature without an existing catalog. |  -  |
| **0** | Unexpected error |  -  |

# **ReportsGet**
> CatalogsReport ReportsGet(token, ad_account_id = var.ad_account_id)

Get catalogs report

This returns a URL to a report given a token returned from <a href='/docs/api/v5/#operation/reports/create'>Build catalogs report</a>. You can use the URL to download the report. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

### Example
```R
library(openapi)

# Get catalogs report
#
# prepare function argument(s)
var_token <- "token_example" # character | Token returned from async build report call
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- CatalogReportsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ReportsGet(var_token, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$ReportsGet(var_token, ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **character**| Token returned from async build report call | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsReport**](CatalogsReport.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response that contains a link to download the report |  -  |
| **400** | The token you provided is not valid or has expired. |  -  |
| **409** | Can&#39;t access this feature without an existing catalog. |  -  |
| **0** | Unexpected error |  -  |

# **ReportsStats**
> ReportsStats200Response ReportsStats(parameters, ad_account_id = var.ad_account_id, page_size = 25, bookmark = var.bookmark)

List report stats

List aggregated numbers of issues for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

### Example
```R
library(openapi)

# List report stats
#
# prepare function argument(s)
var_parameters <- reports_stats_parameters_parameter$new(CatalogsType$new(), CatalogsHotelReportStatsParameters_report$new("feed_id_example", "FEED_INGESTION_ISSUES", "processing_result_id_example", "catalog_id_example")) # ReportsStatsParametersParameter | Contains the parameters for report identification.
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (Optional)
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)

api_instance <- CatalogReportsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ReportsStats(var_parameters, ad_account_id = var_ad_account_id, page_size = var_page_size, bookmark = var_bookmarkdata_file = "result.txt")
result <- api_instance$ReportsStats(var_parameters, ad_account_id = var_ad_account_id, page_size = var_page_size, bookmark = var_bookmark)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parameters** | [**ReportsStatsParametersParameter**](.md)| Contains the parameters for report identification. | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 

### Return type

[**ReportsStats200Response**](reports_stats_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response containing the diagnostics aggregated counters |  -  |
| **401** | Not authorized to access catalogs |  -  |
| **0** | Unexpected error |  -  |

