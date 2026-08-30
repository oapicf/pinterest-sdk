# AudienceInsightsApi

All URIs are relative to *https://api.pinterest.com/v5*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**audienceInsightsGet**](#audienceinsightsget) | **GET** /ad_accounts/{ad_account_id}/audience_insights | Get audience insights|
|[**audienceInsightsScopeAndTypeGet**](#audienceinsightsscopeandtypeget) | **GET** /ad_accounts/{ad_account_id}/insights/audiences | Get audience insights scope and type|

# **audienceInsightsGet**
> AudienceInsights audienceInsightsGet()

Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the ad account\'s engaged audience on Pinterest, the ad account\'s total audience on Pinterest and Pinterest\'s total audience.  [Learn more about Audience Insights](https://help.pinterest.com/en/business/article/audience-insights).

### Example

```typescript
import {
    AudienceInsightsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new AudienceInsightsApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let audienceInsightType: AudienceInsightType; //Type of audience insights. (default to undefined)

const { status, data } = await apiInstance.audienceInsightsGet(
    adAccountId,
    audienceInsightType
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|
| **audienceInsightType** | **AudienceInsightType** | Type of audience insights. | defaults to undefined|


### Return type

**AudienceInsights**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **audienceInsightsScopeAndTypeGet**
> AudienceInsightsScopeAndTypeGet200Response audienceInsightsScopeAndTypeGet()

Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience.

### Example

```typescript
import {
    AudienceInsightsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new AudienceInsightsApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)

const { status, data } = await apiInstance.audienceInsightsScopeAndTypeGet(
    adAccountId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|


### Return type

**AudienceInsightsScopeAndTypeGet200Response**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

