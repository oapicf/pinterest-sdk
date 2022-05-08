# Pinterest REST API Bash client

## Overview

This is a Bash client script for accessing Pinterest REST API service.

The script uses cURL underneath for making all REST calls.

## Usage

```shell
# Make sure the script has executable rights
$ chmod u+x 

# Print the list of operations available on the service
$ ./ -h

# Print the service description
$ ./ --about

# Print detailed information about specific operation
$ ./ <operationId> -h

# Make GET request
./ --host http://<hostname>:<port> --accept xml <operationId> <queryParam1>=<value1> <header_key1>:<header_value2>

# Make GET request using arbitrary curl options (must be passed before <operationId>) to an SSL service using username:password
 -k -sS --tlsv1.2 --host https://<hostname> -u <user>:<password> --accept xml <operationId> <queryParam1>=<value1> <header_key1>:<header_value2>

# Make POST request
$ echo '<body_content>' |  --host <hostname> --content-type json <operationId> -

# Make POST request with simple JSON content, e.g.:
# {
#   "key1": "value1",
#   "key2": "value2",
#   "key3": 23
# }
$ echo '<body_content>' |  --host <hostname> --content-type json <operationId> key1==value1 key2=value2 key3:=23 -

# Make POST request with form data
$  --host <hostname> <operationId> key1:=value1 key2:=value2 key3:=23

# Preview the cURL command without actually executing it
$  --host http://<hostname>:<port> --dry-run <operationid>

```

## Docker image

You can easily create a Docker image containing a preconfigured environment
for using the REST Bash client including working autocompletion and short
welcome message with basic instructions, using the generated Dockerfile:

```shell
docker build -t my-rest-client .
docker run -it my-rest-client
```

By default you will be logged into a Zsh environment which has much more
advanced auto completion, but you can switch to Bash, where basic autocompletion
is also available.

## Shell completion

### Bash

The generated bash-completion script can be either directly loaded to the current Bash session using:

```shell
source .bash-completion
```

Alternatively, the script can be copied to the `/etc/bash-completion.d` (or on OSX with Homebrew to `/usr/local/etc/bash-completion.d`):

```shell
sudo cp .bash-completion /etc/bash-completion.d/
```

#### OS X

On OSX you might need to install bash-completion using Homebrew:

```shell
brew install bash-completion
```

and add the following to the `~/.bashrc`:

```shell
if [ -f $(brew --prefix)/etc/bash_completion ]; then
  . $(brew --prefix)/etc/bash_completion
fi
```

### Zsh

In Zsh, the generated `_` Zsh completion file must be copied to one of the folders under `$FPATH` variable.

## Documentation for API Endpoints

