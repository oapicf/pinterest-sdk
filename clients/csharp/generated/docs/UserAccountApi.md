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
> BoardsUserFollowsList200Response BoardsUserFollowsList (string? bookmark = null, int? pageSize = null, bool? explicitFollowing = null, string? adAccountId = null)

List following boards

Get a list of the boards a user follows. The request returns a board summary object array.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class BoardsUserFollowsListExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";
            // Configure OAuth2 access token for authorization: client_credentials
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new UserAccountApi(config);
            var bookmark = "bookmark_example";  // string? | Cursor used to fetch the next page of items (optional) 
            var pageSize = 25;  // int? | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional)  (default to 25)
            var explicitFollowing = false;  // bool? | Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. (optional)  (default to false)
            var adAccountId = "adAccountId_example";  // string? | Unique identifier of an ad account. (optional) 

            try
            {
                // List following boards
                BoardsUserFollowsList200Response result = apiInstance.BoardsUserFollowsList(bookmark, pageSize, explicitFollowing, adAccountId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling UserAccountApi.BoardsUserFollowsList: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the BoardsUserFollowsListWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // List following boards
    ApiResponse<BoardsUserFollowsList200Response> response = apiInstance.BoardsUserFollowsListWithHttpInfo(bookmark, pageSize, explicitFollowing, adAccountId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling UserAccountApi.BoardsUserFollowsListWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **bookmark** | **string?** | Cursor used to fetch the next page of items | [optional]  |
| **pageSize** | **int?** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **explicitFollowing** | **bool?** | Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. | [optional] [default to false] |
| **adAccountId** | **string?** | Unique identifier of an ad account. | [optional]  |

### Return type

[**BoardsUserFollowsList200Response**](BoardsUserFollowsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid user id |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="followuserupdate"></a>
# **FollowUserUpdate**
> UserSummary FollowUserUpdate (string username, FollowUserRequest followUserRequest)

Follow user

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>  Use this request, as a signed-in user, to follow another user.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class FollowUserUpdateExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new UserAccountApi(config);
            var username = username;  // string | A valid username
            var followUserRequest = new FollowUserRequest(); // FollowUserRequest | Follow a user.

            try
            {
                // Follow user
                UserSummary result = apiInstance.FollowUserUpdate(username, followUserRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling UserAccountApi.FollowUserUpdate: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the FollowUserUpdateWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Follow user
    ApiResponse<UserSummary> response = apiInstance.FollowUserUpdateWithHttpInfo(username, followUserRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling UserAccountApi.FollowUserUpdateWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **username** | **string** | A valid username |  |
| **followUserRequest** | [**FollowUserRequest**](FollowUserRequest.md) | Follow a user. |  |

### Return type

[**UserSummary**](UserSummary.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | User not found |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="followerslist"></a>
# **FollowersList**
> FollowersList200Response FollowersList (string? bookmark = null, int? pageSize = null)

List followers

Get a list of your followers.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class FollowersListExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";
            // Configure OAuth2 access token for authorization: client_credentials
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new UserAccountApi(config);
            var bookmark = "bookmark_example";  // string? | Cursor used to fetch the next page of items (optional) 
            var pageSize = 25;  // int? | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional)  (default to 25)

            try
            {
                // List followers
                FollowersList200Response result = apiInstance.FollowersList(bookmark, pageSize);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling UserAccountApi.FollowersList: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the FollowersListWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // List followers
    ApiResponse<FollowersList200Response> response = apiInstance.FollowersListWithHttpInfo(bookmark, pageSize);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling UserAccountApi.FollowersListWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **bookmark** | **string?** | Cursor used to fetch the next page of items | [optional]  |
| **pageSize** | **int?** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |

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
| **200** | Success |  -  |
| **400** | Invalid user id |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="linkedbusinessaccountsget"></a>
# **LinkedBusinessAccountsGet**
> List&lt;LinkedBusiness&gt; LinkedBusinessAccountsGet ()

List linked businesses

Get a list of your linked business accounts.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class LinkedBusinessAccountsGetExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";
            // Configure OAuth2 access token for authorization: client_credentials
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new UserAccountApi(config);

            try
            {
                // List linked businesses
                List<LinkedBusiness> result = apiInstance.LinkedBusinessAccountsGet();
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling UserAccountApi.LinkedBusinessAccountsGet: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the LinkedBusinessAccountsGetWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // List linked businesses
    ApiResponse<List<LinkedBusiness>> response = apiInstance.LinkedBusinessAccountsGetWithHttpInfo();
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling UserAccountApi.LinkedBusinessAccountsGetWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

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
| **200** | Success |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="unverifywebsitedelete"></a>
# **UnverifyWebsiteDelete**
> void UnverifyWebsiteDelete (string website)

Unverify website

Unverifu a website verified by the signed-in user.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class UnverifyWebsiteDeleteExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new UserAccountApi(config);
            var website = mysite.test;  // string | Website with path or domain only

            try
            {
                // Unverify website
                apiInstance.UnverifyWebsiteDelete(website);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling UserAccountApi.UnverifyWebsiteDelete: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UnverifyWebsiteDeleteWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Unverify website
    apiInstance.UnverifyWebsiteDeleteWithHttpInfo(website);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling UserAccountApi.UnverifyWebsiteDeleteWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **website** | **string** | Website with path or domain only |  |

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successfully unverified website |  -  |
| **404** | Website not in user list. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="useraccountanalytics"></a>
# **UserAccountAnalytics**
> Dictionary&lt;string, AnalyticsMetricsResponse&gt; UserAccountAnalytics (DateOnly startDate, DateOnly endDate, string? fromClaimedContent = null, string? pinFormat = null, string? appTypes = null, string? contentType = null, string? source = null, List<string>? metricTypes = null, string? splitField = null, string? adAccountId = null)

Get user account analytics

Get analytics for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class UserAccountAnalyticsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new UserAccountApi(config);
            var startDate = DateOnly.Parse("2013-10-20");  // DateOnly | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
            var endDate = DateOnly.Parse("2013-10-20");  // DateOnly | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
            var fromClaimedContent = "OTHER";  // string? | Filter on Pins that match your claimed domain. (optional)  (default to BOTH)
            var pinFormat = "ALL";  // string? | Pin formats to get data for, default is all. (optional)  (default to ALL)
            var appTypes = "ALL";  // string? | Apps or devices to get data for, default is all. (optional)  (default to ALL)
            var contentType = "ALL";  // string? | Filter to paid or organic data. Default is all. (optional)  (default to ALL)
            var source = "ALL";  // string? | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts (optional)  (default to ALL)
            var metricTypes = new List<string>?(); // List<string>? | Metric types to get data for, default is all.  (optional) 
            var splitField = "NO_SPLIT";  // string? | How to split the data into groups. Not including this param means data won't be split. (optional)  (default to NO_SPLIT)
            var adAccountId = "adAccountId_example";  // string? | Unique identifier of an ad account. (optional) 

            try
            {
                // Get user account analytics
                Dictionary<string, AnalyticsMetricsResponse> result = apiInstance.UserAccountAnalytics(startDate, endDate, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, splitField, adAccountId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling UserAccountApi.UserAccountAnalytics: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UserAccountAnalyticsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get user account analytics
    ApiResponse<Dictionary<string, AnalyticsMetricsResponse>> response = apiInstance.UserAccountAnalyticsWithHttpInfo(startDate, endDate, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, splitField, adAccountId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling UserAccountApi.UserAccountAnalyticsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **startDate** | **DateOnly** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |  |
| **endDate** | **DateOnly** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |  |
| **fromClaimedContent** | **string?** | Filter on Pins that match your claimed domain. | [optional] [default to BOTH] |
| **pinFormat** | **string?** | Pin formats to get data for, default is all. | [optional] [default to ALL] |
| **appTypes** | **string?** | Apps or devices to get data for, default is all. | [optional] [default to ALL] |
| **contentType** | **string?** | Filter to paid or organic data. Default is all. | [optional] [default to ALL] |
| **source** | **string?** | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [optional] [default to ALL] |
| **metricTypes** | [**List&lt;string&gt;?**](string.md) | Metric types to get data for, default is all.  | [optional]  |
| **splitField** | **string?** | How to split the data into groups. Not including this param means data won&#39;t be split. | [optional] [default to NO_SPLIT] |
| **adAccountId** | **string?** | Unique identifier of an ad account. | [optional]  |

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
| **200** | Success |  -  |
| **400** | Invalid user accounts analytics parameters. |  -  |
| **403** | Not authorized to access the user account analytics. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="useraccountanalyticstoppins"></a>
# **UserAccountAnalyticsTopPins**
> TopPinsAnalyticsResponse UserAccountAnalyticsTopPins (DateOnly startDate, DateOnly endDate, string sortBy, string? fromClaimedContent = null, string? pinFormat = null, string? appTypes = null, string? contentType = null, string? source = null, List<string>? metricTypes = null, int? numOfPins = null, int? createdInLastNDays = null, string? adAccountId = null)

Get user account top pins analytics

Gets analytics data about a user's top pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class UserAccountAnalyticsTopPinsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";
            // Configure OAuth2 access token for authorization: client_credentials
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new UserAccountApi(config);
            var startDate = DateOnly.Parse("2013-10-20");  // DateOnly | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
            var endDate = DateOnly.Parse("2013-10-20");  // DateOnly | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
            var sortBy = "ENGAGEMENT";  // string | Specify sorting order for metrics
            var fromClaimedContent = "OTHER";  // string? | Filter on Pins that match your claimed domain. (optional)  (default to BOTH)
            var pinFormat = "ALL";  // string? | Pin formats to get data for, default is all. (optional)  (default to ALL)
            var appTypes = "ALL";  // string? | Apps or devices to get data for, default is all. (optional)  (default to ALL)
            var contentType = "ALL";  // string? | Filter to paid or organic data. Default is all. (optional)  (default to ALL)
            var source = "ALL";  // string? | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts (optional)  (default to ALL)
            var metricTypes = new List<string>?(); // List<string>? | Metric types to get data for, default is all.  (optional) 
            var numOfPins = 25;  // int? | Number of pins to include, default is 10. Max is 50. (optional)  (default to 10)
            var createdInLastNDays = 30;  // int? | Get metrics for pins created in the last \"n\" days. (optional) 
            var adAccountId = "adAccountId_example";  // string? | Unique identifier of an ad account. (optional) 

            try
            {
                // Get user account top pins analytics
                TopPinsAnalyticsResponse result = apiInstance.UserAccountAnalyticsTopPins(startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, numOfPins, createdInLastNDays, adAccountId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling UserAccountApi.UserAccountAnalyticsTopPins: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UserAccountAnalyticsTopPinsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get user account top pins analytics
    ApiResponse<TopPinsAnalyticsResponse> response = apiInstance.UserAccountAnalyticsTopPinsWithHttpInfo(startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, numOfPins, createdInLastNDays, adAccountId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling UserAccountApi.UserAccountAnalyticsTopPinsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **startDate** | **DateOnly** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |  |
| **endDate** | **DateOnly** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |  |
| **sortBy** | **string** | Specify sorting order for metrics |  |
| **fromClaimedContent** | **string?** | Filter on Pins that match your claimed domain. | [optional] [default to BOTH] |
| **pinFormat** | **string?** | Pin formats to get data for, default is all. | [optional] [default to ALL] |
| **appTypes** | **string?** | Apps or devices to get data for, default is all. | [optional] [default to ALL] |
| **contentType** | **string?** | Filter to paid or organic data. Default is all. | [optional] [default to ALL] |
| **source** | **string?** | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [optional] [default to ALL] |
| **metricTypes** | [**List&lt;string&gt;?**](string.md) | Metric types to get data for, default is all.  | [optional]  |
| **numOfPins** | **int?** | Number of pins to include, default is 10. Max is 50. | [optional] [default to 10] |
| **createdInLastNDays** | **int?** | Get metrics for pins created in the last \&quot;n\&quot; days. | [optional]  |
| **adAccountId** | **string?** | Unique identifier of an ad account. | [optional]  |

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
| **200** | Success |  -  |
| **403** | Not authorized to access the user account analytics. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="useraccountanalyticstopvideopins"></a>
# **UserAccountAnalyticsTopVideoPins**
> TopVideoPinsAnalyticsResponse UserAccountAnalyticsTopVideoPins (DateOnly startDate, DateOnly endDate, string sortBy, string? fromClaimedContent = null, string? pinFormat = null, string? appTypes = null, string? contentType = null, string? source = null, List<string>? metricTypes = null, int? numOfPins = null, int? createdInLastNDays = null, string? adAccountId = null)

Get user account top video pins analytics

Gets analytics data about a user's top video pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class UserAccountAnalyticsTopVideoPinsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";
            // Configure OAuth2 access token for authorization: client_credentials
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new UserAccountApi(config);
            var startDate = DateOnly.Parse("2013-10-20");  // DateOnly | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
            var endDate = DateOnly.Parse("2013-10-20");  // DateOnly | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
            var sortBy = "IMPRESSION";  // string | Specify sorting order for video metrics
            var fromClaimedContent = "OTHER";  // string? | Filter on Pins that match your claimed domain. (optional)  (default to BOTH)
            var pinFormat = "ALL";  // string? | Pin formats to get data for, default is all. (optional)  (default to ALL)
            var appTypes = "ALL";  // string? | Apps or devices to get data for, default is all. (optional)  (default to ALL)
            var contentType = "ALL";  // string? | Filter to paid or organic data. Default is all. (optional)  (default to ALL)
            var source = "ALL";  // string? | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts (optional)  (default to ALL)
            var metricTypes = new List<string>?(); // List<string>? | Metric types to get video data for, default is all.  (optional) 
            var numOfPins = 25;  // int? | Number of pins to include, default is 10. Max is 50. (optional)  (default to 10)
            var createdInLastNDays = 30;  // int? | Get metrics for pins created in the last \"n\" days. (optional) 
            var adAccountId = "adAccountId_example";  // string? | Unique identifier of an ad account. (optional) 

            try
            {
                // Get user account top video pins analytics
                TopVideoPinsAnalyticsResponse result = apiInstance.UserAccountAnalyticsTopVideoPins(startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, numOfPins, createdInLastNDays, adAccountId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling UserAccountApi.UserAccountAnalyticsTopVideoPins: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UserAccountAnalyticsTopVideoPinsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get user account top video pins analytics
    ApiResponse<TopVideoPinsAnalyticsResponse> response = apiInstance.UserAccountAnalyticsTopVideoPinsWithHttpInfo(startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, numOfPins, createdInLastNDays, adAccountId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling UserAccountApi.UserAccountAnalyticsTopVideoPinsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **startDate** | **DateOnly** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |  |
| **endDate** | **DateOnly** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |  |
| **sortBy** | **string** | Specify sorting order for video metrics |  |
| **fromClaimedContent** | **string?** | Filter on Pins that match your claimed domain. | [optional] [default to BOTH] |
| **pinFormat** | **string?** | Pin formats to get data for, default is all. | [optional] [default to ALL] |
| **appTypes** | **string?** | Apps or devices to get data for, default is all. | [optional] [default to ALL] |
| **contentType** | **string?** | Filter to paid or organic data. Default is all. | [optional] [default to ALL] |
| **source** | **string?** | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [optional] [default to ALL] |
| **metricTypes** | [**List&lt;string&gt;?**](string.md) | Metric types to get video data for, default is all.  | [optional]  |
| **numOfPins** | **int?** | Number of pins to include, default is 10. Max is 50. | [optional] [default to 10] |
| **createdInLastNDays** | **int?** | Get metrics for pins created in the last \&quot;n\&quot; days. | [optional]  |
| **adAccountId** | **string?** | Unique identifier of an ad account. | [optional]  |

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
| **200** | Success |  -  |
| **403** | Not authorized to access the user account analytics. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="useraccountfollowedinterests"></a>
# **UserAccountFollowedInterests**
> UserAccountFollowedInterests200Response UserAccountFollowedInterests (string username, string? bookmark = null, int? pageSize = null)

List following interests

Get a list of a user's following interests in one place.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class UserAccountFollowedInterestsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";
            // Configure OAuth2 access token for authorization: client_credentials
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new UserAccountApi(config);
            var username = username;  // string | A valid username
            var bookmark = "bookmark_example";  // string? | Cursor used to fetch the next page of items (optional) 
            var pageSize = 25;  // int? | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional)  (default to 25)

            try
            {
                // List following interests
                UserAccountFollowedInterests200Response result = apiInstance.UserAccountFollowedInterests(username, bookmark, pageSize);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling UserAccountApi.UserAccountFollowedInterests: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UserAccountFollowedInterestsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // List following interests
    ApiResponse<UserAccountFollowedInterests200Response> response = apiInstance.UserAccountFollowedInterestsWithHttpInfo(username, bookmark, pageSize);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling UserAccountApi.UserAccountFollowedInterestsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **username** | **string** | A valid username |  |
| **bookmark** | **string?** | Cursor used to fetch the next page of items | [optional]  |
| **pageSize** | **int?** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |

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
| **200** | Success |  -  |
| **400** | Invalid parameters |  -  |
| **401** | Authorization failed |  -  |
| **404** | User not found |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="useraccountget"></a>
# **UserAccountGet**
> Account UserAccountGet (string? adAccountId = null)

Get user account

Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/getting-started/using-business-access/'>Understanding Business Access</a> for more information.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class UserAccountGetExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";
            // Configure OAuth2 access token for authorization: client_credentials
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new UserAccountApi(config);
            var adAccountId = "adAccountId_example";  // string? | Unique identifier of an ad account. (optional) 

            try
            {
                // Get user account
                Account result = apiInstance.UserAccountGet(adAccountId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling UserAccountApi.UserAccountGet: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UserAccountGetWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get user account
    ApiResponse<Account> response = apiInstance.UserAccountGetWithHttpInfo(adAccountId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling UserAccountApi.UserAccountGetWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **adAccountId** | **string?** | Unique identifier of an ad account. | [optional]  |

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
| **200** | response |  -  |
| **403** | Not authorized to access the user account. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="userfollowingget"></a>
# **UserFollowingGet**
> UserFollowingGet200Response UserFollowingGet (string? bookmark = null, int? pageSize = null, UserFollowingFeedType? feedType = null, bool? explicitFollowing = null, string? adAccountId = null)

List following

Get a list of who a certain user follows.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class UserFollowingGetExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";
            // Configure OAuth2 access token for authorization: client_credentials
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new UserAccountApi(config);
            var bookmark = "bookmark_example";  // string? | Cursor used to fetch the next page of items (optional) 
            var pageSize = 25;  // int? | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional)  (default to 25)
            var feedType = "ALL";  // UserFollowingFeedType? | Thrift param specifying what type of followees will be kept. Default to include all followees. (optional) 
            var explicitFollowing = false;  // bool? | Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. (optional)  (default to false)
            var adAccountId = "adAccountId_example";  // string? | Unique identifier of an ad account. (optional) 

            try
            {
                // List following
                UserFollowingGet200Response result = apiInstance.UserFollowingGet(bookmark, pageSize, feedType, explicitFollowing, adAccountId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling UserAccountApi.UserFollowingGet: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UserFollowingGetWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // List following
    ApiResponse<UserFollowingGet200Response> response = apiInstance.UserFollowingGetWithHttpInfo(bookmark, pageSize, feedType, explicitFollowing, adAccountId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling UserAccountApi.UserFollowingGetWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **bookmark** | **string?** | Cursor used to fetch the next page of items | [optional]  |
| **pageSize** | **int?** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **feedType** | **UserFollowingFeedType?** | Thrift param specifying what type of followees will be kept. Default to include all followees. | [optional]  |
| **explicitFollowing** | **bool?** | Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. | [optional] [default to false] |
| **adAccountId** | **string?** | Unique identifier of an ad account. | [optional]  |

### Return type

[**UserFollowingGet200Response**](UserFollowingGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="userwebsitesget"></a>
# **UserWebsitesGet**
> UserWebsitesGet200Response UserWebsitesGet (string? bookmark = null, int? pageSize = null)

Get user websites

Get user websites, claimed or not

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class UserWebsitesGetExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new UserAccountApi(config);
            var bookmark = "bookmark_example";  // string? | Cursor used to fetch the next page of items (optional) 
            var pageSize = 25;  // int? | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional)  (default to 25)

            try
            {
                // Get user websites
                UserWebsitesGet200Response result = apiInstance.UserWebsitesGet(bookmark, pageSize);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling UserAccountApi.UserWebsitesGet: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UserWebsitesGetWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get user websites
    ApiResponse<UserWebsitesGet200Response> response = apiInstance.UserWebsitesGetWithHttpInfo(bookmark, pageSize);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling UserAccountApi.UserWebsitesGetWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **bookmark** | **string?** | Cursor used to fetch the next page of items | [optional]  |
| **pageSize** | **int?** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |

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
| **200** | Success |  -  |
| **403** | Not authorized to access the user website list. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="verifywebsiteupdate"></a>
# **VerifyWebsiteUpdate**
> UserWebsiteSummary VerifyWebsiteUpdate (UserWebsiteVerifyRequest userWebsiteVerifyRequest, string? adAccountId = null)

Verify website

Verify a website as a signed-in user.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class VerifyWebsiteUpdateExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new UserAccountApi(config);
            var userWebsiteVerifyRequest = new UserWebsiteVerifyRequest(); // UserWebsiteVerifyRequest | Verify a website.
            var adAccountId = "adAccountId_example";  // string? | Unique identifier of an ad account. (optional) 

            try
            {
                // Verify website
                UserWebsiteSummary result = apiInstance.VerifyWebsiteUpdate(userWebsiteVerifyRequest, adAccountId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling UserAccountApi.VerifyWebsiteUpdate: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the VerifyWebsiteUpdateWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Verify website
    ApiResponse<UserWebsiteSummary> response = apiInstance.VerifyWebsiteUpdateWithHttpInfo(userWebsiteVerifyRequest, adAccountId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling UserAccountApi.VerifyWebsiteUpdateWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **userWebsiteVerifyRequest** | [**UserWebsiteVerifyRequest**](UserWebsiteVerifyRequest.md) | Verify a website. |  |
| **adAccountId** | **string?** | Unique identifier of an ad account. | [optional]  |

### Return type

[**UserWebsiteSummary**](UserWebsiteSummary.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="websiteverificationget"></a>
# **WebsiteVerificationGet**
> UserWebsiteVerificationCode WebsiteVerificationGet (string? adAccountId = null)

Get user verification code for website claiming

Get verification code for user to install on the website to claim it.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class WebsiteVerificationGetExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";
            // Configure OAuth2 access token for authorization: client_credentials
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new UserAccountApi(config);
            var adAccountId = "adAccountId_example";  // string? | Unique identifier of an ad account. (optional) 

            try
            {
                // Get user verification code for website claiming
                UserWebsiteVerificationCode result = apiInstance.WebsiteVerificationGet(adAccountId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling UserAccountApi.WebsiteVerificationGet: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the WebsiteVerificationGetWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get user verification code for website claiming
    ApiResponse<UserWebsiteVerificationCode> response = apiInstance.WebsiteVerificationGetWithHttpInfo(adAccountId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling UserAccountApi.WebsiteVerificationGetWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **adAccountId** | **string?** | Unique identifier of an ad account. | [optional]  |

### Return type

[**UserWebsiteVerificationCode**](UserWebsiteVerificationCode.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Not authorized to access the user verification code for website claiming. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

