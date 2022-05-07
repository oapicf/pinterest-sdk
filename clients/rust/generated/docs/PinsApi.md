# \PinsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pins_analytics**](PinsApi.md#pins_analytics) | **GET** /pins/{pin_id}/analytics | Get Pin analytics
[**pins_create**](PinsApi.md#pins_create) | **POST** /pins | Create Pin
[**pins_delete**](PinsApi.md#pins_delete) | **DELETE** /pins/{pin_id} | Delete Pin
[**pins_get**](PinsApi.md#pins_get) | **GET** /pins/{pin_id} | Get Pin



## pins_analytics

> ::std::collections::HashMap<String, crate::models::AnalyticsMetricsResponse> pins_analytics(pin_id, start_date, end_date, metric_types, app_types, split_field, ad_account_id)
Get Pin analytics

Get analytics for a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"https://developers.pinterest.com/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**pin_id** | **String** | Unique identifier of a Pin. | [required] |
**start_date** | **String** | Metric report start date (UTC). Format: YYYY-MM-DD | [required] |
**end_date** | **String** | Metric report end date (UTC). Format: YYYY-MM-DD | [required] |
**metric_types** | [**Vec<String>**](String.md) | Pin metric types to get data for, default is all. | [required] |
**app_types** | Option<**String**> | Apps or devices to get data for, default is all. |  |[default to ALL]
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


## pins_create

> crate::models::Pin pins_create(pin)
Create Pin

Create a Pin on a board or board section owned by the \"operation user_account\".  Note: If the current \"operation user_account\" (defined by the access token) has access to another user's Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account's permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called 'curated content', please use our <a href='/docs/add-ons/save-button'>Save button</a> instead. For more tips on creating fresh content for Pinterest, review our <a href='/docs/solutions/content-apps'>Content App Solutions Guide</a>.  <strong><a href='/docs/solutions/content-apps/#creatingvideopins'>Learn more</a></strong> about video Pin creation.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**pin** | [**Pin**](Pin.md) | Create a new Pin. | [required] |

### Return type

[**crate::models::Pin**](Pin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## pins_delete

> pins_delete(pin_id)
Delete Pin

Delete a Pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**pin_id** | **String** | Unique identifier of a Pin. | [required] |

### Return type

 (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## pins_get

> crate::models::Pin pins_get(pin_id, ad_account_id)
Get Pin

Get a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**pin_id** | **String** | Unique identifier of a Pin. | [required] |
**ad_account_id** | Option<**String**> | Unique identifier of an ad account. |  |

### Return type

[**crate::models::Pin**](Pin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

