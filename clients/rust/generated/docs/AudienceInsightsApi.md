# \AudienceInsightsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**audience_insights_scope_and_type_slash_get**](AudienceInsightsApi.md#audience_insights_scope_and_type_slash_get) | **GET** /ad_accounts/{ad_account_id}/insights/audiences | Get audience insights scope and type
[**audience_insights_slash_get**](AudienceInsightsApi.md#audience_insights_slash_get) | **GET** /ad_accounts/{ad_account_id}/audience_insights | Get audience insights



## audience_insights_scope_and_type_slash_get

> models::AudienceDefinitionResponse audience_insights_scope_and_type_slash_get(ad_account_id)
Get audience insights scope and type

Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |

### Return type

[**models::AudienceDefinitionResponse**](AudienceDefinitionResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## audience_insights_slash_get

> models::AudienceInsightsResponse audience_insights_slash_get(ad_account_id, audience_insight_type)
Get audience insights

Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the ad account's engaged audience on Pinterest, the ad account's total audience on Pinterest and Pinterest's total audience.<p/> <a href=\"https://help.pinterest.com/en/business/article/audience-insights\" target=\"_blank\">Learn more about Audience Insights</a>.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**audience_insight_type** | [**AudienceInsightType**](.md) | Type of audience insights. | [required] |

### Return type

[**models::AudienceInsightsResponse**](AudienceInsightsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

