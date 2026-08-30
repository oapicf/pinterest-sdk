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

**This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**  Get the top 10 Pins by a given search term.


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
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="searchuserboardsget"></a>
# **SearchUserBoardsGet**
> BoardsList200Response SearchUserBoardsGet (string adAccountId = null, string query = null, string bookmark = null, int pageSize = null)

Search user's boards

Search for boards for the \"operation user_account\". This includes boards of all board types. - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See [Understanding Business Access](/docs/getting-started/using-business-access/) for more information.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **adAccountId** | **string** | Unique identifier of an ad account. | [optional]  |
| **query** | **string** | Search query. Can contain pin description keywords or comma-separated pin IDs. | [optional]  |
| **bookmark** | **string** | Cursor used to fetch the next page of items | [optional]  |
| **pageSize** | **int** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |

### Return type

[**BoardsList200Response**](BoardsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="searchuserpinslist"></a>
# **SearchUserPinsList**
> PinsList200Response SearchUserPinsList (string query, string adAccountId = null, string bookmark = null)

Search user's Pins

Search for pins for the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See [Understanding Business Access](/docs/getting-started/using-business-access/) for more information.


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
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

