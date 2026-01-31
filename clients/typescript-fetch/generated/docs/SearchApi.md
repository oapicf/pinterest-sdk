# SearchApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**searchPartnerPins**](SearchApi.md#searchpartnerpins) | **GET** /search/partner/pins | Search pins by a given search term |
| [**searchUserBoardsGet**](SearchApi.md#searchuserboardsget) | **GET** /search/boards | Search user\&#39;s boards |
| [**searchUserPinsList**](SearchApi.md#searchuserpinslist) | **GET** /search/pins | Search user\&#39;s Pins |



## searchPartnerPins

> SearchPartnerPins200Response searchPartnerPins(term, countryCode, bookmark, locale, limit)

Search pins by a given search term

&lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;\&#39;/docs/getting-started/beta-and-advanced-access/\&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get the top 10 Pins by a given search term.

### Example

```ts
import {
  Configuration,
  SearchApi,
} from '';
import type { SearchPartnerPinsRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new SearchApi(config);

  const body = {
    // string | Search term to look up pins.
    term: term_example,
    // string | Two letter country code (ISO 3166-1 alpha-2)
    countryCode: US,
    // string | Cursor used to fetch the next page of items (optional)
    bookmark: bookmark_example,
    // string | Search locale. (optional)
    locale: locale_example,
    // number | Max search result size (optional)
    limit: 4,
  } satisfies SearchPartnerPinsRequest;

  try {
    const data = await api.searchPartnerPins(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **term** | `string` | Search term to look up pins. | [Defaults to `undefined`] |
| **countryCode** | `string` | Two letter country code (ISO 3166-1 alpha-2) | [Defaults to `undefined`] |
| **bookmark** | `string` | Cursor used to fetch the next page of items | [Optional] [Defaults to `undefined`] |
| **locale** | `string` | Search locale. | [Optional] [Defaults to `undefined`] |
| **limit** | `number` | Max search result size | [Optional] [Defaults to `10`] |

### Return type

[**SearchPartnerPins200Response**](SearchPartnerPins200Response.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid pins |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## searchUserBoardsGet

> SearchUserBoardsGet200Response searchUserBoardsGet(adAccountId, bookmark, pageSize, query)

Search user\&#39;s boards

Search for boards for the \&quot;operation user_account\&quot;. This includes boards of all board types. - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See &lt;a href&#x3D;\&#39;/docs/getting-started/using-business-access/\&#39;&gt;Understanding Business Access&lt;/a&gt; for more information.

### Example

```ts
import {
  Configuration,
  SearchApi,
} from '';
import type { SearchUserBoardsGetRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
    // To configure OAuth2 access token for authorization: client_credentials application
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new SearchApi(config);

  const body = {
    // string | Unique identifier of an ad account. (optional)
    adAccountId: adAccountId_example,
    // string | Cursor used to fetch the next page of items (optional)
    bookmark: bookmark_example,
    // number | Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional)
    pageSize: 56,
    // string | Search query. Can contain pin description keywords or comma-separated pin IDs. (optional)
    query: query_example,
  } satisfies SearchUserBoardsGetRequest;

  try {
    const data = await api.searchUserBoardsGet(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `string` | Unique identifier of an ad account. | [Optional] [Defaults to `undefined`] |
| **bookmark** | `string` | Cursor used to fetch the next page of items | [Optional] [Defaults to `undefined`] |
| **pageSize** | `number` | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | [Optional] [Defaults to `25`] |
| **query** | `string` | Search query. Can contain pin description keywords or comma-separated pin IDs. | [Optional] [Defaults to `undefined`] |

### Return type

[**SearchUserBoardsGet200Response**](SearchUserBoardsGet200Response.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode), [client_credentials application](../README.md#client_credentials-application)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## searchUserPinsList

> PinsList200Response searchUserPinsList(query, adAccountId, bookmark)

Search user\&#39;s Pins

Search for pins for the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See &lt;a href&#x3D;\&#39;/docs/getting-started/using-business-access/\&#39;&gt;Understanding Business Access&lt;/a&gt; for more information.

### Example

```ts
import {
  Configuration,
  SearchApi,
} from '';
import type { SearchUserPinsListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new SearchApi(config);

  const body = {
    // string | Search query. Can contain pin description keywords or comma-separated pin IDs.
    query: Plants,
    // string | Unique identifier of an ad account. (optional)
    adAccountId: adAccountId_example,
    // string | Cursor used to fetch the next page of items (optional)
    bookmark: bookmark_example,
  } satisfies SearchUserPinsListRequest;

  try {
    const data = await api.searchUserPinsList(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **query** | `string` | Search query. Can contain pin description keywords or comma-separated pin IDs. | [Defaults to `undefined`] |
| **adAccountId** | `string` | Unique identifier of an ad account. | [Optional] [Defaults to `undefined`] |
| **bookmark** | `string` | Cursor used to fetch the next page of items | [Optional] [Defaults to `undefined`] |

### Return type

[**PinsList200Response**](PinsList200Response.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | User not found |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

