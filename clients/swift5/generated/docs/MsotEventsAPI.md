# MsotEventsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**msotEventsCreate**](MsotEventsAPI.md#msoteventscreate) | **POST** /ad_accounts/{ad_account_id}/msot/events | Send Measurement Source Of Truth (MSOT) attributed conversion events


# **msotEventsCreate**
```swift
    open class func msotEventsCreate(adAccountId: String, conversionMSOTEvents: ConversionMSOTEvents, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Send Measurement Source Of Truth (MSOT) attributed conversion events

<strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong> <br> <p>Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their <code>ad_account_id</code>. The request body should be a JSON object.</p> - These events will NOT be used in Reporting.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let conversionMSOTEvents = ConversionMSOTEvents(actionTimestamps: [123], adGroupId: "adGroupId_example", attributionModel: "attributionModel_example", attributionScope: "attributionScope_example", attributionScore: 123, campaignId: "campaignId_example", currency: Currency(), eventId: "eventId_example", eventName: "eventName_example", eventTimestamp: 123, totalEventTouchpoints: 123, totalEvents: 123, value: 123) // ConversionMSOTEvents | Attributed MSOT conversion events

// Send Measurement Source Of Truth (MSOT) attributed conversion events
MsotEventsAPI.msotEventsCreate(adAccountId: adAccountId, conversionMSOTEvents: conversionMSOTEvents) { (response, error) in
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
 **conversionMSOTEvents** | [**ConversionMSOTEvents**](ConversionMSOTEvents.md) | Attributed MSOT conversion events | 

### Return type

Void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

