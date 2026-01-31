# OpenAPI\Server\Api\LeadAdsApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adAccountsSubscriptionsDelById**](LeadAdsApiInterface.md#adAccountsSubscriptionsDelById) | **DELETE** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Delete lead ads subscription
[**adAccountsSubscriptionsGetById**](LeadAdsApiInterface.md#adAccountsSubscriptionsGetById) | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Get lead ads subscription by ID
[**adAccountsSubscriptionsGetList**](LeadAdsApiInterface.md#adAccountsSubscriptionsGetList) | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions | Get lead ads subscriptions
[**adAccountsSubscriptionsPost**](LeadAdsApiInterface.md#adAccountsSubscriptionsPost) | **POST** /ad_accounts/{ad_account_id}/leads/subscriptions | Create lead ads subscription


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\LeadAdsApi:
        tags:
            - { name: "open_api_server.api", api: "leadAds" }
    # ...
```

## **adAccountsSubscriptionsDelById**
> adAccountsSubscriptionsDelById($adAccountId, $subscriptionId)

Delete lead ads subscription

Delete an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.'

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/LeadAdsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\LeadAdsApiInterface;

class LeadAdsApi implements LeadAdsApiInterface
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
     * Implementation of LeadAdsApiInterface#adAccountsSubscriptionsDelById
     */
    public function adAccountsSubscriptionsDelById(string $adAccountId, string $subscriptionId, int &$responseCode, array &$responseHeaders): void
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string**| Unique identifier of an ad account. |
 **subscriptionId** | **string**| Unique identifier of a subscription. |

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **adAccountsSubscriptionsGetById**
> OpenAPI\Server\Model\LeadSubscription adAccountsSubscriptionsGetById($adAccountId, $subscriptionId)

Get lead ads subscription by ID

Get an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.'

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/LeadAdsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\LeadAdsApiInterface;

class LeadAdsApi implements LeadAdsApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: pinterest_oauth2
     */
    public function setpinterest_oauth2($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    /**
     * Configure OAuth2 access token for authorization: client_credentials
     */
    public function setclient_credentials($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of LeadAdsApiInterface#adAccountsSubscriptionsGetById
     */
    public function adAccountsSubscriptionsGetById(string $adAccountId, string $subscriptionId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string**| Unique identifier of an ad account. |
 **subscriptionId** | **string**| Unique identifier of a subscription. |

### Return type

[**OpenAPI\Server\Model\LeadSubscription**](../Model/LeadSubscription.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **adAccountsSubscriptionsGetList**
> OpenAPI\Server\Model\AdAccountsSubscriptionsGetList200Response adAccountsSubscriptionsGetList($adAccountId, $bookmark, $pageSize)

Get lead ads subscriptions

Get the advertiser's list of lead ads subscriptions. Only requests for the OWNER or ADMIN of the ad_account will be allowed.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/LeadAdsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\LeadAdsApiInterface;

class LeadAdsApi implements LeadAdsApiInterface
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
     * Implementation of LeadAdsApiInterface#adAccountsSubscriptionsGetList
     */
    public function adAccountsSubscriptionsGetList(string $adAccountId, ?string $bookmark, int $pageSize, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string**| Unique identifier of an ad account. |
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**OpenAPI\Server\Model\AdAccountsSubscriptionsGetList200Response**](../Model/AdAccountsSubscriptionsGetList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **adAccountsSubscriptionsPost**
> OpenAPI\Server\Model\LeadSubscription adAccountsSubscriptionsPost($adAccountId, $leadSubscriptionPostParamsCreate)

Create lead ads subscription

Create a lead ads webhook subscription. Subscriptions allow Pinterest to deliver lead data from Ads Manager directly to the subscriber. Subscriptions can exist for a specific lead form or at ad account level.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.   - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.   - For data security, egress lead data is encrypted with AES-256-GCM.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/LeadAdsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\LeadAdsApiInterface;

class LeadAdsApi implements LeadAdsApiInterface
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
     * Implementation of LeadAdsApiInterface#adAccountsSubscriptionsPost
     */
    public function adAccountsSubscriptionsPost(string $adAccountId, LeadSubscriptionPostParamsCreate $leadSubscriptionPostParamsCreate, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string**| Unique identifier of an ad account. |
 **leadSubscriptionPostParamsCreate** | [**OpenAPI\Server\Model\LeadSubscriptionPostParamsCreate**](../Model/LeadSubscriptionPostParamsCreate.md)|  |

### Return type

[**OpenAPI\Server\Model\LeadSubscription**](../Model/LeadSubscription.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

