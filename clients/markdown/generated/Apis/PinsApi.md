# PinsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pins/analytics**](PinsApi.md#pins/analytics) | **GET** /pins/{pin_id}/analytics | Get Pin analytics
[**pins/create**](PinsApi.md#pins/create) | **POST** /pins | Create Pin
[**pins/delete**](PinsApi.md#pins/delete) | **DELETE** /pins/{pin_id} | Delete Pin
[**pins/get**](PinsApi.md#pins/get) | **GET** /pins/{pin_id} | Get Pin


<a name="pins/analytics"></a>
# **pins/analytics**
> Map pins/analytics(pin\_id, start\_date, end\_date, metric\_types, app\_types, split\_field, ad\_account\_id)

Get Pin analytics

    Get analytics for a Pin owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/api/v5/#operation/ad_accounts/list\&quot;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pin\_id** | **String**| Unique identifier of a Pin. | [default to null]
 **start\_date** | **date**| Metric report start date (UTC). Format: YYYY-MM-DD | [default to null]
 **end\_date** | **date**| Metric report end date (UTC). Format: YYYY-MM-DD | [default to null]
 **metric\_types** | [**List**](../Models/String.md)| Pin metric types to get data for, default is all. | [default to null] [enum: IMPRESSION, SAVE, PIN_CLICK, OUTBOUND_CLICK, VIDEO_MRC_VIEW, VIDEO_AVG_WATCH_TIME, VIDEO_V50_WATCH_TIME, QUARTILE_95_PERCENT_VIEW]
 **app\_types** | **String**| Apps or devices to get data for, default is all. | [optional] [default to ALL] [enum: ALL, MOBILE, TABLET, WEB]
 **split\_field** | **String**| How to split the data into groups. Not including this param means data won&#39;t be split. | [optional] [default to NO_SPLIT] [enum: NO_SPLIT, APP_TYPE]
 **ad\_account\_id** | **String**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**Map**](../Models/AnalyticsMetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="pins/create"></a>
# **pins/create**
> Pin pins/create(Pin)

Create Pin

    Create a Pin on a board or board section owned by the \&quot;operation user_account\&quot;.  Note: If the current \&quot;operation user_account\&quot; (defined by the access token) has access to another user&#39;s Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account&#39;s permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id&#x3D;12345&amp;...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called &#39;curated content&#39;, please use our &lt;a href&#x3D;&#39;/docs/add-ons/save-button&#39;&gt;Save button&lt;/a&gt; instead. For more tips on creating fresh content for Pinterest, review our &lt;a href&#x3D;&#39;/docs/solutions/content-apps&#39;&gt;Content App Solutions Guide&lt;/a&gt;.  &lt;strong&gt;&lt;a href&#x3D;&#39;/docs/solutions/content-apps/#creatingvideopins&#39;&gt;Learn more&lt;/a&gt;&lt;/strong&gt; about video Pin creation.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Pin** | [**Pin**](../Models/Pin.md)| Create a new Pin. |

### Return type

[**Pin**](../Models/Pin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="pins/delete"></a>
# **pins/delete**
> pins/delete(pin\_id)

Delete Pin

    Delete a Pins owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pin\_id** | **String**| Unique identifier of a Pin. | [default to null]

### Return type

null (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="pins/get"></a>
# **pins/get**
> Pin pins/get(pin\_id, ad\_account\_id)

Get Pin

    Get a Pin owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pin\_id** | **String**| Unique identifier of a Pin. | [default to null]
 **ad\_account\_id** | **String**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**Pin**](../Models/Pin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

