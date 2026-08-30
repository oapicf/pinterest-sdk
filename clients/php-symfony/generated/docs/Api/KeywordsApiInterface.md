# OpenAPI\Server\Api\KeywordsApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**countryKeywordsMetricsGet**](KeywordsApiInterface.md#countryKeywordsMetricsGet) | **GET** /ad_accounts/{ad_account_id}/keywords/metrics | Get country&#39;s keyword metrics
[**keywordsCreate**](KeywordsApiInterface.md#keywordsCreate) | **POST** /ad_accounts/{ad_account_id}/keywords | Create keywords
[**keywordsGet**](KeywordsApiInterface.md#keywordsGet) | **GET** /ad_accounts/{ad_account_id}/keywords | Get keywords
[**keywordsUpdate**](KeywordsApiInterface.md#keywordsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/keywords | Update keywords
[**trendingKeywordsList**](KeywordsApiInterface.md#trendingKeywordsList) | **GET** /trends/keywords/{region}/top/{trend_type} | List trending keywords


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\KeywordsApi:
        tags:
            - { name: "open_api_server.api", api: "keywords" }
    # ...
```

## **countryKeywordsMetricsGet**
> OpenAPI\Server\Model\KeywordsMetricsArrayResponse countryKeywordsMetricsGet($adAccountId, $countryCode, $keywords)

Get country's keyword metrics

See keyword metrics for a specified country, aggregated across all of Pinterest.   (Definitions are available from the \"Get delivery metrics definitions\"   [API endpoint](/docs/api/v5/#operation/delivery_metrics/get)).

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/KeywordsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\KeywordsApiInterface;

class KeywordsApi implements KeywordsApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: pinterest_oauth2
     */
    public function setpinterest_oauth2($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    /**
     * Configure OAuth2 access token for authorization: client_credentials
     */
    public function setclient_credentials($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of KeywordsApiInterface#countryKeywordsMetricsGet
     */
    public function countryKeywordsMetricsGet(string $adAccountId, string $countryCode, array $keywords, int &$responseCode, array &$responseHeaders): array|object|null
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
 **countryCode** | **string**| Two letter country code (ISO 3166-1 alpha-2) |
 **keywords** | [**string**](../Model/string.md)| Comma-separated keywords |

### Return type

[**OpenAPI\Server\Model\KeywordsMetricsArrayResponse**](../Model/KeywordsMetricsArrayResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **keywordsCreate**
> OpenAPI\Server\Model\Keywords keywordsCreate($adAccountId, $keywordsCreate)

Create keywords

Create keywords for the following entity types (advertiser, campaign, ad group, or ad). For more information, see [Keyword targeting](https://help.pinterest.com/en/business/article/keyword-targeting).    **Notes:**   - Advertisers and campaigns can only be assigned keywords with excluding (`_NEGATIVE`).   - All keyword match types are available for ad groups.    For more information on match types, see [match type enums](/docs/api-features/targeting-overview/).    **Returns:**   - A successful call returns an object containing an array of new keyword objects and an empty `errors` object array.   - An unsuccessful call returns an empty keywords array, and instead, inserts the entire object with nulled/negated properties into the `errors` object array:     ```json     {       \"keywords\": [],       \"errors\": [         {           \"data\": {             \"archived\": null,             \"match_type\": \"EXACT\",             \"parent_type\": null,             \"value\": \"foobar\",             \"parent_id\": null,             \"type\": \"keyword\",             \"id\": null           },           \"error_messages\": [             \"Advertisers and Campaigns only accept excluded targeting attributes.\"           ]         }       ]     }

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/KeywordsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\KeywordsApiInterface;

class KeywordsApi implements KeywordsApiInterface
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
     * Implementation of KeywordsApiInterface#keywordsCreate
     */
    public function keywordsCreate(string $adAccountId, KeywordsCreate $keywordsCreate, int &$responseCode, array &$responseHeaders): array|object|null
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
 **keywordsCreate** | [**OpenAPI\Server\Model\KeywordsCreate**](../Model/KeywordsCreate.md)|  |

### Return type

[**OpenAPI\Server\Model\Keywords**](../Model/Keywords.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **keywordsGet**
> OpenAPI\Server\Model\KeywordsGet200Response keywordsGet($adAccountId, $campaignId, $adGroupId, $adGroupIds, $matchTypes, $bookmark, $pageSize)

Get keywords

Get a list of keywords based on the filters provided. If no filter is provided, it will default to the `ad_account_id` filter, which means it will only return keywords that specifically have `parent_id` set to the `ad_account_id`. Note: Keywords can have `ad_account_ids`, `campaign_ids`, and `ad_group_ids` set as their `parent_ids`. Keywords created through Ads Manager will have their `parent_id` set to an `ad_group_id`, not `ad_account_id`.      For more information, see [Keyword targeting](https://help.pinterest.com/en/business/article/keyword-targeting).      **Notes:**     - Advertisers and campaigns can only be assigned keywords with excluding (`_NEGATIVE`).     - All keyword match types are available for ad groups.      For more information on match types, see [match type enums](/docs/api-features/targeting-overview/).      **Returns:**     - A successful call returns an object containing an array of new keyword objects and an empty `errors` object array.     - An unsuccessful call returns an empty keywords array, and instead, inserts the entire object with nulled/negated properties into the `errors` object array:       ```json       {         \"keywords\": [],         \"errors\": [           {             \"data\": {               \"archived\": null,               \"match_type\": \"EXACT\",               \"parent_type\": null,               \"value\": \"foobar\",               \"parent_id\": null,               \"type\": \"keyword\",               \"id\": null             },             \"error_messages\": [               \"Advertisers and Campaigns only accept excluded targeting attributes.\"             ]           }         ]       }

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/KeywordsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\KeywordsApiInterface;

class KeywordsApi implements KeywordsApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: pinterest_oauth2
     */
    public function setpinterest_oauth2($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    /**
     * Configure OAuth2 access token for authorization: client_credentials
     */
    public function setclient_credentials($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of KeywordsApiInterface#keywordsGet
     */
    public function keywordsGet(string $adAccountId, ?string $campaignId, ?string $adGroupId, ?array $adGroupIds, ?array $matchTypes, ?string $bookmark, int $pageSize, int &$responseCode, array &$responseHeaders): array|object|null
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
 **campaignId** | **string**| Campaign Id to use to filter the results. | [optional]
 **adGroupId** | **string**| Ad group Id. | [optional]
 **adGroupIds** | [**string**](../Model/string.md)| List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users. | [optional]
 **matchTypes** | [**OpenAPI\Server\Model\MatchType**](../Model/OpenAPI\Server\Model\MatchType.md)| Keyword [match type](/docs/api-features/targeting-overview/) | [optional]
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**OpenAPI\Server\Model\KeywordsGet200Response**](../Model/KeywordsGet200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **keywordsUpdate**
> OpenAPI\Server\Model\Keywords keywordsUpdate($adAccountId, $keywordsUpdate)

Update keywords

Update one or more keywords' bid and archived fields. Archiving   a keyword effectively deletes it - keywords no longer receive metrics and   are no longer visible within the parent entity's keywords list.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/KeywordsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\KeywordsApiInterface;

class KeywordsApi implements KeywordsApiInterface
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
     * Implementation of KeywordsApiInterface#keywordsUpdate
     */
    public function keywordsUpdate(string $adAccountId, KeywordsUpdate $keywordsUpdate, int &$responseCode, array &$responseHeaders): array|object|null
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
 **keywordsUpdate** | [**OpenAPI\Server\Model\KeywordsUpdate**](../Model/KeywordsUpdate.md)|  |

### Return type

[**OpenAPI\Server\Model\Keywords**](../Model/Keywords.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **trendingKeywordsList**
> OpenAPI\Server\Model\TrendingKeywordsResponse trendingKeywordsList($region, $trendType, $interests, $genders, $ages, $includeKeywords, $normalizeAgainstGroup, $limit, $includeDemographics)

List trending keywords

Get the top trending search keywords among the Pinterest user audience.  Trending keywords can be used to inform ad targeting, budget strategy, and creative decisions about which products and Pins will resonate with your audience.  Geographic, demographic and interest-based filters are available to narrow down to the top trends among a specific audience. Multiple trend types are supported that can be used to identify newly-popular, evergreen or seasonal keywords.  For an interactive way to explore this data, please visit [trends.pinterest.com](https://trends.pinterest.com).

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/KeywordsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\KeywordsApiInterface;

class KeywordsApi implements KeywordsApiInterface
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
     * Implementation of KeywordsApiInterface#trendingKeywordsList
     */
    public function trendingKeywordsList(TrendsSupportedRegion $region, TrendType $trendType, ?array $interests, ?array $genders, ?array $ages, ?array $includeKeywords, bool $normalizeAgainstGroup, int $limit, bool $includeDemographics, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **region** | [**TrendsSupportedRegion**](../Model/.md)| The geographic region of interest. Only top trends within the specified region will be returned.    The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;, corresponding to the following geographic areas:   - &#x60;US&#x60; - United States   - &#x60;CA&#x60; - Canada   - &#x60;DE&#x60; - Germany   - &#x60;FR&#x60; - France   - &#x60;ES&#x60; - Spain   - &#x60;IT&#x60; - Italy   - &#x60;DE+AT+CH&#x60; - Germanic countries   - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland   - &#x60;IT+ES+PT+GR+MT&#x60; - Southern Europe   - &#x60;PL+RO+HU+SK+CZ&#x60; - Eastern Europe   - &#x60;SE+DK+FI+NO&#x60; - Nordic countries   - &#x60;NL+BE+LU&#x60; - Benelux   - &#x60;AR&#x60; - Argentina   - &#x60;BR&#x60; - Brazil   - &#x60;CO&#x60; - Colombia   - &#x60;MX&#x60; - Mexico   - &#x60;MX+AR+CO+CL&#x60; - Hispanic LatAm   - &#x60;AU+NZ&#x60; - Australasia |
 **trendType** | [**TrendType**](../Model/.md)| The methodology used to rank how trendy a keyword is.   - &#x60;growing&#x60; trends have high upward growth in search volume over the last quarter   - &#x60;monthly&#x60; trends have high search volume in the last month   - &#x60;yearly&#x60; trends have high search volume in the last year   - &#x60;seasonal&#x60; trends have high upward growth in search volume over the last month and exhibit a seasonal recurring pattern (typically annual) |
 **interests** | [**OpenAPI\Server\Model\TrendsL1Interest**](../Model/OpenAPI\Server\Model\TrendsL1Interest.md)| The list of supported interests is:   - &#x60;animals&#x60; - Animals   - &#x60;architecture&#x60; - Architecture   - &#x60;art&#x60; - Art   - &#x60;beauty&#x60; - Beauty   - &#x60;childrens_fashion&#x60; - Children&#39;s Fashion   - &#x60;design&#x60; - Design   - &#x60;diy_and_crafts&#x60; - DIY &amp; Crafts   - &#x60;education&#x60; - Education   - &#x60;electronics&#x60; - Electronics   - &#x60;entertainment&#x60; - Entertainment   - &#x60;event_planning&#x60; - Event Planning   - &#x60;finance&#x60; - Finance   - &#x60;food_and_drinks&#x60; - Food &amp; Drink   - &#x60;gardening&#x60; - Gardening   - &#x60;health&#x60; - Health   - &#x60;home_decor&#x60; - Home Decor   - &#x60;mens_fashion&#x60; - Men&#39;s Fashion   - &#x60;parenting&#x60; - Parenting   - &#x60;quotes&#x60; - Quotes   - &#x60;sport&#x60; - Sports   - &#x60;travel&#x60; - Travel   - &#x60;vehicles&#x60; - Vehicles   - &#x60;wedding&#x60; - Wedding   - &#x60;womens_fashion&#x60; - Women&#39;s Fashion | [optional]
 **genders** | [**OpenAPI\Server\Model\TrendsGenderFilter**](../Model/OpenAPI\Server\Model\TrendsGenderFilter.md)| If set, filters the results to trends among users who identify with the specified gender(s). If unset, trends among all genders will be returned. The &#x60;unknown&#x60; group includes users with unspecified or customized gender profile settings. | [optional]
 **ages** | [**OpenAPI\Server\Model\TrendsAgeBucket**](../Model/OpenAPI\Server\Model\TrendsAgeBucket.md)| If set, filters the results to trends among users in the specified age range(s). If unset, trends among all age groups will be returned. | [optional]
 **includeKeywords** | [**string**](../Model/string.md)| If set, filters the results to top trends which include at least one of the specified keywords. If unset, no keyword filtering logic is applied. | [optional]
 **normalizeAgainstGroup** | **bool**| Governs how the resulting time series data will be normalized to a [0-100] scale.    By default (&#x60;false&#x60;), the data will be normalized independently for each keyword.  The peak search volume observation in *each* keyword&#39;s time series will be represented by the value 100.  This is ideal for analyzing when an individual keyword is expected to peak in interest.    If set to &#x60;true&#x60;, the data will be normalized as a group.  The peak search volume observation across *all* keywords in the response will be represented by the value 100, and all other values scaled accordingly.  Use this option when you wish to compare relative search volume between multiple keywords. | [optional] [default to false]
 **limit** | **int**| The maximum number of trending keywords that will be returned. Keywords are returned in trend-ranked order, so a &#x60;limit&#x60; of 50 will return the top 50 trends. | [optional] [default to 50]
 **includeDemographics** | **bool**| Including the age and gender distribution for each keyword. By default (&#x60;false&#x60;), the response will not include demographics data. | [optional] [default to false]

### Return type

[**OpenAPI\Server\Model\TrendingKeywordsResponse**](../Model/TrendingKeywordsResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

