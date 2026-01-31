# .CatalogReportsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reportsCreate**](CatalogReportsApi.md#reportsCreate) | **POST** /catalogs/reports | Build catalogs report
[**reportsGet**](CatalogReportsApi.md#reportsGet) | **GET** /catalogs/reports | Get catalogs report
[**reportsStats**](CatalogReportsApi.md#reportsStats) | **GET** /catalogs/reports/stats | List report stats


# **reportsCreate**
> CatalogsCreateReportResponse reportsCreate(catalogsReportParameters)

Async request to create a report of the catalog owned by the \"operation user_account\". This endpoint generates a report upon receiving the first approved request of the day. Any following requests with identical parameters will yield the same report even if data has changed. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: Access to the All Items report type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example


```typescript
import { createConfiguration, CatalogReportsApi } from '';
import type { CatalogReportsApiReportsCreateRequest } from '';

const configuration = createConfiguration();
const apiInstance = new CatalogReportsApi(configuration);

const request: CatalogReportsApiReportsCreateRequest = {
    // Request object to asynchronously create a report.
  catalogsReportParameters: {
    catalogType: "RETAIL",
    report: {
    feedId: "4",
    processingResultId: "4",
    reportType: "FEED_INGESTION_ISSUES",
  },
  },
    // Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

const data = await apiInstance.reportsCreate(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsReportParameters** | **CatalogsReportParameters**| Request object to asynchronously create a report. |
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined


### Return type

**CatalogsCreateReportResponse**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response containing the report token |  -  |
**404** | Entity (e.g., catalog, feed or processing_result) not found |  -  |
**409** | Can\&#39;t access this feature without an existing catalog. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **reportsGet**
> CatalogsReport reportsGet()

This returns a URL to a report given a token returned from <a href=\'/docs/api/v5/#operation/reports/create\'>Build catalogs report</a>. You can use the URL to download the report. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

### Example


```typescript
import { createConfiguration, CatalogReportsApi } from '';
import type { CatalogReportsApiReportsGetRequest } from '';

const configuration = createConfiguration();
const apiInstance = new CatalogReportsApi(configuration);

const request: CatalogReportsApiReportsGetRequest = {
    // Token returned from async build report call
  token: "token_example",
    // Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

const data = await apiInstance.reportsGet(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | [**string**] | Token returned from async build report call | defaults to undefined
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined


### Return type

**CatalogsReport**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response that contains a link to download the report |  -  |
**400** | The token you provided is not valid or has expired. |  -  |
**409** | Can\&#39;t access this feature without an existing catalog. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **reportsStats**
> ReportsStats200Response reportsStats()

List aggregated numbers of issues for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

### Example


```typescript
import { createConfiguration, CatalogReportsApi } from '';
import type { CatalogReportsApiReportsStatsRequest } from '';

const configuration = createConfiguration();
const apiInstance = new CatalogReportsApi(configuration);

const request: CatalogReportsApiReportsStatsRequest = {
    // Contains the parameters for report identification.
  parameters: {
    catalogType: "RETAIL",
    report: {
    feedId: "4",
    processingResultId: "4",
    reportType: "FEED_INGESTION_ISSUES",
  },
  },
    // Unique identifier of an ad account. (optional)
  adAccountId: "4",
    // Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional)
  pageSize: 25,
    // Cursor used to fetch the next page of items (optional)
  bookmark: "bookmark_example",
};

const data = await apiInstance.reportsStats(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parameters** | **ReportsStatsParametersParameter** | Contains the parameters for report identification. | defaults to undefined
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined
 **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25
 **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined


### Return type

**ReportsStats200Response**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response containing the diagnostics aggregated counters |  -  |
**401** | Not authorized to access catalogs |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


