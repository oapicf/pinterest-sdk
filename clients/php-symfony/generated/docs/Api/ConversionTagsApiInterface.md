# OpenAPI\Server\Api\ConversionTagsApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**conversionTagsCreate**](ConversionTagsApiInterface.md#conversionTagsCreate) | **POST** /ad_accounts/{ad_account_id}/conversion_tags | Create conversion tag
[**conversionTagsGet**](ConversionTagsApiInterface.md#conversionTagsGet) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id} | Get conversion tag
[**conversionTagsList**](ConversionTagsApiInterface.md#conversionTagsList) | **GET** /ad_accounts/{ad_account_id}/conversion_tags | Get conversion tags
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
> OpenAPI\Server\Model\ConversionTagResponse conversionTagsCreate($adAccountId, $conversionTagCreate)

Create conversion tag

Create a conversion tag, also known as <a href=\"https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\" target=\"_blank\">Pinterest tag</a>, with the option to enable enhanced match.<p/> The Pinterest Tag tracks actions people take on the ad account’s website after they view the ad account's ad on Pinterest. The advertiser needs to customize this tag to track conversions.<p/> For more information, see:<p/> <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\">Set up the Pinterest tag</a><p/> <a class=\"reference external\" href=\"https://developers.pinterest.com/docs/conversions/pinterest-tag/\">Pinterest Tag</a><p/> <a class=\"reference external\" href=\"https://developers.pinterest.com/docs/conversions/enhanced-match/\">Enhanced match</a>

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
 **conversionTagCreate** | [**OpenAPI\Server\Model\ConversionTagCreate**](../Model/ConversionTagCreate.md)| Conversion Tag to create |

### Return type

[**OpenAPI\Server\Model\ConversionTagResponse**](../Model/ConversionTagResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **conversionTagsGet**
> OpenAPI\Server\Model\ConversionTagResponse conversionTagsGet($adAccountId, $conversionTagId)

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

[**OpenAPI\Server\Model\ConversionTagResponse**](../Model/ConversionTagResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **conversionTagsList**
> OpenAPI\Server\Model\ConversionTagListResponse conversionTagsList($adAccountId, $filterDeleted)

Get conversion tags

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
 **filterDeleted** | **bool**| Filter out deleted tags. | [optional] [default to false]

### Return type

[**OpenAPI\Server\Model\ConversionTagListResponse**](../Model/ConversionTagListResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

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

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **pageVisitConversionTagsGet**
> OpenAPI\Server\Model\PageVisitConversionTagsGet200Response pageVisitConversionTagsGet($adAccountId, $pageSize, $order, $bookmark)

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

    // ...

    /**
     * Implementation of ConversionTagsApiInterface#pageVisitConversionTagsGet
     */
    public function pageVisitConversionTagsGet(string $adAccountId, int $pageSize, ?string $order, ?string $bookmark, int &$responseCode, array &$responseHeaders): array|object|null
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
 **pageSize** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **order** | **string**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional]
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]

### Return type

[**OpenAPI\Server\Model\PageVisitConversionTagsGet200Response**](../Model/PageVisitConversionTagsGet200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

