# LabelsApi

All URIs are relative to *https://api.pinterest.com/v5*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**labelsCreate**](#labelscreate) | **POST** /ad_accounts/{ad_account_id}/labels | Create labels|
|[**labelsList**](#labelslist) | **GET** /ad_accounts/{ad_account_id}/labels | List labels|
|[**labelsUpdate**](#labelsupdate) | **PATCH** /ad_accounts/{ad_account_id}/labels | Update labels|

# **labelsCreate**
> LabelsResponse labelsCreate(labelCreateRequest)

<p> <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a> This endpoint is not available to all users. </p> <p>   Apply one or more labels to a campaign.   Currently, you can apply brand and custom labels. Future releases will provide more options.    <b>Note:</b> You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.  </p>

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
|**200** | Success |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **labelsList**
> LabelsList200Response labelsList()

<p>   <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>   This endpoint is not available to all users. </p> <p>   See a list of labels for assets that your account owns, and filter the list by different criteria. </p>

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
let entityStatuses: Array<'ACTIVE' | 'ARCHIVED'>; //Label entity status (optional) (default to undefined)
let labelTypes: Array<'BRAND' | 'CUSTOM'>; //Label type. (optional) (default to undefined)
let pageSize: number; //Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional) (default to 25)
let bookmark: string; //Cursor used to fetch the next page of items (optional) (default to undefined)

const { status, data } = await apiInstance.labelsList(
    adAccountId,
    campaignIds,
    labelIds,
    entityStatuses,
    labelTypes,
    pageSize,
    bookmark
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|
| **campaignIds** | **Array&lt;string&gt;** | List of Campaign Ids to use to filter the results. | (optional) defaults to undefined|
| **labelIds** | **Array&lt;string&gt;** | List of Label Ids to use to filter the results. | (optional) defaults to undefined|
| **entityStatuses** | **Array<&#39;ACTIVE&#39; &#124; &#39;ARCHIVED&#39;>** | Label entity status | (optional) defaults to undefined|
| **labelTypes** | **Array<&#39;BRAND&#39; &#124; &#39;CUSTOM&#39;>** | Label type. | (optional) defaults to undefined|
| **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25|
| **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined|


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
|**200** | Success |  -  |
|**400** | Invalid ad account ads parameters. |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **labelsUpdate**
> LabelsResponse labelsUpdate(labelUpdateRequest)

<p>   <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>   This endpoint is not available to all users. </p> <p>   Change the properties of one or more labels. </p>

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
|**200** | Success |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

