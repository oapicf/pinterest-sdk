# .AudienceInsightsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**audienceInsightsGet**](AudienceInsightsApi.md#audienceInsightsGet) | **GET** /ad_accounts/{ad_account_id}/audience_insights | Get audience insights
[**audienceInsightsScopeAndTypeGet**](AudienceInsightsApi.md#audienceInsightsScopeAndTypeGet) | **GET** /ad_accounts/{ad_account_id}/insights/audiences | Get audience insights scope and type


# **audienceInsightsGet**
> AudienceInsightsResponse audienceInsightsGet()

Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the ad account\'s engaged audience on Pinterest, the ad account\'s total audience on Pinterest and Pinterest\'s total audience.<p/> <a href=\"https://help.pinterest.com/en/business/article/audience-insights\" target=\"_blank\">Learn more about Audience Insights</a>.

### Example


```typescript
import { createConfiguration, AudienceInsightsApi } from '';
import type { AudienceInsightsApiAudienceInsightsGetRequest } from '';

const configuration = createConfiguration();
const apiInstance = new AudienceInsightsApi(configuration);

const request: AudienceInsightsApiAudienceInsightsGetRequest = {
    // Unique identifier of an ad account.
  adAccountId: "4",
    // Type of audience insights.
  audienceInsightType: "YOUR_TOTAL_AUDIENCE",
};

const data = await apiInstance.audienceInsightsGet(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined
 **audienceInsightType** | **AudienceInsightType** | Type of audience insights. | defaults to undefined


### Return type

**AudienceInsightsResponse**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **audienceInsightsScopeAndTypeGet**
> AudienceDefinitionResponse audienceInsightsScopeAndTypeGet()

Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience.

### Example


```typescript
import { createConfiguration, AudienceInsightsApi } from '';
import type { AudienceInsightsApiAudienceInsightsScopeAndTypeGetRequest } from '';

const configuration = createConfiguration();
const apiInstance = new AudienceInsightsApi(configuration);

const request: AudienceInsightsApiAudienceInsightsScopeAndTypeGetRequest = {
    // Unique identifier of an ad account.
  adAccountId: "4",
};

const data = await apiInstance.audienceInsightsScopeAndTypeGet(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined


### Return type

**AudienceDefinitionResponse**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


