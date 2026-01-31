# Org.OpenAPITools.Api.SearchApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**SearchPartnerPins**](SearchApi.md#searchpartnerpins) | **GET** /search/partner/pins | Search pins by a given search term |
| [**SearchUserBoardsGet**](SearchApi.md#searchuserboardsget) | **GET** /search/boards | Search user&#39;s boards |
| [**SearchUserPinsList**](SearchApi.md#searchuserpinslist) | **GET** /search/pins | Search user&#39;s Pins |

<a id="searchpartnerpins"></a>
# **SearchPartnerPins**
> SearchPartnerPins200Response SearchPartnerPins (string term, string countryCode, string bookmark = null, string locale = null, int limit = null)

Search pins by a given search term

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>  Get the top 10 Pins by a given search term.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **term** | **string** | Search term to look up pins. |  |
| **countryCode** | **string** | Two letter country code (ISO 3166-1 alpha-2) |  |
| **bookmark** | **string** | Cursor used to fetch the next page of items | [optional]  |
| **locale** | **string** | Search locale. | [optional]  |
| **limit** | **int** | Max search result size | [optional] [default to 10] |

### Return type

[**SearchPartnerPins200Response**](SearchPartnerPins200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid pins |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="searchuserboardsget"></a>
# **SearchUserBoardsGet**
> SearchUserBoardsGet200Response SearchUserBoardsGet (string adAccountId = null, string bookmark = null, int pageSize = null, string query = null)

Search user's boards

Search for boards for the \"operation user_account\". This includes boards of all board types. - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/getting-started/using-business-access/'>Understanding Business Access</a> for more information.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **adAccountId** | **string** | Unique identifier of an ad account. | [optional]  |
| **bookmark** | **string** | Cursor used to fetch the next page of items | [optional]  |
| **pageSize** | **int** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **query** | **string** | Search query. Can contain pin description keywords or comma-separated pin IDs. | [optional]  |

### Return type

[**SearchUserBoardsGet200Response**](SearchUserBoardsGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="searchuserpinslist"></a>
# **SearchUserPinsList**
> PinsList200Response SearchUserPinsList (string query, string adAccountId = null, string bookmark = null)

Search user's Pins

Search for pins for the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/getting-started/using-business-access/'>Understanding Business Access</a> for more information.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **query** | **string** | Search query. Can contain pin description keywords or comma-separated pin IDs. |  |
| **adAccountId** | **string** | Unique identifier of an ad account. | [optional]  |
| **bookmark** | **string** | Cursor used to fetch the next page of items | [optional]  |

### Return type

[**PinsList200Response**](PinsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | User not found |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

