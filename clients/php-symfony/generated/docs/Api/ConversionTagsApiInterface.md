# OpenAPI\Server\Api\ConversionTagsApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**conversionTagsCreate**](ConversionTagsApiInterface.md#conversionTagsCreate) | **POST** /ad_accounts/{ad_account_id}/conversion_tags | Create conversion tag
[**conversionTagsGet**](ConversionTagsApiInterface.md#conversionTagsGet) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id} | Get conversion tag
[**conversionTagsList**](ConversionTagsApiInterface.md#conversionTagsList) | **GET** /ad_accounts/{ad_account_id}/conversion_tags | List conversion tags
[**ocpmEligibleConversionTagsGet**](ConversionTagsApiInterface.md#ocpmEligibleConversionTagsGet) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible | Get Ocpm eligible conversion tags
[**pageVisitConversionTagsGet**](ConversionTagsApiInterface.md#pageVisitConversionTagsGet) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/page_visit | Get page visit conversion tags


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\ConversionTagsApi:
        tags:
            - { name: "open_api_server.api", api: "conversionTags" }
    # ...
```

## **conversionTagsCreate**
> OpenAPI\Server\Model\ConversionTag conversionTagsCreate($adAccountId, $conversionTagCreate)

Create conversion tag

Create a conversion tag, also known as [Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag), with the option to enable enhanced match.  The Pinterest Tag tracks actions people take on the ad account's website after they view the ad account's ad on Pinterest. The advertiser needs to customize this tag to track conversions.  For more information, see:  [Set up the Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag)  [Pinterest Tag](/docs/track-conversions/pinterest-tag/)  [Enhanced match](/docs/track-conversions/pinterest-tag/#enhanced-match)

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ConversionTagsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ConversionTagsApiInterface;

class ConversionTagsApi implements ConversionTagsApiInterface
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
     * Implementation of ConversionTagsApiInterface#conversionTagsCreate
     */
    public function conversionTagsCreate(string $adAccountId, ConversionTagCreate $conversionTagCreate, int &$responseCode, array &$responseHeaders): array|object|null
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
 **conversionTagCreate** | [**OpenAPI\Server\Model\ConversionTagCreate**](../Model/ConversionTagCreate.md)|  |

### Return type

[**OpenAPI\Server\Model\ConversionTag**](../Model/ConversionTag.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **conversionTagsGet**
> OpenAPI\Server\Model\ConversionTag conversionTagsGet($adAccountId, $conversionTagId)

Get conversion tag

Get information about an existing conversion tag.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ConversionTagsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ConversionTagsApiInterface;

class ConversionTagsApi implements ConversionTagsApiInterface
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
     * Implementation of ConversionTagsApiInterface#conversionTagsGet
     */
    public function conversionTagsGet(string $adAccountId, string $conversionTagId, int &$responseCode, array &$responseHeaders): array|object|null
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
 **conversionTagId** | **string**| Id of the conversion tag. |

### Return type

[**OpenAPI\Server\Model\ConversionTag**](../Model/ConversionTag.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **conversionTagsList**
> OpenAPI\Server\Model\ConversionTagsList200Response conversionTagsList($adAccountId, $filterDeleted)

List conversion tags

List conversion tags associated with an ad account.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ConversionTagsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ConversionTagsApiInterface;

class ConversionTagsApi implements ConversionTagsApiInterface
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
     * Implementation of ConversionTagsApiInterface#conversionTagsList
     */
    public function conversionTagsList(string $adAccountId, bool $filterDeleted, int &$responseCode, array &$responseHeaders): array|object|null
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
 **filterDeleted** | **bool**| Filter by deleted status | [optional] [default to false]

### Return type

[**OpenAPI\Server\Model\ConversionTagsList200Response**](../Model/ConversionTagsList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **ocpmEligibleConversionTagsGet**
> OpenAPI\Server\Model\ConversionEventResponse ocpmEligibleConversionTagsGet($adAccountId)

Get Ocpm eligible conversion tags

Get Ocpm eligible conversion tag events for an ad account.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ConversionTagsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ConversionTagsApiInterface;

class ConversionTagsApi implements ConversionTagsApiInterface
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
     * Implementation of ConversionTagsApiInterface#ocpmEligibleConversionTagsGet
     */
    public function ocpmEligibleConversionTagsGet(string $adAccountId, int &$responseCode, array &$responseHeaders): array|object|null
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

### Return type

**OpenAPI\Server\Model\ConversionEventResponse**

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **pageVisitConversionTagsGet**
> OpenAPI\Server\Model\PageVisitConversionTagsGet200Response pageVisitConversionTagsGet($adAccountId, $bookmark, $pageSize, $order)

Get page visit conversion tags

Get all page visit conversion tag events for an ad account.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ConversionTagsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ConversionTagsApiInterface;

class ConversionTagsApi implements ConversionTagsApiInterface
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
     * Implementation of ConversionTagsApiInterface#pageVisitConversionTagsGet
     */
    public function pageVisitConversionTagsGet(string $adAccountId, ?string $bookmark, int $pageSize, ?PinterestLibPaginationOrder $order, int &$responseCode, array &$responseHeaders): array|object|null
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
 **order** | [**PinterestLibPaginationOrder**](../Model/.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional]

### Return type

[**OpenAPI\Server\Model\PageVisitConversionTagsGet200Response**](../Model/PageVisitConversionTagsGet200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

