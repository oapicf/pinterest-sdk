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

**This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**  Get the top 10 Pins by a given search term.

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
    countryCode: countryCode_example,
    // string | Cursor used to fetch the next page of items (optional)
    bookmark: bookmark_example,
    // string | Search locale. (optional)
    locale: locale_example,
    // number | Max search result size (optional)
    limit: 56,
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
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## searchUserBoardsGet

> BoardsList200Response searchUserBoardsGet(adAccountId, query, bookmark, pageSize)

Search user\&#39;s boards

Search for boards for the \&quot;operation user_account\&quot;. This includes boards of all board types. - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See [Understanding Business Access](/docs/getting-started/using-business-access/) for more information.

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
    // string | Search query. Can contain pin description keywords or comma-separated pin IDs. (optional)
    query: query_example,
    // string | Cursor used to fetch the next page of items (optional)
    bookmark: bookmark_example,
    // number | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
    pageSize: 56,
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
| **query** | `string` | Search query. Can contain pin description keywords or comma-separated pin IDs. | [Optional] [Defaults to `undefined`] |
| **bookmark** | `string` | Cursor used to fetch the next page of items | [Optional] [Defaults to `undefined`] |
| **pageSize** | `number` | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [Optional] [Defaults to `25`] |

### Return type

[**BoardsList200Response**](BoardsList200Response.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode), [client_credentials application](../README.md#client_credentials-application)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


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

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## searchUserPinsList

> PinsList200Response searchUserPinsList(query, adAccountId, bookmark)

Search user\&#39;s Pins

Search for pins for the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See [Understanding Business Access](/docs/getting-started/using-business-access/) for more information.

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
    query: query_example,
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
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

