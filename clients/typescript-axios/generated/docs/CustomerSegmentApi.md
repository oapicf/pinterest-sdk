# CustomerSegmentApi

All URIs are relative to *https://api.pinterest.com/v5*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**customerSegmentCreate**](#customersegmentcreate) | **POST** /ad_accounts/{ad_account_id}/customer_segments | Create customer segments|
|[**customerSegmentList**](#customersegmentlist) | **GET** /ad_accounts/{ad_account_id}/customer_segments | List customer segments|
|[**customerSegmentUpdate**](#customersegmentupdate) | **PATCH** /ad_accounts/{ad_account_id}/customer_segments | Update customer segments|

# **customerSegmentCreate**
> CustomerSegment customerSegmentCreate(customerSegmentCreate)

Customer segments allow advertisers to define existing customers for Pinterest Performance+ campaigns. Customer segments are made up of audience lists.

### Example

```typescript
import {
    CustomerSegmentApi,
    Configuration,
    CustomerSegmentCreate
} from './api';

const configuration = new Configuration();
const apiInstance = new CustomerSegmentApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let customerSegmentCreate: CustomerSegmentCreate; //

const { status, data } = await apiInstance.customerSegmentCreate(
    adAccountId,
    customerSegmentCreate
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **customerSegmentCreate** | **CustomerSegmentCreate**|  | |
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|


### Return type

**CustomerSegment**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**201** | Resource create operation completed successfully. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **customerSegmentList**
> CustomerSegmentList200Response customerSegmentList()

Get a list of the customer segments in the specified `ad_account_id`.

### Example

```typescript
import {
    CustomerSegmentApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new CustomerSegmentApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let bookmark: string; //Cursor used to fetch the next page of items (optional) (default to undefined)
let pageSize: number; //Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)
let order: PinterestLibPaginationOrder; //The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional) (default to undefined)
let includeSizing: boolean; //Include audience sizing in result or not (optional) (default to false)
let searchQuery: string; //Search query. Can contain pin description keywords or comma-separated pin IDs. (optional) (default to undefined)

const { status, data } = await apiInstance.customerSegmentList(
    adAccountId,
    bookmark,
    pageSize,
    order,
    includeSizing,
    searchQuery
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|
| **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined|
| **pageSize** | [**number**] | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | (optional) defaults to 25|
| **order** | **PinterestLibPaginationOrder** | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | (optional) defaults to undefined|
| **includeSizing** | [**boolean**] | Include audience sizing in result or not | (optional) defaults to false|
| **searchQuery** | [**string**] | Search query. Can contain pin description keywords or comma-separated pin IDs. | (optional) defaults to undefined|


### Return type

**CustomerSegmentList200Response**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **customerSegmentUpdate**
> customerSegmentUpdate(customerSegmentUpdateRequestUpdateWithRequiredBody)

Update the customer segment given advertiser ID and customer segment ID

### Example

```typescript
import {
    CustomerSegmentApi,
    Configuration,
    CustomerSegmentUpdateRequestUpdateWithRequiredBody
} from './api';

const configuration = new Configuration();
const apiInstance = new CustomerSegmentApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let customerSegmentUpdateRequestUpdateWithRequiredBody: CustomerSegmentUpdateRequestUpdateWithRequiredBody; //

const { status, data } = await apiInstance.customerSegmentUpdate(
    adAccountId,
    customerSegmentUpdateRequestUpdateWithRequiredBody
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **customerSegmentUpdateRequestUpdateWithRequiredBody** | **CustomerSegmentUpdateRequestUpdateWithRequiredBody**|  | |
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|


### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

