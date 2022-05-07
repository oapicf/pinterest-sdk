# PINS_API

All URIs are relative to *https://api.pinterest.com/v5*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**pins_analytics**](PINS_API.md#pins_analytics) | **Get** /pins/{pin_id}/analytics | Get Pin analytics
[**pins_create**](PINS_API.md#pins_create) | **Post** /pins | Create Pin
[**pins_delete**](PINS_API.md#pins_delete) | **Delete** /pins/{pin_id} | Delete Pin
[**pins_get**](PINS_API.md#pins_get) | **Get** /pins/{pin_id} | Get Pin


# **pins_analytics**
> pins_analytics (pin_id: STRING_32 ; start_date: DATE ; end_date: DATE ; metric_types: LIST [STRING_32] ; app_types:  detachable STRING_32 ; split_field:  detachable STRING_32 ; ad_account_id:  detachable STRING_32 ): detachable STRING_TABLE [ANALYTICS_METRICS_RESPONSE]


Get Pin analytics

Get analytics for a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"https://developers.pinterest.com/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pin_id** | **STRING_32**| Unique identifier of a Pin. | [default to null]
 **start_date** | **DATE**| Metric report start date (UTC). Format: YYYY-MM-DD | [default to null]
 **end_date** | **DATE**| Metric report end date (UTC). Format: YYYY-MM-DD | [default to null]
 **metric_types** | [**LIST [STRING_32]**](STRING_32.md)| Pin metric types to get data for, default is all. | [default to null]
 **app_types** | **STRING_32**| Apps or devices to get data for, default is all. | [optional] [default to ALL]
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

# **pins_create**
> pins_create (pin: PIN ): detachable PIN


Create Pin

Create a Pin on a board or board section owned by the \"operation user_account\".  Note: If the current \"operation user_account\" (defined by the access token) has access to another user's Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account's permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called 'curated content', please use our <a href='/docs/add-ons/save-button'>Save button</a> instead. For more tips on creating fresh content for Pinterest, review our <a href='/docs/solutions/content-apps'>Content App Solutions Guide</a>.  <strong><a href='/docs/solutions/content-apps/#creatingvideopins'>Learn more</a></strong> about video Pin creation.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pin** | [**PIN**](PIN.md)| Create a new Pin. | 

### Return type

[**PIN**](Pin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pins_delete**
> pins_delete (pin_id: STRING_32 )


Delete Pin

Delete a Pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pin_id** | **STRING_32**| Unique identifier of a Pin. | [default to null]

### Return type

{empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pins_get**
> pins_get (pin_id: STRING_32 ; ad_account_id:  detachable STRING_32 ): detachable PIN


Get Pin

Get a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pin_id** | **STRING_32**| Unique identifier of a Pin. | [default to null]
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**PIN**](Pin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

