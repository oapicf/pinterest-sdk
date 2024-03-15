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
    'columns' => new List<String>{'TOTAL_CONVERSIONS'},
    'granularity' => DAY,
    'clickWindowDays' => 1,
    'engagementWindowDays' => '',
    'viewWindowDays' => '',
    'conversionReportTime' => TIME_OF_AD_ACTION
};

try {
    // cross your fingers
    List<OASAdAccountAnalyticsResponseInner> result = api.adAccountAnalytics(params);
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
*OASAdAccountsApi* | [**adAccountTargetingAnalyticsGet**](OASAdAccountsApi.md#adAccountTargetingAnalyticsGet) | **GET** /ad_accounts/{ad_account_id}/targeting_analytics | Get targeting analytics for an ad account
*OASAdAccountsApi* | [**adAccountsCreate**](OASAdAccountsApi.md#adAccountsCreate) | **POST** /ad_accounts | Create ad account
*OASAdAccountsApi* | [**adAccountsGet**](OASAdAccountsApi.md#adAccountsGet) | **GET** /ad_accounts/{ad_account_id} | Get ad account
*OASAdAccountsApi* | [**adAccountsList**](OASAdAccountsApi.md#adAccountsList) | **GET** /ad_accounts | List ad accounts
*OASAdAccountsApi* | [**analyticsCreateMmmReport**](OASAdAccountsApi.md#analyticsCreateMmmReport) | **POST** /ad_accounts/{ad_account_id}/mmm_reports | Create a request for a Marketing Mix Modeling (MMM) report
*OASAdAccountsApi* | [**analyticsCreateReport**](OASAdAccountsApi.md#analyticsCreateReport) | **POST** /ad_accounts/{ad_account_id}/reports | Create async request for an account analytics report
*OASAdAccountsApi* | [**analyticsCreateTemplateReport**](OASAdAccountsApi.md#analyticsCreateTemplateReport) | **POST** /ad_accounts/{ad_account_id}/templates/{template_id}/reports | Create async request for an analytics report using a template
*OASAdAccountsApi* | [**analyticsGetMmmReport**](OASAdAccountsApi.md#analyticsGetMmmReport) | **GET** /ad_accounts/{ad_account_id}/mmm_reports | Get advertiser Marketing Mix Modeling (MMM) report.
*OASAdAccountsApi* | [**analyticsGetReport**](OASAdAccountsApi.md#analyticsGetReport) | **GET** /ad_accounts/{ad_account_id}/reports | Get the account analytics report created by the async call
*OASAdAccountsApi* | [**sandboxDelete**](OASAdAccountsApi.md#sandboxDelete) | **DELETE** /ad_accounts/{ad_account_id}/sandbox | Delete ads data for ad account in API Sandbox
*OASAdAccountsApi* | [**templatesList**](OASAdAccountsApi.md#templatesList) | **GET** /ad_accounts/{ad_account_id}/templates | List templates
*OASAdGroupsApi* | [**adGroupsAnalytics**](OASAdGroupsApi.md#adGroupsAnalytics) | **GET** /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics
*OASAdGroupsApi* | [**adGroupsAudienceSizing**](OASAdGroupsApi.md#adGroupsAudienceSizing) | **GET** /ad_accounts/{ad_account_id}/ad_groups/audience_sizing | Get audience sizing
*OASAdGroupsApi* | [**adGroupsBidFloorGet**](OASAdGroupsApi.md#adGroupsBidFloorGet) | **POST** /ad_accounts/{ad_account_id}/bid_floor | Get bid floors
*OASAdGroupsApi* | [**adGroupsCreate**](OASAdGroupsApi.md#adGroupsCreate) | **POST** /ad_accounts/{ad_account_id}/ad_groups | Create ad groups
*OASAdGroupsApi* | [**adGroupsGet**](OASAdGroupsApi.md#adGroupsGet) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id} | Get ad group
*OASAdGroupsApi* | [**adGroupsList**](OASAdGroupsApi.md#adGroupsList) | **GET** /ad_accounts/{ad_account_id}/ad_groups | List ad groups
*OASAdGroupsApi* | [**adGroupsTargetingAnalyticsGet**](OASAdGroupsApi.md#adGroupsTargetingAnalyticsGet) | **GET** /ad_accounts/{ad_account_id}/ad_groups/targeting_analytics | Get targeting analytics for ad groups
*OASAdGroupsApi* | [**adGroupsUpdate**](OASAdGroupsApi.md#adGroupsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/ad_groups | Update ad groups
*OASAdsApi* | [**adPreviewsCreate**](OASAdsApi.md#adPreviewsCreate) | **POST** /ad_accounts/{ad_account_id}/ad_previews | Create ad preview with pin or image
*OASAdsApi* | [**adTargetingAnalyticsGet**](OASAdsApi.md#adTargetingAnalyticsGet) | **GET** /ad_accounts/{ad_account_id}/ads/targeting_analytics | Get targeting analytics for ads
*OASAdsApi* | [**adsAnalytics**](OASAdsApi.md#adsAnalytics) | **GET** /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics
*OASAdsApi* | [**adsCreate**](OASAdsApi.md#adsCreate) | **POST** /ad_accounts/{ad_account_id}/ads | Create ads
*OASAdsApi* | [**adsGet**](OASAdsApi.md#adsGet) | **GET** /ad_accounts/{ad_account_id}/ads/{ad_id} | Get ad
*OASAdsApi* | [**adsList**](OASAdsApi.md#adsList) | **GET** /ad_accounts/{ad_account_id}/ads | List ads
*OASAdsApi* | [**adsUpdate**](OASAdsApi.md#adsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/ads | Update ads
*OASAudienceInsightsApi* | [**audienceInsightsGet**](OASAudienceInsightsApi.md#audienceInsightsGet) | **GET** /ad_accounts/{ad_account_id}/audience_insights | Get audience insights
*OASAudienceInsightsApi* | [**audienceInsightsScopeAndTypeGet**](OASAudienceInsightsApi.md#audienceInsightsScopeAndTypeGet) | **GET** /ad_accounts/{ad_account_id}/insights/audiences | Get audience insights scope and type
*OASAudiencesApi* | [**audiencesCreate**](OASAudiencesApi.md#audiencesCreate) | **POST** /ad_accounts/{ad_account_id}/audiences | Create audience
*OASAudiencesApi* | [**audiencesCreateCustom**](OASAudiencesApi.md#audiencesCreateCustom) | **POST** /ad_accounts/{ad_account_id}/audiences/custom | Create custom audience
*OASAudiencesApi* | [**audiencesGet**](OASAudiencesApi.md#audiencesGet) | **GET** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Get audience
*OASAudiencesApi* | [**audiencesList**](OASAudiencesApi.md#audiencesList) | **GET** /ad_accounts/{ad_account_id}/audiences | List audiences
*OASAudiencesApi* | [**audiencesUpdate**](OASAudiencesApi.md#audiencesUpdate) | **PATCH** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Update audience
*OASBillingApi* | [**adsCreditRedeem**](OASBillingApi.md#adsCreditRedeem) | **POST** /ad_accounts/{ad_account_id}/ads_credit/redeem | Redeem ad credits
*OASBillingApi* | [**adsCreditsDiscountsGet**](OASBillingApi.md#adsCreditsDiscountsGet) | **GET** /ad_accounts/{ad_account_id}/ads_credit/discounts | Get ads credit discounts
*OASBillingApi* | [**billingProfilesGet**](OASBillingApi.md#billingProfilesGet) | **GET** /ad_accounts/{ad_account_id}/billing_profiles | Get billing profiles
*OASBillingApi* | [**ssioAccountsGet**](OASBillingApi.md#ssioAccountsGet) | **GET** /ad_accounts/{ad_account_id}/ssio/accounts | Get Salesforce account details including bill-to information.
*OASBillingApi* | [**ssioInsertionOrderCreate**](OASBillingApi.md#ssioInsertionOrderCreate) | **POST** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Create insertion order through SSIO.
*OASBillingApi* | [**ssioInsertionOrderEdit**](OASBillingApi.md#ssioInsertionOrderEdit) | **PATCH** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Edit insertion order through SSIO.
*OASBillingApi* | [**ssioInsertionOrdersStatusGetByAdAccount**](OASBillingApi.md#ssioInsertionOrdersStatusGetByAdAccount) | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/status | Get insertion order status by ad account id.
*OASBillingApi* | [**ssioInsertionOrdersStatusGetByPinOrderId**](OASBillingApi.md#ssioInsertionOrdersStatusGetByPinOrderId) | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status | Get insertion order status by pin order id.
*OASBillingApi* | [**ssioOrderLinesGetByAdAccount**](OASBillingApi.md#ssioOrderLinesGetByAdAccount) | **GET** /ad_accounts/{ad_account_id}/ssio/order_lines | Get Salesforce order lines by ad account id.
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
*OASBulkApi* | [**bulkDownloadCreate**](OASBulkApi.md#bulkDownloadCreate) | **POST** /ad_accounts/{ad_account_id}/bulk/download | Get advertiser entities in bulk
*OASBulkApi* | [**bulkRequestGet**](OASBulkApi.md#bulkRequestGet) | **GET** /ad_accounts/{ad_account_id}/bulk/{bulk_request_id} | Download advertiser entities in bulk
*OASBulkApi* | [**bulkUpsertCreate**](OASBulkApi.md#bulkUpsertCreate) | **POST** /ad_accounts/{ad_account_id}/bulk/upsert | Create/update ad entities in bulk
*OASCampaignsApi* | [**campaignTargetingAnalyticsGet**](OASCampaignsApi.md#campaignTargetingAnalyticsGet) | **GET** /ad_accounts/{ad_account_id}/campaigns/targeting_analytics | Get targeting analytics for campaigns
*OASCampaignsApi* | [**campaignsAnalytics**](OASCampaignsApi.md#campaignsAnalytics) | **GET** /ad_accounts/{ad_account_id}/campaigns/analytics | Get campaign analytics
*OASCampaignsApi* | [**campaignsCreate**](OASCampaignsApi.md#campaignsCreate) | **POST** /ad_accounts/{ad_account_id}/campaigns | Create campaigns
*OASCampaignsApi* | [**campaignsGet**](OASCampaignsApi.md#campaignsGet) | **GET** /ad_accounts/{ad_account_id}/campaigns/{campaign_id} | Get campaign
*OASCampaignsApi* | [**campaignsList**](OASCampaignsApi.md#campaignsList) | **GET** /ad_accounts/{ad_account_id}/campaigns | List campaigns
*OASCampaignsApi* | [**campaignsUpdate**](OASCampaignsApi.md#campaignsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/campaigns | Update campaigns
*OASCatalogsApi* | [**catalogsList**](OASCatalogsApi.md#catalogsList) | **GET** /catalogs | List catalogs
*OASCatalogsApi* | [**catalogsProductGroupPinsList**](OASCatalogsApi.md#catalogsProductGroupPinsList) | **GET** /catalogs/product_groups/{product_group_id}/products | List products for a Product Group
*OASCatalogsApi* | [**catalogsProductGroupsCreate**](OASCatalogsApi.md#catalogsProductGroupsCreate) | **POST** /catalogs/product_groups | Create product group
*OASCatalogsApi* | [**catalogsProductGroupsDelete**](OASCatalogsApi.md#catalogsProductGroupsDelete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group
*OASCatalogsApi* | [**catalogsProductGroupsGet**](OASCatalogsApi.md#catalogsProductGroupsGet) | **GET** /catalogs/product_groups/{product_group_id} | Get product group
*OASCatalogsApi* | [**catalogsProductGroupsList**](OASCatalogsApi.md#catalogsProductGroupsList) | **GET** /catalogs/product_groups | List product groups
*OASCatalogsApi* | [**catalogsProductGroupsProductCountsGet**](OASCatalogsApi.md#catalogsProductGroupsProductCountsGet) | **GET** /catalogs/product_groups/{product_group_id}/product_counts | Get product counts for a Product Group
*OASCatalogsApi* | [**catalogsProductGroupsUpdate**](OASCatalogsApi.md#catalogsProductGroupsUpdate) | **PATCH** /catalogs/product_groups/{product_group_id} | Update product group
*OASCatalogsApi* | [**feedProcessingResultsList**](OASCatalogsApi.md#feedProcessingResultsList) | **GET** /catalogs/feeds/{feed_id}/processing_results | List processing results for a given feed
*OASCatalogsApi* | [**feedsCreate**](OASCatalogsApi.md#feedsCreate) | **POST** /catalogs/feeds | Create feed
*OASCatalogsApi* | [**feedsDelete**](OASCatalogsApi.md#feedsDelete) | **DELETE** /catalogs/feeds/{feed_id} | Delete feed
*OASCatalogsApi* | [**feedsGet**](OASCatalogsApi.md#feedsGet) | **GET** /catalogs/feeds/{feed_id} | Get feed
*OASCatalogsApi* | [**feedsList**](OASCatalogsApi.md#feedsList) | **GET** /catalogs/feeds | List feeds
*OASCatalogsApi* | [**feedsUpdate**](OASCatalogsApi.md#feedsUpdate) | **PATCH** /catalogs/feeds/{feed_id} | Update feed
*OASCatalogsApi* | [**itemsBatchGet**](OASCatalogsApi.md#itemsBatchGet) | **GET** /catalogs/items/batch/{batch_id} | Get catalogs item batch status
*OASCatalogsApi* | [**itemsBatchPost**](OASCatalogsApi.md#itemsBatchPost) | **POST** /catalogs/items/batch | Operate on item batch
*OASCatalogsApi* | [**itemsGet**](OASCatalogsApi.md#itemsGet) | **GET** /catalogs/items | Get catalogs items
*OASCatalogsApi* | [**itemsIssuesList**](OASCatalogsApi.md#itemsIssuesList) | **GET** /catalogs/processing_results/{processing_result_id}/item_issues | List item issues for a given processing result
*OASCatalogsApi* | [**productsByProductGroupFilterList**](OASCatalogsApi.md#productsByProductGroupFilterList) | **POST** /catalogs/products/get_by_product_group_filters | List filtered products
*OASConversionEventsApi* | [**eventsCreate**](OASConversionEventsApi.md#eventsCreate) | **POST** /ad_accounts/{ad_account_id}/events | Send conversions
*OASConversionTagsApi* | [**conversionTagsCreate**](OASConversionTagsApi.md#conversionTagsCreate) | **POST** /ad_accounts/{ad_account_id}/conversion_tags | Create conversion tag
*OASConversionTagsApi* | [**conversionTagsGet**](OASConversionTagsApi.md#conversionTagsGet) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id} | Get conversion tag
*OASConversionTagsApi* | [**conversionTagsList**](OASConversionTagsApi.md#conversionTagsList) | **GET** /ad_accounts/{ad_account_id}/conversion_tags | Get conversion tags
*OASConversionTagsApi* | [**ocpmEligibleConversionTagsGet**](OASConversionTagsApi.md#ocpmEligibleConversionTagsGet) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible | Get Ocpm eligible conversion tags
*OASConversionTagsApi* | [**pageVisitConversionTagsGet**](OASConversionTagsApi.md#pageVisitConversionTagsGet) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/page_visit | Get page visit conversion tags
*OASCustomerListsApi* | [**customerListsCreate**](OASCustomerListsApi.md#customerListsCreate) | **POST** /ad_accounts/{ad_account_id}/customer_lists | Create customer lists
*OASCustomerListsApi* | [**customerListsGet**](OASCustomerListsApi.md#customerListsGet) | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Get customer list
*OASCustomerListsApi* | [**customerListsList**](OASCustomerListsApi.md#customerListsList) | **GET** /ad_accounts/{ad_account_id}/customer_lists | Get customer lists
*OASCustomerListsApi* | [**customerListsUpdate**](OASCustomerListsApi.md#customerListsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Update customer list
*OASIntegrationsApi* | [**integrationsCommerceDel**](OASIntegrationsApi.md#integrationsCommerceDel) | **DELETE** /integrations/commerce/{external_business_id} | Delete commerce integration
*OASIntegrationsApi* | [**integrationsCommerceGet**](OASIntegrationsApi.md#integrationsCommerceGet) | **GET** /integrations/commerce/{external_business_id} | Get commerce integration
*OASIntegrationsApi* | [**integrationsCommercePatch**](OASIntegrationsApi.md#integrationsCommercePatch) | **PATCH** /integrations/commerce/{external_business_id} | Update commerce integration
*OASIntegrationsApi* | [**integrationsCommercePost**](OASIntegrationsApi.md#integrationsCommercePost) | **POST** /integrations/commerce | Create commerce integration
*OASIntegrationsApi* | [**integrationsGetById**](OASIntegrationsApi.md#integrationsGetById) | **GET** /integrations/{id} | Get integration metadata
*OASIntegrationsApi* | [**integrationsGetList**](OASIntegrationsApi.md#integrationsGetList) | **GET** /integrations | Get integration metadata list
*OASIntegrationsApi* | [**integrationsLogsPost**](OASIntegrationsApi.md#integrationsLogsPost) | **POST** /integrations/logs | Receives batched logs from integration applications.
*OASKeywordsApi* | [**countryKeywordsMetricsGet**](OASKeywordsApi.md#countryKeywordsMetricsGet) | **GET** /ad_accounts/{ad_account_id}/keywords/metrics | Get country\&#39;s keyword metrics
*OASKeywordsApi* | [**keywordsCreate**](OASKeywordsApi.md#keywordsCreate) | **POST** /ad_accounts/{ad_account_id}/keywords | Create keywords
*OASKeywordsApi* | [**keywordsGet**](OASKeywordsApi.md#keywordsGet) | **GET** /ad_accounts/{ad_account_id}/keywords | Get keywords
*OASKeywordsApi* | [**keywordsUpdate**](OASKeywordsApi.md#keywordsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/keywords | Update keywords
*OASKeywordsApi* | [**trendingKeywordsList**](OASKeywordsApi.md#trendingKeywordsList) | **GET** /trends/keywords/{region}/top/{trend_type} | List trending keywords
*OASLeadAdsApi* | [**adAccountsSubscriptionsDelById**](OASLeadAdsApi.md#adAccountsSubscriptionsDelById) | **DELETE** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Delete lead ads subscription
*OASLeadAdsApi* | [**adAccountsSubscriptionsGetById**](OASLeadAdsApi.md#adAccountsSubscriptionsGetById) | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Get lead ads subscription
*OASLeadAdsApi* | [**adAccountsSubscriptionsGetList**](OASLeadAdsApi.md#adAccountsSubscriptionsGetList) | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions | Get lead ads subscriptions
*OASLeadAdsApi* | [**adAccountsSubscriptionsPost**](OASLeadAdsApi.md#adAccountsSubscriptionsPost) | **POST** /ad_accounts/{ad_account_id}/leads/subscriptions | Create lead ads subscription
*OASLeadFormsApi* | [**leadFormGet**](OASLeadFormsApi.md#leadFormGet) | **GET** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id} | Get lead form by id
*OASLeadFormsApi* | [**leadFormTestCreate**](OASLeadFormsApi.md#leadFormTestCreate) | **POST** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test | Create lead form test data
*OASLeadFormsApi* | [**leadFormsList**](OASLeadFormsApi.md#leadFormsList) | **GET** /ad_accounts/{ad_account_id}/lead_forms | Get lead forms
*OASMediaApi* | [**mediaCreate**](OASMediaApi.md#mediaCreate) | **POST** /media | Register media upload
*OASMediaApi* | [**mediaGet**](OASMediaApi.md#mediaGet) | **GET** /media/{media_id} | Get media upload details
*OASMediaApi* | [**mediaList**](OASMediaApi.md#mediaList) | **GET** /media | List media uploads
*OASOauthApi* | [**oauthToken**](OASOauthApi.md#oauthToken) | **POST** /oauth/token | Generate OAuth access token
*OASOrderLinesApi* | [**orderLinesGet**](OASOrderLinesApi.md#orderLinesGet) | **GET** /ad_accounts/{ad_account_id}/order_lines/{order_line_id} | Get order line
*OASOrderLinesApi* | [**orderLinesList**](OASOrderLinesApi.md#orderLinesList) | **GET** /ad_accounts/{ad_account_id}/order_lines | Get order lines
*OASPinsApi* | [**pinsAnalytics**](OASPinsApi.md#pinsAnalytics) | **GET** /pins/{pin_id}/analytics | Get Pin analytics
*OASPinsApi* | [**pinsCreate**](OASPinsApi.md#pinsCreate) | **POST** /pins | Create Pin
*OASPinsApi* | [**pinsDelete**](OASPinsApi.md#pinsDelete) | **DELETE** /pins/{pin_id} | Delete Pin
*OASPinsApi* | [**pinsGet**](OASPinsApi.md#pinsGet) | **GET** /pins/{pin_id} | Get Pin
*OASPinsApi* | [**pinsList**](OASPinsApi.md#pinsList) | **GET** /pins | List Pins
*OASPinsApi* | [**pinsSave**](OASPinsApi.md#pinsSave) | **POST** /pins/{pin_id}/save | Save Pin
*OASPinsApi* | [**pinsUpdate**](OASPinsApi.md#pinsUpdate) | **PATCH** /pins/{pin_id} | Update Pin
*OASProductGroupPromotionsApi* | [**productGroupPromotionsCreate**](OASProductGroupPromotionsApi.md#productGroupPromotionsCreate) | **POST** /ad_accounts/{ad_account_id}/product_group_promotions | Create product group promotions
*OASProductGroupPromotionsApi* | [**productGroupPromotionsGet**](OASProductGroupPromotionsApi.md#productGroupPromotionsGet) | **GET** /ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id} | Get a product group promotion by id
*OASProductGroupPromotionsApi* | [**productGroupPromotionsList**](OASProductGroupPromotionsApi.md#productGroupPromotionsList) | **GET** /ad_accounts/{ad_account_id}/product_group_promotions | Get product group promotions
*OASProductGroupPromotionsApi* | [**productGroupPromotionsUpdate**](OASProductGroupPromotionsApi.md#productGroupPromotionsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/product_group_promotions | Update product group promotions
*OASProductGroupPromotionsApi* | [**productGroupsAnalytics**](OASProductGroupPromotionsApi.md#productGroupsAnalytics) | **GET** /ad_accounts/{ad_account_id}/product_groups/analytics | Get product group analytics
*OASProductGroupsApi* | [**adAccountsCatalogsProductGroupsList**](OASProductGroupsApi.md#adAccountsCatalogsProductGroupsList) | **GET** /ad_accounts/{ad_account_id}/product_groups/catalogs | Get catalog product groups
*OASResourcesApi* | [**adAccountCountriesGet**](OASResourcesApi.md#adAccountCountriesGet) | **GET** /resources/ad_account_countries | Get ad accounts countries
*OASResourcesApi* | [**deliveryMetricsGet**](OASResourcesApi.md#deliveryMetricsGet) | **GET** /resources/delivery_metrics | Get available metrics\&#39; definitions
*OASResourcesApi* | [**interestTargetingOptionsGet**](OASResourcesApi.md#interestTargetingOptionsGet) | **GET** /resources/targeting/interests/{interest_id} | Get interest details
*OASResourcesApi* | [**leadFormQuestionsGet**](OASResourcesApi.md#leadFormQuestionsGet) | **GET** /resources/lead_form_questions | Get lead form questions
*OASResourcesApi* | [**metricsReadyStateGet**](OASResourcesApi.md#metricsReadyStateGet) | **GET** /resources/metrics_ready_state | Get metrics ready state
*OASResourcesApi* | [**targetingOptionsGet**](OASResourcesApi.md#targetingOptionsGet) | **GET** /resources/targeting/{targeting_type} | Get targeting options
*OASSearchApi* | [**searchPartnerPins**](OASSearchApi.md#searchPartnerPins) | **GET** /search/partner/pins | Search pins by a given search term
*OASSearchApi* | [**searchUserBoardsGet**](OASSearchApi.md#searchUserBoardsGet) | **GET** /search/boards | Search user\&#39;s boards
*OASSearchApi* | [**searchUserPinsList**](OASSearchApi.md#searchUserPinsList) | **GET** /search/pins | Search user\&#39;s Pins
*OASTermsApi* | [**termsRelatedList**](OASTermsApi.md#termsRelatedList) | **GET** /terms/related | List related terms
*OASTermsApi* | [**termsSuggestedList**](OASTermsApi.md#termsSuggestedList) | **GET** /terms/suggested | List suggested terms
*OASTermsOfServiceApi* | [**termsOfServiceGet**](OASTermsOfServiceApi.md#termsOfServiceGet) | **GET** /ad_accounts/{ad_account_id}/terms_of_service | Get terms of service
*OASUserAccountApi* | [**boardsUserFollowsList**](OASUserAccountApi.md#boardsUserFollowsList) | **GET** /user_account/following/boards | List following boards
*OASUserAccountApi* | [**followUserUpdate**](OASUserAccountApi.md#followUserUpdate) | **POST** /user_account/following/{username} | Follow user
*OASUserAccountApi* | [**followersList**](OASUserAccountApi.md#followersList) | **GET** /user_account/followers | List followers
*OASUserAccountApi* | [**linkedBusinessAccountsGet**](OASUserAccountApi.md#linkedBusinessAccountsGet) | **GET** /user_account/businesses | List linked businesses
*OASUserAccountApi* | [**unverifyWebsiteDelete**](OASUserAccountApi.md#unverifyWebsiteDelete) | **DELETE** /user_account/websites | Unverify website
*OASUserAccountApi* | [**userAccountAnalytics**](OASUserAccountApi.md#userAccountAnalytics) | **GET** /user_account/analytics | Get user account analytics
*OASUserAccountApi* | [**userAccountAnalyticsTopPins**](OASUserAccountApi.md#userAccountAnalyticsTopPins) | **GET** /user_account/analytics/top_pins | Get user account top pins analytics
*OASUserAccountApi* | [**userAccountAnalyticsTopVideoPins**](OASUserAccountApi.md#userAccountAnalyticsTopVideoPins) | **GET** /user_account/analytics/top_video_pins | Get user account top video pins analytics
*OASUserAccountApi* | [**userAccountFollowedInterests**](OASUserAccountApi.md#userAccountFollowedInterests) | **GET** /users/{username}/interests/follow | List following interests
*OASUserAccountApi* | [**userAccountGet**](OASUserAccountApi.md#userAccountGet) | **GET** /user_account | Get user account
*OASUserAccountApi* | [**userFollowingGet**](OASUserAccountApi.md#userFollowingGet) | **GET** /user_account/following | List following
*OASUserAccountApi* | [**userWebsitesGet**](OASUserAccountApi.md#userWebsitesGet) | **GET** /user_account/websites | Get user websites
*OASUserAccountApi* | [**verifyWebsiteUpdate**](OASUserAccountApi.md#verifyWebsiteUpdate) | **POST** /user_account/websites | Verify website
*OASUserAccountApi* | [**websiteVerificationGet**](OASUserAccountApi.md#websiteVerificationGet) | **GET** /user_account/websites/verification | Get user verification code for website claiming


## Documentation for Models

 - [OASAccount](OASAccount.md)
 - [OASActionType](OASActionType.md)
 - [OASAdAccount](OASAdAccount.md)
 - [OASAdAccountAnalyticsResponseInner](OASAdAccountAnalyticsResponseInner.md)
 - [OASAdAccountCreateRequest](OASAdAccountCreateRequest.md)
 - [OASAdAccountCreateSubscriptionReques](OASAdAccountCreateSubscriptionReques.md)
 - [OASAdAccountCreateSubscriptionRespon](OASAdAccountCreateSubscriptionRespon.md)
 - [OASAdAccountGetSubscriptionResponse](OASAdAccountGetSubscriptionResponse.md)
 - [OASAdAccountOwner](OASAdAccountOwner.md)
 - [OASAdAccountsCatalogsProductGroupsLi](OASAdAccountsCatalogsProductGroupsLi.md)
 - [OASAdAccountsCountryResponse](OASAdAccountsCountryResponse.md)
 - [OASAdAccountsCountryResponseData](OASAdAccountsCountryResponseData.md)
 - [OASAdAccountsList200Response](OASAdAccountsList200Response.md)
 - [OASAdAccountsSubscriptionsGetList200](OASAdAccountsSubscriptionsGetList200.md)
 - [OASAdArrayResponse](OASAdArrayResponse.md)
 - [OASAdArrayResponseElement](OASAdArrayResponseElement.md)
 - [OASAdCommon](OASAdCommon.md)
 - [OASAdCommonQuizPinData](OASAdCommonQuizPinData.md)
 - [OASAdCommonTrackingUrls](OASAdCommonTrackingUrls.md)
 - [OASAdCountry](OASAdCountry.md)
 - [OASAdCreateRequest](OASAdCreateRequest.md)
 - [OASAdGroupArrayResponse](OASAdGroupArrayResponse.md)
 - [OASAdGroupArrayResponseElement](OASAdGroupArrayResponseElement.md)
 - [OASAdGroupAudienceSizingRequest](OASAdGroupAudienceSizingRequest.md)
 - [OASAdGroupAudienceSizingRequestKeywo](OASAdGroupAudienceSizingRequestKeywo.md)
 - [OASAdGroupAudienceSizingResponse](OASAdGroupAudienceSizingResponse.md)
 - [OASAdGroupCommon](OASAdGroupCommon.md)
 - [OASAdGroupCommonOptimizationGoalMeta](OASAdGroupCommonOptimizationGoalMeta.md)
 - [OASAdGroupCommonTrackingUrls](OASAdGroupCommonTrackingUrls.md)
 - [OASAdGroupCreateRequest](OASAdGroupCreateRequest.md)
 - [OASAdGroupResponse](OASAdGroupResponse.md)
 - [OASAdGroupSummaryStatus](OASAdGroupSummaryStatus.md)
 - [OASAdGroupUpdateRequest](OASAdGroupUpdateRequest.md)
 - [OASAdGroupsAnalyticsResponseInner](OASAdGroupsAnalyticsResponseInner.md)
 - [OASAdGroupsList200Response](OASAdGroupsList200Response.md)
 - [OASAdPinId](OASAdPinId.md)
 - [OASAdPreviewCreateFromImage](OASAdPreviewCreateFromImage.md)
 - [OASAdPreviewCreateFromPin](OASAdPreviewCreateFromPin.md)
 - [OASAdPreviewRequest](OASAdPreviewRequest.md)
 - [OASAdPreviewURLResponse](OASAdPreviewURLResponse.md)
 - [OASAdResponse](OASAdResponse.md)
 - [OASAdUpdateRequest](OASAdUpdateRequest.md)
 - [OASAdsAnalyticsCreateAsyncRequest](OASAdsAnalyticsCreateAsyncRequest.md)
 - [OASAdsAnalyticsCreateAsyncResponse](OASAdsAnalyticsCreateAsyncResponse.md)
 - [OASAdsAnalyticsFilterColumn](OASAdsAnalyticsFilterColumn.md)
 - [OASAdsAnalyticsFilterOperator](OASAdsAnalyticsFilterOperator.md)
 - [OASAdsAnalyticsGetAsyncResponse](OASAdsAnalyticsGetAsyncResponse.md)
 - [OASAdsAnalyticsMetricsFilter](OASAdsAnalyticsMetricsFilter.md)
 - [OASAdsAnalyticsResponseInner](OASAdsAnalyticsResponseInner.md)
 - [OASAdsAnalyticsTargetingType](OASAdsAnalyticsTargetingType.md)
 - [OASAdsCreditDiscountsResponse](OASAdsCreditDiscountsResponse.md)
 - [OASAdsCreditRedeemRequest](OASAdsCreditRedeemRequest.md)
 - [OASAdsCreditRedeemResponse](OASAdsCreditRedeemResponse.md)
 - [OASAdsCreditsDiscountsGet200Response](OASAdsCreditsDiscountsGet200Response.md)
 - [OASAdsList200Response](OASAdsList200Response.md)
 - [OASAnalyticsDailyMetrics](OASAnalyticsDailyMetrics.md)
 - [OASAnalyticsMetricsResponse](OASAnalyticsMetricsResponse.md)
 - [OASAudience](OASAudience.md)
 - [OASAudienceCategory](OASAudienceCategory.md)
 - [OASAudienceCommon](OASAudienceCommon.md)
 - [OASAudienceCreateCustomRequest](OASAudienceCreateCustomRequest.md)
 - [OASAudienceCreateRequest](OASAudienceCreateRequest.md)
 - [OASAudienceCreateRequest1AudienceTyp](OASAudienceCreateRequest1AudienceTyp.md)
 - [OASAudienceDataParty](OASAudienceDataParty.md)
 - [OASAudienceDefinition](OASAudienceDefinition.md)
 - [OASAudienceDefinitionResponse](OASAudienceDefinitionResponse.md)
 - [OASAudienceDemographicValue](OASAudienceDemographicValue.md)
 - [OASAudienceDemographics](OASAudienceDemographics.md)
 - [OASAudienceInsightCategoryArrayRespo](OASAudienceInsightCategoryArrayRespo.md)
 - [OASAudienceInsightCategoryCommon](OASAudienceInsightCategoryCommon.md)
 - [OASAudienceInsightType](OASAudienceInsightType.md)
 - [OASAudienceInsightsResponse](OASAudienceInsightsResponse.md)
 - [OASAudienceRule](OASAudienceRule.md)
 - [OASAudienceSharingType](OASAudienceSharingType.md)
 - [OASAudienceSubcategory](OASAudienceSubcategory.md)
 - [OASAudienceType](OASAudienceType.md)
 - [OASAudienceUpdateOperationType](OASAudienceUpdateOperationType.md)
 - [OASAudienceUpdateRequest](OASAudienceUpdateRequest.md)
 - [OASAudiencesList200Response](OASAudiencesList200Response.md)
 - [OASAvailabilityFilter](OASAvailabilityFilter.md)
 - [OASBatchOperation](OASBatchOperation.md)
 - [OASBatchOperationStatus](OASBatchOperationStatus.md)
 - [OASBidFloor](OASBidFloor.md)
 - [OASBidFloorRequest](OASBidFloorRequest.md)
 - [OASBidFloorSpec](OASBidFloorSpec.md)
 - [OASBillingProfilesGet200Response](OASBillingProfilesGet200Response.md)
 - [OASBillingProfilesResponse](OASBillingProfilesResponse.md)
 - [OASBoard](OASBoard.md)
 - [OASBoardMedia](OASBoardMedia.md)
 - [OASBoardOwner](OASBoardOwner.md)
 - [OASBoardSection](OASBoardSection.md)
 - [OASBoardSectionsList200Response](OASBoardSectionsList200Response.md)
 - [OASBoardUpdate](OASBoardUpdate.md)
 - [OASBoardsList200Response](OASBoardsList200Response.md)
 - [OASBoardsListPins200Response](OASBoardsListPins200Response.md)
 - [OASBoardsUserFollowsList200Response](OASBoardsUserFollowsList200Response.md)
 - [OASBookClosedResponse](OASBookClosedResponse.md)
 - [OASBrandFilter](OASBrandFilter.md)
 - [OASBudgetType](OASBudgetType.md)
 - [OASBulkDownloadRequest](OASBulkDownloadRequest.md)
 - [OASBulkDownloadRequestCampaignFilter](OASBulkDownloadRequestCampaignFilter.md)
 - [OASBulkDownloadResponse](OASBulkDownloadResponse.md)
 - [OASBulkEntityType](OASBulkEntityType.md)
 - [OASBulkOutputFormat](OASBulkOutputFormat.md)
 - [OASBulkReportingJobStatus](OASBulkReportingJobStatus.md)
 - [OASBulkUpsertRequest](OASBulkUpsertRequest.md)
 - [OASBulkUpsertRequestCreate](OASBulkUpsertRequestCreate.md)
 - [OASBulkUpsertRequestUpdate](OASBulkUpsertRequestUpdate.md)
 - [OASBulkUpsertResponse](OASBulkUpsertResponse.md)
 - [OASBulkUpsertStatus](OASBulkUpsertStatus.md)
 - [OASBulkUpsertStatusResponse](OASBulkUpsertStatusResponse.md)
 - [OASBusinessAccessRole](OASBusinessAccessRole.md)
 - [OASCampaignCommon](OASCampaignCommon.md)
 - [OASCampaignCreateCommon](OASCampaignCreateCommon.md)
 - [OASCampaignCreateRequest](OASCampaignCreateRequest.md)
 - [OASCampaignCreateResponse](OASCampaignCreateResponse.md)
 - [OASCampaignCreateResponseData](OASCampaignCreateResponseData.md)
 - [OASCampaignCreateResponseItem](OASCampaignCreateResponseItem.md)
 - [OASCampaignId](OASCampaignId.md)
 - [OASCampaignResponse](OASCampaignResponse.md)
 - [OASCampaignSummaryStatus](OASCampaignSummaryStatus.md)
 - [OASCampaignUpdateRequest](OASCampaignUpdateRequest.md)
 - [OASCampaignUpdateResponse](OASCampaignUpdateResponse.md)
 - [OASCampaignsAnalyticsResponseInner](OASCampaignsAnalyticsResponseInner.md)
 - [OASCampaignsList200Response](OASCampaignsList200Response.md)
 - [OASCatalog](OASCatalog.md)
 - [OASCatalogProductGroup](OASCatalogProductGroup.md)
 - [OASCatalogsCreateHotelItem](OASCatalogsCreateHotelItem.md)
 - [OASCatalogsCreateRetailItem](OASCatalogsCreateRetailItem.md)
 - [OASCatalogsDbItem](OASCatalogsDbItem.md)
 - [OASCatalogsDeleteHotelItem](OASCatalogsDeleteHotelItem.md)
 - [OASCatalogsDeleteRetailItem](OASCatalogsDeleteRetailItem.md)
 - [OASCatalogsFeed](OASCatalogsFeed.md)
 - [OASCatalogsFeedCredentials](OASCatalogsFeedCredentials.md)
 - [OASCatalogsFeedIngestionDetails](OASCatalogsFeedIngestionDetails.md)
 - [OASCatalogsFeedIngestionErrors](OASCatalogsFeedIngestionErrors.md)
 - [OASCatalogsFeedIngestionInfo](OASCatalogsFeedIngestionInfo.md)
 - [OASCatalogsFeedIngestionWarnings](OASCatalogsFeedIngestionWarnings.md)
 - [OASCatalogsFeedProcessingResult](OASCatalogsFeedProcessingResult.md)
 - [OASCatalogsFeedProcessingSchedule](OASCatalogsFeedProcessingSchedule.md)
 - [OASCatalogsFeedProcessingStatus](OASCatalogsFeedProcessingStatus.md)
 - [OASCatalogsFeedProductCounts](OASCatalogsFeedProductCounts.md)
 - [OASCatalogsFeedValidationDetails](OASCatalogsFeedValidationDetails.md)
 - [OASCatalogsFeedValidationErrors](OASCatalogsFeedValidationErrors.md)
 - [OASCatalogsFeedValidationWarnings](OASCatalogsFeedValidationWarnings.md)
 - [OASCatalogsFeedsCreateRequest](OASCatalogsFeedsCreateRequest.md)
 - [OASCatalogsFeedsCreateRequestDefault](OASCatalogsFeedsCreateRequestDefault.md)
 - [OASCatalogsFeedsUpdateRequest](OASCatalogsFeedsUpdateRequest.md)
 - [OASCatalogsFormat](OASCatalogsFormat.md)
 - [OASCatalogsHotelAddress](OASCatalogsHotelAddress.md)
 - [OASCatalogsHotelAttributes](OASCatalogsHotelAttributes.md)
 - [OASCatalogsHotelAttributesAllOfMainI](OASCatalogsHotelAttributesAllOfMainI.md)
 - [OASCatalogsHotelBatchItem](OASCatalogsHotelBatchItem.md)
 - [OASCatalogsHotelBatchRequest](OASCatalogsHotelBatchRequest.md)
 - [OASCatalogsHotelFeed](OASCatalogsHotelFeed.md)
 - [OASCatalogsHotelFeedsCreateRequest](OASCatalogsHotelFeedsCreateRequest.md)
 - [OASCatalogsHotelFeedsUpdateRequest](OASCatalogsHotelFeedsUpdateRequest.md)
 - [OASCatalogsHotelGuestRatings](OASCatalogsHotelGuestRatings.md)
 - [OASCatalogsHotelItemErrorResponse](OASCatalogsHotelItemErrorResponse.md)
 - [OASCatalogsHotelItemResponse](OASCatalogsHotelItemResponse.md)
 - [OASCatalogsHotelItemsBatch](OASCatalogsHotelItemsBatch.md)
 - [OASCatalogsHotelItemsFilter](OASCatalogsHotelItemsFilter.md)
 - [OASCatalogsHotelProductGroup](OASCatalogsHotelProductGroup.md)
 - [OASCatalogsHotelProductGroupCreateRe](OASCatalogsHotelProductGroupCreateRe.md)
 - [OASCatalogsHotelProductGroupFilterKe](OASCatalogsHotelProductGroupFilterKe.md)
 - [OASCatalogsHotelProductGroupFilters](OASCatalogsHotelProductGroupFilters.md)
 - [OASCatalogsHotelProductGroupFiltersA](OASCatalogsHotelProductGroupFiltersA.md)
 - [OASCatalogsHotelProductGroupUpdateRe](OASCatalogsHotelProductGroupUpdateRe.md)
 - [OASCatalogsItemValidationDetails](OASCatalogsItemValidationDetails.md)
 - [OASCatalogsItemValidationErrors](OASCatalogsItemValidationErrors.md)
 - [OASCatalogsItemValidationIssue](OASCatalogsItemValidationIssue.md)
 - [OASCatalogsItemValidationIssues](OASCatalogsItemValidationIssues.md)
 - [OASCatalogsItemValidationWarnings](OASCatalogsItemValidationWarnings.md)
 - [OASCatalogsItems](OASCatalogsItems.md)
 - [OASCatalogsItemsBatch](OASCatalogsItemsBatch.md)
 - [OASCatalogsItemsBatchRequest](OASCatalogsItemsBatchRequest.md)
 - [OASCatalogsItemsCreateBatchRequest](OASCatalogsItemsCreateBatchRequest.md)
 - [OASCatalogsItemsDeleteBatchRequest](OASCatalogsItemsDeleteBatchRequest.md)
 - [OASCatalogsItemsDeleteDiscontinuedBa](OASCatalogsItemsDeleteDiscontinuedBa.md)
 - [OASCatalogsItemsFilters](OASCatalogsItemsFilters.md)
 - [OASCatalogsItemsUpdateBatchRequest](OASCatalogsItemsUpdateBatchRequest.md)
 - [OASCatalogsItemsUpsertBatchRequest](OASCatalogsItemsUpsertBatchRequest.md)
 - [OASCatalogsList200Response](OASCatalogsList200Response.md)
 - [OASCatalogsListProductsByFilterReque](OASCatalogsListProductsByFilterReque.md)
 - [OASCatalogsLocale](OASCatalogsLocale.md)
 - [OASCatalogsProduct](OASCatalogsProduct.md)
 - [OASCatalogsProductGroup](OASCatalogsProductGroup.md)
 - [OASCatalogsProductGroupCreateRequest](OASCatalogsProductGroupCreateRequest.md)
 - [OASCatalogsProductGroupCurrencyCrite](OASCatalogsProductGroupCurrencyCrite.md)
 - [OASCatalogsProductGroupFilterKeys](OASCatalogsProductGroupFilterKeys.md)
 - [OASCatalogsProductGroupFilters](OASCatalogsProductGroupFilters.md)
 - [OASCatalogsProductGroupFiltersAllOf](OASCatalogsProductGroupFiltersAllOf.md)
 - [OASCatalogsProductGroupFiltersAnyOf](OASCatalogsProductGroupFiltersAnyOf.md)
 - [OASCatalogsProductGroupFiltersReques](OASCatalogsProductGroupFiltersReques.md)
 - [OASCatalogsProductGroupMultipleCount](OASCatalogsProductGroupMultipleCount.md)
 - [OASCatalogsProductGroupMultipleGende](OASCatalogsProductGroupMultipleGende.md)
 - [OASCatalogsProductGroupMultipleStrin](OASCatalogsProductGroupMultipleStrin.md)
 - [OASCatalogsProductGroupPinsList200Re](OASCatalogsProductGroupPinsList200Re.md)
 - [OASCatalogsProductGroupPricingCriter](OASCatalogsProductGroupPricingCriter.md)
 - [OASCatalogsProductGroupPricingCurren](OASCatalogsProductGroupPricingCurren.md)
 - [OASCatalogsProductGroupProductCounts](OASCatalogsProductGroupProductCounts.md)
 - [OASCatalogsProductGroupStatus](OASCatalogsProductGroupStatus.md)
 - [OASCatalogsProductGroupType](OASCatalogsProductGroupType.md)
 - [OASCatalogsProductGroupUpdateRequest](OASCatalogsProductGroupUpdateRequest.md)
 - [OASCatalogsProductGroupsCreate201Res](OASCatalogsProductGroupsCreate201Res.md)
 - [OASCatalogsProductGroupsCreateReques](OASCatalogsProductGroupsCreateReques.md)
 - [OASCatalogsProductGroupsList200Respo](OASCatalogsProductGroupsList200Respo.md)
 - [OASCatalogsProductGroupsUpdateReques](OASCatalogsProductGroupsUpdateReques.md)
 - [OASCatalogsProductMetadata](OASCatalogsProductMetadata.md)
 - [OASCatalogsRetailBatchRequest](OASCatalogsRetailBatchRequest.md)
 - [OASCatalogsRetailBatchRequestItemsIn](OASCatalogsRetailBatchRequestItemsIn.md)
 - [OASCatalogsRetailFeed](OASCatalogsRetailFeed.md)
 - [OASCatalogsRetailFeedsCreateRequest](OASCatalogsRetailFeedsCreateRequest.md)
 - [OASCatalogsRetailFeedsUpdateRequest](OASCatalogsRetailFeedsUpdateRequest.md)
 - [OASCatalogsRetailItemErrorResponse](OASCatalogsRetailItemErrorResponse.md)
 - [OASCatalogsRetailItemResponse](OASCatalogsRetailItemResponse.md)
 - [OASCatalogsRetailItemsBatch](OASCatalogsRetailItemsBatch.md)
 - [OASCatalogsRetailItemsFilter](OASCatalogsRetailItemsFilter.md)
 - [OASCatalogsRetailProductGroup](OASCatalogsRetailProductGroup.md)
 - [OASCatalogsStatus](OASCatalogsStatus.md)
 - [OASCatalogsType](OASCatalogsType.md)
 - [OASCatalogsUpdatableHotelAttributes](OASCatalogsUpdatableHotelAttributes.md)
 - [OASCatalogsUpdateHotelItem](OASCatalogsUpdateHotelItem.md)
 - [OASCatalogsUpdateRetailItem](OASCatalogsUpdateRetailItem.md)
 - [OASCatalogsUpsertHotelItem](OASCatalogsUpsertHotelItem.md)
 - [OASCatalogsUpsertRetailItem](OASCatalogsUpsertRetailItem.md)
 - [OASCatalogsVerticalBatchRequest](OASCatalogsVerticalBatchRequest.md)
 - [OASCatalogsVerticalFeedsCreateReques](OASCatalogsVerticalFeedsCreateReques.md)
 - [OASCatalogsVerticalFeedsUpdateReques](OASCatalogsVerticalFeedsUpdateReques.md)
 - [OASCatalogsVerticalProductGroup](OASCatalogsVerticalProductGroup.md)
 - [OASCatalogsVerticalProductGroupCreat](OASCatalogsVerticalProductGroupCreat.md)
 - [OASCatalogsVerticalProductGroupUpdat](OASCatalogsVerticalProductGroupUpdat.md)
 - [OASConditionFilter](OASConditionFilter.md)
 - [OASConversionApiResponse](OASConversionApiResponse.md)
 - [OASConversionApiResponseEventsInner](OASConversionApiResponseEventsInner.md)
 - [OASConversionAttributionWindowDays](OASConversionAttributionWindowDays.md)
 - [OASConversionEventResponse](OASConversionEventResponse.md)
 - [OASConversionEvents](OASConversionEvents.md)
 - [OASConversionEventsDataInner](OASConversionEventsDataInner.md)
 - [OASConversionEventsDataInnerCustomDa](OASConversionEventsDataInnerCustomDa.md)
 - [OASConversionEventsUserData](OASConversionEventsUserData.md)
 - [OASConversionReportAttributionType](OASConversionReportAttributionType.md)
 - [OASConversionReportTimeType](OASConversionReportTimeType.md)
 - [OASConversionTagCommon](OASConversionTagCommon.md)
 - [OASConversionTagConfigs](OASConversionTagConfigs.md)
 - [OASConversionTagCreate](OASConversionTagCreate.md)
 - [OASConversionTagListResponse](OASConversionTagListResponse.md)
 - [OASConversionTagResponse](OASConversionTagResponse.md)
 - [OASConversionTagType](OASConversionTagType.md)
 - [OASCountry](OASCountry.md)
 - [OASCountryFilter](OASCountryFilter.md)
 - [OASCreateMMMReportRequest](OASCreateMMMReportRequest.md)
 - [OASCreateMMMReportResponse](OASCreateMMMReportResponse.md)
 - [OASCreateMMMReportResponseData](OASCreateMMMReportResponseData.md)
 - [OASCreativeType](OASCreativeType.md)
 - [OASCurrency](OASCurrency.md)
 - [OASCurrencyFilter](OASCurrencyFilter.md)
 - [OASCustomLabel0Filter](OASCustomLabel0Filter.md)
 - [OASCustomLabel1Filter](OASCustomLabel1Filter.md)
 - [OASCustomLabel2Filter](OASCustomLabel2Filter.md)
 - [OASCustomLabel3Filter](OASCustomLabel3Filter.md)
 - [OASCustomLabel4Filter](OASCustomLabel4Filter.md)
 - [OASCustomerList](OASCustomerList.md)
 - [OASCustomerListRequest](OASCustomerListRequest.md)
 - [OASCustomerListUpdateRequest](OASCustomerListUpdateRequest.md)
 - [OASCustomerListsList200Response](OASCustomerListsList200Response.md)
 - [OASDataOutputFormat](OASDataOutputFormat.md)
 - [OASDataStatus](OASDataStatus.md)
 - [OASDeliveryMetricsResponse](OASDeliveryMetricsResponse.md)
 - [OASDeliveryMetricsResponseItemsInner](OASDeliveryMetricsResponseItemsInner.md)
 - [OASDetailedError](OASDetailedError.md)
 - [OASEnhancedMatchStatusType](OASEnhancedMatchStatusType.md)
 - [OASEntityStatus](OASEntityStatus.md)
 - [OASError](OASError.md)
 - [OASException](OASException.md)
 - [OASFeedProcessingResultsList200Respo](OASFeedProcessingResultsList200Respo.md)
 - [OASFeedsCreateRequest](OASFeedsCreateRequest.md)
 - [OASFeedsList200Response](OASFeedsList200Response.md)
 - [OASFeedsUpdateRequest](OASFeedsUpdateRequest.md)
 - [OASFollowUserRequest](OASFollowUserRequest.md)
 - [OASFollowersList200Response](OASFollowersList200Response.md)
 - [OASGender](OASGender.md)
 - [OASGenderFilter](OASGenderFilter.md)
 - [OASGetAudiencesOrderBy](OASGetAudiencesOrderBy.md)
 - [OASGetMMMReportResponse](OASGetMMMReportResponse.md)
 - [OASGetMMMReportResponseData](OASGetMMMReportResponseData.md)
 - [OASGoogleProductCategory0Filter](OASGoogleProductCategory0Filter.md)
 - [OASGoogleProductCategory1Filter](OASGoogleProductCategory1Filter.md)
 - [OASGoogleProductCategory2Filter](OASGoogleProductCategory2Filter.md)
 - [OASGoogleProductCategory3Filter](OASGoogleProductCategory3Filter.md)
 - [OASGoogleProductCategory4Filter](OASGoogleProductCategory4Filter.md)
 - [OASGoogleProductCategory5Filter](OASGoogleProductCategory5Filter.md)
 - [OASGoogleProductCategory6Filter](OASGoogleProductCategory6Filter.md)
 - [OASGranularity](OASGranularity.md)
 - [OASGridClickType](OASGridClickType.md)
 - [OASHotelIdFilter](OASHotelIdFilter.md)
 - [OASHotelProcessingRecord](OASHotelProcessingRecord.md)
 - [OASImageDetails](OASImageDetails.md)
 - [OASImageMetadata](OASImageMetadata.md)
 - [OASImageMetadataImages](OASImageMetadataImages.md)
 - [OASIntegrationLog](OASIntegrationLog.md)
 - [OASIntegrationLogClientError](OASIntegrationLogClientError.md)
 - [OASIntegrationLogClientRequest](OASIntegrationLogClientRequest.md)
 - [OASIntegrationLogsInvalidLogResponse](OASIntegrationLogsInvalidLogResponse.md)
 - [OASIntegrationLogsRequest](OASIntegrationLogsRequest.md)
 - [OASIntegrationLogsSuccessResponse](OASIntegrationLogsSuccessResponse.md)
 - [OASIntegrationMetadata](OASIntegrationMetadata.md)
 - [OASIntegrationRecord](OASIntegrationRecord.md)
 - [OASIntegrationRequest](OASIntegrationRequest.md)
 - [OASIntegrationRequestPatch](OASIntegrationRequestPatch.md)
 - [OASIntegrationsGetList200Response](OASIntegrationsGetList200Response.md)
 - [OASInterest](OASInterest.md)
 - [OASItemAttributes](OASItemAttributes.md)
 - [OASItemBatchRecord](OASItemBatchRecord.md)
 - [OASItemCreateBatchRecord](OASItemCreateBatchRecord.md)
 - [OASItemDeleteBatchRecord](OASItemDeleteBatchRecord.md)
 - [OASItemDeleteDiscontinuedBatchRecord](OASItemDeleteDiscontinuedBatchRecord.md)
 - [OASItemGroupIdFilter](OASItemGroupIdFilter.md)
 - [OASItemIdFilter](OASItemIdFilter.md)
 - [OASItemProcessingRecord](OASItemProcessingRecord.md)
 - [OASItemProcessingStatus](OASItemProcessingStatus.md)
 - [OASItemResponse](OASItemResponse.md)
 - [OASItemResponseAnyOf](OASItemResponseAnyOf.md)
 - [OASItemResponseAnyOf1](OASItemResponseAnyOf1.md)
 - [OASItemUpdateBatchRecord](OASItemUpdateBatchRecord.md)
 - [OASItemUpsertBatchRecord](OASItemUpsertBatchRecord.md)
 - [OASItemValidationEvent](OASItemValidationEvent.md)
 - [OASItemsBatchPostRequest](OASItemsBatchPostRequest.md)
 - [OASItemsIssuesList200Response](OASItemsIssuesList200Response.md)
 - [OASKeyword](OASKeyword.md)
 - [OASKeywordError](OASKeywordError.md)
 - [OASKeywordMetrics](OASKeywordMetrics.md)
 - [OASKeywordMetricsResponse](OASKeywordMetricsResponse.md)
 - [OASKeywordUpdate](OASKeywordUpdate.md)
 - [OASKeywordUpdateBody](OASKeywordUpdateBody.md)
 - [OASKeywordsCommon](OASKeywordsCommon.md)
 - [OASKeywordsGet200Response](OASKeywordsGet200Response.md)
 - [OASKeywordsMetricsArrayResponse](OASKeywordsMetricsArrayResponse.md)
 - [OASKeywordsRequest](OASKeywordsRequest.md)
 - [OASKeywordsResponse](OASKeywordsResponse.md)
 - [OASLanguage](OASLanguage.md)
 - [OASLeadFormCommon](OASLeadFormCommon.md)
 - [OASLeadFormQuestion](OASLeadFormQuestion.md)
 - [OASLeadFormQuestionFieldType](OASLeadFormQuestionFieldType.md)
 - [OASLeadFormQuestionType](OASLeadFormQuestionType.md)
 - [OASLeadFormResponse](OASLeadFormResponse.md)
 - [OASLeadFormStatus](OASLeadFormStatus.md)
 - [OASLeadFormTestRequest](OASLeadFormTestRequest.md)
 - [OASLeadFormTestResponse](OASLeadFormTestResponse.md)
 - [OASLeadFormsList200Response](OASLeadFormsList200Response.md)
 - [OASLineItem](OASLineItem.md)
 - [OASLinkedBusiness](OASLinkedBusiness.md)
 - [OASMMMReportingColumn](OASMMMReportingColumn.md)
 - [OASMMMReportingTargetingType](OASMMMReportingTargetingType.md)
 - [OASMatchType](OASMatchType.md)
 - [OASMatchTypeResponse](OASMatchTypeResponse.md)
 - [OASMaxPriceFilter](OASMaxPriceFilter.md)
 - [OASMediaList200Response](OASMediaList200Response.md)
 - [OASMediaUpload](OASMediaUpload.md)
 - [OASMediaUploadAllOfUploadParameters](OASMediaUploadAllOfUploadParameters.md)
 - [OASMediaUploadDetails](OASMediaUploadDetails.md)
 - [OASMediaUploadRequest](OASMediaUploadRequest.md)
 - [OASMediaUploadStatus](OASMediaUploadStatus.md)
 - [OASMediaUploadType](OASMediaUploadType.md)
 - [OASMetricsReportingLevel](OASMetricsReportingLevel.md)
 - [OASMetricsResponse](OASMetricsResponse.md)
 - [OASMinPriceFilter](OASMinPriceFilter.md)
 - [OASNonNullableCatalogsCurrency](OASNonNullableCatalogsCurrency.md)
 - [OASNonNullableProductAvailabilityTyp](OASNonNullableProductAvailabilityTyp.md)
 - [OASNullableCatalogsItemFieldType](OASNullableCatalogsItemFieldType.md)
 - [OASNullableCurrency](OASNullableCurrency.md)
 - [OASOauthAccessTokenRequestCode](OASOauthAccessTokenRequestCode.md)
 - [OASOauthAccessTokenRequestRefresh](OASOauthAccessTokenRequestRefresh.md)
 - [OASOauthAccessTokenResponse](OASOauthAccessTokenResponse.md)
 - [OASOauthAccessTokenResponseCode](OASOauthAccessTokenResponseCode.md)
 - [OASOauthAccessTokenResponseEverlasti](OASOauthAccessTokenResponseEverlasti.md)
 - [OASOauthAccessTokenResponseIntegrati](OASOauthAccessTokenResponseIntegrati.md)
 - [OASOauthAccessTokenResponseRefresh](OASOauthAccessTokenResponseRefresh.md)
 - [OASObjectiveType](OASObjectiveType.md)
 - [OASOptimizationGoalMetadata](OASOptimizationGoalMetadata.md)
 - [OASOptimizationGoalMetadataConversio](OASOptimizationGoalMetadataConversio.md)
 - [OASOptimizationGoalMetadataFrequency](OASOptimizationGoalMetadataFrequency.md)
 - [OASOptimizationGoalMetadataScrollupG](OASOptimizationGoalMetadataScrollupG.md)
 - [OASOrderLine](OASOrderLine.md)
 - [OASOrderLineError](OASOrderLineError.md)
 - [OASOrderLinePaidType](OASOrderLinePaidType.md)
 - [OASOrderLineResponse](OASOrderLineResponse.md)
 - [OASOrderLineSingleResponse](OASOrderLineSingleResponse.md)
 - [OASOrderLineStatus](OASOrderLineStatus.md)
 - [OASOrderLines](OASOrderLines.md)
 - [OASOrderLinesArrayResponse](OASOrderLinesArrayResponse.md)
 - [OASOrderLinesList200Response](OASOrderLinesList200Response.md)
 - [OASPacingDeliveryType](OASPacingDeliveryType.md)
 - [OASPageVisitConversionTagsGet200Resp](OASPageVisitConversionTagsGet200Resp.md)
 - [OASPaginated](OASPaginated.md)
 - [OASPartnerType](OASPartnerType.md)
 - [OASPin](OASPin.md)
 - [OASPinAnalyticsMetricsResponse](OASPinAnalyticsMetricsResponse.md)
 - [OASPinAnalyticsMetricsResponseDailyM](OASPinAnalyticsMetricsResponseDailyM.md)
 - [OASPinCreate](OASPinCreate.md)
 - [OASPinMedia](OASPinMedia.md)
 - [OASPinMediaMetadata](OASPinMediaMetadata.md)
 - [OASPinMediaSource](OASPinMediaSource.md)
 - [OASPinMediaSourceImageBase64](OASPinMediaSourceImageBase64.md)
 - [OASPinMediaSourceImageURL](OASPinMediaSourceImageURL.md)
 - [OASPinMediaSourceImagesBase64](OASPinMediaSourceImagesBase64.md)
 - [OASPinMediaSourceImagesBase64ItemsIn](OASPinMediaSourceImagesBase64ItemsIn.md)
 - [OASPinMediaSourceImagesURL](OASPinMediaSourceImagesURL.md)
 - [OASPinMediaSourceImagesURLItemsInner](OASPinMediaSourceImagesURLItemsInner.md)
 - [OASPinMediaSourcePinURL](OASPinMediaSourcePinURL.md)
 - [OASPinMediaSourceVideoID](OASPinMediaSourceVideoID.md)
 - [OASPinMediaWithImage](OASPinMediaWithImage.md)
 - [OASPinMediaWithImageAndVideo](OASPinMediaWithImageAndVideo.md)
 - [OASPinMediaWithImages](OASPinMediaWithImages.md)
 - [OASPinMediaWithVideo](OASPinMediaWithVideo.md)
 - [OASPinMediaWithVideos](OASPinMediaWithVideos.md)
 - [OASPinPromotionSummaryStatus](OASPinPromotionSummaryStatus.md)
 - [OASPinUpdate](OASPinUpdate.md)
 - [OASPinUpdateCarouselSlotsInner](OASPinUpdateCarouselSlotsInner.md)
 - [OASPinsAnalyticsMetricTypesParameter](OASPinsAnalyticsMetricTypesParameter.md)
 - [OASPinsList200Response](OASPinsList200Response.md)
 - [OASPinsSaveRequest](OASPinsSaveRequest.md)
 - [OASPinterestTagEventData](OASPinterestTagEventData.md)
 - [OASPlacementGroupType](OASPlacementGroupType.md)
 - [OASPriceFilter](OASPriceFilter.md)
 - [OASProductAvailabilityType](OASProductAvailabilityType.md)
 - [OASProductGroupAnalyticsResponseInne](OASProductGroupAnalyticsResponseInne.md)
 - [OASProductGroupPromotion](OASProductGroupPromotion.md)
 - [OASProductGroupPromotionCreateReques](OASProductGroupPromotionCreateReques.md)
 - [OASProductGroupPromotionResponse](OASProductGroupPromotionResponse.md)
 - [OASProductGroupPromotionResponseItem](OASProductGroupPromotionResponseItem.md)
 - [OASProductGroupPromotionUpdateReques](OASProductGroupPromotionUpdateReques.md)
 - [OASProductGroupPromotionsList200Resp](OASProductGroupPromotionsList200Resp.md)
 - [OASProductGroupSummaryStatus](OASProductGroupSummaryStatus.md)
 - [OASProductType0Filter](OASProductType0Filter.md)
 - [OASProductType1Filter](OASProductType1Filter.md)
 - [OASProductType2Filter](OASProductType2Filter.md)
 - [OASProductType3Filter](OASProductType3Filter.md)
 - [OASProductType4Filter](OASProductType4Filter.md)
 - [OASQuizPinData](OASQuizPinData.md)
 - [OASQuizPinOption](OASQuizPinOption.md)
 - [OASQuizPinQuestion](OASQuizPinQuestion.md)
 - [OASQuizPinResult](OASQuizPinResult.md)
 - [OASRelatedTerms](OASRelatedTerms.md)
 - [OASRelatedTermsRelatedTermsListInner](OASRelatedTermsRelatedTermsListInner.md)
 - [OASReportingColumnAsync](OASReportingColumnAsync.md)
 - [OASRole](OASRole.md)
 - [OASSSIOAccountAddress](OASSSIOAccountAddress.md)
 - [OASSSIOAccountItem](OASSSIOAccountItem.md)
 - [OASSSIOAccountPMPName](OASSSIOAccountPMPName.md)
 - [OASSSIOAccountResponse](OASSSIOAccountResponse.md)
 - [OASSSIOCreateInsertionOrderRequest](OASSSIOCreateInsertionOrderRequest.md)
 - [OASSSIOCreateInsertionOrderResponse](OASSSIOCreateInsertionOrderResponse.md)
 - [OASSSIOEditInsertionOrderRequest](OASSSIOEditInsertionOrderRequest.md)
 - [OASSSIOEditInsertionOrderResponse](OASSSIOEditInsertionOrderResponse.md)
 - [OASSSIOInsertionOrderCommon](OASSSIOInsertionOrderCommon.md)
 - [OASSSIOInsertionOrderStatus](OASSSIOInsertionOrderStatus.md)
 - [OASSSIOInsertionOrderStatusResponse](OASSSIOInsertionOrderStatusResponse.md)
 - [OASSSIOOrderLine](OASSSIOOrderLine.md)
 - [OASSearchPartnerPins200Response](OASSearchPartnerPins200Response.md)
 - [OASSearchUserBoardsGet200Response](OASSearchUserBoardsGet200Response.md)
 - [OASSingleInterestTargetingOptionResp](OASSingleInterestTargetingOptionResp.md)
 - [OASSsioInsertionOrdersStatusGetByAdA](OASSsioInsertionOrdersStatusGetByAdA.md)
 - [OASSsioOrderLinesGetByAdAccount200Re](OASSsioOrderLinesGetByAdAccount200Re.md)
 - [OASSummaryPin](OASSummaryPin.md)
 - [OASSummaryPinMedia](OASSummaryPinMedia.md)
 - [OASTargetingAdvertiserCountry](OASTargetingAdvertiserCountry.md)
 - [OASTargetingSpec](OASTargetingSpec.md)
 - [OASTargetingSpecSHOPPINGRETARGETING](OASTargetingSpecSHOPPINGRETARGETING.md)
 - [OASTargetingTypeFilter](OASTargetingTypeFilter.md)
 - [OASTemplateResponse](OASTemplateResponse.md)
 - [OASTemplateResponseDateRange](OASTemplateResponseDateRange.md)
 - [OASTemplateResponseDateRangeAbsolute](OASTemplateResponseDateRangeAbsolute.md)
 - [OASTemplateResponseDateRangeDynamicD](OASTemplateResponseDateRangeDynamicD.md)
 - [OASTemplateResponseDateRangeRelative](OASTemplateResponseDateRangeRelative.md)
 - [OASTemplatesList200Response](OASTemplatesList200Response.md)
 - [OASTermsOfService](OASTermsOfService.md)
 - [OASTopPinsAnalyticsResponse](OASTopPinsAnalyticsResponse.md)
 - [OASTopPinsAnalyticsResponseDateAvail](OASTopPinsAnalyticsResponseDateAvail.md)
 - [OASTopPinsAnalyticsResponsePinsInner](OASTopPinsAnalyticsResponsePinsInner.md)
 - [OASTopVideoPinsAnalyticsResponse](OASTopVideoPinsAnalyticsResponse.md)
 - [OASTopVideoPinsAnalyticsResponsePins](OASTopVideoPinsAnalyticsResponsePins.md)
 - [OASTrackingUrls](OASTrackingUrls.md)
 - [OASTrendType](OASTrendType.md)
 - [OASTrendingKeywordsResponse](OASTrendingKeywordsResponse.md)
 - [OASTrendingKeywordsResponseTrendsInn](OASTrendingKeywordsResponseTrendsInn.md)
 - [OASTrendsSupportedRegion](OASTrendsSupportedRegion.md)
 - [OASUpdatableItemAttributes](OASUpdatableItemAttributes.md)
 - [OASUpdateMaskFieldType](OASUpdateMaskFieldType.md)
 - [OASUserAccountFollowedInterests200Re](OASUserAccountFollowedInterests200Re.md)
 - [OASUserFollowingFeedType](OASUserFollowingFeedType.md)
 - [OASUserFollowingGet200Response](OASUserFollowingGet200Response.md)
 - [OASUserListOperationType](OASUserListOperationType.md)
 - [OASUserListType](OASUserListType.md)
 - [OASUserSummary](OASUserSummary.md)
 - [OASUserWebsiteSummary](OASUserWebsiteSummary.md)
 - [OASUserWebsiteVerificationCode](OASUserWebsiteVerificationCode.md)
 - [OASUserWebsiteVerifyRequest](OASUserWebsiteVerifyRequest.md)
 - [OASUserWebsitesGet200Response](OASUserWebsitesGet200Response.md)
 - [OASVideoMetadata](OASVideoMetadata.md)


## Documentation for Authorization


Authentication schemes defined for the API:
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

### conversion_token

- **Type**: HTTP Bearer Token authentication

### basic

- **Type**: HTTP basic authentication


## Author

blah+oapicf@cliffano.com

