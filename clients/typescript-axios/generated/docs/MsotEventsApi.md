# MsotEventsApi

All URIs are relative to *https://api.pinterest.com/v5*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**msotEventsCreate**](#msoteventscreate) | **POST** /ad_accounts/{ad_account_id}/msot/events | Send Measurement Source Of Truth (MSOT) attributed conversion events|

# **msotEventsCreate**
> msotEventsCreate(conversionMSOTEventsCreate)

**This feature is currently in beta and not available to all apps.** If you are interested in joining the beta, reach out to your Pinterest account manager.  Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their `ad_account_id`. The request body should be a JSON object.  - These events will not be used in Reporting.

### Example

```typescript
import {
    MsotEventsApi,
    Configuration,
    ConversionMSOTEventsCreate
} from './api';

const configuration = new Configuration();
const apiInstance = new MsotEventsApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let conversionMSOTEventsCreate: ConversionMSOTEventsCreate; //

const { status, data } = await apiInstance.msotEventsCreate(
    adAccountId,
    conversionMSOTEventsCreate
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **conversionMSOTEventsCreate** | **ConversionMSOTEventsCreate**|  | |
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
|**201** | Resource create operation completed successfully. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

