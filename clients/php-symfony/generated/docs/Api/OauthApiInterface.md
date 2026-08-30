# OpenAPI\Server\Api\OauthApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**oauthConversionToken**](OauthApiInterface.md#oauthConversionToken) | **POST** /oauth/conversion_token | Generate OAuth access token for conversion API
[**oauthToken**](OauthApiInterface.md#oauthToken) | **POST** /oauth/token | Generate OAuth access token
[**tokenRevoke**](OauthApiInterface.md#tokenRevoke) | **POST** /oauth/token/revoke | Revoke a token


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

## **oauthConversionToken**
> OpenAPI\Server\Model\ConversionAccessToken oauthConversionToken()

Generate OAuth access token for conversion API

Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/OauthApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\OauthApiInterface;

class OauthApi implements OauthApiInterface
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
     * Implementation of OauthApiInterface#oauthConversionToken
     */
    public function oauthConversionToken(int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OpenAPI\Server\Model\ConversionAccessToken**](../Model/ConversionAccessToken.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **oauthToken**
> OpenAPI\Server\Model\OauthAccessToken oauthToken($grantType, $code, $continuousRefresh, $redirectUri, $refreshToken, $scope)

Generate OAuth access token

Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for [requesting and refreshing tokens](/docs/getting-started/set-up-authentication-and-authorization/).  **Note:** If your app was created **before September 25, 2025**, make sure to set the `continuous_refresh` parameter to `true` to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use [Token Debugger](/docs/developer-tools/token-debugger/) to validate and inspect your access token.

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
    public function oauthToken(TokenGrantType $grantType, ?string $code, ?string $continuousRefresh, ?string $redirectUri, ?string $refreshToken, ?string $scope, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **grantType** | [**TokenGrantType**](../Model/TokenGrantType.md)|  |
 **code** | **string**|  | [optional]
 **continuousRefresh** | **string**| If your app was created before **September 25, 2025**, set to &#x60;true&#x60; to generate a [continuous refresh token](/docs/getting-started/set-up-authentication-and-authorization/#exchange-the-default-refresh-token-for-a-continuous-refresh-token), which has a 60-day expiration window. We no longer support the legacy refresh token, which has a 365-day expiration window.    If your app was created on or after **September 25, 2025**, ignore this parameter. You automatically receive a continuous refresh token when you request an access token. | [optional]
 **redirectUri** | **string**|  | [optional]
 **refreshToken** | **string**|  | [optional]
 **scope** | **string**|  | [optional]

### Return type

[**OpenAPI\Server\Model\OauthAccessToken**](../Model/OauthAccessToken.md)

### Authorization

[basic](../../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **tokenRevoke**
> tokenRevoke($token, $tokenTypeHint)

Revoke a token

Revokes an access or refresh token. Only tokens issued for system users are currently supported. Revoked tokens become immediately invalid and unusable.

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
     * Implementation of OauthApiInterface#tokenRevoke
     */
    public function tokenRevoke(string $token, ?TokenTypeHint $tokenTypeHint, int &$responseCode, array &$responseHeaders): void
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string**| The token to revoke. |
 **tokenTypeHint** | [**TokenTypeHint**](../Model/TokenTypeHint.md)| The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information. | [optional]

### Return type

void (empty response body)

### Authorization

[basic](../../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

