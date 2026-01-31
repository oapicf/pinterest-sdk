# .PromotionsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**promotionsCreate**](PromotionsApi.md#promotionsCreate) | **POST** /ad_accounts/{ad_account_id}/promotions | Create promotions
[**promotionsDelete**](PromotionsApi.md#promotionsDelete) | **DELETE** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Delete promotion by id
[**promotionsGet**](PromotionsApi.md#promotionsGet) | **GET** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Get promotion by id
[**promotionsList**](PromotionsApi.md#promotionsList) | **GET** /ad_accounts/{ad_account_id}/promotions | Get promotions
[**promotionsUpdate**](PromotionsApi.md#promotionsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/promotions | Update promotions


# **promotionsCreate**
> PromotionsResponse promotionsCreate(promotionCreateRequest)

Create multiple new promotions.

### Example


```typescript
import { createConfiguration, PromotionsApi } from '';
import type { PromotionsApiPromotionsCreateRequest } from '';

const configuration = createConfiguration();
const apiInstance = new PromotionsApi(configuration);

const request: PromotionsApiPromotionsCreateRequest = {
    // Unique identifier of an ad account.
  adAccountId: "4",
    // List of promotions to create, size limit [1, 30].
  promotionCreateRequest: [
    ,
  ],
};

const data = await apiInstance.promotionsCreate(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promotionCreateRequest** | **Array<PromotionCreateRequest>**| List of promotions to create, size limit [1, 30]. |
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined


### Return type

**PromotionsResponse**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid create promotions request parameters. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **promotionsDelete**
> void promotionsDelete()

Delete a promotion within Pinterest.

### Example


```typescript
import { createConfiguration, PromotionsApi } from '';
import type { PromotionsApiPromotionsDeleteRequest } from '';

const configuration = createConfiguration();
const apiInstance = new PromotionsApi(configuration);

const request: PromotionsApiPromotionsDeleteRequest = {
    // Unique identifier of an ad account.
  adAccountId: "4",
    // Unique identifier of a promotion
  promotionId: "4",
};

const data = await apiInstance.promotionsDelete(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined
 **promotionId** | [**string**] | Unique identifier of a promotion | defaults to undefined


### Return type

**void**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Promotion deleted successfully |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **promotionsGet**
> PromotionResponse promotionsGet()

Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.

### Example


```typescript
import { createConfiguration, PromotionsApi } from '';
import type { PromotionsApiPromotionsGetRequest } from '';

const configuration = createConfiguration();
const apiInstance = new PromotionsApi(configuration);

const request: PromotionsApiPromotionsGetRequest = {
    // Unique identifier of an ad account.
  adAccountId: "4",
    // Unique identifier of a promotion
  promotionId: "4",
};

const data = await apiInstance.promotionsGet(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined
 **promotionId** | [**string**] | Unique identifier of a promotion | defaults to undefined


### Return type

**PromotionResponse**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**404** | The promotion ID for the given ad account ID was not found. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **promotionsList**
> PromotionsList200Response promotionsList()

Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.

### Example


```typescript
import { createConfiguration, PromotionsApi } from '';
import type { PromotionsApiPromotionsListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new PromotionsApi(configuration);

const request: PromotionsApiPromotionsListRequest = {
    // Unique identifier of an ad account.
  adAccountId: "4",
    // Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional)
  pageSize: 25,
    // The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
  order: "ASCENDING",
    // Cursor used to fetch the next page of items (optional)
  bookmark: "bookmark_example",
};

const data = await apiInstance.promotionsList(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined
 **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25
 **order** | [**&#39;ASCENDING&#39; | &#39;DESCENDING&#39;**]**Array<&#39;ASCENDING&#39; &#124; &#39;DESCENDING&#39;>** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | (optional) defaults to undefined
 **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined


### Return type

**PromotionsList200Response**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid ad account promotions parameters. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **promotionsUpdate**
> PromotionsResponse promotionsUpdate(promotionUpdateRequest)

Update multiple promotions.

### Example


```typescript
import { createConfiguration, PromotionsApi } from '';
import type { PromotionsApiPromotionsUpdateRequest } from '';

const configuration = createConfiguration();
const apiInstance = new PromotionsApi(configuration);

const request: PromotionsApiPromotionsUpdateRequest = {
    // Unique identifier of an ad account.
  adAccountId: "4",
    // List of promotions to create, size limit [1, 30].
  promotionUpdateRequest: [
    ,
  ],
};

const data = await apiInstance.promotionsUpdate(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promotionUpdateRequest** | **Array<PromotionUpdateRequest>**| List of promotions to create, size limit [1, 30]. |
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined


### Return type

**PromotionsResponse**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid create promotions request parameters. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


