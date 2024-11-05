# ConversionEventsController

All URIs are relative to `"/v5"`

The controller class is defined in **[ConversionEventsController.java](../../src/main/java/org/openapitools/controller/ConversionEventsController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**eventsCreate**](#eventsCreate) | **POST** /ad_accounts/{ad_account_id}/events | Send conversions

<a id="eventsCreate"></a>
# **eventsCreate**
```java
Mono<ConversionApiResponse> ConversionEventsController.eventsCreate(adAccountIdconversionEventstest)
```

Send conversions

The Pinterest API offers advertisers a way to send Pinterest their conversion information (including web conversions, in-app conversions, or even offline conversions) based on their &lt;code&gt;ad_account_id&lt;/code&gt;. The request body should be a JSON object. - This endpoint requires an &lt;code&gt;access_token&lt;/code&gt; be generated through Ads Manager. Review the &lt;a href&#x3D;\&quot;/docs/api-features/conversion-overview/\&quot;&gt;Conversions Guide&lt;/a&gt; for more details. (Note that the authorization header required is &lt;code&gt;Authorization: Bearer &amp;lt;access_token&amp;gt;&lt;/code&gt;). - The token&#39;s &lt;code&gt;user_account&lt;/code&gt; must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Audience, Campaign. (Note that the token can be used across multiple ad accounts under an user ID.) - This endpoint has a rate limit of 5,000 calls per minute per ad account. - If the merchant is submitting this information using both Pinterest conversion tags and the Pinterest API, Pinterest will remove duplicate information before reporting. (Note that events that took place offline cannot be deduplicated.)

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**conversionEvents** | [**ConversionEvents**](../../docs/models/ConversionEvents.md) | Conversion events. |
**test** | `Boolean` | Include query param ?test&#x3D;true to mark the request as a test request. The events will not be recorded but the API will still return the same response messages. Use this mode to verify your requests are working and your events are constructed correctly. Warning: If you use this query parameter, be certain that it is off (set to false or deleted) before sending a legitimate (non-testing) request. | [optional parameter]

### Return type
[**ConversionApiResponse**](../../docs/models/ConversionApiResponse.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:write`
* **conversion_token**

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

