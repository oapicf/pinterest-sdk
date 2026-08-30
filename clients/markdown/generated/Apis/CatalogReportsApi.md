# CatalogReportsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**reports/create**](CatalogReportsApi.md#reports/create) | **POST** /catalogs/reports | Build catalogs report |
| [**reports/get**](CatalogReportsApi.md#reports/get) | **GET** /catalogs/reports | Get catalogs report |
| [**reports/stats**](CatalogReportsApi.md#reports/stats) | **GET** /catalogs/reports/stats | List report stats |


<a name="reports/create"></a>
# **reports/create**
> CatalogsCreateReportResponse reports/create(CatalogsReportParameters, ad\_account\_id)

Build catalogs report

    Async request to create a report of the catalog owned by the \&quot;operation user_account\&quot;. This endpoint generates a report upon receiving the first approved request of the day. Any following requests with identical parameters will yield the same report even if data has changed. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: The All Items report is limited to 25 million items per catalog.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **CatalogsReportParameters** | [**CatalogsReportParameters**](../Models/CatalogsReportParameters.md)|  | |
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [optional] [default to null] |

### Return type

[**CatalogsCreateReportResponse**](../Models/CatalogsCreateReportResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="reports/get"></a>
# **reports/get**
> CatalogsReport reports/get(token, ad\_account\_id)

Get catalogs report

    This returns a URL to a report given a token returned from [Build catalogs report](/docs/api/v5/#operation/reports/create). You can use the URL to download the report. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **token** | **String**| Token returned from the post request creation call | [default to null] |
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [optional] [default to null] |

### Return type

[**CatalogsReport**](../Models/CatalogsReport.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="reports/stats"></a>
# **reports/stats**
> reports_stats_200_response reports/stats(parameters, ad\_account\_id, bookmark, page\_size)

List report stats

    List aggregated numbers of issues for a catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **parameters** | [**CatalogsReportStatsParameters**](../Models/.md)| Contains the parameters for report identification. | [default to null] |
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [optional] [default to null] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |

### Return type

[**reports_stats_200_response**](../Models/reports_stats_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

