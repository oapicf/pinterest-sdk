# Org.OpenAPITools.Api.ConversionEventsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**EventsCreate**](ConversionEventsApi.md#eventscreate) | **POST** /ad_accounts/{ad_account_id}/events | Send conversions |

<a id="eventscreate"></a>
# **EventsCreate**
> ConversionApiResponse EventsCreate (string adAccountId, ConversionEvents conversionEvents, bool? test = null)

Send conversions

The Pinterest API offers advertisers a way to send Pinterest their conversion information (including web conversions, in-app conversions, or even offline conversions) based on their <code>ad_account_id</code>. The request body should be a JSON object. - This endpoint requires an <code>access_token</code> be generated through Ads Manager. Review the <a href=\"/docs/conversions/conversions/\">Conversions Guide</a> for more details. - The token's <code>user_account</code> must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Audience, Campaign. (Note that the token can be used across multiple ad accounts under an user ID.) - This endpoint has a rate limit of 5,000 calls per minute per ad account. - If the merchant is submitting this information using both Pinterest conversion tags and the Pinterest API, Pinterest will remove duplicate information before reporting. (Note that events that took place offline cannot be deduplicated.)

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class EventsCreateExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";
            // Configure Bearer token for authorization: conversion_token
            config.AccessToken = "YOUR_BEARER_TOKEN";

            var apiInstance = new ConversionEventsApi(config);
            var adAccountId = "adAccountId_example";  // string | Unique identifier of an ad account.
            var conversionEvents = new ConversionEvents(); // ConversionEvents | Conversion events.
            var test = true;  // bool? | Include query param ?test=true to mark the request as a test request. The events will not be recorded but the API will still return the same response messages. Use this mode to verify your requests are working and your events are constructed correctly. Warning: If you use this query parameter, be certain that it is off (set to false or deleted) before sending a legitimate (non-testing) request. (optional) 

            try
            {
                // Send conversions
                ConversionApiResponse result = apiInstance.EventsCreate(adAccountId, conversionEvents, test);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ConversionEventsApi.EventsCreate: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the EventsCreateWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Send conversions
    ApiResponse<ConversionApiResponse> response = apiInstance.EventsCreateWithHttpInfo(adAccountId, conversionEvents, test);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ConversionEventsApi.EventsCreateWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **adAccountId** | **string** | Unique identifier of an ad account. |  |
| **conversionEvents** | [**ConversionEvents**](ConversionEvents.md) | Conversion events. |  |
| **test** | **bool?** | Include query param ?test&#x3D;true to mark the request as a test request. The events will not be recorded but the API will still return the same response messages. Use this mode to verify your requests are working and your events are constructed correctly. Warning: If you use this query parameter, be certain that it is off (set to false or deleted) before sending a legitimate (non-testing) request. | [optional]  |

### Return type

[**ConversionApiResponse**](ConversionApiResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [conversion_token](../README.md#conversion_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The request was invalid. |  -  |
| **401** | Not authorized to send conversion events |  -  |
| **403** | Unauthorized access. |  -  |
| **422** | Not all events were successfully processed. |  -  |
| **429** | This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits within a short time window. |  -  |
| **503** | The endpoint has been ramped down and is currently not accepting any traffic. |  -  |
| **0** | Unexpected errors |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

