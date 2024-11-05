# OpenAPI\Server\Api\AudienceSharingApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adAccountsAudiencesSharedAccountsList**](AudienceSharingApiInterface.md#adAccountsAudiencesSharedAccountsList) | **GET** /ad_accounts/{ad_account_id}/audiences/shared/accounts | List accounts with access to an audience owned by an ad account
[**businessAccountAudiencesSharedAccountsList**](AudienceSharingApiInterface.md#businessAccountAudiencesSharedAccountsList) | **GET** /businesses/{business_id}/audiences/shared/accounts | List accounts with access to an audience owned by a business
[**sharedAudiencesForBusinessList**](AudienceSharingApiInterface.md#sharedAudiencesForBusinessList) | **GET** /businesses/{business_id}/audiences | List received audiences for a business
[**updateAdAccountToAdAccountSharedAudience**](AudienceSharingApiInterface.md#updateAdAccountToAdAccountSharedAudience) | **PATCH** /ad_accounts/{ad_account_id}/audiences/ad_accounts/shared | Update audience sharing between ad accounts
[**updateAdAccountToBusinessSharedAudience**](AudienceSharingApiInterface.md#updateAdAccountToBusinessSharedAudience) | **PATCH** /ad_accounts/{ad_account_id}/audiences/businesses/shared | Update audience sharing from an ad account to businesses
[**updateBusinessToAdAccountSharedAudience**](AudienceSharingApiInterface.md#updateBusinessToAdAccountSharedAudience) | **PATCH** /businesses/{business_id}/audiences/ad_accounts/shared | Update audience sharing from a business to ad accounts
[**updateBusinessToBusinessSharedAudience**](AudienceSharingApiInterface.md#updateBusinessToBusinessSharedAudience) | **PATCH** /businesses/{business_id}/audiences/businesses/shared | Update audience sharing between businesses


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\AudienceSharingApi:
        tags:
            - { name: "open_api_server.api", api: "audienceSharing" }
    # ...
```

## **adAccountsAudiencesSharedAccountsList**
> OpenAPI\Server\Model\AdAccountsAudiencesSharedAccountsList200Response adAccountsAudiencesSharedAccountsList($adAccountId, $audienceId, $accountType, $pageSize, $bookmark)

List accounts with access to an audience owned by an ad account

List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AudienceSharingApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AudienceSharingApiInterface;

class AudienceSharingApi implements AudienceSharingApiInterface
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
     * Implementation of AudienceSharingApiInterface#adAccountsAudiencesSharedAccountsList
     */
    public function adAccountsAudiencesSharedAccountsList(string $adAccountId, string $audienceId, AudienceAccountType $accountType, int $pageSize, ?string $bookmark, int &$responseCode, array &$responseHeaders): array|object|null
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
 **audienceId** | **string**| Unique identifier of the audience to use to filter the results. |
 **accountType** | [**OpenAPI\Server\Model\AudienceAccountType**](../Model/.md)| Filter accounts by account type. |
 **pageSize** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]

### Return type

[**OpenAPI\Server\Model\AdAccountsAudiencesSharedAccountsList200Response**](../Model/AdAccountsAudiencesSharedAccountsList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **businessAccountAudiencesSharedAccountsList**
> OpenAPI\Server\Model\AdAccountsAudiencesSharedAccountsList200Response businessAccountAudiencesSharedAccountsList($businessId, $audienceId, $accountType, $pageSize, $bookmark)

List accounts with access to an audience owned by a business

List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AudienceSharingApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AudienceSharingApiInterface;

class AudienceSharingApi implements AudienceSharingApiInterface
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
     * Implementation of AudienceSharingApiInterface#businessAccountAudiencesSharedAccountsList
     */
    public function businessAccountAudiencesSharedAccountsList(string $businessId, string $audienceId, AudienceAccountType $accountType, int $pageSize, ?string $bookmark, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **string**| Unique identifier of the requesting business. |
 **audienceId** | **string**| Unique identifier of the audience to use to filter the results. |
 **accountType** | [**OpenAPI\Server\Model\AudienceAccountType**](../Model/.md)| Filter accounts by account type. |
 **pageSize** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]

### Return type

[**OpenAPI\Server\Model\AdAccountsAudiencesSharedAccountsList200Response**](../Model/AdAccountsAudiencesSharedAccountsList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **sharedAudiencesForBusinessList**
> OpenAPI\Server\Model\AudiencesList200Response sharedAudiencesForBusinessList($businessId, $bookmark, $order, $pageSize)

List received audiences for a business

Get a list of received audiences for the given business.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AudienceSharingApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AudienceSharingApiInterface;

class AudienceSharingApi implements AudienceSharingApiInterface
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
     * Implementation of AudienceSharingApiInterface#sharedAudiencesForBusinessList
     */
    public function sharedAudiencesForBusinessList(string $businessId, ?string $bookmark, ?string $order, int $pageSize, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **string**| Unique identifier of the requesting business. |
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]
 **order** | **string**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional]
 **pageSize** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**OpenAPI\Server\Model\AudiencesList200Response**](../Model/AudiencesList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **updateAdAccountToAdAccountSharedAudience**
> OpenAPI\Server\Model\SharedAudienceResponse updateAdAccountToAdAccountSharedAudience($adAccountId, $sharedAudience)

Update audience sharing between ad accounts

From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same <a href='https://help.pinterest.com/en/business/article/create-and-manage-accounts'>Pinterest Business Hierarchy</a> as the business owner of the ad account.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AudienceSharingApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AudienceSharingApiInterface;

class AudienceSharingApi implements AudienceSharingApiInterface
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
     * Implementation of AudienceSharingApiInterface#updateAdAccountToAdAccountSharedAudience
     */
    public function updateAdAccountToAdAccountSharedAudience(string $adAccountId, SharedAudience $sharedAudience, int &$responseCode, array &$responseHeaders): array|object|null
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
 **sharedAudience** | [**OpenAPI\Server\Model\SharedAudience**](../Model/SharedAudience.md)|  |

### Return type

[**OpenAPI\Server\Model\SharedAudienceResponse**](../Model/SharedAudienceResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **updateAdAccountToBusinessSharedAudience**
> OpenAPI\Server\Model\BusinessSharedAudienceResponse updateAdAccountToBusinessSharedAudience($adAccountId, $businessSharedAudience)

Update audience sharing from an ad account to businesses

From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AudienceSharingApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AudienceSharingApiInterface;

class AudienceSharingApi implements AudienceSharingApiInterface
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
     * Implementation of AudienceSharingApiInterface#updateAdAccountToBusinessSharedAudience
     */
    public function updateAdAccountToBusinessSharedAudience(string $adAccountId, BusinessSharedAudience $businessSharedAudience, int &$responseCode, array &$responseHeaders): array|object|null
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
 **businessSharedAudience** | [**OpenAPI\Server\Model\BusinessSharedAudience**](../Model/BusinessSharedAudience.md)|  |

### Return type

[**OpenAPI\Server\Model\BusinessSharedAudienceResponse**](../Model/BusinessSharedAudienceResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **updateBusinessToAdAccountSharedAudience**
> OpenAPI\Server\Model\SharedAudienceResponse updateBusinessToAdAccountSharedAudience($businessId, $sharedAudience)

Update audience sharing from a business to ad accounts

From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience. <ul> <li>If the business is the owner of the audience, it can share with any ad account within the same business hierarchy.</li> <li>If the business is the recipient of the audience, it can share with any of its owned ad accounts.</li> </ul> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AudienceSharingApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AudienceSharingApiInterface;

class AudienceSharingApi implements AudienceSharingApiInterface
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
     * Implementation of AudienceSharingApiInterface#updateBusinessToAdAccountSharedAudience
     */
    public function updateBusinessToAdAccountSharedAudience(string $businessId, SharedAudience $sharedAudience, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **string**| Unique identifier of the requesting business. |
 **sharedAudience** | [**OpenAPI\Server\Model\SharedAudience**](../Model/SharedAudience.md)|  |

### Return type

[**OpenAPI\Server\Model\SharedAudienceResponse**](../Model/SharedAudienceResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **updateBusinessToBusinessSharedAudience**
> OpenAPI\Server\Model\BusinessSharedAudienceResponse updateBusinessToBusinessSharedAudience($businessId, $businessSharedAudience)

Update audience sharing between businesses

From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AudienceSharingApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AudienceSharingApiInterface;

class AudienceSharingApi implements AudienceSharingApiInterface
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
     * Implementation of AudienceSharingApiInterface#updateBusinessToBusinessSharedAudience
     */
    public function updateBusinessToBusinessSharedAudience(string $businessId, BusinessSharedAudience $businessSharedAudience, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **string**| Unique identifier of the requesting business. |
 **businessSharedAudience** | [**OpenAPI\Server\Model\BusinessSharedAudience**](../Model/BusinessSharedAudience.md)|  |

### Return type

[**OpenAPI\Server\Model\BusinessSharedAudienceResponse**](../Model/BusinessSharedAudienceResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

