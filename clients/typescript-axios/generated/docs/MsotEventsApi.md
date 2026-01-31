# MsotEventsApi

All URIs are relative to *https://api.pinterest.com/v5*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**msotEventsCreate**](#msoteventscreate) | **POST** /ad_accounts/{ad_account_id}/msot/events | Send Measurement Source Of Truth (MSOT) attributed conversion events|

# **msotEventsCreate**
> msotEventsCreate(conversionMSOTEvents)

<strong>This feature is currently in beta and not available to all apps, if you\'re interested in joining the beta, please reach out to your Pinterest account manager.</strong> <br> <p>Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their <code>ad_account_id</code>. The request body should be a JSON object.</p> - These events will NOT be used in Reporting.

### Example

```typescript
import {
    MsotEventsApi,
    Configuration,
    ConversionMSOTEvents
} from './api';

const configuration = new Configuration();
const apiInstance = new MsotEventsApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let conversionMSOTEvents: ConversionMSOTEvents; //Attributed MSOT conversion events

const { status, data } = await apiInstance.msotEventsCreate(
    adAccountId,
    conversionMSOTEvents
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **conversionMSOTEvents** | **ConversionMSOTEvents**| Attributed MSOT conversion events | |
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
|**200** | Success |  -  |
|**400** | The request was invalid |  -  |
|**401** | Not authorized to send MSOT conversion events |  -  |
|**403** | Unauthorized access |  -  |
|**429** | This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits within a short time window. |  -  |
|**0** | Unexpected errors |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

