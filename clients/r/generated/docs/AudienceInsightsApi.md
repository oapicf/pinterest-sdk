# AudienceInsightsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AudienceInsightsGet**](AudienceInsightsApi.md#AudienceInsightsGet) | **GET** /ad_accounts/{ad_account_id}/audience_insights | Get audience insights
[**AudienceInsightsScopeAndTypeGet**](AudienceInsightsApi.md#AudienceInsightsScopeAndTypeGet) | **GET** /ad_accounts/{ad_account_id}/insights/audiences | Get audience insights scope and type


# **AudienceInsightsGet**
> AudienceInsightsResponse AudienceInsightsGet(ad_account_id, audience_insight_type)

Get audience insights

Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the ad account's engaged audience on Pinterest, the ad account's total audience on Pinterest and Pinterest's total audience.<p/> <a href=\"https://help.pinterest.com/en/business/article/audience-insights\" target=\"_blank\">Learn more about Audience Insights</a>.

### Example
```R
library(openapi)

# Get audience insights
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_audience_insight_type <- AudienceInsightType$new() # AudienceInsightType | Type of audience insights.

api_instance <- AudienceInsightsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$AudienceInsightsGet(var_ad_account_id, var_audience_insight_typedata_file = "result.txt")
result <- api_instance$AudienceInsightsGet(var_ad_account_id, var_audience_insight_type)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **audience_insight_type** | [**AudienceInsightType**](.md)| Type of audience insights. | 

### Return type

[**AudienceInsightsResponse**](AudienceInsightsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Unexpected error |  -  |

# **AudienceInsightsScopeAndTypeGet**
> AudienceDefinitionResponse AudienceInsightsScopeAndTypeGet(ad_account_id)

Get audience insights scope and type

Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience.

### Example
```R
library(openapi)

# Get audience insights scope and type
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.

api_instance <- AudienceInsightsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$AudienceInsightsScopeAndTypeGet(var_ad_account_iddata_file = "result.txt")
result <- api_instance$AudienceInsightsScopeAndTypeGet(var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 

### Return type

[**AudienceDefinitionResponse**](AudienceDefinitionResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Unexpected error |  -  |

