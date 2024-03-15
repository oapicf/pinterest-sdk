# Documentation for OpenAPI Petstore
This is a client generator for microcontrollers on the Espressif32 platform and the Arduino framework
After the client have been generated, you have to change these following variables:
- root.cert | Provide your service root certificate.
- src/main.cpp | Change wifi name
- src/main.cpp | Change wifi password
- lib/service/AbstractService.h | Change to your url

# Documentation for Pinterest REST API 5.12.0 Tiny client cpp (Arduino) 

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
|*analytics_createMmmReport* | *POST* /ad_accounts/{ad_account_id}/mmm_reports | Create a request for a Marketing Mix Modeling (MMM) report.|
|*analytics_createReport* | *POST* /ad_accounts/{ad_account_id}/reports | Create async request for an account analytics report.|
|*analytics_createTemplateReport* | *POST* /ad_accounts/{ad_account_id}/templates/{template_id}/reports | Create async request for an analytics report using a template.|
|*analytics_getMmmReport* | *GET* /ad_accounts/{ad_account_id}/mmm_reports | Get advertiser Marketing Mix Modeling (MMM) report..|
|*analytics_getReport* | *GET* /ad_accounts/{ad_account_id}/reports | Get the account analytics report created by the async call.|
|*sandbox_delete* | *DELETE* /ad_accounts/{ad_account_id}/sandbox | Delete ads data for ad account in API Sandbox.|
|*templates_list* | *GET* /ad_accounts/{ad_account_id}/templates | List templates.|

### AdGroupsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*adGroupsBidFloor_get* | *POST* /ad_accounts/{ad_account_id}/bid_floor | Get bid floors.|
|*adGroupsTargetingAnalytics_get* | *GET* /ad_accounts/{ad_account_id}/ad_groups/targeting_analytics | Get targeting analytics for ad groups.|
|*adGroups_analytics* | *GET* /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics.|
|*adGroups_audienceSizing* | *GET* /ad_accounts/{ad_account_id}/ad_groups/audience_sizing | Get audience sizing.|
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

### AudienceInsightsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*audienceInsightsScopeAndType_get* | *GET* /ad_accounts/{ad_account_id}/insights/audiences | Get audience insights scope and type.|
|*audienceInsights_get* | *GET* /ad_accounts/{ad_account_id}/audience_insights | Get audience insights.|

### AudiencesApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*audiences_create* | *POST* /ad_accounts/{ad_account_id}/audiences | Create audience.|
|*audiences_createCustom* | *POST* /ad_accounts/{ad_account_id}/audiences/custom | Create custom audience.|
|*audiences_get* | *GET* /ad_accounts/{ad_account_id}/audiences/{audience_id} | Get audience.|
|*audiences_list* | *GET* /ad_accounts/{ad_account_id}/audiences | List audiences.|
|*audiences_update* | *PATCH* /ad_accounts/{ad_account_id}/audiences/{audience_id} | Update audience.|

### BillingApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*adsCredit_redeem* | *POST* /ad_accounts/{ad_account_id}/ads_credit/redeem | Redeem ad credits.|
|*adsCreditsDiscounts_get* | *GET* /ad_accounts/{ad_account_id}/ads_credit/discounts | Get ads credit discounts.|
|*billingProfiles_get* | *GET* /ad_accounts/{ad_account_id}/billing_profiles | Get billing profiles.|
|*ssioAccounts_get* | *GET* /ad_accounts/{ad_account_id}/ssio/accounts | Get Salesforce account details including bill-to information..|
|*ssioInsertionOrder_create* | *POST* /ad_accounts/{ad_account_id}/ssio/insertion_orders | Create insertion order through SSIO..|
|*ssioInsertionOrder_edit* | *PATCH* /ad_accounts/{ad_account_id}/ssio/insertion_orders | Edit insertion order through SSIO..|
|*ssioInsertionOrdersStatus_getByAdAccount* | *GET* /ad_accounts/{ad_account_id}/ssio/insertion_orders/status | Get insertion order status by ad account id..|
|*ssioInsertionOrdersStatus_getByPinOrderId* | *GET* /ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status | Get insertion order status by pin order id..|
|*ssioOrderLines_getByAdAccount* | *GET* /ad_accounts/{ad_account_id}/ssio/order_lines | Get Salesforce order lines by ad account id..|

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
|*catalogsProductGroupPins_list* | *GET* /catalogs/product_groups/{product_group_id}/products | List products for a Product Group.|
|*catalogsProductGroups_create* | *POST* /catalogs/product_groups | Create product group.|
|*catalogsProductGroups_delete* | *DELETE* /catalogs/product_groups/{product_group_id} | Delete product group.|
|*catalogsProductGroups_get* | *GET* /catalogs/product_groups/{product_group_id} | Get product group.|
|*catalogsProductGroups_list* | *GET* /catalogs/product_groups | List product groups.|
|*catalogsProductGroups_productCountsGet* | *GET* /catalogs/product_groups/{product_group_id}/product_counts | Get product counts for a Product Group.|
|*catalogsProductGroups_update* | *PATCH* /catalogs/product_groups/{product_group_id} | Update product group.|
|*catalogs_list* | *GET* /catalogs | List catalogs.|
|*feedProcessingResults_list* | *GET* /catalogs/feeds/{feed_id}/processing_results | List processing results for a given feed.|
|*feeds_create* | *POST* /catalogs/feeds | Create feed.|
|*feeds_delete* | *DELETE* /catalogs/feeds/{feed_id} | Delete feed.|
|*feeds_get* | *GET* /catalogs/feeds/{feed_id} | Get feed.|
|*feeds_list* | *GET* /catalogs/feeds | List feeds.|
|*feeds_update* | *PATCH* /catalogs/feeds/{feed_id} | Update feed.|
|*itemsBatch_get* | *GET* /catalogs/items/batch/{batch_id} | Get catalogs item batch status.|
|*itemsBatch_post* | *POST* /catalogs/items/batch | Operate on item batch.|
|*itemsIssues_list* | *GET* /catalogs/processing_results/{processing_result_id}/item_issues | List item issues for a given processing result.|
|*items_get* | *GET* /catalogs/items | Get catalogs items.|
|*productsByProductGroupFilter_list* | *POST* /catalogs/products/get_by_product_group_filters | List filtered products.|

### ConversionEventsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*events_create* | *POST* /ad_accounts/{ad_account_id}/events | Send conversions.|

### ConversionTagsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*conversionTags_create* | *POST* /ad_accounts/{ad_account_id}/conversion_tags | Create conversion tag.|
|*conversionTags_get* | *GET* /ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id} | Get conversion tag.|
|*conversionTags_list* | *GET* /ad_accounts/{ad_account_id}/conversion_tags | Get conversion tags.|
|*ocpmEligibleConversionTags_get* | *GET* /ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible | Get Ocpm eligible conversion tags.|
|*pageVisitConversionTags_get* | *GET* /ad_accounts/{ad_account_id}/conversion_tags/page_visit | Get page visit conversion tags.|

### CustomerListsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*customerLists_create* | *POST* /ad_accounts/{ad_account_id}/customer_lists | Create customer lists.|
|*customerLists_get* | *GET* /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Get customer list.|
|*customerLists_list* | *GET* /ad_accounts/{ad_account_id}/customer_lists | Get customer lists.|
|*customerLists_update* | *PATCH* /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Update customer list.|

### IntegrationsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*integrationsCommerce_del* | *DELETE* /integrations/commerce/{external_business_id} | Delete commerce integration.|
|*integrationsCommerce_get* | *GET* /integrations/commerce/{external_business_id} | Get commerce integration.|
|*integrationsCommerce_patch* | *PATCH* /integrations/commerce/{external_business_id} | Update commerce integration.|
|*integrationsCommerce_post* | *POST* /integrations/commerce | Create commerce integration.|
|*integrationsLogs_post* | *POST* /integrations/logs | Receives batched logs from integration applications..|
|*integrations_getById* | *GET* /integrations/{id} | Get integration metadata.|
|*integrations_getList* | *GET* /integrations | Get integration metadata list.|

### KeywordsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*countryKeywordsMetrics_get* | *GET* /ad_accounts/{ad_account_id}/keywords/metrics | Get country's keyword metrics.|
|*keywords_create* | *POST* /ad_accounts/{ad_account_id}/keywords | Create keywords.|
|*keywords_get* | *GET* /ad_accounts/{ad_account_id}/keywords | Get keywords.|
|*keywords_update* | *PATCH* /ad_accounts/{ad_account_id}/keywords | Update keywords.|
|*trendingKeywords_list* | *GET* /trends/keywords/{region}/top/{trend_type} | List trending keywords.|

### LeadAdsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*adAccountsSubscriptions_delById* | *DELETE* /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Delete lead ads subscription.|
|*adAccountsSubscriptions_getById* | *GET* /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Get lead ads subscription.|
|*adAccountsSubscriptions_getList* | *GET* /ad_accounts/{ad_account_id}/leads/subscriptions | Get lead ads subscriptions.|
|*adAccountsSubscriptions_post* | *POST* /ad_accounts/{ad_account_id}/leads/subscriptions | Create lead ads subscription.|

### LeadFormsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*leadFormTest_create* | *POST* /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test | Create lead form test data.|
|*leadForm_get* | *GET* /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id} | Get lead form by id.|
|*leadForms_list* | *GET* /ad_accounts/{ad_account_id}/lead_forms | Get lead forms.|

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

### OrderLinesApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*orderLines_get* | *GET* /ad_accounts/{ad_account_id}/order_lines/{order_line_id} | Get order line.|
|*orderLines_list* | *GET* /ad_accounts/{ad_account_id}/order_lines | Get order lines.|

### PinsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*pins_analytics* | *GET* /pins/{pin_id}/analytics | Get Pin analytics.|
|*pins_create* | *POST* /pins | Create Pin.|
|*pins_delete* | *DELETE* /pins/{pin_id} | Delete Pin.|
|*pins_get* | *GET* /pins/{pin_id} | Get Pin.|
|*pins_list* | *GET* /pins | List Pins.|
|*pins_save* | *POST* /pins/{pin_id}/save | Save Pin.|
|*pins_update* | *PATCH* /pins/{pin_id} | Update Pin.|

### ProductGroupPromotionsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*productGroupPromotions_create* | *POST* /ad_accounts/{ad_account_id}/product_group_promotions | Create product group promotions.|
|*productGroupPromotions_get* | *GET* /ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id} | Get a product group promotion by id.|
|*productGroupPromotions_list* | *GET* /ad_accounts/{ad_account_id}/product_group_promotions | Get product group promotions.|
|*productGroupPromotions_update* | *PATCH* /ad_accounts/{ad_account_id}/product_group_promotions | Update product group promotions.|
|*productGroups_analytics* | *GET* /ad_accounts/{ad_account_id}/product_groups/analytics | Get product group analytics.|

### ProductGroupsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*adAccountsCatalogsProductGroups_list* | *GET* /ad_accounts/{ad_account_id}/product_groups/catalogs | Get catalog product groups.|

### ResourcesApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*adAccountCountries_get* | *GET* /resources/ad_account_countries | Get ad accounts countries.|
|*deliveryMetrics_get* | *GET* /resources/delivery_metrics | Get available metrics' definitions.|
|*interestTargetingOptions_get* | *GET* /resources/targeting/interests/{interest_id} | Get interest details.|
|*leadFormQuestions_get* | *GET* /resources/lead_form_questions | Get lead form questions.|
|*metricsReadyState_get* | *GET* /resources/metrics_ready_state | Get metrics ready state.|
|*targetingOptions_get* | *GET* /resources/targeting/{targeting_type} | Get targeting options.|

### SearchApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*searchPartnerPins* | *GET* /search/partner/pins | Search pins by a given search term.|
|*searchUserBoards_get* | *GET* /search/boards | Search user's boards.|
|*searchUserPins_list* | *GET* /search/pins | Search user's Pins.|

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
|*boardsUserFollows_list* | *GET* /user_account/following/boards | List following boards.|
|*followUser_update* | *POST* /user_account/following/{username} | Follow user.|
|*followers_list* | *GET* /user_account/followers | List followers.|
|*linkedBusinessAccounts_get* | *GET* /user_account/businesses | List linked businesses.|
|*unverifyWebsite_delete* | *DELETE* /user_account/websites | Unverify website.|
|*userAccount_analytics* | *GET* /user_account/analytics | Get user account analytics.|
|*userAccount_analytics_topPins* | *GET* /user_account/analytics/top_pins | Get user account top pins analytics.|
|*userAccount_analytics_topVideoPins* | *GET* /user_account/analytics/top_video_pins | Get user account top video pins analytics.|
|*userAccount_followedInterests* | *GET* /users/{username}/interests/follow | List following interests.|
|*userAccount_get* | *GET* /user_account | Get user account.|
|*userFollowing_get* | *GET* /user_account/following | List following.|
|*userWebsites_get* | *GET* /user_account/websites | Get user websites.|
|*verifyWebsite_update* | *POST* /user_account/websites | Verify website.|
|*websiteVerification_get* | *GET* /user_account/websites/verification | Get user verification code for website claiming.|


