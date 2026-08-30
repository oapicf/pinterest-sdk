# Org.OpenAPITools.Api.UserAccountApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**BoardsUserFollowsList**](UserAccountApi.md#boardsuserfollowslist) | **GET** /user_account/following/boards | List following boards |
| [**FollowUserUpdate**](UserAccountApi.md#followuserupdate) | **POST** /user_account/following/{username} | Follow user |
| [**FollowersList**](UserAccountApi.md#followerslist) | **GET** /user_account/followers | List followers |
| [**LinkedBusinessAccountsGet**](UserAccountApi.md#linkedbusinessaccountsget) | **GET** /user_account/businesses | List linked businesses |
| [**UnverifyWebsiteDelete**](UserAccountApi.md#unverifywebsitedelete) | **DELETE** /user_account/websites | Unverify website |
| [**UserAccountAnalytics**](UserAccountApi.md#useraccountanalytics) | **GET** /user_account/analytics | Get user account analytics |
| [**UserAccountAnalyticsTopPins**](UserAccountApi.md#useraccountanalyticstoppins) | **GET** /user_account/analytics/top_pins | Get user account top pins analytics |
| [**UserAccountAnalyticsTopVideoPins**](UserAccountApi.md#useraccountanalyticstopvideopins) | **GET** /user_account/analytics/top_video_pins | Get user account top video pins analytics |
| [**UserAccountFollowedInterests**](UserAccountApi.md#useraccountfollowedinterests) | **GET** /users/{username}/interests/follow | List following interests |
| [**UserAccountGet**](UserAccountApi.md#useraccountget) | **GET** /user_account | Get user account |
| [**UserFollowingGet**](UserAccountApi.md#userfollowingget) | **GET** /user_account/following | List following |
| [**UserWebsitesGet**](UserAccountApi.md#userwebsitesget) | **GET** /user_account/websites | Get user websites |
| [**VerifyWebsiteUpdate**](UserAccountApi.md#verifywebsiteupdate) | **POST** /user_account/websites | Verify website |
| [**WebsiteVerificationGet**](UserAccountApi.md#websiteverificationget) | **GET** /user_account/websites/verification | Get user verification code for website claiming |

<a id="boardsuserfollowslist"></a>
# **BoardsUserFollowsList**
> BoardsList200Response BoardsUserFollowsList (string adAccountId = null, bool explicitFollowing = null, string bookmark = null, int pageSize = null)

List following boards

Get a list of the boards a user follows. The request returns a board summary object array.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **adAccountId** | **string** | Unique identifier of an ad account. | [optional]  |
| **explicitFollowing** | **bool** | Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. | [optional] [default to false] |
| **bookmark** | **string** | Cursor used to fetch the next page of items | [optional]  |
| **pageSize** | **int** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |

### Return type

[**BoardsList200Response**](BoardsList200Response.md)

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

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="followuserupdate"></a>
# **FollowUserUpdate**
> FollowUser FollowUserUpdate (string username, FollowUserCreate followUserCreate)

Follow user

**This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**  Use this request, as a signed-in user, to follow another user.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **username** | **string** | A valid username |  |
| **followUserCreate** | [**FollowUserCreate**](FollowUserCreate.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="followerslist"></a>
# **FollowersList**
> FollowersList200Response FollowersList (string bookmark = null, int pageSize = null)

List followers

Get a list of your followers.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **bookmark** | **string** | Cursor used to fetch the next page of items | [optional]  |
| **pageSize** | **int** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |

### Return type

[**FollowersList200Response**](FollowersList200Response.md)

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

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="linkedbusinessaccountsget"></a>
# **LinkedBusinessAccountsGet**
> List&lt;LinkedBusiness&gt; LinkedBusinessAccountsGet ()

List linked businesses

Get a list of your linked business accounts.


### Parameters
This endpoint does not need any parameter.
### Return type

[**List&lt;LinkedBusiness&gt;**](LinkedBusiness.md)

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

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="unverifywebsitedelete"></a>
# **UnverifyWebsiteDelete**
> UserWebsite UnverifyWebsiteDelete (string website)

Unverify website

Unverify a website verified by the signed-in user.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **website** | **string** | Website with path or domain only |  |

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

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="useraccountanalytics"></a>
# **UserAccountAnalytics**
> Dictionary&lt;string, AnalyticsMetricsResponse&gt; UserAccountAnalytics (DateOnly startDate, DateOnly endDate, string fromClaimedContent = null, string pinFormat = null, string appTypes = null, string contentType = null, string source = null, List<QuerymetrictypesItems> metricTypes = null, string splitField = null, string adAccountId = null)

Get user account analytics

Get analytics for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **startDate** | **DateOnly** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |  |
| **endDate** | **DateOnly** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |  |
| **fromClaimedContent** | **string** | Filter on Pins that match your claimed domain. | [optional] [default to BOTH] |
| **pinFormat** | **string** | Pin formats to get data for, default is all. | [optional] [default to ALL] |
| **appTypes** | **string** | Apps or devices to get data for, default is all. | [optional] [default to ALL] |
| **contentType** | **string** | Filter to paid or organic data. Default is all. | [optional] [default to ALL] |
| **source** | **string** | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [optional] [default to ALL] |
| **metricTypes** | [**List&lt;QuerymetrictypesItems&gt;**](QuerymetrictypesItems.md) | Metric types to get data for, default is all. | [optional]  |
| **splitField** | **string** | How to split the data into groups. Not including this param means data won&#39;t be split. | [optional] [default to NO_SPLIT] |
| **adAccountId** | **string** | Unique identifier of an ad account. | [optional]  |

### Return type

[**Dictionary&lt;string, AnalyticsMetricsResponse&gt;**](AnalyticsMetricsResponse.md)

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

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="useraccountanalyticstoppins"></a>
# **UserAccountAnalyticsTopPins**
> TopPinsAnalyticsResponse UserAccountAnalyticsTopPins (DateOnly startDate, DateOnly endDate, TopPinsSortBy sortBy, string fromClaimedContent = null, string pinFormat = null, string appTypes = null, string contentType = null, string source = null, List<QuerymetrictypesItems> metricTypes = null, int numOfPins = null, decimal createdInLastNDays = null, string adAccountId = null)

Get user account top pins analytics

Gets analytics data about a user's top pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **startDate** | **DateOnly** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |  |
| **endDate** | **DateOnly** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |  |
| **sortBy** | **TopPinsSortBy** | Specify sorting order for metrics |  |
| **fromClaimedContent** | **string** | Filter on Pins that match your claimed domain. | [optional] [default to BOTH] |
| **pinFormat** | **string** | Pin formats to get data for, default is all. | [optional] [default to ALL] |
| **appTypes** | **string** | Apps or devices to get data for, default is all. | [optional] [default to ALL] |
| **contentType** | **string** | Filter to paid or organic data. Default is all. | [optional] [default to ALL] |
| **source** | **string** | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [optional] [default to ALL] |
| **metricTypes** | [**List&lt;QuerymetrictypesItems&gt;**](QuerymetrictypesItems.md) | Metric types to get data for, default is all. | [optional]  |
| **numOfPins** | **int** | Number of pins to include, default is 10. Max is 50. | [optional] [default to 10] |
| **createdInLastNDays** | **decimal** | Get metrics for pins created in the last \&quot;n\&quot; days. | [optional]  |
| **adAccountId** | **string** | Unique identifier of an ad account. | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="useraccountanalyticstopvideopins"></a>
# **UserAccountAnalyticsTopVideoPins**
> TopVideoPinsAnalyticsResponse UserAccountAnalyticsTopVideoPins (DateOnly startDate, DateOnly endDate, TopVideoPinsSortBy sortBy, string fromClaimedContent = null, string pinFormat = null, string appTypes = null, string contentType = null, string source = null, List<QueryvideopinmetrictypesItems> metricTypes = null, int numOfPins = null, decimal createdInLastNDays = null, string adAccountId = null)

Get user account top video pins analytics

Gets analytics data about a user's top video pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **startDate** | **DateOnly** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |  |
| **endDate** | **DateOnly** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |  |
| **sortBy** | **TopVideoPinsSortBy** | Specify sorting order for video metrics |  |
| **fromClaimedContent** | **string** | Filter on Pins that match your claimed domain. | [optional] [default to BOTH] |
| **pinFormat** | **string** | Pin formats to get data for, default is all. | [optional] [default to ALL] |
| **appTypes** | **string** | Apps or devices to get data for, default is all. | [optional] [default to ALL] |
| **contentType** | **string** | Filter to paid or organic data. Default is all. | [optional] [default to ALL] |
| **source** | **string** | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [optional] [default to ALL] |
| **metricTypes** | [**List&lt;QueryvideopinmetrictypesItems&gt;**](QueryvideopinmetrictypesItems.md) | Metric types to get video data for, default is all. | [optional]  |
| **numOfPins** | **int** | Number of pins to include, default is 10. Max is 50. | [optional] [default to 10] |
| **createdInLastNDays** | **decimal** | Get metrics for pins created in the last \&quot;n\&quot; days. | [optional]  |
| **adAccountId** | **string** | Unique identifier of an ad account. | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="useraccountfollowedinterests"></a>
# **UserAccountFollowedInterests**
> UserAccountFollowedInterests200Response UserAccountFollowedInterests (string username, string bookmark = null, int pageSize = null)

List following interests

Get a list of a user's following interests in one place.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **username** | **string** | A valid username |  |
| **bookmark** | **string** | Cursor used to fetch the next page of items | [optional]  |
| **pageSize** | **int** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |

### Return type

[**UserAccountFollowedInterests200Response**](UserAccountFollowedInterests200Response.md)

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

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="useraccountget"></a>
# **UserAccountGet**
> Account UserAccountGet (string adAccountId = null)

Get user account

Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  [Understanding Business Access]: https://developers.pinterest.com/docs/getting-started/using-business-access/ \"Understanding Business Access\" If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See [Understanding Business Access] for more information.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **adAccountId** | **string** | Unique identifier of an ad account. | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="userfollowingget"></a>
# **UserFollowingGet**
> FollowersList200Response UserFollowingGet (string adAccountId = null, bool explicitFollowing = null, UserFollowingFeedType feedType = null, string bookmark = null, int pageSize = null)

List following

Get a list of who a certain user follows.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **adAccountId** | **string** | Unique identifier of an ad account. | [optional]  |
| **explicitFollowing** | **bool** | Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. | [optional] [default to false] |
| **feedType** | **UserFollowingFeedType** | Thrift param specifying what type of followees will be kept. Default to include all followees. | [optional]  |
| **bookmark** | **string** | Cursor used to fetch the next page of items | [optional]  |
| **pageSize** | **int** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |

### Return type

[**FollowersList200Response**](FollowersList200Response.md)

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

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="userwebsitesget"></a>
# **UserWebsitesGet**
> UserWebsitesGet200Response UserWebsitesGet (string bookmark = null, int pageSize = null)

Get user websites

Get user websites, claimed or not


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **bookmark** | **string** | Cursor used to fetch the next page of items | [optional]  |
| **pageSize** | **int** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |

### Return type

[**UserWebsitesGet200Response**](UserWebsitesGet200Response.md)

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

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="verifywebsiteupdate"></a>
# **VerifyWebsiteUpdate**
> UserWebsite VerifyWebsiteUpdate (UserWebsiteCreate userWebsiteCreate, string adAccountId = null)

Verify website

Verify a website as a signed-in user.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **userWebsiteCreate** | [**UserWebsiteCreate**](UserWebsiteCreate.md) |  |  |
| **adAccountId** | **string** | Unique identifier of an ad account. | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="websiteverificationget"></a>
# **WebsiteVerificationGet**
> UserWebsiteVerification WebsiteVerificationGet (string adAccountId = null)

Get user verification code for website claiming

Get verification code for user to install on the website to claim it.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **adAccountId** | **string** | Unique identifier of an ad account. | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

