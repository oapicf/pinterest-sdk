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

Async request to create a report of the catalog owned by the \&quot;operation user_account\&quot;. This endpoint generates a report upon receiving the first approved request of the day. Any following requests with identical parameters will yield the same report even if data has changed. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: Access to the All Items report type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**catalogsReportParameters** | [**CatalogsReportParameters**](../../docs/models/CatalogsReportParameters.md) | Request object to asynchronously create a report. |
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

This returns a URL to a report given a token returned from &lt;a href&#x3D;&#39;/docs/api/v5/#operation/reports/create&#39;&gt;Build catalogs report&lt;/a&gt;. You can use the URL to download the report. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**token** | `String` | Token returned from async build report call |
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
Mono<ReportsStats200Response> CatalogReportsController.reportsStats(parametersadAccountIdpageSizebookmark)
```

List report stats

List aggregated numbers of issues for a catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**parameters** | [**ReportsStatsParametersParameter**](../../docs/models/.md) | Contains the parameters for report identification. |
**adAccountId** | `String` | Unique identifier of an ad account. | [optional parameter]
**pageSize** | `Integer` | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`]
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]

### Return type
[**ReportsStats200Response**](../../docs/models/ReportsStats200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `catalogs:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

