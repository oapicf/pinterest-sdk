# OpenAPI\Server\Api\BillingApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adsCreditRedeem**](BillingApiInterface.md#adsCreditRedeem) | **POST** /ad_accounts/{ad_account_id}/ads_credit/redeem | Redeem ad credits
[**adsCreditsDiscountsGet**](BillingApiInterface.md#adsCreditsDiscountsGet) | **GET** /ad_accounts/{ad_account_id}/ads_credit/discounts | Get ads credit discounts
[**billingProfilesGet**](BillingApiInterface.md#billingProfilesGet) | **GET** /ad_accounts/{ad_account_id}/billing_profiles | Get billing profiles
[**ssioAccountsGet**](BillingApiInterface.md#ssioAccountsGet) | **GET** /ad_accounts/{ad_account_id}/ssio/accounts | Get Salesforce account details including bill-to information.
[**ssioInsertionOrderCreate**](BillingApiInterface.md#ssioInsertionOrderCreate) | **POST** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Create insertion order through SSIO.
[**ssioInsertionOrderEdit**](BillingApiInterface.md#ssioInsertionOrderEdit) | **PATCH** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Edit insertion order through SSIO.
[**ssioInsertionOrdersStatusGetByAdAccount**](BillingApiInterface.md#ssioInsertionOrdersStatusGetByAdAccount) | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/status | Get insertion order status by ad account id.
[**ssioInsertionOrdersStatusGetByPinOrderId**](BillingApiInterface.md#ssioInsertionOrdersStatusGetByPinOrderId) | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status | Get insertion order status by pin order id.
[**ssioOrderLinesGetByAdAccount**](BillingApiInterface.md#ssioOrderLinesGetByAdAccount) | **GET** /ad_accounts/{ad_account_id}/ssio/order_lines | Get Salesforce order lines by ad account id.


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\BillingApi:
        tags:
            - { name: "open_api_server.api", api: "billing" }
    # ...
```

## **adsCreditRedeem**
> OpenAPI\Server\Model\AdsCreditRedeemResponse adsCreditRedeem($adAccountId, $adsCreditRedeemRequest)

Redeem ad credits

Redeem ads credit on behalf of the ad account id and apply it towards billing.  <strong>This endpoint might not be available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BillingApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BillingApiInterface;

class BillingApi implements BillingApiInterface
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
     * Implementation of BillingApiInterface#adsCreditRedeem
     */
    public function adsCreditRedeem(string $adAccountId, AdsCreditRedeemRequest $adsCreditRedeemRequest, int &$responseCode, array &$responseHeaders): array|object|null
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
 **adsCreditRedeemRequest** | [**OpenAPI\Server\Model\AdsCreditRedeemRequest**](../Model/AdsCreditRedeemRequest.md)| Redeem ad credits request. |

### Return type

[**OpenAPI\Server\Model\AdsCreditRedeemResponse**](../Model/AdsCreditRedeemResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **adsCreditsDiscountsGet**
> OpenAPI\Server\Model\AdsCreditsDiscountsGet200Response adsCreditsDiscountsGet($adAccountId, $bookmark, $pageSize)

Get ads credit discounts

Returns the list of discounts applied to the account.  <strong>This endpoint might not be available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BillingApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BillingApiInterface;

class BillingApi implements BillingApiInterface
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
     * Implementation of BillingApiInterface#adsCreditsDiscountsGet
     */
    public function adsCreditsDiscountsGet(string $adAccountId, ?string $bookmark, int $pageSize, int &$responseCode, array &$responseHeaders): array|object|null
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
 **pageSize** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**OpenAPI\Server\Model\AdsCreditsDiscountsGet200Response**](../Model/AdsCreditsDiscountsGet200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **billingProfilesGet**
> OpenAPI\Server\Model\BillingProfilesGet200Response billingProfilesGet($adAccountId, $isActive, $bookmark, $pageSize)

Get billing profiles

Get billing profiles in the advertiser account.  <strong>This endpoint might not be available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BillingApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BillingApiInterface;

class BillingApi implements BillingApiInterface
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
     * Implementation of BillingApiInterface#billingProfilesGet
     */
    public function billingProfilesGet(string $adAccountId, bool $isActive, ?string $bookmark, int $pageSize, int &$responseCode, array &$responseHeaders): array|object|null
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
 **isActive** | **bool**| Return active billing profiles, if false return all billing profiles. |
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**OpenAPI\Server\Model\BillingProfilesGet200Response**](../Model/BillingProfilesGet200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **ssioAccountsGet**
> OpenAPI\Server\Model\SSIOAccountResponse ssioAccountsGet($adAccountId)

Get Salesforce account details including bill-to information.

Get Salesforce account details including bill-to information to be used in insertion orders process for <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BillingApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BillingApiInterface;

class BillingApi implements BillingApiInterface
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
     * Implementation of BillingApiInterface#ssioAccountsGet
     */
    public function ssioAccountsGet(string $adAccountId, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\SSIOAccountResponse**](../Model/SSIOAccountResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **ssioInsertionOrderCreate**
> OpenAPI\Server\Model\SSIOCreateInsertionOrderResponse ssioInsertionOrderCreate($adAccountId, $sSIOCreateInsertionOrderRequest)

Create insertion order through SSIO.

Create insertion order through SSIO for <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BillingApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BillingApiInterface;

class BillingApi implements BillingApiInterface
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
     * Implementation of BillingApiInterface#ssioInsertionOrderCreate
     */
    public function ssioInsertionOrderCreate(string $adAccountId, SSIOCreateInsertionOrderRequest $sSIOCreateInsertionOrderRequest, int &$responseCode, array &$responseHeaders): array|object|null
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
 **sSIOCreateInsertionOrderRequest** | [**OpenAPI\Server\Model\SSIOCreateInsertionOrderRequest**](../Model/SSIOCreateInsertionOrderRequest.md)| Order line to create. |

### Return type

[**OpenAPI\Server\Model\SSIOCreateInsertionOrderResponse**](../Model/SSIOCreateInsertionOrderResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **ssioInsertionOrderEdit**
> OpenAPI\Server\Model\SSIOEditInsertionOrderResponse ssioInsertionOrderEdit($adAccountId, $sSIOEditInsertionOrderRequest)

Edit insertion order through SSIO.

Edit insertion order through SSIO for <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BillingApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BillingApiInterface;

class BillingApi implements BillingApiInterface
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
     * Implementation of BillingApiInterface#ssioInsertionOrderEdit
     */
    public function ssioInsertionOrderEdit(string $adAccountId, SSIOEditInsertionOrderRequest $sSIOEditInsertionOrderRequest, int &$responseCode, array &$responseHeaders): array|object|null
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
 **sSIOEditInsertionOrderRequest** | [**OpenAPI\Server\Model\SSIOEditInsertionOrderRequest**](../Model/SSIOEditInsertionOrderRequest.md)| Order line to create. |

### Return type

[**OpenAPI\Server\Model\SSIOEditInsertionOrderResponse**](../Model/SSIOEditInsertionOrderResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **ssioInsertionOrdersStatusGetByAdAccount**
> OpenAPI\Server\Model\SsioInsertionOrdersStatusGetByAdAccount200Response ssioInsertionOrdersStatusGetByAdAccount($adAccountId, $bookmark, $pageSize)

Get insertion order status by ad account id.

Get insertion order status for account id <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BillingApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BillingApiInterface;

class BillingApi implements BillingApiInterface
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
     * Implementation of BillingApiInterface#ssioInsertionOrdersStatusGetByAdAccount
     */
    public function ssioInsertionOrdersStatusGetByAdAccount(string $adAccountId, ?string $bookmark, int $pageSize, int &$responseCode, array &$responseHeaders): array|object|null
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
 **pageSize** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**OpenAPI\Server\Model\SsioInsertionOrdersStatusGetByAdAccount200Response**](../Model/SsioInsertionOrdersStatusGetByAdAccount200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **ssioInsertionOrdersStatusGetByPinOrderId**
> OpenAPI\Server\Model\SSIOInsertionOrderStatusResponse ssioInsertionOrdersStatusGetByPinOrderId($adAccountId, $pinOrderId)

Get insertion order status by pin order id.

Get insertion order status for pin order id <code>pin_order_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BillingApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BillingApiInterface;

class BillingApi implements BillingApiInterface
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
     * Implementation of BillingApiInterface#ssioInsertionOrdersStatusGetByPinOrderId
     */
    public function ssioInsertionOrdersStatusGetByPinOrderId(string $adAccountId, string $pinOrderId, int &$responseCode, array &$responseHeaders): array|object|null
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
 **pinOrderId** | **string**| The pin order id associated with the ssio insertion order |

### Return type

[**OpenAPI\Server\Model\SSIOInsertionOrderStatusResponse**](../Model/SSIOInsertionOrderStatusResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **ssioOrderLinesGetByAdAccount**
> OpenAPI\Server\Model\SsioOrderLinesGetByAdAccount200Response ssioOrderLinesGetByAdAccount($adAccountId, $bookmark, $pageSize, $pinOrderId)

Get Salesforce order lines by ad account id.

Get Salesforce order lines for account id <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BillingApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BillingApiInterface;

class BillingApi implements BillingApiInterface
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
     * Implementation of BillingApiInterface#ssioOrderLinesGetByAdAccount
     */
    public function ssioOrderLinesGetByAdAccount(string $adAccountId, ?string $bookmark, int $pageSize, ?string $pinOrderId, int &$responseCode, array &$responseHeaders): array|object|null
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
 **pageSize** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **pinOrderId** | **string**| The pin order id associated with the ssio insertino order | [optional]

### Return type

[**OpenAPI\Server\Model\SsioOrderLinesGetByAdAccount200Response**](../Model/SsioOrderLinesGetByAdAccount200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

