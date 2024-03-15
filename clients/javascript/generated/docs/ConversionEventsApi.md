# PinterestSdk.ConversionEventsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**eventsCreate**](ConversionEventsApi.md#eventsCreate) | **POST** /ad_accounts/{ad_account_id}/events | Send conversions



## eventsCreate

> ConversionApiResponse eventsCreate(adAccountId, conversionEvents, opts)

Send conversions

The Pinterest API offers advertisers a way to send Pinterest their conversion information (including web conversions, in-app conversions, or even offline conversions) based on their &lt;code&gt;ad_account_id&lt;/code&gt;. The request body should be a JSON object. - This endpoint requires an &lt;code&gt;access_token&lt;/code&gt; be generated through Ads Manager. Review the &lt;a href&#x3D;\&quot;/docs/conversions/conversions/\&quot;&gt;Conversions Guide&lt;/a&gt; for more details. - The token&#39;s &lt;code&gt;user_account&lt;/code&gt; must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Audience, Campaign. (Note that the token can be used across multiple ad accounts under an user ID.) - This endpoint has a rate limit of 5,000 calls per minute per ad account. - If the merchant is submitting this information using both Pinterest conversion tags and the Pinterest API, Pinterest will remove duplicate information before reporting. (Note that events that took place offline cannot be deduplicated.)

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';
// Configure Bearer access token for authorization: conversion_token
let conversion_token = defaultClient.authentications['conversion_token'];
conversion_token.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new PinterestSdk.ConversionEventsApi();
let adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
let conversionEvents = new PinterestSdk.ConversionEvents(); // ConversionEvents | Conversion events.
let opts = {
  'test': true // Boolean | Include query param ?test=true to mark the request as a test request. The events will not be recorded but the API will still return the same response messages. Use this mode to verify your requests are working and your events are constructed correctly. Warning: If you use this query parameter, be certain that it is off (set to false or deleted) before sending a legitimate (non-testing) request.
};
apiInstance.eventsCreate(adAccountId, conversionEvents, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | 
 **conversionEvents** | [**ConversionEvents**](ConversionEvents.md)| Conversion events. | 
 **test** | **Boolean**| Include query param ?test&#x3D;true to mark the request as a test request. The events will not be recorded but the API will still return the same response messages. Use this mode to verify your requests are working and your events are constructed correctly. Warning: If you use this query parameter, be certain that it is off (set to false or deleted) before sending a legitimate (non-testing) request. | [optional] 

### Return type

[**ConversionApiResponse**](ConversionApiResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [conversion_token](../README.md#conversion_token)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

