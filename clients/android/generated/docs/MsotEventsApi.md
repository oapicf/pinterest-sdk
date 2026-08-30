# MsotEventsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**msotEventsCreate**](MsotEventsApi.md#msotEventsCreate) | **POST** /ad_accounts/{ad_account_id}/msot/events | Send Measurement Source Of Truth (MSOT) attributed conversion events



## msotEventsCreate

> msotEventsCreate(adAccountId, conversionMSOTEventsCreate)

Send Measurement Source Of Truth (MSOT) attributed conversion events

**This feature is currently in beta and not available to all apps.** If you are interested in joining the beta, reach out to your Pinterest account manager.  Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their &#x60;ad_account_id&#x60;. The request body should be a JSON object.  - These events will not be used in Reporting.

### Example

```java
// Import classes:
//import org.openapitools.client.api.MsotEventsApi;

MsotEventsApi apiInstance = new MsotEventsApi();
String adAccountId = null; // String | Unique identifier of an ad account.
ConversionMSOTEventsCreate conversionMSOTEventsCreate = new ConversionMSOTEventsCreate(); // ConversionMSOTEventsCreate | 
try {
    apiInstance.msotEventsCreate(adAccountId, conversionMSOTEventsCreate);
} catch (ApiException e) {
    System.err.println("Exception when calling MsotEventsApi#msotEventsCreate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **conversionMSOTEventsCreate** | [**ConversionMSOTEventsCreate**](ConversionMSOTEventsCreate.md)|  |

### Return type

null (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

