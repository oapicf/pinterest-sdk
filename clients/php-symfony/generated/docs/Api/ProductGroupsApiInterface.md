# OpenAPI\Server\Api\ProductGroupsApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adAccountsCatalogsProductGroupsList**](ProductGroupsApiInterface.md#adAccountsCatalogsProductGroupsList) | **GET** /ad_accounts/{ad_account_id}/product_groups/catalogs | Get catalog product groups


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\ProductGroupsApi:
        tags:
            - { name: "open_api_server.api", api: "productGroups" }
    # ...
```

## **adAccountsCatalogsProductGroupsList**
> OpenAPI\Server\Model\AdAccountsCatalogsProductGroupsList200Response adAccountsCatalogsProductGroupsList($adAccountId, $feedProfileId)

Get catalog product groups

This endpoint is completely deprecated. Please use <a href='/docs/api/v5/#operation/catalogs_product_groups/list'>List product groups</a> from Catalogs API instead.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ProductGroupsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ProductGroupsApiInterface;

class ProductGroupsApi implements ProductGroupsApiInterface
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
     * Implementation of ProductGroupsApiInterface#adAccountsCatalogsProductGroupsList
     */
    public function adAccountsCatalogsProductGroupsList(string $adAccountId, ?string $feedProfileId, int &$responseCode, array &$responseHeaders): array|object|null
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
 **feedProfileId** | **string**| The feed profile id whose catalog product groups we want to return. | [optional]

### Return type

[**OpenAPI\Server\Model\AdAccountsCatalogsProductGroupsList200Response**](../Model/AdAccountsCatalogsProductGroupsList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

