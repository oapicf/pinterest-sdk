# ConversionEventsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**eventsCreate**](ConversionEventsAPI.md#eventscreate) | **POST** /ad_accounts/{ad_account_id}/events | Send conversions


# **eventsCreate**
```swift
    open class func eventsCreate(adAccountId: String, conversionEvents: ConversionEvents, test: Bool? = nil, completion: @escaping (_ data: ConversionApiResponse?, _ error: Error?) -> Void)
```

Send conversions

The Pinterest API offers advertisers a way to send Pinterest their conversion information (including web conversions, in-app conversions, or even offline conversions) based on their <code>ad_account_id</code>. The request body should be a JSON object. - This endpoint requires an <code>access_token</code> be generated through Ads Manager. Review the <a href=\"/docs/conversions/conversions/\">Conversions Guide</a> for more details. - The token's <code>user_account</code> must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Audience, Campaign. (Note that the token can be used across multiple ad accounts under an user ID.) - This endpoint has a rate limit of 5,000 calls per minute per ad account. - If the merchant is submitting this information using both Pinterest conversion tags and the Pinterest API, Pinterest will remove duplicate information before reporting. (Note that events that took place offline cannot be deduplicated.)

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let conversionEvents = ConversionEvents(data: [ConversionEvents_data_inner(eventName: "eventName_example", actionSource: "actionSource_example", eventTime: 123, eventId: "eventId_example", eventSourceUrl: "eventSourceUrl_example", optOut: false, partnerName: "partnerName_example", userData: ConversionEventsUserData(ph: ["ph_example"], ge: ["ge_example"], db: ["db_example"], ln: ["ln_example"], fn: ["fn_example"], ct: ["ct_example"], st: ["st_example"], zp: ["zp_example"], country: ["country_example"], externalId: ["externalId_example"], clickId: "clickId_example", partnerId: "partnerId_example"), customData: ConversionEvents_data_inner_custom_data(currency: "currency_example", value: "value_example", contentIds: ["contentIds_example"], contentName: "contentName_example", contentCategory: "contentCategory_example", contentBrand: "contentBrand_example", contents: [ConversionEvents_data_inner_custom_data_contents_inner(id: "id_example", itemPrice: "itemPrice_example", quantity: 123, itemName: "itemName_example", itemCategory: "itemCategory_example", itemBrand: "itemBrand_example")], numItems: 123, orderId: "orderId_example", searchString: "searchString_example", optOutType: "optOutType_example", np: "np_example"), appId: "appId_example", appName: "appName_example", appVersion: "appVersion_example", deviceBrand: "deviceBrand_example", deviceCarrier: "deviceCarrier_example", deviceModel: "deviceModel_example", deviceType: "deviceType_example", osVersion: "osVersion_example", wifi: false, language: "language_example")]) // ConversionEvents | Conversion events.
let test = true // Bool | Include query param ?test=true to mark the request as a test request. The events will not be recorded but the API will still return the same response messages. Use this mode to verify your requests are working and your events are constructed correctly. Warning: If you use this query parameter, be certain that it is off (set to false or deleted) before sending a legitimate (non-testing) request. (optional)

// Send conversions
ConversionEventsAPI.eventsCreate(adAccountId: adAccountId, conversionEvents: conversionEvents, test: test) { (response, error) in
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
 **conversionEvents** | [**ConversionEvents**](ConversionEvents.md) | Conversion events. | 
 **test** | **Bool** | Include query param ?test&#x3D;true to mark the request as a test request. The events will not be recorded but the API will still return the same response messages. Use this mode to verify your requests are working and your events are constructed correctly. Warning: If you use this query parameter, be certain that it is off (set to false or deleted) before sending a legitimate (non-testing) request. | [optional] 

### Return type

[**ConversionApiResponse**](ConversionApiResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [conversion_token](../README.md#conversion_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

