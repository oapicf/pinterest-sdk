# ConversionsApi

All URIs are relative to *https://api.pinterest.com/v5*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**advertiserDefinedEventsCreate**](#advertiserdefinedeventscreate) | **POST** /ad_accounts/{ad_account_id}/advertiser_defined_events | Create advertiser defined events|
|[**advertiserDefinedEventsDelete**](#advertiserdefinedeventsdelete) | **DELETE** /ad_accounts/{ad_account_id}/advertiser_defined_events | Delete advertiser defined events|
|[**advertiserDefinedEventsGet**](#advertiserdefinedeventsget) | **GET** /ad_accounts/{ad_account_id}/advertiser_defined_events | Get advertiser defined events|
|[**advertiserDefinedEventsUpdate**](#advertiserdefinedeventsupdate) | **PATCH** /ad_accounts/{ad_account_id}/advertiser_defined_events | Update advertiser defined events|

# **advertiserDefinedEventsCreate**
> AdvertiserDefinedEventsCreate200Response advertiserDefinedEventsCreate(advertiserDefinedEventsCreateRequest)

Map advertiser defined events to standard events for the given ad account.

### Example

```typescript
import {
    ConversionsApi,
    Configuration,
    AdvertiserDefinedEventsCreateRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new ConversionsApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let advertiserDefinedEventsCreateRequest: AdvertiserDefinedEventsCreateRequest; //

const { status, data } = await apiInstance.advertiserDefinedEventsCreate(
    adAccountId,
    advertiserDefinedEventsCreateRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **advertiserDefinedEventsCreateRequest** | **AdvertiserDefinedEventsCreateRequest**|  | |
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|


### Return type

**AdvertiserDefinedEventsCreate200Response**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

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

# **advertiserDefinedEventsDelete**
> AdvertiserDefinedEventsCreate200Response advertiserDefinedEventsDelete()

Untrack advertiser defined events for the given ad account.

### Example

```typescript
import {
    ConversionsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new ConversionsApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let eventNames: Array<string>; //List of event names to delete (default to undefined)

const { status, data } = await apiInstance.advertiserDefinedEventsDelete(
    adAccountId,
    eventNames
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|
| **eventNames** | **Array&lt;string&gt;** | List of event names to delete | defaults to undefined|


### Return type

**AdvertiserDefinedEventsCreate200Response**

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

# **advertiserDefinedEventsGet**
> AdvertiserDefinedEventsGet200Response advertiserDefinedEventsGet()

Get advertiser defined events for the given ad account.

### Example

```typescript
import {
    ConversionsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new ConversionsApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)

const { status, data } = await apiInstance.advertiserDefinedEventsGet(
    adAccountId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|


### Return type

**AdvertiserDefinedEventsGet200Response**

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

# **advertiserDefinedEventsUpdate**
> AdvertiserDefinedEventsCreate200Response advertiserDefinedEventsUpdate(advertiserDefinedEventsCreateRequest)

Update advertiser defined event names or mappings for the given ad account.

### Example

```typescript
import {
    ConversionsApi,
    Configuration,
    AdvertiserDefinedEventsCreateRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new ConversionsApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let advertiserDefinedEventsCreateRequest: AdvertiserDefinedEventsCreateRequest; //

const { status, data } = await apiInstance.advertiserDefinedEventsUpdate(
    adAccountId,
    advertiserDefinedEventsCreateRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **advertiserDefinedEventsCreateRequest** | **AdvertiserDefinedEventsCreateRequest**|  | |
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|


### Return type

**AdvertiserDefinedEventsCreate200Response**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

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

