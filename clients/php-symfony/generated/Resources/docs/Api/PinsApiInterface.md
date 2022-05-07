# OpenAPI\Server\Api\PinsApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pinsAnalytics**](PinsApiInterface.md#pinsAnalytics) | **GET** /pins/{pin_id}/analytics | Get Pin analytics
[**pinsCreate**](PinsApiInterface.md#pinsCreate) | **POST** /pins | Create Pin
[**pinsDelete**](PinsApiInterface.md#pinsDelete) | **DELETE** /pins/{pin_id} | Delete Pin
[**pinsGet**](PinsApiInterface.md#pinsGet) | **GET** /pins/{pin_id} | Get Pin


## Service Declaration
```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.pins:
        class: Acme\MyBundle\Api\PinsApi
        tags:
            - { name: "open_api_server.api", api: "pins" }
    # ...
```

## **pinsAnalytics**
> OpenAPI\Server\Model\AnalyticsMetricsResponse pinsAnalytics($pinId, $startDate, $endDate, $metricTypes, $appTypes, $splitField, $adAccountId)

Get Pin analytics

Get analytics for a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"https://developers.pinterest.com/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PinsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PinsApiInterface;

class PinsApi implements PinsApiInterface
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
     * Implementation of PinsApiInterface#pinsAnalytics
     */
    public function pinsAnalytics($pinId, \DateTime $startDate, \DateTime $endDate, array $metricTypes, $appTypes = ''ALL'', $splitField = ''NO_SPLIT'', $adAccountId = null)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinId** | **string**| Unique identifier of a Pin. |
 **startDate** | **\DateTime**| Metric report start date (UTC). Format: YYYY-MM-DD |
 **endDate** | **\DateTime**| Metric report end date (UTC). Format: YYYY-MM-DD |
 **metricTypes** | [**string**](../Model/string.md)| Pin metric types to get data for, default is all. |
 **appTypes** | **string**| Apps or devices to get data for, default is all. | [optional] [default to &#39;ALL&#39;]
 **splitField** | **string**| How to split the data into groups. Not including this param means data won&#39;t be split. | [optional] [default to &#39;NO_SPLIT&#39;]
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]

### Return type

[**OpenAPI\Server\Model\AnalyticsMetricsResponse**](../Model/AnalyticsMetricsResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **pinsCreate**
> OpenAPI\Server\Model\Pin pinsCreate($pin)

Create Pin

Create a Pin on a board or board section owned by the \"operation user_account\".  Note: If the current \"operation user_account\" (defined by the access token) has access to another user's Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account's permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called 'curated content', please use our <a href='/docs/add-ons/save-button'>Save button</a> instead. For more tips on creating fresh content for Pinterest, review our <a href='/docs/solutions/content-apps'>Content App Solutions Guide</a>.  <strong><a href='/docs/solutions/content-apps/#creatingvideopins'>Learn more</a></strong> about video Pin creation.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PinsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PinsApiInterface;

class PinsApi implements PinsApiInterface
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
     * Implementation of PinsApiInterface#pinsCreate
     */
    public function pinsCreate(Pin $pin)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pin** | [**OpenAPI\Server\Model\Pin**](../Model/Pin.md)| Create a new Pin. |

### Return type

[**OpenAPI\Server\Model\Pin**](../Model/Pin.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **pinsDelete**
> pinsDelete($pinId)

Delete Pin

Delete a Pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PinsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PinsApiInterface;

class PinsApi implements PinsApiInterface
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
     * Implementation of PinsApiInterface#pinsDelete
     */
    public function pinsDelete($pinId)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinId** | **string**| Unique identifier of a Pin. |

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **pinsGet**
> OpenAPI\Server\Model\Pin pinsGet($pinId, $adAccountId)

Get Pin

Get a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PinsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PinsApiInterface;

class PinsApi implements PinsApiInterface
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
     * Implementation of PinsApiInterface#pinsGet
     */
    public function pinsGet($pinId, $adAccountId = null)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinId** | **string**| Unique identifier of a Pin. |
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]

### Return type

[**OpenAPI\Server\Model\Pin**](../Model/Pin.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

