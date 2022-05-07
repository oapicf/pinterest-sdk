# Pinterest REST API API Client


Pinterest\'s REST API

## Requirements

- [Salesforce DX](https://www.salesforce.com/products/platform/products/salesforce-dx/)

If everything is set correctly:

- Running `sfdx version` in a command prompt should output something like:

  ```bash
  sfdx-cli/5.7.5-05549de (darwin-amd64) go1.7.5 sfdxstable
  ```

## Installation

1. Copy the output into your Salesforce DX folder - or alternatively deploy the output directly into the workspace.
2. Deploy the code via Salesforce DX to your Scratch Org

   ```bash
      sfdx force:source:push
   ```

3. If the API needs authentication update the Named Credential in Setup.
4. Run your Apex tests using

   ```bash
       sfdx sfdx force:apex:test:run
   ```

5. Retrieve the job id from the console and check the test results.

  ```bash
  sfdx force:apex:test:report -i theJobId
  ```

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Apex code:

```java
OASAdAccountsApi api = new OASAdAccountsApi();
OASClient client = api.getClient();


Map<String, Object> params = new Map<String, Object>{
    'adAccountId' => 'null',
    'startDate' => Date.newInstance(1960, 2, 17),
    'endDate' => Date.newInstance(1960, 2, 17),
    'columns' => new List<String>{'SPEND_IN_DOLLAR'},
    'granularity' => DAY,
    'clickWindowDays' => 1,
    'engagementWindowDays' => '',
    'viewWindowDays' => '',
    'conversionReportTime' => TIME_OF_AD_ACTION
};

try {
    // cross your fingers
    List<Map<String, Object>> result = api.adAccountAnalytics(params);
    System.debug(result);
} catch (OAS.ApiException e) {
    // ...handle your exceptions
}
```

## Documentation for API Endpoints

All URIs are relative to *https://api.pinterest.com/v5*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*OASAdAccountsApi* | [**adAccountAnalytics**](OASAdAccountsApi.md#adAccountAnalytics) | **GET** /ad_accounts/{ad_account_id}/analytics | Get ad account analytics
*OASAdAccountsApi* | [**adAccountsList**](OASAdAccountsApi.md#adAccountsList) | **GET** /ad_accounts | List ad accounts
*OASAdAccountsApi* | [**adGroupsAnalytics**](OASAdAccountsApi.md#adGroupsAnalytics) | **GET** /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics
*OASAdAccountsApi* | [**adGroupsList**](OASAdAccountsApi.md#adGroupsList) | **GET** /ad_accounts/{ad_account_id}/ad_groups | List ad groups
*OASAdAccountsApi* | [**adsAnalytics**](OASAdAccountsApi.md#adsAnalytics) | **GET** /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics
*OASAdAccountsApi* | [**adsList**](OASAdAccountsApi.md#adsList) | **GET** /ad_accounts/{ad_account_id}/ads | List ads
*OASAdAccountsApi* | [**analyticsCreateReport**](OASAdAccountsApi.md#analyticsCreateReport) | **POST** /ad_accounts/{ad_account_id}/reports | Create async request for an account analytics report
*OASAdAccountsApi* | [**analyticsGetReport**](OASAdAccountsApi.md#analyticsGetReport) | **GET** /ad_accounts/{ad_account_id}/reports | Get the account analytics report created by the async call
*OASAdAccountsApi* | [**campaignsAnalytics**](OASAdAccountsApi.md#campaignsAnalytics) | **GET** /ad_accounts/{ad_account_id}/campaigns/analytics | Get campaign analytics
*OASAdAccountsApi* | [**campaignsList**](OASAdAccountsApi.md#campaignsList) | **GET** /ad_accounts/{ad_account_id}/campaigns | List campaigns
*OASAdAccountsApi* | [**productGroupsAnalytics**](OASAdAccountsApi.md#productGroupsAnalytics) | **GET** /ad_accounts/{ad_account_id}/product_groups/analytics | Get product group analytics
*OASBoardsApi* | [**boardSectionsCreate**](OASBoardsApi.md#boardSectionsCreate) | **POST** /boards/{board_id}/sections | Create board section
*OASBoardsApi* | [**boardSectionsDelete**](OASBoardsApi.md#boardSectionsDelete) | **DELETE** /boards/{board_id}/sections/{section_id} | Delete board section
*OASBoardsApi* | [**boardSectionsList**](OASBoardsApi.md#boardSectionsList) | **GET** /boards/{board_id}/sections | List board sections
*OASBoardsApi* | [**boardSectionsListPins**](OASBoardsApi.md#boardSectionsListPins) | **GET** /boards/{board_id}/sections/{section_id}/pins | List Pins on board section
*OASBoardsApi* | [**boardSectionsUpdate**](OASBoardsApi.md#boardSectionsUpdate) | **PATCH** /boards/{board_id}/sections/{section_id} | Update board section
*OASBoardsApi* | [**boardsCreate**](OASBoardsApi.md#boardsCreate) | **POST** /boards | Create board
*OASBoardsApi* | [**boardsDelete**](OASBoardsApi.md#boardsDelete) | **DELETE** /boards/{board_id} | Delete board
*OASBoardsApi* | [**boardsGet**](OASBoardsApi.md#boardsGet) | **GET** /boards/{board_id} | Get board
*OASBoardsApi* | [**boardsList**](OASBoardsApi.md#boardsList) | **GET** /boards | List boards
*OASBoardsApi* | [**boardsListPins**](OASBoardsApi.md#boardsListPins) | **GET** /boards/{board_id}/pins | List Pins on board
*OASBoardsApi* | [**boardsUpdate**](OASBoardsApi.md#boardsUpdate) | **PATCH** /boards/{board_id} | Update board
*OASCatalogsApi* | [**catalogsProductGroupsCreate**](OASCatalogsApi.md#catalogsProductGroupsCreate) | **POST** /catalogs/product_groups | Create product group
*OASCatalogsApi* | [**catalogsProductGroupsDelete**](OASCatalogsApi.md#catalogsProductGroupsDelete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group
*OASCatalogsApi* | [**catalogsProductGroupsList**](OASCatalogsApi.md#catalogsProductGroupsList) | **GET** /catalogs/product_groups | Get product groups list
*OASCatalogsApi* | [**catalogsProductGroupsUpdate**](OASCatalogsApi.md#catalogsProductGroupsUpdate) | **PATCH** /catalogs/product_groups/{product_group_id} | Update product group
*OASCatalogsApi* | [**feedProcessingResultsList**](OASCatalogsApi.md#feedProcessingResultsList) | **GET** /catalogs/feeds/{feed_id}/processing_results | List processing results for a given feed
*OASCatalogsApi* | [**feedsCreate**](OASCatalogsApi.md#feedsCreate) | **POST** /catalogs/feeds | Create feed
*OASCatalogsApi* | [**feedsDelete**](OASCatalogsApi.md#feedsDelete) | **DELETE** /catalogs/feeds/{feed_id} | Delete feed
*OASCatalogsApi* | [**feedsGet**](OASCatalogsApi.md#feedsGet) | **GET** /catalogs/feeds/{feed_id} | Get feed
*OASCatalogsApi* | [**feedsList**](OASCatalogsApi.md#feedsList) | **GET** /catalogs/feeds | List feeds
*OASCatalogsApi* | [**feedsUpdate**](OASCatalogsApi.md#feedsUpdate) | **PATCH** /catalogs/feeds/{feed_id} | Update feed
*OASCatalogsApi* | [**itemsBatchGet**](OASCatalogsApi.md#itemsBatchGet) | **GET** /catalogs/items/batch/{batch_id} | Get catalogs items batch
*OASCatalogsApi* | [**itemsBatchPost**](OASCatalogsApi.md#itemsBatchPost) | **POST** /catalogs/items/batch | Perform an operation on an item batch
*OASCatalogsApi* | [**itemsGet**](OASCatalogsApi.md#itemsGet) | **GET** /catalogs/items | Get catalogs items
*OASMediaApi* | [**mediaCreate**](OASMediaApi.md#mediaCreate) | **POST** /media | Register media upload
*OASMediaApi* | [**mediaGet**](OASMediaApi.md#mediaGet) | **GET** /media/{media_id} | Get media upload details
*OASMediaApi* | [**mediaList**](OASMediaApi.md#mediaList) | **GET** /media | List media uploads
*OASOauthApi* | [**oauthToken**](OASOauthApi.md#oauthToken) | **POST** /oauth/token | Generate OAuth access token
*OASPinsApi* | [**pinsAnalytics**](OASPinsApi.md#pinsAnalytics) | **GET** /pins/{pin_id}/analytics | Get Pin analytics
*OASPinsApi* | [**pinsCreate**](OASPinsApi.md#pinsCreate) | **POST** /pins | Create Pin
*OASPinsApi* | [**pinsDelete**](OASPinsApi.md#pinsDelete) | **DELETE** /pins/{pin_id} | Delete Pin
*OASPinsApi* | [**pinsGet**](OASPinsApi.md#pinsGet) | **GET** /pins/{pin_id} | Get Pin
*OASUserAccountApi* | [**userAccountAnalytics**](OASUserAccountApi.md#userAccountAnalytics) | **GET** /user_account/analytics | Get user account analytics
*OASUserAccountApi* | [**userAccountGet**](OASUserAccountApi.md#userAccountGet) | **GET** /user_account | Get user account


## Documentation for Models

 - [OASAccount](OASAccount.md)
 - [OASActionType](OASActionType.md)
 - [OASAdAccount](OASAdAccount.md)
 - [OASAdAccountOwner](OASAdAccountOwner.md)
 - [OASAdGroupResponse](OASAdGroupResponse.md)
 - [OASAdGroupResponseAllOf](OASAdGroupResponseAllOf.md)
 - [OASAdGroupResponseAllOf1](OASAdGroupResponseAllOf1.md)
 - [OASAdGroupSummaryStatus](OASAdGroupSummaryStatus.md)
 - [OASAdResponse](OASAdResponse.md)
 - [OASAdResponseAllOf](OASAdResponseAllOf.md)
 - [OASAdResponseAllOf1](OASAdResponseAllOf1.md)
 - [OASAdsAnalyticsCreateAsyncRequest](OASAdsAnalyticsCreateAsyncRequest.md)
 - [OASAdsAnalyticsCreateAsyncRequestAll](OASAdsAnalyticsCreateAsyncRequestAll.md)
 - [OASAdsAnalyticsCreateAsyncResponse](OASAdsAnalyticsCreateAsyncResponse.md)
 - [OASAdsAnalyticsFilterColumn](OASAdsAnalyticsFilterColumn.md)
 - [OASAdsAnalyticsFilterOperator](OASAdsAnalyticsFilterOperator.md)
 - [OASAdsAnalyticsGetAsyncResponse](OASAdsAnalyticsGetAsyncResponse.md)
 - [OASAdsAnalyticsMetricsFilter](OASAdsAnalyticsMetricsFilter.md)
 - [OASAdsAnalyticsTargetingType](OASAdsAnalyticsTargetingType.md)
 - [OASAnalyticsMetricsResponse](OASAnalyticsMetricsResponse.md)
 - [OASAnalyticsMetricsResponseDailyMetr](OASAnalyticsMetricsResponseDailyMetr.md)
 - [OASAvailabilityFilter](OASAvailabilityFilter.md)
 - [OASBatchOperation](OASBatchOperation.md)
 - [OASBatchOperationStatus](OASBatchOperationStatus.md)
 - [OASBoard](OASBoard.md)
 - [OASBoardOwner](OASBoardOwner.md)
 - [OASBoardSection](OASBoardSection.md)
 - [OASBoardUpdate](OASBoardUpdate.md)
 - [OASBrandFilter](OASBrandFilter.md)
 - [OASCampaignCommon](OASCampaignCommon.md)
 - [OASCampaignResponse](OASCampaignResponse.md)
 - [OASCampaignResponseAllOf](OASCampaignResponseAllOf.md)
 - [OASCampaignResponseAllOf1](OASCampaignResponseAllOf1.md)
 - [OASCampaignSummaryStatus](OASCampaignSummaryStatus.md)
 - [OASCatalogsDbItem](OASCatalogsDbItem.md)
 - [OASCatalogsFeed](OASCatalogsFeed.md)
 - [OASCatalogsFeedCredentials](OASCatalogsFeedCredentials.md)
 - [OASCatalogsFeedIngestionDetails](OASCatalogsFeedIngestionDetails.md)
 - [OASCatalogsFeedIngestionErrors](OASCatalogsFeedIngestionErrors.md)
 - [OASCatalogsFeedIngestionInfo](OASCatalogsFeedIngestionInfo.md)
 - [OASCatalogsFeedProcessingResult](OASCatalogsFeedProcessingResult.md)
 - [OASCatalogsFeedProcessingResultField](OASCatalogsFeedProcessingResultField.md)
 - [OASCatalogsFeedProcessingSchedule](OASCatalogsFeedProcessingSchedule.md)
 - [OASCatalogsFeedProcessingStatus](OASCatalogsFeedProcessingStatus.md)
 - [OASCatalogsFeedProductCounts](OASCatalogsFeedProductCounts.md)
 - [OASCatalogsFeedValidationDetails](OASCatalogsFeedValidationDetails.md)
 - [OASCatalogsFeedValidationErrors](OASCatalogsFeedValidationErrors.md)
 - [OASCatalogsFeedValidationWarnings](OASCatalogsFeedValidationWarnings.md)
 - [OASCatalogsFeedsCreateRequest](OASCatalogsFeedsCreateRequest.md)
 - [OASCatalogsFeedsUpdateRequest](OASCatalogsFeedsUpdateRequest.md)
 - [OASCatalogsFormat](OASCatalogsFormat.md)
 - [OASCatalogsItems](OASCatalogsItems.md)
 - [OASCatalogsItemsBatch](OASCatalogsItemsBatch.md)
 - [OASCatalogsItemsBatchRequest](OASCatalogsItemsBatchRequest.md)
 - [OASCatalogsProductGroup](OASCatalogsProductGroup.md)
 - [OASCatalogsProductGroupCreateRequest](OASCatalogsProductGroupCreateRequest.md)
 - [OASCatalogsProductGroupCurrencyCrite](OASCatalogsProductGroupCurrencyCrite.md)
 - [OASCatalogsProductGroupFilterKeys](OASCatalogsProductGroupFilterKeys.md)
 - [OASCatalogsProductGroupFilters](OASCatalogsProductGroupFilters.md)
 - [OASCatalogsProductGroupFiltersAllOf](OASCatalogsProductGroupFiltersAllOf.md)
 - [OASCatalogsProductGroupFiltersAnyOf](OASCatalogsProductGroupFiltersAnyOf.md)
 - [OASCatalogsProductGroupMultipleStrin](OASCatalogsProductGroupMultipleStrin.md)
 - [OASCatalogsProductGroupPricingCriter](OASCatalogsProductGroupPricingCriter.md)
 - [OASCatalogsProductGroupStatus](OASCatalogsProductGroupStatus.md)
 - [OASCatalogsProductGroupType](OASCatalogsProductGroupType.md)
 - [OASCatalogsProductGroupUpdateRequest](OASCatalogsProductGroupUpdateRequest.md)
 - [OASCatalogsStatus](OASCatalogsStatus.md)
 - [OASConditionFilter](OASConditionFilter.md)
 - [OASConversionAttributionWindowDays](OASConversionAttributionWindowDays.md)
 - [OASConversionReportAttributionType](OASConversionReportAttributionType.md)
 - [OASConversionReportTimeType](OASConversionReportTimeType.md)
 - [OASCountry](OASCountry.md)
 - [OASCurrency](OASCurrency.md)
 - [OASCurrencyFilter](OASCurrencyFilter.md)
 - [OASCustomLabel0Filter](OASCustomLabel0Filter.md)
 - [OASCustomLabel1Filter](OASCustomLabel1Filter.md)
 - [OASCustomLabel2Filter](OASCustomLabel2Filter.md)
 - [OASCustomLabel3Filter](OASCustomLabel3Filter.md)
 - [OASCustomLabel4Filter](OASCustomLabel4Filter.md)
 - [OASDataOutputFormat](OASDataOutputFormat.md)
 - [OASEntityStatus](OASEntityStatus.md)
 - [OASError](OASError.md)
 - [OASFeedFields](OASFeedFields.md)
 - [OASGenderFilter](OASGenderFilter.md)
 - [OASGoogleProductCategory0Filter](OASGoogleProductCategory0Filter.md)
 - [OASGoogleProductCategory1Filter](OASGoogleProductCategory1Filter.md)
 - [OASGoogleProductCategory2Filter](OASGoogleProductCategory2Filter.md)
 - [OASGoogleProductCategory3Filter](OASGoogleProductCategory3Filter.md)
 - [OASGoogleProductCategory4Filter](OASGoogleProductCategory4Filter.md)
 - [OASGoogleProductCategory5Filter](OASGoogleProductCategory5Filter.md)
 - [OASGoogleProductCategory6Filter](OASGoogleProductCategory6Filter.md)
 - [OASGranularity](OASGranularity.md)
 - [OASImageDetails](OASImageDetails.md)
 - [OASItemAttributes](OASItemAttributes.md)
 - [OASItemBatchRecord](OASItemBatchRecord.md)
 - [OASItemGroupIdFilter](OASItemGroupIdFilter.md)
 - [OASItemIdFilter](OASItemIdFilter.md)
 - [OASItemProcessingRecord](OASItemProcessingRecord.md)
 - [OASItemProcessingStatus](OASItemProcessingStatus.md)
 - [OASItemValidationEvent](OASItemValidationEvent.md)
 - [OASLanguage](OASLanguage.md)
 - [OASMaxPriceFilter](OASMaxPriceFilter.md)
 - [OASMediaUpload](OASMediaUpload.md)
 - [OASMediaUploadAllOf](OASMediaUploadAllOf.md)
 - [OASMediaUploadAllOfUploadParameters](OASMediaUploadAllOfUploadParameters.md)
 - [OASMediaUploadDetails](OASMediaUploadDetails.md)
 - [OASMediaUploadRequest](OASMediaUploadRequest.md)
 - [OASMediaUploadStatus](OASMediaUploadStatus.md)
 - [OASMediaUploadType](OASMediaUploadType.md)
 - [OASMetricsReportingLevel](OASMetricsReportingLevel.md)
 - [OASMinPriceFilter](OASMinPriceFilter.md)
 - [OASNonNullableCatalogsCurrency](OASNonNullableCatalogsCurrency.md)
 - [OASNullableCurrency](OASNullableCurrency.md)
 - [OASOauthAccessTokenRequestCode](OASOauthAccessTokenRequestCode.md)
 - [OASOauthAccessTokenRequestCodeAllOf](OASOauthAccessTokenRequestCodeAllOf.md)
 - [OASOauthAccessTokenRequestRefresh](OASOauthAccessTokenRequestRefresh.md)
 - [OASOauthAccessTokenRequestRefreshAll](OASOauthAccessTokenRequestRefreshAll.md)
 - [OASOauthAccessTokenResponse](OASOauthAccessTokenResponse.md)
 - [OASOauthAccessTokenResponseCode](OASOauthAccessTokenResponseCode.md)
 - [OASOauthAccessTokenResponseCodeAllOf](OASOauthAccessTokenResponseCodeAllOf.md)
 - [OASOauthAccessTokenResponseRefresh](OASOauthAccessTokenResponseRefresh.md)
 - [OASObjectiveType](OASObjectiveType.md)
 - [OASPacingDeliveryType](OASPacingDeliveryType.md)
 - [OASPaginated](OASPaginated.md)
 - [OASPin](OASPin.md)
 - [OASPinMedia](OASPinMedia.md)
 - [OASPinMediaSource](OASPinMediaSource.md)
 - [OASPinMediaSourceImageBase64](OASPinMediaSourceImageBase64.md)
 - [OASPinMediaSourceImageURL](OASPinMediaSourceImageURL.md)
 - [OASPinMediaSourceVideoID](OASPinMediaSourceVideoID.md)
 - [OASPinMediaWithImage](OASPinMediaWithImage.md)
 - [OASPinMediaWithImageAllOf](OASPinMediaWithImageAllOf.md)
 - [OASPinPromotionSummaryStatus](OASPinPromotionSummaryStatus.md)
 - [OASPlacementGroupType](OASPlacementGroupType.md)
 - [OASProductAvailabilityType](OASProductAvailabilityType.md)
 - [OASProductGroupSummaryStatus](OASProductGroupSummaryStatus.md)
 - [OASProductType0Filter](OASProductType0Filter.md)
 - [OASProductType1Filter](OASProductType1Filter.md)
 - [OASProductType2Filter](OASProductType2Filter.md)
 - [OASProductType3Filter](OASProductType3Filter.md)
 - [OASProductType4Filter](OASProductType4Filter.md)
 - [OASReportingColumnAsync](OASReportingColumnAsync.md)
 - [OASTargetingTypeFilter](OASTargetingTypeFilter.md)
 - [OASTrackingUrls](OASTrackingUrls.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### basic

- **Type**: HTTP basic authentication

### pinterest_oauth2

- **Type**: OAuth
- **Flow**: accessCode
- **Authorization URL**: https://www.pinterest.com/oauth/
- **Scopes**: 
  - ads:read: See all of your advertising data, including ads, ad groups, campaigns etc.
  - ads:write: Create, update, or delete ads, ad groups, campaigns etc.
  - boards:read: See your public boards, including group boards you join
  - boards:read_secret: See your secret boards
  - boards:write: Create, update, or delete your public boards
  - boards:write_secret: Create, update, or delete your secret boards
  - catalogs:read: See all of your catalogs data
  - catalogs:write: Create, update, or delete your catalogs data
  - pins:read: See your public Pins
  - pins:read_secret: See your secret Pins
  - pins:write: Create, update, or delete your public Pins
  - pins:write_secret: Create, update, or delete your secret Pins
  - user_accounts:read: See your user accounts


## Author

pinterest-api@pinterest.com

