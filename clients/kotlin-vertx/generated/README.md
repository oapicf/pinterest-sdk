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

<a id="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://api.pinterest.com/v5*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AdAccountsApi* | [**adAccountAnalytics**](docs/AdAccountsApi.md#adaccountanalytics) | **GET** /ad_accounts/{ad_account_id}/analytics | Get ad account analytics
*AdAccountsApi* | [**adAccountTargetingAnalyticsGet**](docs/AdAccountsApi.md#adaccounttargetinganalyticsget) | **GET** /ad_accounts/{ad_account_id}/targeting_analytics | Get targeting analytics for an ad account
*AdAccountsApi* | [**adAccountsCreate**](docs/AdAccountsApi.md#adaccountscreate) | **POST** /ad_accounts | Create ad account
*AdAccountsApi* | [**adAccountsGet**](docs/AdAccountsApi.md#adaccountsget) | **GET** /ad_accounts/{ad_account_id} | Get ad account
*AdAccountsApi* | [**adAccountsList**](docs/AdAccountsApi.md#adaccountslist) | **GET** /ad_accounts | List ad accounts
*AdAccountsApi* | [**analyticsCreateMmmReport**](docs/AdAccountsApi.md#analyticscreatemmmreport) | **POST** /ad_accounts/{ad_account_id}/mmm_reports | Create a request for a Marketing Mix Modeling (MMM) report
*AdAccountsApi* | [**analyticsCreateReport**](docs/AdAccountsApi.md#analyticscreatereport) | **POST** /ad_accounts/{ad_account_id}/reports | Create async request for an account analytics report
*AdAccountsApi* | [**analyticsCreateTemplateReport**](docs/AdAccountsApi.md#analyticscreatetemplatereport) | **POST** /ad_accounts/{ad_account_id}/templates/{template_id}/reports | Create async request for an analytics report using a template
*AdAccountsApi* | [**analyticsGetMmmReport**](docs/AdAccountsApi.md#analyticsgetmmmreport) | **GET** /ad_accounts/{ad_account_id}/mmm_reports | Get advertiser Marketing Mix Modeling (MMM) report.
*AdAccountsApi* | [**analyticsGetReport**](docs/AdAccountsApi.md#analyticsgetreport) | **GET** /ad_accounts/{ad_account_id}/reports | Get the account analytics report created by the async call
*AdAccountsApi* | [**sandboxDelete**](docs/AdAccountsApi.md#sandboxdelete) | **DELETE** /ad_accounts/{ad_account_id}/sandbox | Delete ads data for ad account in API Sandbox
*AdAccountsApi* | [**templatesList**](docs/AdAccountsApi.md#templateslist) | **GET** /ad_accounts/{ad_account_id}/templates | List templates
*AdGroupsApi* | [**adGroupsAnalytics**](docs/AdGroupsApi.md#adgroupsanalytics) | **GET** /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics
*AdGroupsApi* | [**adGroupsAudienceSizing**](docs/AdGroupsApi.md#adgroupsaudiencesizing) | **GET** /ad_accounts/{ad_account_id}/ad_groups/audience_sizing | Get audience sizing
*AdGroupsApi* | [**adGroupsBidFloorGet**](docs/AdGroupsApi.md#adgroupsbidfloorget) | **POST** /ad_accounts/{ad_account_id}/bid_floor | Get bid floors
*AdGroupsApi* | [**adGroupsCreate**](docs/AdGroupsApi.md#adgroupscreate) | **POST** /ad_accounts/{ad_account_id}/ad_groups | Create ad groups
*AdGroupsApi* | [**adGroupsGet**](docs/AdGroupsApi.md#adgroupsget) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id} | Get ad group
*AdGroupsApi* | [**adGroupsList**](docs/AdGroupsApi.md#adgroupslist) | **GET** /ad_accounts/{ad_account_id}/ad_groups | List ad groups
*AdGroupsApi* | [**adGroupsTargetingAnalyticsGet**](docs/AdGroupsApi.md#adgroupstargetinganalyticsget) | **GET** /ad_accounts/{ad_account_id}/ad_groups/targeting_analytics | Get targeting analytics for ad groups
*AdGroupsApi* | [**adGroupsUpdate**](docs/AdGroupsApi.md#adgroupsupdate) | **PATCH** /ad_accounts/{ad_account_id}/ad_groups | Update ad groups
*AdsApi* | [**adPreviewsCreate**](docs/AdsApi.md#adpreviewscreate) | **POST** /ad_accounts/{ad_account_id}/ad_previews | Create ad preview with pin or image
*AdsApi* | [**adTargetingAnalyticsGet**](docs/AdsApi.md#adtargetinganalyticsget) | **GET** /ad_accounts/{ad_account_id}/ads/targeting_analytics | Get targeting analytics for ads
*AdsApi* | [**adsAnalytics**](docs/AdsApi.md#adsanalytics) | **GET** /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics
*AdsApi* | [**adsCreate**](docs/AdsApi.md#adscreate) | **POST** /ad_accounts/{ad_account_id}/ads | Create ads
*AdsApi* | [**adsGet**](docs/AdsApi.md#adsget) | **GET** /ad_accounts/{ad_account_id}/ads/{ad_id} | Get ad
*AdsApi* | [**adsList**](docs/AdsApi.md#adslist) | **GET** /ad_accounts/{ad_account_id}/ads | List ads
*AdsApi* | [**adsUpdate**](docs/AdsApi.md#adsupdate) | **PATCH** /ad_accounts/{ad_account_id}/ads | Update ads
*AudienceInsightsApi* | [**audienceInsightsGet**](docs/AudienceInsightsApi.md#audienceinsightsget) | **GET** /ad_accounts/{ad_account_id}/audience_insights | Get audience insights
*AudienceInsightsApi* | [**audienceInsightsScopeAndTypeGet**](docs/AudienceInsightsApi.md#audienceinsightsscopeandtypeget) | **GET** /ad_accounts/{ad_account_id}/insights/audiences | Get audience insights scope and type
*AudiencesApi* | [**audiencesCreate**](docs/AudiencesApi.md#audiencescreate) | **POST** /ad_accounts/{ad_account_id}/audiences | Create audience
*AudiencesApi* | [**audiencesCreateCustom**](docs/AudiencesApi.md#audiencescreatecustom) | **POST** /ad_accounts/{ad_account_id}/audiences/custom | Create custom audience
*AudiencesApi* | [**audiencesGet**](docs/AudiencesApi.md#audiencesget) | **GET** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Get audience
*AudiencesApi* | [**audiencesList**](docs/AudiencesApi.md#audienceslist) | **GET** /ad_accounts/{ad_account_id}/audiences | List audiences
*AudiencesApi* | [**audiencesUpdate**](docs/AudiencesApi.md#audiencesupdate) | **PATCH** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Update audience
*BillingApi* | [**adsCreditRedeem**](docs/BillingApi.md#adscreditredeem) | **POST** /ad_accounts/{ad_account_id}/ads_credit/redeem | Redeem ad credits
*BillingApi* | [**adsCreditsDiscountsGet**](docs/BillingApi.md#adscreditsdiscountsget) | **GET** /ad_accounts/{ad_account_id}/ads_credit/discounts | Get ads credit discounts
*BillingApi* | [**billingProfilesGet**](docs/BillingApi.md#billingprofilesget) | **GET** /ad_accounts/{ad_account_id}/billing_profiles | Get billing profiles
*BillingApi* | [**ssioAccountsGet**](docs/BillingApi.md#ssioaccountsget) | **GET** /ad_accounts/{ad_account_id}/ssio/accounts | Get Salesforce account details including bill-to information.
*BillingApi* | [**ssioInsertionOrderCreate**](docs/BillingApi.md#ssioinsertionordercreate) | **POST** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Create insertion order through SSIO.
*BillingApi* | [**ssioInsertionOrderEdit**](docs/BillingApi.md#ssioinsertionorderedit) | **PATCH** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Edit insertion order through SSIO.
*BillingApi* | [**ssioInsertionOrdersStatusGetByAdAccount**](docs/BillingApi.md#ssioinsertionordersstatusgetbyadaccount) | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/status | Get insertion order status by ad account id.
*BillingApi* | [**ssioInsertionOrdersStatusGetByPinOrderId**](docs/BillingApi.md#ssioinsertionordersstatusgetbypinorderid) | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status | Get insertion order status by pin order id.
*BillingApi* | [**ssioOrderLinesGetByAdAccount**](docs/BillingApi.md#ssioorderlinesgetbyadaccount) | **GET** /ad_accounts/{ad_account_id}/ssio/order_lines | Get Salesforce order lines by ad account id.
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
*BulkApi* | [**bulkDownloadCreate**](docs/BulkApi.md#bulkdownloadcreate) | **POST** /ad_accounts/{ad_account_id}/bulk/download | Get advertiser entities in bulk
*BulkApi* | [**bulkRequestGet**](docs/BulkApi.md#bulkrequestget) | **GET** /ad_accounts/{ad_account_id}/bulk/{bulk_request_id} | Download advertiser entities in bulk
*BulkApi* | [**bulkUpsertCreate**](docs/BulkApi.md#bulkupsertcreate) | **POST** /ad_accounts/{ad_account_id}/bulk/upsert | Create/update ad entities in bulk
*CampaignsApi* | [**campaignTargetingAnalyticsGet**](docs/CampaignsApi.md#campaigntargetinganalyticsget) | **GET** /ad_accounts/{ad_account_id}/campaigns/targeting_analytics | Get targeting analytics for campaigns
*CampaignsApi* | [**campaignsAnalytics**](docs/CampaignsApi.md#campaignsanalytics) | **GET** /ad_accounts/{ad_account_id}/campaigns/analytics | Get campaign analytics
*CampaignsApi* | [**campaignsCreate**](docs/CampaignsApi.md#campaignscreate) | **POST** /ad_accounts/{ad_account_id}/campaigns | Create campaigns
*CampaignsApi* | [**campaignsGet**](docs/CampaignsApi.md#campaignsget) | **GET** /ad_accounts/{ad_account_id}/campaigns/{campaign_id} | Get campaign
*CampaignsApi* | [**campaignsList**](docs/CampaignsApi.md#campaignslist) | **GET** /ad_accounts/{ad_account_id}/campaigns | List campaigns
*CampaignsApi* | [**campaignsUpdate**](docs/CampaignsApi.md#campaignsupdate) | **PATCH** /ad_accounts/{ad_account_id}/campaigns | Update campaigns
*CatalogsApi* | [**catalogsList**](docs/CatalogsApi.md#catalogslist) | **GET** /catalogs | List catalogs
*CatalogsApi* | [**catalogsProductGroupPinsList**](docs/CatalogsApi.md#catalogsproductgrouppinslist) | **GET** /catalogs/product_groups/{product_group_id}/products | List products for a Product Group
*CatalogsApi* | [**catalogsProductGroupsCreate**](docs/CatalogsApi.md#catalogsproductgroupscreate) | **POST** /catalogs/product_groups | Create product group
*CatalogsApi* | [**catalogsProductGroupsDelete**](docs/CatalogsApi.md#catalogsproductgroupsdelete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group
*CatalogsApi* | [**catalogsProductGroupsGet**](docs/CatalogsApi.md#catalogsproductgroupsget) | **GET** /catalogs/product_groups/{product_group_id} | Get product group
*CatalogsApi* | [**catalogsProductGroupsList**](docs/CatalogsApi.md#catalogsproductgroupslist) | **GET** /catalogs/product_groups | List product groups
*CatalogsApi* | [**catalogsProductGroupsProductCountsGet**](docs/CatalogsApi.md#catalogsproductgroupsproductcountsget) | **GET** /catalogs/product_groups/{product_group_id}/product_counts | Get product counts for a Product Group
*CatalogsApi* | [**catalogsProductGroupsUpdate**](docs/CatalogsApi.md#catalogsproductgroupsupdate) | **PATCH** /catalogs/product_groups/{product_group_id} | Update product group
*CatalogsApi* | [**feedProcessingResultsList**](docs/CatalogsApi.md#feedprocessingresultslist) | **GET** /catalogs/feeds/{feed_id}/processing_results | List processing results for a given feed
*CatalogsApi* | [**feedsCreate**](docs/CatalogsApi.md#feedscreate) | **POST** /catalogs/feeds | Create feed
*CatalogsApi* | [**feedsDelete**](docs/CatalogsApi.md#feedsdelete) | **DELETE** /catalogs/feeds/{feed_id} | Delete feed
*CatalogsApi* | [**feedsGet**](docs/CatalogsApi.md#feedsget) | **GET** /catalogs/feeds/{feed_id} | Get feed
*CatalogsApi* | [**feedsList**](docs/CatalogsApi.md#feedslist) | **GET** /catalogs/feeds | List feeds
*CatalogsApi* | [**feedsUpdate**](docs/CatalogsApi.md#feedsupdate) | **PATCH** /catalogs/feeds/{feed_id} | Update feed
*CatalogsApi* | [**itemsBatchGet**](docs/CatalogsApi.md#itemsbatchget) | **GET** /catalogs/items/batch/{batch_id} | Get catalogs item batch status
*CatalogsApi* | [**itemsBatchPost**](docs/CatalogsApi.md#itemsbatchpost) | **POST** /catalogs/items/batch | Operate on item batch
*CatalogsApi* | [**itemsGet**](docs/CatalogsApi.md#itemsget) | **GET** /catalogs/items | Get catalogs items
*CatalogsApi* | [**itemsIssuesList**](docs/CatalogsApi.md#itemsissueslist) | **GET** /catalogs/processing_results/{processing_result_id}/item_issues | List item issues for a given processing result
*CatalogsApi* | [**productsByProductGroupFilterList**](docs/CatalogsApi.md#productsbyproductgroupfilterlist) | **POST** /catalogs/products/get_by_product_group_filters | List filtered products
*ConversionEventsApi* | [**eventsCreate**](docs/ConversionEventsApi.md#eventscreate) | **POST** /ad_accounts/{ad_account_id}/events | Send conversions
*ConversionTagsApi* | [**conversionTagsCreate**](docs/ConversionTagsApi.md#conversiontagscreate) | **POST** /ad_accounts/{ad_account_id}/conversion_tags | Create conversion tag
*ConversionTagsApi* | [**conversionTagsGet**](docs/ConversionTagsApi.md#conversiontagsget) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id} | Get conversion tag
*ConversionTagsApi* | [**conversionTagsList**](docs/ConversionTagsApi.md#conversiontagslist) | **GET** /ad_accounts/{ad_account_id}/conversion_tags | Get conversion tags
*ConversionTagsApi* | [**ocpmEligibleConversionTagsGet**](docs/ConversionTagsApi.md#ocpmeligibleconversiontagsget) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible | Get Ocpm eligible conversion tags
*ConversionTagsApi* | [**pageVisitConversionTagsGet**](docs/ConversionTagsApi.md#pagevisitconversiontagsget) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/page_visit | Get page visit conversion tags
*CustomerListsApi* | [**customerListsCreate**](docs/CustomerListsApi.md#customerlistscreate) | **POST** /ad_accounts/{ad_account_id}/customer_lists | Create customer lists
*CustomerListsApi* | [**customerListsGet**](docs/CustomerListsApi.md#customerlistsget) | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Get customer list
*CustomerListsApi* | [**customerListsList**](docs/CustomerListsApi.md#customerlistslist) | **GET** /ad_accounts/{ad_account_id}/customer_lists | Get customer lists
*CustomerListsApi* | [**customerListsUpdate**](docs/CustomerListsApi.md#customerlistsupdate) | **PATCH** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Update customer list
*IntegrationsApi* | [**integrationsCommerceDel**](docs/IntegrationsApi.md#integrationscommercedel) | **DELETE** /integrations/commerce/{external_business_id} | Delete commerce integration
*IntegrationsApi* | [**integrationsCommerceGet**](docs/IntegrationsApi.md#integrationscommerceget) | **GET** /integrations/commerce/{external_business_id} | Get commerce integration
*IntegrationsApi* | [**integrationsCommercePatch**](docs/IntegrationsApi.md#integrationscommercepatch) | **PATCH** /integrations/commerce/{external_business_id} | Update commerce integration
*IntegrationsApi* | [**integrationsCommercePost**](docs/IntegrationsApi.md#integrationscommercepost) | **POST** /integrations/commerce | Create commerce integration
*IntegrationsApi* | [**integrationsGetById**](docs/IntegrationsApi.md#integrationsgetbyid) | **GET** /integrations/{id} | Get integration metadata
*IntegrationsApi* | [**integrationsGetList**](docs/IntegrationsApi.md#integrationsgetlist) | **GET** /integrations | Get integration metadata list
*IntegrationsApi* | [**integrationsLogsPost**](docs/IntegrationsApi.md#integrationslogspost) | **POST** /integrations/logs | Receives batched logs from integration applications.
*KeywordsApi* | [**countryKeywordsMetricsGet**](docs/KeywordsApi.md#countrykeywordsmetricsget) | **GET** /ad_accounts/{ad_account_id}/keywords/metrics | Get country's keyword metrics
*KeywordsApi* | [**keywordsCreate**](docs/KeywordsApi.md#keywordscreate) | **POST** /ad_accounts/{ad_account_id}/keywords | Create keywords
*KeywordsApi* | [**keywordsGet**](docs/KeywordsApi.md#keywordsget) | **GET** /ad_accounts/{ad_account_id}/keywords | Get keywords
*KeywordsApi* | [**keywordsUpdate**](docs/KeywordsApi.md#keywordsupdate) | **PATCH** /ad_accounts/{ad_account_id}/keywords | Update keywords
*KeywordsApi* | [**trendingKeywordsList**](docs/KeywordsApi.md#trendingkeywordslist) | **GET** /trends/keywords/{region}/top/{trend_type} | List trending keywords
*LeadAdsApi* | [**adAccountsSubscriptionsDelById**](docs/LeadAdsApi.md#adaccountssubscriptionsdelbyid) | **DELETE** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Delete lead ads subscription
*LeadAdsApi* | [**adAccountsSubscriptionsGetById**](docs/LeadAdsApi.md#adaccountssubscriptionsgetbyid) | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Get lead ads subscription
*LeadAdsApi* | [**adAccountsSubscriptionsGetList**](docs/LeadAdsApi.md#adaccountssubscriptionsgetlist) | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions | Get lead ads subscriptions
*LeadAdsApi* | [**adAccountsSubscriptionsPost**](docs/LeadAdsApi.md#adaccountssubscriptionspost) | **POST** /ad_accounts/{ad_account_id}/leads/subscriptions | Create lead ads subscription
*LeadFormsApi* | [**leadFormGet**](docs/LeadFormsApi.md#leadformget) | **GET** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id} | Get lead form by id
*LeadFormsApi* | [**leadFormTestCreate**](docs/LeadFormsApi.md#leadformtestcreate) | **POST** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test | Create lead form test data
*LeadFormsApi* | [**leadFormsList**](docs/LeadFormsApi.md#leadformslist) | **GET** /ad_accounts/{ad_account_id}/lead_forms | Get lead forms
*MediaApi* | [**mediaCreate**](docs/MediaApi.md#mediacreate) | **POST** /media | Register media upload
*MediaApi* | [**mediaGet**](docs/MediaApi.md#mediaget) | **GET** /media/{media_id} | Get media upload details
*MediaApi* | [**mediaList**](docs/MediaApi.md#medialist) | **GET** /media | List media uploads
*OauthApi* | [**oauthToken**](docs/OauthApi.md#oauthtoken) | **POST** /oauth/token | Generate OAuth access token
*OrderLinesApi* | [**orderLinesGet**](docs/OrderLinesApi.md#orderlinesget) | **GET** /ad_accounts/{ad_account_id}/order_lines/{order_line_id} | Get order line
*OrderLinesApi* | [**orderLinesList**](docs/OrderLinesApi.md#orderlineslist) | **GET** /ad_accounts/{ad_account_id}/order_lines | Get order lines
*PinsApi* | [**pinsAnalytics**](docs/PinsApi.md#pinsanalytics) | **GET** /pins/{pin_id}/analytics | Get Pin analytics
*PinsApi* | [**pinsCreate**](docs/PinsApi.md#pinscreate) | **POST** /pins | Create Pin
*PinsApi* | [**pinsDelete**](docs/PinsApi.md#pinsdelete) | **DELETE** /pins/{pin_id} | Delete Pin
*PinsApi* | [**pinsGet**](docs/PinsApi.md#pinsget) | **GET** /pins/{pin_id} | Get Pin
*PinsApi* | [**pinsList**](docs/PinsApi.md#pinslist) | **GET** /pins | List Pins
*PinsApi* | [**pinsSave**](docs/PinsApi.md#pinssave) | **POST** /pins/{pin_id}/save | Save Pin
*PinsApi* | [**pinsUpdate**](docs/PinsApi.md#pinsupdate) | **PATCH** /pins/{pin_id} | Update Pin
*ProductGroupPromotionsApi* | [**productGroupPromotionsCreate**](docs/ProductGroupPromotionsApi.md#productgrouppromotionscreate) | **POST** /ad_accounts/{ad_account_id}/product_group_promotions | Create product group promotions
*ProductGroupPromotionsApi* | [**productGroupPromotionsGet**](docs/ProductGroupPromotionsApi.md#productgrouppromotionsget) | **GET** /ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id} | Get a product group promotion by id
*ProductGroupPromotionsApi* | [**productGroupPromotionsList**](docs/ProductGroupPromotionsApi.md#productgrouppromotionslist) | **GET** /ad_accounts/{ad_account_id}/product_group_promotions | Get product group promotions
*ProductGroupPromotionsApi* | [**productGroupPromotionsUpdate**](docs/ProductGroupPromotionsApi.md#productgrouppromotionsupdate) | **PATCH** /ad_accounts/{ad_account_id}/product_group_promotions | Update product group promotions
*ProductGroupPromotionsApi* | [**productGroupsAnalytics**](docs/ProductGroupPromotionsApi.md#productgroupsanalytics) | **GET** /ad_accounts/{ad_account_id}/product_groups/analytics | Get product group analytics
*ProductGroupsApi* | [**adAccountsCatalogsProductGroupsList**](docs/ProductGroupsApi.md#adaccountscatalogsproductgroupslist) | **GET** /ad_accounts/{ad_account_id}/product_groups/catalogs | Get catalog product groups
*ResourcesApi* | [**adAccountCountriesGet**](docs/ResourcesApi.md#adaccountcountriesget) | **GET** /resources/ad_account_countries | Get ad accounts countries
*ResourcesApi* | [**deliveryMetricsGet**](docs/ResourcesApi.md#deliverymetricsget) | **GET** /resources/delivery_metrics | Get available metrics' definitions
*ResourcesApi* | [**interestTargetingOptionsGet**](docs/ResourcesApi.md#interesttargetingoptionsget) | **GET** /resources/targeting/interests/{interest_id} | Get interest details
*ResourcesApi* | [**leadFormQuestionsGet**](docs/ResourcesApi.md#leadformquestionsget) | **GET** /resources/lead_form_questions | Get lead form questions
*ResourcesApi* | [**metricsReadyStateGet**](docs/ResourcesApi.md#metricsreadystateget) | **GET** /resources/metrics_ready_state | Get metrics ready state
*ResourcesApi* | [**targetingOptionsGet**](docs/ResourcesApi.md#targetingoptionsget) | **GET** /resources/targeting/{targeting_type} | Get targeting options
*SearchApi* | [**searchPartnerPins**](docs/SearchApi.md#searchpartnerpins) | **GET** /search/partner/pins | Search pins by a given search term
*SearchApi* | [**searchUserBoardsGet**](docs/SearchApi.md#searchuserboardsget) | **GET** /search/boards | Search user's boards
*SearchApi* | [**searchUserPinsList**](docs/SearchApi.md#searchuserpinslist) | **GET** /search/pins | Search user's Pins
*TermsApi* | [**termsRelatedList**](docs/TermsApi.md#termsrelatedlist) | **GET** /terms/related | List related terms
*TermsApi* | [**termsSuggestedList**](docs/TermsApi.md#termssuggestedlist) | **GET** /terms/suggested | List suggested terms
*TermsOfServiceApi* | [**termsOfServiceGet**](docs/TermsOfServiceApi.md#termsofserviceget) | **GET** /ad_accounts/{ad_account_id}/terms_of_service | Get terms of service
*UserAccountApi* | [**boardsUserFollowsList**](docs/UserAccountApi.md#boardsuserfollowslist) | **GET** /user_account/following/boards | List following boards
*UserAccountApi* | [**followUserUpdate**](docs/UserAccountApi.md#followuserupdate) | **POST** /user_account/following/{username} | Follow user
*UserAccountApi* | [**followersList**](docs/UserAccountApi.md#followerslist) | **GET** /user_account/followers | List followers
*UserAccountApi* | [**linkedBusinessAccountsGet**](docs/UserAccountApi.md#linkedbusinessaccountsget) | **GET** /user_account/businesses | List linked businesses
*UserAccountApi* | [**unverifyWebsiteDelete**](docs/UserAccountApi.md#unverifywebsitedelete) | **DELETE** /user_account/websites | Unverify website
*UserAccountApi* | [**userAccountAnalytics**](docs/UserAccountApi.md#useraccountanalytics) | **GET** /user_account/analytics | Get user account analytics
*UserAccountApi* | [**userAccountAnalyticsTopPins**](docs/UserAccountApi.md#useraccountanalyticstoppins) | **GET** /user_account/analytics/top_pins | Get user account top pins analytics
*UserAccountApi* | [**userAccountAnalyticsTopVideoPins**](docs/UserAccountApi.md#useraccountanalyticstopvideopins) | **GET** /user_account/analytics/top_video_pins | Get user account top video pins analytics
*UserAccountApi* | [**userAccountFollowedInterests**](docs/UserAccountApi.md#useraccountfollowedinterests) | **GET** /users/{username}/interests/follow | List following interests
*UserAccountApi* | [**userAccountGet**](docs/UserAccountApi.md#useraccountget) | **GET** /user_account | Get user account
*UserAccountApi* | [**userFollowingGet**](docs/UserAccountApi.md#userfollowingget) | **GET** /user_account/following | List following
*UserAccountApi* | [**userWebsitesGet**](docs/UserAccountApi.md#userwebsitesget) | **GET** /user_account/websites | Get user websites
*UserAccountApi* | [**verifyWebsiteUpdate**](docs/UserAccountApi.md#verifywebsiteupdate) | **POST** /user_account/websites | Verify website
*UserAccountApi* | [**websiteVerificationGet**](docs/UserAccountApi.md#websiteverificationget) | **GET** /user_account/websites/verification | Get user verification code for website claiming


<a id="documentation-for-models"></a>
## Documentation for Models

 - [org.openapitools.server.api.model.Account](docs/Account.md)
 - [org.openapitools.server.api.model.ActionType](docs/ActionType.md)
 - [org.openapitools.server.api.model.AdAccount](docs/AdAccount.md)
 - [org.openapitools.server.api.model.AdAccountAnalyticsResponseInner](docs/AdAccountAnalyticsResponseInner.md)
 - [org.openapitools.server.api.model.AdAccountCreateRequest](docs/AdAccountCreateRequest.md)
 - [org.openapitools.server.api.model.AdAccountCreateSubscriptionRequest](docs/AdAccountCreateSubscriptionRequest.md)
 - [org.openapitools.server.api.model.AdAccountCreateSubscriptionResponse](docs/AdAccountCreateSubscriptionResponse.md)
 - [org.openapitools.server.api.model.AdAccountGetSubscriptionResponse](docs/AdAccountGetSubscriptionResponse.md)
 - [org.openapitools.server.api.model.AdAccountOwner](docs/AdAccountOwner.md)
 - [org.openapitools.server.api.model.AdAccountsCatalogsProductGroupsList200Response](docs/AdAccountsCatalogsProductGroupsList200Response.md)
 - [org.openapitools.server.api.model.AdAccountsCountryResponse](docs/AdAccountsCountryResponse.md)
 - [org.openapitools.server.api.model.AdAccountsCountryResponseData](docs/AdAccountsCountryResponseData.md)
 - [org.openapitools.server.api.model.AdAccountsList200Response](docs/AdAccountsList200Response.md)
 - [org.openapitools.server.api.model.AdAccountsSubscriptionsGetList200Response](docs/AdAccountsSubscriptionsGetList200Response.md)
 - [org.openapitools.server.api.model.AdArrayResponse](docs/AdArrayResponse.md)
 - [org.openapitools.server.api.model.AdArrayResponseElement](docs/AdArrayResponseElement.md)
 - [org.openapitools.server.api.model.AdCommon](docs/AdCommon.md)
 - [org.openapitools.server.api.model.AdCommonQuizPinData](docs/AdCommonQuizPinData.md)
 - [org.openapitools.server.api.model.AdCommonTrackingUrls](docs/AdCommonTrackingUrls.md)
 - [org.openapitools.server.api.model.AdCountry](docs/AdCountry.md)
 - [org.openapitools.server.api.model.AdCreateRequest](docs/AdCreateRequest.md)
 - [org.openapitools.server.api.model.AdGroupArrayResponse](docs/AdGroupArrayResponse.md)
 - [org.openapitools.server.api.model.AdGroupArrayResponseElement](docs/AdGroupArrayResponseElement.md)
 - [org.openapitools.server.api.model.AdGroupAudienceSizingRequest](docs/AdGroupAudienceSizingRequest.md)
 - [org.openapitools.server.api.model.AdGroupAudienceSizingRequestKeywordsInner](docs/AdGroupAudienceSizingRequestKeywordsInner.md)
 - [org.openapitools.server.api.model.AdGroupAudienceSizingResponse](docs/AdGroupAudienceSizingResponse.md)
 - [org.openapitools.server.api.model.AdGroupCommon](docs/AdGroupCommon.md)
 - [org.openapitools.server.api.model.AdGroupCommonOptimizationGoalMetadata](docs/AdGroupCommonOptimizationGoalMetadata.md)
 - [org.openapitools.server.api.model.AdGroupCommonTrackingUrls](docs/AdGroupCommonTrackingUrls.md)
 - [org.openapitools.server.api.model.AdGroupCreateRequest](docs/AdGroupCreateRequest.md)
 - [org.openapitools.server.api.model.AdGroupResponse](docs/AdGroupResponse.md)
 - [org.openapitools.server.api.model.AdGroupSummaryStatus](docs/AdGroupSummaryStatus.md)
 - [org.openapitools.server.api.model.AdGroupUpdateRequest](docs/AdGroupUpdateRequest.md)
 - [org.openapitools.server.api.model.AdGroupsAnalyticsResponseInner](docs/AdGroupsAnalyticsResponseInner.md)
 - [org.openapitools.server.api.model.AdGroupsList200Response](docs/AdGroupsList200Response.md)
 - [org.openapitools.server.api.model.AdPinId](docs/AdPinId.md)
 - [org.openapitools.server.api.model.AdPreviewCreateFromImage](docs/AdPreviewCreateFromImage.md)
 - [org.openapitools.server.api.model.AdPreviewCreateFromPin](docs/AdPreviewCreateFromPin.md)
 - [org.openapitools.server.api.model.AdPreviewRequest](docs/AdPreviewRequest.md)
 - [org.openapitools.server.api.model.AdPreviewURLResponse](docs/AdPreviewURLResponse.md)
 - [org.openapitools.server.api.model.AdResponse](docs/AdResponse.md)
 - [org.openapitools.server.api.model.AdUpdateRequest](docs/AdUpdateRequest.md)
 - [org.openapitools.server.api.model.AdsAnalyticsCreateAsyncRequest](docs/AdsAnalyticsCreateAsyncRequest.md)
 - [org.openapitools.server.api.model.AdsAnalyticsCreateAsyncResponse](docs/AdsAnalyticsCreateAsyncResponse.md)
 - [org.openapitools.server.api.model.AdsAnalyticsFilterColumn](docs/AdsAnalyticsFilterColumn.md)
 - [org.openapitools.server.api.model.AdsAnalyticsFilterOperator](docs/AdsAnalyticsFilterOperator.md)
 - [org.openapitools.server.api.model.AdsAnalyticsGetAsyncResponse](docs/AdsAnalyticsGetAsyncResponse.md)
 - [org.openapitools.server.api.model.AdsAnalyticsMetricsFilter](docs/AdsAnalyticsMetricsFilter.md)
 - [org.openapitools.server.api.model.AdsAnalyticsResponseInner](docs/AdsAnalyticsResponseInner.md)
 - [org.openapitools.server.api.model.AdsAnalyticsTargetingType](docs/AdsAnalyticsTargetingType.md)
 - [org.openapitools.server.api.model.AdsCreditDiscountsResponse](docs/AdsCreditDiscountsResponse.md)
 - [org.openapitools.server.api.model.AdsCreditRedeemRequest](docs/AdsCreditRedeemRequest.md)
 - [org.openapitools.server.api.model.AdsCreditRedeemResponse](docs/AdsCreditRedeemResponse.md)
 - [org.openapitools.server.api.model.AdsCreditsDiscountsGet200Response](docs/AdsCreditsDiscountsGet200Response.md)
 - [org.openapitools.server.api.model.AdsList200Response](docs/AdsList200Response.md)
 - [org.openapitools.server.api.model.AnalyticsDailyMetrics](docs/AnalyticsDailyMetrics.md)
 - [org.openapitools.server.api.model.AnalyticsMetricsResponse](docs/AnalyticsMetricsResponse.md)
 - [org.openapitools.server.api.model.Audience](docs/Audience.md)
 - [org.openapitools.server.api.model.AudienceCategory](docs/AudienceCategory.md)
 - [org.openapitools.server.api.model.AudienceCommon](docs/AudienceCommon.md)
 - [org.openapitools.server.api.model.AudienceCreateCustomRequest](docs/AudienceCreateCustomRequest.md)
 - [org.openapitools.server.api.model.AudienceCreateRequest](docs/AudienceCreateRequest.md)
 - [org.openapitools.server.api.model.AudienceCreateRequest1AudienceType](docs/AudienceCreateRequest1AudienceType.md)
 - [org.openapitools.server.api.model.AudienceDataParty](docs/AudienceDataParty.md)
 - [org.openapitools.server.api.model.AudienceDefinition](docs/AudienceDefinition.md)
 - [org.openapitools.server.api.model.AudienceDefinitionResponse](docs/AudienceDefinitionResponse.md)
 - [org.openapitools.server.api.model.AudienceDemographicValue](docs/AudienceDemographicValue.md)
 - [org.openapitools.server.api.model.AudienceDemographics](docs/AudienceDemographics.md)
 - [org.openapitools.server.api.model.AudienceInsightCategoryArrayResponse](docs/AudienceInsightCategoryArrayResponse.md)
 - [org.openapitools.server.api.model.AudienceInsightCategoryCommon](docs/AudienceInsightCategoryCommon.md)
 - [org.openapitools.server.api.model.AudienceInsightType](docs/AudienceInsightType.md)
 - [org.openapitools.server.api.model.AudienceInsightsResponse](docs/AudienceInsightsResponse.md)
 - [org.openapitools.server.api.model.AudienceRule](docs/AudienceRule.md)
 - [org.openapitools.server.api.model.AudienceSharingType](docs/AudienceSharingType.md)
 - [org.openapitools.server.api.model.AudienceSubcategory](docs/AudienceSubcategory.md)
 - [org.openapitools.server.api.model.AudienceType](docs/AudienceType.md)
 - [org.openapitools.server.api.model.AudienceUpdateOperationType](docs/AudienceUpdateOperationType.md)
 - [org.openapitools.server.api.model.AudienceUpdateRequest](docs/AudienceUpdateRequest.md)
 - [org.openapitools.server.api.model.AudiencesList200Response](docs/AudiencesList200Response.md)
 - [org.openapitools.server.api.model.AvailabilityFilter](docs/AvailabilityFilter.md)
 - [org.openapitools.server.api.model.BatchOperation](docs/BatchOperation.md)
 - [org.openapitools.server.api.model.BatchOperationStatus](docs/BatchOperationStatus.md)
 - [org.openapitools.server.api.model.BidFloor](docs/BidFloor.md)
 - [org.openapitools.server.api.model.BidFloorRequest](docs/BidFloorRequest.md)
 - [org.openapitools.server.api.model.BidFloorSpec](docs/BidFloorSpec.md)
 - [org.openapitools.server.api.model.BillingProfilesGet200Response](docs/BillingProfilesGet200Response.md)
 - [org.openapitools.server.api.model.BillingProfilesResponse](docs/BillingProfilesResponse.md)
 - [org.openapitools.server.api.model.Board](docs/Board.md)
 - [org.openapitools.server.api.model.BoardMedia](docs/BoardMedia.md)
 - [org.openapitools.server.api.model.BoardOwner](docs/BoardOwner.md)
 - [org.openapitools.server.api.model.BoardSection](docs/BoardSection.md)
 - [org.openapitools.server.api.model.BoardSectionsList200Response](docs/BoardSectionsList200Response.md)
 - [org.openapitools.server.api.model.BoardUpdate](docs/BoardUpdate.md)
 - [org.openapitools.server.api.model.BoardsList200Response](docs/BoardsList200Response.md)
 - [org.openapitools.server.api.model.BoardsListPins200Response](docs/BoardsListPins200Response.md)
 - [org.openapitools.server.api.model.BoardsUserFollowsList200Response](docs/BoardsUserFollowsList200Response.md)
 - [org.openapitools.server.api.model.BookClosedResponse](docs/BookClosedResponse.md)
 - [org.openapitools.server.api.model.BrandFilter](docs/BrandFilter.md)
 - [org.openapitools.server.api.model.BudgetType](docs/BudgetType.md)
 - [org.openapitools.server.api.model.BulkDownloadRequest](docs/BulkDownloadRequest.md)
 - [org.openapitools.server.api.model.BulkDownloadRequestCampaignFilter](docs/BulkDownloadRequestCampaignFilter.md)
 - [org.openapitools.server.api.model.BulkDownloadResponse](docs/BulkDownloadResponse.md)
 - [org.openapitools.server.api.model.BulkEntityType](docs/BulkEntityType.md)
 - [org.openapitools.server.api.model.BulkOutputFormat](docs/BulkOutputFormat.md)
 - [org.openapitools.server.api.model.BulkReportingJobStatus](docs/BulkReportingJobStatus.md)
 - [org.openapitools.server.api.model.BulkUpsertRequest](docs/BulkUpsertRequest.md)
 - [org.openapitools.server.api.model.BulkUpsertRequestCreate](docs/BulkUpsertRequestCreate.md)
 - [org.openapitools.server.api.model.BulkUpsertRequestUpdate](docs/BulkUpsertRequestUpdate.md)
 - [org.openapitools.server.api.model.BulkUpsertResponse](docs/BulkUpsertResponse.md)
 - [org.openapitools.server.api.model.BulkUpsertStatus](docs/BulkUpsertStatus.md)
 - [org.openapitools.server.api.model.BulkUpsertStatusResponse](docs/BulkUpsertStatusResponse.md)
 - [org.openapitools.server.api.model.BusinessAccessRole](docs/BusinessAccessRole.md)
 - [org.openapitools.server.api.model.CampaignCommon](docs/CampaignCommon.md)
 - [org.openapitools.server.api.model.CampaignCreateCommon](docs/CampaignCreateCommon.md)
 - [org.openapitools.server.api.model.CampaignCreateRequest](docs/CampaignCreateRequest.md)
 - [org.openapitools.server.api.model.CampaignCreateResponse](docs/CampaignCreateResponse.md)
 - [org.openapitools.server.api.model.CampaignCreateResponseData](docs/CampaignCreateResponseData.md)
 - [org.openapitools.server.api.model.CampaignCreateResponseItem](docs/CampaignCreateResponseItem.md)
 - [org.openapitools.server.api.model.CampaignId](docs/CampaignId.md)
 - [org.openapitools.server.api.model.CampaignResponse](docs/CampaignResponse.md)
 - [org.openapitools.server.api.model.CampaignSummaryStatus](docs/CampaignSummaryStatus.md)
 - [org.openapitools.server.api.model.CampaignUpdateRequest](docs/CampaignUpdateRequest.md)
 - [org.openapitools.server.api.model.CampaignUpdateResponse](docs/CampaignUpdateResponse.md)
 - [org.openapitools.server.api.model.CampaignsAnalyticsResponseInner](docs/CampaignsAnalyticsResponseInner.md)
 - [org.openapitools.server.api.model.CampaignsList200Response](docs/CampaignsList200Response.md)
 - [org.openapitools.server.api.model.Catalog](docs/Catalog.md)
 - [org.openapitools.server.api.model.CatalogProductGroup](docs/CatalogProductGroup.md)
 - [org.openapitools.server.api.model.CatalogsCreateHotelItem](docs/CatalogsCreateHotelItem.md)
 - [org.openapitools.server.api.model.CatalogsCreateRetailItem](docs/CatalogsCreateRetailItem.md)
 - [org.openapitools.server.api.model.CatalogsDbItem](docs/CatalogsDbItem.md)
 - [org.openapitools.server.api.model.CatalogsDeleteHotelItem](docs/CatalogsDeleteHotelItem.md)
 - [org.openapitools.server.api.model.CatalogsDeleteRetailItem](docs/CatalogsDeleteRetailItem.md)
 - [org.openapitools.server.api.model.CatalogsFeed](docs/CatalogsFeed.md)
 - [org.openapitools.server.api.model.CatalogsFeedCredentials](docs/CatalogsFeedCredentials.md)
 - [org.openapitools.server.api.model.CatalogsFeedIngestionDetails](docs/CatalogsFeedIngestionDetails.md)
 - [org.openapitools.server.api.model.CatalogsFeedIngestionErrors](docs/CatalogsFeedIngestionErrors.md)
 - [org.openapitools.server.api.model.CatalogsFeedIngestionInfo](docs/CatalogsFeedIngestionInfo.md)
 - [org.openapitools.server.api.model.CatalogsFeedIngestionWarnings](docs/CatalogsFeedIngestionWarnings.md)
 - [org.openapitools.server.api.model.CatalogsFeedProcessingResult](docs/CatalogsFeedProcessingResult.md)
 - [org.openapitools.server.api.model.CatalogsFeedProcessingSchedule](docs/CatalogsFeedProcessingSchedule.md)
 - [org.openapitools.server.api.model.CatalogsFeedProcessingStatus](docs/CatalogsFeedProcessingStatus.md)
 - [org.openapitools.server.api.model.CatalogsFeedProductCounts](docs/CatalogsFeedProductCounts.md)
 - [org.openapitools.server.api.model.CatalogsFeedValidationDetails](docs/CatalogsFeedValidationDetails.md)
 - [org.openapitools.server.api.model.CatalogsFeedValidationErrors](docs/CatalogsFeedValidationErrors.md)
 - [org.openapitools.server.api.model.CatalogsFeedValidationWarnings](docs/CatalogsFeedValidationWarnings.md)
 - [org.openapitools.server.api.model.CatalogsFeedsCreateRequest](docs/CatalogsFeedsCreateRequest.md)
 - [org.openapitools.server.api.model.CatalogsFeedsCreateRequestDefaultLocale](docs/CatalogsFeedsCreateRequestDefaultLocale.md)
 - [org.openapitools.server.api.model.CatalogsFeedsUpdateRequest](docs/CatalogsFeedsUpdateRequest.md)
 - [org.openapitools.server.api.model.CatalogsFormat](docs/CatalogsFormat.md)
 - [org.openapitools.server.api.model.CatalogsHotelAddress](docs/CatalogsHotelAddress.md)
 - [org.openapitools.server.api.model.CatalogsHotelAttributes](docs/CatalogsHotelAttributes.md)
 - [org.openapitools.server.api.model.CatalogsHotelAttributesAllOfMainImage](docs/CatalogsHotelAttributesAllOfMainImage.md)
 - [org.openapitools.server.api.model.CatalogsHotelBatchItem](docs/CatalogsHotelBatchItem.md)
 - [org.openapitools.server.api.model.CatalogsHotelBatchRequest](docs/CatalogsHotelBatchRequest.md)
 - [org.openapitools.server.api.model.CatalogsHotelFeed](docs/CatalogsHotelFeed.md)
 - [org.openapitools.server.api.model.CatalogsHotelFeedsCreateRequest](docs/CatalogsHotelFeedsCreateRequest.md)
 - [org.openapitools.server.api.model.CatalogsHotelFeedsUpdateRequest](docs/CatalogsHotelFeedsUpdateRequest.md)
 - [org.openapitools.server.api.model.CatalogsHotelGuestRatings](docs/CatalogsHotelGuestRatings.md)
 - [org.openapitools.server.api.model.CatalogsHotelItemErrorResponse](docs/CatalogsHotelItemErrorResponse.md)
 - [org.openapitools.server.api.model.CatalogsHotelItemResponse](docs/CatalogsHotelItemResponse.md)
 - [org.openapitools.server.api.model.CatalogsHotelItemsBatch](docs/CatalogsHotelItemsBatch.md)
 - [org.openapitools.server.api.model.CatalogsHotelItemsFilter](docs/CatalogsHotelItemsFilter.md)
 - [org.openapitools.server.api.model.CatalogsHotelProductGroup](docs/CatalogsHotelProductGroup.md)
 - [org.openapitools.server.api.model.CatalogsHotelProductGroupCreateRequest](docs/CatalogsHotelProductGroupCreateRequest.md)
 - [org.openapitools.server.api.model.CatalogsHotelProductGroupFilterKeys](docs/CatalogsHotelProductGroupFilterKeys.md)
 - [org.openapitools.server.api.model.CatalogsHotelProductGroupFilters](docs/CatalogsHotelProductGroupFilters.md)
 - [org.openapitools.server.api.model.CatalogsHotelProductGroupFiltersAllOf](docs/CatalogsHotelProductGroupFiltersAllOf.md)
 - [org.openapitools.server.api.model.CatalogsHotelProductGroupFiltersAnyOf](docs/CatalogsHotelProductGroupFiltersAnyOf.md)
 - [org.openapitools.server.api.model.CatalogsHotelProductGroupUpdateRequest](docs/CatalogsHotelProductGroupUpdateRequest.md)
 - [org.openapitools.server.api.model.CatalogsItemValidationDetails](docs/CatalogsItemValidationDetails.md)
 - [org.openapitools.server.api.model.CatalogsItemValidationErrors](docs/CatalogsItemValidationErrors.md)
 - [org.openapitools.server.api.model.CatalogsItemValidationIssue](docs/CatalogsItemValidationIssue.md)
 - [org.openapitools.server.api.model.CatalogsItemValidationIssues](docs/CatalogsItemValidationIssues.md)
 - [org.openapitools.server.api.model.CatalogsItemValidationWarnings](docs/CatalogsItemValidationWarnings.md)
 - [org.openapitools.server.api.model.CatalogsItems](docs/CatalogsItems.md)
 - [org.openapitools.server.api.model.CatalogsItemsBatch](docs/CatalogsItemsBatch.md)
 - [org.openapitools.server.api.model.CatalogsItemsBatchRequest](docs/CatalogsItemsBatchRequest.md)
 - [org.openapitools.server.api.model.CatalogsItemsCreateBatchRequest](docs/CatalogsItemsCreateBatchRequest.md)
 - [org.openapitools.server.api.model.CatalogsItemsDeleteBatchRequest](docs/CatalogsItemsDeleteBatchRequest.md)
 - [org.openapitools.server.api.model.CatalogsItemsDeleteDiscontinuedBatchRequest](docs/CatalogsItemsDeleteDiscontinuedBatchRequest.md)
 - [org.openapitools.server.api.model.CatalogsItemsFilters](docs/CatalogsItemsFilters.md)
 - [org.openapitools.server.api.model.CatalogsItemsUpdateBatchRequest](docs/CatalogsItemsUpdateBatchRequest.md)
 - [org.openapitools.server.api.model.CatalogsItemsUpsertBatchRequest](docs/CatalogsItemsUpsertBatchRequest.md)
 - [org.openapitools.server.api.model.CatalogsList200Response](docs/CatalogsList200Response.md)
 - [org.openapitools.server.api.model.CatalogsListProductsByFilterRequest](docs/CatalogsListProductsByFilterRequest.md)
 - [org.openapitools.server.api.model.CatalogsListProductsByFilterRequestOneOf](docs/CatalogsListProductsByFilterRequestOneOf.md)
 - [org.openapitools.server.api.model.CatalogsLocale](docs/CatalogsLocale.md)
 - [org.openapitools.server.api.model.CatalogsProduct](docs/CatalogsProduct.md)
 - [org.openapitools.server.api.model.CatalogsProductGroup](docs/CatalogsProductGroup.md)
 - [org.openapitools.server.api.model.CatalogsProductGroupCreateRequest](docs/CatalogsProductGroupCreateRequest.md)
 - [org.openapitools.server.api.model.CatalogsProductGroupCurrencyCriteria](docs/CatalogsProductGroupCurrencyCriteria.md)
 - [org.openapitools.server.api.model.CatalogsProductGroupFilterKeys](docs/CatalogsProductGroupFilterKeys.md)
 - [org.openapitools.server.api.model.CatalogsProductGroupFilters](docs/CatalogsProductGroupFilters.md)
 - [org.openapitools.server.api.model.CatalogsProductGroupFiltersAllOf](docs/CatalogsProductGroupFiltersAllOf.md)
 - [org.openapitools.server.api.model.CatalogsProductGroupFiltersAnyOf](docs/CatalogsProductGroupFiltersAnyOf.md)
 - [org.openapitools.server.api.model.CatalogsProductGroupFiltersRequest](docs/CatalogsProductGroupFiltersRequest.md)
 - [org.openapitools.server.api.model.CatalogsProductGroupFiltersRequestAnyOf](docs/CatalogsProductGroupFiltersRequestAnyOf.md)
 - [org.openapitools.server.api.model.CatalogsProductGroupFiltersRequestAnyOf1](docs/CatalogsProductGroupFiltersRequestAnyOf1.md)
 - [org.openapitools.server.api.model.CatalogsProductGroupMultipleCountriesCriteria](docs/CatalogsProductGroupMultipleCountriesCriteria.md)
 - [org.openapitools.server.api.model.CatalogsProductGroupMultipleGenderCriteria](docs/CatalogsProductGroupMultipleGenderCriteria.md)
 - [org.openapitools.server.api.model.CatalogsProductGroupMultipleStringCriteria](docs/CatalogsProductGroupMultipleStringCriteria.md)
 - [org.openapitools.server.api.model.CatalogsProductGroupMultipleStringListCriteria](docs/CatalogsProductGroupMultipleStringListCriteria.md)
 - [org.openapitools.server.api.model.CatalogsProductGroupPinsList200Response](docs/CatalogsProductGroupPinsList200Response.md)
 - [org.openapitools.server.api.model.CatalogsProductGroupPricingCriteria](docs/CatalogsProductGroupPricingCriteria.md)
 - [org.openapitools.server.api.model.CatalogsProductGroupPricingCurrencyCriteria](docs/CatalogsProductGroupPricingCurrencyCriteria.md)
 - [org.openapitools.server.api.model.CatalogsProductGroupProductCounts](docs/CatalogsProductGroupProductCounts.md)
 - [org.openapitools.server.api.model.CatalogsProductGroupStatus](docs/CatalogsProductGroupStatus.md)
 - [org.openapitools.server.api.model.CatalogsProductGroupType](docs/CatalogsProductGroupType.md)
 - [org.openapitools.server.api.model.CatalogsProductGroupUpdateRequest](docs/CatalogsProductGroupUpdateRequest.md)
 - [org.openapitools.server.api.model.CatalogsProductGroupsCreate201Response](docs/CatalogsProductGroupsCreate201Response.md)
 - [org.openapitools.server.api.model.CatalogsProductGroupsCreateRequest](docs/CatalogsProductGroupsCreateRequest.md)
 - [org.openapitools.server.api.model.CatalogsProductGroupsList200Response](docs/CatalogsProductGroupsList200Response.md)
 - [org.openapitools.server.api.model.CatalogsProductGroupsList200ResponseAllOfItemsInner](docs/CatalogsProductGroupsList200ResponseAllOfItemsInner.md)
 - [org.openapitools.server.api.model.CatalogsProductGroupsUpdateRequest](docs/CatalogsProductGroupsUpdateRequest.md)
 - [org.openapitools.server.api.model.CatalogsProductMetadata](docs/CatalogsProductMetadata.md)
 - [org.openapitools.server.api.model.CatalogsRetailBatchRequest](docs/CatalogsRetailBatchRequest.md)
 - [org.openapitools.server.api.model.CatalogsRetailBatchRequestItemsInner](docs/CatalogsRetailBatchRequestItemsInner.md)
 - [org.openapitools.server.api.model.CatalogsRetailFeed](docs/CatalogsRetailFeed.md)
 - [org.openapitools.server.api.model.CatalogsRetailFeedsCreateRequest](docs/CatalogsRetailFeedsCreateRequest.md)
 - [org.openapitools.server.api.model.CatalogsRetailFeedsUpdateRequest](docs/CatalogsRetailFeedsUpdateRequest.md)
 - [org.openapitools.server.api.model.CatalogsRetailItemErrorResponse](docs/CatalogsRetailItemErrorResponse.md)
 - [org.openapitools.server.api.model.CatalogsRetailItemResponse](docs/CatalogsRetailItemResponse.md)
 - [org.openapitools.server.api.model.CatalogsRetailItemsBatch](docs/CatalogsRetailItemsBatch.md)
 - [org.openapitools.server.api.model.CatalogsRetailItemsFilter](docs/CatalogsRetailItemsFilter.md)
 - [org.openapitools.server.api.model.CatalogsRetailProductGroup](docs/CatalogsRetailProductGroup.md)
 - [org.openapitools.server.api.model.CatalogsStatus](docs/CatalogsStatus.md)
 - [org.openapitools.server.api.model.CatalogsType](docs/CatalogsType.md)
 - [org.openapitools.server.api.model.CatalogsUpdatableHotelAttributes](docs/CatalogsUpdatableHotelAttributes.md)
 - [org.openapitools.server.api.model.CatalogsUpdateHotelItem](docs/CatalogsUpdateHotelItem.md)
 - [org.openapitools.server.api.model.CatalogsUpdateRetailItem](docs/CatalogsUpdateRetailItem.md)
 - [org.openapitools.server.api.model.CatalogsUpsertHotelItem](docs/CatalogsUpsertHotelItem.md)
 - [org.openapitools.server.api.model.CatalogsUpsertRetailItem](docs/CatalogsUpsertRetailItem.md)
 - [org.openapitools.server.api.model.CatalogsVerticalBatchRequest](docs/CatalogsVerticalBatchRequest.md)
 - [org.openapitools.server.api.model.CatalogsVerticalFeedsCreateRequest](docs/CatalogsVerticalFeedsCreateRequest.md)
 - [org.openapitools.server.api.model.CatalogsVerticalFeedsUpdateRequest](docs/CatalogsVerticalFeedsUpdateRequest.md)
 - [org.openapitools.server.api.model.CatalogsVerticalProductGroup](docs/CatalogsVerticalProductGroup.md)
 - [org.openapitools.server.api.model.CatalogsVerticalProductGroupCreateRequest](docs/CatalogsVerticalProductGroupCreateRequest.md)
 - [org.openapitools.server.api.model.CatalogsVerticalProductGroupUpdateRequest](docs/CatalogsVerticalProductGroupUpdateRequest.md)
 - [org.openapitools.server.api.model.ConditionFilter](docs/ConditionFilter.md)
 - [org.openapitools.server.api.model.ConversionApiResponse](docs/ConversionApiResponse.md)
 - [org.openapitools.server.api.model.ConversionApiResponseEventsInner](docs/ConversionApiResponseEventsInner.md)
 - [org.openapitools.server.api.model.ConversionAttributionWindowDays](docs/ConversionAttributionWindowDays.md)
 - [org.openapitools.server.api.model.ConversionEventResponse](docs/ConversionEventResponse.md)
 - [org.openapitools.server.api.model.ConversionEvents](docs/ConversionEvents.md)
 - [org.openapitools.server.api.model.ConversionEventsDataInner](docs/ConversionEventsDataInner.md)
 - [org.openapitools.server.api.model.ConversionEventsDataInnerCustomData](docs/ConversionEventsDataInnerCustomData.md)
 - [org.openapitools.server.api.model.ConversionEventsDataInnerCustomDataContentsInner](docs/ConversionEventsDataInnerCustomDataContentsInner.md)
 - [org.openapitools.server.api.model.ConversionEventsUserData](docs/ConversionEventsUserData.md)
 - [org.openapitools.server.api.model.ConversionReportAttributionType](docs/ConversionReportAttributionType.md)
 - [org.openapitools.server.api.model.ConversionReportTimeType](docs/ConversionReportTimeType.md)
 - [org.openapitools.server.api.model.ConversionTagCommon](docs/ConversionTagCommon.md)
 - [org.openapitools.server.api.model.ConversionTagConfigs](docs/ConversionTagConfigs.md)
 - [org.openapitools.server.api.model.ConversionTagCreate](docs/ConversionTagCreate.md)
 - [org.openapitools.server.api.model.ConversionTagListResponse](docs/ConversionTagListResponse.md)
 - [org.openapitools.server.api.model.ConversionTagResponse](docs/ConversionTagResponse.md)
 - [org.openapitools.server.api.model.ConversionTagType](docs/ConversionTagType.md)
 - [org.openapitools.server.api.model.Country](docs/Country.md)
 - [org.openapitools.server.api.model.CountryFilter](docs/CountryFilter.md)
 - [org.openapitools.server.api.model.CreateMMMReportRequest](docs/CreateMMMReportRequest.md)
 - [org.openapitools.server.api.model.CreateMMMReportResponse](docs/CreateMMMReportResponse.md)
 - [org.openapitools.server.api.model.CreateMMMReportResponseData](docs/CreateMMMReportResponseData.md)
 - [org.openapitools.server.api.model.CreativeType](docs/CreativeType.md)
 - [org.openapitools.server.api.model.Currency](docs/Currency.md)
 - [org.openapitools.server.api.model.CurrencyFilter](docs/CurrencyFilter.md)
 - [org.openapitools.server.api.model.CustomLabel0Filter](docs/CustomLabel0Filter.md)
 - [org.openapitools.server.api.model.CustomLabel1Filter](docs/CustomLabel1Filter.md)
 - [org.openapitools.server.api.model.CustomLabel2Filter](docs/CustomLabel2Filter.md)
 - [org.openapitools.server.api.model.CustomLabel3Filter](docs/CustomLabel3Filter.md)
 - [org.openapitools.server.api.model.CustomLabel4Filter](docs/CustomLabel4Filter.md)
 - [org.openapitools.server.api.model.CustomerList](docs/CustomerList.md)
 - [org.openapitools.server.api.model.CustomerListRequest](docs/CustomerListRequest.md)
 - [org.openapitools.server.api.model.CustomerListUpdateRequest](docs/CustomerListUpdateRequest.md)
 - [org.openapitools.server.api.model.CustomerListsList200Response](docs/CustomerListsList200Response.md)
 - [org.openapitools.server.api.model.DataOutputFormat](docs/DataOutputFormat.md)
 - [org.openapitools.server.api.model.DataStatus](docs/DataStatus.md)
 - [org.openapitools.server.api.model.DeliveryMetricsResponse](docs/DeliveryMetricsResponse.md)
 - [org.openapitools.server.api.model.DeliveryMetricsResponseItemsInner](docs/DeliveryMetricsResponseItemsInner.md)
 - [org.openapitools.server.api.model.DetailedError](docs/DetailedError.md)
 - [org.openapitools.server.api.model.EnhancedMatchStatusType](docs/EnhancedMatchStatusType.md)
 - [org.openapitools.server.api.model.EntityStatus](docs/EntityStatus.md)
 - [org.openapitools.server.api.model.Error](docs/Error.md)
 - [org.openapitools.server.api.model.Exception](docs/Exception.md)
 - [org.openapitools.server.api.model.FeedProcessingResultsList200Response](docs/FeedProcessingResultsList200Response.md)
 - [org.openapitools.server.api.model.FeedsCreateRequest](docs/FeedsCreateRequest.md)
 - [org.openapitools.server.api.model.FeedsList200Response](docs/FeedsList200Response.md)
 - [org.openapitools.server.api.model.FeedsUpdateRequest](docs/FeedsUpdateRequest.md)
 - [org.openapitools.server.api.model.FollowUserRequest](docs/FollowUserRequest.md)
 - [org.openapitools.server.api.model.FollowersList200Response](docs/FollowersList200Response.md)
 - [org.openapitools.server.api.model.Gender](docs/Gender.md)
 - [org.openapitools.server.api.model.GenderFilter](docs/GenderFilter.md)
 - [org.openapitools.server.api.model.GetAudiencesOrderBy](docs/GetAudiencesOrderBy.md)
 - [org.openapitools.server.api.model.GetMMMReportResponse](docs/GetMMMReportResponse.md)
 - [org.openapitools.server.api.model.GetMMMReportResponseData](docs/GetMMMReportResponseData.md)
 - [org.openapitools.server.api.model.GoogleProductCategory0Filter](docs/GoogleProductCategory0Filter.md)
 - [org.openapitools.server.api.model.GoogleProductCategory1Filter](docs/GoogleProductCategory1Filter.md)
 - [org.openapitools.server.api.model.GoogleProductCategory2Filter](docs/GoogleProductCategory2Filter.md)
 - [org.openapitools.server.api.model.GoogleProductCategory3Filter](docs/GoogleProductCategory3Filter.md)
 - [org.openapitools.server.api.model.GoogleProductCategory4Filter](docs/GoogleProductCategory4Filter.md)
 - [org.openapitools.server.api.model.GoogleProductCategory5Filter](docs/GoogleProductCategory5Filter.md)
 - [org.openapitools.server.api.model.GoogleProductCategory6Filter](docs/GoogleProductCategory6Filter.md)
 - [org.openapitools.server.api.model.Granularity](docs/Granularity.md)
 - [org.openapitools.server.api.model.GridClickType](docs/GridClickType.md)
 - [org.openapitools.server.api.model.HotelIdFilter](docs/HotelIdFilter.md)
 - [org.openapitools.server.api.model.HotelProcessingRecord](docs/HotelProcessingRecord.md)
 - [org.openapitools.server.api.model.ImageDetails](docs/ImageDetails.md)
 - [org.openapitools.server.api.model.ImageMetadata](docs/ImageMetadata.md)
 - [org.openapitools.server.api.model.ImageMetadataImages](docs/ImageMetadataImages.md)
 - [org.openapitools.server.api.model.IntegrationLog](docs/IntegrationLog.md)
 - [org.openapitools.server.api.model.IntegrationLogClientError](docs/IntegrationLogClientError.md)
 - [org.openapitools.server.api.model.IntegrationLogClientRequest](docs/IntegrationLogClientRequest.md)
 - [org.openapitools.server.api.model.IntegrationLogsInvalidLogResponse](docs/IntegrationLogsInvalidLogResponse.md)
 - [org.openapitools.server.api.model.IntegrationLogsInvalidLogResponseRejectedLogsInner](docs/IntegrationLogsInvalidLogResponseRejectedLogsInner.md)
 - [org.openapitools.server.api.model.IntegrationLogsRequest](docs/IntegrationLogsRequest.md)
 - [org.openapitools.server.api.model.IntegrationLogsSuccessResponse](docs/IntegrationLogsSuccessResponse.md)
 - [org.openapitools.server.api.model.IntegrationMetadata](docs/IntegrationMetadata.md)
 - [org.openapitools.server.api.model.IntegrationRecord](docs/IntegrationRecord.md)
 - [org.openapitools.server.api.model.IntegrationRequest](docs/IntegrationRequest.md)
 - [org.openapitools.server.api.model.IntegrationRequestPatch](docs/IntegrationRequestPatch.md)
 - [org.openapitools.server.api.model.IntegrationsGetList200Response](docs/IntegrationsGetList200Response.md)
 - [org.openapitools.server.api.model.Interest](docs/Interest.md)
 - [org.openapitools.server.api.model.ItemAttributes](docs/ItemAttributes.md)
 - [org.openapitools.server.api.model.ItemBatchRecord](docs/ItemBatchRecord.md)
 - [org.openapitools.server.api.model.ItemCreateBatchRecord](docs/ItemCreateBatchRecord.md)
 - [org.openapitools.server.api.model.ItemDeleteBatchRecord](docs/ItemDeleteBatchRecord.md)
 - [org.openapitools.server.api.model.ItemDeleteDiscontinuedBatchRecord](docs/ItemDeleteDiscontinuedBatchRecord.md)
 - [org.openapitools.server.api.model.ItemGroupIdFilter](docs/ItemGroupIdFilter.md)
 - [org.openapitools.server.api.model.ItemIdFilter](docs/ItemIdFilter.md)
 - [org.openapitools.server.api.model.ItemProcessingRecord](docs/ItemProcessingRecord.md)
 - [org.openapitools.server.api.model.ItemProcessingStatus](docs/ItemProcessingStatus.md)
 - [org.openapitools.server.api.model.ItemResponse](docs/ItemResponse.md)
 - [org.openapitools.server.api.model.ItemResponseAnyOf](docs/ItemResponseAnyOf.md)
 - [org.openapitools.server.api.model.ItemResponseAnyOf1](docs/ItemResponseAnyOf1.md)
 - [org.openapitools.server.api.model.ItemUpdateBatchRecord](docs/ItemUpdateBatchRecord.md)
 - [org.openapitools.server.api.model.ItemUpsertBatchRecord](docs/ItemUpsertBatchRecord.md)
 - [org.openapitools.server.api.model.ItemValidationEvent](docs/ItemValidationEvent.md)
 - [org.openapitools.server.api.model.ItemsBatchPostRequest](docs/ItemsBatchPostRequest.md)
 - [org.openapitools.server.api.model.ItemsIssuesList200Response](docs/ItemsIssuesList200Response.md)
 - [org.openapitools.server.api.model.Keyword](docs/Keyword.md)
 - [org.openapitools.server.api.model.KeywordError](docs/KeywordError.md)
 - [org.openapitools.server.api.model.KeywordMetrics](docs/KeywordMetrics.md)
 - [org.openapitools.server.api.model.KeywordMetricsResponse](docs/KeywordMetricsResponse.md)
 - [org.openapitools.server.api.model.KeywordUpdate](docs/KeywordUpdate.md)
 - [org.openapitools.server.api.model.KeywordUpdateBody](docs/KeywordUpdateBody.md)
 - [org.openapitools.server.api.model.KeywordsCommon](docs/KeywordsCommon.md)
 - [org.openapitools.server.api.model.KeywordsGet200Response](docs/KeywordsGet200Response.md)
 - [org.openapitools.server.api.model.KeywordsMetricsArrayResponse](docs/KeywordsMetricsArrayResponse.md)
 - [org.openapitools.server.api.model.KeywordsRequest](docs/KeywordsRequest.md)
 - [org.openapitools.server.api.model.KeywordsResponse](docs/KeywordsResponse.md)
 - [org.openapitools.server.api.model.Language](docs/Language.md)
 - [org.openapitools.server.api.model.LeadFormCommon](docs/LeadFormCommon.md)
 - [org.openapitools.server.api.model.LeadFormQuestion](docs/LeadFormQuestion.md)
 - [org.openapitools.server.api.model.LeadFormQuestionFieldType](docs/LeadFormQuestionFieldType.md)
 - [org.openapitools.server.api.model.LeadFormQuestionType](docs/LeadFormQuestionType.md)
 - [org.openapitools.server.api.model.LeadFormResponse](docs/LeadFormResponse.md)
 - [org.openapitools.server.api.model.LeadFormStatus](docs/LeadFormStatus.md)
 - [org.openapitools.server.api.model.LeadFormTestRequest](docs/LeadFormTestRequest.md)
 - [org.openapitools.server.api.model.LeadFormTestResponse](docs/LeadFormTestResponse.md)
 - [org.openapitools.server.api.model.LeadFormsList200Response](docs/LeadFormsList200Response.md)
 - [org.openapitools.server.api.model.LineItem](docs/LineItem.md)
 - [org.openapitools.server.api.model.LinkedBusiness](docs/LinkedBusiness.md)
 - [org.openapitools.server.api.model.MMMReportingColumn](docs/MMMReportingColumn.md)
 - [org.openapitools.server.api.model.MMMReportingTargetingType](docs/MMMReportingTargetingType.md)
 - [org.openapitools.server.api.model.MatchType](docs/MatchType.md)
 - [org.openapitools.server.api.model.MatchTypeResponse](docs/MatchTypeResponse.md)
 - [org.openapitools.server.api.model.MaxPriceFilter](docs/MaxPriceFilter.md)
 - [org.openapitools.server.api.model.MediaList200Response](docs/MediaList200Response.md)
 - [org.openapitools.server.api.model.MediaUpload](docs/MediaUpload.md)
 - [org.openapitools.server.api.model.MediaUploadAllOfUploadParameters](docs/MediaUploadAllOfUploadParameters.md)
 - [org.openapitools.server.api.model.MediaUploadDetails](docs/MediaUploadDetails.md)
 - [org.openapitools.server.api.model.MediaUploadRequest](docs/MediaUploadRequest.md)
 - [org.openapitools.server.api.model.MediaUploadStatus](docs/MediaUploadStatus.md)
 - [org.openapitools.server.api.model.MediaUploadType](docs/MediaUploadType.md)
 - [org.openapitools.server.api.model.MetricsReportingLevel](docs/MetricsReportingLevel.md)
 - [org.openapitools.server.api.model.MetricsResponse](docs/MetricsResponse.md)
 - [org.openapitools.server.api.model.MinPriceFilter](docs/MinPriceFilter.md)
 - [org.openapitools.server.api.model.NonNullableCatalogsCurrency](docs/NonNullableCatalogsCurrency.md)
 - [org.openapitools.server.api.model.NonNullableProductAvailabilityType](docs/NonNullableProductAvailabilityType.md)
 - [org.openapitools.server.api.model.NullableCatalogsItemFieldType](docs/NullableCatalogsItemFieldType.md)
 - [org.openapitools.server.api.model.NullableCurrency](docs/NullableCurrency.md)
 - [org.openapitools.server.api.model.OauthAccessTokenRequestCode](docs/OauthAccessTokenRequestCode.md)
 - [org.openapitools.server.api.model.OauthAccessTokenRequestRefresh](docs/OauthAccessTokenRequestRefresh.md)
 - [org.openapitools.server.api.model.OauthAccessTokenResponse](docs/OauthAccessTokenResponse.md)
 - [org.openapitools.server.api.model.OauthAccessTokenResponseCode](docs/OauthAccessTokenResponseCode.md)
 - [org.openapitools.server.api.model.OauthAccessTokenResponseEverlastingRefresh](docs/OauthAccessTokenResponseEverlastingRefresh.md)
 - [org.openapitools.server.api.model.OauthAccessTokenResponseIntegrationRefresh](docs/OauthAccessTokenResponseIntegrationRefresh.md)
 - [org.openapitools.server.api.model.OauthAccessTokenResponseRefresh](docs/OauthAccessTokenResponseRefresh.md)
 - [org.openapitools.server.api.model.ObjectiveType](docs/ObjectiveType.md)
 - [org.openapitools.server.api.model.OptimizationGoalMetadata](docs/OptimizationGoalMetadata.md)
 - [org.openapitools.server.api.model.OptimizationGoalMetadataConversionTagV3GoalMetadata](docs/OptimizationGoalMetadataConversionTagV3GoalMetadata.md)
 - [org.openapitools.server.api.model.OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows](docs/OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows.md)
 - [org.openapitools.server.api.model.OptimizationGoalMetadataFrequencyGoalMetadata](docs/OptimizationGoalMetadataFrequencyGoalMetadata.md)
 - [org.openapitools.server.api.model.OptimizationGoalMetadataScrollupGoalMetadata](docs/OptimizationGoalMetadataScrollupGoalMetadata.md)
 - [org.openapitools.server.api.model.OrderLine](docs/OrderLine.md)
 - [org.openapitools.server.api.model.OrderLineError](docs/OrderLineError.md)
 - [org.openapitools.server.api.model.OrderLinePaidType](docs/OrderLinePaidType.md)
 - [org.openapitools.server.api.model.OrderLineResponse](docs/OrderLineResponse.md)
 - [org.openapitools.server.api.model.OrderLineSingleResponse](docs/OrderLineSingleResponse.md)
 - [org.openapitools.server.api.model.OrderLineStatus](docs/OrderLineStatus.md)
 - [org.openapitools.server.api.model.OrderLines](docs/OrderLines.md)
 - [org.openapitools.server.api.model.OrderLinesArrayResponse](docs/OrderLinesArrayResponse.md)
 - [org.openapitools.server.api.model.OrderLinesList200Response](docs/OrderLinesList200Response.md)
 - [org.openapitools.server.api.model.PacingDeliveryType](docs/PacingDeliveryType.md)
 - [org.openapitools.server.api.model.PageVisitConversionTagsGet200Response](docs/PageVisitConversionTagsGet200Response.md)
 - [org.openapitools.server.api.model.Paginated](docs/Paginated.md)
 - [org.openapitools.server.api.model.PartnerType](docs/PartnerType.md)
 - [org.openapitools.server.api.model.Pin](docs/Pin.md)
 - [org.openapitools.server.api.model.PinAnalyticsMetricsResponse](docs/PinAnalyticsMetricsResponse.md)
 - [org.openapitools.server.api.model.PinAnalyticsMetricsResponseDailyMetricsInner](docs/PinAnalyticsMetricsResponseDailyMetricsInner.md)
 - [org.openapitools.server.api.model.PinCreate](docs/PinCreate.md)
 - [org.openapitools.server.api.model.PinMedia](docs/PinMedia.md)
 - [org.openapitools.server.api.model.PinMediaMetadata](docs/PinMediaMetadata.md)
 - [org.openapitools.server.api.model.PinMediaSource](docs/PinMediaSource.md)
 - [org.openapitools.server.api.model.PinMediaSourceImageBase64](docs/PinMediaSourceImageBase64.md)
 - [org.openapitools.server.api.model.PinMediaSourceImageURL](docs/PinMediaSourceImageURL.md)
 - [org.openapitools.server.api.model.PinMediaSourceImagesBase64](docs/PinMediaSourceImagesBase64.md)
 - [org.openapitools.server.api.model.PinMediaSourceImagesBase64ItemsInner](docs/PinMediaSourceImagesBase64ItemsInner.md)
 - [org.openapitools.server.api.model.PinMediaSourceImagesURL](docs/PinMediaSourceImagesURL.md)
 - [org.openapitools.server.api.model.PinMediaSourceImagesURLItemsInner](docs/PinMediaSourceImagesURLItemsInner.md)
 - [org.openapitools.server.api.model.PinMediaSourcePinURL](docs/PinMediaSourcePinURL.md)
 - [org.openapitools.server.api.model.PinMediaSourceVideoID](docs/PinMediaSourceVideoID.md)
 - [org.openapitools.server.api.model.PinMediaWithImage](docs/PinMediaWithImage.md)
 - [org.openapitools.server.api.model.PinMediaWithImageAndVideo](docs/PinMediaWithImageAndVideo.md)
 - [org.openapitools.server.api.model.PinMediaWithImages](docs/PinMediaWithImages.md)
 - [org.openapitools.server.api.model.PinMediaWithVideo](docs/PinMediaWithVideo.md)
 - [org.openapitools.server.api.model.PinMediaWithVideos](docs/PinMediaWithVideos.md)
 - [org.openapitools.server.api.model.PinPromotionSummaryStatus](docs/PinPromotionSummaryStatus.md)
 - [org.openapitools.server.api.model.PinUpdate](docs/PinUpdate.md)
 - [org.openapitools.server.api.model.PinUpdateCarouselSlotsInner](docs/PinUpdateCarouselSlotsInner.md)
 - [org.openapitools.server.api.model.PinsAnalyticsMetricTypesParameterInner](docs/PinsAnalyticsMetricTypesParameterInner.md)
 - [org.openapitools.server.api.model.PinsList200Response](docs/PinsList200Response.md)
 - [org.openapitools.server.api.model.PinsSaveRequest](docs/PinsSaveRequest.md)
 - [org.openapitools.server.api.model.PinterestTagEventData](docs/PinterestTagEventData.md)
 - [org.openapitools.server.api.model.PlacementGroupType](docs/PlacementGroupType.md)
 - [org.openapitools.server.api.model.PriceFilter](docs/PriceFilter.md)
 - [org.openapitools.server.api.model.ProductAvailabilityType](docs/ProductAvailabilityType.md)
 - [org.openapitools.server.api.model.ProductGroupAnalyticsResponseInner](docs/ProductGroupAnalyticsResponseInner.md)
 - [org.openapitools.server.api.model.ProductGroupPromotion](docs/ProductGroupPromotion.md)
 - [org.openapitools.server.api.model.ProductGroupPromotionCreateRequest](docs/ProductGroupPromotionCreateRequest.md)
 - [org.openapitools.server.api.model.ProductGroupPromotionResponse](docs/ProductGroupPromotionResponse.md)
 - [org.openapitools.server.api.model.ProductGroupPromotionResponseItem](docs/ProductGroupPromotionResponseItem.md)
 - [org.openapitools.server.api.model.ProductGroupPromotionUpdateRequest](docs/ProductGroupPromotionUpdateRequest.md)
 - [org.openapitools.server.api.model.ProductGroupPromotionsList200Response](docs/ProductGroupPromotionsList200Response.md)
 - [org.openapitools.server.api.model.ProductGroupSummaryStatus](docs/ProductGroupSummaryStatus.md)
 - [org.openapitools.server.api.model.ProductType0Filter](docs/ProductType0Filter.md)
 - [org.openapitools.server.api.model.ProductType1Filter](docs/ProductType1Filter.md)
 - [org.openapitools.server.api.model.ProductType2Filter](docs/ProductType2Filter.md)
 - [org.openapitools.server.api.model.ProductType3Filter](docs/ProductType3Filter.md)
 - [org.openapitools.server.api.model.ProductType4Filter](docs/ProductType4Filter.md)
 - [org.openapitools.server.api.model.QuizPinData](docs/QuizPinData.md)
 - [org.openapitools.server.api.model.QuizPinOption](docs/QuizPinOption.md)
 - [org.openapitools.server.api.model.QuizPinQuestion](docs/QuizPinQuestion.md)
 - [org.openapitools.server.api.model.QuizPinResult](docs/QuizPinResult.md)
 - [org.openapitools.server.api.model.RelatedTerms](docs/RelatedTerms.md)
 - [org.openapitools.server.api.model.RelatedTermsRelatedTermsListInner](docs/RelatedTermsRelatedTermsListInner.md)
 - [org.openapitools.server.api.model.ReportingColumnAsync](docs/ReportingColumnAsync.md)
 - [org.openapitools.server.api.model.Role](docs/Role.md)
 - [org.openapitools.server.api.model.SSIOAccountAddress](docs/SSIOAccountAddress.md)
 - [org.openapitools.server.api.model.SSIOAccountItem](docs/SSIOAccountItem.md)
 - [org.openapitools.server.api.model.SSIOAccountPMPName](docs/SSIOAccountPMPName.md)
 - [org.openapitools.server.api.model.SSIOAccountResponse](docs/SSIOAccountResponse.md)
 - [org.openapitools.server.api.model.SSIOCreateInsertionOrderRequest](docs/SSIOCreateInsertionOrderRequest.md)
 - [org.openapitools.server.api.model.SSIOCreateInsertionOrderResponse](docs/SSIOCreateInsertionOrderResponse.md)
 - [org.openapitools.server.api.model.SSIOEditInsertionOrderRequest](docs/SSIOEditInsertionOrderRequest.md)
 - [org.openapitools.server.api.model.SSIOEditInsertionOrderResponse](docs/SSIOEditInsertionOrderResponse.md)
 - [org.openapitools.server.api.model.SSIOInsertionOrderCommon](docs/SSIOInsertionOrderCommon.md)
 - [org.openapitools.server.api.model.SSIOInsertionOrderStatus](docs/SSIOInsertionOrderStatus.md)
 - [org.openapitools.server.api.model.SSIOInsertionOrderStatusResponse](docs/SSIOInsertionOrderStatusResponse.md)
 - [org.openapitools.server.api.model.SSIOOrderLine](docs/SSIOOrderLine.md)
 - [org.openapitools.server.api.model.SearchPartnerPins200Response](docs/SearchPartnerPins200Response.md)
 - [org.openapitools.server.api.model.SearchUserBoardsGet200Response](docs/SearchUserBoardsGet200Response.md)
 - [org.openapitools.server.api.model.SingleInterestTargetingOptionResponse](docs/SingleInterestTargetingOptionResponse.md)
 - [org.openapitools.server.api.model.SsioInsertionOrdersStatusGetByAdAccount200Response](docs/SsioInsertionOrdersStatusGetByAdAccount200Response.md)
 - [org.openapitools.server.api.model.SsioOrderLinesGetByAdAccount200Response](docs/SsioOrderLinesGetByAdAccount200Response.md)
 - [org.openapitools.server.api.model.SummaryPin](docs/SummaryPin.md)
 - [org.openapitools.server.api.model.SummaryPinMedia](docs/SummaryPinMedia.md)
 - [org.openapitools.server.api.model.TargetingAdvertiserCountry](docs/TargetingAdvertiserCountry.md)
 - [org.openapitools.server.api.model.TargetingSpec](docs/TargetingSpec.md)
 - [org.openapitools.server.api.model.TargetingSpecSHOPPINGRETARGETING](docs/TargetingSpecSHOPPINGRETARGETING.md)
 - [org.openapitools.server.api.model.TargetingTypeFilter](docs/TargetingTypeFilter.md)
 - [org.openapitools.server.api.model.TemplateResponse](docs/TemplateResponse.md)
 - [org.openapitools.server.api.model.TemplateResponseDateRange](docs/TemplateResponseDateRange.md)
 - [org.openapitools.server.api.model.TemplateResponseDateRangeAbsoluteDateRange](docs/TemplateResponseDateRangeAbsoluteDateRange.md)
 - [org.openapitools.server.api.model.TemplateResponseDateRangeDynamicDateRange](docs/TemplateResponseDateRangeDynamicDateRange.md)
 - [org.openapitools.server.api.model.TemplateResponseDateRangeRelativeDateRange](docs/TemplateResponseDateRangeRelativeDateRange.md)
 - [org.openapitools.server.api.model.TemplatesList200Response](docs/TemplatesList200Response.md)
 - [org.openapitools.server.api.model.TermsOfService](docs/TermsOfService.md)
 - [org.openapitools.server.api.model.TopPinsAnalyticsResponse](docs/TopPinsAnalyticsResponse.md)
 - [org.openapitools.server.api.model.TopPinsAnalyticsResponseDateAvailability](docs/TopPinsAnalyticsResponseDateAvailability.md)
 - [org.openapitools.server.api.model.TopPinsAnalyticsResponsePinsInner](docs/TopPinsAnalyticsResponsePinsInner.md)
 - [org.openapitools.server.api.model.TopVideoPinsAnalyticsResponse](docs/TopVideoPinsAnalyticsResponse.md)
 - [org.openapitools.server.api.model.TopVideoPinsAnalyticsResponsePinsInner](docs/TopVideoPinsAnalyticsResponsePinsInner.md)
 - [org.openapitools.server.api.model.TrackingUrls](docs/TrackingUrls.md)
 - [org.openapitools.server.api.model.TrendType](docs/TrendType.md)
 - [org.openapitools.server.api.model.TrendingKeywordsResponse](docs/TrendingKeywordsResponse.md)
 - [org.openapitools.server.api.model.TrendingKeywordsResponseTrendsInner](docs/TrendingKeywordsResponseTrendsInner.md)
 - [org.openapitools.server.api.model.TrendingKeywordsResponseTrendsInnerTimeSeries](docs/TrendingKeywordsResponseTrendsInnerTimeSeries.md)
 - [org.openapitools.server.api.model.TrendsSupportedRegion](docs/TrendsSupportedRegion.md)
 - [org.openapitools.server.api.model.UpdatableItemAttributes](docs/UpdatableItemAttributes.md)
 - [org.openapitools.server.api.model.UpdateMaskFieldType](docs/UpdateMaskFieldType.md)
 - [org.openapitools.server.api.model.UserAccountFollowedInterests200Response](docs/UserAccountFollowedInterests200Response.md)
 - [org.openapitools.server.api.model.UserFollowingFeedType](docs/UserFollowingFeedType.md)
 - [org.openapitools.server.api.model.UserFollowingGet200Response](docs/UserFollowingGet200Response.md)
 - [org.openapitools.server.api.model.UserListOperationType](docs/UserListOperationType.md)
 - [org.openapitools.server.api.model.UserListType](docs/UserListType.md)
 - [org.openapitools.server.api.model.UserSummary](docs/UserSummary.md)
 - [org.openapitools.server.api.model.UserWebsiteSummary](docs/UserWebsiteSummary.md)
 - [org.openapitools.server.api.model.UserWebsiteVerificationCode](docs/UserWebsiteVerificationCode.md)
 - [org.openapitools.server.api.model.UserWebsiteVerifyRequest](docs/UserWebsiteVerifyRequest.md)
 - [org.openapitools.server.api.model.UserWebsitesGet200Response](docs/UserWebsitesGet200Response.md)
 - [org.openapitools.server.api.model.VideoMetadata](docs/VideoMetadata.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="pinterest_oauth2"></a>
### pinterest_oauth2

- **Type**: OAuth
- **Flow**: accessCode
- **Authorization URL**: https://www.pinterest.com/oauth/
- **Scopes**: 
  - ads:read: See all of your advertising data, including ads, ad groups, campaigns etc.
  - ads:write: Create, update, or delete ads, ad groups, campaigns etc.
  - billing:read: See all of your billing data, billing profile, etc.
  - billing:write: Create, update, or delete billing data, billing profiles, etc.
  - biz_access:read: See business access data
  - biz_access:write: Create, update, or delete business access data
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

<a id="conversion_token"></a>
### conversion_token

- **Type**: HTTP Bearer Token authentication

<a id="basic"></a>
### basic

- **Type**: HTTP basic authentication