## What are the Model files for the data structures/objects?
|Class | Description|
|------------- | -------------|
|*Account* | |
|*ActionType* | Ad group billable event type. For update, only draft ad groups may update billable event.|
|*AdAccount* | |
|*AdAccountAnalyticsResponse_inner* | |
|*AdAccountCreateRequest* | |
|*AdAccountCreateSubscriptionRequest* | |
|*AdAccountCreateSubscriptionResponse* | |
|*AdAccountGetSubscriptionResponse* | |
|*AdAccountsCountryResponse* | |
|*AdAccountsCountryResponseData* | |
|*AdArrayResponse* | |
|*AdArrayResponseElement* | |
|*AdCommon* | Creation fields|
|*AdCommon_quiz_pin_data* | Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.|
|*AdCommon_tracking_urls* | |
|*AdCountry* | Country ID from ISO 3166-1 alpha-2.|
|*AdCreateRequest* | |
|*AdGroupArrayResponse* | |
|*AdGroupArrayResponseElement* | |
|*AdGroupAudienceSizingRequest* | |
|*AdGroupAudienceSizingRequest_keywords_inner* | |
|*AdGroupAudienceSizingResponse* | |
|*AdGroupCommon* | |
|*AdGroupCommon_optimization_goal_metadata* | Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`.|
|*AdGroupCommon_tracking_urls* | Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"https://developers.pinterest.com/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.|
|*AdGroupCreateRequest* | |
|*AdGroupResponse* | |
|*AdGroupSummaryStatus* | Summary status for ad group|
|*AdGroupUpdateRequest* | |
|*AdGroupsAnalyticsResponse_inner* | |
|*AdPinId* | |
|*AdPreviewCreateFromImage* | |
|*AdPreviewCreateFromPin* | |
|*AdPreviewRequest* | |
|*AdPreviewURLResponse* | |
|*AdResponse* | |
|*AdUpdateRequest* | |
|*Ad_account_owner* | |
|*Ad_accounts_catalogs_product_groups_list_200_response* | |
|*Ad_accounts_list_200_response* | |
|*Ad_accounts_subscriptions_get_list_200_response* | |
|*Ad_groups_list_200_response* | |
|*AdsAnalyticsCreateAsyncRequest* | |
|*AdsAnalyticsCreateAsyncResponse* | |
|*AdsAnalyticsFilterColumn* | Reporting columns for sync reporting data filter|
|*AdsAnalyticsFilterOperator* | Filter operator for sync reporting|
|*AdsAnalyticsGetAsyncResponse* | |
|*AdsAnalyticsMetricsFilter* | |
|*AdsAnalyticsResponse_inner* | |
|*AdsAnalyticsTargetingType* | Reporting targeting type|
|*AdsCreditDiscountsResponse* | |
|*AdsCreditRedeemRequest* | |
|*AdsCreditRedeemResponse* | |
|*Ads_credits_discounts_get_200_response* | |
|*Ads_list_200_response* | |
|*AnalyticsDailyMetrics* | |
|*AnalyticsMetricsResponse* | |
|*Audience* | |
|*AudienceCategory* | |
|*AudienceCommon* | |
|*AudienceCreateCustomRequest* | |
|*AudienceCreateRequest* | |
|*AudienceCreateRequest_1_audience_type* | |
|*AudienceDataParty* | Whether the data is owned by the partner (1p) or by the data provider (3p)|
|*AudienceDefinition* | Queryable audience representation.|
|*AudienceDefinitionResponse* | |
|*AudienceDemographicValue* | Demographic detail for a single audience demographic|
|*AudienceDemographics* | Audience demographics|
|*AudienceInsightCategoryArrayResponse* | |
|*AudienceInsightCategoryCommon* | |
|*AudienceInsightType* | |
|*AudienceInsightsResponse* | Audience interests and demographics.|
|*AudienceRule* | JSON object defining targeted audience users. Example rule formats per audience type:<br>CUSTOMER_LIST: { \"customer_list_id\": \"&lt;customer list ID&gt;\"}<br>ACTALIKE: { \"seed_id\": [\"&lt;audience ID&gt;\"], \"country\": \"US\", \"percentage\": \"10\" }<br>(Valid countries include: \"US\", \"CA\", and \"GB\". Percentage should be 1-10.<br>The targeted audience should be this % size across Pinterest.)<br>VISITOR: { \"visitor_source_id\": [\"&lt;conversion tag ID&gt;\"], \"retention_days\": \"180\", \"event_source\": {\"=\": [\"web\", \"mobile\"]}, \"ingestion_source\": {\"=\": [\"tag\"]}}<br>(Retention days should be 1-540. Retention applies to specific customers.)<br>ENGAGEMENT: {\"engagement_domain\": [\"www.entomi.com\"], \"engager_type\": 1}<br>For more details on engagement audiences, see <a href=\"https://developers.pinterest.com/docs/redoc/adtech_ads_v4/#section/November-2021\" target=\"_blank\">November 2021 changelog</a>.|
|*AudienceSharingType* | Audience sharing type: [\"CUSTOM\", \"SYNDICATED\"]|
|*AudienceSubcategory* | |
|*AudienceType* | Audience type|
|*AudienceUpdateOperationType* | Audience operation type (update or remove).|
|*AudienceUpdateRequest* | |
|*Audiences_list_200_response* | |
|*AvailabilityFilter* | |
|*BatchOperation* | The operation performed by the batch. The DELETE_DISCONTINUED operation only updates availablity to \"Out of Stock\".|
|*BatchOperationStatus* | The status of the operation performed by the batch|
|*BidFloor* | |
|*BidFloorRequest* | |
|*BidFloorSpec* | |
|*BillingProfilesResponse* | |
|*Billing_profiles_get_200_response* | |
|*Board* | Board|
|*BoardOwner* | |
|*BoardSection* | Sections help organize pins within a board.|
|*BoardUpdate* | Board fields for updates|
|*Board_media* | Board media.|
|*Board_owner* | |
|*Board_sections_list_200_response* | |
|*Boards_list_200_response* | |
|*Boards_list_pins_200_response* | |
|*Boards_user_follows_list_200_response* | |
|*BookClosedResponse* | Creation fields|
|*BrandFilter* | |
|*BudgetType* | Budget type. If DAILY, an ad group's daily spend will not exceed the budget parameter value. If LIFETIME, the end_time parameter is **REQUIRED**, and the ad group spend is spread evenly between the ad group `start_time` and `end_time` range. A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. For CBO campaigns, only \"CBO_ADGROUP\" is allowed. For WEB_SESSIONS campaigns, only \"LIFETIME\" is allowed. For update, only draft ad groups may update budget type.|
|*BulkDownloadRequest* | Ad entities to get in bulk request.|
|*BulkDownloadRequest_campaign_filter* | |
|*BulkDownloadResponse* | |
|*BulkEntityType* | Refers ads entity type|
|*BulkOutputFormat* | Bulk file output format|
|*BulkReportingJobStatus* | Possible status for a bulk reporting job|
|*BulkUpsertRequest* | Two set of objects to be managed asyncronusly by bulk. One for creations, one for modifications.|
|*BulkUpsertRequestCreate* | Request for creation of entities in bulk.|
|*BulkUpsertRequestUpdate* | Request for creation of entities in bulk.|
|*BulkUpsertResponse* | ID of the bulk request.|
|*BulkUpsertStatus* | |
|*BulkUpsertStatusResponse* | ID of the bulk request.|
|*BusinessAccessRole* | Permission role for business access.|
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
|*Catalog* | Catalog entity|
|*CatalogProductGroup* | non-promoted catalog product group entity|
|*CatalogsCreateHotelItem* | A hotel item to be created.|
|*CatalogsCreateRetailItem* | An item to be created|
|*CatalogsDbItem* | |
|*CatalogsDeleteHotelItem* | A hotel item to be deleted|
|*CatalogsDeleteRetailItem* | An item to be deleted|
|*CatalogsFeed* | Catalogs Feed object|
|*CatalogsFeedCredentials* | This field is **OPTIONAL**. Use this if your feed file requires username and password.|
|*CatalogsFeedIngestionDetails* | |
|*CatalogsFeedIngestionErrors* | |
|*CatalogsFeedIngestionInfo* | |
|*CatalogsFeedIngestionWarnings* | |
|*CatalogsFeedProcessingResult* | |
|*CatalogsFeedProcessingSchedule* | Daily processing schedule. This field is **OPTIONAL**. Use this to configure the preferred time for processing a feed (otherwise random).|
|*CatalogsFeedProcessingStatus* | |
|*CatalogsFeedProductCounts* | The counts can be null early in the process.|
|*CatalogsFeedValidationDetails* | |
|*CatalogsFeedValidationErrors* | |
|*CatalogsFeedValidationWarnings* | |
|*CatalogsFeedsCreateRequest* | Request object for creating a feed. Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.|
|*CatalogsFeedsCreateRequest_default_locale* | The locale used within a feed for product descriptions.|
|*CatalogsFeedsUpdateRequest* | Request object for updating a feed.|
|*CatalogsFormat* | The file format of a feed.|
|*CatalogsHotelAddress* | |
|*CatalogsHotelAttributes* | |
|*CatalogsHotelAttributes_allOf_main_image* | The main hotel image|
|*CatalogsHotelBatchItem* | Hotel batch item|
|*CatalogsHotelBatchRequest* | Request object to update catalogs hotel items|
|*CatalogsHotelFeed* | Catalogs Hotel Feed object|
|*CatalogsHotelFeedsCreateRequest* | Request object for creating a feed. Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.|
|*CatalogsHotelFeedsUpdateRequest* | Request object for updating a feed.|
|*CatalogsHotelGuestRatings* | If specified, you must provide all properties|
|*CatalogsHotelItemErrorResponse* | Object describing a hotel item error|
|*CatalogsHotelItemResponse* | Object describing a hotel record|
|*CatalogsHotelItemsBatch* | Object describing the catalogs hotel items batch|
|*CatalogsHotelItemsFilter* | |
|*CatalogsHotelProductGroup* | |
|*CatalogsHotelProductGroupCreateRequest* | Request object for creating a hotel product group.|
|*CatalogsHotelProductGroupFilterKeys* | |
|*CatalogsHotelProductGroupFilters* | Object holding a group of filters for a hotel product group|
|*CatalogsHotelProductGroupFiltersAllOf* | |
|*CatalogsHotelProductGroupFiltersAnyOf* | |
|*CatalogsHotelProductGroupUpdateRequest* | Request object for updating a hotel product group.|
|*CatalogsItemValidationDetails* | |
|*CatalogsItemValidationErrors* | |
|*CatalogsItemValidationIssue* | |
|*CatalogsItemValidationIssues* | |
|*CatalogsItemValidationWarnings* | |
|*CatalogsItems* | Response object of catalogs items|
|*CatalogsItemsBatch* | Object describing the catalogs items batch|
|*CatalogsItemsBatchRequest* | Request object of catalogs items batch|
|*CatalogsItemsCreateBatchRequest* | Request object to create catalogs items|
|*CatalogsItemsDeleteBatchRequest* | Request object to delete catalogs items|
|*CatalogsItemsDeleteDiscontinuedBatchRequest* | Request object to discontinue catalogs items|
|*CatalogsItemsFilters* | |
|*CatalogsItemsUpdateBatchRequest* | Request object to update catalogs items|
|*CatalogsItemsUpsertBatchRequest* | Request object to upsert catalogs items|
|*CatalogsListProductsByFilterRequest* | Request object to list products for a given product group filter.|
|*CatalogsListProductsByFilterRequest_oneOf* | Request object to list products for a given feed_id and product group filter.|
|*CatalogsLocale* | |
|*CatalogsProduct* | |
|*CatalogsProductGroup* | catalog product group entity|
|*CatalogsProductGroupCreateRequest* | Request object for creating a product group.|
|*CatalogsProductGroupCurrencyCriteria* | A currency filter. This filter cannot be negated|
|*CatalogsProductGroupFilterKeys* | |
|*CatalogsProductGroupFilters* | Object holding a group of filters for a catalog product group|
|*CatalogsProductGroupFiltersAllOf* | |
|*CatalogsProductGroupFiltersAnyOf* | |
|*CatalogsProductGroupFiltersRequest* | Object holding a group of filters for request on catalog product group. This is a distinct schema It is not possible to create or update a Product Group with empty filters. But some automatically generated Product Groups might have empty filters.|
|*CatalogsProductGroupFiltersRequest_anyOf* | |
|*CatalogsProductGroupFiltersRequest_anyOf_1* | |
|*CatalogsProductGroupMultipleCountriesCriteria* | |
|*CatalogsProductGroupMultipleGenderCriteria* | |
|*CatalogsProductGroupMultipleStringCriteria* | |
|*CatalogsProductGroupMultipleStringListCriteria* | |
|*CatalogsProductGroupPricingCriteria* | |
|*CatalogsProductGroupProductCounts* | Product counts for a CatalogsProductGroup|
|*CatalogsProductGroupStatus* | |
|*CatalogsProductGroupType* | <p>Catalog product group type</p> <p>MERCHANT_CREATED: Product groups created by merchants. <br>ALL_PRODUCTS: Consists of every product in your latest successful feed upload. <br>BEST_DEALS: Consists of products with the deepest drop in price. <br>PINNER_FAVORITES: Consists of products that are resonating most with people on Pinterest, based on engagement. <br>TOP_SELLERS: Consists of products with the highest conversion rate, if you have the conversion tag installed. <br>BACK_IN_STOCK: Consists of products that were previously out of stock and are now in stock. <br>NEW_ARRIVALS: Consists of products that are new to your Catalog. <br>SHOPIFY_COLLECTION: Product groups created based on Shopify Product Collections. <br>I2PC: Product groups created based on predicted product category.</p>|
|*CatalogsProductGroupUpdateRequest* | Request object for updating a product group.|
|*CatalogsProductMetadata* | Product metadata entity|
|*CatalogsRetailBatchRequest* | A request object that can have multiple operations on a single retail batch|
|*CatalogsRetailBatchRequest_items_inner* | |
|*CatalogsRetailFeed* | Catalogs Retail Feed object|
|*CatalogsRetailFeedsCreateRequest* | Request object for creating a retail feed.|
|*CatalogsRetailFeedsUpdateRequest* | Request object for updating a feed.|
|*CatalogsRetailItemErrorResponse* | Object describing a retail item error|
|*CatalogsRetailItemResponse* | Object describing a retail item record|
|*CatalogsRetailItemsBatch* | Object describing the catalogs retail items batch|
|*CatalogsRetailItemsFilter* | |
|*CatalogsRetailProductGroup* | |
|*CatalogsStatus* | Status for catalogs entities. Present in catalogs_feed values. When a feed is deleted, the response will inform DELETED as status.|
|*CatalogsType* | Type of the catalog entity.|
|*CatalogsUpdatableHotelAttributes* | |
|*CatalogsUpdateHotelItem* | Object describing an hotel item batch record|
|*CatalogsUpdateRetailItem* | An item to be updated|
|*CatalogsUpsertHotelItem* | A hotel item to be upserted.|
|*CatalogsUpsertRetailItem* | An item to be upserted|
|*CatalogsVerticalBatchRequest* | A request object that can have multiple operations on a single batch|
|*CatalogsVerticalFeedsCreateRequest* | Request object for creating a feed.|
|*CatalogsVerticalFeedsUpdateRequest* | Request object for updating a feed.|
|*CatalogsVerticalProductGroup* | |
|*CatalogsVerticalProductGroupCreateRequest* | Request object for creating a hotel product group.|
|*CatalogsVerticalProductGroupUpdateRequest* | Request object for updating a hotel product group.|
|*Catalogs_list_200_response* | |
|*Catalogs_product_group_pins_list_200_response* | |
|*Catalogs_product_group_pricing_currency_criteria* | |
|*Catalogs_product_groups_create_201_response* | |
|*Catalogs_product_groups_create_request* | |
|*Catalogs_product_groups_list_200_response* | |
|*Catalogs_product_groups_list_200_response_allOf_items_inner* | |
|*Catalogs_product_groups_update_request* | |
|*ConditionFilter* | |
|*ConversionApiResponse* | Schema describing the object in the response, which contains information about the events that were received and processed.|
|*ConversionApiResponse_events_inner* | |
|*ConversionAttributionWindowDays* | |
|*ConversionEventResponse* | |
|*ConversionEvents* | A list of events (one or more) encapsulated by a data object.|
|*ConversionEventsUserData* | Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent.|
|*ConversionEvents_data_inner* | |
|*ConversionEvents_data_inner_custom_data* | Object containing other custom data.|
|*ConversionEvents_data_inner_custom_data_contents_inner* | |
|*ConversionReportAttributionType* | Attribution type. Refers to the Pinterest Tag endpoints|
|*ConversionReportTimeType* | Conversion report time type|
|*ConversionTagCommon* | |
|*ConversionTagConfigs* | |
|*ConversionTagCreate* | |
|*ConversionTagListResponse* | |
|*ConversionTagResponse* | |
|*ConversionTagType* | conversion tag type|
|*Country* | Country ID from ISO 3166-1 alpha-2.|
|*CountryFilter* | |
|*CreateMMMReportRequest* | |
|*CreateMMMReportResponse* | |
|*CreateMMMReportResponseData* | |
|*CreativeType* | Ad creative type enum. For update, only draft ads may update creative type. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.|
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
|*DetailedError* | Used for including extra details to a base error|
|*EnhancedMatchStatusType* | The enhanced match status of the tag|
|*EntityStatus* | Entity status|
|*Error* | |
|*Exception* | |
|*Feed_processing_results_list_200_response* | |
|*Feeds_create_request* | |
|*Feeds_list_200_response* | |
|*Feeds_update_request* | |
|*FollowUserRequest* | |
|*Followers_list_200_response* | |
|*Gender* | |
|*GenderFilter* | |
|*GetAudiencesOrderBy* | |
|*GetMMMReportResponse* | |
|*GetMMMReportResponseData* | |
|*GoogleProductCategory0Filter* | |
|*GoogleProductCategory1Filter* | |
|*GoogleProductCategory2Filter* | |
|*GoogleProductCategory3Filter* | |
|*GoogleProductCategory4Filter* | |
|*GoogleProductCategory5Filter* | |
|*GoogleProductCategory6Filter* | |
|*Granularity* | Granularity|
|*GridClickType* | Where a user is taken after clicking on an ad in grid.|
|*HotelIdFilter* | |
|*HotelProcessingRecord* | Object describing an item processing record|
|*ImageDetails* | |
|*ImageMetadata* | |
|*ImageMetadata_images* | |
|*IntegrationLog* | Schema for log sent from an integration application.|
|*IntegrationLogClientError* | System error details included in the log sent by the client.|
|*IntegrationLogClientRequest* | HTTP request details included in the log sent by the client.|
|*IntegrationLogsInvalidLogResponse* | Schema describing the response when a log has invalid fields.|
|*IntegrationLogsInvalidLogResponse_rejected_logs_inner* | |
|*IntegrationLogsRequest* | Batch of logs sent from an integration application.|
|*IntegrationLogsSuccessResponse* | Response when logs are successfully processed.|
|*IntegrationMetadata* | Integration metadata|
|*IntegrationRecord* | Integration record|
|*IntegrationRequest* | Schema used for creating the integration metadata.|
|*IntegrationRequestPatch* | Schema used for updating the integration metadata.|
|*Integrations_get_list_200_response* | |
|*Interest* | |
|*ItemAttributes* | |
|*ItemBatchRecord* | Object describing an item batch record|
|*ItemCreateBatchRecord* | Object describing an item batch record to create items|
|*ItemDeleteBatchRecord* | Object describing an item batch record to delete items|
|*ItemDeleteDiscontinuedBatchRecord* | Object describing an item batch record to discontinue items|
|*ItemGroupIdFilter* | |
|*ItemIdFilter* | |
|*ItemProcessingRecord* | Object describing an item processing record|
|*ItemProcessingStatus* | The status of the item processing record|
|*ItemResponse* | Object describing an item record|
|*ItemResponse_anyOf* | |
|*ItemResponse_anyOf_1* | |
|*ItemUpdateBatchRecord* | Object describing an item batch record to update items|
|*ItemUpsertBatchRecord* | Object describing an item batch record to upsert items|
|*ItemValidationEvent* | Object describing an item validation event|
|*Items_batch_post_request* | |
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
|*LeadFormCommon* | Creation fields|
|*LeadFormQuestion* | |
|*LeadFormQuestionFieldType* | Lead form question field type|
|*LeadFormQuestionType* | Lead form question type|
|*LeadFormResponse* | |
|*LeadFormStatus* | Status of the lead form|
|*LeadFormTestRequest* | Request to create test data for lead data test API.|
|*LeadFormTestResponse* | Response for lead data test API.|
|*Lead_forms_list_200_response* | |
|*LineItem* | |
|*LinkedBusiness* | |
|*MMMReportingColumn* | Marketing Mix Modeling (MMM) Reporting Columns|
|*MMMReportingTargetingType* | Ad targeting types for MMM report|
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
|*OauthAccessTokenResponseEverlastingRefresh* | A successful OAuth access token response for the refresh token flow, with an added everlasting refresh token.|
|*OauthAccessTokenResponseIntegrationRefresh* | A successful OAuth access token response for the refresh token flow, with an added refresh token.|
|*OauthAccessTokenResponseRefresh* | A successful OAuth access token response for the refresh token flow.|
|*ObjectiveType* | Campaign objective type. If set as one of [\"AWARENESS\", \"CONSIDERATION\", \"WEB_CONVERSION\", \"CATALOG_SALES\"] the campaign is considered as a Campaign Budget Optimization (CBO) campaign, meaning budget needs to be set at the campaign level rather than at the ad group level. [\"WEB_SESSIONS\"] in BETA. For update, only draft campaigns may update objective type.|
|*OptimizationGoalMetadata* | |
|*OptimizationGoalMetadata_conversion_tag_v3_goal_metadata* | |
|*OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows* | |
|*OptimizationGoalMetadata_frequency_goal_metadata* | |
|*OptimizationGoalMetadata_scrollup_goal_metadata* | |
|*OrderLine* | |
|*OrderLineError* | |
|*OrderLinePaidType* | Order Line Paid Type|
|*OrderLineResponse* | |
|*OrderLineSingleResponse* | |
|*OrderLineStatus* | Order Line Status|
|*OrderLines* | Order Line|
|*OrderLinesArrayResponse* | |
|*Order_lines_list_200_response* | |
|*PacingDeliveryType* | Ad group pacing delivery type. With ACCELERATED, an ad group budget is spent as fast as possible. With STANDARD, an ad group budget is spent smoothly over a day. When using CBO, only the STANDARD pacing delivery type is allowed.|
|*Page_visit_conversion_tags_get_200_response* | |
|*Paginated* | |
|*PartnerType* | |
|*Pin* | Pin|
|*PinAnalyticsMetricsResponse* | |
|*PinAnalyticsMetricsResponse_daily_metrics_inner* | |
|*PinCreate* | Pin|
|*PinMedia* | Pin media objects.|
|*PinMediaMetadata* | |
|*PinMediaSource* | Pin media source.|
|*PinMediaSourceImageBase64* | Base64-encoded image media source|
|*PinMediaSourceImageURL* | Image URL-based media source|
|*PinMediaSourceImagesBase64* | Multiple Base64-encoded images media source|
|*PinMediaSourceImagesBase64_items_inner* | |
|*PinMediaSourceImagesURL* | Multiple images urls-based media source|
|*PinMediaSourceImagesURL_items_inner* | |
|*PinMediaSourcePinURL* | Pin URL-based media source for product pin creation. Currently the field is only available to a list of beta users.|
|*PinMediaSourceVideoID* | Video ID-based media source|
|*PinMediaWithImage* | Pin with image.|
|*PinMediaWithImageAndVideo* | Pin with a mix of images and videos.|
|*PinMediaWithImages* | Pin with multiple images.|
|*PinMediaWithVideo* | Pin with video.|
|*PinMediaWithVideos* | Pin with multiple videos.|
|*PinPromotionSummaryStatus* | Summary status for pin promotions|
|*PinUpdate* | Pin fields for updates|
|*PinUpdate_carousel_slots_inner* | |
|*Pins_analytics_metric_types_parameter_inner* | |
|*Pins_list_200_response* | |
|*Pins_save_request* | |
|*PinterestTagEventData* | Optional for VISITOR `audience_type`. With the Pinterest tag, you can use event data to capture event details from your website. This object lists all the available predefined event data fields in the Pinterest tag. You can include these event data fields as part of a VISITOR audience’s `rule`; however, you **must** specify an `event` for the `event_data` fields to be evaluated. Besides what’s listed, you can also create your own set of `event_data` fields and define their usages or purposes according to your website needs. However, the benefit of using the predefined event data fields is that we can provide various metrics based on those fields' data.<br>Examples per `event` type:<br>`pagevisit`<br>\"event_data\": { \"page_name\": \"My online store 123 | view items | shoe\" }<br>`signup`<br>\"event_data\": { \"lead_type\": \"New release promotion\" }<br>`checkout`<br>\"event_data\": { \"value\": 116, \"order_quantity\": 2, \"currency\": \"USD\", \"line_items\": [ { \"product_name\": \"Pillows (Set of 2)\", \"product_id\": \"11\", \"product_price\": 48, \"product_quantity\": 1 }, { \"product_name\": \"Pillows, Large (Set of 2)\", \"product_id\": \"15\", \"product_price\": 68, \"product_quantity\": 1 } ] }<br>`addtocart`<br>\"event_data\": { \"value\": 499, \"order_quantity\": 1, \"currency\": \"USD\", \"line_items\": [ { \"product_name\": \"Red leather boots\", \"product_id\": \"3486\", \"product_category\": \"shoe\", \"product_variant_id\": \"JB11103000\", \"product_price\": 499, \"product_quantity\": \"1\", \"product_brand\": \"My brand\" }]}<br>`watchvideo`<br>\"event_data\": { \"video_title\": \"My Product Video 01\" }<br>`lead`<br>\"event_data\": { \"lead_type\": \"Newsletter\" }|
|*PlacementGroupType* | Campaign placement group type|
|*PriceFilter* | |
|*ProductAvailabilityType* | Default availability for products in a feed.|
|*ProductGroupAnalyticsResponse_inner* | |
|*ProductGroupPromotion* | |
|*ProductGroupPromotionCreateRequest* | |
|*ProductGroupPromotionResponse* | |
|*ProductGroupPromotionResponseItem* | |
|*ProductGroupPromotionUpdateRequest* | |
|*ProductGroupSummaryStatus* | Summary status for product group|
|*ProductType0Filter* | |
|*ProductType1Filter* | |
|*ProductType2Filter* | |
|*ProductType3Filter* | |
|*ProductType4Filter* | |
|*Product_group_promotions_list_200_response* | |
|*QuizPinData* | This field includes all quiz data including questions, options, and results.|
|*QuizPinOption* |  This field contains multiple options to a quiz question.|
|*QuizPinQuestion* | A specific quiz inquiry.|
|*QuizPinResult* | The result, and link out, based on the user’s choice.|
|*RelatedTerms* | |
|*RelatedTerms_related_terms_list_inner* | |
|*ReportingColumnAsync* | Reporting columns|
|*Role* | An internal role type used on business access, EMPLOYEE, ADMIN.|
|*SSIOAccountAddress* | |
|*SSIOAccountItem* | |
|*SSIOAccountPMPName* | |
|*SSIOAccountResponse* | |
|*SSIOCreateInsertionOrderRequest* | |
|*SSIOCreateInsertionOrderResponse* | |
|*SSIOEditInsertionOrderRequest* | |
|*SSIOEditInsertionOrderResponse* | |
|*SSIOInsertionOrderCommon* | |
|*SSIOInsertionOrderStatus* | |
|*SSIOInsertionOrderStatusResponse* | |
|*SSIOOrderLine* | |
|*Search_partner_pins_200_response* | |
|*Search_user_boards_get_200_response* | |
|*SingleInterestTargetingOptionResponse* | |
|*Ssio_insertion_orders_status_get_by_ad_account_200_response* | |
|*Ssio_order_lines_get_by_ad_account_200_response* | |
|*SummaryPin* | Summarized pin information|
|*SummaryPin_media* | |
|*TargetingAdvertiserCountry* | Advertiser's ISO two character country code.|
|*TargetingSpec* | Ad group targeting specification defining the ad group target audience. For example, {\"APPTYPE\":[\"iphone\"], \"GENDER\":[\"male\"], \"LOCALE\":[\"en-US\"], \"LOCATION\":[\"501\"], \"AGE_BUCKET\":[\"25-34\"]}|
|*TargetingSpec_SHOPPING_RETARGETING* | |
|*TargetingTypeFilter* | |
|*TemplateResponse* | Template fields|
|*TemplateResponse_date_range* | |
|*TemplateResponse_date_range_absolute_date_range* | The absolute date range of the template|
|*TemplateResponse_date_range_dynamic_date_range* | The dynamic date range of the template|
|*TemplateResponse_date_range_relative_date_range* | The relative date range of the template|
|*Templates_list_200_response* | |
|*TermsOfService* | |
|*TopPinsAnalyticsResponse* | |
|*TopPinsAnalyticsResponse_date_availability* | |
|*TopPinsAnalyticsResponse_pins_inner* | Array with metrics, status, and pin id for the requested metric|
|*TopVideoPinsAnalyticsResponse* | |
|*TopVideoPinsAnalyticsResponse_pins_inner* | Array with metrics, status, and pin id for the requested metric|
|*TrackingUrls* | Third-party tracking URLs. Up to three tracking URLs - with a max length of 2,000 - are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.|
|*TrendType* | |
|*TrendingKeywordsResponse* | |
|*TrendingKeywordsResponse_trends_inner* | |
|*TrendingKeywordsResponse_trends_inner_time_series* | A sequence of weekly observations of the relative search volume for this keyword over the past year.<br /> These values are normalized to a [0-100] range, and can be used to visualize the history of user interest in this keyword. By default, normalization is applied independently to the time series of each keyword, but the `normalize_against_group` query parameter can be used in cases where you wish to compare relative volume between keywords.<br /> **Note**: The date of each observation is in ISO-8601 format and represents the *end* of the week.  For example, a value of `2023-10-31` would include searches that happened between `2023-10-25` and `2023-10-31`.|
|*TrendsSupportedRegion* | |
|*UpdatableItemAttributes* | |
|*UpdateMaskFieldType* | The field types supported by the update mask|
|*UserFollowingFeedType* | Specifies the type of followees to be kept when filtering them.|
|*UserListOperationType* | User list operation type (add or remove)|
|*UserListType* | User list type|
|*UserSummary* | |
|*UserWebsiteSummary* | |
|*UserWebsiteVerificationCode* | |
|*UserWebsiteVerifyRequest* | User website verification request|
|*User_account_followed_interests_200_response* | |
|*User_following_get_200_response* | |
|*User_websites_get_200_response* | |
|*VideoMetadata* | |

