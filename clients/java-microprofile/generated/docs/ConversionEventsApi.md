# ConversionEventsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**eventsCreate**](ConversionEventsApi.md#eventsCreate) | **POST** /ad_accounts/{ad_account_id}/events | Send conversions |



## eventsCreate

> ConversionEvents eventsCreate(adAccountId, conversionEventsCreate, test)

Send conversions

The Pinterest API offers advertisers a way to send Pinterest their conversion information (including web conversions, in-app conversions, or even offline conversions) based on their &#x60;ad_account_id&#x60;. The request body should be a JSON object. - This endpoint requires an &#x60;access_token&#x60; be generated through Ads Manager. Review the [Conversions Guide](/docs/api-features/conversion-overview/) for more details. (Note that the authorization header required is &#x60;Authorization: Bearer &lt;access_token&gt;&#x60;). - The token&#39;s &#x60;user_account&#x60; must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Audience, Campaign. (Note that the token can be used across multiple ad accounts under an user ID.) - This endpoint has a rate limit of 5,000 calls per minute per ad account. - If the merchant is submitting this information using both Pinterest conversion tags and the Pinterest API, Pinterest will remove duplicate information before reporting. (Note that events that took place offline cannot be deduplicated.)

### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.auth.*;
import org.openapitools.server.models.*;
import org.openapitools.server.api.ConversionEventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.pinterest.com/v5");
        
        // Configure OAuth2 access token for authorization: pinterest_oauth2
        OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
        pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        // Configure HTTP bearer authorization: conversion_token
        HttpBearerAuth conversion_token = (HttpBearerAuth) defaultClient.getAuthentication("conversion_token");
        conversion_token.setBearerToken("BEARER TOKEN");

        ConversionEventsApi apiInstance = new ConversionEventsApi(defaultClient);
        String adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
        ConversionEventsCreate conversionEventsCreate = new ConversionEventsCreate(); // ConversionEventsCreate | 
        Boolean test = true; // Boolean | Include query param ?test=true to mark the request as a test request. The events will not be recorded but the API will still return the same response messages. Use this mode to verify your requests are working and your events are constructed correctly. Warning: If you use this query parameter, be certain that it is off (set to false or deleted) before sending a legitimate (non-testing) request.
        try {
            ConversionEvents result = apiInstance.eventsCreate(adAccountId, conversionEventsCreate, test);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConversionEventsApi#eventsCreate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | **String**| Unique identifier of an ad account. | |
| **conversionEventsCreate** | [**ConversionEventsCreate**](ConversionEventsCreate.md)|  | |
| **test** | **Boolean**| Include query param ?test&#x3D;true to mark the request as a test request. The events will not be recorded but the API will still return the same response messages. Use this mode to verify your requests are working and your events are constructed correctly. Warning: If you use this query parameter, be certain that it is off (set to false or deleted) before sending a legitimate (non-testing) request. | [optional] |

### Return type

[**ConversionEvents**](ConversionEvents.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [conversion_token](../README.md#conversion_token)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **422** | The request was well-formed but was unable to be followed due to semantic errors. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **503** | The server is currently unable to handle the request due to a temporary overload or scheduled maintenance. |  -  |
| **200** | An unexpected error response. |  -  |

