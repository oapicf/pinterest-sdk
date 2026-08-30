# OpenAPI\Server\Api\ConversionEventsApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**eventsCreate**](ConversionEventsApiInterface.md#eventsCreate) | **POST** /ad_accounts/{ad_account_id}/events | Send conversions


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\ConversionEventsApi:
        tags:
            - { name: "open_api_server.api", api: "conversionEvents" }
    # ...
```

## **eventsCreate**
> OpenAPI\Server\Model\ConversionEvents eventsCreate($adAccountId, $conversionEventsCreate, $test)

Send conversions

The Pinterest API offers advertisers a way to send Pinterest their conversion information (including web conversions, in-app conversions, or even offline conversions) based on their `ad_account_id`. The request body should be a JSON object. - This endpoint requires an `access_token` be generated through Ads Manager. Review the [Conversions Guide](/docs/api-features/conversion-overview/) for more details. (Note that the authorization header required is `Authorization: Bearer <access_token>`). - The token's `user_account` must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Audience, Campaign. (Note that the token can be used across multiple ad accounts under an user ID.) - This endpoint has a rate limit of 5,000 calls per minute per ad account. - If the merchant is submitting this information using both Pinterest conversion tags and the Pinterest API, Pinterest will remove duplicate information before reporting. (Note that events that took place offline cannot be deduplicated.)

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ConversionEventsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ConversionEventsApiInterface;

class ConversionEventsApi implements ConversionEventsApiInterface
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
     * Implementation of ConversionEventsApiInterface#eventsCreate
     */
    public function eventsCreate(string $adAccountId, ConversionEventsCreate $conversionEventsCreate, ?bool $test, int &$responseCode, array &$responseHeaders): array|object|null
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
 **conversionEventsCreate** | [**OpenAPI\Server\Model\ConversionEventsCreate**](../Model/ConversionEventsCreate.md)|  |
 **test** | **bool**| Include query param ?test&#x3D;true to mark the request as a test request. The events will not be recorded but the API will still return the same response messages. Use this mode to verify your requests are working and your events are constructed correctly. Warning: If you use this query parameter, be certain that it is off (set to false or deleted) before sending a legitimate (non-testing) request. | [optional]

### Return type

[**OpenAPI\Server\Model\ConversionEvents**](../Model/ConversionEvents.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [conversion_token](../../README.md#conversion_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

