# OpenAPI\Server\Api\TermsOfServiceApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**termsOfServiceGet**](TermsOfServiceApiInterface.md#termsOfServiceGet) | **GET** /ad_accounts/{ad_account_id}/terms_of_service | Get terms of service


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\TermsOfServiceApi:
        tags:
            - { name: "open_api_server.api", api: "termsOfService" }
    # ...
```

## **termsOfServiceGet**
> OpenAPI\Server\Model\TermsOfService termsOfServiceGet($adAccountId, $includeHtml, $tosType)

Get terms of service

Get the text of the terms of service and see whether the advertiser has accepted the terms of service.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/TermsOfServiceApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\TermsOfServiceApiInterface;

class TermsOfServiceApi implements TermsOfServiceApiInterface
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
     * Implementation of TermsOfServiceApiInterface#termsOfServiceGet
     */
    public function termsOfServiceGet(string $adAccountId, bool $includeHtml, ?string $tosType, int &$responseCode, array &$responseHeaders): array|object|null
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
 **includeHtml** | **bool**| Return HTML in TOS text. | [optional] [default to false]
 **tosType** | **string**| Request type. | [optional]

### Return type

[**OpenAPI\Server\Model\TermsOfService**](../Model/TermsOfService.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

