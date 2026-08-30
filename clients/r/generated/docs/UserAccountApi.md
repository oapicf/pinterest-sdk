# UserAccountApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**BoardsUserFollowsList**](UserAccountApi.md#BoardsUserFollowsList) | **GET** /user_account/following/boards | List following boards
[**FollowUserUpdate**](UserAccountApi.md#FollowUserUpdate) | **POST** /user_account/following/{username} | Follow user
[**FollowersList**](UserAccountApi.md#FollowersList) | **GET** /user_account/followers | List followers
[**LinkedBusinessAccountsGet**](UserAccountApi.md#LinkedBusinessAccountsGet) | **GET** /user_account/businesses | List linked businesses
[**UnverifyWebsiteDelete**](UserAccountApi.md#UnverifyWebsiteDelete) | **DELETE** /user_account/websites | Unverify website
[**UserAccountAnalytics**](UserAccountApi.md#UserAccountAnalytics) | **GET** /user_account/analytics | Get user account analytics
[**UserAccountAnalyticsTopPins**](UserAccountApi.md#UserAccountAnalyticsTopPins) | **GET** /user_account/analytics/top_pins | Get user account top pins analytics
[**UserAccountAnalyticsTopVideoPins**](UserAccountApi.md#UserAccountAnalyticsTopVideoPins) | **GET** /user_account/analytics/top_video_pins | Get user account top video pins analytics
[**UserAccountFollowedInterests**](UserAccountApi.md#UserAccountFollowedInterests) | **GET** /users/{username}/interests/follow | List following interests
[**UserAccountGet**](UserAccountApi.md#UserAccountGet) | **GET** /user_account | Get user account
[**UserFollowingGet**](UserAccountApi.md#UserFollowingGet) | **GET** /user_account/following | List following
[**UserWebsitesGet**](UserAccountApi.md#UserWebsitesGet) | **GET** /user_account/websites | Get user websites
[**VerifyWebsiteUpdate**](UserAccountApi.md#VerifyWebsiteUpdate) | **POST** /user_account/websites | Verify website
[**WebsiteVerificationGet**](UserAccountApi.md#WebsiteVerificationGet) | **GET** /user_account/websites/verification | Get user verification code for website claiming


# **BoardsUserFollowsList**
> BoardsList200Response BoardsUserFollowsList(ad_account_id = var.ad_account_id, explicit_following = FALSE, bookmark = var.bookmark, page_size = 25)

List following boards

Get a list of the boards a user follows. The request returns a board summary object array.

### Example
```R
library(openapi)

# List following boards
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)
var_explicit_following <- FALSE # character | Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. (Optional)
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (Optional)

api_instance <- UserAccountApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$BoardsUserFollowsList(ad_account_id = var_ad_account_id, explicit_following = var_explicit_following, bookmark = var_bookmark, page_size = var_page_sizedata_file = "result.txt")
result <- api_instance$BoardsUserFollowsList(ad_account_id = var_ad_account_id, explicit_following = var_explicit_following, bookmark = var_bookmark, page_size = var_page_size)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 
 **explicit_following** | **character**| Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. | [optional] [default to FALSE]
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**BoardsList200Response**](boards_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **FollowUserUpdate**
> FollowUser FollowUserUpdate(username, follow_user_create)

Follow user

**This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**  Use this request, as a signed-in user, to follow another user.

### Example
```R
library(openapi)

# Follow user
#
# prepare function argument(s)
var_username <- "username_example" # character | A valid username
var_follow_user_create <- FollowUserCreate$new("auto_follow_example") # FollowUserCreate | 

api_instance <- UserAccountApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$FollowUserUpdate(var_username, var_follow_user_createdata_file = "result.txt")
result <- api_instance$FollowUserUpdate(var_username, var_follow_user_create)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **character**| A valid username | 
 **follow_user_create** | [**FollowUserCreate**](FollowUserCreate.md)|  | 

### Return type

[**FollowUser**](FollowUser.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **201** | Resource create operation completed successfully. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **FollowersList**
> FollowersList200Response FollowersList(bookmark = var.bookmark, page_size = 25)

List followers

Get a list of your followers.

### Example
```R
library(openapi)

# List followers
#
# prepare function argument(s)
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (Optional)

api_instance <- UserAccountApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$FollowersList(bookmark = var_bookmark, page_size = var_page_sizedata_file = "result.txt")
result <- api_instance$FollowersList(bookmark = var_bookmark, page_size = var_page_size)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**FollowersList200Response**](followers_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **LinkedBusinessAccountsGet**
> array[LinkedBusiness] LinkedBusinessAccountsGet()

List linked businesses

Get a list of your linked business accounts.

### Example
```R
library(openapi)

# List linked businesses
#

api_instance <- UserAccountApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$LinkedBusinessAccountsGet(data_file = "result.txt")
result <- api_instance$LinkedBusinessAccountsGet()
dput(result)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**array[LinkedBusiness]**](LinkedBusiness.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **UnverifyWebsiteDelete**
> UserWebsite UnverifyWebsiteDelete(website)

Unverify website

Unverify a website verified by the signed-in user.

### Example
```R
library(openapi)

# Unverify website
#
# prepare function argument(s)
var_website <- "website_example" # character | Website with path or domain only

api_instance <- UserAccountApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$UnverifyWebsiteDelete(var_websitedata_file = "result.txt")
result <- api_instance$UnverifyWebsiteDelete(var_website)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **website** | **character**| Website with path or domain only | 

### Return type

[**UserWebsite**](UserWebsite.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **204** | Resource deleted successfully. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **UserAccountAnalytics**
> map(AnalyticsMetricsResponse) UserAccountAnalytics(start_date, end_date, from_claimed_content = "BOTH", pin_format = "ALL", app_types = "ALL", content_type = "ALL", source = "ALL", metric_types = var.metric_types, split_field = "NO_SPLIT", ad_account_id = var.ad_account_id)

Get user account analytics

Get analytics for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".

### Example
```R
library(openapi)

# Get user account analytics
#
# prepare function argument(s)
var_start_date <- "start_date_example" # character | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
var_end_date <- "end_date_example" # character | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
var_from_claimed_content <- "BOTH" # character | Filter on Pins that match your claimed domain. (Optional)
var_pin_format <- "ALL" # character | Pin formats to get data for, default is all. (Optional)
var_app_types <- "ALL" # character | Apps or devices to get data for, default is all. (Optional)
var_content_type <- "ALL" # character | Filter to paid or organic data. Default is all. (Optional)
var_source <- "ALL" # character | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts (Optional)
var_metric_types <- c(QuerymetrictypesItems$new()) # array[QuerymetrictypesItems] | Metric types to get data for, default is all. (Optional)
var_split_field <- "NO_SPLIT" # character | How to split the data into groups. Not including this param means data won't be split. (Optional)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- UserAccountApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$UserAccountAnalytics(var_start_date, var_end_date, from_claimed_content = var_from_claimed_content, pin_format = var_pin_format, app_types = var_app_types, content_type = var_content_type, source = var_source, metric_types = var_metric_types, split_field = var_split_field, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$UserAccountAnalytics(var_start_date, var_end_date, from_claimed_content = var_from_claimed_content, pin_format = var_pin_format, app_types = var_app_types, content_type = var_content_type, source = var_source, metric_types = var_metric_types, split_field = var_split_field, ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_date** | **character**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **end_date** | **character**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **from_claimed_content** | Enum [OTHER, CLAIMED, BOTH] | Filter on Pins that match your claimed domain. | [optional] [default to &quot;BOTH&quot;]
 **pin_format** | Enum [ALL, ORGANIC_IMAGE, ORGANIC_PRODUCT, ORGANIC_VIDEO, ADS_STANDARD, ADS_PRODUCT, ADS_VIDEO, ADS_IDEA] | Pin formats to get data for, default is all. | [optional] [default to &quot;ALL&quot;]
 **app_types** | Enum [ALL, MOBILE, TABLET, WEB] | Apps or devices to get data for, default is all. | [optional] [default to &quot;ALL&quot;]
 **content_type** | Enum [ALL, PAID, ORGANIC] | Filter to paid or organic data. Default is all. | [optional] [default to &quot;ALL&quot;]
 **source** | Enum [ALL, YOUR_PINS, OTHER_PINS] | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [optional] [default to &quot;ALL&quot;]
 **metric_types** | list( [**QuerymetrictypesItems**](QuerymetrictypesItems.md) )| Metric types to get data for, default is all. | [optional] 
 **split_field** | Enum [NO_SPLIT, APP_TYPE, OWNED_CONTENT, SOURCE, PIN_FORMAT] | How to split the data into groups. Not including this param means data won&#39;t be split. | [optional] [default to &quot;NO_SPLIT&quot;]
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 

### Return type

[**map(AnalyticsMetricsResponse)**](AnalyticsMetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **UserAccountAnalyticsTopPins**
> TopPinsAnalyticsResponse UserAccountAnalyticsTopPins(start_date, end_date, sort_by, from_claimed_content = "BOTH", pin_format = "ALL", app_types = "ALL", content_type = "ALL", source = "ALL", metric_types = var.metric_types, num_of_pins = 10, created_in_last_n_days = var.created_in_last_n_days, ad_account_id = var.ad_account_id)

Get user account top pins analytics

Gets analytics data about a user's top pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".

### Example
```R
library(openapi)

# Get user account top pins analytics
#
# prepare function argument(s)
var_start_date <- "start_date_example" # character | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
var_end_date <- "end_date_example" # character | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
var_sort_by <- TopPinsSortBy$new() # TopPinsSortBy | Specify sorting order for metrics
var_from_claimed_content <- "BOTH" # character | Filter on Pins that match your claimed domain. (Optional)
var_pin_format <- "ALL" # character | Pin formats to get data for, default is all. (Optional)
var_app_types <- "ALL" # character | Apps or devices to get data for, default is all. (Optional)
var_content_type <- "ALL" # character | Filter to paid or organic data. Default is all. (Optional)
var_source <- "ALL" # character | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts (Optional)
var_metric_types <- c(QuerymetrictypesItems$new()) # array[QuerymetrictypesItems] | Metric types to get data for, default is all. (Optional)
var_num_of_pins <- 10 # integer | Number of pins to include, default is 10. Max is 50. (Optional)
var_created_in_last_n_days <- 3.4 # numeric | Get metrics for pins created in the last \"n\" days. (Optional)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- UserAccountApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$UserAccountAnalyticsTopPins(var_start_date, var_end_date, var_sort_by, from_claimed_content = var_from_claimed_content, pin_format = var_pin_format, app_types = var_app_types, content_type = var_content_type, source = var_source, metric_types = var_metric_types, num_of_pins = var_num_of_pins, created_in_last_n_days = var_created_in_last_n_days, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$UserAccountAnalyticsTopPins(var_start_date, var_end_date, var_sort_by, from_claimed_content = var_from_claimed_content, pin_format = var_pin_format, app_types = var_app_types, content_type = var_content_type, source = var_source, metric_types = var_metric_types, num_of_pins = var_num_of_pins, created_in_last_n_days = var_created_in_last_n_days, ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_date** | **character**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **end_date** | **character**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **sort_by** | [**TopPinsSortBy**](.md)| Specify sorting order for metrics | 
 **from_claimed_content** | Enum [OTHER, CLAIMED, BOTH] | Filter on Pins that match your claimed domain. | [optional] [default to &quot;BOTH&quot;]
 **pin_format** | Enum [ALL, ORGANIC_IMAGE, ORGANIC_PRODUCT, ORGANIC_VIDEO, ADS_STANDARD, ADS_PRODUCT, ADS_VIDEO, ADS_IDEA] | Pin formats to get data for, default is all. | [optional] [default to &quot;ALL&quot;]
 **app_types** | Enum [ALL, MOBILE, TABLET, WEB] | Apps or devices to get data for, default is all. | [optional] [default to &quot;ALL&quot;]
 **content_type** | Enum [ALL, PAID, ORGANIC] | Filter to paid or organic data. Default is all. | [optional] [default to &quot;ALL&quot;]
 **source** | Enum [ALL, YOUR_PINS, OTHER_PINS] | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [optional] [default to &quot;ALL&quot;]
 **metric_types** | list( [**QuerymetrictypesItems**](QuerymetrictypesItems.md) )| Metric types to get data for, default is all. | [optional] 
 **num_of_pins** | **integer**| Number of pins to include, default is 10. Max is 50. | [optional] [default to 10]
 **created_in_last_n_days** | Enum [30] | Get metrics for pins created in the last \&quot;n\&quot; days. | [optional] 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 

### Return type

[**TopPinsAnalyticsResponse**](TopPinsAnalyticsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **UserAccountAnalyticsTopVideoPins**
> TopVideoPinsAnalyticsResponse UserAccountAnalyticsTopVideoPins(start_date, end_date, sort_by, from_claimed_content = "BOTH", pin_format = "ALL", app_types = "ALL", content_type = "ALL", source = "ALL", metric_types = var.metric_types, num_of_pins = 10, created_in_last_n_days = var.created_in_last_n_days, ad_account_id = var.ad_account_id)

Get user account top video pins analytics

Gets analytics data about a user's top video pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".

### Example
```R
library(openapi)

# Get user account top video pins analytics
#
# prepare function argument(s)
var_start_date <- "start_date_example" # character | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
var_end_date <- "end_date_example" # character | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
var_sort_by <- TopVideoPinsSortBy$new() # TopVideoPinsSortBy | Specify sorting order for video metrics
var_from_claimed_content <- "BOTH" # character | Filter on Pins that match your claimed domain. (Optional)
var_pin_format <- "ALL" # character | Pin formats to get data for, default is all. (Optional)
var_app_types <- "ALL" # character | Apps or devices to get data for, default is all. (Optional)
var_content_type <- "ALL" # character | Filter to paid or organic data. Default is all. (Optional)
var_source <- "ALL" # character | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts (Optional)
var_metric_types <- c(QueryvideopinmetrictypesItems$new()) # array[QueryvideopinmetrictypesItems] | Metric types to get video data for, default is all. (Optional)
var_num_of_pins <- 10 # integer | Number of pins to include, default is 10. Max is 50. (Optional)
var_created_in_last_n_days <- 3.4 # numeric | Get metrics for pins created in the last \"n\" days. (Optional)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- UserAccountApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$UserAccountAnalyticsTopVideoPins(var_start_date, var_end_date, var_sort_by, from_claimed_content = var_from_claimed_content, pin_format = var_pin_format, app_types = var_app_types, content_type = var_content_type, source = var_source, metric_types = var_metric_types, num_of_pins = var_num_of_pins, created_in_last_n_days = var_created_in_last_n_days, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$UserAccountAnalyticsTopVideoPins(var_start_date, var_end_date, var_sort_by, from_claimed_content = var_from_claimed_content, pin_format = var_pin_format, app_types = var_app_types, content_type = var_content_type, source = var_source, metric_types = var_metric_types, num_of_pins = var_num_of_pins, created_in_last_n_days = var_created_in_last_n_days, ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_date** | **character**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **end_date** | **character**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **sort_by** | [**TopVideoPinsSortBy**](.md)| Specify sorting order for video metrics | 
 **from_claimed_content** | Enum [OTHER, CLAIMED, BOTH] | Filter on Pins that match your claimed domain. | [optional] [default to &quot;BOTH&quot;]
 **pin_format** | Enum [ALL, ORGANIC_IMAGE, ORGANIC_PRODUCT, ORGANIC_VIDEO, ADS_STANDARD, ADS_PRODUCT, ADS_VIDEO, ADS_IDEA] | Pin formats to get data for, default is all. | [optional] [default to &quot;ALL&quot;]
 **app_types** | Enum [ALL, MOBILE, TABLET, WEB] | Apps or devices to get data for, default is all. | [optional] [default to &quot;ALL&quot;]
 **content_type** | Enum [ALL, PAID, ORGANIC] | Filter to paid or organic data. Default is all. | [optional] [default to &quot;ALL&quot;]
 **source** | Enum [ALL, YOUR_PINS, OTHER_PINS] | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [optional] [default to &quot;ALL&quot;]
 **metric_types** | list( [**QueryvideopinmetrictypesItems**](QueryvideopinmetrictypesItems.md) )| Metric types to get video data for, default is all. | [optional] 
 **num_of_pins** | **integer**| Number of pins to include, default is 10. Max is 50. | [optional] [default to 10]
 **created_in_last_n_days** | Enum [30] | Get metrics for pins created in the last \&quot;n\&quot; days. | [optional] 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 

### Return type

[**TopVideoPinsAnalyticsResponse**](TopVideoPinsAnalyticsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **UserAccountFollowedInterests**
> UserAccountFollowedInterests200Response UserAccountFollowedInterests(username, bookmark = var.bookmark, page_size = 25)

List following interests

Get a list of a user's following interests in one place.

### Example
```R
library(openapi)

# List following interests
#
# prepare function argument(s)
var_username <- "username_example" # character | A valid username
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (Optional)

api_instance <- UserAccountApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$UserAccountFollowedInterests(var_username, bookmark = var_bookmark, page_size = var_page_sizedata_file = "result.txt")
result <- api_instance$UserAccountFollowedInterests(var_username, bookmark = var_bookmark, page_size = var_page_size)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **character**| A valid username | 
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**UserAccountFollowedInterests200Response**](user_account_followed_interests_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The server could not understand the request due to invalid syntax. |  -  |
| **401** | Access is unauthorized. |  -  |
| **404** | The server cannot find the requested resource. |  -  |
| **0** | Unexpected error |  -  |

# **UserAccountGet**
> Account UserAccountGet(ad_account_id = var.ad_account_id)

Get user account

Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  [Understanding Business Access]: https://developers.pinterest.com/docs/getting-started/using-business-access/ \"Understanding Business Access\" If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See [Understanding Business Access] for more information.

### Example
```R
library(openapi)

# Get user account
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- UserAccountApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$UserAccountGet(ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$UserAccountGet(ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 

### Return type

[**Account**](Account.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **UserFollowingGet**
> FollowersList200Response UserFollowingGet(ad_account_id = var.ad_account_id, explicit_following = FALSE, feed_type = var.feed_type, bookmark = var.bookmark, page_size = 25)

List following

Get a list of who a certain user follows.

### Example
```R
library(openapi)

# List following
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)
var_explicit_following <- FALSE # character | Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. (Optional)
var_feed_type <- UserFollowingFeedType$new() # UserFollowingFeedType | Thrift param specifying what type of followees will be kept. Default to include all followees. (Optional)
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (Optional)

api_instance <- UserAccountApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$UserFollowingGet(ad_account_id = var_ad_account_id, explicit_following = var_explicit_following, feed_type = var_feed_type, bookmark = var_bookmark, page_size = var_page_sizedata_file = "result.txt")
result <- api_instance$UserFollowingGet(ad_account_id = var_ad_account_id, explicit_following = var_explicit_following, feed_type = var_feed_type, bookmark = var_bookmark, page_size = var_page_size)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 
 **explicit_following** | **character**| Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. | [optional] [default to FALSE]
 **feed_type** | [**UserFollowingFeedType**](.md)| Thrift param specifying what type of followees will be kept. Default to include all followees. | [optional] 
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**FollowersList200Response**](followers_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **UserWebsitesGet**
> UserWebsitesGet200Response UserWebsitesGet(bookmark = var.bookmark, page_size = 25)

Get user websites

Get user websites, claimed or not

### Example
```R
library(openapi)

# Get user websites
#
# prepare function argument(s)
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (Optional)

api_instance <- UserAccountApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$UserWebsitesGet(bookmark = var_bookmark, page_size = var_page_sizedata_file = "result.txt")
result <- api_instance$UserWebsitesGet(bookmark = var_bookmark, page_size = var_page_size)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**UserWebsitesGet200Response**](user_websites_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **VerifyWebsiteUpdate**
> UserWebsite VerifyWebsiteUpdate(user_website_create, ad_account_id = var.ad_account_id)

Verify website

Verify a website as a signed-in user.

### Example
```R
library(openapi)

# Verify website
#
# prepare function argument(s)
var_user_website_create <- UserWebsiteCreate$new(WebsiteVerificationMethod$new(), "website_example") # UserWebsiteCreate | 
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- UserAccountApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$VerifyWebsiteUpdate(var_user_website_create, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$VerifyWebsiteUpdate(var_user_website_create, ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_website_create** | [**UserWebsiteCreate**](UserWebsiteCreate.md)|  | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 

### Return type

[**UserWebsite**](UserWebsite.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **201** | Resource create operation completed successfully. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **WebsiteVerificationGet**
> UserWebsiteVerification WebsiteVerificationGet(ad_account_id = var.ad_account_id)

Get user verification code for website claiming

Get verification code for user to install on the website to claim it.

### Example
```R
library(openapi)

# Get user verification code for website claiming
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- UserAccountApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$WebsiteVerificationGet(ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$WebsiteVerificationGet(ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 

### Return type

[**UserWebsiteVerification**](UserWebsiteVerification.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

