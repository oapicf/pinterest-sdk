# \UserAccountApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**boards_user_follows_slash_list**](UserAccountApi.md#boards_user_follows_slash_list) | **GET** /user_account/following/boards | List following boards
[**follow_user_slash_update**](UserAccountApi.md#follow_user_slash_update) | **POST** /user_account/following/{username} | Follow user
[**followers_slash_list**](UserAccountApi.md#followers_slash_list) | **GET** /user_account/followers | List followers
[**linked_business_accounts_slash_get**](UserAccountApi.md#linked_business_accounts_slash_get) | **GET** /user_account/businesses | List linked businesses
[**unverify_website_slash_delete**](UserAccountApi.md#unverify_website_slash_delete) | **DELETE** /user_account/websites | Unverify website
[**user_account_slash_analytics**](UserAccountApi.md#user_account_slash_analytics) | **GET** /user_account/analytics | Get user account analytics
[**user_account_slash_analytics_slash_top_pins**](UserAccountApi.md#user_account_slash_analytics_slash_top_pins) | **GET** /user_account/analytics/top_pins | Get user account top pins analytics
[**user_account_slash_analytics_slash_top_video_pins**](UserAccountApi.md#user_account_slash_analytics_slash_top_video_pins) | **GET** /user_account/analytics/top_video_pins | Get user account top video pins analytics
[**user_account_slash_followed_interests**](UserAccountApi.md#user_account_slash_followed_interests) | **GET** /users/{username}/interests/follow | List following interests
[**user_account_slash_get**](UserAccountApi.md#user_account_slash_get) | **GET** /user_account | Get user account
[**user_following_slash_get**](UserAccountApi.md#user_following_slash_get) | **GET** /user_account/following | List following
[**user_websites_slash_get**](UserAccountApi.md#user_websites_slash_get) | **GET** /user_account/websites | Get user websites
[**verify_website_slash_update**](UserAccountApi.md#verify_website_slash_update) | **POST** /user_account/websites | Verify website
[**website_verification_slash_get**](UserAccountApi.md#website_verification_slash_get) | **GET** /user_account/websites/verification | Get user verification code for website claiming



## boards_user_follows_slash_list

> models::BoardsUserFollowsList200Response boards_user_follows_slash_list(bookmark, page_size, explicit_following, ad_account_id)
List following boards

Get a list of the boards a user follows. The request returns a board summary object array.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**bookmark** | Option<**String**> | Cursor used to fetch the next page of items |  |
**page_size** | Option<**i32**> | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. |  |[default to 25]
**explicit_following** | Option<**bool**> | Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. |  |[default to false]
**ad_account_id** | Option<**String**> | Unique identifier of an ad account. |  |

### Return type

[**models::BoardsUserFollowsList200Response**](boards_user_follows_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## follow_user_slash_update

> models::UserSummary follow_user_slash_update(username, follow_user_request)
Follow user

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>  Use this request, as a signed-in user, to follow another user.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**username** | **String** | A valid username | [required] |
**follow_user_request** | [**FollowUserRequest**](FollowUserRequest.md) | Follow a user. | [required] |

### Return type

[**models::UserSummary**](UserSummary.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## followers_slash_list

> models::FollowersList200Response followers_slash_list(bookmark, page_size)
List followers

Get a list of your followers.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**bookmark** | Option<**String**> | Cursor used to fetch the next page of items |  |
**page_size** | Option<**i32**> | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. |  |[default to 25]

### Return type

[**models::FollowersList200Response**](followers_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## linked_business_accounts_slash_get

> Vec<models::LinkedBusiness> linked_business_accounts_slash_get()
List linked businesses

Get a list of your linked business accounts.

### Parameters

This endpoint does not need any parameter.

### Return type

[**Vec<models::LinkedBusiness>**](LinkedBusiness.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## unverify_website_slash_delete

> unverify_website_slash_delete(website)
Unverify website

Unverifu a website verified by the signed-in user.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**website** | **String** | Website with path or domain only | [required] |

### Return type

 (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## user_account_slash_analytics

> std::collections::HashMap<String, models::AnalyticsMetricsResponse> user_account_slash_analytics(start_date, end_date, from_claimed_content, pin_format, app_types, content_type, source, metric_types, split_field, ad_account_id)
Get user account analytics

Get analytics for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**start_date** | **String** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [required] |
**end_date** | **String** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [required] |
**from_claimed_content** | Option<**String**> | Filter on Pins that match your claimed domain. |  |[default to BOTH]
**pin_format** | Option<**String**> | Pin formats to get data for, default is all. |  |[default to ALL]
**app_types** | Option<**String**> | Apps or devices to get data for, default is all. |  |[default to ALL]
**content_type** | Option<**String**> | Filter to paid or organic data. Default is all. |  |[default to ALL]
**source** | Option<**String**> | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts |  |[default to ALL]
**metric_types** | Option<[**Vec<String>**](String.md)> | Metric types to get data for, default is all.  |  |
**split_field** | Option<**String**> | How to split the data into groups. Not including this param means data won't be split. |  |[default to NO_SPLIT]
**ad_account_id** | Option<**String**> | Unique identifier of an ad account. |  |

### Return type

[**std::collections::HashMap<String, models::AnalyticsMetricsResponse>**](AnalyticsMetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## user_account_slash_analytics_slash_top_pins

> models::TopPinsAnalyticsResponse user_account_slash_analytics_slash_top_pins(start_date, end_date, sort_by, from_claimed_content, pin_format, app_types, content_type, source, metric_types, num_of_pins, created_in_last_n_days, ad_account_id)
Get user account top pins analytics

Gets analytics data about a user's top pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**start_date** | **String** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [required] |
**end_date** | **String** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [required] |
**sort_by** | **String** | Specify sorting order for metrics | [required] |
**from_claimed_content** | Option<**String**> | Filter on Pins that match your claimed domain. |  |[default to BOTH]
**pin_format** | Option<**String**> | Pin formats to get data for, default is all. |  |[default to ALL]
**app_types** | Option<**String**> | Apps or devices to get data for, default is all. |  |[default to ALL]
**content_type** | Option<**String**> | Filter to paid or organic data. Default is all. |  |[default to ALL]
**source** | Option<**String**> | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts |  |[default to ALL]
**metric_types** | Option<[**Vec<String>**](String.md)> | Metric types to get data for, default is all.  |  |
**num_of_pins** | Option<**i32**> | Number of pins to include, default is 10. Max is 50. |  |[default to 10]
**created_in_last_n_days** | Option<**i32**> | Get metrics for pins created in the last \"n\" days. |  |
**ad_account_id** | Option<**String**> | Unique identifier of an ad account. |  |

### Return type

[**models::TopPinsAnalyticsResponse**](TopPinsAnalyticsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## user_account_slash_analytics_slash_top_video_pins

> models::TopVideoPinsAnalyticsResponse user_account_slash_analytics_slash_top_video_pins(start_date, end_date, sort_by, from_claimed_content, pin_format, app_types, content_type, source, metric_types, num_of_pins, created_in_last_n_days, ad_account_id)
Get user account top video pins analytics

Gets analytics data about a user's top video pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**start_date** | **String** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [required] |
**end_date** | **String** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [required] |
**sort_by** | **String** | Specify sorting order for video metrics | [required] |
**from_claimed_content** | Option<**String**> | Filter on Pins that match your claimed domain. |  |[default to BOTH]
**pin_format** | Option<**String**> | Pin formats to get data for, default is all. |  |[default to ALL]
**app_types** | Option<**String**> | Apps or devices to get data for, default is all. |  |[default to ALL]
**content_type** | Option<**String**> | Filter to paid or organic data. Default is all. |  |[default to ALL]
**source** | Option<**String**> | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts |  |[default to ALL]
**metric_types** | Option<[**Vec<String>**](String.md)> | Metric types to get video data for, default is all.  |  |
**num_of_pins** | Option<**i32**> | Number of pins to include, default is 10. Max is 50. |  |[default to 10]
**created_in_last_n_days** | Option<**i32**> | Get metrics for pins created in the last \"n\" days. |  |
**ad_account_id** | Option<**String**> | Unique identifier of an ad account. |  |

### Return type

[**models::TopVideoPinsAnalyticsResponse**](TopVideoPinsAnalyticsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## user_account_slash_followed_interests

> models::UserAccountFollowedInterests200Response user_account_slash_followed_interests(username, bookmark, page_size)
List following interests

Get a list of a user's following interests in one place.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**username** | **String** | A valid username | [required] |
**bookmark** | Option<**String**> | Cursor used to fetch the next page of items |  |
**page_size** | Option<**i32**> | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. |  |[default to 25]

### Return type

[**models::UserAccountFollowedInterests200Response**](user_account_followed_interests_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## user_account_slash_get

> models::Account user_account_slash_get(ad_account_id)
Get user account

Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/getting-started/using-business-access/'>Understanding Business Access</a> for more information.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | Option<**String**> | Unique identifier of an ad account. |  |

### Return type

[**models::Account**](Account.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## user_following_slash_get

> models::UserFollowingGet200Response user_following_slash_get(bookmark, page_size, feed_type, explicit_following, ad_account_id)
List following

Get a list of who a certain user follows.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**bookmark** | Option<**String**> | Cursor used to fetch the next page of items |  |
**page_size** | Option<**i32**> | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. |  |[default to 25]
**feed_type** | Option<**UserFollowingFeedType**> | Thrift param specifying what type of followees will be kept. Default to include all followees. |  |
**explicit_following** | Option<**bool**> | Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. |  |[default to false]
**ad_account_id** | Option<**String**> | Unique identifier of an ad account. |  |

### Return type

[**models::UserFollowingGet200Response**](user_following_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## user_websites_slash_get

> models::UserWebsitesGet200Response user_websites_slash_get(bookmark, page_size)
Get user websites

Get user websites, claimed or not

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**bookmark** | Option<**String**> | Cursor used to fetch the next page of items |  |
**page_size** | Option<**i32**> | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. |  |[default to 25]

### Return type

[**models::UserWebsitesGet200Response**](user_websites_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## verify_website_slash_update

> models::UserWebsiteSummary verify_website_slash_update(user_website_verify_request, ad_account_id)
Verify website

Verify a website as a signed-in user.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**user_website_verify_request** | [**UserWebsiteVerifyRequest**](UserWebsiteVerifyRequest.md) | Verify a website. | [required] |
**ad_account_id** | Option<**String**> | Unique identifier of an ad account. |  |

### Return type

[**models::UserWebsiteSummary**](UserWebsiteSummary.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## website_verification_slash_get

> models::UserWebsiteVerificationCode website_verification_slash_get(ad_account_id)
Get user verification code for website claiming

Get verification code for user to install on the website to claim it.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | Option<**String**> | Unique identifier of an ad account. |  |

### Return type

[**models::UserWebsiteVerificationCode**](UserWebsiteVerificationCode.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

