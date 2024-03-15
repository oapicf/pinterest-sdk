# AudienceInsightsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**audienceInsightsGet**](AudienceInsightsApi.md#audienceInsightsGet) | **GET** /ad_accounts/{ad_account_id}/audience_insights | Get audience insights
[**audienceInsightsScopeAndTypeGet**](AudienceInsightsApi.md#audienceInsightsScopeAndTypeGet) | **GET** /ad_accounts/{ad_account_id}/insights/audiences | Get audience insights scope and type



## audienceInsightsGet

> AudienceInsightsResponse audienceInsightsGet(adAccountId, audienceInsightType)

Get audience insights

Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the ad account&#39;s engaged audience on Pinterest, the ad account&#39;s total audience on Pinterest and Pinterest&#39;s total audience.&lt;p/&gt; &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/audience-insights\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Learn more about Audience Insights&lt;/a&gt;.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AudienceInsightsApi;

AudienceInsightsApi apiInstance = new AudienceInsightsApi();
String adAccountId = null; // String | Unique identifier of an ad account.
AudienceInsightType audienceInsightType = null; // AudienceInsightType | Type of audience insights.
try {
    AudienceInsightsResponse result = apiInstance.audienceInsightsGet(adAccountId, audienceInsightType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AudienceInsightsApi#audienceInsightsGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **audienceInsightType** | [**AudienceInsightType**](.md)| Type of audience insights. | [default to null] [enum: YOUR_TOTAL_AUDIENCE, YOUR_ENGAGED_AUDIENCE, PINTEREST_TOTAL_AUDIENCE]

### Return type

[**AudienceInsightsResponse**](AudienceInsightsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## audienceInsightsScopeAndTypeGet

> AudienceDefinitionResponse audienceInsightsScopeAndTypeGet(adAccountId)

Get audience insights scope and type

Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AudienceInsightsApi;

AudienceInsightsApi apiInstance = new AudienceInsightsApi();
String adAccountId = null; // String | Unique identifier of an ad account.
try {
    AudienceDefinitionResponse result = apiInstance.audienceInsightsScopeAndTypeGet(adAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AudienceInsightsApi#audienceInsightsScopeAndTypeGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]

### Return type

[**AudienceDefinitionResponse**](AudienceDefinitionResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

