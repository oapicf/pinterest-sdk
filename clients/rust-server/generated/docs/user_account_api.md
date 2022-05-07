# user_account_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
**user_account/analytics**](user_account_api.md#user_account/analytics) | **GET** /user_account/analytics | Get user account analytics
**user_account/get**](user_account_api.md#user_account/get) | **GET** /user_account | Get user account


# **user_account/analytics**
> std::collections::HashMap<String, models::AnalyticsMetricsResponse> user_account/analytics(ctx, start_date, end_date, optional)
Get user account analytics

Get analytics for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **start_date** | **chrono::DateTime::<chrono::Utc>**| Metric report start date (UTC). Format: YYYY-MM-DD | 
  **end_date** | **chrono::DateTime::<chrono::Utc>**| Metric report end date (UTC). Format: YYYY-MM-DD | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_date** | **chrono::DateTime::<chrono::Utc>**| Metric report start date (UTC). Format: YYYY-MM-DD | 
 **end_date** | **chrono::DateTime::<chrono::Utc>**| Metric report end date (UTC). Format: YYYY-MM-DD | 
 **from_claimed_content** | **String**| Filter on Pins that match your claimed domain. | [default to "BOTH".to_string()]
 **pin_format** | **String**| Pin formats to get data for, default is all. | [default to "ALL".to_string()]
 **app_types** | **String**| Apps or devices to get data for, default is all. | [default to "ALL".to_string()]
 **metric_types** | [**String**](String.md)| Metric types to get data for, default is all.  | 
 **split_field** | **String**| How to split the data into groups. Not including this param means data won't be split. | [default to "NO_SPLIT".to_string()]
 **ad_account_id** | **String**| Unique identifier of an ad account. | 

### Return type

[**std::collections::HashMap<String, models::AnalyticsMetricsResponse>**](AnalyticsMetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_account/get**
> models::Account user_account/get(ctx, optional)
Get user account

Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/api/v5/#tag/Understanding-business-access'>Understanding Business Access</a> for more information.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **String**| Unique identifier of an ad account. | 

### Return type

[**models::Account**](Account.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

