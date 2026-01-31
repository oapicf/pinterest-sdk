# ConversionsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**advertiserDefinedEventsGet**](ConversionsApi.md#advertiserDefinedEventsGet) | **GET** /ad_accounts/{ad_account_id}/advertiser_defined_events | Get advertiser defined events



## advertiserDefinedEventsGet

> AdvertiserDefinedEventsResponse advertiserDefinedEventsGet(adAccountId)

Get advertiser defined events

&lt;p&gt;Get advertiser defined events for the given ad account.&lt;/p&gt;

### Example

```java
// Import classes:
//import org.openapitools.client.api.ConversionsApi;

ConversionsApi apiInstance = new ConversionsApi();
String adAccountId = null; // String | Unique identifier of an ad account.
try {
    AdvertiserDefinedEventsResponse result = apiInstance.advertiserDefinedEventsGet(adAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversionsApi#advertiserDefinedEventsGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]

### Return type

[**AdvertiserDefinedEventsResponse**](AdvertiserDefinedEventsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

