# AudienceInsightsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**audienceInsightsGet**](AudienceInsightsApi.md#audienceInsightsGet) | **Get** /ad_accounts/{ad_account_id}/audience_insights | Get audience insights
[**audienceInsightsScopeAndTypeGet**](AudienceInsightsApi.md#audienceInsightsScopeAndTypeGet) | **Get** /ad_accounts/{ad_account_id}/insights/audiences | Get audience insights scope and type


<a name="audienceInsightsGet"></a>
# **audienceInsightsGet**
> AudienceInsights audienceInsightsGet(adAccountId, audienceInsightType)

Get audience insights

Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the ad account&#39;s engaged audience on Pinterest, the ad account&#39;s total audience on Pinterest and Pinterest&#39;s total audience.  [Learn more about Audience Insights](https://help.pinterest.com/en/business/article/audience-insights).

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = AudienceInsightsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val audienceInsightType : AudienceInsightType =  // AudienceInsightType | Type of audience insights.
try {
    val result : AudienceInsights = apiInstance.audienceInsightsGet(adAccountId, audienceInsightType)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AudienceInsightsApi#audienceInsightsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AudienceInsightsApi#audienceInsightsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **audienceInsightType** | [**AudienceInsightType**](.md)| Type of audience insights. | [enum: YOUR_TOTAL_AUDIENCE, YOUR_ENGAGED_AUDIENCE, PINTEREST_TOTAL_AUDIENCE]

### Return type

[**AudienceInsights**](AudienceInsights.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="audienceInsightsScopeAndTypeGet"></a>
# **audienceInsightsScopeAndTypeGet**
> AudienceInsightsScopeAndTypeGet200Response audienceInsightsScopeAndTypeGet(adAccountId)

Get audience insights scope and type

Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = AudienceInsightsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : AudienceInsightsScopeAndTypeGet200Response = apiInstance.audienceInsightsScopeAndTypeGet(adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AudienceInsightsApi#audienceInsightsScopeAndTypeGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AudienceInsightsApi#audienceInsightsScopeAndTypeGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |

### Return type

[**AudienceInsightsScopeAndTypeGet200Response**](AudienceInsightsScopeAndTypeGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

