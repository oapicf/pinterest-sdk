# CatalogReportsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reports_create**](CatalogReportsApi.md#reports_create) | **POST** /catalogs/reports | Build catalogs report
[**reports_get**](CatalogReportsApi.md#reports_get) | **GET** /catalogs/reports | Get catalogs report
[**reports_stats**](CatalogReportsApi.md#reports_stats) | **GET** /catalogs/reports/stats | List report stats


# **reports_create**
> `reports_create`(_api::`CatalogReportsApi`, `catalogs_report_parameters`::`CatalogsReportParameters`; `ad_account_id`=nothing, _mediaType=nothing) -> `CatalogsCreateReportResponse`, `OpenAPI.Clients.ApiResponse` <br/>
> `reports_create`(_api::`CatalogReportsApi`, response_stream::`Channel`, `catalogs_report_parameters`::`CatalogsReportParameters`; `ad_account_id`=nothing, _mediaType=nothing) -> `Channel`{ `CatalogsCreateReportResponse` }, `OpenAPI.Clients.ApiResponse`

Build catalogs report

Async request to create a report of the catalog owned by the \"operation user_account\". This endpoint generates a report upon receiving the first approved request of the day. Any following requests with identical parameters will yield the same report even if data has changed. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: The All Items report is limited to 25 million items per catalog.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`CatalogReportsApi`** | API context | 
**`catalogs_report_parameters`** | [**`CatalogsReportParameters`**](CatalogsReportParameters.md) |  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`ad_account_id`** | **`String`** | Unique identifier of an ad account. | [default to nothing]

### Return type

[**`CatalogsCreateReportResponse`**](CatalogsCreateReportResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **reports_get**
> `reports_get`(_api::`CatalogReportsApi`, `token`::`String`; `ad_account_id`=nothing, _mediaType=nothing) -> `CatalogsReport`, `OpenAPI.Clients.ApiResponse` <br/>
> `reports_get`(_api::`CatalogReportsApi`, response_stream::`Channel`, `token`::`String`; `ad_account_id`=nothing, _mediaType=nothing) -> `Channel`{ `CatalogsReport` }, `OpenAPI.Clients.ApiResponse`

Get catalogs report

This returns a URL to a report given a token returned from [Build catalogs report](/docs/api/v5/#operation/reports/create). You can use the URL to download the report. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`CatalogReportsApi`** | API context | 
**`token`** | **`String`** | Token returned from the post request creation call |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`ad_account_id`** | **`String`** | Unique identifier of an ad account. | [default to nothing]

### Return type

[**`CatalogsReport`**](CatalogsReport.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **reports_stats**
> `reports_stats`(_api::`CatalogReportsApi`, `parameters`::`CatalogsReportStatsParameters`; `ad_account_id`=nothing, `bookmark`=nothing, `page_size`=nothing, _mediaType=nothing) -> `ReportsStats200Response`, `OpenAPI.Clients.ApiResponse` <br/>
> `reports_stats`(_api::`CatalogReportsApi`, response_stream::`Channel`, `parameters`::`CatalogsReportStatsParameters`; `ad_account_id`=nothing, `bookmark`=nothing, `page_size`=nothing, _mediaType=nothing) -> `Channel`{ `ReportsStats200Response` }, `OpenAPI.Clients.ApiResponse`

List report stats

List aggregated numbers of issues for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`CatalogReportsApi`** | API context | 
**`parameters`** | [**`CatalogsReportStatsParameters`**](.md) | Contains the parameters for report identification. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`ad_account_id`** | **`String`** | Unique identifier of an ad account. | [default to nothing]
 **`bookmark`** | **`String`** | Cursor used to fetch the next page of items | [default to nothing]
 **`page_size`** | **`Int64`** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**`ReportsStats200Response`**](ReportsStats200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

