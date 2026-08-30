# LabelsApi

All URIs are relative to *https://api.pinterest.com/v5*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**labelsApply**](#labelsapply) | **POST** /ad_accounts/{ad_account_id}/labels/{label_id}/apply | Apply label to entity|
|[**labelsCreate**](#labelscreate) | **POST** /ad_accounts/{ad_account_id}/labels | Create labels|
|[**labelsList**](#labelslist) | **GET** /ad_accounts/{ad_account_id}/labels | List labels|
|[**labelsRemove**](#labelsremove) | **POST** /ad_accounts/{ad_account_id}/labels/{label_id}/remove | Remove label from entities|
|[**labelsUpdate**](#labelsupdate) | **PATCH** /ad_accounts/{ad_account_id}/labels | Update labels|

# **labelsApply**
> LabeledEntities labelsApply(labeledEntitiesCreate)

  [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Apply a label to one or more campaigns.   Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/) in addition to campaigns.   Currently, you can apply **brand** and **custom** labels. Future releases will provide more options.    **Note:** You can only apply one brand label to a campaign. You can apply up to 30 custom labels to a campaign.

### Example

```typescript
import {
    LabelsApi,
    Configuration,
    LabeledEntitiesCreate
} from './api';

const configuration = new Configuration();
const apiInstance = new LabelsApi(configuration);

let adAccountId: string; // (default to undefined)
let labelId: string; //Label ID. (default to undefined)
let labeledEntitiesCreate: LabeledEntitiesCreate; //

const { status, data } = await apiInstance.labelsApply(
    adAccountId,
    labelId,
    labeledEntitiesCreate
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **labeledEntitiesCreate** | **LabeledEntitiesCreate**|  | |
| **adAccountId** | [**string**] |  | defaults to undefined|
| **labelId** | [**string**] | Label ID. | defaults to undefined|


### Return type

**LabeledEntities**

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

# **labelsCreate**
> LabelsResponse labelsCreate(labelCreateRequest)

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Apply one or more labels to a campaign. Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/). Currently, you can apply brand and custom labels. Future releases will provide more options.  **Note:** You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.

### Example

```typescript
import {
    LabelsApi,
    Configuration,
    LabelCreateRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new LabelsApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let labelCreateRequest: LabelCreateRequest; //

const { status, data } = await apiInstance.labelsCreate(
    adAccountId,
    labelCreateRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **labelCreateRequest** | **LabelCreateRequest**|  | |
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|


### Return type

**LabelsResponse**

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

# **labelsList**
> LabelsList200Response labelsList()

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  See a list of labels for assets that your account owns, and filter the list by different criteria. If no filter is provided, it will default to labels associated with the ad account id.

### Example

```typescript
import {
    LabelsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new LabelsApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let campaignIds: Array<string>; //List of Campaign Ids to use to filter the results. (optional) (default to undefined)
let labelIds: Array<string>; //List of Label Ids to use to filter the results. (optional) (default to undefined)
let entityStatuses: Array<QueryLabelEntityStatusesItems>; //Label entity status (optional) (default to undefined)
let labelTypes: Array<QueryLabelTypesItems>; //Label type. (optional) (default to undefined)
let bookmark: string; //Cursor used to fetch the next page of items (optional) (default to undefined)
let pageSize: number; //Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

const { status, data } = await apiInstance.labelsList(
    adAccountId,
    campaignIds,
    labelIds,
    entityStatuses,
    labelTypes,
    bookmark,
    pageSize
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|
| **campaignIds** | **Array&lt;string&gt;** | List of Campaign Ids to use to filter the results. | (optional) defaults to undefined|
| **labelIds** | **Array&lt;string&gt;** | List of Label Ids to use to filter the results. | (optional) defaults to undefined|
| **entityStatuses** | **Array&lt;QueryLabelEntityStatusesItems&gt;** | Label entity status | (optional) defaults to undefined|
| **labelTypes** | **Array&lt;QueryLabelTypesItems&gt;** | Label type. | (optional) defaults to undefined|
| **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined|
| **pageSize** | [**number**] | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | (optional) defaults to 25|


### Return type

**LabelsList200Response**

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

# **labelsRemove**
> LabeledEntities labelsRemove(labeledEntitiesCreate)

  [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Remove a label from one or more entities.

### Example

```typescript
import {
    LabelsApi,
    Configuration,
    LabeledEntitiesCreate
} from './api';

const configuration = new Configuration();
const apiInstance = new LabelsApi(configuration);

let adAccountId: string; // (default to undefined)
let labelId: string; //Label ID. (default to undefined)
let labeledEntitiesCreate: LabeledEntitiesCreate; //

const { status, data } = await apiInstance.labelsRemove(
    adAccountId,
    labelId,
    labeledEntitiesCreate
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **labeledEntitiesCreate** | **LabeledEntitiesCreate**|  | |
| **adAccountId** | [**string**] |  | defaults to undefined|
| **labelId** | [**string**] | Label ID. | defaults to undefined|


### Return type

**LabeledEntities**

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

# **labelsUpdate**
> LabelsResponse labelsUpdate(labelUpdateRequest)

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Change the properties of one or more labels.

### Example

```typescript
import {
    LabelsApi,
    Configuration,
    LabelUpdateRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new LabelsApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let labelUpdateRequest: LabelUpdateRequest; //

const { status, data } = await apiInstance.labelsUpdate(
    adAccountId,
    labelUpdateRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **labelUpdateRequest** | **LabelUpdateRequest**|  | |
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|


### Return type

**LabelsResponse**

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

