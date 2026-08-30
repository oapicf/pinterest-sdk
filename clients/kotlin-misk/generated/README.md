# Documentation for Pinterest REST API

    <a id="documentation-for-api-endpoints"></a>
    ## Documentation for API Endpoints

    All URIs are relative to *https://api.pinterest.com/v5*

    Class | Method | HTTP request | Description
    ------------ | ------------- | ------------- | -------------
    *AdAccountsApi* | [**adAccountAnalytics**](Apis/docs/AdAccountsApi.md#adaccountanalytics) | **Get** /ad_accounts/{ad_account_id}/analytics | Get ad account analytics
    *AdAccountsApi* | [**adAccountTargetingAnalyticsGet**](Apis/docs/AdAccountsApi.md#adaccounttargetinganalyticsget) | **Get** /ad_accounts/{ad_account_id}/targeting_analytics | Get targeting analytics for an ad account
    *AdAccountsApi* | [**adAccountsCreate**](Apis/docs/AdAccountsApi.md#adaccountscreate) | **Post** /ad_accounts | Create ad account
    *AdAccountsApi* | [**adAccountsGet**](Apis/docs/AdAccountsApi.md#adaccountsget) | **Get** /ad_accounts/{ad_account_id} | Get ad account
    *AdAccountsApi* | [**adAccountsList**](Apis/docs/AdAccountsApi.md#adaccountslist) | **Get** /ad_accounts | List ad accounts
    *AdAccountsApi* | [**analyticsCreateConversionProductReport**](Apis/docs/AdAccountsApi.md#analyticscreateconversionproductreport) | **Post** /ad_accounts/{ad_account_id}/reports/brand_category_sku | Create a request for a brand, category, SKU report
    *AdAccountsApi* | [**analyticsCreateMmmReport**](Apis/docs/AdAccountsApi.md#analyticscreatemmmreport) | **Post** /ad_accounts/{ad_account_id}/mmm_reports | Create a request for a Marketing Mix Modeling (MMM) report
    *AdAccountsApi* | [**analyticsCreateReport**](Apis/docs/AdAccountsApi.md#analyticscreatereport) | **Post** /ad_accounts/{ad_account_id}/reports | Create async request for an account analytics report
    *AdAccountsApi* | [**analyticsCreateTemplateReport**](Apis/docs/AdAccountsApi.md#analyticscreatetemplatereport) | **Post** /ad_accounts/{ad_account_id}/templates/{template_id}/reports | Create async request for an analytics report using a template
    *AdAccountsApi* | [**analyticsGetConversionProductReport**](Apis/docs/AdAccountsApi.md#analyticsgetconversionproductreport) | **Get** /ad_accounts/{ad_account_id}/reports/brand_category_sku | Get advertiser brand, category, SKU report
    *AdAccountsApi* | [**analyticsGetMmmReport**](Apis/docs/AdAccountsApi.md#analyticsgetmmmreport) | **Get** /ad_accounts/{ad_account_id}/mmm_reports | Get advertiser Marketing Mix Modeling (MMM) report.
    *AdAccountsApi* | [**analyticsGetReport**](Apis/docs/AdAccountsApi.md#analyticsgetreport) | **Get** /ad_accounts/{ad_account_id}/reports | Get the account analytics report created by the async call
    *AdAccountsApi* | [**sandboxDelete**](Apis/docs/AdAccountsApi.md#sandboxdelete) | **Delete** /ad_accounts/{ad_account_id}/sandbox | Delete ads data for ad account in API Sandbox
    *AdAccountsApi* | [**templatesList**](Apis/docs/AdAccountsApi.md#templateslist) | **Get** /ad_accounts/{ad_account_id}/templates | List templates
    *AdGroupsApi* | [**adGroupsAnalytics**](Apis/docs/AdGroupsApi.md#adgroupsanalytics) | **Get** /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics
    *AdGroupsApi* | [**adGroupsAudienceSizing**](Apis/docs/AdGroupsApi.md#adgroupsaudiencesizing) | **Post** /ad_accounts/{ad_account_id}/ad_groups/audience_sizing | Get audience sizing
    *AdGroupsApi* | [**adGroupsBidFloorGet**](Apis/docs/AdGroupsApi.md#adgroupsbidfloorget) | **Post** /ad_accounts/{ad_account_id}/bid_floor | Get bid floors
    *AdGroupsApi* | [**adGroupsCreate**](Apis/docs/AdGroupsApi.md#adgroupscreate) | **Post** /ad_accounts/{ad_account_id}/ad_groups | Create ad groups
    *AdGroupsApi* | [**adGroupsDynamicTitlesDownloadCsv**](Apis/docs/AdGroupsApi.md#adgroupsdynamictitlesdownloadcsv) | **Get** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/csv | Get dynamic titles CSV download URL
    *AdGroupsApi* | [**adGroupsDynamicTitlesGetStatus**](Apis/docs/AdGroupsApi.md#adgroupsdynamictitlesgetstatus) | **Get** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/status | Get dynamic titles status
    *AdGroupsApi* | [**adGroupsDynamicTitlesGetUploadUrl**](Apis/docs/AdGroupsApi.md#adgroupsdynamictitlesgetuploadurl) | **Get** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/uploads | Get dynamic titles upload URL
    *AdGroupsApi* | [**adGroupsDynamicTitlesProcessCsv**](Apis/docs/AdGroupsApi.md#adgroupsdynamictitlesprocesscsv) | **Post** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles | Process dynamic titles CSV
    *AdGroupsApi* | [**adGroupsGet**](Apis/docs/AdGroupsApi.md#adgroupsget) | **Get** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id} | Get ad group
    *AdGroupsApi* | [**adGroupsList**](Apis/docs/AdGroupsApi.md#adgroupslist) | **Get** /ad_accounts/{ad_account_id}/ad_groups | List ad groups
    *AdGroupsApi* | [**adGroupsTargetingAnalyticsGet**](Apis/docs/AdGroupsApi.md#adgroupstargetinganalyticsget) | **Get** /ad_accounts/{ad_account_id}/ad_groups/targeting_analytics | Get targeting analytics for ad groups
    *AdGroupsApi* | [**adGroupsUpdate**](Apis/docs/AdGroupsApi.md#adgroupsupdate) | **Patch** /ad_accounts/{ad_account_id}/ad_groups | Update ad groups
    *AdGroupsApi* | [**getAdGroupsByPromotionIdsList**](Apis/docs/AdGroupsApi.md#getadgroupsbypromotionidslist) | **Get** /ad_accounts/{ad_account_id}/promotion_applied_entities | List of ad groups using promotions IDs.
    *AdsApi* | [**adPreviewsCreate**](Apis/docs/AdsApi.md#adpreviewscreate) | **Post** /ad_accounts/{ad_account_id}/ad_previews | Create ad preview with pin or image
    *AdsApi* | [**adTargetingAnalyticsGet**](Apis/docs/AdsApi.md#adtargetinganalyticsget) | **Get** /ad_accounts/{ad_account_id}/ads/targeting_analytics | Get targeting analytics for ads
    *AdsApi* | [**adsAnalytics**](Apis/docs/AdsApi.md#adsanalytics) | **Get** /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics
    *AdsApi* | [**adsCreate**](Apis/docs/AdsApi.md#adscreate) | **Post** /ad_accounts/{ad_account_id}/ads | Create ads
    *AdsApi* | [**adsGet**](Apis/docs/AdsApi.md#adsget) | **Get** /ad_accounts/{ad_account_id}/ads/{ad_id} | Get ad
    *AdsApi* | [**adsList**](Apis/docs/AdsApi.md#adslist) | **Get** /ad_accounts/{ad_account_id}/ads | List ads
    *AdsApi* | [**adsUpdate**](Apis/docs/AdsApi.md#adsupdate) | **Patch** /ad_accounts/{ad_account_id}/ads | Update ads
    *AdsApi* | [**campaignAdPreviewCreate**](Apis/docs/AdsApi.md#campaignadpreviewcreate) | **Post** /ad_accounts/{ad_account_id}/campaign_ad_preview | Create ad preview records for one or more ad groups
    *AdsApi* | [**campaignAdPreviewDelete**](Apis/docs/AdsApi.md#campaignadpreviewdelete) | **Delete** /ad_accounts/{ad_account_id}/campaign_ad_preview | Delete ad preview records for one or more ad groups
    *AdsApi* | [**campaignAdPreviewRead**](Apis/docs/AdsApi.md#campaignadpreviewread) | **Get** /ad_accounts/{ad_account_id}/campaign_ad_preview | Fetch ad preview records for one or more ad groups
    *AdvancedAuctionApi* | [**advancedAuctionItemsGetPost**](Apis/docs/AdvancedAuctionApi.md#advancedauctionitemsgetpost) | **Post** /advanced_auction/items/get | Get item bid options (POST)
    *AdvancedAuctionApi* | [**advancedAuctionItemsSubmitPost**](Apis/docs/AdvancedAuctionApi.md#advancedauctionitemssubmitpost) | **Post** /advanced_auction/items/submit | Operate on item level bid options
    *AudienceInsightsApi* | [**audienceInsightsGet**](Apis/docs/AudienceInsightsApi.md#audienceinsightsget) | **Get** /ad_accounts/{ad_account_id}/audience_insights | Get audience insights
    *AudienceInsightsApi* | [**audienceInsightsScopeAndTypeGet**](Apis/docs/AudienceInsightsApi.md#audienceinsightsscopeandtypeget) | **Get** /ad_accounts/{ad_account_id}/insights/audiences | Get audience insights scope and type
    *AudienceSharingApi* | [**adAccountsAudiencesSharedAccountsList**](Apis/docs/AudienceSharingApi.md#adaccountsaudiencessharedaccountslist) | **Get** /ad_accounts/{ad_account_id}/audiences/shared/accounts | List accounts with access to an audience owned by an ad account
    *AudienceSharingApi* | [**businessAccountAudiencesSharedAccountsList**](Apis/docs/AudienceSharingApi.md#businessaccountaudiencessharedaccountslist) | **Get** /businesses/{business_id}/audiences/shared/accounts | List accounts with access to an audience owned by a business
    *AudienceSharingApi* | [**sharedAudiencesForBusinessList**](Apis/docs/AudienceSharingApi.md#sharedaudiencesforbusinesslist) | **Get** /businesses/{business_id}/audiences | List received audiences for a business
    *AudienceSharingApi* | [**updateAdAccountToAdAccountSharedAudience**](Apis/docs/AudienceSharingApi.md#updateadaccounttoadaccountsharedaudience) | **Patch** /ad_accounts/{ad_account_id}/audiences/ad_accounts/shared | Update audience sharing between ad accounts
    *AudienceSharingApi* | [**updateAdAccountToBusinessSharedAudience**](Apis/docs/AudienceSharingApi.md#updateadaccounttobusinesssharedaudience) | **Patch** /ad_accounts/{ad_account_id}/audiences/businesses/shared | Update audience sharing from an ad account to businesses
    *AudienceSharingApi* | [**updateBusinessToAdAccountSharedAudience**](Apis/docs/AudienceSharingApi.md#updatebusinesstoadaccountsharedaudience) | **Patch** /businesses/{business_id}/audiences/ad_accounts/shared | Update audience sharing from a business to ad accounts
    *AudienceSharingApi* | [**updateBusinessToBusinessSharedAudience**](Apis/docs/AudienceSharingApi.md#updatebusinesstobusinesssharedaudience) | **Patch** /businesses/{business_id}/audiences/businesses/shared | Update audience sharing between businesses
    *AudiencesApi* | [**audiencesCreate**](Apis/docs/AudiencesApi.md#audiencescreate) | **Post** /ad_accounts/{ad_account_id}/audiences | Create audience
    *AudiencesApi* | [**audiencesGet**](Apis/docs/AudiencesApi.md#audiencesget) | **Get** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Get audience
    *AudiencesApi* | [**audiencesList**](Apis/docs/AudiencesApi.md#audienceslist) | **Get** /ad_accounts/{ad_account_id}/audiences | List audiences
    *AudiencesApi* | [**audiencesUpdate**](Apis/docs/AudiencesApi.md#audiencesupdate) | **Patch** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Update audience
    *BillingApi* | [**adsCreditRedeem**](Apis/docs/BillingApi.md#adscreditredeem) | **Post** /ad_accounts/{ad_account_id}/ads_credit/redeem | Redeem ad credits
    *BillingApi* | [**adsCreditsDiscountsGet**](Apis/docs/BillingApi.md#adscreditsdiscountsget) | **Get** /ad_accounts/{ad_account_id}/ads_credit/discounts | Get ads credit discounts
    *BillingApi* | [**billingInvoiceDownloadGet**](Apis/docs/BillingApi.md#billinginvoicedownloadget) | **Get** /ad_accounts/{ad_account_id}/billing_invoice/{billing_invoice_id}/download | Get download url for a billing invoice
    *BillingApi* | [**billingInvoicesGet**](Apis/docs/BillingApi.md#billinginvoicesget) | **Get** /ad_accounts/{ad_account_id}/billing_invoices | Get billing invoices
    *BillingApi* | [**billingProfilesGet**](Apis/docs/BillingApi.md#billingprofilesget) | **Get** /ad_accounts/{ad_account_id}/billing_profiles | Get billing profiles
    *BillingApi* | [**ssioAccountsGet**](Apis/docs/BillingApi.md#ssioaccountsget) | **Get** /ad_accounts/{ad_account_id}/ssio/accounts | Get Salesforce account details including bill-to information.
    *BillingApi* | [**ssioInsertionOrderCreate**](Apis/docs/BillingApi.md#ssioinsertionordercreate) | **Post** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Create insertion order through SSIO.
    *BillingApi* | [**ssioInsertionOrderEdit**](Apis/docs/BillingApi.md#ssioinsertionorderedit) | **Patch** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Edit insertion order through SSIO.
    *BillingApi* | [**ssioInsertionOrdersStatusGetByAdAccount**](Apis/docs/BillingApi.md#ssioinsertionordersstatusgetbyadaccount) | **Get** /ad_accounts/{ad_account_id}/ssio/insertion_orders/status | Get insertion order status by ad account id.
    *BillingApi* | [**ssioInsertionOrdersStatusGetByPinOrderId**](Apis/docs/BillingApi.md#ssioinsertionordersstatusgetbypinorderid) | **Get** /ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status | Get insertion order status by pin order id.
    *BillingApi* | [**ssioOrderLinesGetByAdAccount**](Apis/docs/BillingApi.md#ssioorderlinesgetbyadaccount) | **Get** /ad_accounts/{ad_account_id}/ssio/order_lines | Get Salesforce order lines by ad account id.
    *BoardsApi* | [**boardSectionsCreate**](Apis/docs/BoardsApi.md#boardsectionscreate) | **Post** /boards/{board_id}/sections | Create board section
    *BoardsApi* | [**boardSectionsDelete**](Apis/docs/BoardsApi.md#boardsectionsdelete) | **Delete** /boards/{board_id}/sections/{section_id} | Delete board section
    *BoardsApi* | [**boardSectionsList**](Apis/docs/BoardsApi.md#boardsectionslist) | **Get** /boards/{board_id}/sections | List board sections
    *BoardsApi* | [**boardSectionsListPins**](Apis/docs/BoardsApi.md#boardsectionslistpins) | **Get** /boards/{board_id}/sections/{section_id}/pins | List Pins on board section
    *BoardsApi* | [**boardSectionsUpdate**](Apis/docs/BoardsApi.md#boardsectionsupdate) | **Patch** /boards/{board_id}/sections/{section_id} | Update board section
    *BoardsApi* | [**boardsCreate**](Apis/docs/BoardsApi.md#boardscreate) | **Post** /boards | Create board
    *BoardsApi* | [**boardsDelete**](Apis/docs/BoardsApi.md#boardsdelete) | **Delete** /boards/{board_id} | Delete board
    *BoardsApi* | [**boardsGet**](Apis/docs/BoardsApi.md#boardsget) | **Get** /boards/{board_id} | Get board
    *BoardsApi* | [**boardsList**](Apis/docs/BoardsApi.md#boardslist) | **Get** /boards | List boards
    *BoardsApi* | [**boardsListPins**](Apis/docs/BoardsApi.md#boardslistpins) | **Get** /boards/{board_id}/pins | List Pins on board
    *BoardsApi* | [**boardsUpdate**](Apis/docs/BoardsApi.md#boardsupdate) | **Patch** /boards/{board_id} | Update board
    *BulkApi* | [**bulkDownloadCreate**](Apis/docs/BulkApi.md#bulkdownloadcreate) | **Post** /ad_accounts/{ad_account_id}/bulk/download | Get advertiser entities in bulk
    *BulkApi* | [**bulkRequestGet**](Apis/docs/BulkApi.md#bulkrequestget) | **Get** /ad_accounts/{ad_account_id}/bulk/{bulk_request_id} | Download advertiser entities in bulk
    *BulkApi* | [**bulkUpsertCreate**](Apis/docs/BulkApi.md#bulkupsertcreate) | **Post** /ad_accounts/{ad_account_id}/bulk/upsert | Create/update ad entities in bulk
    *BusinessAccessAssetsApi* | [**assetGroupCreate**](Apis/docs/BusinessAccessAssetsApi.md#assetgroupcreate) | **Post** /businesses/{business_id}/asset_groups | Create a new asset group.
    *BusinessAccessAssetsApi* | [**assetGroupDelete**](Apis/docs/BusinessAccessAssetsApi.md#assetgroupdelete) | **Delete** /businesses/{business_id}/asset_groups | Delete asset groups.
    *BusinessAccessAssetsApi* | [**assetGroupUpdate**](Apis/docs/BusinessAccessAssetsApi.md#assetgroupupdate) | **Patch** /businesses/{business_id}/asset_groups | Update asset groups.
    *BusinessAccessAssetsApi* | [**businessAssetMembersGet**](Apis/docs/BusinessAccessAssetsApi.md#businessassetmembersget) | **Get** /businesses/{business_id}/assets/{asset_id}/members | Get members with access to asset
    *BusinessAccessAssetsApi* | [**businessAssetPartnersGet**](Apis/docs/BusinessAccessAssetsApi.md#businessassetpartnersget) | **Get** /businesses/{business_id}/assets/{asset_id}/partners | Get partners with access to asset
    *BusinessAccessAssetsApi* | [**businessAssetsGet**](Apis/docs/BusinessAccessAssetsApi.md#businessassetsget) | **Get** /businesses/{business_id}/assets | List business assets
    *BusinessAccessAssetsApi* | [**businessMemberAssetsGet**](Apis/docs/BusinessAccessAssetsApi.md#businessmemberassetsget) | **Get** /businesses/{business_id}/members/{member_id}/assets | Get assets assigned to a member
    *BusinessAccessAssetsApi* | [**businessMembersAssetAccessDelete**](Apis/docs/BusinessAccessAssetsApi.md#businessmembersassetaccessdelete) | **Delete** /businesses/{business_id}/members/assets/access | Delete member access to asset
    *BusinessAccessAssetsApi* | [**businessMembersAssetAccessUpdate**](Apis/docs/BusinessAccessAssetsApi.md#businessmembersassetaccessupdate) | **Patch** /businesses/{business_id}/members/assets/access | Assign/Update member asset permissions
    *BusinessAccessAssetsApi* | [**businessPartnerAssetAccessGet**](Apis/docs/BusinessAccessAssetsApi.md#businesspartnerassetaccessget) | **Get** /businesses/{business_id}/partners/{partner_id}/assets | Get assets assigned to a partner or assets assigned by a partner
    *BusinessAccessAssetsApi* | [**deletePartnerAssetAccessHandlerImpl**](Apis/docs/BusinessAccessAssetsApi.md#deletepartnerassetaccesshandlerimpl) | **Delete** /businesses/{business_id}/partners/assets | Delete partner access to asset
    *BusinessAccessAssetsApi* | [**updatePartnerAssetAccessHandlerImpl**](Apis/docs/BusinessAccessAssetsApi.md#updatepartnerassetaccesshandlerimpl) | **Patch** /businesses/{business_id}/partners/assets | Assign/Update partner asset permissions
    *BusinessAccessInviteApi* | [**assetAccessRequestsCreate**](Apis/docs/BusinessAccessInviteApi.md#assetaccessrequestscreate) | **Post** /businesses/{business_id}/requests/assets/access | Create a request to access an existing partner's assets.
    *BusinessAccessInviteApi* | [**cancelInvitesOrRequests**](Apis/docs/BusinessAccessInviteApi.md#cancelinvitesorrequests) | **Delete** /businesses/{business_id}/invites | Cancel invites/requests
    *BusinessAccessInviteApi* | [**createAssetInvites**](Apis/docs/BusinessAccessInviteApi.md#createassetinvites) | **Post** /businesses/{business_id}/invites/assets/access | Update invite/request with an asset permission
    *BusinessAccessInviteApi* | [**createMembershipOrPartnershipInvites**](Apis/docs/BusinessAccessInviteApi.md#createmembershiporpartnershipinvites) | **Post** /businesses/{business_id}/invites | Create invites or requests
    *BusinessAccessInviteApi* | [**getInvites**](Apis/docs/BusinessAccessInviteApi.md#getinvites) | **Get** /businesses/{business_id}/invites | Get invites/requests
    *BusinessAccessInviteApi* | [**respondBusinessAccessInvites**](Apis/docs/BusinessAccessInviteApi.md#respondbusinessaccessinvites) | **Patch** /businesses/invites | Accept or decline an invite/request
    *BusinessAccessRelationshipsApi* | [**brandAccountsCreate**](Apis/docs/BusinessAccessRelationshipsApi.md#brandaccountscreate) | **Post** /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts | Create a Brand Account
    *BusinessAccessRelationshipsApi* | [**brandAccountsUpdate**](Apis/docs/BusinessAccessRelationshipsApi.md#brandaccountsupdate) | **Patch** /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id} | Update a Brand Account
    *BusinessAccessRelationshipsApi* | [**deleteBusinessMembership**](Apis/docs/BusinessAccessRelationshipsApi.md#deletebusinessmembership) | **Delete** /businesses/{business_id}/members | Terminate business memberships
    *BusinessAccessRelationshipsApi* | [**deleteBusinessPartners**](Apis/docs/BusinessAccessRelationshipsApi.md#deletebusinesspartners) | **Delete** /businesses/{business_id}/partners | Terminate business partnerships
    *BusinessAccessRelationshipsApi* | [**getBusinessEmployers**](Apis/docs/BusinessAccessRelationshipsApi.md#getbusinessemployers) | **Get** /businesses/employers | List business employers for user
    *BusinessAccessRelationshipsApi* | [**getBusinessMembers**](Apis/docs/BusinessAccessRelationshipsApi.md#getbusinessmembers) | **Get** /businesses/{business_id}/members | Get business members
    *BusinessAccessRelationshipsApi* | [**getBusinessPartners**](Apis/docs/BusinessAccessRelationshipsApi.md#getbusinesspartners) | **Get** /businesses/{business_id}/partners | Get business partners
    *BusinessAccessRelationshipsApi* | [**systemUserUpdate**](Apis/docs/BusinessAccessRelationshipsApi.md#systemuserupdate) | **Patch** /businesses/{business_id}/system_users/{system_user_id} | Update a system user information.
    *BusinessAccessRelationshipsApi* | [**updateBusinessMemberships**](Apis/docs/BusinessAccessRelationshipsApi.md#updatebusinessmemberships) | **Patch** /businesses/{business_id}/members | Update member's business role
    *CampaignsApi* | [**adPinsAnalytics**](Apis/docs/CampaignsApi.md#adpinsanalytics) | **Get** /ad_accounts/{ad_account_id}/pins/analytics | Get pins analytics
    *CampaignsApi* | [**campaignTargetingAnalyticsGet**](Apis/docs/CampaignsApi.md#campaigntargetinganalyticsget) | **Get** /ad_accounts/{ad_account_id}/campaigns/targeting_analytics | Get targeting analytics for campaigns
    *CampaignsApi* | [**campaignsAnalytics**](Apis/docs/CampaignsApi.md#campaignsanalytics) | **Get** /ad_accounts/{ad_account_id}/campaigns/analytics | Get campaign analytics
    *CampaignsApi* | [**campaignsCreate**](Apis/docs/CampaignsApi.md#campaignscreate) | **Post** /ad_accounts/{ad_account_id}/campaigns | Create campaigns
    *CampaignsApi* | [**campaignsGet**](Apis/docs/CampaignsApi.md#campaignsget) | **Get** /ad_accounts/{ad_account_id}/campaigns/{campaign_id} | Get campaign
    *CampaignsApi* | [**campaignsList**](Apis/docs/CampaignsApi.md#campaignslist) | **Get** /ad_accounts/{ad_account_id}/campaigns | List campaigns
    *CampaignsApi* | [**campaignsUpdate**](Apis/docs/CampaignsApi.md#campaignsupdate) | **Patch** /ad_accounts/{ad_account_id}/campaigns | Update campaigns
    *CampaignsApi* | [**getCampaignDeliveryEstimates**](Apis/docs/CampaignsApi.md#getcampaigndeliveryestimates) | **Post** /ad_accounts/{ad_account_id}/campaigns/delivery_estimates | Get campaign delivery estimates
    *CatalogFeedsApi* | [**feedProcessingResultsList**](Apis/docs/CatalogFeedsApi.md#feedprocessingresultslist) | **Get** /catalogs/feeds/{feed_id}/processing_results | List feed processing results
    *CatalogFeedsApi* | [**feedsCreate**](Apis/docs/CatalogFeedsApi.md#feedscreate) | **Post** /catalogs/feeds | Create feed
    *CatalogFeedsApi* | [**feedsDelete**](Apis/docs/CatalogFeedsApi.md#feedsdelete) | **Delete** /catalogs/feeds/{feed_id} | Delete feed
    *CatalogFeedsApi* | [**feedsGet**](Apis/docs/CatalogFeedsApi.md#feedsget) | **Get** /catalogs/feeds/{feed_id} | Get feed
    *CatalogFeedsApi* | [**feedsIngest**](Apis/docs/CatalogFeedsApi.md#feedsingest) | **Post** /catalogs/feeds/{feed_id}/ingest | Ingest feed items
    *CatalogFeedsApi* | [**feedsList**](Apis/docs/CatalogFeedsApi.md#feedslist) | **Get** /catalogs/feeds | List feeds
    *CatalogFeedsApi* | [**feedsUpdate**](Apis/docs/CatalogFeedsApi.md#feedsupdate) | **Patch** /catalogs/feeds/{feed_id} | Update feed
    *CatalogFeedsApi* | [**itemsIssuesList**](Apis/docs/CatalogFeedsApi.md#itemsissueslist) | **Get** /catalogs/processing_results/{processing_result_id}/item_issues | List item issues
    *CatalogItemsApi* | [**itemsBatchGet**](Apis/docs/CatalogItemsApi.md#itemsbatchget) | **Get** /catalogs/items/batch/{batch_id} | Get item batch status
    *CatalogItemsApi* | [**itemsBatchPost**](Apis/docs/CatalogItemsApi.md#itemsbatchpost) | **Post** /catalogs/items/batch | Operate on item batch
    *CatalogItemsApi* | [**itemsPost**](Apis/docs/CatalogItemsApi.md#itemspost) | **Post** /catalogs/items | Get catalogs items (POST)
    *CatalogProductGroupsApi* | [**catalogsProductGroupPinsList**](Apis/docs/CatalogProductGroupsApi.md#catalogsproductgrouppinslist) | **Get** /catalogs/product_groups/{product_group_id}/products | List products by product group
    *CatalogProductGroupsApi* | [**catalogsProductGroupsCreate**](Apis/docs/CatalogProductGroupsApi.md#catalogsproductgroupscreate) | **Post** /catalogs/product_groups | Create product group
    *CatalogProductGroupsApi* | [**catalogsProductGroupsCreateMany**](Apis/docs/CatalogProductGroupsApi.md#catalogsproductgroupscreatemany) | **Post** /catalogs/product_groups/multiple | Create product groups
    *CatalogProductGroupsApi* | [**catalogsProductGroupsDelete**](Apis/docs/CatalogProductGroupsApi.md#catalogsproductgroupsdelete) | **Delete** /catalogs/product_groups/{product_group_id} | Delete product group
    *CatalogProductGroupsApi* | [**catalogsProductGroupsDeleteMany**](Apis/docs/CatalogProductGroupsApi.md#catalogsproductgroupsdeletemany) | **Delete** /catalogs/product_groups/multiple | Delete product groups
    *CatalogProductGroupsApi* | [**catalogsProductGroupsGet**](Apis/docs/CatalogProductGroupsApi.md#catalogsproductgroupsget) | **Get** /catalogs/product_groups/{product_group_id} | Get product group
    *CatalogProductGroupsApi* | [**catalogsProductGroupsList**](Apis/docs/CatalogProductGroupsApi.md#catalogsproductgroupslist) | **Get** /catalogs/product_groups | List product groups
    *CatalogProductGroupsApi* | [**catalogsProductGroupsProductCountsGet**](Apis/docs/CatalogProductGroupsApi.md#catalogsproductgroupsproductcountsget) | **Get** /catalogs/product_groups/{product_group_id}/product_counts | Get product counts
    *CatalogProductGroupsApi* | [**catalogsProductGroupsUpdate**](Apis/docs/CatalogProductGroupsApi.md#catalogsproductgroupsupdate) | **Patch** /catalogs/product_groups/{product_group_id} | Update single product group
    *CatalogProductGroupsApi* | [**productsByProductGroupFilterList**](Apis/docs/CatalogProductGroupsApi.md#productsbyproductgroupfilterlist) | **Post** /catalogs/products/get_by_product_group_filters | List products by filter
    *CatalogReportsApi* | [**reportsCreate**](Apis/docs/CatalogReportsApi.md#reportscreate) | **Post** /catalogs/reports | Build catalogs report
    *CatalogReportsApi* | [**reportsGet**](Apis/docs/CatalogReportsApi.md#reportsget) | **Get** /catalogs/reports | Get catalogs report
    *CatalogReportsApi* | [**reportsStats**](Apis/docs/CatalogReportsApi.md#reportsstats) | **Get** /catalogs/reports/stats | List report stats
    *CatalogSupplementalApi* | [**catalogsLocalInventoryItemsBatchOperate**](Apis/docs/CatalogSupplementalApi.md#catalogslocalinventoryitemsbatchoperate) | **Post** /catalogs/{catalog_id}/local_inventory_items/batch | Operate on local inventory item batch
    *CatalogSupplementalApi* | [**catalogsLocalInventoryItemsPost**](Apis/docs/CatalogSupplementalApi.md#catalogslocalinventoryitemspost) | **Post** /catalogs/{catalog_id}/local_inventory_items/query | Get local inventory items (POST)
    *CatalogSupplementalApi* | [**catalogsLocalStoresCreate**](Apis/docs/CatalogSupplementalApi.md#catalogslocalstorescreate) | **Post** /catalogs/{catalog_id}/local_stores | Create local stores
    *CatalogSupplementalApi* | [**catalogsLocalStoresDelete**](Apis/docs/CatalogSupplementalApi.md#catalogslocalstoresdelete) | **Delete** /catalogs/{catalog_id}/local_stores | Delete local stores
    *CatalogSupplementalApi* | [**catalogsLocalStoresList**](Apis/docs/CatalogSupplementalApi.md#catalogslocalstoreslist) | **Get** /catalogs/{catalog_id}/local_stores | List local stores
    *CatalogSupplementalApi* | [**catalogsLocalStoresUpdate**](Apis/docs/CatalogSupplementalApi.md#catalogslocalstoresupdate) | **Patch** /catalogs/{catalog_id}/local_stores | Update local stores
    *CatalogSupplementalApi* | [**catalogsSupplementalItemsBatchGet**](Apis/docs/CatalogSupplementalApi.md#catalogssupplementalitemsbatchget) | **Get** /catalogs/{catalog_id}/supplemental_items/batch/{batch_id} | Get supplemental items batch status
    *CatalogsApi* | [**catalogsAvailableFilterValues**](Apis/docs/CatalogsApi.md#catalogsavailablefiltervalues) | **Get** /catalogs/available_filter_values | List available filter values
    *CatalogsApi* | [**catalogsCreate**](Apis/docs/CatalogsApi.md#catalogscreate) | **Post** /catalogs | Create catalog
    *CatalogsApi* | [**catalogsList**](Apis/docs/CatalogsApi.md#catalogslist) | **Get** /catalogs | List catalogs
    *ConversionDeletionRequestsApi* | [**conversionDeletionRequestCreate**](Apis/docs/ConversionDeletionRequestsApi.md#conversiondeletionrequestcreate) | **Post** /ad_accounts/{ad_account_id}/conversion_deletion_requests | Create a conversion deletion request
    *ConversionDeletionRequestsApi* | [**conversionDeletionRequestDelete**](Apis/docs/ConversionDeletionRequestsApi.md#conversiondeletionrequestdelete) | **Delete** /ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id} | Delete a conversion deletion request
    *ConversionDeletionRequestsApi* | [**conversionDeletionRequestGet**](Apis/docs/ConversionDeletionRequestsApi.md#conversiondeletionrequestget) | **Get** /ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id} | Get a single conversion deletion request
    *ConversionDeletionRequestsApi* | [**conversionDeletionRequestList**](Apis/docs/ConversionDeletionRequestsApi.md#conversiondeletionrequestlist) | **Get** /ad_accounts/{ad_account_id}/conversion_deletion_requests | List conversion deletion requests
    *ConversionEqsApi* | [**conversionEqsList**](Apis/docs/ConversionEqsApi.md#conversioneqslist) | **Get** /ad_accounts/{ad_account_id}/conversion_eqs | Get event quality score (EQS)
    *ConversionEventsApi* | [**eventsCreate**](Apis/docs/ConversionEventsApi.md#eventscreate) | **Post** /ad_accounts/{ad_account_id}/events | Send conversions
    *ConversionTagsApi* | [**conversionTagsCreate**](Apis/docs/ConversionTagsApi.md#conversiontagscreate) | **Post** /ad_accounts/{ad_account_id}/conversion_tags | Create conversion tag
    *ConversionTagsApi* | [**conversionTagsGet**](Apis/docs/ConversionTagsApi.md#conversiontagsget) | **Get** /ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id} | Get conversion tag
    *ConversionTagsApi* | [**conversionTagsList**](Apis/docs/ConversionTagsApi.md#conversiontagslist) | **Get** /ad_accounts/{ad_account_id}/conversion_tags | List conversion tags
    *ConversionTagsApi* | [**ocpmEligibleConversionTagsGet**](Apis/docs/ConversionTagsApi.md#ocpmeligibleconversiontagsget) | **Get** /ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible | Get Ocpm eligible conversion tags
    *ConversionTagsApi* | [**pageVisitConversionTagsGet**](Apis/docs/ConversionTagsApi.md#pagevisitconversiontagsget) | **Get** /ad_accounts/{ad_account_id}/conversion_tags/page_visit | Get page visit conversion tags
    *ConversionsApi* | [**advertiserDefinedEventsCreate**](Apis/docs/ConversionsApi.md#advertiserdefinedeventscreate) | **Post** /ad_accounts/{ad_account_id}/advertiser_defined_events | Create advertiser defined events
    *ConversionsApi* | [**advertiserDefinedEventsDelete**](Apis/docs/ConversionsApi.md#advertiserdefinedeventsdelete) | **Delete** /ad_accounts/{ad_account_id}/advertiser_defined_events | Delete advertiser defined events
    *ConversionsApi* | [**advertiserDefinedEventsGet**](Apis/docs/ConversionsApi.md#advertiserdefinedeventsget) | **Get** /ad_accounts/{ad_account_id}/advertiser_defined_events | Get advertiser defined events
    *ConversionsApi* | [**advertiserDefinedEventsUpdate**](Apis/docs/ConversionsApi.md#advertiserdefinedeventsupdate) | **Patch** /ad_accounts/{ad_account_id}/advertiser_defined_events | Update advertiser defined events
    *CustomerListUploadsApi* | [**customerListUploadsCreate**](Apis/docs/CustomerListUploadsApi.md#customerlistuploadscreate) | **Post** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads | Create customer list upload
    *CustomerListUploadsApi* | [**customerListUploadsGet**](Apis/docs/CustomerListUploadsApi.md#customerlistuploadsget) | **Get** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id} | Get customer list upload
    *CustomerListUploadsApi* | [**customerListUploadsRun**](Apis/docs/CustomerListUploadsApi.md#customerlistuploadsrun) | **Post** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run | Run customer list upload
    *CustomerListsApi* | [**customerListsCreate**](Apis/docs/CustomerListsApi.md#customerlistscreate) | **Post** /ad_accounts/{ad_account_id}/customer_lists | Create customer lists
    *CustomerListsApi* | [**customerListsGet**](Apis/docs/CustomerListsApi.md#customerlistsget) | **Get** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Get customer list
    *CustomerListsApi* | [**customerListsList**](Apis/docs/CustomerListsApi.md#customerlistslist) | **Get** /ad_accounts/{ad_account_id}/customer_lists | Get customer lists
    *CustomerListsApi* | [**customerListsUpdate**](Apis/docs/CustomerListsApi.md#customerlistsupdate) | **Patch** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Update customer list
    *CustomerSegmentApi* | [**customerSegmentCreate**](Apis/docs/CustomerSegmentApi.md#customersegmentcreate) | **Post** /ad_accounts/{ad_account_id}/customer_segments | Create customer segments
    *CustomerSegmentApi* | [**customerSegmentList**](Apis/docs/CustomerSegmentApi.md#customersegmentlist) | **Get** /ad_accounts/{ad_account_id}/customer_segments | List customer segments
    *CustomerSegmentApi* | [**customerSegmentUpdate**](Apis/docs/CustomerSegmentApi.md#customersegmentupdate) | **Patch** /ad_accounts/{ad_account_id}/customer_segments | Update customer segments
    *IntegrationsApi* | [**integrationsCommerceDel**](Apis/docs/IntegrationsApi.md#integrationscommercedel) | **Delete** /integrations/commerce/{external_business_id} | Delete commerce integration
    *IntegrationsApi* | [**integrationsCommerceGet**](Apis/docs/IntegrationsApi.md#integrationscommerceget) | **Get** /integrations/commerce/{external_business_id} | Get commerce integration
    *IntegrationsApi* | [**integrationsCommercePatch**](Apis/docs/IntegrationsApi.md#integrationscommercepatch) | **Patch** /integrations/commerce/{external_business_id} | Update commerce integration
    *IntegrationsApi* | [**integrationsCommercePost**](Apis/docs/IntegrationsApi.md#integrationscommercepost) | **Post** /integrations/commerce | Create commerce integration
    *IntegrationsApi* | [**integrationsGetById**](Apis/docs/IntegrationsApi.md#integrationsgetbyid) | **Get** /integrations/{id} | Get integration metadata
    *IntegrationsApi* | [**integrationsGetList**](Apis/docs/IntegrationsApi.md#integrationsgetlist) | **Get** /integrations | Get integration metadata list
    *IntegrationsApi* | [**integrationsLogsPost**](Apis/docs/IntegrationsApi.md#integrationslogspost) | **Post** /integrations/logs | Receives batched logs from integration applications.
    *KeywordsApi* | [**countryKeywordsMetricsGet**](Apis/docs/KeywordsApi.md#countrykeywordsmetricsget) | **Get** /ad_accounts/{ad_account_id}/keywords/metrics | Get country's keyword metrics
    *KeywordsApi* | [**keywordsCreate**](Apis/docs/KeywordsApi.md#keywordscreate) | **Post** /ad_accounts/{ad_account_id}/keywords | Create keywords
    *KeywordsApi* | [**keywordsGet**](Apis/docs/KeywordsApi.md#keywordsget) | **Get** /ad_accounts/{ad_account_id}/keywords | Get keywords
    *KeywordsApi* | [**keywordsUpdate**](Apis/docs/KeywordsApi.md#keywordsupdate) | **Patch** /ad_accounts/{ad_account_id}/keywords | Update keywords
    *KeywordsApi* | [**trendingKeywordsList**](Apis/docs/KeywordsApi.md#trendingkeywordslist) | **Get** /trends/keywords/{region}/top/{trend_type} | List trending keywords
    *LabelsApi* | [**labelsApply**](Apis/docs/LabelsApi.md#labelsapply) | **Post** /ad_accounts/{ad_account_id}/labels/{label_id}/apply | Apply label to entity
    *LabelsApi* | [**labelsCreate**](Apis/docs/LabelsApi.md#labelscreate) | **Post** /ad_accounts/{ad_account_id}/labels | Create labels
    *LabelsApi* | [**labelsList**](Apis/docs/LabelsApi.md#labelslist) | **Get** /ad_accounts/{ad_account_id}/labels | List labels
    *LabelsApi* | [**labelsRemove**](Apis/docs/LabelsApi.md#labelsremove) | **Post** /ad_accounts/{ad_account_id}/labels/{label_id}/remove | Remove label from entities
    *LabelsApi* | [**labelsUpdate**](Apis/docs/LabelsApi.md#labelsupdate) | **Patch** /ad_accounts/{ad_account_id}/labels | Update labels
    *LeadAdsApi* | [**adAccountsSubscriptionsDelById**](Apis/docs/LeadAdsApi.md#adaccountssubscriptionsdelbyid) | **Delete** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Delete lead ads subscription
    *LeadAdsApi* | [**adAccountsSubscriptionsGetById**](Apis/docs/LeadAdsApi.md#adaccountssubscriptionsgetbyid) | **Get** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Get lead ads subscription by ID
    *LeadAdsApi* | [**adAccountsSubscriptionsGetList**](Apis/docs/LeadAdsApi.md#adaccountssubscriptionsgetlist) | **Get** /ad_accounts/{ad_account_id}/leads/subscriptions | Get lead ads subscriptions
    *LeadAdsApi* | [**adAccountsSubscriptionsPost**](Apis/docs/LeadAdsApi.md#adaccountssubscriptionspost) | **Post** /ad_accounts/{ad_account_id}/leads/subscriptions | Create lead ads subscription
    *LeadFormsApi* | [**leadFormGet**](Apis/docs/LeadFormsApi.md#leadformget) | **Get** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id} | Get lead form by id
    *LeadFormsApi* | [**leadFormTestCreate**](Apis/docs/LeadFormsApi.md#leadformtestcreate) | **Post** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test | Create lead form test data
    *LeadFormsApi* | [**leadFormsCreate**](Apis/docs/LeadFormsApi.md#leadformscreate) | **Post** /ad_accounts/{ad_account_id}/lead_forms | Create lead forms
    *LeadFormsApi* | [**leadFormsList**](Apis/docs/LeadFormsApi.md#leadformslist) | **Get** /ad_accounts/{ad_account_id}/lead_forms | List lead forms
    *LeadFormsApi* | [**leadFormsUpdate**](Apis/docs/LeadFormsApi.md#leadformsupdate) | **Patch** /ad_accounts/{ad_account_id}/lead_forms | Update lead forms
    *LeadsExportApi* | [**leadsExportCreate**](Apis/docs/LeadsExportApi.md#leadsexportcreate) | **Post** /ad_accounts/{ad_account_id}/leads_export | Create a request to export leads collected from a lead ad
    *LeadsExportApi* | [**leadsExportGet**](Apis/docs/LeadsExportApi.md#leadsexportget) | **Get** /ad_accounts/{ad_account_id}/leads_export/{leads_export_id} | Get the lead export from the lead export create call
    *MediaApi* | [**mediaCreate**](Apis/docs/MediaApi.md#mediacreate) | **Post** /media | Register media upload
    *MediaApi* | [**mediaGet**](Apis/docs/MediaApi.md#mediaget) | **Get** /media/{media_id} | Get media upload details
    *MediaApi* | [**mediaList**](Apis/docs/MediaApi.md#medialist) | **Get** /media | List media uploads
    *MsotEventsApi* | [**msotEventsCreate**](Apis/docs/MsotEventsApi.md#msoteventscreate) | **Post** /ad_accounts/{ad_account_id}/msot/events | Send Measurement Source Of Truth (MSOT) attributed conversion events
    *NotificationApi* | [**notificationPost**](Apis/docs/NotificationApi.md#notificationpost) | **Post** /notifications | Receive notifications from external partners.
    *OauthApi* | [**oauthConversionToken**](Apis/docs/OauthApi.md#oauthconversiontoken) | **Post** /oauth/conversion_token | Generate OAuth access token for conversion API
    *OauthApi* | [**oauthToken**](Apis/docs/OauthApi.md#oauthtoken) | **Post** /oauth/token | Generate OAuth access token
    *OauthApi* | [**tokenRevoke**](Apis/docs/OauthApi.md#tokenrevoke) | **Post** /oauth/token/revoke | Revoke a token
    *OrderLinesApi* | [**orderLinesGet**](Apis/docs/OrderLinesApi.md#orderlinesget) | **Get** /ad_accounts/{ad_account_id}/order_lines/{order_line_id} | Get order line
    *OrderLinesApi* | [**orderLinesList**](Apis/docs/OrderLinesApi.md#orderlineslist) | **Get** /ad_accounts/{ad_account_id}/order_lines | Get order lines.
    *PinsApi* | [**multiPinsAnalytics**](Apis/docs/PinsApi.md#multipinsanalytics) | **Get** /pins/analytics | Get multiple Pin analytics
    *PinsApi* | [**pinsAnalytics**](Apis/docs/PinsApi.md#pinsanalytics) | **Get** /pins/{pin_id}/analytics | Get Pin analytics
    *PinsApi* | [**pinsCreate**](Apis/docs/PinsApi.md#pinscreate) | **Post** /pins | Create Pin
    *PinsApi* | [**pinsDelete**](Apis/docs/PinsApi.md#pinsdelete) | **Delete** /pins/{pin_id} | Delete Pin
    *PinsApi* | [**pinsGet**](Apis/docs/PinsApi.md#pinsget) | **Get** /pins/{pin_id} | Get Pin
    *PinsApi* | [**pinsList**](Apis/docs/PinsApi.md#pinslist) | **Get** /pins | List Pins
    *PinsApi* | [**pinsSave**](Apis/docs/PinsApi.md#pinssave) | **Post** /pins/{pin_id}/save | Save Pin
    *PinsApi* | [**pinsUpdate**](Apis/docs/PinsApi.md#pinsupdate) | **Patch** /pins/{pin_id} | Update Pin
    *ProductGroupPromotionsApi* | [**productGroupPromotionsCreate**](Apis/docs/ProductGroupPromotionsApi.md#productgrouppromotionscreate) | **Post** /ad_accounts/{ad_account_id}/product_group_promotions | Create product group promotions
    *ProductGroupPromotionsApi* | [**productGroupPromotionsGet**](Apis/docs/ProductGroupPromotionsApi.md#productgrouppromotionsget) | **Get** /ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id} | Get a product group promotion by id
    *ProductGroupPromotionsApi* | [**productGroupPromotionsList**](Apis/docs/ProductGroupPromotionsApi.md#productgrouppromotionslist) | **Get** /ad_accounts/{ad_account_id}/product_group_promotions | Get product group promotions
    *ProductGroupPromotionsApi* | [**productGroupPromotionsUpdate**](Apis/docs/ProductGroupPromotionsApi.md#productgrouppromotionsupdate) | **Patch** /ad_accounts/{ad_account_id}/product_group_promotions | Update product group promotions
    *ProductGroupPromotionsApi* | [**productGroupsAnalytics**](Apis/docs/ProductGroupPromotionsApi.md#productgroupsanalytics) | **Get** /ad_accounts/{ad_account_id}/product_groups/analytics | Get product group analytics
    *ProductTagsApi* | [**productTagsBulkAdd**](Apis/docs/ProductTagsApi.md#producttagsbulkadd) | **Post** /pins/{pin_id}/product_tags | Add product tags to pin
    *ProductTagsApi* | [**productTagsBulkDelete**](Apis/docs/ProductTagsApi.md#producttagsbulkdelete) | **Post** /pins/{pin_id}/product_tags/bulk-delete | Delete product tags from pin
    *ProductTagsApi* | [**productTagsList**](Apis/docs/ProductTagsApi.md#producttagslist) | **Get** /pins/{pin_id}/product_tags | Get product tags for pin
    *PromotionsApi* | [**promotionsCreate**](Apis/docs/PromotionsApi.md#promotionscreate) | **Post** /ad_accounts/{ad_account_id}/promotions | Create promotions
    *PromotionsApi* | [**promotionsDelete**](Apis/docs/PromotionsApi.md#promotionsdelete) | **Delete** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Delete promotion by id
    *PromotionsApi* | [**promotionsGet**](Apis/docs/PromotionsApi.md#promotionsget) | **Get** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Get promotion by id
    *PromotionsApi* | [**promotionsList**](Apis/docs/PromotionsApi.md#promotionslist) | **Get** /ad_accounts/{ad_account_id}/promotions | Get promotions
    *PromotionsApi* | [**promotionsUpdate**](Apis/docs/PromotionsApi.md#promotionsupdate) | **Patch** /ad_accounts/{ad_account_id}/promotions | Update promotions
    *ResourcesApi* | [**adAccountCountriesGet**](Apis/docs/ResourcesApi.md#adaccountcountriesget) | **Get** /resources/ad_account_countries | Get ad accounts countries
    *ResourcesApi* | [**deliveryMetricsGet**](Apis/docs/ResourcesApi.md#deliverymetricsget) | **Get** /resources/delivery_metrics | Get available metrics' definitions
    *ResourcesApi* | [**interestTargetingOptionsGet**](Apis/docs/ResourcesApi.md#interesttargetingoptionsget) | **Get** /resources/targeting/interests/{interest_id} | Get interest details
    *ResourcesApi* | [**leadFormQuestionsGet**](Apis/docs/ResourcesApi.md#leadformquestionsget) | **Get** /resources/lead_form_questions | Get lead form questions
    *ResourcesApi* | [**metricsReadyStateGet**](Apis/docs/ResourcesApi.md#metricsreadystateget) | **Get** /resources/metrics_ready_state | Get metrics ready state
    *ResourcesApi* | [**targetingOptionsGet**](Apis/docs/ResourcesApi.md#targetingoptionsget) | **Get** /resources/targeting/{targeting_type} | Get targeting options
    *SchedulesApi* | [**schedulesCreate**](Apis/docs/SchedulesApi.md#schedulescreate) | **Post** /ad_accounts/{ad_account_id}/schedules | Create schedules
    *SchedulesApi* | [**schedulesList**](Apis/docs/SchedulesApi.md#scheduleslist) | **Get** /ad_accounts/{ad_account_id}/schedules | Get Schedules
    *SchedulesApi* | [**schedulesUpdate**](Apis/docs/SchedulesApi.md#schedulesupdate) | **Patch** /ad_accounts/{ad_account_id}/schedules | Update schedules
    *SearchApi* | [**searchPartnerPins**](Apis/docs/SearchApi.md#searchpartnerpins) | **Get** /search/partner/pins | Search pins by a given search term
    *SearchApi* | [**searchUserBoardsGet**](Apis/docs/SearchApi.md#searchuserboardsget) | **Get** /search/boards | Search user's boards
    *SearchApi* | [**searchUserPinsList**](Apis/docs/SearchApi.md#searchuserpinslist) | **Get** /search/pins | Search user's Pins
    *TargetingTemplateApi* | [**targetingTemplateCreate**](Apis/docs/TargetingTemplateApi.md#targetingtemplatecreate) | **Post** /ad_accounts/{ad_account_id}/targeting_templates | Create targeting templates
    *TargetingTemplateApi* | [**targetingTemplateList**](Apis/docs/TargetingTemplateApi.md#targetingtemplatelist) | **Get** /ad_accounts/{ad_account_id}/targeting_templates | List targeting templates
    *TargetingTemplateApi* | [**targetingTemplateUpdate**](Apis/docs/TargetingTemplateApi.md#targetingtemplateupdate) | **Patch** /ad_accounts/{ad_account_id}/targeting_templates | Update targeting templates
    *TermsApi* | [**termsRelatedList**](Apis/docs/TermsApi.md#termsrelatedlist) | **Get** /terms/related | List related terms
    *TermsApi* | [**termsSuggestedList**](Apis/docs/TermsApi.md#termssuggestedlist) | **Get** /terms/suggested | List suggested terms
    *TermsOfServiceApi* | [**termsOfServiceGet**](Apis/docs/TermsOfServiceApi.md#termsofserviceget) | **Get** /ad_accounts/{ad_account_id}/terms_of_service | Get terms of service
    *TrendsApi* | [**trendsEditorialArticlesList**](Apis/docs/TrendsApi.md#trendseditorialarticleslist) | **Get** /trends/editorial_articles | Returns editorial articles for a given region
    *TrendsApi* | [**trendsFeaturedTopicsList**](Apis/docs/TrendsApi.md#trendsfeaturedtopicslist) | **Get** /trends/topics/featured | Get featured topics
    *TrendsApi* | [**trendsProductCategoriesDetailsList**](Apis/docs/TrendsApi.md#trendsproductcategoriesdetailslist) | **Get** /trends/product_categories/details | Get product category details
    *TrendsApi* | [**trendsProductCategoriesTrendingList**](Apis/docs/TrendsApi.md#trendsproductcategoriestrendinglist) | **Get** /trends/product_categories/trending | Get a list of growing Shopping Product Categories
    *UserAccountApi* | [**boardsUserFollowsList**](Apis/docs/UserAccountApi.md#boardsuserfollowslist) | **Get** /user_account/following/boards | List following boards
    *UserAccountApi* | [**followUserUpdate**](Apis/docs/UserAccountApi.md#followuserupdate) | **Post** /user_account/following/{username} | Follow user
    *UserAccountApi* | [**followersList**](Apis/docs/UserAccountApi.md#followerslist) | **Get** /user_account/followers | List followers
    *UserAccountApi* | [**linkedBusinessAccountsGet**](Apis/docs/UserAccountApi.md#linkedbusinessaccountsget) | **Get** /user_account/businesses | List linked businesses
    *UserAccountApi* | [**unverifyWebsiteDelete**](Apis/docs/UserAccountApi.md#unverifywebsitedelete) | **Delete** /user_account/websites | Unverify website
    *UserAccountApi* | [**userAccountAnalytics**](Apis/docs/UserAccountApi.md#useraccountanalytics) | **Get** /user_account/analytics | Get user account analytics
    *UserAccountApi* | [**userAccountAnalyticsTopPins**](Apis/docs/UserAccountApi.md#useraccountanalyticstoppins) | **Get** /user_account/analytics/top_pins | Get user account top pins analytics
    *UserAccountApi* | [**userAccountAnalyticsTopVideoPins**](Apis/docs/UserAccountApi.md#useraccountanalyticstopvideopins) | **Get** /user_account/analytics/top_video_pins | Get user account top video pins analytics
    *UserAccountApi* | [**userAccountFollowedInterests**](Apis/docs/UserAccountApi.md#useraccountfollowedinterests) | **Get** /users/{username}/interests/follow | List following interests
    *UserAccountApi* | [**userAccountGet**](Apis/docs/UserAccountApi.md#useraccountget) | **Get** /user_account | Get user account
    *UserAccountApi* | [**userFollowingGet**](Apis/docs/UserAccountApi.md#userfollowingget) | **Get** /user_account/following | List following
    *UserAccountApi* | [**userWebsitesGet**](Apis/docs/UserAccountApi.md#userwebsitesget) | **Get** /user_account/websites | Get user websites
    *UserAccountApi* | [**verifyWebsiteUpdate**](Apis/docs/UserAccountApi.md#verifywebsiteupdate) | **Post** /user_account/websites | Verify website
    *UserAccountApi* | [**websiteVerificationGet**](Apis/docs/UserAccountApi.md#websiteverificationget) | **Get** /user_account/websites/verification | Get user verification code for website claiming
    

    <a id="documentation-for-models"></a>
    ## Documentation for Models

         - [org.openapitools.server.api.model.Account](Models/docs/Account.md)
         - [org.openapitools.server.api.model.AccountTemplate](Models/docs/AccountTemplate.md)
         - [org.openapitools.server.api.model.ActionType](Models/docs/ActionType.md)
         - [org.openapitools.server.api.model.Ad](Models/docs/Ad.md)
         - [org.openapitools.server.api.model.AdAccount](Models/docs/AdAccount.md)
         - [org.openapitools.server.api.model.AdAccountAnalyticsItems](Models/docs/AdAccountAnalyticsItems.md)
         - [org.openapitools.server.api.model.AdAccountCountriesGet200Response](Models/docs/AdAccountCountriesGet200Response.md)
         - [org.openapitools.server.api.model.AdAccountCreate](Models/docs/AdAccountCreate.md)
         - [org.openapitools.server.api.model.AdAccountEntityType](Models/docs/AdAccountEntityType.md)
         - [org.openapitools.server.api.model.AdAccountOwner](Models/docs/AdAccountOwner.md)
         - [org.openapitools.server.api.model.AdAccountToAdAccountSharedAudience](Models/docs/AdAccountToAdAccountSharedAudience.md)
         - [org.openapitools.server.api.model.AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody](Models/docs/AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody.md)
         - [org.openapitools.server.api.model.AdAccountToBusinessSharedAudience](Models/docs/AdAccountToBusinessSharedAudience.md)
         - [org.openapitools.server.api.model.AdAccountToBusinessSharedAudienceUpdateWithRequiredBody](Models/docs/AdAccountToBusinessSharedAudienceUpdateWithRequiredBody.md)
         - [org.openapitools.server.api.model.AdAccountsAudience](Models/docs/AdAccountsAudience.md)
         - [org.openapitools.server.api.model.AdAccountsAudienceCreate](Models/docs/AdAccountsAudienceCreate.md)
         - [org.openapitools.server.api.model.AdAccountsAudienceRule](Models/docs/AdAccountsAudienceRule.md)
         - [org.openapitools.server.api.model.AdAccountsAudienceUpdate](Models/docs/AdAccountsAudienceUpdate.md)
         - [org.openapitools.server.api.model.AdAccountsAudiencesSharedAccountsList200Response](Models/docs/AdAccountsAudiencesSharedAccountsList200Response.md)
         - [org.openapitools.server.api.model.AdAccountsCountry](Models/docs/AdAccountsCountry.md)
         - [org.openapitools.server.api.model.AdAccountsList200Response](Models/docs/AdAccountsList200Response.md)
         - [org.openapitools.server.api.model.AdAccountsSubscriptionsGetList200Response](Models/docs/AdAccountsSubscriptionsGetList200Response.md)
         - [org.openapitools.server.api.model.AdAdsAnalyticsAsyncTargetingTypes](Models/docs/AdAdsAnalyticsAsyncTargetingTypes.md)
         - [org.openapitools.server.api.model.AdBatchItem](Models/docs/AdBatchItem.md)
         - [org.openapitools.server.api.model.AdBatchUpdate](Models/docs/AdBatchUpdate.md)
         - [org.openapitools.server.api.model.AdBatchWriteResponseModel](Models/docs/AdBatchWriteResponseModel.md)
         - [org.openapitools.server.api.model.AdCollectionsHeaderType](Models/docs/AdCollectionsHeaderType.md)
         - [org.openapitools.server.api.model.AdCreate](Models/docs/AdCreate.md)
         - [org.openapitools.server.api.model.AdCreateRequest](Models/docs/AdCreateRequest.md)
         - [org.openapitools.server.api.model.AdDisapprovalReasons](Models/docs/AdDisapprovalReasons.md)
         - [org.openapitools.server.api.model.AdGroup](Models/docs/AdGroup.md)
         - [org.openapitools.server.api.model.AdGroupAudienceSizing](Models/docs/AdGroupAudienceSizing.md)
         - [org.openapitools.server.api.model.AdGroupAudienceSizingCreate](Models/docs/AdGroupAudienceSizingCreate.md)
         - [org.openapitools.server.api.model.AdGroupAudienceSizingCreativeTypes](Models/docs/AdGroupAudienceSizingCreativeTypes.md)
         - [org.openapitools.server.api.model.AdGroupAudienceSizingKeyword](Models/docs/AdGroupAudienceSizingKeyword.md)
         - [org.openapitools.server.api.model.AdGroupBase](Models/docs/AdGroupBase.md)
         - [org.openapitools.server.api.model.AdGroupCreate](Models/docs/AdGroupCreate.md)
         - [org.openapitools.server.api.model.AdGroupCreateCreate](Models/docs/AdGroupCreateCreate.md)
         - [org.openapitools.server.api.model.AdGroupCreateRequest](Models/docs/AdGroupCreateRequest.md)
         - [org.openapitools.server.api.model.AdGroupCreateRequestAllOf1](Models/docs/AdGroupCreateRequestAllOf1.md)
         - [org.openapitools.server.api.model.AdGroupDeliveryEstimates](Models/docs/AdGroupDeliveryEstimates.md)
         - [org.openapitools.server.api.model.AdGroupDeliveryEstimatesKeywordsItems](Models/docs/AdGroupDeliveryEstimatesKeywordsItems.md)
         - [org.openapitools.server.api.model.AdGroupSummaryStatus](Models/docs/AdGroupSummaryStatus.md)
         - [org.openapitools.server.api.model.AdGroupTrackingURLs](Models/docs/AdGroupTrackingURLs.md)
         - [org.openapitools.server.api.model.AdGroupUpdate](Models/docs/AdGroupUpdate.md)
         - [org.openapitools.server.api.model.AdGroupUpdateBatchUpdate](Models/docs/AdGroupUpdateBatchUpdate.md)
         - [org.openapitools.server.api.model.AdGroupUpdateRequest](Models/docs/AdGroupUpdateRequest.md)
         - [org.openapitools.server.api.model.AdGroupUpdateRequestAllOf1](Models/docs/AdGroupUpdateRequestAllOf1.md)
         - [org.openapitools.server.api.model.AdGroupsAnalyticsMetrics](Models/docs/AdGroupsAnalyticsMetrics.md)
         - [org.openapitools.server.api.model.AdGroupsCreate200Response](Models/docs/AdGroupsCreate200Response.md)
         - [org.openapitools.server.api.model.AdGroupsCreate200ResponseItemsInner](Models/docs/AdGroupsCreate200ResponseItemsInner.md)
         - [org.openapitools.server.api.model.AdGroupsList200Response](Models/docs/AdGroupsList200Response.md)
         - [org.openapitools.server.api.model.AdPinAnalytics](Models/docs/AdPinAnalytics.md)
         - [org.openapitools.server.api.model.AdPinPreviewCreativeType](Models/docs/AdPinPreviewCreativeType.md)
         - [org.openapitools.server.api.model.AdPreviewRequest](Models/docs/AdPreviewRequest.md)
         - [org.openapitools.server.api.model.AdPreviewShopping](Models/docs/AdPreviewShopping.md)
         - [org.openapitools.server.api.model.AdPreviewSourceImage](Models/docs/AdPreviewSourceImage.md)
         - [org.openapitools.server.api.model.AdPreviewSourcePinId](Models/docs/AdPreviewSourcePinId.md)
         - [org.openapitools.server.api.model.AdPreviewURLResponse](Models/docs/AdPreviewURLResponse.md)
         - [org.openapitools.server.api.model.AdReviewStatus](Models/docs/AdReviewStatus.md)
         - [org.openapitools.server.api.model.AdShoppingPreviewCreativeType](Models/docs/AdShoppingPreviewCreativeType.md)
         - [org.openapitools.server.api.model.AdUpdateRequest](Models/docs/AdUpdateRequest.md)
         - [org.openapitools.server.api.model.AdUpdateRequestAllOf1](Models/docs/AdUpdateRequestAllOf1.md)
         - [org.openapitools.server.api.model.AdeColumnType](Models/docs/AdeColumnType.md)
         - [org.openapitools.server.api.model.AdgroupPlacementGroupType](Models/docs/AdgroupPlacementGroupType.md)
         - [org.openapitools.server.api.model.AdgroupTrackingFeatureType](Models/docs/AdgroupTrackingFeatureType.md)
         - [org.openapitools.server.api.model.AdgroupTrackingFeatures](Models/docs/AdgroupTrackingFeatures.md)
         - [org.openapitools.server.api.model.AdsAnalytics](Models/docs/AdsAnalytics.md)
         - [org.openapitools.server.api.model.AdsAnalyticsAccountTargetingType](Models/docs/AdsAnalyticsAccountTargetingType.md)
         - [org.openapitools.server.api.model.AdsAnalyticsAdGroupTargetingType](Models/docs/AdsAnalyticsAdGroupTargetingType.md)
         - [org.openapitools.server.api.model.AdsAnalyticsAdTargetingType](Models/docs/AdsAnalyticsAdTargetingType.md)
         - [org.openapitools.server.api.model.AdsAnalyticsCampaignTargetingType](Models/docs/AdsAnalyticsCampaignTargetingType.md)
         - [org.openapitools.server.api.model.AdsAnalyticsCreateAsyncRequest](Models/docs/AdsAnalyticsCreateAsyncRequest.md)
         - [org.openapitools.server.api.model.AdsAnalyticsCreateAsyncResponse](Models/docs/AdsAnalyticsCreateAsyncResponse.md)
         - [org.openapitools.server.api.model.AdsAnalyticsFilterColumn](Models/docs/AdsAnalyticsFilterColumn.md)
         - [org.openapitools.server.api.model.AdsAnalyticsFilterOperator](Models/docs/AdsAnalyticsFilterOperator.md)
         - [org.openapitools.server.api.model.AdsAnalyticsGetAsyncResponse](Models/docs/AdsAnalyticsGetAsyncResponse.md)
         - [org.openapitools.server.api.model.AdsAnalyticsMetricsFilter](Models/docs/AdsAnalyticsMetricsFilter.md)
         - [org.openapitools.server.api.model.AdsCreditDiscountType](Models/docs/AdsCreditDiscountType.md)
         - [org.openapitools.server.api.model.AdsCreditDiscountsResponse](Models/docs/AdsCreditDiscountsResponse.md)
         - [org.openapitools.server.api.model.AdsCreditRedeem](Models/docs/AdsCreditRedeem.md)
         - [org.openapitools.server.api.model.AdsCreditRedeemCreate](Models/docs/AdsCreditRedeemCreate.md)
         - [org.openapitools.server.api.model.AdsCreditsDiscountsGet200Response](Models/docs/AdsCreditsDiscountsGet200Response.md)
         - [org.openapitools.server.api.model.AdsList200Response](Models/docs/AdsList200Response.md)
         - [org.openapitools.server.api.model.AdvancedAuctionBidOptions](Models/docs/AdvancedAuctionBidOptions.md)
         - [org.openapitools.server.api.model.AdvancedAuctionItem](Models/docs/AdvancedAuctionItem.md)
         - [org.openapitools.server.api.model.AdvancedAuctionItems](Models/docs/AdvancedAuctionItems.md)
         - [org.openapitools.server.api.model.AdvancedAuctionItemsGetRequest](Models/docs/AdvancedAuctionItemsGetRequest.md)
         - [org.openapitools.server.api.model.AdvancedAuctionItemsSubmitDeleteRecord](Models/docs/AdvancedAuctionItemsSubmitDeleteRecord.md)
         - [org.openapitools.server.api.model.AdvancedAuctionItemsSubmitRecord](Models/docs/AdvancedAuctionItemsSubmitRecord.md)
         - [org.openapitools.server.api.model.AdvancedAuctionItemsSubmitRequest](Models/docs/AdvancedAuctionItemsSubmitRequest.md)
         - [org.openapitools.server.api.model.AdvancedAuctionItemsSubmitUpsertRecord](Models/docs/AdvancedAuctionItemsSubmitUpsertRecord.md)
         - [org.openapitools.server.api.model.AdvancedAuctionKey](Models/docs/AdvancedAuctionKey.md)
         - [org.openapitools.server.api.model.AdvancedAuctionOperationError](Models/docs/AdvancedAuctionOperationError.md)
         - [org.openapitools.server.api.model.AdvancedAuctionProcessedItems](Models/docs/AdvancedAuctionProcessedItems.md)
         - [org.openapitools.server.api.model.AdvertiserDefinedEvent](Models/docs/AdvertiserDefinedEvent.md)
         - [org.openapitools.server.api.model.AdvertiserDefinedEventInput](Models/docs/AdvertiserDefinedEventInput.md)
         - [org.openapitools.server.api.model.AdvertiserDefinedEventMappingType](Models/docs/AdvertiserDefinedEventMappingType.md)
         - [org.openapitools.server.api.model.AdvertiserDefinedEventProcessingRecord](Models/docs/AdvertiserDefinedEventProcessingRecord.md)
         - [org.openapitools.server.api.model.AdvertiserDefinedEventsCreate200Response](Models/docs/AdvertiserDefinedEventsCreate200Response.md)
         - [org.openapitools.server.api.model.AdvertiserDefinedEventsCreateRequest](Models/docs/AdvertiserDefinedEventsCreateRequest.md)
         - [org.openapitools.server.api.model.AdvertiserDefinedEventsGet200Response](Models/docs/AdvertiserDefinedEventsGet200Response.md)
         - [org.openapitools.server.api.model.AgeBucketMultipliers](Models/docs/AgeBucketMultipliers.md)
         - [org.openapitools.server.api.model.AgeTrendsBucket](Models/docs/AgeTrendsBucket.md)
         - [org.openapitools.server.api.model.AggregatedPinComment](Models/docs/AggregatedPinComment.md)
         - [org.openapitools.server.api.model.AiDisclosureItem](Models/docs/AiDisclosureItem.md)
         - [org.openapitools.server.api.model.AiDisclosures](Models/docs/AiDisclosures.md)
         - [org.openapitools.server.api.model.AiDisclosuresUpdate](Models/docs/AiDisclosuresUpdate.md)
         - [org.openapitools.server.api.model.AmazonConnectRequest](Models/docs/AmazonConnectRequest.md)
         - [org.openapitools.server.api.model.AmazonConnectResponse](Models/docs/AmazonConnectResponse.md)
         - [org.openapitools.server.api.model.AnalyticsDailyMetrics](Models/docs/AnalyticsDailyMetrics.md)
         - [org.openapitools.server.api.model.AnalyticsMetricsResponse](Models/docs/AnalyticsMetricsResponse.md)
         - [org.openapitools.server.api.model.AppTypeMultipliers](Models/docs/AppTypeMultipliers.md)
         - [org.openapitools.server.api.model.AppsflyerAudience](Models/docs/AppsflyerAudience.md)
         - [org.openapitools.server.api.model.AppsflyerAudienceCreate](Models/docs/AppsflyerAudienceCreate.md)
         - [org.openapitools.server.api.model.AppsflyerAudienceSyncCreate](Models/docs/AppsflyerAudienceSyncCreate.md)
         - [org.openapitools.server.api.model.AppsflyerPlatform](Models/docs/AppsflyerPlatform.md)
         - [org.openapitools.server.api.model.AssetAccessRequestError](Models/docs/AssetAccessRequestError.md)
         - [org.openapitools.server.api.model.AssetGroupBinding](Models/docs/AssetGroupBinding.md)
         - [org.openapitools.server.api.model.AssetGroupDeleteError](Models/docs/AssetGroupDeleteError.md)
         - [org.openapitools.server.api.model.AssetGroupDeletion](Models/docs/AssetGroupDeletion.md)
         - [org.openapitools.server.api.model.AssetGroupDeletionDelete](Models/docs/AssetGroupDeletionDelete.md)
         - [org.openapitools.server.api.model.AssetGroupInput](Models/docs/AssetGroupInput.md)
         - [org.openapitools.server.api.model.AssetGroupInputCreate](Models/docs/AssetGroupInputCreate.md)
         - [org.openapitools.server.api.model.AssetGroupModification](Models/docs/AssetGroupModification.md)
         - [org.openapitools.server.api.model.AssetGroupModificationReadOrUpdate](Models/docs/AssetGroupModificationReadOrUpdate.md)
         - [org.openapitools.server.api.model.AssetGroupType](Models/docs/AssetGroupType.md)
         - [org.openapitools.server.api.model.AssetGroupUpdateError](Models/docs/AssetGroupUpdateError.md)
         - [org.openapitools.server.api.model.AssetGroupUpdateItemReadOrUpdateItem](Models/docs/AssetGroupUpdateItemReadOrUpdateItem.md)
         - [org.openapitools.server.api.model.AssetIdPermissions](Models/docs/AssetIdPermissions.md)
         - [org.openapitools.server.api.model.AssetIdWithPermissions](Models/docs/AssetIdWithPermissions.md)
         - [org.openapitools.server.api.model.AssetPermissionType](Models/docs/AssetPermissionType.md)
         - [org.openapitools.server.api.model.AssetSearchBy](Models/docs/AssetSearchBy.md)
         - [org.openapitools.server.api.model.AssetSortBy](Models/docs/AssetSortBy.md)
         - [org.openapitools.server.api.model.AssetTypeResponse](Models/docs/AssetTypeResponse.md)
         - [org.openapitools.server.api.model.AttributionActionType](Models/docs/AttributionActionType.md)
         - [org.openapitools.server.api.model.AttributionMatchType](Models/docs/AttributionMatchType.md)
         - [org.openapitools.server.api.model.AttributionModel](Models/docs/AttributionModel.md)
         - [org.openapitools.server.api.model.AttributionScope](Models/docs/AttributionScope.md)
         - [org.openapitools.server.api.model.AttributionWindows](Models/docs/AttributionWindows.md)
         - [org.openapitools.server.api.model.Audience](Models/docs/Audience.md)
         - [org.openapitools.server.api.model.AudienceAccountType](Models/docs/AudienceAccountType.md)
         - [org.openapitools.server.api.model.AudienceCategory](Models/docs/AudienceCategory.md)
         - [org.openapitools.server.api.model.AudienceDefinition](Models/docs/AudienceDefinition.md)
         - [org.openapitools.server.api.model.AudienceDemographicValue](Models/docs/AudienceDemographicValue.md)
         - [org.openapitools.server.api.model.AudienceDemographics](Models/docs/AudienceDemographics.md)
         - [org.openapitools.server.api.model.AudienceInsightType](Models/docs/AudienceInsightType.md)
         - [org.openapitools.server.api.model.AudienceInsights](Models/docs/AudienceInsights.md)
         - [org.openapitools.server.api.model.AudienceInsightsScopeAndTypeGet200Response](Models/docs/AudienceInsightsScopeAndTypeGet200Response.md)
         - [org.openapitools.server.api.model.AudienceObjectiveType](Models/docs/AudienceObjectiveType.md)
         - [org.openapitools.server.api.model.AudienceOwnershipType](Models/docs/AudienceOwnershipType.md)
         - [org.openapitools.server.api.model.AudienceRule](Models/docs/AudienceRule.md)
         - [org.openapitools.server.api.model.AudienceStatus](Models/docs/AudienceStatus.md)
         - [org.openapitools.server.api.model.AudienceSubcategory](Models/docs/AudienceSubcategory.md)
         - [org.openapitools.server.api.model.AudienceType](Models/docs/AudienceType.md)
         - [org.openapitools.server.api.model.AudienceUpdateOperationType](Models/docs/AudienceUpdateOperationType.md)
         - [org.openapitools.server.api.model.AudiencesList200Response](Models/docs/AudiencesList200Response.md)
         - [org.openapitools.server.api.model.AuthRespondInviteAction](Models/docs/AuthRespondInviteAction.md)
         - [org.openapitools.server.api.model.AuthRespondInvitesBody](Models/docs/AuthRespondInvitesBody.md)
         - [org.openapitools.server.api.model.AuthRespondInvitesBodyItem](Models/docs/AuthRespondInvitesBodyItem.md)
         - [org.openapitools.server.api.model.AvailabilityFilter](Models/docs/AvailabilityFilter.md)
         - [org.openapitools.server.api.model.BaseBusinessAssets](Models/docs/BaseBusinessAssets.md)
         - [org.openapitools.server.api.model.BaseInviteDataResponse](Models/docs/BaseInviteDataResponse.md)
         - [org.openapitools.server.api.model.BasePreferredMediaType](Models/docs/BasePreferredMediaType.md)
         - [org.openapitools.server.api.model.BatchOperationStatus](Models/docs/BatchOperationStatus.md)
         - [org.openapitools.server.api.model.BidFloor](Models/docs/BidFloor.md)
         - [org.openapitools.server.api.model.BidFloorCreate](Models/docs/BidFloorCreate.md)
         - [org.openapitools.server.api.model.BidFloorObjectiveType](Models/docs/BidFloorObjectiveType.md)
         - [org.openapitools.server.api.model.BidFloorSpec](Models/docs/BidFloorSpec.md)
         - [org.openapitools.server.api.model.BidOptionsAgeBucketMultipliers](Models/docs/BidOptionsAgeBucketMultipliers.md)
         - [org.openapitools.server.api.model.BidOptionsAppTypeMultipliers](Models/docs/BidOptionsAppTypeMultipliers.md)
         - [org.openapitools.server.api.model.BidOptionsAudienceMultipliers](Models/docs/BidOptionsAudienceMultipliers.md)
         - [org.openapitools.server.api.model.BidOptionsGenderMultipliers](Models/docs/BidOptionsGenderMultipliers.md)
         - [org.openapitools.server.api.model.BidOptionsPlacementMultipliers](Models/docs/BidOptionsPlacementMultipliers.md)
         - [org.openapitools.server.api.model.BidStrategyType](Models/docs/BidStrategyType.md)
         - [org.openapitools.server.api.model.BillingInvoice](Models/docs/BillingInvoice.md)
         - [org.openapitools.server.api.model.BillingInvoiceDocumentType](Models/docs/BillingInvoiceDocumentType.md)
         - [org.openapitools.server.api.model.BillingInvoiceDownloadResponse](Models/docs/BillingInvoiceDownloadResponse.md)
         - [org.openapitools.server.api.model.BillingInvoiceSortField](Models/docs/BillingInvoiceSortField.md)
         - [org.openapitools.server.api.model.BillingInvoiceStatus](Models/docs/BillingInvoiceStatus.md)
         - [org.openapitools.server.api.model.BillingInvoicesGet200Response](Models/docs/BillingInvoicesGet200Response.md)
         - [org.openapitools.server.api.model.BillingProfileCardType](Models/docs/BillingProfileCardType.md)
         - [org.openapitools.server.api.model.BillingProfilePaymentMethodBrand](Models/docs/BillingProfilePaymentMethodBrand.md)
         - [org.openapitools.server.api.model.BillingProfileStatus](Models/docs/BillingProfileStatus.md)
         - [org.openapitools.server.api.model.BillingProfilesGet200Response](Models/docs/BillingProfilesGet200Response.md)
         - [org.openapitools.server.api.model.BillingProfilesResponse](Models/docs/BillingProfilesResponse.md)
         - [org.openapitools.server.api.model.BillingType](Models/docs/BillingType.md)
         - [org.openapitools.server.api.model.Board](Models/docs/Board.md)
         - [org.openapitools.server.api.model.BoardBase](Models/docs/BoardBase.md)
         - [org.openapitools.server.api.model.BoardCreate](Models/docs/BoardCreate.md)
         - [org.openapitools.server.api.model.BoardMedia](Models/docs/BoardMedia.md)
         - [org.openapitools.server.api.model.BoardOwner](Models/docs/BoardOwner.md)
         - [org.openapitools.server.api.model.BoardPrivacy](Models/docs/BoardPrivacy.md)
         - [org.openapitools.server.api.model.BoardPrivacyFilter](Models/docs/BoardPrivacyFilter.md)
         - [org.openapitools.server.api.model.BoardSection](Models/docs/BoardSection.md)
         - [org.openapitools.server.api.model.BoardSectionCreate](Models/docs/BoardSectionCreate.md)
         - [org.openapitools.server.api.model.BoardSectionUpdateWithRequiredBody](Models/docs/BoardSectionUpdateWithRequiredBody.md)
         - [org.openapitools.server.api.model.BoardSectionsList200Response](Models/docs/BoardSectionsList200Response.md)
         - [org.openapitools.server.api.model.BoardUpdatePrivacy](Models/docs/BoardUpdatePrivacy.md)
         - [org.openapitools.server.api.model.BoardWithUpdatePrivacy](Models/docs/BoardWithUpdatePrivacy.md)
         - [org.openapitools.server.api.model.BoardWithUpdatePrivacyUpdate](Models/docs/BoardWithUpdatePrivacyUpdate.md)
         - [org.openapitools.server.api.model.BoardsList200Response](Models/docs/BoardsList200Response.md)
         - [org.openapitools.server.api.model.BoardsListPins200Response](Models/docs/BoardsListPins200Response.md)
         - [org.openapitools.server.api.model.BookClosed](Models/docs/BookClosed.md)
         - [org.openapitools.server.api.model.BrandAccount](Models/docs/BrandAccount.md)
         - [org.openapitools.server.api.model.BrandAccountCreate](Models/docs/BrandAccountCreate.md)
         - [org.openapitools.server.api.model.BrandAccountProfileImage](Models/docs/BrandAccountProfileImage.md)
         - [org.openapitools.server.api.model.BrandAccountProfileImageUpdate](Models/docs/BrandAccountProfileImageUpdate.md)
         - [org.openapitools.server.api.model.BrandAccountUpdate](Models/docs/BrandAccountUpdate.md)
         - [org.openapitools.server.api.model.BrandFilter](Models/docs/BrandFilter.md)
         - [org.openapitools.server.api.model.BudgetDurationType](Models/docs/BudgetDurationType.md)
         - [org.openapitools.server.api.model.BudgetType](Models/docs/BudgetType.md)
         - [org.openapitools.server.api.model.BulkCampaignDeliveryEstimatesItem](Models/docs/BulkCampaignDeliveryEstimatesItem.md)
         - [org.openapitools.server.api.model.BulkCampaignDeliveryEstimatesResponse](Models/docs/BulkCampaignDeliveryEstimatesResponse.md)
         - [org.openapitools.server.api.model.BulkDownload](Models/docs/BulkDownload.md)
         - [org.openapitools.server.api.model.BulkDownloadCampaignFilter](Models/docs/BulkDownloadCampaignFilter.md)
         - [org.openapitools.server.api.model.BulkDownloadCreate](Models/docs/BulkDownloadCreate.md)
         - [org.openapitools.server.api.model.BulkEntityType](Models/docs/BulkEntityType.md)
         - [org.openapitools.server.api.model.BulkJobData](Models/docs/BulkJobData.md)
         - [org.openapitools.server.api.model.BulkOutputFormat](Models/docs/BulkOutputFormat.md)
         - [org.openapitools.server.api.model.BulkReportingJobStatus](Models/docs/BulkReportingJobStatus.md)
         - [org.openapitools.server.api.model.BulkRequestStatus](Models/docs/BulkRequestStatus.md)
         - [org.openapitools.server.api.model.BulkUpsertRequest](Models/docs/BulkUpsertRequest.md)
         - [org.openapitools.server.api.model.BulkUpsertRequestCreate](Models/docs/BulkUpsertRequestCreate.md)
         - [org.openapitools.server.api.model.BulkUpsertRequestCreateCatalogProductGroupsItems](Models/docs/BulkUpsertRequestCreateCatalogProductGroupsItems.md)
         - [org.openapitools.server.api.model.BulkUpsertRequestUpdate](Models/docs/BulkUpsertRequestUpdate.md)
         - [org.openapitools.server.api.model.BulkUpsertRequestUpdateCatalogProductGroupsItems](Models/docs/BulkUpsertRequestUpdateCatalogProductGroupsItems.md)
         - [org.openapitools.server.api.model.BulkUpsertResponse](Models/docs/BulkUpsertResponse.md)
         - [org.openapitools.server.api.model.BusinessAccessRole](Models/docs/BusinessAccessRole.md)
         - [org.openapitools.server.api.model.BusinessAccessUserSummary](Models/docs/BusinessAccessUserSummary.md)
         - [org.openapitools.server.api.model.BusinessAssetMembersGet200Response](Models/docs/BusinessAssetMembersGet200Response.md)
         - [org.openapitools.server.api.model.BusinessAssets](Models/docs/BusinessAssets.md)
         - [org.openapitools.server.api.model.BusinessAssetsGet200Response](Models/docs/BusinessAssetsGet200Response.md)
         - [org.openapitools.server.api.model.BusinessMemberAssetsGetResponse](Models/docs/BusinessMemberAssetsGetResponse.md)
         - [org.openapitools.server.api.model.BusinessMemberAssetsSummary](Models/docs/BusinessMemberAssetsSummary.md)
         - [org.openapitools.server.api.model.BusinessMemberSortBy](Models/docs/BusinessMemberSortBy.md)
         - [org.openapitools.server.api.model.BusinessMembersAssetAccessDeleteBody](Models/docs/BusinessMembersAssetAccessDeleteBody.md)
         - [org.openapitools.server.api.model.BusinessMembershipMember](Models/docs/BusinessMembershipMember.md)
         - [org.openapitools.server.api.model.BusinessPartnerAssetAccessGet200Response](Models/docs/BusinessPartnerAssetAccessGet200Response.md)
         - [org.openapitools.server.api.model.BusinessRoleForInvite](Models/docs/BusinessRoleForInvite.md)
         - [org.openapitools.server.api.model.BusinessRoleForMembers](Models/docs/BusinessRoleForMembers.md)
         - [org.openapitools.server.api.model.BusinessSearchBy](Models/docs/BusinessSearchBy.md)
         - [org.openapitools.server.api.model.BusinessToAdAccountSharedAudience](Models/docs/BusinessToAdAccountSharedAudience.md)
         - [org.openapitools.server.api.model.BusinessToAdAccountSharedAudienceUpdateWithRequiredBody](Models/docs/BusinessToAdAccountSharedAudienceUpdateWithRequiredBody.md)
         - [org.openapitools.server.api.model.BusinessToBusinessSharedAudience](Models/docs/BusinessToBusinessSharedAudience.md)
         - [org.openapitools.server.api.model.BusinessToBusinessSharedAudienceUpdateWithRequiredBody](Models/docs/BusinessToBusinessSharedAudienceUpdateWithRequiredBody.md)
         - [org.openapitools.server.api.model.Campaign](Models/docs/Campaign.md)
         - [org.openapitools.server.api.model.CampaignAdPreview](Models/docs/CampaignAdPreview.md)
         - [org.openapitools.server.api.model.CampaignAdPreviewCreate](Models/docs/CampaignAdPreviewCreate.md)
         - [org.openapitools.server.api.model.CampaignAdPreviewCreate200ResponseInner](Models/docs/CampaignAdPreviewCreate200ResponseInner.md)
         - [org.openapitools.server.api.model.CampaignAdPreviewCreate200ResponseInnerData](Models/docs/CampaignAdPreviewCreate200ResponseInnerData.md)
         - [org.openapitools.server.api.model.CampaignAdPreviewCreate200ResponseInnerDataOneOf](Models/docs/CampaignAdPreviewCreate200ResponseInnerDataOneOf.md)
         - [org.openapitools.server.api.model.CampaignAdPreviewDelete200ResponseInner](Models/docs/CampaignAdPreviewDelete200ResponseInner.md)
         - [org.openapitools.server.api.model.CampaignAdPreviewDelete200ResponseInnerStatus](Models/docs/CampaignAdPreviewDelete200ResponseInnerStatus.md)
         - [org.openapitools.server.api.model.CampaignAudienceMultipliers](Models/docs/CampaignAudienceMultipliers.md)
         - [org.openapitools.server.api.model.CampaignBatchItem](Models/docs/CampaignBatchItem.md)
         - [org.openapitools.server.api.model.CampaignBatchResponseData](Models/docs/CampaignBatchResponseData.md)
         - [org.openapitools.server.api.model.CampaignBatchUpdateItem](Models/docs/CampaignBatchUpdateItem.md)
         - [org.openapitools.server.api.model.CampaignBatchWriteResponseModel](Models/docs/CampaignBatchWriteResponseModel.md)
         - [org.openapitools.server.api.model.CampaignBidOptions](Models/docs/CampaignBidOptions.md)
         - [org.openapitools.server.api.model.CampaignBidOptionsCreate](Models/docs/CampaignBidOptionsCreate.md)
         - [org.openapitools.server.api.model.CampaignBidOptionsUpdate](Models/docs/CampaignBidOptionsUpdate.md)
         - [org.openapitools.server.api.model.CampaignBidOptionsUpdateMaskItems](Models/docs/CampaignBidOptionsUpdateMaskItems.md)
         - [org.openapitools.server.api.model.CampaignCreateItem](Models/docs/CampaignCreateItem.md)
         - [org.openapitools.server.api.model.CampaignCreateRequest](Models/docs/CampaignCreateRequest.md)
         - [org.openapitools.server.api.model.CampaignCreateRequestAllOf1](Models/docs/CampaignCreateRequestAllOf1.md)
         - [org.openapitools.server.api.model.CampaignDeliveryEstimatesCampaign](Models/docs/CampaignDeliveryEstimatesCampaign.md)
         - [org.openapitools.server.api.model.CampaignDeliveryEstimatesDerivedMetrics](Models/docs/CampaignDeliveryEstimatesDerivedMetrics.md)
         - [org.openapitools.server.api.model.CampaignDeliveryEstimatesResponse](Models/docs/CampaignDeliveryEstimatesResponse.md)
         - [org.openapitools.server.api.model.CampaignObjectiveType](Models/docs/CampaignObjectiveType.md)
         - [org.openapitools.server.api.model.CampaignPlanningAdGroupAudienceSize](Models/docs/CampaignPlanningAdGroupAudienceSize.md)
         - [org.openapitools.server.api.model.CampaignPlanningBudgetRecommendation](Models/docs/CampaignPlanningBudgetRecommendation.md)
         - [org.openapitools.server.api.model.CampaignPlanningBudgetRecommendationPoint](Models/docs/CampaignPlanningBudgetRecommendationPoint.md)
         - [org.openapitools.server.api.model.CampaignPlanningConfidenceLevelAlert](Models/docs/CampaignPlanningConfidenceLevelAlert.md)
         - [org.openapitools.server.api.model.CampaignPlanningConfidenceLevelAlertReason](Models/docs/CampaignPlanningConfidenceLevelAlertReason.md)
         - [org.openapitools.server.api.model.CampaignPlanningConfidenceLevelAlertSeverity](Models/docs/CampaignPlanningConfidenceLevelAlertSeverity.md)
         - [org.openapitools.server.api.model.CampaignPlanningConversionAttribution](Models/docs/CampaignPlanningConversionAttribution.md)
         - [org.openapitools.server.api.model.CampaignPlanningConversionAttributionWindowDays](Models/docs/CampaignPlanningConversionAttributionWindowDays.md)
         - [org.openapitools.server.api.model.CampaignPlanningConversionEvent](Models/docs/CampaignPlanningConversionEvent.md)
         - [org.openapitools.server.api.model.CampaignPlanningConversionRate](Models/docs/CampaignPlanningConversionRate.md)
         - [org.openapitools.server.api.model.CampaignPlanningCurveEstimate](Models/docs/CampaignPlanningCurveEstimate.md)
         - [org.openapitools.server.api.model.CampaignPlanningEstimationType](Models/docs/CampaignPlanningEstimationType.md)
         - [org.openapitools.server.api.model.CampaignPlanningExperimentBudgetRecommendation](Models/docs/CampaignPlanningExperimentBudgetRecommendation.md)
         - [org.openapitools.server.api.model.CampaignPlanningPointEstimate](Models/docs/CampaignPlanningPointEstimate.md)
         - [org.openapitools.server.api.model.CampaignPlanningResponseError](Models/docs/CampaignPlanningResponseError.md)
         - [org.openapitools.server.api.model.CampaignPlanningResponseErrorCode](Models/docs/CampaignPlanningResponseErrorCode.md)
         - [org.openapitools.server.api.model.CampaignSummaryStatus](Models/docs/CampaignSummaryStatus.md)
         - [org.openapitools.server.api.model.CampaignUpdateRequest](Models/docs/CampaignUpdateRequest.md)
         - [org.openapitools.server.api.model.CampaignUpdateRequestAllOf2](Models/docs/CampaignUpdateRequestAllOf2.md)
         - [org.openapitools.server.api.model.CampaignsAnalyticsMetrics](Models/docs/CampaignsAnalyticsMetrics.md)
         - [org.openapitools.server.api.model.CampaignsList200Response](Models/docs/CampaignsList200Response.md)
         - [org.openapitools.server.api.model.CancelInviteException](Models/docs/CancelInviteException.md)
         - [org.openapitools.server.api.model.CancelInviteResult](Models/docs/CancelInviteResult.md)
         - [org.openapitools.server.api.model.CancelInviteResultItem](Models/docs/CancelInviteResultItem.md)
         - [org.openapitools.server.api.model.CancelInviteResultUser](Models/docs/CancelInviteResultUser.md)
         - [org.openapitools.server.api.model.CancelInvitesRequest](Models/docs/CancelInvitesRequest.md)
         - [org.openapitools.server.api.model.CancelInvitesResponse](Models/docs/CancelInvitesResponse.md)
         - [org.openapitools.server.api.model.CarouselSlot](Models/docs/CarouselSlot.md)
         - [org.openapitools.server.api.model.CartingProduct](Models/docs/CartingProduct.md)
         - [org.openapitools.server.api.model.CartingRetailer](Models/docs/CartingRetailer.md)
         - [org.openapitools.server.api.model.Catalog](Models/docs/Catalog.md)
         - [org.openapitools.server.api.model.CatalogBinding](Models/docs/CatalogBinding.md)
         - [org.openapitools.server.api.model.CatalogCreate](Models/docs/CatalogCreate.md)
         - [org.openapitools.server.api.model.CatalogUpdate](Models/docs/CatalogUpdate.md)
         - [org.openapitools.server.api.model.CatalogsAiContentDisclosure](Models/docs/CatalogsAiContentDisclosure.md)
         - [org.openapitools.server.api.model.CatalogsAiContentDisclosureLabel](Models/docs/CatalogsAiContentDisclosureLabel.md)
         - [org.openapitools.server.api.model.CatalogsAvailableFilterValues](Models/docs/CatalogsAvailableFilterValues.md)
         - [org.openapitools.server.api.model.CatalogsBaseFilterKeys](Models/docs/CatalogsBaseFilterKeys.md)
         - [org.openapitools.server.api.model.CatalogsBaseFiltersAllOf](Models/docs/CatalogsBaseFiltersAllOf.md)
         - [org.openapitools.server.api.model.CatalogsBaseFiltersAnyOf](Models/docs/CatalogsBaseFiltersAnyOf.md)
         - [org.openapitools.server.api.model.CatalogsCreateCreativeAssetsItem](Models/docs/CatalogsCreateCreativeAssetsItem.md)
         - [org.openapitools.server.api.model.CatalogsCreateHotelItem](Models/docs/CatalogsCreateHotelItem.md)
         - [org.openapitools.server.api.model.CatalogsCreateReportResponse](Models/docs/CatalogsCreateReportResponse.md)
         - [org.openapitools.server.api.model.CatalogsCreateRetailItem](Models/docs/CatalogsCreateRetailItem.md)
         - [org.openapitools.server.api.model.CatalogsCreativeAssetsAttributes](Models/docs/CatalogsCreativeAssetsAttributes.md)
         - [org.openapitools.server.api.model.CatalogsCreativeAssetsAvailableFilterValues](Models/docs/CatalogsCreativeAssetsAvailableFilterValues.md)
         - [org.openapitools.server.api.model.CatalogsCreativeAssetsBatchItem](Models/docs/CatalogsCreativeAssetsBatchItem.md)
         - [org.openapitools.server.api.model.CatalogsCreativeAssetsBatchRequest](Models/docs/CatalogsCreativeAssetsBatchRequest.md)
         - [org.openapitools.server.api.model.CatalogsCreativeAssetsFeed](Models/docs/CatalogsCreativeAssetsFeed.md)
         - [org.openapitools.server.api.model.CatalogsCreativeAssetsFeedsCreateRequest](Models/docs/CatalogsCreativeAssetsFeedsCreateRequest.md)
         - [org.openapitools.server.api.model.CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale](Models/docs/CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale.md)
         - [org.openapitools.server.api.model.CatalogsCreativeAssetsFeedsUpdateRequest](Models/docs/CatalogsCreativeAssetsFeedsUpdateRequest.md)
         - [org.openapitools.server.api.model.CatalogsCreativeAssetsFilterValuesMap](Models/docs/CatalogsCreativeAssetsFilterValuesMap.md)
         - [org.openapitools.server.api.model.CatalogsCreativeAssetsItemErrorResponse](Models/docs/CatalogsCreativeAssetsItemErrorResponse.md)
         - [org.openapitools.server.api.model.CatalogsCreativeAssetsItemResponse](Models/docs/CatalogsCreativeAssetsItemResponse.md)
         - [org.openapitools.server.api.model.CatalogsCreativeAssetsItemsBatch](Models/docs/CatalogsCreativeAssetsItemsBatch.md)
         - [org.openapitools.server.api.model.CatalogsCreativeAssetsItemsPostFilter](Models/docs/CatalogsCreativeAssetsItemsPostFilter.md)
         - [org.openapitools.server.api.model.CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest](Models/docs/CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest.md)
         - [org.openapitools.server.api.model.CatalogsCreativeAssetsProduct](Models/docs/CatalogsCreativeAssetsProduct.md)
         - [org.openapitools.server.api.model.CatalogsCreativeAssetsProductGroup](Models/docs/CatalogsCreativeAssetsProductGroup.md)
         - [org.openapitools.server.api.model.CatalogsCreativeAssetsProductGroupCreateRequest](Models/docs/CatalogsCreativeAssetsProductGroupCreateRequest.md)
         - [org.openapitools.server.api.model.CatalogsCreativeAssetsProductGroupFilterKeys](Models/docs/CatalogsCreativeAssetsProductGroupFilterKeys.md)
         - [org.openapitools.server.api.model.CatalogsCreativeAssetsProductGroupFilters](Models/docs/CatalogsCreativeAssetsProductGroupFilters.md)
         - [org.openapitools.server.api.model.CatalogsCreativeAssetsProductGroupFiltersAllOf](Models/docs/CatalogsCreativeAssetsProductGroupFiltersAllOf.md)
         - [org.openapitools.server.api.model.CatalogsCreativeAssetsProductGroupFiltersAnyOf](Models/docs/CatalogsCreativeAssetsProductGroupFiltersAnyOf.md)
         - [org.openapitools.server.api.model.CatalogsCreativeAssetsProductGroupProductCounts](Models/docs/CatalogsCreativeAssetsProductGroupProductCounts.md)
         - [org.openapitools.server.api.model.CatalogsCreativeAssetsProductGroupUpdateRequest](Models/docs/CatalogsCreativeAssetsProductGroupUpdateRequest.md)
         - [org.openapitools.server.api.model.CatalogsCreativeAssetsProductMetadata](Models/docs/CatalogsCreativeAssetsProductMetadata.md)
         - [org.openapitools.server.api.model.CatalogsDeleteCreativeAssetsItem](Models/docs/CatalogsDeleteCreativeAssetsItem.md)
         - [org.openapitools.server.api.model.CatalogsDeleteHotelItem](Models/docs/CatalogsDeleteHotelItem.md)
         - [org.openapitools.server.api.model.CatalogsDeleteRetailItem](Models/docs/CatalogsDeleteRetailItem.md)
         - [org.openapitools.server.api.model.CatalogsFeed](Models/docs/CatalogsFeed.md)
         - [org.openapitools.server.api.model.CatalogsFeedCreateRequestSchema](Models/docs/CatalogsFeedCreateRequestSchema.md)
         - [org.openapitools.server.api.model.CatalogsFeedCredentials](Models/docs/CatalogsFeedCredentials.md)
         - [org.openapitools.server.api.model.CatalogsFeedIngestion](Models/docs/CatalogsFeedIngestion.md)
         - [org.openapitools.server.api.model.CatalogsFeedIngestionDetails](Models/docs/CatalogsFeedIngestionDetails.md)
         - [org.openapitools.server.api.model.CatalogsFeedIngestionErrors](Models/docs/CatalogsFeedIngestionErrors.md)
         - [org.openapitools.server.api.model.CatalogsFeedIngestionInfo](Models/docs/CatalogsFeedIngestionInfo.md)
         - [org.openapitools.server.api.model.CatalogsFeedIngestionWarnings](Models/docs/CatalogsFeedIngestionWarnings.md)
         - [org.openapitools.server.api.model.CatalogsFeedProcessingResult](Models/docs/CatalogsFeedProcessingResult.md)
         - [org.openapitools.server.api.model.CatalogsFeedProcessingSchedule](Models/docs/CatalogsFeedProcessingSchedule.md)
         - [org.openapitools.server.api.model.CatalogsFeedProcessingScheduleTimezone](Models/docs/CatalogsFeedProcessingScheduleTimezone.md)
         - [org.openapitools.server.api.model.CatalogsFeedProcessingStatus](Models/docs/CatalogsFeedProcessingStatus.md)
         - [org.openapitools.server.api.model.CatalogsFeedProductCounts](Models/docs/CatalogsFeedProductCounts.md)
         - [org.openapitools.server.api.model.CatalogsFeedUpdateRequestSchema](Models/docs/CatalogsFeedUpdateRequestSchema.md)
         - [org.openapitools.server.api.model.CatalogsFeedValidationDetails](Models/docs/CatalogsFeedValidationDetails.md)
         - [org.openapitools.server.api.model.CatalogsFeedValidationErrors](Models/docs/CatalogsFeedValidationErrors.md)
         - [org.openapitools.server.api.model.CatalogsFeedValidationWarnings](Models/docs/CatalogsFeedValidationWarnings.md)
         - [org.openapitools.server.api.model.CatalogsFeedVideoCounts](Models/docs/CatalogsFeedVideoCounts.md)
         - [org.openapitools.server.api.model.CatalogsFeedsCreateRequest](Models/docs/CatalogsFeedsCreateRequest.md)
         - [org.openapitools.server.api.model.CatalogsFeedsUpdateRequest](Models/docs/CatalogsFeedsUpdateRequest.md)
         - [org.openapitools.server.api.model.CatalogsFormat](Models/docs/CatalogsFormat.md)
         - [org.openapitools.server.api.model.CatalogsHotelAddress](Models/docs/CatalogsHotelAddress.md)
         - [org.openapitools.server.api.model.CatalogsHotelAttributes](Models/docs/CatalogsHotelAttributes.md)
         - [org.openapitools.server.api.model.CatalogsHotelAvailableFilterValues](Models/docs/CatalogsHotelAvailableFilterValues.md)
         - [org.openapitools.server.api.model.CatalogsHotelBatchItem](Models/docs/CatalogsHotelBatchItem.md)
         - [org.openapitools.server.api.model.CatalogsHotelBatchRequest](Models/docs/CatalogsHotelBatchRequest.md)
         - [org.openapitools.server.api.model.CatalogsHotelFeed](Models/docs/CatalogsHotelFeed.md)
         - [org.openapitools.server.api.model.CatalogsHotelFeedsCreateRequest](Models/docs/CatalogsHotelFeedsCreateRequest.md)
         - [org.openapitools.server.api.model.CatalogsHotelFeedsUpdateRequest](Models/docs/CatalogsHotelFeedsUpdateRequest.md)
         - [org.openapitools.server.api.model.CatalogsHotelFilterValuesMap](Models/docs/CatalogsHotelFilterValuesMap.md)
         - [org.openapitools.server.api.model.CatalogsHotelGuestRatings](Models/docs/CatalogsHotelGuestRatings.md)
         - [org.openapitools.server.api.model.CatalogsHotelItemErrorResponse](Models/docs/CatalogsHotelItemErrorResponse.md)
         - [org.openapitools.server.api.model.CatalogsHotelItemResponse](Models/docs/CatalogsHotelItemResponse.md)
         - [org.openapitools.server.api.model.CatalogsHotelItemsBatch](Models/docs/CatalogsHotelItemsBatch.md)
         - [org.openapitools.server.api.model.CatalogsHotelItemsPostFilter](Models/docs/CatalogsHotelItemsPostFilter.md)
         - [org.openapitools.server.api.model.CatalogsHotelListProductsByCatalogBasedFilterRequest](Models/docs/CatalogsHotelListProductsByCatalogBasedFilterRequest.md)
         - [org.openapitools.server.api.model.CatalogsHotelMainImage](Models/docs/CatalogsHotelMainImage.md)
         - [org.openapitools.server.api.model.CatalogsHotelProduct](Models/docs/CatalogsHotelProduct.md)
         - [org.openapitools.server.api.model.CatalogsHotelProductGroup](Models/docs/CatalogsHotelProductGroup.md)
         - [org.openapitools.server.api.model.CatalogsHotelProductGroupCreateRequest](Models/docs/CatalogsHotelProductGroupCreateRequest.md)
         - [org.openapitools.server.api.model.CatalogsHotelProductGroupFilterKeys](Models/docs/CatalogsHotelProductGroupFilterKeys.md)
         - [org.openapitools.server.api.model.CatalogsHotelProductGroupFilters](Models/docs/CatalogsHotelProductGroupFilters.md)
         - [org.openapitools.server.api.model.CatalogsHotelProductGroupFiltersAllOf](Models/docs/CatalogsHotelProductGroupFiltersAllOf.md)
         - [org.openapitools.server.api.model.CatalogsHotelProductGroupFiltersAnyOf](Models/docs/CatalogsHotelProductGroupFiltersAnyOf.md)
         - [org.openapitools.server.api.model.CatalogsHotelProductGroupProductCounts](Models/docs/CatalogsHotelProductGroupProductCounts.md)
         - [org.openapitools.server.api.model.CatalogsHotelProductGroupType](Models/docs/CatalogsHotelProductGroupType.md)
         - [org.openapitools.server.api.model.CatalogsHotelProductGroupUpdateRequest](Models/docs/CatalogsHotelProductGroupUpdateRequest.md)
         - [org.openapitools.server.api.model.CatalogsHotelProductMetadata](Models/docs/CatalogsHotelProductMetadata.md)
         - [org.openapitools.server.api.model.CatalogsHotelReportParameters](Models/docs/CatalogsHotelReportParameters.md)
         - [org.openapitools.server.api.model.CatalogsHotelReportParametersReport](Models/docs/CatalogsHotelReportParametersReport.md)
         - [org.openapitools.server.api.model.CatalogsHotelReportStatsParameters](Models/docs/CatalogsHotelReportStatsParameters.md)
         - [org.openapitools.server.api.model.CatalogsHotelReportStatsParametersReport](Models/docs/CatalogsHotelReportStatsParametersReport.md)
         - [org.openapitools.server.api.model.CatalogsItemValidationDetails](Models/docs/CatalogsItemValidationDetails.md)
         - [org.openapitools.server.api.model.CatalogsItemValidationErrors](Models/docs/CatalogsItemValidationErrors.md)
         - [org.openapitools.server.api.model.CatalogsItemValidationIssue](Models/docs/CatalogsItemValidationIssue.md)
         - [org.openapitools.server.api.model.CatalogsItemValidationIssues](Models/docs/CatalogsItemValidationIssues.md)
         - [org.openapitools.server.api.model.CatalogsItemValidationWarnings](Models/docs/CatalogsItemValidationWarnings.md)
         - [org.openapitools.server.api.model.CatalogsItemsBatch](Models/docs/CatalogsItemsBatch.md)
         - [org.openapitools.server.api.model.CatalogsItemsBatchPostRequest](Models/docs/CatalogsItemsBatchPostRequest.md)
         - [org.openapitools.server.api.model.CatalogsItemsBatchRequest](Models/docs/CatalogsItemsBatchRequest.md)
         - [org.openapitools.server.api.model.CatalogsItemsCreateBatchRequest](Models/docs/CatalogsItemsCreateBatchRequest.md)
         - [org.openapitools.server.api.model.CatalogsItemsDeleteBatchRequest](Models/docs/CatalogsItemsDeleteBatchRequest.md)
         - [org.openapitools.server.api.model.CatalogsItemsDeleteDiscontinuedBatchRequest](Models/docs/CatalogsItemsDeleteDiscontinuedBatchRequest.md)
         - [org.openapitools.server.api.model.CatalogsItemsPostFilters](Models/docs/CatalogsItemsPostFilters.md)
         - [org.openapitools.server.api.model.CatalogsItemsRequest](Models/docs/CatalogsItemsRequest.md)
         - [org.openapitools.server.api.model.CatalogsItemsUpdateBatchRequest](Models/docs/CatalogsItemsUpdateBatchRequest.md)
         - [org.openapitools.server.api.model.CatalogsItemsUpsertBatchRequest](Models/docs/CatalogsItemsUpsertBatchRequest.md)
         - [org.openapitools.server.api.model.CatalogsList200Response](Models/docs/CatalogsList200Response.md)
         - [org.openapitools.server.api.model.CatalogsListProductsByFeedBasedFilter](Models/docs/CatalogsListProductsByFeedBasedFilter.md)
         - [org.openapitools.server.api.model.CatalogsListProductsByFilterRequest](Models/docs/CatalogsListProductsByFilterRequest.md)
         - [org.openapitools.server.api.model.CatalogsLocalStoresCreate200ResponseInner](Models/docs/CatalogsLocalStoresCreate200ResponseInner.md)
         - [org.openapitools.server.api.model.CatalogsLocalStoresCreate200ResponseInnerData](Models/docs/CatalogsLocalStoresCreate200ResponseInnerData.md)
         - [org.openapitools.server.api.model.CatalogsLocalStoresCreate200ResponseInnerDataOneOf](Models/docs/CatalogsLocalStoresCreate200ResponseInnerDataOneOf.md)
         - [org.openapitools.server.api.model.CatalogsLocalStoresDelete200ResponseInner](Models/docs/CatalogsLocalStoresDelete200ResponseInner.md)
         - [org.openapitools.server.api.model.CatalogsLocalStoresList200Response](Models/docs/CatalogsLocalStoresList200Response.md)
         - [org.openapitools.server.api.model.CatalogsLocale](Models/docs/CatalogsLocale.md)
         - [org.openapitools.server.api.model.CatalogsProduct](Models/docs/CatalogsProduct.md)
         - [org.openapitools.server.api.model.CatalogsProductGroupCreateRequest](Models/docs/CatalogsProductGroupCreateRequest.md)
         - [org.openapitools.server.api.model.CatalogsProductGroupCurrencyCriteria](Models/docs/CatalogsProductGroupCurrencyCriteria.md)
         - [org.openapitools.server.api.model.CatalogsProductGroupFilterKeys](Models/docs/CatalogsProductGroupFilterKeys.md)
         - [org.openapitools.server.api.model.CatalogsProductGroupFilterOperatorTypeCriteria](Models/docs/CatalogsProductGroupFilterOperatorTypeCriteria.md)
         - [org.openapitools.server.api.model.CatalogsProductGroupFilters](Models/docs/CatalogsProductGroupFilters.md)
         - [org.openapitools.server.api.model.CatalogsProductGroupFiltersAllOf](Models/docs/CatalogsProductGroupFiltersAllOf.md)
         - [org.openapitools.server.api.model.CatalogsProductGroupFiltersAnyOf](Models/docs/CatalogsProductGroupFiltersAnyOf.md)
         - [org.openapitools.server.api.model.CatalogsProductGroupFiltersRequest](Models/docs/CatalogsProductGroupFiltersRequest.md)
         - [org.openapitools.server.api.model.CatalogsProductGroupFiltersRequestAnyOfItems0](Models/docs/CatalogsProductGroupFiltersRequestAnyOfItems0.md)
         - [org.openapitools.server.api.model.CatalogsProductGroupFiltersRequestAnyOfItems1](Models/docs/CatalogsProductGroupFiltersRequestAnyOfItems1.md)
         - [org.openapitools.server.api.model.CatalogsProductGroupMultipleCountriesCriteria](Models/docs/CatalogsProductGroupMultipleCountriesCriteria.md)
         - [org.openapitools.server.api.model.CatalogsProductGroupMultipleGenderCriteria](Models/docs/CatalogsProductGroupMultipleGenderCriteria.md)
         - [org.openapitools.server.api.model.CatalogsProductGroupMultipleMediaTypesCriteria](Models/docs/CatalogsProductGroupMultipleMediaTypesCriteria.md)
         - [org.openapitools.server.api.model.CatalogsProductGroupMultiplePinterestProductCategoryCriteria](Models/docs/CatalogsProductGroupMultiplePinterestProductCategoryCriteria.md)
         - [org.openapitools.server.api.model.CatalogsProductGroupMultipleStringCriteria](Models/docs/CatalogsProductGroupMultipleStringCriteria.md)
         - [org.openapitools.server.api.model.CatalogsProductGroupMultipleStringListCriteria](Models/docs/CatalogsProductGroupMultipleStringListCriteria.md)
         - [org.openapitools.server.api.model.CatalogsProductGroupPinsList200Response](Models/docs/CatalogsProductGroupPinsList200Response.md)
         - [org.openapitools.server.api.model.CatalogsProductGroupPricingCriteria](Models/docs/CatalogsProductGroupPricingCriteria.md)
         - [org.openapitools.server.api.model.CatalogsProductGroupProductCountsVertical](Models/docs/CatalogsProductGroupProductCountsVertical.md)
         - [org.openapitools.server.api.model.CatalogsProductGroupStatus](Models/docs/CatalogsProductGroupStatus.md)
         - [org.openapitools.server.api.model.CatalogsProductGroupType](Models/docs/CatalogsProductGroupType.md)
         - [org.openapitools.server.api.model.CatalogsProductGroupUint32Criteria](Models/docs/CatalogsProductGroupUint32Criteria.md)
         - [org.openapitools.server.api.model.CatalogsProductGroupUpdateManyRequestItemsOneOfItems0](Models/docs/CatalogsProductGroupUpdateManyRequestItemsOneOfItems0.md)
         - [org.openapitools.server.api.model.CatalogsProductGroupUpdateRequest](Models/docs/CatalogsProductGroupUpdateRequest.md)
         - [org.openapitools.server.api.model.CatalogsProductGroupsCreateManyRequestItems](Models/docs/CatalogsProductGroupsCreateManyRequestItems.md)
         - [org.openapitools.server.api.model.CatalogsProductGroupsCreateRequestSchema](Models/docs/CatalogsProductGroupsCreateRequestSchema.md)
         - [org.openapitools.server.api.model.CatalogsProductGroupsList200Response](Models/docs/CatalogsProductGroupsList200Response.md)
         - [org.openapitools.server.api.model.CatalogsProductGroupsUpdateRequestSchema](Models/docs/CatalogsProductGroupsUpdateRequestSchema.md)
         - [org.openapitools.server.api.model.CatalogsReport](Models/docs/CatalogsReport.md)
         - [org.openapitools.server.api.model.CatalogsReportDistributionIssueFilter](Models/docs/CatalogsReportDistributionIssueFilter.md)
         - [org.openapitools.server.api.model.CatalogsReportDistributionStats](Models/docs/CatalogsReportDistributionStats.md)
         - [org.openapitools.server.api.model.CatalogsReportFeedIngestionFilter](Models/docs/CatalogsReportFeedIngestionFilter.md)
         - [org.openapitools.server.api.model.CatalogsReportFeedIngestionStats](Models/docs/CatalogsReportFeedIngestionStats.md)
         - [org.openapitools.server.api.model.CatalogsReportParameters](Models/docs/CatalogsReportParameters.md)
         - [org.openapitools.server.api.model.CatalogsReportStats](Models/docs/CatalogsReportStats.md)
         - [org.openapitools.server.api.model.CatalogsReportStatsParameters](Models/docs/CatalogsReportStatsParameters.md)
         - [org.openapitools.server.api.model.CatalogsRetailAvailableFilterValues](Models/docs/CatalogsRetailAvailableFilterValues.md)
         - [org.openapitools.server.api.model.CatalogsRetailBatchRequest](Models/docs/CatalogsRetailBatchRequest.md)
         - [org.openapitools.server.api.model.CatalogsRetailBatchRequestItemsItems](Models/docs/CatalogsRetailBatchRequestItemsItems.md)
         - [org.openapitools.server.api.model.CatalogsRetailFeed](Models/docs/CatalogsRetailFeed.md)
         - [org.openapitools.server.api.model.CatalogsRetailFeedsCreateRequest](Models/docs/CatalogsRetailFeedsCreateRequest.md)
         - [org.openapitools.server.api.model.CatalogsRetailFeedsUpdateRequest](Models/docs/CatalogsRetailFeedsUpdateRequest.md)
         - [org.openapitools.server.api.model.CatalogsRetailFilterValuesMap](Models/docs/CatalogsRetailFilterValuesMap.md)
         - [org.openapitools.server.api.model.CatalogsRetailItemErrorResponse](Models/docs/CatalogsRetailItemErrorResponse.md)
         - [org.openapitools.server.api.model.CatalogsRetailItemResponse](Models/docs/CatalogsRetailItemResponse.md)
         - [org.openapitools.server.api.model.CatalogsRetailItemsBatch](Models/docs/CatalogsRetailItemsBatch.md)
         - [org.openapitools.server.api.model.CatalogsRetailItemsPostFilter](Models/docs/CatalogsRetailItemsPostFilter.md)
         - [org.openapitools.server.api.model.CatalogsRetailListProductsByCatalogBasedFilterRequest](Models/docs/CatalogsRetailListProductsByCatalogBasedFilterRequest.md)
         - [org.openapitools.server.api.model.CatalogsRetailProduct](Models/docs/CatalogsRetailProduct.md)
         - [org.openapitools.server.api.model.CatalogsRetailProductGroup](Models/docs/CatalogsRetailProductGroup.md)
         - [org.openapitools.server.api.model.CatalogsRetailProductGroupCreateRequest](Models/docs/CatalogsRetailProductGroupCreateRequest.md)
         - [org.openapitools.server.api.model.CatalogsRetailProductGroupProductCounts](Models/docs/CatalogsRetailProductGroupProductCounts.md)
         - [org.openapitools.server.api.model.CatalogsRetailProductGroupUpdateRequest](Models/docs/CatalogsRetailProductGroupUpdateRequest.md)
         - [org.openapitools.server.api.model.CatalogsRetailProductMetadata](Models/docs/CatalogsRetailProductMetadata.md)
         - [org.openapitools.server.api.model.CatalogsRetailReportAllItemsFilter](Models/docs/CatalogsRetailReportAllItemsFilter.md)
         - [org.openapitools.server.api.model.CatalogsRetailReportParameters](Models/docs/CatalogsRetailReportParameters.md)
         - [org.openapitools.server.api.model.CatalogsRetailReportParametersReport](Models/docs/CatalogsRetailReportParametersReport.md)
         - [org.openapitools.server.api.model.CatalogsRetailReportStatsParameters](Models/docs/CatalogsRetailReportStatsParameters.md)
         - [org.openapitools.server.api.model.CatalogsRetailReportStatsParametersReport](Models/docs/CatalogsRetailReportStatsParametersReport.md)
         - [org.openapitools.server.api.model.CatalogsStatus](Models/docs/CatalogsStatus.md)
         - [org.openapitools.server.api.model.CatalogsType](Models/docs/CatalogsType.md)
         - [org.openapitools.server.api.model.CatalogsUpdatableCreativeAssetsAttributes](Models/docs/CatalogsUpdatableCreativeAssetsAttributes.md)
         - [org.openapitools.server.api.model.CatalogsUpdatableHotelAttributes](Models/docs/CatalogsUpdatableHotelAttributes.md)
         - [org.openapitools.server.api.model.CatalogsUpdateCreativeAssetsItem](Models/docs/CatalogsUpdateCreativeAssetsItem.md)
         - [org.openapitools.server.api.model.CatalogsUpdateHotelItem](Models/docs/CatalogsUpdateHotelItem.md)
         - [org.openapitools.server.api.model.CatalogsUpdateRetailItem](Models/docs/CatalogsUpdateRetailItem.md)
         - [org.openapitools.server.api.model.CatalogsUpsertCreativeAssetsItem](Models/docs/CatalogsUpsertCreativeAssetsItem.md)
         - [org.openapitools.server.api.model.CatalogsUpsertHotelItem](Models/docs/CatalogsUpsertHotelItem.md)
         - [org.openapitools.server.api.model.CatalogsUpsertRetailItem](Models/docs/CatalogsUpsertRetailItem.md)
         - [org.openapitools.server.api.model.CatalogsVerticalBatchRequest](Models/docs/CatalogsVerticalBatchRequest.md)
         - [org.openapitools.server.api.model.CatalogsVerticalFeedsCreateRequest](Models/docs/CatalogsVerticalFeedsCreateRequest.md)
         - [org.openapitools.server.api.model.CatalogsVerticalFeedsUpdateRequest](Models/docs/CatalogsVerticalFeedsUpdateRequest.md)
         - [org.openapitools.server.api.model.CatalogsVerticalProductGroup](Models/docs/CatalogsVerticalProductGroup.md)
         - [org.openapitools.server.api.model.CatalogsVerticalProductGroupCreateRequest](Models/docs/CatalogsVerticalProductGroupCreateRequest.md)
         - [org.openapitools.server.api.model.CatalogsVerticalProductGroupUpdateRequest](Models/docs/CatalogsVerticalProductGroupUpdateRequest.md)
         - [org.openapitools.server.api.model.CatalogsVerticalsListProductsByCatalogBasedFilterRequest](Models/docs/CatalogsVerticalsListProductsByCatalogBasedFilterRequest.md)
         - [org.openapitools.server.api.model.ChangeHistoryDataType](Models/docs/ChangeHistoryDataType.md)
         - [org.openapitools.server.api.model.ChangeHistoryOperationType](Models/docs/ChangeHistoryOperationType.md)
         - [org.openapitools.server.api.model.CollectionsHeaderType](Models/docs/CollectionsHeaderType.md)
         - [org.openapitools.server.api.model.ConditionFilter](Models/docs/ConditionFilter.md)
         - [org.openapitools.server.api.model.ContentType](Models/docs/ContentType.md)
         - [org.openapitools.server.api.model.ConversionAccessToken](Models/docs/ConversionAccessToken.md)
         - [org.openapitools.server.api.model.ConversionApiResponseEventsItems](Models/docs/ConversionApiResponseEventsItems.md)
         - [org.openapitools.server.api.model.ConversionAttributionWindowDays](Models/docs/ConversionAttributionWindowDays.md)
         - [org.openapitools.server.api.model.ConversionDeletionRequest](Models/docs/ConversionDeletionRequest.md)
         - [org.openapitools.server.api.model.ConversionDeletionRequestCreate](Models/docs/ConversionDeletionRequestCreate.md)
         - [org.openapitools.server.api.model.ConversionDeletionRequestEPIKTargets](Models/docs/ConversionDeletionRequestEPIKTargets.md)
         - [org.openapitools.server.api.model.ConversionDeletionRequestList200Response](Models/docs/ConversionDeletionRequestList200Response.md)
         - [org.openapitools.server.api.model.ConversionDeletionRequestStatus](Models/docs/ConversionDeletionRequestStatus.md)
         - [org.openapitools.server.api.model.ConversionDeletionRequestTargets](Models/docs/ConversionDeletionRequestTargets.md)
         - [org.openapitools.server.api.model.ConversionDeletionRequestUserEmailTargets](Models/docs/ConversionDeletionRequestUserEmailTargets.md)
         - [org.openapitools.server.api.model.ConversionEvent](Models/docs/ConversionEvent.md)
         - [org.openapitools.server.api.model.ConversionEventAppInfo](Models/docs/ConversionEventAppInfo.md)
         - [org.openapitools.server.api.model.ConversionEventDeviceInfo](Models/docs/ConversionEventDeviceInfo.md)
         - [org.openapitools.server.api.model.ConversionEventIngestionSource](Models/docs/ConversionEventIngestionSource.md)
         - [org.openapitools.server.api.model.ConversionEventResponse](Models/docs/ConversionEventResponse.md)
         - [org.openapitools.server.api.model.ConversionEvents](Models/docs/ConversionEvents.md)
         - [org.openapitools.server.api.model.ConversionEventsCreate](Models/docs/ConversionEventsCreate.md)
         - [org.openapitools.server.api.model.ConversionEventsDataItems](Models/docs/ConversionEventsDataItems.md)
         - [org.openapitools.server.api.model.ConversionEventsDataItemsCustomData](Models/docs/ConversionEventsDataItemsCustomData.md)
         - [org.openapitools.server.api.model.ConversionEventsDataItemsCustomDataContentsItems](Models/docs/ConversionEventsDataItemsCustomDataContentsItems.md)
         - [org.openapitools.server.api.model.ConversionEventsUserDataProperties](Models/docs/ConversionEventsUserDataProperties.md)
         - [org.openapitools.server.api.model.ConversionHealthSelectionItem](Models/docs/ConversionHealthSelectionItem.md)
         - [org.openapitools.server.api.model.ConversionLearningModeType](Models/docs/ConversionLearningModeType.md)
         - [org.openapitools.server.api.model.ConversionMSOTEventsCreate](Models/docs/ConversionMSOTEventsCreate.md)
         - [org.openapitools.server.api.model.ConversionObjectiveType](Models/docs/ConversionObjectiveType.md)
         - [org.openapitools.server.api.model.ConversionProductAttributionType](Models/docs/ConversionProductAttributionType.md)
         - [org.openapitools.server.api.model.ConversionProductReport](Models/docs/ConversionProductReport.md)
         - [org.openapitools.server.api.model.ConversionProductReportBreakdownType](Models/docs/ConversionProductReportBreakdownType.md)
         - [org.openapitools.server.api.model.ConversionProductReportCreate](Models/docs/ConversionProductReportCreate.md)
         - [org.openapitools.server.api.model.ConversionProductReportGranularity](Models/docs/ConversionProductReportGranularity.md)
         - [org.openapitools.server.api.model.ConversionProductReportLevel](Models/docs/ConversionProductReportLevel.md)
         - [org.openapitools.server.api.model.ConversionProductReportingColumn](Models/docs/ConversionProductReportingColumn.md)
         - [org.openapitools.server.api.model.ConversionReportAttributionType](Models/docs/ConversionReportAttributionType.md)
         - [org.openapitools.server.api.model.ConversionReportTimeType](Models/docs/ConversionReportTimeType.md)
         - [org.openapitools.server.api.model.ConversionTag](Models/docs/ConversionTag.md)
         - [org.openapitools.server.api.model.ConversionTagCommon](Models/docs/ConversionTagCommon.md)
         - [org.openapitools.server.api.model.ConversionTagConfigs](Models/docs/ConversionTagConfigs.md)
         - [org.openapitools.server.api.model.ConversionTagCreate](Models/docs/ConversionTagCreate.md)
         - [org.openapitools.server.api.model.ConversionTagResponse](Models/docs/ConversionTagResponse.md)
         - [org.openapitools.server.api.model.ConversionTagType](Models/docs/ConversionTagType.md)
         - [org.openapitools.server.api.model.ConversionTagTypeOptimal](Models/docs/ConversionTagTypeOptimal.md)
         - [org.openapitools.server.api.model.ConversionTagV3GoalMetadata](Models/docs/ConversionTagV3GoalMetadata.md)
         - [org.openapitools.server.api.model.ConversionTagsList200Response](Models/docs/ConversionTagsList200Response.md)
         - [org.openapitools.server.api.model.Country](Models/docs/Country.md)
         - [org.openapitools.server.api.model.CountryFilter](Models/docs/CountryFilter.md)
         - [org.openapitools.server.api.model.CreateAssetAccessRequestBody](Models/docs/CreateAssetAccessRequestBody.md)
         - [org.openapitools.server.api.model.CreateAssetAccessRequestItem](Models/docs/CreateAssetAccessRequestItem.md)
         - [org.openapitools.server.api.model.CreateAssetAccessRequestResponse](Models/docs/CreateAssetAccessRequestResponse.md)
         - [org.openapitools.server.api.model.CreateAssetInvitesRequest](Models/docs/CreateAssetInvitesRequest.md)
         - [org.openapitools.server.api.model.CreateAssetInvitesRequestItem](Models/docs/CreateAssetInvitesRequestItem.md)
         - [org.openapitools.server.api.model.CreateInvitesResultsResponseArray](Models/docs/CreateInvitesResultsResponseArray.md)
         - [org.openapitools.server.api.model.CreateMembershipOrPartnershipInvitesBody](Models/docs/CreateMembershipOrPartnershipInvitesBody.md)
         - [org.openapitools.server.api.model.CreationSource](Models/docs/CreationSource.md)
         - [org.openapitools.server.api.model.CreativeAssetsIdFilter](Models/docs/CreativeAssetsIdFilter.md)
         - [org.openapitools.server.api.model.CreativeAssetsProcessingRecord](Models/docs/CreativeAssetsProcessingRecord.md)
         - [org.openapitools.server.api.model.CreativeAssetsVisibilityType](Models/docs/CreativeAssetsVisibilityType.md)
         - [org.openapitools.server.api.model.CreativeType](Models/docs/CreativeType.md)
         - [org.openapitools.server.api.model.Currency](Models/docs/Currency.md)
         - [org.openapitools.server.api.model.CurrencyFilter](Models/docs/CurrencyFilter.md)
         - [org.openapitools.server.api.model.CustomConversionEventMetrics](Models/docs/CustomConversionEventMetrics.md)
         - [org.openapitools.server.api.model.CustomLabel0Filter](Models/docs/CustomLabel0Filter.md)
         - [org.openapitools.server.api.model.CustomLabel1Filter](Models/docs/CustomLabel1Filter.md)
         - [org.openapitools.server.api.model.CustomLabel2Filter](Models/docs/CustomLabel2Filter.md)
         - [org.openapitools.server.api.model.CustomLabel3Filter](Models/docs/CustomLabel3Filter.md)
         - [org.openapitools.server.api.model.CustomLabel4Filter](Models/docs/CustomLabel4Filter.md)
         - [org.openapitools.server.api.model.CustomNumber0Filter](Models/docs/CustomNumber0Filter.md)
         - [org.openapitools.server.api.model.CustomNumber1Filter](Models/docs/CustomNumber1Filter.md)
         - [org.openapitools.server.api.model.CustomNumber2Filter](Models/docs/CustomNumber2Filter.md)
         - [org.openapitools.server.api.model.CustomNumber3Filter](Models/docs/CustomNumber3Filter.md)
         - [org.openapitools.server.api.model.CustomNumber4Filter](Models/docs/CustomNumber4Filter.md)
         - [org.openapitools.server.api.model.CustomerList](Models/docs/CustomerList.md)
         - [org.openapitools.server.api.model.CustomerListCreate](Models/docs/CustomerListCreate.md)
         - [org.openapitools.server.api.model.CustomerListRecordRow](Models/docs/CustomerListRecordRow.md)
         - [org.openapitools.server.api.model.CustomerListStatus](Models/docs/CustomerListStatus.md)
         - [org.openapitools.server.api.model.CustomerListUpdateWithRequiredBody](Models/docs/CustomerListUpdateWithRequiredBody.md)
         - [org.openapitools.server.api.model.CustomerListUpload](Models/docs/CustomerListUpload.md)
         - [org.openapitools.server.api.model.CustomerListUploadCreateRequest](Models/docs/CustomerListUploadCreateRequest.md)
         - [org.openapitools.server.api.model.CustomerListUploadCreateResponse](Models/docs/CustomerListUploadCreateResponse.md)
         - [org.openapitools.server.api.model.CustomerListsList200Response](Models/docs/CustomerListsList200Response.md)
         - [org.openapitools.server.api.model.CustomerSegment](Models/docs/CustomerSegment.md)
         - [org.openapitools.server.api.model.CustomerSegmentCreate](Models/docs/CustomerSegmentCreate.md)
         - [org.openapitools.server.api.model.CustomerSegmentList200Response](Models/docs/CustomerSegmentList200Response.md)
         - [org.openapitools.server.api.model.CustomerSegmentUpdateRequestUpdateWithRequiredBody](Models/docs/CustomerSegmentUpdateRequestUpdateWithRequiredBody.md)
         - [org.openapitools.server.api.model.CustomizableCTAType](Models/docs/CustomizableCTAType.md)
         - [org.openapitools.server.api.model.DataOutputFormat](Models/docs/DataOutputFormat.md)
         - [org.openapitools.server.api.model.DataStatus](Models/docs/DataStatus.md)
         - [org.openapitools.server.api.model.DeleteBusinessMembership200Response](Models/docs/DeleteBusinessMembership200Response.md)
         - [org.openapitools.server.api.model.DeleteBusinessMembershipBody](Models/docs/DeleteBusinessMembershipBody.md)
         - [org.openapitools.server.api.model.DeleteBusinessMembershipMember](Models/docs/DeleteBusinessMembershipMember.md)
         - [org.openapitools.server.api.model.DeleteBusinessPartners](Models/docs/DeleteBusinessPartners.md)
         - [org.openapitools.server.api.model.DeleteBusinessPartnersDelete](Models/docs/DeleteBusinessPartnersDelete.md)
         - [org.openapitools.server.api.model.DeleteMemberAccessResult](Models/docs/DeleteMemberAccessResult.md)
         - [org.openapitools.server.api.model.DeleteMemberAccessResultsResponseArray](Models/docs/DeleteMemberAccessResultsResponseArray.md)
         - [org.openapitools.server.api.model.DeleteMemberAssetAccessItem](Models/docs/DeleteMemberAssetAccessItem.md)
         - [org.openapitools.server.api.model.DeletePartnerAssetAccessBody](Models/docs/DeletePartnerAssetAccessBody.md)
         - [org.openapitools.server.api.model.DeletePartnerAssetAccessItem](Models/docs/DeletePartnerAssetAccessItem.md)
         - [org.openapitools.server.api.model.DeletePartnerAssetAccessResult](Models/docs/DeletePartnerAssetAccessResult.md)
         - [org.openapitools.server.api.model.DeletePartnerAssetAccessResultsResponseArray](Models/docs/DeletePartnerAssetAccessResultsResponseArray.md)
         - [org.openapitools.server.api.model.DeliveryEstimateObjectiveType](Models/docs/DeliveryEstimateObjectiveType.md)
         - [org.openapitools.server.api.model.DeliveryMetricsGet200Response](Models/docs/DeliveryMetricsGet200Response.md)
         - [org.openapitools.server.api.model.DeliveryMetricsResponseItemsItems](Models/docs/DeliveryMetricsResponseItemsItems.md)
         - [org.openapitools.server.api.model.DetailedError](Models/docs/DetailedError.md)
         - [org.openapitools.server.api.model.DisclosureType](Models/docs/DisclosureType.md)
         - [org.openapitools.server.api.model.DiscountStatus](Models/docs/DiscountStatus.md)
         - [org.openapitools.server.api.model.DynamicTitlesDownloadCSV](Models/docs/DynamicTitlesDownloadCSV.md)
         - [org.openapitools.server.api.model.DynamicTitlesGetStatus](Models/docs/DynamicTitlesGetStatus.md)
         - [org.openapitools.server.api.model.DynamicTitlesProcessCSV](Models/docs/DynamicTitlesProcessCSV.md)
         - [org.openapitools.server.api.model.DynamicTitlesProcessCSVCreate](Models/docs/DynamicTitlesProcessCSVCreate.md)
         - [org.openapitools.server.api.model.DynamicTitlesProcessCSVError](Models/docs/DynamicTitlesProcessCSVError.md)
         - [org.openapitools.server.api.model.DynamicTitlesUploadURL](Models/docs/DynamicTitlesUploadURL.md)
         - [org.openapitools.server.api.model.EnhancedMatchStatusType](Models/docs/EnhancedMatchStatusType.md)
         - [org.openapitools.server.api.model.EntityDataChangeHistory](Models/docs/EntityDataChangeHistory.md)
         - [org.openapitools.server.api.model.EntityHistory](Models/docs/EntityHistory.md)
         - [org.openapitools.server.api.model.EntityLabel](Models/docs/EntityLabel.md)
         - [org.openapitools.server.api.model.EntityLabelError](Models/docs/EntityLabelError.md)
         - [org.openapitools.server.api.model.EntityLabelStatus](Models/docs/EntityLabelStatus.md)
         - [org.openapitools.server.api.model.EntityStatus](Models/docs/EntityStatus.md)
         - [org.openapitools.server.api.model.ErrorDetail](Models/docs/ErrorDetail.md)
         - [org.openapitools.server.api.model.EventData](Models/docs/EventData.md)
         - [org.openapitools.server.api.model.EventProcessingStatus](Models/docs/EventProcessingStatus.md)
         - [org.openapitools.server.api.model.EventQualityScore](Models/docs/EventQualityScore.md)
         - [org.openapitools.server.api.model.Exception](Models/docs/Exception.md)
         - [org.openapitools.server.api.model.FeaturedTrend](Models/docs/FeaturedTrend.md)
         - [org.openapitools.server.api.model.FeedProcessingResultsList200Response](Models/docs/FeedProcessingResultsList200Response.md)
         - [org.openapitools.server.api.model.FeedsList200Response](Models/docs/FeedsList200Response.md)
         - [org.openapitools.server.api.model.FilterOperatorType](Models/docs/FilterOperatorType.md)
         - [org.openapitools.server.api.model.FollowUser](Models/docs/FollowUser.md)
         - [org.openapitools.server.api.model.FollowUserCreate](Models/docs/FollowUserCreate.md)
         - [org.openapitools.server.api.model.FollowersList200Response](Models/docs/FollowersList200Response.md)
         - [org.openapitools.server.api.model.FormFactor](Models/docs/FormFactor.md)
         - [org.openapitools.server.api.model.FreqBidMultiplierTimeWindow](Models/docs/FreqBidMultiplierTimeWindow.md)
         - [org.openapitools.server.api.model.FrequencyGoalMetadata](Models/docs/FrequencyGoalMetadata.md)
         - [org.openapitools.server.api.model.FrequencyGoalMetadataTimerange](Models/docs/FrequencyGoalMetadataTimerange.md)
         - [org.openapitools.server.api.model.FrequencyMultipliers](Models/docs/FrequencyMultipliers.md)
         - [org.openapitools.server.api.model.Gender](Models/docs/Gender.md)
         - [org.openapitools.server.api.model.GenderBucket](Models/docs/GenderBucket.md)
         - [org.openapitools.server.api.model.GenderDemographics](Models/docs/GenderDemographics.md)
         - [org.openapitools.server.api.model.GenderFilter](Models/docs/GenderFilter.md)
         - [org.openapitools.server.api.model.GenderMultipliers](Models/docs/GenderMultipliers.md)
         - [org.openapitools.server.api.model.GetBusinessEmployers200Response](Models/docs/GetBusinessEmployers200Response.md)
         - [org.openapitools.server.api.model.GetInvites200Response](Models/docs/GetInvites200Response.md)
         - [org.openapitools.server.api.model.GoogleProductCategory0Filter](Models/docs/GoogleProductCategory0Filter.md)
         - [org.openapitools.server.api.model.GoogleProductCategory1Filter](Models/docs/GoogleProductCategory1Filter.md)
         - [org.openapitools.server.api.model.GoogleProductCategory2Filter](Models/docs/GoogleProductCategory2Filter.md)
         - [org.openapitools.server.api.model.GoogleProductCategory3Filter](Models/docs/GoogleProductCategory3Filter.md)
         - [org.openapitools.server.api.model.GoogleProductCategory4Filter](Models/docs/GoogleProductCategory4Filter.md)
         - [org.openapitools.server.api.model.GoogleProductCategory5Filter](Models/docs/GoogleProductCategory5Filter.md)
         - [org.openapitools.server.api.model.GoogleProductCategory6Filter](Models/docs/GoogleProductCategory6Filter.md)
         - [org.openapitools.server.api.model.Granularity](Models/docs/Granularity.md)
         - [org.openapitools.server.api.model.GridClickType](Models/docs/GridClickType.md)
         - [org.openapitools.server.api.model.HotelIdFilter](Models/docs/HotelIdFilter.md)
         - [org.openapitools.server.api.model.HotelProcessingRecord](Models/docs/HotelProcessingRecord.md)
         - [org.openapitools.server.api.model.HttpMethod](Models/docs/HttpMethod.md)
         - [org.openapitools.server.api.model.ImageDetails](Models/docs/ImageDetails.md)
         - [org.openapitools.server.api.model.ImageMetadata](Models/docs/ImageMetadata.md)
         - [org.openapitools.server.api.model.ImageSize](Models/docs/ImageSize.md)
         - [org.openapitools.server.api.model.IneligibleProductTagErrorItem](Models/docs/IneligibleProductTagErrorItem.md)
         - [org.openapitools.server.api.model.IneligibleProductTagReason](Models/docs/IneligibleProductTagReason.md)
         - [org.openapitools.server.api.model.IneligibleProductTagsErrorDetails](Models/docs/IneligibleProductTagsErrorDetails.md)
         - [org.openapitools.server.api.model.IngestionSource](Models/docs/IngestionSource.md)
         - [org.openapitools.server.api.model.IngestionSourceOptions](Models/docs/IngestionSourceOptions.md)
         - [org.openapitools.server.api.model.InnerProductCategoriesMetricsHighlights](Models/docs/InnerProductCategoriesMetricsHighlights.md)
         - [org.openapitools.server.api.model.IntegrationLog](Models/docs/IntegrationLog.md)
         - [org.openapitools.server.api.model.IntegrationLogClientError](Models/docs/IntegrationLogClientError.md)
         - [org.openapitools.server.api.model.IntegrationLogClientRequest](Models/docs/IntegrationLogClientRequest.md)
         - [org.openapitools.server.api.model.IntegrationLogEventType](Models/docs/IntegrationLogEventType.md)
         - [org.openapitools.server.api.model.IntegrationLogLevel](Models/docs/IntegrationLogLevel.md)
         - [org.openapitools.server.api.model.IntegrationLogsInvalidLogResponse](Models/docs/IntegrationLogsInvalidLogResponse.md)
         - [org.openapitools.server.api.model.IntegrationLogsInvalidLogResponseRejectedLogsItems](Models/docs/IntegrationLogsInvalidLogResponseRejectedLogsItems.md)
         - [org.openapitools.server.api.model.IntegrationLogsRequestCreate](Models/docs/IntegrationLogsRequestCreate.md)
         - [org.openapitools.server.api.model.IntegrationLogsSuccessResponse](Models/docs/IntegrationLogsSuccessResponse.md)
         - [org.openapitools.server.api.model.IntegrationMetadata](Models/docs/IntegrationMetadata.md)
         - [org.openapitools.server.api.model.IntegrationMetadataCreate](Models/docs/IntegrationMetadataCreate.md)
         - [org.openapitools.server.api.model.IntegrationMetadataUpdate](Models/docs/IntegrationMetadataUpdate.md)
         - [org.openapitools.server.api.model.IntegrationRecord](Models/docs/IntegrationRecord.md)
         - [org.openapitools.server.api.model.IntegrationsGetList200Response](Models/docs/IntegrationsGetList200Response.md)
         - [org.openapitools.server.api.model.IntendedPromotionType](Models/docs/IntendedPromotionType.md)
         - [org.openapitools.server.api.model.Interest](Models/docs/Interest.md)
         - [org.openapitools.server.api.model.InterestsEnum](Models/docs/InterestsEnum.md)
         - [org.openapitools.server.api.model.InviteActionResultItem](Models/docs/InviteActionResultItem.md)
         - [org.openapitools.server.api.model.InviteAssetsSummary](Models/docs/InviteAssetsSummary.md)
         - [org.openapitools.server.api.model.InviteAssetsSummaryItem](Models/docs/InviteAssetsSummaryItem.md)
         - [org.openapitools.server.api.model.InviteBusinessRoleBinding](Models/docs/InviteBusinessRoleBinding.md)
         - [org.openapitools.server.api.model.InviteDataResponse](Models/docs/InviteDataResponse.md)
         - [org.openapitools.server.api.model.InviteExceptionResponse](Models/docs/InviteExceptionResponse.md)
         - [org.openapitools.server.api.model.InviteFilterStatus](Models/docs/InviteFilterStatus.md)
         - [org.openapitools.server.api.model.InviteResponse](Models/docs/InviteResponse.md)
         - [org.openapitools.server.api.model.InviteStatus](Models/docs/InviteStatus.md)
         - [org.openapitools.server.api.model.InviteType](Models/docs/InviteType.md)
         - [org.openapitools.server.api.model.ItemAttributes](Models/docs/ItemAttributes.md)
         - [org.openapitools.server.api.model.ItemAttributesRequest](Models/docs/ItemAttributesRequest.md)
         - [org.openapitools.server.api.model.ItemAttributesRequestImageLink](Models/docs/ItemAttributesRequestImageLink.md)
         - [org.openapitools.server.api.model.ItemAvailability](Models/docs/ItemAvailability.md)
         - [org.openapitools.server.api.model.ItemCreateBatchRecord](Models/docs/ItemCreateBatchRecord.md)
         - [org.openapitools.server.api.model.ItemDeleteBatchRecord](Models/docs/ItemDeleteBatchRecord.md)
         - [org.openapitools.server.api.model.ItemDeleteDiscontinuedBatchRecord](Models/docs/ItemDeleteDiscontinuedBatchRecord.md)
         - [org.openapitools.server.api.model.ItemGroupIdFilter](Models/docs/ItemGroupIdFilter.md)
         - [org.openapitools.server.api.model.ItemIdFilter](Models/docs/ItemIdFilter.md)
         - [org.openapitools.server.api.model.ItemIdStoreCodePair](Models/docs/ItemIdStoreCodePair.md)
         - [org.openapitools.server.api.model.ItemProcessingRecord](Models/docs/ItemProcessingRecord.md)
         - [org.openapitools.server.api.model.ItemProcessingStatus](Models/docs/ItemProcessingStatus.md)
         - [org.openapitools.server.api.model.ItemResponse](Models/docs/ItemResponse.md)
         - [org.openapitools.server.api.model.ItemUpdateBatchRecord](Models/docs/ItemUpdateBatchRecord.md)
         - [org.openapitools.server.api.model.ItemUpsertBatchRecord](Models/docs/ItemUpsertBatchRecord.md)
         - [org.openapitools.server.api.model.ItemValidationEvent](Models/docs/ItemValidationEvent.md)
         - [org.openapitools.server.api.model.ItemsIssuesList200Response](Models/docs/ItemsIssuesList200Response.md)
         - [org.openapitools.server.api.model.ItemsPost200Response](Models/docs/ItemsPost200Response.md)
         - [org.openapitools.server.api.model.Keyword](Models/docs/Keyword.md)
         - [org.openapitools.server.api.model.KeywordCreateItem](Models/docs/KeywordCreateItem.md)
         - [org.openapitools.server.api.model.KeywordError](Models/docs/KeywordError.md)
         - [org.openapitools.server.api.model.KeywordInfo](Models/docs/KeywordInfo.md)
         - [org.openapitools.server.api.model.KeywordMetrics](Models/docs/KeywordMetrics.md)
         - [org.openapitools.server.api.model.KeywordMetricsResponse](Models/docs/KeywordMetricsResponse.md)
         - [org.openapitools.server.api.model.KeywordUpdateGenerated](Models/docs/KeywordUpdateGenerated.md)
         - [org.openapitools.server.api.model.KeywordUpdateItem](Models/docs/KeywordUpdateItem.md)
         - [org.openapitools.server.api.model.Keywords](Models/docs/Keywords.md)
         - [org.openapitools.server.api.model.KeywordsCommon](Models/docs/KeywordsCommon.md)
         - [org.openapitools.server.api.model.KeywordsCreate](Models/docs/KeywordsCreate.md)
         - [org.openapitools.server.api.model.KeywordsGet200Response](Models/docs/KeywordsGet200Response.md)
         - [org.openapitools.server.api.model.KeywordsMetricsArrayResponse](Models/docs/KeywordsMetricsArrayResponse.md)
         - [org.openapitools.server.api.model.KeywordsRequest](Models/docs/KeywordsRequest.md)
         - [org.openapitools.server.api.model.KeywordsUpdate](Models/docs/KeywordsUpdate.md)
         - [org.openapitools.server.api.model.Label](Models/docs/Label.md)
         - [org.openapitools.server.api.model.LabelBulkCreateRequest](Models/docs/LabelBulkCreateRequest.md)
         - [org.openapitools.server.api.model.LabelBulkUpdateRequest](Models/docs/LabelBulkUpdateRequest.md)
         - [org.openapitools.server.api.model.LabelCreateItem](Models/docs/LabelCreateItem.md)
         - [org.openapitools.server.api.model.LabelCreateRequest](Models/docs/LabelCreateRequest.md)
         - [org.openapitools.server.api.model.LabelError](Models/docs/LabelError.md)
         - [org.openapitools.server.api.model.LabelErrorData](Models/docs/LabelErrorData.md)
         - [org.openapitools.server.api.model.LabelParentType](Models/docs/LabelParentType.md)
         - [org.openapitools.server.api.model.LabelStatus](Models/docs/LabelStatus.md)
         - [org.openapitools.server.api.model.LabelStatusBulkUpdate](Models/docs/LabelStatusBulkUpdate.md)
         - [org.openapitools.server.api.model.LabelType](Models/docs/LabelType.md)
         - [org.openapitools.server.api.model.LabelUpdateItem](Models/docs/LabelUpdateItem.md)
         - [org.openapitools.server.api.model.LabelUpdateRequest](Models/docs/LabelUpdateRequest.md)
         - [org.openapitools.server.api.model.LabeledEntities](Models/docs/LabeledEntities.md)
         - [org.openapitools.server.api.model.LabeledEntitiesCreate](Models/docs/LabeledEntitiesCreate.md)
         - [org.openapitools.server.api.model.LabelsList200Response](Models/docs/LabelsList200Response.md)
         - [org.openapitools.server.api.model.LabelsResponse](Models/docs/LabelsResponse.md)
         - [org.openapitools.server.api.model.Language](Models/docs/Language.md)
         - [org.openapitools.server.api.model.LeadForm](Models/docs/LeadForm.md)
         - [org.openapitools.server.api.model.LeadFormBatchUpdate](Models/docs/LeadFormBatchUpdate.md)
         - [org.openapitools.server.api.model.LeadFormCreate](Models/docs/LeadFormCreate.md)
         - [org.openapitools.server.api.model.LeadFormPolicyLink](Models/docs/LeadFormPolicyLink.md)
         - [org.openapitools.server.api.model.LeadFormQuestion](Models/docs/LeadFormQuestion.md)
         - [org.openapitools.server.api.model.LeadFormQuestionFieldType](Models/docs/LeadFormQuestionFieldType.md)
         - [org.openapitools.server.api.model.LeadFormQuestionType](Models/docs/LeadFormQuestionType.md)
         - [org.openapitools.server.api.model.LeadFormStatus](Models/docs/LeadFormStatus.md)
         - [org.openapitools.server.api.model.LeadFormTest](Models/docs/LeadFormTest.md)
         - [org.openapitools.server.api.model.LeadFormTestCreate](Models/docs/LeadFormTestCreate.md)
         - [org.openapitools.server.api.model.LeadFormsCreate200Response](Models/docs/LeadFormsCreate200Response.md)
         - [org.openapitools.server.api.model.LeadFormsCreate200ResponseItemsInner](Models/docs/LeadFormsCreate200ResponseItemsInner.md)
         - [org.openapitools.server.api.model.LeadFormsList200Response](Models/docs/LeadFormsList200Response.md)
         - [org.openapitools.server.api.model.LeadSubscription](Models/docs/LeadSubscription.md)
         - [org.openapitools.server.api.model.LeadSubscriptionCreate](Models/docs/LeadSubscriptionCreate.md)
         - [org.openapitools.server.api.model.LeadSubscriptionPostParams](Models/docs/LeadSubscriptionPostParams.md)
         - [org.openapitools.server.api.model.LeadSubscriptionPostParamsCreate](Models/docs/LeadSubscriptionPostParamsCreate.md)
         - [org.openapitools.server.api.model.LeadsExportResponseData](Models/docs/LeadsExportResponseData.md)
         - [org.openapitools.server.api.model.LeadsExportStatus](Models/docs/LeadsExportStatus.md)
         - [org.openapitools.server.api.model.LeadsExports](Models/docs/LeadsExports.md)
         - [org.openapitools.server.api.model.LeadsExportsCreate](Models/docs/LeadsExportsCreate.md)
         - [org.openapitools.server.api.model.LineItem](Models/docs/LineItem.md)
         - [org.openapitools.server.api.model.LinkFilter](Models/docs/LinkFilter.md)
         - [org.openapitools.server.api.model.LinkedBusiness](Models/docs/LinkedBusiness.md)
         - [org.openapitools.server.api.model.LocalInventoryCreateOperation](Models/docs/LocalInventoryCreateOperation.md)
         - [org.openapitools.server.api.model.LocalInventoryDeleteOperation](Models/docs/LocalInventoryDeleteOperation.md)
         - [org.openapitools.server.api.model.LocalInventoryItemResponse](Models/docs/LocalInventoryItemResponse.md)
         - [org.openapitools.server.api.model.LocalInventoryItemsBatch](Models/docs/LocalInventoryItemsBatch.md)
         - [org.openapitools.server.api.model.LocalInventoryItemsBatchCreate](Models/docs/LocalInventoryItemsBatchCreate.md)
         - [org.openapitools.server.api.model.LocalInventoryItemsGet](Models/docs/LocalInventoryItemsGet.md)
         - [org.openapitools.server.api.model.LocalInventoryItemsGetCreate](Models/docs/LocalInventoryItemsGetCreate.md)
         - [org.openapitools.server.api.model.LocalInventoryOperation](Models/docs/LocalInventoryOperation.md)
         - [org.openapitools.server.api.model.LocalInventoryOperationResult](Models/docs/LocalInventoryOperationResult.md)
         - [org.openapitools.server.api.model.LocalInventoryUpdateOperation](Models/docs/LocalInventoryUpdateOperation.md)
         - [org.openapitools.server.api.model.LocalInventoryUpsertOperation](Models/docs/LocalInventoryUpsertOperation.md)
         - [org.openapitools.server.api.model.LocalStore](Models/docs/LocalStore.md)
         - [org.openapitools.server.api.model.LocalStoreBatchUpdate](Models/docs/LocalStoreBatchUpdate.md)
         - [org.openapitools.server.api.model.LocalStoreCreate](Models/docs/LocalStoreCreate.md)
         - [org.openapitools.server.api.model.LookbackPeriodOptions](Models/docs/LookbackPeriodOptions.md)
         - [org.openapitools.server.api.model.MMMReport](Models/docs/MMMReport.md)
         - [org.openapitools.server.api.model.MMMReportCreate](Models/docs/MMMReportCreate.md)
         - [org.openapitools.server.api.model.MMMReportGranularity](Models/docs/MMMReportGranularity.md)
         - [org.openapitools.server.api.model.MMMReportLevel](Models/docs/MMMReportLevel.md)
         - [org.openapitools.server.api.model.MMMReportingColumn](Models/docs/MMMReportingColumn.md)
         - [org.openapitools.server.api.model.MMMReportingTargetingType](Models/docs/MMMReportingTargetingType.md)
         - [org.openapitools.server.api.model.MatchType](Models/docs/MatchType.md)
         - [org.openapitools.server.api.model.MatchTypeResponse](Models/docs/MatchTypeResponse.md)
         - [org.openapitools.server.api.model.MaxPriceFilter](Models/docs/MaxPriceFilter.md)
         - [org.openapitools.server.api.model.Media](Models/docs/Media.md)
         - [org.openapitools.server.api.model.MediaList200Response](Models/docs/MediaList200Response.md)
         - [org.openapitools.server.api.model.MediaType](Models/docs/MediaType.md)
         - [org.openapitools.server.api.model.MediaTypeFilter](Models/docs/MediaTypeFilter.md)
         - [org.openapitools.server.api.model.MediaUpload](Models/docs/MediaUpload.md)
         - [org.openapitools.server.api.model.MediaUploadCreate](Models/docs/MediaUploadCreate.md)
         - [org.openapitools.server.api.model.MediaUploadParameters](Models/docs/MediaUploadParameters.md)
         - [org.openapitools.server.api.model.MediaUploadStatus](Models/docs/MediaUploadStatus.md)
         - [org.openapitools.server.api.model.MediaUploadType](Models/docs/MediaUploadType.md)
         - [org.openapitools.server.api.model.MemberBusinessRole](Models/docs/MemberBusinessRole.md)
         - [org.openapitools.server.api.model.MetricsReportingLevel](Models/docs/MetricsReportingLevel.md)
         - [org.openapitools.server.api.model.MetricsReportingTemplateType](Models/docs/MetricsReportingTemplateType.md)
         - [org.openapitools.server.api.model.MetricsResponse](Models/docs/MetricsResponse.md)
         - [org.openapitools.server.api.model.MetricsResponseDataItems](Models/docs/MetricsResponseDataItems.md)
         - [org.openapitools.server.api.model.MinPriceFilter](Models/docs/MinPriceFilter.md)
         - [org.openapitools.server.api.model.MobileAppPlatform](Models/docs/MobileAppPlatform.md)
         - [org.openapitools.server.api.model.MsotEventName](Models/docs/MsotEventName.md)
         - [org.openapitools.server.api.model.MultiPinsAnalyticsMetricTypesItem](Models/docs/MultiPinsAnalyticsMetricTypesItem.md)
         - [org.openapitools.server.api.model.NetworkType](Models/docs/NetworkType.md)
         - [org.openapitools.server.api.model.NonDraftEntityStatus](Models/docs/NonDraftEntityStatus.md)
         - [org.openapitools.server.api.model.NonNullableCatalogsCurrency](Models/docs/NonNullableCatalogsCurrency.md)
         - [org.openapitools.server.api.model.NotificationPostRequest](Models/docs/NotificationPostRequest.md)
         - [org.openapitools.server.api.model.NotificationResponse](Models/docs/NotificationResponse.md)
         - [org.openapitools.server.api.model.NullableCatalogsItemFieldType](Models/docs/NullableCatalogsItemFieldType.md)
         - [org.openapitools.server.api.model.NullableCurrency](Models/docs/NullableCurrency.md)
         - [org.openapitools.server.api.model.NullableEntityStatus](Models/docs/NullableEntityStatus.md)
         - [org.openapitools.server.api.model.NullableLabelStatus](Models/docs/NullableLabelStatus.md)
         - [org.openapitools.server.api.model.NullableLabelType](Models/docs/NullableLabelType.md)
         - [org.openapitools.server.api.model.NullableOptimizationGoalMetadata](Models/docs/NullableOptimizationGoalMetadata.md)
         - [org.openapitools.server.api.model.NullablePartnerType](Models/docs/NullablePartnerType.md)
         - [org.openapitools.server.api.model.NullalbleMatchType](Models/docs/NullalbleMatchType.md)
         - [org.openapitools.server.api.model.NumericFilterOperatorType](Models/docs/NumericFilterOperatorType.md)
         - [org.openapitools.server.api.model.OauthAccessToken](Models/docs/OauthAccessToken.md)
         - [org.openapitools.server.api.model.ObjectiveType](Models/docs/ObjectiveType.md)
         - [org.openapitools.server.api.model.OperationType](Models/docs/OperationType.md)
         - [org.openapitools.server.api.model.OptimizationGoalMetadata](Models/docs/OptimizationGoalMetadata.md)
         - [org.openapitools.server.api.model.OptimizationType](Models/docs/OptimizationType.md)
         - [org.openapitools.server.api.model.Order](Models/docs/Order.md)
         - [org.openapitools.server.api.model.OrderLine](Models/docs/OrderLine.md)
         - [org.openapitools.server.api.model.OrderLineMutationError](Models/docs/OrderLineMutationError.md)
         - [org.openapitools.server.api.model.OrderLineMutationResponse](Models/docs/OrderLineMutationResponse.md)
         - [org.openapitools.server.api.model.OrderLineMutationResult](Models/docs/OrderLineMutationResult.md)
         - [org.openapitools.server.api.model.OrderLinePaidType](Models/docs/OrderLinePaidType.md)
         - [org.openapitools.server.api.model.OrderLineStatus](Models/docs/OrderLineStatus.md)
         - [org.openapitools.server.api.model.OrderLinesList200Response](Models/docs/OrderLinesList200Response.md)
         - [org.openapitools.server.api.model.OsFamily](Models/docs/OsFamily.md)
         - [org.openapitools.server.api.model.OverallStatusOptions](Models/docs/OverallStatusOptions.md)
         - [org.openapitools.server.api.model.PacingDeliveryType](Models/docs/PacingDeliveryType.md)
         - [org.openapitools.server.api.model.PageVisitConversionTagsGet200Response](Models/docs/PageVisitConversionTagsGet200Response.md)
         - [org.openapitools.server.api.model.PartnerMetadata](Models/docs/PartnerMetadata.md)
         - [org.openapitools.server.api.model.PartnerType](Models/docs/PartnerType.md)
         - [org.openapitools.server.api.model.PerformancePlusCampaignSettings](Models/docs/PerformancePlusCampaignSettings.md)
         - [org.openapitools.server.api.model.Permissions](Models/docs/Permissions.md)
         - [org.openapitools.server.api.model.PermissionsWithOwner](Models/docs/PermissionsWithOwner.md)
         - [org.openapitools.server.api.model.Pin](Models/docs/Pin.md)
         - [org.openapitools.server.api.model.PinAnalyticsDailyMetrics](Models/docs/PinAnalyticsDailyMetrics.md)
         - [org.openapitools.server.api.model.PinAnalyticsMetricsResponse](Models/docs/PinAnalyticsMetricsResponse.md)
         - [org.openapitools.server.api.model.PinBase](Models/docs/PinBase.md)
         - [org.openapitools.server.api.model.PinCreate](Models/docs/PinCreate.md)
         - [org.openapitools.server.api.model.PinFilter](Models/docs/PinFilter.md)
         - [org.openapitools.server.api.model.PinMedia](Models/docs/PinMedia.md)
         - [org.openapitools.server.api.model.PinMediaMetadata](Models/docs/PinMediaMetadata.md)
         - [org.openapitools.server.api.model.PinMediaSource](Models/docs/PinMediaSource.md)
         - [org.openapitools.server.api.model.PinMediaSourceImageBase64](Models/docs/PinMediaSourceImageBase64.md)
         - [org.openapitools.server.api.model.PinMediaSourceImageURL](Models/docs/PinMediaSourceImageURL.md)
         - [org.openapitools.server.api.model.PinMediaSourceImagesBase64](Models/docs/PinMediaSourceImagesBase64.md)
         - [org.openapitools.server.api.model.PinMediaSourceImagesBase64Item](Models/docs/PinMediaSourceImagesBase64Item.md)
         - [org.openapitools.server.api.model.PinMediaSourceImagesURL](Models/docs/PinMediaSourceImagesURL.md)
         - [org.openapitools.server.api.model.PinMediaSourceImagesURLItem](Models/docs/PinMediaSourceImagesURLItem.md)
         - [org.openapitools.server.api.model.PinMediaSourcePinURL](Models/docs/PinMediaSourcePinURL.md)
         - [org.openapitools.server.api.model.PinMediaSourceVideoID](Models/docs/PinMediaSourceVideoID.md)
         - [org.openapitools.server.api.model.PinMediaWithImage](Models/docs/PinMediaWithImage.md)
         - [org.openapitools.server.api.model.PinMediaWithImageAndVideo](Models/docs/PinMediaWithImageAndVideo.md)
         - [org.openapitools.server.api.model.PinMediaWithImages](Models/docs/PinMediaWithImages.md)
         - [org.openapitools.server.api.model.PinMediaWithVideo](Models/docs/PinMediaWithVideo.md)
         - [org.openapitools.server.api.model.PinMediaWithVideos](Models/docs/PinMediaWithVideos.md)
         - [org.openapitools.server.api.model.PinPromotionSummaryStatus](Models/docs/PinPromotionSummaryStatus.md)
         - [org.openapitools.server.api.model.PinRead](Models/docs/PinRead.md)
         - [org.openapitools.server.api.model.PinType](Models/docs/PinType.md)
         - [org.openapitools.server.api.model.PinUpdate](Models/docs/PinUpdate.md)
         - [org.openapitools.server.api.model.PinnerListType](Models/docs/PinnerListType.md)
         - [org.openapitools.server.api.model.PinsList200Response](Models/docs/PinsList200Response.md)
         - [org.openapitools.server.api.model.PinsSaveRequestCreate](Models/docs/PinsSaveRequestCreate.md)
         - [org.openapitools.server.api.model.PinterestLibBatchItemException](Models/docs/PinterestLibBatchItemException.md)
         - [org.openapitools.server.api.model.PinterestLibError](Models/docs/PinterestLibError.md)
         - [org.openapitools.server.api.model.PinterestLibPaginationOrder](Models/docs/PinterestLibPaginationOrder.md)
         - [org.openapitools.server.api.model.PinterestLibStatus204](Models/docs/PinterestLibStatus204.md)
         - [org.openapitools.server.api.model.PinterestProductCategoriesFilter](Models/docs/PinterestProductCategoriesFilter.md)
         - [org.openapitools.server.api.model.PlacementGroupType](Models/docs/PlacementGroupType.md)
         - [org.openapitools.server.api.model.PlacementMultipliers](Models/docs/PlacementMultipliers.md)
         - [org.openapitools.server.api.model.PlacementTrafficType](Models/docs/PlacementTrafficType.md)
         - [org.openapitools.server.api.model.PlacementType](Models/docs/PlacementType.md)
         - [org.openapitools.server.api.model.PredictedTimeSeries](Models/docs/PredictedTimeSeries.md)
         - [org.openapitools.server.api.model.PreferredMediaType](Models/docs/PreferredMediaType.md)
         - [org.openapitools.server.api.model.PriceFilter](Models/docs/PriceFilter.md)
         - [org.openapitools.server.api.model.PriceFilterPrice](Models/docs/PriceFilterPrice.md)
         - [org.openapitools.server.api.model.PrimarySort](Models/docs/PrimarySort.md)
         - [org.openapitools.server.api.model.ProductAvailability](Models/docs/ProductAvailability.md)
         - [org.openapitools.server.api.model.ProductAvailabilityType](Models/docs/ProductAvailabilityType.md)
         - [org.openapitools.server.api.model.ProductCategoriesDemographic](Models/docs/ProductCategoriesDemographic.md)
         - [org.openapitools.server.api.model.ProductCategoriesEngagementType](Models/docs/ProductCategoriesEngagementType.md)
         - [org.openapitools.server.api.model.ProductCategoriesMetricsHighlights](Models/docs/ProductCategoriesMetricsHighlights.md)
         - [org.openapitools.server.api.model.ProductCategoryDetailLookbackWindow](Models/docs/ProductCategoryDetailLookbackWindow.md)
         - [org.openapitools.server.api.model.ProductCategoryDetails](Models/docs/ProductCategoryDetails.md)
         - [org.openapitools.server.api.model.ProductCategoryEnum](Models/docs/ProductCategoryEnum.md)
         - [org.openapitools.server.api.model.ProductCategoryRegion](Models/docs/ProductCategoryRegion.md)
         - [org.openapitools.server.api.model.ProductCondition](Models/docs/ProductCondition.md)
         - [org.openapitools.server.api.model.ProductGroupAnalyticsItems](Models/docs/ProductGroupAnalyticsItems.md)
         - [org.openapitools.server.api.model.ProductGroupPromotion](Models/docs/ProductGroupPromotion.md)
         - [org.openapitools.server.api.model.ProductGroupPromotionCreateRequest](Models/docs/ProductGroupPromotionCreateRequest.md)
         - [org.openapitools.server.api.model.ProductGroupPromotionCustomizableCTAType](Models/docs/ProductGroupPromotionCustomizableCTAType.md)
         - [org.openapitools.server.api.model.ProductGroupPromotionResponseItem](Models/docs/ProductGroupPromotionResponseItem.md)
         - [org.openapitools.server.api.model.ProductGroupPromotionUpdateRequest](Models/docs/ProductGroupPromotionUpdateRequest.md)
         - [org.openapitools.server.api.model.ProductGroupPromotions](Models/docs/ProductGroupPromotions.md)
         - [org.openapitools.server.api.model.ProductGroupPromotionsCreate](Models/docs/ProductGroupPromotionsCreate.md)
         - [org.openapitools.server.api.model.ProductGroupPromotionsList200Response](Models/docs/ProductGroupPromotionsList200Response.md)
         - [org.openapitools.server.api.model.ProductGroupPromotionsUpdateWithRequiredBody](Models/docs/ProductGroupPromotionsUpdateWithRequiredBody.md)
         - [org.openapitools.server.api.model.ProductGroupReferenceFilter](Models/docs/ProductGroupReferenceFilter.md)
         - [org.openapitools.server.api.model.ProductGroupSummaryStatus](Models/docs/ProductGroupSummaryStatus.md)
         - [org.openapitools.server.api.model.ProductTagItem](Models/docs/ProductTagItem.md)
         - [org.openapitools.server.api.model.ProductTagsBulkAddRequest](Models/docs/ProductTagsBulkAddRequest.md)
         - [org.openapitools.server.api.model.ProductTagsBulkDeleteRequest](Models/docs/ProductTagsBulkDeleteRequest.md)
         - [org.openapitools.server.api.model.ProductTagsError](Models/docs/ProductTagsError.md)
         - [org.openapitools.server.api.model.ProductTagsResponse](Models/docs/ProductTagsResponse.md)
         - [org.openapitools.server.api.model.ProductType0Filter](Models/docs/ProductType0Filter.md)
         - [org.openapitools.server.api.model.ProductType1Filter](Models/docs/ProductType1Filter.md)
         - [org.openapitools.server.api.model.ProductType2Filter](Models/docs/ProductType2Filter.md)
         - [org.openapitools.server.api.model.ProductType3Filter](Models/docs/ProductType3Filter.md)
         - [org.openapitools.server.api.model.ProductType4Filter](Models/docs/ProductType4Filter.md)
         - [org.openapitools.server.api.model.Promotion](Models/docs/Promotion.md)
         - [org.openapitools.server.api.model.PromotionApplicationLevel](Models/docs/PromotionApplicationLevel.md)
         - [org.openapitools.server.api.model.PromotionArrayElement](Models/docs/PromotionArrayElement.md)
         - [org.openapitools.server.api.model.PromotionBatchUpdate](Models/docs/PromotionBatchUpdate.md)
         - [org.openapitools.server.api.model.PromotionCreate](Models/docs/PromotionCreate.md)
         - [org.openapitools.server.api.model.PromotionTemplateValue](Models/docs/PromotionTemplateValue.md)
         - [org.openapitools.server.api.model.PromotionType](Models/docs/PromotionType.md)
         - [org.openapitools.server.api.model.PromotionsList200Response](Models/docs/PromotionsList200Response.md)
         - [org.openapitools.server.api.model.PromotionsResponse](Models/docs/PromotionsResponse.md)
         - [org.openapitools.server.api.model.PublicTargetingType](Models/docs/PublicTargetingType.md)
         - [org.openapitools.server.api.model.QualityComponentDetails](Models/docs/QualityComponentDetails.md)
         - [org.openapitools.server.api.model.QualityComponentIssue](Models/docs/QualityComponentIssue.md)
         - [org.openapitools.server.api.model.QualityComponents](Models/docs/QualityComponents.md)
         - [org.openapitools.server.api.model.QueryLabelEntityStatusesItems](Models/docs/QueryLabelEntityStatusesItems.md)
         - [org.openapitools.server.api.model.QueryLabelTypesItems](Models/docs/QueryLabelTypesItems.md)
         - [org.openapitools.server.api.model.QuerymetrictypesItems](Models/docs/QuerymetrictypesItems.md)
         - [org.openapitools.server.api.model.QuerypinanalyticsmetrictypesItems](Models/docs/QuerypinanalyticsmetrictypesItems.md)
         - [org.openapitools.server.api.model.QueryvideopinmetrictypesItems](Models/docs/QueryvideopinmetrictypesItems.md)
         - [org.openapitools.server.api.model.QuizPinData](Models/docs/QuizPinData.md)
         - [org.openapitools.server.api.model.QuizPinOption](Models/docs/QuizPinOption.md)
         - [org.openapitools.server.api.model.QuizPinQuestion](Models/docs/QuizPinQuestion.md)
         - [org.openapitools.server.api.model.QuizPinResult](Models/docs/QuizPinResult.md)
         - [org.openapitools.server.api.model.RecordCounts](Models/docs/RecordCounts.md)
         - [org.openapitools.server.api.model.RelatedTerms](Models/docs/RelatedTerms.md)
         - [org.openapitools.server.api.model.RelatedTermsRelatedTermsListItems](Models/docs/RelatedTermsRelatedTermsListItems.md)
         - [org.openapitools.server.api.model.ReportType](Models/docs/ReportType.md)
         - [org.openapitools.server.api.model.ReportingColumn](Models/docs/ReportingColumn.md)
         - [org.openapitools.server.api.model.ReportingColumnAsync](Models/docs/ReportingColumnAsync.md)
         - [org.openapitools.server.api.model.ReportingColumnSync](Models/docs/ReportingColumnSync.md)
         - [org.openapitools.server.api.model.ReportingTimeZone](Models/docs/ReportingTimeZone.md)
         - [org.openapitools.server.api.model.ReportsStats200Response](Models/docs/ReportsStats200Response.md)
         - [org.openapitools.server.api.model.RespondToInviteResultItem](Models/docs/RespondToInviteResultItem.md)
         - [org.openapitools.server.api.model.RespondToInvitesResponseArray](Models/docs/RespondToInvitesResponseArray.md)
         - [org.openapitools.server.api.model.RetailLocalInventoryItemAttributes](Models/docs/RetailLocalInventoryItemAttributes.md)
         - [org.openapitools.server.api.model.RetailLocalInventoryItemAttributesOptional](Models/docs/RetailLocalInventoryItemAttributesOptional.md)
         - [org.openapitools.server.api.model.Role](Models/docs/Role.md)
         - [org.openapitools.server.api.model.S3FilePart](Models/docs/S3FilePart.md)
         - [org.openapitools.server.api.model.S3MultipartUploadData](Models/docs/S3MultipartUploadData.md)
         - [org.openapitools.server.api.model.SSIOAccount](Models/docs/SSIOAccount.md)
         - [org.openapitools.server.api.model.SSIOAccountAddress](Models/docs/SSIOAccountAddress.md)
         - [org.openapitools.server.api.model.SSIOAccountItem](Models/docs/SSIOAccountItem.md)
         - [org.openapitools.server.api.model.SSIOAccountPMPName](Models/docs/SSIOAccountPMPName.md)
         - [org.openapitools.server.api.model.SSIOInsertionOrder](Models/docs/SSIOInsertionOrder.md)
         - [org.openapitools.server.api.model.SSIOInsertionOrderCreate](Models/docs/SSIOInsertionOrderCreate.md)
         - [org.openapitools.server.api.model.SSIOInsertionOrderStatus](Models/docs/SSIOInsertionOrderStatus.md)
         - [org.openapitools.server.api.model.SSIOInsertionOrderStatusResponse](Models/docs/SSIOInsertionOrderStatusResponse.md)
         - [org.openapitools.server.api.model.SSIOInsertionOrderUpdate](Models/docs/SSIOInsertionOrderUpdate.md)
         - [org.openapitools.server.api.model.SSIOOrderLine](Models/docs/SSIOOrderLine.md)
         - [org.openapitools.server.api.model.SSIOOrderLineType](Models/docs/SSIOOrderLineType.md)
         - [org.openapitools.server.api.model.Schedule](Models/docs/Schedule.md)
         - [org.openapitools.server.api.model.ScheduleAction](Models/docs/ScheduleAction.md)
         - [org.openapitools.server.api.model.ScheduleAgeBucketMultipliers](Models/docs/ScheduleAgeBucketMultipliers.md)
         - [org.openapitools.server.api.model.ScheduleAppTypeMultipliers](Models/docs/ScheduleAppTypeMultipliers.md)
         - [org.openapitools.server.api.model.ScheduleAudienceMultipliers](Models/docs/ScheduleAudienceMultipliers.md)
         - [org.openapitools.server.api.model.ScheduleBatchUpdate](Models/docs/ScheduleBatchUpdate.md)
         - [org.openapitools.server.api.model.ScheduleBidMultipliers](Models/docs/ScheduleBidMultipliers.md)
         - [org.openapitools.server.api.model.ScheduleBidOptions](Models/docs/ScheduleBidOptions.md)
         - [org.openapitools.server.api.model.ScheduleBidOptionsGenderMultipliers](Models/docs/ScheduleBidOptionsGenderMultipliers.md)
         - [org.openapitools.server.api.model.ScheduleBidOptionsPlacementMultipliers](Models/docs/ScheduleBidOptionsPlacementMultipliers.md)
         - [org.openapitools.server.api.model.ScheduleCommonDeltaValue](Models/docs/ScheduleCommonDeltaValue.md)
         - [org.openapitools.server.api.model.ScheduleCreate](Models/docs/ScheduleCreate.md)
         - [org.openapitools.server.api.model.ScheduleCreateRequest](Models/docs/ScheduleCreateRequest.md)
         - [org.openapitools.server.api.model.ScheduleCreateRequestAllOf1](Models/docs/ScheduleCreateRequestAllOf1.md)
         - [org.openapitools.server.api.model.ScheduleDeltaValue](Models/docs/ScheduleDeltaValue.md)
         - [org.openapitools.server.api.model.ScheduleGenderMultipliers](Models/docs/ScheduleGenderMultipliers.md)
         - [org.openapitools.server.api.model.SchedulePlacementMultipliers](Models/docs/SchedulePlacementMultipliers.md)
         - [org.openapitools.server.api.model.ScheduleStatus](Models/docs/ScheduleStatus.md)
         - [org.openapitools.server.api.model.ScheduleType](Models/docs/ScheduleType.md)
         - [org.openapitools.server.api.model.ScheduleUpdateRequest](Models/docs/ScheduleUpdateRequest.md)
         - [org.openapitools.server.api.model.ScheduleUpdateRequestAllOf1](Models/docs/ScheduleUpdateRequestAllOf1.md)
         - [org.openapitools.server.api.model.SchedulesCreate200ResponseInner](Models/docs/SchedulesCreate200ResponseInner.md)
         - [org.openapitools.server.api.model.SchedulesCreate200ResponseInnerData](Models/docs/SchedulesCreate200ResponseInnerData.md)
         - [org.openapitools.server.api.model.SchedulesCreate200ResponseInnerDataOneOf](Models/docs/SchedulesCreate200ResponseInnerDataOneOf.md)
         - [org.openapitools.server.api.model.SchedulesList200Response](Models/docs/SchedulesList200Response.md)
         - [org.openapitools.server.api.model.ScrollupGoalMetadata](Models/docs/ScrollupGoalMetadata.md)
         - [org.openapitools.server.api.model.SearchPartnerPins200Response](Models/docs/SearchPartnerPins200Response.md)
         - [org.openapitools.server.api.model.SharedAudienceAccount](Models/docs/SharedAudienceAccount.md)
         - [org.openapitools.server.api.model.SharedAudiencesForBusinessList200Response](Models/docs/SharedAudiencesForBusinessList200Response.md)
         - [org.openapitools.server.api.model.SingleInterestTargetingOption](Models/docs/SingleInterestTargetingOption.md)
         - [org.openapitools.server.api.model.SourcePlatformOptions](Models/docs/SourcePlatformOptions.md)
         - [org.openapitools.server.api.model.SsioInsertionOrdersStatusGetByAdAccount200Response](Models/docs/SsioInsertionOrdersStatusGetByAdAccount200Response.md)
         - [org.openapitools.server.api.model.SsioOrderLinesGetByAdAccount200Response](Models/docs/SsioOrderLinesGetByAdAccount200Response.md)
         - [org.openapitools.server.api.model.StandardPinMetricTypes](Models/docs/StandardPinMetricTypes.md)
         - [org.openapitools.server.api.model.StoreMetadata](Models/docs/StoreMetadata.md)
         - [org.openapitools.server.api.model.SummaryPin](Models/docs/SummaryPin.md)
         - [org.openapitools.server.api.model.SummaryStatus](Models/docs/SummaryStatus.md)
         - [org.openapitools.server.api.model.SupplementalItemBatchOperationStatus](Models/docs/SupplementalItemBatchOperationStatus.md)
         - [org.openapitools.server.api.model.SupplementalItemProcessingStatus](Models/docs/SupplementalItemProcessingStatus.md)
         - [org.openapitools.server.api.model.SupplementalItemValidationEvent](Models/docs/SupplementalItemValidationEvent.md)
         - [org.openapitools.server.api.model.SupplementalItemsBatchResponse](Models/docs/SupplementalItemsBatchResponse.md)
         - [org.openapitools.server.api.model.SupplementalOperationResult](Models/docs/SupplementalOperationResult.md)
         - [org.openapitools.server.api.model.SystemUserUpdateWithRequiredBody](Models/docs/SystemUserUpdateWithRequiredBody.md)
         - [org.openapitools.server.api.model.TargetingAdvertiserCountry](Models/docs/TargetingAdvertiserCountry.md)
         - [org.openapitools.server.api.model.TargetingSpec](Models/docs/TargetingSpec.md)
         - [org.openapitools.server.api.model.TargetingSpecAgeBucket](Models/docs/TargetingSpecAgeBucket.md)
         - [org.openapitools.server.api.model.TargetingSpecAppType](Models/docs/TargetingSpecAppType.md)
         - [org.openapitools.server.api.model.TargetingSpecGender](Models/docs/TargetingSpecGender.md)
         - [org.openapitools.server.api.model.TargetingSpecListOperation](Models/docs/TargetingSpecListOperation.md)
         - [org.openapitools.server.api.model.TargetingSpecOperationAgeBucket](Models/docs/TargetingSpecOperationAgeBucket.md)
         - [org.openapitools.server.api.model.TargetingSpecOperationAppType](Models/docs/TargetingSpecOperationAppType.md)
         - [org.openapitools.server.api.model.TargetingSpecOperationAudienceExclude](Models/docs/TargetingSpecOperationAudienceExclude.md)
         - [org.openapitools.server.api.model.TargetingSpecOperationAudienceInclude](Models/docs/TargetingSpecOperationAudienceInclude.md)
         - [org.openapitools.server.api.model.TargetingSpecOperationGender](Models/docs/TargetingSpecOperationGender.md)
         - [org.openapitools.server.api.model.TargetingSpecOperationGeo](Models/docs/TargetingSpecOperationGeo.md)
         - [org.openapitools.server.api.model.TargetingSpecOperationGeoExclude](Models/docs/TargetingSpecOperationGeoExclude.md)
         - [org.openapitools.server.api.model.TargetingSpecOperationInterest](Models/docs/TargetingSpecOperationInterest.md)
         - [org.openapitools.server.api.model.TargetingSpecOperationLocale](Models/docs/TargetingSpecOperationLocale.md)
         - [org.openapitools.server.api.model.TargetingSpecOperationLocation](Models/docs/TargetingSpecOperationLocation.md)
         - [org.openapitools.server.api.model.TargetingSpecOperationLocationExclude](Models/docs/TargetingSpecOperationLocationExclude.md)
         - [org.openapitools.server.api.model.TargetingSpecOperationMaximumAge](Models/docs/TargetingSpecOperationMaximumAge.md)
         - [org.openapitools.server.api.model.TargetingSpecOperationMinimumAge](Models/docs/TargetingSpecOperationMinimumAge.md)
         - [org.openapitools.server.api.model.TargetingSpecOperationShoppingRetargeting](Models/docs/TargetingSpecOperationShoppingRetargeting.md)
         - [org.openapitools.server.api.model.TargetingSpecOperations](Models/docs/TargetingSpecOperations.md)
         - [org.openapitools.server.api.model.TargetingSpecOptimal](Models/docs/TargetingSpecOptimal.md)
         - [org.openapitools.server.api.model.TargetingSpecShoppingRetargeting](Models/docs/TargetingSpecShoppingRetargeting.md)
         - [org.openapitools.server.api.model.TargetingSpecTargetingStrategyItems](Models/docs/TargetingSpecTargetingStrategyItems.md)
         - [org.openapitools.server.api.model.TargetingStrategy](Models/docs/TargetingStrategy.md)
         - [org.openapitools.server.api.model.TargetingTemplate](Models/docs/TargetingTemplate.md)
         - [org.openapitools.server.api.model.TargetingTemplateAudienceSizing](Models/docs/TargetingTemplateAudienceSizing.md)
         - [org.openapitools.server.api.model.TargetingTemplateAudienceSizingReachEstimate](Models/docs/TargetingTemplateAudienceSizingReachEstimate.md)
         - [org.openapitools.server.api.model.TargetingTemplateCreate](Models/docs/TargetingTemplateCreate.md)
         - [org.openapitools.server.api.model.TargetingTemplateKeyword](Models/docs/TargetingTemplateKeyword.md)
         - [org.openapitools.server.api.model.TargetingTemplateList200Response](Models/docs/TargetingTemplateList200Response.md)
         - [org.openapitools.server.api.model.TargetingTemplateStatus](Models/docs/TargetingTemplateStatus.md)
         - [org.openapitools.server.api.model.TargetingTemplateUpdateRequestReadOrUpdate](Models/docs/TargetingTemplateUpdateRequestReadOrUpdate.md)
         - [org.openapitools.server.api.model.TemplateBasedReport](Models/docs/TemplateBasedReport.md)
         - [org.openapitools.server.api.model.TemplateBasedReportCreate](Models/docs/TemplateBasedReportCreate.md)
         - [org.openapitools.server.api.model.TemplatesList200Response](Models/docs/TemplatesList200Response.md)
         - [org.openapitools.server.api.model.TermsOfService](Models/docs/TermsOfService.md)
         - [org.openapitools.server.api.model.TieBreakerType](Models/docs/TieBreakerType.md)
         - [org.openapitools.server.api.model.TimeSeries](Models/docs/TimeSeries.md)
         - [org.openapitools.server.api.model.TitleKeywordsFilter](Models/docs/TitleKeywordsFilter.md)
         - [org.openapitools.server.api.model.TokenGrantType](Models/docs/TokenGrantType.md)
         - [org.openapitools.server.api.model.TokenTypeHint](Models/docs/TokenTypeHint.md)
         - [org.openapitools.server.api.model.TopPinsAnalyticsResponse](Models/docs/TopPinsAnalyticsResponse.md)
         - [org.openapitools.server.api.model.TopPinsAnalyticsResponseDateAvailability](Models/docs/TopPinsAnalyticsResponseDateAvailability.md)
         - [org.openapitools.server.api.model.TopPinsAnalyticsResponsePinsItems](Models/docs/TopPinsAnalyticsResponsePinsItems.md)
         - [org.openapitools.server.api.model.TopPinsSortBy](Models/docs/TopPinsSortBy.md)
         - [org.openapitools.server.api.model.TopVideoPinsAnalyticsResponse](Models/docs/TopVideoPinsAnalyticsResponse.md)
         - [org.openapitools.server.api.model.TopVideoPinsAnalyticsResponseDateAvailability](Models/docs/TopVideoPinsAnalyticsResponseDateAvailability.md)
         - [org.openapitools.server.api.model.TopVideoPinsAnalyticsResponsePinsItems](Models/docs/TopVideoPinsAnalyticsResponsePinsItems.md)
         - [org.openapitools.server.api.model.TopVideoPinsSortBy](Models/docs/TopVideoPinsSortBy.md)
         - [org.openapitools.server.api.model.TotalCountByEntityStatus](Models/docs/TotalCountByEntityStatus.md)
         - [org.openapitools.server.api.model.TrackingUrls](Models/docs/TrackingUrls.md)
         - [org.openapitools.server.api.model.TrendType](Models/docs/TrendType.md)
         - [org.openapitools.server.api.model.TrendingKeyword](Models/docs/TrendingKeyword.md)
         - [org.openapitools.server.api.model.TrendingKeywordDemographics](Models/docs/TrendingKeywordDemographics.md)
         - [org.openapitools.server.api.model.TrendingKeywordsResponse](Models/docs/TrendingKeywordsResponse.md)
         - [org.openapitools.server.api.model.TrendingPin](Models/docs/TrendingPin.md)
         - [org.openapitools.server.api.model.TrendingProductCategory](Models/docs/TrendingProductCategory.md)
         - [org.openapitools.server.api.model.TrendingTopic](Models/docs/TrendingTopic.md)
         - [org.openapitools.server.api.model.TrendsAgeBucket](Models/docs/TrendsAgeBucket.md)
         - [org.openapitools.server.api.model.TrendsAgeDistribution](Models/docs/TrendsAgeDistribution.md)
         - [org.openapitools.server.api.model.TrendsEditorial](Models/docs/TrendsEditorial.md)
         - [org.openapitools.server.api.model.TrendsGender](Models/docs/TrendsGender.md)
         - [org.openapitools.server.api.model.TrendsGenderDistribution](Models/docs/TrendsGenderDistribution.md)
         - [org.openapitools.server.api.model.TrendsGenderFilter](Models/docs/TrendsGenderFilter.md)
         - [org.openapitools.server.api.model.TrendsL1Interest](Models/docs/TrendsL1Interest.md)
         - [org.openapitools.server.api.model.TrendsSupportedRegion](Models/docs/TrendsSupportedRegion.md)
         - [org.openapitools.server.api.model.UpdatableItemAttributes](Models/docs/UpdatableItemAttributes.md)
         - [org.openapitools.server.api.model.UpdatableItemAttributesGtin](Models/docs/UpdatableItemAttributesGtin.md)
         - [org.openapitools.server.api.model.UpdateBusinessMembershipsResponse](Models/docs/UpdateBusinessMembershipsResponse.md)
         - [org.openapitools.server.api.model.UpdateInvitesResultsResponseArray](Models/docs/UpdateInvitesResultsResponseArray.md)
         - [org.openapitools.server.api.model.UpdateMaskBidOptionField](Models/docs/UpdateMaskBidOptionField.md)
         - [org.openapitools.server.api.model.UpdateMaskFieldType](Models/docs/UpdateMaskFieldType.md)
         - [org.openapitools.server.api.model.UpdateMemberAssetAccessBody](Models/docs/UpdateMemberAssetAccessBody.md)
         - [org.openapitools.server.api.model.UpdateMemberAssetAccessItem](Models/docs/UpdateMemberAssetAccessItem.md)
         - [org.openapitools.server.api.model.UpdateMemberAssetResultItem](Models/docs/UpdateMemberAssetResultItem.md)
         - [org.openapitools.server.api.model.UpdateMemberAssetsResultsResponseArray](Models/docs/UpdateMemberAssetsResultsResponseArray.md)
         - [org.openapitools.server.api.model.UpdatePartnerAssetAccessBody](Models/docs/UpdatePartnerAssetAccessBody.md)
         - [org.openapitools.server.api.model.UpdatePartnerAssetAccessItem](Models/docs/UpdatePartnerAssetAccessItem.md)
         - [org.openapitools.server.api.model.UpdatePartnerAssetsResult](Models/docs/UpdatePartnerAssetsResult.md)
         - [org.openapitools.server.api.model.UpdatePartnerAssetsResultsResponseArray](Models/docs/UpdatePartnerAssetsResultsResponseArray.md)
         - [org.openapitools.server.api.model.UserAccountFollowedInterests200Response](Models/docs/UserAccountFollowedInterests200Response.md)
         - [org.openapitools.server.api.model.UserAccountType](Models/docs/UserAccountType.md)
         - [org.openapitools.server.api.model.UserBusinessRoleBinding](Models/docs/UserBusinessRoleBinding.md)
         - [org.openapitools.server.api.model.UserFollowingFeedType](Models/docs/UserFollowingFeedType.md)
         - [org.openapitools.server.api.model.UserListOperationType](Models/docs/UserListOperationType.md)
         - [org.openapitools.server.api.model.UserListType](Models/docs/UserListType.md)
         - [org.openapitools.server.api.model.UserSingleAssetBinding](Models/docs/UserSingleAssetBinding.md)
         - [org.openapitools.server.api.model.UserWebsite](Models/docs/UserWebsite.md)
         - [org.openapitools.server.api.model.UserWebsiteCreate](Models/docs/UserWebsiteCreate.md)
         - [org.openapitools.server.api.model.UserWebsiteVerification](Models/docs/UserWebsiteVerification.md)
         - [org.openapitools.server.api.model.UserWebsitesGet200Response](Models/docs/UserWebsitesGet200Response.md)
         - [org.openapitools.server.api.model.UsersForIndividualAssetResponse](Models/docs/UsersForIndividualAssetResponse.md)
         - [org.openapitools.server.api.model.VerticalProductCategory](Models/docs/VerticalProductCategory.md)
         - [org.openapitools.server.api.model.VideoMetadataWithItemType](Models/docs/VideoMetadataWithItemType.md)
         - [org.openapitools.server.api.model.VideoPinMetricTypes](Models/docs/VideoPinMetricTypes.md)
         - [org.openapitools.server.api.model.WebsiteVerificationMethod](Models/docs/WebsiteVerificationMethod.md)
         - [org.openapitools.server.api.model.WorkloadState](Models/docs/WorkloadState.md)
        

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
                
