# \UserAccountApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**user_account_analytics**](UserAccountApi.md#user_account_analytics) | **GET** /user_account/analytics | Get user account analytics
[**user_account_get**](UserAccountApi.md#user_account_get) | **GET** /user_account | Get user account



## user_account_analytics

> ::std::collections::HashMap<String, crate::models::AnalyticsMetricsResponse> user_account_analytics(start_date, end_date, from_claimed_content, pin_format, app_types, metric_types, split_field, ad_account_id)
Get user account analytics

Get analytics for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**start_date** | **String** | Metric report start date (UTC). Format: YYYY-MM-DD | [required] |
**end_date** | **String** | Metric report end date (UTC). Format: YYYY-MM-DD | [required] |
**from_claimed_content** | Option<**String**> | Filter on Pins that match your claimed domain. |  |[default to BOTH]
**pin_format** | Option<**String**> | Pin formats to get data for, default is all. |  |[default to ALL]
**app_types** | Option<**String**> | Apps or devices to get data for, default is all. |  |[default to ALL]
**metric_types** | Option<[**Vec<String>**](String.md)> | Metric types to get data for, default is all.  |  |
**split_field** | Option<**String**> | How to split the data into groups. Not including this param means data won't be split. |  |[default to NO_SPLIT]
**ad_account_id** | Option<**String**> | Unique identifier of an ad account. |  |

### Return type

[**::std::collections::HashMap<String, crate::models::AnalyticsMetricsResponse>**](AnalyticsMetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## user_account_get

> crate::models::Account user_account_get(ad_account_id)
Get user account

Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/api/v5/#tag/Understanding-business-access'>Understanding Business Access</a> for more information.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | Option<**String**> | Unique identifier of an ad account. |  |

### Return type

[**crate::models::Account**](Account.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

