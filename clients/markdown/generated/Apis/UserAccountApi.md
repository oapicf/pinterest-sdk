# UserAccountApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**boardsUserFollows/list**](UserAccountApi.md#boardsUserFollows/list) | **GET** /user_account/following/boards | List following boards |
| [**followUser/update**](UserAccountApi.md#followUser/update) | **POST** /user_account/following/{username} | Follow user |
| [**followers/list**](UserAccountApi.md#followers/list) | **GET** /user_account/followers | List followers |
| [**linkedBusinessAccounts/get**](UserAccountApi.md#linkedBusinessAccounts/get) | **GET** /user_account/businesses | List linked businesses |
| [**unverifyWebsite/delete**](UserAccountApi.md#unverifyWebsite/delete) | **DELETE** /user_account/websites | Unverify website |
| [**userAccount/analytics**](UserAccountApi.md#userAccount/analytics) | **GET** /user_account/analytics | Get user account analytics |
| [**userAccount/analytics/topPins**](UserAccountApi.md#userAccount/analytics/topPins) | **GET** /user_account/analytics/top_pins | Get user account top pins analytics |
| [**userAccount/analytics/topVideoPins**](UserAccountApi.md#userAccount/analytics/topVideoPins) | **GET** /user_account/analytics/top_video_pins | Get user account top video pins analytics |
| [**userAccount/followedInterests**](UserAccountApi.md#userAccount/followedInterests) | **GET** /users/{username}/interests/follow | List following interests |
| [**userAccount/get**](UserAccountApi.md#userAccount/get) | **GET** /user_account | Get user account |
| [**userFollowing/get**](UserAccountApi.md#userFollowing/get) | **GET** /user_account/following | List following |
| [**userWebsites/get**](UserAccountApi.md#userWebsites/get) | **GET** /user_account/websites | Get user websites |
| [**verifyWebsite/update**](UserAccountApi.md#verifyWebsite/update) | **POST** /user_account/websites | Verify website |
| [**websiteVerification/get**](UserAccountApi.md#websiteVerification/get) | **GET** /user_account/websites/verification | Get user verification code for website claiming |


<a name="boardsUserFollows/list"></a>
# **boardsUserFollows/list**
> boards_user_follows_list_200_response boardsUserFollows/list(bookmark, page\_size, explicit\_following, ad\_account\_id)

List following boards

    Get a list of the boards a user follows. The request returns a board summary object array.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **explicit\_following** | **Boolean**| Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. | [optional] [default to false] |
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [optional] [default to null] |

### Return type

[**boards_user_follows_list_200_response**](../Models/boards_user_follows_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="followUser/update"></a>
# **followUser/update**
> UserSummary followUser/update(username, FollowUserRequest)

Follow user

    &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Use this request, as a signed-in user, to follow another user.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **username** | **String**| A valid username | [default to null] |
| **FollowUserRequest** | [**FollowUserRequest**](../Models/FollowUserRequest.md)| Follow a user. | |

### Return type

[**UserSummary**](../Models/UserSummary.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="followers/list"></a>
# **followers/list**
> followers_list_200_response followers/list(bookmark, page\_size)

List followers

    Get a list of your followers.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |

### Return type

[**followers_list_200_response**](../Models/followers_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="linkedBusinessAccounts/get"></a>
# **linkedBusinessAccounts/get**
> List linkedBusinessAccounts/get()

List linked businesses

    Get a list of your linked business accounts.

### Parameters
This endpoint does not need any parameter.

### Return type

[**List**](../Models/LinkedBusiness.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="unverifyWebsite/delete"></a>
# **unverifyWebsite/delete**
> unverifyWebsite/delete(website)

Unverify website

    Unverifu a website verified by the signed-in user.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **website** | **String**| Website with path or domain only | [default to null] |

### Return type

null (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="userAccount/analytics"></a>
# **userAccount/analytics**
> Map userAccount/analytics(start\_date, end\_date, from\_claimed\_content, pin\_format, app\_types, content\_type, source, metric\_types, split\_field, ad\_account\_id)

Get user account analytics

    Get analytics for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **start\_date** | **date**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [default to null] |
| **end\_date** | **date**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [default to null] |
| **from\_claimed\_content** | **String**| Filter on Pins that match your claimed domain. | [optional] [default to BOTH] [enum: OTHER, CLAIMED, BOTH] |
| **pin\_format** | **String**| Pin formats to get data for, default is all. | [optional] [default to ALL] [enum: ALL, ORGANIC_IMAGE, ORGANIC_PRODUCT, ORGANIC_VIDEO, ADS_STANDARD, ADS_PRODUCT, ADS_VIDEO, ADS_IDEA] |
| **app\_types** | **String**| Apps or devices to get data for, default is all. | [optional] [default to ALL] [enum: ALL, MOBILE, TABLET, WEB] |
| **content\_type** | **String**| Filter to paid or organic data. Default is all. | [optional] [default to ALL] [enum: ALL, PAID, ORGANIC] |
| **source** | **String**| Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [optional] [default to ALL] [enum: ALL, YOUR_PINS, OTHER_PINS] |
| **metric\_types** | [**List**](../Models/String.md)| Metric types to get data for, default is all.  | [optional] [default to null] [enum: ENGAGEMENT, ENGAGEMENT_RATE, IMPRESSION, OUTBOUND_CLICK, OUTBOUND_CLICK_RATE, PIN_CLICK, PIN_CLICK_RATE, SAVE, SAVE_RATE] |
| **split\_field** | **String**| How to split the data into groups. Not including this param means data won&#39;t be split. | [optional] [default to NO_SPLIT] [enum: NO_SPLIT, APP_TYPE, OWNED_CONTENT, SOURCE, PIN_FORMAT] |
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
> TopPinsAnalyticsResponse userAccount/analytics/topPins(start\_date, end\_date, sort\_by, from\_claimed\_content, pin\_format, app\_types, content\_type, source, metric\_types, num\_of\_pins, created\_in\_last\_n\_days, ad\_account\_id)

Get user account top pins analytics

    Gets analytics data about a user&#39;s top pins (limited to the top 50). - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **start\_date** | **date**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [default to null] |
| **end\_date** | **date**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [default to null] |
| **sort\_by** | **String**| Specify sorting order for metrics | [default to null] [enum: ENGAGEMENT, IMPRESSION, OUTBOUND_CLICK, PIN_CLICK, SAVE] |
| **from\_claimed\_content** | **String**| Filter on Pins that match your claimed domain. | [optional] [default to BOTH] [enum: OTHER, CLAIMED, BOTH] |
| **pin\_format** | **String**| Pin formats to get data for, default is all. | [optional] [default to ALL] [enum: ALL, ORGANIC_IMAGE, ORGANIC_PRODUCT, ORGANIC_VIDEO, ADS_STANDARD, ADS_PRODUCT, ADS_VIDEO, ADS_IDEA] |
| **app\_types** | **String**| Apps or devices to get data for, default is all. | [optional] [default to ALL] [enum: ALL, MOBILE, TABLET, WEB] |
| **content\_type** | **String**| Filter to paid or organic data. Default is all. | [optional] [default to ALL] [enum: ALL, PAID, ORGANIC] |
| **source** | **String**| Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [optional] [default to ALL] [enum: ALL, YOUR_PINS, OTHER_PINS] |
| **metric\_types** | [**List**](../Models/String.md)| Metric types to get data for, default is all.  | [optional] [default to null] [enum: ENGAGEMENT, ENGAGEMENT_RATE, IMPRESSION, OUTBOUND_CLICK, OUTBOUND_CLICK_RATE, PIN_CLICK, PIN_CLICK_RATE, SAVE, SAVE_RATE] |
| **num\_of\_pins** | **Integer**| Number of pins to include, default is 10. Max is 50. | [optional] [default to 10] |
| **created\_in\_last\_n\_days** | **Integer**| Get metrics for pins created in the last \&quot;n\&quot; days. | [optional] [default to null] [enum: 30] |
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [optional] [default to null] |

### Return type

[**TopPinsAnalyticsResponse**](../Models/TopPinsAnalyticsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="userAccount/analytics/topVideoPins"></a>
# **userAccount/analytics/topVideoPins**
> TopVideoPinsAnalyticsResponse userAccount/analytics/topVideoPins(start\_date, end\_date, sort\_by, from\_claimed\_content, pin\_format, app\_types, content\_type, source, metric\_types, num\_of\_pins, created\_in\_last\_n\_days, ad\_account\_id)

Get user account top video pins analytics

    Gets analytics data about a user&#39;s top video pins (limited to the top 50). - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **start\_date** | **date**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [default to null] |
| **end\_date** | **date**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [default to null] |
| **sort\_by** | **String**| Specify sorting order for video metrics | [default to null] [enum: IMPRESSION, SAVE, OUTBOUND_CLICK, VIDEO_MRC_VIEW, VIDEO_AVG_WATCH_TIME, VIDEO_V50_WATCH_TIME, QUARTILE_95_PERCENT_VIEW, VIDEO_10S_VIEW, VIDEO_START] |
| **from\_claimed\_content** | **String**| Filter on Pins that match your claimed domain. | [optional] [default to BOTH] [enum: OTHER, CLAIMED, BOTH] |
| **pin\_format** | **String**| Pin formats to get data for, default is all. | [optional] [default to ALL] [enum: ALL, ORGANIC_IMAGE, ORGANIC_PRODUCT, ORGANIC_VIDEO, ADS_STANDARD, ADS_PRODUCT, ADS_VIDEO, ADS_IDEA] |
| **app\_types** | **String**| Apps or devices to get data for, default is all. | [optional] [default to ALL] [enum: ALL, MOBILE, TABLET, WEB] |
| **content\_type** | **String**| Filter to paid or organic data. Default is all. | [optional] [default to ALL] [enum: ALL, PAID, ORGANIC] |
| **source** | **String**| Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [optional] [default to ALL] [enum: ALL, YOUR_PINS, OTHER_PINS] |
| **metric\_types** | [**List**](../Models/String.md)| Metric types to get video data for, default is all.  | [optional] [default to null] [enum: IMPRESSION, SAVE, VIDEO_MRC_VIEW, VIDEO_AVG_WATCH_TIME, VIDEO_V50_WATCH_TIME, QUARTILE_95_PERCENT_VIEW, VIDEO_10S_VIEW, VIDEO_START, OUTBOUND_CLICK] |
| **num\_of\_pins** | **Integer**| Number of pins to include, default is 10. Max is 50. | [optional] [default to 10] |
| **created\_in\_last\_n\_days** | **Integer**| Get metrics for pins created in the last \&quot;n\&quot; days. | [optional] [default to null] [enum: 30] |
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [optional] [default to null] |

### Return type

[**TopVideoPinsAnalyticsResponse**](../Models/TopVideoPinsAnalyticsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="userAccount/followedInterests"></a>
# **userAccount/followedInterests**
> user_account_followed_interests_200_response userAccount/followedInterests(username, bookmark, page\_size)

List following interests

    Get a list of a user&#39;s following interests in one place.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **username** | **String**| A valid username | [default to null] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |

### Return type

[**user_account_followed_interests_200_response**](../Models/user_account_followed_interests_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="userAccount/get"></a>
# **userAccount/get**
> Account userAccount/get(ad\_account\_id)

Get user account

    Get account information for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See &lt;a href&#x3D;&#39;/docs/getting-started/using-business-access/&#39;&gt;Understanding Business Access&lt;/a&gt; for more information.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [optional] [default to null] |

### Return type

[**Account**](../Models/Account.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="userFollowing/get"></a>
# **userFollowing/get**
> user_following_get_200_response userFollowing/get(bookmark, page\_size, feed\_type, explicit\_following, ad\_account\_id)

List following

    Get a list of who a certain user follows.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **feed\_type** | **UserFollowingFeedType**| Thrift param specifying what type of followees will be kept. Default to include all followees. | [optional] [default to null] [enum: ALL, RANKED, CREATOR_ONLY, RANKED_CREATOR_ONLY] |
| **explicit\_following** | **Boolean**| Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. | [optional] [default to false] |
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [optional] [default to null] |

### Return type

[**user_following_get_200_response**](../Models/user_following_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="userWebsites/get"></a>
# **userWebsites/get**
> user_websites_get_200_response userWebsites/get(bookmark, page\_size)

Get user websites

    Get user websites, claimed or not

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |

### Return type

[**user_websites_get_200_response**](../Models/user_websites_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="verifyWebsite/update"></a>
# **verifyWebsite/update**
> UserWebsiteSummary verifyWebsite/update(UserWebsiteVerifyRequest, ad\_account\_id)

Verify website

    Verify a website as a signed-in user.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **UserWebsiteVerifyRequest** | [**UserWebsiteVerifyRequest**](../Models/UserWebsiteVerifyRequest.md)| Verify a website. | |
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [optional] [default to null] |

### Return type

[**UserWebsiteSummary**](../Models/UserWebsiteSummary.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="websiteVerification/get"></a>
# **websiteVerification/get**
> UserWebsiteVerificationCode websiteVerification/get(ad\_account\_id)

Get user verification code for website claiming

    Get verification code for user to install on the website to claim it.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [optional] [default to null] |

### Return type

[**UserWebsiteVerificationCode**](../Models/UserWebsiteVerificationCode.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

