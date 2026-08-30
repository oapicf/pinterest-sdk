# CatalogReportsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**reportsCreate**](CatalogReportsApi.md#reportsCreate) | **POST** /catalogs/reports | Build catalogs report |
| [**reportsGet**](CatalogReportsApi.md#reportsGet) | **GET** /catalogs/reports | Get catalogs report |
| [**reportsStats**](CatalogReportsApi.md#reportsStats) | **GET** /catalogs/reports/stats | List report stats |


## Creating CatalogReportsApi

To initiate an instance of `CatalogReportsApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.CatalogReportsApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(CatalogReportsApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    CatalogReportsApi catalogReportsApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="reportsCreate"></a>
# **reportsCreate**
```java
Mono<CatalogsCreateReportResponse> CatalogReportsApi.reportsCreate(catalogsReportParametersadAccountId)
```

Build catalogs report

Async request to create a report of the catalog owned by the \&quot;operation user_account\&quot;. This endpoint generates a report upon receiving the first approved request of the day. Any following requests with identical parameters will yield the same report even if data has changed. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: The All Items report is limited to 25 million items per catalog.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **catalogsReportParameters** | [**CatalogsReportParameters**](CatalogsReportParameters.md)|  | |
| **adAccountId** | `String`| Unique identifier of an ad account. | [optional parameter] |


### Return type
[**CatalogsCreateReportResponse**](CatalogsCreateReportResponse.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `catalogs:read`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="reportsGet"></a>
# **reportsGet**
```java
Mono<CatalogsReport> CatalogReportsApi.reportsGet(tokenadAccountId)
```

Get catalogs report

This returns a URL to a report given a token returned from [Build catalogs report](/docs/api/v5/#operation/reports/create). You can use the URL to download the report. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **token** | `String`| Token returned from the post request creation call | |
| **adAccountId** | `String`| Unique identifier of an ad account. | [optional parameter] |


### Return type
[**CatalogsReport**](CatalogsReport.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `catalogs:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="reportsStats"></a>
# **reportsStats**
```java
Mono<ReportsStats200Response> CatalogReportsApi.reportsStats(parametersadAccountIdbookmarkpageSize)
```

List report stats

List aggregated numbers of issues for a catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **parameters** | [**CatalogsReportStatsParameters**](.md)| Contains the parameters for report identification. | |
| **adAccountId** | `String`| Unique identifier of an ad account. | [optional parameter] |
| **bookmark** | `String`| Cursor used to fetch the next page of items | [optional parameter] |
| **pageSize** | `Integer`| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional parameter] [default to `25`] |


### Return type
[**ReportsStats200Response**](ReportsStats200Response.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `catalogs:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

