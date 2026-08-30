# CatalogReportsController

All URIs are relative to `"/v5"`

The controller class is defined in **[CatalogReportsController.java](../../src/main/java/org/openapitools/controller/CatalogReportsController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**reportsCreate**](#reportsCreate) | **POST** /catalogs/reports | Build catalogs report
[**reportsGet**](#reportsGet) | **GET** /catalogs/reports | Get catalogs report
[**reportsStats**](#reportsStats) | **GET** /catalogs/reports/stats | List report stats

<a id="reportsCreate"></a>
# **reportsCreate**
```java
Mono<CatalogsCreateReportResponse> CatalogReportsController.reportsCreate(catalogsReportParametersadAccountId)
```

Build catalogs report

Async request to create a report of the catalog owned by the \&quot;operation user_account\&quot;. This endpoint generates a report upon receiving the first approved request of the day. Any following requests with identical parameters will yield the same report even if data has changed. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: The All Items report is limited to 25 million items per catalog.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**catalogsReportParameters** | [**CatalogsReportParameters**](../../docs/models/CatalogsReportParameters.md) |  |
**adAccountId** | `String` | Unique identifier of an ad account. | [optional parameter]

### Return type
[**CatalogsCreateReportResponse**](../../docs/models/CatalogsCreateReportResponse.md)

### Authorization
* **pinterest_oauth2**, scopes: `catalogs:read`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="reportsGet"></a>
# **reportsGet**
```java
Mono<CatalogsReport> CatalogReportsController.reportsGet(tokenadAccountId)
```

Get catalogs report

This returns a URL to a report given a token returned from [Build catalogs report](/docs/api/v5/#operation/reports/create). You can use the URL to download the report. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**token** | `String` | Token returned from the post request creation call |
**adAccountId** | `String` | Unique identifier of an ad account. | [optional parameter]

### Return type
[**CatalogsReport**](../../docs/models/CatalogsReport.md)

### Authorization
* **pinterest_oauth2**, scopes: `catalogs:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="reportsStats"></a>
# **reportsStats**
```java
Mono<ReportsStats200Response> CatalogReportsController.reportsStats(parametersadAccountIdbookmarkpageSize)
```

List report stats

List aggregated numbers of issues for a catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**parameters** | [**CatalogsReportStatsParameters**](../../docs/models/.md) | Contains the parameters for report identification. |
**adAccountId** | `String` | Unique identifier of an ad account. | [optional parameter]
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]
**pageSize** | `Integer` | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional parameter] [default to `25`]

### Return type
[**ReportsStats200Response**](../../docs/models/ReportsStats200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `catalogs:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

