# OpenAPI\Server\Api\BillingApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adsCreditRedeem**](BillingApiInterface.md#adsCreditRedeem) | **POST** /ad_accounts/{ad_account_id}/ads_credit/redeem | Redeem ad credits
[**adsCreditsDiscountsGet**](BillingApiInterface.md#adsCreditsDiscountsGet) | **GET** /ad_accounts/{ad_account_id}/ads_credit/discounts | Get ads credit discounts
[**billingInvoiceDownloadGet**](BillingApiInterface.md#billingInvoiceDownloadGet) | **GET** /ad_accounts/{ad_account_id}/billing_invoice/{billing_invoice_id}/download | Get download url for a billing invoice
[**billingInvoicesGet**](BillingApiInterface.md#billingInvoicesGet) | **GET** /ad_accounts/{ad_account_id}/billing_invoices | Get billing invoices
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
> OpenAPI\Server\Model\AdsCreditRedeem adsCreditRedeem($adAccountId, $adsCreditRedeemCreate)

Redeem ad credits

Redeem ads credit on behalf of the ad account id and apply it towards billing.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**

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
    public function adsCreditRedeem(string $adAccountId, AdsCreditRedeemCreate $adsCreditRedeemCreate, int &$responseCode, array &$responseHeaders): array|object|null
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
 **adsCreditRedeemCreate** | [**OpenAPI\Server\Model\AdsCreditRedeemCreate**](../Model/AdsCreditRedeemCreate.md)|  |

### Return type

[**OpenAPI\Server\Model\AdsCreditRedeem**](../Model/AdsCreditRedeem.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **adsCreditsDiscountsGet**
> OpenAPI\Server\Model\AdsCreditsDiscountsGet200Response adsCreditsDiscountsGet($adAccountId, $bookmark, $pageSize)

Get ads credit discounts

Returns the list of discounts applied to the account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**

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
 **pageSize** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**OpenAPI\Server\Model\AdsCreditsDiscountsGet200Response**](../Model/AdsCreditsDiscountsGet200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **billingInvoiceDownloadGet**
> OpenAPI\Server\Model\BillingInvoiceDownloadResponse billingInvoiceDownloadGet($adAccountId, $billingInvoiceId)

Get download url for a billing invoice

Get download url for a billing invoice.

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
     * Implementation of BillingApiInterface#billingInvoiceDownloadGet
     */
    public function billingInvoiceDownloadGet(string $adAccountId, string $billingInvoiceId, int &$responseCode, array &$responseHeaders): array|object|null
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
 **billingInvoiceId** | **string**| Unique identifier of a billing invoice. |

### Return type

[**OpenAPI\Server\Model\BillingInvoiceDownloadResponse**](../Model/BillingInvoiceDownloadResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **billingInvoicesGet**
> OpenAPI\Server\Model\BillingInvoicesGet200Response billingInvoicesGet($adAccountId, $bookmark, $pageSize, $order, $sort, $status, $documentType, $startDueDate, $endDueDate)

Get billing invoices

Get billing invoices in the advertiser account.

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
     * Implementation of BillingApiInterface#billingInvoicesGet
     */
    public function billingInvoicesGet(string $adAccountId, ?string $bookmark, int $pageSize, ?PinterestLibPaginationOrder $order, ?BillingInvoiceSortField $sort, ?BillingInvoiceStatus $status, ?BillingInvoiceDocumentType $documentType, ?\DateTime $startDueDate, ?\DateTime $endDueDate, int &$responseCode, array &$responseHeaders): array|object|null
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
 **sort** | [**BillingInvoiceSortField**](../Model/.md)| Field of which to sort billing invoices | [optional]
 **status** | [**BillingInvoiceStatus**](../Model/.md)| Status of billing invoices to filter by | [optional]
 **documentType** | [**BillingInvoiceDocumentType**](../Model/.md)| Document type of billing invoices to filter by | [optional]
 **startDueDate** | **\DateTime**| Starting point for due dates when searching for invoices. Format: YYYY-MM-DD | [optional]
 **endDueDate** | **\DateTime**| Ending point for due dates when searching for invoices. Format: YYYY-MM-DD | [optional]

### Return type

[**OpenAPI\Server\Model\BillingInvoicesGet200Response**](../Model/BillingInvoicesGet200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **billingProfilesGet**
> OpenAPI\Server\Model\BillingProfilesGet200Response billingProfilesGet($isActive, $adAccountId, $bookmark, $pageSize)

Get billing profiles

Get billing profiles in the advertiser account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**

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
    public function billingProfilesGet(bool $isActive, string $adAccountId, ?string $bookmark, int $pageSize, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **isActive** | **bool**| Return active billing profiles, if false return all billing profiles. |
 **adAccountId** | **string**| Unique identifier of an ad account. |
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**OpenAPI\Server\Model\BillingProfilesGet200Response**](../Model/BillingProfilesGet200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **ssioAccountsGet**
> OpenAPI\Server\Model\SSIOAccount ssioAccountsGet($adAccountId)

Get Salesforce account details including bill-to information.

Get Salesforce account details including bill-to information to be used in insertion orders process for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

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

[**OpenAPI\Server\Model\SSIOAccount**](../Model/SSIOAccount.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **ssioInsertionOrderCreate**
> OpenAPI\Server\Model\SSIOInsertionOrder ssioInsertionOrderCreate($adAccountId, $sSIOInsertionOrderCreate)

Create insertion order through SSIO.

Create insertion order through SSIO for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

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
    public function ssioInsertionOrderCreate(string $adAccountId, SSIOInsertionOrderCreate $sSIOInsertionOrderCreate, int &$responseCode, array &$responseHeaders): array|object|null
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
 **sSIOInsertionOrderCreate** | [**OpenAPI\Server\Model\SSIOInsertionOrderCreate**](../Model/SSIOInsertionOrderCreate.md)|  |

### Return type

[**OpenAPI\Server\Model\SSIOInsertionOrder**](../Model/SSIOInsertionOrder.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **ssioInsertionOrderEdit**
> OpenAPI\Server\Model\SSIOInsertionOrder ssioInsertionOrderEdit($adAccountId, $sSIOInsertionOrderUpdate)

Edit insertion order through SSIO.

Edit insertion order through SSIO for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

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
    public function ssioInsertionOrderEdit(string $adAccountId, SSIOInsertionOrderUpdate $sSIOInsertionOrderUpdate, int &$responseCode, array &$responseHeaders): array|object|null
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
 **sSIOInsertionOrderUpdate** | [**OpenAPI\Server\Model\SSIOInsertionOrderUpdate**](../Model/SSIOInsertionOrderUpdate.md)|  |

### Return type

[**OpenAPI\Server\Model\SSIOInsertionOrder**](../Model/SSIOInsertionOrder.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **ssioInsertionOrdersStatusGetByAdAccount**
> OpenAPI\Server\Model\SsioInsertionOrdersStatusGetByAdAccount200Response ssioInsertionOrdersStatusGetByAdAccount($adAccountId, $bookmark, $pageSize)

Get insertion order status by ad account id.

Get insertion order status for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

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
 **pageSize** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

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

Get insertion order status for `pin_order_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

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
> OpenAPI\Server\Model\SsioOrderLinesGetByAdAccount200Response ssioOrderLinesGetByAdAccount($adAccountId, $pinOrderId, $bookmark, $pageSize)

Get Salesforce order lines by ad account id.

Get Salesforce order lines for account id `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

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
    public function ssioOrderLinesGetByAdAccount(string $adAccountId, ?string $pinOrderId, ?string $bookmark, int $pageSize, int &$responseCode, array &$responseHeaders): array|object|null
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
 **pinOrderId** | **string**| The pin order id associated with the SSIO insertion order | [optional]
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**OpenAPI\Server\Model\SsioOrderLinesGetByAdAccount200Response**](../Model/SsioOrderLinesGetByAdAccount200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

