# USERACCOUNT_API

All URIs are relative to *https://api.pinterest.com/v5*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**boards_user_follows_list**](USERACCOUNT_API.md#boards_user_follows_list) | **Get** /user_account/following/boards | List following boards
[**follow_user_update**](USERACCOUNT_API.md#follow_user_update) | **Post** /user_account/following/{username} | Follow user
[**followers_list**](USERACCOUNT_API.md#followers_list) | **Get** /user_account/followers | List followers
[**linked_business_accounts_get**](USERACCOUNT_API.md#linked_business_accounts_get) | **Get** /user_account/businesses | List linked businesses
[**unverify_website_delete**](USERACCOUNT_API.md#unverify_website_delete) | **Delete** /user_account/websites | Unverify website
[**user_account_analytics**](USERACCOUNT_API.md#user_account_analytics) | **Get** /user_account/analytics | Get user account analytics
[**user_account_analytics_top_pins**](USERACCOUNT_API.md#user_account_analytics_top_pins) | **Get** /user_account/analytics/top_pins | Get user account top pins analytics
[**user_account_analytics_top_video_pins**](USERACCOUNT_API.md#user_account_analytics_top_video_pins) | **Get** /user_account/analytics/top_video_pins | Get user account top video pins analytics
[**user_account_followed_interests**](USERACCOUNT_API.md#user_account_followed_interests) | **Get** /users/{username}/interests/follow | List following interests
[**user_account_get**](USERACCOUNT_API.md#user_account_get) | **Get** /user_account | Get user account
[**user_following_get**](USERACCOUNT_API.md#user_following_get) | **Get** /user_account/following | List following
[**user_websites_get**](USERACCOUNT_API.md#user_websites_get) | **Get** /user_account/websites | Get user websites
[**verify_website_update**](USERACCOUNT_API.md#verify_website_update) | **Post** /user_account/websites | Verify website
[**website_verification_get**](USERACCOUNT_API.md#website_verification_get) | **Get** /user_account/websites/verification | Get user verification code for website claiming


# **boards_user_follows_list**
> boards_user_follows_list (bookmark:  detachable STRING_32 ; page_size:  detachable INTEGER_32 ; explicit_following:  detachable BOOLEAN ; ad_account_id:  detachable STRING_32 ): detachable BOARDS_USER_FOLLOWS_LIST_200_RESPONSE


List following boards

Get a list of the boards a user follows. The request returns a board summary object array.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **explicit_following** | **BOOLEAN**| Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. | [optional] [default to false]
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**BOARDS_USER_FOLLOWS_LIST_200_RESPONSE**](boards_user_follows_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **follow_user_update**
> follow_user_update (username: STRING_32 ; follow_user_request: FOLLOW_USER_REQUEST ): detachable USER_SUMMARY


Follow user

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>  Use this request, as a signed-in user, to follow another user.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **STRING_32**| A valid username | [default to null]
 **follow_user_request** | [**FOLLOW_USER_REQUEST**](FOLLOW_USER_REQUEST.md)| Follow a user. | 

### Return type

[**USER_SUMMARY**](UserSummary.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **followers_list**
> followers_list (bookmark:  detachable STRING_32 ; page_size:  detachable INTEGER_32 ): detachable FOLLOWERS_LIST_200_RESPONSE


List followers

Get a list of your followers.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**FOLLOWERS_LIST_200_RESPONSE**](followers_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **linked_business_accounts_get**
> linked_business_accounts_get : detachable LIST [LINKED_BUSINESS]


List linked businesses

Get a list of your linked business accounts.


### Parameters
This endpoint does not need any parameter.

### Return type

[**LIST [LINKED_BUSINESS]**](LinkedBusiness.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **unverify_website_delete**
> unverify_website_delete (website: STRING_32 )


Unverify website

Unverifu a website verified by the signed-in user.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **website** | **STRING_32**| Website with path or domain only | [default to null]

### Return type

{empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_account_analytics**
> user_account_analytics (start_date: DATE ; end_date: DATE ; from_claimed_content:  detachable STRING_32 ; pin_format:  detachable STRING_32 ; app_types:  detachable STRING_32 ; content_type:  detachable STRING_32 ; source:  detachable STRING_32 ; metric_types:  detachable LIST [STRING_32] ; split_field:  detachable STRING_32 ; ad_account_id:  detachable STRING_32 ): detachable STRING_TABLE [ANALYTICS_METRICS_RESPONSE]


Get user account analytics

Get analytics for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_date** | **DATE**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [default to null]
 **end_date** | **DATE**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [default to null]
 **from_claimed_content** | **STRING_32**| Filter on Pins that match your claimed domain. | [optional] [default to BOTH]
 **pin_format** | **STRING_32**| Pin formats to get data for, default is all. | [optional] [default to ALL]
 **app_types** | **STRING_32**| Apps or devices to get data for, default is all. | [optional] [default to ALL]
 **content_type** | **STRING_32**| Filter to paid or organic data. Default is all. | [optional] [default to ALL]
 **source** | **STRING_32**| Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [optional] [default to ALL]
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

# **user_account_analytics_top_pins**
> user_account_analytics_top_pins (start_date: DATE ; end_date: DATE ; sort_by: STRING_32 ; from_claimed_content:  detachable STRING_32 ; pin_format:  detachable STRING_32 ; app_types:  detachable STRING_32 ; content_type:  detachable STRING_32 ; source:  detachable STRING_32 ; metric_types:  detachable LIST [STRING_32] ; num_of_pins:  detachable INTEGER_32 ; created_in_last_n_days:  detachable INTEGER_32 ; ad_account_id:  detachable STRING_32 ): detachable TOP_PINS_ANALYTICS_RESPONSE


Get user account top pins analytics

Gets analytics data about a user's top pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_date** | **DATE**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [default to null]
 **end_date** | **DATE**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [default to null]
 **sort_by** | **STRING_32**| Specify sorting order for metrics | [default to null]
 **from_claimed_content** | **STRING_32**| Filter on Pins that match your claimed domain. | [optional] [default to BOTH]
 **pin_format** | **STRING_32**| Pin formats to get data for, default is all. | [optional] [default to ALL]
 **app_types** | **STRING_32**| Apps or devices to get data for, default is all. | [optional] [default to ALL]
 **content_type** | **STRING_32**| Filter to paid or organic data. Default is all. | [optional] [default to ALL]
 **source** | **STRING_32**| Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [optional] [default to ALL]
 **metric_types** | [**LIST [STRING_32]**](STRING_32.md)| Metric types to get data for, default is all.  | [optional] [default to null]
 **num_of_pins** | **INTEGER_32**| Number of pins to include, default is 10. Max is 50. | [optional] [default to 10]
 **created_in_last_n_days** | **INTEGER_32**| Get metrics for pins created in the last \&quot;n\&quot; days. | [optional] [default to null]
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**TOP_PINS_ANALYTICS_RESPONSE**](TopPinsAnalyticsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_account_analytics_top_video_pins**
> user_account_analytics_top_video_pins (start_date: DATE ; end_date: DATE ; sort_by: STRING_32 ; from_claimed_content:  detachable STRING_32 ; pin_format:  detachable STRING_32 ; app_types:  detachable STRING_32 ; content_type:  detachable STRING_32 ; source:  detachable STRING_32 ; metric_types:  detachable LIST [STRING_32] ; num_of_pins:  detachable INTEGER_32 ; created_in_last_n_days:  detachable INTEGER_32 ; ad_account_id:  detachable STRING_32 ): detachable TOP_VIDEO_PINS_ANALYTICS_RESPONSE


Get user account top video pins analytics

Gets analytics data about a user's top video pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_date** | **DATE**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [default to null]
 **end_date** | **DATE**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [default to null]
 **sort_by** | **STRING_32**| Specify sorting order for video metrics | [default to null]
 **from_claimed_content** | **STRING_32**| Filter on Pins that match your claimed domain. | [optional] [default to BOTH]
 **pin_format** | **STRING_32**| Pin formats to get data for, default is all. | [optional] [default to ALL]
 **app_types** | **STRING_32**| Apps or devices to get data for, default is all. | [optional] [default to ALL]
 **content_type** | **STRING_32**| Filter to paid or organic data. Default is all. | [optional] [default to ALL]
 **source** | **STRING_32**| Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [optional] [default to ALL]
 **metric_types** | [**LIST [STRING_32]**](STRING_32.md)| Metric types to get video data for, default is all.  | [optional] [default to null]
 **num_of_pins** | **INTEGER_32**| Number of pins to include, default is 10. Max is 50. | [optional] [default to 10]
 **created_in_last_n_days** | **INTEGER_32**| Get metrics for pins created in the last \&quot;n\&quot; days. | [optional] [default to null]
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**TOP_VIDEO_PINS_ANALYTICS_RESPONSE**](TopVideoPinsAnalyticsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_account_followed_interests**
> user_account_followed_interests (username: STRING_32 ; bookmark:  detachable STRING_32 ; page_size:  detachable INTEGER_32 ): detachable USER_ACCOUNT_FOLLOWED_INTERESTS_200_RESPONSE


List following interests

Get a list of a user's following interests in one place.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **STRING_32**| A valid username | [default to null]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**USER_ACCOUNT_FOLLOWED_INTERESTS_200_RESPONSE**](user_account_followed_interests_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_account_get**
> user_account_get (ad_account_id:  detachable STRING_32 ): detachable ACCOUNT


Get user account

Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/getting-started/using-business-access/'>Understanding Business Access</a> for more information.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**ACCOUNT**](Account.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_following_get**
> user_following_get (bookmark:  detachable STRING_32 ; page_size:  detachable INTEGER_32 ; feed_type:  detachable USER_FOLLOWING_FEED_TYPE ; explicit_following:  detachable BOOLEAN ; ad_account_id:  detachable STRING_32 ): detachable USER_FOLLOWING_GET_200_RESPONSE


List following

Get a list of who a certain user follows.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **feed_type** | **USER_FOLLOWING_FEED_TYPE**| Thrift param specifying what type of followees will be kept. Default to include all followees. | [optional] [default to null]
 **explicit_following** | **BOOLEAN**| Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. | [optional] [default to false]
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**USER_FOLLOWING_GET_200_RESPONSE**](user_following_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_websites_get**
> user_websites_get (bookmark:  detachable STRING_32 ; page_size:  detachable INTEGER_32 ): detachable USER_WEBSITES_GET_200_RESPONSE


Get user websites

Get user websites, claimed or not


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**USER_WEBSITES_GET_200_RESPONSE**](user_websites_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **verify_website_update**
> verify_website_update (user_website_verify_request: USER_WEBSITE_VERIFY_REQUEST ; ad_account_id:  detachable STRING_32 ): detachable USER_WEBSITE_SUMMARY


Verify website

Verify a website as a signed-in user.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_website_verify_request** | [**USER_WEBSITE_VERIFY_REQUEST**](USER_WEBSITE_VERIFY_REQUEST.md)| Verify a website. | 
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**USER_WEBSITE_SUMMARY**](UserWebsiteSummary.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **website_verification_get**
> website_verification_get (ad_account_id:  detachable STRING_32 ): detachable USER_WEBSITE_VERIFICATION_CODE


Get user verification code for website claiming

Get verification code for user to install on the website to claim it.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**USER_WEBSITE_VERIFICATION_CODE**](UserWebsiteVerificationCode.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

