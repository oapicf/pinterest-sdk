# OpenAPI\Server\Api\UserAccountApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userAccountAnalytics**](UserAccountApiInterface.md#userAccountAnalytics) | **GET** /user_account/analytics | Get user account analytics
[**userAccountGet**](UserAccountApiInterface.md#userAccountGet) | **GET** /user_account | Get user account


## Service Declaration
```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.userAccount:
        class: Acme\MyBundle\Api\UserAccountApi
        tags:
            - { name: "open_api_server.api", api: "userAccount" }
    # ...
```

## **userAccountAnalytics**
> OpenAPI\Server\Model\AnalyticsMetricsResponse userAccountAnalytics($startDate, $endDate, $fromClaimedContent, $pinFormat, $appTypes, $metricTypes, $splitField, $adAccountId)

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
    public function userAccountAnalytics(\DateTime $startDate, \DateTime $endDate, $fromClaimedContent = ''BOTH'', $pinFormat = ''ALL'', $appTypes = ''ALL'', array $metricTypes = null, $splitField = ''NO_SPLIT'', $adAccountId = null)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **\DateTime**| Metric report start date (UTC). Format: YYYY-MM-DD |
 **endDate** | **\DateTime**| Metric report end date (UTC). Format: YYYY-MM-DD |
 **fromClaimedContent** | **string**| Filter on Pins that match your claimed domain. | [optional] [default to &#39;BOTH&#39;]
 **pinFormat** | **string**| Pin formats to get data for, default is all. | [optional] [default to &#39;ALL&#39;]
 **appTypes** | **string**| Apps or devices to get data for, default is all. | [optional] [default to &#39;ALL&#39;]
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

## **userAccountGet**
> OpenAPI\Server\Model\Account userAccountGet($adAccountId)

Get user account

Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/api/v5/#tag/Understanding-business-access'>Understanding Business Access</a> for more information.

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
    public function userAccountGet($adAccountId = null)
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

