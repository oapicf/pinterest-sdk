# .SearchApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**searchPartnerPins**](SearchApi.md#searchPartnerPins) | **GET** /search/partner/pins | Search pins by a given search term
[**searchUserBoardsGet**](SearchApi.md#searchUserBoardsGet) | **GET** /search/boards | Search user\&#39;s boards
[**searchUserPinsList**](SearchApi.md#searchUserPinsList) | **GET** /search/pins | Search user\&#39;s Pins


# **searchPartnerPins**
> SearchPartnerPins200Response searchPartnerPins()

<strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/getting-started/beta-and-advanced-access/\'>Learn more</a>.</strong>  Get the top 10 Pins by a given search term.

### Example


```typescript
import { createConfiguration, SearchApi } from '';
import type { SearchApiSearchPartnerPinsRequest } from '';

const configuration = createConfiguration();
const apiInstance = new SearchApi(configuration);

const request: SearchApiSearchPartnerPinsRequest = {
    // Search term to look up pins.
  term: "term_example",
    // Two letter country code (ISO 3166-1 alpha-2)
  countryCode: "US",
    // Cursor used to fetch the next page of items (optional)
  bookmark: "bookmark_example",
    // Search locale. (optional)
  locale: "locale_example",
    // Max search result size (optional)
  limit: 4,
};

const data = await apiInstance.searchPartnerPins(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **term** | [**string**] | Search term to look up pins. | defaults to undefined
 **countryCode** | [**string**] | Two letter country code (ISO 3166-1 alpha-2) | defaults to undefined
 **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined
 **locale** | [**string**] | Search locale. | (optional) defaults to undefined
 **limit** | [**number**] | Max search result size | (optional) defaults to 10


### Return type

**SearchPartnerPins200Response**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid pins |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **searchUserBoardsGet**
> SearchUserBoardsGet200Response searchUserBoardsGet()

Search for boards for the \"operation user_account\". This includes boards of all board types. - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href=\'/docs/getting-started/using-business-access/\'>Understanding Business Access</a> for more information.

### Example


```typescript
import { createConfiguration, SearchApi } from '';
import type { SearchApiSearchUserBoardsGetRequest } from '';

const configuration = createConfiguration();
const apiInstance = new SearchApi(configuration);

const request: SearchApiSearchUserBoardsGetRequest = {
    // Unique identifier of an ad account. (optional)
  adAccountId: "4",
    // Cursor used to fetch the next page of items (optional)
  bookmark: "bookmark_example",
    // Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional)
  pageSize: 25,
    // Search query. Can contain pin description keywords or comma-separated pin IDs. (optional)
  query: "query_example",
};

const data = await apiInstance.searchUserBoardsGet(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined
 **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined
 **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25
 **query** | [**string**] | Search query. Can contain pin description keywords or comma-separated pin IDs. | (optional) defaults to undefined


### Return type

**SearchUserBoardsGet200Response**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2), [client_credentials](README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | response |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **searchUserPinsList**
> PinsList200Response searchUserPinsList()

Search for pins for the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href=\'/docs/getting-started/using-business-access/\'>Understanding Business Access</a> for more information.

### Example


```typescript
import { createConfiguration, SearchApi } from '';
import type { SearchApiSearchUserPinsListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new SearchApi(configuration);

const request: SearchApiSearchUserPinsListRequest = {
    // Search query. Can contain pin description keywords or comma-separated pin IDs.
  query: "Plants",
    // Unique identifier of an ad account. (optional)
  adAccountId: "4",
    // Cursor used to fetch the next page of items (optional)
  bookmark: "bookmark_example",
};

const data = await apiInstance.searchUserPinsList(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | [**string**] | Search query. Can contain pin description keywords or comma-separated pin IDs. | defaults to undefined
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined
 **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined


### Return type

**PinsList200Response**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**404** | User not found |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


