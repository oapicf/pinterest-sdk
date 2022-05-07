# \UserAccountApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**UserAccountAnalytics**](UserAccountApi.md#UserAccountAnalytics) | **Get** /user_account/analytics | Get user account analytics
[**UserAccountGet**](UserAccountApi.md#UserAccountGet) | **Get** /user_account | Get user account



## UserAccountAnalytics

> map[string]AnalyticsMetricsResponse UserAccountAnalytics(ctx, startDate, endDate, optional)

Get user account analytics

Get analytics for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**startDate** | **string**| Metric report start date (UTC). Format: YYYY-MM-DD | 
**endDate** | **string**| Metric report end date (UTC). Format: YYYY-MM-DD | 
 **optional** | ***UserAccountAnalyticsOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a UserAccountAnalyticsOpts struct


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **fromClaimedContent** | **optional.String**| Filter on Pins that match your claimed domain. | [default to BOTH]
 **pinFormat** | **optional.String**| Pin formats to get data for, default is all. | [default to ALL]
 **appTypes** | **optional.String**| Apps or devices to get data for, default is all. | [default to ALL]
 **metricTypes** | [**optional.Interface of []string**](string.md)| Metric types to get data for, default is all.  | 
 **splitField** | **optional.String**| How to split the data into groups. Not including this param means data won&#39;t be split. | [default to NO_SPLIT]
 **adAccountId** | **optional.String**| Unique identifier of an ad account. | 

### Return type

[**map[string]AnalyticsMetricsResponse**](AnalyticsMetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UserAccountGet

> Account UserAccountGet(ctx, optional)

Get user account

Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/api/v5/#tag/Understanding-business-access'>Understanding Business Access</a> for more information.

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***UserAccountGetOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a UserAccountGetOpts struct


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **optional.String**| Unique identifier of an ad account. | 

### Return type

[**Account**](Account.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

