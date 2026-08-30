# CatalogReportsApi

All URIs are relative to */v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reportsCreate**](CatalogReportsApi.md#reportsCreate) | **POST** /catalogs/reports | Build catalogs report
[**reportsGet**](CatalogReportsApi.md#reportsGet) | **GET** /catalogs/reports | Get catalogs report
[**reportsStats**](CatalogReportsApi.md#reportsStats) | **GET** /catalogs/reports/stats | List report stats



## reportsCreate

Build catalogs report

Async request to create a report of the catalog owned by the \"operation user_account\". This endpoint generates a report upon receiving the first approved request of the day. Any following requests with identical parameters will yield the same report even if data has changed.
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an 'ad_account_id' (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

Note: The All Items report is limited to 25 million items per catalog.

### Example

```bash
 reportsCreate  ad_account_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsReportParameters** | [**CatalogsReportParameters**](CatalogsReportParameters.md) |  |
 **adAccountId** | **string** | Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**CatalogsCreateReportResponse**](CatalogsCreateReportResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsGet

Get catalogs report

This returns a URL to a report given a token returned from [Build catalogs report](/docs/api/v5/#operation/reports/create). You can use the URL to download the report.
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an 'ad_account_id' (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

### Example

```bash
 reportsGet  token=value  ad_account_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Token returned from the post request creation call | [default to null]
 **adAccountId** | **string** | Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**CatalogsReport**](CatalogsReport.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsStats

List report stats

List aggregated numbers of issues for a catalog owned by the \"operation user_account\".
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an 'ad_account_id' (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

### Example

```bash
 reportsStats  parameters=value  ad_account_id=value  bookmark=value  page_size=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parameters** | [**CatalogsReportStatsParameters**](.md) | Contains the parameters for report identification. | [default to null]
 **adAccountId** | **string** | Unique identifier of an ad account. | [optional] [default to null]
 **bookmark** | **string** | Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **integer** | Maximum number of items to include in a single page.
See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**ReportsStats200Response**](ReportsStats200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

