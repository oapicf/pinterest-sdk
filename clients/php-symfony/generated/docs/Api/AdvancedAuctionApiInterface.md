# OpenAPI\Server\Api\AdvancedAuctionApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**advancedAuctionItemsGetPost**](AdvancedAuctionApiInterface.md#advancedAuctionItemsGetPost) | **POST** /advanced_auction/items/get | Get item bid options (POST)
[**advancedAuctionItemsSubmitPost**](AdvancedAuctionApiInterface.md#advancedAuctionItemsSubmitPost) | **POST** /advanced_auction/items/submit | Operate on item level bid options


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\AdvancedAuctionApi:
        tags:
            - { name: "open_api_server.api", api: "advancedAuction" }
    # ...
```

## **advancedAuctionItemsGetPost**
> OpenAPI\Server\Model\AdvancedAuctionItems advancedAuctionItemsGetPost($advancedAuctionItemsGetRequest, $adAccountId)

Get item bid options (POST)

Get the bid options for a batch of retail catalog items.  The catalog must be owned by the \"operation user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: `Owner`, `Admin`.  This endpoint is not available to all users.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AdvancedAuctionApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AdvancedAuctionApiInterface;

class AdvancedAuctionApi implements AdvancedAuctionApiInterface
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
     * Implementation of AdvancedAuctionApiInterface#advancedAuctionItemsGetPost
     */
    public function advancedAuctionItemsGetPost(AdvancedAuctionItemsGetRequest $advancedAuctionItemsGetRequest, ?string $adAccountId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advancedAuctionItemsGetRequest** | [**OpenAPI\Server\Model\AdvancedAuctionItemsGetRequest**](../Model/AdvancedAuctionItemsGetRequest.md)| Request object used to get bid options values for a batch of retail catalog items |
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]

### Return type

[**OpenAPI\Server\Model\AdvancedAuctionItems**](../Model/AdvancedAuctionItems.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **advancedAuctionItemsSubmitPost**
> OpenAPI\Server\Model\AdvancedAuctionProcessedItems advancedAuctionItemsSubmitPost($advancedAuctionItemsSubmitRequest, $adAccountId)

Operate on item level bid options

This endpoint supports multiple operations on a set of one or more bid options (bid price and bid adjustments for targeting categories) for retail catalog items. These advanced auction settings are applied in campaigns using objective_type `CATALOG_SALES` and ad groups using bid_strategy_type `MAX_BID`.  The catalog must be owned by the \"operation user_account\". <a href=\"/docs/api-features/modify-items-in-batch/\" target=\"_blank\">See detailed documentation here.</a> By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: `Owner`, `Admin`.  This endpoint is not available to all users.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AdvancedAuctionApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AdvancedAuctionApiInterface;

class AdvancedAuctionApi implements AdvancedAuctionApiInterface
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
     * Implementation of AdvancedAuctionApiInterface#advancedAuctionItemsSubmitPost
     */
    public function advancedAuctionItemsSubmitPost(AdvancedAuctionItemsSubmitRequest $advancedAuctionItemsSubmitRequest, ?string $adAccountId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advancedAuctionItemsSubmitRequest** | [**OpenAPI\Server\Model\AdvancedAuctionItemsSubmitRequest**](../Model/AdvancedAuctionItemsSubmitRequest.md)| Request object used to upsert or delete bid options for a batch of retail catalog items |
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]

### Return type

[**OpenAPI\Server\Model\AdvancedAuctionProcessedItems**](../Model/AdvancedAuctionProcessedItems.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

