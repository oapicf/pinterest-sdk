# OpenAPI\Server\Api\UserAccountApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**boardsUserFollowsList**](UserAccountApiInterface.md#boardsUserFollowsList) | **GET** /user_account/following/boards | List following boards
[**followUserUpdate**](UserAccountApiInterface.md#followUserUpdate) | **POST** /user_account/following/{username} | Follow user
[**followersList**](UserAccountApiInterface.md#followersList) | **GET** /user_account/followers | List followers
[**linkedBusinessAccountsGet**](UserAccountApiInterface.md#linkedBusinessAccountsGet) | **GET** /user_account/businesses | List linked businesses
[**unverifyWebsiteDelete**](UserAccountApiInterface.md#unverifyWebsiteDelete) | **DELETE** /user_account/websites | Unverify website
[**userAccountAnalytics**](UserAccountApiInterface.md#userAccountAnalytics) | **GET** /user_account/analytics | Get user account analytics
[**userAccountAnalyticsTopPins**](UserAccountApiInterface.md#userAccountAnalyticsTopPins) | **GET** /user_account/analytics/top_pins | Get user account top pins analytics
[**userAccountAnalyticsTopVideoPins**](UserAccountApiInterface.md#userAccountAnalyticsTopVideoPins) | **GET** /user_account/analytics/top_video_pins | Get user account top video pins analytics
[**userAccountFollowedInterests**](UserAccountApiInterface.md#userAccountFollowedInterests) | **GET** /users/{username}/interests/follow | List following interests
[**userAccountGet**](UserAccountApiInterface.md#userAccountGet) | **GET** /user_account | Get user account
[**userFollowingGet**](UserAccountApiInterface.md#userFollowingGet) | **GET** /user_account/following | List following
[**userWebsitesGet**](UserAccountApiInterface.md#userWebsitesGet) | **GET** /user_account/websites | Get user websites
[**verifyWebsiteUpdate**](UserAccountApiInterface.md#verifyWebsiteUpdate) | **POST** /user_account/websites | Verify website
[**websiteVerificationGet**](UserAccountApiInterface.md#websiteVerificationGet) | **GET** /user_account/websites/verification | Get user verification code for website claiming


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\UserAccountApi:
        tags:
            - { name: "open_api_server.api", api: "userAccount" }
    # ...
```

## **boardsUserFollowsList**
> OpenAPI\Server\Model\BoardsUserFollowsList200Response boardsUserFollowsList($bookmark, $pageSize, $explicitFollowing, $adAccountId)

List following boards

Get a list of the boards a user follows. The request returns a board summary object array.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/UserAccountApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\UserAccountApiInterface;

class UserAccountApi implements UserAccountApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: pinterest_oauth2
     */
    public function setpinterest_oauth2($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of UserAccountApiInterface#boardsUserFollowsList
     */
    public function boardsUserFollowsList(?string $bookmark, int $pageSize, bool $explicitFollowing, ?string $adAccountId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **explicitFollowing** | **bool**| Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. | [optional] [default to false]
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]

### Return type

[**OpenAPI\Server\Model\BoardsUserFollowsList200Response**](../Model/BoardsUserFollowsList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **followUserUpdate**
> OpenAPI\Server\Model\UserSummary followUserUpdate($username, $followUserRequest)

Follow user

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>  Use this request, as a signed-in user, to follow another user.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/UserAccountApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\UserAccountApiInterface;

class UserAccountApi implements UserAccountApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: pinterest_oauth2
     */
    public function setpinterest_oauth2($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of UserAccountApiInterface#followUserUpdate
     */
    public function followUserUpdate(string $username, FollowUserRequest $followUserRequest, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **string**| A valid username |
 **followUserRequest** | [**OpenAPI\Server\Model\FollowUserRequest**](../Model/FollowUserRequest.md)| Follow a user. |

### Return type

[**OpenAPI\Server\Model\UserSummary**](../Model/UserSummary.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **followersList**
> OpenAPI\Server\Model\FollowersList200Response followersList($bookmark, $pageSize)

List followers

Get a list of your followers.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/UserAccountApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\UserAccountApiInterface;

class UserAccountApi implements UserAccountApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: pinterest_oauth2
     */
    public function setpinterest_oauth2($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of UserAccountApiInterface#followersList
     */
    public function followersList(?string $bookmark, int $pageSize, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**OpenAPI\Server\Model\FollowersList200Response**](../Model/FollowersList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **linkedBusinessAccountsGet**
> OpenAPI\Server\Model\LinkedBusiness linkedBusinessAccountsGet()

List linked businesses

Get a list of your linked business accounts.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/UserAccountApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\UserAccountApiInterface;

class UserAccountApi implements UserAccountApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: pinterest_oauth2
     */
    public function setpinterest_oauth2($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of UserAccountApiInterface#linkedBusinessAccountsGet
     */
    public function linkedBusinessAccountsGet(int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OpenAPI\Server\Model\LinkedBusiness**](../Model/LinkedBusiness.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **unverifyWebsiteDelete**
> unverifyWebsiteDelete($website)

Unverify website

Unverifu a website verified by the signed-in user.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/UserAccountApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\UserAccountApiInterface;

class UserAccountApi implements UserAccountApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: pinterest_oauth2
     */
    public function setpinterest_oauth2($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of UserAccountApiInterface#unverifyWebsiteDelete
     */
    public function unverifyWebsiteDelete(string $website, int &$responseCode, array &$responseHeaders): void
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **website** | **string**| Website with path or domain only |

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **userAccountAnalytics**
> OpenAPI\Server\Model\AnalyticsMetricsResponse userAccountAnalytics($startDate, $endDate, $fromClaimedContent, $pinFormat, $appTypes, $contentType, $source, $metricTypes, $splitField, $adAccountId)

Get user account analytics

Get analytics for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/UserAccountApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\UserAccountApiInterface;

class UserAccountApi implements UserAccountApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: pinterest_oauth2
     */
    public function setpinterest_oauth2($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of UserAccountApiInterface#userAccountAnalytics
     */
    public function userAccountAnalytics(\DateTime $startDate, \DateTime $endDate, string $fromClaimedContent, string $pinFormat, string $appTypes, string $contentType, string $source, ?array $metricTypes, string $splitField, ?string $adAccountId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **\DateTime**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |
 **endDate** | **\DateTime**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |
 **fromClaimedContent** | **string**| Filter on Pins that match your claimed domain. | [optional] [default to &#39;BOTH&#39;]
 **pinFormat** | **string**| Pin formats to get data for, default is all. | [optional] [default to &#39;ALL&#39;]
 **appTypes** | **string**| Apps or devices to get data for, default is all. | [optional] [default to &#39;ALL&#39;]
 **contentType** | **string**| Filter to paid or organic data. Default is all. | [optional] [default to &#39;ALL&#39;]
 **source** | **string**| Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [optional] [default to &#39;ALL&#39;]
 **metricTypes** | [**string**](../Model/string.md)| Metric types to get data for, default is all. | [optional]
 **splitField** | **string**| How to split the data into groups. Not including this param means data won&#39;t be split. | [optional] [default to &#39;NO_SPLIT&#39;]
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]

### Return type

[**OpenAPI\Server\Model\AnalyticsMetricsResponse**](../Model/AnalyticsMetricsResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **userAccountAnalyticsTopPins**
> OpenAPI\Server\Model\TopPinsAnalyticsResponse userAccountAnalyticsTopPins($startDate, $endDate, $sortBy, $fromClaimedContent, $pinFormat, $appTypes, $contentType, $source, $metricTypes, $numOfPins, $createdInLastNDays, $adAccountId)

Get user account top pins analytics

Gets analytics data about a user's top pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/UserAccountApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\UserAccountApiInterface;

class UserAccountApi implements UserAccountApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: pinterest_oauth2
     */
    public function setpinterest_oauth2($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of UserAccountApiInterface#userAccountAnalyticsTopPins
     */
    public function userAccountAnalyticsTopPins(\DateTime $startDate, \DateTime $endDate, string $sortBy, string $fromClaimedContent, string $pinFormat, string $appTypes, string $contentType, string $source, ?array $metricTypes, int $numOfPins, ?int $createdInLastNDays, ?string $adAccountId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **\DateTime**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |
 **endDate** | **\DateTime**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |
 **sortBy** | **string**| Specify sorting order for metrics |
 **fromClaimedContent** | **string**| Filter on Pins that match your claimed domain. | [optional] [default to &#39;BOTH&#39;]
 **pinFormat** | **string**| Pin formats to get data for, default is all. | [optional] [default to &#39;ALL&#39;]
 **appTypes** | **string**| Apps or devices to get data for, default is all. | [optional] [default to &#39;ALL&#39;]
 **contentType** | **string**| Filter to paid or organic data. Default is all. | [optional] [default to &#39;ALL&#39;]
 **source** | **string**| Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [optional] [default to &#39;ALL&#39;]
 **metricTypes** | [**string**](../Model/string.md)| Metric types to get data for, default is all. | [optional]
 **numOfPins** | **int**| Number of pins to include, default is 10. Max is 50. | [optional] [default to 10]
 **createdInLastNDays** | **int**| Get metrics for pins created in the last \&quot;n\&quot; days. | [optional]
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]

### Return type

[**OpenAPI\Server\Model\TopPinsAnalyticsResponse**](../Model/TopPinsAnalyticsResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **userAccountAnalyticsTopVideoPins**
> OpenAPI\Server\Model\TopVideoPinsAnalyticsResponse userAccountAnalyticsTopVideoPins($startDate, $endDate, $sortBy, $fromClaimedContent, $pinFormat, $appTypes, $contentType, $source, $metricTypes, $numOfPins, $createdInLastNDays, $adAccountId)

Get user account top video pins analytics

Gets analytics data about a user's top video pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/UserAccountApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\UserAccountApiInterface;

class UserAccountApi implements UserAccountApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: pinterest_oauth2
     */
    public function setpinterest_oauth2($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of UserAccountApiInterface#userAccountAnalyticsTopVideoPins
     */
    public function userAccountAnalyticsTopVideoPins(\DateTime $startDate, \DateTime $endDate, string $sortBy, string $fromClaimedContent, string $pinFormat, string $appTypes, string $contentType, string $source, ?array $metricTypes, int $numOfPins, ?int $createdInLastNDays, ?string $adAccountId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **\DateTime**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |
 **endDate** | **\DateTime**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |
 **sortBy** | **string**| Specify sorting order for video metrics |
 **fromClaimedContent** | **string**| Filter on Pins that match your claimed domain. | [optional] [default to &#39;BOTH&#39;]
 **pinFormat** | **string**| Pin formats to get data for, default is all. | [optional] [default to &#39;ALL&#39;]
 **appTypes** | **string**| Apps or devices to get data for, default is all. | [optional] [default to &#39;ALL&#39;]
 **contentType** | **string**| Filter to paid or organic data. Default is all. | [optional] [default to &#39;ALL&#39;]
 **source** | **string**| Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [optional] [default to &#39;ALL&#39;]
 **metricTypes** | [**string**](../Model/string.md)| Metric types to get video data for, default is all. | [optional]
 **numOfPins** | **int**| Number of pins to include, default is 10. Max is 50. | [optional] [default to 10]
 **createdInLastNDays** | **int**| Get metrics for pins created in the last \&quot;n\&quot; days. | [optional]
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]

### Return type

[**OpenAPI\Server\Model\TopVideoPinsAnalyticsResponse**](../Model/TopVideoPinsAnalyticsResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **userAccountFollowedInterests**
> OpenAPI\Server\Model\UserAccountFollowedInterests200Response userAccountFollowedInterests($username, $bookmark, $pageSize)

List following interests

Get a list of a user's following interests in one place.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/UserAccountApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\UserAccountApiInterface;

class UserAccountApi implements UserAccountApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: pinterest_oauth2
     */
    public function setpinterest_oauth2($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of UserAccountApiInterface#userAccountFollowedInterests
     */
    public function userAccountFollowedInterests(string $username, ?string $bookmark, int $pageSize, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **string**| A valid username |
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**OpenAPI\Server\Model\UserAccountFollowedInterests200Response**](../Model/UserAccountFollowedInterests200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **userAccountGet**
> OpenAPI\Server\Model\Account userAccountGet($adAccountId)

Get user account

Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/reference/business-access/'>Understanding Business Access</a> for more information.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/UserAccountApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\UserAccountApiInterface;

class UserAccountApi implements UserAccountApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: pinterest_oauth2
     */
    public function setpinterest_oauth2($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of UserAccountApiInterface#userAccountGet
     */
    public function userAccountGet(?string $adAccountId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]

### Return type

[**OpenAPI\Server\Model\Account**](../Model/Account.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **userFollowingGet**
> OpenAPI\Server\Model\UserFollowingGet200Response userFollowingGet($bookmark, $pageSize, $feedType, $explicitFollowing, $adAccountId)

List following

Get a list of who a certain user follows.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/UserAccountApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\UserAccountApiInterface;

class UserAccountApi implements UserAccountApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: pinterest_oauth2
     */
    public function setpinterest_oauth2($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of UserAccountApiInterface#userFollowingGet
     */
    public function userFollowingGet(?string $bookmark, int $pageSize, ?$feedType, bool $explicitFollowing, ?string $adAccountId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **feedType** | **UserFollowingFeedType**| Thrift param specifying what type of followees will be kept. Default to include all followees. | [optional]
 **explicitFollowing** | **bool**| Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. | [optional] [default to false]
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]

### Return type

[**OpenAPI\Server\Model\UserFollowingGet200Response**](../Model/UserFollowingGet200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **userWebsitesGet**
> OpenAPI\Server\Model\UserWebsitesGet200Response userWebsitesGet($bookmark, $pageSize)

Get user websites

Get user websites, claimed or not

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/UserAccountApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\UserAccountApiInterface;

class UserAccountApi implements UserAccountApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: pinterest_oauth2
     */
    public function setpinterest_oauth2($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of UserAccountApiInterface#userWebsitesGet
     */
    public function userWebsitesGet(?string $bookmark, int $pageSize, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**OpenAPI\Server\Model\UserWebsitesGet200Response**](../Model/UserWebsitesGet200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **verifyWebsiteUpdate**
> OpenAPI\Server\Model\UserWebsiteSummary verifyWebsiteUpdate($userWebsiteVerifyRequest)

Verify website

Verify a website as a signed-in user.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/UserAccountApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\UserAccountApiInterface;

class UserAccountApi implements UserAccountApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: pinterest_oauth2
     */
    public function setpinterest_oauth2($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of UserAccountApiInterface#verifyWebsiteUpdate
     */
    public function verifyWebsiteUpdate(UserWebsiteVerifyRequest $userWebsiteVerifyRequest, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userWebsiteVerifyRequest** | [**OpenAPI\Server\Model\UserWebsiteVerifyRequest**](../Model/UserWebsiteVerifyRequest.md)| Verify a website. |

### Return type

[**OpenAPI\Server\Model\UserWebsiteSummary**](../Model/UserWebsiteSummary.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **websiteVerificationGet**
> OpenAPI\Server\Model\UserWebsiteVerificationCode websiteVerificationGet()

Get user verification code for website claiming

Get verification code for user to install on the website to claim it.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/UserAccountApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\UserAccountApiInterface;

class UserAccountApi implements UserAccountApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: pinterest_oauth2
     */
    public function setpinterest_oauth2($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of UserAccountApiInterface#websiteVerificationGet
     */
    public function websiteVerificationGet(int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OpenAPI\Server\Model\UserWebsiteVerificationCode**](../Model/UserWebsiteVerificationCode.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