All URIs are relative to */v5*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AdAccountsApi* | [**adAccountAnalytics**](docs/AdAccountsApi.md#adaccountanalytics) | **GET** /ad_accounts/{ad_account_id}/analytics | Get ad account analytics
*AdAccountsApi* | [**adAccountsList**](docs/AdAccountsApi.md#adaccountslist) | **GET** /ad_accounts | List ad accounts
*AdAccountsApi* | [**adGroupsAnalytics**](docs/AdAccountsApi.md#adgroupsanalytics) | **GET** /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics
*AdAccountsApi* | [**adGroupsList**](docs/AdAccountsApi.md#adgroupslist) | **GET** /ad_accounts/{ad_account_id}/ad_groups | List ad groups
*AdAccountsApi* | [**adsAnalytics**](docs/AdAccountsApi.md#adsanalytics) | **GET** /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics
*AdAccountsApi* | [**adsList**](docs/AdAccountsApi.md#adslist) | **GET** /ad_accounts/{ad_account_id}/ads | List ads
*AdAccountsApi* | [**analyticsCreateReport**](docs/AdAccountsApi.md#analyticscreatereport) | **POST** /ad_accounts/{ad_account_id}/reports | Create async request for an account analytics report
*AdAccountsApi* | [**analyticsGetReport**](docs/AdAccountsApi.md#analyticsgetreport) | **GET** /ad_accounts/{ad_account_id}/reports | Get the account analytics report created by the async call
*AdAccountsApi* | [**campaignsAnalytics**](docs/AdAccountsApi.md#campaignsanalytics) | **GET** /ad_accounts/{ad_account_id}/campaigns/analytics | Get campaign analytics
*AdAccountsApi* | [**campaignsList**](docs/AdAccountsApi.md#campaignslist) | **GET** /ad_accounts/{ad_account_id}/campaigns | List campaigns
*AdAccountsApi* | [**productGroupsAnalytics**](docs/AdAccountsApi.md#productgroupsanalytics) | **GET** /ad_accounts/{ad_account_id}/product_groups/analytics | Get product group analytics
*BoardsApi* | [**boardSectionsCreate**](docs/BoardsApi.md#boardsectionscreate) | **POST** /boards/{board_id}/sections | Create board section
*BoardsApi* | [**boardSectionsDelete**](docs/BoardsApi.md#boardsectionsdelete) | **DELETE** /boards/{board_id}/sections/{section_id} | Delete board section
*BoardsApi* | [**boardSectionsList**](docs/BoardsApi.md#boardsectionslist) | **GET** /boards/{board_id}/sections | List board sections
*BoardsApi* | [**boardSectionsListPins**](docs/BoardsApi.md#boardsectionslistpins) | **GET** /boards/{board_id}/sections/{section_id}/pins | List Pins on board section
*BoardsApi* | [**boardSectionsUpdate**](docs/BoardsApi.md#boardsectionsupdate) | **PATCH** /boards/{board_id}/sections/{section_id} | Update board section
*BoardsApi* | [**boardsCreate**](docs/BoardsApi.md#boardscreate) | **POST** /boards | Create board
*BoardsApi* | [**boardsDelete**](docs/BoardsApi.md#boardsdelete) | **DELETE** /boards/{board_id} | Delete board
*BoardsApi* | [**boardsGet**](docs/BoardsApi.md#boardsget) | **GET** /boards/{board_id} | Get board
*BoardsApi* | [**boardsList**](docs/BoardsApi.md#boardslist) | **GET** /boards | List boards
*BoardsApi* | [**boardsListPins**](docs/BoardsApi.md#boardslistpins) | **GET** /boards/{board_id}/pins | List Pins on board
*BoardsApi* | [**boardsUpdate**](docs/BoardsApi.md#boardsupdate) | **PATCH** /boards/{board_id} | Update board
*CatalogsApi* | [**catalogsProductGroupsCreate**](docs/CatalogsApi.md#catalogsproductgroupscreate) | **POST** /catalogs/product_groups | Create product group
*CatalogsApi* | [**catalogsProductGroupsDelete**](docs/CatalogsApi.md#catalogsproductgroupsdelete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group
*CatalogsApi* | [**catalogsProductGroupsList**](docs/CatalogsApi.md#catalogsproductgroupslist) | **GET** /catalogs/product_groups | Get product groups list
*CatalogsApi* | [**catalogsProductGroupsUpdate**](docs/CatalogsApi.md#catalogsproductgroupsupdate) | **PATCH** /catalogs/product_groups/{product_group_id} | Update product group
*CatalogsApi* | [**feedProcessingResultsList**](docs/CatalogsApi.md#feedprocessingresultslist) | **GET** /catalogs/feeds/{feed_id}/processing_results | List processing results for a given feed
*CatalogsApi* | [**feedsCreate**](docs/CatalogsApi.md#feedscreate) | **POST** /catalogs/feeds | Create feed
*CatalogsApi* | [**feedsDelete**](docs/CatalogsApi.md#feedsdelete) | **DELETE** /catalogs/feeds/{feed_id} | Delete feed
*CatalogsApi* | [**feedsGet**](docs/CatalogsApi.md#feedsget) | **GET** /catalogs/feeds/{feed_id} | Get feed
*CatalogsApi* | [**feedsList**](docs/CatalogsApi.md#feedslist) | **GET** /catalogs/feeds | List feeds
*CatalogsApi* | [**feedsUpdate**](docs/CatalogsApi.md#feedsupdate) | **PATCH** /catalogs/feeds/{feed_id} | Update feed
*CatalogsApi* | [**itemsBatchGet**](docs/CatalogsApi.md#itemsbatchget) | **GET** /catalogs/items/batch/{batch_id} | Get catalogs items batch
*CatalogsApi* | [**itemsBatchPost**](docs/CatalogsApi.md#itemsbatchpost) | **POST** /catalogs/items/batch | Perform an operation on an item batch
*CatalogsApi* | [**itemsGet**](docs/CatalogsApi.md#itemsget) | **GET** /catalogs/items | Get catalogs items
*MediaApi* | [**mediaCreate**](docs/MediaApi.md#mediacreate) | **POST** /media | Register media upload
*MediaApi* | [**mediaGet**](docs/MediaApi.md#mediaget) | **GET** /media/{media_id} | Get media upload details
*MediaApi* | [**mediaList**](docs/MediaApi.md#medialist) | **GET** /media | List media uploads
*OauthApi* | [**oauthToken**](docs/OauthApi.md#oauthtoken) | **POST** /oauth/token | Generate OAuth access token
*PinsApi* | [**pinsAnalytics**](docs/PinsApi.md#pinsanalytics) | **GET** /pins/{pin_id}/analytics | Get Pin analytics
*PinsApi* | [**pinsCreate**](docs/PinsApi.md#pinscreate) | **POST** /pins | Create Pin
*PinsApi* | [**pinsDelete**](docs/PinsApi.md#pinsdelete) | **DELETE** /pins/{pin_id} | Delete Pin
*PinsApi* | [**pinsGet**](docs/PinsApi.md#pinsget) | **GET** /pins/{pin_id} | Get Pin
*UserAccountApi* | [**userAccountAnalytics**](docs/UserAccountApi.md#useraccountanalytics) | **GET** /user_account/analytics | Get user account analytics
*UserAccountApi* | [**userAccountGet**](docs/UserAccountApi.md#useraccountget) | **GET** /user_account | Get user account


## Documentation For Models

 - [Account](docs/Account.md)
 - [ActionType](docs/ActionType.md)
 - [AdAccount](docs/AdAccount.md)
 - [AdAccountOwner](docs/AdAccountOwner.md)
 - [AdGroupResponse](docs/AdGroupResponse.md)
 - [AdGroupResponseAllOf](docs/AdGroupResponseAllOf.md)
 - [AdGroupResponseAllOf1](docs/AdGroupResponseAllOf1.md)
 - [AdGroupSummaryStatus](docs/AdGroupSummaryStatus.md)
 - [AdResponse](docs/AdResponse.md)
 - [AdResponseAllOf](docs/AdResponseAllOf.md)
 - [AdResponseAllOf1](docs/AdResponseAllOf1.md)
 - [AdsAnalyticsCreateAsyncRequest](docs/AdsAnalyticsCreateAsyncRequest.md)
 - [AdsAnalyticsCreateAsyncRequestAllOf](docs/AdsAnalyticsCreateAsyncRequestAllOf.md)
 - [AdsAnalyticsCreateAsyncRequestAllOf1](docs/AdsAnalyticsCreateAsyncRequestAllOf1.md)
 - [AdsAnalyticsCreateAsyncResponse](docs/AdsAnalyticsCreateAsyncResponse.md)
 - [AdsAnalyticsFilterColumn](docs/AdsAnalyticsFilterColumn.md)
 - [AdsAnalyticsFilterOperator](docs/AdsAnalyticsFilterOperator.md)
 - [AdsAnalyticsGetAsyncResponse](docs/AdsAnalyticsGetAsyncResponse.md)
 - [AdsAnalyticsMetricsFilter](docs/AdsAnalyticsMetricsFilter.md)
 - [AdsAnalyticsTargetingType](docs/AdsAnalyticsTargetingType.md)
 - [AnalyticsMetricsResponse](docs/AnalyticsMetricsResponse.md)
 - [AnalyticsMetricsResponseDailyMetrics](docs/AnalyticsMetricsResponseDailyMetrics.md)
 - [AvailabilityFilter](docs/AvailabilityFilter.md)
 - [BatchOperation](docs/BatchOperation.md)
 - [BatchOperationStatus](docs/BatchOperationStatus.md)
 - [Board](docs/Board.md)
 - [BoardOwner](docs/BoardOwner.md)
 - [BoardSection](docs/BoardSection.md)
 - [BoardUpdate](docs/BoardUpdate.md)
 - [BrandFilter](docs/BrandFilter.md)
 - [CampaignCommon](docs/CampaignCommon.md)
 - [CampaignResponse](docs/CampaignResponse.md)
 - [CampaignResponseAllOf](docs/CampaignResponseAllOf.md)
 - [CampaignResponseAllOf1](docs/CampaignResponseAllOf1.md)
 - [CampaignSummaryStatus](docs/CampaignSummaryStatus.md)
 - [CatalogsDbItem](docs/CatalogsDbItem.md)
 - [CatalogsFeed](docs/CatalogsFeed.md)
 - [CatalogsFeedCredentials](docs/CatalogsFeedCredentials.md)
 - [CatalogsFeedIngestionDetails](docs/CatalogsFeedIngestionDetails.md)
 - [CatalogsFeedIngestionErrors](docs/CatalogsFeedIngestionErrors.md)
 - [CatalogsFeedIngestionInfo](docs/CatalogsFeedIngestionInfo.md)
 - [CatalogsFeedProcessingResult](docs/CatalogsFeedProcessingResult.md)
 - [CatalogsFeedProcessingResultFields](docs/CatalogsFeedProcessingResultFields.md)
 - [CatalogsFeedProcessingSchedule](docs/CatalogsFeedProcessingSchedule.md)
 - [CatalogsFeedProcessingStatus](docs/CatalogsFeedProcessingStatus.md)
 - [CatalogsFeedProductCounts](docs/CatalogsFeedProductCounts.md)
 - [CatalogsFeedValidationDetails](docs/CatalogsFeedValidationDetails.md)
 - [CatalogsFeedValidationErrors](docs/CatalogsFeedValidationErrors.md)
 - [CatalogsFeedValidationWarnings](docs/CatalogsFeedValidationWarnings.md)
 - [CatalogsFeedsCreateRequest](docs/CatalogsFeedsCreateRequest.md)
 - [CatalogsFeedsUpdateRequest](docs/CatalogsFeedsUpdateRequest.md)
 - [CatalogsFormat](docs/CatalogsFormat.md)
 - [CatalogsItems](docs/CatalogsItems.md)
 - [CatalogsItemsBatch](docs/CatalogsItemsBatch.md)
 - [CatalogsItemsBatchRequest](docs/CatalogsItemsBatchRequest.md)
 - [CatalogsProductGroup](docs/CatalogsProductGroup.md)
 - [CatalogsProductGroupCreateRequest](docs/CatalogsProductGroupCreateRequest.md)
 - [CatalogsProductGroupCurrencyCriteria](docs/CatalogsProductGroupCurrencyCriteria.md)
 - [CatalogsProductGroupFilterKeys](docs/CatalogsProductGroupFilterKeys.md)
 - [CatalogsProductGroupFilters](docs/CatalogsProductGroupFilters.md)
 - [CatalogsProductGroupFiltersAllOf](docs/CatalogsProductGroupFiltersAllOf.md)
 - [CatalogsProductGroupFiltersAnyOf](docs/CatalogsProductGroupFiltersAnyOf.md)
 - [CatalogsProductGroupMultipleStringCriteria](docs/CatalogsProductGroupMultipleStringCriteria.md)
 - [CatalogsProductGroupMultipleStringListCriteria](docs/CatalogsProductGroupMultipleStringListCriteria.md)
 - [CatalogsProductGroupPricingCriteria](docs/CatalogsProductGroupPricingCriteria.md)
 - [CatalogsProductGroupStatus](docs/CatalogsProductGroupStatus.md)
 - [CatalogsProductGroupType](docs/CatalogsProductGroupType.md)
 - [CatalogsProductGroupUpdateRequest](docs/CatalogsProductGroupUpdateRequest.md)
 - [CatalogsStatus](docs/CatalogsStatus.md)
 - [ConditionFilter](docs/ConditionFilter.md)
 - [ConversionAttributionWindowDays](docs/ConversionAttributionWindowDays.md)
 - [ConversionReportAttributionType](docs/ConversionReportAttributionType.md)
 - [ConversionReportTimeType](docs/ConversionReportTimeType.md)
 - [Country](docs/Country.md)
 - [Currency](docs/Currency.md)
 - [CurrencyFilter](docs/CurrencyFilter.md)
 - [CustomLabel0Filter](docs/CustomLabel0Filter.md)
 - [CustomLabel1Filter](docs/CustomLabel1Filter.md)
 - [CustomLabel2Filter](docs/CustomLabel2Filter.md)
 - [CustomLabel3Filter](docs/CustomLabel3Filter.md)
 - [CustomLabel4Filter](docs/CustomLabel4Filter.md)
 - [DataOutputFormat](docs/DataOutputFormat.md)
 - [EntityStatus](docs/EntityStatus.md)
 - [Error](docs/Error.md)
 - [FeedFields](docs/FeedFields.md)
 - [GenderFilter](docs/GenderFilter.md)
 - [GoogleProductCategory0Filter](docs/GoogleProductCategory0Filter.md)
 - [GoogleProductCategory1Filter](docs/GoogleProductCategory1Filter.md)
 - [GoogleProductCategory2Filter](docs/GoogleProductCategory2Filter.md)
 - [GoogleProductCategory3Filter](docs/GoogleProductCategory3Filter.md)
 - [GoogleProductCategory4Filter](docs/GoogleProductCategory4Filter.md)
 - [GoogleProductCategory5Filter](docs/GoogleProductCategory5Filter.md)
 - [GoogleProductCategory6Filter](docs/GoogleProductCategory6Filter.md)
 - [Granularity](docs/Granularity.md)
 - [ImageDetails](docs/ImageDetails.md)
 - [ItemAttributes](docs/ItemAttributes.md)
 - [ItemBatchRecord](docs/ItemBatchRecord.md)
 - [ItemGroupIdFilter](docs/ItemGroupIdFilter.md)
 - [ItemIdFilter](docs/ItemIdFilter.md)
 - [ItemProcessingRecord](docs/ItemProcessingRecord.md)
 - [ItemProcessingStatus](docs/ItemProcessingStatus.md)
 - [ItemValidationEvent](docs/ItemValidationEvent.md)
 - [Language](docs/Language.md)
 - [MaxPriceFilter](docs/MaxPriceFilter.md)
 - [MediaUpload](docs/MediaUpload.md)
 - [MediaUploadAllOf](docs/MediaUploadAllOf.md)
 - [MediaUploadAllOfUploadParameters](docs/MediaUploadAllOfUploadParameters.md)
 - [MediaUploadDetails](docs/MediaUploadDetails.md)
 - [MediaUploadRequest](docs/MediaUploadRequest.md)
 - [MediaUploadStatus](docs/MediaUploadStatus.md)
 - [MediaUploadType](docs/MediaUploadType.md)
 - [MetricsReportingLevel](docs/MetricsReportingLevel.md)
 - [MinPriceFilter](docs/MinPriceFilter.md)
 - [NonNullableCatalogsCurrency](docs/NonNullableCatalogsCurrency.md)
 - [NullableCurrency](docs/NullableCurrency.md)
 - [OauthAccessTokenRequest](docs/OauthAccessTokenRequest.md)
 - [OauthAccessTokenRequestCode](docs/OauthAccessTokenRequestCode.md)
 - [OauthAccessTokenRequestCodeAllOf](docs/OauthAccessTokenRequestCodeAllOf.md)
 - [OauthAccessTokenRequestRefresh](docs/OauthAccessTokenRequestRefresh.md)
 - [OauthAccessTokenRequestRefreshAllOf](docs/OauthAccessTokenRequestRefreshAllOf.md)
 - [OauthAccessTokenResponse](docs/OauthAccessTokenResponse.md)
 - [OauthAccessTokenResponseCode](docs/OauthAccessTokenResponseCode.md)
 - [OauthAccessTokenResponseCodeAllOf](docs/OauthAccessTokenResponseCodeAllOf.md)
 - [OauthAccessTokenResponseRefresh](docs/OauthAccessTokenResponseRefresh.md)
 - [ObjectiveType](docs/ObjectiveType.md)
 - [PacingDeliveryType](docs/PacingDeliveryType.md)
 - [Paginated](docs/Paginated.md)
 - [Pin](docs/Pin.md)
 - [PinMedia](docs/PinMedia.md)
 - [PinMediaSource](docs/PinMediaSource.md)
 - [PinMediaSourceImageBase64](docs/PinMediaSourceImageBase64.md)
 - [PinMediaSourceImageURL](docs/PinMediaSourceImageURL.md)
 - [PinMediaSourceVideoID](docs/PinMediaSourceVideoID.md)
 - [PinMediaWithImage](docs/PinMediaWithImage.md)
 - [PinMediaWithImageAllOf](docs/PinMediaWithImageAllOf.md)
 - [PinPromotionSummaryStatus](docs/PinPromotionSummaryStatus.md)
 - [PlacementGroupType](docs/PlacementGroupType.md)
 - [ProductAvailabilityType](docs/ProductAvailabilityType.md)
 - [ProductGroupSummaryStatus](docs/ProductGroupSummaryStatus.md)
 - [ProductType0Filter](docs/ProductType0Filter.md)
 - [ProductType1Filter](docs/ProductType1Filter.md)
 - [ProductType2Filter](docs/ProductType2Filter.md)
 - [ProductType3Filter](docs/ProductType3Filter.md)
 - [ProductType4Filter](docs/ProductType4Filter.md)
 - [ReportingColumnAsync](docs/ReportingColumnAsync.md)
 - [TargetingTypeFilter](docs/TargetingTypeFilter.md)
 - [TrackingUrls](docs/TrackingUrls.md)


## Documentation For Authorization


## basic

- **Type**: HTTP basic authentication

## pinterest_oauth2


- **Type**: OAuth
- **Flow**: accessCode
- **Authorization URL**: https://www.pinterest.com/oauth/
- **Token URL**: https://api.pinterest.com/v5/oauth/token
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

