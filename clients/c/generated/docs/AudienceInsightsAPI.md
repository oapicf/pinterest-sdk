# AudienceInsightsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AudienceInsightsAPI_audienceInsightsGet**](AudienceInsightsAPI.md#AudienceInsightsAPI_audienceInsightsGet) | **GET** /ad_accounts/{ad_account_id}/audience_insights | Get audience insights
[**AudienceInsightsAPI_audienceInsightsScopeAndTypeGet**](AudienceInsightsAPI.md#AudienceInsightsAPI_audienceInsightsScopeAndTypeGet) | **GET** /ad_accounts/{ad_account_id}/insights/audiences | Get audience insights scope and type


# **AudienceInsightsAPI_audienceInsightsGet**
```c
// Get audience insights
//
// Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the ad account's engaged audience on Pinterest, the ad account's total audience on Pinterest and Pinterest's total audience.<p/> <a href=\"https://help.pinterest.com/en/business/article/audience-insights\" target=\"_blank\">Learn more about Audience Insights</a>.
//
audience_insights_response_t* AudienceInsightsAPI_audienceInsightsGet(apiClient_t *apiClient, char *ad_account_id, audience_insight_type_e audience_insight_type);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**audience_insight_type** | **audience_insight_type_e** | Type of audience insights. | 

### Return type

[audience_insights_response_t](audience_insights_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AudienceInsightsAPI_audienceInsightsScopeAndTypeGet**
```c
// Get audience insights scope and type
//
// Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience.
//
audience_definition_response_t* AudienceInsightsAPI_audienceInsightsScopeAndTypeGet(apiClient_t *apiClient, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 

### Return type

[audience_definition_response_t](audience_definition_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

