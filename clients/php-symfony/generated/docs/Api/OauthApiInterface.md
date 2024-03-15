# OpenAPI\Server\Api\OauthApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**oauthToken**](OauthApiInterface.md#oauthToken) | **POST** /oauth/token | Generate OAuth access token


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\OauthApi:
        tags:
            - { name: "open_api_server.api", api: "oauth" }
    # ...
```

## **oauthToken**
> OpenAPI\Server\Model\OauthAccessTokenResponse oauthToken($grantType)

Generate OAuth access token

Generate an OAuth access token by using an authorization code or a refresh token.  IMPORTANT: You need to start the OAuth flow via www.pinterest.com/oauth before calling this endpoint (or have an existing refresh token).  See <a href='/docs/getting-started/authentication/'>Authentication</a> for more.  <strong>Parameter <i>refresh_on</i> and its corresponding response type <i>everlasting_refresh</i> are now available to all apps! Later this year, continuous refresh will become the default behavior (ie you will no longer need to send this parameter). <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>

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
    public function oauthToken(string $grantType, int &$responseCode, array &$responseHeaders): array|object|null
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

[basic](../../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

