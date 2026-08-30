# CustomerSegmentApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**customerSegmentCreate**](CustomerSegmentApi.md#customersegmentcreate) | **POST** /ad_accounts/{ad_account_id}/customer_segments | Create customer segments |
| [**customerSegmentList**](CustomerSegmentApi.md#customersegmentlist) | **GET** /ad_accounts/{ad_account_id}/customer_segments | List customer segments |
| [**customerSegmentUpdate**](CustomerSegmentApi.md#customersegmentupdate) | **PATCH** /ad_accounts/{ad_account_id}/customer_segments | Update customer segments |



## customerSegmentCreate

> CustomerSegment customerSegmentCreate(adAccountId, customerSegmentCreate)

Create customer segments

Customer segments allow advertisers to define existing customers for Pinterest Performance+ campaigns. Customer segments are made up of audience lists.

### Example

```ts
import {
  Configuration,
  CustomerSegmentApi,
} from '';
import type { CustomerSegmentCreateRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new CustomerSegmentApi(config);

  const body = {
    // string | Unique identifier of an ad account.
    adAccountId: adAccountId_example,
    // CustomerSegmentCreate
    customerSegmentCreate: ...,
  } satisfies CustomerSegmentCreateRequest;

  try {
    const data = await api.customerSegmentCreate(body);
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
| **adAccountId** | `string` | Unique identifier of an ad account. | [Defaults to `undefined`] |
| **customerSegmentCreate** | [CustomerSegmentCreate](CustomerSegmentCreate.md) |  | |

### Return type

[**CustomerSegment**](CustomerSegment.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **201** | Resource create operation completed successfully. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## customerSegmentList

> CustomerSegmentList200Response customerSegmentList(adAccountId, bookmark, pageSize, order, includeSizing, searchQuery)

List customer segments

Get a list of the customer segments in the specified &#x60;ad_account_id&#x60;.

### Example

```ts
import {
  Configuration,
  CustomerSegmentApi,
} from '';
import type { CustomerSegmentListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new CustomerSegmentApi(config);

  const body = {
    // string | Unique identifier of an ad account.
    adAccountId: adAccountId_example,
    // string | Cursor used to fetch the next page of items (optional)
    bookmark: bookmark_example,
    // number | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
    pageSize: 56,
    // PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
    order: ...,
    // boolean | Include audience sizing in result or not (optional)
    includeSizing: true,
    // string | Search query. Can contain pin description keywords or comma-separated pin IDs. (optional)
    searchQuery: searchQuery_example,
  } satisfies CustomerSegmentListRequest;

  try {
    const data = await api.customerSegmentList(body);
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
| **adAccountId** | `string` | Unique identifier of an ad account. | [Defaults to `undefined`] |
| **bookmark** | `string` | Cursor used to fetch the next page of items | [Optional] [Defaults to `undefined`] |
| **pageSize** | `number` | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [Optional] [Defaults to `25`] |
| **order** | `PinterestLibPaginationOrder` | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [Optional] [Defaults to `undefined`] [Enum: ASCENDING, DESCENDING] |
| **includeSizing** | `boolean` | Include audience sizing in result or not | [Optional] [Defaults to `false`] |
| **searchQuery** | `string` | Search query. Can contain pin description keywords or comma-separated pin IDs. | [Optional] [Defaults to `undefined`] |

### Return type

[**CustomerSegmentList200Response**](CustomerSegmentList200Response.md)

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


## customerSegmentUpdate

> customerSegmentUpdate(adAccountId, customerSegmentUpdateRequestUpdateWithRequiredBody)

Update customer segments

Update the customer segment given advertiser ID and customer segment ID

### Example

```ts
import {
  Configuration,
  CustomerSegmentApi,
} from '';
import type { CustomerSegmentUpdateRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new CustomerSegmentApi(config);

  const body = {
    // string | Unique identifier of an ad account.
    adAccountId: adAccountId_example,
    // CustomerSegmentUpdateRequestUpdateWithRequiredBody
    customerSegmentUpdateRequestUpdateWithRequiredBody: ...,
  } satisfies CustomerSegmentUpdateRequest;

  try {
    const data = await api.customerSegmentUpdate(body);
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
| **adAccountId** | `string` | Unique identifier of an ad account. | [Defaults to `undefined`] |
| **customerSegmentUpdateRequestUpdateWithRequiredBody** | [CustomerSegmentUpdateRequestUpdateWithRequiredBody](CustomerSegmentUpdateRequestUpdateWithRequiredBody.md) |  | |

### Return type

`void` (Empty response body)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: `application/json`
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

