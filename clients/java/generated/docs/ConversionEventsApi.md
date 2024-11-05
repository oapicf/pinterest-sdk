# ConversionEventsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**eventsCreate**](ConversionEventsApi.md#eventsCreate) | **POST** /ad_accounts/{ad_account_id}/events | Send conversions |


<a id="eventsCreate"></a>
# **eventsCreate**
> ConversionApiResponse eventsCreate(adAccountId, conversionEvents, test)

Send conversions

The Pinterest API offers advertisers a way to send Pinterest their conversion information (including web conversions, in-app conversions, or even offline conversions) based on their &lt;code&gt;ad_account_id&lt;/code&gt;. The request body should be a JSON object. - This endpoint requires an &lt;code&gt;access_token&lt;/code&gt; be generated through Ads Manager. Review the &lt;a href&#x3D;\&quot;/docs/api-features/conversion-overview/\&quot;&gt;Conversions Guide&lt;/a&gt; for more details. (Note that the authorization header required is &lt;code&gt;Authorization: Bearer &amp;lt;access_token&amp;gt;&lt;/code&gt;). - The token&#39;s &lt;code&gt;user_account&lt;/code&gt; must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Audience, Campaign. (Note that the token can be used across multiple ad accounts under an user ID.) - This endpoint has a rate limit of 5,000 calls per minute per ad account. - If the merchant is submitting this information using both Pinterest conversion tags and the Pinterest API, Pinterest will remove duplicate information before reporting. (Note that events that took place offline cannot be deduplicated.)

### Example
```java
// Import classes:
import com.github.oapicf.pinterestsdk.ApiClient;
import com.github.oapicf.pinterestsdk.ApiException;
import com.github.oapicf.pinterestsdk.Configuration;
import com.github.oapicf.pinterestsdk.auth.*;
import com.github.oapicf.pinterestsdk.models.*;
import com.github.oapicf.pinterestsdk.api.ConversionEventsApi;

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
    ConversionEvents conversionEvents = new ConversionEvents(); // ConversionEvents | Conversion events.
    Boolean test = true; // Boolean | Include query param ?test=true to mark the request as a test request. The events will not be recorded but the API will still return the same response messages. Use this mode to verify your requests are working and your events are constructed correctly. Warning: If you use this query parameter, be certain that it is off (set to false or deleted) before sending a legitimate (non-testing) request.
    try {
      ConversionApiResponse result = apiInstance.eventsCreate(adAccountId, conversionEvents, test);
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
| **conversionEvents** | [**ConversionEvents**](ConversionEvents.md)| Conversion events. | |
| **test** | **Boolean**| Include query param ?test&#x3D;true to mark the request as a test request. The events will not be recorded but the API will still return the same response messages. Use this mode to verify your requests are working and your events are constructed correctly. Warning: If you use this query parameter, be certain that it is off (set to false or deleted) before sending a legitimate (non-testing) request. | [optional] |

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

