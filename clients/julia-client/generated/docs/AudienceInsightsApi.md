# AudienceInsightsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**audience_insights_get**](AudienceInsightsApi.md#audience_insights_get) | **GET** /ad_accounts/{ad_account_id}/audience_insights | Get audience insights
[**audience_insights_scope_and_type_get**](AudienceInsightsApi.md#audience_insights_scope_and_type_get) | **GET** /ad_accounts/{ad_account_id}/insights/audiences | Get audience insights scope and type


# **audience_insights_get**
> `audience_insights_get`(_api::`AudienceInsightsApi`, `ad_account_id`::`String`, `audience_insight_type`::`AudienceInsightType`; _mediaType=nothing) -> `AudienceInsights`, `OpenAPI.Clients.ApiResponse` <br/>
> `audience_insights_get`(_api::`AudienceInsightsApi`, response_stream::`Channel`, `ad_account_id`::`String`, `audience_insight_type`::`AudienceInsightType`; _mediaType=nothing) -> `Channel`{ `AudienceInsights` }, `OpenAPI.Clients.ApiResponse`

Get audience insights

Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the ad account's engaged audience on Pinterest, the ad account's total audience on Pinterest and Pinterest's total audience.  [Learn more about Audience Insights](https://help.pinterest.com/en/business/article/audience-insights).

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`AudienceInsightsApi`** | API context | 
**`ad_account_id`** | **`String`** | Unique identifier of an ad account. |
**`audience_insight_type`** | [**`AudienceInsightType`**](.md) | Type of audience insights. |

### Return type

[**`AudienceInsights`**](AudienceInsights.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **audience_insights_scope_and_type_get**
> `audience_insights_scope_and_type_get`(_api::`AudienceInsightsApi`, `ad_account_id`::`String`; _mediaType=nothing) -> `AudienceInsightsScopeAndTypeGet200Response`, `OpenAPI.Clients.ApiResponse` <br/>
> `audience_insights_scope_and_type_get`(_api::`AudienceInsightsApi`, response_stream::`Channel`, `ad_account_id`::`String`; _mediaType=nothing) -> `Channel`{ `AudienceInsightsScopeAndTypeGet200Response` }, `OpenAPI.Clients.ApiResponse`

Get audience insights scope and type

Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`AudienceInsightsApi`** | API context | 
**`ad_account_id`** | **`String`** | Unique identifier of an ad account. |

### Return type

[**`AudienceInsightsScopeAndTypeGet200Response`**](AudienceInsightsScopeAndTypeGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

