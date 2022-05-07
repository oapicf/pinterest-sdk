# OpenAPIClient-php

Pinterest's REST API

For more information, please visit [https://developers.pinterest.com/](https://developers.pinterest.com/).

## Installation & Usage

### Requirements

PHP 7.3 and later.
Should also work with PHP 8.0 but has not been tested.

### Composer

To install the bindings via [Composer](https://getcomposer.org/), add the following to `composer.json`:

```json
{
  "repositories": [
    {
      "type": "vcs",
      "url": "https://github.com/GIT_USER_ID/GIT_REPO_ID.git"
    }
  ],
  "require": {
    "GIT_USER_ID/GIT_REPO_ID": "*@dev"
  }
}
```

Then run `composer install`

### Manual Installation

Download the files and include `autoload.php`:

```php
<?php
require_once('/path/to/OpenAPIClient-php/vendor/autoload.php');
```

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdAccountsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$start_date = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | Metric report start date (UTC). Format: YYYY-MM-DD
$end_date = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | Metric report end date (UTC). Format: YYYY-MM-DD
$columns = array('columns_example'); // string[] | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
$granularity = DAY; // \OpenAPI\Client\Model\Granularity | Granularity
$click_window_days = 1; // int | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
$engagement_window_days = 30; // int | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
$view_window_days = 1; // int | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
$conversion_report_time = TIME_OF_AD_ACTION; // string | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.

try {
    $result = $apiInstance->adAccountAnalytics($ad_account_id, $start_date, $end_date, $columns, $granularity, $click_window_days, $engagement_window_days, $view_window_days, $conversion_report_time);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdAccountsApi->adAccountAnalytics: ', $e->getMessage(), PHP_EOL;
}

```

## API Endpoints

All URIs are relative to *https://api.pinterest.com/v5*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AdAccountsApi* | [**adAccountAnalytics**](docs/Api/AdAccountsApi.md#adaccountanalytics) | **GET** /ad_accounts/{ad_account_id}/analytics | Get ad account analytics
*AdAccountsApi* | [**adAccountsList**](docs/Api/AdAccountsApi.md#adaccountslist) | **GET** /ad_accounts | List ad accounts
*AdAccountsApi* | [**adGroupsAnalytics**](docs/Api/AdAccountsApi.md#adgroupsanalytics) | **GET** /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics
*AdAccountsApi* | [**adGroupsList**](docs/Api/AdAccountsApi.md#adgroupslist) | **GET** /ad_accounts/{ad_account_id}/ad_groups | List ad groups
*AdAccountsApi* | [**adsAnalytics**](docs/Api/AdAccountsApi.md#adsanalytics) | **GET** /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics
*AdAccountsApi* | [**adsList**](docs/Api/AdAccountsApi.md#adslist) | **GET** /ad_accounts/{ad_account_id}/ads | List ads
*AdAccountsApi* | [**analyticsCreateReport**](docs/Api/AdAccountsApi.md#analyticscreatereport) | **POST** /ad_accounts/{ad_account_id}/reports | Create async request for an account analytics report
*AdAccountsApi* | [**analyticsGetReport**](docs/Api/AdAccountsApi.md#analyticsgetreport) | **GET** /ad_accounts/{ad_account_id}/reports | Get the account analytics report created by the async call
*AdAccountsApi* | [**campaignsAnalytics**](docs/Api/AdAccountsApi.md#campaignsanalytics) | **GET** /ad_accounts/{ad_account_id}/campaigns/analytics | Get campaign analytics
*AdAccountsApi* | [**campaignsList**](docs/Api/AdAccountsApi.md#campaignslist) | **GET** /ad_accounts/{ad_account_id}/campaigns | List campaigns
*AdAccountsApi* | [**productGroupsAnalytics**](docs/Api/AdAccountsApi.md#productgroupsanalytics) | **GET** /ad_accounts/{ad_account_id}/product_groups/analytics | Get product group analytics
*BoardsApi* | [**boardSectionsCreate**](docs/Api/BoardsApi.md#boardsectionscreate) | **POST** /boards/{board_id}/sections | Create board section
*BoardsApi* | [**boardSectionsDelete**](docs/Api/BoardsApi.md#boardsectionsdelete) | **DELETE** /boards/{board_id}/sections/{section_id} | Delete board section
*BoardsApi* | [**boardSectionsList**](docs/Api/BoardsApi.md#boardsectionslist) | **GET** /boards/{board_id}/sections | List board sections
*BoardsApi* | [**boardSectionsListPins**](docs/Api/BoardsApi.md#boardsectionslistpins) | **GET** /boards/{board_id}/sections/{section_id}/pins | List Pins on board section
*BoardsApi* | [**boardSectionsUpdate**](docs/Api/BoardsApi.md#boardsectionsupdate) | **PATCH** /boards/{board_id}/sections/{section_id} | Update board section
*BoardsApi* | [**boardsCreate**](docs/Api/BoardsApi.md#boardscreate) | **POST** /boards | Create board
*BoardsApi* | [**boardsDelete**](docs/Api/BoardsApi.md#boardsdelete) | **DELETE** /boards/{board_id} | Delete board
*BoardsApi* | [**boardsGet**](docs/Api/BoardsApi.md#boardsget) | **GET** /boards/{board_id} | Get board
*BoardsApi* | [**boardsList**](docs/Api/BoardsApi.md#boardslist) | **GET** /boards | List boards
*BoardsApi* | [**boardsListPins**](docs/Api/BoardsApi.md#boardslistpins) | **GET** /boards/{board_id}/pins | List Pins on board
*BoardsApi* | [**boardsUpdate**](docs/Api/BoardsApi.md#boardsupdate) | **PATCH** /boards/{board_id} | Update board
*CatalogsApi* | [**catalogsProductGroupsCreate**](docs/Api/CatalogsApi.md#catalogsproductgroupscreate) | **POST** /catalogs/product_groups | Create product group
*CatalogsApi* | [**catalogsProductGroupsDelete**](docs/Api/CatalogsApi.md#catalogsproductgroupsdelete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group
*CatalogsApi* | [**catalogsProductGroupsList**](docs/Api/CatalogsApi.md#catalogsproductgroupslist) | **GET** /catalogs/product_groups | Get product groups list
*CatalogsApi* | [**catalogsProductGroupsUpdate**](docs/Api/CatalogsApi.md#catalogsproductgroupsupdate) | **PATCH** /catalogs/product_groups/{product_group_id} | Update product group
*CatalogsApi* | [**feedProcessingResultsList**](docs/Api/CatalogsApi.md#feedprocessingresultslist) | **GET** /catalogs/feeds/{feed_id}/processing_results | List processing results for a given feed
*CatalogsApi* | [**feedsCreate**](docs/Api/CatalogsApi.md#feedscreate) | **POST** /catalogs/feeds | Create feed
*CatalogsApi* | [**feedsDelete**](docs/Api/CatalogsApi.md#feedsdelete) | **DELETE** /catalogs/feeds/{feed_id} | Delete feed
*CatalogsApi* | [**feedsGet**](docs/Api/CatalogsApi.md#feedsget) | **GET** /catalogs/feeds/{feed_id} | Get feed
*CatalogsApi* | [**feedsList**](docs/Api/CatalogsApi.md#feedslist) | **GET** /catalogs/feeds | List feeds
*CatalogsApi* | [**feedsUpdate**](docs/Api/CatalogsApi.md#feedsupdate) | **PATCH** /catalogs/feeds/{feed_id} | Update feed
*CatalogsApi* | [**itemsBatchGet**](docs/Api/CatalogsApi.md#itemsbatchget) | **GET** /catalogs/items/batch/{batch_id} | Get catalogs items batch
*CatalogsApi* | [**itemsBatchPost**](docs/Api/CatalogsApi.md#itemsbatchpost) | **POST** /catalogs/items/batch | Perform an operation on an item batch
*CatalogsApi* | [**itemsGet**](docs/Api/CatalogsApi.md#itemsget) | **GET** /catalogs/items | Get catalogs items
*MediaApi* | [**mediaCreate**](docs/Api/MediaApi.md#mediacreate) | **POST** /media | Register media upload
*MediaApi* | [**mediaGet**](docs/Api/MediaApi.md#mediaget) | **GET** /media/{media_id} | Get media upload details
*MediaApi* | [**mediaList**](docs/Api/MediaApi.md#medialist) | **GET** /media | List media uploads
*OauthApi* | [**oauthToken**](docs/Api/OauthApi.md#oauthtoken) | **POST** /oauth/token | Generate OAuth access token
*PinsApi* | [**pinsAnalytics**](docs/Api/PinsApi.md#pinsanalytics) | **GET** /pins/{pin_id}/analytics | Get Pin analytics
*PinsApi* | [**pinsCreate**](docs/Api/PinsApi.md#pinscreate) | **POST** /pins | Create Pin
*PinsApi* | [**pinsDelete**](docs/Api/PinsApi.md#pinsdelete) | **DELETE** /pins/{pin_id} | Delete Pin
*PinsApi* | [**pinsGet**](docs/Api/PinsApi.md#pinsget) | **GET** /pins/{pin_id} | Get Pin
*UserAccountApi* | [**userAccountAnalytics**](docs/Api/UserAccountApi.md#useraccountanalytics) | **GET** /user_account/analytics | Get user account analytics
*UserAccountApi* | [**userAccountGet**](docs/Api/UserAccountApi.md#useraccountget) | **GET** /user_account | Get user account

## Models

- [Account](docs/Model/Account.md)
- [ActionType](docs/Model/ActionType.md)
- [AdAccount](docs/Model/AdAccount.md)
- [AdAccountOwner](docs/Model/AdAccountOwner.md)
- [AdGroupResponse](docs/Model/AdGroupResponse.md)
- [AdGroupResponseAllOf](docs/Model/AdGroupResponseAllOf.md)
- [AdGroupResponseAllOf1](docs/Model/AdGroupResponseAllOf1.md)
- [AdGroupSummaryStatus](docs/Model/AdGroupSummaryStatus.md)
- [AdResponse](docs/Model/AdResponse.md)
- [AdResponseAllOf](docs/Model/AdResponseAllOf.md)
- [AdResponseAllOf1](docs/Model/AdResponseAllOf1.md)
- [AdsAnalyticsCreateAsyncRequest](docs/Model/AdsAnalyticsCreateAsyncRequest.md)
- [AdsAnalyticsCreateAsyncRequestAllOf](docs/Model/AdsAnalyticsCreateAsyncRequestAllOf.md)
- [AdsAnalyticsCreateAsyncRequestAllOf1](docs/Model/AdsAnalyticsCreateAsyncRequestAllOf1.md)
- [AdsAnalyticsCreateAsyncResponse](docs/Model/AdsAnalyticsCreateAsyncResponse.md)
- [AdsAnalyticsFilterColumn](docs/Model/AdsAnalyticsFilterColumn.md)
- [AdsAnalyticsFilterOperator](docs/Model/AdsAnalyticsFilterOperator.md)
- [AdsAnalyticsGetAsyncResponse](docs/Model/AdsAnalyticsGetAsyncResponse.md)
- [AdsAnalyticsMetricsFilter](docs/Model/AdsAnalyticsMetricsFilter.md)
- [AdsAnalyticsTargetingType](docs/Model/AdsAnalyticsTargetingType.md)
- [AnalyticsMetricsResponse](docs/Model/AnalyticsMetricsResponse.md)
- [AnalyticsMetricsResponseDailyMetrics](docs/Model/AnalyticsMetricsResponseDailyMetrics.md)
- [AvailabilityFilter](docs/Model/AvailabilityFilter.md)
- [BatchOperation](docs/Model/BatchOperation.md)
- [BatchOperationStatus](docs/Model/BatchOperationStatus.md)
- [Board](docs/Model/Board.md)
- [BoardOwner](docs/Model/BoardOwner.md)
- [BoardSection](docs/Model/BoardSection.md)
- [BoardUpdate](docs/Model/BoardUpdate.md)
- [BrandFilter](docs/Model/BrandFilter.md)
- [CampaignCommon](docs/Model/CampaignCommon.md)
- [CampaignResponse](docs/Model/CampaignResponse.md)
- [CampaignResponseAllOf](docs/Model/CampaignResponseAllOf.md)
- [CampaignResponseAllOf1](docs/Model/CampaignResponseAllOf1.md)
- [CampaignSummaryStatus](docs/Model/CampaignSummaryStatus.md)
- [CatalogsDbItem](docs/Model/CatalogsDbItem.md)
- [CatalogsFeed](docs/Model/CatalogsFeed.md)
- [CatalogsFeedCredentials](docs/Model/CatalogsFeedCredentials.md)
- [CatalogsFeedIngestionDetails](docs/Model/CatalogsFeedIngestionDetails.md)
- [CatalogsFeedIngestionErrors](docs/Model/CatalogsFeedIngestionErrors.md)
- [CatalogsFeedIngestionInfo](docs/Model/CatalogsFeedIngestionInfo.md)
- [CatalogsFeedProcessingResult](docs/Model/CatalogsFeedProcessingResult.md)
- [CatalogsFeedProcessingResultFields](docs/Model/CatalogsFeedProcessingResultFields.md)
- [CatalogsFeedProcessingSchedule](docs/Model/CatalogsFeedProcessingSchedule.md)
- [CatalogsFeedProcessingStatus](docs/Model/CatalogsFeedProcessingStatus.md)
- [CatalogsFeedProductCounts](docs/Model/CatalogsFeedProductCounts.md)
- [CatalogsFeedValidationDetails](docs/Model/CatalogsFeedValidationDetails.md)
- [CatalogsFeedValidationErrors](docs/Model/CatalogsFeedValidationErrors.md)
- [CatalogsFeedValidationWarnings](docs/Model/CatalogsFeedValidationWarnings.md)
- [CatalogsFeedsCreateRequest](docs/Model/CatalogsFeedsCreateRequest.md)
- [CatalogsFeedsUpdateRequest](docs/Model/CatalogsFeedsUpdateRequest.md)
- [CatalogsFormat](docs/Model/CatalogsFormat.md)
- [CatalogsItems](docs/Model/CatalogsItems.md)
- [CatalogsItemsBatch](docs/Model/CatalogsItemsBatch.md)
- [CatalogsItemsBatchRequest](docs/Model/CatalogsItemsBatchRequest.md)
- [CatalogsProductGroup](docs/Model/CatalogsProductGroup.md)
- [CatalogsProductGroupCreateRequest](docs/Model/CatalogsProductGroupCreateRequest.md)
- [CatalogsProductGroupCurrencyCriteria](docs/Model/CatalogsProductGroupCurrencyCriteria.md)
- [CatalogsProductGroupFilterKeys](docs/Model/CatalogsProductGroupFilterKeys.md)
- [CatalogsProductGroupFilters](docs/Model/CatalogsProductGroupFilters.md)
- [CatalogsProductGroupFiltersAllOf](docs/Model/CatalogsProductGroupFiltersAllOf.md)
- [CatalogsProductGroupFiltersAnyOf](docs/Model/CatalogsProductGroupFiltersAnyOf.md)
- [CatalogsProductGroupMultipleStringCriteria](docs/Model/CatalogsProductGroupMultipleStringCriteria.md)
- [CatalogsProductGroupMultipleStringListCriteria](docs/Model/CatalogsProductGroupMultipleStringListCriteria.md)
- [CatalogsProductGroupPricingCriteria](docs/Model/CatalogsProductGroupPricingCriteria.md)
- [CatalogsProductGroupStatus](docs/Model/CatalogsProductGroupStatus.md)
- [CatalogsProductGroupType](docs/Model/CatalogsProductGroupType.md)
- [CatalogsProductGroupUpdateRequest](docs/Model/CatalogsProductGroupUpdateRequest.md)
- [CatalogsStatus](docs/Model/CatalogsStatus.md)
- [ConditionFilter](docs/Model/ConditionFilter.md)
- [ConversionAttributionWindowDays](docs/Model/ConversionAttributionWindowDays.md)
- [ConversionReportAttributionType](docs/Model/ConversionReportAttributionType.md)
- [ConversionReportTimeType](docs/Model/ConversionReportTimeType.md)
- [Country](docs/Model/Country.md)
- [Currency](docs/Model/Currency.md)
- [CurrencyFilter](docs/Model/CurrencyFilter.md)
- [CustomLabel0Filter](docs/Model/CustomLabel0Filter.md)
- [CustomLabel1Filter](docs/Model/CustomLabel1Filter.md)
- [CustomLabel2Filter](docs/Model/CustomLabel2Filter.md)
- [CustomLabel3Filter](docs/Model/CustomLabel3Filter.md)
- [CustomLabel4Filter](docs/Model/CustomLabel4Filter.md)
- [DataOutputFormat](docs/Model/DataOutputFormat.md)
- [EntityStatus](docs/Model/EntityStatus.md)
- [Error](docs/Model/Error.md)
- [FeedFields](docs/Model/FeedFields.md)
- [GenderFilter](docs/Model/GenderFilter.md)
- [GoogleProductCategory0Filter](docs/Model/GoogleProductCategory0Filter.md)
- [GoogleProductCategory1Filter](docs/Model/GoogleProductCategory1Filter.md)
- [GoogleProductCategory2Filter](docs/Model/GoogleProductCategory2Filter.md)
- [GoogleProductCategory3Filter](docs/Model/GoogleProductCategory3Filter.md)
- [GoogleProductCategory4Filter](docs/Model/GoogleProductCategory4Filter.md)
- [GoogleProductCategory5Filter](docs/Model/GoogleProductCategory5Filter.md)
- [GoogleProductCategory6Filter](docs/Model/GoogleProductCategory6Filter.md)
- [Granularity](docs/Model/Granularity.md)
- [ImageDetails](docs/Model/ImageDetails.md)
- [ItemAttributes](docs/Model/ItemAttributes.md)
- [ItemBatchRecord](docs/Model/ItemBatchRecord.md)
- [ItemGroupIdFilter](docs/Model/ItemGroupIdFilter.md)
- [ItemIdFilter](docs/Model/ItemIdFilter.md)
- [ItemProcessingRecord](docs/Model/ItemProcessingRecord.md)
- [ItemProcessingStatus](docs/Model/ItemProcessingStatus.md)
- [ItemValidationEvent](docs/Model/ItemValidationEvent.md)
- [Language](docs/Model/Language.md)
- [MaxPriceFilter](docs/Model/MaxPriceFilter.md)
- [MediaUpload](docs/Model/MediaUpload.md)
- [MediaUploadAllOf](docs/Model/MediaUploadAllOf.md)
- [MediaUploadAllOfUploadParameters](docs/Model/MediaUploadAllOfUploadParameters.md)
- [MediaUploadDetails](docs/Model/MediaUploadDetails.md)
- [MediaUploadRequest](docs/Model/MediaUploadRequest.md)
- [MediaUploadStatus](docs/Model/MediaUploadStatus.md)
- [MediaUploadType](docs/Model/MediaUploadType.md)
- [MetricsReportingLevel](docs/Model/MetricsReportingLevel.md)
- [MinPriceFilter](docs/Model/MinPriceFilter.md)
- [NonNullableCatalogsCurrency](docs/Model/NonNullableCatalogsCurrency.md)
- [NullableCurrency](docs/Model/NullableCurrency.md)
- [OauthAccessTokenRequestCode](docs/Model/OauthAccessTokenRequestCode.md)
- [OauthAccessTokenRequestCodeAllOf](docs/Model/OauthAccessTokenRequestCodeAllOf.md)
- [OauthAccessTokenRequestRefresh](docs/Model/OauthAccessTokenRequestRefresh.md)
- [OauthAccessTokenRequestRefreshAllOf](docs/Model/OauthAccessTokenRequestRefreshAllOf.md)
- [OauthAccessTokenResponse](docs/Model/OauthAccessTokenResponse.md)
- [OauthAccessTokenResponseCode](docs/Model/OauthAccessTokenResponseCode.md)
- [OauthAccessTokenResponseCodeAllOf](docs/Model/OauthAccessTokenResponseCodeAllOf.md)
- [OauthAccessTokenResponseRefresh](docs/Model/OauthAccessTokenResponseRefresh.md)
- [ObjectiveType](docs/Model/ObjectiveType.md)
- [PacingDeliveryType](docs/Model/PacingDeliveryType.md)
- [Paginated](docs/Model/Paginated.md)
- [Pin](docs/Model/Pin.md)
- [PinMedia](docs/Model/PinMedia.md)
- [PinMediaSource](docs/Model/PinMediaSource.md)
- [PinMediaSourceImageBase64](docs/Model/PinMediaSourceImageBase64.md)
- [PinMediaSourceImageURL](docs/Model/PinMediaSourceImageURL.md)
- [PinMediaSourceVideoID](docs/Model/PinMediaSourceVideoID.md)
- [PinMediaWithImage](docs/Model/PinMediaWithImage.md)
- [PinMediaWithImageAllOf](docs/Model/PinMediaWithImageAllOf.md)
- [PinPromotionSummaryStatus](docs/Model/PinPromotionSummaryStatus.md)
- [PlacementGroupType](docs/Model/PlacementGroupType.md)
- [ProductAvailabilityType](docs/Model/ProductAvailabilityType.md)
- [ProductGroupSummaryStatus](docs/Model/ProductGroupSummaryStatus.md)
- [ProductType0Filter](docs/Model/ProductType0Filter.md)
- [ProductType1Filter](docs/Model/ProductType1Filter.md)
- [ProductType2Filter](docs/Model/ProductType2Filter.md)
- [ProductType3Filter](docs/Model/ProductType3Filter.md)
- [ProductType4Filter](docs/Model/ProductType4Filter.md)
- [ReportingColumnAsync](docs/Model/ReportingColumnAsync.md)
- [TargetingTypeFilter](docs/Model/TargetingTypeFilter.md)
- [TrackingUrls](docs/Model/TrackingUrls.md)

## Authorization

### basic

- **Type**: HTTP basic authentication


### pinterest_oauth2

- **Type**: `OAuth`
- **Flow**: `accessCode`
- **Authorization URL**: `https://www.pinterest.com/oauth/`
- **Scopes**: 
    - **ads:read**: See all of your advertising data, including ads, ad groups, campaigns etc.
    - **ads:write**: Create, update, or delete ads, ad groups, campaigns etc.
    - **boards:read**: See your public boards, including group boards you join
    - **boards:read_secret**: See your secret boards
    - **boards:write**: Create, update, or delete your public boards
    - **boards:write_secret**: Create, update, or delete your secret boards
    - **catalogs:read**: See all of your catalogs data
    - **catalogs:write**: Create, update, or delete your catalogs data
    - **pins:read**: See your public Pins
    - **pins:read_secret**: See your secret Pins
    - **pins:write**: Create, update, or delete your public Pins
    - **pins:write_secret**: Create, update, or delete your secret Pins
    - **user_accounts:read**: See your user accounts

## Tests

To run the tests, use:

```bash
composer install
vendor/bin/phpunit
```

## Author

pinterest-api@pinterest.com

## About this package

This PHP package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: `5.3.0`
- Build package: `org.openapitools.codegen.languages.PhpClientCodegen`
