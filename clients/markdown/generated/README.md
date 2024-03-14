# Documentation for Pinterest REST API

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://api.pinterest.com/v5*

| Class | Method | HTTP request | Description |
|------------ | ------------- | ------------- | -------------|
| *AdAccountsApi* | [**adAccount/analytics**](Apis/AdAccountsApi.md#adaccount/analytics) | **GET** /ad_accounts/{ad_account_id}/analytics | Get ad account analytics |
*AdAccountsApi* | [**adAccountTargetingAnalytics/get**](Apis/AdAccountsApi.md#adaccounttargetinganalytics/get) | **GET** /ad_accounts/{ad_account_id}/targeting_analytics | Get targeting analytics for an ad account |
*AdAccountsApi* | [**adAccounts/create**](Apis/AdAccountsApi.md#adaccounts/create) | **POST** /ad_accounts | Create ad account |
*AdAccountsApi* | [**adAccounts/get**](Apis/AdAccountsApi.md#adaccounts/get) | **GET** /ad_accounts/{ad_account_id} | Get ad account |
*AdAccountsApi* | [**adAccounts/list**](Apis/AdAccountsApi.md#adaccounts/list) | **GET** /ad_accounts | List ad accounts |
*AdAccountsApi* | [**analytics/createReport**](Apis/AdAccountsApi.md#analytics/createreport) | **POST** /ad_accounts/{ad_account_id}/reports | Create async request for an account analytics report |
*AdAccountsApi* | [**analytics/getReport**](Apis/AdAccountsApi.md#analytics/getreport) | **GET** /ad_accounts/{ad_account_id}/reports | Get the account analytics report created by the async call |
| *AdGroupsApi* | [**adGroups/analytics**](Apis/AdGroupsApi.md#adgroups/analytics) | **GET** /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics |
*AdGroupsApi* | [**adGroups/create**](Apis/AdGroupsApi.md#adgroups/create) | **POST** /ad_accounts/{ad_account_id}/ad_groups | Create ad groups |
*AdGroupsApi* | [**adGroups/get**](Apis/AdGroupsApi.md#adgroups/get) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id} | Get ad group |
*AdGroupsApi* | [**adGroups/list**](Apis/AdGroupsApi.md#adgroups/list) | **GET** /ad_accounts/{ad_account_id}/ad_groups | List ad groups |
*AdGroupsApi* | [**adGroups/update**](Apis/AdGroupsApi.md#adgroups/update) | **PATCH** /ad_accounts/{ad_account_id}/ad_groups | Update ad groups |
*AdGroupsApi* | [**adGroupsBidFloor/get**](Apis/AdGroupsApi.md#adgroupsbidfloor/get) | **POST** /ad_accounts/{ad_account_id}/bid_floor | Get bid floors |
*AdGroupsApi* | [**adGroupsTargetingAnalytics/get**](Apis/AdGroupsApi.md#adgroupstargetinganalytics/get) | **GET** /ad_accounts/{ad_account_id}/ad_groups/targeting_analytics | Get targeting analytics for ad groups |
| *AdsApi* | [**adPreviews/create**](Apis/AdsApi.md#adpreviews/create) | **POST** /ad_accounts/{ad_account_id}/ad_previews | Create ad preview with pin or image |
*AdsApi* | [**adTargetingAnalytics/get**](Apis/AdsApi.md#adtargetinganalytics/get) | **GET** /ad_accounts/{ad_account_id}/ads/targeting_analytics | Get targeting analytics for ads |
*AdsApi* | [**ads/analytics**](Apis/AdsApi.md#ads/analytics) | **GET** /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics |
*AdsApi* | [**ads/create**](Apis/AdsApi.md#ads/create) | **POST** /ad_accounts/{ad_account_id}/ads | Create ads |
*AdsApi* | [**ads/get**](Apis/AdsApi.md#ads/get) | **GET** /ad_accounts/{ad_account_id}/ads/{ad_id} | Get ad |
*AdsApi* | [**ads/list**](Apis/AdsApi.md#ads/list) | **GET** /ad_accounts/{ad_account_id}/ads | List ads |
*AdsApi* | [**ads/update**](Apis/AdsApi.md#ads/update) | **PATCH** /ad_accounts/{ad_account_id}/ads | Update ads |
| *AudiencesApi* | [**audiences/create**](Apis/AudiencesApi.md#audiences/create) | **POST** /ad_accounts/{ad_account_id}/audiences | Create audience |
*AudiencesApi* | [**audiences/get**](Apis/AudiencesApi.md#audiences/get) | **GET** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Get audience |
*AudiencesApi* | [**audiences/list**](Apis/AudiencesApi.md#audiences/list) | **GET** /ad_accounts/{ad_account_id}/audiences | List audiences |
*AudiencesApi* | [**audiences/update**](Apis/AudiencesApi.md#audiences/update) | **PATCH** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Update audience |
| *BoardsApi* | [**boardSections/create**](Apis/BoardsApi.md#boardsections/create) | **POST** /boards/{board_id}/sections | Create board section |
*BoardsApi* | [**boardSections/delete**](Apis/BoardsApi.md#boardsections/delete) | **DELETE** /boards/{board_id}/sections/{section_id} | Delete board section |
*BoardsApi* | [**boardSections/list**](Apis/BoardsApi.md#boardsections/list) | **GET** /boards/{board_id}/sections | List board sections |
*BoardsApi* | [**boardSections/listPins**](Apis/BoardsApi.md#boardsections/listpins) | **GET** /boards/{board_id}/sections/{section_id}/pins | List Pins on board section |
*BoardsApi* | [**boardSections/update**](Apis/BoardsApi.md#boardsections/update) | **PATCH** /boards/{board_id}/sections/{section_id} | Update board section |
*BoardsApi* | [**boards/create**](Apis/BoardsApi.md#boards/create) | **POST** /boards | Create board |
*BoardsApi* | [**boards/delete**](Apis/BoardsApi.md#boards/delete) | **DELETE** /boards/{board_id} | Delete board |
*BoardsApi* | [**boards/get**](Apis/BoardsApi.md#boards/get) | **GET** /boards/{board_id} | Get board |
*BoardsApi* | [**boards/list**](Apis/BoardsApi.md#boards/list) | **GET** /boards | List boards |
*BoardsApi* | [**boards/listPins**](Apis/BoardsApi.md#boards/listpins) | **GET** /boards/{board_id}/pins | List Pins on board |
*BoardsApi* | [**boards/update**](Apis/BoardsApi.md#boards/update) | **PATCH** /boards/{board_id} | Update board |
| *BulkApi* | [**bulkDownload/create**](Apis/BulkApi.md#bulkdownload/create) | **POST** /ad_accounts/{ad_account_id}/bulk/download | Get advertiser entities in bulk |
*BulkApi* | [**bulkRequest/get**](Apis/BulkApi.md#bulkrequest/get) | **GET** /ad_accounts/{ad_account_id}/bulk/{bulk_request_id} | Download advertiser entities in bulk |
*BulkApi* | [**bulkUpsert/create**](Apis/BulkApi.md#bulkupsert/create) | **POST** /ad_accounts/{ad_account_id}/bulk/upsert | Create/update ad entities in bulk |
| *CampaignsApi* | [**campaignTargetingAnalytics/get**](Apis/CampaignsApi.md#campaigntargetinganalytics/get) | **GET** /ad_accounts/{ad_account_id}/campaigns/targeting_analytics | Get targeting analytics for campaigns |
*CampaignsApi* | [**campaigns/analytics**](Apis/CampaignsApi.md#campaigns/analytics) | **GET** /ad_accounts/{ad_account_id}/campaigns/analytics | Get campaign analytics |
*CampaignsApi* | [**campaigns/create**](Apis/CampaignsApi.md#campaigns/create) | **POST** /ad_accounts/{ad_account_id}/campaigns | Create campaigns |
*CampaignsApi* | [**campaigns/get**](Apis/CampaignsApi.md#campaigns/get) | **GET** /ad_accounts/{ad_account_id}/campaigns/{campaign_id} | Get campaign |
*CampaignsApi* | [**campaigns/list**](Apis/CampaignsApi.md#campaigns/list) | **GET** /ad_accounts/{ad_account_id}/campaigns | List campaigns |
*CampaignsApi* | [**campaigns/update**](Apis/CampaignsApi.md#campaigns/update) | **PATCH** /ad_accounts/{ad_account_id}/campaigns | Update campaigns |
| *CatalogsApi* | [**catalogsProductGroupPins/list**](Apis/CatalogsApi.md#catalogsproductgrouppins/list) | **GET** /catalogs/product_groups/{product_group_id}/products | List products |
*CatalogsApi* | [**catalogsProductGroups/create**](Apis/CatalogsApi.md#catalogsproductgroups/create) | **POST** /catalogs/product_groups | Create product group |
*CatalogsApi* | [**catalogsProductGroups/delete**](Apis/CatalogsApi.md#catalogsproductgroups/delete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group |
*CatalogsApi* | [**catalogsProductGroups/get**](Apis/CatalogsApi.md#catalogsproductgroups/get) | **GET** /catalogs/product_groups/{product_group_id} | Get product group |
*CatalogsApi* | [**catalogsProductGroups/list**](Apis/CatalogsApi.md#catalogsproductgroups/list) | **GET** /catalogs/product_groups | List product groups |
*CatalogsApi* | [**catalogsProductGroups/productCountsGet**](Apis/CatalogsApi.md#catalogsproductgroups/productcountsget) | **GET** /catalogs/product_groups/{product_group_id}/product_counts | Get product counts |
*CatalogsApi* | [**catalogsProductGroups/update**](Apis/CatalogsApi.md#catalogsproductgroups/update) | **PATCH** /catalogs/product_groups/{product_group_id} | Update product group |
*CatalogsApi* | [**feedProcessingResults/list**](Apis/CatalogsApi.md#feedprocessingresults/list) | **GET** /catalogs/feeds/{feed_id}/processing_results | List processing results for a given feed |
*CatalogsApi* | [**feeds/create**](Apis/CatalogsApi.md#feeds/create) | **POST** /catalogs/feeds | Create feed |
*CatalogsApi* | [**feeds/delete**](Apis/CatalogsApi.md#feeds/delete) | **DELETE** /catalogs/feeds/{feed_id} | Delete feed |
*CatalogsApi* | [**feeds/get**](Apis/CatalogsApi.md#feeds/get) | **GET** /catalogs/feeds/{feed_id} | Get feed |
*CatalogsApi* | [**feeds/list**](Apis/CatalogsApi.md#feeds/list) | **GET** /catalogs/feeds | List feeds |
*CatalogsApi* | [**feeds/update**](Apis/CatalogsApi.md#feeds/update) | **PATCH** /catalogs/feeds/{feed_id} | Update feed |
*CatalogsApi* | [**items/get**](Apis/CatalogsApi.md#items/get) | **GET** /catalogs/items | Get catalogs items |
*CatalogsApi* | [**itemsBatch/get**](Apis/CatalogsApi.md#itemsbatch/get) | **GET** /catalogs/items/batch/{batch_id} | Get catalogs items batch |
*CatalogsApi* | [**itemsBatch/post**](Apis/CatalogsApi.md#itemsbatch/post) | **POST** /catalogs/items/batch | Operate on item batch |
*CatalogsApi* | [**itemsIssues/list**](Apis/CatalogsApi.md#itemsissues/list) | **GET** /catalogs/processing_results/{processing_result_id}/item_issues | List item issues for a given processing result |
*CatalogsApi* | [**productsByProductGroupFilter/list**](Apis/CatalogsApi.md#productsbyproductgroupfilter/list) | **POST** /catalogs/products/get_by_product_group_filters | List filtered products |
| *ConversionEventsApi* | [**events/create**](Apis/ConversionEventsApi.md#events/create) | **POST** /ad_accounts/{ad_account_id}/events | Send conversion events to the Pinterest API for Conversions |
| *CustomerListsApi* | [**customerLists/create**](Apis/CustomerListsApi.md#customerlists/create) | **POST** /ad_accounts/{ad_account_id}/customer_lists | Create customer lists |
*CustomerListsApi* | [**customerLists/get**](Apis/CustomerListsApi.md#customerlists/get) | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Get customer list |
*CustomerListsApi* | [**customerLists/list**](Apis/CustomerListsApi.md#customerlists/list) | **GET** /ad_accounts/{ad_account_id}/customer_lists | Get customer lists |
*CustomerListsApi* | [**customerLists/update**](Apis/CustomerListsApi.md#customerlists/update) | **PATCH** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Update customer list |
| *KeywordsApi* | [**countryKeywordsMetrics/get**](Apis/KeywordsApi.md#countrykeywordsmetrics/get) | **GET** /ad_accounts/{ad_account_id}/keywords/metrics | Get country's keyword metrics |
*KeywordsApi* | [**keywords/create**](Apis/KeywordsApi.md#keywords/create) | **POST** /ad_accounts/{ad_account_id}/keywords | Create keywords |
*KeywordsApi* | [**keywords/get**](Apis/KeywordsApi.md#keywords/get) | **GET** /ad_accounts/{ad_account_id}/keywords | Get keywords |
*KeywordsApi* | [**keywords/update**](Apis/KeywordsApi.md#keywords/update) | **PATCH** /ad_accounts/{ad_account_id}/keywords | Update keywords |
| *MediaApi* | [**media/create**](Apis/MediaApi.md#media/create) | **POST** /media | Register media upload |
*MediaApi* | [**media/get**](Apis/MediaApi.md#media/get) | **GET** /media/{media_id} | Get media upload details |
*MediaApi* | [**media/list**](Apis/MediaApi.md#media/list) | **GET** /media | List media uploads |
| *OauthApi* | [**oauth/token**](Apis/OauthApi.md#oauth/token) | **POST** /oauth/token | Generate OAuth access token |
| *PinsApi* | [**pins/analytics**](Apis/PinsApi.md#pins/analytics) | **GET** /pins/{pin_id}/analytics | Get Pin analytics |
*PinsApi* | [**pins/create**](Apis/PinsApi.md#pins/create) | **POST** /pins | Create Pin |
*PinsApi* | [**pins/delete**](Apis/PinsApi.md#pins/delete) | **DELETE** /pins/{pin_id} | Delete Pin |
*PinsApi* | [**pins/get**](Apis/PinsApi.md#pins/get) | **GET** /pins/{pin_id} | Get Pin |
*PinsApi* | [**pins/save**](Apis/PinsApi.md#pins/save) | **POST** /pins/{pin_id}/save | Save pin |
| *ProductGroupPromotionsApi* | [**productGroupPromotion/get**](Apis/ProductGroupPromotionsApi.md#productgrouppromotion/get) | **GET** /ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id} | Get a product group promotion by id |
*ProductGroupPromotionsApi* | [**productGroupPromotions/create**](Apis/ProductGroupPromotionsApi.md#productgrouppromotions/create) | **POST** /ad_accounts/{ad_account_id}/product_group_promotions | Create product group promotions |
*ProductGroupPromotionsApi* | [**productGroupPromotions/update**](Apis/ProductGroupPromotionsApi.md#productgrouppromotions/update) | **PATCH** /ad_accounts/{ad_account_id}/product_group_promotions | Update product group promotions |
*ProductGroupPromotionsApi* | [**productGroups/analytics**](Apis/ProductGroupPromotionsApi.md#productgroups/analytics) | **GET** /ad_accounts/{ad_account_id}/product_groups/analytics | Get product group analytics |
| *ResourcesApi* | [**adAccountCountries/get**](Apis/ResourcesApi.md#adaccountcountries/get) | **GET** /resources/ad_account_countries | Get ad accounts countries |
*ResourcesApi* | [**deliveryMetrics/get**](Apis/ResourcesApi.md#deliverymetrics/get) | **GET** /resources/delivery_metrics | Get available delivery metrics' definitions |
*ResourcesApi* | [**interestTargetingOptions/get**](Apis/ResourcesApi.md#interesttargetingoptions/get) | **GET** /resources/targeting/interests/{interest_id} | Get interest details |
*ResourcesApi* | [**metricsReadyState/get**](Apis/ResourcesApi.md#metricsreadystate/get) | **GET** /resources/metrics_ready_state | Get metrics ready state |
*ResourcesApi* | [**targetingOptions/get**](Apis/ResourcesApi.md#targetingoptions/get) | **GET** /resources/targeting/{targeting_type} | Get targeting options |
| *TermsApi* | [**termsRelated/list**](Apis/TermsApi.md#termsrelated/list) | **GET** /terms/related | List related terms |
*TermsApi* | [**termsSuggested/list**](Apis/TermsApi.md#termssuggested/list) | **GET** /terms/suggested | List suggested terms |
| *TermsOfServiceApi* | [**termsOfService/get**](Apis/TermsOfServiceApi.md#termsofservice/get) | **GET** /ad_accounts/{ad_account_id}/terms_of_service | Get terms of service |
| *UserAccountApi* | [**userAccount/analytics**](Apis/UserAccountApi.md#useraccount/analytics) | **GET** /user_account/analytics | Get user account analytics |
*UserAccountApi* | [**userAccount/analytics/topPins**](Apis/UserAccountApi.md#useraccount/analytics/toppins) | **GET** /user_account/analytics/top_pins | Get user account top pins analytics |
*UserAccountApi* | [**userAccount/analytics/topVideoPins**](Apis/UserAccountApi.md#useraccount/analytics/topvideopins) | **GET** /user_account/analytics/top_video_pins | Get user account top video pins analytics |
*UserAccountApi* | [**userAccount/get**](Apis/UserAccountApi.md#useraccount/get) | **GET** /user_account | Get user account |


<a name="documentation-for-models"></a>
## Documentation for Models

 - [Account](./Models/Account.md)
 - [ActionType](./Models/ActionType.md)
 - [AdAccount](./Models/AdAccount.md)
 - [AdAccountAnalyticsResponse_inner](./Models/AdAccountAnalyticsResponse_inner.md)
 - [AdAccountCreateRequest](./Models/AdAccountCreateRequest.md)
 - [AdAccountsCountryResponse](./Models/AdAccountsCountryResponse.md)
 - [AdAccountsCountryResponseData](./Models/AdAccountsCountryResponseData.md)
 - [AdArrayResponse](./Models/AdArrayResponse.md)
 - [AdArrayResponseElement](./Models/AdArrayResponseElement.md)
 - [AdCommon](./Models/AdCommon.md)
 - [AdCommon_tracking_urls](./Models/AdCommon_tracking_urls.md)
 - [AdCreateRequest](./Models/AdCreateRequest.md)
 - [AdGroupArrayResponse](./Models/AdGroupArrayResponse.md)
 - [AdGroupArrayResponseElement](./Models/AdGroupArrayResponseElement.md)
 - [AdGroupCommon](./Models/AdGroupCommon.md)
 - [AdGroupCommon_tracking_urls](./Models/AdGroupCommon_tracking_urls.md)
 - [AdGroupCreateRequest](./Models/AdGroupCreateRequest.md)
 - [AdGroupResponse](./Models/AdGroupResponse.md)
 - [AdGroupSummaryStatus](./Models/AdGroupSummaryStatus.md)
 - [AdGroupUpdateRequest](./Models/AdGroupUpdateRequest.md)
 - [AdGroupsAnalyticsResponse_inner](./Models/AdGroupsAnalyticsResponse_inner.md)
 - [AdPreviewCreateFromImage](./Models/AdPreviewCreateFromImage.md)
 - [AdPreviewCreateFromPin](./Models/AdPreviewCreateFromPin.md)
 - [AdPreviewRequest](./Models/AdPreviewRequest.md)
 - [AdPreviewURLResponse](./Models/AdPreviewURLResponse.md)
 - [AdResponse](./Models/AdResponse.md)
 - [AdUpdateRequest](./Models/AdUpdateRequest.md)
 - [Ad_account_owner](./Models/Ad_account_owner.md)
 - [AdsAnalyticsCreateAsyncRequest](./Models/AdsAnalyticsCreateAsyncRequest.md)
 - [AdsAnalyticsCreateAsyncResponse](./Models/AdsAnalyticsCreateAsyncResponse.md)
 - [AdsAnalyticsFilterColumn](./Models/AdsAnalyticsFilterColumn.md)
 - [AdsAnalyticsFilterOperator](./Models/AdsAnalyticsFilterOperator.md)
 - [AdsAnalyticsGetAsyncResponse](./Models/AdsAnalyticsGetAsyncResponse.md)
 - [AdsAnalyticsMetricsFilter](./Models/AdsAnalyticsMetricsFilter.md)
 - [AdsAnalyticsResponse_inner](./Models/AdsAnalyticsResponse_inner.md)
 - [AdsAnalyticsTargetingType](./Models/AdsAnalyticsTargetingType.md)
 - [AnalyticsMetricsResponse](./Models/AnalyticsMetricsResponse.md)
 - [AnalyticsMetricsResponse_daily_metrics_inner](./Models/AnalyticsMetricsResponse_daily_metrics_inner.md)
 - [Audience](./Models/Audience.md)
 - [AudienceCommon](./Models/AudienceCommon.md)
 - [AudienceCreateRequest](./Models/AudienceCreateRequest.md)
 - [AudienceCreateRequest_1_audience_type](./Models/AudienceCreateRequest_1_audience_type.md)
 - [AudienceInsightCategoryCommon](./Models/AudienceInsightCategoryCommon.md)
 - [AudienceRule](./Models/AudienceRule.md)
 - [AudienceType](./Models/AudienceType.md)
 - [AudienceUpdateOperationType](./Models/AudienceUpdateOperationType.md)
 - [AudienceUpdateRequest](./Models/AudienceUpdateRequest.md)
 - [AvailabilityFilter](./Models/AvailabilityFilter.md)
 - [BatchOperation](./Models/BatchOperation.md)
 - [BatchOperationStatus](./Models/BatchOperationStatus.md)
 - [BidFloor](./Models/BidFloor.md)
 - [BidFloorRequest](./Models/BidFloorRequest.md)
 - [BidFloorSpec](./Models/BidFloorSpec.md)
 - [Board](./Models/Board.md)
 - [BoardOwner](./Models/BoardOwner.md)
 - [BoardSection](./Models/BoardSection.md)
 - [BoardUpdate](./Models/BoardUpdate.md)
 - [Board_owner](./Models/Board_owner.md)
 - [BookClosedResponse](./Models/BookClosedResponse.md)
 - [BrandFilter](./Models/BrandFilter.md)
 - [BudgetType](./Models/BudgetType.md)
 - [BulkDownloadRequest](./Models/BulkDownloadRequest.md)
 - [BulkDownloadRequest_campaign_filter](./Models/BulkDownloadRequest_campaign_filter.md)
 - [BulkDownloadResponse](./Models/BulkDownloadResponse.md)
 - [BulkEntityType](./Models/BulkEntityType.md)
 - [BulkOutputFormat](./Models/BulkOutputFormat.md)
 - [BulkUpsertRequest](./Models/BulkUpsertRequest.md)
 - [BulkUpsertRequestCreate](./Models/BulkUpsertRequestCreate.md)
 - [BulkUpsertRequestUpdate](./Models/BulkUpsertRequestUpdate.md)
 - [BulkUpsertResponse](./Models/BulkUpsertResponse.md)
 - [BulkUpsertStatus](./Models/BulkUpsertStatus.md)
 - [BulkUpsertStatusResponse](./Models/BulkUpsertStatusResponse.md)
 - [CampaignCommon](./Models/CampaignCommon.md)
 - [CampaignCreateCommon](./Models/CampaignCreateCommon.md)
 - [CampaignCreateRequest](./Models/CampaignCreateRequest.md)
 - [CampaignCreateResponse](./Models/CampaignCreateResponse.md)
 - [CampaignCreateResponseData](./Models/CampaignCreateResponseData.md)
 - [CampaignCreateResponseItem](./Models/CampaignCreateResponseItem.md)
 - [CampaignId](./Models/CampaignId.md)
 - [CampaignResponse](./Models/CampaignResponse.md)
 - [CampaignSummaryStatus](./Models/CampaignSummaryStatus.md)
 - [CampaignUpdateRequest](./Models/CampaignUpdateRequest.md)
 - [CampaignUpdateResponse](./Models/CampaignUpdateResponse.md)
 - [CampaignsAnalyticsResponse_inner](./Models/CampaignsAnalyticsResponse_inner.md)
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
 - [CatalogsItemValidationDetails](./Models/CatalogsItemValidationDetails.md)
 - [CatalogsItemValidationErrors](./Models/CatalogsItemValidationErrors.md)
 - [CatalogsItemValidationIssue](./Models/CatalogsItemValidationIssue.md)
 - [CatalogsItemValidationIssues](./Models/CatalogsItemValidationIssues.md)
 - [CatalogsItemValidationWarnings](./Models/CatalogsItemValidationWarnings.md)
 - [CatalogsItems](./Models/CatalogsItems.md)
 - [CatalogsItemsBatch](./Models/CatalogsItemsBatch.md)
 - [CatalogsItemsBatchRequest](./Models/CatalogsItemsBatchRequest.md)
 - [CatalogsItemsCreateBatchRequest](./Models/CatalogsItemsCreateBatchRequest.md)
 - [CatalogsItemsDeleteDiscontinuedBatchRequest](./Models/CatalogsItemsDeleteDiscontinuedBatchRequest.md)
 - [CatalogsItemsUpdateBatchRequest](./Models/CatalogsItemsUpdateBatchRequest.md)
 - [CatalogsListProductsByFilterRequest](./Models/CatalogsListProductsByFilterRequest.md)
 - [CatalogsListProductsByFilterRequest_oneOf](./Models/CatalogsListProductsByFilterRequest_oneOf.md)
 - [CatalogsProduct](./Models/CatalogsProduct.md)
 - [CatalogsProductGroup](./Models/CatalogsProductGroup.md)
 - [CatalogsProductGroupCreateRequest](./Models/CatalogsProductGroupCreateRequest.md)
 - [CatalogsProductGroupCurrencyCriteria](./Models/CatalogsProductGroupCurrencyCriteria.md)
 - [CatalogsProductGroupFilterKeys](./Models/CatalogsProductGroupFilterKeys.md)
 - [CatalogsProductGroupFilters](./Models/CatalogsProductGroupFilters.md)
 - [CatalogsProductGroupFiltersAllOf](./Models/CatalogsProductGroupFiltersAllOf.md)
 - [CatalogsProductGroupFiltersAllOfRequest](./Models/CatalogsProductGroupFiltersAllOfRequest.md)
 - [CatalogsProductGroupFiltersAllOfRequest_anyOf](./Models/CatalogsProductGroupFiltersAllOfRequest_anyOf.md)
 - [CatalogsProductGroupFiltersAllOfRequest_anyOf_1](./Models/CatalogsProductGroupFiltersAllOfRequest_anyOf_1.md)
 - [CatalogsProductGroupFiltersAnyOf](./Models/CatalogsProductGroupFiltersAnyOf.md)
 - [CatalogsProductGroupMultipleStringCriteria](./Models/CatalogsProductGroupMultipleStringCriteria.md)
 - [CatalogsProductGroupMultipleStringListCriteria](./Models/CatalogsProductGroupMultipleStringListCriteria.md)
 - [CatalogsProductGroupPricingCriteria](./Models/CatalogsProductGroupPricingCriteria.md)
 - [CatalogsProductGroupProductCounts](./Models/CatalogsProductGroupProductCounts.md)
 - [CatalogsProductGroupStatus](./Models/CatalogsProductGroupStatus.md)
 - [CatalogsProductGroupType](./Models/CatalogsProductGroupType.md)
 - [CatalogsProductGroupUpdateRequest](./Models/CatalogsProductGroupUpdateRequest.md)
 - [CatalogsProductMetadata](./Models/CatalogsProductMetadata.md)
 - [CatalogsStatus](./Models/CatalogsStatus.md)
 - [ConditionFilter](./Models/ConditionFilter.md)
 - [ConversionApiResponse](./Models/ConversionApiResponse.md)
 - [ConversionApiResponse_events_inner](./Models/ConversionApiResponse_events_inner.md)
 - [ConversionAttributionWindowDays](./Models/ConversionAttributionWindowDays.md)
 - [ConversionEvents](./Models/ConversionEvents.md)
 - [ConversionEventsUserData](./Models/ConversionEventsUserData.md)
 - [ConversionEvents_data_inner](./Models/ConversionEvents_data_inner.md)
 - [ConversionEvents_data_inner_custom_data](./Models/ConversionEvents_data_inner_custom_data.md)
 - [ConversionEvents_data_inner_custom_data_contents_inner](./Models/ConversionEvents_data_inner_custom_data_contents_inner.md)
 - [ConversionReportAttributionType](./Models/ConversionReportAttributionType.md)
 - [ConversionReportTimeType](./Models/ConversionReportTimeType.md)
 - [Country](./Models/Country.md)
 - [CreativeType](./Models/CreativeType.md)
 - [Currency](./Models/Currency.md)
 - [CurrencyFilter](./Models/CurrencyFilter.md)
 - [CustomLabel0Filter](./Models/CustomLabel0Filter.md)
 - [CustomLabel1Filter](./Models/CustomLabel1Filter.md)
 - [CustomLabel2Filter](./Models/CustomLabel2Filter.md)
 - [CustomLabel3Filter](./Models/CustomLabel3Filter.md)
 - [CustomLabel4Filter](./Models/CustomLabel4Filter.md)
 - [CustomerList](./Models/CustomerList.md)
 - [CustomerListRequest](./Models/CustomerListRequest.md)
 - [CustomerListUpdateRequest](./Models/CustomerListUpdateRequest.md)
 - [DataOutputFormat](./Models/DataOutputFormat.md)
 - [DataStatus](./Models/DataStatus.md)
 - [DeliveryMetricsResponse](./Models/DeliveryMetricsResponse.md)
 - [DeliveryMetricsResponse_items_inner](./Models/DeliveryMetricsResponse_items_inner.md)
 - [EntityStatus](./Models/EntityStatus.md)
 - [Error](./Models/Error.md)
 - [Exception](./Models/Exception.md)
 - [GenderFilter](./Models/GenderFilter.md)
 - [GetAudiencesOrderBy](./Models/GetAudiencesOrderBy.md)
 - [GoogleProductCategory0Filter](./Models/GoogleProductCategory0Filter.md)
 - [GoogleProductCategory1Filter](./Models/GoogleProductCategory1Filter.md)
 - [GoogleProductCategory2Filter](./Models/GoogleProductCategory2Filter.md)
 - [GoogleProductCategory3Filter](./Models/GoogleProductCategory3Filter.md)
 - [GoogleProductCategory4Filter](./Models/GoogleProductCategory4Filter.md)
 - [GoogleProductCategory5Filter](./Models/GoogleProductCategory5Filter.md)
 - [GoogleProductCategory6Filter](./Models/GoogleProductCategory6Filter.md)
 - [Granularity](./Models/Granularity.md)
 - [ImageDetails](./Models/ImageDetails.md)
 - [ImageMetadata](./Models/ImageMetadata.md)
 - [ItemAttributes](./Models/ItemAttributes.md)
 - [ItemBatchRecord](./Models/ItemBatchRecord.md)
 - [ItemCreateBatchRecord](./Models/ItemCreateBatchRecord.md)
 - [ItemDeleteDiscontinuedBatchRecord](./Models/ItemDeleteDiscontinuedBatchRecord.md)
 - [ItemGroupIdFilter](./Models/ItemGroupIdFilter.md)
 - [ItemIdFilter](./Models/ItemIdFilter.md)
 - [ItemProcessingRecord](./Models/ItemProcessingRecord.md)
 - [ItemProcessingStatus](./Models/ItemProcessingStatus.md)
 - [ItemResponse](./Models/ItemResponse.md)
 - [ItemResponse_anyOf](./Models/ItemResponse_anyOf.md)
 - [ItemResponse_anyOf_1](./Models/ItemResponse_anyOf_1.md)
 - [ItemUpdateBatchRecord](./Models/ItemUpdateBatchRecord.md)
 - [ItemValidationEvent](./Models/ItemValidationEvent.md)
 - [Keyword](./Models/Keyword.md)
 - [KeywordError](./Models/KeywordError.md)
 - [KeywordMetrics](./Models/KeywordMetrics.md)
 - [KeywordMetricsResponse](./Models/KeywordMetricsResponse.md)
 - [KeywordUpdate](./Models/KeywordUpdate.md)
 - [KeywordUpdateBody](./Models/KeywordUpdateBody.md)
 - [KeywordsCommon](./Models/KeywordsCommon.md)
 - [KeywordsMetricsArrayResponse](./Models/KeywordsMetricsArrayResponse.md)
 - [KeywordsRequest](./Models/KeywordsRequest.md)
 - [KeywordsResponse](./Models/KeywordsResponse.md)
 - [Language](./Models/Language.md)
 - [LineItem](./Models/LineItem.md)
 - [MatchType](./Models/MatchType.md)
 - [MatchTypeResponse](./Models/MatchTypeResponse.md)
 - [MaxPriceFilter](./Models/MaxPriceFilter.md)
 - [MediaUpload](./Models/MediaUpload.md)
 - [MediaUploadDetails](./Models/MediaUploadDetails.md)
 - [MediaUploadRequest](./Models/MediaUploadRequest.md)
 - [MediaUploadStatus](./Models/MediaUploadStatus.md)
 - [MediaUploadType](./Models/MediaUploadType.md)
 - [MediaUpload_allOf_upload_parameters](./Models/MediaUpload_allOf_upload_parameters.md)
 - [MetricsReportingLevel](./Models/MetricsReportingLevel.md)
 - [MetricsResponse](./Models/MetricsResponse.md)
 - [MinPriceFilter](./Models/MinPriceFilter.md)
 - [NonNullableCatalogsCurrency](./Models/NonNullableCatalogsCurrency.md)
 - [NonNullableProductAvailabilityType](./Models/NonNullableProductAvailabilityType.md)
 - [NullableCatalogsItemFieldType](./Models/NullableCatalogsItemFieldType.md)
 - [NullableCurrency](./Models/NullableCurrency.md)
 - [OauthAccessTokenRequestCode](./Models/OauthAccessTokenRequestCode.md)
 - [OauthAccessTokenRequestRefresh](./Models/OauthAccessTokenRequestRefresh.md)
 - [OauthAccessTokenResponse](./Models/OauthAccessTokenResponse.md)
 - [OauthAccessTokenResponseCode](./Models/OauthAccessTokenResponseCode.md)
 - [OauthAccessTokenResponseRefresh](./Models/OauthAccessTokenResponseRefresh.md)
 - [ObjectiveType](./Models/ObjectiveType.md)
 - [PacingDeliveryType](./Models/PacingDeliveryType.md)
 - [Paginated](./Models/Paginated.md)
 - [Pin](./Models/Pin.md)
 - [PinMedia](./Models/PinMedia.md)
 - [PinMediaMetadata](./Models/PinMediaMetadata.md)
 - [PinMediaSource](./Models/PinMediaSource.md)
 - [PinMediaSourceImageBase64](./Models/PinMediaSourceImageBase64.md)
 - [PinMediaSourceImageURL](./Models/PinMediaSourceImageURL.md)
 - [PinMediaSourceVideoID](./Models/PinMediaSourceVideoID.md)
 - [PinMediaWithImage](./Models/PinMediaWithImage.md)
 - [PinMediaWithImageAndVideo](./Models/PinMediaWithImageAndVideo.md)
 - [PinMediaWithImages](./Models/PinMediaWithImages.md)
 - [PinMediaWithVideo](./Models/PinMediaWithVideo.md)
 - [PinMediaWithVideos](./Models/PinMediaWithVideos.md)
 - [PinPromotionSummaryStatus](./Models/PinPromotionSummaryStatus.md)
 - [Pin_media](./Models/Pin_media.md)
 - [PinterestTagEventData](./Models/PinterestTagEventData.md)
 - [PlacementGroupType](./Models/PlacementGroupType.md)
 - [ProductAvailabilityType](./Models/ProductAvailabilityType.md)
 - [ProductGroupAnalyticsResponse_inner](./Models/ProductGroupAnalyticsResponse_inner.md)
 - [ProductGroupPromotion](./Models/ProductGroupPromotion.md)
 - [ProductGroupPromotionArrayElement](./Models/ProductGroupPromotionArrayElement.md)
 - [ProductGroupPromotionCommon](./Models/ProductGroupPromotionCommon.md)
 - [ProductGroupPromotionCreateRequest](./Models/ProductGroupPromotionCreateRequest.md)
 - [ProductGroupPromotionUpdateItem](./Models/ProductGroupPromotionUpdateItem.md)
 - [ProductGroupPromotionUpdateRequest](./Models/ProductGroupPromotionUpdateRequest.md)
 - [ProductGroupPromotionUpdateResponseItem](./Models/ProductGroupPromotionUpdateResponseItem.md)
 - [ProductGroupSummaryStatus](./Models/ProductGroupSummaryStatus.md)
 - [ProductType0Filter](./Models/ProductType0Filter.md)
 - [ProductType1Filter](./Models/ProductType1Filter.md)
 - [ProductType2Filter](./Models/ProductType2Filter.md)
 - [ProductType3Filter](./Models/ProductType3Filter.md)
 - [ProductType4Filter](./Models/ProductType4Filter.md)
 - [RelatedTerms](./Models/RelatedTerms.md)
 - [RelatedTerms_related_terms_list_inner](./Models/RelatedTerms_related_terms_list_inner.md)
 - [ReportingColumnAsync](./Models/ReportingColumnAsync.md)
 - [SingleInterestTargetingOptionResponse](./Models/SingleInterestTargetingOptionResponse.md)
 - [TargetingSpec](./Models/TargetingSpec.md)
 - [TargetingSpec_1](./Models/TargetingSpec_1.md)
 - [TargetingSpec_SHOPPING_RETARGETING](./Models/TargetingSpec_SHOPPING_RETARGETING.md)
 - [TargetingSpec_SHOPPING_RETARGETING_1_inner](./Models/TargetingSpec_SHOPPING_RETARGETING_1_inner.md)
 - [TargetingTypeFilter](./Models/TargetingTypeFilter.md)
 - [TermsOfService](./Models/TermsOfService.md)
 - [TopPinsAnalyticsResponse](./Models/TopPinsAnalyticsResponse.md)
 - [TopPinsAnalyticsResponse_date_availability](./Models/TopPinsAnalyticsResponse_date_availability.md)
 - [TopPinsAnalyticsResponse_pins_inner](./Models/TopPinsAnalyticsResponse_pins_inner.md)
 - [TopVideoPinsAnalyticsResponse](./Models/TopVideoPinsAnalyticsResponse.md)
 - [TopVideoPinsAnalyticsResponse_pins_inner](./Models/TopVideoPinsAnalyticsResponse_pins_inner.md)
 - [TrackingUrls](./Models/TrackingUrls.md)
 - [UpdatableItemAttributes](./Models/UpdatableItemAttributes.md)
 - [UserListOperationType](./Models/UserListOperationType.md)
 - [UserListType](./Models/UserListType.md)
 - [VideoMetadata](./Models/VideoMetadata.md)
 - [ad_accounts_list_200_response](./Models/ad_accounts_list_200_response.md)
 - [ad_groups_list_200_response](./Models/ad_groups_list_200_response.md)
 - [ads_list_200_response](./Models/ads_list_200_response.md)
 - [audiences_list_200_response](./Models/audiences_list_200_response.md)
 - [board_sections_list_200_response](./Models/board_sections_list_200_response.md)
 - [board_sections_list_pins_200_response](./Models/board_sections_list_pins_200_response.md)
 - [boards_list_200_response](./Models/boards_list_200_response.md)
 - [campaigns_list_200_response](./Models/campaigns_list_200_response.md)
 - [catalogs_product_group_feed_based_case](./Models/catalogs_product_group_feed_based_case.md)
 - [catalogs_product_group_merchant_based_case](./Models/catalogs_product_group_merchant_based_case.md)
 - [catalogs_product_groups_list_200_response](./Models/catalogs_product_groups_list_200_response.md)
 - [customer_lists_list_200_response](./Models/customer_lists_list_200_response.md)
 - [feed_processing_results_list_200_response](./Models/feed_processing_results_list_200_response.md)
 - [feeds_list_200_response](./Models/feeds_list_200_response.md)
 - [items_issues_list_200_response](./Models/items_issues_list_200_response.md)
 - [keywords_get_200_response](./Models/keywords_get_200_response.md)
 - [media_list_200_response](./Models/media_list_200_response.md)
 - [pins_save_request](./Models/pins_save_request.md)
 - [product_groups_create_request_feed_base_case](./Models/product_groups_create_request_feed_base_case.md)
 - [products_by_product_group_filter_list_200_response](./Models/products_by_product_group_filter_list_200_response.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

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
  - user_accounts:read: See your user accounts and followers
  - user_accounts:write: Update your user accounts and followers

<a name="conversion_token"></a>
### conversion_token

- **Type**: HTTP Bearer Token authentication

<a name="basic"></a>
### basic

- **Type**: HTTP basic authentication

