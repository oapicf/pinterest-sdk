# Documentation for Pinterest REST API

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://api.pinterest.com/v5*

| Class | Method | HTTP request | Description |
|------------ | ------------- | ------------- | -------------|
| *AdAccountsApi* | [**adAccount/analytics**](Apis/AdAccountsApi.md#adAccount/analytics) | **GET** /ad_accounts/{ad_account_id}/analytics | Get ad account analytics |
*AdAccountsApi* | [**adAccountTargetingAnalytics/get**](Apis/AdAccountsApi.md#adAccountTargetingAnalytics/get) | **GET** /ad_accounts/{ad_account_id}/targeting_analytics | Get targeting analytics for an ad account |
*AdAccountsApi* | [**adAccounts/create**](Apis/AdAccountsApi.md#adAccounts/create) | **POST** /ad_accounts | Create ad account |
*AdAccountsApi* | [**adAccounts/get**](Apis/AdAccountsApi.md#adAccounts/get) | **GET** /ad_accounts/{ad_account_id} | Get ad account |
*AdAccountsApi* | [**adAccounts/list**](Apis/AdAccountsApi.md#adAccounts/list) | **GET** /ad_accounts | List ad accounts |
*AdAccountsApi* | [**analytics/createConversionProductReport**](Apis/AdAccountsApi.md#analytics/createConversionProductReport) | **POST** /ad_accounts/{ad_account_id}/reports/brand_category_sku | Create a request for a brand, category, SKU report |
*AdAccountsApi* | [**analytics/createMmmReport**](Apis/AdAccountsApi.md#analytics/createMmmReport) | **POST** /ad_accounts/{ad_account_id}/mmm_reports | Create a request for a Marketing Mix Modeling (MMM) report |
*AdAccountsApi* | [**analytics/createReport**](Apis/AdAccountsApi.md#analytics/createReport) | **POST** /ad_accounts/{ad_account_id}/reports | Create async request for an account analytics report |
*AdAccountsApi* | [**analytics/createTemplateReport**](Apis/AdAccountsApi.md#analytics/createTemplateReport) | **POST** /ad_accounts/{ad_account_id}/templates/{template_id}/reports | Create async request for an analytics report using a template |
*AdAccountsApi* | [**analytics/getConversionProductReport**](Apis/AdAccountsApi.md#analytics/getConversionProductReport) | **GET** /ad_accounts/{ad_account_id}/reports/brand_category_sku | Get advertiser brand, category, SKU report |
*AdAccountsApi* | [**analytics/getMmmReport**](Apis/AdAccountsApi.md#analytics/getMmmReport) | **GET** /ad_accounts/{ad_account_id}/mmm_reports | Get advertiser Marketing Mix Modeling (MMM) report. |
*AdAccountsApi* | [**analytics/getReport**](Apis/AdAccountsApi.md#analytics/getReport) | **GET** /ad_accounts/{ad_account_id}/reports | Get the account analytics report created by the async call |
*AdAccountsApi* | [**sandbox/delete**](Apis/AdAccountsApi.md#sandbox/delete) | **DELETE** /ad_accounts/{ad_account_id}/sandbox | Delete ads data for ad account in API Sandbox |
*AdAccountsApi* | [**templates/list**](Apis/AdAccountsApi.md#templates/list) | **GET** /ad_accounts/{ad_account_id}/templates | List templates |
| *AdGroupsApi* | [**adGroups/analytics**](Apis/AdGroupsApi.md#adGroups/analytics) | **GET** /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics |
*AdGroupsApi* | [**adGroups/audienceSizing**](Apis/AdGroupsApi.md#adGroups/audienceSizing) | **POST** /ad_accounts/{ad_account_id}/ad_groups/audience_sizing | Get audience sizing |
*AdGroupsApi* | [**adGroups/create**](Apis/AdGroupsApi.md#adGroups/create) | **POST** /ad_accounts/{ad_account_id}/ad_groups | Create ad groups |
*AdGroupsApi* | [**adGroups/get**](Apis/AdGroupsApi.md#adGroups/get) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id} | Get ad group |
*AdGroupsApi* | [**adGroups/list**](Apis/AdGroupsApi.md#adGroups/list) | **GET** /ad_accounts/{ad_account_id}/ad_groups | List ad groups |
*AdGroupsApi* | [**adGroups/update**](Apis/AdGroupsApi.md#adGroups/update) | **PATCH** /ad_accounts/{ad_account_id}/ad_groups | Update ad groups |
*AdGroupsApi* | [**adGroupsBidFloor/get**](Apis/AdGroupsApi.md#adGroupsBidFloor/get) | **POST** /ad_accounts/{ad_account_id}/bid_floor | Get bid floors |
*AdGroupsApi* | [**adGroupsDynamicTitles/downloadCsv**](Apis/AdGroupsApi.md#adGroupsDynamicTitles/downloadCsv) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/csv | Get dynamic titles CSV download URL |
*AdGroupsApi* | [**adGroupsDynamicTitles/getStatus**](Apis/AdGroupsApi.md#adGroupsDynamicTitles/getStatus) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/status | Get dynamic titles status |
*AdGroupsApi* | [**adGroupsDynamicTitles/getUploadUrl**](Apis/AdGroupsApi.md#adGroupsDynamicTitles/getUploadUrl) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/uploads | Get dynamic titles upload URL |
*AdGroupsApi* | [**adGroupsDynamicTitles/processCsv**](Apis/AdGroupsApi.md#adGroupsDynamicTitles/processCsv) | **POST** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles | Process dynamic titles CSV |
*AdGroupsApi* | [**adGroupsTargetingAnalytics/get**](Apis/AdGroupsApi.md#adGroupsTargetingAnalytics/get) | **GET** /ad_accounts/{ad_account_id}/ad_groups/targeting_analytics | Get targeting analytics for ad groups |
*AdGroupsApi* | [**getAdGroupsByPromotionIds/list**](Apis/AdGroupsApi.md#getAdGroupsByPromotionIds/list) | **GET** /ad_accounts/{ad_account_id}/promotion_applied_entities | List of ad groups using promotions IDs. |
| *AdsApi* | [**adPreviews/create**](Apis/AdsApi.md#adPreviews/create) | **POST** /ad_accounts/{ad_account_id}/ad_previews | Create ad preview with pin or image |
*AdsApi* | [**adTargetingAnalytics/get**](Apis/AdsApi.md#adTargetingAnalytics/get) | **GET** /ad_accounts/{ad_account_id}/ads/targeting_analytics | Get targeting analytics for ads |
*AdsApi* | [**ads/analytics**](Apis/AdsApi.md#ads/analytics) | **GET** /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics |
*AdsApi* | [**ads/create**](Apis/AdsApi.md#ads/create) | **POST** /ad_accounts/{ad_account_id}/ads | Create ads |
*AdsApi* | [**ads/get**](Apis/AdsApi.md#ads/get) | **GET** /ad_accounts/{ad_account_id}/ads/{ad_id} | Get ad |
*AdsApi* | [**ads/list**](Apis/AdsApi.md#ads/list) | **GET** /ad_accounts/{ad_account_id}/ads | List ads |
*AdsApi* | [**ads/update**](Apis/AdsApi.md#ads/update) | **PATCH** /ad_accounts/{ad_account_id}/ads | Update ads |
*AdsApi* | [**campaignAdPreview/create**](Apis/AdsApi.md#campaignAdPreview/create) | **POST** /ad_accounts/{ad_account_id}/campaign_ad_preview | Create ad preview records for one or more ad groups |
*AdsApi* | [**campaignAdPreview/delete**](Apis/AdsApi.md#campaignAdPreview/delete) | **DELETE** /ad_accounts/{ad_account_id}/campaign_ad_preview | Delete ad preview records for one or more ad groups |
*AdsApi* | [**campaignAdPreview/read**](Apis/AdsApi.md#campaignAdPreview/read) | **GET** /ad_accounts/{ad_account_id}/campaign_ad_preview | Fetch ad preview records for one or more ad groups |
| *AdvancedAuctionApi* | [**advancedAuctionItemsGet/post**](Apis/AdvancedAuctionApi.md#advancedAuctionItemsGet/post) | **POST** /advanced_auction/items/get | Get item bid options (POST) |
*AdvancedAuctionApi* | [**advancedAuctionItemsSubmit/post**](Apis/AdvancedAuctionApi.md#advancedAuctionItemsSubmit/post) | **POST** /advanced_auction/items/submit | Operate on item level bid options |
| *AudienceInsightsApi* | [**audienceInsights/get**](Apis/AudienceInsightsApi.md#audienceInsights/get) | **GET** /ad_accounts/{ad_account_id}/audience_insights | Get audience insights |
*AudienceInsightsApi* | [**audienceInsightsScopeAndType/get**](Apis/AudienceInsightsApi.md#audienceInsightsScopeAndType/get) | **GET** /ad_accounts/{ad_account_id}/insights/audiences | Get audience insights scope and type |
| *AudienceSharingApi* | [**adAccountsAudiencesSharedAccounts/list**](Apis/AudienceSharingApi.md#adAccountsAudiencesSharedAccounts/list) | **GET** /ad_accounts/{ad_account_id}/audiences/shared/accounts | List accounts with access to an audience owned by an ad account |
*AudienceSharingApi* | [**businessAccountAudiencesSharedAccounts/list**](Apis/AudienceSharingApi.md#businessAccountAudiencesSharedAccounts/list) | **GET** /businesses/{business_id}/audiences/shared/accounts | List accounts with access to an audience owned by a business |
*AudienceSharingApi* | [**sharedAudiencesForBusiness/list**](Apis/AudienceSharingApi.md#sharedAudiencesForBusiness/list) | **GET** /businesses/{business_id}/audiences | List received audiences for a business |
*AudienceSharingApi* | [**updateAdAccountToAdAccountSharedAudience**](Apis/AudienceSharingApi.md#updateAdAccountToAdAccountSharedAudience) | **PATCH** /ad_accounts/{ad_account_id}/audiences/ad_accounts/shared | Update audience sharing between ad accounts |
*AudienceSharingApi* | [**updateAdAccountToBusinessSharedAudience**](Apis/AudienceSharingApi.md#updateAdAccountToBusinessSharedAudience) | **PATCH** /ad_accounts/{ad_account_id}/audiences/businesses/shared | Update audience sharing from an ad account to businesses |
*AudienceSharingApi* | [**updateBusinessToAdAccountSharedAudience**](Apis/AudienceSharingApi.md#updateBusinessToAdAccountSharedAudience) | **PATCH** /businesses/{business_id}/audiences/ad_accounts/shared | Update audience sharing from a business to ad accounts |
*AudienceSharingApi* | [**updateBusinessToBusinessSharedAudience**](Apis/AudienceSharingApi.md#updateBusinessToBusinessSharedAudience) | **PATCH** /businesses/{business_id}/audiences/businesses/shared | Update audience sharing between businesses |
| *AudiencesApi* | [**audiences/create**](Apis/AudiencesApi.md#audiences/create) | **POST** /ad_accounts/{ad_account_id}/audiences | Create audience |
*AudiencesApi* | [**audiences/get**](Apis/AudiencesApi.md#audiences/get) | **GET** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Get audience |
*AudiencesApi* | [**audiences/list**](Apis/AudiencesApi.md#audiences/list) | **GET** /ad_accounts/{ad_account_id}/audiences | List audiences |
*AudiencesApi* | [**audiences/update**](Apis/AudiencesApi.md#audiences/update) | **PATCH** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Update audience |
| *BillingApi* | [**adsCredit/redeem**](Apis/BillingApi.md#adsCredit/redeem) | **POST** /ad_accounts/{ad_account_id}/ads_credit/redeem | Redeem ad credits |
*BillingApi* | [**adsCreditsDiscounts/get**](Apis/BillingApi.md#adsCreditsDiscounts/get) | **GET** /ad_accounts/{ad_account_id}/ads_credit/discounts | Get ads credit discounts |
*BillingApi* | [**billingInvoiceDownload/get**](Apis/BillingApi.md#billingInvoiceDownload/get) | **GET** /ad_accounts/{ad_account_id}/billing_invoice/{billing_invoice_id}/download | Get download url for a billing invoice |
*BillingApi* | [**billingInvoices/get**](Apis/BillingApi.md#billingInvoices/get) | **GET** /ad_accounts/{ad_account_id}/billing_invoices | Get billing invoices |
*BillingApi* | [**billingProfiles/get**](Apis/BillingApi.md#billingProfiles/get) | **GET** /ad_accounts/{ad_account_id}/billing_profiles | Get billing profiles |
*BillingApi* | [**ssioAccounts/get**](Apis/BillingApi.md#ssioAccounts/get) | **GET** /ad_accounts/{ad_account_id}/ssio/accounts | Get Salesforce account details including bill-to information. |
*BillingApi* | [**ssioInsertionOrder/create**](Apis/BillingApi.md#ssioInsertionOrder/create) | **POST** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Create insertion order through SSIO. |
*BillingApi* | [**ssioInsertionOrder/edit**](Apis/BillingApi.md#ssioInsertionOrder/edit) | **PATCH** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Edit insertion order through SSIO. |
*BillingApi* | [**ssioInsertionOrdersStatus/getByAdAccount**](Apis/BillingApi.md#ssioInsertionOrdersStatus/getByAdAccount) | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/status | Get insertion order status by ad account id. |
*BillingApi* | [**ssioInsertionOrdersStatus/getByPinOrderId**](Apis/BillingApi.md#ssioInsertionOrdersStatus/getByPinOrderId) | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status | Get insertion order status by pin order id. |
*BillingApi* | [**ssioOrderLines/getByAdAccount**](Apis/BillingApi.md#ssioOrderLines/getByAdAccount) | **GET** /ad_accounts/{ad_account_id}/ssio/order_lines | Get Salesforce order lines by ad account id. |
| *BoardsApi* | [**boardSections/create**](Apis/BoardsApi.md#boardSections/create) | **POST** /boards/{board_id}/sections | Create board section |
*BoardsApi* | [**boardSections/delete**](Apis/BoardsApi.md#boardSections/delete) | **DELETE** /boards/{board_id}/sections/{section_id} | Delete board section |
*BoardsApi* | [**boardSections/list**](Apis/BoardsApi.md#boardSections/list) | **GET** /boards/{board_id}/sections | List board sections |
*BoardsApi* | [**boardSections/listPins**](Apis/BoardsApi.md#boardSections/listPins) | **GET** /boards/{board_id}/sections/{section_id}/pins | List Pins on board section |
*BoardsApi* | [**boardSections/update**](Apis/BoardsApi.md#boardSections/update) | **PATCH** /boards/{board_id}/sections/{section_id} | Update board section |
*BoardsApi* | [**boards/create**](Apis/BoardsApi.md#boards/create) | **POST** /boards | Create board |
*BoardsApi* | [**boards/delete**](Apis/BoardsApi.md#boards/delete) | **DELETE** /boards/{board_id} | Delete board |
*BoardsApi* | [**boards/get**](Apis/BoardsApi.md#boards/get) | **GET** /boards/{board_id} | Get board |
*BoardsApi* | [**boards/list**](Apis/BoardsApi.md#boards/list) | **GET** /boards | List boards |
*BoardsApi* | [**boards/listPins**](Apis/BoardsApi.md#boards/listPins) | **GET** /boards/{board_id}/pins | List Pins on board |
*BoardsApi* | [**boards/update**](Apis/BoardsApi.md#boards/update) | **PATCH** /boards/{board_id} | Update board |
| *BulkApi* | [**bulkDownload/create**](Apis/BulkApi.md#bulkDownload/create) | **POST** /ad_accounts/{ad_account_id}/bulk/download | Get advertiser entities in bulk |
*BulkApi* | [**bulkRequest/get**](Apis/BulkApi.md#bulkRequest/get) | **GET** /ad_accounts/{ad_account_id}/bulk/{bulk_request_id} | Download advertiser entities in bulk |
*BulkApi* | [**bulkUpsert/create**](Apis/BulkApi.md#bulkUpsert/create) | **POST** /ad_accounts/{ad_account_id}/bulk/upsert | Create/update ad entities in bulk |
| *BusinessAccessAssetsApi* | [**assetGroup/create**](Apis/BusinessAccessAssetsApi.md#assetGroup/create) | **POST** /businesses/{business_id}/asset_groups | Create a new asset group. |
*BusinessAccessAssetsApi* | [**assetGroup/delete**](Apis/BusinessAccessAssetsApi.md#assetGroup/delete) | **DELETE** /businesses/{business_id}/asset_groups | Delete asset groups. |
*BusinessAccessAssetsApi* | [**assetGroup/update**](Apis/BusinessAccessAssetsApi.md#assetGroup/update) | **PATCH** /businesses/{business_id}/asset_groups | Update asset groups. |
*BusinessAccessAssetsApi* | [**businessAssetMembers/get**](Apis/BusinessAccessAssetsApi.md#businessAssetMembers/get) | **GET** /businesses/{business_id}/assets/{asset_id}/members | Get members with access to asset |
*BusinessAccessAssetsApi* | [**businessAssetPartners/get**](Apis/BusinessAccessAssetsApi.md#businessAssetPartners/get) | **GET** /businesses/{business_id}/assets/{asset_id}/partners | Get partners with access to asset |
*BusinessAccessAssetsApi* | [**businessAssets/get**](Apis/BusinessAccessAssetsApi.md#businessAssets/get) | **GET** /businesses/{business_id}/assets | List business assets |
*BusinessAccessAssetsApi* | [**businessMemberAssets/get**](Apis/BusinessAccessAssetsApi.md#businessMemberAssets/get) | **GET** /businesses/{business_id}/members/{member_id}/assets | Get assets assigned to a member |
*BusinessAccessAssetsApi* | [**businessMembersAssetAccess/delete**](Apis/BusinessAccessAssetsApi.md#businessMembersAssetAccess/delete) | **DELETE** /businesses/{business_id}/members/assets/access | Delete member access to asset |
*BusinessAccessAssetsApi* | [**businessMembersAssetAccess/update**](Apis/BusinessAccessAssetsApi.md#businessMembersAssetAccess/update) | **PATCH** /businesses/{business_id}/members/assets/access | Assign/Update member asset permissions |
*BusinessAccessAssetsApi* | [**businessPartnerAssetAccess/get**](Apis/BusinessAccessAssetsApi.md#businessPartnerAssetAccess/get) | **GET** /businesses/{business_id}/partners/{partner_id}/assets | Get assets assigned to a partner or assets assigned by a partner |
*BusinessAccessAssetsApi* | [**deletePartnerAssetAccessHandlerImpl**](Apis/BusinessAccessAssetsApi.md#deletePartnerAssetAccessHandlerImpl) | **DELETE** /businesses/{business_id}/partners/assets | Delete partner access to asset |
*BusinessAccessAssetsApi* | [**updatePartnerAssetAccessHandlerImpl**](Apis/BusinessAccessAssetsApi.md#updatePartnerAssetAccessHandlerImpl) | **PATCH** /businesses/{business_id}/partners/assets | Assign/Update partner asset permissions |
| *BusinessAccessInviteApi* | [**assetAccessRequests/create**](Apis/BusinessAccessInviteApi.md#assetAccessRequests/create) | **POST** /businesses/{business_id}/requests/assets/access | Create a request to access an existing partner's assets. |
*BusinessAccessInviteApi* | [**cancelInvitesOrRequests**](Apis/BusinessAccessInviteApi.md#cancelInvitesOrRequests) | **DELETE** /businesses/{business_id}/invites | Cancel invites/requests |
*BusinessAccessInviteApi* | [**createAssetInvites**](Apis/BusinessAccessInviteApi.md#createAssetInvites) | **POST** /businesses/{business_id}/invites/assets/access | Update invite/request with an asset permission |
*BusinessAccessInviteApi* | [**createMembershipOrPartnershipInvites**](Apis/BusinessAccessInviteApi.md#createMembershipOrPartnershipInvites) | **POST** /businesses/{business_id}/invites | Create invites or requests |
*BusinessAccessInviteApi* | [**get/invites**](Apis/BusinessAccessInviteApi.md#get/invites) | **GET** /businesses/{business_id}/invites | Get invites/requests |
*BusinessAccessInviteApi* | [**respondBusinessAccessInvites**](Apis/BusinessAccessInviteApi.md#respondBusinessAccessInvites) | **PATCH** /businesses/invites | Accept or decline an invite/request |
| *BusinessAccessRelationshipsApi* | [**brandAccounts/create**](Apis/BusinessAccessRelationshipsApi.md#brandAccounts/create) | **POST** /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts | Create a Brand Account |
*BusinessAccessRelationshipsApi* | [**brandAccounts/update**](Apis/BusinessAccessRelationshipsApi.md#brandAccounts/update) | **PATCH** /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id} | Update a Brand Account |
*BusinessAccessRelationshipsApi* | [**deleteBusinessMembership**](Apis/BusinessAccessRelationshipsApi.md#deleteBusinessMembership) | **DELETE** /businesses/{business_id}/members | Terminate business memberships |
*BusinessAccessRelationshipsApi* | [**deleteBusinessPartners**](Apis/BusinessAccessRelationshipsApi.md#deleteBusinessPartners) | **DELETE** /businesses/{business_id}/partners | Terminate business partnerships |
*BusinessAccessRelationshipsApi* | [**get/businessEmployers**](Apis/BusinessAccessRelationshipsApi.md#get/businessEmployers) | **GET** /businesses/employers | List business employers for user |
*BusinessAccessRelationshipsApi* | [**get/businessMembers**](Apis/BusinessAccessRelationshipsApi.md#get/businessMembers) | **GET** /businesses/{business_id}/members | Get business members |
*BusinessAccessRelationshipsApi* | [**get/businessPartners**](Apis/BusinessAccessRelationshipsApi.md#get/businessPartners) | **GET** /businesses/{business_id}/partners | Get business partners |
*BusinessAccessRelationshipsApi* | [**systemUser/update**](Apis/BusinessAccessRelationshipsApi.md#systemUser/update) | **PATCH** /businesses/{business_id}/system_users/{system_user_id} | Update a system user information. |
*BusinessAccessRelationshipsApi* | [**update/businessMemberships**](Apis/BusinessAccessRelationshipsApi.md#update/businessMemberships) | **PATCH** /businesses/{business_id}/members | Update member's business role |
| *CampaignsApi* | [**adPins/analytics**](Apis/CampaignsApi.md#adPins/analytics) | **GET** /ad_accounts/{ad_account_id}/pins/analytics | Get pins analytics |
*CampaignsApi* | [**campaignTargetingAnalytics/get**](Apis/CampaignsApi.md#campaignTargetingAnalytics/get) | **GET** /ad_accounts/{ad_account_id}/campaigns/targeting_analytics | Get targeting analytics for campaigns |
*CampaignsApi* | [**campaigns/analytics**](Apis/CampaignsApi.md#campaigns/analytics) | **GET** /ad_accounts/{ad_account_id}/campaigns/analytics | Get campaign analytics |
*CampaignsApi* | [**campaigns/create**](Apis/CampaignsApi.md#campaigns/create) | **POST** /ad_accounts/{ad_account_id}/campaigns | Create campaigns |
*CampaignsApi* | [**campaigns/get**](Apis/CampaignsApi.md#campaigns/get) | **GET** /ad_accounts/{ad_account_id}/campaigns/{campaign_id} | Get campaign |
*CampaignsApi* | [**campaigns/list**](Apis/CampaignsApi.md#campaigns/list) | **GET** /ad_accounts/{ad_account_id}/campaigns | List campaigns |
*CampaignsApi* | [**campaigns/update**](Apis/CampaignsApi.md#campaigns/update) | **PATCH** /ad_accounts/{ad_account_id}/campaigns | Update campaigns |
*CampaignsApi* | [**getCampaignDeliveryEstimates**](Apis/CampaignsApi.md#getCampaignDeliveryEstimates) | **POST** /ad_accounts/{ad_account_id}/campaigns/delivery_estimates | Get campaign delivery estimates |
| *CatalogFeedsApi* | [**feedProcessingResults/list**](Apis/CatalogFeedsApi.md#feedProcessingResults/list) | **GET** /catalogs/feeds/{feed_id}/processing_results | List feed processing results |
*CatalogFeedsApi* | [**feeds/create**](Apis/CatalogFeedsApi.md#feeds/create) | **POST** /catalogs/feeds | Create feed |
*CatalogFeedsApi* | [**feeds/delete**](Apis/CatalogFeedsApi.md#feeds/delete) | **DELETE** /catalogs/feeds/{feed_id} | Delete feed |
*CatalogFeedsApi* | [**feeds/get**](Apis/CatalogFeedsApi.md#feeds/get) | **GET** /catalogs/feeds/{feed_id} | Get feed |
*CatalogFeedsApi* | [**feeds/ingest**](Apis/CatalogFeedsApi.md#feeds/ingest) | **POST** /catalogs/feeds/{feed_id}/ingest | Ingest feed items |
*CatalogFeedsApi* | [**feeds/list**](Apis/CatalogFeedsApi.md#feeds/list) | **GET** /catalogs/feeds | List feeds |
*CatalogFeedsApi* | [**feeds/update**](Apis/CatalogFeedsApi.md#feeds/update) | **PATCH** /catalogs/feeds/{feed_id} | Update feed |
*CatalogFeedsApi* | [**itemsIssues/list**](Apis/CatalogFeedsApi.md#itemsIssues/list) | **GET** /catalogs/processing_results/{processing_result_id}/item_issues | List item issues |
| *CatalogItemsApi* | [**items/post**](Apis/CatalogItemsApi.md#items/post) | **POST** /catalogs/items | Get catalogs items (POST) |
*CatalogItemsApi* | [**itemsBatch/get**](Apis/CatalogItemsApi.md#itemsBatch/get) | **GET** /catalogs/items/batch/{batch_id} | Get item batch status |
*CatalogItemsApi* | [**itemsBatch/post**](Apis/CatalogItemsApi.md#itemsBatch/post) | **POST** /catalogs/items/batch | Operate on item batch |
| *CatalogProductGroupsApi* | [**catalogsProductGroupPins/list**](Apis/CatalogProductGroupsApi.md#catalogsProductGroupPins/list) | **GET** /catalogs/product_groups/{product_group_id}/products | List products by product group |
*CatalogProductGroupsApi* | [**catalogsProductGroups/create**](Apis/CatalogProductGroupsApi.md#catalogsProductGroups/create) | **POST** /catalogs/product_groups | Create product group |
*CatalogProductGroupsApi* | [**catalogsProductGroups/createMany**](Apis/CatalogProductGroupsApi.md#catalogsProductGroups/createMany) | **POST** /catalogs/product_groups/multiple | Create product groups |
*CatalogProductGroupsApi* | [**catalogsProductGroups/delete**](Apis/CatalogProductGroupsApi.md#catalogsProductGroups/delete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group |
*CatalogProductGroupsApi* | [**catalogsProductGroups/deleteMany**](Apis/CatalogProductGroupsApi.md#catalogsProductGroups/deleteMany) | **DELETE** /catalogs/product_groups/multiple | Delete product groups |
*CatalogProductGroupsApi* | [**catalogsProductGroups/get**](Apis/CatalogProductGroupsApi.md#catalogsProductGroups/get) | **GET** /catalogs/product_groups/{product_group_id} | Get product group |
*CatalogProductGroupsApi* | [**catalogsProductGroups/list**](Apis/CatalogProductGroupsApi.md#catalogsProductGroups/list) | **GET** /catalogs/product_groups | List product groups |
*CatalogProductGroupsApi* | [**catalogsProductGroups/productCountsGet**](Apis/CatalogProductGroupsApi.md#catalogsProductGroups/productCountsGet) | **GET** /catalogs/product_groups/{product_group_id}/product_counts | Get product counts |
*CatalogProductGroupsApi* | [**catalogsProductGroups/update**](Apis/CatalogProductGroupsApi.md#catalogsProductGroups/update) | **PATCH** /catalogs/product_groups/{product_group_id} | Update single product group |
*CatalogProductGroupsApi* | [**productsByProductGroupFilter/list**](Apis/CatalogProductGroupsApi.md#productsByProductGroupFilter/list) | **POST** /catalogs/products/get_by_product_group_filters | List products by filter |
| *CatalogReportsApi* | [**reports/create**](Apis/CatalogReportsApi.md#reports/create) | **POST** /catalogs/reports | Build catalogs report |
*CatalogReportsApi* | [**reports/get**](Apis/CatalogReportsApi.md#reports/get) | **GET** /catalogs/reports | Get catalogs report |
*CatalogReportsApi* | [**reports/stats**](Apis/CatalogReportsApi.md#reports/stats) | **GET** /catalogs/reports/stats | List report stats |
| *CatalogSupplementalApi* | [**catalogsLocalInventoryItems/post**](Apis/CatalogSupplementalApi.md#catalogsLocalInventoryItems/post) | **POST** /catalogs/{catalog_id}/local_inventory_items/query | Get local inventory items (POST) |
*CatalogSupplementalApi* | [**catalogsLocalInventoryItemsBatch/operate**](Apis/CatalogSupplementalApi.md#catalogsLocalInventoryItemsBatch/operate) | **POST** /catalogs/{catalog_id}/local_inventory_items/batch | Operate on local inventory item batch |
*CatalogSupplementalApi* | [**catalogsLocalStores/create**](Apis/CatalogSupplementalApi.md#catalogsLocalStores/create) | **POST** /catalogs/{catalog_id}/local_stores | Create local stores |
*CatalogSupplementalApi* | [**catalogsLocalStores/delete**](Apis/CatalogSupplementalApi.md#catalogsLocalStores/delete) | **DELETE** /catalogs/{catalog_id}/local_stores | Delete local stores |
*CatalogSupplementalApi* | [**catalogsLocalStores/list**](Apis/CatalogSupplementalApi.md#catalogsLocalStores/list) | **GET** /catalogs/{catalog_id}/local_stores | List local stores |
*CatalogSupplementalApi* | [**catalogsLocalStores/update**](Apis/CatalogSupplementalApi.md#catalogsLocalStores/update) | **PATCH** /catalogs/{catalog_id}/local_stores | Update local stores |
*CatalogSupplementalApi* | [**catalogsSupplementalItemsBatch/get**](Apis/CatalogSupplementalApi.md#catalogsSupplementalItemsBatch/get) | **GET** /catalogs/{catalog_id}/supplemental_items/batch/{batch_id} | Get supplemental items batch status |
| *CatalogsApi* | [**catalogs/availableFilterValues**](Apis/CatalogsApi.md#catalogs/availableFilterValues) | **GET** /catalogs/available_filter_values | List available filter values |
*CatalogsApi* | [**catalogs/create**](Apis/CatalogsApi.md#catalogs/create) | **POST** /catalogs | Create catalog |
*CatalogsApi* | [**catalogs/list**](Apis/CatalogsApi.md#catalogs/list) | **GET** /catalogs | List catalogs |
| *ConversionDeletionRequestsApi* | [**conversionDeletionRequest/create**](Apis/ConversionDeletionRequestsApi.md#conversionDeletionRequest/create) | **POST** /ad_accounts/{ad_account_id}/conversion_deletion_requests | Create a conversion deletion request |
*ConversionDeletionRequestsApi* | [**conversionDeletionRequest/delete**](Apis/ConversionDeletionRequestsApi.md#conversionDeletionRequest/delete) | **DELETE** /ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id} | Delete a conversion deletion request |
*ConversionDeletionRequestsApi* | [**conversionDeletionRequest/get**](Apis/ConversionDeletionRequestsApi.md#conversionDeletionRequest/get) | **GET** /ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id} | Get a single conversion deletion request |
*ConversionDeletionRequestsApi* | [**conversionDeletionRequest/list**](Apis/ConversionDeletionRequestsApi.md#conversionDeletionRequest/list) | **GET** /ad_accounts/{ad_account_id}/conversion_deletion_requests | List conversion deletion requests |
| *ConversionEqsApi* | [**conversionEqs/list**](Apis/ConversionEqsApi.md#conversionEqs/list) | **GET** /ad_accounts/{ad_account_id}/conversion_eqs | Get event quality score (EQS) |
| *ConversionEventsApi* | [**events/create**](Apis/ConversionEventsApi.md#events/create) | **POST** /ad_accounts/{ad_account_id}/events | Send conversions |
| *ConversionTagsApi* | [**conversionTags/create**](Apis/ConversionTagsApi.md#conversionTags/create) | **POST** /ad_accounts/{ad_account_id}/conversion_tags | Create conversion tag |
*ConversionTagsApi* | [**conversionTags/get**](Apis/ConversionTagsApi.md#conversionTags/get) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id} | Get conversion tag |
*ConversionTagsApi* | [**conversionTags/list**](Apis/ConversionTagsApi.md#conversionTags/list) | **GET** /ad_accounts/{ad_account_id}/conversion_tags | List conversion tags |
*ConversionTagsApi* | [**ocpmEligibleConversionTags/get**](Apis/ConversionTagsApi.md#ocpmEligibleConversionTags/get) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible | Get Ocpm eligible conversion tags |
*ConversionTagsApi* | [**pageVisitConversionTags/get**](Apis/ConversionTagsApi.md#pageVisitConversionTags/get) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/page_visit | Get page visit conversion tags |
| *ConversionsApi* | [**advertiserDefinedEvents/create**](Apis/ConversionsApi.md#advertiserDefinedEvents/create) | **POST** /ad_accounts/{ad_account_id}/advertiser_defined_events | Create advertiser defined events |
*ConversionsApi* | [**advertiserDefinedEvents/delete**](Apis/ConversionsApi.md#advertiserDefinedEvents/delete) | **DELETE** /ad_accounts/{ad_account_id}/advertiser_defined_events | Delete advertiser defined events |
*ConversionsApi* | [**advertiserDefinedEvents/get**](Apis/ConversionsApi.md#advertiserDefinedEvents/get) | **GET** /ad_accounts/{ad_account_id}/advertiser_defined_events | Get advertiser defined events |
*ConversionsApi* | [**advertiserDefinedEvents/update**](Apis/ConversionsApi.md#advertiserDefinedEvents/update) | **PATCH** /ad_accounts/{ad_account_id}/advertiser_defined_events | Update advertiser defined events |
| *CustomerListUploadsApi* | [**customerListUploads/create**](Apis/CustomerListUploadsApi.md#customerListUploads/create) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads | Create customer list upload |
*CustomerListUploadsApi* | [**customerListUploads/get**](Apis/CustomerListUploadsApi.md#customerListUploads/get) | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id} | Get customer list upload |
*CustomerListUploadsApi* | [**customerListUploads/run**](Apis/CustomerListUploadsApi.md#customerListUploads/run) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run | Run customer list upload |
| *CustomerListsApi* | [**customerLists/create**](Apis/CustomerListsApi.md#customerLists/create) | **POST** /ad_accounts/{ad_account_id}/customer_lists | Create customer lists |
*CustomerListsApi* | [**customerLists/get**](Apis/CustomerListsApi.md#customerLists/get) | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Get customer list |
*CustomerListsApi* | [**customerLists/list**](Apis/CustomerListsApi.md#customerLists/list) | **GET** /ad_accounts/{ad_account_id}/customer_lists | Get customer lists |
*CustomerListsApi* | [**customerLists/update**](Apis/CustomerListsApi.md#customerLists/update) | **PATCH** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Update customer list |
| *CustomerSegmentApi* | [**customerSegment/create**](Apis/CustomerSegmentApi.md#customerSegment/create) | **POST** /ad_accounts/{ad_account_id}/customer_segments | Create customer segments |
*CustomerSegmentApi* | [**customerSegment/list**](Apis/CustomerSegmentApi.md#customerSegment/list) | **GET** /ad_accounts/{ad_account_id}/customer_segments | List customer segments |
*CustomerSegmentApi* | [**customerSegment/update**](Apis/CustomerSegmentApi.md#customerSegment/update) | **PATCH** /ad_accounts/{ad_account_id}/customer_segments | Update customer segments |
| *IntegrationsApi* | [**integrations/getById**](Apis/IntegrationsApi.md#integrations/getById) | **GET** /integrations/{id} | Get integration metadata |
*IntegrationsApi* | [**integrations/getList**](Apis/IntegrationsApi.md#integrations/getList) | **GET** /integrations | Get integration metadata list |
*IntegrationsApi* | [**integrationsCommerce/del**](Apis/IntegrationsApi.md#integrationsCommerce/del) | **DELETE** /integrations/commerce/{external_business_id} | Delete commerce integration |
*IntegrationsApi* | [**integrationsCommerce/get**](Apis/IntegrationsApi.md#integrationsCommerce/get) | **GET** /integrations/commerce/{external_business_id} | Get commerce integration |
*IntegrationsApi* | [**integrationsCommerce/patch**](Apis/IntegrationsApi.md#integrationsCommerce/patch) | **PATCH** /integrations/commerce/{external_business_id} | Update commerce integration |
*IntegrationsApi* | [**integrationsCommerce/post**](Apis/IntegrationsApi.md#integrationsCommerce/post) | **POST** /integrations/commerce | Create commerce integration |
*IntegrationsApi* | [**integrationsLogs/post**](Apis/IntegrationsApi.md#integrationsLogs/post) | **POST** /integrations/logs | Receives batched logs from integration applications. |
| *KeywordsApi* | [**countryKeywordsMetrics/get**](Apis/KeywordsApi.md#countryKeywordsMetrics/get) | **GET** /ad_accounts/{ad_account_id}/keywords/metrics | Get country's keyword metrics |
*KeywordsApi* | [**keywords/create**](Apis/KeywordsApi.md#keywords/create) | **POST** /ad_accounts/{ad_account_id}/keywords | Create keywords |
*KeywordsApi* | [**keywords/get**](Apis/KeywordsApi.md#keywords/get) | **GET** /ad_accounts/{ad_account_id}/keywords | Get keywords |
*KeywordsApi* | [**keywords/update**](Apis/KeywordsApi.md#keywords/update) | **PATCH** /ad_accounts/{ad_account_id}/keywords | Update keywords |
*KeywordsApi* | [**trendingKeywords/list**](Apis/KeywordsApi.md#trendingKeywords/list) | **GET** /trends/keywords/{region}/top/{trend_type} | List trending keywords |
| *LabelsApi* | [**labels/apply**](Apis/LabelsApi.md#labels/apply) | **POST** /ad_accounts/{ad_account_id}/labels/{label_id}/apply | Apply label to entity |
*LabelsApi* | [**labels/create**](Apis/LabelsApi.md#labels/create) | **POST** /ad_accounts/{ad_account_id}/labels | Create labels |
*LabelsApi* | [**labels/list**](Apis/LabelsApi.md#labels/list) | **GET** /ad_accounts/{ad_account_id}/labels | List labels |
*LabelsApi* | [**labels/remove**](Apis/LabelsApi.md#labels/remove) | **POST** /ad_accounts/{ad_account_id}/labels/{label_id}/remove | Remove label from entities |
*LabelsApi* | [**labels/update**](Apis/LabelsApi.md#labels/update) | **PATCH** /ad_accounts/{ad_account_id}/labels | Update labels |
| *LeadAdsApi* | [**adAccountsSubscriptions/delById**](Apis/LeadAdsApi.md#adAccountsSubscriptions/delById) | **DELETE** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Delete lead ads subscription |
*LeadAdsApi* | [**adAccountsSubscriptions/getById**](Apis/LeadAdsApi.md#adAccountsSubscriptions/getById) | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Get lead ads subscription by ID |
*LeadAdsApi* | [**adAccountsSubscriptions/getList**](Apis/LeadAdsApi.md#adAccountsSubscriptions/getList) | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions | Get lead ads subscriptions |
*LeadAdsApi* | [**adAccountsSubscriptions/post**](Apis/LeadAdsApi.md#adAccountsSubscriptions/post) | **POST** /ad_accounts/{ad_account_id}/leads/subscriptions | Create lead ads subscription |
| *LeadFormsApi* | [**leadForm/get**](Apis/LeadFormsApi.md#leadForm/get) | **GET** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id} | Get lead form by id |
*LeadFormsApi* | [**leadFormTest/create**](Apis/LeadFormsApi.md#leadFormTest/create) | **POST** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test | Create lead form test data |
*LeadFormsApi* | [**leadForms/create**](Apis/LeadFormsApi.md#leadForms/create) | **POST** /ad_accounts/{ad_account_id}/lead_forms | Create lead forms |
*LeadFormsApi* | [**leadForms/list**](Apis/LeadFormsApi.md#leadForms/list) | **GET** /ad_accounts/{ad_account_id}/lead_forms | List lead forms |
*LeadFormsApi* | [**leadForms/update**](Apis/LeadFormsApi.md#leadForms/update) | **PATCH** /ad_accounts/{ad_account_id}/lead_forms | Update lead forms |
| *LeadsExportApi* | [**leadsExport/create**](Apis/LeadsExportApi.md#leadsExport/create) | **POST** /ad_accounts/{ad_account_id}/leads_export | Create a request to export leads collected from a lead ad |
*LeadsExportApi* | [**leadsExport/get**](Apis/LeadsExportApi.md#leadsExport/get) | **GET** /ad_accounts/{ad_account_id}/leads_export/{leads_export_id} | Get the lead export from the lead export create call |
| *MediaApi* | [**media/create**](Apis/MediaApi.md#media/create) | **POST** /media | Register media upload |
*MediaApi* | [**media/get**](Apis/MediaApi.md#media/get) | **GET** /media/{media_id} | Get media upload details |
*MediaApi* | [**media/list**](Apis/MediaApi.md#media/list) | **GET** /media | List media uploads |
| *MsotEventsApi* | [**msotEvents/create**](Apis/MsotEventsApi.md#msotEvents/create) | **POST** /ad_accounts/{ad_account_id}/msot/events | Send Measurement Source Of Truth (MSOT) attributed conversion events |
| *NotificationApi* | [**notification/post**](Apis/NotificationApi.md#notification/post) | **POST** /notifications | Receive notifications from external partners. |
| *OauthApi* | [**oauth/conversionToken**](Apis/OauthApi.md#oauth/conversionToken) | **POST** /oauth/conversion_token | Generate OAuth access token for conversion API |
*OauthApi* | [**oauth/token**](Apis/OauthApi.md#oauth/token) | **POST** /oauth/token | Generate OAuth access token |
*OauthApi* | [**token/revoke**](Apis/OauthApi.md#token/revoke) | **POST** /oauth/token/revoke | Revoke a token |
| *OrderLinesApi* | [**orderLines/get**](Apis/OrderLinesApi.md#orderLines/get) | **GET** /ad_accounts/{ad_account_id}/order_lines/{order_line_id} | Get order line |
*OrderLinesApi* | [**orderLines/list**](Apis/OrderLinesApi.md#orderLines/list) | **GET** /ad_accounts/{ad_account_id}/order_lines | Get order lines. |
| *PinsApi* | [**multiPins/analytics**](Apis/PinsApi.md#multiPins/analytics) | **GET** /pins/analytics | Get multiple Pin analytics |
*PinsApi* | [**pins/analytics**](Apis/PinsApi.md#pins/analytics) | **GET** /pins/{pin_id}/analytics | Get Pin analytics |
*PinsApi* | [**pins/create**](Apis/PinsApi.md#pins/create) | **POST** /pins | Create Pin |
*PinsApi* | [**pins/delete**](Apis/PinsApi.md#pins/delete) | **DELETE** /pins/{pin_id} | Delete Pin |
*PinsApi* | [**pins/get**](Apis/PinsApi.md#pins/get) | **GET** /pins/{pin_id} | Get Pin |
*PinsApi* | [**pins/list**](Apis/PinsApi.md#pins/list) | **GET** /pins | List Pins |
*PinsApi* | [**pins/save**](Apis/PinsApi.md#pins/save) | **POST** /pins/{pin_id}/save | Save Pin |
*PinsApi* | [**pins/update**](Apis/PinsApi.md#pins/update) | **PATCH** /pins/{pin_id} | Update Pin |
| *ProductGroupPromotionsApi* | [**productGroupPromotions/create**](Apis/ProductGroupPromotionsApi.md#productGroupPromotions/create) | **POST** /ad_accounts/{ad_account_id}/product_group_promotions | Create product group promotions |
*ProductGroupPromotionsApi* | [**productGroupPromotions/get**](Apis/ProductGroupPromotionsApi.md#productGroupPromotions/get) | **GET** /ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id} | Get a product group promotion by id |
*ProductGroupPromotionsApi* | [**productGroupPromotions/list**](Apis/ProductGroupPromotionsApi.md#productGroupPromotions/list) | **GET** /ad_accounts/{ad_account_id}/product_group_promotions | Get product group promotions |
*ProductGroupPromotionsApi* | [**productGroupPromotions/update**](Apis/ProductGroupPromotionsApi.md#productGroupPromotions/update) | **PATCH** /ad_accounts/{ad_account_id}/product_group_promotions | Update product group promotions |
*ProductGroupPromotionsApi* | [**productGroups/analytics**](Apis/ProductGroupPromotionsApi.md#productGroups/analytics) | **GET** /ad_accounts/{ad_account_id}/product_groups/analytics | Get product group analytics |
| *ProductTagsApi* | [**productTags/bulkAdd**](Apis/ProductTagsApi.md#productTags/bulkAdd) | **POST** /pins/{pin_id}/product_tags | Add product tags to pin |
*ProductTagsApi* | [**productTags/bulkDelete**](Apis/ProductTagsApi.md#productTags/bulkDelete) | **POST** /pins/{pin_id}/product_tags/bulk-delete | Delete product tags from pin |
*ProductTagsApi* | [**productTags/list**](Apis/ProductTagsApi.md#productTags/list) | **GET** /pins/{pin_id}/product_tags | Get product tags for pin |
| *PromotionsApi* | [**promotions/create**](Apis/PromotionsApi.md#promotions/create) | **POST** /ad_accounts/{ad_account_id}/promotions | Create promotions |
*PromotionsApi* | [**promotions/delete**](Apis/PromotionsApi.md#promotions/delete) | **DELETE** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Delete promotion by id |
*PromotionsApi* | [**promotions/get**](Apis/PromotionsApi.md#promotions/get) | **GET** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Get promotion by id |
*PromotionsApi* | [**promotions/list**](Apis/PromotionsApi.md#promotions/list) | **GET** /ad_accounts/{ad_account_id}/promotions | Get promotions |
*PromotionsApi* | [**promotions/update**](Apis/PromotionsApi.md#promotions/update) | **PATCH** /ad_accounts/{ad_account_id}/promotions | Update promotions |
| *ResourcesApi* | [**adAccountCountries/get**](Apis/ResourcesApi.md#adAccountCountries/get) | **GET** /resources/ad_account_countries | Get ad accounts countries |
*ResourcesApi* | [**deliveryMetrics/get**](Apis/ResourcesApi.md#deliveryMetrics/get) | **GET** /resources/delivery_metrics | Get available metrics' definitions |
*ResourcesApi* | [**interestTargetingOptions/get**](Apis/ResourcesApi.md#interestTargetingOptions/get) | **GET** /resources/targeting/interests/{interest_id} | Get interest details |
*ResourcesApi* | [**leadFormQuestions/get**](Apis/ResourcesApi.md#leadFormQuestions/get) | **GET** /resources/lead_form_questions | Get lead form questions |
*ResourcesApi* | [**metricsReadyState/get**](Apis/ResourcesApi.md#metricsReadyState/get) | **GET** /resources/metrics_ready_state | Get metrics ready state |
*ResourcesApi* | [**targetingOptions/get**](Apis/ResourcesApi.md#targetingOptions/get) | **GET** /resources/targeting/{targeting_type} | Get targeting options |
| *SchedulesApi* | [**schedules/create**](Apis/SchedulesApi.md#schedules/create) | **POST** /ad_accounts/{ad_account_id}/schedules | Create schedules |
*SchedulesApi* | [**schedules/list**](Apis/SchedulesApi.md#schedules/list) | **GET** /ad_accounts/{ad_account_id}/schedules | Get Schedules |
*SchedulesApi* | [**schedules/update**](Apis/SchedulesApi.md#schedules/update) | **PATCH** /ad_accounts/{ad_account_id}/schedules | Update schedules |
| *SearchApi* | [**searchPartnerPins**](Apis/SearchApi.md#searchPartnerPins) | **GET** /search/partner/pins | Search pins by a given search term |
*SearchApi* | [**searchUserBoards/get**](Apis/SearchApi.md#searchUserBoards/get) | **GET** /search/boards | Search user's boards |
*SearchApi* | [**searchUserPins/list**](Apis/SearchApi.md#searchUserPins/list) | **GET** /search/pins | Search user's Pins |
| *TargetingTemplateApi* | [**targetingTemplate/create**](Apis/TargetingTemplateApi.md#targetingTemplate/create) | **POST** /ad_accounts/{ad_account_id}/targeting_templates | Create targeting templates |
*TargetingTemplateApi* | [**targetingTemplate/list**](Apis/TargetingTemplateApi.md#targetingTemplate/list) | **GET** /ad_accounts/{ad_account_id}/targeting_templates | List targeting templates |
*TargetingTemplateApi* | [**targetingTemplate/update**](Apis/TargetingTemplateApi.md#targetingTemplate/update) | **PATCH** /ad_accounts/{ad_account_id}/targeting_templates | Update targeting templates |
| *TermsApi* | [**termsRelated/list**](Apis/TermsApi.md#termsRelated/list) | **GET** /terms/related | List related terms |
*TermsApi* | [**termsSuggested/list**](Apis/TermsApi.md#termsSuggested/list) | **GET** /terms/suggested | List suggested terms |
| *TermsOfServiceApi* | [**termsOfService/get**](Apis/TermsOfServiceApi.md#termsOfService/get) | **GET** /ad_accounts/{ad_account_id}/terms_of_service | Get terms of service |
| *TrendsApi* | [**trendsEditorialArticles/list**](Apis/TrendsApi.md#trendsEditorialArticles/list) | **GET** /trends/editorial_articles | Returns editorial articles for a given region |
*TrendsApi* | [**trendsFeaturedTopics/list**](Apis/TrendsApi.md#trendsFeaturedTopics/list) | **GET** /trends/topics/featured | Get featured topics |
*TrendsApi* | [**trendsProductCategoriesDetails/list**](Apis/TrendsApi.md#trendsProductCategoriesDetails/list) | **GET** /trends/product_categories/details | Get product category details |
*TrendsApi* | [**trendsProductCategoriesTrending/list**](Apis/TrendsApi.md#trendsProductCategoriesTrending/list) | **GET** /trends/product_categories/trending | Get a list of growing Shopping Product Categories |
| *UserAccountApi* | [**boardsUserFollows/list**](Apis/UserAccountApi.md#boardsUserFollows/list) | **GET** /user_account/following/boards | List following boards |
*UserAccountApi* | [**followUser/update**](Apis/UserAccountApi.md#followUser/update) | **POST** /user_account/following/{username} | Follow user |
*UserAccountApi* | [**followers/list**](Apis/UserAccountApi.md#followers/list) | **GET** /user_account/followers | List followers |
*UserAccountApi* | [**linkedBusinessAccounts/get**](Apis/UserAccountApi.md#linkedBusinessAccounts/get) | **GET** /user_account/businesses | List linked businesses |
*UserAccountApi* | [**unverifyWebsite/delete**](Apis/UserAccountApi.md#unverifyWebsite/delete) | **DELETE** /user_account/websites | Unverify website |
*UserAccountApi* | [**userAccount/analytics**](Apis/UserAccountApi.md#userAccount/analytics) | **GET** /user_account/analytics | Get user account analytics |
*UserAccountApi* | [**userAccount/analytics/topPins**](Apis/UserAccountApi.md#userAccount/analytics/topPins) | **GET** /user_account/analytics/top_pins | Get user account top pins analytics |
*UserAccountApi* | [**userAccount/analytics/topVideoPins**](Apis/UserAccountApi.md#userAccount/analytics/topVideoPins) | **GET** /user_account/analytics/top_video_pins | Get user account top video pins analytics |
*UserAccountApi* | [**userAccount/followedInterests**](Apis/UserAccountApi.md#userAccount/followedInterests) | **GET** /users/{username}/interests/follow | List following interests |
*UserAccountApi* | [**userAccount/get**](Apis/UserAccountApi.md#userAccount/get) | **GET** /user_account | Get user account |
*UserAccountApi* | [**userFollowing/get**](Apis/UserAccountApi.md#userFollowing/get) | **GET** /user_account/following | List following |
*UserAccountApi* | [**userWebsites/get**](Apis/UserAccountApi.md#userWebsites/get) | **GET** /user_account/websites | Get user websites |
*UserAccountApi* | [**verifyWebsite/update**](Apis/UserAccountApi.md#verifyWebsite/update) | **POST** /user_account/websites | Verify website |
*UserAccountApi* | [**websiteVerification/get**](Apis/UserAccountApi.md#websiteVerification/get) | **GET** /user_account/websites/verification | Get user verification code for website claiming |


<a name="documentation-for-models"></a>
## Documentation for Models

 - [Account](./Models/Account.md)
 - [AccountTemplate](./Models/AccountTemplate.md)
 - [ActionType](./Models/ActionType.md)
 - [Ad](./Models/Ad.md)
 - [AdAccount](./Models/AdAccount.md)
 - [AdAccountAnalyticsItems](./Models/AdAccountAnalyticsItems.md)
 - [AdAccountCreate](./Models/AdAccountCreate.md)
 - [AdAccountEntityType](./Models/AdAccountEntityType.md)
 - [AdAccountOwner](./Models/AdAccountOwner.md)
 - [AdAccountToAdAccountSharedAudience](./Models/AdAccountToAdAccountSharedAudience.md)
 - [AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody](./Models/AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody.md)
 - [AdAccountToBusinessSharedAudience](./Models/AdAccountToBusinessSharedAudience.md)
 - [AdAccountToBusinessSharedAudienceUpdateWithRequiredBody](./Models/AdAccountToBusinessSharedAudienceUpdateWithRequiredBody.md)
 - [AdAccountsAudience](./Models/AdAccountsAudience.md)
 - [AdAccountsAudienceCreate](./Models/AdAccountsAudienceCreate.md)
 - [AdAccountsAudienceRule](./Models/AdAccountsAudienceRule.md)
 - [AdAccountsAudienceUpdate](./Models/AdAccountsAudienceUpdate.md)
 - [AdAccountsCountry](./Models/AdAccountsCountry.md)
 - [AdAdsAnalyticsAsyncTargetingTypes](./Models/AdAdsAnalyticsAsyncTargetingTypes.md)
 - [AdBatchItem](./Models/AdBatchItem.md)
 - [AdBatchUpdate](./Models/AdBatchUpdate.md)
 - [AdBatchWriteResponseModel](./Models/AdBatchWriteResponseModel.md)
 - [AdCollectionsHeaderType](./Models/AdCollectionsHeaderType.md)
 - [AdCreate](./Models/AdCreate.md)
 - [AdCreateRequest](./Models/AdCreateRequest.md)
 - [AdDisapprovalReasons](./Models/AdDisapprovalReasons.md)
 - [AdGroup](./Models/AdGroup.md)
 - [AdGroupAudienceSizing](./Models/AdGroupAudienceSizing.md)
 - [AdGroupAudienceSizingCreate](./Models/AdGroupAudienceSizingCreate.md)
 - [AdGroupAudienceSizingCreativeTypes](./Models/AdGroupAudienceSizingCreativeTypes.md)
 - [AdGroupAudienceSizingKeyword](./Models/AdGroupAudienceSizingKeyword.md)
 - [AdGroupBase](./Models/AdGroupBase.md)
 - [AdGroupCreate](./Models/AdGroupCreate.md)
 - [AdGroupCreateCreate](./Models/AdGroupCreateCreate.md)
 - [AdGroupCreateRequest](./Models/AdGroupCreateRequest.md)
 - [AdGroupCreateRequestAllOf1](./Models/AdGroupCreateRequestAllOf1.md)
 - [AdGroupDeliveryEstimates](./Models/AdGroupDeliveryEstimates.md)
 - [AdGroupDeliveryEstimatesKeywordsItems](./Models/AdGroupDeliveryEstimatesKeywordsItems.md)
 - [AdGroupSummaryStatus](./Models/AdGroupSummaryStatus.md)
 - [AdGroupTrackingURLs](./Models/AdGroupTrackingURLs.md)
 - [AdGroupUpdate](./Models/AdGroupUpdate.md)
 - [AdGroupUpdateBatchUpdate](./Models/AdGroupUpdateBatchUpdate.md)
 - [AdGroupUpdateRequest](./Models/AdGroupUpdateRequest.md)
 - [AdGroupUpdateRequestAllOf1](./Models/AdGroupUpdateRequestAllOf1.md)
 - [AdGroupsAnalyticsMetrics](./Models/AdGroupsAnalyticsMetrics.md)
 - [AdPinAnalytics](./Models/AdPinAnalytics.md)
 - [AdPinPreviewCreativeType](./Models/AdPinPreviewCreativeType.md)
 - [AdPreviewRequest](./Models/AdPreviewRequest.md)
 - [AdPreviewShopping](./Models/AdPreviewShopping.md)
 - [AdPreviewSourceImage](./Models/AdPreviewSourceImage.md)
 - [AdPreviewSourcePinId](./Models/AdPreviewSourcePinId.md)
 - [AdPreviewURLResponse](./Models/AdPreviewURLResponse.md)
 - [AdReviewStatus](./Models/AdReviewStatus.md)
 - [AdShoppingPreviewCreativeType](./Models/AdShoppingPreviewCreativeType.md)
 - [AdUpdateRequest](./Models/AdUpdateRequest.md)
 - [AdUpdateRequestAllOf1](./Models/AdUpdateRequestAllOf1.md)
 - [AdeColumnType](./Models/AdeColumnType.md)
 - [AdgroupPlacementGroupType](./Models/AdgroupPlacementGroupType.md)
 - [AdgroupTrackingFeatureType](./Models/AdgroupTrackingFeatureType.md)
 - [AdgroupTrackingFeatures](./Models/AdgroupTrackingFeatures.md)
 - [AdsAnalytics](./Models/AdsAnalytics.md)
 - [AdsAnalyticsAccountTargetingType](./Models/AdsAnalyticsAccountTargetingType.md)
 - [AdsAnalyticsAdGroupTargetingType](./Models/AdsAnalyticsAdGroupTargetingType.md)
 - [AdsAnalyticsAdTargetingType](./Models/AdsAnalyticsAdTargetingType.md)
 - [AdsAnalyticsCampaignTargetingType](./Models/AdsAnalyticsCampaignTargetingType.md)
 - [AdsAnalyticsCreateAsyncRequest](./Models/AdsAnalyticsCreateAsyncRequest.md)
 - [AdsAnalyticsCreateAsyncResponse](./Models/AdsAnalyticsCreateAsyncResponse.md)
 - [AdsAnalyticsFilterColumn](./Models/AdsAnalyticsFilterColumn.md)
 - [AdsAnalyticsFilterOperator](./Models/AdsAnalyticsFilterOperator.md)
 - [AdsAnalyticsGetAsyncResponse](./Models/AdsAnalyticsGetAsyncResponse.md)
 - [AdsAnalyticsMetricsFilter](./Models/AdsAnalyticsMetricsFilter.md)
 - [AdsCreditDiscountType](./Models/AdsCreditDiscountType.md)
 - [AdsCreditDiscountsResponse](./Models/AdsCreditDiscountsResponse.md)
 - [AdsCreditRedeem](./Models/AdsCreditRedeem.md)
 - [AdsCreditRedeemCreate](./Models/AdsCreditRedeemCreate.md)
 - [AdvancedAuctionBidOptions](./Models/AdvancedAuctionBidOptions.md)
 - [AdvancedAuctionItem](./Models/AdvancedAuctionItem.md)
 - [AdvancedAuctionItems](./Models/AdvancedAuctionItems.md)
 - [AdvancedAuctionItemsGetRequest](./Models/AdvancedAuctionItemsGetRequest.md)
 - [AdvancedAuctionItemsSubmitDeleteRecord](./Models/AdvancedAuctionItemsSubmitDeleteRecord.md)
 - [AdvancedAuctionItemsSubmitRecord](./Models/AdvancedAuctionItemsSubmitRecord.md)
 - [AdvancedAuctionItemsSubmitRequest](./Models/AdvancedAuctionItemsSubmitRequest.md)
 - [AdvancedAuctionItemsSubmitUpsertRecord](./Models/AdvancedAuctionItemsSubmitUpsertRecord.md)
 - [AdvancedAuctionKey](./Models/AdvancedAuctionKey.md)
 - [AdvancedAuctionOperationError](./Models/AdvancedAuctionOperationError.md)
 - [AdvancedAuctionProcessedItems](./Models/AdvancedAuctionProcessedItems.md)
 - [AdvertiserDefinedEvent](./Models/AdvertiserDefinedEvent.md)
 - [AdvertiserDefinedEventInput](./Models/AdvertiserDefinedEventInput.md)
 - [AdvertiserDefinedEventMappingType](./Models/AdvertiserDefinedEventMappingType.md)
 - [AdvertiserDefinedEventProcessingRecord](./Models/AdvertiserDefinedEventProcessingRecord.md)
 - [AdvertiserDefinedEventsCreateRequest](./Models/AdvertiserDefinedEventsCreateRequest.md)
 - [AgeBucketMultipliers](./Models/AgeBucketMultipliers.md)
 - [AgeTrendsBucket](./Models/AgeTrendsBucket.md)
 - [AggregatedPinComment](./Models/AggregatedPinComment.md)
 - [AiDisclosureItem](./Models/AiDisclosureItem.md)
 - [AiDisclosures](./Models/AiDisclosures.md)
 - [AiDisclosuresUpdate](./Models/AiDisclosuresUpdate.md)
 - [AmazonConnectRequest](./Models/AmazonConnectRequest.md)
 - [AmazonConnectResponse](./Models/AmazonConnectResponse.md)
 - [AnalyticsDailyMetrics](./Models/AnalyticsDailyMetrics.md)
 - [AnalyticsMetricsResponse](./Models/AnalyticsMetricsResponse.md)
 - [AppTypeMultipliers](./Models/AppTypeMultipliers.md)
 - [AppsflyerAudience](./Models/AppsflyerAudience.md)
 - [AppsflyerAudienceCreate](./Models/AppsflyerAudienceCreate.md)
 - [AppsflyerAudienceSyncCreate](./Models/AppsflyerAudienceSyncCreate.md)
 - [AppsflyerPlatform](./Models/AppsflyerPlatform.md)
 - [AssetAccessRequestError](./Models/AssetAccessRequestError.md)
 - [AssetGroupBinding](./Models/AssetGroupBinding.md)
 - [AssetGroupDeleteError](./Models/AssetGroupDeleteError.md)
 - [AssetGroupDeletion](./Models/AssetGroupDeletion.md)
 - [AssetGroupDeletionDelete](./Models/AssetGroupDeletionDelete.md)
 - [AssetGroupInput](./Models/AssetGroupInput.md)
 - [AssetGroupInputCreate](./Models/AssetGroupInputCreate.md)
 - [AssetGroupModification](./Models/AssetGroupModification.md)
 - [AssetGroupModificationReadOrUpdate](./Models/AssetGroupModificationReadOrUpdate.md)
 - [AssetGroupType](./Models/AssetGroupType.md)
 - [AssetGroupUpdateError](./Models/AssetGroupUpdateError.md)
 - [AssetGroupUpdateItemReadOrUpdateItem](./Models/AssetGroupUpdateItemReadOrUpdateItem.md)
 - [AssetIdPermissions](./Models/AssetIdPermissions.md)
 - [AssetIdWithPermissions](./Models/AssetIdWithPermissions.md)
 - [AssetPermissionType](./Models/AssetPermissionType.md)
 - [AssetSearchBy](./Models/AssetSearchBy.md)
 - [AssetSortBy](./Models/AssetSortBy.md)
 - [AssetTypeResponse](./Models/AssetTypeResponse.md)
 - [AttributionActionType](./Models/AttributionActionType.md)
 - [AttributionMatchType](./Models/AttributionMatchType.md)
 - [AttributionModel](./Models/AttributionModel.md)
 - [AttributionScope](./Models/AttributionScope.md)
 - [AttributionWindows](./Models/AttributionWindows.md)
 - [Audience](./Models/Audience.md)
 - [AudienceAccountType](./Models/AudienceAccountType.md)
 - [AudienceCategory](./Models/AudienceCategory.md)
 - [AudienceDefinition](./Models/AudienceDefinition.md)
 - [AudienceDemographicValue](./Models/AudienceDemographicValue.md)
 - [AudienceDemographics](./Models/AudienceDemographics.md)
 - [AudienceInsightType](./Models/AudienceInsightType.md)
 - [AudienceInsights](./Models/AudienceInsights.md)
 - [AudienceObjectiveType](./Models/AudienceObjectiveType.md)
 - [AudienceOwnershipType](./Models/AudienceOwnershipType.md)
 - [AudienceRule](./Models/AudienceRule.md)
 - [AudienceStatus](./Models/AudienceStatus.md)
 - [AudienceSubcategory](./Models/AudienceSubcategory.md)
 - [AudienceType](./Models/AudienceType.md)
 - [AudienceUpdateOperationType](./Models/AudienceUpdateOperationType.md)
 - [AuthRespondInviteAction](./Models/AuthRespondInviteAction.md)
 - [AuthRespondInvitesBody](./Models/AuthRespondInvitesBody.md)
 - [AuthRespondInvitesBodyItem](./Models/AuthRespondInvitesBodyItem.md)
 - [AvailabilityFilter](./Models/AvailabilityFilter.md)
 - [BaseBusinessAssets](./Models/BaseBusinessAssets.md)
 - [BaseInviteDataResponse](./Models/BaseInviteDataResponse.md)
 - [BasePreferredMediaType](./Models/BasePreferredMediaType.md)
 - [BatchOperationStatus](./Models/BatchOperationStatus.md)
 - [BidFloor](./Models/BidFloor.md)
 - [BidFloorCreate](./Models/BidFloorCreate.md)
 - [BidFloorObjectiveType](./Models/BidFloorObjectiveType.md)
 - [BidFloorSpec](./Models/BidFloorSpec.md)
 - [BidOptionsAgeBucketMultipliers](./Models/BidOptionsAgeBucketMultipliers.md)
 - [BidOptionsAppTypeMultipliers](./Models/BidOptionsAppTypeMultipliers.md)
 - [BidOptionsAudienceMultipliers](./Models/BidOptionsAudienceMultipliers.md)
 - [BidOptionsGenderMultipliers](./Models/BidOptionsGenderMultipliers.md)
 - [BidOptionsPlacementMultipliers](./Models/BidOptionsPlacementMultipliers.md)
 - [BidStrategyType](./Models/BidStrategyType.md)
 - [BillingInvoice](./Models/BillingInvoice.md)
 - [BillingInvoiceDocumentType](./Models/BillingInvoiceDocumentType.md)
 - [BillingInvoiceDownloadResponse](./Models/BillingInvoiceDownloadResponse.md)
 - [BillingInvoiceSortField](./Models/BillingInvoiceSortField.md)
 - [BillingInvoiceStatus](./Models/BillingInvoiceStatus.md)
 - [BillingProfileCardType](./Models/BillingProfileCardType.md)
 - [BillingProfilePaymentMethodBrand](./Models/BillingProfilePaymentMethodBrand.md)
 - [BillingProfileStatus](./Models/BillingProfileStatus.md)
 - [BillingProfilesResponse](./Models/BillingProfilesResponse.md)
 - [BillingType](./Models/BillingType.md)
 - [Board](./Models/Board.md)
 - [BoardBase](./Models/BoardBase.md)
 - [BoardCreate](./Models/BoardCreate.md)
 - [BoardMedia](./Models/BoardMedia.md)
 - [BoardOwner](./Models/BoardOwner.md)
 - [BoardPrivacy](./Models/BoardPrivacy.md)
 - [BoardPrivacyFilter](./Models/BoardPrivacyFilter.md)
 - [BoardSection](./Models/BoardSection.md)
 - [BoardSectionCreate](./Models/BoardSectionCreate.md)
 - [BoardSectionUpdateWithRequiredBody](./Models/BoardSectionUpdateWithRequiredBody.md)
 - [BoardUpdatePrivacy](./Models/BoardUpdatePrivacy.md)
 - [BoardWithUpdatePrivacy](./Models/BoardWithUpdatePrivacy.md)
 - [BoardWithUpdatePrivacyUpdate](./Models/BoardWithUpdatePrivacyUpdate.md)
 - [BookClosed](./Models/BookClosed.md)
 - [BrandAccount](./Models/BrandAccount.md)
 - [BrandAccountCreate](./Models/BrandAccountCreate.md)
 - [BrandAccountProfileImage](./Models/BrandAccountProfileImage.md)
 - [BrandAccountProfileImageUpdate](./Models/BrandAccountProfileImageUpdate.md)
 - [BrandAccountUpdate](./Models/BrandAccountUpdate.md)
 - [BrandFilter](./Models/BrandFilter.md)
 - [BudgetDurationType](./Models/BudgetDurationType.md)
 - [BudgetType](./Models/BudgetType.md)
 - [BulkCampaignDeliveryEstimatesItem](./Models/BulkCampaignDeliveryEstimatesItem.md)
 - [BulkCampaignDeliveryEstimatesResponse](./Models/BulkCampaignDeliveryEstimatesResponse.md)
 - [BulkDownload](./Models/BulkDownload.md)
 - [BulkDownloadCampaignFilter](./Models/BulkDownloadCampaignFilter.md)
 - [BulkDownloadCreate](./Models/BulkDownloadCreate.md)
 - [BulkEntityType](./Models/BulkEntityType.md)
 - [BulkJobData](./Models/BulkJobData.md)
 - [BulkOutputFormat](./Models/BulkOutputFormat.md)
 - [BulkReportingJobStatus](./Models/BulkReportingJobStatus.md)
 - [BulkRequestStatus](./Models/BulkRequestStatus.md)
 - [BulkUpsertRequest](./Models/BulkUpsertRequest.md)
 - [BulkUpsertRequestCreate](./Models/BulkUpsertRequestCreate.md)
 - [BulkUpsertRequestCreateCatalogProductGroupsItems](./Models/BulkUpsertRequestCreateCatalogProductGroupsItems.md)
 - [BulkUpsertRequestUpdate](./Models/BulkUpsertRequestUpdate.md)
 - [BulkUpsertRequestUpdateCatalogProductGroupsItems](./Models/BulkUpsertRequestUpdateCatalogProductGroupsItems.md)
 - [BulkUpsertResponse](./Models/BulkUpsertResponse.md)
 - [BusinessAccessRole](./Models/BusinessAccessRole.md)
 - [BusinessAccessUserSummary](./Models/BusinessAccessUserSummary.md)
 - [BusinessAssets](./Models/BusinessAssets.md)
 - [BusinessMemberAssetsGetResponse](./Models/BusinessMemberAssetsGetResponse.md)
 - [BusinessMemberAssetsSummary](./Models/BusinessMemberAssetsSummary.md)
 - [BusinessMemberSortBy](./Models/BusinessMemberSortBy.md)
 - [BusinessMembersAssetAccessDeleteBody](./Models/BusinessMembersAssetAccessDeleteBody.md)
 - [BusinessMembershipMember](./Models/BusinessMembershipMember.md)
 - [BusinessRoleForInvite](./Models/BusinessRoleForInvite.md)
 - [BusinessRoleForMembers](./Models/BusinessRoleForMembers.md)
 - [BusinessSearchBy](./Models/BusinessSearchBy.md)
 - [BusinessToAdAccountSharedAudience](./Models/BusinessToAdAccountSharedAudience.md)
 - [BusinessToAdAccountSharedAudienceUpdateWithRequiredBody](./Models/BusinessToAdAccountSharedAudienceUpdateWithRequiredBody.md)
 - [BusinessToBusinessSharedAudience](./Models/BusinessToBusinessSharedAudience.md)
 - [BusinessToBusinessSharedAudienceUpdateWithRequiredBody](./Models/BusinessToBusinessSharedAudienceUpdateWithRequiredBody.md)
 - [Campaign](./Models/Campaign.md)
 - [CampaignAdPreview](./Models/CampaignAdPreview.md)
 - [CampaignAdPreviewCreate](./Models/CampaignAdPreviewCreate.md)
 - [CampaignAudienceMultipliers](./Models/CampaignAudienceMultipliers.md)
 - [CampaignBatchItem](./Models/CampaignBatchItem.md)
 - [CampaignBatchResponseData](./Models/CampaignBatchResponseData.md)
 - [CampaignBatchUpdateItem](./Models/CampaignBatchUpdateItem.md)
 - [CampaignBatchWriteResponseModel](./Models/CampaignBatchWriteResponseModel.md)
 - [CampaignBidOptions](./Models/CampaignBidOptions.md)
 - [CampaignBidOptionsCreate](./Models/CampaignBidOptionsCreate.md)
 - [CampaignBidOptionsUpdate](./Models/CampaignBidOptionsUpdate.md)
 - [CampaignBidOptionsUpdateMaskItems](./Models/CampaignBidOptionsUpdateMaskItems.md)
 - [CampaignCreateItem](./Models/CampaignCreateItem.md)
 - [CampaignCreateRequest](./Models/CampaignCreateRequest.md)
 - [CampaignCreateRequestAllOf1](./Models/CampaignCreateRequestAllOf1.md)
 - [CampaignDeliveryEstimatesCampaign](./Models/CampaignDeliveryEstimatesCampaign.md)
 - [CampaignDeliveryEstimatesDerivedMetrics](./Models/CampaignDeliveryEstimatesDerivedMetrics.md)
 - [CampaignDeliveryEstimatesResponse](./Models/CampaignDeliveryEstimatesResponse.md)
 - [CampaignObjectiveType](./Models/CampaignObjectiveType.md)
 - [CampaignPlanningAdGroupAudienceSize](./Models/CampaignPlanningAdGroupAudienceSize.md)
 - [CampaignPlanningBudgetRecommendation](./Models/CampaignPlanningBudgetRecommendation.md)
 - [CampaignPlanningBudgetRecommendationPoint](./Models/CampaignPlanningBudgetRecommendationPoint.md)
 - [CampaignPlanningConfidenceLevelAlert](./Models/CampaignPlanningConfidenceLevelAlert.md)
 - [CampaignPlanningConfidenceLevelAlertReason](./Models/CampaignPlanningConfidenceLevelAlertReason.md)
 - [CampaignPlanningConfidenceLevelAlertSeverity](./Models/CampaignPlanningConfidenceLevelAlertSeverity.md)
 - [CampaignPlanningConversionAttribution](./Models/CampaignPlanningConversionAttribution.md)
 - [CampaignPlanningConversionAttributionWindowDays](./Models/CampaignPlanningConversionAttributionWindowDays.md)
 - [CampaignPlanningConversionEvent](./Models/CampaignPlanningConversionEvent.md)
 - [CampaignPlanningConversionRate](./Models/CampaignPlanningConversionRate.md)
 - [CampaignPlanningCurveEstimate](./Models/CampaignPlanningCurveEstimate.md)
 - [CampaignPlanningEstimationType](./Models/CampaignPlanningEstimationType.md)
 - [CampaignPlanningExperimentBudgetRecommendation](./Models/CampaignPlanningExperimentBudgetRecommendation.md)
 - [CampaignPlanningPointEstimate](./Models/CampaignPlanningPointEstimate.md)
 - [CampaignPlanningResponseError](./Models/CampaignPlanningResponseError.md)
 - [CampaignPlanningResponseErrorCode](./Models/CampaignPlanningResponseErrorCode.md)
 - [CampaignSummaryStatus](./Models/CampaignSummaryStatus.md)
 - [CampaignUpdateRequest](./Models/CampaignUpdateRequest.md)
 - [CampaignUpdateRequestAllOf2](./Models/CampaignUpdateRequestAllOf2.md)
 - [CampaignsAnalyticsMetrics](./Models/CampaignsAnalyticsMetrics.md)
 - [CancelInviteException](./Models/CancelInviteException.md)
 - [CancelInviteResult](./Models/CancelInviteResult.md)
 - [CancelInviteResultItem](./Models/CancelInviteResultItem.md)
 - [CancelInviteResultUser](./Models/CancelInviteResultUser.md)
 - [CancelInvitesRequest](./Models/CancelInvitesRequest.md)
 - [CancelInvitesResponse](./Models/CancelInvitesResponse.md)
 - [CarouselSlot](./Models/CarouselSlot.md)
 - [CartingProduct](./Models/CartingProduct.md)
 - [CartingRetailer](./Models/CartingRetailer.md)
 - [Catalog](./Models/Catalog.md)
 - [CatalogBinding](./Models/CatalogBinding.md)
 - [CatalogCreate](./Models/CatalogCreate.md)
 - [CatalogUpdate](./Models/CatalogUpdate.md)
 - [CatalogsAiContentDisclosure](./Models/CatalogsAiContentDisclosure.md)
 - [CatalogsAiContentDisclosureLabel](./Models/CatalogsAiContentDisclosureLabel.md)
 - [CatalogsAvailableFilterValues](./Models/CatalogsAvailableFilterValues.md)
 - [CatalogsBaseFilterKeys](./Models/CatalogsBaseFilterKeys.md)
 - [CatalogsBaseFiltersAllOf](./Models/CatalogsBaseFiltersAllOf.md)
 - [CatalogsBaseFiltersAnyOf](./Models/CatalogsBaseFiltersAnyOf.md)
 - [CatalogsCreateCreativeAssetsItem](./Models/CatalogsCreateCreativeAssetsItem.md)
 - [CatalogsCreateHotelItem](./Models/CatalogsCreateHotelItem.md)
 - [CatalogsCreateReportResponse](./Models/CatalogsCreateReportResponse.md)
 - [CatalogsCreateRetailItem](./Models/CatalogsCreateRetailItem.md)
 - [CatalogsCreativeAssetsAttributes](./Models/CatalogsCreativeAssetsAttributes.md)
 - [CatalogsCreativeAssetsAvailableFilterValues](./Models/CatalogsCreativeAssetsAvailableFilterValues.md)
 - [CatalogsCreativeAssetsBatchItem](./Models/CatalogsCreativeAssetsBatchItem.md)
 - [CatalogsCreativeAssetsBatchRequest](./Models/CatalogsCreativeAssetsBatchRequest.md)
 - [CatalogsCreativeAssetsFeed](./Models/CatalogsCreativeAssetsFeed.md)
 - [CatalogsCreativeAssetsFeedsCreateRequest](./Models/CatalogsCreativeAssetsFeedsCreateRequest.md)
 - [CatalogsCreativeAssetsFeedsCreateRequest_default_locale](./Models/CatalogsCreativeAssetsFeedsCreateRequest_default_locale.md)
 - [CatalogsCreativeAssetsFeedsUpdateRequest](./Models/CatalogsCreativeAssetsFeedsUpdateRequest.md)
 - [CatalogsCreativeAssetsFilterValuesMap](./Models/CatalogsCreativeAssetsFilterValuesMap.md)
 - [CatalogsCreativeAssetsItemErrorResponse](./Models/CatalogsCreativeAssetsItemErrorResponse.md)
 - [CatalogsCreativeAssetsItemResponse](./Models/CatalogsCreativeAssetsItemResponse.md)
 - [CatalogsCreativeAssetsItemsBatch](./Models/CatalogsCreativeAssetsItemsBatch.md)
 - [CatalogsCreativeAssetsItemsPostFilter](./Models/CatalogsCreativeAssetsItemsPostFilter.md)
 - [CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest](./Models/CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest.md)
 - [CatalogsCreativeAssetsProduct](./Models/CatalogsCreativeAssetsProduct.md)
 - [CatalogsCreativeAssetsProductGroup](./Models/CatalogsCreativeAssetsProductGroup.md)
 - [CatalogsCreativeAssetsProductGroupCreateRequest](./Models/CatalogsCreativeAssetsProductGroupCreateRequest.md)
 - [CatalogsCreativeAssetsProductGroupFilterKeys](./Models/CatalogsCreativeAssetsProductGroupFilterKeys.md)
 - [CatalogsCreativeAssetsProductGroupFilters](./Models/CatalogsCreativeAssetsProductGroupFilters.md)
 - [CatalogsCreativeAssetsProductGroupFiltersAllOf](./Models/CatalogsCreativeAssetsProductGroupFiltersAllOf.md)
 - [CatalogsCreativeAssetsProductGroupFiltersAnyOf](./Models/CatalogsCreativeAssetsProductGroupFiltersAnyOf.md)
 - [CatalogsCreativeAssetsProductGroupProductCounts](./Models/CatalogsCreativeAssetsProductGroupProductCounts.md)
 - [CatalogsCreativeAssetsProductGroupUpdateRequest](./Models/CatalogsCreativeAssetsProductGroupUpdateRequest.md)
 - [CatalogsCreativeAssetsProductMetadata](./Models/CatalogsCreativeAssetsProductMetadata.md)
 - [CatalogsDeleteCreativeAssetsItem](./Models/CatalogsDeleteCreativeAssetsItem.md)
 - [CatalogsDeleteHotelItem](./Models/CatalogsDeleteHotelItem.md)
 - [CatalogsDeleteRetailItem](./Models/CatalogsDeleteRetailItem.md)
 - [CatalogsFeed](./Models/CatalogsFeed.md)
 - [CatalogsFeedCreateRequestSchema](./Models/CatalogsFeedCreateRequestSchema.md)
 - [CatalogsFeedCredentials](./Models/CatalogsFeedCredentials.md)
 - [CatalogsFeedIngestion](./Models/CatalogsFeedIngestion.md)
 - [CatalogsFeedIngestionDetails](./Models/CatalogsFeedIngestionDetails.md)
 - [CatalogsFeedIngestionErrors](./Models/CatalogsFeedIngestionErrors.md)
 - [CatalogsFeedIngestionInfo](./Models/CatalogsFeedIngestionInfo.md)
 - [CatalogsFeedIngestionWarnings](./Models/CatalogsFeedIngestionWarnings.md)
 - [CatalogsFeedProcessingResult](./Models/CatalogsFeedProcessingResult.md)
 - [CatalogsFeedProcessingSchedule](./Models/CatalogsFeedProcessingSchedule.md)
 - [CatalogsFeedProcessingScheduleTimezone](./Models/CatalogsFeedProcessingScheduleTimezone.md)
 - [CatalogsFeedProcessingStatus](./Models/CatalogsFeedProcessingStatus.md)
 - [CatalogsFeedProductCounts](./Models/CatalogsFeedProductCounts.md)
 - [CatalogsFeedUpdateRequestSchema](./Models/CatalogsFeedUpdateRequestSchema.md)
 - [CatalogsFeedValidationDetails](./Models/CatalogsFeedValidationDetails.md)
 - [CatalogsFeedValidationErrors](./Models/CatalogsFeedValidationErrors.md)
 - [CatalogsFeedValidationWarnings](./Models/CatalogsFeedValidationWarnings.md)
 - [CatalogsFeedVideoCounts](./Models/CatalogsFeedVideoCounts.md)
 - [CatalogsFeedsCreateRequest](./Models/CatalogsFeedsCreateRequest.md)
 - [CatalogsFeedsUpdateRequest](./Models/CatalogsFeedsUpdateRequest.md)
 - [CatalogsFormat](./Models/CatalogsFormat.md)
 - [CatalogsHotelAddress](./Models/CatalogsHotelAddress.md)
 - [CatalogsHotelAttributes](./Models/CatalogsHotelAttributes.md)
 - [CatalogsHotelAvailableFilterValues](./Models/CatalogsHotelAvailableFilterValues.md)
 - [CatalogsHotelBatchItem](./Models/CatalogsHotelBatchItem.md)
 - [CatalogsHotelBatchRequest](./Models/CatalogsHotelBatchRequest.md)
 - [CatalogsHotelFeed](./Models/CatalogsHotelFeed.md)
 - [CatalogsHotelFeedsCreateRequest](./Models/CatalogsHotelFeedsCreateRequest.md)
 - [CatalogsHotelFeedsUpdateRequest](./Models/CatalogsHotelFeedsUpdateRequest.md)
 - [CatalogsHotelFilterValuesMap](./Models/CatalogsHotelFilterValuesMap.md)
 - [CatalogsHotelGuestRatings](./Models/CatalogsHotelGuestRatings.md)
 - [CatalogsHotelItemErrorResponse](./Models/CatalogsHotelItemErrorResponse.md)
 - [CatalogsHotelItemResponse](./Models/CatalogsHotelItemResponse.md)
 - [CatalogsHotelItemsBatch](./Models/CatalogsHotelItemsBatch.md)
 - [CatalogsHotelItemsPostFilter](./Models/CatalogsHotelItemsPostFilter.md)
 - [CatalogsHotelListProductsByCatalogBasedFilterRequest](./Models/CatalogsHotelListProductsByCatalogBasedFilterRequest.md)
 - [CatalogsHotelMainImage](./Models/CatalogsHotelMainImage.md)
 - [CatalogsHotelProduct](./Models/CatalogsHotelProduct.md)
 - [CatalogsHotelProductGroup](./Models/CatalogsHotelProductGroup.md)
 - [CatalogsHotelProductGroupCreateRequest](./Models/CatalogsHotelProductGroupCreateRequest.md)
 - [CatalogsHotelProductGroupFilterKeys](./Models/CatalogsHotelProductGroupFilterKeys.md)
 - [CatalogsHotelProductGroupFilters](./Models/CatalogsHotelProductGroupFilters.md)
 - [CatalogsHotelProductGroupFiltersAllOf](./Models/CatalogsHotelProductGroupFiltersAllOf.md)
 - [CatalogsHotelProductGroupFiltersAnyOf](./Models/CatalogsHotelProductGroupFiltersAnyOf.md)
 - [CatalogsHotelProductGroupProductCounts](./Models/CatalogsHotelProductGroupProductCounts.md)
 - [CatalogsHotelProductGroupType](./Models/CatalogsHotelProductGroupType.md)
 - [CatalogsHotelProductGroupUpdateRequest](./Models/CatalogsHotelProductGroupUpdateRequest.md)
 - [CatalogsHotelProductMetadata](./Models/CatalogsHotelProductMetadata.md)
 - [CatalogsHotelReportParameters](./Models/CatalogsHotelReportParameters.md)
 - [CatalogsHotelReportParametersReport](./Models/CatalogsHotelReportParametersReport.md)
 - [CatalogsHotelReportStatsParameters](./Models/CatalogsHotelReportStatsParameters.md)
 - [CatalogsHotelReportStatsParametersReport](./Models/CatalogsHotelReportStatsParametersReport.md)
 - [CatalogsItemValidationDetails](./Models/CatalogsItemValidationDetails.md)
 - [CatalogsItemValidationErrors](./Models/CatalogsItemValidationErrors.md)
 - [CatalogsItemValidationIssue](./Models/CatalogsItemValidationIssue.md)
 - [CatalogsItemValidationIssues](./Models/CatalogsItemValidationIssues.md)
 - [CatalogsItemValidationWarnings](./Models/CatalogsItemValidationWarnings.md)
 - [CatalogsItemsBatch](./Models/CatalogsItemsBatch.md)
 - [CatalogsItemsBatchPostRequest](./Models/CatalogsItemsBatchPostRequest.md)
 - [CatalogsItemsBatchRequest](./Models/CatalogsItemsBatchRequest.md)
 - [CatalogsItemsCreateBatchRequest](./Models/CatalogsItemsCreateBatchRequest.md)
 - [CatalogsItemsDeleteBatchRequest](./Models/CatalogsItemsDeleteBatchRequest.md)
 - [CatalogsItemsDeleteDiscontinuedBatchRequest](./Models/CatalogsItemsDeleteDiscontinuedBatchRequest.md)
 - [CatalogsItemsPostFilters](./Models/CatalogsItemsPostFilters.md)
 - [CatalogsItemsRequest](./Models/CatalogsItemsRequest.md)
 - [CatalogsItemsUpdateBatchRequest](./Models/CatalogsItemsUpdateBatchRequest.md)
 - [CatalogsItemsUpsertBatchRequest](./Models/CatalogsItemsUpsertBatchRequest.md)
 - [CatalogsListProductsByFeedBasedFilter](./Models/CatalogsListProductsByFeedBasedFilter.md)
 - [CatalogsListProductsByFilterRequest](./Models/CatalogsListProductsByFilterRequest.md)
 - [CatalogsLocale](./Models/CatalogsLocale.md)
 - [CatalogsProduct](./Models/CatalogsProduct.md)
 - [CatalogsProductGroupCreateRequest](./Models/CatalogsProductGroupCreateRequest.md)
 - [CatalogsProductGroupCurrencyCriteria](./Models/CatalogsProductGroupCurrencyCriteria.md)
 - [CatalogsProductGroupFilterKeys](./Models/CatalogsProductGroupFilterKeys.md)
 - [CatalogsProductGroupFilterOperatorTypeCriteria](./Models/CatalogsProductGroupFilterOperatorTypeCriteria.md)
 - [CatalogsProductGroupFilters](./Models/CatalogsProductGroupFilters.md)
 - [CatalogsProductGroupFiltersAllOf](./Models/CatalogsProductGroupFiltersAllOf.md)
 - [CatalogsProductGroupFiltersAnyOf](./Models/CatalogsProductGroupFiltersAnyOf.md)
 - [CatalogsProductGroupFiltersRequest](./Models/CatalogsProductGroupFiltersRequest.md)
 - [CatalogsProductGroupFiltersRequestAnyOfItems0](./Models/CatalogsProductGroupFiltersRequestAnyOfItems0.md)
 - [CatalogsProductGroupFiltersRequestAnyOfItems1](./Models/CatalogsProductGroupFiltersRequestAnyOfItems1.md)
 - [CatalogsProductGroupMultipleCountriesCriteria](./Models/CatalogsProductGroupMultipleCountriesCriteria.md)
 - [CatalogsProductGroupMultipleGenderCriteria](./Models/CatalogsProductGroupMultipleGenderCriteria.md)
 - [CatalogsProductGroupMultipleMediaTypesCriteria](./Models/CatalogsProductGroupMultipleMediaTypesCriteria.md)
 - [CatalogsProductGroupMultiplePinterestProductCategoryCriteria](./Models/CatalogsProductGroupMultiplePinterestProductCategoryCriteria.md)
 - [CatalogsProductGroupMultipleStringCriteria](./Models/CatalogsProductGroupMultipleStringCriteria.md)
 - [CatalogsProductGroupMultipleStringListCriteria](./Models/CatalogsProductGroupMultipleStringListCriteria.md)
 - [CatalogsProductGroupPricingCriteria](./Models/CatalogsProductGroupPricingCriteria.md)
 - [CatalogsProductGroupProductCountsVertical](./Models/CatalogsProductGroupProductCountsVertical.md)
 - [CatalogsProductGroupStatus](./Models/CatalogsProductGroupStatus.md)
 - [CatalogsProductGroupType](./Models/CatalogsProductGroupType.md)
 - [CatalogsProductGroupUint32Criteria](./Models/CatalogsProductGroupUint32Criteria.md)
 - [CatalogsProductGroupUpdateManyRequestItemsOneOfItems0](./Models/CatalogsProductGroupUpdateManyRequestItemsOneOfItems0.md)
 - [CatalogsProductGroupUpdateRequest](./Models/CatalogsProductGroupUpdateRequest.md)
 - [CatalogsProductGroupsCreateManyRequestItems](./Models/CatalogsProductGroupsCreateManyRequestItems.md)
 - [CatalogsProductGroupsCreateRequestSchema](./Models/CatalogsProductGroupsCreateRequestSchema.md)
 - [CatalogsProductGroupsUpdateRequestSchema](./Models/CatalogsProductGroupsUpdateRequestSchema.md)
 - [CatalogsReport](./Models/CatalogsReport.md)
 - [CatalogsReportDistributionIssueFilter](./Models/CatalogsReportDistributionIssueFilter.md)
 - [CatalogsReportDistributionStats](./Models/CatalogsReportDistributionStats.md)
 - [CatalogsReportFeedIngestionFilter](./Models/CatalogsReportFeedIngestionFilter.md)
 - [CatalogsReportFeedIngestionStats](./Models/CatalogsReportFeedIngestionStats.md)
 - [CatalogsReportParameters](./Models/CatalogsReportParameters.md)
 - [CatalogsReportStats](./Models/CatalogsReportStats.md)
 - [CatalogsReportStatsParameters](./Models/CatalogsReportStatsParameters.md)
 - [CatalogsRetailAvailableFilterValues](./Models/CatalogsRetailAvailableFilterValues.md)
 - [CatalogsRetailBatchRequest](./Models/CatalogsRetailBatchRequest.md)
 - [CatalogsRetailBatchRequestItemsItems](./Models/CatalogsRetailBatchRequestItemsItems.md)
 - [CatalogsRetailFeed](./Models/CatalogsRetailFeed.md)
 - [CatalogsRetailFeedsCreateRequest](./Models/CatalogsRetailFeedsCreateRequest.md)
 - [CatalogsRetailFeedsUpdateRequest](./Models/CatalogsRetailFeedsUpdateRequest.md)
 - [CatalogsRetailFilterValuesMap](./Models/CatalogsRetailFilterValuesMap.md)
 - [CatalogsRetailItemErrorResponse](./Models/CatalogsRetailItemErrorResponse.md)
 - [CatalogsRetailItemResponse](./Models/CatalogsRetailItemResponse.md)
 - [CatalogsRetailItemsBatch](./Models/CatalogsRetailItemsBatch.md)
 - [CatalogsRetailItemsPostFilter](./Models/CatalogsRetailItemsPostFilter.md)
 - [CatalogsRetailListProductsByCatalogBasedFilterRequest](./Models/CatalogsRetailListProductsByCatalogBasedFilterRequest.md)
 - [CatalogsRetailProduct](./Models/CatalogsRetailProduct.md)
 - [CatalogsRetailProductGroup](./Models/CatalogsRetailProductGroup.md)
 - [CatalogsRetailProductGroupCreateRequest](./Models/CatalogsRetailProductGroupCreateRequest.md)
 - [CatalogsRetailProductGroupProductCounts](./Models/CatalogsRetailProductGroupProductCounts.md)
 - [CatalogsRetailProductGroupUpdateRequest](./Models/CatalogsRetailProductGroupUpdateRequest.md)
 - [CatalogsRetailProductMetadata](./Models/CatalogsRetailProductMetadata.md)
 - [CatalogsRetailReportAllItemsFilter](./Models/CatalogsRetailReportAllItemsFilter.md)
 - [CatalogsRetailReportParameters](./Models/CatalogsRetailReportParameters.md)
 - [CatalogsRetailReportParametersReport](./Models/CatalogsRetailReportParametersReport.md)
 - [CatalogsRetailReportStatsParameters](./Models/CatalogsRetailReportStatsParameters.md)
 - [CatalogsRetailReportStatsParametersReport](./Models/CatalogsRetailReportStatsParametersReport.md)
 - [CatalogsStatus](./Models/CatalogsStatus.md)
 - [CatalogsType](./Models/CatalogsType.md)
 - [CatalogsUpdatableCreativeAssetsAttributes](./Models/CatalogsUpdatableCreativeAssetsAttributes.md)
 - [CatalogsUpdatableHotelAttributes](./Models/CatalogsUpdatableHotelAttributes.md)
 - [CatalogsUpdateCreativeAssetsItem](./Models/CatalogsUpdateCreativeAssetsItem.md)
 - [CatalogsUpdateHotelItem](./Models/CatalogsUpdateHotelItem.md)
 - [CatalogsUpdateRetailItem](./Models/CatalogsUpdateRetailItem.md)
 - [CatalogsUpsertCreativeAssetsItem](./Models/CatalogsUpsertCreativeAssetsItem.md)
 - [CatalogsUpsertHotelItem](./Models/CatalogsUpsertHotelItem.md)
 - [CatalogsUpsertRetailItem](./Models/CatalogsUpsertRetailItem.md)
 - [CatalogsVerticalBatchRequest](./Models/CatalogsVerticalBatchRequest.md)
 - [CatalogsVerticalFeedsCreateRequest](./Models/CatalogsVerticalFeedsCreateRequest.md)
 - [CatalogsVerticalFeedsUpdateRequest](./Models/CatalogsVerticalFeedsUpdateRequest.md)
 - [CatalogsVerticalProductGroup](./Models/CatalogsVerticalProductGroup.md)
 - [CatalogsVerticalProductGroupCreateRequest](./Models/CatalogsVerticalProductGroupCreateRequest.md)
 - [CatalogsVerticalProductGroupUpdateRequest](./Models/CatalogsVerticalProductGroupUpdateRequest.md)
 - [CatalogsVerticalsListProductsByCatalogBasedFilterRequest](./Models/CatalogsVerticalsListProductsByCatalogBasedFilterRequest.md)
 - [ChangeHistoryDataType](./Models/ChangeHistoryDataType.md)
 - [ChangeHistoryOperationType](./Models/ChangeHistoryOperationType.md)
 - [CollectionsHeaderType](./Models/CollectionsHeaderType.md)
 - [ConditionFilter](./Models/ConditionFilter.md)
 - [ContentType](./Models/ContentType.md)
 - [ConversionAccessToken](./Models/ConversionAccessToken.md)
 - [ConversionApiResponseEventsItems](./Models/ConversionApiResponseEventsItems.md)
 - [ConversionAttributionWindowDays](./Models/ConversionAttributionWindowDays.md)
 - [ConversionDeletionRequest](./Models/ConversionDeletionRequest.md)
 - [ConversionDeletionRequestCreate](./Models/ConversionDeletionRequestCreate.md)
 - [ConversionDeletionRequestEPIKTargets](./Models/ConversionDeletionRequestEPIKTargets.md)
 - [ConversionDeletionRequestStatus](./Models/ConversionDeletionRequestStatus.md)
 - [ConversionDeletionRequestTargets](./Models/ConversionDeletionRequestTargets.md)
 - [ConversionDeletionRequestUserEmailTargets](./Models/ConversionDeletionRequestUserEmailTargets.md)
 - [ConversionEvent](./Models/ConversionEvent.md)
 - [ConversionEventAppInfo](./Models/ConversionEventAppInfo.md)
 - [ConversionEventDeviceInfo](./Models/ConversionEventDeviceInfo.md)
 - [ConversionEventIngestionSource](./Models/ConversionEventIngestionSource.md)
 - [ConversionEventResponse](./Models/ConversionEventResponse.md)
 - [ConversionEvents](./Models/ConversionEvents.md)
 - [ConversionEventsCreate](./Models/ConversionEventsCreate.md)
 - [ConversionEventsDataItems](./Models/ConversionEventsDataItems.md)
 - [ConversionEventsDataItemsCustomData](./Models/ConversionEventsDataItemsCustomData.md)
 - [ConversionEventsDataItemsCustomDataContentsItems](./Models/ConversionEventsDataItemsCustomDataContentsItems.md)
 - [ConversionEventsUserDataProperties](./Models/ConversionEventsUserDataProperties.md)
 - [ConversionHealthSelectionItem](./Models/ConversionHealthSelectionItem.md)
 - [ConversionLearningModeType](./Models/ConversionLearningModeType.md)
 - [ConversionMSOTEventsCreate](./Models/ConversionMSOTEventsCreate.md)
 - [ConversionObjectiveType](./Models/ConversionObjectiveType.md)
 - [ConversionProductAttributionType](./Models/ConversionProductAttributionType.md)
 - [ConversionProductReport](./Models/ConversionProductReport.md)
 - [ConversionProductReportBreakdownType](./Models/ConversionProductReportBreakdownType.md)
 - [ConversionProductReportCreate](./Models/ConversionProductReportCreate.md)
 - [ConversionProductReportGranularity](./Models/ConversionProductReportGranularity.md)
 - [ConversionProductReportLevel](./Models/ConversionProductReportLevel.md)
 - [ConversionProductReportingColumn](./Models/ConversionProductReportingColumn.md)
 - [ConversionReportAttributionType](./Models/ConversionReportAttributionType.md)
 - [ConversionReportTimeType](./Models/ConversionReportTimeType.md)
 - [ConversionTag](./Models/ConversionTag.md)
 - [ConversionTagCommon](./Models/ConversionTagCommon.md)
 - [ConversionTagConfigs](./Models/ConversionTagConfigs.md)
 - [ConversionTagCreate](./Models/ConversionTagCreate.md)
 - [ConversionTagResponse](./Models/ConversionTagResponse.md)
 - [ConversionTagType](./Models/ConversionTagType.md)
 - [ConversionTagTypeOptimal](./Models/ConversionTagTypeOptimal.md)
 - [ConversionTagV3GoalMetadata](./Models/ConversionTagV3GoalMetadata.md)
 - [Country](./Models/Country.md)
 - [CountryFilter](./Models/CountryFilter.md)
 - [CreateAssetAccessRequestBody](./Models/CreateAssetAccessRequestBody.md)
 - [CreateAssetAccessRequestItem](./Models/CreateAssetAccessRequestItem.md)
 - [CreateAssetAccessRequestResponse](./Models/CreateAssetAccessRequestResponse.md)
 - [CreateAssetInvitesRequest](./Models/CreateAssetInvitesRequest.md)
 - [CreateAssetInvitesRequestItem](./Models/CreateAssetInvitesRequestItem.md)
 - [CreateInvitesResultsResponseArray](./Models/CreateInvitesResultsResponseArray.md)
 - [CreateMembershipOrPartnershipInvitesBody](./Models/CreateMembershipOrPartnershipInvitesBody.md)
 - [CreationSource](./Models/CreationSource.md)
 - [CreativeAssetsIdFilter](./Models/CreativeAssetsIdFilter.md)
 - [CreativeAssetsProcessingRecord](./Models/CreativeAssetsProcessingRecord.md)
 - [CreativeAssetsVisibilityType](./Models/CreativeAssetsVisibilityType.md)
 - [CreativeType](./Models/CreativeType.md)
 - [Currency](./Models/Currency.md)
 - [CurrencyFilter](./Models/CurrencyFilter.md)
 - [CustomConversionEventMetrics](./Models/CustomConversionEventMetrics.md)
 - [CustomLabel0Filter](./Models/CustomLabel0Filter.md)
 - [CustomLabel1Filter](./Models/CustomLabel1Filter.md)
 - [CustomLabel2Filter](./Models/CustomLabel2Filter.md)
 - [CustomLabel3Filter](./Models/CustomLabel3Filter.md)
 - [CustomLabel4Filter](./Models/CustomLabel4Filter.md)
 - [CustomNumber0Filter](./Models/CustomNumber0Filter.md)
 - [CustomNumber1Filter](./Models/CustomNumber1Filter.md)
 - [CustomNumber2Filter](./Models/CustomNumber2Filter.md)
 - [CustomNumber3Filter](./Models/CustomNumber3Filter.md)
 - [CustomNumber4Filter](./Models/CustomNumber4Filter.md)
 - [CustomerList](./Models/CustomerList.md)
 - [CustomerListCreate](./Models/CustomerListCreate.md)
 - [CustomerListRecordRow](./Models/CustomerListRecordRow.md)
 - [CustomerListStatus](./Models/CustomerListStatus.md)
 - [CustomerListUpdateWithRequiredBody](./Models/CustomerListUpdateWithRequiredBody.md)
 - [CustomerListUpload](./Models/CustomerListUpload.md)
 - [CustomerListUploadCreateRequest](./Models/CustomerListUploadCreateRequest.md)
 - [CustomerListUploadCreateResponse](./Models/CustomerListUploadCreateResponse.md)
 - [CustomerSegment](./Models/CustomerSegment.md)
 - [CustomerSegmentCreate](./Models/CustomerSegmentCreate.md)
 - [CustomerSegmentUpdateRequestUpdateWithRequiredBody](./Models/CustomerSegmentUpdateRequestUpdateWithRequiredBody.md)
 - [CustomizableCTAType](./Models/CustomizableCTAType.md)
 - [DataOutputFormat](./Models/DataOutputFormat.md)
 - [DataStatus](./Models/DataStatus.md)
 - [DeleteBusinessMembershipBody](./Models/DeleteBusinessMembershipBody.md)
 - [DeleteBusinessMembershipMember](./Models/DeleteBusinessMembershipMember.md)
 - [DeleteBusinessPartners](./Models/DeleteBusinessPartners.md)
 - [DeleteBusinessPartnersDelete](./Models/DeleteBusinessPartnersDelete.md)
 - [DeleteMemberAccessResult](./Models/DeleteMemberAccessResult.md)
 - [DeleteMemberAccessResultsResponseArray](./Models/DeleteMemberAccessResultsResponseArray.md)
 - [DeleteMemberAssetAccessItem](./Models/DeleteMemberAssetAccessItem.md)
 - [DeletePartnerAssetAccessBody](./Models/DeletePartnerAssetAccessBody.md)
 - [DeletePartnerAssetAccessItem](./Models/DeletePartnerAssetAccessItem.md)
 - [DeletePartnerAssetAccessResult](./Models/DeletePartnerAssetAccessResult.md)
 - [DeletePartnerAssetAccessResultsResponseArray](./Models/DeletePartnerAssetAccessResultsResponseArray.md)
 - [DeliveryEstimateObjectiveType](./Models/DeliveryEstimateObjectiveType.md)
 - [DeliveryMetricsResponseItemsItems](./Models/DeliveryMetricsResponseItemsItems.md)
 - [DetailedError](./Models/DetailedError.md)
 - [DisclosureType](./Models/DisclosureType.md)
 - [DiscountStatus](./Models/DiscountStatus.md)
 - [DynamicTitlesDownloadCSV](./Models/DynamicTitlesDownloadCSV.md)
 - [DynamicTitlesGetStatus](./Models/DynamicTitlesGetStatus.md)
 - [DynamicTitlesProcessCSV](./Models/DynamicTitlesProcessCSV.md)
 - [DynamicTitlesProcessCSVCreate](./Models/DynamicTitlesProcessCSVCreate.md)
 - [DynamicTitlesProcessCSVError](./Models/DynamicTitlesProcessCSVError.md)
 - [DynamicTitlesUploadURL](./Models/DynamicTitlesUploadURL.md)
 - [EnhancedMatchStatusType](./Models/EnhancedMatchStatusType.md)
 - [EntityDataChangeHistory](./Models/EntityDataChangeHistory.md)
 - [EntityHistory](./Models/EntityHistory.md)
 - [EntityLabel](./Models/EntityLabel.md)
 - [EntityLabelError](./Models/EntityLabelError.md)
 - [EntityLabelStatus](./Models/EntityLabelStatus.md)
 - [EntityStatus](./Models/EntityStatus.md)
 - [ErrorDetail](./Models/ErrorDetail.md)
 - [EventData](./Models/EventData.md)
 - [EventProcessingStatus](./Models/EventProcessingStatus.md)
 - [EventQualityScore](./Models/EventQualityScore.md)
 - [Exception](./Models/Exception.md)
 - [FeaturedTrend](./Models/FeaturedTrend.md)
 - [FilterOperatorType](./Models/FilterOperatorType.md)
 - [FollowUser](./Models/FollowUser.md)
 - [FollowUserCreate](./Models/FollowUserCreate.md)
 - [FormFactor](./Models/FormFactor.md)
 - [FreqBidMultiplierTimeWindow](./Models/FreqBidMultiplierTimeWindow.md)
 - [FrequencyGoalMetadata](./Models/FrequencyGoalMetadata.md)
 - [FrequencyGoalMetadataTimerange](./Models/FrequencyGoalMetadataTimerange.md)
 - [FrequencyMultipliers](./Models/FrequencyMultipliers.md)
 - [Gender](./Models/Gender.md)
 - [GenderBucket](./Models/GenderBucket.md)
 - [GenderDemographics](./Models/GenderDemographics.md)
 - [GenderFilter](./Models/GenderFilter.md)
 - [GenderMultipliers](./Models/GenderMultipliers.md)
 - [GoogleProductCategory0Filter](./Models/GoogleProductCategory0Filter.md)
 - [GoogleProductCategory1Filter](./Models/GoogleProductCategory1Filter.md)
 - [GoogleProductCategory2Filter](./Models/GoogleProductCategory2Filter.md)
 - [GoogleProductCategory3Filter](./Models/GoogleProductCategory3Filter.md)
 - [GoogleProductCategory4Filter](./Models/GoogleProductCategory4Filter.md)
 - [GoogleProductCategory5Filter](./Models/GoogleProductCategory5Filter.md)
 - [GoogleProductCategory6Filter](./Models/GoogleProductCategory6Filter.md)
 - [Granularity](./Models/Granularity.md)
 - [GridClickType](./Models/GridClickType.md)
 - [HotelIdFilter](./Models/HotelIdFilter.md)
 - [HotelProcessingRecord](./Models/HotelProcessingRecord.md)
 - [HttpMethod](./Models/HttpMethod.md)
 - [ImageDetails](./Models/ImageDetails.md)
 - [ImageMetadata](./Models/ImageMetadata.md)
 - [ImageSize](./Models/ImageSize.md)
 - [IneligibleProductTagErrorItem](./Models/IneligibleProductTagErrorItem.md)
 - [IneligibleProductTagReason](./Models/IneligibleProductTagReason.md)
 - [IneligibleProductTagsErrorDetails](./Models/IneligibleProductTagsErrorDetails.md)
 - [IngestionSource](./Models/IngestionSource.md)
 - [IngestionSourceOptions](./Models/IngestionSourceOptions.md)
 - [InnerProductCategoriesMetricsHighlights](./Models/InnerProductCategoriesMetricsHighlights.md)
 - [IntegrationLog](./Models/IntegrationLog.md)
 - [IntegrationLogClientError](./Models/IntegrationLogClientError.md)
 - [IntegrationLogClientRequest](./Models/IntegrationLogClientRequest.md)
 - [IntegrationLogEventType](./Models/IntegrationLogEventType.md)
 - [IntegrationLogLevel](./Models/IntegrationLogLevel.md)
 - [IntegrationLogsInvalidLogResponse](./Models/IntegrationLogsInvalidLogResponse.md)
 - [IntegrationLogsInvalidLogResponseRejectedLogsItems](./Models/IntegrationLogsInvalidLogResponseRejectedLogsItems.md)
 - [IntegrationLogsRequestCreate](./Models/IntegrationLogsRequestCreate.md)
 - [IntegrationLogsSuccessResponse](./Models/IntegrationLogsSuccessResponse.md)
 - [IntegrationMetadata](./Models/IntegrationMetadata.md)
 - [IntegrationMetadataCreate](./Models/IntegrationMetadataCreate.md)
 - [IntegrationMetadataUpdate](./Models/IntegrationMetadataUpdate.md)
 - [IntegrationRecord](./Models/IntegrationRecord.md)
 - [IntendedPromotionType](./Models/IntendedPromotionType.md)
 - [Interest](./Models/Interest.md)
 - [InterestsEnum](./Models/InterestsEnum.md)
 - [InviteActionResultItem](./Models/InviteActionResultItem.md)
 - [InviteAssetsSummary](./Models/InviteAssetsSummary.md)
 - [InviteAssetsSummaryItem](./Models/InviteAssetsSummaryItem.md)
 - [InviteBusinessRoleBinding](./Models/InviteBusinessRoleBinding.md)
 - [InviteDataResponse](./Models/InviteDataResponse.md)
 - [InviteExceptionResponse](./Models/InviteExceptionResponse.md)
 - [InviteFilterStatus](./Models/InviteFilterStatus.md)
 - [InviteResponse](./Models/InviteResponse.md)
 - [InviteStatus](./Models/InviteStatus.md)
 - [InviteType](./Models/InviteType.md)
 - [ItemAttributes](./Models/ItemAttributes.md)
 - [ItemAttributesRequest](./Models/ItemAttributesRequest.md)
 - [ItemAttributesRequestImageLink](./Models/ItemAttributesRequestImageLink.md)
 - [ItemAvailability](./Models/ItemAvailability.md)
 - [ItemCreateBatchRecord](./Models/ItemCreateBatchRecord.md)
 - [ItemDeleteBatchRecord](./Models/ItemDeleteBatchRecord.md)
 - [ItemDeleteDiscontinuedBatchRecord](./Models/ItemDeleteDiscontinuedBatchRecord.md)
 - [ItemGroupIdFilter](./Models/ItemGroupIdFilter.md)
 - [ItemIdFilter](./Models/ItemIdFilter.md)
 - [ItemIdStoreCodePair](./Models/ItemIdStoreCodePair.md)
 - [ItemProcessingRecord](./Models/ItemProcessingRecord.md)
 - [ItemProcessingStatus](./Models/ItemProcessingStatus.md)
 - [ItemResponse](./Models/ItemResponse.md)
 - [ItemUpdateBatchRecord](./Models/ItemUpdateBatchRecord.md)
 - [ItemUpsertBatchRecord](./Models/ItemUpsertBatchRecord.md)
 - [ItemValidationEvent](./Models/ItemValidationEvent.md)
 - [Keyword](./Models/Keyword.md)
 - [KeywordCreateItem](./Models/KeywordCreateItem.md)
 - [KeywordError](./Models/KeywordError.md)
 - [KeywordInfo](./Models/KeywordInfo.md)
 - [KeywordMetrics](./Models/KeywordMetrics.md)
 - [KeywordMetricsResponse](./Models/KeywordMetricsResponse.md)
 - [KeywordUpdateGenerated](./Models/KeywordUpdateGenerated.md)
 - [KeywordUpdateItem](./Models/KeywordUpdateItem.md)
 - [Keywords](./Models/Keywords.md)
 - [KeywordsCommon](./Models/KeywordsCommon.md)
 - [KeywordsCreate](./Models/KeywordsCreate.md)
 - [KeywordsMetricsArrayResponse](./Models/KeywordsMetricsArrayResponse.md)
 - [KeywordsRequest](./Models/KeywordsRequest.md)
 - [KeywordsUpdate](./Models/KeywordsUpdate.md)
 - [Label](./Models/Label.md)
 - [LabelBulkCreateRequest](./Models/LabelBulkCreateRequest.md)
 - [LabelBulkUpdateRequest](./Models/LabelBulkUpdateRequest.md)
 - [LabelCreateItem](./Models/LabelCreateItem.md)
 - [LabelCreateRequest](./Models/LabelCreateRequest.md)
 - [LabelError](./Models/LabelError.md)
 - [LabelErrorData](./Models/LabelErrorData.md)
 - [LabelParentType](./Models/LabelParentType.md)
 - [LabelStatus](./Models/LabelStatus.md)
 - [LabelStatusBulkUpdate](./Models/LabelStatusBulkUpdate.md)
 - [LabelType](./Models/LabelType.md)
 - [LabelUpdateItem](./Models/LabelUpdateItem.md)
 - [LabelUpdateRequest](./Models/LabelUpdateRequest.md)
 - [LabeledEntities](./Models/LabeledEntities.md)
 - [LabeledEntitiesCreate](./Models/LabeledEntitiesCreate.md)
 - [LabelsResponse](./Models/LabelsResponse.md)
 - [Language](./Models/Language.md)
 - [LeadForm](./Models/LeadForm.md)
 - [LeadFormBatchUpdate](./Models/LeadFormBatchUpdate.md)
 - [LeadFormCreate](./Models/LeadFormCreate.md)
 - [LeadFormPolicyLink](./Models/LeadFormPolicyLink.md)
 - [LeadFormQuestion](./Models/LeadFormQuestion.md)
 - [LeadFormQuestionFieldType](./Models/LeadFormQuestionFieldType.md)
 - [LeadFormQuestionType](./Models/LeadFormQuestionType.md)
 - [LeadFormStatus](./Models/LeadFormStatus.md)
 - [LeadFormTest](./Models/LeadFormTest.md)
 - [LeadFormTestCreate](./Models/LeadFormTestCreate.md)
 - [LeadSubscription](./Models/LeadSubscription.md)
 - [LeadSubscriptionCreate](./Models/LeadSubscriptionCreate.md)
 - [LeadSubscriptionPostParams](./Models/LeadSubscriptionPostParams.md)
 - [LeadSubscriptionPostParamsCreate](./Models/LeadSubscriptionPostParamsCreate.md)
 - [LeadsExportResponseData](./Models/LeadsExportResponseData.md)
 - [LeadsExportStatus](./Models/LeadsExportStatus.md)
 - [LeadsExports](./Models/LeadsExports.md)
 - [LeadsExportsCreate](./Models/LeadsExportsCreate.md)
 - [LineItem](./Models/LineItem.md)
 - [LinkFilter](./Models/LinkFilter.md)
 - [LinkedBusiness](./Models/LinkedBusiness.md)
 - [LocalInventoryCreateOperation](./Models/LocalInventoryCreateOperation.md)
 - [LocalInventoryDeleteOperation](./Models/LocalInventoryDeleteOperation.md)
 - [LocalInventoryItemResponse](./Models/LocalInventoryItemResponse.md)
 - [LocalInventoryItemsBatch](./Models/LocalInventoryItemsBatch.md)
 - [LocalInventoryItemsBatchCreate](./Models/LocalInventoryItemsBatchCreate.md)
 - [LocalInventoryItemsGet](./Models/LocalInventoryItemsGet.md)
 - [LocalInventoryItemsGetCreate](./Models/LocalInventoryItemsGetCreate.md)
 - [LocalInventoryOperation](./Models/LocalInventoryOperation.md)
 - [LocalInventoryOperationResult](./Models/LocalInventoryOperationResult.md)
 - [LocalInventoryUpdateOperation](./Models/LocalInventoryUpdateOperation.md)
 - [LocalInventoryUpsertOperation](./Models/LocalInventoryUpsertOperation.md)
 - [LocalStore](./Models/LocalStore.md)
 - [LocalStoreBatchUpdate](./Models/LocalStoreBatchUpdate.md)
 - [LocalStoreCreate](./Models/LocalStoreCreate.md)
 - [LookbackPeriodOptions](./Models/LookbackPeriodOptions.md)
 - [MMMReport](./Models/MMMReport.md)
 - [MMMReportCreate](./Models/MMMReportCreate.md)
 - [MMMReportGranularity](./Models/MMMReportGranularity.md)
 - [MMMReportLevel](./Models/MMMReportLevel.md)
 - [MMMReportingColumn](./Models/MMMReportingColumn.md)
 - [MMMReportingTargetingType](./Models/MMMReportingTargetingType.md)
 - [MatchType](./Models/MatchType.md)
 - [MatchTypeResponse](./Models/MatchTypeResponse.md)
 - [MaxPriceFilter](./Models/MaxPriceFilter.md)
 - [Media](./Models/Media.md)
 - [MediaType](./Models/MediaType.md)
 - [MediaTypeFilter](./Models/MediaTypeFilter.md)
 - [MediaUpload](./Models/MediaUpload.md)
 - [MediaUploadCreate](./Models/MediaUploadCreate.md)
 - [MediaUploadParameters](./Models/MediaUploadParameters.md)
 - [MediaUploadStatus](./Models/MediaUploadStatus.md)
 - [MediaUploadType](./Models/MediaUploadType.md)
 - [MemberBusinessRole](./Models/MemberBusinessRole.md)
 - [MetricsReportingLevel](./Models/MetricsReportingLevel.md)
 - [MetricsReportingTemplateType](./Models/MetricsReportingTemplateType.md)
 - [MetricsResponse](./Models/MetricsResponse.md)
 - [MetricsResponseDataItems](./Models/MetricsResponseDataItems.md)
 - [MinPriceFilter](./Models/MinPriceFilter.md)
 - [MobileAppPlatform](./Models/MobileAppPlatform.md)
 - [MsotEventName](./Models/MsotEventName.md)
 - [MultiPinsAnalyticsMetricTypesItem](./Models/MultiPinsAnalyticsMetricTypesItem.md)
 - [NetworkType](./Models/NetworkType.md)
 - [NonDraftEntityStatus](./Models/NonDraftEntityStatus.md)
 - [NonNullableCatalogsCurrency](./Models/NonNullableCatalogsCurrency.md)
 - [NotificationPostRequest](./Models/NotificationPostRequest.md)
 - [NotificationResponse](./Models/NotificationResponse.md)
 - [NullableCatalogsItemFieldType](./Models/NullableCatalogsItemFieldType.md)
 - [NullableCurrency](./Models/NullableCurrency.md)
 - [NullableEntityStatus](./Models/NullableEntityStatus.md)
 - [NullableLabelStatus](./Models/NullableLabelStatus.md)
 - [NullableLabelType](./Models/NullableLabelType.md)
 - [NullableOptimizationGoalMetadata](./Models/NullableOptimizationGoalMetadata.md)
 - [NullablePartnerType](./Models/NullablePartnerType.md)
 - [NullalbleMatchType](./Models/NullalbleMatchType.md)
 - [NumericFilterOperatorType](./Models/NumericFilterOperatorType.md)
 - [OauthAccessToken](./Models/OauthAccessToken.md)
 - [ObjectiveType](./Models/ObjectiveType.md)
 - [OperationType](./Models/OperationType.md)
 - [OptimizationGoalMetadata](./Models/OptimizationGoalMetadata.md)
 - [OptimizationType](./Models/OptimizationType.md)
 - [Order](./Models/Order.md)
 - [OrderLine](./Models/OrderLine.md)
 - [OrderLineMutationError](./Models/OrderLineMutationError.md)
 - [OrderLineMutationResponse](./Models/OrderLineMutationResponse.md)
 - [OrderLineMutationResult](./Models/OrderLineMutationResult.md)
 - [OrderLinePaidType](./Models/OrderLinePaidType.md)
 - [OrderLineStatus](./Models/OrderLineStatus.md)
 - [OsFamily](./Models/OsFamily.md)
 - [OverallStatusOptions](./Models/OverallStatusOptions.md)
 - [PacingDeliveryType](./Models/PacingDeliveryType.md)
 - [PartnerMetadata](./Models/PartnerMetadata.md)
 - [PartnerType](./Models/PartnerType.md)
 - [PerformancePlusCampaignSettings](./Models/PerformancePlusCampaignSettings.md)
 - [Permissions](./Models/Permissions.md)
 - [PermissionsWithOwner](./Models/PermissionsWithOwner.md)
 - [Pin](./Models/Pin.md)
 - [PinAnalyticsDailyMetrics](./Models/PinAnalyticsDailyMetrics.md)
 - [PinAnalyticsMetricsResponse](./Models/PinAnalyticsMetricsResponse.md)
 - [PinBase](./Models/PinBase.md)
 - [PinCreate](./Models/PinCreate.md)
 - [PinFilter](./Models/PinFilter.md)
 - [PinMedia](./Models/PinMedia.md)
 - [PinMediaMetadata](./Models/PinMediaMetadata.md)
 - [PinMediaSource](./Models/PinMediaSource.md)
 - [PinMediaSourceImageBase64](./Models/PinMediaSourceImageBase64.md)
 - [PinMediaSourceImageURL](./Models/PinMediaSourceImageURL.md)
 - [PinMediaSourceImagesBase64](./Models/PinMediaSourceImagesBase64.md)
 - [PinMediaSourceImagesBase64Item](./Models/PinMediaSourceImagesBase64Item.md)
 - [PinMediaSourceImagesURL](./Models/PinMediaSourceImagesURL.md)
 - [PinMediaSourceImagesURLItem](./Models/PinMediaSourceImagesURLItem.md)
 - [PinMediaSourcePinURL](./Models/PinMediaSourcePinURL.md)
 - [PinMediaSourceVideoID](./Models/PinMediaSourceVideoID.md)
 - [PinMediaWithImage](./Models/PinMediaWithImage.md)
 - [PinMediaWithImageAndVideo](./Models/PinMediaWithImageAndVideo.md)
 - [PinMediaWithImages](./Models/PinMediaWithImages.md)
 - [PinMediaWithVideo](./Models/PinMediaWithVideo.md)
 - [PinMediaWithVideos](./Models/PinMediaWithVideos.md)
 - [PinPromotionSummaryStatus](./Models/PinPromotionSummaryStatus.md)
 - [PinRead](./Models/PinRead.md)
 - [PinType](./Models/PinType.md)
 - [PinUpdate](./Models/PinUpdate.md)
 - [PinnerListType](./Models/PinnerListType.md)
 - [PinsSaveRequestCreate](./Models/PinsSaveRequestCreate.md)
 - [Pinterest.Lib.BatchItemException](./Models/Pinterest.Lib.BatchItemException.md)
 - [Pinterest.Lib.Error](./Models/Pinterest.Lib.Error.md)
 - [Pinterest.Lib.PaginationOrder](./Models/Pinterest.Lib.PaginationOrder.md)
 - [Pinterest.Lib.Status204](./Models/Pinterest.Lib.Status204.md)
 - [PinterestProductCategoriesFilter](./Models/PinterestProductCategoriesFilter.md)
 - [PlacementGroupType](./Models/PlacementGroupType.md)
 - [PlacementMultipliers](./Models/PlacementMultipliers.md)
 - [PlacementTrafficType](./Models/PlacementTrafficType.md)
 - [PlacementType](./Models/PlacementType.md)
 - [PredictedTimeSeries](./Models/PredictedTimeSeries.md)
 - [PreferredMediaType](./Models/PreferredMediaType.md)
 - [PriceFilter](./Models/PriceFilter.md)
 - [PriceFilterPrice](./Models/PriceFilterPrice.md)
 - [PrimarySort](./Models/PrimarySort.md)
 - [ProductAvailability](./Models/ProductAvailability.md)
 - [ProductAvailabilityType](./Models/ProductAvailabilityType.md)
 - [ProductCategoriesDemographic](./Models/ProductCategoriesDemographic.md)
 - [ProductCategoriesEngagementType](./Models/ProductCategoriesEngagementType.md)
 - [ProductCategoriesMetricsHighlights](./Models/ProductCategoriesMetricsHighlights.md)
 - [ProductCategoryDetailLookbackWindow](./Models/ProductCategoryDetailLookbackWindow.md)
 - [ProductCategoryDetails](./Models/ProductCategoryDetails.md)
 - [ProductCategoryEnum](./Models/ProductCategoryEnum.md)
 - [ProductCategoryRegion](./Models/ProductCategoryRegion.md)
 - [ProductCondition](./Models/ProductCondition.md)
 - [ProductGroupAnalyticsItems](./Models/ProductGroupAnalyticsItems.md)
 - [ProductGroupPromotion](./Models/ProductGroupPromotion.md)
 - [ProductGroupPromotionCreateRequest](./Models/ProductGroupPromotionCreateRequest.md)
 - [ProductGroupPromotionCustomizableCTAType](./Models/ProductGroupPromotionCustomizableCTAType.md)
 - [ProductGroupPromotionResponseItem](./Models/ProductGroupPromotionResponseItem.md)
 - [ProductGroupPromotionUpdateRequest](./Models/ProductGroupPromotionUpdateRequest.md)
 - [ProductGroupPromotions](./Models/ProductGroupPromotions.md)
 - [ProductGroupPromotionsCreate](./Models/ProductGroupPromotionsCreate.md)
 - [ProductGroupPromotionsUpdateWithRequiredBody](./Models/ProductGroupPromotionsUpdateWithRequiredBody.md)
 - [ProductGroupReferenceFilter](./Models/ProductGroupReferenceFilter.md)
 - [ProductGroupSummaryStatus](./Models/ProductGroupSummaryStatus.md)
 - [ProductTagItem](./Models/ProductTagItem.md)
 - [ProductTagsBulkAddRequest](./Models/ProductTagsBulkAddRequest.md)
 - [ProductTagsBulkDeleteRequest](./Models/ProductTagsBulkDeleteRequest.md)
 - [ProductTagsError](./Models/ProductTagsError.md)
 - [ProductTagsResponse](./Models/ProductTagsResponse.md)
 - [ProductType0Filter](./Models/ProductType0Filter.md)
 - [ProductType1Filter](./Models/ProductType1Filter.md)
 - [ProductType2Filter](./Models/ProductType2Filter.md)
 - [ProductType3Filter](./Models/ProductType3Filter.md)
 - [ProductType4Filter](./Models/ProductType4Filter.md)
 - [Promotion](./Models/Promotion.md)
 - [PromotionApplicationLevel](./Models/PromotionApplicationLevel.md)
 - [PromotionArrayElement](./Models/PromotionArrayElement.md)
 - [PromotionBatchUpdate](./Models/PromotionBatchUpdate.md)
 - [PromotionCreate](./Models/PromotionCreate.md)
 - [PromotionTemplateValue](./Models/PromotionTemplateValue.md)
 - [PromotionType](./Models/PromotionType.md)
 - [PromotionsResponse](./Models/PromotionsResponse.md)
 - [PublicTargetingType](./Models/PublicTargetingType.md)
 - [QualityComponentDetails](./Models/QualityComponentDetails.md)
 - [QualityComponentIssue](./Models/QualityComponentIssue.md)
 - [QualityComponents](./Models/QualityComponents.md)
 - [QueryLabelEntityStatusesItems](./Models/QueryLabelEntityStatusesItems.md)
 - [QueryLabelTypesItems](./Models/QueryLabelTypesItems.md)
 - [QuerymetrictypesItems](./Models/QuerymetrictypesItems.md)
 - [QuerypinanalyticsmetrictypesItems](./Models/QuerypinanalyticsmetrictypesItems.md)
 - [QueryvideopinmetrictypesItems](./Models/QueryvideopinmetrictypesItems.md)
 - [QuizPinData](./Models/QuizPinData.md)
 - [QuizPinOption](./Models/QuizPinOption.md)
 - [QuizPinQuestion](./Models/QuizPinQuestion.md)
 - [QuizPinResult](./Models/QuizPinResult.md)
 - [RecordCounts](./Models/RecordCounts.md)
 - [RelatedTerms](./Models/RelatedTerms.md)
 - [RelatedTermsRelatedTermsListItems](./Models/RelatedTermsRelatedTermsListItems.md)
 - [ReportType](./Models/ReportType.md)
 - [ReportingColumn](./Models/ReportingColumn.md)
 - [ReportingColumnAsync](./Models/ReportingColumnAsync.md)
 - [ReportingColumnSync](./Models/ReportingColumnSync.md)
 - [ReportingTimeZone](./Models/ReportingTimeZone.md)
 - [RespondToInviteResultItem](./Models/RespondToInviteResultItem.md)
 - [RespondToInvitesResponseArray](./Models/RespondToInvitesResponseArray.md)
 - [RetailLocalInventoryItemAttributes](./Models/RetailLocalInventoryItemAttributes.md)
 - [RetailLocalInventoryItemAttributesOptional](./Models/RetailLocalInventoryItemAttributesOptional.md)
 - [Role](./Models/Role.md)
 - [S3FilePart](./Models/S3FilePart.md)
 - [S3MultipartUploadData](./Models/S3MultipartUploadData.md)
 - [SSIOAccount](./Models/SSIOAccount.md)
 - [SSIOAccountAddress](./Models/SSIOAccountAddress.md)
 - [SSIOAccountItem](./Models/SSIOAccountItem.md)
 - [SSIOAccountPMPName](./Models/SSIOAccountPMPName.md)
 - [SSIOInsertionOrder](./Models/SSIOInsertionOrder.md)
 - [SSIOInsertionOrderCreate](./Models/SSIOInsertionOrderCreate.md)
 - [SSIOInsertionOrderStatus](./Models/SSIOInsertionOrderStatus.md)
 - [SSIOInsertionOrderStatusResponse](./Models/SSIOInsertionOrderStatusResponse.md)
 - [SSIOInsertionOrderUpdate](./Models/SSIOInsertionOrderUpdate.md)
 - [SSIOOrderLine](./Models/SSIOOrderLine.md)
 - [SSIOOrderLineType](./Models/SSIOOrderLineType.md)
 - [Schedule](./Models/Schedule.md)
 - [ScheduleAction](./Models/ScheduleAction.md)
 - [ScheduleAgeBucketMultipliers](./Models/ScheduleAgeBucketMultipliers.md)
 - [ScheduleAppTypeMultipliers](./Models/ScheduleAppTypeMultipliers.md)
 - [ScheduleAudienceMultipliers](./Models/ScheduleAudienceMultipliers.md)
 - [ScheduleBatchUpdate](./Models/ScheduleBatchUpdate.md)
 - [ScheduleBidMultipliers](./Models/ScheduleBidMultipliers.md)
 - [ScheduleBidOptions](./Models/ScheduleBidOptions.md)
 - [ScheduleBidOptions_gender_multipliers](./Models/ScheduleBidOptions_gender_multipliers.md)
 - [ScheduleBidOptions_placement_multipliers](./Models/ScheduleBidOptions_placement_multipliers.md)
 - [ScheduleCommonDeltaValue](./Models/ScheduleCommonDeltaValue.md)
 - [ScheduleCreate](./Models/ScheduleCreate.md)
 - [ScheduleCreateRequest](./Models/ScheduleCreateRequest.md)
 - [ScheduleCreateRequestAllOf1](./Models/ScheduleCreateRequestAllOf1.md)
 - [ScheduleGenderMultipliers](./Models/ScheduleGenderMultipliers.md)
 - [SchedulePlacementMultipliers](./Models/SchedulePlacementMultipliers.md)
 - [ScheduleStatus](./Models/ScheduleStatus.md)
 - [ScheduleType](./Models/ScheduleType.md)
 - [ScheduleUpdateRequest](./Models/ScheduleUpdateRequest.md)
 - [ScheduleUpdateRequestAllOf1](./Models/ScheduleUpdateRequestAllOf1.md)
 - [Schedule_delta_value](./Models/Schedule_delta_value.md)
 - [ScrollupGoalMetadata](./Models/ScrollupGoalMetadata.md)
 - [SharedAudienceAccount](./Models/SharedAudienceAccount.md)
 - [SingleInterestTargetingOption](./Models/SingleInterestTargetingOption.md)
 - [SourcePlatformOptions](./Models/SourcePlatformOptions.md)
 - [StandardPinMetricTypes](./Models/StandardPinMetricTypes.md)
 - [StoreMetadata](./Models/StoreMetadata.md)
 - [SummaryPin](./Models/SummaryPin.md)
 - [SummaryStatus](./Models/SummaryStatus.md)
 - [SupplementalItemBatchOperationStatus](./Models/SupplementalItemBatchOperationStatus.md)
 - [SupplementalItemProcessingStatus](./Models/SupplementalItemProcessingStatus.md)
 - [SupplementalItemValidationEvent](./Models/SupplementalItemValidationEvent.md)
 - [SupplementalItemsBatchResponse](./Models/SupplementalItemsBatchResponse.md)
 - [SupplementalOperationResult](./Models/SupplementalOperationResult.md)
 - [SystemUserUpdateWithRequiredBody](./Models/SystemUserUpdateWithRequiredBody.md)
 - [TargetingAdvertiserCountry](./Models/TargetingAdvertiserCountry.md)
 - [TargetingSpec](./Models/TargetingSpec.md)
 - [TargetingSpecAgeBucket](./Models/TargetingSpecAgeBucket.md)
 - [TargetingSpecAppType](./Models/TargetingSpecAppType.md)
 - [TargetingSpecGender](./Models/TargetingSpecGender.md)
 - [TargetingSpecListOperation](./Models/TargetingSpecListOperation.md)
 - [TargetingSpecOperationAgeBucket](./Models/TargetingSpecOperationAgeBucket.md)
 - [TargetingSpecOperationAppType](./Models/TargetingSpecOperationAppType.md)
 - [TargetingSpecOperationAudienceExclude](./Models/TargetingSpecOperationAudienceExclude.md)
 - [TargetingSpecOperationAudienceInclude](./Models/TargetingSpecOperationAudienceInclude.md)
 - [TargetingSpecOperationGender](./Models/TargetingSpecOperationGender.md)
 - [TargetingSpecOperationGeo](./Models/TargetingSpecOperationGeo.md)
 - [TargetingSpecOperationGeoExclude](./Models/TargetingSpecOperationGeoExclude.md)
 - [TargetingSpecOperationInterest](./Models/TargetingSpecOperationInterest.md)
 - [TargetingSpecOperationLocale](./Models/TargetingSpecOperationLocale.md)
 - [TargetingSpecOperationLocation](./Models/TargetingSpecOperationLocation.md)
 - [TargetingSpecOperationLocationExclude](./Models/TargetingSpecOperationLocationExclude.md)
 - [TargetingSpecOperationMaximumAge](./Models/TargetingSpecOperationMaximumAge.md)
 - [TargetingSpecOperationMinimumAge](./Models/TargetingSpecOperationMinimumAge.md)
 - [TargetingSpecOperationShoppingRetargeting](./Models/TargetingSpecOperationShoppingRetargeting.md)
 - [TargetingSpecOperations](./Models/TargetingSpecOperations.md)
 - [TargetingSpecOptimal](./Models/TargetingSpecOptimal.md)
 - [TargetingSpecShoppingRetargeting](./Models/TargetingSpecShoppingRetargeting.md)
 - [TargetingSpecTargetingStrategyItems](./Models/TargetingSpecTargetingStrategyItems.md)
 - [TargetingStrategy](./Models/TargetingStrategy.md)
 - [TargetingTemplate](./Models/TargetingTemplate.md)
 - [TargetingTemplateAudienceSizing](./Models/TargetingTemplateAudienceSizing.md)
 - [TargetingTemplateAudienceSizingReachEstimate](./Models/TargetingTemplateAudienceSizingReachEstimate.md)
 - [TargetingTemplateCreate](./Models/TargetingTemplateCreate.md)
 - [TargetingTemplateKeyword](./Models/TargetingTemplateKeyword.md)
 - [TargetingTemplateStatus](./Models/TargetingTemplateStatus.md)
 - [TargetingTemplateUpdateRequestReadOrUpdate](./Models/TargetingTemplateUpdateRequestReadOrUpdate.md)
 - [TemplateBasedReport](./Models/TemplateBasedReport.md)
 - [TemplateBasedReportCreate](./Models/TemplateBasedReportCreate.md)
 - [TermsOfService](./Models/TermsOfService.md)
 - [TieBreakerType](./Models/TieBreakerType.md)
 - [TimeSeries](./Models/TimeSeries.md)
 - [TitleKeywordsFilter](./Models/TitleKeywordsFilter.md)
 - [TokenGrantType](./Models/TokenGrantType.md)
 - [TokenTypeHint](./Models/TokenTypeHint.md)
 - [TopPinsAnalyticsResponse](./Models/TopPinsAnalyticsResponse.md)
 - [TopPinsAnalyticsResponseDateAvailability](./Models/TopPinsAnalyticsResponseDateAvailability.md)
 - [TopPinsAnalyticsResponsePinsItems](./Models/TopPinsAnalyticsResponsePinsItems.md)
 - [TopPinsSortBy](./Models/TopPinsSortBy.md)
 - [TopVideoPinsAnalyticsResponse](./Models/TopVideoPinsAnalyticsResponse.md)
 - [TopVideoPinsAnalyticsResponseDateAvailability](./Models/TopVideoPinsAnalyticsResponseDateAvailability.md)
 - [TopVideoPinsAnalyticsResponsePinsItems](./Models/TopVideoPinsAnalyticsResponsePinsItems.md)
 - [TopVideoPinsSortBy](./Models/TopVideoPinsSortBy.md)
 - [TotalCountByEntityStatus](./Models/TotalCountByEntityStatus.md)
 - [TrackingUrls](./Models/TrackingUrls.md)
 - [TrendType](./Models/TrendType.md)
 - [TrendingKeyword](./Models/TrendingKeyword.md)
 - [TrendingKeywordDemographics](./Models/TrendingKeywordDemographics.md)
 - [TrendingKeywordsResponse](./Models/TrendingKeywordsResponse.md)
 - [TrendingPin](./Models/TrendingPin.md)
 - [TrendingProductCategory](./Models/TrendingProductCategory.md)
 - [TrendingTopic](./Models/TrendingTopic.md)
 - [TrendsAgeBucket](./Models/TrendsAgeBucket.md)
 - [TrendsAgeDistribution](./Models/TrendsAgeDistribution.md)
 - [TrendsEditorial](./Models/TrendsEditorial.md)
 - [TrendsGender](./Models/TrendsGender.md)
 - [TrendsGenderDistribution](./Models/TrendsGenderDistribution.md)
 - [TrendsGenderFilter](./Models/TrendsGenderFilter.md)
 - [TrendsL1Interest](./Models/TrendsL1Interest.md)
 - [TrendsSupportedRegion](./Models/TrendsSupportedRegion.md)
 - [UpdatableItemAttributes](./Models/UpdatableItemAttributes.md)
 - [UpdatableItemAttributesGtin](./Models/UpdatableItemAttributesGtin.md)
 - [UpdateBusinessMembershipsResponse](./Models/UpdateBusinessMembershipsResponse.md)
 - [UpdateInvitesResultsResponseArray](./Models/UpdateInvitesResultsResponseArray.md)
 - [UpdateMaskBidOptionField](./Models/UpdateMaskBidOptionField.md)
 - [UpdateMaskFieldType](./Models/UpdateMaskFieldType.md)
 - [UpdateMemberAssetAccessBody](./Models/UpdateMemberAssetAccessBody.md)
 - [UpdateMemberAssetAccessItem](./Models/UpdateMemberAssetAccessItem.md)
 - [UpdateMemberAssetResultItem](./Models/UpdateMemberAssetResultItem.md)
 - [UpdateMemberAssetsResultsResponseArray](./Models/UpdateMemberAssetsResultsResponseArray.md)
 - [UpdatePartnerAssetAccessBody](./Models/UpdatePartnerAssetAccessBody.md)
 - [UpdatePartnerAssetAccessItem](./Models/UpdatePartnerAssetAccessItem.md)
 - [UpdatePartnerAssetsResult](./Models/UpdatePartnerAssetsResult.md)
 - [UpdatePartnerAssetsResultsResponseArray](./Models/UpdatePartnerAssetsResultsResponseArray.md)
 - [UserAccountType](./Models/UserAccountType.md)
 - [UserBusinessRoleBinding](./Models/UserBusinessRoleBinding.md)
 - [UserFollowingFeedType](./Models/UserFollowingFeedType.md)
 - [UserListOperationType](./Models/UserListOperationType.md)
 - [UserListType](./Models/UserListType.md)
 - [UserSingleAssetBinding](./Models/UserSingleAssetBinding.md)
 - [UserWebsite](./Models/UserWebsite.md)
 - [UserWebsiteCreate](./Models/UserWebsiteCreate.md)
 - [UserWebsiteVerification](./Models/UserWebsiteVerification.md)
 - [UsersForIndividualAssetResponse](./Models/UsersForIndividualAssetResponse.md)
 - [VerticalProductCategory](./Models/VerticalProductCategory.md)
 - [VideoMetadataWithItemType](./Models/VideoMetadataWithItemType.md)
 - [VideoPinMetricTypes](./Models/VideoPinMetricTypes.md)
 - [WebsiteVerificationMethod](./Models/WebsiteVerificationMethod.md)
 - [WorkloadState](./Models/WorkloadState.md)
 - [ad_account_countries_get_200_response](./Models/ad_account_countries_get_200_response.md)
 - [ad_accounts_audiences_shared_accounts_list_200_response](./Models/ad_accounts_audiences_shared_accounts_list_200_response.md)
 - [ad_accounts_list_200_response](./Models/ad_accounts_list_200_response.md)
 - [ad_accounts_subscriptions_get_list_200_response](./Models/ad_accounts_subscriptions_get_list_200_response.md)
 - [ad_groups_create_200_response](./Models/ad_groups_create_200_response.md)
 - [ad_groups_create_200_response_items_inner](./Models/ad_groups_create_200_response_items_inner.md)
 - [ad_groups_list_200_response](./Models/ad_groups_list_200_response.md)
 - [ads_credits_discounts_get_200_response](./Models/ads_credits_discounts_get_200_response.md)
 - [ads_list_200_response](./Models/ads_list_200_response.md)
 - [advertiser_defined_events_create_200_response](./Models/advertiser_defined_events_create_200_response.md)
 - [advertiser_defined_events_get_200_response](./Models/advertiser_defined_events_get_200_response.md)
 - [audience_insights_scope_and_type_get_200_response](./Models/audience_insights_scope_and_type_get_200_response.md)
 - [audiences_list_200_response](./Models/audiences_list_200_response.md)
 - [billing_invoices_get_200_response](./Models/billing_invoices_get_200_response.md)
 - [billing_profiles_get_200_response](./Models/billing_profiles_get_200_response.md)
 - [board_sections_list_200_response](./Models/board_sections_list_200_response.md)
 - [boards_list_200_response](./Models/boards_list_200_response.md)
 - [boards_list_pins_200_response](./Models/boards_list_pins_200_response.md)
 - [business_asset_members_get_200_response](./Models/business_asset_members_get_200_response.md)
 - [business_assets_get_200_response](./Models/business_assets_get_200_response.md)
 - [business_partner_asset_access_get_200_response](./Models/business_partner_asset_access_get_200_response.md)
 - [campaign_ad_preview_create_200_response_inner](./Models/campaign_ad_preview_create_200_response_inner.md)
 - [campaign_ad_preview_create_200_response_inner_data](./Models/campaign_ad_preview_create_200_response_inner_data.md)
 - [campaign_ad_preview_create_200_response_inner_data_oneOf](./Models/campaign_ad_preview_create_200_response_inner_data_oneOf.md)
 - [campaign_ad_preview_delete_200_response_inner](./Models/campaign_ad_preview_delete_200_response_inner.md)
 - [campaign_ad_preview_delete_200_response_inner_status](./Models/campaign_ad_preview_delete_200_response_inner_status.md)
 - [campaigns_list_200_response](./Models/campaigns_list_200_response.md)
 - [catalogs_list_200_response](./Models/catalogs_list_200_response.md)
 - [catalogs_local_stores_create_200_response_inner](./Models/catalogs_local_stores_create_200_response_inner.md)
 - [catalogs_local_stores_create_200_response_inner_data](./Models/catalogs_local_stores_create_200_response_inner_data.md)
 - [catalogs_local_stores_create_200_response_inner_data_oneOf](./Models/catalogs_local_stores_create_200_response_inner_data_oneOf.md)
 - [catalogs_local_stores_delete_200_response_inner](./Models/catalogs_local_stores_delete_200_response_inner.md)
 - [catalogs_local_stores_list_200_response](./Models/catalogs_local_stores_list_200_response.md)
 - [catalogs_product_group_pins_list_200_response](./Models/catalogs_product_group_pins_list_200_response.md)
 - [catalogs_product_groups_list_200_response](./Models/catalogs_product_groups_list_200_response.md)
 - [conversion_deletion_request_list_200_response](./Models/conversion_deletion_request_list_200_response.md)
 - [conversion_tags_list_200_response](./Models/conversion_tags_list_200_response.md)
 - [customer_lists_list_200_response](./Models/customer_lists_list_200_response.md)
 - [customer_segment_list_200_response](./Models/customer_segment_list_200_response.md)
 - [delete_business_membership_200_response](./Models/delete_business_membership_200_response.md)
 - [delivery_metrics_get_200_response](./Models/delivery_metrics_get_200_response.md)
 - [feed_processing_results_list_200_response](./Models/feed_processing_results_list_200_response.md)
 - [feeds_list_200_response](./Models/feeds_list_200_response.md)
 - [followers_list_200_response](./Models/followers_list_200_response.md)
 - [get_business_employers_200_response](./Models/get_business_employers_200_response.md)
 - [get_invites_200_response](./Models/get_invites_200_response.md)
 - [integrations_get_list_200_response](./Models/integrations_get_list_200_response.md)
 - [items_issues_list_200_response](./Models/items_issues_list_200_response.md)
 - [items_post_200_response](./Models/items_post_200_response.md)
 - [keywords_get_200_response](./Models/keywords_get_200_response.md)
 - [labels_list_200_response](./Models/labels_list_200_response.md)
 - [lead_forms_create_200_response](./Models/lead_forms_create_200_response.md)
 - [lead_forms_create_200_response_items_inner](./Models/lead_forms_create_200_response_items_inner.md)
 - [lead_forms_list_200_response](./Models/lead_forms_list_200_response.md)
 - [media_list_200_response](./Models/media_list_200_response.md)
 - [order_lines_list_200_response](./Models/order_lines_list_200_response.md)
 - [page_visit_conversion_tags_get_200_response](./Models/page_visit_conversion_tags_get_200_response.md)
 - [pins_list_200_response](./Models/pins_list_200_response.md)
 - [product_group_promotions_list_200_response](./Models/product_group_promotions_list_200_response.md)
 - [promotions_list_200_response](./Models/promotions_list_200_response.md)
 - [reports_stats_200_response](./Models/reports_stats_200_response.md)
 - [schedules_create_200_response_inner](./Models/schedules_create_200_response_inner.md)
 - [schedules_create_200_response_inner_data](./Models/schedules_create_200_response_inner_data.md)
 - [schedules_create_200_response_inner_data_oneOf](./Models/schedules_create_200_response_inner_data_oneOf.md)
 - [schedules_list_200_response](./Models/schedules_list_200_response.md)
 - [search_partner_pins_200_response](./Models/search_partner_pins_200_response.md)
 - [shared_audiences_for_business_list_200_response](./Models/shared_audiences_for_business_list_200_response.md)
 - [ssio_insertion_orders_status_get_by_ad_account_200_response](./Models/ssio_insertion_orders_status_get_by_ad_account_200_response.md)
 - [ssio_order_lines_get_by_ad_account_200_response](./Models/ssio_order_lines_get_by_ad_account_200_response.md)
 - [targeting_template_list_200_response](./Models/targeting_template_list_200_response.md)
 - [templates_list_200_response](./Models/templates_list_200_response.md)
 - [user_account_followed_interests_200_response](./Models/user_account_followed_interests_200_response.md)
 - [user_websites_get_200_response](./Models/user_websites_get_200_response.md)


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

<a name="client_credentials"></a>
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

<a name="conversion_token"></a>
### conversion_token

- **Type**: HTTP Bearer Token authentication

<a name="basic"></a>
### basic

- **Type**: HTTP basic authentication

