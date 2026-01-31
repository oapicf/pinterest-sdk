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
> PromotionsResponse promotionsCreate(promotionCreateRequest)

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
let promotionCreateRequest: Array<PromotionCreateRequest>; //List of promotions to create, size limit [1, 30].

const { status, data } = await apiInstance.promotionsCreate(
    adAccountId,
    promotionCreateRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **promotionCreateRequest** | **Array<PromotionCreateRequest>**| List of promotions to create, size limit [1, 30]. | |
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
|**200** | Success |  -  |
|**400** | Invalid create promotions request parameters. |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **promotionsDelete**
> promotionsDelete()

Delete a promotion within Pinterest.

### Example

```typescript
import {
    PromotionsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new PromotionsApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let promotionId: string; //Unique identifier of a promotion (default to undefined)

const { status, data } = await apiInstance.promotionsDelete(
    adAccountId,
    promotionId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|
| **promotionId** | [**string**] | Unique identifier of a promotion | defaults to undefined|


### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**204** | Promotion deleted successfully |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **promotionsGet**
> PromotionResponse promotionsGet()

Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.

### Example

```typescript
import {
    PromotionsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new PromotionsApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let promotionId: string; //Unique identifier of a promotion (default to undefined)

const { status, data } = await apiInstance.promotionsGet(
    adAccountId,
    promotionId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|
| **promotionId** | [**string**] | Unique identifier of a promotion | defaults to undefined|


### Return type

**PromotionResponse**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Success |  -  |
|**404** | The promotion ID for the given ad account ID was not found. |  -  |
|**0** | Unexpected error |  -  |

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
let pageSize: number; //Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional) (default to 25)
let order: 'ASCENDING' | 'DESCENDING'; //The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional) (default to undefined)
let bookmark: string; //Cursor used to fetch the next page of items (optional) (default to undefined)

const { status, data } = await apiInstance.promotionsList(
    adAccountId,
    pageSize,
    order,
    bookmark
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|
| **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25|
| **order** | [**&#39;ASCENDING&#39; | &#39;DESCENDING&#39;**]**Array<&#39;ASCENDING&#39; &#124; &#39;DESCENDING&#39;>** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | (optional) defaults to undefined|
| **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined|


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
|**200** | Success |  -  |
|**400** | Invalid ad account promotions parameters. |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **promotionsUpdate**
> PromotionsResponse promotionsUpdate(promotionUpdateRequest)

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
let promotionUpdateRequest: Array<PromotionUpdateRequest>; //List of promotions to create, size limit [1, 30].

const { status, data } = await apiInstance.promotionsUpdate(
    adAccountId,
    promotionUpdateRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **promotionUpdateRequest** | **Array<PromotionUpdateRequest>**| List of promotions to create, size limit [1, 30]. | |
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
|**200** | Success |  -  |
|**400** | Invalid create promotions request parameters. |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

