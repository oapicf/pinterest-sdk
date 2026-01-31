# ConversionEqsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**conversionEqsList**](ConversionEqsAPI.md#conversioneqslist) | **GET** /ad_accounts/{ad_account_id}/conversion_eqs | Get event quality score (EQS)


# **conversionEqsList**
```swift
    open class func conversionEqsList(lookbackPeriod: LookbackPeriodOptions, adAccountId: String, sourcePlatform: SourcePlatformOptions? = nil, ingestionSource: IngestionSourceOptions? = nil, completion: @escaping (_ data: [EventQualityScore]?, _ error: Error?) -> Void)
```

Get event quality score (EQS)

Get the Event Quality Score (EQS) of your conversion signals.  [Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let lookbackPeriod = LookbackPeriodOptions() // LookbackPeriodOptions | Lookback window (number of days).
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let sourcePlatform = SourcePlatformOptions() // SourcePlatformOptions | Source platform of event. (optional)
let ingestionSource = IngestionSourceOptions() // IngestionSourceOptions | Ingestion source of event. (optional)

// Get event quality score (EQS)
ConversionEqsAPI.conversionEqsList(lookbackPeriod: lookbackPeriod, adAccountId: adAccountId, sourcePlatform: sourcePlatform, ingestionSource: ingestionSource) { (response, error) in
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
 **lookbackPeriod** | [**LookbackPeriodOptions**](.md) | Lookback window (number of days). | 
 **adAccountId** | **String** | Unique identifier of an ad account. | 
 **sourcePlatform** | [**SourcePlatformOptions**](.md) | Source platform of event. | [optional] 
 **ingestionSource** | [**IngestionSourceOptions**](.md) | Ingestion source of event. | [optional] 

### Return type

[**[EventQualityScore]**](EventQualityScore.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

