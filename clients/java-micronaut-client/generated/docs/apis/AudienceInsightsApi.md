# AudienceInsightsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**audienceInsightsGet**](AudienceInsightsApi.md#audienceInsightsGet) | **GET** /ad_accounts/{ad_account_id}/audience_insights | Get audience insights |
| [**audienceInsightsScopeAndTypeGet**](AudienceInsightsApi.md#audienceInsightsScopeAndTypeGet) | **GET** /ad_accounts/{ad_account_id}/insights/audiences | Get audience insights scope and type |


## Creating AudienceInsightsApi

To initiate an instance of `AudienceInsightsApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.AudienceInsightsApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(AudienceInsightsApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    AudienceInsightsApi audienceInsightsApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="audienceInsightsGet"></a>
# **audienceInsightsGet**
```java
Mono<AudienceInsightsResponse> AudienceInsightsApi.audienceInsightsGet(adAccountIdaudienceInsightType)
```

Get audience insights

Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the ad account&#39;s engaged audience on Pinterest, the ad account&#39;s total audience on Pinterest and Pinterest&#39;s total audience.&lt;p/&gt; &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/audience-insights\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Learn more about Audience Insights&lt;/a&gt;.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **audienceInsightType** | [**AudienceInsightType**](.md)| Type of audience insights. | [default to `YOUR_TOTAL_AUDIENCE`] [enum: `YOUR_TOTAL_AUDIENCE`, `YOUR_ENGAGED_AUDIENCE`, `PINTEREST_TOTAL_AUDIENCE`] |


### Return type
[**AudienceInsightsResponse**](AudienceInsightsResponse.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="audienceInsightsScopeAndTypeGet"></a>
# **audienceInsightsScopeAndTypeGet**
```java
Mono<AudienceDefinitionResponse> AudienceInsightsApi.audienceInsightsScopeAndTypeGet(adAccountId)
```

Get audience insights scope and type

Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |


### Return type
[**AudienceDefinitionResponse**](AudienceDefinitionResponse.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

