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
    'startDate' => Date.newInstance(1960, 2, 17),
    'endDate' => Date.newInstance(1960, 2, 17),
    'columns' => new List<OASReportingColumnSync>{OASReportingColumnSync.getExample()},
    'granularity' => '',
    'adAccountId' => 'null',
    'clickWindowDays' => '',
    'engagementWindowDays' => '',
    'viewWindowDays' => '',
    'conversionReportTime' => TIME_OF_AD_ACTION,
    'reportingTimezone' => ''
};

try {
    // cross your fingers
    List<OASAdAccountAnalyticsItems> result = api.adAccountAnalytics(params);
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
*OASAdAccountsApi* | [**analyticsCreateConversionProductReport**](OASAdAccountsApi.md#analyticsCreateConversionProductReport) | **POST** /ad_accounts/{ad_account_id}/reports/brand_category_sku | Create a request for a brand, category, SKU report
*OASAdAccountsApi* | [**analyticsCreateMmmReport**](OASAdAccountsApi.md#analyticsCreateMmmReport) | **POST** /ad_accounts/{ad_account_id}/mmm_reports | Create a request for a Marketing Mix Modeling (MMM) report
*OASAdAccountsApi* | [**analyticsCreateReport**](OASAdAccountsApi.md#analyticsCreateReport) | **POST** /ad_accounts/{ad_account_id}/reports | Create async request for an account analytics report
*OASAdAccountsApi* | [**analyticsCreateTemplateReport**](OASAdAccountsApi.md#analyticsCreateTemplateReport) | **POST** /ad_accounts/{ad_account_id}/templates/{template_id}/reports | Create async request for an analytics report using a template
*OASAdAccountsApi* | [**analyticsGetConversionProductReport**](OASAdAccountsApi.md#analyticsGetConversionProductReport) | **GET** /ad_accounts/{ad_account_id}/reports/brand_category_sku | Get advertiser brand, category, SKU report
*OASAdAccountsApi* | [**analyticsGetMmmReport**](OASAdAccountsApi.md#analyticsGetMmmReport) | **GET** /ad_accounts/{ad_account_id}/mmm_reports | Get advertiser Marketing Mix Modeling (MMM) report.
*OASAdAccountsApi* | [**analyticsGetReport**](OASAdAccountsApi.md#analyticsGetReport) | **GET** /ad_accounts/{ad_account_id}/reports | Get the account analytics report created by the async call
*OASAdAccountsApi* | [**sandboxDelete**](OASAdAccountsApi.md#sandboxDelete) | **DELETE** /ad_accounts/{ad_account_id}/sandbox | Delete ads data for ad account in API Sandbox
*OASAdAccountsApi* | [**templatesList**](OASAdAccountsApi.md#templatesList) | **GET** /ad_accounts/{ad_account_id}/templates | List templates
*OASAdGroupsApi* | [**adGroupsAnalytics**](OASAdGroupsApi.md#adGroupsAnalytics) | **GET** /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics
*OASAdGroupsApi* | [**adGroupsAudienceSizing**](OASAdGroupsApi.md#adGroupsAudienceSizing) | **POST** /ad_accounts/{ad_account_id}/ad_groups/audience_sizing | Get audience sizing
*OASAdGroupsApi* | [**adGroupsBidFloorGet**](OASAdGroupsApi.md#adGroupsBidFloorGet) | **POST** /ad_accounts/{ad_account_id}/bid_floor | Get bid floors
*OASAdGroupsApi* | [**adGroupsCreate**](OASAdGroupsApi.md#adGroupsCreate) | **POST** /ad_accounts/{ad_account_id}/ad_groups | Create ad groups
*OASAdGroupsApi* | [**adGroupsDynamicTitlesDownloadCsv**](OASAdGroupsApi.md#adGroupsDynamicTitlesDownloadCsv) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/csv | Get dynamic titles CSV download URL
*OASAdGroupsApi* | [**adGroupsDynamicTitlesGetStatus**](OASAdGroupsApi.md#adGroupsDynamicTitlesGetStatus) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/status | Get dynamic titles status
*OASAdGroupsApi* | [**adGroupsDynamicTitlesGetUploadUrl**](OASAdGroupsApi.md#adGroupsDynamicTitlesGetUploadUrl) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/uploads | Get dynamic titles upload URL
*OASAdGroupsApi* | [**adGroupsDynamicTitlesProcessCsv**](OASAdGroupsApi.md#adGroupsDynamicTitlesProcessCsv) | **POST** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles | Process dynamic titles CSV
*OASAdGroupsApi* | [**adGroupsGet**](OASAdGroupsApi.md#adGroupsGet) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id} | Get ad group
*OASAdGroupsApi* | [**adGroupsList**](OASAdGroupsApi.md#adGroupsList) | **GET** /ad_accounts/{ad_account_id}/ad_groups | List ad groups
*OASAdGroupsApi* | [**adGroupsTargetingAnalyticsGet**](OASAdGroupsApi.md#adGroupsTargetingAnalyticsGet) | **GET** /ad_accounts/{ad_account_id}/ad_groups/targeting_analytics | Get targeting analytics for ad groups
*OASAdGroupsApi* | [**adGroupsUpdate**](OASAdGroupsApi.md#adGroupsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/ad_groups | Update ad groups
*OASAdGroupsApi* | [**getAdGroupsByPromotionIdsList**](OASAdGroupsApi.md#getAdGroupsByPromotionIdsList) | **GET** /ad_accounts/{ad_account_id}/promotion_applied_entities | List of ad groups using promotions IDs.
*OASAdsApi* | [**adPreviewsCreate**](OASAdsApi.md#adPreviewsCreate) | **POST** /ad_accounts/{ad_account_id}/ad_previews | Create ad preview with pin or image
*OASAdsApi* | [**adTargetingAnalyticsGet**](OASAdsApi.md#adTargetingAnalyticsGet) | **GET** /ad_accounts/{ad_account_id}/ads/targeting_analytics | Get targeting analytics for ads
*OASAdsApi* | [**adsAnalytics**](OASAdsApi.md#adsAnalytics) | **GET** /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics
*OASAdsApi* | [**adsCreate**](OASAdsApi.md#adsCreate) | **POST** /ad_accounts/{ad_account_id}/ads | Create ads
*OASAdsApi* | [**adsGet**](OASAdsApi.md#adsGet) | **GET** /ad_accounts/{ad_account_id}/ads/{ad_id} | Get ad
*OASAdsApi* | [**adsList**](OASAdsApi.md#adsList) | **GET** /ad_accounts/{ad_account_id}/ads | List ads
*OASAdsApi* | [**adsUpdate**](OASAdsApi.md#adsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/ads | Update ads
*OASAdsApi* | [**campaignAdPreviewCreate**](OASAdsApi.md#campaignAdPreviewCreate) | **POST** /ad_accounts/{ad_account_id}/campaign_ad_preview | Create ad preview records for one or more ad groups
*OASAdsApi* | [**campaignAdPreviewDelete**](OASAdsApi.md#campaignAdPreviewDelete) | **DELETE** /ad_accounts/{ad_account_id}/campaign_ad_preview | Delete ad preview records for one or more ad groups
*OASAdsApi* | [**campaignAdPreviewRead**](OASAdsApi.md#campaignAdPreviewRead) | **GET** /ad_accounts/{ad_account_id}/campaign_ad_preview | Fetch ad preview records for one or more ad groups
*OASAdvancedAuctionApi* | [**advancedAuctionItemsGetPost**](OASAdvancedAuctionApi.md#advancedAuctionItemsGetPost) | **POST** /advanced_auction/items/get | Get item bid options (POST)
*OASAdvancedAuctionApi* | [**advancedAuctionItemsSubmitPost**](OASAdvancedAuctionApi.md#advancedAuctionItemsSubmitPost) | **POST** /advanced_auction/items/submit | Operate on item level bid options
*OASAudienceInsightsApi* | [**audienceInsightsGet**](OASAudienceInsightsApi.md#audienceInsightsGet) | **GET** /ad_accounts/{ad_account_id}/audience_insights | Get audience insights
*OASAudienceInsightsApi* | [**audienceInsightsScopeAndTypeGet**](OASAudienceInsightsApi.md#audienceInsightsScopeAndTypeGet) | **GET** /ad_accounts/{ad_account_id}/insights/audiences | Get audience insights scope and type
*OASAudienceSharingApi* | [**adAccountsAudiencesSharedAccountsList**](OASAudienceSharingApi.md#adAccountsAudiencesSharedAccountsList) | **GET** /ad_accounts/{ad_account_id}/audiences/shared/accounts | List accounts with access to an audience owned by an ad account
*OASAudienceSharingApi* | [**businessAccountAudiencesSharedAccountsList**](OASAudienceSharingApi.md#businessAccountAudiencesSharedAccountsList) | **GET** /businesses/{business_id}/audiences/shared/accounts | List accounts with access to an audience owned by a business
*OASAudienceSharingApi* | [**sharedAudiencesForBusinessList**](OASAudienceSharingApi.md#sharedAudiencesForBusinessList) | **GET** /businesses/{business_id}/audiences | List received audiences for a business
*OASAudienceSharingApi* | [**updateAdAccountToAdAccountSharedAudience**](OASAudienceSharingApi.md#updateAdAccountToAdAccountSharedAudience) | **PATCH** /ad_accounts/{ad_account_id}/audiences/ad_accounts/shared | Update audience sharing between ad accounts
*OASAudienceSharingApi* | [**updateAdAccountToBusinessSharedAudience**](OASAudienceSharingApi.md#updateAdAccountToBusinessSharedAudience) | **PATCH** /ad_accounts/{ad_account_id}/audiences/businesses/shared | Update audience sharing from an ad account to businesses
*OASAudienceSharingApi* | [**updateBusinessToAdAccountSharedAudience**](OASAudienceSharingApi.md#updateBusinessToAdAccountSharedAudience) | **PATCH** /businesses/{business_id}/audiences/ad_accounts/shared | Update audience sharing from a business to ad accounts
*OASAudienceSharingApi* | [**updateBusinessToBusinessSharedAudience**](OASAudienceSharingApi.md#updateBusinessToBusinessSharedAudience) | **PATCH** /businesses/{business_id}/audiences/businesses/shared | Update audience sharing between businesses
*OASAudiencesApi* | [**audiencesCreate**](OASAudiencesApi.md#audiencesCreate) | **POST** /ad_accounts/{ad_account_id}/audiences | Create audience
*OASAudiencesApi* | [**audiencesGet**](OASAudiencesApi.md#audiencesGet) | **GET** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Get audience
*OASAudiencesApi* | [**audiencesList**](OASAudiencesApi.md#audiencesList) | **GET** /ad_accounts/{ad_account_id}/audiences | List audiences
*OASAudiencesApi* | [**audiencesUpdate**](OASAudiencesApi.md#audiencesUpdate) | **PATCH** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Update audience
*OASBillingApi* | [**adsCreditRedeem**](OASBillingApi.md#adsCreditRedeem) | **POST** /ad_accounts/{ad_account_id}/ads_credit/redeem | Redeem ad credits
*OASBillingApi* | [**adsCreditsDiscountsGet**](OASBillingApi.md#adsCreditsDiscountsGet) | **GET** /ad_accounts/{ad_account_id}/ads_credit/discounts | Get ads credit discounts
*OASBillingApi* | [**billingInvoiceDownloadGet**](OASBillingApi.md#billingInvoiceDownloadGet) | **GET** /ad_accounts/{ad_account_id}/billing_invoice/{billing_invoice_id}/download | Get download url for a billing invoice
*OASBillingApi* | [**billingInvoicesGet**](OASBillingApi.md#billingInvoicesGet) | **GET** /ad_accounts/{ad_account_id}/billing_invoices | Get billing invoices
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
*OASBusinessAccessAssetsApi* | [**assetGroupCreate**](OASBusinessAccessAssetsApi.md#assetGroupCreate) | **POST** /businesses/{business_id}/asset_groups | Create a new asset group.
*OASBusinessAccessAssetsApi* | [**assetGroupDelete**](OASBusinessAccessAssetsApi.md#assetGroupDelete) | **DELETE** /businesses/{business_id}/asset_groups | Delete asset groups.
*OASBusinessAccessAssetsApi* | [**assetGroupUpdate**](OASBusinessAccessAssetsApi.md#assetGroupUpdate) | **PATCH** /businesses/{business_id}/asset_groups | Update asset groups.
*OASBusinessAccessAssetsApi* | [**businessAssetMembersGet**](OASBusinessAccessAssetsApi.md#businessAssetMembersGet) | **GET** /businesses/{business_id}/assets/{asset_id}/members | Get members with access to asset
*OASBusinessAccessAssetsApi* | [**businessAssetPartnersGet**](OASBusinessAccessAssetsApi.md#businessAssetPartnersGet) | **GET** /businesses/{business_id}/assets/{asset_id}/partners | Get partners with access to asset
*OASBusinessAccessAssetsApi* | [**businessAssetsGet**](OASBusinessAccessAssetsApi.md#businessAssetsGet) | **GET** /businesses/{business_id}/assets | List business assets
*OASBusinessAccessAssetsApi* | [**businessMemberAssetsGet**](OASBusinessAccessAssetsApi.md#businessMemberAssetsGet) | **GET** /businesses/{business_id}/members/{member_id}/assets | Get assets assigned to a member
*OASBusinessAccessAssetsApi* | [**businessMembersAssetAccessDelete**](OASBusinessAccessAssetsApi.md#businessMembersAssetAccessDelete) | **DELETE** /businesses/{business_id}/members/assets/access | Delete member access to asset
*OASBusinessAccessAssetsApi* | [**businessMembersAssetAccessUpdate**](OASBusinessAccessAssetsApi.md#businessMembersAssetAccessUpdate) | **PATCH** /businesses/{business_id}/members/assets/access | Assign/Update member asset permissions
*OASBusinessAccessAssetsApi* | [**businessPartnerAssetAccessGet**](OASBusinessAccessAssetsApi.md#businessPartnerAssetAccessGet) | **GET** /businesses/{business_id}/partners/{partner_id}/assets | Get assets assigned to a partner or assets assigned by a partner
*OASBusinessAccessAssetsApi* | [**deletePartnerAssetAccessHandlerImpl**](OASBusinessAccessAssetsApi.md#deletePartnerAssetAccessHandlerImpl) | **DELETE** /businesses/{business_id}/partners/assets | Delete partner access to asset
*OASBusinessAccessAssetsApi* | [**updatePartnerAssetAccessHandlerImpl**](OASBusinessAccessAssetsApi.md#updatePartnerAssetAccessHandlerImpl) | **PATCH** /businesses/{business_id}/partners/assets | Assign/Update partner asset permissions
*OASBusinessAccessInviteApi* | [**assetAccessRequestsCreate**](OASBusinessAccessInviteApi.md#assetAccessRequestsCreate) | **POST** /businesses/{business_id}/requests/assets/access | Create a request to access an existing partner\&#39;s assets.
*OASBusinessAccessInviteApi* | [**cancelInvitesOrRequests**](OASBusinessAccessInviteApi.md#cancelInvitesOrRequests) | **DELETE** /businesses/{business_id}/invites | Cancel invites/requests
*OASBusinessAccessInviteApi* | [**createAssetInvites**](OASBusinessAccessInviteApi.md#createAssetInvites) | **POST** /businesses/{business_id}/invites/assets/access | Update invite/request with an asset permission
*OASBusinessAccessInviteApi* | [**createMembershipOrPartnershipInvites**](OASBusinessAccessInviteApi.md#createMembershipOrPartnershipInvites) | **POST** /businesses/{business_id}/invites | Create invites or requests
*OASBusinessAccessInviteApi* | [**getInvites**](OASBusinessAccessInviteApi.md#getInvites) | **GET** /businesses/{business_id}/invites | Get invites/requests
*OASBusinessAccessInviteApi* | [**respondBusinessAccessInvites**](OASBusinessAccessInviteApi.md#respondBusinessAccessInvites) | **PATCH** /businesses/invites | Accept or decline an invite/request
*OASBusinessAccessRelationshipsApi* | [**brandAccountsCreate**](OASBusinessAccessRelationshipsApi.md#brandAccountsCreate) | **POST** /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts | Create a Brand Account
*OASBusinessAccessRelationshipsApi* | [**brandAccountsUpdate**](OASBusinessAccessRelationshipsApi.md#brandAccountsUpdate) | **PATCH** /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id} | Update a Brand Account
*OASBusinessAccessRelationshipsApi* | [**deleteBusinessMembership**](OASBusinessAccessRelationshipsApi.md#deleteBusinessMembership) | **DELETE** /businesses/{business_id}/members | Terminate business memberships
*OASBusinessAccessRelationshipsApi* | [**deleteBusinessPartners**](OASBusinessAccessRelationshipsApi.md#deleteBusinessPartners) | **DELETE** /businesses/{business_id}/partners | Terminate business partnerships
*OASBusinessAccessRelationshipsApi* | [**getBusinessEmployers**](OASBusinessAccessRelationshipsApi.md#getBusinessEmployers) | **GET** /businesses/employers | List business employers for user
*OASBusinessAccessRelationshipsApi* | [**getBusinessMembers**](OASBusinessAccessRelationshipsApi.md#getBusinessMembers) | **GET** /businesses/{business_id}/members | Get business members
*OASBusinessAccessRelationshipsApi* | [**getBusinessPartners**](OASBusinessAccessRelationshipsApi.md#getBusinessPartners) | **GET** /businesses/{business_id}/partners | Get business partners
*OASBusinessAccessRelationshipsApi* | [**systemUserUpdate**](OASBusinessAccessRelationshipsApi.md#systemUserUpdate) | **PATCH** /businesses/{business_id}/system_users/{system_user_id} | Update a system user information.
*OASBusinessAccessRelationshipsApi* | [**updateBusinessMemberships**](OASBusinessAccessRelationshipsApi.md#updateBusinessMemberships) | **PATCH** /businesses/{business_id}/members | Update member\&#39;s business role
*OASCampaignsApi* | [**adPinsAnalytics**](OASCampaignsApi.md#adPinsAnalytics) | **GET** /ad_accounts/{ad_account_id}/pins/analytics | Get pins analytics
*OASCampaignsApi* | [**campaignTargetingAnalyticsGet**](OASCampaignsApi.md#campaignTargetingAnalyticsGet) | **GET** /ad_accounts/{ad_account_id}/campaigns/targeting_analytics | Get targeting analytics for campaigns
*OASCampaignsApi* | [**campaignsAnalytics**](OASCampaignsApi.md#campaignsAnalytics) | **GET** /ad_accounts/{ad_account_id}/campaigns/analytics | Get campaign analytics
*OASCampaignsApi* | [**campaignsCreate**](OASCampaignsApi.md#campaignsCreate) | **POST** /ad_accounts/{ad_account_id}/campaigns | Create campaigns
*OASCampaignsApi* | [**campaignsGet**](OASCampaignsApi.md#campaignsGet) | **GET** /ad_accounts/{ad_account_id}/campaigns/{campaign_id} | Get campaign
*OASCampaignsApi* | [**campaignsList**](OASCampaignsApi.md#campaignsList) | **GET** /ad_accounts/{ad_account_id}/campaigns | List campaigns
*OASCampaignsApi* | [**campaignsUpdate**](OASCampaignsApi.md#campaignsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/campaigns | Update campaigns
*OASCampaignsApi* | [**getCampaignDeliveryEstimates**](OASCampaignsApi.md#getCampaignDeliveryEstimates) | **POST** /ad_accounts/{ad_account_id}/campaigns/delivery_estimates | Get campaign delivery estimates
*OASCatalogFeedsApi* | [**feedProcessingResultsList**](OASCatalogFeedsApi.md#feedProcessingResultsList) | **GET** /catalogs/feeds/{feed_id}/processing_results | List feed processing results
*OASCatalogFeedsApi* | [**feedsCreate**](OASCatalogFeedsApi.md#feedsCreate) | **POST** /catalogs/feeds | Create feed
*OASCatalogFeedsApi* | [**feedsDelete**](OASCatalogFeedsApi.md#feedsDelete) | **DELETE** /catalogs/feeds/{feed_id} | Delete feed
*OASCatalogFeedsApi* | [**feedsGet**](OASCatalogFeedsApi.md#feedsGet) | **GET** /catalogs/feeds/{feed_id} | Get feed
*OASCatalogFeedsApi* | [**feedsIngest**](OASCatalogFeedsApi.md#feedsIngest) | **POST** /catalogs/feeds/{feed_id}/ingest | Ingest feed items
*OASCatalogFeedsApi* | [**feedsList**](OASCatalogFeedsApi.md#feedsList) | **GET** /catalogs/feeds | List feeds
*OASCatalogFeedsApi* | [**feedsUpdate**](OASCatalogFeedsApi.md#feedsUpdate) | **PATCH** /catalogs/feeds/{feed_id} | Update feed
*OASCatalogFeedsApi* | [**itemsIssuesList**](OASCatalogFeedsApi.md#itemsIssuesList) | **GET** /catalogs/processing_results/{processing_result_id}/item_issues | List item issues
*OASCatalogItemsApi* | [**itemsBatchGet**](OASCatalogItemsApi.md#itemsBatchGet) | **GET** /catalogs/items/batch/{batch_id} | Get item batch status
*OASCatalogItemsApi* | [**itemsBatchPost**](OASCatalogItemsApi.md#itemsBatchPost) | **POST** /catalogs/items/batch | Operate on item batch
*OASCatalogItemsApi* | [**itemsPost**](OASCatalogItemsApi.md#itemsPost) | **POST** /catalogs/items | Get catalogs items (POST)
*OASCatalogProductGroupsApi* | [**catalogsProductGroupPinsList**](OASCatalogProductGroupsApi.md#catalogsProductGroupPinsList) | **GET** /catalogs/product_groups/{product_group_id}/products | List products by product group
*OASCatalogProductGroupsApi* | [**catalogsProductGroupsCreate**](OASCatalogProductGroupsApi.md#catalogsProductGroupsCreate) | **POST** /catalogs/product_groups | Create product group
*OASCatalogProductGroupsApi* | [**catalogsProductGroupsCreateMany**](OASCatalogProductGroupsApi.md#catalogsProductGroupsCreateMany) | **POST** /catalogs/product_groups/multiple | Create product groups
*OASCatalogProductGroupsApi* | [**catalogsProductGroupsDelete**](OASCatalogProductGroupsApi.md#catalogsProductGroupsDelete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group
*OASCatalogProductGroupsApi* | [**catalogsProductGroupsDeleteMany**](OASCatalogProductGroupsApi.md#catalogsProductGroupsDeleteMany) | **DELETE** /catalogs/product_groups/multiple | Delete product groups
*OASCatalogProductGroupsApi* | [**catalogsProductGroupsGet**](OASCatalogProductGroupsApi.md#catalogsProductGroupsGet) | **GET** /catalogs/product_groups/{product_group_id} | Get product group
*OASCatalogProductGroupsApi* | [**catalogsProductGroupsList**](OASCatalogProductGroupsApi.md#catalogsProductGroupsList) | **GET** /catalogs/product_groups | List product groups
*OASCatalogProductGroupsApi* | [**catalogsProductGroupsProductCountsGet**](OASCatalogProductGroupsApi.md#catalogsProductGroupsProductCountsGet) | **GET** /catalogs/product_groups/{product_group_id}/product_counts | Get product counts
*OASCatalogProductGroupsApi* | [**catalogsProductGroupsUpdate**](OASCatalogProductGroupsApi.md#catalogsProductGroupsUpdate) | **PATCH** /catalogs/product_groups/{product_group_id} | Update single product group
*OASCatalogProductGroupsApi* | [**productsByProductGroupFilterList**](OASCatalogProductGroupsApi.md#productsByProductGroupFilterList) | **POST** /catalogs/products/get_by_product_group_filters | List products by filter
*OASCatalogReportsApi* | [**reportsCreate**](OASCatalogReportsApi.md#reportsCreate) | **POST** /catalogs/reports | Build catalogs report
*OASCatalogReportsApi* | [**reportsGet**](OASCatalogReportsApi.md#reportsGet) | **GET** /catalogs/reports | Get catalogs report
*OASCatalogReportsApi* | [**reportsStats**](OASCatalogReportsApi.md#reportsStats) | **GET** /catalogs/reports/stats | List report stats
*OASCatalogSupplementalApi* | [**catalogsLocalInventoryItemsBatchOperate**](OASCatalogSupplementalApi.md#catalogsLocalInventoryItemsBatchOperate) | **POST** /catalogs/{catalog_id}/local_inventory_items/batch | Operate on local inventory item batch
*OASCatalogSupplementalApi* | [**catalogsLocalInventoryItemsPost**](OASCatalogSupplementalApi.md#catalogsLocalInventoryItemsPost) | **POST** /catalogs/{catalog_id}/local_inventory_items/query | Get local inventory items (POST)
*OASCatalogSupplementalApi* | [**catalogsLocalStoresCreate**](OASCatalogSupplementalApi.md#catalogsLocalStoresCreate) | **POST** /catalogs/{catalog_id}/local_stores | Create local stores
*OASCatalogSupplementalApi* | [**catalogsLocalStoresDelete**](OASCatalogSupplementalApi.md#catalogsLocalStoresDelete) | **DELETE** /catalogs/{catalog_id}/local_stores | Delete local stores
*OASCatalogSupplementalApi* | [**catalogsLocalStoresList**](OASCatalogSupplementalApi.md#catalogsLocalStoresList) | **GET** /catalogs/{catalog_id}/local_stores | List local stores
*OASCatalogSupplementalApi* | [**catalogsLocalStoresUpdate**](OASCatalogSupplementalApi.md#catalogsLocalStoresUpdate) | **PATCH** /catalogs/{catalog_id}/local_stores | Update local stores
*OASCatalogSupplementalApi* | [**catalogsSupplementalItemsBatchGet**](OASCatalogSupplementalApi.md#catalogsSupplementalItemsBatchGet) | **GET** /catalogs/{catalog_id}/supplemental_items/batch/{batch_id} | Get supplemental items batch status
*OASCatalogsApi* | [**catalogsAvailableFilterValues**](OASCatalogsApi.md#catalogsAvailableFilterValues) | **GET** /catalogs/available_filter_values | List available filter values
*OASCatalogsApi* | [**catalogsCreate**](OASCatalogsApi.md#catalogsCreate) | **POST** /catalogs | Create catalog
*OASCatalogsApi* | [**catalogsList**](OASCatalogsApi.md#catalogsList) | **GET** /catalogs | List catalogs
*OASConversionDeletionRequestsApi* | [**conversionDeletionRequestCreate**](OASConversionDeletionRequestsApi.md#conversionDeletionRequestCreate) | **POST** /ad_accounts/{ad_account_id}/conversion_deletion_requests | Create a conversion deletion request
*OASConversionDeletionRequestsApi* | [**conversionDeletionRequestDelete**](OASConversionDeletionRequestsApi.md#conversionDeletionRequestDelete) | **DELETE** /ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id} | Delete a conversion deletion request
*OASConversionDeletionRequestsApi* | [**conversionDeletionRequestGet**](OASConversionDeletionRequestsApi.md#conversionDeletionRequestGet) | **GET** /ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id} | Get a single conversion deletion request
*OASConversionDeletionRequestsApi* | [**conversionDeletionRequestList**](OASConversionDeletionRequestsApi.md#conversionDeletionRequestList) | **GET** /ad_accounts/{ad_account_id}/conversion_deletion_requests | List conversion deletion requests
*OASConversionEqsApi* | [**conversionEqsList**](OASConversionEqsApi.md#conversionEqsList) | **GET** /ad_accounts/{ad_account_id}/conversion_eqs | Get event quality score (EQS)
*OASConversionEventsApi* | [**eventsCreate**](OASConversionEventsApi.md#eventsCreate) | **POST** /ad_accounts/{ad_account_id}/events | Send conversions
*OASConversionTagsApi* | [**conversionTagsCreate**](OASConversionTagsApi.md#conversionTagsCreate) | **POST** /ad_accounts/{ad_account_id}/conversion_tags | Create conversion tag
*OASConversionTagsApi* | [**conversionTagsGet**](OASConversionTagsApi.md#conversionTagsGet) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id} | Get conversion tag
*OASConversionTagsApi* | [**conversionTagsList**](OASConversionTagsApi.md#conversionTagsList) | **GET** /ad_accounts/{ad_account_id}/conversion_tags | List conversion tags
*OASConversionTagsApi* | [**ocpmEligibleConversionTagsGet**](OASConversionTagsApi.md#ocpmEligibleConversionTagsGet) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible | Get Ocpm eligible conversion tags
*OASConversionTagsApi* | [**pageVisitConversionTagsGet**](OASConversionTagsApi.md#pageVisitConversionTagsGet) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/page_visit | Get page visit conversion tags
*OASConversionsApi* | [**advertiserDefinedEventsCreate**](OASConversionsApi.md#advertiserDefinedEventsCreate) | **POST** /ad_accounts/{ad_account_id}/advertiser_defined_events | Create advertiser defined events
*OASConversionsApi* | [**advertiserDefinedEventsDelete**](OASConversionsApi.md#advertiserDefinedEventsDelete) | **DELETE** /ad_accounts/{ad_account_id}/advertiser_defined_events | Delete advertiser defined events
*OASConversionsApi* | [**advertiserDefinedEventsGet**](OASConversionsApi.md#advertiserDefinedEventsGet) | **GET** /ad_accounts/{ad_account_id}/advertiser_defined_events | Get advertiser defined events
*OASConversionsApi* | [**advertiserDefinedEventsUpdate**](OASConversionsApi.md#advertiserDefinedEventsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/advertiser_defined_events | Update advertiser defined events
*OASCustomerListUploadsApi* | [**customerListUploadsCreate**](OASCustomerListUploadsApi.md#customerListUploadsCreate) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads | Create customer list upload
*OASCustomerListUploadsApi* | [**customerListUploadsGet**](OASCustomerListUploadsApi.md#customerListUploadsGet) | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id} | Get customer list upload
*OASCustomerListUploadsApi* | [**customerListUploadsRun**](OASCustomerListUploadsApi.md#customerListUploadsRun) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run | Run customer list upload
*OASCustomerListsApi* | [**customerListsCreate**](OASCustomerListsApi.md#customerListsCreate) | **POST** /ad_accounts/{ad_account_id}/customer_lists | Create customer lists
*OASCustomerListsApi* | [**customerListsGet**](OASCustomerListsApi.md#customerListsGet) | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Get customer list
*OASCustomerListsApi* | [**customerListsList**](OASCustomerListsApi.md#customerListsList) | **GET** /ad_accounts/{ad_account_id}/customer_lists | Get customer lists
*OASCustomerListsApi* | [**customerListsUpdate**](OASCustomerListsApi.md#customerListsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Update customer list
*OASCustomerSegmentApi* | [**customerSegmentCreate**](OASCustomerSegmentApi.md#customerSegmentCreate) | **POST** /ad_accounts/{ad_account_id}/customer_segments | Create customer segments
*OASCustomerSegmentApi* | [**customerSegmentList**](OASCustomerSegmentApi.md#customerSegmentList) | **GET** /ad_accounts/{ad_account_id}/customer_segments | List customer segments
*OASCustomerSegmentApi* | [**customerSegmentUpdate**](OASCustomerSegmentApi.md#customerSegmentUpdate) | **PATCH** /ad_accounts/{ad_account_id}/customer_segments | Update customer segments
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
*OASLabelsApi* | [**labelsApply**](OASLabelsApi.md#labelsApply) | **POST** /ad_accounts/{ad_account_id}/labels/{label_id}/apply | Apply label to entity
*OASLabelsApi* | [**labelsCreate**](OASLabelsApi.md#labelsCreate) | **POST** /ad_accounts/{ad_account_id}/labels | Create labels
*OASLabelsApi* | [**labelsList**](OASLabelsApi.md#labelsList) | **GET** /ad_accounts/{ad_account_id}/labels | List labels
*OASLabelsApi* | [**labelsRemove**](OASLabelsApi.md#labelsRemove) | **POST** /ad_accounts/{ad_account_id}/labels/{label_id}/remove | Remove label from entities
*OASLabelsApi* | [**labelsUpdate**](OASLabelsApi.md#labelsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/labels | Update labels
*OASLeadAdsApi* | [**adAccountsSubscriptionsDelById**](OASLeadAdsApi.md#adAccountsSubscriptionsDelById) | **DELETE** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Delete lead ads subscription
*OASLeadAdsApi* | [**adAccountsSubscriptionsGetById**](OASLeadAdsApi.md#adAccountsSubscriptionsGetById) | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Get lead ads subscription by ID
*OASLeadAdsApi* | [**adAccountsSubscriptionsGetList**](OASLeadAdsApi.md#adAccountsSubscriptionsGetList) | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions | Get lead ads subscriptions
*OASLeadAdsApi* | [**adAccountsSubscriptionsPost**](OASLeadAdsApi.md#adAccountsSubscriptionsPost) | **POST** /ad_accounts/{ad_account_id}/leads/subscriptions | Create lead ads subscription
*OASLeadFormsApi* | [**leadFormGet**](OASLeadFormsApi.md#leadFormGet) | **GET** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id} | Get lead form by id
*OASLeadFormsApi* | [**leadFormTestCreate**](OASLeadFormsApi.md#leadFormTestCreate) | **POST** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test | Create lead form test data
*OASLeadFormsApi* | [**leadFormsCreate**](OASLeadFormsApi.md#leadFormsCreate) | **POST** /ad_accounts/{ad_account_id}/lead_forms | Create lead forms
*OASLeadFormsApi* | [**leadFormsList**](OASLeadFormsApi.md#leadFormsList) | **GET** /ad_accounts/{ad_account_id}/lead_forms | List lead forms
*OASLeadFormsApi* | [**leadFormsUpdate**](OASLeadFormsApi.md#leadFormsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/lead_forms | Update lead forms
*OASLeadsExportApi* | [**leadsExportCreate**](OASLeadsExportApi.md#leadsExportCreate) | **POST** /ad_accounts/{ad_account_id}/leads_export | Create a request to export leads collected from a lead ad
*OASLeadsExportApi* | [**leadsExportGet**](OASLeadsExportApi.md#leadsExportGet) | **GET** /ad_accounts/{ad_account_id}/leads_export/{leads_export_id} | Get the lead export from the lead export create call
*OASMediaApi* | [**mediaCreate**](OASMediaApi.md#mediaCreate) | **POST** /media | Register media upload
*OASMediaApi* | [**mediaGet**](OASMediaApi.md#mediaGet) | **GET** /media/{media_id} | Get media upload details
*OASMediaApi* | [**mediaList**](OASMediaApi.md#mediaList) | **GET** /media | List media uploads
*OASMsotEventsApi* | [**msotEventsCreate**](OASMsotEventsApi.md#msotEventsCreate) | **POST** /ad_accounts/{ad_account_id}/msot/events | Send Measurement Source Of Truth (MSOT) attributed conversion events
*OASNotificationApi* | [**notificationPost**](OASNotificationApi.md#notificationPost) | **POST** /notifications | Receive notifications from external partners.
*OASOauthApi* | [**oauthConversionToken**](OASOauthApi.md#oauthConversionToken) | **POST** /oauth/conversion_token | Generate OAuth access token for conversion API
*OASOauthApi* | [**oauthToken**](OASOauthApi.md#oauthToken) | **POST** /oauth/token | Generate OAuth access token
*OASOauthApi* | [**tokenRevoke**](OASOauthApi.md#tokenRevoke) | **POST** /oauth/token/revoke | Revoke a token
*OASOrderLinesApi* | [**orderLinesGet**](OASOrderLinesApi.md#orderLinesGet) | **GET** /ad_accounts/{ad_account_id}/order_lines/{order_line_id} | Get order line
*OASOrderLinesApi* | [**orderLinesList**](OASOrderLinesApi.md#orderLinesList) | **GET** /ad_accounts/{ad_account_id}/order_lines | Get order lines.
*OASPinsApi* | [**multiPinsAnalytics**](OASPinsApi.md#multiPinsAnalytics) | **GET** /pins/analytics | Get multiple Pin analytics
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
*OASProductTagsApi* | [**productTagsBulkAdd**](OASProductTagsApi.md#productTagsBulkAdd) | **POST** /pins/{pin_id}/product_tags | Add product tags to pin
*OASProductTagsApi* | [**productTagsBulkDelete**](OASProductTagsApi.md#productTagsBulkDelete) | **POST** /pins/{pin_id}/product_tags/bulk-delete | Delete product tags from pin
*OASProductTagsApi* | [**productTagsList**](OASProductTagsApi.md#productTagsList) | **GET** /pins/{pin_id}/product_tags | Get product tags for pin
*OASPromotionsApi* | [**promotionsCreate**](OASPromotionsApi.md#promotionsCreate) | **POST** /ad_accounts/{ad_account_id}/promotions | Create promotions
*OASPromotionsApi* | [**promotionsDelete**](OASPromotionsApi.md#promotionsDelete) | **DELETE** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Delete promotion by id
*OASPromotionsApi* | [**promotionsGet**](OASPromotionsApi.md#promotionsGet) | **GET** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Get promotion by id
*OASPromotionsApi* | [**promotionsList**](OASPromotionsApi.md#promotionsList) | **GET** /ad_accounts/{ad_account_id}/promotions | Get promotions
*OASPromotionsApi* | [**promotionsUpdate**](OASPromotionsApi.md#promotionsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/promotions | Update promotions
*OASResourcesApi* | [**adAccountCountriesGet**](OASResourcesApi.md#adAccountCountriesGet) | **GET** /resources/ad_account_countries | Get ad accounts countries
*OASResourcesApi* | [**deliveryMetricsGet**](OASResourcesApi.md#deliveryMetricsGet) | **GET** /resources/delivery_metrics | Get available metrics\&#39; definitions
*OASResourcesApi* | [**interestTargetingOptionsGet**](OASResourcesApi.md#interestTargetingOptionsGet) | **GET** /resources/targeting/interests/{interest_id} | Get interest details
*OASResourcesApi* | [**leadFormQuestionsGet**](OASResourcesApi.md#leadFormQuestionsGet) | **GET** /resources/lead_form_questions | Get lead form questions
*OASResourcesApi* | [**metricsReadyStateGet**](OASResourcesApi.md#metricsReadyStateGet) | **GET** /resources/metrics_ready_state | Get metrics ready state
*OASResourcesApi* | [**targetingOptionsGet**](OASResourcesApi.md#targetingOptionsGet) | **GET** /resources/targeting/{targeting_type} | Get targeting options
*OASSchedulesApi* | [**schedulesCreate**](OASSchedulesApi.md#schedulesCreate) | **POST** /ad_accounts/{ad_account_id}/schedules | Create schedules
*OASSchedulesApi* | [**schedulesList**](OASSchedulesApi.md#schedulesList) | **GET** /ad_accounts/{ad_account_id}/schedules | Get Schedules
*OASSchedulesApi* | [**schedulesUpdate**](OASSchedulesApi.md#schedulesUpdate) | **PATCH** /ad_accounts/{ad_account_id}/schedules | Update schedules
*OASSearchApi* | [**searchPartnerPins**](OASSearchApi.md#searchPartnerPins) | **GET** /search/partner/pins | Search pins by a given search term
*OASSearchApi* | [**searchUserBoardsGet**](OASSearchApi.md#searchUserBoardsGet) | **GET** /search/boards | Search user\&#39;s boards
*OASSearchApi* | [**searchUserPinsList**](OASSearchApi.md#searchUserPinsList) | **GET** /search/pins | Search user\&#39;s Pins
*OASTargetingTemplateApi* | [**targetingTemplateCreate**](OASTargetingTemplateApi.md#targetingTemplateCreate) | **POST** /ad_accounts/{ad_account_id}/targeting_templates | Create targeting templates
*OASTargetingTemplateApi* | [**targetingTemplateList**](OASTargetingTemplateApi.md#targetingTemplateList) | **GET** /ad_accounts/{ad_account_id}/targeting_templates | List targeting templates
*OASTargetingTemplateApi* | [**targetingTemplateUpdate**](OASTargetingTemplateApi.md#targetingTemplateUpdate) | **PATCH** /ad_accounts/{ad_account_id}/targeting_templates | Update targeting templates
*OASTermsApi* | [**termsRelatedList**](OASTermsApi.md#termsRelatedList) | **GET** /terms/related | List related terms
*OASTermsApi* | [**termsSuggestedList**](OASTermsApi.md#termsSuggestedList) | **GET** /terms/suggested | List suggested terms
*OASTermsOfServiceApi* | [**termsOfServiceGet**](OASTermsOfServiceApi.md#termsOfServiceGet) | **GET** /ad_accounts/{ad_account_id}/terms_of_service | Get terms of service
*OASTrendsApi* | [**trendsEditorialArticlesList**](OASTrendsApi.md#trendsEditorialArticlesList) | **GET** /trends/editorial_articles | Returns editorial articles for a given region
*OASTrendsApi* | [**trendsFeaturedTopicsList**](OASTrendsApi.md#trendsFeaturedTopicsList) | **GET** /trends/topics/featured | Get featured topics
*OASTrendsApi* | [**trendsProductCategoriesDetailsList**](OASTrendsApi.md#trendsProductCategoriesDetailsList) | **GET** /trends/product_categories/details | Get product category details
*OASTrendsApi* | [**trendsProductCategoriesTrendingList**](OASTrendsApi.md#trendsProductCategoriesTrendingList) | **GET** /trends/product_categories/trending | Get a list of growing Shopping Product Categories
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
 - [OASAccountTemplate](OASAccountTemplate.md)
 - [OASActionType](OASActionType.md)
 - [OASAd](OASAd.md)
 - [OASAdAccount](OASAdAccount.md)
 - [OASAdAccountAnalyticsItems](OASAdAccountAnalyticsItems.md)
 - [OASAdAccountCountriesGet200Response](OASAdAccountCountriesGet200Response.md)
 - [OASAdAccountCreate](OASAdAccountCreate.md)
 - [OASAdAccountEntityType](OASAdAccountEntityType.md)
 - [OASAdAccountOwner](OASAdAccountOwner.md)
 - [OASAdAccountToAdAccountSharedAudienc](OASAdAccountToAdAccountSharedAudienc.md)
 - [OASAdAccountToBusinessSharedAudience](OASAdAccountToBusinessSharedAudience.md)
 - [OASAdAccountsAudience](OASAdAccountsAudience.md)
 - [OASAdAccountsAudienceCreate](OASAdAccountsAudienceCreate.md)
 - [OASAdAccountsAudienceRule](OASAdAccountsAudienceRule.md)
 - [OASAdAccountsAudienceUpdate](OASAdAccountsAudienceUpdate.md)
 - [OASAdAccountsAudiencesSharedAccounts](OASAdAccountsAudiencesSharedAccounts.md)
 - [OASAdAccountsCountry](OASAdAccountsCountry.md)
 - [OASAdAccountsList200Response](OASAdAccountsList200Response.md)
 - [OASAdAccountsSubscriptionsGetList200](OASAdAccountsSubscriptionsGetList200.md)
 - [OASAdAdsAnalyticsAsyncTargetingTypes](OASAdAdsAnalyticsAsyncTargetingTypes.md)
 - [OASAdBatchItem](OASAdBatchItem.md)
 - [OASAdBatchUpdate](OASAdBatchUpdate.md)
 - [OASAdBatchWriteResponseModel](OASAdBatchWriteResponseModel.md)
 - [OASAdCollectionsHeaderType](OASAdCollectionsHeaderType.md)
 - [OASAdCreate](OASAdCreate.md)
 - [OASAdCreateRequest](OASAdCreateRequest.md)
 - [OASAdDisapprovalReasons](OASAdDisapprovalReasons.md)
 - [OASAdGroup](OASAdGroup.md)
 - [OASAdGroupAudienceSizing](OASAdGroupAudienceSizing.md)
 - [OASAdGroupAudienceSizingCreate](OASAdGroupAudienceSizingCreate.md)
 - [OASAdGroupAudienceSizingCreativeType](OASAdGroupAudienceSizingCreativeType.md)
 - [OASAdGroupAudienceSizingKeyword](OASAdGroupAudienceSizingKeyword.md)
 - [OASAdGroupBase](OASAdGroupBase.md)
 - [OASAdGroupCreate](OASAdGroupCreate.md)
 - [OASAdGroupCreateCreate](OASAdGroupCreateCreate.md)
 - [OASAdGroupCreateRequest](OASAdGroupCreateRequest.md)
 - [OASAdGroupCreateRequestAllOf1](OASAdGroupCreateRequestAllOf1.md)
 - [OASAdGroupDeliveryEstimates](OASAdGroupDeliveryEstimates.md)
 - [OASAdGroupDeliveryEstimatesKeywordsI](OASAdGroupDeliveryEstimatesKeywordsI.md)
 - [OASAdGroupSummaryStatus](OASAdGroupSummaryStatus.md)
 - [OASAdGroupTrackingURLs](OASAdGroupTrackingURLs.md)
 - [OASAdGroupUpdate](OASAdGroupUpdate.md)
 - [OASAdGroupUpdateBatchUpdate](OASAdGroupUpdateBatchUpdate.md)
 - [OASAdGroupUpdateRequest](OASAdGroupUpdateRequest.md)
 - [OASAdGroupUpdateRequestAllOf1](OASAdGroupUpdateRequestAllOf1.md)
 - [OASAdGroupsAnalyticsMetrics](OASAdGroupsAnalyticsMetrics.md)
 - [OASAdGroupsCreate200Response](OASAdGroupsCreate200Response.md)
 - [OASAdGroupsCreate200ResponseItemsInn](OASAdGroupsCreate200ResponseItemsInn.md)
 - [OASAdGroupsList200Response](OASAdGroupsList200Response.md)
 - [OASAdPinAnalytics](OASAdPinAnalytics.md)
 - [OASAdPinPreviewCreativeType](OASAdPinPreviewCreativeType.md)
 - [OASAdPreviewRequest](OASAdPreviewRequest.md)
 - [OASAdPreviewShopping](OASAdPreviewShopping.md)
 - [OASAdPreviewSourceImage](OASAdPreviewSourceImage.md)
 - [OASAdPreviewSourcePinId](OASAdPreviewSourcePinId.md)
 - [OASAdPreviewURLResponse](OASAdPreviewURLResponse.md)
 - [OASAdReviewStatus](OASAdReviewStatus.md)
 - [OASAdShoppingPreviewCreativeType](OASAdShoppingPreviewCreativeType.md)
 - [OASAdUpdateRequest](OASAdUpdateRequest.md)
 - [OASAdUpdateRequestAllOf1](OASAdUpdateRequestAllOf1.md)
 - [OASAdeColumnType](OASAdeColumnType.md)
 - [OASAdgroupPlacementGroupType](OASAdgroupPlacementGroupType.md)
 - [OASAdgroupTrackingFeatureType](OASAdgroupTrackingFeatureType.md)
 - [OASAdgroupTrackingFeatures](OASAdgroupTrackingFeatures.md)
 - [OASAdsAnalytics](OASAdsAnalytics.md)
 - [OASAdsAnalyticsAccountTargetingType](OASAdsAnalyticsAccountTargetingType.md)
 - [OASAdsAnalyticsAdGroupTargetingType](OASAdsAnalyticsAdGroupTargetingType.md)
 - [OASAdsAnalyticsAdTargetingType](OASAdsAnalyticsAdTargetingType.md)
 - [OASAdsAnalyticsCampaignTargetingType](OASAdsAnalyticsCampaignTargetingType.md)
 - [OASAdsAnalyticsCreateAsyncRequest](OASAdsAnalyticsCreateAsyncRequest.md)
 - [OASAdsAnalyticsCreateAsyncResponse](OASAdsAnalyticsCreateAsyncResponse.md)
 - [OASAdsAnalyticsFilterColumn](OASAdsAnalyticsFilterColumn.md)
 - [OASAdsAnalyticsFilterOperator](OASAdsAnalyticsFilterOperator.md)
 - [OASAdsAnalyticsGetAsyncResponse](OASAdsAnalyticsGetAsyncResponse.md)
 - [OASAdsAnalyticsMetricsFilter](OASAdsAnalyticsMetricsFilter.md)
 - [OASAdsCreditDiscountType](OASAdsCreditDiscountType.md)
 - [OASAdsCreditDiscountsResponse](OASAdsCreditDiscountsResponse.md)
 - [OASAdsCreditRedeem](OASAdsCreditRedeem.md)
 - [OASAdsCreditRedeemCreate](OASAdsCreditRedeemCreate.md)
 - [OASAdsCreditsDiscountsGet200Response](OASAdsCreditsDiscountsGet200Response.md)
 - [OASAdsList200Response](OASAdsList200Response.md)
 - [OASAdvancedAuctionBidOptions](OASAdvancedAuctionBidOptions.md)
 - [OASAdvancedAuctionItem](OASAdvancedAuctionItem.md)
 - [OASAdvancedAuctionItems](OASAdvancedAuctionItems.md)
 - [OASAdvancedAuctionItemsGetRequest](OASAdvancedAuctionItemsGetRequest.md)
 - [OASAdvancedAuctionItemsSubmitDeleteR](OASAdvancedAuctionItemsSubmitDeleteR.md)
 - [OASAdvancedAuctionItemsSubmitRecord](OASAdvancedAuctionItemsSubmitRecord.md)
 - [OASAdvancedAuctionItemsSubmitRequest](OASAdvancedAuctionItemsSubmitRequest.md)
 - [OASAdvancedAuctionItemsSubmitUpsertR](OASAdvancedAuctionItemsSubmitUpsertR.md)
 - [OASAdvancedAuctionKey](OASAdvancedAuctionKey.md)
 - [OASAdvancedAuctionOperationError](OASAdvancedAuctionOperationError.md)
 - [OASAdvancedAuctionProcessedItems](OASAdvancedAuctionProcessedItems.md)
 - [OASAdvertiserDefinedEvent](OASAdvertiserDefinedEvent.md)
 - [OASAdvertiserDefinedEventInput](OASAdvertiserDefinedEventInput.md)
 - [OASAdvertiserDefinedEventMappingType](OASAdvertiserDefinedEventMappingType.md)
 - [OASAdvertiserDefinedEventProcessingR](OASAdvertiserDefinedEventProcessingR.md)
 - [OASAdvertiserDefinedEventsCreate200R](OASAdvertiserDefinedEventsCreate200R.md)
 - [OASAdvertiserDefinedEventsCreateRequ](OASAdvertiserDefinedEventsCreateRequ.md)
 - [OASAdvertiserDefinedEventsGet200Resp](OASAdvertiserDefinedEventsGet200Resp.md)
 - [OASAgeBucketMultipliers](OASAgeBucketMultipliers.md)
 - [OASAgeTrendsBucket](OASAgeTrendsBucket.md)
 - [OASAggregatedPinComment](OASAggregatedPinComment.md)
 - [OASAiDisclosureItem](OASAiDisclosureItem.md)
 - [OASAiDisclosures](OASAiDisclosures.md)
 - [OASAiDisclosuresUpdate](OASAiDisclosuresUpdate.md)
 - [OASAmazonConnectRequest](OASAmazonConnectRequest.md)
 - [OASAmazonConnectResponse](OASAmazonConnectResponse.md)
 - [OASAnalyticsDailyMetrics](OASAnalyticsDailyMetrics.md)
 - [OASAnalyticsMetricsResponse](OASAnalyticsMetricsResponse.md)
 - [OASAppTypeMultipliers](OASAppTypeMultipliers.md)
 - [OASAppsflyerAudience](OASAppsflyerAudience.md)
 - [OASAppsflyerAudienceCreate](OASAppsflyerAudienceCreate.md)
 - [OASAppsflyerAudienceSyncCreate](OASAppsflyerAudienceSyncCreate.md)
 - [OASAppsflyerPlatform](OASAppsflyerPlatform.md)
 - [OASAssetAccessRequestError](OASAssetAccessRequestError.md)
 - [OASAssetGroupBinding](OASAssetGroupBinding.md)
 - [OASAssetGroupDeleteError](OASAssetGroupDeleteError.md)
 - [OASAssetGroupDeletion](OASAssetGroupDeletion.md)
 - [OASAssetGroupDeletionDelete](OASAssetGroupDeletionDelete.md)
 - [OASAssetGroupInput](OASAssetGroupInput.md)
 - [OASAssetGroupInputCreate](OASAssetGroupInputCreate.md)
 - [OASAssetGroupModification](OASAssetGroupModification.md)
 - [OASAssetGroupModificationReadOrUpdat](OASAssetGroupModificationReadOrUpdat.md)
 - [OASAssetGroupType](OASAssetGroupType.md)
 - [OASAssetGroupUpdateError](OASAssetGroupUpdateError.md)
 - [OASAssetGroupUpdateItemReadOrUpdateI](OASAssetGroupUpdateItemReadOrUpdateI.md)
 - [OASAssetIdPermissions](OASAssetIdPermissions.md)
 - [OASAssetIdWithPermissions](OASAssetIdWithPermissions.md)
 - [OASAssetPermissionType](OASAssetPermissionType.md)
 - [OASAssetSearchBy](OASAssetSearchBy.md)
 - [OASAssetSortBy](OASAssetSortBy.md)
 - [OASAssetTypeResponse](OASAssetTypeResponse.md)
 - [OASAttributionActionType](OASAttributionActionType.md)
 - [OASAttributionMatchType](OASAttributionMatchType.md)
 - [OASAttributionModel](OASAttributionModel.md)
 - [OASAttributionScope](OASAttributionScope.md)
 - [OASAttributionWindows](OASAttributionWindows.md)
 - [OASAudience](OASAudience.md)
 - [OASAudienceAccountType](OASAudienceAccountType.md)
 - [OASAudienceCategory](OASAudienceCategory.md)
 - [OASAudienceDefinition](OASAudienceDefinition.md)
 - [OASAudienceDemographicValue](OASAudienceDemographicValue.md)
 - [OASAudienceDemographics](OASAudienceDemographics.md)
 - [OASAudienceInsightType](OASAudienceInsightType.md)
 - [OASAudienceInsights](OASAudienceInsights.md)
 - [OASAudienceInsightsScopeAndTypeGet20](OASAudienceInsightsScopeAndTypeGet20.md)
 - [OASAudienceObjectiveType](OASAudienceObjectiveType.md)
 - [OASAudienceOwnershipType](OASAudienceOwnershipType.md)
 - [OASAudienceRule](OASAudienceRule.md)
 - [OASAudienceStatus](OASAudienceStatus.md)
 - [OASAudienceSubcategory](OASAudienceSubcategory.md)
 - [OASAudienceType](OASAudienceType.md)
 - [OASAudienceUpdateOperationType](OASAudienceUpdateOperationType.md)
 - [OASAudiencesList200Response](OASAudiencesList200Response.md)
 - [OASAuthRespondInviteAction](OASAuthRespondInviteAction.md)
 - [OASAuthRespondInvitesBody](OASAuthRespondInvitesBody.md)
 - [OASAuthRespondInvitesBodyItem](OASAuthRespondInvitesBodyItem.md)
 - [OASAvailabilityFilter](OASAvailabilityFilter.md)
 - [OASBaseBusinessAssets](OASBaseBusinessAssets.md)
 - [OASBaseInviteDataResponse](OASBaseInviteDataResponse.md)
 - [OASBasePreferredMediaType](OASBasePreferredMediaType.md)
 - [OASBatchOperationStatus](OASBatchOperationStatus.md)
 - [OASBidFloor](OASBidFloor.md)
 - [OASBidFloorCreate](OASBidFloorCreate.md)
 - [OASBidFloorObjectiveType](OASBidFloorObjectiveType.md)
 - [OASBidFloorSpec](OASBidFloorSpec.md)
 - [OASBidOptionsAgeBucketMultipliers](OASBidOptionsAgeBucketMultipliers.md)
 - [OASBidOptionsAppTypeMultipliers](OASBidOptionsAppTypeMultipliers.md)
 - [OASBidOptionsAudienceMultipliers](OASBidOptionsAudienceMultipliers.md)
 - [OASBidOptionsGenderMultipliers](OASBidOptionsGenderMultipliers.md)
 - [OASBidOptionsPlacementMultipliers](OASBidOptionsPlacementMultipliers.md)
 - [OASBidStrategyType](OASBidStrategyType.md)
 - [OASBillingInvoice](OASBillingInvoice.md)
 - [OASBillingInvoiceDocumentType](OASBillingInvoiceDocumentType.md)
 - [OASBillingInvoiceDownloadResponse](OASBillingInvoiceDownloadResponse.md)
 - [OASBillingInvoiceSortField](OASBillingInvoiceSortField.md)
 - [OASBillingInvoiceStatus](OASBillingInvoiceStatus.md)
 - [OASBillingInvoicesGet200Response](OASBillingInvoicesGet200Response.md)
 - [OASBillingProfileCardType](OASBillingProfileCardType.md)
 - [OASBillingProfilePaymentMethodBrand](OASBillingProfilePaymentMethodBrand.md)
 - [OASBillingProfileStatus](OASBillingProfileStatus.md)
 - [OASBillingProfilesGet200Response](OASBillingProfilesGet200Response.md)
 - [OASBillingProfilesResponse](OASBillingProfilesResponse.md)
 - [OASBillingType](OASBillingType.md)
 - [OASBoard](OASBoard.md)
 - [OASBoardBase](OASBoardBase.md)
 - [OASBoardCreate](OASBoardCreate.md)
 - [OASBoardMedia](OASBoardMedia.md)
 - [OASBoardOwner](OASBoardOwner.md)
 - [OASBoardPrivacy](OASBoardPrivacy.md)
 - [OASBoardPrivacyFilter](OASBoardPrivacyFilter.md)
 - [OASBoardSection](OASBoardSection.md)
 - [OASBoardSectionCreate](OASBoardSectionCreate.md)
 - [OASBoardSectionUpdateWithRequiredBod](OASBoardSectionUpdateWithRequiredBod.md)
 - [OASBoardSectionsList200Response](OASBoardSectionsList200Response.md)
 - [OASBoardUpdatePrivacy](OASBoardUpdatePrivacy.md)
 - [OASBoardWithUpdatePrivacy](OASBoardWithUpdatePrivacy.md)
 - [OASBoardWithUpdatePrivacyUpdate](OASBoardWithUpdatePrivacyUpdate.md)
 - [OASBoardsList200Response](OASBoardsList200Response.md)
 - [OASBoardsListPins200Response](OASBoardsListPins200Response.md)
 - [OASBookClosed](OASBookClosed.md)
 - [OASBrandAccount](OASBrandAccount.md)
 - [OASBrandAccountCreate](OASBrandAccountCreate.md)
 - [OASBrandAccountProfileImage](OASBrandAccountProfileImage.md)
 - [OASBrandAccountProfileImageUpdate](OASBrandAccountProfileImageUpdate.md)
 - [OASBrandAccountUpdate](OASBrandAccountUpdate.md)
 - [OASBrandFilter](OASBrandFilter.md)
 - [OASBudgetDurationType](OASBudgetDurationType.md)
 - [OASBudgetType](OASBudgetType.md)
 - [OASBulkCampaignDeliveryEstimatesItem](OASBulkCampaignDeliveryEstimatesItem.md)
 - [OASBulkCampaignDeliveryEstimatesResp](OASBulkCampaignDeliveryEstimatesResp.md)
 - [OASBulkDownload](OASBulkDownload.md)
 - [OASBulkDownloadCampaignFilter](OASBulkDownloadCampaignFilter.md)
 - [OASBulkDownloadCreate](OASBulkDownloadCreate.md)
 - [OASBulkEntityType](OASBulkEntityType.md)
 - [OASBulkJobData](OASBulkJobData.md)
 - [OASBulkOutputFormat](OASBulkOutputFormat.md)
 - [OASBulkReportingJobStatus](OASBulkReportingJobStatus.md)
 - [OASBulkRequestStatus](OASBulkRequestStatus.md)
 - [OASBulkUpsertRequest](OASBulkUpsertRequest.md)
 - [OASBulkUpsertRequestCreate](OASBulkUpsertRequestCreate.md)
 - [OASBulkUpsertRequestCreateCatalogPro](OASBulkUpsertRequestCreateCatalogPro.md)
 - [OASBulkUpsertRequestUpdate](OASBulkUpsertRequestUpdate.md)
 - [OASBulkUpsertRequestUpdateCatalogPro](OASBulkUpsertRequestUpdateCatalogPro.md)
 - [OASBulkUpsertResponse](OASBulkUpsertResponse.md)
 - [OASBusinessAccessRole](OASBusinessAccessRole.md)
 - [OASBusinessAccessUserSummary](OASBusinessAccessUserSummary.md)
 - [OASBusinessAssetMembersGet200Respons](OASBusinessAssetMembersGet200Respons.md)
 - [OASBusinessAssets](OASBusinessAssets.md)
 - [OASBusinessAssetsGet200Response](OASBusinessAssetsGet200Response.md)
 - [OASBusinessMemberAssetsGetResponse](OASBusinessMemberAssetsGetResponse.md)
 - [OASBusinessMemberAssetsSummary](OASBusinessMemberAssetsSummary.md)
 - [OASBusinessMemberSortBy](OASBusinessMemberSortBy.md)
 - [OASBusinessMembersAssetAccessDeleteB](OASBusinessMembersAssetAccessDeleteB.md)
 - [OASBusinessMembershipMember](OASBusinessMembershipMember.md)
 - [OASBusinessPartnerAssetAccessGet200R](OASBusinessPartnerAssetAccessGet200R.md)
 - [OASBusinessRoleForInvite](OASBusinessRoleForInvite.md)
 - [OASBusinessRoleForMembers](OASBusinessRoleForMembers.md)
 - [OASBusinessSearchBy](OASBusinessSearchBy.md)
 - [OASBusinessToAdAccountSharedAudience](OASBusinessToAdAccountSharedAudience.md)
 - [OASBusinessToBusinessSharedAudience](OASBusinessToBusinessSharedAudience.md)
 - [OASBusinessToBusinessSharedAudienceU](OASBusinessToBusinessSharedAudienceU.md)
 - [OASCampaign](OASCampaign.md)
 - [OASCampaignAdPreview](OASCampaignAdPreview.md)
 - [OASCampaignAdPreviewCreate](OASCampaignAdPreviewCreate.md)
 - [OASCampaignAdPreviewCreate200Respons](OASCampaignAdPreviewCreate200Respons.md)
 - [OASCampaignAdPreviewDelete200Respons](OASCampaignAdPreviewDelete200Respons.md)
 - [OASCampaignAudienceMultipliers](OASCampaignAudienceMultipliers.md)
 - [OASCampaignBatchItem](OASCampaignBatchItem.md)
 - [OASCampaignBatchResponseData](OASCampaignBatchResponseData.md)
 - [OASCampaignBatchUpdateItem](OASCampaignBatchUpdateItem.md)
 - [OASCampaignBatchWriteResponseModel](OASCampaignBatchWriteResponseModel.md)
 - [OASCampaignBidOptions](OASCampaignBidOptions.md)
 - [OASCampaignBidOptionsCreate](OASCampaignBidOptionsCreate.md)
 - [OASCampaignBidOptionsUpdate](OASCampaignBidOptionsUpdate.md)
 - [OASCampaignBidOptionsUpdateMaskItems](OASCampaignBidOptionsUpdateMaskItems.md)
 - [OASCampaignCreateItem](OASCampaignCreateItem.md)
 - [OASCampaignCreateRequest](OASCampaignCreateRequest.md)
 - [OASCampaignCreateRequestAllOf1](OASCampaignCreateRequestAllOf1.md)
 - [OASCampaignDeliveryEstimatesCampaign](OASCampaignDeliveryEstimatesCampaign.md)
 - [OASCampaignDeliveryEstimatesDerivedM](OASCampaignDeliveryEstimatesDerivedM.md)
 - [OASCampaignDeliveryEstimatesResponse](OASCampaignDeliveryEstimatesResponse.md)
 - [OASCampaignObjectiveType](OASCampaignObjectiveType.md)
 - [OASCampaignPlanningAdGroupAudienceSi](OASCampaignPlanningAdGroupAudienceSi.md)
 - [OASCampaignPlanningBudgetRecommendat](OASCampaignPlanningBudgetRecommendat.md)
 - [OASCampaignPlanningConfidenceLevelAl](OASCampaignPlanningConfidenceLevelAl.md)
 - [OASCampaignPlanningConversionAttribu](OASCampaignPlanningConversionAttribu.md)
 - [OASCampaignPlanningConversionEvent](OASCampaignPlanningConversionEvent.md)
 - [OASCampaignPlanningConversionRate](OASCampaignPlanningConversionRate.md)
 - [OASCampaignPlanningCurveEstimate](OASCampaignPlanningCurveEstimate.md)
 - [OASCampaignPlanningEstimationType](OASCampaignPlanningEstimationType.md)
 - [OASCampaignPlanningExperimentBudgetR](OASCampaignPlanningExperimentBudgetR.md)
 - [OASCampaignPlanningPointEstimate](OASCampaignPlanningPointEstimate.md)
 - [OASCampaignPlanningResponseError](OASCampaignPlanningResponseError.md)
 - [OASCampaignPlanningResponseErrorCode](OASCampaignPlanningResponseErrorCode.md)
 - [OASCampaignSummaryStatus](OASCampaignSummaryStatus.md)
 - [OASCampaignUpdateRequest](OASCampaignUpdateRequest.md)
 - [OASCampaignUpdateRequestAllOf2](OASCampaignUpdateRequestAllOf2.md)
 - [OASCampaignsAnalyticsMetrics](OASCampaignsAnalyticsMetrics.md)
 - [OASCampaignsList200Response](OASCampaignsList200Response.md)
 - [OASCancelInviteException](OASCancelInviteException.md)
 - [OASCancelInviteResult](OASCancelInviteResult.md)
 - [OASCancelInviteResultItem](OASCancelInviteResultItem.md)
 - [OASCancelInviteResultUser](OASCancelInviteResultUser.md)
 - [OASCancelInvitesRequest](OASCancelInvitesRequest.md)
 - [OASCancelInvitesResponse](OASCancelInvitesResponse.md)
 - [OASCarouselSlot](OASCarouselSlot.md)
 - [OASCartingProduct](OASCartingProduct.md)
 - [OASCartingRetailer](OASCartingRetailer.md)
 - [OASCatalog](OASCatalog.md)
 - [OASCatalogBinding](OASCatalogBinding.md)
 - [OASCatalogCreate](OASCatalogCreate.md)
 - [OASCatalogUpdate](OASCatalogUpdate.md)
 - [OASCatalogsAiContentDisclosure](OASCatalogsAiContentDisclosure.md)
 - [OASCatalogsAiContentDisclosureLabel](OASCatalogsAiContentDisclosureLabel.md)
 - [OASCatalogsAvailableFilterValues](OASCatalogsAvailableFilterValues.md)
 - [OASCatalogsBaseFilterKeys](OASCatalogsBaseFilterKeys.md)
 - [OASCatalogsBaseFiltersAllOf](OASCatalogsBaseFiltersAllOf.md)
 - [OASCatalogsBaseFiltersAnyOf](OASCatalogsBaseFiltersAnyOf.md)
 - [OASCatalogsCreateCreativeAssetsItem](OASCatalogsCreateCreativeAssetsItem.md)
 - [OASCatalogsCreateHotelItem](OASCatalogsCreateHotelItem.md)
 - [OASCatalogsCreateReportResponse](OASCatalogsCreateReportResponse.md)
 - [OASCatalogsCreateRetailItem](OASCatalogsCreateRetailItem.md)
 - [OASCatalogsCreativeAssetsAttributes](OASCatalogsCreativeAssetsAttributes.md)
 - [OASCatalogsCreativeAssetsAvailableFi](OASCatalogsCreativeAssetsAvailableFi.md)
 - [OASCatalogsCreativeAssetsBatchItem](OASCatalogsCreativeAssetsBatchItem.md)
 - [OASCatalogsCreativeAssetsBatchReques](OASCatalogsCreativeAssetsBatchReques.md)
 - [OASCatalogsCreativeAssetsFeed](OASCatalogsCreativeAssetsFeed.md)
 - [OASCatalogsCreativeAssetsFeedsCreate](OASCatalogsCreativeAssetsFeedsCreate.md)
 - [OASCatalogsCreativeAssetsFeedsUpdate](OASCatalogsCreativeAssetsFeedsUpdate.md)
 - [OASCatalogsCreativeAssetsFilterValue](OASCatalogsCreativeAssetsFilterValue.md)
 - [OASCatalogsCreativeAssetsItemErrorRe](OASCatalogsCreativeAssetsItemErrorRe.md)
 - [OASCatalogsCreativeAssetsItemRespons](OASCatalogsCreativeAssetsItemRespons.md)
 - [OASCatalogsCreativeAssetsItemsBatch](OASCatalogsCreativeAssetsItemsBatch.md)
 - [OASCatalogsCreativeAssetsItemsPostFi](OASCatalogsCreativeAssetsItemsPostFi.md)
 - [OASCatalogsCreativeAssetsListProduct](OASCatalogsCreativeAssetsListProduct.md)
 - [OASCatalogsCreativeAssetsProduct](OASCatalogsCreativeAssetsProduct.md)
 - [OASCatalogsCreativeAssetsProductGrou](OASCatalogsCreativeAssetsProductGrou.md)
 - [OASCatalogsCreativeAssetsProductMeta](OASCatalogsCreativeAssetsProductMeta.md)
 - [OASCatalogsDeleteCreativeAssetsItem](OASCatalogsDeleteCreativeAssetsItem.md)
 - [OASCatalogsDeleteHotelItem](OASCatalogsDeleteHotelItem.md)
 - [OASCatalogsDeleteRetailItem](OASCatalogsDeleteRetailItem.md)
 - [OASCatalogsFeed](OASCatalogsFeed.md)
 - [OASCatalogsFeedCreateRequestSchema](OASCatalogsFeedCreateRequestSchema.md)
 - [OASCatalogsFeedCredentials](OASCatalogsFeedCredentials.md)
 - [OASCatalogsFeedIngestion](OASCatalogsFeedIngestion.md)
 - [OASCatalogsFeedIngestionDetails](OASCatalogsFeedIngestionDetails.md)
 - [OASCatalogsFeedIngestionErrors](OASCatalogsFeedIngestionErrors.md)
 - [OASCatalogsFeedIngestionInfo](OASCatalogsFeedIngestionInfo.md)
 - [OASCatalogsFeedIngestionWarnings](OASCatalogsFeedIngestionWarnings.md)
 - [OASCatalogsFeedProcessingResult](OASCatalogsFeedProcessingResult.md)
 - [OASCatalogsFeedProcessingSchedule](OASCatalogsFeedProcessingSchedule.md)
 - [OASCatalogsFeedProcessingScheduleTim](OASCatalogsFeedProcessingScheduleTim.md)
 - [OASCatalogsFeedProcessingStatus](OASCatalogsFeedProcessingStatus.md)
 - [OASCatalogsFeedProductCounts](OASCatalogsFeedProductCounts.md)
 - [OASCatalogsFeedUpdateRequestSchema](OASCatalogsFeedUpdateRequestSchema.md)
 - [OASCatalogsFeedValidationDetails](OASCatalogsFeedValidationDetails.md)
 - [OASCatalogsFeedValidationErrors](OASCatalogsFeedValidationErrors.md)
 - [OASCatalogsFeedValidationWarnings](OASCatalogsFeedValidationWarnings.md)
 - [OASCatalogsFeedVideoCounts](OASCatalogsFeedVideoCounts.md)
 - [OASCatalogsFeedsCreateRequest](OASCatalogsFeedsCreateRequest.md)
 - [OASCatalogsFeedsUpdateRequest](OASCatalogsFeedsUpdateRequest.md)
 - [OASCatalogsFormat](OASCatalogsFormat.md)
 - [OASCatalogsHotelAddress](OASCatalogsHotelAddress.md)
 - [OASCatalogsHotelAttributes](OASCatalogsHotelAttributes.md)
 - [OASCatalogsHotelAvailableFilterValue](OASCatalogsHotelAvailableFilterValue.md)
 - [OASCatalogsHotelBatchItem](OASCatalogsHotelBatchItem.md)
 - [OASCatalogsHotelBatchRequest](OASCatalogsHotelBatchRequest.md)
 - [OASCatalogsHotelFeed](OASCatalogsHotelFeed.md)
 - [OASCatalogsHotelFeedsCreateRequest](OASCatalogsHotelFeedsCreateRequest.md)
 - [OASCatalogsHotelFeedsUpdateRequest](OASCatalogsHotelFeedsUpdateRequest.md)
 - [OASCatalogsHotelFilterValuesMap](OASCatalogsHotelFilterValuesMap.md)
 - [OASCatalogsHotelGuestRatings](OASCatalogsHotelGuestRatings.md)
 - [OASCatalogsHotelItemErrorResponse](OASCatalogsHotelItemErrorResponse.md)
 - [OASCatalogsHotelItemResponse](OASCatalogsHotelItemResponse.md)
 - [OASCatalogsHotelItemsBatch](OASCatalogsHotelItemsBatch.md)
 - [OASCatalogsHotelItemsPostFilter](OASCatalogsHotelItemsPostFilter.md)
 - [OASCatalogsHotelListProductsByCatalo](OASCatalogsHotelListProductsByCatalo.md)
 - [OASCatalogsHotelMainImage](OASCatalogsHotelMainImage.md)
 - [OASCatalogsHotelProduct](OASCatalogsHotelProduct.md)
 - [OASCatalogsHotelProductGroup](OASCatalogsHotelProductGroup.md)
 - [OASCatalogsHotelProductGroupCreateRe](OASCatalogsHotelProductGroupCreateRe.md)
 - [OASCatalogsHotelProductGroupFilterKe](OASCatalogsHotelProductGroupFilterKe.md)
 - [OASCatalogsHotelProductGroupFilters](OASCatalogsHotelProductGroupFilters.md)
 - [OASCatalogsHotelProductGroupFiltersA](OASCatalogsHotelProductGroupFiltersA.md)
 - [OASCatalogsHotelProductGroupProductC](OASCatalogsHotelProductGroupProductC.md)
 - [OASCatalogsHotelProductGroupType](OASCatalogsHotelProductGroupType.md)
 - [OASCatalogsHotelProductGroupUpdateRe](OASCatalogsHotelProductGroupUpdateRe.md)
 - [OASCatalogsHotelProductMetadata](OASCatalogsHotelProductMetadata.md)
 - [OASCatalogsHotelReportParameters](OASCatalogsHotelReportParameters.md)
 - [OASCatalogsHotelReportParametersRepo](OASCatalogsHotelReportParametersRepo.md)
 - [OASCatalogsHotelReportStatsParameter](OASCatalogsHotelReportStatsParameter.md)
 - [OASCatalogsItemValidationDetails](OASCatalogsItemValidationDetails.md)
 - [OASCatalogsItemValidationErrors](OASCatalogsItemValidationErrors.md)
 - [OASCatalogsItemValidationIssue](OASCatalogsItemValidationIssue.md)
 - [OASCatalogsItemValidationIssues](OASCatalogsItemValidationIssues.md)
 - [OASCatalogsItemValidationWarnings](OASCatalogsItemValidationWarnings.md)
 - [OASCatalogsItemsBatch](OASCatalogsItemsBatch.md)
 - [OASCatalogsItemsBatchPostRequest](OASCatalogsItemsBatchPostRequest.md)
 - [OASCatalogsItemsBatchRequest](OASCatalogsItemsBatchRequest.md)
 - [OASCatalogsItemsCreateBatchRequest](OASCatalogsItemsCreateBatchRequest.md)
 - [OASCatalogsItemsDeleteBatchRequest](OASCatalogsItemsDeleteBatchRequest.md)
 - [OASCatalogsItemsDeleteDiscontinuedBa](OASCatalogsItemsDeleteDiscontinuedBa.md)
 - [OASCatalogsItemsPostFilters](OASCatalogsItemsPostFilters.md)
 - [OASCatalogsItemsRequest](OASCatalogsItemsRequest.md)
 - [OASCatalogsItemsUpdateBatchRequest](OASCatalogsItemsUpdateBatchRequest.md)
 - [OASCatalogsItemsUpsertBatchRequest](OASCatalogsItemsUpsertBatchRequest.md)
 - [OASCatalogsList200Response](OASCatalogsList200Response.md)
 - [OASCatalogsListProductsByFeedBasedFi](OASCatalogsListProductsByFeedBasedFi.md)
 - [OASCatalogsListProductsByFilterReque](OASCatalogsListProductsByFilterReque.md)
 - [OASCatalogsLocalStoresCreate200Respo](OASCatalogsLocalStoresCreate200Respo.md)
 - [OASCatalogsLocalStoresDelete200Respo](OASCatalogsLocalStoresDelete200Respo.md)
 - [OASCatalogsLocalStoresList200Respons](OASCatalogsLocalStoresList200Respons.md)
 - [OASCatalogsLocale](OASCatalogsLocale.md)
 - [OASCatalogsProduct](OASCatalogsProduct.md)
 - [OASCatalogsProductGroupCreateRequest](OASCatalogsProductGroupCreateRequest.md)
 - [OASCatalogsProductGroupCurrencyCrite](OASCatalogsProductGroupCurrencyCrite.md)
 - [OASCatalogsProductGroupFilterKeys](OASCatalogsProductGroupFilterKeys.md)
 - [OASCatalogsProductGroupFilterOperato](OASCatalogsProductGroupFilterOperato.md)
 - [OASCatalogsProductGroupFilters](OASCatalogsProductGroupFilters.md)
 - [OASCatalogsProductGroupFiltersAllOf](OASCatalogsProductGroupFiltersAllOf.md)
 - [OASCatalogsProductGroupFiltersAnyOf](OASCatalogsProductGroupFiltersAnyOf.md)
 - [OASCatalogsProductGroupFiltersReques](OASCatalogsProductGroupFiltersReques.md)
 - [OASCatalogsProductGroupMultipleCount](OASCatalogsProductGroupMultipleCount.md)
 - [OASCatalogsProductGroupMultipleGende](OASCatalogsProductGroupMultipleGende.md)
 - [OASCatalogsProductGroupMultipleMedia](OASCatalogsProductGroupMultipleMedia.md)
 - [OASCatalogsProductGroupMultiplePinte](OASCatalogsProductGroupMultiplePinte.md)
 - [OASCatalogsProductGroupMultipleStrin](OASCatalogsProductGroupMultipleStrin.md)
 - [OASCatalogsProductGroupPinsList200Re](OASCatalogsProductGroupPinsList200Re.md)
 - [OASCatalogsProductGroupPricingCriter](OASCatalogsProductGroupPricingCriter.md)
 - [OASCatalogsProductGroupProductCounts](OASCatalogsProductGroupProductCounts.md)
 - [OASCatalogsProductGroupStatus](OASCatalogsProductGroupStatus.md)
 - [OASCatalogsProductGroupType](OASCatalogsProductGroupType.md)
 - [OASCatalogsProductGroupUint32Criteri](OASCatalogsProductGroupUint32Criteri.md)
 - [OASCatalogsProductGroupUpdateManyReq](OASCatalogsProductGroupUpdateManyReq.md)
 - [OASCatalogsProductGroupUpdateRequest](OASCatalogsProductGroupUpdateRequest.md)
 - [OASCatalogsProductGroupsCreateReques](OASCatalogsProductGroupsCreateReques.md)
 - [OASCatalogsProductGroupsList200Respo](OASCatalogsProductGroupsList200Respo.md)
 - [OASCatalogsProductGroupsUpdateReques](OASCatalogsProductGroupsUpdateReques.md)
 - [OASCatalogsReport](OASCatalogsReport.md)
 - [OASCatalogsReportDistributionIssueFi](OASCatalogsReportDistributionIssueFi.md)
 - [OASCatalogsReportDistributionStats](OASCatalogsReportDistributionStats.md)
 - [OASCatalogsReportFeedIngestionFilter](OASCatalogsReportFeedIngestionFilter.md)
 - [OASCatalogsReportFeedIngestionStats](OASCatalogsReportFeedIngestionStats.md)
 - [OASCatalogsReportParameters](OASCatalogsReportParameters.md)
 - [OASCatalogsReportStats](OASCatalogsReportStats.md)
 - [OASCatalogsReportStatsParameters](OASCatalogsReportStatsParameters.md)
 - [OASCatalogsRetailAvailableFilterValu](OASCatalogsRetailAvailableFilterValu.md)
 - [OASCatalogsRetailBatchRequest](OASCatalogsRetailBatchRequest.md)
 - [OASCatalogsRetailBatchRequestItemsIt](OASCatalogsRetailBatchRequestItemsIt.md)
 - [OASCatalogsRetailFeed](OASCatalogsRetailFeed.md)
 - [OASCatalogsRetailFeedsCreateRequest](OASCatalogsRetailFeedsCreateRequest.md)
 - [OASCatalogsRetailFeedsUpdateRequest](OASCatalogsRetailFeedsUpdateRequest.md)
 - [OASCatalogsRetailFilterValuesMap](OASCatalogsRetailFilterValuesMap.md)
 - [OASCatalogsRetailItemErrorResponse](OASCatalogsRetailItemErrorResponse.md)
 - [OASCatalogsRetailItemResponse](OASCatalogsRetailItemResponse.md)
 - [OASCatalogsRetailItemsBatch](OASCatalogsRetailItemsBatch.md)
 - [OASCatalogsRetailItemsPostFilter](OASCatalogsRetailItemsPostFilter.md)
 - [OASCatalogsRetailListProductsByCatal](OASCatalogsRetailListProductsByCatal.md)
 - [OASCatalogsRetailProduct](OASCatalogsRetailProduct.md)
 - [OASCatalogsRetailProductGroup](OASCatalogsRetailProductGroup.md)
 - [OASCatalogsRetailProductGroupCreateR](OASCatalogsRetailProductGroupCreateR.md)
 - [OASCatalogsRetailProductGroupProduct](OASCatalogsRetailProductGroupProduct.md)
 - [OASCatalogsRetailProductGroupUpdateR](OASCatalogsRetailProductGroupUpdateR.md)
 - [OASCatalogsRetailProductMetadata](OASCatalogsRetailProductMetadata.md)
 - [OASCatalogsRetailReportAllItemsFilte](OASCatalogsRetailReportAllItemsFilte.md)
 - [OASCatalogsRetailReportParameters](OASCatalogsRetailReportParameters.md)
 - [OASCatalogsRetailReportParametersRep](OASCatalogsRetailReportParametersRep.md)
 - [OASCatalogsRetailReportStatsParamete](OASCatalogsRetailReportStatsParamete.md)
 - [OASCatalogsStatus](OASCatalogsStatus.md)
 - [OASCatalogsType](OASCatalogsType.md)
 - [OASCatalogsUpdatableCreativeAssetsAt](OASCatalogsUpdatableCreativeAssetsAt.md)
 - [OASCatalogsUpdatableHotelAttributes](OASCatalogsUpdatableHotelAttributes.md)
 - [OASCatalogsUpdateCreativeAssetsItem](OASCatalogsUpdateCreativeAssetsItem.md)
 - [OASCatalogsUpdateHotelItem](OASCatalogsUpdateHotelItem.md)
 - [OASCatalogsUpdateRetailItem](OASCatalogsUpdateRetailItem.md)
 - [OASCatalogsUpsertCreativeAssetsItem](OASCatalogsUpsertCreativeAssetsItem.md)
 - [OASCatalogsUpsertHotelItem](OASCatalogsUpsertHotelItem.md)
 - [OASCatalogsUpsertRetailItem](OASCatalogsUpsertRetailItem.md)
 - [OASCatalogsVerticalBatchRequest](OASCatalogsVerticalBatchRequest.md)
 - [OASCatalogsVerticalFeedsCreateReques](OASCatalogsVerticalFeedsCreateReques.md)
 - [OASCatalogsVerticalFeedsUpdateReques](OASCatalogsVerticalFeedsUpdateReques.md)
 - [OASCatalogsVerticalProductGroup](OASCatalogsVerticalProductGroup.md)
 - [OASCatalogsVerticalProductGroupCreat](OASCatalogsVerticalProductGroupCreat.md)
 - [OASCatalogsVerticalProductGroupUpdat](OASCatalogsVerticalProductGroupUpdat.md)
 - [OASCatalogsVerticalsListProductsByCa](OASCatalogsVerticalsListProductsByCa.md)
 - [OASChangeHistoryDataType](OASChangeHistoryDataType.md)
 - [OASChangeHistoryOperationType](OASChangeHistoryOperationType.md)
 - [OASCollectionsHeaderType](OASCollectionsHeaderType.md)
 - [OASConditionFilter](OASConditionFilter.md)
 - [OASContentType](OASContentType.md)
 - [OASConversionAccessToken](OASConversionAccessToken.md)
 - [OASConversionApiResponseEventsItems](OASConversionApiResponseEventsItems.md)
 - [OASConversionAttributionWindowDays](OASConversionAttributionWindowDays.md)
 - [OASConversionDeletionRequest](OASConversionDeletionRequest.md)
 - [OASConversionDeletionRequestCreate](OASConversionDeletionRequestCreate.md)
 - [OASConversionDeletionRequestEPIKTarg](OASConversionDeletionRequestEPIKTarg.md)
 - [OASConversionDeletionRequestList200R](OASConversionDeletionRequestList200R.md)
 - [OASConversionDeletionRequestStatus](OASConversionDeletionRequestStatus.md)
 - [OASConversionDeletionRequestTargets](OASConversionDeletionRequestTargets.md)
 - [OASConversionDeletionRequestUserEmai](OASConversionDeletionRequestUserEmai.md)
 - [OASConversionEvent](OASConversionEvent.md)
 - [OASConversionEventAppInfo](OASConversionEventAppInfo.md)
 - [OASConversionEventDeviceInfo](OASConversionEventDeviceInfo.md)
 - [OASConversionEventIngestionSource](OASConversionEventIngestionSource.md)
 - [OASConversionEventResponse](OASConversionEventResponse.md)
 - [OASConversionEvents](OASConversionEvents.md)
 - [OASConversionEventsCreate](OASConversionEventsCreate.md)
 - [OASConversionEventsDataItems](OASConversionEventsDataItems.md)
 - [OASConversionEventsDataItemsCustomDa](OASConversionEventsDataItemsCustomDa.md)
 - [OASConversionEventsUserDataPropertie](OASConversionEventsUserDataPropertie.md)
 - [OASConversionHealthSelectionItem](OASConversionHealthSelectionItem.md)
 - [OASConversionLearningModeType](OASConversionLearningModeType.md)
 - [OASConversionMSOTEventsCreate](OASConversionMSOTEventsCreate.md)
 - [OASConversionObjectiveType](OASConversionObjectiveType.md)
 - [OASConversionProductAttributionType](OASConversionProductAttributionType.md)
 - [OASConversionProductReport](OASConversionProductReport.md)
 - [OASConversionProductReportBreakdownT](OASConversionProductReportBreakdownT.md)
 - [OASConversionProductReportCreate](OASConversionProductReportCreate.md)
 - [OASConversionProductReportGranularit](OASConversionProductReportGranularit.md)
 - [OASConversionProductReportLevel](OASConversionProductReportLevel.md)
 - [OASConversionProductReportingColumn](OASConversionProductReportingColumn.md)
 - [OASConversionReportAttributionType](OASConversionReportAttributionType.md)
 - [OASConversionReportTimeType](OASConversionReportTimeType.md)
 - [OASConversionTag](OASConversionTag.md)
 - [OASConversionTagCommon](OASConversionTagCommon.md)
 - [OASConversionTagConfigs](OASConversionTagConfigs.md)
 - [OASConversionTagCreate](OASConversionTagCreate.md)
 - [OASConversionTagResponse](OASConversionTagResponse.md)
 - [OASConversionTagType](OASConversionTagType.md)
 - [OASConversionTagTypeOptimal](OASConversionTagTypeOptimal.md)
 - [OASConversionTagV3GoalMetadata](OASConversionTagV3GoalMetadata.md)
 - [OASConversionTagsList200Response](OASConversionTagsList200Response.md)
 - [OASCountry](OASCountry.md)
 - [OASCountryFilter](OASCountryFilter.md)
 - [OASCreateAssetAccessRequestBody](OASCreateAssetAccessRequestBody.md)
 - [OASCreateAssetAccessRequestItem](OASCreateAssetAccessRequestItem.md)
 - [OASCreateAssetAccessRequestResponse](OASCreateAssetAccessRequestResponse.md)
 - [OASCreateAssetInvitesRequest](OASCreateAssetInvitesRequest.md)
 - [OASCreateAssetInvitesRequestItem](OASCreateAssetInvitesRequestItem.md)
 - [OASCreateInvitesResultsResponseArray](OASCreateInvitesResultsResponseArray.md)
 - [OASCreateMembershipOrPartnershipInvi](OASCreateMembershipOrPartnershipInvi.md)
 - [OASCreationSource](OASCreationSource.md)
 - [OASCreativeAssetsIdFilter](OASCreativeAssetsIdFilter.md)
 - [OASCreativeAssetsProcessingRecord](OASCreativeAssetsProcessingRecord.md)
 - [OASCreativeAssetsVisibilityType](OASCreativeAssetsVisibilityType.md)
 - [OASCreativeType](OASCreativeType.md)
 - [OASCurrency](OASCurrency.md)
 - [OASCurrencyFilter](OASCurrencyFilter.md)
 - [OASCustomConversionEventMetrics](OASCustomConversionEventMetrics.md)
 - [OASCustomLabel0Filter](OASCustomLabel0Filter.md)
 - [OASCustomLabel1Filter](OASCustomLabel1Filter.md)
 - [OASCustomLabel2Filter](OASCustomLabel2Filter.md)
 - [OASCustomLabel3Filter](OASCustomLabel3Filter.md)
 - [OASCustomLabel4Filter](OASCustomLabel4Filter.md)
 - [OASCustomNumber0Filter](OASCustomNumber0Filter.md)
 - [OASCustomNumber1Filter](OASCustomNumber1Filter.md)
 - [OASCustomNumber2Filter](OASCustomNumber2Filter.md)
 - [OASCustomNumber3Filter](OASCustomNumber3Filter.md)
 - [OASCustomNumber4Filter](OASCustomNumber4Filter.md)
 - [OASCustomerList](OASCustomerList.md)
 - [OASCustomerListCreate](OASCustomerListCreate.md)
 - [OASCustomerListRecordRow](OASCustomerListRecordRow.md)
 - [OASCustomerListStatus](OASCustomerListStatus.md)
 - [OASCustomerListUpdateWithRequiredBod](OASCustomerListUpdateWithRequiredBod.md)
 - [OASCustomerListUpload](OASCustomerListUpload.md)
 - [OASCustomerListUploadCreateRequest](OASCustomerListUploadCreateRequest.md)
 - [OASCustomerListUploadCreateResponse](OASCustomerListUploadCreateResponse.md)
 - [OASCustomerListsList200Response](OASCustomerListsList200Response.md)
 - [OASCustomerSegment](OASCustomerSegment.md)
 - [OASCustomerSegmentCreate](OASCustomerSegmentCreate.md)
 - [OASCustomerSegmentList200Response](OASCustomerSegmentList200Response.md)
 - [OASCustomerSegmentUpdateRequestUpdat](OASCustomerSegmentUpdateRequestUpdat.md)
 - [OASCustomizableCTAType](OASCustomizableCTAType.md)
 - [OASDataOutputFormat](OASDataOutputFormat.md)
 - [OASDataStatus](OASDataStatus.md)
 - [OASDeleteBusinessMembership200Respon](OASDeleteBusinessMembership200Respon.md)
 - [OASDeleteBusinessMembershipBody](OASDeleteBusinessMembershipBody.md)
 - [OASDeleteBusinessMembershipMember](OASDeleteBusinessMembershipMember.md)
 - [OASDeleteBusinessPartners](OASDeleteBusinessPartners.md)
 - [OASDeleteBusinessPartnersDelete](OASDeleteBusinessPartnersDelete.md)
 - [OASDeleteMemberAccessResult](OASDeleteMemberAccessResult.md)
 - [OASDeleteMemberAccessResultsResponse](OASDeleteMemberAccessResultsResponse.md)
 - [OASDeleteMemberAssetAccessItem](OASDeleteMemberAssetAccessItem.md)
 - [OASDeletePartnerAssetAccessBody](OASDeletePartnerAssetAccessBody.md)
 - [OASDeletePartnerAssetAccessItem](OASDeletePartnerAssetAccessItem.md)
 - [OASDeletePartnerAssetAccessResult](OASDeletePartnerAssetAccessResult.md)
 - [OASDeletePartnerAssetAccessResultsRe](OASDeletePartnerAssetAccessResultsRe.md)
 - [OASDeliveryEstimateObjectiveType](OASDeliveryEstimateObjectiveType.md)
 - [OASDeliveryMetricsGet200Response](OASDeliveryMetricsGet200Response.md)
 - [OASDeliveryMetricsResponseItemsItems](OASDeliveryMetricsResponseItemsItems.md)
 - [OASDetailedError](OASDetailedError.md)
 - [OASDisclosureType](OASDisclosureType.md)
 - [OASDiscountStatus](OASDiscountStatus.md)
 - [OASDynamicTitlesDownloadCSV](OASDynamicTitlesDownloadCSV.md)
 - [OASDynamicTitlesGetStatus](OASDynamicTitlesGetStatus.md)
 - [OASDynamicTitlesProcessCSV](OASDynamicTitlesProcessCSV.md)
 - [OASDynamicTitlesProcessCSVCreate](OASDynamicTitlesProcessCSVCreate.md)
 - [OASDynamicTitlesProcessCSVError](OASDynamicTitlesProcessCSVError.md)
 - [OASDynamicTitlesUploadURL](OASDynamicTitlesUploadURL.md)
 - [OASEnhancedMatchStatusType](OASEnhancedMatchStatusType.md)
 - [OASEntityDataChangeHistory](OASEntityDataChangeHistory.md)
 - [OASEntityHistory](OASEntityHistory.md)
 - [OASEntityLabel](OASEntityLabel.md)
 - [OASEntityLabelError](OASEntityLabelError.md)
 - [OASEntityLabelStatus](OASEntityLabelStatus.md)
 - [OASEntityStatus](OASEntityStatus.md)
 - [OASErrorDetail](OASErrorDetail.md)
 - [OASEventData](OASEventData.md)
 - [OASEventProcessingStatus](OASEventProcessingStatus.md)
 - [OASEventQualityScore](OASEventQualityScore.md)
 - [OASException](OASException.md)
 - [OASFeaturedTrend](OASFeaturedTrend.md)
 - [OASFeedProcessingResultsList200Respo](OASFeedProcessingResultsList200Respo.md)
 - [OASFeedsList200Response](OASFeedsList200Response.md)
 - [OASFilterOperatorType](OASFilterOperatorType.md)
 - [OASFollowUser](OASFollowUser.md)
 - [OASFollowUserCreate](OASFollowUserCreate.md)
 - [OASFollowersList200Response](OASFollowersList200Response.md)
 - [OASFormFactor](OASFormFactor.md)
 - [OASFreqBidMultiplierTimeWindow](OASFreqBidMultiplierTimeWindow.md)
 - [OASFrequencyGoalMetadata](OASFrequencyGoalMetadata.md)
 - [OASFrequencyGoalMetadataTimerange](OASFrequencyGoalMetadataTimerange.md)
 - [OASFrequencyMultipliers](OASFrequencyMultipliers.md)
 - [OASGender](OASGender.md)
 - [OASGenderBucket](OASGenderBucket.md)
 - [OASGenderDemographics](OASGenderDemographics.md)
 - [OASGenderFilter](OASGenderFilter.md)
 - [OASGenderMultipliers](OASGenderMultipliers.md)
 - [OASGetBusinessEmployers200Response](OASGetBusinessEmployers200Response.md)
 - [OASGetInvites200Response](OASGetInvites200Response.md)
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
 - [OASHttpMethod](OASHttpMethod.md)
 - [OASImageDetails](OASImageDetails.md)
 - [OASImageMetadata](OASImageMetadata.md)
 - [OASImageSize](OASImageSize.md)
 - [OASIneligibleProductTagErrorItem](OASIneligibleProductTagErrorItem.md)
 - [OASIneligibleProductTagReason](OASIneligibleProductTagReason.md)
 - [OASIneligibleProductTagsErrorDetails](OASIneligibleProductTagsErrorDetails.md)
 - [OASIngestionSource](OASIngestionSource.md)
 - [OASIngestionSourceOptions](OASIngestionSourceOptions.md)
 - [OASInnerProductCategoriesMetricsHigh](OASInnerProductCategoriesMetricsHigh.md)
 - [OASIntegrationLog](OASIntegrationLog.md)
 - [OASIntegrationLogClientError](OASIntegrationLogClientError.md)
 - [OASIntegrationLogClientRequest](OASIntegrationLogClientRequest.md)
 - [OASIntegrationLogEventType](OASIntegrationLogEventType.md)
 - [OASIntegrationLogLevel](OASIntegrationLogLevel.md)
 - [OASIntegrationLogsInvalidLogResponse](OASIntegrationLogsInvalidLogResponse.md)
 - [OASIntegrationLogsRequestCreate](OASIntegrationLogsRequestCreate.md)
 - [OASIntegrationLogsSuccessResponse](OASIntegrationLogsSuccessResponse.md)
 - [OASIntegrationMetadata](OASIntegrationMetadata.md)
 - [OASIntegrationMetadataCreate](OASIntegrationMetadataCreate.md)
 - [OASIntegrationMetadataUpdate](OASIntegrationMetadataUpdate.md)
 - [OASIntegrationRecord](OASIntegrationRecord.md)
 - [OASIntegrationsGetList200Response](OASIntegrationsGetList200Response.md)
 - [OASIntendedPromotionType](OASIntendedPromotionType.md)
 - [OASInterest](OASInterest.md)
 - [OASInterestsEnum](OASInterestsEnum.md)
 - [OASInviteActionResultItem](OASInviteActionResultItem.md)
 - [OASInviteAssetsSummary](OASInviteAssetsSummary.md)
 - [OASInviteAssetsSummaryItem](OASInviteAssetsSummaryItem.md)
 - [OASInviteBusinessRoleBinding](OASInviteBusinessRoleBinding.md)
 - [OASInviteDataResponse](OASInviteDataResponse.md)
 - [OASInviteExceptionResponse](OASInviteExceptionResponse.md)
 - [OASInviteFilterStatus](OASInviteFilterStatus.md)
 - [OASInviteResponse](OASInviteResponse.md)
 - [OASInviteStatus](OASInviteStatus.md)
 - [OASInviteType](OASInviteType.md)
 - [OASItemAttributes](OASItemAttributes.md)
 - [OASItemAttributesRequest](OASItemAttributesRequest.md)
 - [OASItemAttributesRequestImageLink](OASItemAttributesRequestImageLink.md)
 - [OASItemAvailability](OASItemAvailability.md)
 - [OASItemCreateBatchRecord](OASItemCreateBatchRecord.md)
 - [OASItemDeleteBatchRecord](OASItemDeleteBatchRecord.md)
 - [OASItemDeleteDiscontinuedBatchRecord](OASItemDeleteDiscontinuedBatchRecord.md)
 - [OASItemGroupIdFilter](OASItemGroupIdFilter.md)
 - [OASItemIdFilter](OASItemIdFilter.md)
 - [OASItemIdStoreCodePair](OASItemIdStoreCodePair.md)
 - [OASItemProcessingRecord](OASItemProcessingRecord.md)
 - [OASItemProcessingStatus](OASItemProcessingStatus.md)
 - [OASItemResponse](OASItemResponse.md)
 - [OASItemUpdateBatchRecord](OASItemUpdateBatchRecord.md)
 - [OASItemUpsertBatchRecord](OASItemUpsertBatchRecord.md)
 - [OASItemValidationEvent](OASItemValidationEvent.md)
 - [OASItemsIssuesList200Response](OASItemsIssuesList200Response.md)
 - [OASItemsPost200Response](OASItemsPost200Response.md)
 - [OASKeyword](OASKeyword.md)
 - [OASKeywordCreateItem](OASKeywordCreateItem.md)
 - [OASKeywordError](OASKeywordError.md)
 - [OASKeywordInfo](OASKeywordInfo.md)
 - [OASKeywordMetrics](OASKeywordMetrics.md)
 - [OASKeywordMetricsResponse](OASKeywordMetricsResponse.md)
 - [OASKeywordUpdateGenerated](OASKeywordUpdateGenerated.md)
 - [OASKeywordUpdateItem](OASKeywordUpdateItem.md)
 - [OASKeywords](OASKeywords.md)
 - [OASKeywordsCommon](OASKeywordsCommon.md)
 - [OASKeywordsCreate](OASKeywordsCreate.md)
 - [OASKeywordsGet200Response](OASKeywordsGet200Response.md)
 - [OASKeywordsMetricsArrayResponse](OASKeywordsMetricsArrayResponse.md)
 - [OASKeywordsRequest](OASKeywordsRequest.md)
 - [OASKeywordsUpdate](OASKeywordsUpdate.md)
 - [OASLabel](OASLabel.md)
 - [OASLabelBulkCreateRequest](OASLabelBulkCreateRequest.md)
 - [OASLabelBulkUpdateRequest](OASLabelBulkUpdateRequest.md)
 - [OASLabelCreateItem](OASLabelCreateItem.md)
 - [OASLabelCreateRequest](OASLabelCreateRequest.md)
 - [OASLabelError](OASLabelError.md)
 - [OASLabelErrorData](OASLabelErrorData.md)
 - [OASLabelParentType](OASLabelParentType.md)
 - [OASLabelStatus](OASLabelStatus.md)
 - [OASLabelStatusBulkUpdate](OASLabelStatusBulkUpdate.md)
 - [OASLabelType](OASLabelType.md)
 - [OASLabelUpdateItem](OASLabelUpdateItem.md)
 - [OASLabelUpdateRequest](OASLabelUpdateRequest.md)
 - [OASLabeledEntities](OASLabeledEntities.md)
 - [OASLabeledEntitiesCreate](OASLabeledEntitiesCreate.md)
 - [OASLabelsList200Response](OASLabelsList200Response.md)
 - [OASLabelsResponse](OASLabelsResponse.md)
 - [OASLanguage](OASLanguage.md)
 - [OASLeadForm](OASLeadForm.md)
 - [OASLeadFormBatchUpdate](OASLeadFormBatchUpdate.md)
 - [OASLeadFormCreate](OASLeadFormCreate.md)
 - [OASLeadFormPolicyLink](OASLeadFormPolicyLink.md)
 - [OASLeadFormQuestion](OASLeadFormQuestion.md)
 - [OASLeadFormQuestionFieldType](OASLeadFormQuestionFieldType.md)
 - [OASLeadFormQuestionType](OASLeadFormQuestionType.md)
 - [OASLeadFormStatus](OASLeadFormStatus.md)
 - [OASLeadFormTest](OASLeadFormTest.md)
 - [OASLeadFormTestCreate](OASLeadFormTestCreate.md)
 - [OASLeadFormsCreate200Response](OASLeadFormsCreate200Response.md)
 - [OASLeadFormsCreate200ResponseItemsIn](OASLeadFormsCreate200ResponseItemsIn.md)
 - [OASLeadFormsList200Response](OASLeadFormsList200Response.md)
 - [OASLeadSubscription](OASLeadSubscription.md)
 - [OASLeadSubscriptionCreate](OASLeadSubscriptionCreate.md)
 - [OASLeadSubscriptionPostParams](OASLeadSubscriptionPostParams.md)
 - [OASLeadSubscriptionPostParamsCreate](OASLeadSubscriptionPostParamsCreate.md)
 - [OASLeadsExportResponseData](OASLeadsExportResponseData.md)
 - [OASLeadsExportStatus](OASLeadsExportStatus.md)
 - [OASLeadsExports](OASLeadsExports.md)
 - [OASLeadsExportsCreate](OASLeadsExportsCreate.md)
 - [OASLineItem](OASLineItem.md)
 - [OASLinkFilter](OASLinkFilter.md)
 - [OASLinkedBusiness](OASLinkedBusiness.md)
 - [OASLocalInventoryCreateOperation](OASLocalInventoryCreateOperation.md)
 - [OASLocalInventoryDeleteOperation](OASLocalInventoryDeleteOperation.md)
 - [OASLocalInventoryItemResponse](OASLocalInventoryItemResponse.md)
 - [OASLocalInventoryItemsBatch](OASLocalInventoryItemsBatch.md)
 - [OASLocalInventoryItemsBatchCreate](OASLocalInventoryItemsBatchCreate.md)
 - [OASLocalInventoryItemsGet](OASLocalInventoryItemsGet.md)
 - [OASLocalInventoryItemsGetCreate](OASLocalInventoryItemsGetCreate.md)
 - [OASLocalInventoryOperation](OASLocalInventoryOperation.md)
 - [OASLocalInventoryOperationResult](OASLocalInventoryOperationResult.md)
 - [OASLocalInventoryUpdateOperation](OASLocalInventoryUpdateOperation.md)
 - [OASLocalInventoryUpsertOperation](OASLocalInventoryUpsertOperation.md)
 - [OASLocalStore](OASLocalStore.md)
 - [OASLocalStoreBatchUpdate](OASLocalStoreBatchUpdate.md)
 - [OASLocalStoreCreate](OASLocalStoreCreate.md)
 - [OASLookbackPeriodOptions](OASLookbackPeriodOptions.md)
 - [OASMMMReport](OASMMMReport.md)
 - [OASMMMReportCreate](OASMMMReportCreate.md)
 - [OASMMMReportGranularity](OASMMMReportGranularity.md)
 - [OASMMMReportLevel](OASMMMReportLevel.md)
 - [OASMMMReportingColumn](OASMMMReportingColumn.md)
 - [OASMMMReportingTargetingType](OASMMMReportingTargetingType.md)
 - [OASMatchType](OASMatchType.md)
 - [OASMatchTypeResponse](OASMatchTypeResponse.md)
 - [OASMaxPriceFilter](OASMaxPriceFilter.md)
 - [OASMedia](OASMedia.md)
 - [OASMediaList200Response](OASMediaList200Response.md)
 - [OASMediaType](OASMediaType.md)
 - [OASMediaTypeFilter](OASMediaTypeFilter.md)
 - [OASMediaUpload](OASMediaUpload.md)
 - [OASMediaUploadCreate](OASMediaUploadCreate.md)
 - [OASMediaUploadParameters](OASMediaUploadParameters.md)
 - [OASMediaUploadStatus](OASMediaUploadStatus.md)
 - [OASMediaUploadType](OASMediaUploadType.md)
 - [OASMemberBusinessRole](OASMemberBusinessRole.md)
 - [OASMetricsReportingLevel](OASMetricsReportingLevel.md)
 - [OASMetricsReportingTemplateType](OASMetricsReportingTemplateType.md)
 - [OASMetricsResponse](OASMetricsResponse.md)
 - [OASMetricsResponseDataItems](OASMetricsResponseDataItems.md)
 - [OASMinPriceFilter](OASMinPriceFilter.md)
 - [OASMobileAppPlatform](OASMobileAppPlatform.md)
 - [OASMsotEventName](OASMsotEventName.md)
 - [OASMultiPinsAnalyticsMetricTypesItem](OASMultiPinsAnalyticsMetricTypesItem.md)
 - [OASNetworkType](OASNetworkType.md)
 - [OASNonDraftEntityStatus](OASNonDraftEntityStatus.md)
 - [OASNonNullableCatalogsCurrency](OASNonNullableCatalogsCurrency.md)
 - [OASNotificationPostRequest](OASNotificationPostRequest.md)
 - [OASNotificationResponse](OASNotificationResponse.md)
 - [OASNullableCatalogsItemFieldType](OASNullableCatalogsItemFieldType.md)
 - [OASNullableCurrency](OASNullableCurrency.md)
 - [OASNullableEntityStatus](OASNullableEntityStatus.md)
 - [OASNullableLabelStatus](OASNullableLabelStatus.md)
 - [OASNullableLabelType](OASNullableLabelType.md)
 - [OASNullableOptimizationGoalMetadata](OASNullableOptimizationGoalMetadata.md)
 - [OASNullablePartnerType](OASNullablePartnerType.md)
 - [OASNullalbleMatchType](OASNullalbleMatchType.md)
 - [OASNumericFilterOperatorType](OASNumericFilterOperatorType.md)
 - [OASOauthAccessToken](OASOauthAccessToken.md)
 - [OASObjectiveType](OASObjectiveType.md)
 - [OASOperationType](OASOperationType.md)
 - [OASOptimizationGoalMetadata](OASOptimizationGoalMetadata.md)
 - [OASOptimizationType](OASOptimizationType.md)
 - [OASOrder](OASOrder.md)
 - [OASOrderLine](OASOrderLine.md)
 - [OASOrderLineMutationError](OASOrderLineMutationError.md)
 - [OASOrderLineMutationResponse](OASOrderLineMutationResponse.md)
 - [OASOrderLineMutationResult](OASOrderLineMutationResult.md)
 - [OASOrderLinePaidType](OASOrderLinePaidType.md)
 - [OASOrderLineStatus](OASOrderLineStatus.md)
 - [OASOrderLinesList200Response](OASOrderLinesList200Response.md)
 - [OASOsFamily](OASOsFamily.md)
 - [OASOverallStatusOptions](OASOverallStatusOptions.md)
 - [OASPacingDeliveryType](OASPacingDeliveryType.md)
 - [OASPageVisitConversionTagsGet200Resp](OASPageVisitConversionTagsGet200Resp.md)
 - [OASPartnerMetadata](OASPartnerMetadata.md)
 - [OASPartnerType](OASPartnerType.md)
 - [OASPerformancePlusCampaignSettings](OASPerformancePlusCampaignSettings.md)
 - [OASPermissions](OASPermissions.md)
 - [OASPermissionsWithOwner](OASPermissionsWithOwner.md)
 - [OASPin](OASPin.md)
 - [OASPinAnalyticsDailyMetrics](OASPinAnalyticsDailyMetrics.md)
 - [OASPinAnalyticsMetricsResponse](OASPinAnalyticsMetricsResponse.md)
 - [OASPinBase](OASPinBase.md)
 - [OASPinCreate](OASPinCreate.md)
 - [OASPinFilter](OASPinFilter.md)
 - [OASPinMedia](OASPinMedia.md)
 - [OASPinMediaMetadata](OASPinMediaMetadata.md)
 - [OASPinMediaSource](OASPinMediaSource.md)
 - [OASPinMediaSourceImageBase64](OASPinMediaSourceImageBase64.md)
 - [OASPinMediaSourceImageURL](OASPinMediaSourceImageURL.md)
 - [OASPinMediaSourceImagesBase64](OASPinMediaSourceImagesBase64.md)
 - [OASPinMediaSourceImagesBase64Item](OASPinMediaSourceImagesBase64Item.md)
 - [OASPinMediaSourceImagesURL](OASPinMediaSourceImagesURL.md)
 - [OASPinMediaSourceImagesURLItem](OASPinMediaSourceImagesURLItem.md)
 - [OASPinMediaSourcePinURL](OASPinMediaSourcePinURL.md)
 - [OASPinMediaSourceVideoID](OASPinMediaSourceVideoID.md)
 - [OASPinMediaWithImage](OASPinMediaWithImage.md)
 - [OASPinMediaWithImageAndVideo](OASPinMediaWithImageAndVideo.md)
 - [OASPinMediaWithImages](OASPinMediaWithImages.md)
 - [OASPinMediaWithVideo](OASPinMediaWithVideo.md)
 - [OASPinMediaWithVideos](OASPinMediaWithVideos.md)
 - [OASPinPromotionSummaryStatus](OASPinPromotionSummaryStatus.md)
 - [OASPinRead](OASPinRead.md)
 - [OASPinType](OASPinType.md)
 - [OASPinUpdate](OASPinUpdate.md)
 - [OASPinnerListType](OASPinnerListType.md)
 - [OASPinsList200Response](OASPinsList200Response.md)
 - [OASPinsSaveRequestCreate](OASPinsSaveRequestCreate.md)
 - [OASPinterestLibBatchItemException](OASPinterestLibBatchItemException.md)
 - [OASPinterestLibError](OASPinterestLibError.md)
 - [OASPinterestLibPaginationOrder](OASPinterestLibPaginationOrder.md)
 - [OASPinterestLibStatus204](OASPinterestLibStatus204.md)
 - [OASPinterestProductCategoriesFilter](OASPinterestProductCategoriesFilter.md)
 - [OASPlacementGroupType](OASPlacementGroupType.md)
 - [OASPlacementMultipliers](OASPlacementMultipliers.md)
 - [OASPlacementTrafficType](OASPlacementTrafficType.md)
 - [OASPlacementType](OASPlacementType.md)
 - [OASPredictedTimeSeries](OASPredictedTimeSeries.md)
 - [OASPreferredMediaType](OASPreferredMediaType.md)
 - [OASPriceFilter](OASPriceFilter.md)
 - [OASPriceFilterPrice](OASPriceFilterPrice.md)
 - [OASPrimarySort](OASPrimarySort.md)
 - [OASProductAvailability](OASProductAvailability.md)
 - [OASProductAvailabilityType](OASProductAvailabilityType.md)
 - [OASProductCategoriesDemographic](OASProductCategoriesDemographic.md)
 - [OASProductCategoriesEngagementType](OASProductCategoriesEngagementType.md)
 - [OASProductCategoriesMetricsHighlight](OASProductCategoriesMetricsHighlight.md)
 - [OASProductCategoryDetailLookbackWind](OASProductCategoryDetailLookbackWind.md)
 - [OASProductCategoryDetails](OASProductCategoryDetails.md)
 - [OASProductCategoryEnum](OASProductCategoryEnum.md)
 - [OASProductCategoryRegion](OASProductCategoryRegion.md)
 - [OASProductCondition](OASProductCondition.md)
 - [OASProductGroupAnalyticsItems](OASProductGroupAnalyticsItems.md)
 - [OASProductGroupPromotion](OASProductGroupPromotion.md)
 - [OASProductGroupPromotionCreateReques](OASProductGroupPromotionCreateReques.md)
 - [OASProductGroupPromotionCustomizable](OASProductGroupPromotionCustomizable.md)
 - [OASProductGroupPromotionResponseItem](OASProductGroupPromotionResponseItem.md)
 - [OASProductGroupPromotionUpdateReques](OASProductGroupPromotionUpdateReques.md)
 - [OASProductGroupPromotions](OASProductGroupPromotions.md)
 - [OASProductGroupPromotionsCreate](OASProductGroupPromotionsCreate.md)
 - [OASProductGroupPromotionsList200Resp](OASProductGroupPromotionsList200Resp.md)
 - [OASProductGroupPromotionsUpdateWithR](OASProductGroupPromotionsUpdateWithR.md)
 - [OASProductGroupReferenceFilter](OASProductGroupReferenceFilter.md)
 - [OASProductGroupSummaryStatus](OASProductGroupSummaryStatus.md)
 - [OASProductTagItem](OASProductTagItem.md)
 - [OASProductTagsBulkAddRequest](OASProductTagsBulkAddRequest.md)
 - [OASProductTagsBulkDeleteRequest](OASProductTagsBulkDeleteRequest.md)
 - [OASProductTagsError](OASProductTagsError.md)
 - [OASProductTagsResponse](OASProductTagsResponse.md)
 - [OASProductType0Filter](OASProductType0Filter.md)
 - [OASProductType1Filter](OASProductType1Filter.md)
 - [OASProductType2Filter](OASProductType2Filter.md)
 - [OASProductType3Filter](OASProductType3Filter.md)
 - [OASProductType4Filter](OASProductType4Filter.md)
 - [OASPromotion](OASPromotion.md)
 - [OASPromotionApplicationLevel](OASPromotionApplicationLevel.md)
 - [OASPromotionArrayElement](OASPromotionArrayElement.md)
 - [OASPromotionBatchUpdate](OASPromotionBatchUpdate.md)
 - [OASPromotionCreate](OASPromotionCreate.md)
 - [OASPromotionTemplateValue](OASPromotionTemplateValue.md)
 - [OASPromotionType](OASPromotionType.md)
 - [OASPromotionsList200Response](OASPromotionsList200Response.md)
 - [OASPromotionsResponse](OASPromotionsResponse.md)
 - [OASPublicTargetingType](OASPublicTargetingType.md)
 - [OASQualityComponentDetails](OASQualityComponentDetails.md)
 - [OASQualityComponentIssue](OASQualityComponentIssue.md)
 - [OASQualityComponents](OASQualityComponents.md)
 - [OASQueryLabelEntityStatusesItems](OASQueryLabelEntityStatusesItems.md)
 - [OASQueryLabelTypesItems](OASQueryLabelTypesItems.md)
 - [OASQuerymetrictypesItems](OASQuerymetrictypesItems.md)
 - [OASQuerypinanalyticsmetrictypesItems](OASQuerypinanalyticsmetrictypesItems.md)
 - [OASQueryvideopinmetrictypesItems](OASQueryvideopinmetrictypesItems.md)
 - [OASQuizPinData](OASQuizPinData.md)
 - [OASQuizPinOption](OASQuizPinOption.md)
 - [OASQuizPinQuestion](OASQuizPinQuestion.md)
 - [OASQuizPinResult](OASQuizPinResult.md)
 - [OASRecordCounts](OASRecordCounts.md)
 - [OASRelatedTerms](OASRelatedTerms.md)
 - [OASRelatedTermsRelatedTermsListItems](OASRelatedTermsRelatedTermsListItems.md)
 - [OASReportType](OASReportType.md)
 - [OASReportingColumn](OASReportingColumn.md)
 - [OASReportingColumnAsync](OASReportingColumnAsync.md)
 - [OASReportingColumnSync](OASReportingColumnSync.md)
 - [OASReportingTimeZone](OASReportingTimeZone.md)
 - [OASReportsStats200Response](OASReportsStats200Response.md)
 - [OASRespondToInviteResultItem](OASRespondToInviteResultItem.md)
 - [OASRespondToInvitesResponseArray](OASRespondToInvitesResponseArray.md)
 - [OASRetailLocalInventoryItemAttribute](OASRetailLocalInventoryItemAttribute.md)
 - [OASRole](OASRole.md)
 - [OASS3FilePart](OASS3FilePart.md)
 - [OASS3MultipartUploadData](OASS3MultipartUploadData.md)
 - [OASSSIOAccount](OASSSIOAccount.md)
 - [OASSSIOAccountAddress](OASSSIOAccountAddress.md)
 - [OASSSIOAccountItem](OASSSIOAccountItem.md)
 - [OASSSIOAccountPMPName](OASSSIOAccountPMPName.md)
 - [OASSSIOInsertionOrder](OASSSIOInsertionOrder.md)
 - [OASSSIOInsertionOrderCreate](OASSSIOInsertionOrderCreate.md)
 - [OASSSIOInsertionOrderStatus](OASSSIOInsertionOrderStatus.md)
 - [OASSSIOInsertionOrderStatusResponse](OASSSIOInsertionOrderStatusResponse.md)
 - [OASSSIOInsertionOrderUpdate](OASSSIOInsertionOrderUpdate.md)
 - [OASSSIOOrderLine](OASSSIOOrderLine.md)
 - [OASSSIOOrderLineType](OASSSIOOrderLineType.md)
 - [OASSchedule](OASSchedule.md)
 - [OASScheduleAction](OASScheduleAction.md)
 - [OASScheduleAgeBucketMultipliers](OASScheduleAgeBucketMultipliers.md)
 - [OASScheduleAppTypeMultipliers](OASScheduleAppTypeMultipliers.md)
 - [OASScheduleAudienceMultipliers](OASScheduleAudienceMultipliers.md)
 - [OASScheduleBatchUpdate](OASScheduleBatchUpdate.md)
 - [OASScheduleBidMultipliers](OASScheduleBidMultipliers.md)
 - [OASScheduleBidOptions](OASScheduleBidOptions.md)
 - [OASScheduleBidOptionsGenderMultiplie](OASScheduleBidOptionsGenderMultiplie.md)
 - [OASScheduleBidOptionsPlacementMultip](OASScheduleBidOptionsPlacementMultip.md)
 - [OASScheduleCommonDeltaValue](OASScheduleCommonDeltaValue.md)
 - [OASScheduleCreate](OASScheduleCreate.md)
 - [OASScheduleCreateRequest](OASScheduleCreateRequest.md)
 - [OASScheduleCreateRequestAllOf1](OASScheduleCreateRequestAllOf1.md)
 - [OASScheduleDeltaValue](OASScheduleDeltaValue.md)
 - [OASScheduleGenderMultipliers](OASScheduleGenderMultipliers.md)
 - [OASSchedulePlacementMultipliers](OASSchedulePlacementMultipliers.md)
 - [OASScheduleStatus](OASScheduleStatus.md)
 - [OASScheduleType](OASScheduleType.md)
 - [OASScheduleUpdateRequest](OASScheduleUpdateRequest.md)
 - [OASScheduleUpdateRequestAllOf1](OASScheduleUpdateRequestAllOf1.md)
 - [OASSchedulesCreate200ResponseInner](OASSchedulesCreate200ResponseInner.md)
 - [OASSchedulesCreate200ResponseInnerDa](OASSchedulesCreate200ResponseInnerDa.md)
 - [OASSchedulesList200Response](OASSchedulesList200Response.md)
 - [OASScrollupGoalMetadata](OASScrollupGoalMetadata.md)
 - [OASSearchPartnerPins200Response](OASSearchPartnerPins200Response.md)
 - [OASSharedAudienceAccount](OASSharedAudienceAccount.md)
 - [OASSharedAudiencesForBusinessList200](OASSharedAudiencesForBusinessList200.md)
 - [OASSingleInterestTargetingOption](OASSingleInterestTargetingOption.md)
 - [OASSourcePlatformOptions](OASSourcePlatformOptions.md)
 - [OASSsioInsertionOrdersStatusGetByAdA](OASSsioInsertionOrdersStatusGetByAdA.md)
 - [OASSsioOrderLinesGetByAdAccount200Re](OASSsioOrderLinesGetByAdAccount200Re.md)
 - [OASStandardPinMetricTypes](OASStandardPinMetricTypes.md)
 - [OASStoreMetadata](OASStoreMetadata.md)
 - [OASSummaryPin](OASSummaryPin.md)
 - [OASSummaryStatus](OASSummaryStatus.md)
 - [OASSupplementalItemBatchOperationSta](OASSupplementalItemBatchOperationSta.md)
 - [OASSupplementalItemProcessingStatus](OASSupplementalItemProcessingStatus.md)
 - [OASSupplementalItemValidationEvent](OASSupplementalItemValidationEvent.md)
 - [OASSupplementalItemsBatchResponse](OASSupplementalItemsBatchResponse.md)
 - [OASSupplementalOperationResult](OASSupplementalOperationResult.md)
 - [OASSystemUserUpdateWithRequiredBody](OASSystemUserUpdateWithRequiredBody.md)
 - [OASTargetingAdvertiserCountry](OASTargetingAdvertiserCountry.md)
 - [OASTargetingSpec](OASTargetingSpec.md)
 - [OASTargetingSpecAgeBucket](OASTargetingSpecAgeBucket.md)
 - [OASTargetingSpecAppType](OASTargetingSpecAppType.md)
 - [OASTargetingSpecGender](OASTargetingSpecGender.md)
 - [OASTargetingSpecListOperation](OASTargetingSpecListOperation.md)
 - [OASTargetingSpecOperationAgeBucket](OASTargetingSpecOperationAgeBucket.md)
 - [OASTargetingSpecOperationAppType](OASTargetingSpecOperationAppType.md)
 - [OASTargetingSpecOperationAudienceExc](OASTargetingSpecOperationAudienceExc.md)
 - [OASTargetingSpecOperationAudienceInc](OASTargetingSpecOperationAudienceInc.md)
 - [OASTargetingSpecOperationGender](OASTargetingSpecOperationGender.md)
 - [OASTargetingSpecOperationGeo](OASTargetingSpecOperationGeo.md)
 - [OASTargetingSpecOperationGeoExclude](OASTargetingSpecOperationGeoExclude.md)
 - [OASTargetingSpecOperationInterest](OASTargetingSpecOperationInterest.md)
 - [OASTargetingSpecOperationLocale](OASTargetingSpecOperationLocale.md)
 - [OASTargetingSpecOperationLocation](OASTargetingSpecOperationLocation.md)
 - [OASTargetingSpecOperationLocationExc](OASTargetingSpecOperationLocationExc.md)
 - [OASTargetingSpecOperationMaximumAge](OASTargetingSpecOperationMaximumAge.md)
 - [OASTargetingSpecOperationMinimumAge](OASTargetingSpecOperationMinimumAge.md)
 - [OASTargetingSpecOperationShoppingRet](OASTargetingSpecOperationShoppingRet.md)
 - [OASTargetingSpecOperations](OASTargetingSpecOperations.md)
 - [OASTargetingSpecOptimal](OASTargetingSpecOptimal.md)
 - [OASTargetingSpecShoppingRetargeting](OASTargetingSpecShoppingRetargeting.md)
 - [OASTargetingSpecTargetingStrategyIte](OASTargetingSpecTargetingStrategyIte.md)
 - [OASTargetingStrategy](OASTargetingStrategy.md)
 - [OASTargetingTemplate](OASTargetingTemplate.md)
 - [OASTargetingTemplateAudienceSizing](OASTargetingTemplateAudienceSizing.md)
 - [OASTargetingTemplateAudienceSizingRe](OASTargetingTemplateAudienceSizingRe.md)
 - [OASTargetingTemplateCreate](OASTargetingTemplateCreate.md)
 - [OASTargetingTemplateKeyword](OASTargetingTemplateKeyword.md)
 - [OASTargetingTemplateList200Response](OASTargetingTemplateList200Response.md)
 - [OASTargetingTemplateStatus](OASTargetingTemplateStatus.md)
 - [OASTargetingTemplateUpdateRequestRea](OASTargetingTemplateUpdateRequestRea.md)
 - [OASTemplateBasedReport](OASTemplateBasedReport.md)
 - [OASTemplateBasedReportCreate](OASTemplateBasedReportCreate.md)
 - [OASTemplatesList200Response](OASTemplatesList200Response.md)
 - [OASTermsOfService](OASTermsOfService.md)
 - [OASTieBreakerType](OASTieBreakerType.md)
 - [OASTimeSeries](OASTimeSeries.md)
 - [OASTitleKeywordsFilter](OASTitleKeywordsFilter.md)
 - [OASTokenGrantType](OASTokenGrantType.md)
 - [OASTokenTypeHint](OASTokenTypeHint.md)
 - [OASTopPinsAnalyticsResponse](OASTopPinsAnalyticsResponse.md)
 - [OASTopPinsAnalyticsResponseDateAvail](OASTopPinsAnalyticsResponseDateAvail.md)
 - [OASTopPinsAnalyticsResponsePinsItems](OASTopPinsAnalyticsResponsePinsItems.md)
 - [OASTopPinsSortBy](OASTopPinsSortBy.md)
 - [OASTopVideoPinsAnalyticsResponse](OASTopVideoPinsAnalyticsResponse.md)
 - [OASTopVideoPinsAnalyticsResponseDate](OASTopVideoPinsAnalyticsResponseDate.md)
 - [OASTopVideoPinsAnalyticsResponsePins](OASTopVideoPinsAnalyticsResponsePins.md)
 - [OASTopVideoPinsSortBy](OASTopVideoPinsSortBy.md)
 - [OASTotalCountByEntityStatus](OASTotalCountByEntityStatus.md)
 - [OASTrackingUrls](OASTrackingUrls.md)
 - [OASTrendType](OASTrendType.md)
 - [OASTrendingKeyword](OASTrendingKeyword.md)
 - [OASTrendingKeywordDemographics](OASTrendingKeywordDemographics.md)
 - [OASTrendingKeywordsResponse](OASTrendingKeywordsResponse.md)
 - [OASTrendingPin](OASTrendingPin.md)
 - [OASTrendingProductCategory](OASTrendingProductCategory.md)
 - [OASTrendingTopic](OASTrendingTopic.md)
 - [OASTrendsAgeBucket](OASTrendsAgeBucket.md)
 - [OASTrendsAgeDistribution](OASTrendsAgeDistribution.md)
 - [OASTrendsEditorial](OASTrendsEditorial.md)
 - [OASTrendsGender](OASTrendsGender.md)
 - [OASTrendsGenderDistribution](OASTrendsGenderDistribution.md)
 - [OASTrendsGenderFilter](OASTrendsGenderFilter.md)
 - [OASTrendsL1Interest](OASTrendsL1Interest.md)
 - [OASTrendsSupportedRegion](OASTrendsSupportedRegion.md)
 - [OASUpdatableItemAttributes](OASUpdatableItemAttributes.md)
 - [OASUpdatableItemAttributesGtin](OASUpdatableItemAttributesGtin.md)
 - [OASUpdateBusinessMembershipsResponse](OASUpdateBusinessMembershipsResponse.md)
 - [OASUpdateInvitesResultsResponseArray](OASUpdateInvitesResultsResponseArray.md)
 - [OASUpdateMaskBidOptionField](OASUpdateMaskBidOptionField.md)
 - [OASUpdateMaskFieldType](OASUpdateMaskFieldType.md)
 - [OASUpdateMemberAssetAccessBody](OASUpdateMemberAssetAccessBody.md)
 - [OASUpdateMemberAssetAccessItem](OASUpdateMemberAssetAccessItem.md)
 - [OASUpdateMemberAssetResultItem](OASUpdateMemberAssetResultItem.md)
 - [OASUpdateMemberAssetsResultsResponse](OASUpdateMemberAssetsResultsResponse.md)
 - [OASUpdatePartnerAssetAccessBody](OASUpdatePartnerAssetAccessBody.md)
 - [OASUpdatePartnerAssetAccessItem](OASUpdatePartnerAssetAccessItem.md)
 - [OASUpdatePartnerAssetsResult](OASUpdatePartnerAssetsResult.md)
 - [OASUpdatePartnerAssetsResultsRespons](OASUpdatePartnerAssetsResultsRespons.md)
 - [OASUserAccountFollowedInterests200Re](OASUserAccountFollowedInterests200Re.md)
 - [OASUserAccountType](OASUserAccountType.md)
 - [OASUserBusinessRoleBinding](OASUserBusinessRoleBinding.md)
 - [OASUserFollowingFeedType](OASUserFollowingFeedType.md)
 - [OASUserListOperationType](OASUserListOperationType.md)
 - [OASUserListType](OASUserListType.md)
 - [OASUserSingleAssetBinding](OASUserSingleAssetBinding.md)
 - [OASUserWebsite](OASUserWebsite.md)
 - [OASUserWebsiteCreate](OASUserWebsiteCreate.md)
 - [OASUserWebsiteVerification](OASUserWebsiteVerification.md)
 - [OASUserWebsitesGet200Response](OASUserWebsitesGet200Response.md)
 - [OASUsersForIndividualAssetResponse](OASUsersForIndividualAssetResponse.md)
 - [OASVerticalProductCategory](OASVerticalProductCategory.md)
 - [OASVideoMetadataWithItemType](OASVideoMetadataWithItemType.md)
 - [OASVideoPinMetricTypes](OASVideoPinMetricTypes.md)
 - [OASWebsiteVerificationMethod](OASWebsiteVerificationMethod.md)
 - [OASWorkloadState](OASWorkloadState.md)


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
  - msot:write: Create measurement source of truth events
  - pins:read: See your public Pins
  - pins:read_secret: See your secret Pins
  - pins:write: Create, update, or delete your public Pins
  - pins:write_secret: Create, update, or delete your secret Pins
  - user_accounts:read: See your user accounts and followers
  - user_accounts:write: Update your user accounts and followers

### client_credentials

- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
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
  - msot:write: Create measurement source of truth events
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

