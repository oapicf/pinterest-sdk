# PinsApi

All URIs are relative to */v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pinsAnalytics**](PinsApi.md#pinsAnalytics) | **GET** /pins/{pin_id}/analytics | Get Pin analytics
[**pinsCreate**](PinsApi.md#pinsCreate) | **POST** /pins | Create Pin
[**pinsDelete**](PinsApi.md#pinsDelete) | **DELETE** /pins/{pin_id} | Delete Pin
[**pinsGet**](PinsApi.md#pinsGet) | **GET** /pins/{pin_id} | Get Pin



## pinsAnalytics

Get Pin analytics

Get analytics for a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account.
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"https://developers.pinterest.com/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:

- For Pins on public or protected boards: Admin, Analyst.
- For Pins on secret boards: Admin.

### Example

```bash
 pinsAnalytics pin_id=value  start_date=value  end_date=value  Specify as:  metric_types="value1,value2,..."  app_types=value  split_field=value  ad_account_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinId** | **string** | Unique identifier of a Pin. | [default to null]
 **startDate** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD | [default to null]
 **endDate** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD | [default to null]
 **metricTypes** | [**array[string]**](string.md) | Pin metric types to get data for, default is all. | [default to null]
 **appTypes** | **string** | Apps or devices to get data for, default is all. | [optional] [default to ALL]
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


## pinsCreate

Create Pin

Create a Pin on a board or board section owned by the \"operation user_account\".

Note: If the current \"operation user_account\" (defined by the access token) has access to another user's Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account's permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).

- This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called 'curated content', please use our <a href='/docs/add-ons/save-button'>Save button</a> instead. For more tips on creating fresh content for Pinterest, review our <a href='/docs/solutions/content-apps'>Content App Solutions Guide</a>.

<strong><a href='/docs/solutions/content-apps/#creatingvideopins'>Learn more</a></strong> about video Pin creation.

### Example

```bash
 pinsCreate
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pin** | [**Pin**](Pin.md) | Create a new Pin. |

### Return type

[**Pin**](Pin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## pinsDelete

Delete Pin

Delete a Pins owned by the \"operation user_account\" - or on a group board that has been shared with this account.
- By default, the \"operation user_account\" is the token user_account.

### Example

```bash
 pinsDelete pin_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinId** | **string** | Unique identifier of a Pin. | [default to null]

### Return type

(empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## pinsGet

Get Pin

Get a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account.
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:

- For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.
- For Pins on secret boards: Owner, Admin.

### Example

```bash
 pinsGet pin_id=value  ad_account_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinId** | **string** | Unique identifier of a Pin. | [default to null]
 **adAccountId** | **string** | Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**Pin**](Pin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

