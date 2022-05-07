# org.openapitools - Kotlin Server library for Pinterest REST API

## Requires

* Kotlin 1.3.10
* Maven 3.3

## Build

```
mvn clean package
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.

    <a name="documentation-for-api-endpoints"></a>
    ## Documentation for API Endpoints

    All URIs are relative to *https://api.pinterest.com/v5*

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
    

    <a name="documentation-for-models"></a>
    ## Documentation for Models

         - [org.openapitools.server.api.model.Account](docs/Account.md)
         - [org.openapitools.server.api.model.ActionType](docs/ActionType.md)
         - [org.openapitools.server.api.model.AdAccount](docs/AdAccount.md)
         - [org.openapitools.server.api.model.AdAccountOwner](docs/AdAccountOwner.md)
         - [org.openapitools.server.api.model.AdGroupResponse](docs/AdGroupResponse.md)
         - [org.openapitools.server.api.model.AdGroupResponseAllOf](docs/AdGroupResponseAllOf.md)
         - [org.openapitools.server.api.model.AdGroupResponseAllOf1](docs/AdGroupResponseAllOf1.md)
         - [org.openapitools.server.api.model.AdGroupSummaryStatus](docs/AdGroupSummaryStatus.md)
         - [org.openapitools.server.api.model.AdResponse](docs/AdResponse.md)
         - [org.openapitools.server.api.model.AdResponseAllOf](docs/AdResponseAllOf.md)
         - [org.openapitools.server.api.model.AdResponseAllOf1](docs/AdResponseAllOf1.md)
         - [org.openapitools.server.api.model.AdsAnalyticsCreateAsyncRequest](docs/AdsAnalyticsCreateAsyncRequest.md)
         - [org.openapitools.server.api.model.AdsAnalyticsCreateAsyncRequestAllOf](docs/AdsAnalyticsCreateAsyncRequestAllOf.md)
         - [org.openapitools.server.api.model.AdsAnalyticsCreateAsyncRequestAllOf1](docs/AdsAnalyticsCreateAsyncRequestAllOf1.md)
         - [org.openapitools.server.api.model.AdsAnalyticsCreateAsyncResponse](docs/AdsAnalyticsCreateAsyncResponse.md)
         - [org.openapitools.server.api.model.AdsAnalyticsFilterColumn](docs/AdsAnalyticsFilterColumn.md)
         - [org.openapitools.server.api.model.AdsAnalyticsFilterOperator](docs/AdsAnalyticsFilterOperator.md)
         - [org.openapitools.server.api.model.AdsAnalyticsGetAsyncResponse](docs/AdsAnalyticsGetAsyncResponse.md)
         - [org.openapitools.server.api.model.AdsAnalyticsMetricsFilter](docs/AdsAnalyticsMetricsFilter.md)
         - [org.openapitools.server.api.model.AdsAnalyticsTargetingType](docs/AdsAnalyticsTargetingType.md)
         - [org.openapitools.server.api.model.AnalyticsMetricsResponse](docs/AnalyticsMetricsResponse.md)
         - [org.openapitools.server.api.model.AnalyticsMetricsResponseDailyMetrics](docs/AnalyticsMetricsResponseDailyMetrics.md)
         - [org.openapitools.server.api.model.AvailabilityFilter](docs/AvailabilityFilter.md)
         - [org.openapitools.server.api.model.BatchOperation](docs/BatchOperation.md)
         - [org.openapitools.server.api.model.BatchOperationStatus](docs/BatchOperationStatus.md)
         - [org.openapitools.server.api.model.Board](docs/Board.md)
         - [org.openapitools.server.api.model.BoardOwner](docs/BoardOwner.md)
         - [org.openapitools.server.api.model.BoardSection](docs/BoardSection.md)
         - [org.openapitools.server.api.model.BoardUpdate](docs/BoardUpdate.md)
         - [org.openapitools.server.api.model.BrandFilter](docs/BrandFilter.md)
         - [org.openapitools.server.api.model.CampaignCommon](docs/CampaignCommon.md)
         - [org.openapitools.server.api.model.CampaignResponse](docs/CampaignResponse.md)
         - [org.openapitools.server.api.model.CampaignResponseAllOf](docs/CampaignResponseAllOf.md)
         - [org.openapitools.server.api.model.CampaignResponseAllOf1](docs/CampaignResponseAllOf1.md)
         - [org.openapitools.server.api.model.CampaignSummaryStatus](docs/CampaignSummaryStatus.md)
         - [org.openapitools.server.api.model.CatalogsDbItem](docs/CatalogsDbItem.md)
         - [org.openapitools.server.api.model.CatalogsFeed](docs/CatalogsFeed.md)
         - [org.openapitools.server.api.model.CatalogsFeedCredentials](docs/CatalogsFeedCredentials.md)
         - [org.openapitools.server.api.model.CatalogsFeedIngestionDetails](docs/CatalogsFeedIngestionDetails.md)
         - [org.openapitools.server.api.model.CatalogsFeedIngestionErrors](docs/CatalogsFeedIngestionErrors.md)
         - [org.openapitools.server.api.model.CatalogsFeedIngestionInfo](docs/CatalogsFeedIngestionInfo.md)
         - [org.openapitools.server.api.model.CatalogsFeedProcessingResult](docs/CatalogsFeedProcessingResult.md)
         - [org.openapitools.server.api.model.CatalogsFeedProcessingResultFields](docs/CatalogsFeedProcessingResultFields.md)
         - [org.openapitools.server.api.model.CatalogsFeedProcessingSchedule](docs/CatalogsFeedProcessingSchedule.md)
         - [org.openapitools.server.api.model.CatalogsFeedProcessingStatus](docs/CatalogsFeedProcessingStatus.md)
         - [org.openapitools.server.api.model.CatalogsFeedProductCounts](docs/CatalogsFeedProductCounts.md)
         - [org.openapitools.server.api.model.CatalogsFeedValidationDetails](docs/CatalogsFeedValidationDetails.md)
         - [org.openapitools.server.api.model.CatalogsFeedValidationErrors](docs/CatalogsFeedValidationErrors.md)
         - [org.openapitools.server.api.model.CatalogsFeedValidationWarnings](docs/CatalogsFeedValidationWarnings.md)
         - [org.openapitools.server.api.model.CatalogsFeedsCreateRequest](docs/CatalogsFeedsCreateRequest.md)
         - [org.openapitools.server.api.model.CatalogsFeedsUpdateRequest](docs/CatalogsFeedsUpdateRequest.md)
         - [org.openapitools.server.api.model.CatalogsFormat](docs/CatalogsFormat.md)
         - [org.openapitools.server.api.model.CatalogsItems](docs/CatalogsItems.md)
         - [org.openapitools.server.api.model.CatalogsItemsBatch](docs/CatalogsItemsBatch.md)
         - [org.openapitools.server.api.model.CatalogsItemsBatchRequest](docs/CatalogsItemsBatchRequest.md)
         - [org.openapitools.server.api.model.CatalogsProductGroup](docs/CatalogsProductGroup.md)
         - [org.openapitools.server.api.model.CatalogsProductGroupCreateRequest](docs/CatalogsProductGroupCreateRequest.md)
         - [org.openapitools.server.api.model.CatalogsProductGroupCurrencyCriteria](docs/CatalogsProductGroupCurrencyCriteria.md)
         - [org.openapitools.server.api.model.CatalogsProductGroupFilterKeys](docs/CatalogsProductGroupFilterKeys.md)
         - [org.openapitools.server.api.model.CatalogsProductGroupFilters](docs/CatalogsProductGroupFilters.md)
         - [org.openapitools.server.api.model.CatalogsProductGroupFiltersAllOf](docs/CatalogsProductGroupFiltersAllOf.md)
         - [org.openapitools.server.api.model.CatalogsProductGroupFiltersAnyOf](docs/CatalogsProductGroupFiltersAnyOf.md)
         - [org.openapitools.server.api.model.CatalogsProductGroupMultipleStringCriteria](docs/CatalogsProductGroupMultipleStringCriteria.md)
         - [org.openapitools.server.api.model.CatalogsProductGroupMultipleStringListCriteria](docs/CatalogsProductGroupMultipleStringListCriteria.md)
         - [org.openapitools.server.api.model.CatalogsProductGroupPricingCriteria](docs/CatalogsProductGroupPricingCriteria.md)
         - [org.openapitools.server.api.model.CatalogsProductGroupStatus](docs/CatalogsProductGroupStatus.md)
         - [org.openapitools.server.api.model.CatalogsProductGroupType](docs/CatalogsProductGroupType.md)
         - [org.openapitools.server.api.model.CatalogsProductGroupUpdateRequest](docs/CatalogsProductGroupUpdateRequest.md)
         - [org.openapitools.server.api.model.CatalogsStatus](docs/CatalogsStatus.md)
         - [org.openapitools.server.api.model.ConditionFilter](docs/ConditionFilter.md)
         - [org.openapitools.server.api.model.ConversionAttributionWindowDays](docs/ConversionAttributionWindowDays.md)
         - [org.openapitools.server.api.model.ConversionReportAttributionType](docs/ConversionReportAttributionType.md)
         - [org.openapitools.server.api.model.ConversionReportTimeType](docs/ConversionReportTimeType.md)
         - [org.openapitools.server.api.model.Country](docs/Country.md)
         - [org.openapitools.server.api.model.Currency](docs/Currency.md)
         - [org.openapitools.server.api.model.CurrencyFilter](docs/CurrencyFilter.md)
         - [org.openapitools.server.api.model.CustomLabel0Filter](docs/CustomLabel0Filter.md)
         - [org.openapitools.server.api.model.CustomLabel1Filter](docs/CustomLabel1Filter.md)
         - [org.openapitools.server.api.model.CustomLabel2Filter](docs/CustomLabel2Filter.md)
         - [org.openapitools.server.api.model.CustomLabel3Filter](docs/CustomLabel3Filter.md)
         - [org.openapitools.server.api.model.CustomLabel4Filter](docs/CustomLabel4Filter.md)
         - [org.openapitools.server.api.model.DataOutputFormat](docs/DataOutputFormat.md)
         - [org.openapitools.server.api.model.EntityStatus](docs/EntityStatus.md)
         - [org.openapitools.server.api.model.Error](docs/Error.md)
         - [org.openapitools.server.api.model.FeedFields](docs/FeedFields.md)
         - [org.openapitools.server.api.model.GenderFilter](docs/GenderFilter.md)
         - [org.openapitools.server.api.model.GoogleProductCategory0Filter](docs/GoogleProductCategory0Filter.md)
         - [org.openapitools.server.api.model.GoogleProductCategory1Filter](docs/GoogleProductCategory1Filter.md)
         - [org.openapitools.server.api.model.GoogleProductCategory2Filter](docs/GoogleProductCategory2Filter.md)
         - [org.openapitools.server.api.model.GoogleProductCategory3Filter](docs/GoogleProductCategory3Filter.md)
         - [org.openapitools.server.api.model.GoogleProductCategory4Filter](docs/GoogleProductCategory4Filter.md)
         - [org.openapitools.server.api.model.GoogleProductCategory5Filter](docs/GoogleProductCategory5Filter.md)
         - [org.openapitools.server.api.model.GoogleProductCategory6Filter](docs/GoogleProductCategory6Filter.md)
         - [org.openapitools.server.api.model.Granularity](docs/Granularity.md)
         - [org.openapitools.server.api.model.ImageDetails](docs/ImageDetails.md)
         - [org.openapitools.server.api.model.ItemAttributes](docs/ItemAttributes.md)
         - [org.openapitools.server.api.model.ItemBatchRecord](docs/ItemBatchRecord.md)
         - [org.openapitools.server.api.model.ItemGroupIdFilter](docs/ItemGroupIdFilter.md)
         - [org.openapitools.server.api.model.ItemIdFilter](docs/ItemIdFilter.md)
         - [org.openapitools.server.api.model.ItemProcessingRecord](docs/ItemProcessingRecord.md)
         - [org.openapitools.server.api.model.ItemProcessingStatus](docs/ItemProcessingStatus.md)
         - [org.openapitools.server.api.model.ItemValidationEvent](docs/ItemValidationEvent.md)
         - [org.openapitools.server.api.model.Language](docs/Language.md)
         - [org.openapitools.server.api.model.MaxPriceFilter](docs/MaxPriceFilter.md)
         - [org.openapitools.server.api.model.MediaUpload](docs/MediaUpload.md)
         - [org.openapitools.server.api.model.MediaUploadAllOf](docs/MediaUploadAllOf.md)
         - [org.openapitools.server.api.model.MediaUploadAllOfUploadParameters](docs/MediaUploadAllOfUploadParameters.md)
         - [org.openapitools.server.api.model.MediaUploadDetails](docs/MediaUploadDetails.md)
         - [org.openapitools.server.api.model.MediaUploadRequest](docs/MediaUploadRequest.md)
         - [org.openapitools.server.api.model.MediaUploadStatus](docs/MediaUploadStatus.md)
         - [org.openapitools.server.api.model.MediaUploadType](docs/MediaUploadType.md)
         - [org.openapitools.server.api.model.MetricsReportingLevel](docs/MetricsReportingLevel.md)
         - [org.openapitools.server.api.model.MinPriceFilter](docs/MinPriceFilter.md)
         - [org.openapitools.server.api.model.NonNullableCatalogsCurrency](docs/NonNullableCatalogsCurrency.md)
         - [org.openapitools.server.api.model.NullableCurrency](docs/NullableCurrency.md)
         - [org.openapitools.server.api.model.OauthAccessTokenRequestCode](docs/OauthAccessTokenRequestCode.md)
         - [org.openapitools.server.api.model.OauthAccessTokenRequestCodeAllOf](docs/OauthAccessTokenRequestCodeAllOf.md)
         - [org.openapitools.server.api.model.OauthAccessTokenRequestRefresh](docs/OauthAccessTokenRequestRefresh.md)
         - [org.openapitools.server.api.model.OauthAccessTokenRequestRefreshAllOf](docs/OauthAccessTokenRequestRefreshAllOf.md)
         - [org.openapitools.server.api.model.OauthAccessTokenResponse](docs/OauthAccessTokenResponse.md)
         - [org.openapitools.server.api.model.OauthAccessTokenResponseCode](docs/OauthAccessTokenResponseCode.md)
         - [org.openapitools.server.api.model.OauthAccessTokenResponseCodeAllOf](docs/OauthAccessTokenResponseCodeAllOf.md)
         - [org.openapitools.server.api.model.OauthAccessTokenResponseRefresh](docs/OauthAccessTokenResponseRefresh.md)
         - [org.openapitools.server.api.model.ObjectiveType](docs/ObjectiveType.md)
         - [org.openapitools.server.api.model.PacingDeliveryType](docs/PacingDeliveryType.md)
         - [org.openapitools.server.api.model.Paginated](docs/Paginated.md)
         - [org.openapitools.server.api.model.Pin](docs/Pin.md)
         - [org.openapitools.server.api.model.PinMedia](docs/PinMedia.md)
         - [org.openapitools.server.api.model.PinMediaSource](docs/PinMediaSource.md)
         - [org.openapitools.server.api.model.PinMediaSourceImageBase64](docs/PinMediaSourceImageBase64.md)
         - [org.openapitools.server.api.model.PinMediaSourceImageURL](docs/PinMediaSourceImageURL.md)
         - [org.openapitools.server.api.model.PinMediaSourceVideoID](docs/PinMediaSourceVideoID.md)
         - [org.openapitools.server.api.model.PinMediaWithImage](docs/PinMediaWithImage.md)
         - [org.openapitools.server.api.model.PinMediaWithImageAllOf](docs/PinMediaWithImageAllOf.md)
         - [org.openapitools.server.api.model.PinPromotionSummaryStatus](docs/PinPromotionSummaryStatus.md)
         - [org.openapitools.server.api.model.PlacementGroupType](docs/PlacementGroupType.md)
         - [org.openapitools.server.api.model.ProductAvailabilityType](docs/ProductAvailabilityType.md)
         - [org.openapitools.server.api.model.ProductGroupSummaryStatus](docs/ProductGroupSummaryStatus.md)
         - [org.openapitools.server.api.model.ProductType0Filter](docs/ProductType0Filter.md)
         - [org.openapitools.server.api.model.ProductType1Filter](docs/ProductType1Filter.md)
         - [org.openapitools.server.api.model.ProductType2Filter](docs/ProductType2Filter.md)
         - [org.openapitools.server.api.model.ProductType3Filter](docs/ProductType3Filter.md)
         - [org.openapitools.server.api.model.ProductType4Filter](docs/ProductType4Filter.md)
         - [org.openapitools.server.api.model.ReportingColumnAsync](docs/ReportingColumnAsync.md)
         - [org.openapitools.server.api.model.TargetingTypeFilter](docs/TargetingTypeFilter.md)
         - [org.openapitools.server.api.model.TrackingUrls](docs/TrackingUrls.md)
        

<a name="documentation-for-authorization"></a>
## Documentation for Authorization

    <a name="basic"></a>
    ### basic

        - **Type**: HTTP basic authentication
    
    <a name="pinterest_oauth2"></a>
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

