# php-base - PHP Slim Server library for Pinterest REST API

* [OpenAPI Generator](https://openapi-generator.tech)
* [Slim Framework Documentation](https://www.slimframework.com/docs/)

## Requirements

* Web server with URL rewriting
* PHP 7.0 or newer

This package contains `.htaccess` for Apache configuration.
If you use another server(Nginx, HHVM, IIS, lighttpd) check out [Web Servers](https://www.slimframework.com/docs/v3/start/web-servers.html) doc.

## Installation via [Composer](https://getcomposer.org/)

Navigate into your project's root directory and execute the bash command shown below.
This command downloads the Slim Framework and its third-party dependencies into your project's `vendor/` directory.
```bash
$ composer install
```

## Start devserver

Run the following command in terminal to start localhost web server, assuming `./php-slim-server/` is public-accessible directory with `index.php` file:
```bash
$ php -S localhost:8888 -t php-slim-server
```
> **Warning** This web server was designed to aid application development.
> It may also be useful for testing purposes or for application demonstrations that are run in controlled environments.
> It is not intended to be a full-featured web server. It should not be used on a public network.

## Tests

### PHPUnit

This package uses PHPUnit 6 or 7(depends from your PHP version) for unit testing.
[Test folder](test) contains templates which you can fill with real test assertions.
How to write tests read at [PHPUnit Manual - Chapter 2. Writing Tests for PHPUnit](https://phpunit.de/manual/6.5/en/writing-tests-for-phpunit.html).

#### Run

Command | Target
---- | ----
`$ composer test` | All tests
`$ composer test-apis` | Apis tests
`$ composer test-models` | Models tests

#### Config

Package contains fully functional config `./phpunit.xml.dist` file. Create `./phpunit.xml` in root folder to override it.

Quote from [3. The Command-Line Test Runner — PHPUnit 7.4 Manual](https://phpunit.readthedocs.io/en/7.4/textui.html#command-line-options):

> If phpunit.xml or phpunit.xml.dist (in that order) exist in the current working directory and --configuration is not used, the configuration will be automatically read from that file.

### PHP CodeSniffer

[PHP CodeSniffer Documentation](https://github.com/squizlabs/PHP_CodeSniffer/wiki). This tool helps to follow coding style and avoid common PHP coding mistakes.

#### Run

```bash
$ composer phpcs
```

#### Config

Package contains fully functional config `./phpcs.xml.dist` file. It checks source code against PSR-1 and PSR-2 coding standards.
Create `./phpcs.xml` in root folder to override it. More info at [Using a Default Configuration File](https://github.com/squizlabs/PHP_CodeSniffer/wiki/Advanced-Usage#using-a-default-configuration-file)

### PHPLint

[PHPLint Documentation](https://github.com/overtrue/phplint). Checks PHP syntax only.

#### Run

```bash
$ composer phplint
```

## Show errors

Switch on option in `./index.php`:
```diff
    /**
     * When true, additional information about exceptions are displayed by the default
     * error handler.
     * Default: false
     */
--- // 'displayErrorDetails' => false,
+++ 'displayErrorDetails' => true,
```

## API Endpoints

All URIs are relative to *https://api.pinterest.com/v5*

> Important! Do not modify abstract API controllers directly! Instead extend them by implementation classes like:

```php
// src/Api/PetApi.php

namespace OpenAPIServer\Api;

use OpenAPIServer\Api\AbstractPetApi;

class PetApi extends AbstractPetApi
{

    public function addPet($request, $response, $args)
    {
        // your implementation of addPet method here
    }
}
```

Place all your implementation classes in `./src` folder accordingly.
For instance, when abstract class located at `./lib/Api/AbstractPetApi.php` you need to create implementation class at `./src/Api/PetApi.php`.

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AbstractAdAccountsApi* | **adAccountsList** | **GET** /ad_accounts | List ad accounts
*AbstractAdAccountsApi* | **adAccountAnalytics** | **GET** /ad_accounts/{ad_account_id}/analytics | Get ad account analytics
*AbstractAdAccountsApi* | **adGroupsAnalytics** | **GET** /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics
*AbstractAdAccountsApi* | **adGroupsList** | **GET** /ad_accounts/{ad_account_id}/ad_groups | List ad groups
*AbstractAdAccountsApi* | **adsAnalytics** | **GET** /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics
*AbstractAdAccountsApi* | **adsList** | **GET** /ad_accounts/{ad_account_id}/ads | List ads
*AbstractAdAccountsApi* | **analyticsCreateReport** | **POST** /ad_accounts/{ad_account_id}/reports | Create async request for an account analytics report
*AbstractAdAccountsApi* | **analyticsGetReport** | **GET** /ad_accounts/{ad_account_id}/reports | Get the account analytics report created by the async call
*AbstractAdAccountsApi* | **campaignsAnalytics** | **GET** /ad_accounts/{ad_account_id}/campaigns/analytics | Get campaign analytics
*AbstractAdAccountsApi* | **campaignsList** | **GET** /ad_accounts/{ad_account_id}/campaigns | List campaigns
*AbstractAdAccountsApi* | **productGroupsAnalytics** | **GET** /ad_accounts/{ad_account_id}/product_groups/analytics | Get product group analytics
*AbstractBoardsApi* | **boardsCreate** | **POST** /boards | Create board
*AbstractBoardsApi* | **boardsList** | **GET** /boards | List boards
*AbstractBoardsApi* | **boardSectionsCreate** | **POST** /boards/{board_id}/sections | Create board section
*AbstractBoardsApi* | **boardSectionsDelete** | **DELETE** /boards/{board_id}/sections/{section_id} | Delete board section
*AbstractBoardsApi* | **boardSectionsList** | **GET** /boards/{board_id}/sections | List board sections
*AbstractBoardsApi* | **boardSectionsListPins** | **GET** /boards/{board_id}/sections/{section_id}/pins | List Pins on board section
*AbstractBoardsApi* | **boardSectionsUpdate** | **PATCH** /boards/{board_id}/sections/{section_id} | Update board section
*AbstractBoardsApi* | **boardsDelete** | **DELETE** /boards/{board_id} | Delete board
*AbstractBoardsApi* | **boardsGet** | **GET** /boards/{board_id} | Get board
*AbstractBoardsApi* | **boardsListPins** | **GET** /boards/{board_id}/pins | List Pins on board
*AbstractBoardsApi* | **boardsUpdate** | **PATCH** /boards/{board_id} | Update board
*AbstractCatalogsApi* | **catalogsProductGroupsCreate** | **POST** /catalogs/product_groups | Create product group
*AbstractCatalogsApi* | **catalogsProductGroupsList** | **GET** /catalogs/product_groups | Get product groups list
*AbstractCatalogsApi* | **feedsCreate** | **POST** /catalogs/feeds | Create feed
*AbstractCatalogsApi* | **feedsList** | **GET** /catalogs/feeds | List feeds
*AbstractCatalogsApi* | **itemsBatchPost** | **POST** /catalogs/items/batch | Perform an operation on an item batch
*AbstractCatalogsApi* | **itemsGet** | **GET** /catalogs/items | Get catalogs items
*AbstractCatalogsApi* | **catalogsProductGroupsDelete** | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group
*AbstractCatalogsApi* | **catalogsProductGroupsUpdate** | **PATCH** /catalogs/product_groups/{product_group_id} | Update product group
*AbstractCatalogsApi* | **feedProcessingResultsList** | **GET** /catalogs/feeds/{feed_id}/processing_results | List processing results for a given feed
*AbstractCatalogsApi* | **feedsDelete** | **DELETE** /catalogs/feeds/{feed_id} | Delete feed
*AbstractCatalogsApi* | **feedsGet** | **GET** /catalogs/feeds/{feed_id} | Get feed
*AbstractCatalogsApi* | **feedsUpdate** | **PATCH** /catalogs/feeds/{feed_id} | Update feed
*AbstractCatalogsApi* | **itemsBatchGet** | **GET** /catalogs/items/batch/{batch_id} | Get catalogs items batch
*AbstractMediaApi* | **mediaCreate** | **POST** /media | Register media upload
*AbstractMediaApi* | **mediaList** | **GET** /media | List media uploads
*AbstractMediaApi* | **mediaGet** | **GET** /media/{media_id} | Get media upload details
*AbstractOauthApi* | **oauthToken** | **POST** /oauth/token | Generate OAuth access token
*AbstractPinsApi* | **pinsCreate** | **POST** /pins | Create Pin
*AbstractPinsApi* | **pinsAnalytics** | **GET** /pins/{pin_id}/analytics | Get Pin analytics
*AbstractPinsApi* | **pinsDelete** | **DELETE** /pins/{pin_id} | Delete Pin
*AbstractPinsApi* | **pinsGet** | **GET** /pins/{pin_id} | Get Pin
*AbstractUserAccountApi* | **userAccountAnalytics** | **GET** /user_account/analytics | Get user account analytics
*AbstractUserAccountApi* | **userAccountGet** | **GET** /user_account | Get user account


## Models

* OpenAPIServer\Model\Account
* OpenAPIServer\Model\ActionType
* OpenAPIServer\Model\AdAccount
* OpenAPIServer\Model\AdAccountOwner
* OpenAPIServer\Model\AdGroupResponse
* OpenAPIServer\Model\AdGroupResponseAllOf
* OpenAPIServer\Model\AdGroupResponseAllOf1
* OpenAPIServer\Model\AdGroupSummaryStatus
* OpenAPIServer\Model\AdResponse
* OpenAPIServer\Model\AdResponseAllOf
* OpenAPIServer\Model\AdResponseAllOf1
* OpenAPIServer\Model\AdsAnalyticsCreateAsyncRequest
* OpenAPIServer\Model\AdsAnalyticsCreateAsyncRequestAllOf
* OpenAPIServer\Model\AdsAnalyticsCreateAsyncRequestAllOf1
* OpenAPIServer\Model\AdsAnalyticsCreateAsyncResponse
* OpenAPIServer\Model\AdsAnalyticsFilterColumn
* OpenAPIServer\Model\AdsAnalyticsFilterOperator
* OpenAPIServer\Model\AdsAnalyticsGetAsyncResponse
* OpenAPIServer\Model\AdsAnalyticsMetricsFilter
* OpenAPIServer\Model\AdsAnalyticsTargetingType
* OpenAPIServer\Model\AnalyticsMetricsResponse
* OpenAPIServer\Model\AnalyticsMetricsResponseDailyMetrics
* OpenAPIServer\Model\AvailabilityFilter
* OpenAPIServer\Model\BatchOperation
* OpenAPIServer\Model\BatchOperationStatus
* OpenAPIServer\Model\Board
* OpenAPIServer\Model\BoardOwner
* OpenAPIServer\Model\BoardSection
* OpenAPIServer\Model\BoardUpdate
* OpenAPIServer\Model\BrandFilter
* OpenAPIServer\Model\CampaignCommon
* OpenAPIServer\Model\CampaignResponse
* OpenAPIServer\Model\CampaignResponseAllOf
* OpenAPIServer\Model\CampaignResponseAllOf1
* OpenAPIServer\Model\CampaignSummaryStatus
* OpenAPIServer\Model\CatalogsDbItem
* OpenAPIServer\Model\CatalogsFeed
* OpenAPIServer\Model\CatalogsFeedCredentials
* OpenAPIServer\Model\CatalogsFeedIngestionDetails
* OpenAPIServer\Model\CatalogsFeedIngestionErrors
* OpenAPIServer\Model\CatalogsFeedIngestionInfo
* OpenAPIServer\Model\CatalogsFeedProcessingResult
* OpenAPIServer\Model\CatalogsFeedProcessingResultFields
* OpenAPIServer\Model\CatalogsFeedProcessingSchedule
* OpenAPIServer\Model\CatalogsFeedProcessingStatus
* OpenAPIServer\Model\CatalogsFeedProductCounts
* OpenAPIServer\Model\CatalogsFeedValidationDetails
* OpenAPIServer\Model\CatalogsFeedValidationErrors
* OpenAPIServer\Model\CatalogsFeedValidationWarnings
* OpenAPIServer\Model\CatalogsFeedsCreateRequest
* OpenAPIServer\Model\CatalogsFeedsUpdateRequest
* OpenAPIServer\Model\CatalogsFormat
* OpenAPIServer\Model\CatalogsItems
* OpenAPIServer\Model\CatalogsItemsBatch
* OpenAPIServer\Model\CatalogsItemsBatchRequest
* OpenAPIServer\Model\CatalogsProductGroup
* OpenAPIServer\Model\CatalogsProductGroupCreateRequest
* OpenAPIServer\Model\CatalogsProductGroupCurrencyCriteria
* OpenAPIServer\Model\CatalogsProductGroupFilterKeys
* OpenAPIServer\Model\CatalogsProductGroupFilters
* OpenAPIServer\Model\CatalogsProductGroupFiltersAllOf
* OpenAPIServer\Model\CatalogsProductGroupFiltersAnyOf
* OpenAPIServer\Model\CatalogsProductGroupMultipleStringCriteria
* OpenAPIServer\Model\CatalogsProductGroupMultipleStringListCriteria
* OpenAPIServer\Model\CatalogsProductGroupPricingCriteria
* OpenAPIServer\Model\CatalogsProductGroupStatus
* OpenAPIServer\Model\CatalogsProductGroupType
* OpenAPIServer\Model\CatalogsProductGroupUpdateRequest
* OpenAPIServer\Model\CatalogsStatus
* OpenAPIServer\Model\ConditionFilter
* OpenAPIServer\Model\ConversionAttributionWindowDays
* OpenAPIServer\Model\ConversionReportAttributionType
* OpenAPIServer\Model\ConversionReportTimeType
* OpenAPIServer\Model\Country
* OpenAPIServer\Model\Currency
* OpenAPIServer\Model\CurrencyFilter
* OpenAPIServer\Model\CustomLabel0Filter
* OpenAPIServer\Model\CustomLabel1Filter
* OpenAPIServer\Model\CustomLabel2Filter
* OpenAPIServer\Model\CustomLabel3Filter
* OpenAPIServer\Model\CustomLabel4Filter
* OpenAPIServer\Model\DataOutputFormat
* OpenAPIServer\Model\EntityStatus
* OpenAPIServer\Model\Error
* OpenAPIServer\Model\FeedFields
* OpenAPIServer\Model\GenderFilter
* OpenAPIServer\Model\GoogleProductCategory0Filter
* OpenAPIServer\Model\GoogleProductCategory1Filter
* OpenAPIServer\Model\GoogleProductCategory2Filter
* OpenAPIServer\Model\GoogleProductCategory3Filter
* OpenAPIServer\Model\GoogleProductCategory4Filter
* OpenAPIServer\Model\GoogleProductCategory5Filter
* OpenAPIServer\Model\GoogleProductCategory6Filter
* OpenAPIServer\Model\Granularity
* OpenAPIServer\Model\ImageDetails
* OpenAPIServer\Model\ItemAttributes
* OpenAPIServer\Model\ItemBatchRecord
* OpenAPIServer\Model\ItemGroupIdFilter
* OpenAPIServer\Model\ItemIdFilter
* OpenAPIServer\Model\ItemProcessingRecord
* OpenAPIServer\Model\ItemProcessingStatus
* OpenAPIServer\Model\ItemValidationEvent
* OpenAPIServer\Model\Language
* OpenAPIServer\Model\MaxPriceFilter
* OpenAPIServer\Model\MediaUpload
* OpenAPIServer\Model\MediaUploadAllOf
* OpenAPIServer\Model\MediaUploadAllOfUploadParameters
* OpenAPIServer\Model\MediaUploadDetails
* OpenAPIServer\Model\MediaUploadRequest
* OpenAPIServer\Model\MediaUploadStatus
* OpenAPIServer\Model\MediaUploadType
* OpenAPIServer\Model\MetricsReportingLevel
* OpenAPIServer\Model\MinPriceFilter
* OpenAPIServer\Model\NonNullableCatalogsCurrency
* OpenAPIServer\Model\NullableCurrency
* OpenAPIServer\Model\OauthAccessTokenRequest
* OpenAPIServer\Model\OauthAccessTokenRequestCode
* OpenAPIServer\Model\OauthAccessTokenRequestCodeAllOf
* OpenAPIServer\Model\OauthAccessTokenRequestRefresh
* OpenAPIServer\Model\OauthAccessTokenRequestRefreshAllOf
* OpenAPIServer\Model\OauthAccessTokenResponse
* OpenAPIServer\Model\OauthAccessTokenResponseCode
* OpenAPIServer\Model\OauthAccessTokenResponseCodeAllOf
* OpenAPIServer\Model\OauthAccessTokenResponseRefresh
* OpenAPIServer\Model\ObjectiveType
* OpenAPIServer\Model\PacingDeliveryType
* OpenAPIServer\Model\Paginated
* OpenAPIServer\Model\Pin
* OpenAPIServer\Model\PinMedia
* OpenAPIServer\Model\PinMediaSource
* OpenAPIServer\Model\PinMediaSourceImageBase64
* OpenAPIServer\Model\PinMediaSourceImageURL
* OpenAPIServer\Model\PinMediaSourceVideoID
* OpenAPIServer\Model\PinMediaWithImage
* OpenAPIServer\Model\PinMediaWithImageAllOf
* OpenAPIServer\Model\PinPromotionSummaryStatus
* OpenAPIServer\Model\PlacementGroupType
* OpenAPIServer\Model\ProductAvailabilityType
* OpenAPIServer\Model\ProductGroupSummaryStatus
* OpenAPIServer\Model\ProductType0Filter
* OpenAPIServer\Model\ProductType1Filter
* OpenAPIServer\Model\ProductType2Filter
* OpenAPIServer\Model\ProductType3Filter
* OpenAPIServer\Model\ProductType4Filter
* OpenAPIServer\Model\ReportingColumnAsync
* OpenAPIServer\Model\TargetingTypeFilter
* OpenAPIServer\Model\TrackingUrls


## Authentication

### Security schema `basic`
> Important! To make Basic authentication work you need to extend [\OpenAPIServer\Auth\AbstractAuthenticator](./lib/Auth/AbstractAuthenticator.php) class by [\OpenAPIServer\Auth\BasicAuthenticator](./src/Auth/BasicAuthenticator.php) class.

### Security schema `pinterest_oauth2`
> Important! To make OAuth authentication work you need to extend [\OpenAPIServer\Auth\AbstractAuthenticator](./lib/Auth/AbstractAuthenticator.php) class by [\OpenAPIServer\Auth\OAuthAuthenticator](./src/Auth/OAuthAuthenticator.php) class.

Scope list:
* `ads:read` - See all of your advertising data, including ads, ad groups, campaigns etc.
* `ads:write` - Create, update, or delete ads, ad groups, campaigns etc.
* `boards:read` - See your public boards, including group boards you join
* `boards:read_secret` - See your secret boards
* `boards:write` - Create, update, or delete your public boards
* `boards:write_secret` - Create, update, or delete your secret boards
* `catalogs:read` - See all of your catalogs data
* `catalogs:write` - Create, update, or delete your catalogs data
* `pins:read` - See your public Pins
* `pins:read_secret` - See your secret Pins
* `pins:write` - Create, update, or delete your public Pins
* `pins:write_secret` - Create, update, or delete your secret Pins
* `user_accounts:read` - See your user accounts

### Advanced middleware configuration
Ref to used Slim Token Middleware [dyorg/slim-token-authentication](https://github.com/dyorg/slim-token-authentication/tree/1.x#readme)
