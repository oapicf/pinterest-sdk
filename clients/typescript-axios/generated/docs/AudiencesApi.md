# AudiencesApi

All URIs are relative to *https://api.pinterest.com/v5*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**audiencesCreate**](#audiencescreate) | **POST** /ad_accounts/{ad_account_id}/audiences | Create audience|
|[**audiencesGet**](#audiencesget) | **GET** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Get audience|
|[**audiencesList**](#audienceslist) | **GET** /ad_accounts/{ad_account_id}/audiences | List audiences|
|[**audiencesUpdate**](#audiencesupdate) | **PATCH** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Update audience|

# **audiencesCreate**
> AdAccountsAudience audiencesCreate(adAccountsAudienceCreate)

Create a new audience for the ad account.

### Example

```typescript
import {
    AudiencesApi,
    Configuration,
    AdAccountsAudienceCreate
} from './api';

const configuration = new Configuration();
const apiInstance = new AudiencesApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let adAccountsAudienceCreate: AdAccountsAudienceCreate; //

const { status, data } = await apiInstance.audiencesCreate(
    adAccountId,
    adAccountsAudienceCreate
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adAccountsAudienceCreate** | **AdAccountsAudienceCreate**|  | |
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|


### Return type

**AdAccountsAudience**

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

# **audiencesGet**
> AdAccountsAudience audiencesGet()

Get a specific audience given the audience ID.

### Example

```typescript
import {
    AudiencesApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new AudiencesApi(configuration);

let audienceId: string; //Audience ID. (default to undefined)
let adAccountId: string; //Unique identifier of an ad account. (default to undefined)

const { status, data } = await apiInstance.audiencesGet(
    audienceId,
    adAccountId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **audienceId** | [**string**] | Audience ID. | defaults to undefined|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|


### Return type

**AdAccountsAudience**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

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

# **audiencesList**
> AudiencesList200Response audiencesList()

Get list of audiences for the ad account.

### Example

```typescript
import {
    AudiencesApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new AudiencesApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let bookmark: string; //Cursor used to fetch the next page of items (optional) (default to undefined)
let pageSize: number; //Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)
let order: PinterestLibPaginationOrder; //The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional) (default to undefined)
let ownershipType: AudienceOwnershipType; // (optional) (default to undefined)
let excludeNca: boolean; //When true, excludes audiences derived from new customer acquisition (expanded matching) customer lists from the result. Defaults to false (include all). (optional) (default to false)

const { status, data } = await apiInstance.audiencesList(
    adAccountId,
    bookmark,
    pageSize,
    order,
    ownershipType,
    excludeNca
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|
| **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined|
| **pageSize** | [**number**] | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | (optional) defaults to 25|
| **order** | **PinterestLibPaginationOrder** | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | (optional) defaults to undefined|
| **ownershipType** | **AudienceOwnershipType** |  | (optional) defaults to undefined|
| **excludeNca** | [**boolean**] | When true, excludes audiences derived from new customer acquisition (expanded matching) customer lists from the result. Defaults to false (include all). | (optional) defaults to false|


### Return type

**AudiencesList200Response**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

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

# **audiencesUpdate**
> AdAccountsAudience audiencesUpdate(adAccountsAudienceUpdate)

Update an existing audience for the ad account.

### Example

```typescript
import {
    AudiencesApi,
    Configuration,
    AdAccountsAudienceUpdate
} from './api';

const configuration = new Configuration();
const apiInstance = new AudiencesApi(configuration);

let audienceId: string; //Audience ID. (default to undefined)
let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let adAccountsAudienceUpdate: AdAccountsAudienceUpdate; //

const { status, data } = await apiInstance.audiencesUpdate(
    audienceId,
    adAccountId,
    adAccountsAudienceUpdate
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adAccountsAudienceUpdate** | **AdAccountsAudienceUpdate**|  | |
| **audienceId** | [**string**] | Audience ID. | defaults to undefined|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|


### Return type

**AdAccountsAudience**

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

