# .ConversionsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**advertiserDefinedEventsGet**](ConversionsApi.md#advertiserDefinedEventsGet) | **GET** /ad_accounts/{ad_account_id}/advertiser_defined_events | Get advertiser defined events


# **advertiserDefinedEventsGet**
> AdvertiserDefinedEventsResponse advertiserDefinedEventsGet()

<p>Get advertiser defined events for the given ad account.</p>

### Example


```typescript
import { createConfiguration, ConversionsApi } from '';
import type { ConversionsApiAdvertiserDefinedEventsGetRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ConversionsApi(configuration);

const request: ConversionsApiAdvertiserDefinedEventsGetRequest = {
    // Unique identifier of an ad account.
  adAccountId: "4",
};

const data = await apiInstance.advertiserDefinedEventsGet(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined


### Return type

**AdvertiserDefinedEventsResponse**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2), [client_credentials](README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


