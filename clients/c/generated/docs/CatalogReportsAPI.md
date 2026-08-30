# CatalogReportsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CatalogReportsAPI_reportsCreate**](CatalogReportsAPI.md#CatalogReportsAPI_reportsCreate) | **POST** /catalogs/reports | Build catalogs report
[**CatalogReportsAPI_reportsGet**](CatalogReportsAPI.md#CatalogReportsAPI_reportsGet) | **GET** /catalogs/reports | Get catalogs report
[**CatalogReportsAPI_reportsStats**](CatalogReportsAPI.md#CatalogReportsAPI_reportsStats) | **GET** /catalogs/reports/stats | List report stats


# **CatalogReportsAPI_reportsCreate**
```c
// Build catalogs report
//
// Async request to create a report of the catalog owned by the \"operation user_account\". This endpoint generates a report upon receiving the first approved request of the day. Any following requests with identical parameters will yield the same report even if data has changed. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: The All Items report is limited to 25 million items per catalog.
//
catalogs_create_report_response_t* CatalogReportsAPI_reportsCreate(apiClient_t *apiClient, catalogs_report_parameters_t *catalogs_report_parameters, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**catalogs_report_parameters** | **[catalogs_report_parameters_t](catalogs_report_parameters.md) \*** |  | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 

### Return type

[catalogs_create_report_response_t](catalogs_create_report_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CatalogReportsAPI_reportsGet**
```c
// Get catalogs report
//
// This returns a URL to a report given a token returned from [Build catalogs report](/docs/api/v5/#operation/reports/create). You can use the URL to download the report. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
//
catalogs_report_t* CatalogReportsAPI_reportsGet(apiClient_t *apiClient, char *token, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**token** | **char \*** | Token returned from the post request creation call | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 

### Return type

[catalogs_report_t](catalogs_report.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CatalogReportsAPI_reportsStats**
```c
// List report stats
//
// List aggregated numbers of issues for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
//
reports_stats_200_response_t* CatalogReportsAPI_reportsStats(apiClient_t *apiClient, catalogs_report_stats_parameters_t *parameters, char *ad_account_id, char *bookmark, int *page_size);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**parameters** | **[catalogs_report_stats_parameters_t](.md) \*** | Contains the parameters for report identification. | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 
**page_size** | **int \*** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[reports_stats_200_response_t](reports_stats_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

