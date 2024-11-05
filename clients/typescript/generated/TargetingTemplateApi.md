# .TargetingTemplateApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**targetingTemplateCreate**](TargetingTemplateApi.md#targetingTemplateCreate) | **POST** /ad_accounts/{ad_account_id}/targeting_templates | Create targeting templates
[**targetingTemplateList**](TargetingTemplateApi.md#targetingTemplateList) | **GET** /ad_accounts/{ad_account_id}/targeting_templates | List targeting templates
[**targetingTemplateUpdate**](TargetingTemplateApi.md#targetingTemplateUpdate) | **PATCH** /ad_accounts/{ad_account_id}/targeting_templates | Update targeting templates


# **targetingTemplateCreate**
> TargetingTemplateGetResponseData targetingTemplateCreate(targetingTemplateCreate)

<p>Targeting templates allow advertisers to save a set of targeting details including audience lists,  keywords & interest, demographics, and placements to use more than once during the campaign creation process.</p>  <p>Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse   performance targeting from prior campaigns for new campaigns.</p>

### Example


```typescript
import { createConfiguration, TargetingTemplateApi } from '';
import type { TargetingTemplateApiTargetingTemplateCreateRequest } from '';

const configuration = createConfiguration();
const apiInstance = new TargetingTemplateApi(configuration);

const request: TargetingTemplateApiTargetingTemplateCreateRequest = {
    // Unique identifier of an ad account.
  adAccountId: "4",
    // targeting template creation entity
  targetingTemplateCreate: ,
};

const data = await apiInstance.targetingTemplateCreate(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targetingTemplateCreate** | **TargetingTemplateCreate**| targeting template creation entity |
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined


### Return type

**TargetingTemplateGetResponseData**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid ad account id. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **targetingTemplateList**
> TargetingTemplateList200Response targetingTemplateList()

Get a list of the targeting templates in the specified <code>ad_account_id</code>

### Example


```typescript
import { createConfiguration, TargetingTemplateApi } from '';
import type { TargetingTemplateApiTargetingTemplateListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new TargetingTemplateApi(configuration);

const request: TargetingTemplateApiTargetingTemplateListRequest = {
    // Unique identifier of an ad account.
  adAccountId: "4",
    // The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
  order: "ASCENDING",
    // Include audience sizing in result or not (optional)
  includeSizing: false,
    // Search keyword for targeting templates (optional)
  searchQuery: "gaming",
    // Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional)
  pageSize: 25,
    // Cursor used to fetch the next page of items (optional)
  bookmark: "bookmark_example",
};

const data = await apiInstance.targetingTemplateList(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined
 **order** | [**&#39;ASCENDING&#39; | &#39;DESCENDING&#39;**]**Array<&#39;ASCENDING&#39; &#124; &#39;DESCENDING&#39;>** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | (optional) defaults to undefined
 **includeSizing** | [**boolean**] | Include audience sizing in result or not | (optional) defaults to false
 **searchQuery** | [**string**] | Search keyword for targeting templates | (optional) defaults to undefined
 **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25
 **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined


### Return type

**TargetingTemplateList200Response**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid ad account id. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **targetingTemplateUpdate**
> void targetingTemplateUpdate(targetingTemplateUpdateRequest)

<p>Update the targeting template given advertiser ID and targeting template ID</p>

### Example


```typescript
import { createConfiguration, TargetingTemplateApi } from '';
import type { TargetingTemplateApiTargetingTemplateUpdateRequest } from '';

const configuration = createConfiguration();
const apiInstance = new TargetingTemplateApi(configuration);

const request: TargetingTemplateApiTargetingTemplateUpdateRequest = {
    // Unique identifier of an ad account.
  adAccountId: "4",
    // Operation type and targeting template ID
  targetingTemplateUpdateRequest: {
    operationType: "REMOVE",
    id: "643",
  },
};

const data = await apiInstance.targetingTemplateUpdate(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targetingTemplateUpdateRequest** | **TargetingTemplateUpdateRequest**| Operation type and targeting template ID |
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined


### Return type

**void**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid ad account id. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


