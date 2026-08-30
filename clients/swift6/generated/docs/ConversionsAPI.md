# ConversionsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**advertiserDefinedEventsCreate**](ConversionsAPI.md#advertiserdefinedeventscreate) | **POST** /ad_accounts/{ad_account_id}/advertiser_defined_events | Create advertiser defined events
[**advertiserDefinedEventsDelete**](ConversionsAPI.md#advertiserdefinedeventsdelete) | **DELETE** /ad_accounts/{ad_account_id}/advertiser_defined_events | Delete advertiser defined events
[**advertiserDefinedEventsGet**](ConversionsAPI.md#advertiserdefinedeventsget) | **GET** /ad_accounts/{ad_account_id}/advertiser_defined_events | Get advertiser defined events
[**advertiserDefinedEventsUpdate**](ConversionsAPI.md#advertiserdefinedeventsupdate) | **PATCH** /ad_accounts/{ad_account_id}/advertiser_defined_events | Update advertiser defined events


# **advertiserDefinedEventsCreate**
```swift
    open class func advertiserDefinedEventsCreate(adAccountId: String, advertiserDefinedEventsCreateRequest: AdvertiserDefinedEventsCreateRequest, completion: @escaping (_ data: AdvertiserDefinedEventsCreate200Response?, _ error: Error?) -> Void)
```

Create advertiser defined events

Map advertiser defined events to standard events for the given ad account.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let advertiserDefinedEventsCreateRequest = AdvertiserDefinedEventsCreateRequest(items: [AdvertiserDefinedEventInput(mappedConversionType: AdvertiserDefinedEventMappingType(), name: "name_example")]) // AdvertiserDefinedEventsCreateRequest | 

// Create advertiser defined events
ConversionsAPI.advertiserDefinedEventsCreate(adAccountId: adAccountId, advertiserDefinedEventsCreateRequest: advertiserDefinedEventsCreateRequest) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String** | Unique identifier of an ad account. | 
 **advertiserDefinedEventsCreateRequest** | [**AdvertiserDefinedEventsCreateRequest**](AdvertiserDefinedEventsCreateRequest.md) |  | 

### Return type

[**AdvertiserDefinedEventsCreate200Response**](AdvertiserDefinedEventsCreate200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **advertiserDefinedEventsDelete**
```swift
    open class func advertiserDefinedEventsDelete(adAccountId: String, eventNames: [String], completion: @escaping (_ data: AdvertiserDefinedEventsCreate200Response?, _ error: Error?) -> Void)
```

Delete advertiser defined events

Untrack advertiser defined events for the given ad account.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let eventNames = ["inner_example"] // [String] | List of event names to delete

// Delete advertiser defined events
ConversionsAPI.advertiserDefinedEventsDelete(adAccountId: adAccountId, eventNames: eventNames) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String** | Unique identifier of an ad account. | 
 **eventNames** | [**[String]**](String.md) | List of event names to delete | 

### Return type

[**AdvertiserDefinedEventsCreate200Response**](AdvertiserDefinedEventsCreate200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **advertiserDefinedEventsGet**
```swift
    open class func advertiserDefinedEventsGet(adAccountId: String, completion: @escaping (_ data: AdvertiserDefinedEventsGet200Response?, _ error: Error?) -> Void)
```

Get advertiser defined events

Get advertiser defined events for the given ad account.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.

// Get advertiser defined events
ConversionsAPI.advertiserDefinedEventsGet(adAccountId: adAccountId) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String** | Unique identifier of an ad account. | 

### Return type

[**AdvertiserDefinedEventsGet200Response**](AdvertiserDefinedEventsGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **advertiserDefinedEventsUpdate**
```swift
    open class func advertiserDefinedEventsUpdate(adAccountId: String, advertiserDefinedEventsCreateRequest: AdvertiserDefinedEventsCreateRequest, completion: @escaping (_ data: AdvertiserDefinedEventsCreate200Response?, _ error: Error?) -> Void)
```

Update advertiser defined events

Update advertiser defined event names or mappings for the given ad account.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let advertiserDefinedEventsCreateRequest = AdvertiserDefinedEventsCreateRequest(items: [AdvertiserDefinedEventInput(mappedConversionType: AdvertiserDefinedEventMappingType(), name: "name_example")]) // AdvertiserDefinedEventsCreateRequest | 

// Update advertiser defined events
ConversionsAPI.advertiserDefinedEventsUpdate(adAccountId: adAccountId, advertiserDefinedEventsCreateRequest: advertiserDefinedEventsCreateRequest) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String** | Unique identifier of an ad account. | 
 **advertiserDefinedEventsCreateRequest** | [**AdvertiserDefinedEventsCreateRequest**](AdvertiserDefinedEventsCreateRequest.md) |  | 

### Return type

[**AdvertiserDefinedEventsCreate200Response**](AdvertiserDefinedEventsCreate200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

