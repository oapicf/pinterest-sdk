# MsotEventsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**msotEventsCreate**](MsotEventsApi.md#msotEventsCreate) | **POST** /ad_accounts/{ad_account_id}/msot/events | Send Measurement Source Of Truth (MSOT) attributed conversion events



## msotEventsCreate

> msotEventsCreate(adAccountId, conversionMSOTEvents)

Send Measurement Source Of Truth (MSOT) attributed conversion events

&lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt; &lt;br&gt; &lt;p&gt;Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their &lt;code&gt;ad_account_id&lt;/code&gt;. The request body should be a JSON object.&lt;/p&gt; - These events will NOT be used in Reporting.

### Example

```java
// Import classes:
//import org.openapitools.client.api.MsotEventsApi;

MsotEventsApi apiInstance = new MsotEventsApi();
String adAccountId = null; // String | Unique identifier of an ad account.
ConversionMSOTEvents conversionMSOTEvents = new ConversionMSOTEvents(); // ConversionMSOTEvents | Attributed MSOT conversion events
try {
    apiInstance.msotEventsCreate(adAccountId, conversionMSOTEvents);
} catch (ApiException e) {
    System.err.println("Exception when calling MsotEventsApi#msotEventsCreate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **conversionMSOTEvents** | [**ConversionMSOTEvents**](ConversionMSOTEvents.md)| Attributed MSOT conversion events |

### Return type

null (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

