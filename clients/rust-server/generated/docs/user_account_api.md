# user_account_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
**boards_user_follows/list**](user_account_api.md#boards_user_follows/list) | **GET** /user_account/following/boards | List following boards
**follow_user/update**](user_account_api.md#follow_user/update) | **POST** /user_account/following/{username} | Follow user
**followers/list**](user_account_api.md#followers/list) | **GET** /user_account/followers | List followers
**linked_business_accounts/get**](user_account_api.md#linked_business_accounts/get) | **GET** /user_account/businesses | List linked businesses
**unverify_website/delete**](user_account_api.md#unverify_website/delete) | **DELETE** /user_account/websites | Unverify website
**user_account/analytics**](user_account_api.md#user_account/analytics) | **GET** /user_account/analytics | Get user account analytics
**user_account/analytics/top_pins**](user_account_api.md#user_account/analytics/top_pins) | **GET** /user_account/analytics/top_pins | Get user account top pins analytics
**user_account/analytics/top_video_pins**](user_account_api.md#user_account/analytics/top_video_pins) | **GET** /user_account/analytics/top_video_pins | Get user account top video pins analytics
**user_account/followed_interests**](user_account_api.md#user_account/followed_interests) | **GET** /users/{username}/interests/follow | List following interests
**user_account/get**](user_account_api.md#user_account/get) | **GET** /user_account | Get user account
**user_following/get**](user_account_api.md#user_following/get) | **GET** /user_account/following | List following
**user_websites/get**](user_account_api.md#user_websites/get) | **GET** /user_account/websites | Get user websites
**verify_website/update**](user_account_api.md#verify_website/update) | **POST** /user_account/websites | Verify website
**website_verification/get**](user_account_api.md#website_verification/get) | **GET** /user_account/websites/verification | Get user verification code for website claiming


# **boards_user_follows/list**
> models::BoardsUserFollowsList200Response boards_user_follows/list(ctx, optional)
List following boards

Get a list of the boards a user follows. The request returns a board summary object array.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **String**| Cursor used to fetch the next page of items | 
 **page_size** | **i32**| Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. | [default to 25]
 **explicit_following** | **bool**| Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. | [default to false]
 **ad_account_id** | **String**| Unique identifier of an ad account. | 

### Return type

[**models::BoardsUserFollowsList200Response**](boards_user_follows_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **follow_user/update**
> models::UserSummary follow_user/update(ctx, username, follow_user_request)
Follow user

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>  Use this request, as a signed-in user, to follow another user.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **username** | **String**| A valid username | 
  **follow_user_request** | [**FollowUserRequest**](FollowUserRequest.md)| Follow a user. | 

### Return type

[**models::UserSummary**](UserSummary.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **followers/list**
> models::FollowersList200Response followers/list(ctx, optional)
List followers

Get a list of your followers.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **String**| Cursor used to fetch the next page of items | 
 **page_size** | **i32**| Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. | [default to 25]

### Return type

[**models::FollowersList200Response**](followers_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **linked_business_accounts/get**
> Vec<models::LinkedBusiness> linked_business_accounts/get(ctx, )
List linked businesses

Get a list of your linked business accounts.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**Vec<models::LinkedBusiness>**](LinkedBusiness.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **unverify_website/delete**
> unverify_website/delete(ctx, website)
Unverify website

Unverifu a website verified by the signed-in user.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **website** | **String**| Website with path or domain only | 

### Return type

 (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_account/analytics**
> std::collections::HashMap<String, models::AnalyticsMetricsResponse> user_account/analytics(ctx, start_date, end_date, optional)
Get user account analytics

Get analytics for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **start_date** | **chrono::naive::NaiveDate**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
  **end_date** | **chrono::naive::NaiveDate**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_date** | **chrono::naive::NaiveDate**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **end_date** | **chrono::naive::NaiveDate**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **from_claimed_content** | **String**| Filter on Pins that match your claimed domain. | [default to "BOTH".to_string()]
 **pin_format** | **String**| Pin formats to get data for, default is all. | [default to "ALL".to_string()]
 **app_types** | **String**| Apps or devices to get data for, default is all. | [default to "ALL".to_string()]
 **content_type** | **String**| Filter to paid or organic data. Default is all. | [default to "ALL".to_string()]
 **source** | **String**| Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [default to "ALL".to_string()]
 **metric_types** | [**String**](String.md)| Metric types to get data for, default is all.  | 
 **split_field** | **String**| How to split the data into groups. Not including this param means data won't be split. | [default to "NO_SPLIT".to_string()]
 **ad_account_id** | **String**| Unique identifier of an ad account. | 

### Return type

[**std::collections::HashMap<String, models::AnalyticsMetricsResponse>**](AnalyticsMetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_account/analytics/top_pins**
> models::TopPinsAnalyticsResponse user_account/analytics/top_pins(ctx, start_date, end_date, sort_by, optional)
Get user account top pins analytics

Gets analytics data about a user's top pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **start_date** | **chrono::naive::NaiveDate**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
  **end_date** | **chrono::naive::NaiveDate**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
  **sort_by** | **String**| Specify sorting order for metrics | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_date** | **chrono::naive::NaiveDate**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **end_date** | **chrono::naive::NaiveDate**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **sort_by** | **String**| Specify sorting order for metrics | 
 **from_claimed_content** | **String**| Filter on Pins that match your claimed domain. | [default to "BOTH".to_string()]
 **pin_format** | **String**| Pin formats to get data for, default is all. | [default to "ALL".to_string()]
 **app_types** | **String**| Apps or devices to get data for, default is all. | [default to "ALL".to_string()]
 **content_type** | **String**| Filter to paid or organic data. Default is all. | [default to "ALL".to_string()]
 **source** | **String**| Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [default to "ALL".to_string()]
 **metric_types** | [**String**](String.md)| Metric types to get data for, default is all.  | 
 **num_of_pins** | **i32**| Number of pins to include, default is 10. Max is 50. | [default to 10]
 **created_in_last_n_days** | **i32**| Get metrics for pins created in the last \"n\" days. | 
 **ad_account_id** | **String**| Unique identifier of an ad account. | 

### Return type

[**models::TopPinsAnalyticsResponse**](TopPinsAnalyticsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_account/analytics/top_video_pins**
> models::TopVideoPinsAnalyticsResponse user_account/analytics/top_video_pins(ctx, start_date, end_date, sort_by, optional)
Get user account top video pins analytics

Gets analytics data about a user's top video pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **start_date** | **chrono::naive::NaiveDate**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
  **end_date** | **chrono::naive::NaiveDate**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
  **sort_by** | **String**| Specify sorting order for video metrics | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_date** | **chrono::naive::NaiveDate**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **end_date** | **chrono::naive::NaiveDate**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **sort_by** | **String**| Specify sorting order for video metrics | 
 **from_claimed_content** | **String**| Filter on Pins that match your claimed domain. | [default to "BOTH".to_string()]
 **pin_format** | **String**| Pin formats to get data for, default is all. | [default to "ALL".to_string()]
 **app_types** | **String**| Apps or devices to get data for, default is all. | [default to "ALL".to_string()]
 **content_type** | **String**| Filter to paid or organic data. Default is all. | [default to "ALL".to_string()]
 **source** | **String**| Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [default to "ALL".to_string()]
 **metric_types** | [**String**](String.md)| Metric types to get video data for, default is all.  | 
 **num_of_pins** | **i32**| Number of pins to include, default is 10. Max is 50. | [default to 10]
 **created_in_last_n_days** | **i32**| Get metrics for pins created in the last \"n\" days. | 
 **ad_account_id** | **String**| Unique identifier of an ad account. | 

### Return type

[**models::TopVideoPinsAnalyticsResponse**](TopVideoPinsAnalyticsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_account/followed_interests**
> models::UserAccountFollowedInterests200Response user_account/followed_interests(ctx, username, optional)
List following interests

Get a list of a user's following interests in one place.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **username** | **String**| A valid username | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| A valid username | 
 **bookmark** | **String**| Cursor used to fetch the next page of items | 
 **page_size** | **i32**| Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. | [default to 25]

### Return type

[**models::UserAccountFollowedInterests200Response**](user_account_followed_interests_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_account/get**
> models::Account user_account/get(ctx, optional)
Get user account

Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/reference/business-access/'>Understanding Business Access</a> for more information.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **String**| Unique identifier of an ad account. | 

### Return type

[**models::Account**](Account.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_following/get**
> models::UserFollowingGet200Response user_following/get(ctx, optional)
List following

Get a list of who a certain user follows.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **String**| Cursor used to fetch the next page of items | 
 **page_size** | **i32**| Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. | [default to 25]
 **feed_type** | **models::UserFollowingFeedType**| Thrift param specifying what type of followees will be kept. Default to include all followees. | 
 **explicit_following** | **bool**| Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. | [default to false]
 **ad_account_id** | **String**| Unique identifier of an ad account. | 

### Return type

[**models::UserFollowingGet200Response**](user_following_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_websites/get**
> models::UserWebsitesGet200Response user_websites/get(ctx, optional)
Get user websites

Get user websites, claimed or not

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **String**| Cursor used to fetch the next page of items | 
 **page_size** | **i32**| Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. | [default to 25]

### Return type

[**models::UserWebsitesGet200Response**](user_websites_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **verify_website/update**
> models::UserWebsiteSummary verify_website/update(ctx, user_website_verify_request)
Verify website

Verify a website as a signed-in user.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **user_website_verify_request** | [**UserWebsiteVerifyRequest**](UserWebsiteVerifyRequest.md)| Verify a website. | 

### Return type

[**models::UserWebsiteSummary**](UserWebsiteSummary.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **website_verification/get**
> models::UserWebsiteVerificationCode website_verification/get(ctx, )
Get user verification code for website claiming

Get verification code for user to install on the website to claim it.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**models::UserWebsiteVerificationCode**](UserWebsiteVerificationCode.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

