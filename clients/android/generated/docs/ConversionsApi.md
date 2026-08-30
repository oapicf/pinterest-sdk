# ConversionsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**advertiserDefinedEventsCreate**](ConversionsApi.md#advertiserDefinedEventsCreate) | **POST** /ad_accounts/{ad_account_id}/advertiser_defined_events | Create advertiser defined events
[**advertiserDefinedEventsDelete**](ConversionsApi.md#advertiserDefinedEventsDelete) | **DELETE** /ad_accounts/{ad_account_id}/advertiser_defined_events | Delete advertiser defined events
[**advertiserDefinedEventsGet**](ConversionsApi.md#advertiserDefinedEventsGet) | **GET** /ad_accounts/{ad_account_id}/advertiser_defined_events | Get advertiser defined events
[**advertiserDefinedEventsUpdate**](ConversionsApi.md#advertiserDefinedEventsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/advertiser_defined_events | Update advertiser defined events



## advertiserDefinedEventsCreate

> AdvertiserDefinedEventsCreate200Response advertiserDefinedEventsCreate(adAccountId, advertiserDefinedEventsCreateRequest)

Create advertiser defined events

Map advertiser defined events to standard events for the given ad account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ConversionsApi;

ConversionsApi apiInstance = new ConversionsApi();
String adAccountId = null; // String | Unique identifier of an ad account.
AdvertiserDefinedEventsCreateRequest advertiserDefinedEventsCreateRequest = new AdvertiserDefinedEventsCreateRequest(); // AdvertiserDefinedEventsCreateRequest | 
try {
    AdvertiserDefinedEventsCreate200Response result = apiInstance.advertiserDefinedEventsCreate(adAccountId, advertiserDefinedEventsCreateRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversionsApi#advertiserDefinedEventsCreate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **advertiserDefinedEventsCreateRequest** | [**AdvertiserDefinedEventsCreateRequest**](AdvertiserDefinedEventsCreateRequest.md)|  |

### Return type

[**AdvertiserDefinedEventsCreate200Response**](AdvertiserDefinedEventsCreate200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## advertiserDefinedEventsDelete

> AdvertiserDefinedEventsCreate200Response advertiserDefinedEventsDelete(adAccountId, eventNames)

Delete advertiser defined events

Untrack advertiser defined events for the given ad account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ConversionsApi;

ConversionsApi apiInstance = new ConversionsApi();
String adAccountId = null; // String | Unique identifier of an ad account.
List<String> eventNames = null; // List<String> | List of event names to delete
try {
    AdvertiserDefinedEventsCreate200Response result = apiInstance.advertiserDefinedEventsDelete(adAccountId, eventNames);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversionsApi#advertiserDefinedEventsDelete");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **eventNames** | [**List&lt;String&gt;**](String.md)| List of event names to delete | [default to null]

### Return type

[**AdvertiserDefinedEventsCreate200Response**](AdvertiserDefinedEventsCreate200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## advertiserDefinedEventsGet

> AdvertiserDefinedEventsGet200Response advertiserDefinedEventsGet(adAccountId)

Get advertiser defined events

Get advertiser defined events for the given ad account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ConversionsApi;

ConversionsApi apiInstance = new ConversionsApi();
String adAccountId = null; // String | Unique identifier of an ad account.
try {
    AdvertiserDefinedEventsGet200Response result = apiInstance.advertiserDefinedEventsGet(adAccountId);
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

[**AdvertiserDefinedEventsGet200Response**](AdvertiserDefinedEventsGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## advertiserDefinedEventsUpdate

> AdvertiserDefinedEventsCreate200Response advertiserDefinedEventsUpdate(adAccountId, advertiserDefinedEventsCreateRequest)

Update advertiser defined events

Update advertiser defined event names or mappings for the given ad account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ConversionsApi;

ConversionsApi apiInstance = new ConversionsApi();
String adAccountId = null; // String | Unique identifier of an ad account.
AdvertiserDefinedEventsCreateRequest advertiserDefinedEventsCreateRequest = new AdvertiserDefinedEventsCreateRequest(); // AdvertiserDefinedEventsCreateRequest | 
try {
    AdvertiserDefinedEventsCreate200Response result = apiInstance.advertiserDefinedEventsUpdate(adAccountId, advertiserDefinedEventsCreateRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversionsApi#advertiserDefinedEventsUpdate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **advertiserDefinedEventsCreateRequest** | [**AdvertiserDefinedEventsCreateRequest**](AdvertiserDefinedEventsCreateRequest.md)|  |

### Return type

[**AdvertiserDefinedEventsCreate200Response**](AdvertiserDefinedEventsCreate200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

