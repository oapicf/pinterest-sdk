# MsotEventsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**msotEventsCreate**](MsotEventsAPI.md#msoteventscreate) | **POST** /ad_accounts/{ad_account_id}/msot/events | Send Measurement Source Of Truth (MSOT) attributed conversion events


# **msotEventsCreate**
```swift
    open class func msotEventsCreate(adAccountId: String, conversionMSOTEventsCreate: ConversionMSOTEventsCreate, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse)
```

Send Measurement Source Of Truth (MSOT) attributed conversion events

**This feature is currently in beta and not available to all apps.** If you are interested in joining the beta, reach out to your Pinterest account manager.  Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their `ad_account_id`. The request body should be a JSON object.  - These events will not be used in Reporting.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let conversionMSOTEventsCreate = ConversionMSOTEventsCreate(actionTimestamps: [123], adGroupId: "adGroupId_example", attributionModel: AttributionModel(), attributionScope: AttributionScope(), attributionScore: 123, campaignId: "campaignId_example", clickWindow: "clickWindow_example", currency: Currency(), eventId: "eventId_example", eventName: MsotEventName(), eventTimestamp: 123, totalEventTouchpoints: 123, totalEvents: 123, totalEventsFractional: 123, value: 123, viewWindow: "viewWindow_example") // ConversionMSOTEventsCreate | 

// Send Measurement Source Of Truth (MSOT) attributed conversion events
do {
    try await MsotEventsAPI.msotEventsCreate(adAccountId: adAccountId, conversionMSOTEventsCreate: conversionMSOTEventsCreate)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String** | Unique identifier of an ad account. | 
 **conversionMSOTEventsCreate** | [**ConversionMSOTEventsCreate**](ConversionMSOTEventsCreate.md) |  | 

### Return type

Void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

