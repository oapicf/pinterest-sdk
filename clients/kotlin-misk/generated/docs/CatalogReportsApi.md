# CatalogReportsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reportsCreate**](CatalogReportsApi.md#reportsCreate) | **Post** /catalogs/reports | Build catalogs report
[**reportsGet**](CatalogReportsApi.md#reportsGet) | **Get** /catalogs/reports | Get catalogs report
[**reportsStats**](CatalogReportsApi.md#reportsStats) | **Get** /catalogs/reports/stats | List report stats


<a name="reportsCreate"></a>
# **reportsCreate**
> CatalogsCreateReportResponse reportsCreate(catalogsReportParameters, adAccountId)

Build catalogs report

Async request to create a report of the catalog owned by the \&quot;operation user_account\&quot;. This endpoint generates a report upon receiving the first approved request of the day. Any following requests with identical parameters will yield the same report even if data has changed. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: The All Items report is limited to 25 million items per catalog.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = CatalogReportsApi()
val catalogsReportParameters : CatalogsReportParameters =  // CatalogsReportParameters | 
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : CatalogsCreateReportResponse = apiInstance.reportsCreate(catalogsReportParameters, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogReportsApi#reportsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogReportsApi#reportsCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsReportParameters** | [**CatalogsReportParameters**](CatalogsReportParameters.md)|  |
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]

### Return type

[**CatalogsCreateReportResponse**](CatalogsCreateReportResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

<a name="reportsGet"></a>
# **reportsGet**
> CatalogsReport reportsGet(token, adAccountId)

Get catalogs report

This returns a URL to a report given a token returned from [Build catalogs report](/docs/api/v5/#operation/reports/create). You can use the URL to download the report. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = CatalogReportsApi()
val token : kotlin.String = token_example // kotlin.String | Token returned from the post request creation call
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : CatalogsReport = apiInstance.reportsGet(token, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogReportsApi#reportsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogReportsApi#reportsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Token returned from the post request creation call |
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]

### Return type

[**CatalogsReport**](CatalogsReport.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="reportsStats"></a>
# **reportsStats**
> ReportsStats200Response reportsStats(parameters, adAccountId, bookmark, pageSize)

List report stats

List aggregated numbers of issues for a catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = CatalogReportsApi()
val parameters : CatalogsReportStatsParameters =  // CatalogsReportStatsParameters | Contains the parameters for report identification.
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
try {
    val result : ReportsStats200Response = apiInstance.reportsStats(parameters, adAccountId, bookmark, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogReportsApi#reportsStats")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogReportsApi#reportsStats")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parameters** | [**CatalogsReportStatsParameters**](.md)| Contains the parameters for report identification. |
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]
 **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**ReportsStats200Response**](ReportsStats200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

