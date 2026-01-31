# Org.OpenAPITools.Api.CatalogReportsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**ReportsCreate**](CatalogReportsApi.md#reportscreate) | **POST** /catalogs/reports | Build catalogs report |
| [**ReportsGet**](CatalogReportsApi.md#reportsget) | **GET** /catalogs/reports | Get catalogs report |
| [**ReportsStats**](CatalogReportsApi.md#reportsstats) | **GET** /catalogs/reports/stats | List report stats |

<a id="reportscreate"></a>
# **ReportsCreate**
> CatalogsCreateReportResponse ReportsCreate (CatalogsReportParameters catalogsReportParameters, string adAccountId = null)

Build catalogs report

Async request to create a report of the catalog owned by the \"operation user_account\". This endpoint generates a report upon receiving the first approved request of the day. Any following requests with identical parameters will yield the same report even if data has changed. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: Access to the All Items report type is restricted to a specific group of users. If you require access, please reach out to your partner manager.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **catalogsReportParameters** | [**CatalogsReportParameters**](CatalogsReportParameters.md) | Request object to asynchronously create a report. |  |
| **adAccountId** | **string** | Unique identifier of an ad account. | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="reportsget"></a>
# **ReportsGet**
> CatalogsReport ReportsGet (string token, string adAccountId = null)

Get catalogs report

This returns a URL to a report given a token returned from <a href='/docs/api/v5/#operation/reports/create'>Build catalogs report</a>. You can use the URL to download the report. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **token** | **string** | Token returned from async build report call |  |
| **adAccountId** | **string** | Unique identifier of an ad account. | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="reportsstats"></a>
# **ReportsStats**
> ReportsStats200Response ReportsStats (ReportsStatsParametersParameter parameters, string adAccountId = null, int pageSize = null, string bookmark = null)

List report stats

List aggregated numbers of issues for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **parameters** | [**ReportsStatsParametersParameter**](ReportsStatsParametersParameter.md) | Contains the parameters for report identification. |  |
| **adAccountId** | **string** | Unique identifier of an ad account. | [optional]  |
| **pageSize** | **int** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **bookmark** | **string** | Cursor used to fetch the next page of items | [optional]  |

### Return type

[**ReportsStats200Response**](ReportsStats200Response.md)

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

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

