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
*AdAccountsApi* | [**analyticsCreateConversionProductReport**](docs/AdAccountsApi.md#analyticscreateconversionproductreport) | **POST** /ad_accounts/{ad_account_id}/reports/brand_category_sku | Create a request for a brand, category, SKU report
*AdAccountsApi* | [**analyticsCreateMmmReport**](docs/AdAccountsApi.md#analyticscreatemmmreport) | **POST** /ad_accounts/{ad_account_id}/mmm_reports | Create a request for a Marketing Mix Modeling (MMM) report
*AdAccountsApi* | [**analyticsCreateReport**](docs/AdAccountsApi.md#analyticscreatereport) | **POST** /ad_accounts/{ad_account_id}/reports | Create async request for an account analytics report
*AdAccountsApi* | [**analyticsCreateTemplateReport**](docs/AdAccountsApi.md#analyticscreatetemplatereport) | **POST** /ad_accounts/{ad_account_id}/templates/{template_id}/reports | Create async request for an analytics report using a template
*AdAccountsApi* | [**analyticsGetConversionProductReport**](docs/AdAccountsApi.md#analyticsgetconversionproductreport) | **GET** /ad_accounts/{ad_account_id}/reports/brand_category_sku | Get advertiser brand, category, SKU report
*AdAccountsApi* | [**analyticsGetMmmReport**](docs/AdAccountsApi.md#analyticsgetmmmreport) | **GET** /ad_accounts/{ad_account_id}/mmm_reports | Get advertiser Marketing Mix Modeling (MMM) report.
*AdAccountsApi* | [**analyticsGetReport**](docs/AdAccountsApi.md#analyticsgetreport) | **GET** /ad_accounts/{ad_account_id}/reports | Get the account analytics report created by the async call
*AdAccountsApi* | [**sandboxDelete**](docs/AdAccountsApi.md#sandboxdelete) | **DELETE** /ad_accounts/{ad_account_id}/sandbox | Delete ads data for ad account in API Sandbox
*AdAccountsApi* | [**templatesList**](docs/AdAccountsApi.md#templateslist) | **GET** /ad_accounts/{ad_account_id}/templates | List templates
*AdGroupsApi* | [**adGroupsAnalytics**](docs/AdGroupsApi.md#adgroupsanalytics) | **GET** /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics
*AdGroupsApi* | [**adGroupsAudienceSizing**](docs/AdGroupsApi.md#adgroupsaudiencesizing) | **POST** /ad_accounts/{ad_account_id}/ad_groups/audience_sizing | Get audience sizing
*AdGroupsApi* | [**adGroupsBidFloorGet**](docs/AdGroupsApi.md#adgroupsbidfloorget) | **POST** /ad_accounts/{ad_account_id}/bid_floor | Get bid floors
*AdGroupsApi* | [**adGroupsCreate**](docs/AdGroupsApi.md#adgroupscreate) | **POST** /ad_accounts/{ad_account_id}/ad_groups | Create ad groups
*AdGroupsApi* | [**adGroupsDynamicTitlesDownloadCsv**](docs/AdGroupsApi.md#adgroupsdynamictitlesdownloadcsv) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/csv | Get dynamic titles CSV download URL
*AdGroupsApi* | [**adGroupsDynamicTitlesGetStatus**](docs/AdGroupsApi.md#adgroupsdynamictitlesgetstatus) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/status | Get dynamic titles status
*AdGroupsApi* | [**adGroupsDynamicTitlesGetUploadUrl**](docs/AdGroupsApi.md#adgroupsdynamictitlesgetuploadurl) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/uploads | Get dynamic titles upload URL
*AdGroupsApi* | [**adGroupsDynamicTitlesProcessCsv**](docs/AdGroupsApi.md#adgroupsdynamictitlesprocesscsv) | **POST** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles | Process dynamic titles CSV
*AdGroupsApi* | [**adGroupsGet**](docs/AdGroupsApi.md#adgroupsget) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id} | Get ad group
*AdGroupsApi* | [**adGroupsList**](docs/AdGroupsApi.md#adgroupslist) | **GET** /ad_accounts/{ad_account_id}/ad_groups | List ad groups
*AdGroupsApi* | [**adGroupsTargetingAnalyticsGet**](docs/AdGroupsApi.md#adgroupstargetinganalyticsget) | **GET** /ad_accounts/{ad_account_id}/ad_groups/targeting_analytics | Get targeting analytics for ad groups
*AdGroupsApi* | [**adGroupsUpdate**](docs/AdGroupsApi.md#adgroupsupdate) | **PATCH** /ad_accounts/{ad_account_id}/ad_groups | Update ad groups
*AdGroupsApi* | [**getAdGroupsByPromotionIdsList**](docs/AdGroupsApi.md#getadgroupsbypromotionidslist) | **GET** /ad_accounts/{ad_account_id}/promotion_applied_entities | List of ad groups using promotions IDs.
*AdsApi* | [**adPreviewsCreate**](docs/AdsApi.md#adpreviewscreate) | **POST** /ad_accounts/{ad_account_id}/ad_previews | Create ad preview with pin or image
*AdsApi* | [**adTargetingAnalyticsGet**](docs/AdsApi.md#adtargetinganalyticsget) | **GET** /ad_accounts/{ad_account_id}/ads/targeting_analytics | Get targeting analytics for ads
*AdsApi* | [**adsAnalytics**](docs/AdsApi.md#adsanalytics) | **GET** /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics
*AdsApi* | [**adsCreate**](docs/AdsApi.md#adscreate) | **POST** /ad_accounts/{ad_account_id}/ads | Create ads
*AdsApi* | [**adsGet**](docs/AdsApi.md#adsget) | **GET** /ad_accounts/{ad_account_id}/ads/{ad_id} | Get ad
*AdsApi* | [**adsList**](docs/AdsApi.md#adslist) | **GET** /ad_accounts/{ad_account_id}/ads | List ads
*AdsApi* | [**adsUpdate**](docs/AdsApi.md#adsupdate) | **PATCH** /ad_accounts/{ad_account_id}/ads | Update ads
*AdsApi* | [**campaignAdPreviewCreate**](docs/AdsApi.md#campaignadpreviewcreate) | **POST** /ad_accounts/{ad_account_id}/campaign_ad_preview | Create ad preview records for one or more ad groups
*AdsApi* | [**campaignAdPreviewDelete**](docs/AdsApi.md#campaignadpreviewdelete) | **DELETE** /ad_accounts/{ad_account_id}/campaign_ad_preview | Delete ad preview records for one or more ad groups
*AdsApi* | [**campaignAdPreviewRead**](docs/AdsApi.md#campaignadpreviewread) | **GET** /ad_accounts/{ad_account_id}/campaign_ad_preview | Fetch ad preview records for one or more ad groups
*AdvancedAuctionApi* | [**advancedAuctionItemsGetPost**](docs/AdvancedAuctionApi.md#advancedauctionitemsgetpost) | **POST** /advanced_auction/items/get | Get item bid options (POST)
*AdvancedAuctionApi* | [**advancedAuctionItemsSubmitPost**](docs/AdvancedAuctionApi.md#advancedauctionitemssubmitpost) | **POST** /advanced_auction/items/submit | Operate on item level bid options
*AudienceInsightsApi* | [**audienceInsightsGet**](docs/AudienceInsightsApi.md#audienceinsightsget) | **GET** /ad_accounts/{ad_account_id}/audience_insights | Get audience insights
*AudienceInsightsApi* | [**audienceInsightsScopeAndTypeGet**](docs/AudienceInsightsApi.md#audienceinsightsscopeandtypeget) | **GET** /ad_accounts/{ad_account_id}/insights/audiences | Get audience insights scope and type
*AudienceSharingApi* | [**adAccountsAudiencesSharedAccountsList**](docs/AudienceSharingApi.md#adaccountsaudiencessharedaccountslist) | **GET** /ad_accounts/{ad_account_id}/audiences/shared/accounts | List accounts with access to an audience owned by an ad account
*AudienceSharingApi* | [**businessAccountAudiencesSharedAccountsList**](docs/AudienceSharingApi.md#businessaccountaudiencessharedaccountslist) | **GET** /businesses/{business_id}/audiences/shared/accounts | List accounts with access to an audience owned by a business
*AudienceSharingApi* | [**sharedAudiencesForBusinessList**](docs/AudienceSharingApi.md#sharedaudiencesforbusinesslist) | **GET** /businesses/{business_id}/audiences | List received audiences for a business
*AudienceSharingApi* | [**updateAdAccountToAdAccountSharedAudience**](docs/AudienceSharingApi.md#updateadaccounttoadaccountsharedaudience) | **PATCH** /ad_accounts/{ad_account_id}/audiences/ad_accounts/shared | Update audience sharing between ad accounts
*AudienceSharingApi* | [**updateAdAccountToBusinessSharedAudience**](docs/AudienceSharingApi.md#updateadaccounttobusinesssharedaudience) | **PATCH** /ad_accounts/{ad_account_id}/audiences/businesses/shared | Update audience sharing from an ad account to businesses
*AudienceSharingApi* | [**updateBusinessToAdAccountSharedAudience**](docs/AudienceSharingApi.md#updatebusinesstoadaccountsharedaudience) | **PATCH** /businesses/{business_id}/audiences/ad_accounts/shared | Update audience sharing from a business to ad accounts
*AudienceSharingApi* | [**updateBusinessToBusinessSharedAudience**](docs/AudienceSharingApi.md#updatebusinesstobusinesssharedaudience) | **PATCH** /businesses/{business_id}/audiences/businesses/shared | Update audience sharing between businesses
*AudiencesApi* | [**audiencesCreate**](docs/AudiencesApi.md#audiencescreate) | **POST** /ad_accounts/{ad_account_id}/audiences | Create audience
*AudiencesApi* | [**audiencesGet**](docs/AudiencesApi.md#audiencesget) | **GET** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Get audience
*AudiencesApi* | [**audiencesList**](docs/AudiencesApi.md#audienceslist) | **GET** /ad_accounts/{ad_account_id}/audiences | List audiences
*AudiencesApi* | [**audiencesUpdate**](docs/AudiencesApi.md#audiencesupdate) | **PATCH** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Update audience
*BillingApi* | [**adsCreditRedeem**](docs/BillingApi.md#adscreditredeem) | **POST** /ad_accounts/{ad_account_id}/ads_credit/redeem | Redeem ad credits
*BillingApi* | [**adsCreditsDiscountsGet**](docs/BillingApi.md#adscreditsdiscountsget) | **GET** /ad_accounts/{ad_account_id}/ads_credit/discounts | Get ads credit discounts
*BillingApi* | [**billingInvoiceDownloadGet**](docs/BillingApi.md#billinginvoicedownloadget) | **GET** /ad_accounts/{ad_account_id}/billing_invoice/{billing_invoice_id}/download | Get download url for a billing invoice
*BillingApi* | [**billingInvoicesGet**](docs/BillingApi.md#billinginvoicesget) | **GET** /ad_accounts/{ad_account_id}/billing_invoices | Get billing invoices
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
*BusinessAccessAssetsApi* | [**assetGroupCreate**](docs/BusinessAccessAssetsApi.md#assetgroupcreate) | **POST** /businesses/{business_id}/asset_groups | Create a new asset group.
*BusinessAccessAssetsApi* | [**assetGroupDelete**](docs/BusinessAccessAssetsApi.md#assetgroupdelete) | **DELETE** /businesses/{business_id}/asset_groups | Delete asset groups.
*BusinessAccessAssetsApi* | [**assetGroupUpdate**](docs/BusinessAccessAssetsApi.md#assetgroupupdate) | **PATCH** /businesses/{business_id}/asset_groups | Update asset groups.
*BusinessAccessAssetsApi* | [**businessAssetMembersGet**](docs/BusinessAccessAssetsApi.md#businessassetmembersget) | **GET** /businesses/{business_id}/assets/{asset_id}/members | Get members with access to asset
*BusinessAccessAssetsApi* | [**businessAssetPartnersGet**](docs/BusinessAccessAssetsApi.md#businessassetpartnersget) | **GET** /businesses/{business_id}/assets/{asset_id}/partners | Get partners with access to asset
*BusinessAccessAssetsApi* | [**businessAssetsGet**](docs/BusinessAccessAssetsApi.md#businessassetsget) | **GET** /businesses/{business_id}/assets | List business assets
*BusinessAccessAssetsApi* | [**businessMemberAssetsGet**](docs/BusinessAccessAssetsApi.md#businessmemberassetsget) | **GET** /businesses/{business_id}/members/{member_id}/assets | Get assets assigned to a member
*BusinessAccessAssetsApi* | [**businessMembersAssetAccessDelete**](docs/BusinessAccessAssetsApi.md#businessmembersassetaccessdelete) | **DELETE** /businesses/{business_id}/members/assets/access | Delete member access to asset
*BusinessAccessAssetsApi* | [**businessMembersAssetAccessUpdate**](docs/BusinessAccessAssetsApi.md#businessmembersassetaccessupdate) | **PATCH** /businesses/{business_id}/members/assets/access | Assign/Update member asset permissions
*BusinessAccessAssetsApi* | [**businessPartnerAssetAccessGet**](docs/BusinessAccessAssetsApi.md#businesspartnerassetaccessget) | **GET** /businesses/{business_id}/partners/{partner_id}/assets | Get assets assigned to a partner or assets assigned by a partner
*BusinessAccessAssetsApi* | [**deletePartnerAssetAccessHandlerImpl**](docs/BusinessAccessAssetsApi.md#deletepartnerassetaccesshandlerimpl) | **DELETE** /businesses/{business_id}/partners/assets | Delete partner access to asset
*BusinessAccessAssetsApi* | [**updatePartnerAssetAccessHandlerImpl**](docs/BusinessAccessAssetsApi.md#updatepartnerassetaccesshandlerimpl) | **PATCH** /businesses/{business_id}/partners/assets | Assign/Update partner asset permissions
*BusinessAccessInviteApi* | [**assetAccessRequestsCreate**](docs/BusinessAccessInviteApi.md#assetaccessrequestscreate) | **POST** /businesses/{business_id}/requests/assets/access | Create a request to access an existing partner's assets.
*BusinessAccessInviteApi* | [**cancelInvitesOrRequests**](docs/BusinessAccessInviteApi.md#cancelinvitesorrequests) | **DELETE** /businesses/{business_id}/invites | Cancel invites/requests
*BusinessAccessInviteApi* | [**createAssetInvites**](docs/BusinessAccessInviteApi.md#createassetinvites) | **POST** /businesses/{business_id}/invites/assets/access | Update invite/request with an asset permission
*BusinessAccessInviteApi* | [**createMembershipOrPartnershipInvites**](docs/BusinessAccessInviteApi.md#createmembershiporpartnershipinvites) | **POST** /businesses/{business_id}/invites | Create invites or requests
*BusinessAccessInviteApi* | [**getInvites**](docs/BusinessAccessInviteApi.md#getinvites) | **GET** /businesses/{business_id}/invites | Get invites/requests
*BusinessAccessInviteApi* | [**respondBusinessAccessInvites**](docs/BusinessAccessInviteApi.md#respondbusinessaccessinvites) | **PATCH** /businesses/invites | Accept or decline an invite/request
*BusinessAccessRelationshipsApi* | [**brandAccountsCreate**](docs/BusinessAccessRelationshipsApi.md#brandaccountscreate) | **POST** /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts | Create a Brand Account
*BusinessAccessRelationshipsApi* | [**brandAccountsUpdate**](docs/BusinessAccessRelationshipsApi.md#brandaccountsupdate) | **PATCH** /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id} | Update a Brand Account
*BusinessAccessRelationshipsApi* | [**deleteBusinessMembership**](docs/BusinessAccessRelationshipsApi.md#deletebusinessmembership) | **DELETE** /businesses/{business_id}/members | Terminate business memberships
*BusinessAccessRelationshipsApi* | [**deleteBusinessPartners**](docs/BusinessAccessRelationshipsApi.md#deletebusinesspartners) | **DELETE** /businesses/{business_id}/partners | Terminate business partnerships
*BusinessAccessRelationshipsApi* | [**getBusinessEmployers**](docs/BusinessAccessRelationshipsApi.md#getbusinessemployers) | **GET** /businesses/employers | List business employers for user
*BusinessAccessRelationshipsApi* | [**getBusinessMembers**](docs/BusinessAccessRelationshipsApi.md#getbusinessmembers) | **GET** /businesses/{business_id}/members | Get business members
*BusinessAccessRelationshipsApi* | [**getBusinessPartners**](docs/BusinessAccessRelationshipsApi.md#getbusinesspartners) | **GET** /businesses/{business_id}/partners | Get business partners
*BusinessAccessRelationshipsApi* | [**systemUserUpdate**](docs/BusinessAccessRelationshipsApi.md#systemuserupdate) | **PATCH** /businesses/{business_id}/system_users/{system_user_id} | Update a system user information.
*BusinessAccessRelationshipsApi* | [**updateBusinessMemberships**](docs/BusinessAccessRelationshipsApi.md#updatebusinessmemberships) | **PATCH** /businesses/{business_id}/members | Update member's business role
*CampaignsApi* | [**adPinsAnalytics**](docs/CampaignsApi.md#adpinsanalytics) | **GET** /ad_accounts/{ad_account_id}/pins/analytics | Get pins analytics
*CampaignsApi* | [**campaignTargetingAnalyticsGet**](docs/CampaignsApi.md#campaigntargetinganalyticsget) | **GET** /ad_accounts/{ad_account_id}/campaigns/targeting_analytics | Get targeting analytics for campaigns
*CampaignsApi* | [**campaignsAnalytics**](docs/CampaignsApi.md#campaignsanalytics) | **GET** /ad_accounts/{ad_account_id}/campaigns/analytics | Get campaign analytics
*CampaignsApi* | [**campaignsCreate**](docs/CampaignsApi.md#campaignscreate) | **POST** /ad_accounts/{ad_account_id}/campaigns | Create campaigns
*CampaignsApi* | [**campaignsGet**](docs/CampaignsApi.md#campaignsget) | **GET** /ad_accounts/{ad_account_id}/campaigns/{campaign_id} | Get campaign
*CampaignsApi* | [**campaignsList**](docs/CampaignsApi.md#campaignslist) | **GET** /ad_accounts/{ad_account_id}/campaigns | List campaigns
*CampaignsApi* | [**campaignsUpdate**](docs/CampaignsApi.md#campaignsupdate) | **PATCH** /ad_accounts/{ad_account_id}/campaigns | Update campaigns
*CampaignsApi* | [**getCampaignDeliveryEstimates**](docs/CampaignsApi.md#getcampaigndeliveryestimates) | **POST** /ad_accounts/{ad_account_id}/campaigns/delivery_estimates | Get campaign delivery estimates
*CatalogFeedsApi* | [**feedProcessingResultsList**](docs/CatalogFeedsApi.md#feedprocessingresultslist) | **GET** /catalogs/feeds/{feed_id}/processing_results | List feed processing results
*CatalogFeedsApi* | [**feedsCreate**](docs/CatalogFeedsApi.md#feedscreate) | **POST** /catalogs/feeds | Create feed
*CatalogFeedsApi* | [**feedsDelete**](docs/CatalogFeedsApi.md#feedsdelete) | **DELETE** /catalogs/feeds/{feed_id} | Delete feed
*CatalogFeedsApi* | [**feedsGet**](docs/CatalogFeedsApi.md#feedsget) | **GET** /catalogs/feeds/{feed_id} | Get feed
*CatalogFeedsApi* | [**feedsIngest**](docs/CatalogFeedsApi.md#feedsingest) | **POST** /catalogs/feeds/{feed_id}/ingest | Ingest feed items
*CatalogFeedsApi* | [**feedsList**](docs/CatalogFeedsApi.md#feedslist) | **GET** /catalogs/feeds | List feeds
*CatalogFeedsApi* | [**feedsUpdate**](docs/CatalogFeedsApi.md#feedsupdate) | **PATCH** /catalogs/feeds/{feed_id} | Update feed
*CatalogFeedsApi* | [**itemsIssuesList**](docs/CatalogFeedsApi.md#itemsissueslist) | **GET** /catalogs/processing_results/{processing_result_id}/item_issues | List item issues
*CatalogItemsApi* | [**itemsBatchGet**](docs/CatalogItemsApi.md#itemsbatchget) | **GET** /catalogs/items/batch/{batch_id} | Get item batch status
*CatalogItemsApi* | [**itemsBatchPost**](docs/CatalogItemsApi.md#itemsbatchpost) | **POST** /catalogs/items/batch | Operate on item batch
*CatalogItemsApi* | [**itemsPost**](docs/CatalogItemsApi.md#itemspost) | **POST** /catalogs/items | Get catalogs items (POST)
*CatalogProductGroupsApi* | [**catalogsProductGroupPinsList**](docs/CatalogProductGroupsApi.md#catalogsproductgrouppinslist) | **GET** /catalogs/product_groups/{product_group_id}/products | List products by product group
*CatalogProductGroupsApi* | [**catalogsProductGroupsCreate**](docs/CatalogProductGroupsApi.md#catalogsproductgroupscreate) | **POST** /catalogs/product_groups | Create product group
*CatalogProductGroupsApi* | [**catalogsProductGroupsCreateMany**](docs/CatalogProductGroupsApi.md#catalogsproductgroupscreatemany) | **POST** /catalogs/product_groups/multiple | Create product groups
*CatalogProductGroupsApi* | [**catalogsProductGroupsDelete**](docs/CatalogProductGroupsApi.md#catalogsproductgroupsdelete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group
*CatalogProductGroupsApi* | [**catalogsProductGroupsDeleteMany**](docs/CatalogProductGroupsApi.md#catalogsproductgroupsdeletemany) | **DELETE** /catalogs/product_groups/multiple | Delete product groups
*CatalogProductGroupsApi* | [**catalogsProductGroupsGet**](docs/CatalogProductGroupsApi.md#catalogsproductgroupsget) | **GET** /catalogs/product_groups/{product_group_id} | Get product group
*CatalogProductGroupsApi* | [**catalogsProductGroupsList**](docs/CatalogProductGroupsApi.md#catalogsproductgroupslist) | **GET** /catalogs/product_groups | List product groups
*CatalogProductGroupsApi* | [**catalogsProductGroupsProductCountsGet**](docs/CatalogProductGroupsApi.md#catalogsproductgroupsproductcountsget) | **GET** /catalogs/product_groups/{product_group_id}/product_counts | Get product counts
*CatalogProductGroupsApi* | [**catalogsProductGroupsUpdate**](docs/CatalogProductGroupsApi.md#catalogsproductgroupsupdate) | **PATCH** /catalogs/product_groups/{product_group_id} | Update single product group
*CatalogProductGroupsApi* | [**productsByProductGroupFilterList**](docs/CatalogProductGroupsApi.md#productsbyproductgroupfilterlist) | **POST** /catalogs/products/get_by_product_group_filters | List products by filter
*CatalogReportsApi* | [**reportsCreate**](docs/CatalogReportsApi.md#reportscreate) | **POST** /catalogs/reports | Build catalogs report
*CatalogReportsApi* | [**reportsGet**](docs/CatalogReportsApi.md#reportsget) | **GET** /catalogs/reports | Get catalogs report
*CatalogReportsApi* | [**reportsStats**](docs/CatalogReportsApi.md#reportsstats) | **GET** /catalogs/reports/stats | List report stats
*CatalogSupplementalApi* | [**catalogsLocalInventoryItemsBatchOperate**](docs/CatalogSupplementalApi.md#catalogslocalinventoryitemsbatchoperate) | **POST** /catalogs/{catalog_id}/local_inventory_items/batch | Operate on local inventory item batch
*CatalogSupplementalApi* | [**catalogsLocalInventoryItemsPost**](docs/CatalogSupplementalApi.md#catalogslocalinventoryitemspost) | **POST** /catalogs/{catalog_id}/local_inventory_items/query | Get local inventory items (POST)
*CatalogSupplementalApi* | [**catalogsLocalStoresCreate**](docs/CatalogSupplementalApi.md#catalogslocalstorescreate) | **POST** /catalogs/{catalog_id}/local_stores | Create local stores
*CatalogSupplementalApi* | [**catalogsLocalStoresDelete**](docs/CatalogSupplementalApi.md#catalogslocalstoresdelete) | **DELETE** /catalogs/{catalog_id}/local_stores | Delete local stores
*CatalogSupplementalApi* | [**catalogsLocalStoresList**](docs/CatalogSupplementalApi.md#catalogslocalstoreslist) | **GET** /catalogs/{catalog_id}/local_stores | List local stores
*CatalogSupplementalApi* | [**catalogsLocalStoresUpdate**](docs/CatalogSupplementalApi.md#catalogslocalstoresupdate) | **PATCH** /catalogs/{catalog_id}/local_stores | Update local stores
*CatalogSupplementalApi* | [**catalogsSupplementalItemsBatchGet**](docs/CatalogSupplementalApi.md#catalogssupplementalitemsbatchget) | **GET** /catalogs/{catalog_id}/supplemental_items/batch/{batch_id} | Get supplemental items batch status
*CatalogsApi* | [**catalogsAvailableFilterValues**](docs/CatalogsApi.md#catalogsavailablefiltervalues) | **GET** /catalogs/available_filter_values | List available filter values
*CatalogsApi* | [**catalogsCreate**](docs/CatalogsApi.md#catalogscreate) | **POST** /catalogs | Create catalog
*CatalogsApi* | [**catalogsList**](docs/CatalogsApi.md#catalogslist) | **GET** /catalogs | List catalogs
*ConversionDeletionRequestsApi* | [**conversionDeletionRequestCreate**](docs/ConversionDeletionRequestsApi.md#conversiondeletionrequestcreate) | **POST** /ad_accounts/{ad_account_id}/conversion_deletion_requests | Create a conversion deletion request
*ConversionDeletionRequestsApi* | [**conversionDeletionRequestDelete**](docs/ConversionDeletionRequestsApi.md#conversiondeletionrequestdelete) | **DELETE** /ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id} | Delete a conversion deletion request
*ConversionDeletionRequestsApi* | [**conversionDeletionRequestGet**](docs/ConversionDeletionRequestsApi.md#conversiondeletionrequestget) | **GET** /ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id} | Get a single conversion deletion request
*ConversionDeletionRequestsApi* | [**conversionDeletionRequestList**](docs/ConversionDeletionRequestsApi.md#conversiondeletionrequestlist) | **GET** /ad_accounts/{ad_account_id}/conversion_deletion_requests | List conversion deletion requests
*ConversionEqsApi* | [**conversionEqsList**](docs/ConversionEqsApi.md#conversioneqslist) | **GET** /ad_accounts/{ad_account_id}/conversion_eqs | Get event quality score (EQS)
*ConversionEventsApi* | [**eventsCreate**](docs/ConversionEventsApi.md#eventscreate) | **POST** /ad_accounts/{ad_account_id}/events | Send conversions
*ConversionTagsApi* | [**conversionTagsCreate**](docs/ConversionTagsApi.md#conversiontagscreate) | **POST** /ad_accounts/{ad_account_id}/conversion_tags | Create conversion tag
*ConversionTagsApi* | [**conversionTagsGet**](docs/ConversionTagsApi.md#conversiontagsget) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id} | Get conversion tag
*ConversionTagsApi* | [**conversionTagsList**](docs/ConversionTagsApi.md#conversiontagslist) | **GET** /ad_accounts/{ad_account_id}/conversion_tags | List conversion tags
*ConversionTagsApi* | [**ocpmEligibleConversionTagsGet**](docs/ConversionTagsApi.md#ocpmeligibleconversiontagsget) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible | Get Ocpm eligible conversion tags
*ConversionTagsApi* | [**pageVisitConversionTagsGet**](docs/ConversionTagsApi.md#pagevisitconversiontagsget) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/page_visit | Get page visit conversion tags
*ConversionsApi* | [**advertiserDefinedEventsCreate**](docs/ConversionsApi.md#advertiserdefinedeventscreate) | **POST** /ad_accounts/{ad_account_id}/advertiser_defined_events | Create advertiser defined events
*ConversionsApi* | [**advertiserDefinedEventsDelete**](docs/ConversionsApi.md#advertiserdefinedeventsdelete) | **DELETE** /ad_accounts/{ad_account_id}/advertiser_defined_events | Delete advertiser defined events
*ConversionsApi* | [**advertiserDefinedEventsGet**](docs/ConversionsApi.md#advertiserdefinedeventsget) | **GET** /ad_accounts/{ad_account_id}/advertiser_defined_events | Get advertiser defined events
*ConversionsApi* | [**advertiserDefinedEventsUpdate**](docs/ConversionsApi.md#advertiserdefinedeventsupdate) | **PATCH** /ad_accounts/{ad_account_id}/advertiser_defined_events | Update advertiser defined events
*CustomerListUploadsApi* | [**customerListUploadsCreate**](docs/CustomerListUploadsApi.md#customerlistuploadscreate) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads | Create customer list upload
*CustomerListUploadsApi* | [**customerListUploadsGet**](docs/CustomerListUploadsApi.md#customerlistuploadsget) | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id} | Get customer list upload
*CustomerListUploadsApi* | [**customerListUploadsRun**](docs/CustomerListUploadsApi.md#customerlistuploadsrun) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run | Run customer list upload
*CustomerListsApi* | [**customerListsCreate**](docs/CustomerListsApi.md#customerlistscreate) | **POST** /ad_accounts/{ad_account_id}/customer_lists | Create customer lists
*CustomerListsApi* | [**customerListsGet**](docs/CustomerListsApi.md#customerlistsget) | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Get customer list
*CustomerListsApi* | [**customerListsList**](docs/CustomerListsApi.md#customerlistslist) | **GET** /ad_accounts/{ad_account_id}/customer_lists | Get customer lists
*CustomerListsApi* | [**customerListsUpdate**](docs/CustomerListsApi.md#customerlistsupdate) | **PATCH** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Update customer list
*CustomerSegmentApi* | [**customerSegmentCreate**](docs/CustomerSegmentApi.md#customersegmentcreate) | **POST** /ad_accounts/{ad_account_id}/customer_segments | Create customer segments
*CustomerSegmentApi* | [**customerSegmentList**](docs/CustomerSegmentApi.md#customersegmentlist) | **GET** /ad_accounts/{ad_account_id}/customer_segments | List customer segments
*CustomerSegmentApi* | [**customerSegmentUpdate**](docs/CustomerSegmentApi.md#customersegmentupdate) | **PATCH** /ad_accounts/{ad_account_id}/customer_segments | Update customer segments
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
*LabelsApi* | [**labelsApply**](docs/LabelsApi.md#labelsapply) | **POST** /ad_accounts/{ad_account_id}/labels/{label_id}/apply | Apply label to entity
*LabelsApi* | [**labelsCreate**](docs/LabelsApi.md#labelscreate) | **POST** /ad_accounts/{ad_account_id}/labels | Create labels
*LabelsApi* | [**labelsList**](docs/LabelsApi.md#labelslist) | **GET** /ad_accounts/{ad_account_id}/labels | List labels
*LabelsApi* | [**labelsRemove**](docs/LabelsApi.md#labelsremove) | **POST** /ad_accounts/{ad_account_id}/labels/{label_id}/remove | Remove label from entities
*LabelsApi* | [**labelsUpdate**](docs/LabelsApi.md#labelsupdate) | **PATCH** /ad_accounts/{ad_account_id}/labels | Update labels
*LeadAdsApi* | [**adAccountsSubscriptionsDelById**](docs/LeadAdsApi.md#adaccountssubscriptionsdelbyid) | **DELETE** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Delete lead ads subscription
*LeadAdsApi* | [**adAccountsSubscriptionsGetById**](docs/LeadAdsApi.md#adaccountssubscriptionsgetbyid) | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Get lead ads subscription by ID
*LeadAdsApi* | [**adAccountsSubscriptionsGetList**](docs/LeadAdsApi.md#adaccountssubscriptionsgetlist) | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions | Get lead ads subscriptions
*LeadAdsApi* | [**adAccountsSubscriptionsPost**](docs/LeadAdsApi.md#adaccountssubscriptionspost) | **POST** /ad_accounts/{ad_account_id}/leads/subscriptions | Create lead ads subscription
*LeadFormsApi* | [**leadFormGet**](docs/LeadFormsApi.md#leadformget) | **GET** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id} | Get lead form by id
*LeadFormsApi* | [**leadFormTestCreate**](docs/LeadFormsApi.md#leadformtestcreate) | **POST** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test | Create lead form test data
*LeadFormsApi* | [**leadFormsCreate**](docs/LeadFormsApi.md#leadformscreate) | **POST** /ad_accounts/{ad_account_id}/lead_forms | Create lead forms
*LeadFormsApi* | [**leadFormsList**](docs/LeadFormsApi.md#leadformslist) | **GET** /ad_accounts/{ad_account_id}/lead_forms | List lead forms
*LeadFormsApi* | [**leadFormsUpdate**](docs/LeadFormsApi.md#leadformsupdate) | **PATCH** /ad_accounts/{ad_account_id}/lead_forms | Update lead forms
*LeadsExportApi* | [**leadsExportCreate**](docs/LeadsExportApi.md#leadsexportcreate) | **POST** /ad_accounts/{ad_account_id}/leads_export | Create a request to export leads collected from a lead ad
*LeadsExportApi* | [**leadsExportGet**](docs/LeadsExportApi.md#leadsexportget) | **GET** /ad_accounts/{ad_account_id}/leads_export/{leads_export_id} | Get the lead export from the lead export create call
*MediaApi* | [**mediaCreate**](docs/MediaApi.md#mediacreate) | **POST** /media | Register media upload
*MediaApi* | [**mediaGet**](docs/MediaApi.md#mediaget) | **GET** /media/{media_id} | Get media upload details
*MediaApi* | [**mediaList**](docs/MediaApi.md#medialist) | **GET** /media | List media uploads
*MsotEventsApi* | [**msotEventsCreate**](docs/MsotEventsApi.md#msoteventscreate) | **POST** /ad_accounts/{ad_account_id}/msot/events | Send Measurement Source Of Truth (MSOT) attributed conversion events
*NotificationApi* | [**notificationPost**](docs/NotificationApi.md#notificationpost) | **POST** /notifications | Receive notifications from external partners.
*OauthApi* | [**oauthConversionToken**](docs/OauthApi.md#oauthconversiontoken) | **POST** /oauth/conversion_token | Generate OAuth access token for conversion API
*OauthApi* | [**oauthToken**](docs/OauthApi.md#oauthtoken) | **POST** /oauth/token | Generate OAuth access token
*OauthApi* | [**tokenRevoke**](docs/OauthApi.md#tokenrevoke) | **POST** /oauth/token/revoke | Revoke a token
*OrderLinesApi* | [**orderLinesGet**](docs/OrderLinesApi.md#orderlinesget) | **GET** /ad_accounts/{ad_account_id}/order_lines/{order_line_id} | Get order line
*OrderLinesApi* | [**orderLinesList**](docs/OrderLinesApi.md#orderlineslist) | **GET** /ad_accounts/{ad_account_id}/order_lines | Get order lines.
*PinsApi* | [**multiPinsAnalytics**](docs/PinsApi.md#multipinsanalytics) | **GET** /pins/analytics | Get multiple Pin analytics
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
*ProductTagsApi* | [**productTagsBulkAdd**](docs/ProductTagsApi.md#producttagsbulkadd) | **POST** /pins/{pin_id}/product_tags | Add product tags to pin
*ProductTagsApi* | [**productTagsBulkDelete**](docs/ProductTagsApi.md#producttagsbulkdelete) | **POST** /pins/{pin_id}/product_tags/bulk-delete | Delete product tags from pin
*ProductTagsApi* | [**productTagsList**](docs/ProductTagsApi.md#producttagslist) | **GET** /pins/{pin_id}/product_tags | Get product tags for pin
*PromotionsApi* | [**promotionsCreate**](docs/PromotionsApi.md#promotionscreate) | **POST** /ad_accounts/{ad_account_id}/promotions | Create promotions
*PromotionsApi* | [**promotionsDelete**](docs/PromotionsApi.md#promotionsdelete) | **DELETE** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Delete promotion by id
*PromotionsApi* | [**promotionsGet**](docs/PromotionsApi.md#promotionsget) | **GET** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Get promotion by id
*PromotionsApi* | [**promotionsList**](docs/PromotionsApi.md#promotionslist) | **GET** /ad_accounts/{ad_account_id}/promotions | Get promotions
*PromotionsApi* | [**promotionsUpdate**](docs/PromotionsApi.md#promotionsupdate) | **PATCH** /ad_accounts/{ad_account_id}/promotions | Update promotions
*ResourcesApi* | [**adAccountCountriesGet**](docs/ResourcesApi.md#adaccountcountriesget) | **GET** /resources/ad_account_countries | Get ad accounts countries
*ResourcesApi* | [**deliveryMetricsGet**](docs/ResourcesApi.md#deliverymetricsget) | **GET** /resources/delivery_metrics | Get available metrics' definitions
*ResourcesApi* | [**interestTargetingOptionsGet**](docs/ResourcesApi.md#interesttargetingoptionsget) | **GET** /resources/targeting/interests/{interest_id} | Get interest details
*ResourcesApi* | [**leadFormQuestionsGet**](docs/ResourcesApi.md#leadformquestionsget) | **GET** /resources/lead_form_questions | Get lead form questions
*ResourcesApi* | [**metricsReadyStateGet**](docs/ResourcesApi.md#metricsreadystateget) | **GET** /resources/metrics_ready_state | Get metrics ready state
*ResourcesApi* | [**targetingOptionsGet**](docs/ResourcesApi.md#targetingoptionsget) | **GET** /resources/targeting/{targeting_type} | Get targeting options
*SchedulesApi* | [**schedulesCreate**](docs/SchedulesApi.md#schedulescreate) | **POST** /ad_accounts/{ad_account_id}/schedules | Create schedules
*SchedulesApi* | [**schedulesList**](docs/SchedulesApi.md#scheduleslist) | **GET** /ad_accounts/{ad_account_id}/schedules | Get Schedules
*SchedulesApi* | [**schedulesUpdate**](docs/SchedulesApi.md#schedulesupdate) | **PATCH** /ad_accounts/{ad_account_id}/schedules | Update schedules
*SearchApi* | [**searchPartnerPins**](docs/SearchApi.md#searchpartnerpins) | **GET** /search/partner/pins | Search pins by a given search term
*SearchApi* | [**searchUserBoardsGet**](docs/SearchApi.md#searchuserboardsget) | **GET** /search/boards | Search user's boards
*SearchApi* | [**searchUserPinsList**](docs/SearchApi.md#searchuserpinslist) | **GET** /search/pins | Search user's Pins
*TargetingTemplateApi* | [**targetingTemplateCreate**](docs/TargetingTemplateApi.md#targetingtemplatecreate) | **POST** /ad_accounts/{ad_account_id}/targeting_templates | Create targeting templates
*TargetingTemplateApi* | [**targetingTemplateList**](docs/TargetingTemplateApi.md#targetingtemplatelist) | **GET** /ad_accounts/{ad_account_id}/targeting_templates | List targeting templates
*TargetingTemplateApi* | [**targetingTemplateUpdate**](docs/TargetingTemplateApi.md#targetingtemplateupdate) | **PATCH** /ad_accounts/{ad_account_id}/targeting_templates | Update targeting templates
*TermsApi* | [**termsRelatedList**](docs/TermsApi.md#termsrelatedlist) | **GET** /terms/related | List related terms
*TermsApi* | [**termsSuggestedList**](docs/TermsApi.md#termssuggestedlist) | **GET** /terms/suggested | List suggested terms
*TermsOfServiceApi* | [**termsOfServiceGet**](docs/TermsOfServiceApi.md#termsofserviceget) | **GET** /ad_accounts/{ad_account_id}/terms_of_service | Get terms of service
*TrendsApi* | [**trendsEditorialArticlesList**](docs/TrendsApi.md#trendseditorialarticleslist) | **GET** /trends/editorial_articles | Returns editorial articles for a given region
*TrendsApi* | [**trendsFeaturedTopicsList**](docs/TrendsApi.md#trendsfeaturedtopicslist) | **GET** /trends/topics/featured | Get featured topics
*TrendsApi* | [**trendsProductCategoriesDetailsList**](docs/TrendsApi.md#trendsproductcategoriesdetailslist) | **GET** /trends/product_categories/details | Get product category details
*TrendsApi* | [**trendsProductCategoriesTrendingList**](docs/TrendsApi.md#trendsproductcategoriestrendinglist) | **GET** /trends/product_categories/trending | Get a list of growing Shopping Product Categories
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
 - [org.openapitools.server.api.model.AccountTemplate](docs/AccountTemplate.md)
 - [org.openapitools.server.api.model.ActionType](docs/ActionType.md)
 - [org.openapitools.server.api.model.Ad](docs/Ad.md)
 - [org.openapitools.server.api.model.AdAccount](docs/AdAccount.md)
 - [org.openapitools.server.api.model.AdAccountAnalyticsItems](docs/AdAccountAnalyticsItems.md)
 - [org.openapitools.server.api.model.AdAccountCountriesGet200Response](docs/AdAccountCountriesGet200Response.md)
 - [org.openapitools.server.api.model.AdAccountCreate](docs/AdAccountCreate.md)
 - [org.openapitools.server.api.model.AdAccountEntityType](docs/AdAccountEntityType.md)
 - [org.openapitools.server.api.model.AdAccountOwner](docs/AdAccountOwner.md)
 - [org.openapitools.server.api.model.AdAccountToAdAccountSharedAudience](docs/AdAccountToAdAccountSharedAudience.md)
 - [org.openapitools.server.api.model.AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody](docs/AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody.md)
 - [org.openapitools.server.api.model.AdAccountToBusinessSharedAudience](docs/AdAccountToBusinessSharedAudience.md)
 - [org.openapitools.server.api.model.AdAccountToBusinessSharedAudienceUpdateWithRequiredBody](docs/AdAccountToBusinessSharedAudienceUpdateWithRequiredBody.md)
 - [org.openapitools.server.api.model.AdAccountsAudience](docs/AdAccountsAudience.md)
 - [org.openapitools.server.api.model.AdAccountsAudienceCreate](docs/AdAccountsAudienceCreate.md)
 - [org.openapitools.server.api.model.AdAccountsAudienceRule](docs/AdAccountsAudienceRule.md)
 - [org.openapitools.server.api.model.AdAccountsAudienceUpdate](docs/AdAccountsAudienceUpdate.md)
 - [org.openapitools.server.api.model.AdAccountsAudiencesSharedAccountsList200Response](docs/AdAccountsAudiencesSharedAccountsList200Response.md)
 - [org.openapitools.server.api.model.AdAccountsCountry](docs/AdAccountsCountry.md)
 - [org.openapitools.server.api.model.AdAccountsList200Response](docs/AdAccountsList200Response.md)
 - [org.openapitools.server.api.model.AdAccountsSubscriptionsGetList200Response](docs/AdAccountsSubscriptionsGetList200Response.md)
 - [org.openapitools.server.api.model.AdAdsAnalyticsAsyncTargetingTypes](docs/AdAdsAnalyticsAsyncTargetingTypes.md)
 - [org.openapitools.server.api.model.AdBatchItem](docs/AdBatchItem.md)
 - [org.openapitools.server.api.model.AdBatchUpdate](docs/AdBatchUpdate.md)
 - [org.openapitools.server.api.model.AdBatchWriteResponseModel](docs/AdBatchWriteResponseModel.md)
 - [org.openapitools.server.api.model.AdCollectionsHeaderType](docs/AdCollectionsHeaderType.md)
 - [org.openapitools.server.api.model.AdCreate](docs/AdCreate.md)
 - [org.openapitools.server.api.model.AdCreateRequest](docs/AdCreateRequest.md)
 - [org.openapitools.server.api.model.AdDisapprovalReasons](docs/AdDisapprovalReasons.md)
 - [org.openapitools.server.api.model.AdGroup](docs/AdGroup.md)
 - [org.openapitools.server.api.model.AdGroupAudienceSizing](docs/AdGroupAudienceSizing.md)
 - [org.openapitools.server.api.model.AdGroupAudienceSizingCreate](docs/AdGroupAudienceSizingCreate.md)
 - [org.openapitools.server.api.model.AdGroupAudienceSizingCreativeTypes](docs/AdGroupAudienceSizingCreativeTypes.md)
 - [org.openapitools.server.api.model.AdGroupAudienceSizingKeyword](docs/AdGroupAudienceSizingKeyword.md)
 - [org.openapitools.server.api.model.AdGroupBase](docs/AdGroupBase.md)
 - [org.openapitools.server.api.model.AdGroupCreate](docs/AdGroupCreate.md)
 - [org.openapitools.server.api.model.AdGroupCreateCreate](docs/AdGroupCreateCreate.md)
 - [org.openapitools.server.api.model.AdGroupCreateRequest](docs/AdGroupCreateRequest.md)
 - [org.openapitools.server.api.model.AdGroupCreateRequestAllOf1](docs/AdGroupCreateRequestAllOf1.md)
 - [org.openapitools.server.api.model.AdGroupDeliveryEstimates](docs/AdGroupDeliveryEstimates.md)
 - [org.openapitools.server.api.model.AdGroupDeliveryEstimatesKeywordsItems](docs/AdGroupDeliveryEstimatesKeywordsItems.md)
 - [org.openapitools.server.api.model.AdGroupSummaryStatus](docs/AdGroupSummaryStatus.md)
 - [org.openapitools.server.api.model.AdGroupTrackingURLs](docs/AdGroupTrackingURLs.md)
 - [org.openapitools.server.api.model.AdGroupUpdate](docs/AdGroupUpdate.md)
 - [org.openapitools.server.api.model.AdGroupUpdateBatchUpdate](docs/AdGroupUpdateBatchUpdate.md)
 - [org.openapitools.server.api.model.AdGroupUpdateRequest](docs/AdGroupUpdateRequest.md)
 - [org.openapitools.server.api.model.AdGroupUpdateRequestAllOf1](docs/AdGroupUpdateRequestAllOf1.md)
 - [org.openapitools.server.api.model.AdGroupsAnalyticsMetrics](docs/AdGroupsAnalyticsMetrics.md)
 - [org.openapitools.server.api.model.AdGroupsCreate200Response](docs/AdGroupsCreate200Response.md)
 - [org.openapitools.server.api.model.AdGroupsCreate200ResponseItemsInner](docs/AdGroupsCreate200ResponseItemsInner.md)
 - [org.openapitools.server.api.model.AdGroupsList200Response](docs/AdGroupsList200Response.md)
 - [org.openapitools.server.api.model.AdPinAnalytics](docs/AdPinAnalytics.md)
 - [org.openapitools.server.api.model.AdPinPreviewCreativeType](docs/AdPinPreviewCreativeType.md)
 - [org.openapitools.server.api.model.AdPreviewRequest](docs/AdPreviewRequest.md)
 - [org.openapitools.server.api.model.AdPreviewShopping](docs/AdPreviewShopping.md)
 - [org.openapitools.server.api.model.AdPreviewSourceImage](docs/AdPreviewSourceImage.md)
 - [org.openapitools.server.api.model.AdPreviewSourcePinId](docs/AdPreviewSourcePinId.md)
 - [org.openapitools.server.api.model.AdPreviewURLResponse](docs/AdPreviewURLResponse.md)
 - [org.openapitools.server.api.model.AdReviewStatus](docs/AdReviewStatus.md)
 - [org.openapitools.server.api.model.AdShoppingPreviewCreativeType](docs/AdShoppingPreviewCreativeType.md)
 - [org.openapitools.server.api.model.AdUpdateRequest](docs/AdUpdateRequest.md)
 - [org.openapitools.server.api.model.AdUpdateRequestAllOf1](docs/AdUpdateRequestAllOf1.md)
 - [org.openapitools.server.api.model.AdeColumnType](docs/AdeColumnType.md)
 - [org.openapitools.server.api.model.AdgroupPlacementGroupType](docs/AdgroupPlacementGroupType.md)
 - [org.openapitools.server.api.model.AdgroupTrackingFeatureType](docs/AdgroupTrackingFeatureType.md)
 - [org.openapitools.server.api.model.AdgroupTrackingFeatures](docs/AdgroupTrackingFeatures.md)
 - [org.openapitools.server.api.model.AdsAnalytics](docs/AdsAnalytics.md)
 - [org.openapitools.server.api.model.AdsAnalyticsAccountTargetingType](docs/AdsAnalyticsAccountTargetingType.md)
 - [org.openapitools.server.api.model.AdsAnalyticsAdGroupTargetingType](docs/AdsAnalyticsAdGroupTargetingType.md)
 - [org.openapitools.server.api.model.AdsAnalyticsAdTargetingType](docs/AdsAnalyticsAdTargetingType.md)
 - [org.openapitools.server.api.model.AdsAnalyticsCampaignTargetingType](docs/AdsAnalyticsCampaignTargetingType.md)
 - [org.openapitools.server.api.model.AdsAnalyticsCreateAsyncRequest](docs/AdsAnalyticsCreateAsyncRequest.md)
 - [org.openapitools.server.api.model.AdsAnalyticsCreateAsyncResponse](docs/AdsAnalyticsCreateAsyncResponse.md)
 - [org.openapitools.server.api.model.AdsAnalyticsFilterColumn](docs/AdsAnalyticsFilterColumn.md)
 - [org.openapitools.server.api.model.AdsAnalyticsFilterOperator](docs/AdsAnalyticsFilterOperator.md)
 - [org.openapitools.server.api.model.AdsAnalyticsGetAsyncResponse](docs/AdsAnalyticsGetAsyncResponse.md)
 - [org.openapitools.server.api.model.AdsAnalyticsMetricsFilter](docs/AdsAnalyticsMetricsFilter.md)
 - [org.openapitools.server.api.model.AdsCreditDiscountType](docs/AdsCreditDiscountType.md)
 - [org.openapitools.server.api.model.AdsCreditDiscountsResponse](docs/AdsCreditDiscountsResponse.md)
 - [org.openapitools.server.api.model.AdsCreditRedeem](docs/AdsCreditRedeem.md)
 - [org.openapitools.server.api.model.AdsCreditRedeemCreate](docs/AdsCreditRedeemCreate.md)
 - [org.openapitools.server.api.model.AdsCreditsDiscountsGet200Response](docs/AdsCreditsDiscountsGet200Response.md)
 - [org.openapitools.server.api.model.AdsList200Response](docs/AdsList200Response.md)
 - [org.openapitools.server.api.model.AdvancedAuctionBidOptions](docs/AdvancedAuctionBidOptions.md)
 - [org.openapitools.server.api.model.AdvancedAuctionItem](docs/AdvancedAuctionItem.md)
 - [org.openapitools.server.api.model.AdvancedAuctionItems](docs/AdvancedAuctionItems.md)
 - [org.openapitools.server.api.model.AdvancedAuctionItemsGetRequest](docs/AdvancedAuctionItemsGetRequest.md)
 - [org.openapitools.server.api.model.AdvancedAuctionItemsSubmitDeleteRecord](docs/AdvancedAuctionItemsSubmitDeleteRecord.md)
 - [org.openapitools.server.api.model.AdvancedAuctionItemsSubmitRecord](docs/AdvancedAuctionItemsSubmitRecord.md)
 - [org.openapitools.server.api.model.AdvancedAuctionItemsSubmitRequest](docs/AdvancedAuctionItemsSubmitRequest.md)
 - [org.openapitools.server.api.model.AdvancedAuctionItemsSubmitUpsertRecord](docs/AdvancedAuctionItemsSubmitUpsertRecord.md)
 - [org.openapitools.server.api.model.AdvancedAuctionKey](docs/AdvancedAuctionKey.md)
 - [org.openapitools.server.api.model.AdvancedAuctionOperationError](docs/AdvancedAuctionOperationError.md)
 - [org.openapitools.server.api.model.AdvancedAuctionProcessedItems](docs/AdvancedAuctionProcessedItems.md)
 - [org.openapitools.server.api.model.AdvertiserDefinedEvent](docs/AdvertiserDefinedEvent.md)
 - [org.openapitools.server.api.model.AdvertiserDefinedEventInput](docs/AdvertiserDefinedEventInput.md)
 - [org.openapitools.server.api.model.AdvertiserDefinedEventMappingType](docs/AdvertiserDefinedEventMappingType.md)
 - [org.openapitools.server.api.model.AdvertiserDefinedEventProcessingRecord](docs/AdvertiserDefinedEventProcessingRecord.md)
 - [org.openapitools.server.api.model.AdvertiserDefinedEventsCreate200Response](docs/AdvertiserDefinedEventsCreate200Response.md)
 - [org.openapitools.server.api.model.AdvertiserDefinedEventsCreateRequest](docs/AdvertiserDefinedEventsCreateRequest.md)
 - [org.openapitools.server.api.model.AdvertiserDefinedEventsGet200Response](docs/AdvertiserDefinedEventsGet200Response.md)
 - [org.openapitools.server.api.model.AgeBucketMultipliers](docs/AgeBucketMultipliers.md)
 - [org.openapitools.server.api.model.AgeTrendsBucket](docs/AgeTrendsBucket.md)
 - [org.openapitools.server.api.model.AggregatedPinComment](docs/AggregatedPinComment.md)
 - [org.openapitools.server.api.model.AiDisclosureItem](docs/AiDisclosureItem.md)
 - [org.openapitools.server.api.model.AiDisclosures](docs/AiDisclosures.md)
 - [org.openapitools.server.api.model.AiDisclosuresUpdate](docs/AiDisclosuresUpdate.md)
 - [org.openapitools.server.api.model.AmazonConnectRequest](docs/AmazonConnectRequest.md)
 - [org.openapitools.server.api.model.AmazonConnectResponse](docs/AmazonConnectResponse.md)
 - [org.openapitools.server.api.model.AnalyticsDailyMetrics](docs/AnalyticsDailyMetrics.md)
 - [org.openapitools.server.api.model.AnalyticsMetricsResponse](docs/AnalyticsMetricsResponse.md)
 - [org.openapitools.server.api.model.AppTypeMultipliers](docs/AppTypeMultipliers.md)
 - [org.openapitools.server.api.model.AppsflyerAudience](docs/AppsflyerAudience.md)
 - [org.openapitools.server.api.model.AppsflyerAudienceCreate](docs/AppsflyerAudienceCreate.md)
 - [org.openapitools.server.api.model.AppsflyerAudienceSyncCreate](docs/AppsflyerAudienceSyncCreate.md)
 - [org.openapitools.server.api.model.AppsflyerPlatform](docs/AppsflyerPlatform.md)
 - [org.openapitools.server.api.model.AssetAccessRequestError](docs/AssetAccessRequestError.md)
 - [org.openapitools.server.api.model.AssetGroupBinding](docs/AssetGroupBinding.md)
 - [org.openapitools.server.api.model.AssetGroupDeleteError](docs/AssetGroupDeleteError.md)
 - [org.openapitools.server.api.model.AssetGroupDeletion](docs/AssetGroupDeletion.md)
 - [org.openapitools.server.api.model.AssetGroupDeletionDelete](docs/AssetGroupDeletionDelete.md)
 - [org.openapitools.server.api.model.AssetGroupInput](docs/AssetGroupInput.md)
 - [org.openapitools.server.api.model.AssetGroupInputCreate](docs/AssetGroupInputCreate.md)
 - [org.openapitools.server.api.model.AssetGroupModification](docs/AssetGroupModification.md)
 - [org.openapitools.server.api.model.AssetGroupModificationReadOrUpdate](docs/AssetGroupModificationReadOrUpdate.md)
 - [org.openapitools.server.api.model.AssetGroupType](docs/AssetGroupType.md)
 - [org.openapitools.server.api.model.AssetGroupUpdateError](docs/AssetGroupUpdateError.md)
 - [org.openapitools.server.api.model.AssetGroupUpdateItemReadOrUpdateItem](docs/AssetGroupUpdateItemReadOrUpdateItem.md)
 - [org.openapitools.server.api.model.AssetIdPermissions](docs/AssetIdPermissions.md)
 - [org.openapitools.server.api.model.AssetIdWithPermissions](docs/AssetIdWithPermissions.md)
 - [org.openapitools.server.api.model.AssetPermissionType](docs/AssetPermissionType.md)
 - [org.openapitools.server.api.model.AssetSearchBy](docs/AssetSearchBy.md)
 - [org.openapitools.server.api.model.AssetSortBy](docs/AssetSortBy.md)
 - [org.openapitools.server.api.model.AssetTypeResponse](docs/AssetTypeResponse.md)
 - [org.openapitools.server.api.model.AttributionActionType](docs/AttributionActionType.md)
 - [org.openapitools.server.api.model.AttributionMatchType](docs/AttributionMatchType.md)
 - [org.openapitools.server.api.model.AttributionModel](docs/AttributionModel.md)
 - [org.openapitools.server.api.model.AttributionScope](docs/AttributionScope.md)
 - [org.openapitools.server.api.model.AttributionWindows](docs/AttributionWindows.md)
 - [org.openapitools.server.api.model.Audience](docs/Audience.md)
 - [org.openapitools.server.api.model.AudienceAccountType](docs/AudienceAccountType.md)
 - [org.openapitools.server.api.model.AudienceCategory](docs/AudienceCategory.md)
 - [org.openapitools.server.api.model.AudienceDefinition](docs/AudienceDefinition.md)
 - [org.openapitools.server.api.model.AudienceDemographicValue](docs/AudienceDemographicValue.md)
 - [org.openapitools.server.api.model.AudienceDemographics](docs/AudienceDemographics.md)
 - [org.openapitools.server.api.model.AudienceInsightType](docs/AudienceInsightType.md)
 - [org.openapitools.server.api.model.AudienceInsights](docs/AudienceInsights.md)
 - [org.openapitools.server.api.model.AudienceInsightsScopeAndTypeGet200Response](docs/AudienceInsightsScopeAndTypeGet200Response.md)
 - [org.openapitools.server.api.model.AudienceObjectiveType](docs/AudienceObjectiveType.md)
 - [org.openapitools.server.api.model.AudienceOwnershipType](docs/AudienceOwnershipType.md)
 - [org.openapitools.server.api.model.AudienceRule](docs/AudienceRule.md)
 - [org.openapitools.server.api.model.AudienceStatus](docs/AudienceStatus.md)
 - [org.openapitools.server.api.model.AudienceSubcategory](docs/AudienceSubcategory.md)
 - [org.openapitools.server.api.model.AudienceType](docs/AudienceType.md)
 - [org.openapitools.server.api.model.AudienceUpdateOperationType](docs/AudienceUpdateOperationType.md)
 - [org.openapitools.server.api.model.AudiencesList200Response](docs/AudiencesList200Response.md)
 - [org.openapitools.server.api.model.AuthRespondInviteAction](docs/AuthRespondInviteAction.md)
 - [org.openapitools.server.api.model.AuthRespondInvitesBody](docs/AuthRespondInvitesBody.md)
 - [org.openapitools.server.api.model.AuthRespondInvitesBodyItem](docs/AuthRespondInvitesBodyItem.md)
 - [org.openapitools.server.api.model.AvailabilityFilter](docs/AvailabilityFilter.md)
 - [org.openapitools.server.api.model.BaseBusinessAssets](docs/BaseBusinessAssets.md)
 - [org.openapitools.server.api.model.BaseInviteDataResponse](docs/BaseInviteDataResponse.md)
 - [org.openapitools.server.api.model.BasePreferredMediaType](docs/BasePreferredMediaType.md)
 - [org.openapitools.server.api.model.BatchOperationStatus](docs/BatchOperationStatus.md)
 - [org.openapitools.server.api.model.BidFloor](docs/BidFloor.md)
 - [org.openapitools.server.api.model.BidFloorCreate](docs/BidFloorCreate.md)
 - [org.openapitools.server.api.model.BidFloorObjectiveType](docs/BidFloorObjectiveType.md)
 - [org.openapitools.server.api.model.BidFloorSpec](docs/BidFloorSpec.md)
 - [org.openapitools.server.api.model.BidOptionsAgeBucketMultipliers](docs/BidOptionsAgeBucketMultipliers.md)
 - [org.openapitools.server.api.model.BidOptionsAppTypeMultipliers](docs/BidOptionsAppTypeMultipliers.md)
 - [org.openapitools.server.api.model.BidOptionsAudienceMultipliers](docs/BidOptionsAudienceMultipliers.md)
 - [org.openapitools.server.api.model.BidOptionsGenderMultipliers](docs/BidOptionsGenderMultipliers.md)
 - [org.openapitools.server.api.model.BidOptionsPlacementMultipliers](docs/BidOptionsPlacementMultipliers.md)
 - [org.openapitools.server.api.model.BidStrategyType](docs/BidStrategyType.md)
 - [org.openapitools.server.api.model.BillingInvoice](docs/BillingInvoice.md)
 - [org.openapitools.server.api.model.BillingInvoiceDocumentType](docs/BillingInvoiceDocumentType.md)
 - [org.openapitools.server.api.model.BillingInvoiceDownloadResponse](docs/BillingInvoiceDownloadResponse.md)
 - [org.openapitools.server.api.model.BillingInvoiceSortField](docs/BillingInvoiceSortField.md)
 - [org.openapitools.server.api.model.BillingInvoiceStatus](docs/BillingInvoiceStatus.md)
 - [org.openapitools.server.api.model.BillingInvoicesGet200Response](docs/BillingInvoicesGet200Response.md)
 - [org.openapitools.server.api.model.BillingProfileCardType](docs/BillingProfileCardType.md)
 - [org.openapitools.server.api.model.BillingProfilePaymentMethodBrand](docs/BillingProfilePaymentMethodBrand.md)
 - [org.openapitools.server.api.model.BillingProfileStatus](docs/BillingProfileStatus.md)
 - [org.openapitools.server.api.model.BillingProfilesGet200Response](docs/BillingProfilesGet200Response.md)
 - [org.openapitools.server.api.model.BillingProfilesResponse](docs/BillingProfilesResponse.md)
 - [org.openapitools.server.api.model.BillingType](docs/BillingType.md)
 - [org.openapitools.server.api.model.Board](docs/Board.md)
 - [org.openapitools.server.api.model.BoardBase](docs/BoardBase.md)
 - [org.openapitools.server.api.model.BoardCreate](docs/BoardCreate.md)
 - [org.openapitools.server.api.model.BoardMedia](docs/BoardMedia.md)
 - [org.openapitools.server.api.model.BoardOwner](docs/BoardOwner.md)
 - [org.openapitools.server.api.model.BoardPrivacy](docs/BoardPrivacy.md)
 - [org.openapitools.server.api.model.BoardPrivacyFilter](docs/BoardPrivacyFilter.md)
 - [org.openapitools.server.api.model.BoardSection](docs/BoardSection.md)
 - [org.openapitools.server.api.model.BoardSectionCreate](docs/BoardSectionCreate.md)
 - [org.openapitools.server.api.model.BoardSectionUpdateWithRequiredBody](docs/BoardSectionUpdateWithRequiredBody.md)
 - [org.openapitools.server.api.model.BoardSectionsList200Response](docs/BoardSectionsList200Response.md)
 - [org.openapitools.server.api.model.BoardUpdatePrivacy](docs/BoardUpdatePrivacy.md)
 - [org.openapitools.server.api.model.BoardWithUpdatePrivacy](docs/BoardWithUpdatePrivacy.md)
 - [org.openapitools.server.api.model.BoardWithUpdatePrivacyUpdate](docs/BoardWithUpdatePrivacyUpdate.md)
 - [org.openapitools.server.api.model.BoardsList200Response](docs/BoardsList200Response.md)
 - [org.openapitools.server.api.model.BoardsListPins200Response](docs/BoardsListPins200Response.md)
 - [org.openapitools.server.api.model.BookClosed](docs/BookClosed.md)
 - [org.openapitools.server.api.model.BrandAccount](docs/BrandAccount.md)
 - [org.openapitools.server.api.model.BrandAccountCreate](docs/BrandAccountCreate.md)
 - [org.openapitools.server.api.model.BrandAccountProfileImage](docs/BrandAccountProfileImage.md)
 - [org.openapitools.server.api.model.BrandAccountProfileImageUpdate](docs/BrandAccountProfileImageUpdate.md)
 - [org.openapitools.server.api.model.BrandAccountUpdate](docs/BrandAccountUpdate.md)
 - [org.openapitools.server.api.model.BrandFilter](docs/BrandFilter.md)
 - [org.openapitools.server.api.model.BudgetDurationType](docs/BudgetDurationType.md)
 - [org.openapitools.server.api.model.BudgetType](docs/BudgetType.md)
 - [org.openapitools.server.api.model.BulkCampaignDeliveryEstimatesItem](docs/BulkCampaignDeliveryEstimatesItem.md)
 - [org.openapitools.server.api.model.BulkCampaignDeliveryEstimatesResponse](docs/BulkCampaignDeliveryEstimatesResponse.md)
 - [org.openapitools.server.api.model.BulkDownload](docs/BulkDownload.md)
 - [org.openapitools.server.api.model.BulkDownloadCampaignFilter](docs/BulkDownloadCampaignFilter.md)
 - [org.openapitools.server.api.model.BulkDownloadCreate](docs/BulkDownloadCreate.md)
 - [org.openapitools.server.api.model.BulkEntityType](docs/BulkEntityType.md)
 - [org.openapitools.server.api.model.BulkJobData](docs/BulkJobData.md)
 - [org.openapitools.server.api.model.BulkOutputFormat](docs/BulkOutputFormat.md)
 - [org.openapitools.server.api.model.BulkReportingJobStatus](docs/BulkReportingJobStatus.md)
 - [org.openapitools.server.api.model.BulkRequestStatus](docs/BulkRequestStatus.md)
 - [org.openapitools.server.api.model.BulkUpsertRequest](docs/BulkUpsertRequest.md)
 - [org.openapitools.server.api.model.BulkUpsertRequestCreate](docs/BulkUpsertRequestCreate.md)
 - [org.openapitools.server.api.model.BulkUpsertRequestCreateCatalogProductGroupsItems](docs/BulkUpsertRequestCreateCatalogProductGroupsItems.md)
 - [org.openapitools.server.api.model.BulkUpsertRequestUpdate](docs/BulkUpsertRequestUpdate.md)
 - [org.openapitools.server.api.model.BulkUpsertRequestUpdateCatalogProductGroupsItems](docs/BulkUpsertRequestUpdateCatalogProductGroupsItems.md)
 - [org.openapitools.server.api.model.BulkUpsertResponse](docs/BulkUpsertResponse.md)
 - [org.openapitools.server.api.model.BusinessAccessRole](docs/BusinessAccessRole.md)
 - [org.openapitools.server.api.model.BusinessAccessUserSummary](docs/BusinessAccessUserSummary.md)
 - [org.openapitools.server.api.model.BusinessAssetMembersGet200Response](docs/BusinessAssetMembersGet200Response.md)
 - [org.openapitools.server.api.model.BusinessAssets](docs/BusinessAssets.md)
 - [org.openapitools.server.api.model.BusinessAssetsGet200Response](docs/BusinessAssetsGet200Response.md)
 - [org.openapitools.server.api.model.BusinessMemberAssetsGetResponse](docs/BusinessMemberAssetsGetResponse.md)
 - [org.openapitools.server.api.model.BusinessMemberAssetsSummary](docs/BusinessMemberAssetsSummary.md)
 - [org.openapitools.server.api.model.BusinessMemberSortBy](docs/BusinessMemberSortBy.md)
 - [org.openapitools.server.api.model.BusinessMembersAssetAccessDeleteBody](docs/BusinessMembersAssetAccessDeleteBody.md)
 - [org.openapitools.server.api.model.BusinessMembershipMember](docs/BusinessMembershipMember.md)
 - [org.openapitools.server.api.model.BusinessPartnerAssetAccessGet200Response](docs/BusinessPartnerAssetAccessGet200Response.md)
 - [org.openapitools.server.api.model.BusinessRoleForInvite](docs/BusinessRoleForInvite.md)
 - [org.openapitools.server.api.model.BusinessRoleForMembers](docs/BusinessRoleForMembers.md)
 - [org.openapitools.server.api.model.BusinessSearchBy](docs/BusinessSearchBy.md)
 - [org.openapitools.server.api.model.BusinessToAdAccountSharedAudience](docs/BusinessToAdAccountSharedAudience.md)
 - [org.openapitools.server.api.model.BusinessToAdAccountSharedAudienceUpdateWithRequiredBody](docs/BusinessToAdAccountSharedAudienceUpdateWithRequiredBody.md)
 - [org.openapitools.server.api.model.BusinessToBusinessSharedAudience](docs/BusinessToBusinessSharedAudience.md)
 - [org.openapitools.server.api.model.BusinessToBusinessSharedAudienceUpdateWithRequiredBody](docs/BusinessToBusinessSharedAudienceUpdateWithRequiredBody.md)
 - [org.openapitools.server.api.model.Campaign](docs/Campaign.md)
 - [org.openapitools.server.api.model.CampaignAdPreview](docs/CampaignAdPreview.md)
 - [org.openapitools.server.api.model.CampaignAdPreviewCreate](docs/CampaignAdPreviewCreate.md)
 - [org.openapitools.server.api.model.CampaignAdPreviewCreate200ResponseInner](docs/CampaignAdPreviewCreate200ResponseInner.md)
 - [org.openapitools.server.api.model.CampaignAdPreviewCreate200ResponseInnerData](docs/CampaignAdPreviewCreate200ResponseInnerData.md)
 - [org.openapitools.server.api.model.CampaignAdPreviewCreate200ResponseInnerDataOneOf](docs/CampaignAdPreviewCreate200ResponseInnerDataOneOf.md)
 - [org.openapitools.server.api.model.CampaignAdPreviewDelete200ResponseInner](docs/CampaignAdPreviewDelete200ResponseInner.md)
 - [org.openapitools.server.api.model.CampaignAdPreviewDelete200ResponseInnerStatus](docs/CampaignAdPreviewDelete200ResponseInnerStatus.md)
 - [org.openapitools.server.api.model.CampaignAudienceMultipliers](docs/CampaignAudienceMultipliers.md)
 - [org.openapitools.server.api.model.CampaignBatchItem](docs/CampaignBatchItem.md)
 - [org.openapitools.server.api.model.CampaignBatchResponseData](docs/CampaignBatchResponseData.md)
 - [org.openapitools.server.api.model.CampaignBatchUpdateItem](docs/CampaignBatchUpdateItem.md)
 - [org.openapitools.server.api.model.CampaignBatchWriteResponseModel](docs/CampaignBatchWriteResponseModel.md)
 - [org.openapitools.server.api.model.CampaignBidOptions](docs/CampaignBidOptions.md)
 - [org.openapitools.server.api.model.CampaignBidOptionsCreate](docs/CampaignBidOptionsCreate.md)
 - [org.openapitools.server.api.model.CampaignBidOptionsUpdate](docs/CampaignBidOptionsUpdate.md)
 - [org.openapitools.server.api.model.CampaignBidOptionsUpdateMaskItems](docs/CampaignBidOptionsUpdateMaskItems.md)
 - [org.openapitools.server.api.model.CampaignCreateItem](docs/CampaignCreateItem.md)
 - [org.openapitools.server.api.model.CampaignCreateRequest](docs/CampaignCreateRequest.md)
 - [org.openapitools.server.api.model.CampaignCreateRequestAllOf1](docs/CampaignCreateRequestAllOf1.md)
 - [org.openapitools.server.api.model.CampaignDeliveryEstimatesCampaign](docs/CampaignDeliveryEstimatesCampaign.md)
 - [org.openapitools.server.api.model.CampaignDeliveryEstimatesDerivedMetrics](docs/CampaignDeliveryEstimatesDerivedMetrics.md)
 - [org.openapitools.server.api.model.CampaignDeliveryEstimatesResponse](docs/CampaignDeliveryEstimatesResponse.md)
 - [org.openapitools.server.api.model.CampaignObjectiveType](docs/CampaignObjectiveType.md)
 - [org.openapitools.server.api.model.CampaignPlanningAdGroupAudienceSize](docs/CampaignPlanningAdGroupAudienceSize.md)
 - [org.openapitools.server.api.model.CampaignPlanningBudgetRecommendation](docs/CampaignPlanningBudgetRecommendation.md)
 - [org.openapitools.server.api.model.CampaignPlanningBudgetRecommendationPoint](docs/CampaignPlanningBudgetRecommendationPoint.md)
 - [org.openapitools.server.api.model.CampaignPlanningConfidenceLevelAlert](docs/CampaignPlanningConfidenceLevelAlert.md)
 - [org.openapitools.server.api.model.CampaignPlanningConfidenceLevelAlertReason](docs/CampaignPlanningConfidenceLevelAlertReason.md)
 - [org.openapitools.server.api.model.CampaignPlanningConfidenceLevelAlertSeverity](docs/CampaignPlanningConfidenceLevelAlertSeverity.md)
 - [org.openapitools.server.api.model.CampaignPlanningConversionAttribution](docs/CampaignPlanningConversionAttribution.md)
 - [org.openapitools.server.api.model.CampaignPlanningConversionAttributionWindowDays](docs/CampaignPlanningConversionAttributionWindowDays.md)
 - [org.openapitools.server.api.model.CampaignPlanningConversionEvent](docs/CampaignPlanningConversionEvent.md)
 - [org.openapitools.server.api.model.CampaignPlanningConversionRate](docs/CampaignPlanningConversionRate.md)
 - [org.openapitools.server.api.model.CampaignPlanningCurveEstimate](docs/CampaignPlanningCurveEstimate.md)
 - [org.openapitools.server.api.model.CampaignPlanningEstimationType](docs/CampaignPlanningEstimationType.md)
 - [org.openapitools.server.api.model.CampaignPlanningExperimentBudgetRecommendation](docs/CampaignPlanningExperimentBudgetRecommendation.md)
 - [org.openapitools.server.api.model.CampaignPlanningPointEstimate](docs/CampaignPlanningPointEstimate.md)
 - [org.openapitools.server.api.model.CampaignPlanningResponseError](docs/CampaignPlanningResponseError.md)
 - [org.openapitools.server.api.model.CampaignPlanningResponseErrorCode](docs/CampaignPlanningResponseErrorCode.md)
 - [org.openapitools.server.api.model.CampaignSummaryStatus](docs/CampaignSummaryStatus.md)
 - [org.openapitools.server.api.model.CampaignUpdateRequest](docs/CampaignUpdateRequest.md)
 - [org.openapitools.server.api.model.CampaignUpdateRequestAllOf2](docs/CampaignUpdateRequestAllOf2.md)
 - [org.openapitools.server.api.model.CampaignsAnalyticsMetrics](docs/CampaignsAnalyticsMetrics.md)
 - [org.openapitools.server.api.model.CampaignsList200Response](docs/CampaignsList200Response.md)
 - [org.openapitools.server.api.model.CancelInviteException](docs/CancelInviteException.md)
 - [org.openapitools.server.api.model.CancelInviteResult](docs/CancelInviteResult.md)
 - [org.openapitools.server.api.model.CancelInviteResultItem](docs/CancelInviteResultItem.md)
 - [org.openapitools.server.api.model.CancelInviteResultUser](docs/CancelInviteResultUser.md)
 - [org.openapitools.server.api.model.CancelInvitesRequest](docs/CancelInvitesRequest.md)
 - [org.openapitools.server.api.model.CancelInvitesResponse](docs/CancelInvitesResponse.md)
 - [org.openapitools.server.api.model.CarouselSlot](docs/CarouselSlot.md)
 - [org.openapitools.server.api.model.CartingProduct](docs/CartingProduct.md)
 - [org.openapitools.server.api.model.CartingRetailer](docs/CartingRetailer.md)
 - [org.openapitools.server.api.model.Catalog](docs/Catalog.md)
 - [org.openapitools.server.api.model.CatalogBinding](docs/CatalogBinding.md)
 - [org.openapitools.server.api.model.CatalogCreate](docs/CatalogCreate.md)
 - [org.openapitools.server.api.model.CatalogUpdate](docs/CatalogUpdate.md)
 - [org.openapitools.server.api.model.CatalogsAiContentDisclosure](docs/CatalogsAiContentDisclosure.md)
 - [org.openapitools.server.api.model.CatalogsAiContentDisclosureLabel](docs/CatalogsAiContentDisclosureLabel.md)
 - [org.openapitools.server.api.model.CatalogsAvailableFilterValues](docs/CatalogsAvailableFilterValues.md)
 - [org.openapitools.server.api.model.CatalogsBaseFilterKeys](docs/CatalogsBaseFilterKeys.md)
 - [org.openapitools.server.api.model.CatalogsBaseFiltersAllOf](docs/CatalogsBaseFiltersAllOf.md)
 - [org.openapitools.server.api.model.CatalogsBaseFiltersAnyOf](docs/CatalogsBaseFiltersAnyOf.md)
 - [org.openapitools.server.api.model.CatalogsCreateCreativeAssetsItem](docs/CatalogsCreateCreativeAssetsItem.md)
 - [org.openapitools.server.api.model.CatalogsCreateHotelItem](docs/CatalogsCreateHotelItem.md)
 - [org.openapitools.server.api.model.CatalogsCreateReportResponse](docs/CatalogsCreateReportResponse.md)
 - [org.openapitools.server.api.model.CatalogsCreateRetailItem](docs/CatalogsCreateRetailItem.md)
 - [org.openapitools.server.api.model.CatalogsCreativeAssetsAttributes](docs/CatalogsCreativeAssetsAttributes.md)
 - [org.openapitools.server.api.model.CatalogsCreativeAssetsAvailableFilterValues](docs/CatalogsCreativeAssetsAvailableFilterValues.md)
 - [org.openapitools.server.api.model.CatalogsCreativeAssetsBatchItem](docs/CatalogsCreativeAssetsBatchItem.md)
 - [org.openapitools.server.api.model.CatalogsCreativeAssetsBatchRequest](docs/CatalogsCreativeAssetsBatchRequest.md)
 - [org.openapitools.server.api.model.CatalogsCreativeAssetsFeed](docs/CatalogsCreativeAssetsFeed.md)
 - [org.openapitools.server.api.model.CatalogsCreativeAssetsFeedsCreateRequest](docs/CatalogsCreativeAssetsFeedsCreateRequest.md)
 - [org.openapitools.server.api.model.CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale](docs/CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale.md)
 - [org.openapitools.server.api.model.CatalogsCreativeAssetsFeedsUpdateRequest](docs/CatalogsCreativeAssetsFeedsUpdateRequest.md)
 - [org.openapitools.server.api.model.CatalogsCreativeAssetsFilterValuesMap](docs/CatalogsCreativeAssetsFilterValuesMap.md)
 - [org.openapitools.server.api.model.CatalogsCreativeAssetsItemErrorResponse](docs/CatalogsCreativeAssetsItemErrorResponse.md)
 - [org.openapitools.server.api.model.CatalogsCreativeAssetsItemResponse](docs/CatalogsCreativeAssetsItemResponse.md)
 - [org.openapitools.server.api.model.CatalogsCreativeAssetsItemsBatch](docs/CatalogsCreativeAssetsItemsBatch.md)
 - [org.openapitools.server.api.model.CatalogsCreativeAssetsItemsPostFilter](docs/CatalogsCreativeAssetsItemsPostFilter.md)
 - [org.openapitools.server.api.model.CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest](docs/CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest.md)
 - [org.openapitools.server.api.model.CatalogsCreativeAssetsProduct](docs/CatalogsCreativeAssetsProduct.md)
 - [org.openapitools.server.api.model.CatalogsCreativeAssetsProductGroup](docs/CatalogsCreativeAssetsProductGroup.md)
 - [org.openapitools.server.api.model.CatalogsCreativeAssetsProductGroupCreateRequest](docs/CatalogsCreativeAssetsProductGroupCreateRequest.md)
 - [org.openapitools.server.api.model.CatalogsCreativeAssetsProductGroupFilterKeys](docs/CatalogsCreativeAssetsProductGroupFilterKeys.md)
 - [org.openapitools.server.api.model.CatalogsCreativeAssetsProductGroupFilters](docs/CatalogsCreativeAssetsProductGroupFilters.md)
 - [org.openapitools.server.api.model.CatalogsCreativeAssetsProductGroupFiltersAllOf](docs/CatalogsCreativeAssetsProductGroupFiltersAllOf.md)
 - [org.openapitools.server.api.model.CatalogsCreativeAssetsProductGroupFiltersAnyOf](docs/CatalogsCreativeAssetsProductGroupFiltersAnyOf.md)
 - [org.openapitools.server.api.model.CatalogsCreativeAssetsProductGroupProductCounts](docs/CatalogsCreativeAssetsProductGroupProductCounts.md)
 - [org.openapitools.server.api.model.CatalogsCreativeAssetsProductGroupUpdateRequest](docs/CatalogsCreativeAssetsProductGroupUpdateRequest.md)
 - [org.openapitools.server.api.model.CatalogsCreativeAssetsProductMetadata](docs/CatalogsCreativeAssetsProductMetadata.md)
 - [org.openapitools.server.api.model.CatalogsDeleteCreativeAssetsItem](docs/CatalogsDeleteCreativeAssetsItem.md)
 - [org.openapitools.server.api.model.CatalogsDeleteHotelItem](docs/CatalogsDeleteHotelItem.md)
 - [org.openapitools.server.api.model.CatalogsDeleteRetailItem](docs/CatalogsDeleteRetailItem.md)
 - [org.openapitools.server.api.model.CatalogsFeed](docs/CatalogsFeed.md)
 - [org.openapitools.server.api.model.CatalogsFeedCreateRequestSchema](docs/CatalogsFeedCreateRequestSchema.md)
 - [org.openapitools.server.api.model.CatalogsFeedCredentials](docs/CatalogsFeedCredentials.md)
 - [org.openapitools.server.api.model.CatalogsFeedIngestion](docs/CatalogsFeedIngestion.md)
 - [org.openapitools.server.api.model.CatalogsFeedIngestionDetails](docs/CatalogsFeedIngestionDetails.md)
 - [org.openapitools.server.api.model.CatalogsFeedIngestionErrors](docs/CatalogsFeedIngestionErrors.md)
 - [org.openapitools.server.api.model.CatalogsFeedIngestionInfo](docs/CatalogsFeedIngestionInfo.md)
 - [org.openapitools.server.api.model.CatalogsFeedIngestionWarnings](docs/CatalogsFeedIngestionWarnings.md)
 - [org.openapitools.server.api.model.CatalogsFeedProcessingResult](docs/CatalogsFeedProcessingResult.md)
 - [org.openapitools.server.api.model.CatalogsFeedProcessingSchedule](docs/CatalogsFeedProcessingSchedule.md)
 - [org.openapitools.server.api.model.CatalogsFeedProcessingScheduleTimezone](docs/CatalogsFeedProcessingScheduleTimezone.md)
 - [org.openapitools.server.api.model.CatalogsFeedProcessingStatus](docs/CatalogsFeedProcessingStatus.md)
 - [org.openapitools.server.api.model.CatalogsFeedProductCounts](docs/CatalogsFeedProductCounts.md)
 - [org.openapitools.server.api.model.CatalogsFeedUpdateRequestSchema](docs/CatalogsFeedUpdateRequestSchema.md)
 - [org.openapitools.server.api.model.CatalogsFeedValidationDetails](docs/CatalogsFeedValidationDetails.md)
 - [org.openapitools.server.api.model.CatalogsFeedValidationErrors](docs/CatalogsFeedValidationErrors.md)
 - [org.openapitools.server.api.model.CatalogsFeedValidationWarnings](docs/CatalogsFeedValidationWarnings.md)
 - [org.openapitools.server.api.model.CatalogsFeedVideoCounts](docs/CatalogsFeedVideoCounts.md)
 - [org.openapitools.server.api.model.CatalogsFeedsCreateRequest](docs/CatalogsFeedsCreateRequest.md)
 - [org.openapitools.server.api.model.CatalogsFeedsUpdateRequest](docs/CatalogsFeedsUpdateRequest.md)
 - [org.openapitools.server.api.model.CatalogsFormat](docs/CatalogsFormat.md)
 - [org.openapitools.server.api.model.CatalogsHotelAddress](docs/CatalogsHotelAddress.md)
 - [org.openapitools.server.api.model.CatalogsHotelAttributes](docs/CatalogsHotelAttributes.md)
 - [org.openapitools.server.api.model.CatalogsHotelAvailableFilterValues](docs/CatalogsHotelAvailableFilterValues.md)
 - [org.openapitools.server.api.model.CatalogsHotelBatchItem](docs/CatalogsHotelBatchItem.md)
 - [org.openapitools.server.api.model.CatalogsHotelBatchRequest](docs/CatalogsHotelBatchRequest.md)
 - [org.openapitools.server.api.model.CatalogsHotelFeed](docs/CatalogsHotelFeed.md)
 - [org.openapitools.server.api.model.CatalogsHotelFeedsCreateRequest](docs/CatalogsHotelFeedsCreateRequest.md)
 - [org.openapitools.server.api.model.CatalogsHotelFeedsUpdateRequest](docs/CatalogsHotelFeedsUpdateRequest.md)
 - [org.openapitools.server.api.model.CatalogsHotelFilterValuesMap](docs/CatalogsHotelFilterValuesMap.md)
 - [org.openapitools.server.api.model.CatalogsHotelGuestRatings](docs/CatalogsHotelGuestRatings.md)
 - [org.openapitools.server.api.model.CatalogsHotelItemErrorResponse](docs/CatalogsHotelItemErrorResponse.md)
 - [org.openapitools.server.api.model.CatalogsHotelItemResponse](docs/CatalogsHotelItemResponse.md)
 - [org.openapitools.server.api.model.CatalogsHotelItemsBatch](docs/CatalogsHotelItemsBatch.md)
 - [org.openapitools.server.api.model.CatalogsHotelItemsPostFilter](docs/CatalogsHotelItemsPostFilter.md)
 - [org.openapitools.server.api.model.CatalogsHotelListProductsByCatalogBasedFilterRequest](docs/CatalogsHotelListProductsByCatalogBasedFilterRequest.md)
 - [org.openapitools.server.api.model.CatalogsHotelMainImage](docs/CatalogsHotelMainImage.md)
 - [org.openapitools.server.api.model.CatalogsHotelProduct](docs/CatalogsHotelProduct.md)
 - [org.openapitools.server.api.model.CatalogsHotelProductGroup](docs/CatalogsHotelProductGroup.md)
 - [org.openapitools.server.api.model.CatalogsHotelProductGroupCreateRequest](docs/CatalogsHotelProductGroupCreateRequest.md)
 - [org.openapitools.server.api.model.CatalogsHotelProductGroupFilterKeys](docs/CatalogsHotelProductGroupFilterKeys.md)
 - [org.openapitools.server.api.model.CatalogsHotelProductGroupFilters](docs/CatalogsHotelProductGroupFilters.md)
 - [org.openapitools.server.api.model.CatalogsHotelProductGroupFiltersAllOf](docs/CatalogsHotelProductGroupFiltersAllOf.md)
 - [org.openapitools.server.api.model.CatalogsHotelProductGroupFiltersAnyOf](docs/CatalogsHotelProductGroupFiltersAnyOf.md)
 - [org.openapitools.server.api.model.CatalogsHotelProductGroupProductCounts](docs/CatalogsHotelProductGroupProductCounts.md)
 - [org.openapitools.server.api.model.CatalogsHotelProductGroupType](docs/CatalogsHotelProductGroupType.md)
 - [org.openapitools.server.api.model.CatalogsHotelProductGroupUpdateRequest](docs/CatalogsHotelProductGroupUpdateRequest.md)
 - [org.openapitools.server.api.model.CatalogsHotelProductMetadata](docs/CatalogsHotelProductMetadata.md)
 - [org.openapitools.server.api.model.CatalogsHotelReportParameters](docs/CatalogsHotelReportParameters.md)
 - [org.openapitools.server.api.model.CatalogsHotelReportParametersReport](docs/CatalogsHotelReportParametersReport.md)
 - [org.openapitools.server.api.model.CatalogsHotelReportStatsParameters](docs/CatalogsHotelReportStatsParameters.md)
 - [org.openapitools.server.api.model.CatalogsHotelReportStatsParametersReport](docs/CatalogsHotelReportStatsParametersReport.md)
 - [org.openapitools.server.api.model.CatalogsItemValidationDetails](docs/CatalogsItemValidationDetails.md)
 - [org.openapitools.server.api.model.CatalogsItemValidationErrors](docs/CatalogsItemValidationErrors.md)
 - [org.openapitools.server.api.model.CatalogsItemValidationIssue](docs/CatalogsItemValidationIssue.md)
 - [org.openapitools.server.api.model.CatalogsItemValidationIssues](docs/CatalogsItemValidationIssues.md)
 - [org.openapitools.server.api.model.CatalogsItemValidationWarnings](docs/CatalogsItemValidationWarnings.md)
 - [org.openapitools.server.api.model.CatalogsItemsBatch](docs/CatalogsItemsBatch.md)
 - [org.openapitools.server.api.model.CatalogsItemsBatchPostRequest](docs/CatalogsItemsBatchPostRequest.md)
 - [org.openapitools.server.api.model.CatalogsItemsBatchRequest](docs/CatalogsItemsBatchRequest.md)
 - [org.openapitools.server.api.model.CatalogsItemsCreateBatchRequest](docs/CatalogsItemsCreateBatchRequest.md)
 - [org.openapitools.server.api.model.CatalogsItemsDeleteBatchRequest](docs/CatalogsItemsDeleteBatchRequest.md)
 - [org.openapitools.server.api.model.CatalogsItemsDeleteDiscontinuedBatchRequest](docs/CatalogsItemsDeleteDiscontinuedBatchRequest.md)
 - [org.openapitools.server.api.model.CatalogsItemsPostFilters](docs/CatalogsItemsPostFilters.md)
 - [org.openapitools.server.api.model.CatalogsItemsRequest](docs/CatalogsItemsRequest.md)
 - [org.openapitools.server.api.model.CatalogsItemsUpdateBatchRequest](docs/CatalogsItemsUpdateBatchRequest.md)
 - [org.openapitools.server.api.model.CatalogsItemsUpsertBatchRequest](docs/CatalogsItemsUpsertBatchRequest.md)
 - [org.openapitools.server.api.model.CatalogsList200Response](docs/CatalogsList200Response.md)
 - [org.openapitools.server.api.model.CatalogsListProductsByFeedBasedFilter](docs/CatalogsListProductsByFeedBasedFilter.md)
 - [org.openapitools.server.api.model.CatalogsListProductsByFilterRequest](docs/CatalogsListProductsByFilterRequest.md)
 - [org.openapitools.server.api.model.CatalogsLocalStoresCreate200ResponseInner](docs/CatalogsLocalStoresCreate200ResponseInner.md)
 - [org.openapitools.server.api.model.CatalogsLocalStoresCreate200ResponseInnerData](docs/CatalogsLocalStoresCreate200ResponseInnerData.md)
 - [org.openapitools.server.api.model.CatalogsLocalStoresCreate200ResponseInnerDataOneOf](docs/CatalogsLocalStoresCreate200ResponseInnerDataOneOf.md)
 - [org.openapitools.server.api.model.CatalogsLocalStoresDelete200ResponseInner](docs/CatalogsLocalStoresDelete200ResponseInner.md)
 - [org.openapitools.server.api.model.CatalogsLocalStoresList200Response](docs/CatalogsLocalStoresList200Response.md)
 - [org.openapitools.server.api.model.CatalogsLocale](docs/CatalogsLocale.md)
 - [org.openapitools.server.api.model.CatalogsProduct](docs/CatalogsProduct.md)
 - [org.openapitools.server.api.model.CatalogsProductGroupCreateRequest](docs/CatalogsProductGroupCreateRequest.md)
 - [org.openapitools.server.api.model.CatalogsProductGroupCurrencyCriteria](docs/CatalogsProductGroupCurrencyCriteria.md)
 - [org.openapitools.server.api.model.CatalogsProductGroupFilterKeys](docs/CatalogsProductGroupFilterKeys.md)
 - [org.openapitools.server.api.model.CatalogsProductGroupFilterOperatorTypeCriteria](docs/CatalogsProductGroupFilterOperatorTypeCriteria.md)
 - [org.openapitools.server.api.model.CatalogsProductGroupFilters](docs/CatalogsProductGroupFilters.md)
 - [org.openapitools.server.api.model.CatalogsProductGroupFiltersAllOf](docs/CatalogsProductGroupFiltersAllOf.md)
 - [org.openapitools.server.api.model.CatalogsProductGroupFiltersAnyOf](docs/CatalogsProductGroupFiltersAnyOf.md)
 - [org.openapitools.server.api.model.CatalogsProductGroupFiltersRequest](docs/CatalogsProductGroupFiltersRequest.md)
 - [org.openapitools.server.api.model.CatalogsProductGroupFiltersRequestAnyOfItems0](docs/CatalogsProductGroupFiltersRequestAnyOfItems0.md)
 - [org.openapitools.server.api.model.CatalogsProductGroupFiltersRequestAnyOfItems1](docs/CatalogsProductGroupFiltersRequestAnyOfItems1.md)
 - [org.openapitools.server.api.model.CatalogsProductGroupMultipleCountriesCriteria](docs/CatalogsProductGroupMultipleCountriesCriteria.md)
 - [org.openapitools.server.api.model.CatalogsProductGroupMultipleGenderCriteria](docs/CatalogsProductGroupMultipleGenderCriteria.md)
 - [org.openapitools.server.api.model.CatalogsProductGroupMultipleMediaTypesCriteria](docs/CatalogsProductGroupMultipleMediaTypesCriteria.md)
 - [org.openapitools.server.api.model.CatalogsProductGroupMultiplePinterestProductCategoryCriteria](docs/CatalogsProductGroupMultiplePinterestProductCategoryCriteria.md)
 - [org.openapitools.server.api.model.CatalogsProductGroupMultipleStringCriteria](docs/CatalogsProductGroupMultipleStringCriteria.md)
 - [org.openapitools.server.api.model.CatalogsProductGroupMultipleStringListCriteria](docs/CatalogsProductGroupMultipleStringListCriteria.md)
 - [org.openapitools.server.api.model.CatalogsProductGroupPinsList200Response](docs/CatalogsProductGroupPinsList200Response.md)
 - [org.openapitools.server.api.model.CatalogsProductGroupPricingCriteria](docs/CatalogsProductGroupPricingCriteria.md)
 - [org.openapitools.server.api.model.CatalogsProductGroupProductCountsVertical](docs/CatalogsProductGroupProductCountsVertical.md)
 - [org.openapitools.server.api.model.CatalogsProductGroupStatus](docs/CatalogsProductGroupStatus.md)
 - [org.openapitools.server.api.model.CatalogsProductGroupType](docs/CatalogsProductGroupType.md)
 - [org.openapitools.server.api.model.CatalogsProductGroupUint32Criteria](docs/CatalogsProductGroupUint32Criteria.md)
 - [org.openapitools.server.api.model.CatalogsProductGroupUpdateManyRequestItemsOneOfItems0](docs/CatalogsProductGroupUpdateManyRequestItemsOneOfItems0.md)
 - [org.openapitools.server.api.model.CatalogsProductGroupUpdateRequest](docs/CatalogsProductGroupUpdateRequest.md)
 - [org.openapitools.server.api.model.CatalogsProductGroupsCreateManyRequestItems](docs/CatalogsProductGroupsCreateManyRequestItems.md)
 - [org.openapitools.server.api.model.CatalogsProductGroupsCreateRequestSchema](docs/CatalogsProductGroupsCreateRequestSchema.md)
 - [org.openapitools.server.api.model.CatalogsProductGroupsList200Response](docs/CatalogsProductGroupsList200Response.md)
 - [org.openapitools.server.api.model.CatalogsProductGroupsUpdateRequestSchema](docs/CatalogsProductGroupsUpdateRequestSchema.md)
 - [org.openapitools.server.api.model.CatalogsReport](docs/CatalogsReport.md)
 - [org.openapitools.server.api.model.CatalogsReportDistributionIssueFilter](docs/CatalogsReportDistributionIssueFilter.md)
 - [org.openapitools.server.api.model.CatalogsReportDistributionStats](docs/CatalogsReportDistributionStats.md)
 - [org.openapitools.server.api.model.CatalogsReportFeedIngestionFilter](docs/CatalogsReportFeedIngestionFilter.md)
 - [org.openapitools.server.api.model.CatalogsReportFeedIngestionStats](docs/CatalogsReportFeedIngestionStats.md)
 - [org.openapitools.server.api.model.CatalogsReportParameters](docs/CatalogsReportParameters.md)
 - [org.openapitools.server.api.model.CatalogsReportStats](docs/CatalogsReportStats.md)
 - [org.openapitools.server.api.model.CatalogsReportStatsParameters](docs/CatalogsReportStatsParameters.md)
 - [org.openapitools.server.api.model.CatalogsRetailAvailableFilterValues](docs/CatalogsRetailAvailableFilterValues.md)
 - [org.openapitools.server.api.model.CatalogsRetailBatchRequest](docs/CatalogsRetailBatchRequest.md)
 - [org.openapitools.server.api.model.CatalogsRetailBatchRequestItemsItems](docs/CatalogsRetailBatchRequestItemsItems.md)
 - [org.openapitools.server.api.model.CatalogsRetailFeed](docs/CatalogsRetailFeed.md)
 - [org.openapitools.server.api.model.CatalogsRetailFeedsCreateRequest](docs/CatalogsRetailFeedsCreateRequest.md)
 - [org.openapitools.server.api.model.CatalogsRetailFeedsUpdateRequest](docs/CatalogsRetailFeedsUpdateRequest.md)
 - [org.openapitools.server.api.model.CatalogsRetailFilterValuesMap](docs/CatalogsRetailFilterValuesMap.md)
 - [org.openapitools.server.api.model.CatalogsRetailItemErrorResponse](docs/CatalogsRetailItemErrorResponse.md)
 - [org.openapitools.server.api.model.CatalogsRetailItemResponse](docs/CatalogsRetailItemResponse.md)
 - [org.openapitools.server.api.model.CatalogsRetailItemsBatch](docs/CatalogsRetailItemsBatch.md)
 - [org.openapitools.server.api.model.CatalogsRetailItemsPostFilter](docs/CatalogsRetailItemsPostFilter.md)
 - [org.openapitools.server.api.model.CatalogsRetailListProductsByCatalogBasedFilterRequest](docs/CatalogsRetailListProductsByCatalogBasedFilterRequest.md)
 - [org.openapitools.server.api.model.CatalogsRetailProduct](docs/CatalogsRetailProduct.md)
 - [org.openapitools.server.api.model.CatalogsRetailProductGroup](docs/CatalogsRetailProductGroup.md)
 - [org.openapitools.server.api.model.CatalogsRetailProductGroupCreateRequest](docs/CatalogsRetailProductGroupCreateRequest.md)
 - [org.openapitools.server.api.model.CatalogsRetailProductGroupProductCounts](docs/CatalogsRetailProductGroupProductCounts.md)
 - [org.openapitools.server.api.model.CatalogsRetailProductGroupUpdateRequest](docs/CatalogsRetailProductGroupUpdateRequest.md)
 - [org.openapitools.server.api.model.CatalogsRetailProductMetadata](docs/CatalogsRetailProductMetadata.md)
 - [org.openapitools.server.api.model.CatalogsRetailReportAllItemsFilter](docs/CatalogsRetailReportAllItemsFilter.md)
 - [org.openapitools.server.api.model.CatalogsRetailReportParameters](docs/CatalogsRetailReportParameters.md)
 - [org.openapitools.server.api.model.CatalogsRetailReportParametersReport](docs/CatalogsRetailReportParametersReport.md)
 - [org.openapitools.server.api.model.CatalogsRetailReportStatsParameters](docs/CatalogsRetailReportStatsParameters.md)
 - [org.openapitools.server.api.model.CatalogsRetailReportStatsParametersReport](docs/CatalogsRetailReportStatsParametersReport.md)
 - [org.openapitools.server.api.model.CatalogsStatus](docs/CatalogsStatus.md)
 - [org.openapitools.server.api.model.CatalogsType](docs/CatalogsType.md)
 - [org.openapitools.server.api.model.CatalogsUpdatableCreativeAssetsAttributes](docs/CatalogsUpdatableCreativeAssetsAttributes.md)
 - [org.openapitools.server.api.model.CatalogsUpdatableHotelAttributes](docs/CatalogsUpdatableHotelAttributes.md)
 - [org.openapitools.server.api.model.CatalogsUpdateCreativeAssetsItem](docs/CatalogsUpdateCreativeAssetsItem.md)
 - [org.openapitools.server.api.model.CatalogsUpdateHotelItem](docs/CatalogsUpdateHotelItem.md)
 - [org.openapitools.server.api.model.CatalogsUpdateRetailItem](docs/CatalogsUpdateRetailItem.md)
 - [org.openapitools.server.api.model.CatalogsUpsertCreativeAssetsItem](docs/CatalogsUpsertCreativeAssetsItem.md)
 - [org.openapitools.server.api.model.CatalogsUpsertHotelItem](docs/CatalogsUpsertHotelItem.md)
 - [org.openapitools.server.api.model.CatalogsUpsertRetailItem](docs/CatalogsUpsertRetailItem.md)
 - [org.openapitools.server.api.model.CatalogsVerticalBatchRequest](docs/CatalogsVerticalBatchRequest.md)
 - [org.openapitools.server.api.model.CatalogsVerticalFeedsCreateRequest](docs/CatalogsVerticalFeedsCreateRequest.md)
 - [org.openapitools.server.api.model.CatalogsVerticalFeedsUpdateRequest](docs/CatalogsVerticalFeedsUpdateRequest.md)
 - [org.openapitools.server.api.model.CatalogsVerticalProductGroup](docs/CatalogsVerticalProductGroup.md)
 - [org.openapitools.server.api.model.CatalogsVerticalProductGroupCreateRequest](docs/CatalogsVerticalProductGroupCreateRequest.md)
 - [org.openapitools.server.api.model.CatalogsVerticalProductGroupUpdateRequest](docs/CatalogsVerticalProductGroupUpdateRequest.md)
 - [org.openapitools.server.api.model.CatalogsVerticalsListProductsByCatalogBasedFilterRequest](docs/CatalogsVerticalsListProductsByCatalogBasedFilterRequest.md)
 - [org.openapitools.server.api.model.ChangeHistoryDataType](docs/ChangeHistoryDataType.md)
 - [org.openapitools.server.api.model.ChangeHistoryOperationType](docs/ChangeHistoryOperationType.md)
 - [org.openapitools.server.api.model.CollectionsHeaderType](docs/CollectionsHeaderType.md)
 - [org.openapitools.server.api.model.ConditionFilter](docs/ConditionFilter.md)
 - [org.openapitools.server.api.model.ContentType](docs/ContentType.md)
 - [org.openapitools.server.api.model.ConversionAccessToken](docs/ConversionAccessToken.md)
 - [org.openapitools.server.api.model.ConversionApiResponseEventsItems](docs/ConversionApiResponseEventsItems.md)
 - [org.openapitools.server.api.model.ConversionAttributionWindowDays](docs/ConversionAttributionWindowDays.md)
 - [org.openapitools.server.api.model.ConversionDeletionRequest](docs/ConversionDeletionRequest.md)
 - [org.openapitools.server.api.model.ConversionDeletionRequestCreate](docs/ConversionDeletionRequestCreate.md)
 - [org.openapitools.server.api.model.ConversionDeletionRequestEPIKTargets](docs/ConversionDeletionRequestEPIKTargets.md)
 - [org.openapitools.server.api.model.ConversionDeletionRequestList200Response](docs/ConversionDeletionRequestList200Response.md)
 - [org.openapitools.server.api.model.ConversionDeletionRequestStatus](docs/ConversionDeletionRequestStatus.md)
 - [org.openapitools.server.api.model.ConversionDeletionRequestTargets](docs/ConversionDeletionRequestTargets.md)
 - [org.openapitools.server.api.model.ConversionDeletionRequestUserEmailTargets](docs/ConversionDeletionRequestUserEmailTargets.md)
 - [org.openapitools.server.api.model.ConversionEvent](docs/ConversionEvent.md)
 - [org.openapitools.server.api.model.ConversionEventAppInfo](docs/ConversionEventAppInfo.md)
 - [org.openapitools.server.api.model.ConversionEventDeviceInfo](docs/ConversionEventDeviceInfo.md)
 - [org.openapitools.server.api.model.ConversionEventIngestionSource](docs/ConversionEventIngestionSource.md)
 - [org.openapitools.server.api.model.ConversionEventResponse](docs/ConversionEventResponse.md)
 - [org.openapitools.server.api.model.ConversionEvents](docs/ConversionEvents.md)
 - [org.openapitools.server.api.model.ConversionEventsCreate](docs/ConversionEventsCreate.md)
 - [org.openapitools.server.api.model.ConversionEventsDataItems](docs/ConversionEventsDataItems.md)
 - [org.openapitools.server.api.model.ConversionEventsDataItemsCustomData](docs/ConversionEventsDataItemsCustomData.md)
 - [org.openapitools.server.api.model.ConversionEventsDataItemsCustomDataContentsItems](docs/ConversionEventsDataItemsCustomDataContentsItems.md)
 - [org.openapitools.server.api.model.ConversionEventsUserDataProperties](docs/ConversionEventsUserDataProperties.md)
 - [org.openapitools.server.api.model.ConversionHealthSelectionItem](docs/ConversionHealthSelectionItem.md)
 - [org.openapitools.server.api.model.ConversionLearningModeType](docs/ConversionLearningModeType.md)
 - [org.openapitools.server.api.model.ConversionMSOTEventsCreate](docs/ConversionMSOTEventsCreate.md)
 - [org.openapitools.server.api.model.ConversionObjectiveType](docs/ConversionObjectiveType.md)
 - [org.openapitools.server.api.model.ConversionProductAttributionType](docs/ConversionProductAttributionType.md)
 - [org.openapitools.server.api.model.ConversionProductReport](docs/ConversionProductReport.md)
 - [org.openapitools.server.api.model.ConversionProductReportBreakdownType](docs/ConversionProductReportBreakdownType.md)
 - [org.openapitools.server.api.model.ConversionProductReportCreate](docs/ConversionProductReportCreate.md)
 - [org.openapitools.server.api.model.ConversionProductReportGranularity](docs/ConversionProductReportGranularity.md)
 - [org.openapitools.server.api.model.ConversionProductReportLevel](docs/ConversionProductReportLevel.md)
 - [org.openapitools.server.api.model.ConversionProductReportingColumn](docs/ConversionProductReportingColumn.md)
 - [org.openapitools.server.api.model.ConversionReportAttributionType](docs/ConversionReportAttributionType.md)
 - [org.openapitools.server.api.model.ConversionReportTimeType](docs/ConversionReportTimeType.md)
 - [org.openapitools.server.api.model.ConversionTag](docs/ConversionTag.md)
 - [org.openapitools.server.api.model.ConversionTagCommon](docs/ConversionTagCommon.md)
 - [org.openapitools.server.api.model.ConversionTagConfigs](docs/ConversionTagConfigs.md)
 - [org.openapitools.server.api.model.ConversionTagCreate](docs/ConversionTagCreate.md)
 - [org.openapitools.server.api.model.ConversionTagResponse](docs/ConversionTagResponse.md)
 - [org.openapitools.server.api.model.ConversionTagType](docs/ConversionTagType.md)
 - [org.openapitools.server.api.model.ConversionTagTypeOptimal](docs/ConversionTagTypeOptimal.md)
 - [org.openapitools.server.api.model.ConversionTagV3GoalMetadata](docs/ConversionTagV3GoalMetadata.md)
 - [org.openapitools.server.api.model.ConversionTagsList200Response](docs/ConversionTagsList200Response.md)
 - [org.openapitools.server.api.model.Country](docs/Country.md)
 - [org.openapitools.server.api.model.CountryFilter](docs/CountryFilter.md)
 - [org.openapitools.server.api.model.CreateAssetAccessRequestBody](docs/CreateAssetAccessRequestBody.md)
 - [org.openapitools.server.api.model.CreateAssetAccessRequestItem](docs/CreateAssetAccessRequestItem.md)
 - [org.openapitools.server.api.model.CreateAssetAccessRequestResponse](docs/CreateAssetAccessRequestResponse.md)
 - [org.openapitools.server.api.model.CreateAssetInvitesRequest](docs/CreateAssetInvitesRequest.md)
 - [org.openapitools.server.api.model.CreateAssetInvitesRequestItem](docs/CreateAssetInvitesRequestItem.md)
 - [org.openapitools.server.api.model.CreateInvitesResultsResponseArray](docs/CreateInvitesResultsResponseArray.md)
 - [org.openapitools.server.api.model.CreateMembershipOrPartnershipInvitesBody](docs/CreateMembershipOrPartnershipInvitesBody.md)
 - [org.openapitools.server.api.model.CreationSource](docs/CreationSource.md)
 - [org.openapitools.server.api.model.CreativeAssetsIdFilter](docs/CreativeAssetsIdFilter.md)
 - [org.openapitools.server.api.model.CreativeAssetsProcessingRecord](docs/CreativeAssetsProcessingRecord.md)
 - [org.openapitools.server.api.model.CreativeAssetsVisibilityType](docs/CreativeAssetsVisibilityType.md)
 - [org.openapitools.server.api.model.CreativeType](docs/CreativeType.md)
 - [org.openapitools.server.api.model.Currency](docs/Currency.md)
 - [org.openapitools.server.api.model.CurrencyFilter](docs/CurrencyFilter.md)
 - [org.openapitools.server.api.model.CustomConversionEventMetrics](docs/CustomConversionEventMetrics.md)
 - [org.openapitools.server.api.model.CustomLabel0Filter](docs/CustomLabel0Filter.md)
 - [org.openapitools.server.api.model.CustomLabel1Filter](docs/CustomLabel1Filter.md)
 - [org.openapitools.server.api.model.CustomLabel2Filter](docs/CustomLabel2Filter.md)
 - [org.openapitools.server.api.model.CustomLabel3Filter](docs/CustomLabel3Filter.md)
 - [org.openapitools.server.api.model.CustomLabel4Filter](docs/CustomLabel4Filter.md)
 - [org.openapitools.server.api.model.CustomNumber0Filter](docs/CustomNumber0Filter.md)
 - [org.openapitools.server.api.model.CustomNumber1Filter](docs/CustomNumber1Filter.md)
 - [org.openapitools.server.api.model.CustomNumber2Filter](docs/CustomNumber2Filter.md)
 - [org.openapitools.server.api.model.CustomNumber3Filter](docs/CustomNumber3Filter.md)
 - [org.openapitools.server.api.model.CustomNumber4Filter](docs/CustomNumber4Filter.md)
 - [org.openapitools.server.api.model.CustomerList](docs/CustomerList.md)
 - [org.openapitools.server.api.model.CustomerListCreate](docs/CustomerListCreate.md)
 - [org.openapitools.server.api.model.CustomerListRecordRow](docs/CustomerListRecordRow.md)
 - [org.openapitools.server.api.model.CustomerListStatus](docs/CustomerListStatus.md)
 - [org.openapitools.server.api.model.CustomerListUpdateWithRequiredBody](docs/CustomerListUpdateWithRequiredBody.md)
 - [org.openapitools.server.api.model.CustomerListUpload](docs/CustomerListUpload.md)
 - [org.openapitools.server.api.model.CustomerListUploadCreateRequest](docs/CustomerListUploadCreateRequest.md)
 - [org.openapitools.server.api.model.CustomerListUploadCreateResponse](docs/CustomerListUploadCreateResponse.md)
 - [org.openapitools.server.api.model.CustomerListsList200Response](docs/CustomerListsList200Response.md)
 - [org.openapitools.server.api.model.CustomerSegment](docs/CustomerSegment.md)
 - [org.openapitools.server.api.model.CustomerSegmentCreate](docs/CustomerSegmentCreate.md)
 - [org.openapitools.server.api.model.CustomerSegmentList200Response](docs/CustomerSegmentList200Response.md)
 - [org.openapitools.server.api.model.CustomerSegmentUpdateRequestUpdateWithRequiredBody](docs/CustomerSegmentUpdateRequestUpdateWithRequiredBody.md)
 - [org.openapitools.server.api.model.CustomizableCTAType](docs/CustomizableCTAType.md)
 - [org.openapitools.server.api.model.DataOutputFormat](docs/DataOutputFormat.md)
 - [org.openapitools.server.api.model.DataStatus](docs/DataStatus.md)
 - [org.openapitools.server.api.model.DeleteBusinessMembership200Response](docs/DeleteBusinessMembership200Response.md)
 - [org.openapitools.server.api.model.DeleteBusinessMembershipBody](docs/DeleteBusinessMembershipBody.md)
 - [org.openapitools.server.api.model.DeleteBusinessMembershipMember](docs/DeleteBusinessMembershipMember.md)
 - [org.openapitools.server.api.model.DeleteBusinessPartners](docs/DeleteBusinessPartners.md)
 - [org.openapitools.server.api.model.DeleteBusinessPartnersDelete](docs/DeleteBusinessPartnersDelete.md)
 - [org.openapitools.server.api.model.DeleteMemberAccessResult](docs/DeleteMemberAccessResult.md)
 - [org.openapitools.server.api.model.DeleteMemberAccessResultsResponseArray](docs/DeleteMemberAccessResultsResponseArray.md)
 - [org.openapitools.server.api.model.DeleteMemberAssetAccessItem](docs/DeleteMemberAssetAccessItem.md)
 - [org.openapitools.server.api.model.DeletePartnerAssetAccessBody](docs/DeletePartnerAssetAccessBody.md)
 - [org.openapitools.server.api.model.DeletePartnerAssetAccessItem](docs/DeletePartnerAssetAccessItem.md)
 - [org.openapitools.server.api.model.DeletePartnerAssetAccessResult](docs/DeletePartnerAssetAccessResult.md)
 - [org.openapitools.server.api.model.DeletePartnerAssetAccessResultsResponseArray](docs/DeletePartnerAssetAccessResultsResponseArray.md)
 - [org.openapitools.server.api.model.DeliveryEstimateObjectiveType](docs/DeliveryEstimateObjectiveType.md)
 - [org.openapitools.server.api.model.DeliveryMetricsGet200Response](docs/DeliveryMetricsGet200Response.md)
 - [org.openapitools.server.api.model.DeliveryMetricsResponseItemsItems](docs/DeliveryMetricsResponseItemsItems.md)
 - [org.openapitools.server.api.model.DetailedError](docs/DetailedError.md)
 - [org.openapitools.server.api.model.DisclosureType](docs/DisclosureType.md)
 - [org.openapitools.server.api.model.DiscountStatus](docs/DiscountStatus.md)
 - [org.openapitools.server.api.model.DynamicTitlesDownloadCSV](docs/DynamicTitlesDownloadCSV.md)
 - [org.openapitools.server.api.model.DynamicTitlesGetStatus](docs/DynamicTitlesGetStatus.md)
 - [org.openapitools.server.api.model.DynamicTitlesProcessCSV](docs/DynamicTitlesProcessCSV.md)
 - [org.openapitools.server.api.model.DynamicTitlesProcessCSVCreate](docs/DynamicTitlesProcessCSVCreate.md)
 - [org.openapitools.server.api.model.DynamicTitlesProcessCSVError](docs/DynamicTitlesProcessCSVError.md)
 - [org.openapitools.server.api.model.DynamicTitlesUploadURL](docs/DynamicTitlesUploadURL.md)
 - [org.openapitools.server.api.model.EnhancedMatchStatusType](docs/EnhancedMatchStatusType.md)
 - [org.openapitools.server.api.model.EntityDataChangeHistory](docs/EntityDataChangeHistory.md)
 - [org.openapitools.server.api.model.EntityHistory](docs/EntityHistory.md)
 - [org.openapitools.server.api.model.EntityLabel](docs/EntityLabel.md)
 - [org.openapitools.server.api.model.EntityLabelError](docs/EntityLabelError.md)
 - [org.openapitools.server.api.model.EntityLabelStatus](docs/EntityLabelStatus.md)
 - [org.openapitools.server.api.model.EntityStatus](docs/EntityStatus.md)
 - [org.openapitools.server.api.model.ErrorDetail](docs/ErrorDetail.md)
 - [org.openapitools.server.api.model.EventData](docs/EventData.md)
 - [org.openapitools.server.api.model.EventProcessingStatus](docs/EventProcessingStatus.md)
 - [org.openapitools.server.api.model.EventQualityScore](docs/EventQualityScore.md)
 - [org.openapitools.server.api.model.Exception](docs/Exception.md)
 - [org.openapitools.server.api.model.FeaturedTrend](docs/FeaturedTrend.md)
 - [org.openapitools.server.api.model.FeedProcessingResultsList200Response](docs/FeedProcessingResultsList200Response.md)
 - [org.openapitools.server.api.model.FeedsList200Response](docs/FeedsList200Response.md)
 - [org.openapitools.server.api.model.FilterOperatorType](docs/FilterOperatorType.md)
 - [org.openapitools.server.api.model.FollowUser](docs/FollowUser.md)
 - [org.openapitools.server.api.model.FollowUserCreate](docs/FollowUserCreate.md)
 - [org.openapitools.server.api.model.FollowersList200Response](docs/FollowersList200Response.md)
 - [org.openapitools.server.api.model.FormFactor](docs/FormFactor.md)
 - [org.openapitools.server.api.model.FreqBidMultiplierTimeWindow](docs/FreqBidMultiplierTimeWindow.md)
 - [org.openapitools.server.api.model.FrequencyGoalMetadata](docs/FrequencyGoalMetadata.md)
 - [org.openapitools.server.api.model.FrequencyGoalMetadataTimerange](docs/FrequencyGoalMetadataTimerange.md)
 - [org.openapitools.server.api.model.FrequencyMultipliers](docs/FrequencyMultipliers.md)
 - [org.openapitools.server.api.model.Gender](docs/Gender.md)
 - [org.openapitools.server.api.model.GenderBucket](docs/GenderBucket.md)
 - [org.openapitools.server.api.model.GenderDemographics](docs/GenderDemographics.md)
 - [org.openapitools.server.api.model.GenderFilter](docs/GenderFilter.md)
 - [org.openapitools.server.api.model.GenderMultipliers](docs/GenderMultipliers.md)
 - [org.openapitools.server.api.model.GetBusinessEmployers200Response](docs/GetBusinessEmployers200Response.md)
 - [org.openapitools.server.api.model.GetInvites200Response](docs/GetInvites200Response.md)
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
 - [org.openapitools.server.api.model.HttpMethod](docs/HttpMethod.md)
 - [org.openapitools.server.api.model.ImageDetails](docs/ImageDetails.md)
 - [org.openapitools.server.api.model.ImageMetadata](docs/ImageMetadata.md)
 - [org.openapitools.server.api.model.ImageSize](docs/ImageSize.md)
 - [org.openapitools.server.api.model.IneligibleProductTagErrorItem](docs/IneligibleProductTagErrorItem.md)
 - [org.openapitools.server.api.model.IneligibleProductTagReason](docs/IneligibleProductTagReason.md)
 - [org.openapitools.server.api.model.IneligibleProductTagsErrorDetails](docs/IneligibleProductTagsErrorDetails.md)
 - [org.openapitools.server.api.model.IngestionSource](docs/IngestionSource.md)
 - [org.openapitools.server.api.model.IngestionSourceOptions](docs/IngestionSourceOptions.md)
 - [org.openapitools.server.api.model.InnerProductCategoriesMetricsHighlights](docs/InnerProductCategoriesMetricsHighlights.md)
 - [org.openapitools.server.api.model.IntegrationLog](docs/IntegrationLog.md)
 - [org.openapitools.server.api.model.IntegrationLogClientError](docs/IntegrationLogClientError.md)
 - [org.openapitools.server.api.model.IntegrationLogClientRequest](docs/IntegrationLogClientRequest.md)
 - [org.openapitools.server.api.model.IntegrationLogEventType](docs/IntegrationLogEventType.md)
 - [org.openapitools.server.api.model.IntegrationLogLevel](docs/IntegrationLogLevel.md)
 - [org.openapitools.server.api.model.IntegrationLogsInvalidLogResponse](docs/IntegrationLogsInvalidLogResponse.md)
 - [org.openapitools.server.api.model.IntegrationLogsInvalidLogResponseRejectedLogsItems](docs/IntegrationLogsInvalidLogResponseRejectedLogsItems.md)
 - [org.openapitools.server.api.model.IntegrationLogsRequestCreate](docs/IntegrationLogsRequestCreate.md)
 - [org.openapitools.server.api.model.IntegrationLogsSuccessResponse](docs/IntegrationLogsSuccessResponse.md)
 - [org.openapitools.server.api.model.IntegrationMetadata](docs/IntegrationMetadata.md)
 - [org.openapitools.server.api.model.IntegrationMetadataCreate](docs/IntegrationMetadataCreate.md)
 - [org.openapitools.server.api.model.IntegrationMetadataUpdate](docs/IntegrationMetadataUpdate.md)
 - [org.openapitools.server.api.model.IntegrationRecord](docs/IntegrationRecord.md)
 - [org.openapitools.server.api.model.IntegrationsGetList200Response](docs/IntegrationsGetList200Response.md)
 - [org.openapitools.server.api.model.IntendedPromotionType](docs/IntendedPromotionType.md)
 - [org.openapitools.server.api.model.Interest](docs/Interest.md)
 - [org.openapitools.server.api.model.InterestsEnum](docs/InterestsEnum.md)
 - [org.openapitools.server.api.model.InviteActionResultItem](docs/InviteActionResultItem.md)
 - [org.openapitools.server.api.model.InviteAssetsSummary](docs/InviteAssetsSummary.md)
 - [org.openapitools.server.api.model.InviteAssetsSummaryItem](docs/InviteAssetsSummaryItem.md)
 - [org.openapitools.server.api.model.InviteBusinessRoleBinding](docs/InviteBusinessRoleBinding.md)
 - [org.openapitools.server.api.model.InviteDataResponse](docs/InviteDataResponse.md)
 - [org.openapitools.server.api.model.InviteExceptionResponse](docs/InviteExceptionResponse.md)
 - [org.openapitools.server.api.model.InviteFilterStatus](docs/InviteFilterStatus.md)
 - [org.openapitools.server.api.model.InviteResponse](docs/InviteResponse.md)
 - [org.openapitools.server.api.model.InviteStatus](docs/InviteStatus.md)
 - [org.openapitools.server.api.model.InviteType](docs/InviteType.md)
 - [org.openapitools.server.api.model.ItemAttributes](docs/ItemAttributes.md)
 - [org.openapitools.server.api.model.ItemAttributesRequest](docs/ItemAttributesRequest.md)
 - [org.openapitools.server.api.model.ItemAttributesRequestImageLink](docs/ItemAttributesRequestImageLink.md)
 - [org.openapitools.server.api.model.ItemAvailability](docs/ItemAvailability.md)
 - [org.openapitools.server.api.model.ItemCreateBatchRecord](docs/ItemCreateBatchRecord.md)
 - [org.openapitools.server.api.model.ItemDeleteBatchRecord](docs/ItemDeleteBatchRecord.md)
 - [org.openapitools.server.api.model.ItemDeleteDiscontinuedBatchRecord](docs/ItemDeleteDiscontinuedBatchRecord.md)
 - [org.openapitools.server.api.model.ItemGroupIdFilter](docs/ItemGroupIdFilter.md)
 - [org.openapitools.server.api.model.ItemIdFilter](docs/ItemIdFilter.md)
 - [org.openapitools.server.api.model.ItemIdStoreCodePair](docs/ItemIdStoreCodePair.md)
 - [org.openapitools.server.api.model.ItemProcessingRecord](docs/ItemProcessingRecord.md)
 - [org.openapitools.server.api.model.ItemProcessingStatus](docs/ItemProcessingStatus.md)
 - [org.openapitools.server.api.model.ItemResponse](docs/ItemResponse.md)
 - [org.openapitools.server.api.model.ItemUpdateBatchRecord](docs/ItemUpdateBatchRecord.md)
 - [org.openapitools.server.api.model.ItemUpsertBatchRecord](docs/ItemUpsertBatchRecord.md)
 - [org.openapitools.server.api.model.ItemValidationEvent](docs/ItemValidationEvent.md)
 - [org.openapitools.server.api.model.ItemsIssuesList200Response](docs/ItemsIssuesList200Response.md)
 - [org.openapitools.server.api.model.ItemsPost200Response](docs/ItemsPost200Response.md)
 - [org.openapitools.server.api.model.Keyword](docs/Keyword.md)
 - [org.openapitools.server.api.model.KeywordCreateItem](docs/KeywordCreateItem.md)
 - [org.openapitools.server.api.model.KeywordError](docs/KeywordError.md)
 - [org.openapitools.server.api.model.KeywordInfo](docs/KeywordInfo.md)
 - [org.openapitools.server.api.model.KeywordMetrics](docs/KeywordMetrics.md)
 - [org.openapitools.server.api.model.KeywordMetricsResponse](docs/KeywordMetricsResponse.md)
 - [org.openapitools.server.api.model.KeywordUpdateGenerated](docs/KeywordUpdateGenerated.md)
 - [org.openapitools.server.api.model.KeywordUpdateItem](docs/KeywordUpdateItem.md)
 - [org.openapitools.server.api.model.Keywords](docs/Keywords.md)
 - [org.openapitools.server.api.model.KeywordsCommon](docs/KeywordsCommon.md)
 - [org.openapitools.server.api.model.KeywordsCreate](docs/KeywordsCreate.md)
 - [org.openapitools.server.api.model.KeywordsGet200Response](docs/KeywordsGet200Response.md)
 - [org.openapitools.server.api.model.KeywordsMetricsArrayResponse](docs/KeywordsMetricsArrayResponse.md)
 - [org.openapitools.server.api.model.KeywordsRequest](docs/KeywordsRequest.md)
 - [org.openapitools.server.api.model.KeywordsUpdate](docs/KeywordsUpdate.md)
 - [org.openapitools.server.api.model.Label](docs/Label.md)
 - [org.openapitools.server.api.model.LabelBulkCreateRequest](docs/LabelBulkCreateRequest.md)
 - [org.openapitools.server.api.model.LabelBulkUpdateRequest](docs/LabelBulkUpdateRequest.md)
 - [org.openapitools.server.api.model.LabelCreateItem](docs/LabelCreateItem.md)
 - [org.openapitools.server.api.model.LabelCreateRequest](docs/LabelCreateRequest.md)
 - [org.openapitools.server.api.model.LabelError](docs/LabelError.md)
 - [org.openapitools.server.api.model.LabelErrorData](docs/LabelErrorData.md)
 - [org.openapitools.server.api.model.LabelParentType](docs/LabelParentType.md)
 - [org.openapitools.server.api.model.LabelStatus](docs/LabelStatus.md)
 - [org.openapitools.server.api.model.LabelStatusBulkUpdate](docs/LabelStatusBulkUpdate.md)
 - [org.openapitools.server.api.model.LabelType](docs/LabelType.md)
 - [org.openapitools.server.api.model.LabelUpdateItem](docs/LabelUpdateItem.md)
 - [org.openapitools.server.api.model.LabelUpdateRequest](docs/LabelUpdateRequest.md)
 - [org.openapitools.server.api.model.LabeledEntities](docs/LabeledEntities.md)
 - [org.openapitools.server.api.model.LabeledEntitiesCreate](docs/LabeledEntitiesCreate.md)
 - [org.openapitools.server.api.model.LabelsList200Response](docs/LabelsList200Response.md)
 - [org.openapitools.server.api.model.LabelsResponse](docs/LabelsResponse.md)
 - [org.openapitools.server.api.model.Language](docs/Language.md)
 - [org.openapitools.server.api.model.LeadForm](docs/LeadForm.md)
 - [org.openapitools.server.api.model.LeadFormBatchUpdate](docs/LeadFormBatchUpdate.md)
 - [org.openapitools.server.api.model.LeadFormCreate](docs/LeadFormCreate.md)
 - [org.openapitools.server.api.model.LeadFormPolicyLink](docs/LeadFormPolicyLink.md)
 - [org.openapitools.server.api.model.LeadFormQuestion](docs/LeadFormQuestion.md)
 - [org.openapitools.server.api.model.LeadFormQuestionFieldType](docs/LeadFormQuestionFieldType.md)
 - [org.openapitools.server.api.model.LeadFormQuestionType](docs/LeadFormQuestionType.md)
 - [org.openapitools.server.api.model.LeadFormStatus](docs/LeadFormStatus.md)
 - [org.openapitools.server.api.model.LeadFormTest](docs/LeadFormTest.md)
 - [org.openapitools.server.api.model.LeadFormTestCreate](docs/LeadFormTestCreate.md)
 - [org.openapitools.server.api.model.LeadFormsCreate200Response](docs/LeadFormsCreate200Response.md)
 - [org.openapitools.server.api.model.LeadFormsCreate200ResponseItemsInner](docs/LeadFormsCreate200ResponseItemsInner.md)
 - [org.openapitools.server.api.model.LeadFormsList200Response](docs/LeadFormsList200Response.md)
 - [org.openapitools.server.api.model.LeadSubscription](docs/LeadSubscription.md)
 - [org.openapitools.server.api.model.LeadSubscriptionCreate](docs/LeadSubscriptionCreate.md)
 - [org.openapitools.server.api.model.LeadSubscriptionPostParams](docs/LeadSubscriptionPostParams.md)
 - [org.openapitools.server.api.model.LeadSubscriptionPostParamsCreate](docs/LeadSubscriptionPostParamsCreate.md)
 - [org.openapitools.server.api.model.LeadsExportResponseData](docs/LeadsExportResponseData.md)
 - [org.openapitools.server.api.model.LeadsExportStatus](docs/LeadsExportStatus.md)
 - [org.openapitools.server.api.model.LeadsExports](docs/LeadsExports.md)
 - [org.openapitools.server.api.model.LeadsExportsCreate](docs/LeadsExportsCreate.md)
 - [org.openapitools.server.api.model.LineItem](docs/LineItem.md)
 - [org.openapitools.server.api.model.LinkFilter](docs/LinkFilter.md)
 - [org.openapitools.server.api.model.LinkedBusiness](docs/LinkedBusiness.md)
 - [org.openapitools.server.api.model.LocalInventoryCreateOperation](docs/LocalInventoryCreateOperation.md)
 - [org.openapitools.server.api.model.LocalInventoryDeleteOperation](docs/LocalInventoryDeleteOperation.md)
 - [org.openapitools.server.api.model.LocalInventoryItemResponse](docs/LocalInventoryItemResponse.md)
 - [org.openapitools.server.api.model.LocalInventoryItemsBatch](docs/LocalInventoryItemsBatch.md)
 - [org.openapitools.server.api.model.LocalInventoryItemsBatchCreate](docs/LocalInventoryItemsBatchCreate.md)
 - [org.openapitools.server.api.model.LocalInventoryItemsGet](docs/LocalInventoryItemsGet.md)
 - [org.openapitools.server.api.model.LocalInventoryItemsGetCreate](docs/LocalInventoryItemsGetCreate.md)
 - [org.openapitools.server.api.model.LocalInventoryOperation](docs/LocalInventoryOperation.md)
 - [org.openapitools.server.api.model.LocalInventoryOperationResult](docs/LocalInventoryOperationResult.md)
 - [org.openapitools.server.api.model.LocalInventoryUpdateOperation](docs/LocalInventoryUpdateOperation.md)
 - [org.openapitools.server.api.model.LocalInventoryUpsertOperation](docs/LocalInventoryUpsertOperation.md)
 - [org.openapitools.server.api.model.LocalStore](docs/LocalStore.md)
 - [org.openapitools.server.api.model.LocalStoreBatchUpdate](docs/LocalStoreBatchUpdate.md)
 - [org.openapitools.server.api.model.LocalStoreCreate](docs/LocalStoreCreate.md)
 - [org.openapitools.server.api.model.LookbackPeriodOptions](docs/LookbackPeriodOptions.md)
 - [org.openapitools.server.api.model.MMMReport](docs/MMMReport.md)
 - [org.openapitools.server.api.model.MMMReportCreate](docs/MMMReportCreate.md)
 - [org.openapitools.server.api.model.MMMReportGranularity](docs/MMMReportGranularity.md)
 - [org.openapitools.server.api.model.MMMReportLevel](docs/MMMReportLevel.md)
 - [org.openapitools.server.api.model.MMMReportingColumn](docs/MMMReportingColumn.md)
 - [org.openapitools.server.api.model.MMMReportingTargetingType](docs/MMMReportingTargetingType.md)
 - [org.openapitools.server.api.model.MatchType](docs/MatchType.md)
 - [org.openapitools.server.api.model.MatchTypeResponse](docs/MatchTypeResponse.md)
 - [org.openapitools.server.api.model.MaxPriceFilter](docs/MaxPriceFilter.md)
 - [org.openapitools.server.api.model.Media](docs/Media.md)
 - [org.openapitools.server.api.model.MediaList200Response](docs/MediaList200Response.md)
 - [org.openapitools.server.api.model.MediaType](docs/MediaType.md)
 - [org.openapitools.server.api.model.MediaTypeFilter](docs/MediaTypeFilter.md)
 - [org.openapitools.server.api.model.MediaUpload](docs/MediaUpload.md)
 - [org.openapitools.server.api.model.MediaUploadCreate](docs/MediaUploadCreate.md)
 - [org.openapitools.server.api.model.MediaUploadParameters](docs/MediaUploadParameters.md)
 - [org.openapitools.server.api.model.MediaUploadStatus](docs/MediaUploadStatus.md)
 - [org.openapitools.server.api.model.MediaUploadType](docs/MediaUploadType.md)
 - [org.openapitools.server.api.model.MemberBusinessRole](docs/MemberBusinessRole.md)
 - [org.openapitools.server.api.model.MetricsReportingLevel](docs/MetricsReportingLevel.md)
 - [org.openapitools.server.api.model.MetricsReportingTemplateType](docs/MetricsReportingTemplateType.md)
 - [org.openapitools.server.api.model.MetricsResponse](docs/MetricsResponse.md)
 - [org.openapitools.server.api.model.MetricsResponseDataItems](docs/MetricsResponseDataItems.md)
 - [org.openapitools.server.api.model.MinPriceFilter](docs/MinPriceFilter.md)
 - [org.openapitools.server.api.model.MobileAppPlatform](docs/MobileAppPlatform.md)
 - [org.openapitools.server.api.model.MsotEventName](docs/MsotEventName.md)
 - [org.openapitools.server.api.model.MultiPinsAnalyticsMetricTypesItem](docs/MultiPinsAnalyticsMetricTypesItem.md)
 - [org.openapitools.server.api.model.NetworkType](docs/NetworkType.md)
 - [org.openapitools.server.api.model.NonDraftEntityStatus](docs/NonDraftEntityStatus.md)
 - [org.openapitools.server.api.model.NonNullableCatalogsCurrency](docs/NonNullableCatalogsCurrency.md)
 - [org.openapitools.server.api.model.NotificationPostRequest](docs/NotificationPostRequest.md)
 - [org.openapitools.server.api.model.NotificationResponse](docs/NotificationResponse.md)
 - [org.openapitools.server.api.model.NullableCatalogsItemFieldType](docs/NullableCatalogsItemFieldType.md)
 - [org.openapitools.server.api.model.NullableCurrency](docs/NullableCurrency.md)
 - [org.openapitools.server.api.model.NullableEntityStatus](docs/NullableEntityStatus.md)
 - [org.openapitools.server.api.model.NullableLabelStatus](docs/NullableLabelStatus.md)
 - [org.openapitools.server.api.model.NullableLabelType](docs/NullableLabelType.md)
 - [org.openapitools.server.api.model.NullableOptimizationGoalMetadata](docs/NullableOptimizationGoalMetadata.md)
 - [org.openapitools.server.api.model.NullablePartnerType](docs/NullablePartnerType.md)
 - [org.openapitools.server.api.model.NullalbleMatchType](docs/NullalbleMatchType.md)
 - [org.openapitools.server.api.model.NumericFilterOperatorType](docs/NumericFilterOperatorType.md)
 - [org.openapitools.server.api.model.OauthAccessToken](docs/OauthAccessToken.md)
 - [org.openapitools.server.api.model.ObjectiveType](docs/ObjectiveType.md)
 - [org.openapitools.server.api.model.OperationType](docs/OperationType.md)
 - [org.openapitools.server.api.model.OptimizationGoalMetadata](docs/OptimizationGoalMetadata.md)
 - [org.openapitools.server.api.model.OptimizationType](docs/OptimizationType.md)
 - [org.openapitools.server.api.model.Order](docs/Order.md)
 - [org.openapitools.server.api.model.OrderLine](docs/OrderLine.md)
 - [org.openapitools.server.api.model.OrderLineMutationError](docs/OrderLineMutationError.md)
 - [org.openapitools.server.api.model.OrderLineMutationResponse](docs/OrderLineMutationResponse.md)
 - [org.openapitools.server.api.model.OrderLineMutationResult](docs/OrderLineMutationResult.md)
 - [org.openapitools.server.api.model.OrderLinePaidType](docs/OrderLinePaidType.md)
 - [org.openapitools.server.api.model.OrderLineStatus](docs/OrderLineStatus.md)
 - [org.openapitools.server.api.model.OrderLinesList200Response](docs/OrderLinesList200Response.md)
 - [org.openapitools.server.api.model.OsFamily](docs/OsFamily.md)
 - [org.openapitools.server.api.model.OverallStatusOptions](docs/OverallStatusOptions.md)
 - [org.openapitools.server.api.model.PacingDeliveryType](docs/PacingDeliveryType.md)
 - [org.openapitools.server.api.model.PageVisitConversionTagsGet200Response](docs/PageVisitConversionTagsGet200Response.md)
 - [org.openapitools.server.api.model.PartnerMetadata](docs/PartnerMetadata.md)
 - [org.openapitools.server.api.model.PartnerType](docs/PartnerType.md)
 - [org.openapitools.server.api.model.PerformancePlusCampaignSettings](docs/PerformancePlusCampaignSettings.md)
 - [org.openapitools.server.api.model.Permissions](docs/Permissions.md)
 - [org.openapitools.server.api.model.PermissionsWithOwner](docs/PermissionsWithOwner.md)
 - [org.openapitools.server.api.model.Pin](docs/Pin.md)
 - [org.openapitools.server.api.model.PinAnalyticsDailyMetrics](docs/PinAnalyticsDailyMetrics.md)
 - [org.openapitools.server.api.model.PinAnalyticsMetricsResponse](docs/PinAnalyticsMetricsResponse.md)
 - [org.openapitools.server.api.model.PinBase](docs/PinBase.md)
 - [org.openapitools.server.api.model.PinCreate](docs/PinCreate.md)
 - [org.openapitools.server.api.model.PinFilter](docs/PinFilter.md)
 - [org.openapitools.server.api.model.PinMedia](docs/PinMedia.md)
 - [org.openapitools.server.api.model.PinMediaMetadata](docs/PinMediaMetadata.md)
 - [org.openapitools.server.api.model.PinMediaSource](docs/PinMediaSource.md)
 - [org.openapitools.server.api.model.PinMediaSourceImageBase64](docs/PinMediaSourceImageBase64.md)
 - [org.openapitools.server.api.model.PinMediaSourceImageURL](docs/PinMediaSourceImageURL.md)
 - [org.openapitools.server.api.model.PinMediaSourceImagesBase64](docs/PinMediaSourceImagesBase64.md)
 - [org.openapitools.server.api.model.PinMediaSourceImagesBase64Item](docs/PinMediaSourceImagesBase64Item.md)
 - [org.openapitools.server.api.model.PinMediaSourceImagesURL](docs/PinMediaSourceImagesURL.md)
 - [org.openapitools.server.api.model.PinMediaSourceImagesURLItem](docs/PinMediaSourceImagesURLItem.md)
 - [org.openapitools.server.api.model.PinMediaSourcePinURL](docs/PinMediaSourcePinURL.md)
 - [org.openapitools.server.api.model.PinMediaSourceVideoID](docs/PinMediaSourceVideoID.md)
 - [org.openapitools.server.api.model.PinMediaWithImage](docs/PinMediaWithImage.md)
 - [org.openapitools.server.api.model.PinMediaWithImageAndVideo](docs/PinMediaWithImageAndVideo.md)
 - [org.openapitools.server.api.model.PinMediaWithImages](docs/PinMediaWithImages.md)
 - [org.openapitools.server.api.model.PinMediaWithVideo](docs/PinMediaWithVideo.md)
 - [org.openapitools.server.api.model.PinMediaWithVideos](docs/PinMediaWithVideos.md)
 - [org.openapitools.server.api.model.PinPromotionSummaryStatus](docs/PinPromotionSummaryStatus.md)
 - [org.openapitools.server.api.model.PinRead](docs/PinRead.md)
 - [org.openapitools.server.api.model.PinType](docs/PinType.md)
 - [org.openapitools.server.api.model.PinUpdate](docs/PinUpdate.md)
 - [org.openapitools.server.api.model.PinnerListType](docs/PinnerListType.md)
 - [org.openapitools.server.api.model.PinsList200Response](docs/PinsList200Response.md)
 - [org.openapitools.server.api.model.PinsSaveRequestCreate](docs/PinsSaveRequestCreate.md)
 - [org.openapitools.server.api.model.PinterestLibBatchItemException](docs/PinterestLibBatchItemException.md)
 - [org.openapitools.server.api.model.PinterestLibError](docs/PinterestLibError.md)
 - [org.openapitools.server.api.model.PinterestLibPaginationOrder](docs/PinterestLibPaginationOrder.md)
 - [org.openapitools.server.api.model.PinterestLibStatus204](docs/PinterestLibStatus204.md)
 - [org.openapitools.server.api.model.PinterestProductCategoriesFilter](docs/PinterestProductCategoriesFilter.md)
 - [org.openapitools.server.api.model.PlacementGroupType](docs/PlacementGroupType.md)
 - [org.openapitools.server.api.model.PlacementMultipliers](docs/PlacementMultipliers.md)
 - [org.openapitools.server.api.model.PlacementTrafficType](docs/PlacementTrafficType.md)
 - [org.openapitools.server.api.model.PlacementType](docs/PlacementType.md)
 - [org.openapitools.server.api.model.PredictedTimeSeries](docs/PredictedTimeSeries.md)
 - [org.openapitools.server.api.model.PreferredMediaType](docs/PreferredMediaType.md)
 - [org.openapitools.server.api.model.PriceFilter](docs/PriceFilter.md)
 - [org.openapitools.server.api.model.PriceFilterPrice](docs/PriceFilterPrice.md)
 - [org.openapitools.server.api.model.PrimarySort](docs/PrimarySort.md)
 - [org.openapitools.server.api.model.ProductAvailability](docs/ProductAvailability.md)
 - [org.openapitools.server.api.model.ProductAvailabilityType](docs/ProductAvailabilityType.md)
 - [org.openapitools.server.api.model.ProductCategoriesDemographic](docs/ProductCategoriesDemographic.md)
 - [org.openapitools.server.api.model.ProductCategoriesEngagementType](docs/ProductCategoriesEngagementType.md)
 - [org.openapitools.server.api.model.ProductCategoriesMetricsHighlights](docs/ProductCategoriesMetricsHighlights.md)
 - [org.openapitools.server.api.model.ProductCategoryDetailLookbackWindow](docs/ProductCategoryDetailLookbackWindow.md)
 - [org.openapitools.server.api.model.ProductCategoryDetails](docs/ProductCategoryDetails.md)
 - [org.openapitools.server.api.model.ProductCategoryEnum](docs/ProductCategoryEnum.md)
 - [org.openapitools.server.api.model.ProductCategoryRegion](docs/ProductCategoryRegion.md)
 - [org.openapitools.server.api.model.ProductCondition](docs/ProductCondition.md)
 - [org.openapitools.server.api.model.ProductGroupAnalyticsItems](docs/ProductGroupAnalyticsItems.md)
 - [org.openapitools.server.api.model.ProductGroupPromotion](docs/ProductGroupPromotion.md)
 - [org.openapitools.server.api.model.ProductGroupPromotionCreateRequest](docs/ProductGroupPromotionCreateRequest.md)
 - [org.openapitools.server.api.model.ProductGroupPromotionCustomizableCTAType](docs/ProductGroupPromotionCustomizableCTAType.md)
 - [org.openapitools.server.api.model.ProductGroupPromotionResponseItem](docs/ProductGroupPromotionResponseItem.md)
 - [org.openapitools.server.api.model.ProductGroupPromotionUpdateRequest](docs/ProductGroupPromotionUpdateRequest.md)
 - [org.openapitools.server.api.model.ProductGroupPromotions](docs/ProductGroupPromotions.md)
 - [org.openapitools.server.api.model.ProductGroupPromotionsCreate](docs/ProductGroupPromotionsCreate.md)
 - [org.openapitools.server.api.model.ProductGroupPromotionsList200Response](docs/ProductGroupPromotionsList200Response.md)
 - [org.openapitools.server.api.model.ProductGroupPromotionsUpdateWithRequiredBody](docs/ProductGroupPromotionsUpdateWithRequiredBody.md)
 - [org.openapitools.server.api.model.ProductGroupReferenceFilter](docs/ProductGroupReferenceFilter.md)
 - [org.openapitools.server.api.model.ProductGroupSummaryStatus](docs/ProductGroupSummaryStatus.md)
 - [org.openapitools.server.api.model.ProductTagItem](docs/ProductTagItem.md)
 - [org.openapitools.server.api.model.ProductTagsBulkAddRequest](docs/ProductTagsBulkAddRequest.md)
 - [org.openapitools.server.api.model.ProductTagsBulkDeleteRequest](docs/ProductTagsBulkDeleteRequest.md)
 - [org.openapitools.server.api.model.ProductTagsError](docs/ProductTagsError.md)
 - [org.openapitools.server.api.model.ProductTagsResponse](docs/ProductTagsResponse.md)
 - [org.openapitools.server.api.model.ProductType0Filter](docs/ProductType0Filter.md)
 - [org.openapitools.server.api.model.ProductType1Filter](docs/ProductType1Filter.md)
 - [org.openapitools.server.api.model.ProductType2Filter](docs/ProductType2Filter.md)
 - [org.openapitools.server.api.model.ProductType3Filter](docs/ProductType3Filter.md)
 - [org.openapitools.server.api.model.ProductType4Filter](docs/ProductType4Filter.md)
 - [org.openapitools.server.api.model.Promotion](docs/Promotion.md)
 - [org.openapitools.server.api.model.PromotionApplicationLevel](docs/PromotionApplicationLevel.md)
 - [org.openapitools.server.api.model.PromotionArrayElement](docs/PromotionArrayElement.md)
 - [org.openapitools.server.api.model.PromotionBatchUpdate](docs/PromotionBatchUpdate.md)
 - [org.openapitools.server.api.model.PromotionCreate](docs/PromotionCreate.md)
 - [org.openapitools.server.api.model.PromotionTemplateValue](docs/PromotionTemplateValue.md)
 - [org.openapitools.server.api.model.PromotionType](docs/PromotionType.md)
 - [org.openapitools.server.api.model.PromotionsList200Response](docs/PromotionsList200Response.md)
 - [org.openapitools.server.api.model.PromotionsResponse](docs/PromotionsResponse.md)
 - [org.openapitools.server.api.model.PublicTargetingType](docs/PublicTargetingType.md)
 - [org.openapitools.server.api.model.QualityComponentDetails](docs/QualityComponentDetails.md)
 - [org.openapitools.server.api.model.QualityComponentIssue](docs/QualityComponentIssue.md)
 - [org.openapitools.server.api.model.QualityComponents](docs/QualityComponents.md)
 - [org.openapitools.server.api.model.QueryLabelEntityStatusesItems](docs/QueryLabelEntityStatusesItems.md)
 - [org.openapitools.server.api.model.QueryLabelTypesItems](docs/QueryLabelTypesItems.md)
 - [org.openapitools.server.api.model.QuerymetrictypesItems](docs/QuerymetrictypesItems.md)
 - [org.openapitools.server.api.model.QuerypinanalyticsmetrictypesItems](docs/QuerypinanalyticsmetrictypesItems.md)
 - [org.openapitools.server.api.model.QueryvideopinmetrictypesItems](docs/QueryvideopinmetrictypesItems.md)
 - [org.openapitools.server.api.model.QuizPinData](docs/QuizPinData.md)
 - [org.openapitools.server.api.model.QuizPinOption](docs/QuizPinOption.md)
 - [org.openapitools.server.api.model.QuizPinQuestion](docs/QuizPinQuestion.md)
 - [org.openapitools.server.api.model.QuizPinResult](docs/QuizPinResult.md)
 - [org.openapitools.server.api.model.RecordCounts](docs/RecordCounts.md)
 - [org.openapitools.server.api.model.RelatedTerms](docs/RelatedTerms.md)
 - [org.openapitools.server.api.model.RelatedTermsRelatedTermsListItems](docs/RelatedTermsRelatedTermsListItems.md)
 - [org.openapitools.server.api.model.ReportType](docs/ReportType.md)
 - [org.openapitools.server.api.model.ReportingColumn](docs/ReportingColumn.md)
 - [org.openapitools.server.api.model.ReportingColumnAsync](docs/ReportingColumnAsync.md)
 - [org.openapitools.server.api.model.ReportingColumnSync](docs/ReportingColumnSync.md)
 - [org.openapitools.server.api.model.ReportingTimeZone](docs/ReportingTimeZone.md)
 - [org.openapitools.server.api.model.ReportsStats200Response](docs/ReportsStats200Response.md)
 - [org.openapitools.server.api.model.RespondToInviteResultItem](docs/RespondToInviteResultItem.md)
 - [org.openapitools.server.api.model.RespondToInvitesResponseArray](docs/RespondToInvitesResponseArray.md)
 - [org.openapitools.server.api.model.RetailLocalInventoryItemAttributes](docs/RetailLocalInventoryItemAttributes.md)
 - [org.openapitools.server.api.model.RetailLocalInventoryItemAttributesOptional](docs/RetailLocalInventoryItemAttributesOptional.md)
 - [org.openapitools.server.api.model.Role](docs/Role.md)
 - [org.openapitools.server.api.model.S3FilePart](docs/S3FilePart.md)
 - [org.openapitools.server.api.model.S3MultipartUploadData](docs/S3MultipartUploadData.md)
 - [org.openapitools.server.api.model.SSIOAccount](docs/SSIOAccount.md)
 - [org.openapitools.server.api.model.SSIOAccountAddress](docs/SSIOAccountAddress.md)
 - [org.openapitools.server.api.model.SSIOAccountItem](docs/SSIOAccountItem.md)
 - [org.openapitools.server.api.model.SSIOAccountPMPName](docs/SSIOAccountPMPName.md)
 - [org.openapitools.server.api.model.SSIOInsertionOrder](docs/SSIOInsertionOrder.md)
 - [org.openapitools.server.api.model.SSIOInsertionOrderCreate](docs/SSIOInsertionOrderCreate.md)
 - [org.openapitools.server.api.model.SSIOInsertionOrderStatus](docs/SSIOInsertionOrderStatus.md)
 - [org.openapitools.server.api.model.SSIOInsertionOrderStatusResponse](docs/SSIOInsertionOrderStatusResponse.md)
 - [org.openapitools.server.api.model.SSIOInsertionOrderUpdate](docs/SSIOInsertionOrderUpdate.md)
 - [org.openapitools.server.api.model.SSIOOrderLine](docs/SSIOOrderLine.md)
 - [org.openapitools.server.api.model.SSIOOrderLineType](docs/SSIOOrderLineType.md)
 - [org.openapitools.server.api.model.Schedule](docs/Schedule.md)
 - [org.openapitools.server.api.model.ScheduleAction](docs/ScheduleAction.md)
 - [org.openapitools.server.api.model.ScheduleAgeBucketMultipliers](docs/ScheduleAgeBucketMultipliers.md)
 - [org.openapitools.server.api.model.ScheduleAppTypeMultipliers](docs/ScheduleAppTypeMultipliers.md)
 - [org.openapitools.server.api.model.ScheduleAudienceMultipliers](docs/ScheduleAudienceMultipliers.md)
 - [org.openapitools.server.api.model.ScheduleBatchUpdate](docs/ScheduleBatchUpdate.md)
 - [org.openapitools.server.api.model.ScheduleBidMultipliers](docs/ScheduleBidMultipliers.md)
 - [org.openapitools.server.api.model.ScheduleBidOptions](docs/ScheduleBidOptions.md)
 - [org.openapitools.server.api.model.ScheduleBidOptionsGenderMultipliers](docs/ScheduleBidOptionsGenderMultipliers.md)
 - [org.openapitools.server.api.model.ScheduleBidOptionsPlacementMultipliers](docs/ScheduleBidOptionsPlacementMultipliers.md)
 - [org.openapitools.server.api.model.ScheduleCommonDeltaValue](docs/ScheduleCommonDeltaValue.md)
 - [org.openapitools.server.api.model.ScheduleCreate](docs/ScheduleCreate.md)
 - [org.openapitools.server.api.model.ScheduleCreateRequest](docs/ScheduleCreateRequest.md)
 - [org.openapitools.server.api.model.ScheduleCreateRequestAllOf1](docs/ScheduleCreateRequestAllOf1.md)
 - [org.openapitools.server.api.model.ScheduleDeltaValue](docs/ScheduleDeltaValue.md)
 - [org.openapitools.server.api.model.ScheduleGenderMultipliers](docs/ScheduleGenderMultipliers.md)
 - [org.openapitools.server.api.model.SchedulePlacementMultipliers](docs/SchedulePlacementMultipliers.md)
 - [org.openapitools.server.api.model.ScheduleStatus](docs/ScheduleStatus.md)
 - [org.openapitools.server.api.model.ScheduleType](docs/ScheduleType.md)
 - [org.openapitools.server.api.model.ScheduleUpdateRequest](docs/ScheduleUpdateRequest.md)
 - [org.openapitools.server.api.model.ScheduleUpdateRequestAllOf1](docs/ScheduleUpdateRequestAllOf1.md)
 - [org.openapitools.server.api.model.SchedulesCreate200ResponseInner](docs/SchedulesCreate200ResponseInner.md)
 - [org.openapitools.server.api.model.SchedulesCreate200ResponseInnerData](docs/SchedulesCreate200ResponseInnerData.md)
 - [org.openapitools.server.api.model.SchedulesCreate200ResponseInnerDataOneOf](docs/SchedulesCreate200ResponseInnerDataOneOf.md)
 - [org.openapitools.server.api.model.SchedulesList200Response](docs/SchedulesList200Response.md)
 - [org.openapitools.server.api.model.ScrollupGoalMetadata](docs/ScrollupGoalMetadata.md)
 - [org.openapitools.server.api.model.SearchPartnerPins200Response](docs/SearchPartnerPins200Response.md)
 - [org.openapitools.server.api.model.SharedAudienceAccount](docs/SharedAudienceAccount.md)
 - [org.openapitools.server.api.model.SharedAudiencesForBusinessList200Response](docs/SharedAudiencesForBusinessList200Response.md)
 - [org.openapitools.server.api.model.SingleInterestTargetingOption](docs/SingleInterestTargetingOption.md)
 - [org.openapitools.server.api.model.SourcePlatformOptions](docs/SourcePlatformOptions.md)
 - [org.openapitools.server.api.model.SsioInsertionOrdersStatusGetByAdAccount200Response](docs/SsioInsertionOrdersStatusGetByAdAccount200Response.md)
 - [org.openapitools.server.api.model.SsioOrderLinesGetByAdAccount200Response](docs/SsioOrderLinesGetByAdAccount200Response.md)
 - [org.openapitools.server.api.model.StandardPinMetricTypes](docs/StandardPinMetricTypes.md)
 - [org.openapitools.server.api.model.StoreMetadata](docs/StoreMetadata.md)
 - [org.openapitools.server.api.model.SummaryPin](docs/SummaryPin.md)
 - [org.openapitools.server.api.model.SummaryStatus](docs/SummaryStatus.md)
 - [org.openapitools.server.api.model.SupplementalItemBatchOperationStatus](docs/SupplementalItemBatchOperationStatus.md)
 - [org.openapitools.server.api.model.SupplementalItemProcessingStatus](docs/SupplementalItemProcessingStatus.md)
 - [org.openapitools.server.api.model.SupplementalItemValidationEvent](docs/SupplementalItemValidationEvent.md)
 - [org.openapitools.server.api.model.SupplementalItemsBatchResponse](docs/SupplementalItemsBatchResponse.md)
 - [org.openapitools.server.api.model.SupplementalOperationResult](docs/SupplementalOperationResult.md)
 - [org.openapitools.server.api.model.SystemUserUpdateWithRequiredBody](docs/SystemUserUpdateWithRequiredBody.md)
 - [org.openapitools.server.api.model.TargetingAdvertiserCountry](docs/TargetingAdvertiserCountry.md)
 - [org.openapitools.server.api.model.TargetingSpec](docs/TargetingSpec.md)
 - [org.openapitools.server.api.model.TargetingSpecAgeBucket](docs/TargetingSpecAgeBucket.md)
 - [org.openapitools.server.api.model.TargetingSpecAppType](docs/TargetingSpecAppType.md)
 - [org.openapitools.server.api.model.TargetingSpecGender](docs/TargetingSpecGender.md)
 - [org.openapitools.server.api.model.TargetingSpecListOperation](docs/TargetingSpecListOperation.md)
 - [org.openapitools.server.api.model.TargetingSpecOperationAgeBucket](docs/TargetingSpecOperationAgeBucket.md)
 - [org.openapitools.server.api.model.TargetingSpecOperationAppType](docs/TargetingSpecOperationAppType.md)
 - [org.openapitools.server.api.model.TargetingSpecOperationAudienceExclude](docs/TargetingSpecOperationAudienceExclude.md)
 - [org.openapitools.server.api.model.TargetingSpecOperationAudienceInclude](docs/TargetingSpecOperationAudienceInclude.md)
 - [org.openapitools.server.api.model.TargetingSpecOperationGender](docs/TargetingSpecOperationGender.md)
 - [org.openapitools.server.api.model.TargetingSpecOperationGeo](docs/TargetingSpecOperationGeo.md)
 - [org.openapitools.server.api.model.TargetingSpecOperationGeoExclude](docs/TargetingSpecOperationGeoExclude.md)
 - [org.openapitools.server.api.model.TargetingSpecOperationInterest](docs/TargetingSpecOperationInterest.md)
 - [org.openapitools.server.api.model.TargetingSpecOperationLocale](docs/TargetingSpecOperationLocale.md)
 - [org.openapitools.server.api.model.TargetingSpecOperationLocation](docs/TargetingSpecOperationLocation.md)
 - [org.openapitools.server.api.model.TargetingSpecOperationLocationExclude](docs/TargetingSpecOperationLocationExclude.md)
 - [org.openapitools.server.api.model.TargetingSpecOperationMaximumAge](docs/TargetingSpecOperationMaximumAge.md)
 - [org.openapitools.server.api.model.TargetingSpecOperationMinimumAge](docs/TargetingSpecOperationMinimumAge.md)
 - [org.openapitools.server.api.model.TargetingSpecOperationShoppingRetargeting](docs/TargetingSpecOperationShoppingRetargeting.md)
 - [org.openapitools.server.api.model.TargetingSpecOperations](docs/TargetingSpecOperations.md)
 - [org.openapitools.server.api.model.TargetingSpecOptimal](docs/TargetingSpecOptimal.md)
 - [org.openapitools.server.api.model.TargetingSpecShoppingRetargeting](docs/TargetingSpecShoppingRetargeting.md)
 - [org.openapitools.server.api.model.TargetingSpecTargetingStrategyItems](docs/TargetingSpecTargetingStrategyItems.md)
 - [org.openapitools.server.api.model.TargetingStrategy](docs/TargetingStrategy.md)
 - [org.openapitools.server.api.model.TargetingTemplate](docs/TargetingTemplate.md)
 - [org.openapitools.server.api.model.TargetingTemplateAudienceSizing](docs/TargetingTemplateAudienceSizing.md)
 - [org.openapitools.server.api.model.TargetingTemplateAudienceSizingReachEstimate](docs/TargetingTemplateAudienceSizingReachEstimate.md)
 - [org.openapitools.server.api.model.TargetingTemplateCreate](docs/TargetingTemplateCreate.md)
 - [org.openapitools.server.api.model.TargetingTemplateKeyword](docs/TargetingTemplateKeyword.md)
 - [org.openapitools.server.api.model.TargetingTemplateList200Response](docs/TargetingTemplateList200Response.md)
 - [org.openapitools.server.api.model.TargetingTemplateStatus](docs/TargetingTemplateStatus.md)
 - [org.openapitools.server.api.model.TargetingTemplateUpdateRequestReadOrUpdate](docs/TargetingTemplateUpdateRequestReadOrUpdate.md)
 - [org.openapitools.server.api.model.TemplateBasedReport](docs/TemplateBasedReport.md)
 - [org.openapitools.server.api.model.TemplateBasedReportCreate](docs/TemplateBasedReportCreate.md)
 - [org.openapitools.server.api.model.TemplatesList200Response](docs/TemplatesList200Response.md)
 - [org.openapitools.server.api.model.TermsOfService](docs/TermsOfService.md)
 - [org.openapitools.server.api.model.TieBreakerType](docs/TieBreakerType.md)
 - [org.openapitools.server.api.model.TimeSeries](docs/TimeSeries.md)
 - [org.openapitools.server.api.model.TitleKeywordsFilter](docs/TitleKeywordsFilter.md)
 - [org.openapitools.server.api.model.TokenGrantType](docs/TokenGrantType.md)
 - [org.openapitools.server.api.model.TokenTypeHint](docs/TokenTypeHint.md)
 - [org.openapitools.server.api.model.TopPinsAnalyticsResponse](docs/TopPinsAnalyticsResponse.md)
 - [org.openapitools.server.api.model.TopPinsAnalyticsResponseDateAvailability](docs/TopPinsAnalyticsResponseDateAvailability.md)
 - [org.openapitools.server.api.model.TopPinsAnalyticsResponsePinsItems](docs/TopPinsAnalyticsResponsePinsItems.md)
 - [org.openapitools.server.api.model.TopPinsSortBy](docs/TopPinsSortBy.md)
 - [org.openapitools.server.api.model.TopVideoPinsAnalyticsResponse](docs/TopVideoPinsAnalyticsResponse.md)
 - [org.openapitools.server.api.model.TopVideoPinsAnalyticsResponseDateAvailability](docs/TopVideoPinsAnalyticsResponseDateAvailability.md)
 - [org.openapitools.server.api.model.TopVideoPinsAnalyticsResponsePinsItems](docs/TopVideoPinsAnalyticsResponsePinsItems.md)
 - [org.openapitools.server.api.model.TopVideoPinsSortBy](docs/TopVideoPinsSortBy.md)
 - [org.openapitools.server.api.model.TotalCountByEntityStatus](docs/TotalCountByEntityStatus.md)
 - [org.openapitools.server.api.model.TrackingUrls](docs/TrackingUrls.md)
 - [org.openapitools.server.api.model.TrendType](docs/TrendType.md)
 - [org.openapitools.server.api.model.TrendingKeyword](docs/TrendingKeyword.md)
 - [org.openapitools.server.api.model.TrendingKeywordDemographics](docs/TrendingKeywordDemographics.md)
 - [org.openapitools.server.api.model.TrendingKeywordsResponse](docs/TrendingKeywordsResponse.md)
 - [org.openapitools.server.api.model.TrendingPin](docs/TrendingPin.md)
 - [org.openapitools.server.api.model.TrendingProductCategory](docs/TrendingProductCategory.md)
 - [org.openapitools.server.api.model.TrendingTopic](docs/TrendingTopic.md)
 - [org.openapitools.server.api.model.TrendsAgeBucket](docs/TrendsAgeBucket.md)
 - [org.openapitools.server.api.model.TrendsAgeDistribution](docs/TrendsAgeDistribution.md)
 - [org.openapitools.server.api.model.TrendsEditorial](docs/TrendsEditorial.md)
 - [org.openapitools.server.api.model.TrendsGender](docs/TrendsGender.md)
 - [org.openapitools.server.api.model.TrendsGenderDistribution](docs/TrendsGenderDistribution.md)
 - [org.openapitools.server.api.model.TrendsGenderFilter](docs/TrendsGenderFilter.md)
 - [org.openapitools.server.api.model.TrendsL1Interest](docs/TrendsL1Interest.md)
 - [org.openapitools.server.api.model.TrendsSupportedRegion](docs/TrendsSupportedRegion.md)
 - [org.openapitools.server.api.model.UpdatableItemAttributes](docs/UpdatableItemAttributes.md)
 - [org.openapitools.server.api.model.UpdatableItemAttributesGtin](docs/UpdatableItemAttributesGtin.md)
 - [org.openapitools.server.api.model.UpdateBusinessMembershipsResponse](docs/UpdateBusinessMembershipsResponse.md)
 - [org.openapitools.server.api.model.UpdateInvitesResultsResponseArray](docs/UpdateInvitesResultsResponseArray.md)
 - [org.openapitools.server.api.model.UpdateMaskBidOptionField](docs/UpdateMaskBidOptionField.md)
 - [org.openapitools.server.api.model.UpdateMaskFieldType](docs/UpdateMaskFieldType.md)
 - [org.openapitools.server.api.model.UpdateMemberAssetAccessBody](docs/UpdateMemberAssetAccessBody.md)
 - [org.openapitools.server.api.model.UpdateMemberAssetAccessItem](docs/UpdateMemberAssetAccessItem.md)
 - [org.openapitools.server.api.model.UpdateMemberAssetResultItem](docs/UpdateMemberAssetResultItem.md)
 - [org.openapitools.server.api.model.UpdateMemberAssetsResultsResponseArray](docs/UpdateMemberAssetsResultsResponseArray.md)
 - [org.openapitools.server.api.model.UpdatePartnerAssetAccessBody](docs/UpdatePartnerAssetAccessBody.md)
 - [org.openapitools.server.api.model.UpdatePartnerAssetAccessItem](docs/UpdatePartnerAssetAccessItem.md)
 - [org.openapitools.server.api.model.UpdatePartnerAssetsResult](docs/UpdatePartnerAssetsResult.md)
 - [org.openapitools.server.api.model.UpdatePartnerAssetsResultsResponseArray](docs/UpdatePartnerAssetsResultsResponseArray.md)
 - [org.openapitools.server.api.model.UserAccountFollowedInterests200Response](docs/UserAccountFollowedInterests200Response.md)
 - [org.openapitools.server.api.model.UserAccountType](docs/UserAccountType.md)
 - [org.openapitools.server.api.model.UserBusinessRoleBinding](docs/UserBusinessRoleBinding.md)
 - [org.openapitools.server.api.model.UserFollowingFeedType](docs/UserFollowingFeedType.md)
 - [org.openapitools.server.api.model.UserListOperationType](docs/UserListOperationType.md)
 - [org.openapitools.server.api.model.UserListType](docs/UserListType.md)
 - [org.openapitools.server.api.model.UserSingleAssetBinding](docs/UserSingleAssetBinding.md)
 - [org.openapitools.server.api.model.UserWebsite](docs/UserWebsite.md)
 - [org.openapitools.server.api.model.UserWebsiteCreate](docs/UserWebsiteCreate.md)
 - [org.openapitools.server.api.model.UserWebsiteVerification](docs/UserWebsiteVerification.md)
 - [org.openapitools.server.api.model.UserWebsitesGet200Response](docs/UserWebsitesGet200Response.md)
 - [org.openapitools.server.api.model.UsersForIndividualAssetResponse](docs/UsersForIndividualAssetResponse.md)
 - [org.openapitools.server.api.model.VerticalProductCategory](docs/VerticalProductCategory.md)
 - [org.openapitools.server.api.model.VideoMetadataWithItemType](docs/VideoMetadataWithItemType.md)
 - [org.openapitools.server.api.model.VideoPinMetricTypes](docs/VideoPinMetricTypes.md)
 - [org.openapitools.server.api.model.WebsiteVerificationMethod](docs/WebsiteVerificationMethod.md)
 - [org.openapitools.server.api.model.WorkloadState](docs/WorkloadState.md)


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
  - msot:write: Create measurement source of truth events
  - pins:read: See your public Pins
  - pins:read_secret: See your secret Pins
  - pins:write: Create, update, or delete your public Pins
  - pins:write_secret: Create, update, or delete your secret Pins
  - user_accounts:read: See your user accounts and followers
  - user_accounts:write: Update your user accounts and followers

<a id="client_credentials"></a>
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

<a id="conversion_token"></a>
### conversion_token

- **Type**: HTTP Bearer Token authentication

<a id="basic"></a>
### basic

- **Type**: HTTP basic authentication

