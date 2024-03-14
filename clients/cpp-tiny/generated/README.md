# Documentation for OpenAPI Petstore
This is a client generator for microcontrollers on the Espressif32 platform and the Arduino framework
After the client have been generated, you have to change these following variables:
- root.cert | Provide your service root certificate.
- src/main.cpp | Change wifi name
- src/main.cpp | Change wifi password
- lib/service/AbstractService.h | Change to your url

# Documentation for Pinterest REST API 5.6.0 Tiny client cpp (Arduino) 

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
|*adAccountTargetingAnalytics_get* | *GET* /ad_accounts/{ad_account_id}/targeting_analytics | Get targeting analytics for an ad account.|
|*adAccount_analytics* | *GET* /ad_accounts/{ad_account_id}/analytics | Get ad account analytics.|
|*adAccounts_create* | *POST* /ad_accounts | Create ad account.|
|*adAccounts_get* | *GET* /ad_accounts/{ad_account_id} | Get ad account.|
|*adAccounts_list* | *GET* /ad_accounts | List ad accounts.|
|*analytics_createReport* | *POST* /ad_accounts/{ad_account_id}/reports | Create async request for an account analytics report.|
|*analytics_getReport* | *GET* /ad_accounts/{ad_account_id}/reports | Get the account analytics report created by the async call.|

### AdGroupsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*adGroupsBidFloor_get* | *POST* /ad_accounts/{ad_account_id}/bid_floor | Get bid floors.|
|*adGroupsTargetingAnalytics_get* | *GET* /ad_accounts/{ad_account_id}/ad_groups/targeting_analytics | Get targeting analytics for ad groups.|
|*adGroups_analytics* | *GET* /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics.|
|*adGroups_create* | *POST* /ad_accounts/{ad_account_id}/ad_groups | Create ad groups.|
|*adGroups_get* | *GET* /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id} | Get ad group.|
|*adGroups_list* | *GET* /ad_accounts/{ad_account_id}/ad_groups | List ad groups.|
|*adGroups_update* | *PATCH* /ad_accounts/{ad_account_id}/ad_groups | Update ad groups.|

### AdsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*adPreviews_create* | *POST* /ad_accounts/{ad_account_id}/ad_previews | Create ad preview with pin or image.|
|*adTargetingAnalytics_get* | *GET* /ad_accounts/{ad_account_id}/ads/targeting_analytics | Get targeting analytics for ads.|
|*ads_analytics* | *GET* /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics.|
|*ads_create* | *POST* /ad_accounts/{ad_account_id}/ads | Create ads.|
|*ads_get* | *GET* /ad_accounts/{ad_account_id}/ads/{ad_id} | Get ad.|
|*ads_list* | *GET* /ad_accounts/{ad_account_id}/ads | List ads.|
|*ads_update* | *PATCH* /ad_accounts/{ad_account_id}/ads | Update ads.|

### AudiencesApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*audiences_create* | *POST* /ad_accounts/{ad_account_id}/audiences | Create audience.|
|*audiences_get* | *GET* /ad_accounts/{ad_account_id}/audiences/{audience_id} | Get audience.|
|*audiences_list* | *GET* /ad_accounts/{ad_account_id}/audiences | List audiences.|
|*audiences_update* | *PATCH* /ad_accounts/{ad_account_id}/audiences/{audience_id} | Update audience.|

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

### BulkApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*bulkDownload_create* | *POST* /ad_accounts/{ad_account_id}/bulk/download | Get advertiser entities in bulk.|
|*bulkRequest_get* | *GET* /ad_accounts/{ad_account_id}/bulk/{bulk_request_id} | Download advertiser entities in bulk.|
|*bulkUpsert_create* | *POST* /ad_accounts/{ad_account_id}/bulk/upsert | Create/update ad entities in bulk.|

### CampaignsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*campaignTargetingAnalytics_get* | *GET* /ad_accounts/{ad_account_id}/campaigns/targeting_analytics | Get targeting analytics for campaigns.|
|*campaigns_analytics* | *GET* /ad_accounts/{ad_account_id}/campaigns/analytics | Get campaign analytics.|
|*campaigns_create* | *POST* /ad_accounts/{ad_account_id}/campaigns | Create campaigns.|
|*campaigns_get* | *GET* /ad_accounts/{ad_account_id}/campaigns/{campaign_id} | Get campaign.|
|*campaigns_list* | *GET* /ad_accounts/{ad_account_id}/campaigns | List campaigns.|
|*campaigns_update* | *PATCH* /ad_accounts/{ad_account_id}/campaigns | Update campaigns.|

### CatalogsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*catalogsProductGroupPins_list* | *GET* /catalogs/product_groups/{product_group_id}/products | List products.|
|*catalogsProductGroups_create* | *POST* /catalogs/product_groups | Create product group.|
|*catalogsProductGroups_delete* | *DELETE* /catalogs/product_groups/{product_group_id} | Delete product group.|
|*catalogsProductGroups_get* | *GET* /catalogs/product_groups/{product_group_id} | Get product group.|
|*catalogsProductGroups_list* | *GET* /catalogs/product_groups | List product groups.|
|*catalogsProductGroups_productCountsGet* | *GET* /catalogs/product_groups/{product_group_id}/product_counts | Get product counts.|
|*catalogsProductGroups_update* | *PATCH* /catalogs/product_groups/{product_group_id} | Update product group.|
|*feedProcessingResults_list* | *GET* /catalogs/feeds/{feed_id}/processing_results | List processing results for a given feed.|
|*feeds_create* | *POST* /catalogs/feeds | Create feed.|
|*feeds_delete* | *DELETE* /catalogs/feeds/{feed_id} | Delete feed.|
|*feeds_get* | *GET* /catalogs/feeds/{feed_id} | Get feed.|
|*feeds_list* | *GET* /catalogs/feeds | List feeds.|
|*feeds_update* | *PATCH* /catalogs/feeds/{feed_id} | Update feed.|
|*itemsBatch_get* | *GET* /catalogs/items/batch/{batch_id} | Get catalogs items batch.|
|*itemsBatch_post* | *POST* /catalogs/items/batch | Operate on item batch.|
|*itemsIssues_list* | *GET* /catalogs/processing_results/{processing_result_id}/item_issues | List item issues for a given processing result.|
|*items_get* | *GET* /catalogs/items | Get catalogs items.|
|*productsByProductGroupFilter_list* | *POST* /catalogs/products/get_by_product_group_filters | List filtered products.|

### ConversionEventsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*events_create* | *POST* /ad_accounts/{ad_account_id}/events | Send conversion events to the Pinterest API for Conversions.|

### CustomerListsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*customerLists_create* | *POST* /ad_accounts/{ad_account_id}/customer_lists | Create customer lists.|
|*customerLists_get* | *GET* /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Get customer list.|
|*customerLists_list* | *GET* /ad_accounts/{ad_account_id}/customer_lists | Get customer lists.|
|*customerLists_update* | *PATCH* /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Update customer list.|

### KeywordsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*countryKeywordsMetrics_get* | *GET* /ad_accounts/{ad_account_id}/keywords/metrics | Get country's keyword metrics.|
|*keywords_create* | *POST* /ad_accounts/{ad_account_id}/keywords | Create keywords.|
|*keywords_get* | *GET* /ad_accounts/{ad_account_id}/keywords | Get keywords.|
|*keywords_update* | *PATCH* /ad_accounts/{ad_account_id}/keywords | Update keywords.|

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
|*pins_save* | *POST* /pins/{pin_id}/save | Save pin.|

### ProductGroupPromotionsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*productGroupPromotion_get* | *GET* /ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id} | Get a product group promotion by id.|
|*productGroupPromotions_create* | *POST* /ad_accounts/{ad_account_id}/product_group_promotions | Create product group promotions.|
|*productGroupPromotions_update* | *PATCH* /ad_accounts/{ad_account_id}/product_group_promotions | Update product group promotions.|
|*productGroups_analytics* | *GET* /ad_accounts/{ad_account_id}/product_groups/analytics | Get product group analytics.|

### ResourcesApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*adAccountCountries_get* | *GET* /resources/ad_account_countries | Get ad accounts countries.|
|*deliveryMetrics_get* | *GET* /resources/delivery_metrics | Get available delivery metrics' definitions.|
|*interestTargetingOptions_get* | *GET* /resources/targeting/interests/{interest_id} | Get interest details.|
|*metricsReadyState_get* | *GET* /resources/metrics_ready_state | Get metrics ready state.|
|*targetingOptions_get* | *GET* /resources/targeting/{targeting_type} | Get targeting options.|

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
|*AdAccountsCountryResponse* | |
|*AdAccountsCountryResponseData* | |
|*AdArrayResponse* | |
|*AdArrayResponseElement* | |
|*AdCommon* | Creation fields|
|*AdCommon_tracking_urls* | |
|*AdCreateRequest* | |
|*AdGroupArrayResponse* | |
|*AdGroupArrayResponseElement* | |
|*AdGroupCommon* | |
|*AdGroupCommon_tracking_urls* | Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"https://developers.pinterest.com/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.|
|*AdGroupCreateRequest* | |
|*AdGroupResponse* | |
|*AdGroupSummaryStatus* | Summary status for ad group|
|*AdGroupUpdateRequest* | |
|*AdGroupsAnalyticsResponse_inner* | |
|*AdPreviewCreateFromImage* | |
|*AdPreviewCreateFromPin* | |
|*AdPreviewRequest* | |
|*AdPreviewURLResponse* | |
|*AdResponse* | |
|*AdUpdateRequest* | |
|*Ad_account_owner* | |
|*Ad_accounts_list_200_response* | |
|*Ad_groups_list_200_response* | |
|*AdsAnalyticsCreateAsyncRequest* | |
|*AdsAnalyticsCreateAsyncResponse* | |
|*AdsAnalyticsFilterColumn* | Reporting columns for sync reporting data filter|
|*AdsAnalyticsFilterOperator* | Filter operator for sync reporting|
|*AdsAnalyticsGetAsyncResponse* | |
|*AdsAnalyticsMetricsFilter* | |
|*AdsAnalyticsResponse_inner* | |
|*AdsAnalyticsTargetingType* | Reporting targeting type|
|*Ads_list_200_response* | |
|*AnalyticsMetricsResponse* | |
|*AnalyticsMetricsResponse_daily_metrics_inner* | |
|*Audience* | |
|*AudienceCommon* | |
|*AudienceCreateRequest* | |
|*AudienceCreateRequest_1_audience_type* | |
|*AudienceInsightCategoryCommon* | |
|*AudienceRule* | JSON object defining targeted audience users. Example rule formats per audience type:<br>CUSTOMER_LIST: { \"customer_list_id\": \"&lt;customer list ID&gt;\"}<br>ACTALIKE: { \"seed_id\": [\"&lt;audience ID&gt;\"], \"country\": \"US\", \"percentage\": \"10\" }<br>(Valid countries include: \"US\", \"CA\", and \"GB\". Percentage should be 1-10.<br>The targeted audience should be this % size across Pinterest.)<br>VISITOR: { \"visitor_source_id\": [\"&lt;conversion tag ID&gt;\"], \"retention_days\": \"180\", \"event_source\": {\"=\": [\"web\", \"mobile\"]}, \"ingestion_source\": {\"=\": [\"tag\"]}}<br>(Retention days should be 1-540. Retention applies to specific customers.)<br>ENGAGEMENT: {\"engagement_domain\": [\"www.entomi.com\"], \"engager_type\": 1}<br>For more details on engagement audiences, see <a href=\"https://developers.pinterest.com/docs/redoc/adtech_ads_v4/#section/November-2021\" target=\"_blank\">November 2021 changelog</a>.|
|*AudienceType* | Audience type|
|*AudienceUpdateOperationType* | Audience operation type (update or remove).|
|*AudienceUpdateRequest* | |
|*Audiences_list_200_response* | |
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
|*Board_sections_list_pins_200_response* | |
|*Boards_list_200_response* | |
|*BookClosedResponse* | Creation fields|
|*BrandFilter* | |
|*BudgetType* | Budget type. If DAILY, an ad group's daily spend will not exceed the budget parameter value. If LIFETIME, the end_time parameter is **REQUIRED**, and the ad group spend is spread evenly between the ad group `start_time` and `end_time` range. A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome.|
|*BulkDownloadRequest* | Ad entities to get in bulk request.|
|*BulkDownloadRequest_campaign_filter* | |
|*BulkDownloadResponse* | |
|*BulkEntityType* | Refers ads entity type|
|*BulkOutputFormat* | Bulk file output format|
|*BulkUpsertRequest* | Two set of objects to be managed asyncronusly by bulk. One for creations, one for modifications.|
|*BulkUpsertRequestCreate* | Request for creation of entities in bulk.|
|*BulkUpsertRequestUpdate* | Request for creation of entities in bulk.|
|*BulkUpsertResponse* | ID of the bulk request.|
|*BulkUpsertStatus* | |
|*BulkUpsertStatusResponse* | ID of the bulk request.|
|*CampaignCommon* | Campaign Data|
|*CampaignCreateCommon* | |
|*CampaignCreateRequest* | |
|*CampaignCreateResponse* | |
|*CampaignCreateResponseData* | |
|*CampaignCreateResponseItem* | |
|*CampaignId* | |
|*CampaignResponse* | |
|*CampaignSummaryStatus* | Summary status for campaign|
|*CampaignUpdateRequest* | |
|*CampaignUpdateResponse* | |
|*CampaignsAnalyticsResponse_inner* | |
|*Campaigns_list_200_response* | |
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
|*CatalogsItemsCreateBatchRequest* | Request object to create catalogs items|
|*CatalogsItemsDeleteDiscontinuedBatchRequest* | Request object to discontinue catalogs items|
|*CatalogsItemsUpdateBatchRequest* | Request object to update catalogs items|
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
|*CatalogsProductGroupType* | <p>Catalog product group type</p> <p>MERCHANT_CREATED: Product groups created by merchants. <br>ALL_PRODUCTS: Consists of every product in your latest successful feed upload. <br>BEST_DEALS: Consists of products with the deepest drop in price. <br>PINNER_FAVORITES: Consists of products that are resonating most with people on Pinterest, based on engagement. <br>TOP_SELLERS: Consists of products with the highest conversion rate, if you have the conversion tag installed. <br>BACK_IN_STOCK: Consists of products that were previously out of stock and are now in stock. <br>NEW_ARRIVALS: Consists of products that are new to your Catalog. <br>SHOPIFY_COLLECTION: Product groups created based on Shopify Product Collections. <br>I2PC: Product groups created based on predicted product category.</p>|
|*CatalogsProductGroupUpdateRequest* | Request object for updating a product group.|
|*CatalogsProductMetadata* | Product metadata entity|
|*CatalogsStatus* | Status for catalogs entities. Present in catalogs_feed values. When a feed is deleted, the response will inform DELETED as status.|
|*Catalogs_product_group_feed_based_case* | |
|*Catalogs_product_group_merchant_based_case* | |
|*Catalogs_product_groups_list_200_response* | |
|*ConditionFilter* | |
|*ConversionApiResponse* | Schema describing the object in the response, which contains information about the events that were received and processed.|
|*ConversionApiResponse_events_inner* | |
|*ConversionAttributionWindowDays* | |
|*ConversionEvents* | A list of events (one or more) encapsulated by a data object.|
|*ConversionEventsUserData* | Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent.|
|*ConversionEvents_data_inner* | |
|*ConversionEvents_data_inner_custom_data* | Object containing other custom data.|
|*ConversionEvents_data_inner_custom_data_contents_inner* | |
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
|*CustomerList* | |
|*CustomerListRequest* | |
|*CustomerListUpdateRequest* | |
|*Customer_lists_list_200_response* | |
|*DataOutputFormat* | Format of generated report|
|*DataStatus* | Metrics availablity, e.g., \"READY\".|
|*DeliveryMetricsResponse* | |
|*DeliveryMetricsResponse_items_inner* | |
|*EntityStatus* | Entity status|
|*Error* | |
|*Exception* | |
|*Feed_processing_results_list_200_response* | |
|*Feeds_list_200_response* | |
|*GenderFilter* | |
|*GetAudiencesOrderBy* | |
|*GoogleProductCategory0Filter* | |
|*GoogleProductCategory1Filter* | |
|*GoogleProductCategory2Filter* | |
|*GoogleProductCategory3Filter* | |
|*GoogleProductCategory4Filter* | |
|*GoogleProductCategory5Filter* | |
|*GoogleProductCategory6Filter* | |
|*Granularity* | |
|*ImageDetails* | |
|*ImageMetadata* | |
|*ItemAttributes* | |
|*ItemBatchRecord* | Object describing an item batch record|
|*ItemCreateBatchRecord* | Object describing an item batch record to create items|
|*ItemDeleteDiscontinuedBatchRecord* | Object describing an item batch record to discontinue items|
|*ItemGroupIdFilter* | |
|*ItemIdFilter* | |
|*ItemProcessingRecord* | Object describing an item processing record|
|*ItemProcessingStatus* | The status of the item processing record|
|*ItemResponse* | Object describing an item record|
|*ItemResponse_anyOf* | |
|*ItemResponse_anyOf_1* | |
|*ItemUpdateBatchRecord* | Object describing an item batch record to update items|
|*ItemValidationEvent* | Object describing an item validation event|
|*Items_issues_list_200_response* | |
|*Keyword* | |
|*KeywordError* | |
|*KeywordMetrics* | Keyword metrics JSON|
|*KeywordMetricsResponse* | |
|*KeywordUpdate* | |
|*KeywordUpdateBody* | |
|*KeywordsCommon* | |
|*KeywordsMetricsArrayResponse* | |
|*KeywordsRequest* | |
|*KeywordsResponse* | |
|*Keywords_get_200_response* | |
|*Language* | Language code, which is among the offical ISO 639-1 language list.|
|*LineItem* | |
|*MatchType* | Keyword match type|
|*MatchTypeResponse* | Keyword match type|
|*MaxPriceFilter* | |
|*MediaUpload* | Media upload that has been registered but not uploaded/processed yet.|
|*MediaUploadDetails* | Media upload details|
|*MediaUploadRequest* | Media upload request|
|*MediaUploadStatus* | Media upload status|
|*MediaUploadType* | |
|*MediaUpload_allOf_upload_parameters* | The list of parameter key/value pairs you will need to send with your POST request to upload your media file.|
|*Media_list_200_response* | |
|*MetricsReportingLevel* | Level of the reporting request|
|*MetricsResponse* | |
|*MinPriceFilter* | |
|*NonNullableCatalogsCurrency* | Currency Codes from ISO 4217.|
|*NonNullableProductAvailabilityType* | Product availability.|
|*NullableCatalogsItemFieldType* | Product item fields|
|*NullableCurrency* | Currency Codes from ISO 4217.|
|*OauthAccessTokenRequestCode* | A request to exchange an authorization code for an access token.|
|*OauthAccessTokenRequestRefresh* | A request to exchange a refresh token for a new access token.|
|*OauthAccessTokenResponse* | A successful OAuth access token response.|
|*OauthAccessTokenResponseCode* | A successful OAuth access token response for the authorization code flow.|
|*OauthAccessTokenResponseRefresh* | A successful OAuth access token response for the refresh token flow.|
|*ObjectiveType* | Campaign objective type. [\"WEB_SESSIONS\"] in BETA.|
|*PacingDeliveryType* | Ad group pacing delivery type|
|*Paginated* | |
|*Pin* | Pin|
|*PinMedia* | Pin media objects.|
|*PinMediaMetadata* | |
|*PinMediaSource* | Pin media source.|
|*PinMediaSourceImageBase64* | Base64-encoded image media source|
|*PinMediaSourceImageURL* | Image URL-based media source|
|*PinMediaSourceVideoID* | Video ID-based media source|
|*PinMediaWithImage* | Pin with image.|
|*PinMediaWithImageAndVideo* | Pin with a mix of images and videos.|
|*PinMediaWithImages* | Pin with multiple images.|
|*PinMediaWithVideo* | Pin with video.|
|*PinMediaWithVideos* | Pin with multiple videos.|
|*PinPromotionSummaryStatus* | Summary status for pin promotions|
|*Pin_media* | |
|*Pins_save_request* | |
|*PinterestTagEventData* | Optional for VISITOR `audience_type`. With the Pinterest tag, you can use event data to capture event details from your website. This object lists all the available predefined event data fields in the Pinterest tag. You can include these event data fields as part of a VISITOR audience’s `rule`; however, you **must** specify an `event` for the `event_data` fields to be evaluated. Besides what’s listed, you can also create your own set of `event_data` fields and define their usages or purposes according to your website needs. However, the benefit of using the predefined event data fields is that we can provide various metrics based on those fields' data.<br>Examples per `event` type:<br>`pagevisit`<br>\"event_data\": { \"page_name\": \"My online store 123 | view items | shoe\" }<br>`signup`<br>\"event_data\": { \"lead_type\": \"New release promotion\" }<br>`checkout`<br>\"event_data\": { \"value\": 116, \"order_quantity\": 2, \"currency\": \"USD\", \"line_items\": [ { \"product_name\": \"Pillows (Set of 2)\", \"product_id\": \"11\", \"product_price\": 48, \"product_quantity\": 1 }, { \"product_name\": \"Pillows, Large (Set of 2)\", \"product_id\": \"15\", \"product_price\": 68, \"product_quantity\": 1 } ] }<br>`addtocart`<br>\"event_data\": { \"value\": 499, \"order_quantity\": 1, \"currency\": \"USD\", \"line_items\": [ { \"product_name\": \"Red leather boots\", \"product_id\": \"3486\", \"product_category\": \"shoe\", \"product_variant_id\": \"JB11103000\", \"product_price\": 499, \"product_quantity\": \"1\", \"product_brand\": \"My brand\" }]}<br>`watchvideo`<br>\"event_data\": { \"video_title\": \"My Product Video 01\" }<br>`lead`<br>\"event_data\": { \"lead_type\": \"Newsletter\" }|
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
|*RelatedTerms* | |
|*RelatedTerms_related_terms_list_inner* | |
|*ReportingColumnAsync* | Reporting columns|
|*SingleInterestTargetingOptionResponse* | |
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
|*UpdatableItemAttributes* | |
|*UserListOperationType* | User list operation type (add or remove)|
|*UserListType* | User list type|
|*VideoMetadata* | |

