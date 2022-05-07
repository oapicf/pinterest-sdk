# OpenAPI\Server\Api\OauthApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**oauthToken**](OauthApiInterface.md#oauthToken) | **POST** /oauth/token | Generate OAuth access token


## Service Declaration
```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.oauth:
        class: Acme\MyBundle\Api\OauthApi
        tags:
            - { name: "open_api_server.api", api: "oauth" }
    # ...
```

## **oauthToken**
> OpenAPI\Server\Model\OauthAccessTokenResponse oauthToken($grantType)

Generate OAuth access token

Generate an OAuth access token by using an authorization code or a refresh token.  See <a href='/docs/api/v5/#tag/Authentication'>Authentication</a> for more.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/OauthApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\OauthApiInterface;

class OauthApi implements OauthApiInterface
{

    // ...

    /**
     * Implementation of OauthApiInterface#oauthToken
     */
    public function oauthToken($grantType)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **grantType** | **string**|  |

### Return type

[**OpenAPI\Server\Model\OauthAccessTokenResponse**](../Model/OauthAccessTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

