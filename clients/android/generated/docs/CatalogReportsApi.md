# CatalogReportsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reportsCreate**](CatalogReportsApi.md#reportsCreate) | **POST** /catalogs/reports | Build catalogs report
[**reportsGet**](CatalogReportsApi.md#reportsGet) | **GET** /catalogs/reports | Get catalogs report
[**reportsStats**](CatalogReportsApi.md#reportsStats) | **GET** /catalogs/reports/stats | List report stats



## reportsCreate

> CatalogsCreateReportResponse reportsCreate(catalogsReportParameters, adAccountId)

Build catalogs report

Async request to create a report of the catalog owned by the \&quot;operation user_account\&quot;. This endpoint generates a report upon receiving the first approved request of the day. Any following requests with identical parameters will yield the same report even if data has changed. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: The All Items report is limited to 25 million items per catalog.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CatalogReportsApi;

CatalogReportsApi apiInstance = new CatalogReportsApi();
CatalogsReportParameters catalogsReportParameters = new CatalogsReportParameters(); // CatalogsReportParameters | 
String adAccountId = null; // String | Unique identifier of an ad account.
try {
    CatalogsCreateReportResponse result = apiInstance.reportsCreate(catalogsReportParameters, adAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogReportsApi#reportsCreate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsReportParameters** | [**CatalogsReportParameters**](CatalogsReportParameters.md)|  |
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**CatalogsCreateReportResponse**](CatalogsCreateReportResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## reportsGet

> CatalogsReport reportsGet(token, adAccountId)

Get catalogs report

This returns a URL to a report given a token returned from [Build catalogs report](/docs/api/v5/#operation/reports/create). You can use the URL to download the report. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CatalogReportsApi;

CatalogReportsApi apiInstance = new CatalogReportsApi();
String token = null; // String | Token returned from the post request creation call
String adAccountId = null; // String | Unique identifier of an ad account.
try {
    CatalogsReport result = apiInstance.reportsGet(token, adAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogReportsApi#reportsGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Token returned from the post request creation call | [default to null]
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**CatalogsReport**](CatalogsReport.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## reportsStats

> ReportsStats200Response reportsStats(parameters, adAccountId, bookmark, pageSize)

List report stats

List aggregated numbers of issues for a catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CatalogReportsApi;

CatalogReportsApi apiInstance = new CatalogReportsApi();
CatalogsReportStatsParameters parameters = null; // CatalogsReportStatsParameters | Contains the parameters for report identification.
String adAccountId = null; // String | Unique identifier of an ad account.
String bookmark = null; // String | Cursor used to fetch the next page of items
Integer pageSize = 25; // Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
try {
    ReportsStats200Response result = apiInstance.reportsStats(parameters, adAccountId, bookmark, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogReportsApi#reportsStats");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parameters** | [**CatalogsReportStatsParameters**](.md)| Contains the parameters for report identification. | [default to null]
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] [default to null]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**ReportsStats200Response**](ReportsStats200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

