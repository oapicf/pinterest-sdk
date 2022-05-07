# \PinsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PinsAnalytics**](PinsApi.md#PinsAnalytics) | **Get** /pins/{pin_id}/analytics | Get Pin analytics
[**PinsCreate**](PinsApi.md#PinsCreate) | **Post** /pins | Create Pin
[**PinsDelete**](PinsApi.md#PinsDelete) | **Delete** /pins/{pin_id} | Delete Pin
[**PinsGet**](PinsApi.md#PinsGet) | **Get** /pins/{pin_id} | Get Pin



## PinsAnalytics

> map[string]AnalyticsMetricsResponse PinsAnalytics(ctx, pinId, startDate, endDate, metricTypes, optional)

Get Pin analytics

Get analytics for a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"https://developers.pinterest.com/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**pinId** | **string**| Unique identifier of a Pin. | 
**startDate** | **string**| Metric report start date (UTC). Format: YYYY-MM-DD | 
**endDate** | **string**| Metric report end date (UTC). Format: YYYY-MM-DD | 
**metricTypes** | [**[]string**](string.md)| Pin metric types to get data for, default is all. | 
 **optional** | ***PinsAnalyticsOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a PinsAnalyticsOpts struct


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------




 **appTypes** | **optional.String**| Apps or devices to get data for, default is all. | [default to ALL]
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


## PinsCreate

> Pin PinsCreate(ctx, pin)

Create Pin

Create a Pin on a board or board section owned by the \"operation user_account\".  Note: If the current \"operation user_account\" (defined by the access token) has access to another user's Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account's permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called 'curated content', please use our <a href='/docs/add-ons/save-button'>Save button</a> instead. For more tips on creating fresh content for Pinterest, review our <a href='/docs/solutions/content-apps'>Content App Solutions Guide</a>.  <strong><a href='/docs/solutions/content-apps/#creatingvideopins'>Learn more</a></strong> about video Pin creation.

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**pin** | [**Pin**](Pin.md)| Create a new Pin. | 

### Return type

[**Pin**](Pin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PinsDelete

> PinsDelete(ctx, pinId)

Delete Pin

Delete a Pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**pinId** | **string**| Unique identifier of a Pin. | 

### Return type

 (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PinsGet

> Pin PinsGet(ctx, pinId, optional)

Get Pin

Get a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**pinId** | **string**| Unique identifier of a Pin. | 
 **optional** | ***PinsGetOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a PinsGetOpts struct


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **adAccountId** | **optional.String**| Unique identifier of an ad account. | 

### Return type

[**Pin**](Pin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

