# PromotionsApi

All URIs are relative to *https://api.pinterest.com/v5*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**promotionsCreate**](#promotionscreate) | **POST** /ad_accounts/{ad_account_id}/promotions | Create promotions|
|[**promotionsDelete**](#promotionsdelete) | **DELETE** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Delete promotion by id|
|[**promotionsGet**](#promotionsget) | **GET** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Get promotion by id|
|[**promotionsList**](#promotionslist) | **GET** /ad_accounts/{ad_account_id}/promotions | Get promotions|
|[**promotionsUpdate**](#promotionsupdate) | **PATCH** /ad_accounts/{ad_account_id}/promotions | Update promotions|

# **promotionsCreate**
> PromotionsResponse promotionsCreate(promotionCreate)

Create multiple new promotions.

### Example

```typescript
import {
    PromotionsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new PromotionsApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let promotionCreate: Array<PromotionCreate>; //

const { status, data } = await apiInstance.promotionsCreate(
    adAccountId,
    promotionCreate
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **promotionCreate** | **Array<PromotionCreate>**|  | |
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|


### Return type

**PromotionsResponse**

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

# **promotionsDelete**
> Promotion promotionsDelete()

Delete a promotion within Pinterest.

### Example

```typescript
import {
    PromotionsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new PromotionsApi(configuration);

let promotionId: string; //Promotion ID (default to undefined)
let adAccountId: string; //Unique identifier of an ad account. (default to undefined)

const { status, data } = await apiInstance.promotionsDelete(
    promotionId,
    adAccountId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **promotionId** | [**string**] | Promotion ID | defaults to undefined|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|


### Return type

**Promotion**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**204** | Resource deleted successfully. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **promotionsGet**
> Promotion promotionsGet()

Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.

### Example

```typescript
import {
    PromotionsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new PromotionsApi(configuration);

let promotionId: string; //Promotion ID (default to undefined)
let adAccountId: string; //Unique identifier of an ad account. (default to undefined)

const { status, data } = await apiInstance.promotionsGet(
    promotionId,
    adAccountId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **promotionId** | [**string**] | Promotion ID | defaults to undefined|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|


### Return type

**Promotion**

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

# **promotionsList**
> PromotionsList200Response promotionsList()

Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.

### Example

```typescript
import {
    PromotionsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new PromotionsApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let bookmark: string; //Cursor used to fetch the next page of items (optional) (default to undefined)
let pageSize: number; //Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)
let order: PinterestLibPaginationOrder; //The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional) (default to undefined)

const { status, data } = await apiInstance.promotionsList(
    adAccountId,
    bookmark,
    pageSize,
    order
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|
| **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined|
| **pageSize** | [**number**] | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | (optional) defaults to 25|
| **order** | **PinterestLibPaginationOrder** | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | (optional) defaults to undefined|


### Return type

**PromotionsList200Response**

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

# **promotionsUpdate**
> PromotionsResponse promotionsUpdate(promotionBatchUpdate)

Update multiple promotions.

### Example

```typescript
import {
    PromotionsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new PromotionsApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let promotionBatchUpdate: Array<PromotionBatchUpdate>; //

const { status, data } = await apiInstance.promotionsUpdate(
    adAccountId,
    promotionBatchUpdate
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **promotionBatchUpdate** | **Array<PromotionBatchUpdate>**|  | |
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|


### Return type

**PromotionsResponse**

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

