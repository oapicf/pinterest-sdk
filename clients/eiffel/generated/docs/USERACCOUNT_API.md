# USERACCOUNT_API

All URIs are relative to *https://api.pinterest.com/v5*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**user_account_analytics**](USERACCOUNT_API.md#user_account_analytics) | **Get** /user_account/analytics | Get user account analytics
[**user_account_get**](USERACCOUNT_API.md#user_account_get) | **Get** /user_account | Get user account


# **user_account_analytics**
> user_account_analytics (start_date: DATE ; end_date: DATE ; from_claimed_content:  detachable STRING_32 ; pin_format:  detachable STRING_32 ; app_types:  detachable STRING_32 ; metric_types:  detachable LIST [STRING_32] ; split_field:  detachable STRING_32 ; ad_account_id:  detachable STRING_32 ): detachable STRING_TABLE [ANALYTICS_METRICS_RESPONSE]


Get user account analytics

Get analytics for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_date** | **DATE**| Metric report start date (UTC). Format: YYYY-MM-DD | [default to null]
 **end_date** | **DATE**| Metric report end date (UTC). Format: YYYY-MM-DD | [default to null]
 **from_claimed_content** | **STRING_32**| Filter on Pins that match your claimed domain. | [optional] [default to BOTH]
 **pin_format** | **STRING_32**| Pin formats to get data for, default is all. | [optional] [default to ALL]
 **app_types** | **STRING_32**| Apps or devices to get data for, default is all. | [optional] [default to ALL]
 **metric_types** | [**LIST [STRING_32]**](STRING_32.md)| Metric types to get data for, default is all.  | [optional] [default to null]
 **split_field** | **STRING_32**| How to split the data into groups. Not including this param means data won&#39;t be split. | [optional] [default to NO_SPLIT]
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**STRING_TABLE [ANALYTICS_METRICS_RESPONSE]**](AnalyticsMetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_account_get**
> user_account_get (ad_account_id:  detachable STRING_32 ): detachable ACCOUNT


Get user account

Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/api/v5/#tag/Understanding-business-access'>Understanding Business Access</a> for more information.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**ACCOUNT**](Account.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

