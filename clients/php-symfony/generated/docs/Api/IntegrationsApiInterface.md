# OpenAPI\Server\Api\IntegrationsApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**integrationsCommerceDel**](IntegrationsApiInterface.md#integrationsCommerceDel) | **DELETE** /integrations/commerce/{external_business_id} | Delete commerce integration
[**integrationsCommerceGet**](IntegrationsApiInterface.md#integrationsCommerceGet) | **GET** /integrations/commerce/{external_business_id} | Get commerce integration
[**integrationsCommercePatch**](IntegrationsApiInterface.md#integrationsCommercePatch) | **PATCH** /integrations/commerce/{external_business_id} | Update commerce integration
[**integrationsCommercePost**](IntegrationsApiInterface.md#integrationsCommercePost) | **POST** /integrations/commerce | Create commerce integration
[**integrationsGetById**](IntegrationsApiInterface.md#integrationsGetById) | **GET** /integrations/{id} | Get integration metadata
[**integrationsGetList**](IntegrationsApiInterface.md#integrationsGetList) | **GET** /integrations | Get integration metadata list
[**integrationsLogsPost**](IntegrationsApiInterface.md#integrationsLogsPost) | **POST** /integrations/logs | Receives batched logs from integration applications.


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\IntegrationsApi:
        tags:
            - { name: "open_api_server.api", api: "integrations" }
    # ...
```

## **integrationsCommerceDel**
> OpenAPI\Server\Model\IntegrationMetadata integrationsCommerceDel($externalBusinessId)

Delete commerce integration

Delete commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/IntegrationsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\IntegrationsApiInterface;

class IntegrationsApi implements IntegrationsApiInterface
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
     * Implementation of IntegrationsApiInterface#integrationsCommerceDel
     */
    public function integrationsCommerceDel(string $externalBusinessId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalBusinessId** | **string**| External business ID for the integration. |

### Return type

[**OpenAPI\Server\Model\IntegrationMetadata**](../Model/IntegrationMetadata.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **integrationsCommerceGet**
> OpenAPI\Server\Model\IntegrationMetadata integrationsCommerceGet($externalBusinessId)

Get commerce integration

Get commerce integration metadata associated with the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/IntegrationsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\IntegrationsApiInterface;

class IntegrationsApi implements IntegrationsApiInterface
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
     * Implementation of IntegrationsApiInterface#integrationsCommerceGet
     */
    public function integrationsCommerceGet(string $externalBusinessId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalBusinessId** | **string**| External business ID for the integration. |

### Return type

[**OpenAPI\Server\Model\IntegrationMetadata**](../Model/IntegrationMetadata.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **integrationsCommercePatch**
> OpenAPI\Server\Model\IntegrationMetadata integrationsCommercePatch($externalBusinessId, $integrationMetadataUpdate)

Update commerce integration

Update commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/IntegrationsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\IntegrationsApiInterface;

class IntegrationsApi implements IntegrationsApiInterface
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
     * Implementation of IntegrationsApiInterface#integrationsCommercePatch
     */
    public function integrationsCommercePatch(string $externalBusinessId, IntegrationMetadataUpdate $integrationMetadataUpdate, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalBusinessId** | **string**| External business ID for the integration. |
 **integrationMetadataUpdate** | [**OpenAPI\Server\Model\IntegrationMetadataUpdate**](../Model/IntegrationMetadataUpdate.md)|  |

### Return type

[**OpenAPI\Server\Model\IntegrationMetadata**](../Model/IntegrationMetadata.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **integrationsCommercePost**
> OpenAPI\Server\Model\IntegrationMetadata integrationsCommercePost($integrationMetadataCreate)

Create commerce integration

Create commerce integration metadata to link an external business ID with a Pinterest merchant & ad account. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/IntegrationsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\IntegrationsApiInterface;

class IntegrationsApi implements IntegrationsApiInterface
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
     * Implementation of IntegrationsApiInterface#integrationsCommercePost
     */
    public function integrationsCommercePost(IntegrationMetadataCreate $integrationMetadataCreate, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integrationMetadataCreate** | [**OpenAPI\Server\Model\IntegrationMetadataCreate**](../Model/IntegrationMetadataCreate.md)|  |

### Return type

[**OpenAPI\Server\Model\IntegrationMetadata**](../Model/IntegrationMetadata.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **integrationsGetById**
> OpenAPI\Server\Model\IntegrationRecord integrationsGetById($id)

Get integration metadata

Get integration metadata by ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/IntegrationsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\IntegrationsApiInterface;

class IntegrationsApi implements IntegrationsApiInterface
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
     * Implementation of IntegrationsApiInterface#integrationsGetById
     */
    public function integrationsGetById(string $id, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**| Integration record ID. |

### Return type

[**OpenAPI\Server\Model\IntegrationRecord**](../Model/IntegrationRecord.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **integrationsGetList**
> OpenAPI\Server\Model\IntegrationsGetList200Response integrationsGetList($bookmark, $pageSize)

Get integration metadata list

Get integration metadata list. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/IntegrationsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\IntegrationsApiInterface;

class IntegrationsApi implements IntegrationsApiInterface
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
     * Implementation of IntegrationsApiInterface#integrationsGetList
     */
    public function integrationsGetList(?string $bookmark, int $pageSize, int &$responseCode, array &$responseHeaders): array|object|null
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
 **pageSize** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**OpenAPI\Server\Model\IntegrationsGetList200Response**](../Model/IntegrationsGetList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **integrationsLogsPost**
> OpenAPI\Server\Model\IntegrationLogsSuccessResponse integrationsLogsPost($integrationLogsRequestCreate)

Receives batched logs from integration applications.

This endpoint receives batched logs from integration applications on partner platforms. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/IntegrationsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\IntegrationsApiInterface;

class IntegrationsApi implements IntegrationsApiInterface
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
     * Implementation of IntegrationsApiInterface#integrationsLogsPost
     */
    public function integrationsLogsPost(IntegrationLogsRequestCreate $integrationLogsRequestCreate, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integrationLogsRequestCreate** | [**OpenAPI\Server\Model\IntegrationLogsRequestCreate**](../Model/IntegrationLogsRequestCreate.md)|  |

### Return type

[**OpenAPI\Server\Model\IntegrationLogsSuccessResponse**](../Model/IntegrationLogsSuccessResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

