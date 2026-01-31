# .MsotEventsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**msotEventsCreate**](MsotEventsApi.md#msotEventsCreate) | **POST** /ad_accounts/{ad_account_id}/msot/events | Send Measurement Source Of Truth (MSOT) attributed conversion events


# **msotEventsCreate**
> void msotEventsCreate(conversionMSOTEvents)

<strong>This feature is currently in beta and not available to all apps, if you\'re interested in joining the beta, please reach out to your Pinterest account manager.</strong> <br> <p>Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their <code>ad_account_id</code>. The request body should be a JSON object.</p> - These events will NOT be used in Reporting.

### Example


```typescript
import { createConfiguration, MsotEventsApi } from '';
import type { MsotEventsApiMsotEventsCreateRequest } from '';

const configuration = createConfiguration();
const apiInstance = new MsotEventsApi(configuration);

const request: MsotEventsApiMsotEventsCreateRequest = {
    // Unique identifier of an ad account.
  adAccountId: "4",
    // Attributed MSOT conversion events
  conversionMSOTEvents: {
    actionTimestamps: [1451410040],
    adGroupId: "2680060704746",
    attributionModel: "multi_touch",
    attributionScope: "click",
    attributionScore: 0.5,
    campaignId: "626736533506",
    currency: null,
    eventId: "eventId0001",
    eventName: "add_to_cart",
    eventTimestamp: 1451431341,
    totalEventTouchpoints: 2,
    totalEvents: 2,
    value: 123.45,
  },
};

const data = await apiInstance.msotEventsCreate(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversionMSOTEvents** | **ConversionMSOTEvents**| Attributed MSOT conversion events |
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
**400** | The request was invalid |  -  |
**401** | Not authorized to send MSOT conversion events |  -  |
**403** | Unauthorized access |  -  |
**429** | This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits within a short time window. |  -  |
**0** | Unexpected errors |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


