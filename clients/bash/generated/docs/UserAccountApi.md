# UserAccountApi

All URIs are relative to */v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userAccountAnalytics**](UserAccountApi.md#userAccountAnalytics) | **GET** /user_account/analytics | Get user account analytics
[**userAccountGet**](UserAccountApi.md#userAccountGet) | **GET** /user_account | Get user account



## userAccountAnalytics

Get user account analytics

Get analytics for the \"operation user_account\"
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".

### Example

```bash
 userAccountAnalytics  start_date=value  end_date=value  from_claimed_content=value  pin_format=value  app_types=value  Specify as:  metric_types="value1,value2,..."  split_field=value  ad_account_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD | [default to null]
 **endDate** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD | [default to null]
 **fromClaimedContent** | **string** | Filter on Pins that match your claimed domain. | [optional] [default to BOTH]
 **pinFormat** | **string** | Pin formats to get data for, default is all. | [optional] [default to ALL]
 **appTypes** | **string** | Apps or devices to get data for, default is all. | [optional] [default to ALL]
 **metricTypes** | [**array[string]**](string.md) | Metric types to get data for, default is all. | [optional] [default to null]
 **splitField** | **string** | How to split the data into groups. Not including this param means data won't be split. | [optional] [default to NO_SPLIT]
 **adAccountId** | **string** | Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**map[String, AnalyticsMetricsResponse]**](AnalyticsMetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## userAccountGet

Get user account

Get account information for the \"operation user_account\"
- By default, the \"operation user_account\" is the token user_account.

If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/api/v5/#tag/Understanding-business-access'>Understanding Business Access</a> for more information.

### Example

```bash
 userAccountGet  ad_account_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**Account**](Account.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

