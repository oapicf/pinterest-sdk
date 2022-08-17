# Documentation for OpenAPI Petstore
This is a client generator for microcontrollers on the Espressif32 platform and the Arduino framework
After the client have been generated, you have to change these following variables:
- root.cert | Provide your service root certificate.
- src/main.cpp | Change wifi name
- src/main.cpp | Change wifi password
- lib/service/AbstractService.h | Change to your url

# Documentation for Pinterest REST API 5.4.1 Tiny client cpp (Arduino) 

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
|*adAccounts_create* | *POST* /ad_accounts | Create ad account.|
|*adAccounts_get* | *GET* /ad_accounts/{ad_account_id} | Get ad account.|
|*adAccounts_list* | *GET* /ad_accounts | List ad accounts.|
|*adGroups_analytics* | *GET* /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics.|
|*ads_analytics* | *GET* /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics.|
|*analytics_createReport* | *POST* /ad_accounts/{ad_account_id}/reports | Create async request for an account analytics report.|
|*analytics_getReport* | *GET* /ad_accounts/{ad_account_id}/reports | Get the account analytics report created by the async call.|
|*campaigns_analytics* | *GET* /ad_accounts/{ad_account_id}/campaigns/analytics | Get campaign analytics.|
|*productGroups_analytics* | *GET* /ad_accounts/{ad_account_id}/product_groups/analytics | Get product group analytics.|

### AdGroupsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*adGroupsBidFloor_get* | *POST* /ad_accounts/{ad_account_id}/bid_floor | Get bid floors.|
|*adGroups_create* | *POST* /ad_accounts/{ad_account_id}/ad_groups | Create ad groups.|
|*adGroups_get* | *GET* /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id} | Get ad group.|
|*adGroups_list* | *GET* /ad_accounts/{ad_account_id}/ad_groups | List ad groups.|
|*adGroups_update* | *PATCH* /ad_accounts/{ad_account_id}/ad_groups | Update ad groups.|

### AdsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*adPreviews_create* | *POST* /ad_accounts/{ad_account_id}/ad_previews | Create ad preview with pin or image.|
|*ads_create* | *POST* /ad_accounts/{ad_account_id}/ads | Create ads.|
|*ads_get* | *GET* /ad_accounts/{ad_account_id}/ads/{ad_id} | Get ad.|
|*ads_list* | *GET* /ad_accounts/{ad_account_id}/ads | List ads.|
|*ads_update* | *PATCH* /ad_accounts/{ad_account_id}/ads | Update ads.|

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

### CampaignsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*campaigns_create* | *POST* /ad_accounts/{ad_account_id}/campaigns | Create campaigns.|
|*campaigns_get* | *GET* /ad_accounts/{ad_account_id}/campaigns/{campaign_id} | Get campaign.|
|*campaigns_list* | *GET* /ad_accounts/{ad_account_id}/campaigns | List campaigns.|
|*campaigns_update* | *PATCH* /ad_accounts/{ad_account_id}/campaigns | Update campaigns.|

### CatalogsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*catalogsProductGroupPins_list* | *GET* /catalogs/product_groups/{product_group_id}/products | List products for a given product group.|
|*catalogsProductGroups_create* | *POST* /catalogs/product_groups | Create product group.|
|*catalogsProductGroups_delete* | *DELETE* /catalogs/product_groups/{product_group_id} | Delete product group.|
|*catalogsProductGroups_get* | *GET* /catalogs/product_groups/{product_group_id} | Get a product group.|
|*catalogsProductGroups_list* | *GET* /catalogs/product_groups | Get product groups list.|
|*catalogsProductGroups_productCountsGet* | *GET* /catalogs/product_groups/{product_group_id}/product_counts | Get product counts for a given product group.|
|*catalogsProductGroups_update* | *PATCH* /catalogs/product_groups/{product_group_id} | Update product group.|
|*feedProcessingResults_list* | *GET* /catalogs/feeds/{feed_id}/processing_results | List processing results for a given feed.|
|*feeds_create* | *POST* /catalogs/feeds | Create feed.|
|*feeds_delete* | *DELETE* /catalogs/feeds/{feed_id} | Delete feed.|
|*feeds_get* | *GET* /catalogs/feeds/{feed_id} | Get feed.|
|*feeds_list* | *GET* /catalogs/feeds | List feeds.|
|*feeds_update* | *PATCH* /catalogs/feeds/{feed_id} | Update feed.|
|*itemsBatch_get* | *GET* /catalogs/items/batch/{batch_id} | Get catalogs items batch.|
|*itemsBatch_post* | *POST* /catalogs/items/batch | Perform an operation on an item batch.|
|*itemsIssues_list* | *GET* /catalogs/processing_results/{processing_result_id}/item_issues | List item issues for a given processing result.|
|*items_get* | *GET* /catalogs/items | Get catalogs items.|
|*productsByProductGroupFilter_list* | *POST* /catalogs/products/get_by_product_group_filters | List products that meet the criteria of the filter you provide..|

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

### ProductGroupPromotionsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*productGroupPromotion_get* | *GET* /ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id} | Get a product group promotion by id.|
|*productGroupPromotions_create* | *POST* /ad_accounts/{ad_account_id}/product_group_promotions | Create product group promotions.|
|*productGroupPromotions_update* | *PATCH* /ad_accounts/{ad_account_id}/product_group_promotions | Update product group promotions.|

### TermsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*termsRelated_list* | *GET* /terms/related | List related terms.|
|*termsSuggested_list* | *GET* /terms/suggested | List suggested terms.|

### TermsOfServiceApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*termsOfService_get* | *GET* /ad_accounts/{ad_account_id}/terms_of_service | Get terms of service.|

### UserAccountApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*userAccount_analytics* | *GET* /user_account/analytics | Get user account analytics.|
|*userAccount_analytics_topPins* | *GET* /user_account/analytics/top_pins | Get user account top pins analytics.|
|*userAccount_analytics_topVideoPins* | *GET* /user_account/analytics/top_video_pins | Get user account top video pins analytics.|
|*userAccount_get* | *GET* /user_account | Get user account.|


## What are the Model files for the data structures/objects?
|Class | Description|
|------------- | -------------|
|*Account* | |
|*ActionType* | Ad group billable event type.|
|*AdAccount* | |
|*AdAccountAnalyticsResponse_inner* | |
|*AdAccountCreateRequest* | |
|*AdArrayResponse* | |
|*AdArrayResponseElement* | |
|*AdCommon* | Creation fields|
|*AdCommon_tracking_urls* | |
|*AdCreateRequest_inner* | |
|*AdGroupArrayResponse* | |
|*AdGroupArrayResponseElement* | |
|*AdGroupCommon* | |
|*AdGroupCommon_tracking_urls* | Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"https://developers.pinterest.com/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.|
|*AdGroupCreateRequest* | |
|*AdGroupCreateRequest_allOf* | |
|*AdGroupResponse* | |
|*AdGroupResponse_allOf* | |
|*AdGroupSummaryStatus* | Summary status for ad group|
|*AdGroupUpdateRequest* | |
|*AdGroupUpdateRequest_allOf* | |
|*AdGroupsAnalyticsResponse_inner* | |
|*AdPreviewCreateFromImage* | |
|*AdPreviewCreateFromPin* | |
|*AdPreviewRequest* | |
|*AdPreviewURLResponse* | |
|*AdResponse* | |
|*AdResponse_allOf* | |
|*AdUpdateRequest_1* | |
|*AdUpdateRequest_inner* | |
|*Ad_account_owner* | |
|*Ad_accounts_list_200_response* | |
|*Ad_accounts_list_200_response_allOf* | |
|*Ad_groups_list_200_response* | |
|*Ad_groups_list_200_response_allOf* | |
|*AdsAnalyticsCreateAsyncRequest* | |
|*AdsAnalyticsCreateAsyncRequest_allOf* | |
|*AdsAnalyticsCreateAsyncRequest_allOf_1* | |
|*AdsAnalyticsCreateAsyncResponse* | |
|*AdsAnalyticsFilterColumn* | Reporting columns for sync reporting data filter|
|*AdsAnalyticsFilterOperator* | Filter operator for sync reporting|
|*AdsAnalyticsGetAsyncResponse* | |
|*AdsAnalyticsMetricsFilter* | |
|*AdsAnalyticsResponse_inner* | |
|*AdsAnalyticsTargetingType* | Reporting targeting type|
|*Ads_list_200_response* | |
|*Ads_list_200_response_allOf* | |
|*AnalyticsMetricsResponse* | |
|*AnalyticsMetricsResponse_daily_metrics_inner* | |
|*AvailabilityFilter* | |
|*BatchOperation* | The operation performed by the batch|
|*BatchOperationStatus* | The status of the operation performed by the batch|
|*BidFloor* | |
|*BidFloorRequest* | |
|*BidFloorSpec* | |
|*Board* | Board|
|*BoardOwner* | |
|*BoardSection* | Sections help organize pins within a board.|
|*BoardUpdate* | Board fields for updates|
|*Board_owner* | |
|*Board_sections_list_200_response* | |
|*Board_sections_list_200_response_allOf* | |
|*Board_sections_list_pins_200_response* | |
|*Board_sections_list_pins_200_response_allOf* | |
|*Boards_list_200_response* | |
|*Boards_list_200_response_allOf* | |
|*BrandFilter* | |
|*BudgetType* | Budget type. If DAILY, an ad group's daily spend will not exceed the budget parameter value. If LIFETIME, the end_time parameter is **REQUIRED**, and the ad group spend is spread evenly between the ad group `start_time` and `end_time` range. A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome.|
|*CampaignCommon* | Campaign Data|
|*CampaignCreateCommon* | |
|*CampaignCreateCommon_allOf* | |
|*CampaignCreateRequest* | |
|*CampaignCreateResponse* | |
|*CampaignCreateResponseData* | |
|*CampaignCreateResponseItem* | |
|*CampaignId* | |
|*CampaignResponse* | |
|*CampaignResponse_allOf* | |
|*CampaignSummaryStatus* | Summary status for campaign|
|*CampaignUpdateRequest* | |
|*CampaignUpdateResponse* | |
|*CampaignsAnalyticsResponse_inner* | |
|*Campaigns_list_200_response* | |
|*Campaigns_list_200_response_allOf* | |
|*CatalogsDbItem* | |
|*CatalogsFeed* | Catalogs Feed object|
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
|*CatalogsItemValidationDetails* | |
|*CatalogsItemValidationErrors* | |
|*CatalogsItemValidationIssue* | |
|*CatalogsItemValidationIssues* | |
|*CatalogsItemValidationWarnings* | |
|*CatalogsItems* | Response object of catalogs items|
|*CatalogsItemsBatch* | Object describing the catalogs items batch|
|*CatalogsItemsBatchRequest* | Request object of catalogs items batch|
|*CatalogsListProductsByFilterRequest* | Request object to list products for a given product group filter.|
|*CatalogsListProductsByFilterRequest_oneOf* | Request object to list products for a given feed_id and product group filter.|
|*CatalogsProduct* | |
|*CatalogsProductGroup* | catalog product group entity|
|*CatalogsProductGroupCreateRequest* | Request object for creating a product group.|
|*CatalogsProductGroupCurrencyCriteria* | A currency filter. This filter cannot be negated|
|*CatalogsProductGroupFilterKeys* | |
|*CatalogsProductGroupFilters* | Object holding a group of filters for a catalog product group|
|*CatalogsProductGroupFiltersAllOf* | |
|*CatalogsProductGroupFiltersAllOfRequest* | Object holding a group of filters for request on catalog product group. This is a distinct schema It is not possible to create or update a Product Group with empty filters. But some automatically generated Product Groups might have empty filters.|
|*CatalogsProductGroupFiltersAllOfRequest_anyOf* | |
|*CatalogsProductGroupFiltersAllOfRequest_anyOf_1* | |
|*CatalogsProductGroupFiltersAnyOf* | |
|*CatalogsProductGroupMultipleStringCriteria* | |
|*CatalogsProductGroupMultipleStringListCriteria* | |
|*CatalogsProductGroupPricingCriteria* | |
|*CatalogsProductGroupProductCounts* | Product counts for a CatalogsProductGroup|
|*CatalogsProductGroupStatus* | |
|*CatalogsProductGroupType* | Catalog product group type|
|*CatalogsProductGroupUpdateRequest* | Request object for updating a product group.|
|*CatalogsProductMetadata* | Product metadata entity|
|*CatalogsStatus* | Status for catalogs entities. Present in catalogs_feed values. When a feed is deleted, the response will inform DELETED as status.|
|*Catalogs_feed_processing_result_fields* | |
|*Catalogs_product_group_feed_based_case* | |
|*Catalogs_product_group_merchant_based_case* | |
|*Catalogs_product_groups_list_200_response* | |
|*Catalogs_product_groups_list_200_response_allOf* | |
|*ConditionFilter* | |
|*ConversionAttributionWindowDays* | |
|*ConversionReportAttributionType* | Attribution type. Refers to the Pinterest Tag endpoints|
|*ConversionReportTimeType* | Conversion report time type|
|*Country* | Country ID from ISO 3166-1 alpha-2.|
|*CreativeType* | Ad creative type enum|
|*Currency* | Currency Codes from ISO 4217|
|*CurrencyFilter* | |
|*CustomLabel0Filter* | |
|*CustomLabel1Filter* | |
|*CustomLabel2Filter* | |
|*CustomLabel3Filter* | |
|*CustomLabel4Filter* | |
|*DataOutputFormat* | Format of generated report|
|*DataStatus* | Metrics availablity, e.g., \"READY\".|
|*EntityStatus* | Entity status|
|*Error* | |
|*Exception* | |
|*Feed_fields* | |
|*Feed_processing_results_list_200_response* | |
|*Feed_processing_results_list_200_response_allOf* | |
|*Feeds_list_200_response* | |
|*Feeds_list_200_response_allOf* | |
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
|*ItemResponse* | Object describing an item record|
|*ItemResponse_anyOf* | |
|*ItemResponse_anyOf_1* | |
|*ItemValidationEvent* | Object describing an item validation event|
|*Items* | |
|*Items_issues_list_200_response* | |
|*Items_issues_list_200_response_allOf* | |
|*Language* | Language code, which is among the offical ISO 639-1 language list.|
|*MaxPriceFilter* | |
|*MediaUpload* | Media upload that has been registered but not uploaded/processed yet.|
|*MediaUploadDetails* | Media upload details|
|*MediaUploadRequest* | Media upload request|
|*MediaUploadStatus* | Media upload status|
|*MediaUploadType* | |
|*MediaUpload_allOf* | |
|*MediaUpload_allOf_upload_parameters* | The list of parameter key/value pairs you will need to send with your POST request to upload your media file.|
|*Media_list_200_response* | |
|*Media_list_200_response_allOf* | |
|*MetricsReportingLevel* | Level of the reporting request|
|*MinPriceFilter* | |
|*NonNullableCatalogsCurrency* | Currency Codes from ISO 4217.|
|*NonNullableProductAvailabilityType* | Product availability.|
|*NullableCatalogsItemFieldType* | Product item fields|
|*NullableCurrency* | Currency Codes from ISO 4217.|
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
|*PinMediaWithVideo* | Pin with video.|
|*PinMediaWithVideo_allOf* | |
|*PinPromotionSummaryStatus* | Summary status for pin promotions|
|*Pin_media* | |
|*Pin_media_source* | |
|*PlacementGroupType* | Campaign placement group type|
|*ProductAvailabilityType* | Default availability for products in a feed.|
|*ProductGroupAnalyticsResponse_inner* | |
|*ProductGroupPromotion* | |
|*ProductGroupPromotionArrayElement* | |
|*ProductGroupPromotionCommon* | |
|*ProductGroupPromotionCreateRequest* | |
|*ProductGroupPromotionUpdateItem* | |
|*ProductGroupPromotionUpdateRequest* | |
|*ProductGroupPromotionUpdateResponseItem* | |
|*ProductGroupSummaryStatus* | Summary status for product group|
|*ProductType0Filter* | |
|*ProductType1Filter* | |
|*ProductType2Filter* | |
|*ProductType3Filter* | |
|*ProductType4Filter* | |
|*Product_groups_create_request_feed_base_case* | |
|*Products_by_product_group_filter_list_200_response* | |
|*Products_by_product_group_filter_list_200_response_allOf* | |
|*RelatedTerms* | |
|*RelatedTerms_related_terms_list_inner* | |
|*ReportingColumnAsync* | Reporting columns|
|*TargetingSpec* | Ad group targeting specification defining the ad group target audience. For example, {\"APPTYPE\":[\"iphone\"], \"GENDER\":[\"male\"], \"LOCALE\":[\"en-US\"], \"LOCATION\":[\"501\"], \"AGE_BUCKET\":[\"25-34\"]}|
|*TargetingSpec_1* | Ad group targeting specification defining the ad group target audience. For example, '{\"APPTYPE\":[\"iphone\"], \"GENDER\":[\"male\"], \"LOCALE\":[\"en-US\"], \"LOCATION\":[\"501\"], \"AGE_BUCKET\":[\"25-34\"]}'|
|*TargetingSpec_SHOPPING_RETARGETING* | |
|*TargetingSpec_SHOPPING_RETARGETING_1_inner* | |
|*TargetingTypeFilter* | |
|*TermsOfService* | |
|*TopPinsAnalyticsResponse* | |
|*TopPinsAnalyticsResponse_date_availability* | |
|*TopPinsAnalyticsResponse_pins_inner* | Array with metrics, status, and pin id for the requested metric|
|*TopVideoPinsAnalyticsResponse* | |
|*TopVideoPinsAnalyticsResponse_pins_inner* | Array with metrics, status, and pin id for the requested metric|
|*TrackingUrls* | Third-party tracking URLs. Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.|
|*UserListOperationType* | User list operation type (add or remove)|

