# ConversionEventsController

All URIs are relative to `"/v5"`

The controller class is defined in **[ConversionEventsController.java](../../src/main/java/org/openapitools/controller/ConversionEventsController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**eventsCreate**](#eventsCreate) | **POST** /ad_accounts/{ad_account_id}/events | Send conversions

<a id="eventsCreate"></a>
# **eventsCreate**
```java
Mono<ConversionEvents> ConversionEventsController.eventsCreate(adAccountIdconversionEventsCreatetest)
```

Send conversions

The Pinterest API offers advertisers a way to send Pinterest their conversion information (including web conversions, in-app conversions, or even offline conversions) based on their &#x60;ad_account_id&#x60;. The request body should be a JSON object. - This endpoint requires an &#x60;access_token&#x60; be generated through Ads Manager. Review the [Conversions Guide](/docs/api-features/conversion-overview/) for more details. (Note that the authorization header required is &#x60;Authorization: Bearer &lt;access_token&gt;&#x60;). - The token&#39;s &#x60;user_account&#x60; must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Audience, Campaign. (Note that the token can be used across multiple ad accounts under an user ID.) - This endpoint has a rate limit of 5,000 calls per minute per ad account. - If the merchant is submitting this information using both Pinterest conversion tags and the Pinterest API, Pinterest will remove duplicate information before reporting. (Note that events that took place offline cannot be deduplicated.)

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**conversionEventsCreate** | [**ConversionEventsCreate**](../../docs/models/ConversionEventsCreate.md) |  |
**test** | `Boolean` | Include query param ?test&#x3D;true to mark the request as a test request. The events will not be recorded but the API will still return the same response messages. Use this mode to verify your requests are working and your events are constructed correctly. Warning: If you use this query parameter, be certain that it is off (set to false or deleted) before sending a legitimate (non-testing) request. | [optional parameter]

### Return type
[**ConversionEvents**](../../docs/models/ConversionEvents.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:write`
* **conversion_token**

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

