# UserAccountApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**userAccount/analytics**](UserAccountApi.md#userAccount/analytics) | **GET** /user_account/analytics | Get user account analytics |
| [**userAccount/analytics/topPins**](UserAccountApi.md#userAccount/analytics/topPins) | **GET** /user_account/analytics/top_pins | Get user account top pins analytics |
| [**userAccount/analytics/topVideoPins**](UserAccountApi.md#userAccount/analytics/topVideoPins) | **GET** /user_account/analytics/top_video_pins | Get user account top video pins analytics |
| [**userAccount/get**](UserAccountApi.md#userAccount/get) | **GET** /user_account | Get user account |


<a name="userAccount/analytics"></a>
# **userAccount/analytics**
> Map userAccount/analytics(start\_date, end\_date, from\_claimed\_content, pin\_format, app\_types, metric\_types, split\_field, ad\_account\_id)

Get user account analytics

    Get analytics for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **start\_date** | **date**| Metric report start date (UTC). Format: YYYY-MM-DD | [default to null] |
| **end\_date** | **date**| Metric report end date (UTC). Format: YYYY-MM-DD | [default to null] |
| **from\_claimed\_content** | **String**| Filter on Pins that match your claimed domain. | [optional] [default to BOTH] [enum: OTHER, CLAIMED, BOTH] |
| **pin\_format** | **String**| Pin formats to get data for, default is all. | [optional] [default to ALL] [enum: ALL, PRODUCT, REGULAR, VIDEO] |
| **app\_types** | **String**| Apps or devices to get data for, default is all. | [optional] [default to ALL] [enum: ALL, MOBILE, TABLET, WEB] |
| **metric\_types** | [**List**](../Models/String.md)| Metric types to get data for, default is all.  | [optional] [default to null] [enum: ENGAGEMENT, ENGAGEMENT_RATE, IMPRESSION, OUTBOUND_CLICK, OUTBOUND_CLICK_RATE, PIN_CLICK, PIN_CLICK_RATE, SAVE, SAVE_RATE] |
| **split\_field** | **String**| How to split the data into groups. Not including this param means data won&#39;t be split. | [optional] [default to NO_SPLIT] [enum: NO_SPLIT, APP_TYPE, OWNED_CONTENT, PIN_FORMAT] |
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [optional] [default to null] |

### Return type

[**Map**](../Models/AnalyticsMetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="userAccount/analytics/topPins"></a>
# **userAccount/analytics/topPins**
> TopPinsAnalyticsResponse userAccount/analytics/topPins(start\_date, end\_date, sort\_by, from\_claimed\_content, pin\_format, app\_types, metric\_types, num\_of\_pins, created\_in\_last\_n\_days, ad\_account\_id)

Get user account top pins analytics

    Gets analytics data about a user&#39;s top pins (limited to the top 50). - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **start\_date** | **date**| Metric report start date (UTC). Format: YYYY-MM-DD | [default to null] |
| **end\_date** | **date**| Metric report end date (UTC). Format: YYYY-MM-DD | [default to null] |
| **sort\_by** | **String**| Specify sorting order for metrics | [default to null] [enum: ENGAGEMENT, IMPRESSION, OUTBOUND_CLICK, PIN_CLICK, SAVE] |
| **from\_claimed\_content** | **String**| Filter on Pins that match your claimed domain. | [optional] [default to BOTH] [enum: OTHER, CLAIMED, BOTH] |
| **pin\_format** | **String**| Pin formats to get data for, default is all. | [optional] [default to ALL] [enum: ALL, PRODUCT, REGULAR, VIDEO] |
| **app\_types** | **String**| Apps or devices to get data for, default is all. | [optional] [default to ALL] [enum: ALL, MOBILE, TABLET, WEB] |
| **metric\_types** | [**List**](../Models/String.md)| Metric types to get data for, default is all.  | [optional] [default to null] [enum: ENGAGEMENT, ENGAGEMENT_RATE, IMPRESSION, OUTBOUND_CLICK, OUTBOUND_CLICK_RATE, PIN_CLICK, PIN_CLICK_RATE, SAVE, SAVE_RATE] |
| **num\_of\_pins** | **Integer**| Number of pins to include, default is 10. Max is 50. | [optional] [default to 10] |
| **created\_in\_last\_n\_days** | **Integer**| Get metrics for pins created in the last \&quot;n\&quot; days. | [optional] [default to null] [enum: 30] |
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [optional] [default to null] |

### Return type

[**TopPinsAnalyticsResponse**](../Models/TopPinsAnalyticsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="userAccount/analytics/topVideoPins"></a>
# **userAccount/analytics/topVideoPins**
> TopVideoPinsAnalyticsResponse userAccount/analytics/topVideoPins(start\_date, end\_date, sort\_by, from\_claimed\_content, pin\_format, app\_types, metric\_types, num\_of\_pins, created\_in\_last\_n\_days, ad\_account\_id)

Get user account top video pins analytics

    Gets analytics data about a user&#39;s top video pins (limited to the top 50). - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **start\_date** | **date**| Metric report start date (UTC). Format: YYYY-MM-DD | [default to null] |
| **end\_date** | **date**| Metric report end date (UTC). Format: YYYY-MM-DD | [default to null] |
| **sort\_by** | **String**| Specify sorting order for video metrics | [default to null] [enum: IMPRESSION, SAVE, OUTBOUND_CLICK, VIDEO_MRC_VIEW, VIDEO_AVG_WATCH_TIME, VIDEO_V50_WATCH_TIME, QUARTILE_95_PERCENT_VIEW, VIDEO_10S_VIEW, VIDEO_START] |
| **from\_claimed\_content** | **String**| Filter on Pins that match your claimed domain. | [optional] [default to BOTH] [enum: OTHER, CLAIMED, BOTH] |
| **pin\_format** | **String**| Pin formats to get data for, default is all. | [optional] [default to ALL] [enum: ALL, PRODUCT, REGULAR, VIDEO] |
| **app\_types** | **String**| Apps or devices to get data for, default is all. | [optional] [default to ALL] [enum: ALL, MOBILE, TABLET, WEB] |
| **metric\_types** | [**List**](../Models/String.md)| Metric types to get video data for, default is all.  | [optional] [default to null] [enum: IMPRESSION, SAVE, VIDEO_MRC_VIEW, VIDEO_AVG_WATCH_TIME, VIDEO_V50_WATCH_TIME, QUARTILE_95_PERCENT_VIEW, VIDEO_10S_VIEW, VIDEO_START, OUTBOUND_CLICK] |
| **num\_of\_pins** | **Integer**| Number of pins to include, default is 10. Max is 50. | [optional] [default to 10] |
| **created\_in\_last\_n\_days** | **Integer**| Get metrics for pins created in the last \&quot;n\&quot; days. | [optional] [default to null] [enum: 30] |
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [optional] [default to null] |

### Return type

[**TopVideoPinsAnalyticsResponse**](../Models/TopVideoPinsAnalyticsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="userAccount/get"></a>
# **userAccount/get**
> Account userAccount/get(ad\_account\_id)

Get user account

    Get account information for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-business-access&#39;&gt;Understanding Business Access&lt;/a&gt; for more information.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [optional] [default to null] |

### Return type

[**Account**](../Models/Account.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

