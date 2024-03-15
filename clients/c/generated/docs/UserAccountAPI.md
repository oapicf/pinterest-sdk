# UserAccountAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**UserAccountAPI_boardsUserFollowsList**](UserAccountAPI.md#UserAccountAPI_boardsUserFollowsList) | **GET** /user_account/following/boards | List following boards
[**UserAccountAPI_followUserUpdate**](UserAccountAPI.md#UserAccountAPI_followUserUpdate) | **POST** /user_account/following/{username} | Follow user
[**UserAccountAPI_followersList**](UserAccountAPI.md#UserAccountAPI_followersList) | **GET** /user_account/followers | List followers
[**UserAccountAPI_linkedBusinessAccountsGet**](UserAccountAPI.md#UserAccountAPI_linkedBusinessAccountsGet) | **GET** /user_account/businesses | List linked businesses
[**UserAccountAPI_unverifyWebsiteDelete**](UserAccountAPI.md#UserAccountAPI_unverifyWebsiteDelete) | **DELETE** /user_account/websites | Unverify website
[**UserAccountAPI_userAccountAnalytics**](UserAccountAPI.md#UserAccountAPI_userAccountAnalytics) | **GET** /user_account/analytics | Get user account analytics
[**UserAccountAPI_userAccountAnalyticsTopPins**](UserAccountAPI.md#UserAccountAPI_userAccountAnalyticsTopPins) | **GET** /user_account/analytics/top_pins | Get user account top pins analytics
[**UserAccountAPI_userAccountAnalyticsTopVideoPins**](UserAccountAPI.md#UserAccountAPI_userAccountAnalyticsTopVideoPins) | **GET** /user_account/analytics/top_video_pins | Get user account top video pins analytics
[**UserAccountAPI_userAccountFollowedInterests**](UserAccountAPI.md#UserAccountAPI_userAccountFollowedInterests) | **GET** /users/{username}/interests/follow | List following interests
[**UserAccountAPI_userAccountGet**](UserAccountAPI.md#UserAccountAPI_userAccountGet) | **GET** /user_account | Get user account
[**UserAccountAPI_userFollowingGet**](UserAccountAPI.md#UserAccountAPI_userFollowingGet) | **GET** /user_account/following | List following
[**UserAccountAPI_userWebsitesGet**](UserAccountAPI.md#UserAccountAPI_userWebsitesGet) | **GET** /user_account/websites | Get user websites
[**UserAccountAPI_verifyWebsiteUpdate**](UserAccountAPI.md#UserAccountAPI_verifyWebsiteUpdate) | **POST** /user_account/websites | Verify website
[**UserAccountAPI_websiteVerificationGet**](UserAccountAPI.md#UserAccountAPI_websiteVerificationGet) | **GET** /user_account/websites/verification | Get user verification code for website claiming


# **UserAccountAPI_boardsUserFollowsList**
```c
// List following boards
//
// Get a list of the boards a user follows. The request returns a board summary object array.
//
boards_user_follows_list_200_response_t* UserAccountAPI_boardsUserFollowsList(apiClient_t *apiClient, char *bookmark, int *page_size, int *explicit_following, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 
**page_size** | **int \*** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
**explicit_following** | **int \*** | Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. | [optional] [default to false]
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 

### Return type

[boards_user_follows_list_200_response_t](boards_user_follows_list_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserAccountAPI_followUserUpdate**
```c
// Follow user
//
// <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>  Use this request, as a signed-in user, to follow another user.
//
user_summary_t* UserAccountAPI_followUserUpdate(apiClient_t *apiClient, char *username, follow_user_request_t *follow_user_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**username** | **char \*** | A valid username | 
**follow_user_request** | **[follow_user_request_t](follow_user_request.md) \*** | Follow a user. | 

### Return type

[user_summary_t](user_summary.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserAccountAPI_followersList**
```c
// List followers
//
// Get a list of your followers.
//
followers_list_200_response_t* UserAccountAPI_followersList(apiClient_t *apiClient, char *bookmark, int *page_size);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 
**page_size** | **int \*** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[followers_list_200_response_t](followers_list_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserAccountAPI_linkedBusinessAccountsGet**
```c
// List linked businesses
//
// Get a list of your linked business accounts.
//
list_t* UserAccountAPI_linkedBusinessAccountsGet(apiClient_t *apiClient);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |

### Return type

[list_t](linked_business.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserAccountAPI_unverifyWebsiteDelete**
```c
// Unverify website
//
// Unverifu a website verified by the signed-in user.
//
void UserAccountAPI_unverifyWebsiteDelete(apiClient_t *apiClient, char *website);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**website** | **char \*** | Website with path or domain only | 

### Return type

void

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserAccountAPI_userAccountAnalytics**
```c
// Get user account analytics
//
// Get analytics for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
//
list_t*_t* UserAccountAPI_userAccountAnalytics(apiClient_t *apiClient, char start_date, char end_date, pinterest_rest_api_userAccountAnalytics_from_claimed_content_e from_claimed_content, pinterest_rest_api_userAccountAnalytics_pin_format_e pin_format, pinterest_rest_api_userAccountAnalytics_app_types_e app_types, pinterest_rest_api_userAccountAnalytics_content_type_e content_type, pinterest_rest_api_userAccountAnalytics_source_e source, list_t *metric_types, pinterest_rest_api_userAccountAnalytics_split_field_e split_field, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**start_date** | **char** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
**end_date** | **char** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
**from_claimed_content** | **pinterest_rest_api_userAccountAnalytics_from_claimed_content_e** | Filter on Pins that match your claimed domain. | [optional] [default to &#39;BOTH&#39;]
**pin_format** | **pinterest_rest_api_userAccountAnalytics_pin_format_e** | Pin formats to get data for, default is all. | [optional] [default to &#39;ALL&#39;]
**app_types** | **pinterest_rest_api_userAccountAnalytics_app_types_e** | Apps or devices to get data for, default is all. | [optional] [default to &#39;ALL&#39;]
**content_type** | **pinterest_rest_api_userAccountAnalytics_content_type_e** | Filter to paid or organic data. Default is all. | [optional] [default to &#39;ALL&#39;]
**source** | **pinterest_rest_api_userAccountAnalytics_source_e** | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [optional] [default to &#39;ALL&#39;]
**metric_types** | **[list_t](char.md) \*** | Metric types to get data for, default is all.  | [optional] 
**split_field** | **pinterest_rest_api_userAccountAnalytics_split_field_e** | How to split the data into groups. Not including this param means data won&#39;t be split. | [optional] [default to &#39;NO_SPLIT&#39;]
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 

### Return type

[list_t*_t](analytics_metrics_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserAccountAPI_userAccountAnalyticsTopPins**
```c
// Get user account top pins analytics
//
// Gets analytics data about a user's top pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
//
top_pins_analytics_response_t* UserAccountAPI_userAccountAnalyticsTopPins(apiClient_t *apiClient, char start_date, char end_date, pinterest_rest_api_userAccountAnalyticsTopPins_sort_by_e sort_by, pinterest_rest_api_userAccountAnalyticsTopPins_from_claimed_content_e from_claimed_content, pinterest_rest_api_userAccountAnalyticsTopPins_pin_format_e pin_format, pinterest_rest_api_userAccountAnalyticsTopPins_app_types_e app_types, pinterest_rest_api_userAccountAnalyticsTopPins_content_type_e content_type, pinterest_rest_api_userAccountAnalyticsTopPins_source_e source, list_t *metric_types, int *num_of_pins, int *created_in_last_n_days, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**start_date** | **char** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
**end_date** | **char** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
**sort_by** | **pinterest_rest_api_userAccountAnalyticsTopPins_sort_by_e** | Specify sorting order for metrics | 
**from_claimed_content** | **pinterest_rest_api_userAccountAnalyticsTopPins_from_claimed_content_e** | Filter on Pins that match your claimed domain. | [optional] [default to &#39;BOTH&#39;]
**pin_format** | **pinterest_rest_api_userAccountAnalyticsTopPins_pin_format_e** | Pin formats to get data for, default is all. | [optional] [default to &#39;ALL&#39;]
**app_types** | **pinterest_rest_api_userAccountAnalyticsTopPins_app_types_e** | Apps or devices to get data for, default is all. | [optional] [default to &#39;ALL&#39;]
**content_type** | **pinterest_rest_api_userAccountAnalyticsTopPins_content_type_e** | Filter to paid or organic data. Default is all. | [optional] [default to &#39;ALL&#39;]
**source** | **pinterest_rest_api_userAccountAnalyticsTopPins_source_e** | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [optional] [default to &#39;ALL&#39;]
**metric_types** | **[list_t](char.md) \*** | Metric types to get data for, default is all.  | [optional] 
**num_of_pins** | **int \*** | Number of pins to include, default is 10. Max is 50. | [optional] [default to 10]
**created_in_last_n_days** | **int \*** | Get metrics for pins created in the last \&quot;n\&quot; days. | [optional] 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 

### Return type

[top_pins_analytics_response_t](top_pins_analytics_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserAccountAPI_userAccountAnalyticsTopVideoPins**
```c
// Get user account top video pins analytics
//
// Gets analytics data about a user's top video pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
//
top_video_pins_analytics_response_t* UserAccountAPI_userAccountAnalyticsTopVideoPins(apiClient_t *apiClient, char start_date, char end_date, pinterest_rest_api_userAccountAnalyticsTopVideoPins_sort_by_e sort_by, pinterest_rest_api_userAccountAnalyticsTopVideoPins_from_claimed_content_e from_claimed_content, pinterest_rest_api_userAccountAnalyticsTopVideoPins_pin_format_e pin_format, pinterest_rest_api_userAccountAnalyticsTopVideoPins_app_types_e app_types, pinterest_rest_api_userAccountAnalyticsTopVideoPins_content_type_e content_type, pinterest_rest_api_userAccountAnalyticsTopVideoPins_source_e source, list_t *metric_types, int *num_of_pins, int *created_in_last_n_days, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**start_date** | **char** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
**end_date** | **char** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
**sort_by** | **pinterest_rest_api_userAccountAnalyticsTopVideoPins_sort_by_e** | Specify sorting order for video metrics | 
**from_claimed_content** | **pinterest_rest_api_userAccountAnalyticsTopVideoPins_from_claimed_content_e** | Filter on Pins that match your claimed domain. | [optional] [default to &#39;BOTH&#39;]
**pin_format** | **pinterest_rest_api_userAccountAnalyticsTopVideoPins_pin_format_e** | Pin formats to get data for, default is all. | [optional] [default to &#39;ALL&#39;]
**app_types** | **pinterest_rest_api_userAccountAnalyticsTopVideoPins_app_types_e** | Apps or devices to get data for, default is all. | [optional] [default to &#39;ALL&#39;]
**content_type** | **pinterest_rest_api_userAccountAnalyticsTopVideoPins_content_type_e** | Filter to paid or organic data. Default is all. | [optional] [default to &#39;ALL&#39;]
**source** | **pinterest_rest_api_userAccountAnalyticsTopVideoPins_source_e** | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [optional] [default to &#39;ALL&#39;]
**metric_types** | **[list_t](char.md) \*** | Metric types to get video data for, default is all.  | [optional] 
**num_of_pins** | **int \*** | Number of pins to include, default is 10. Max is 50. | [optional] [default to 10]
**created_in_last_n_days** | **int \*** | Get metrics for pins created in the last \&quot;n\&quot; days. | [optional] 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 

### Return type

[top_video_pins_analytics_response_t](top_video_pins_analytics_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserAccountAPI_userAccountFollowedInterests**
```c
// List following interests
//
// Get a list of a user's following interests in one place.
//
user_account_followed_interests_200_response_t* UserAccountAPI_userAccountFollowedInterests(apiClient_t *apiClient, char *username, char *bookmark, int *page_size);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**username** | **char \*** | A valid username | 
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 
**page_size** | **int \*** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[user_account_followed_interests_200_response_t](user_account_followed_interests_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserAccountAPI_userAccountGet**
```c
// Get user account
//
// Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/reference/business-access/'>Understanding Business Access</a> for more information.
//
account_t* UserAccountAPI_userAccountGet(apiClient_t *apiClient, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 

### Return type

[account_t](account.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserAccountAPI_userFollowingGet**
```c
// List following
//
// Get a list of who a certain user follows.
//
user_following_get_200_response_t* UserAccountAPI_userFollowingGet(apiClient_t *apiClient, char *bookmark, int *page_size, pinterest_rest_api_userFollowingGet_feed_type_e feed_type, int *explicit_following, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 
**page_size** | **int \*** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
**feed_type** | **pinterest_rest_api_userFollowingGet_feed_type_e** | Thrift param specifying what type of followees will be kept. Default to include all followees. | [optional] 
**explicit_following** | **int \*** | Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. | [optional] [default to false]
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 

### Return type

[user_following_get_200_response_t](user_following_get_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserAccountAPI_userWebsitesGet**
```c
// Get user websites
//
// Get user websites, claimed or not
//
user_websites_get_200_response_t* UserAccountAPI_userWebsitesGet(apiClient_t *apiClient, char *bookmark, int *page_size);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 
**page_size** | **int \*** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[user_websites_get_200_response_t](user_websites_get_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserAccountAPI_verifyWebsiteUpdate**
```c
// Verify website
//
// Verify a website as a signed-in user.
//
user_website_summary_t* UserAccountAPI_verifyWebsiteUpdate(apiClient_t *apiClient, user_website_verify_request_t *user_website_verify_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**user_website_verify_request** | **[user_website_verify_request_t](user_website_verify_request.md) \*** | Verify a website. | 

### Return type

[user_website_summary_t](user_website_summary.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UserAccountAPI_websiteVerificationGet**
```c
// Get user verification code for website claiming
//
// Get verification code for user to install on the website to claim it.
//
user_website_verification_code_t* UserAccountAPI_websiteVerificationGet(apiClient_t *apiClient);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |

### Return type

[user_website_verification_code_t](user_website_verification_code.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

