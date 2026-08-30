# UserAccountApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**boards_user_follows_list**](UserAccountApi.md#boards_user_follows_list) | **GET** /user_account/following/boards | List following boards
[**follow_user_update**](UserAccountApi.md#follow_user_update) | **POST** /user_account/following/{username} | Follow user
[**followers_list**](UserAccountApi.md#followers_list) | **GET** /user_account/followers | List followers
[**linked_business_accounts_get**](UserAccountApi.md#linked_business_accounts_get) | **GET** /user_account/businesses | List linked businesses
[**unverify_website_delete**](UserAccountApi.md#unverify_website_delete) | **DELETE** /user_account/websites | Unverify website
[**user_account_analytics**](UserAccountApi.md#user_account_analytics) | **GET** /user_account/analytics | Get user account analytics
[**user_account_analytics_top_pins**](UserAccountApi.md#user_account_analytics_top_pins) | **GET** /user_account/analytics/top_pins | Get user account top pins analytics
[**user_account_analytics_top_video_pins**](UserAccountApi.md#user_account_analytics_top_video_pins) | **GET** /user_account/analytics/top_video_pins | Get user account top video pins analytics
[**user_account_followed_interests**](UserAccountApi.md#user_account_followed_interests) | **GET** /users/{username}/interests/follow | List following interests
[**user_account_get**](UserAccountApi.md#user_account_get) | **GET** /user_account | Get user account
[**user_following_get**](UserAccountApi.md#user_following_get) | **GET** /user_account/following | List following
[**user_websites_get**](UserAccountApi.md#user_websites_get) | **GET** /user_account/websites | Get user websites
[**verify_website_update**](UserAccountApi.md#verify_website_update) | **POST** /user_account/websites | Verify website
[**website_verification_get**](UserAccountApi.md#website_verification_get) | **GET** /user_account/websites/verification | Get user verification code for website claiming


# **boards_user_follows_list**
> `boards_user_follows_list`(req::`HTTP.Request`; `ad_account_id`=nothing, `explicit_following`=nothing, `bookmark`=nothing, `page_size`=nothing,) -> `BoardsList200Response`

List following boards

Get a list of the boards a user follows. The request returns a board summary object array.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`ad_account_id`** | **`String`**| Unique identifier of an ad account. | [default to nothing]
 **`explicit_following`** | **`Bool`**| Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. | [default to false]
 **`bookmark`** | **`String`**| Cursor used to fetch the next page of items | [default to nothing]
 **`page_size`** | **`Int64`**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**`BoardsList200Response`**](BoardsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **follow_user_update**
> `follow_user_update`(req::`HTTP.Request`, `username`::`String`, `follow_user_create`::`FollowUserCreate`;) -> `FollowUser`

Follow user

**This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**  Use this request, as a signed-in user, to follow another user.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`username`** | **`String`**| A valid username |
**`follow_user_create`** | [**`FollowUserCreate`**](FollowUserCreate.md)|  |

### Return type

[**`FollowUser`**](FollowUser.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **followers_list**
> `followers_list`(req::`HTTP.Request`; `bookmark`=nothing, `page_size`=nothing,) -> `FollowersList200Response`

List followers

Get a list of your followers.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`bookmark`** | **`String`**| Cursor used to fetch the next page of items | [default to nothing]
 **`page_size`** | **`Int64`**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**`FollowersList200Response`**](FollowersList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **linked_business_accounts_get**
> `linked_business_accounts_get`(req::`HTTP.Request`;) -> `Vector{LinkedBusiness}`

List linked businesses

Get a list of your linked business accounts.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**`Vector{LinkedBusiness}`**](LinkedBusiness.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **unverify_website_delete**
> `unverify_website_delete`(req::`HTTP.Request`, `website`::`String`;) -> `UserWebsite`

Unverify website

Unverify a website verified by the signed-in user.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`website`** | **`String`**| Website with path or domain only |

### Return type

[**`UserWebsite`**](UserWebsite.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_account_analytics**
> `user_account_analytics`(req::`HTTP.Request`, `start_date`::`Date`, `end_date`::`Date`; `from_claimed_content`=nothing, `pin_format`=nothing, `app_types`=nothing, `content_type`=nothing, `source`=nothing, `metric_types`=nothing, `split_field`=nothing, `ad_account_id`=nothing,) -> `Dict{String, AnalyticsMetricsResponse}`

Get user account analytics

Get analytics for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`start_date`** | **`Date`**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |
**`end_date`** | **`Date`**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`from_claimed_content`** | **`String`**| Filter on Pins that match your claimed domain. | [default to &quot;BOTH&quot;]
 **`pin_format`** | **`String`**| Pin formats to get data for, default is all. | [default to &quot;ALL&quot;]
 **`app_types`** | **`String`**| Apps or devices to get data for, default is all. | [default to &quot;ALL&quot;]
 **`content_type`** | **`String`**| Filter to paid or organic data. Default is all. | [default to &quot;ALL&quot;]
 **`source`** | **`String`**| Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [default to &quot;ALL&quot;]
 **`metric_types`** | [**`Vector{QuerymetrictypesItems}`**](QuerymetrictypesItems.md)| Metric types to get data for, default is all. | [default to nothing]
 **`split_field`** | **`String`**| How to split the data into groups. Not including this param means data won&#39;t be split. | [default to &quot;NO_SPLIT&quot;]
 **`ad_account_id`** | **`String`**| Unique identifier of an ad account. | [default to nothing]

### Return type

[**`Dict{String, AnalyticsMetricsResponse}`**](AnalyticsMetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_account_analytics_top_pins**
> `user_account_analytics_top_pins`(req::`HTTP.Request`, `start_date`::`Date`, `end_date`::`Date`, `sort_by`::`TopPinsSortBy`; `from_claimed_content`=nothing, `pin_format`=nothing, `app_types`=nothing, `content_type`=nothing, `source`=nothing, `metric_types`=nothing, `num_of_pins`=nothing, `created_in_last_n_days`=nothing, `ad_account_id`=nothing,) -> `TopPinsAnalyticsResponse`

Get user account top pins analytics

Gets analytics data about a user's top pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`start_date`** | **`Date`**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |
**`end_date`** | **`Date`**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |
**`sort_by`** | [**`TopPinsSortBy`**](.md)| Specify sorting order for metrics |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`from_claimed_content`** | **`String`**| Filter on Pins that match your claimed domain. | [default to &quot;BOTH&quot;]
 **`pin_format`** | **`String`**| Pin formats to get data for, default is all. | [default to &quot;ALL&quot;]
 **`app_types`** | **`String`**| Apps or devices to get data for, default is all. | [default to &quot;ALL&quot;]
 **`content_type`** | **`String`**| Filter to paid or organic data. Default is all. | [default to &quot;ALL&quot;]
 **`source`** | **`String`**| Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [default to &quot;ALL&quot;]
 **`metric_types`** | [**`Vector{QuerymetrictypesItems}`**](QuerymetrictypesItems.md)| Metric types to get data for, default is all. | [default to nothing]
 **`num_of_pins`** | **`Int64`**| Number of pins to include, default is 10. Max is 50. | [default to 10]
 **`created_in_last_n_days`** | **`Float64`**| Get metrics for pins created in the last \&quot;n\&quot; days. | [default to nothing]
 **`ad_account_id`** | **`String`**| Unique identifier of an ad account. | [default to nothing]

### Return type

[**`TopPinsAnalyticsResponse`**](TopPinsAnalyticsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_account_analytics_top_video_pins**
> `user_account_analytics_top_video_pins`(req::`HTTP.Request`, `start_date`::`Date`, `end_date`::`Date`, `sort_by`::`TopVideoPinsSortBy`; `from_claimed_content`=nothing, `pin_format`=nothing, `app_types`=nothing, `content_type`=nothing, `source`=nothing, `metric_types`=nothing, `num_of_pins`=nothing, `created_in_last_n_days`=nothing, `ad_account_id`=nothing,) -> `TopVideoPinsAnalyticsResponse`

Get user account top video pins analytics

Gets analytics data about a user's top video pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`start_date`** | **`Date`**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |
**`end_date`** | **`Date`**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |
**`sort_by`** | [**`TopVideoPinsSortBy`**](.md)| Specify sorting order for video metrics |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`from_claimed_content`** | **`String`**| Filter on Pins that match your claimed domain. | [default to &quot;BOTH&quot;]
 **`pin_format`** | **`String`**| Pin formats to get data for, default is all. | [default to &quot;ALL&quot;]
 **`app_types`** | **`String`**| Apps or devices to get data for, default is all. | [default to &quot;ALL&quot;]
 **`content_type`** | **`String`**| Filter to paid or organic data. Default is all. | [default to &quot;ALL&quot;]
 **`source`** | **`String`**| Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [default to &quot;ALL&quot;]
 **`metric_types`** | [**`Vector{QueryvideopinmetrictypesItems}`**](QueryvideopinmetrictypesItems.md)| Metric types to get video data for, default is all. | [default to nothing]
 **`num_of_pins`** | **`Int64`**| Number of pins to include, default is 10. Max is 50. | [default to 10]
 **`created_in_last_n_days`** | **`Float64`**| Get metrics for pins created in the last \&quot;n\&quot; days. | [default to nothing]
 **`ad_account_id`** | **`String`**| Unique identifier of an ad account. | [default to nothing]

### Return type

[**`TopVideoPinsAnalyticsResponse`**](TopVideoPinsAnalyticsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_account_followed_interests**
> `user_account_followed_interests`(req::`HTTP.Request`, `username`::`String`; `bookmark`=nothing, `page_size`=nothing,) -> `UserAccountFollowedInterests200Response`

List following interests

Get a list of a user's following interests in one place.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`username`** | **`String`**| A valid username |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`bookmark`** | **`String`**| Cursor used to fetch the next page of items | [default to nothing]
 **`page_size`** | **`Int64`**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**`UserAccountFollowedInterests200Response`**](UserAccountFollowedInterests200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_account_get**
> `user_account_get`(req::`HTTP.Request`; `ad_account_id`=nothing,) -> `Account`

Get user account

Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  [Understanding Business Access]: https://developers.pinterest.com/docs/getting-started/using-business-access/ \"Understanding Business Access\" If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See [Understanding Business Access] for more information.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`ad_account_id`** | **`String`**| Unique identifier of an ad account. | [default to nothing]

### Return type

[**`Account`**](Account.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_following_get**
> `user_following_get`(req::`HTTP.Request`; `ad_account_id`=nothing, `explicit_following`=nothing, `feed_type`=nothing, `bookmark`=nothing, `page_size`=nothing,) -> `FollowersList200Response`

List following

Get a list of who a certain user follows.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`ad_account_id`** | **`String`**| Unique identifier of an ad account. | [default to nothing]
 **`explicit_following`** | **`Bool`**| Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. | [default to false]
 **`feed_type`** | [**`UserFollowingFeedType`**](.md)| Thrift param specifying what type of followees will be kept. Default to include all followees. | [default to nothing]
 **`bookmark`** | **`String`**| Cursor used to fetch the next page of items | [default to nothing]
 **`page_size`** | **`Int64`**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**`FollowersList200Response`**](FollowersList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_websites_get**
> `user_websites_get`(req::`HTTP.Request`; `bookmark`=nothing, `page_size`=nothing,) -> `UserWebsitesGet200Response`

Get user websites

Get user websites, claimed or not

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`bookmark`** | **`String`**| Cursor used to fetch the next page of items | [default to nothing]
 **`page_size`** | **`Int64`**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**`UserWebsitesGet200Response`**](UserWebsitesGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **verify_website_update**
> `verify_website_update`(req::`HTTP.Request`, `user_website_create`::`UserWebsiteCreate`; `ad_account_id`=nothing,) -> `UserWebsite`

Verify website

Verify a website as a signed-in user.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`user_website_create`** | [**`UserWebsiteCreate`**](UserWebsiteCreate.md)|  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`ad_account_id`** | **`String`**| Unique identifier of an ad account. | [default to nothing]

### Return type

[**`UserWebsite`**](UserWebsite.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **website_verification_get**
> `website_verification_get`(req::`HTTP.Request`; `ad_account_id`=nothing,) -> `UserWebsiteVerification`

Get user verification code for website claiming

Get verification code for user to install on the website to claim it.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`ad_account_id`** | **`String`**| Unique identifier of an ad account. | [default to nothing]

### Return type

[**`UserWebsiteVerification`**](UserWebsiteVerification.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

