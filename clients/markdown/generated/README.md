# Documentation for Pinterest REST API

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://api.pinterest.com/v5*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AdAccountsApi* | [**adAccount/analytics**](Apis/AdAccountsApi.md#adaccount/analytics) | **GET** /ad_accounts/{ad_account_id}/analytics | Get ad account analytics
*AdAccountsApi* | [**adAccounts/list**](Apis/AdAccountsApi.md#adaccounts/list) | **GET** /ad_accounts | List ad accounts
*AdAccountsApi* | [**adGroups/analytics**](Apis/AdAccountsApi.md#adgroups/analytics) | **GET** /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics
*AdAccountsApi* | [**adGroups/list**](Apis/AdAccountsApi.md#adgroups/list) | **GET** /ad_accounts/{ad_account_id}/ad_groups | List ad groups
*AdAccountsApi* | [**ads/analytics**](Apis/AdAccountsApi.md#ads/analytics) | **GET** /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics
*AdAccountsApi* | [**ads/list**](Apis/AdAccountsApi.md#ads/list) | **GET** /ad_accounts/{ad_account_id}/ads | List ads
*AdAccountsApi* | [**analytics/createReport**](Apis/AdAccountsApi.md#analytics/createreport) | **POST** /ad_accounts/{ad_account_id}/reports | Create async request for an account analytics report
*AdAccountsApi* | [**analytics/getReport**](Apis/AdAccountsApi.md#analytics/getreport) | **GET** /ad_accounts/{ad_account_id}/reports | Get the account analytics report created by the async call
*AdAccountsApi* | [**campaigns/analytics**](Apis/AdAccountsApi.md#campaigns/analytics) | **GET** /ad_accounts/{ad_account_id}/campaigns/analytics | Get campaign analytics
*AdAccountsApi* | [**campaigns/list**](Apis/AdAccountsApi.md#campaigns/list) | **GET** /ad_accounts/{ad_account_id}/campaigns | List campaigns
*AdAccountsApi* | [**productGroups/analytics**](Apis/AdAccountsApi.md#productgroups/analytics) | **GET** /ad_accounts/{ad_account_id}/product_groups/analytics | Get product group analytics
*BoardsApi* | [**boardSections/create**](Apis/BoardsApi.md#boardsections/create) | **POST** /boards/{board_id}/sections | Create board section
*BoardsApi* | [**boardSections/delete**](Apis/BoardsApi.md#boardsections/delete) | **DELETE** /boards/{board_id}/sections/{section_id} | Delete board section
*BoardsApi* | [**boardSections/list**](Apis/BoardsApi.md#boardsections/list) | **GET** /boards/{board_id}/sections | List board sections
*BoardsApi* | [**boardSections/listPins**](Apis/BoardsApi.md#boardsections/listpins) | **GET** /boards/{board_id}/sections/{section_id}/pins | List Pins on board section
*BoardsApi* | [**boardSections/update**](Apis/BoardsApi.md#boardsections/update) | **PATCH** /boards/{board_id}/sections/{section_id} | Update board section
*BoardsApi* | [**boards/create**](Apis/BoardsApi.md#boards/create) | **POST** /boards | Create board
*BoardsApi* | [**boards/delete**](Apis/BoardsApi.md#boards/delete) | **DELETE** /boards/{board_id} | Delete board
*BoardsApi* | [**boards/get**](Apis/BoardsApi.md#boards/get) | **GET** /boards/{board_id} | Get board
*BoardsApi* | [**boards/list**](Apis/BoardsApi.md#boards/list) | **GET** /boards | List boards
*BoardsApi* | [**boards/listPins**](Apis/BoardsApi.md#boards/listpins) | **GET** /boards/{board_id}/pins | List Pins on board
*BoardsApi* | [**boards/update**](Apis/BoardsApi.md#boards/update) | **PATCH** /boards/{board_id} | Update board
*CatalogsApi* | [**catalogsProductGroups/create**](Apis/CatalogsApi.md#catalogsproductgroups/create) | **POST** /catalogs/product_groups | Create product group
*CatalogsApi* | [**catalogsProductGroups/delete**](Apis/CatalogsApi.md#catalogsproductgroups/delete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group
*CatalogsApi* | [**catalogsProductGroups/list**](Apis/CatalogsApi.md#catalogsproductgroups/list) | **GET** /catalogs/product_groups | Get product groups list
*CatalogsApi* | [**catalogsProductGroups/update**](Apis/CatalogsApi.md#catalogsproductgroups/update) | **PATCH** /catalogs/product_groups/{product_group_id} | Update product group
*CatalogsApi* | [**feedProcessingResults/list**](Apis/CatalogsApi.md#feedprocessingresults/list) | **GET** /catalogs/feeds/{feed_id}/processing_results | List processing results for a given feed
*CatalogsApi* | [**feeds/create**](Apis/CatalogsApi.md#feeds/create) | **POST** /catalogs/feeds | Create feed
*CatalogsApi* | [**feeds/delete**](Apis/CatalogsApi.md#feeds/delete) | **DELETE** /catalogs/feeds/{feed_id} | Delete feed
*CatalogsApi* | [**feeds/get**](Apis/CatalogsApi.md#feeds/get) | **GET** /catalogs/feeds/{feed_id} | Get feed
*CatalogsApi* | [**feeds/list**](Apis/CatalogsApi.md#feeds/list) | **GET** /catalogs/feeds | List feeds
*CatalogsApi* | [**feeds/update**](Apis/CatalogsApi.md#feeds/update) | **PATCH** /catalogs/feeds/{feed_id} | Update feed
*CatalogsApi* | [**items/get**](Apis/CatalogsApi.md#items/get) | **GET** /catalogs/items | Get catalogs items
*CatalogsApi* | [**itemsBatch/get**](Apis/CatalogsApi.md#itemsbatch/get) | **GET** /catalogs/items/batch/{batch_id} | Get catalogs items batch
*CatalogsApi* | [**itemsBatch/post**](Apis/CatalogsApi.md#itemsbatch/post) | **POST** /catalogs/items/batch | Perform an operation on an item batch
*MediaApi* | [**media/create**](Apis/MediaApi.md#media/create) | **POST** /media | Register media upload
*MediaApi* | [**media/get**](Apis/MediaApi.md#media/get) | **GET** /media/{media_id} | Get media upload details
*MediaApi* | [**media/list**](Apis/MediaApi.md#media/list) | **GET** /media | List media uploads
*OauthApi* | [**oauth/token**](Apis/OauthApi.md#oauth/token) | **POST** /oauth/token | Generate OAuth access token
*PinsApi* | [**pins/analytics**](Apis/PinsApi.md#pins/analytics) | **GET** /pins/{pin_id}/analytics | Get Pin analytics
*PinsApi* | [**pins/create**](Apis/PinsApi.md#pins/create) | **POST** /pins | Create Pin
*PinsApi* | [**pins/delete**](Apis/PinsApi.md#pins/delete) | **DELETE** /pins/{pin_id} | Delete Pin
*PinsApi* | [**pins/get**](Apis/PinsApi.md#pins/get) | **GET** /pins/{pin_id} | Get Pin
*UserAccountApi* | [**userAccount/analytics**](Apis/UserAccountApi.md#useraccount/analytics) | **GET** /user_account/analytics | Get user account analytics
*UserAccountApi* | [**userAccount/get**](Apis/UserAccountApi.md#useraccount/get) | **GET** /user_account | Get user account


<a name="documentation-for-models"></a>
## Documentation for Models

 - [Account](./Models/Account.md)
 - [ActionType](./Models/ActionType.md)
 - [AdAccount](./Models/AdAccount.md)
 - [AdGroupResponse](./Models/AdGroupResponse.md)
 - [AdGroupResponse_allOf](./Models/AdGroupResponse_allOf.md)
 - [AdGroupResponse_allOf_1](./Models/AdGroupResponse_allOf_1.md)
 - [AdGroupSummaryStatus](./Models/AdGroupSummaryStatus.md)
 - [AdResponse](./Models/AdResponse.md)
 - [AdResponse_allOf](./Models/AdResponse_allOf.md)
 - [AdResponse_allOf_1](./Models/AdResponse_allOf_1.md)
 - [Ad_account_owner](./Models/Ad_account_owner.md)
 - [AdsAnalyticsCreateAsyncRequest](./Models/AdsAnalyticsCreateAsyncRequest.md)
 - [AdsAnalyticsCreateAsyncRequest_allOf](./Models/AdsAnalyticsCreateAsyncRequest_allOf.md)
 - [AdsAnalyticsCreateAsyncRequest_allOf_1](./Models/AdsAnalyticsCreateAsyncRequest_allOf_1.md)
 - [AdsAnalyticsCreateAsyncResponse](./Models/AdsAnalyticsCreateAsyncResponse.md)
 - [AdsAnalyticsFilterColumn](./Models/AdsAnalyticsFilterColumn.md)
 - [AdsAnalyticsFilterOperator](./Models/AdsAnalyticsFilterOperator.md)
 - [AdsAnalyticsGetAsyncResponse](./Models/AdsAnalyticsGetAsyncResponse.md)
 - [AdsAnalyticsMetricsFilter](./Models/AdsAnalyticsMetricsFilter.md)
 - [AdsAnalyticsTargetingType](./Models/AdsAnalyticsTargetingType.md)
 - [AnalyticsMetricsResponse](./Models/AnalyticsMetricsResponse.md)
 - [AnalyticsMetricsResponse_daily_metrics](./Models/AnalyticsMetricsResponse_daily_metrics.md)
 - [AvailabilityFilter](./Models/AvailabilityFilter.md)
 - [BatchOperation](./Models/BatchOperation.md)
 - [BatchOperationStatus](./Models/BatchOperationStatus.md)
 - [Board](./Models/Board.md)
 - [BoardOwner](./Models/BoardOwner.md)
 - [BoardSection](./Models/BoardSection.md)
 - [BoardUpdate](./Models/BoardUpdate.md)
 - [BrandFilter](./Models/BrandFilter.md)
 - [CampaignCommon](./Models/CampaignCommon.md)
 - [CampaignResponse](./Models/CampaignResponse.md)
 - [CampaignResponse_allOf](./Models/CampaignResponse_allOf.md)
 - [CampaignResponse_allOf_1](./Models/CampaignResponse_allOf_1.md)
 - [CampaignSummaryStatus](./Models/CampaignSummaryStatus.md)
 - [CatalogsDbItem](./Models/CatalogsDbItem.md)
 - [CatalogsFeed](./Models/CatalogsFeed.md)
 - [CatalogsFeedCredentials](./Models/CatalogsFeedCredentials.md)
 - [CatalogsFeedIngestionDetails](./Models/CatalogsFeedIngestionDetails.md)
 - [CatalogsFeedIngestionErrors](./Models/CatalogsFeedIngestionErrors.md)
 - [CatalogsFeedIngestionInfo](./Models/CatalogsFeedIngestionInfo.md)
 - [CatalogsFeedProcessingResult](./Models/CatalogsFeedProcessingResult.md)
 - [CatalogsFeedProcessingSchedule](./Models/CatalogsFeedProcessingSchedule.md)
 - [CatalogsFeedProcessingStatus](./Models/CatalogsFeedProcessingStatus.md)
 - [CatalogsFeedProductCounts](./Models/CatalogsFeedProductCounts.md)
 - [CatalogsFeedValidationDetails](./Models/CatalogsFeedValidationDetails.md)
 - [CatalogsFeedValidationErrors](./Models/CatalogsFeedValidationErrors.md)
 - [CatalogsFeedValidationWarnings](./Models/CatalogsFeedValidationWarnings.md)
 - [CatalogsFeedsCreateRequest](./Models/CatalogsFeedsCreateRequest.md)
 - [CatalogsFeedsUpdateRequest](./Models/CatalogsFeedsUpdateRequest.md)
 - [CatalogsFormat](./Models/CatalogsFormat.md)
 - [CatalogsItems](./Models/CatalogsItems.md)
 - [CatalogsItemsBatch](./Models/CatalogsItemsBatch.md)
 - [CatalogsItemsBatchRequest](./Models/CatalogsItemsBatchRequest.md)
 - [CatalogsProductGroup](./Models/CatalogsProductGroup.md)
 - [CatalogsProductGroupCreateRequest](./Models/CatalogsProductGroupCreateRequest.md)
 - [CatalogsProductGroupCurrencyCriteria](./Models/CatalogsProductGroupCurrencyCriteria.md)
 - [CatalogsProductGroupFilterKeys](./Models/CatalogsProductGroupFilterKeys.md)
 - [CatalogsProductGroupFilters](./Models/CatalogsProductGroupFilters.md)
 - [CatalogsProductGroupFiltersAllOf](./Models/CatalogsProductGroupFiltersAllOf.md)
 - [CatalogsProductGroupFiltersAnyOf](./Models/CatalogsProductGroupFiltersAnyOf.md)
 - [CatalogsProductGroupMultipleStringCriteria](./Models/CatalogsProductGroupMultipleStringCriteria.md)
 - [CatalogsProductGroupMultipleStringListCriteria](./Models/CatalogsProductGroupMultipleStringListCriteria.md)
 - [CatalogsProductGroupPricingCriteria](./Models/CatalogsProductGroupPricingCriteria.md)
 - [CatalogsProductGroupStatus](./Models/CatalogsProductGroupStatus.md)
 - [CatalogsProductGroupType](./Models/CatalogsProductGroupType.md)
 - [CatalogsProductGroupUpdateRequest](./Models/CatalogsProductGroupUpdateRequest.md)
 - [CatalogsStatus](./Models/CatalogsStatus.md)
 - [ConditionFilter](./Models/ConditionFilter.md)
 - [ConversionAttributionWindowDays](./Models/ConversionAttributionWindowDays.md)
 - [ConversionReportAttributionType](./Models/ConversionReportAttributionType.md)
 - [ConversionReportTimeType](./Models/ConversionReportTimeType.md)
 - [Country](./Models/Country.md)
 - [Currency](./Models/Currency.md)
 - [CurrencyFilter](./Models/CurrencyFilter.md)
 - [CustomLabel0Filter](./Models/CustomLabel0Filter.md)
 - [CustomLabel1Filter](./Models/CustomLabel1Filter.md)
 - [CustomLabel2Filter](./Models/CustomLabel2Filter.md)
 - [CustomLabel3Filter](./Models/CustomLabel3Filter.md)
 - [CustomLabel4Filter](./Models/CustomLabel4Filter.md)
 - [DataOutputFormat](./Models/DataOutputFormat.md)
 - [EntityStatus](./Models/EntityStatus.md)
 - [Error](./Models/Error.md)
 - [GenderFilter](./Models/GenderFilter.md)
 - [GoogleProductCategory0Filter](./Models/GoogleProductCategory0Filter.md)
 - [GoogleProductCategory1Filter](./Models/GoogleProductCategory1Filter.md)
 - [GoogleProductCategory2Filter](./Models/GoogleProductCategory2Filter.md)
 - [GoogleProductCategory3Filter](./Models/GoogleProductCategory3Filter.md)
 - [GoogleProductCategory4Filter](./Models/GoogleProductCategory4Filter.md)
 - [GoogleProductCategory5Filter](./Models/GoogleProductCategory5Filter.md)
 - [GoogleProductCategory6Filter](./Models/GoogleProductCategory6Filter.md)
 - [Granularity](./Models/Granularity.md)
 - [ImageDetails](./Models/ImageDetails.md)
 - [ItemAttributes](./Models/ItemAttributes.md)
 - [ItemBatchRecord](./Models/ItemBatchRecord.md)
 - [ItemGroupIdFilter](./Models/ItemGroupIdFilter.md)
 - [ItemIdFilter](./Models/ItemIdFilter.md)
 - [ItemProcessingRecord](./Models/ItemProcessingRecord.md)
 - [ItemProcessingStatus](./Models/ItemProcessingStatus.md)
 - [ItemValidationEvent](./Models/ItemValidationEvent.md)
 - [Language](./Models/Language.md)
 - [MaxPriceFilter](./Models/MaxPriceFilter.md)
 - [MediaUpload](./Models/MediaUpload.md)
 - [MediaUploadDetails](./Models/MediaUploadDetails.md)
 - [MediaUploadRequest](./Models/MediaUploadRequest.md)
 - [MediaUploadStatus](./Models/MediaUploadStatus.md)
 - [MediaUploadType](./Models/MediaUploadType.md)
 - [MediaUpload_allOf](./Models/MediaUpload_allOf.md)
 - [MediaUpload_allOf_upload_parameters](./Models/MediaUpload_allOf_upload_parameters.md)
 - [MetricsReportingLevel](./Models/MetricsReportingLevel.md)
 - [MinPriceFilter](./Models/MinPriceFilter.md)
 - [NonNullableCatalogsCurrency](./Models/NonNullableCatalogsCurrency.md)
 - [NullableCurrency](./Models/NullableCurrency.md)
 - [OauthAccessTokenRequestCode](./Models/OauthAccessTokenRequestCode.md)
 - [OauthAccessTokenRequestCode_allOf](./Models/OauthAccessTokenRequestCode_allOf.md)
 - [OauthAccessTokenRequestRefresh](./Models/OauthAccessTokenRequestRefresh.md)
 - [OauthAccessTokenRequestRefresh_allOf](./Models/OauthAccessTokenRequestRefresh_allOf.md)
 - [OauthAccessTokenResponse](./Models/OauthAccessTokenResponse.md)
 - [OauthAccessTokenResponseCode](./Models/OauthAccessTokenResponseCode.md)
 - [OauthAccessTokenResponseCode_allOf](./Models/OauthAccessTokenResponseCode_allOf.md)
 - [OauthAccessTokenResponseRefresh](./Models/OauthAccessTokenResponseRefresh.md)
 - [ObjectiveType](./Models/ObjectiveType.md)
 - [PacingDeliveryType](./Models/PacingDeliveryType.md)
 - [Paginated](./Models/Paginated.md)
 - [Pin](./Models/Pin.md)
 - [PinMedia](./Models/PinMedia.md)
 - [PinMediaSource](./Models/PinMediaSource.md)
 - [PinMediaSourceImageBase64](./Models/PinMediaSourceImageBase64.md)
 - [PinMediaSourceImageURL](./Models/PinMediaSourceImageURL.md)
 - [PinMediaSourceVideoID](./Models/PinMediaSourceVideoID.md)
 - [PinMediaWithImage](./Models/PinMediaWithImage.md)
 - [PinMediaWithImage_allOf](./Models/PinMediaWithImage_allOf.md)
 - [PinPromotionSummaryStatus](./Models/PinPromotionSummaryStatus.md)
 - [PlacementGroupType](./Models/PlacementGroupType.md)
 - [ProductAvailabilityType](./Models/ProductAvailabilityType.md)
 - [ProductGroupSummaryStatus](./Models/ProductGroupSummaryStatus.md)
 - [ProductType0Filter](./Models/ProductType0Filter.md)
 - [ProductType1Filter](./Models/ProductType1Filter.md)
 - [ProductType2Filter](./Models/ProductType2Filter.md)
 - [ProductType3Filter](./Models/ProductType3Filter.md)
 - [ProductType4Filter](./Models/ProductType4Filter.md)
 - [ReportingColumnAsync](./Models/ReportingColumnAsync.md)
 - [TargetingTypeFilter](./Models/TargetingTypeFilter.md)
 - [TrackingUrls](./Models/TrackingUrls.md)
 - [catalogs_feed_processing_result_fields](./Models/catalogs_feed_processing_result_fields.md)
 - [feed_fields](./Models/feed_fields.md)


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

