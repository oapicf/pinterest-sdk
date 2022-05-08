# Documentation for OpenAPI Petstore
This is a client generator for microcontrollers on the Espressif32 platform and the Arduino framework
After the client have been generated, you have to change these following variables:
- root.cert | Provide your service root certificate.
- src/main.cpp | Change wifi name
- src/main.cpp | Change wifi password
- lib/service/AbstractService.h | Change to your url

# Documentation for Pinterest REST API 5.3.0 Tiny client cpp (Arduino) 

The project is structured like this:
```
samples/client/petstore/tiny/cpp/
├── lib
│   ├── Models
│   ├── service
│   └── TestFiles
├── platformio.ini
├── pre_compiling_bourne.py
├── README.md
├── root.cert
├── src
│   └── main.cpp
└── test
    └── RunTests.cpp
```

All URIs are relative to https://api.pinterest.comhttps://api.pinterest.com/v5

### AdAccountsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*adAccount_analytics* | *GET* /ad_accounts/{ad_account_id}/analytics | Get ad account analytics.|
|*adAccounts_list* | *GET* /ad_accounts | List ad accounts.|
|*adGroups_analytics* | *GET* /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics.|
|*adGroups_list* | *GET* /ad_accounts/{ad_account_id}/ad_groups | List ad groups.|
|*ads_analytics* | *GET* /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics.|
|*ads_list* | *GET* /ad_accounts/{ad_account_id}/ads | List ads.|
|*analytics_createReport* | *POST* /ad_accounts/{ad_account_id}/reports | Create async request for an account analytics report.|
|*analytics_getReport* | *GET* /ad_accounts/{ad_account_id}/reports | Get the account analytics report created by the async call.|
|*campaigns_analytics* | *GET* /ad_accounts/{ad_account_id}/campaigns/analytics | Get campaign analytics.|
|*campaigns_list* | *GET* /ad_accounts/{ad_account_id}/campaigns | List campaigns.|
|*productGroups_analytics* | *GET* /ad_accounts/{ad_account_id}/product_groups/analytics | Get product group analytics.|

### BoardsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*boardSections_create* | *POST* /boards/{board_id}/sections | Create board section.|
|*boardSections_delete* | *DELETE* /boards/{board_id}/sections/{section_id} | Delete board section.|
|*boardSections_list* | *GET* /boards/{board_id}/sections | List board sections.|
|*boardSections_listPins* | *GET* /boards/{board_id}/sections/{section_id}/pins | List Pins on board section.|
|*boardSections_update* | *PATCH* /boards/{board_id}/sections/{section_id} | Update board section.|
|*boards_create* | *POST* /boards | Create board.|
|*boards_delete* | *DELETE* /boards/{board_id} | Delete board.|
|*boards_get* | *GET* /boards/{board_id} | Get board.|
|*boards_list* | *GET* /boards | List boards.|
|*boards_listPins* | *GET* /boards/{board_id}/pins | List Pins on board.|
|*boards_update* | *PATCH* /boards/{board_id} | Update board.|

### CatalogsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*catalogsProductGroups_create* | *POST* /catalogs/product_groups | Create product group.|
|*catalogsProductGroups_delete* | *DELETE* /catalogs/product_groups/{product_group_id} | Delete product group.|
|*catalogsProductGroups_list* | *GET* /catalogs/product_groups | Get product groups list.|
|*catalogsProductGroups_update* | *PATCH* /catalogs/product_groups/{product_group_id} | Update product group.|
|*feedProcessingResults_list* | *GET* /catalogs/feeds/{feed_id}/processing_results | List processing results for a given feed.|
|*feeds_create* | *POST* /catalogs/feeds | Create feed.|
|*feeds_delete* | *DELETE* /catalogs/feeds/{feed_id} | Delete feed.|
|*feeds_get* | *GET* /catalogs/feeds/{feed_id} | Get feed.|
|*feeds_list* | *GET* /catalogs/feeds | List feeds.|
|*feeds_update* | *PATCH* /catalogs/feeds/{feed_id} | Update feed.|
|*itemsBatch_get* | *GET* /catalogs/items/batch/{batch_id} | Get catalogs items batch.|
|*itemsBatch_post* | *POST* /catalogs/items/batch | Perform an operation on an item batch.|
|*items_get* | *GET* /catalogs/items | Get catalogs items.|

### MediaApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*media_create* | *POST* /media | Register media upload.|
|*media_get* | *GET* /media/{media_id} | Get media upload details.|
|*media_list* | *GET* /media | List media uploads.|

### OauthApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*oauth_token* | *POST* /oauth/token | Generate OAuth access token.|

### PinsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*pins_analytics* | *GET* /pins/{pin_id}/analytics | Get Pin analytics.|
|*pins_create* | *POST* /pins | Create Pin.|
|*pins_delete* | *DELETE* /pins/{pin_id} | Delete Pin.|
|*pins_get* | *GET* /pins/{pin_id} | Get Pin.|

### UserAccountApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*userAccount_analytics* | *GET* /user_account/analytics | Get user account analytics.|
|*userAccount_get* | *GET* /user_account | Get user account.|


## What are the Model files for the data structures/objects?
|Class | Description|
|------------- | -------------|
|*Account* | |
|*ActionType* | Ad group billable event type.|
|*AdAccount* | |
|*AdGroupResponse* | |
|*AdGroupResponse_allOf* | |
|*AdGroupResponse_allOf_1* | |
|*AdGroupSummaryStatus* | Summary status for ad group|
|*AdResponse* | |
|*AdResponse_allOf* | Creation fields|
|*AdResponse_allOf_1* | |
|*Ad_account_owner* | |
|*AdsAnalyticsCreateAsyncRequest* | |
|*AdsAnalyticsCreateAsyncRequest_allOf* | |
|*AdsAnalyticsCreateAsyncRequest_allOf_1* | |
|*AdsAnalyticsCreateAsyncResponse* | |
|*AdsAnalyticsFilterColumn* | Reporting columns for sync reporting data filter|
|*AdsAnalyticsFilterOperator* | Filter operator for sync reporting|
|*AdsAnalyticsGetAsyncResponse* | |
|*AdsAnalyticsMetricsFilter* | |
|*AdsAnalyticsTargetingType* | Reporting targeting type|
|*AnalyticsMetricsResponse* | |
|*AnalyticsMetricsResponse_daily_metrics* | |
|*AvailabilityFilter* | |
|*BatchOperation* | The operation performed by the batch|
|*BatchOperationStatus* | The status of the operation performed by the batch|
|*Board* | Board|
|*BoardOwner* | |
|*BoardSection* | Sections help organize pins within a board.|
|*BoardUpdate* | Board fields for updates|
|*BrandFilter* | |
|*CampaignCommon* | Campaign Data|
|*CampaignResponse* | |
|*CampaignResponse_allOf* | |
|*CampaignResponse_allOf_1* | |
|*CampaignSummaryStatus* | Summary status for campaign|
|*CatalogsDbItem* | |
|*CatalogsFeed* | Catalogs Catalogs Feed object|
|*CatalogsFeedCredentials* | Use this if your feed file requires username and password.|
|*CatalogsFeedIngestionDetails* | |
|*CatalogsFeedIngestionErrors* | |
|*CatalogsFeedIngestionInfo* | |
|*CatalogsFeedProcessingResult* | |
|*CatalogsFeedProcessingSchedule* | Optional daily processing schedule. Use this to configure the preferred time for processing a feed (otherwise random).|
|*CatalogsFeedProcessingStatus* | |
|*CatalogsFeedProductCounts* | The counts can be null early in the process.|
|*CatalogsFeedValidationDetails* | |
|*CatalogsFeedValidationErrors* | |
|*CatalogsFeedValidationWarnings* | |
|*CatalogsFeedsCreateRequest* | Request object for creating a feed. Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.|
|*CatalogsFeedsUpdateRequest* | Request object for updating a feed.|
|*CatalogsFormat* | The file format of a feed.|
|*CatalogsItems* | Response object of catalogs items|
|*CatalogsItemsBatch* | Object describing the catalogs items batch|
|*CatalogsItemsBatchRequest* | Request object of catalogs items batch|
|*CatalogsProductGroup* | catalog product group entity|
|*CatalogsProductGroupCreateRequest* | Request object for creating a product group.|
|*CatalogsProductGroupCurrencyCriteria* | |
|*CatalogsProductGroupFilterKeys* | |
|*CatalogsProductGroupFilters* | Object holding a group of filters for a catalog product group|
|*CatalogsProductGroupFiltersAllOf* | |
|*CatalogsProductGroupFiltersAnyOf* | |
|*CatalogsProductGroupMultipleStringCriteria* | |
|*CatalogsProductGroupMultipleStringListCriteria* | |
|*CatalogsProductGroupPricingCriteria* | |
|*CatalogsProductGroupStatus* | |
|*CatalogsProductGroupType* | Catalog product group type|
|*CatalogsProductGroupUpdateRequest* | Request object for updating a product group.|
|*CatalogsStatus* | Status for catalogs entities. Present in catalogs_feed values. When a feed is deleted, the response will inform DELETED as status.|
|*Catalogs_feed_processing_result_fields* | |
|*ConditionFilter* | |
|*ConversionAttributionWindowDays* | |
|*ConversionReportAttributionType* | Attribution type. Refers to the Pinterest Tag endpoints|
|*ConversionReportTimeType* | Conversion report time type|
|*Country* | Country ID from ISO 3166-1 alpha-2.|
|*Currency* | Currency Codes from ISO 4217|
|*CurrencyFilter* | |
|*CustomLabel0Filter* | |
|*CustomLabel1Filter* | |
|*CustomLabel2Filter* | |
|*CustomLabel3Filter* | |
|*CustomLabel4Filter* | |
|*DataOutputFormat* | Format of generated report|
|*EntityStatus* | Entity status|
|*Error* | |
|*Feed_fields* | |
|*GenderFilter* | |
|*GoogleProductCategory0Filter* | |
|*GoogleProductCategory1Filter* | |
|*GoogleProductCategory2Filter* | |
|*GoogleProductCategory3Filter* | |
|*GoogleProductCategory4Filter* | |
|*GoogleProductCategory5Filter* | |
|*GoogleProductCategory6Filter* | |
|*Granularity* | |
|*ImageDetails* | |
|*ItemAttributes* | |
|*ItemBatchRecord* | Object describing an item batch record|
|*ItemGroupIdFilter* | |
|*ItemIdFilter* | |
|*ItemProcessingRecord* | Object describing an item processing record|
|*ItemProcessingStatus* | The status of the item processing record|
|*ItemValidationEvent* | Object describing an item validation event|
|*Language* | Language code, which is among the offical ISO 639-1 language list.|
|*MaxPriceFilter* | |
|*MediaUpload* | Media upload that has been registered but not uploaded/processed yet.|
|*MediaUploadDetails* | Media upload details|
|*MediaUploadRequest* | Media upload request|
|*MediaUploadStatus* | Media upload status|
|*MediaUploadType* | |
|*MediaUpload_allOf* | |
|*MediaUpload_allOf_upload_parameters* | The list of parameter key/value pairs you will need to send with your POST request to upload your media file.|
|*MetricsReportingLevel* | Level of the reporting request|
|*MinPriceFilter* | |
|*NonNullableCatalogsCurrency* | Currency Codes from ISO 4217.|
|*NullableCurrency* | Currency Codes from ISO 4217.|
|*OauthAccessTokenRequest* | Describes the valid schema for possible OAuth access token requests.|
|*OauthAccessTokenRequestCode* | A request to exchange an authorization code for an access token.|
|*OauthAccessTokenRequestCode_allOf* | |
|*OauthAccessTokenRequestRefresh* | A request to exchange a refresh token for a new access token.|
|*OauthAccessTokenRequestRefresh_allOf* | |
|*OauthAccessTokenResponse* | A successful OAuth access token response.|
|*OauthAccessTokenResponseCode* | A successful OAuth access token response for the authorization code flow.|
|*OauthAccessTokenResponseCode_allOf* | |
|*OauthAccessTokenResponseRefresh* | A successful OAuth access token response for the refresh token flow.|
|*ObjectiveType* | Campaign objective type.|
|*PacingDeliveryType* | Ad group pacing delivery type|
|*Paginated* | |
|*Pin* | Pin|
|*PinMedia* | Pin media objects.|
|*PinMediaSource* | Pin media source.|
|*PinMediaSourceImageBase64* | Base64-encoded image media source|
|*PinMediaSourceImageURL* | Image URL-based media source|
|*PinMediaSourceVideoID* | Video ID-based media source|
|*PinMediaWithImage* | Pin with image.|
|*PinMediaWithImage_allOf* | |
|*PinPromotionSummaryStatus* | Summary status for pin promotions|
|*PlacementGroupType* | Campaign placement group type|
|*ProductAvailabilityType* | Default availability for products in a feed.|
|*ProductGroupSummaryStatus* | Summary status for product group|
|*ProductType0Filter* | |
|*ProductType1Filter* | |
|*ProductType2Filter* | |
|*ProductType3Filter* | |
|*ProductType4Filter* | |
|*ReportingColumnAsync* | Reporting columns|
|*TargetingTypeFilter* | |
|*TrackingUrls* | Third-party tracking URLs. Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.|

