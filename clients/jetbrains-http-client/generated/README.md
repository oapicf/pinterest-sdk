# Pinterest REST API - Jetbrains API Client

## General API description

Pinterest&#39;s REST API

* API basepath : [https://api.pinterest.com/v5](https://api.pinterest.com/v5)
* Version : 5.28.0

## Documentation for API Endpoints

All URIs are relative to *https://api.pinterest.com/v5*, but will link to the `.http` file that contains the endpoint definition.
There may be multiple requests for a single endpoint, one for each example described in the OpenAPI specification.

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AdAccountsApi* | [**adAccount/analytics**](Apis/AdAccountsApi.http#adaccount/analytics) | **GET** /ad_accounts/{ad_account_id}/analytics | Get ad account analytics
*AdAccountsApi* | [**adAccountTargetingAnalytics/get**](Apis/AdAccountsApi.http#adaccounttargetinganalytics/get) | **GET** /ad_accounts/{ad_account_id}/targeting_analytics | Get targeting analytics for an ad account
*AdAccountsApi* | [**adAccounts/create**](Apis/AdAccountsApi.http#adaccounts/create) | **POST** /ad_accounts | Create ad account
*AdAccountsApi* | [**adAccounts/get**](Apis/AdAccountsApi.http#adaccounts/get) | **GET** /ad_accounts/{ad_account_id} | Get ad account
*AdAccountsApi* | [**adAccounts/list**](Apis/AdAccountsApi.http#adaccounts/list) | **GET** /ad_accounts | List ad accounts
*AdAccountsApi* | [**analytics/createConversionProductReport**](Apis/AdAccountsApi.http#analytics/createconversionproductreport) | **POST** /ad_accounts/{ad_account_id}/reports/brand_category_sku | Create a request for a brand, category, SKU report
*AdAccountsApi* | [**analytics/createMmmReport**](Apis/AdAccountsApi.http#analytics/createmmmreport) | **POST** /ad_accounts/{ad_account_id}/mmm_reports | Create a request for a Marketing Mix Modeling (MMM) report
*AdAccountsApi* | [**analytics/createReport**](Apis/AdAccountsApi.http#analytics/createreport) | **POST** /ad_accounts/{ad_account_id}/reports | Create async request for an account analytics report
*AdAccountsApi* | [**analytics/createTemplateReport**](Apis/AdAccountsApi.http#analytics/createtemplatereport) | **POST** /ad_accounts/{ad_account_id}/templates/{template_id}/reports | Create async request for an analytics report using a template
*AdAccountsApi* | [**analytics/getConversionProductReport**](Apis/AdAccountsApi.http#analytics/getconversionproductreport) | **GET** /ad_accounts/{ad_account_id}/reports/brand_category_sku | Get advertiser brand, category, SKU report
*AdAccountsApi* | [**analytics/getMmmReport**](Apis/AdAccountsApi.http#analytics/getmmmreport) | **GET** /ad_accounts/{ad_account_id}/mmm_reports | Get advertiser Marketing Mix Modeling (MMM) report.
*AdAccountsApi* | [**analytics/getReport**](Apis/AdAccountsApi.http#analytics/getreport) | **GET** /ad_accounts/{ad_account_id}/reports | Get the account analytics report created by the async call
*AdAccountsApi* | [**sandbox/delete**](Apis/AdAccountsApi.http#sandbox/delete) | **DELETE** /ad_accounts/{ad_account_id}/sandbox | Delete ads data for ad account in API Sandbox
*AdAccountsApi* | [**templates/list**](Apis/AdAccountsApi.http#templates/list) | **GET** /ad_accounts/{ad_account_id}/templates | List templates
*AdGroupsApi* | [**adGroups/analytics**](Apis/AdGroupsApi.http#adgroups/analytics) | **GET** /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics
*AdGroupsApi* | [**adGroups/audienceSizing**](Apis/AdGroupsApi.http#adgroups/audiencesizing) | **POST** /ad_accounts/{ad_account_id}/ad_groups/audience_sizing | Get audience sizing
*AdGroupsApi* | [**adGroups/create**](Apis/AdGroupsApi.http#adgroups/create) | **POST** /ad_accounts/{ad_account_id}/ad_groups | Create ad groups
*AdGroupsApi* | [**adGroups/get**](Apis/AdGroupsApi.http#adgroups/get) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id} | Get ad group
*AdGroupsApi* | [**adGroups/list**](Apis/AdGroupsApi.http#adgroups/list) | **GET** /ad_accounts/{ad_account_id}/ad_groups | List ad groups
*AdGroupsApi* | [**adGroups/update**](Apis/AdGroupsApi.http#adgroups/update) | **PATCH** /ad_accounts/{ad_account_id}/ad_groups | Update ad groups
*AdGroupsApi* | [**adGroupsBidFloor/get**](Apis/AdGroupsApi.http#adgroupsbidfloor/get) | **POST** /ad_accounts/{ad_account_id}/bid_floor | Get bid floors
*AdGroupsApi* | [**adGroupsDynamicTitles/downloadCsv**](Apis/AdGroupsApi.http#adgroupsdynamictitles/downloadcsv) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/csv | Get dynamic titles CSV download URL
*AdGroupsApi* | [**adGroupsDynamicTitles/getStatus**](Apis/AdGroupsApi.http#adgroupsdynamictitles/getstatus) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/status | Get dynamic titles status
*AdGroupsApi* | [**adGroupsDynamicTitles/getUploadUrl**](Apis/AdGroupsApi.http#adgroupsdynamictitles/getuploadurl) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/uploads | Get dynamic titles upload URL
*AdGroupsApi* | [**adGroupsDynamicTitles/processCsv**](Apis/AdGroupsApi.http#adgroupsdynamictitles/processcsv) | **POST** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles | Process dynamic titles CSV
*AdGroupsApi* | [**adGroupsTargetingAnalytics/get**](Apis/AdGroupsApi.http#adgroupstargetinganalytics/get) | **GET** /ad_accounts/{ad_account_id}/ad_groups/targeting_analytics | Get targeting analytics for ad groups
*AdGroupsApi* | [**getAdGroupsByPromotionIds/list**](Apis/AdGroupsApi.http#getadgroupsbypromotionids/list) | **GET** /ad_accounts/{ad_account_id}/promotion_applied_entities | List of ad groups using promotions IDs.
*AdsApi* | [**adPreviews/create**](Apis/AdsApi.http#adpreviews/create) | **POST** /ad_accounts/{ad_account_id}/ad_previews | Create ad preview with pin or image
*AdsApi* | [**adTargetingAnalytics/get**](Apis/AdsApi.http#adtargetinganalytics/get) | **GET** /ad_accounts/{ad_account_id}/ads/targeting_analytics | Get targeting analytics for ads
*AdsApi* | [**ads/analytics**](Apis/AdsApi.http#ads/analytics) | **GET** /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics
*AdsApi* | [**ads/create**](Apis/AdsApi.http#ads/create) | **POST** /ad_accounts/{ad_account_id}/ads | Create ads
*AdsApi* | [**ads/get**](Apis/AdsApi.http#ads/get) | **GET** /ad_accounts/{ad_account_id}/ads/{ad_id} | Get ad
*AdsApi* | [**ads/list**](Apis/AdsApi.http#ads/list) | **GET** /ad_accounts/{ad_account_id}/ads | List ads
*AdsApi* | [**ads/update**](Apis/AdsApi.http#ads/update) | **PATCH** /ad_accounts/{ad_account_id}/ads | Update ads
*AdsApi* | [**campaignAdPreview/create**](Apis/AdsApi.http#campaignadpreview/create) | **POST** /ad_accounts/{ad_account_id}/campaign_ad_preview | Create ad preview records for one or more ad groups
*AdsApi* | [**campaignAdPreview/delete**](Apis/AdsApi.http#campaignadpreview/delete) | **DELETE** /ad_accounts/{ad_account_id}/campaign_ad_preview | Delete ad preview records for one or more ad groups
*AdsApi* | [**campaignAdPreview/read**](Apis/AdsApi.http#campaignadpreview/read) | **GET** /ad_accounts/{ad_account_id}/campaign_ad_preview | Fetch ad preview records for one or more ad groups
*AdvancedAuctionApi* | [**advancedAuctionItemsGet/post**](Apis/AdvancedAuctionApi.http#advancedauctionitemsget/post) | **POST** /advanced_auction/items/get | Get item bid options (POST)
*AdvancedAuctionApi* | [**advancedAuctionItemsSubmit/post**](Apis/AdvancedAuctionApi.http#advancedauctionitemssubmit/post) | **POST** /advanced_auction/items/submit | Operate on item level bid options
*AudienceInsightsApi* | [**audienceInsights/get**](Apis/AudienceInsightsApi.http#audienceinsights/get) | **GET** /ad_accounts/{ad_account_id}/audience_insights | Get audience insights
*AudienceInsightsApi* | [**audienceInsightsScopeAndType/get**](Apis/AudienceInsightsApi.http#audienceinsightsscopeandtype/get) | **GET** /ad_accounts/{ad_account_id}/insights/audiences | Get audience insights scope and type
*AudienceSharingApi* | [**adAccountsAudiencesSharedAccounts/list**](Apis/AudienceSharingApi.http#adaccountsaudiencessharedaccounts/list) | **GET** /ad_accounts/{ad_account_id}/audiences/shared/accounts | List accounts with access to an audience owned by an ad account
*AudienceSharingApi* | [**businessAccountAudiencesSharedAccounts/list**](Apis/AudienceSharingApi.http#businessaccountaudiencessharedaccounts/list) | **GET** /businesses/{business_id}/audiences/shared/accounts | List accounts with access to an audience owned by a business
*AudienceSharingApi* | [**sharedAudiencesForBusiness/list**](Apis/AudienceSharingApi.http#sharedaudiencesforbusiness/list) | **GET** /businesses/{business_id}/audiences | List received audiences for a business
*AudienceSharingApi* | [**updateAdAccountToAdAccountSharedAudience**](Apis/AudienceSharingApi.http#updateadaccounttoadaccountsharedaudience) | **PATCH** /ad_accounts/{ad_account_id}/audiences/ad_accounts/shared | Update audience sharing between ad accounts
*AudienceSharingApi* | [**updateAdAccountToBusinessSharedAudience**](Apis/AudienceSharingApi.http#updateadaccounttobusinesssharedaudience) | **PATCH** /ad_accounts/{ad_account_id}/audiences/businesses/shared | Update audience sharing from an ad account to businesses
*AudienceSharingApi* | [**updateBusinessToAdAccountSharedAudience**](Apis/AudienceSharingApi.http#updatebusinesstoadaccountsharedaudience) | **PATCH** /businesses/{business_id}/audiences/ad_accounts/shared | Update audience sharing from a business to ad accounts
*AudienceSharingApi* | [**updateBusinessToBusinessSharedAudience**](Apis/AudienceSharingApi.http#updatebusinesstobusinesssharedaudience) | **PATCH** /businesses/{business_id}/audiences/businesses/shared | Update audience sharing between businesses
*AudiencesApi* | [**audiences/create**](Apis/AudiencesApi.http#audiences/create) | **POST** /ad_accounts/{ad_account_id}/audiences | Create audience
*AudiencesApi* | [**audiences/get**](Apis/AudiencesApi.http#audiences/get) | **GET** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Get audience
*AudiencesApi* | [**audiences/list**](Apis/AudiencesApi.http#audiences/list) | **GET** /ad_accounts/{ad_account_id}/audiences | List audiences
*AudiencesApi* | [**audiences/update**](Apis/AudiencesApi.http#audiences/update) | **PATCH** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Update audience
*BillingApi* | [**adsCredit/redeem**](Apis/BillingApi.http#adscredit/redeem) | **POST** /ad_accounts/{ad_account_id}/ads_credit/redeem | Redeem ad credits
*BillingApi* | [**adsCreditsDiscounts/get**](Apis/BillingApi.http#adscreditsdiscounts/get) | **GET** /ad_accounts/{ad_account_id}/ads_credit/discounts | Get ads credit discounts
*BillingApi* | [**billingInvoiceDownload/get**](Apis/BillingApi.http#billinginvoicedownload/get) | **GET** /ad_accounts/{ad_account_id}/billing_invoice/{billing_invoice_id}/download | Get download url for a billing invoice
*BillingApi* | [**billingInvoices/get**](Apis/BillingApi.http#billinginvoices/get) | **GET** /ad_accounts/{ad_account_id}/billing_invoices | Get billing invoices
*BillingApi* | [**billingProfiles/get**](Apis/BillingApi.http#billingprofiles/get) | **GET** /ad_accounts/{ad_account_id}/billing_profiles | Get billing profiles
*BillingApi* | [**ssioAccounts/get**](Apis/BillingApi.http#ssioaccounts/get) | **GET** /ad_accounts/{ad_account_id}/ssio/accounts | Get Salesforce account details including bill-to information.
*BillingApi* | [**ssioInsertionOrder/create**](Apis/BillingApi.http#ssioinsertionorder/create) | **POST** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Create insertion order through SSIO.
*BillingApi* | [**ssioInsertionOrder/edit**](Apis/BillingApi.http#ssioinsertionorder/edit) | **PATCH** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Edit insertion order through SSIO.
*BillingApi* | [**ssioInsertionOrdersStatus/getByAdAccount**](Apis/BillingApi.http#ssioinsertionordersstatus/getbyadaccount) | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/status | Get insertion order status by ad account id.
*BillingApi* | [**ssioInsertionOrdersStatus/getByPinOrderId**](Apis/BillingApi.http#ssioinsertionordersstatus/getbypinorderid) | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status | Get insertion order status by pin order id.
*BillingApi* | [**ssioOrderLines/getByAdAccount**](Apis/BillingApi.http#ssioorderlines/getbyadaccount) | **GET** /ad_accounts/{ad_account_id}/ssio/order_lines | Get Salesforce order lines by ad account id.
*BoardsApi* | [**boardSections/create**](Apis/BoardsApi.http#boardsections/create) | **POST** /boards/{board_id}/sections | Create board section
*BoardsApi* | [**boardSections/delete**](Apis/BoardsApi.http#boardsections/delete) | **DELETE** /boards/{board_id}/sections/{section_id} | Delete board section
*BoardsApi* | [**boardSections/list**](Apis/BoardsApi.http#boardsections/list) | **GET** /boards/{board_id}/sections | List board sections
*BoardsApi* | [**boardSections/listPins**](Apis/BoardsApi.http#boardsections/listpins) | **GET** /boards/{board_id}/sections/{section_id}/pins | List Pins on board section
*BoardsApi* | [**boardSections/update**](Apis/BoardsApi.http#boardsections/update) | **PATCH** /boards/{board_id}/sections/{section_id} | Update board section
*BoardsApi* | [**boards/create**](Apis/BoardsApi.http#boards/create) | **POST** /boards | Create board
*BoardsApi* | [**boards/delete**](Apis/BoardsApi.http#boards/delete) | **DELETE** /boards/{board_id} | Delete board
*BoardsApi* | [**boards/get**](Apis/BoardsApi.http#boards/get) | **GET** /boards/{board_id} | Get board
*BoardsApi* | [**boards/list**](Apis/BoardsApi.http#boards/list) | **GET** /boards | List boards
*BoardsApi* | [**boards/listPins**](Apis/BoardsApi.http#boards/listpins) | **GET** /boards/{board_id}/pins | List Pins on board
*BoardsApi* | [**boards/update**](Apis/BoardsApi.http#boards/update) | **PATCH** /boards/{board_id} | Update board
*BulkApi* | [**bulkDownload/create**](Apis/BulkApi.http#bulkdownload/create) | **POST** /ad_accounts/{ad_account_id}/bulk/download | Get advertiser entities in bulk
*BulkApi* | [**bulkRequest/get**](Apis/BulkApi.http#bulkrequest/get) | **GET** /ad_accounts/{ad_account_id}/bulk/{bulk_request_id} | Download advertiser entities in bulk
*BulkApi* | [**bulkUpsert/create**](Apis/BulkApi.http#bulkupsert/create) | **POST** /ad_accounts/{ad_account_id}/bulk/upsert | Create/update ad entities in bulk
*BusinessAccessAssetsApi* | [**assetGroup/create**](Apis/BusinessAccessAssetsApi.http#assetgroup/create) | **POST** /businesses/{business_id}/asset_groups | Create a new asset group.
*BusinessAccessAssetsApi* | [**assetGroup/delete**](Apis/BusinessAccessAssetsApi.http#assetgroup/delete) | **DELETE** /businesses/{business_id}/asset_groups | Delete asset groups.
*BusinessAccessAssetsApi* | [**assetGroup/update**](Apis/BusinessAccessAssetsApi.http#assetgroup/update) | **PATCH** /businesses/{business_id}/asset_groups | Update asset groups.
*BusinessAccessAssetsApi* | [**businessAssetMembers/get**](Apis/BusinessAccessAssetsApi.http#businessassetmembers/get) | **GET** /businesses/{business_id}/assets/{asset_id}/members | Get members with access to asset
*BusinessAccessAssetsApi* | [**businessAssetPartners/get**](Apis/BusinessAccessAssetsApi.http#businessassetpartners/get) | **GET** /businesses/{business_id}/assets/{asset_id}/partners | Get partners with access to asset
*BusinessAccessAssetsApi* | [**businessAssets/get**](Apis/BusinessAccessAssetsApi.http#businessassets/get) | **GET** /businesses/{business_id}/assets | List business assets
*BusinessAccessAssetsApi* | [**businessMemberAssets/get**](Apis/BusinessAccessAssetsApi.http#businessmemberassets/get) | **GET** /businesses/{business_id}/members/{member_id}/assets | Get assets assigned to a member
*BusinessAccessAssetsApi* | [**businessMembersAssetAccess/delete**](Apis/BusinessAccessAssetsApi.http#businessmembersassetaccess/delete) | **DELETE** /businesses/{business_id}/members/assets/access | Delete member access to asset
*BusinessAccessAssetsApi* | [**businessMembersAssetAccess/update**](Apis/BusinessAccessAssetsApi.http#businessmembersassetaccess/update) | **PATCH** /businesses/{business_id}/members/assets/access | Assign/Update member asset permissions
*BusinessAccessAssetsApi* | [**businessPartnerAssetAccess/get**](Apis/BusinessAccessAssetsApi.http#businesspartnerassetaccess/get) | **GET** /businesses/{business_id}/partners/{partner_id}/assets | Get assets assigned to a partner or assets assigned by a partner
*BusinessAccessAssetsApi* | [**deletePartnerAssetAccessHandlerImpl**](Apis/BusinessAccessAssetsApi.http#deletepartnerassetaccesshandlerimpl) | **DELETE** /businesses/{business_id}/partners/assets | Delete partner access to asset
*BusinessAccessAssetsApi* | [**updatePartnerAssetAccessHandlerImpl**](Apis/BusinessAccessAssetsApi.http#updatepartnerassetaccesshandlerimpl) | **PATCH** /businesses/{business_id}/partners/assets | Assign/Update partner asset permissions
*BusinessAccessInviteApi* | [**assetAccessRequests/create**](Apis/BusinessAccessInviteApi.http#assetaccessrequests/create) | **POST** /businesses/{business_id}/requests/assets/access | Create a request to access an existing partner's assets.
*BusinessAccessInviteApi* | [**cancelInvitesOrRequests**](Apis/BusinessAccessInviteApi.http#cancelinvitesorrequests) | **DELETE** /businesses/{business_id}/invites | Cancel invites/requests
*BusinessAccessInviteApi* | [**createAssetInvites**](Apis/BusinessAccessInviteApi.http#createassetinvites) | **POST** /businesses/{business_id}/invites/assets/access | Update invite/request with an asset permission
*BusinessAccessInviteApi* | [**createMembershipOrPartnershipInvites**](Apis/BusinessAccessInviteApi.http#createmembershiporpartnershipinvites) | **POST** /businesses/{business_id}/invites | Create invites or requests
*BusinessAccessInviteApi* | [**get/invites**](Apis/BusinessAccessInviteApi.http#get/invites) | **GET** /businesses/{business_id}/invites | Get invites/requests
*BusinessAccessInviteApi* | [**respondBusinessAccessInvites**](Apis/BusinessAccessInviteApi.http#respondbusinessaccessinvites) | **PATCH** /businesses/invites | Accept or decline an invite/request
*BusinessAccessRelationshipsApi* | [**brandAccounts/create**](Apis/BusinessAccessRelationshipsApi.http#brandaccounts/create) | **POST** /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts | Create a Brand Account
*BusinessAccessRelationshipsApi* | [**brandAccounts/update**](Apis/BusinessAccessRelationshipsApi.http#brandaccounts/update) | **PATCH** /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id} | Update a Brand Account
*BusinessAccessRelationshipsApi* | [**deleteBusinessMembership**](Apis/BusinessAccessRelationshipsApi.http#deletebusinessmembership) | **DELETE** /businesses/{business_id}/members | Terminate business memberships
*BusinessAccessRelationshipsApi* | [**deleteBusinessPartners**](Apis/BusinessAccessRelationshipsApi.http#deletebusinesspartners) | **DELETE** /businesses/{business_id}/partners | Terminate business partnerships
*BusinessAccessRelationshipsApi* | [**get/businessEmployers**](Apis/BusinessAccessRelationshipsApi.http#get/businessemployers) | **GET** /businesses/employers | List business employers for user
*BusinessAccessRelationshipsApi* | [**get/businessMembers**](Apis/BusinessAccessRelationshipsApi.http#get/businessmembers) | **GET** /businesses/{business_id}/members | Get business members
*BusinessAccessRelationshipsApi* | [**get/businessPartners**](Apis/BusinessAccessRelationshipsApi.http#get/businesspartners) | **GET** /businesses/{business_id}/partners | Get business partners
*BusinessAccessRelationshipsApi* | [**systemUser/update**](Apis/BusinessAccessRelationshipsApi.http#systemuser/update) | **PATCH** /businesses/{business_id}/system_users/{system_user_id} | Update a system user information.
*BusinessAccessRelationshipsApi* | [**update/businessMemberships**](Apis/BusinessAccessRelationshipsApi.http#update/businessmemberships) | **PATCH** /businesses/{business_id}/members | Update member's business role
*CampaignsApi* | [**adPins/analytics**](Apis/CampaignsApi.http#adpins/analytics) | **GET** /ad_accounts/{ad_account_id}/pins/analytics | Get pins analytics
*CampaignsApi* | [**campaignTargetingAnalytics/get**](Apis/CampaignsApi.http#campaigntargetinganalytics/get) | **GET** /ad_accounts/{ad_account_id}/campaigns/targeting_analytics | Get targeting analytics for campaigns
*CampaignsApi* | [**campaigns/analytics**](Apis/CampaignsApi.http#campaigns/analytics) | **GET** /ad_accounts/{ad_account_id}/campaigns/analytics | Get campaign analytics
*CampaignsApi* | [**campaigns/create**](Apis/CampaignsApi.http#campaigns/create) | **POST** /ad_accounts/{ad_account_id}/campaigns | Create campaigns
*CampaignsApi* | [**campaigns/get**](Apis/CampaignsApi.http#campaigns/get) | **GET** /ad_accounts/{ad_account_id}/campaigns/{campaign_id} | Get campaign
*CampaignsApi* | [**campaigns/list**](Apis/CampaignsApi.http#campaigns/list) | **GET** /ad_accounts/{ad_account_id}/campaigns | List campaigns
*CampaignsApi* | [**campaigns/update**](Apis/CampaignsApi.http#campaigns/update) | **PATCH** /ad_accounts/{ad_account_id}/campaigns | Update campaigns
*CampaignsApi* | [**getCampaignDeliveryEstimates**](Apis/CampaignsApi.http#getcampaigndeliveryestimates) | **POST** /ad_accounts/{ad_account_id}/campaigns/delivery_estimates | Get campaign delivery estimates
*CatalogFeedsApi* | [**feedProcessingResults/list**](Apis/CatalogFeedsApi.http#feedprocessingresults/list) | **GET** /catalogs/feeds/{feed_id}/processing_results | List feed processing results
*CatalogFeedsApi* | [**feeds/create**](Apis/CatalogFeedsApi.http#feeds/create) | **POST** /catalogs/feeds | Create feed
*CatalogFeedsApi* | [**feeds/delete**](Apis/CatalogFeedsApi.http#feeds/delete) | **DELETE** /catalogs/feeds/{feed_id} | Delete feed
*CatalogFeedsApi* | [**feeds/get**](Apis/CatalogFeedsApi.http#feeds/get) | **GET** /catalogs/feeds/{feed_id} | Get feed
*CatalogFeedsApi* | [**feeds/ingest**](Apis/CatalogFeedsApi.http#feeds/ingest) | **POST** /catalogs/feeds/{feed_id}/ingest | Ingest feed items
*CatalogFeedsApi* | [**feeds/list**](Apis/CatalogFeedsApi.http#feeds/list) | **GET** /catalogs/feeds | List feeds
*CatalogFeedsApi* | [**feeds/update**](Apis/CatalogFeedsApi.http#feeds/update) | **PATCH** /catalogs/feeds/{feed_id} | Update feed
*CatalogFeedsApi* | [**itemsIssues/list**](Apis/CatalogFeedsApi.http#itemsissues/list) | **GET** /catalogs/processing_results/{processing_result_id}/item_issues | List item issues
*CatalogItemsApi* | [**items/post**](Apis/CatalogItemsApi.http#items/post) | **POST** /catalogs/items | Get catalogs items (POST)
*CatalogItemsApi* | [**itemsBatch/get**](Apis/CatalogItemsApi.http#itemsbatch/get) | **GET** /catalogs/items/batch/{batch_id} | Get item batch status
*CatalogItemsApi* | [**itemsBatch/post**](Apis/CatalogItemsApi.http#itemsbatch/post) | **POST** /catalogs/items/batch | Operate on item batch
*CatalogProductGroupsApi* | [**catalogsProductGroupPins/list**](Apis/CatalogProductGroupsApi.http#catalogsproductgrouppins/list) | **GET** /catalogs/product_groups/{product_group_id}/products | List products by product group
*CatalogProductGroupsApi* | [**catalogsProductGroups/create**](Apis/CatalogProductGroupsApi.http#catalogsproductgroups/create) | **POST** /catalogs/product_groups | Create product group
*CatalogProductGroupsApi* | [**catalogsProductGroups/createMany**](Apis/CatalogProductGroupsApi.http#catalogsproductgroups/createmany) | **POST** /catalogs/product_groups/multiple | Create product groups
*CatalogProductGroupsApi* | [**catalogsProductGroups/delete**](Apis/CatalogProductGroupsApi.http#catalogsproductgroups/delete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group
*CatalogProductGroupsApi* | [**catalogsProductGroups/deleteMany**](Apis/CatalogProductGroupsApi.http#catalogsproductgroups/deletemany) | **DELETE** /catalogs/product_groups/multiple | Delete product groups
*CatalogProductGroupsApi* | [**catalogsProductGroups/get**](Apis/CatalogProductGroupsApi.http#catalogsproductgroups/get) | **GET** /catalogs/product_groups/{product_group_id} | Get product group
*CatalogProductGroupsApi* | [**catalogsProductGroups/list**](Apis/CatalogProductGroupsApi.http#catalogsproductgroups/list) | **GET** /catalogs/product_groups | List product groups
*CatalogProductGroupsApi* | [**catalogsProductGroups/productCountsGet**](Apis/CatalogProductGroupsApi.http#catalogsproductgroups/productcountsget) | **GET** /catalogs/product_groups/{product_group_id}/product_counts | Get product counts
*CatalogProductGroupsApi* | [**catalogsProductGroups/update**](Apis/CatalogProductGroupsApi.http#catalogsproductgroups/update) | **PATCH** /catalogs/product_groups/{product_group_id} | Update single product group
*CatalogProductGroupsApi* | [**productsByProductGroupFilter/list**](Apis/CatalogProductGroupsApi.http#productsbyproductgroupfilter/list) | **POST** /catalogs/products/get_by_product_group_filters | List products by filter
*CatalogReportsApi* | [**reports/create**](Apis/CatalogReportsApi.http#reports/create) | **POST** /catalogs/reports | Build catalogs report
*CatalogReportsApi* | [**reports/get**](Apis/CatalogReportsApi.http#reports/get) | **GET** /catalogs/reports | Get catalogs report
*CatalogReportsApi* | [**reports/stats**](Apis/CatalogReportsApi.http#reports/stats) | **GET** /catalogs/reports/stats | List report stats
*CatalogSupplementalApi* | [**catalogsLocalInventoryItems/post**](Apis/CatalogSupplementalApi.http#catalogslocalinventoryitems/post) | **POST** /catalogs/{catalog_id}/local_inventory_items/query | Get local inventory items (POST)
*CatalogSupplementalApi* | [**catalogsLocalInventoryItemsBatch/operate**](Apis/CatalogSupplementalApi.http#catalogslocalinventoryitemsbatch/operate) | **POST** /catalogs/{catalog_id}/local_inventory_items/batch | Operate on local inventory item batch
*CatalogSupplementalApi* | [**catalogsLocalStores/create**](Apis/CatalogSupplementalApi.http#catalogslocalstores/create) | **POST** /catalogs/{catalog_id}/local_stores | Create local stores
*CatalogSupplementalApi* | [**catalogsLocalStores/delete**](Apis/CatalogSupplementalApi.http#catalogslocalstores/delete) | **DELETE** /catalogs/{catalog_id}/local_stores | Delete local stores
*CatalogSupplementalApi* | [**catalogsLocalStores/list**](Apis/CatalogSupplementalApi.http#catalogslocalstores/list) | **GET** /catalogs/{catalog_id}/local_stores | List local stores
*CatalogSupplementalApi* | [**catalogsLocalStores/update**](Apis/CatalogSupplementalApi.http#catalogslocalstores/update) | **PATCH** /catalogs/{catalog_id}/local_stores | Update local stores
*CatalogSupplementalApi* | [**catalogsSupplementalItemsBatch/get**](Apis/CatalogSupplementalApi.http#catalogssupplementalitemsbatch/get) | **GET** /catalogs/{catalog_id}/supplemental_items/batch/{batch_id} | Get supplemental items batch status
*CatalogsApi* | [**catalogs/availableFilterValues**](Apis/CatalogsApi.http#catalogs/availablefiltervalues) | **GET** /catalogs/available_filter_values | List available filter values
*CatalogsApi* | [**catalogs/create**](Apis/CatalogsApi.http#catalogs/create) | **POST** /catalogs | Create catalog
*CatalogsApi* | [**catalogs/list**](Apis/CatalogsApi.http#catalogs/list) | **GET** /catalogs | List catalogs
*ConversionDeletionRequestsApi* | [**conversionDeletionRequest/create**](Apis/ConversionDeletionRequestsApi.http#conversiondeletionrequest/create) | **POST** /ad_accounts/{ad_account_id}/conversion_deletion_requests | Create a conversion deletion request
*ConversionDeletionRequestsApi* | [**conversionDeletionRequest/delete**](Apis/ConversionDeletionRequestsApi.http#conversiondeletionrequest/delete) | **DELETE** /ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id} | Delete a conversion deletion request
*ConversionDeletionRequestsApi* | [**conversionDeletionRequest/get**](Apis/ConversionDeletionRequestsApi.http#conversiondeletionrequest/get) | **GET** /ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id} | Get a single conversion deletion request
*ConversionDeletionRequestsApi* | [**conversionDeletionRequest/list**](Apis/ConversionDeletionRequestsApi.http#conversiondeletionrequest/list) | **GET** /ad_accounts/{ad_account_id}/conversion_deletion_requests | List conversion deletion requests
*ConversionEqsApi* | [**conversionEqs/list**](Apis/ConversionEqsApi.http#conversioneqs/list) | **GET** /ad_accounts/{ad_account_id}/conversion_eqs | Get event quality score (EQS)
*ConversionEventsApi* | [**events/create**](Apis/ConversionEventsApi.http#events/create) | **POST** /ad_accounts/{ad_account_id}/events | Send conversions
*ConversionTagsApi* | [**conversionTags/create**](Apis/ConversionTagsApi.http#conversiontags/create) | **POST** /ad_accounts/{ad_account_id}/conversion_tags | Create conversion tag
*ConversionTagsApi* | [**conversionTags/get**](Apis/ConversionTagsApi.http#conversiontags/get) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id} | Get conversion tag
*ConversionTagsApi* | [**conversionTags/list**](Apis/ConversionTagsApi.http#conversiontags/list) | **GET** /ad_accounts/{ad_account_id}/conversion_tags | List conversion tags
*ConversionTagsApi* | [**ocpmEligibleConversionTags/get**](Apis/ConversionTagsApi.http#ocpmeligibleconversiontags/get) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible | Get Ocpm eligible conversion tags
*ConversionTagsApi* | [**pageVisitConversionTags/get**](Apis/ConversionTagsApi.http#pagevisitconversiontags/get) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/page_visit | Get page visit conversion tags
*ConversionsApi* | [**advertiserDefinedEvents/create**](Apis/ConversionsApi.http#advertiserdefinedevents/create) | **POST** /ad_accounts/{ad_account_id}/advertiser_defined_events | Create advertiser defined events
*ConversionsApi* | [**advertiserDefinedEvents/delete**](Apis/ConversionsApi.http#advertiserdefinedevents/delete) | **DELETE** /ad_accounts/{ad_account_id}/advertiser_defined_events | Delete advertiser defined events
*ConversionsApi* | [**advertiserDefinedEvents/get**](Apis/ConversionsApi.http#advertiserdefinedevents/get) | **GET** /ad_accounts/{ad_account_id}/advertiser_defined_events | Get advertiser defined events
*ConversionsApi* | [**advertiserDefinedEvents/update**](Apis/ConversionsApi.http#advertiserdefinedevents/update) | **PATCH** /ad_accounts/{ad_account_id}/advertiser_defined_events | Update advertiser defined events
*CustomerListUploadsApi* | [**customerListUploads/create**](Apis/CustomerListUploadsApi.http#customerlistuploads/create) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads | Create customer list upload
*CustomerListUploadsApi* | [**customerListUploads/get**](Apis/CustomerListUploadsApi.http#customerlistuploads/get) | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id} | Get customer list upload
*CustomerListUploadsApi* | [**customerListUploads/run**](Apis/CustomerListUploadsApi.http#customerlistuploads/run) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run | Run customer list upload
*CustomerListsApi* | [**customerLists/create**](Apis/CustomerListsApi.http#customerlists/create) | **POST** /ad_accounts/{ad_account_id}/customer_lists | Create customer lists
*CustomerListsApi* | [**customerLists/get**](Apis/CustomerListsApi.http#customerlists/get) | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Get customer list
*CustomerListsApi* | [**customerLists/list**](Apis/CustomerListsApi.http#customerlists/list) | **GET** /ad_accounts/{ad_account_id}/customer_lists | Get customer lists
*CustomerListsApi* | [**customerLists/update**](Apis/CustomerListsApi.http#customerlists/update) | **PATCH** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Update customer list
*CustomerSegmentApi* | [**customerSegment/create**](Apis/CustomerSegmentApi.http#customersegment/create) | **POST** /ad_accounts/{ad_account_id}/customer_segments | Create customer segments
*CustomerSegmentApi* | [**customerSegment/list**](Apis/CustomerSegmentApi.http#customersegment/list) | **GET** /ad_accounts/{ad_account_id}/customer_segments | List customer segments
*CustomerSegmentApi* | [**customerSegment/update**](Apis/CustomerSegmentApi.http#customersegment/update) | **PATCH** /ad_accounts/{ad_account_id}/customer_segments | Update customer segments
*IntegrationsApi* | [**integrations/getById**](Apis/IntegrationsApi.http#integrations/getbyid) | **GET** /integrations/{id} | Get integration metadata
*IntegrationsApi* | [**integrations/getList**](Apis/IntegrationsApi.http#integrations/getlist) | **GET** /integrations | Get integration metadata list
*IntegrationsApi* | [**integrationsCommerce/del**](Apis/IntegrationsApi.http#integrationscommerce/del) | **DELETE** /integrations/commerce/{external_business_id} | Delete commerce integration
*IntegrationsApi* | [**integrationsCommerce/get**](Apis/IntegrationsApi.http#integrationscommerce/get) | **GET** /integrations/commerce/{external_business_id} | Get commerce integration
*IntegrationsApi* | [**integrationsCommerce/patch**](Apis/IntegrationsApi.http#integrationscommerce/patch) | **PATCH** /integrations/commerce/{external_business_id} | Update commerce integration
*IntegrationsApi* | [**integrationsCommerce/post**](Apis/IntegrationsApi.http#integrationscommerce/post) | **POST** /integrations/commerce | Create commerce integration
*IntegrationsApi* | [**integrationsLogs/post**](Apis/IntegrationsApi.http#integrationslogs/post) | **POST** /integrations/logs | Receives batched logs from integration applications.
*KeywordsApi* | [**countryKeywordsMetrics/get**](Apis/KeywordsApi.http#countrykeywordsmetrics/get) | **GET** /ad_accounts/{ad_account_id}/keywords/metrics | Get country's keyword metrics
*KeywordsApi* | [**keywords/create**](Apis/KeywordsApi.http#keywords/create) | **POST** /ad_accounts/{ad_account_id}/keywords | Create keywords
*KeywordsApi* | [**keywords/get**](Apis/KeywordsApi.http#keywords/get) | **GET** /ad_accounts/{ad_account_id}/keywords | Get keywords
*KeywordsApi* | [**keywords/update**](Apis/KeywordsApi.http#keywords/update) | **PATCH** /ad_accounts/{ad_account_id}/keywords | Update keywords
*KeywordsApi* | [**trendingKeywords/list**](Apis/KeywordsApi.http#trendingkeywords/list) | **GET** /trends/keywords/{region}/top/{trend_type} | List trending keywords
*LabelsApi* | [**labels/apply**](Apis/LabelsApi.http#labels/apply) | **POST** /ad_accounts/{ad_account_id}/labels/{label_id}/apply | Apply label to entity
*LabelsApi* | [**labels/create**](Apis/LabelsApi.http#labels/create) | **POST** /ad_accounts/{ad_account_id}/labels | Create labels
*LabelsApi* | [**labels/list**](Apis/LabelsApi.http#labels/list) | **GET** /ad_accounts/{ad_account_id}/labels | List labels
*LabelsApi* | [**labels/remove**](Apis/LabelsApi.http#labels/remove) | **POST** /ad_accounts/{ad_account_id}/labels/{label_id}/remove | Remove label from entities
*LabelsApi* | [**labels/update**](Apis/LabelsApi.http#labels/update) | **PATCH** /ad_accounts/{ad_account_id}/labels | Update labels
*LeadAdsApi* | [**adAccountsSubscriptions/delById**](Apis/LeadAdsApi.http#adaccountssubscriptions/delbyid) | **DELETE** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Delete lead ads subscription
*LeadAdsApi* | [**adAccountsSubscriptions/getById**](Apis/LeadAdsApi.http#adaccountssubscriptions/getbyid) | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Get lead ads subscription by ID
*LeadAdsApi* | [**adAccountsSubscriptions/getList**](Apis/LeadAdsApi.http#adaccountssubscriptions/getlist) | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions | Get lead ads subscriptions
*LeadAdsApi* | [**adAccountsSubscriptions/post**](Apis/LeadAdsApi.http#adaccountssubscriptions/post) | **POST** /ad_accounts/{ad_account_id}/leads/subscriptions | Create lead ads subscription
*LeadFormsApi* | [**leadForm/get**](Apis/LeadFormsApi.http#leadform/get) | **GET** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id} | Get lead form by id
*LeadFormsApi* | [**leadFormTest/create**](Apis/LeadFormsApi.http#leadformtest/create) | **POST** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test | Create lead form test data
*LeadFormsApi* | [**leadForms/create**](Apis/LeadFormsApi.http#leadforms/create) | **POST** /ad_accounts/{ad_account_id}/lead_forms | Create lead forms
*LeadFormsApi* | [**leadForms/list**](Apis/LeadFormsApi.http#leadforms/list) | **GET** /ad_accounts/{ad_account_id}/lead_forms | List lead forms
*LeadFormsApi* | [**leadForms/update**](Apis/LeadFormsApi.http#leadforms/update) | **PATCH** /ad_accounts/{ad_account_id}/lead_forms | Update lead forms
*LeadsExportApi* | [**leadsExport/create**](Apis/LeadsExportApi.http#leadsexport/create) | **POST** /ad_accounts/{ad_account_id}/leads_export | Create a request to export leads collected from a lead ad
*LeadsExportApi* | [**leadsExport/get**](Apis/LeadsExportApi.http#leadsexport/get) | **GET** /ad_accounts/{ad_account_id}/leads_export/{leads_export_id} | Get the lead export from the lead export create call
*MediaApi* | [**media/create**](Apis/MediaApi.http#media/create) | **POST** /media | Register media upload
*MediaApi* | [**media/get**](Apis/MediaApi.http#media/get) | **GET** /media/{media_id} | Get media upload details
*MediaApi* | [**media/list**](Apis/MediaApi.http#media/list) | **GET** /media | List media uploads
*MsotEventsApi* | [**msotEvents/create**](Apis/MsotEventsApi.http#msotevents/create) | **POST** /ad_accounts/{ad_account_id}/msot/events | Send Measurement Source Of Truth (MSOT) attributed conversion events
*NotificationApi* | [**notification/post**](Apis/NotificationApi.http#notification/post) | **POST** /notifications | Receive notifications from external partners.
*OauthApi* | [**oauth/conversionToken**](Apis/OauthApi.http#oauth/conversiontoken) | **POST** /oauth/conversion_token | Generate OAuth access token for conversion API
*OauthApi* | [**oauth/token**](Apis/OauthApi.http#oauth/token) | **POST** /oauth/token | Generate OAuth access token
*OauthApi* | [**token/revoke**](Apis/OauthApi.http#token/revoke) | **POST** /oauth/token/revoke | Revoke a token
*OrderLinesApi* | [**orderLines/get**](Apis/OrderLinesApi.http#orderlines/get) | **GET** /ad_accounts/{ad_account_id}/order_lines/{order_line_id} | Get order line
*OrderLinesApi* | [**orderLines/list**](Apis/OrderLinesApi.http#orderlines/list) | **GET** /ad_accounts/{ad_account_id}/order_lines | Get order lines.
*PinsApi* | [**multiPins/analytics**](Apis/PinsApi.http#multipins/analytics) | **GET** /pins/analytics | Get multiple Pin analytics
*PinsApi* | [**pins/analytics**](Apis/PinsApi.http#pins/analytics) | **GET** /pins/{pin_id}/analytics | Get Pin analytics
*PinsApi* | [**pins/create**](Apis/PinsApi.http#pins/create) | **POST** /pins | Create Pin
*PinsApi* | [**pins/delete**](Apis/PinsApi.http#pins/delete) | **DELETE** /pins/{pin_id} | Delete Pin
*PinsApi* | [**pins/get**](Apis/PinsApi.http#pins/get) | **GET** /pins/{pin_id} | Get Pin
*PinsApi* | [**pins/list**](Apis/PinsApi.http#pins/list) | **GET** /pins | List Pins
*PinsApi* | [**pins/save**](Apis/PinsApi.http#pins/save) | **POST** /pins/{pin_id}/save | Save Pin
*PinsApi* | [**pins/update**](Apis/PinsApi.http#pins/update) | **PATCH** /pins/{pin_id} | Update Pin
*ProductGroupPromotionsApi* | [**productGroupPromotions/create**](Apis/ProductGroupPromotionsApi.http#productgrouppromotions/create) | **POST** /ad_accounts/{ad_account_id}/product_group_promotions | Create product group promotions
*ProductGroupPromotionsApi* | [**productGroupPromotions/get**](Apis/ProductGroupPromotionsApi.http#productgrouppromotions/get) | **GET** /ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id} | Get a product group promotion by id
*ProductGroupPromotionsApi* | [**productGroupPromotions/list**](Apis/ProductGroupPromotionsApi.http#productgrouppromotions/list) | **GET** /ad_accounts/{ad_account_id}/product_group_promotions | Get product group promotions
*ProductGroupPromotionsApi* | [**productGroupPromotions/update**](Apis/ProductGroupPromotionsApi.http#productgrouppromotions/update) | **PATCH** /ad_accounts/{ad_account_id}/product_group_promotions | Update product group promotions
*ProductGroupPromotionsApi* | [**productGroups/analytics**](Apis/ProductGroupPromotionsApi.http#productgroups/analytics) | **GET** /ad_accounts/{ad_account_id}/product_groups/analytics | Get product group analytics
*ProductTagsApi* | [**productTags/bulkAdd**](Apis/ProductTagsApi.http#producttags/bulkadd) | **POST** /pins/{pin_id}/product_tags | Add product tags to pin
*ProductTagsApi* | [**productTags/bulkDelete**](Apis/ProductTagsApi.http#producttags/bulkdelete) | **POST** /pins/{pin_id}/product_tags/bulk-delete | Delete product tags from pin
*ProductTagsApi* | [**productTags/list**](Apis/ProductTagsApi.http#producttags/list) | **GET** /pins/{pin_id}/product_tags | Get product tags for pin
*PromotionsApi* | [**promotions/create**](Apis/PromotionsApi.http#promotions/create) | **POST** /ad_accounts/{ad_account_id}/promotions | Create promotions
*PromotionsApi* | [**promotions/delete**](Apis/PromotionsApi.http#promotions/delete) | **DELETE** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Delete promotion by id
*PromotionsApi* | [**promotions/get**](Apis/PromotionsApi.http#promotions/get) | **GET** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Get promotion by id
*PromotionsApi* | [**promotions/list**](Apis/PromotionsApi.http#promotions/list) | **GET** /ad_accounts/{ad_account_id}/promotions | Get promotions
*PromotionsApi* | [**promotions/update**](Apis/PromotionsApi.http#promotions/update) | **PATCH** /ad_accounts/{ad_account_id}/promotions | Update promotions
*ResourcesApi* | [**adAccountCountries/get**](Apis/ResourcesApi.http#adaccountcountries/get) | **GET** /resources/ad_account_countries | Get ad accounts countries
*ResourcesApi* | [**deliveryMetrics/get**](Apis/ResourcesApi.http#deliverymetrics/get) | **GET** /resources/delivery_metrics | Get available metrics' definitions
*ResourcesApi* | [**interestTargetingOptions/get**](Apis/ResourcesApi.http#interesttargetingoptions/get) | **GET** /resources/targeting/interests/{interest_id} | Get interest details
*ResourcesApi* | [**leadFormQuestions/get**](Apis/ResourcesApi.http#leadformquestions/get) | **GET** /resources/lead_form_questions | Get lead form questions
*ResourcesApi* | [**metricsReadyState/get**](Apis/ResourcesApi.http#metricsreadystate/get) | **GET** /resources/metrics_ready_state | Get metrics ready state
*ResourcesApi* | [**targetingOptions/get**](Apis/ResourcesApi.http#targetingoptions/get) | **GET** /resources/targeting/{targeting_type} | Get targeting options
*SchedulesApi* | [**schedules/create**](Apis/SchedulesApi.http#schedules/create) | **POST** /ad_accounts/{ad_account_id}/schedules | Create schedules
*SchedulesApi* | [**schedules/list**](Apis/SchedulesApi.http#schedules/list) | **GET** /ad_accounts/{ad_account_id}/schedules | Get Schedules
*SchedulesApi* | [**schedules/update**](Apis/SchedulesApi.http#schedules/update) | **PATCH** /ad_accounts/{ad_account_id}/schedules | Update schedules
*SearchApi* | [**searchPartnerPins**](Apis/SearchApi.http#searchpartnerpins) | **GET** /search/partner/pins | Search pins by a given search term
*SearchApi* | [**searchUserBoards/get**](Apis/SearchApi.http#searchuserboards/get) | **GET** /search/boards | Search user's boards
*SearchApi* | [**searchUserPins/list**](Apis/SearchApi.http#searchuserpins/list) | **GET** /search/pins | Search user's Pins
*TargetingTemplateApi* | [**targetingTemplate/create**](Apis/TargetingTemplateApi.http#targetingtemplate/create) | **POST** /ad_accounts/{ad_account_id}/targeting_templates | Create targeting templates
*TargetingTemplateApi* | [**targetingTemplate/list**](Apis/TargetingTemplateApi.http#targetingtemplate/list) | **GET** /ad_accounts/{ad_account_id}/targeting_templates | List targeting templates
*TargetingTemplateApi* | [**targetingTemplate/update**](Apis/TargetingTemplateApi.http#targetingtemplate/update) | **PATCH** /ad_accounts/{ad_account_id}/targeting_templates | Update targeting templates
*TermsApi* | [**termsRelated/list**](Apis/TermsApi.http#termsrelated/list) | **GET** /terms/related | List related terms
*TermsApi* | [**termsSuggested/list**](Apis/TermsApi.http#termssuggested/list) | **GET** /terms/suggested | List suggested terms
*TermsOfServiceApi* | [**termsOfService/get**](Apis/TermsOfServiceApi.http#termsofservice/get) | **GET** /ad_accounts/{ad_account_id}/terms_of_service | Get terms of service
*TrendsApi* | [**trendsEditorialArticles/list**](Apis/TrendsApi.http#trendseditorialarticles/list) | **GET** /trends/editorial_articles | Returns editorial articles for a given region
*TrendsApi* | [**trendsFeaturedTopics/list**](Apis/TrendsApi.http#trendsfeaturedtopics/list) | **GET** /trends/topics/featured | Get featured topics
*TrendsApi* | [**trendsProductCategoriesDetails/list**](Apis/TrendsApi.http#trendsproductcategoriesdetails/list) | **GET** /trends/product_categories/details | Get product category details
*TrendsApi* | [**trendsProductCategoriesTrending/list**](Apis/TrendsApi.http#trendsproductcategoriestrending/list) | **GET** /trends/product_categories/trending | Get a list of growing Shopping Product Categories
*UserAccountApi* | [**boardsUserFollows/list**](Apis/UserAccountApi.http#boardsuserfollows/list) | **GET** /user_account/following/boards | List following boards
*UserAccountApi* | [**followUser/update**](Apis/UserAccountApi.http#followuser/update) | **POST** /user_account/following/{username} | Follow user
*UserAccountApi* | [**followers/list**](Apis/UserAccountApi.http#followers/list) | **GET** /user_account/followers | List followers
*UserAccountApi* | [**linkedBusinessAccounts/get**](Apis/UserAccountApi.http#linkedbusinessaccounts/get) | **GET** /user_account/businesses | List linked businesses
*UserAccountApi* | [**unverifyWebsite/delete**](Apis/UserAccountApi.http#unverifywebsite/delete) | **DELETE** /user_account/websites | Unverify website
*UserAccountApi* | [**userAccount/analytics**](Apis/UserAccountApi.http#useraccount/analytics) | **GET** /user_account/analytics | Get user account analytics
*UserAccountApi* | [**userAccount/analytics/topPins**](Apis/UserAccountApi.http#useraccount/analytics/toppins) | **GET** /user_account/analytics/top_pins | Get user account top pins analytics
*UserAccountApi* | [**userAccount/analytics/topVideoPins**](Apis/UserAccountApi.http#useraccount/analytics/topvideopins) | **GET** /user_account/analytics/top_video_pins | Get user account top video pins analytics
*UserAccountApi* | [**userAccount/followedInterests**](Apis/UserAccountApi.http#useraccount/followedinterests) | **GET** /users/{username}/interests/follow | List following interests
*UserAccountApi* | [**userAccount/get**](Apis/UserAccountApi.http#useraccount/get) | **GET** /user_account | Get user account
*UserAccountApi* | [**userFollowing/get**](Apis/UserAccountApi.http#userfollowing/get) | **GET** /user_account/following | List following
*UserAccountApi* | [**userWebsites/get**](Apis/UserAccountApi.http#userwebsites/get) | **GET** /user_account/websites | Get user websites
*UserAccountApi* | [**verifyWebsite/update**](Apis/UserAccountApi.http#verifywebsite/update) | **POST** /user_account/websites | Verify website
*UserAccountApi* | [**websiteVerification/get**](Apis/UserAccountApi.http#websiteverification/get) | **GET** /user_account/websites/verification | Get user verification code for website claiming


## Usage

### Prerequisites

You need [IntelliJ](https://www.jetbrains.com/idea/) to be able to run those queries. More information can be found [here](https://www.jetbrains.com/help/idea/http-client-in-product-code-editor.html).
You may have some luck running queries using the [Code REST Client](https://marketplace.visualstudio.com/items?itemName=humao.rest-client) as well, but your mileage may vary.

### Variables and Environment files

* Generally speaking, you want queries to be specific using custom variables. All variables in the `.http` files have the `` format.
* You can create [public or private environment files](https://www.jetbrains.com/help/idea/exploring-http-syntax.html#environment-variables) to dynamically replace the variables at runtime.

_Note: don't commit private environment files! They typically will contain sensitive information like API Keys._

### Customizations

If you have control over the generation of the files here, there are two main things you can do

* Select elements to replace as variables during generation. The process is case-sensitive. For example, API_KEY -> 
    * For this, run the generation with the `bodyVariables` property, followed by a "-" separated list of variables
    * Example: `--additional-properties bodyVariables=YOUR_MERCHANT_ACCOUNT-YOUR_COMPANY_ACCOUNT-YOUR_BALANCE_PLATFORM`
* Add custom headers to _all_ requests. This can be useful for example if your specifications are missing [security schemes](https://github.com/github/rest-api-description/issues/237).
    * For this, run the generation with the `customHeaders` property, followed by a "&" separated list of variables
    * Example : `--additional-properties=customHeaders="Cookie:X-API-KEY="&"Accept-Encoding=gzip"`

_This client was generated by the [jetbrains-http-client](https://openapi-generator.tech/docs/generators/jetbrains-http-client) generator of OpenAPI Generator_