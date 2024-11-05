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
*AdAccountsApi* | [**analytics/createMmmReport**](Apis/AdAccountsApi.md#analytics/createmmmreport) | **POST** /ad_accounts/{ad_account_id}/mmm_reports | Create a request for a Marketing Mix Modeling (MMM) report |
*AdAccountsApi* | [**analytics/createReport**](Apis/AdAccountsApi.md#analytics/createreport) | **POST** /ad_accounts/{ad_account_id}/reports | Create async request for an account analytics report |
*AdAccountsApi* | [**analytics/createTemplateReport**](Apis/AdAccountsApi.md#analytics/createtemplatereport) | **POST** /ad_accounts/{ad_account_id}/templates/{template_id}/reports | Create async request for an analytics report using a template |
*AdAccountsApi* | [**analytics/getMmmReport**](Apis/AdAccountsApi.md#analytics/getmmmreport) | **GET** /ad_accounts/{ad_account_id}/mmm_reports | Get advertiser Marketing Mix Modeling (MMM) report. |
*AdAccountsApi* | [**analytics/getReport**](Apis/AdAccountsApi.md#analytics/getreport) | **GET** /ad_accounts/{ad_account_id}/reports | Get the account analytics report created by the async call |
*AdAccountsApi* | [**sandbox/delete**](Apis/AdAccountsApi.md#sandbox/delete) | **DELETE** /ad_accounts/{ad_account_id}/sandbox | Delete ads data for ad account in API Sandbox |
*AdAccountsApi* | [**templates/list**](Apis/AdAccountsApi.md#templates/list) | **GET** /ad_accounts/{ad_account_id}/templates | List templates |
| *AdGroupsApi* | [**adGroups/analytics**](Apis/AdGroupsApi.md#adgroups/analytics) | **GET** /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics |
*AdGroupsApi* | [**adGroups/audienceSizing**](Apis/AdGroupsApi.md#adgroups/audiencesizing) | **POST** /ad_accounts/{ad_account_id}/ad_groups/audience_sizing | Get audience sizing |
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
| *AdvancedAuctionApi* | [**advancedAuctionItemsGet/post**](Apis/AdvancedAuctionApi.md#advancedauctionitemsget/post) | **POST** /advanced_auction/items/get | Get item bid options (POST) |
*AdvancedAuctionApi* | [**advancedAuctionItemsSubmit/post**](Apis/AdvancedAuctionApi.md#advancedauctionitemssubmit/post) | **POST** /advanced_auction/items/submit | Operate on item level bid options |
| *AudienceInsightsApi* | [**audienceInsights/get**](Apis/AudienceInsightsApi.md#audienceinsights/get) | **GET** /ad_accounts/{ad_account_id}/audience_insights | Get audience insights |
*AudienceInsightsApi* | [**audienceInsightsScopeAndType/get**](Apis/AudienceInsightsApi.md#audienceinsightsscopeandtype/get) | **GET** /ad_accounts/{ad_account_id}/insights/audiences | Get audience insights scope and type |
| *AudienceSharingApi* | [**adAccountsAudiencesSharedAccounts/list**](Apis/AudienceSharingApi.md#adaccountsaudiencessharedaccounts/list) | **GET** /ad_accounts/{ad_account_id}/audiences/shared/accounts | List accounts with access to an audience owned by an ad account |
*AudienceSharingApi* | [**businessAccountAudiencesSharedAccounts/list**](Apis/AudienceSharingApi.md#businessaccountaudiencessharedaccounts/list) | **GET** /businesses/{business_id}/audiences/shared/accounts | List accounts with access to an audience owned by a business |
*AudienceSharingApi* | [**sharedAudiencesForBusiness/list**](Apis/AudienceSharingApi.md#sharedaudiencesforbusiness/list) | **GET** /businesses/{business_id}/audiences | List received audiences for a business |
*AudienceSharingApi* | [**updateAdAccountToAdAccountSharedAudience**](Apis/AudienceSharingApi.md#updateadaccounttoadaccountsharedaudience) | **PATCH** /ad_accounts/{ad_account_id}/audiences/ad_accounts/shared | Update audience sharing between ad accounts |
*AudienceSharingApi* | [**updateAdAccountToBusinessSharedAudience**](Apis/AudienceSharingApi.md#updateadaccounttobusinesssharedaudience) | **PATCH** /ad_accounts/{ad_account_id}/audiences/businesses/shared | Update audience sharing from an ad account to businesses |
*AudienceSharingApi* | [**updateBusinessToAdAccountSharedAudience**](Apis/AudienceSharingApi.md#updatebusinesstoadaccountsharedaudience) | **PATCH** /businesses/{business_id}/audiences/ad_accounts/shared | Update audience sharing from a business to ad accounts |
*AudienceSharingApi* | [**updateBusinessToBusinessSharedAudience**](Apis/AudienceSharingApi.md#updatebusinesstobusinesssharedaudience) | **PATCH** /businesses/{business_id}/audiences/businesses/shared | Update audience sharing between businesses |
| *AudiencesApi* | [**audiences/create**](Apis/AudiencesApi.md#audiences/create) | **POST** /ad_accounts/{ad_account_id}/audiences | Create audience |
*AudiencesApi* | [**audiences/createCustom**](Apis/AudiencesApi.md#audiences/createcustom) | **POST** /ad_accounts/{ad_account_id}/audiences/custom | Create custom audience |
*AudiencesApi* | [**audiences/get**](Apis/AudiencesApi.md#audiences/get) | **GET** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Get audience |
*AudiencesApi* | [**audiences/list**](Apis/AudiencesApi.md#audiences/list) | **GET** /ad_accounts/{ad_account_id}/audiences | List audiences |
*AudiencesApi* | [**audiences/update**](Apis/AudiencesApi.md#audiences/update) | **PATCH** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Update audience |
| *BillingApi* | [**adsCredit/redeem**](Apis/BillingApi.md#adscredit/redeem) | **POST** /ad_accounts/{ad_account_id}/ads_credit/redeem | Redeem ad credits |
*BillingApi* | [**adsCreditsDiscounts/get**](Apis/BillingApi.md#adscreditsdiscounts/get) | **GET** /ad_accounts/{ad_account_id}/ads_credit/discounts | Get ads credit discounts |
*BillingApi* | [**billingProfiles/get**](Apis/BillingApi.md#billingprofiles/get) | **GET** /ad_accounts/{ad_account_id}/billing_profiles | Get billing profiles |
*BillingApi* | [**ssioAccounts/get**](Apis/BillingApi.md#ssioaccounts/get) | **GET** /ad_accounts/{ad_account_id}/ssio/accounts | Get Salesforce account details including bill-to information. |
*BillingApi* | [**ssioInsertionOrder/create**](Apis/BillingApi.md#ssioinsertionorder/create) | **POST** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Create insertion order through SSIO. |
*BillingApi* | [**ssioInsertionOrder/edit**](Apis/BillingApi.md#ssioinsertionorder/edit) | **PATCH** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Edit insertion order through SSIO. |
*BillingApi* | [**ssioInsertionOrdersStatus/getByAdAccount**](Apis/BillingApi.md#ssioinsertionordersstatus/getbyadaccount) | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/status | Get insertion order status by ad account id. |
*BillingApi* | [**ssioInsertionOrdersStatus/getByPinOrderId**](Apis/BillingApi.md#ssioinsertionordersstatus/getbypinorderid) | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status | Get insertion order status by pin order id. |
*BillingApi* | [**ssioOrderLines/getByAdAccount**](Apis/BillingApi.md#ssioorderlines/getbyadaccount) | **GET** /ad_accounts/{ad_account_id}/ssio/order_lines | Get Salesforce order lines by ad account id. |
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
| *BusinessAccessAssetsApi* | [**assetGroup/create**](Apis/BusinessAccessAssetsApi.md#assetgroup/create) | **POST** /businesses/{business_id}/asset_groups | Create a new asset group. |
*BusinessAccessAssetsApi* | [**assetGroup/delete**](Apis/BusinessAccessAssetsApi.md#assetgroup/delete) | **DELETE** /businesses/{business_id}/asset_groups | Delete asset groups. |
*BusinessAccessAssetsApi* | [**assetGroup/update**](Apis/BusinessAccessAssetsApi.md#assetgroup/update) | **PATCH** /businesses/{business_id}/asset_groups | Update asset groups. |
*BusinessAccessAssetsApi* | [**businessAssetMembers/get**](Apis/BusinessAccessAssetsApi.md#businessassetmembers/get) | **GET** /businesses/{business_id}/assets/{asset_id}/members | Get members with access to asset |
*BusinessAccessAssetsApi* | [**businessAssetPartners/get**](Apis/BusinessAccessAssetsApi.md#businessassetpartners/get) | **GET** /businesses/{business_id}/assets/{asset_id}/partners | Get partners with access to asset |
*BusinessAccessAssetsApi* | [**businessAssets/get**](Apis/BusinessAccessAssetsApi.md#businessassets/get) | **GET** /businesses/{business_id}/assets | List business assets |
*BusinessAccessAssetsApi* | [**businessMemberAssets/get**](Apis/BusinessAccessAssetsApi.md#businessmemberassets/get) | **GET** /businesses/{business_id}/members/{member_id}/assets | Get assets assigned to a member |
*BusinessAccessAssetsApi* | [**businessMembersAssetAccess/delete**](Apis/BusinessAccessAssetsApi.md#businessmembersassetaccess/delete) | **DELETE** /businesses/{business_id}/members/assets/access | Delete member access to asset |
*BusinessAccessAssetsApi* | [**businessMembersAssetAccess/update**](Apis/BusinessAccessAssetsApi.md#businessmembersassetaccess/update) | **PATCH** /businesses/{business_id}/members/assets/access | Assign/Update member asset permissions |
*BusinessAccessAssetsApi* | [**businessPartnerAssetAccess/get**](Apis/BusinessAccessAssetsApi.md#businesspartnerassetaccess/get) | **GET** /businesses/{business_id}/partners/{partner_id}/assets | Get assets assigned to a partner or assets assigned by a partner |
*BusinessAccessAssetsApi* | [**deletePartnerAssetAccessHandlerImpl**](Apis/BusinessAccessAssetsApi.md#deletepartnerassetaccesshandlerimpl) | **DELETE** /businesses/{business_id}/partners/assets | Delete partner access to asset |
*BusinessAccessAssetsApi* | [**updatePartnerAssetAccessHandlerImpl**](Apis/BusinessAccessAssetsApi.md#updatepartnerassetaccesshandlerimpl) | **PATCH** /businesses/{business_id}/partners/assets | Assign/Update partner asset permissions |
| *BusinessAccessInviteApi* | [**assetAccessRequests/create**](Apis/BusinessAccessInviteApi.md#assetaccessrequests/create) | **POST** /businesses/{business_id}/requests/assets/access | Create a request to access an existing partner's assets. |
*BusinessAccessInviteApi* | [**cancelInvitesOrRequests**](Apis/BusinessAccessInviteApi.md#cancelinvitesorrequests) | **DELETE** /businesses/{business_id}/invites | Cancel invites/requests |
*BusinessAccessInviteApi* | [**createAssetInvites**](Apis/BusinessAccessInviteApi.md#createassetinvites) | **POST** /businesses/{business_id}/invites/assets/access | Update invite/request with an asset permission |
*BusinessAccessInviteApi* | [**createMembershipOrPartnershipInvites**](Apis/BusinessAccessInviteApi.md#createmembershiporpartnershipinvites) | **POST** /businesses/{business_id}/invites | Create invites or requests |
*BusinessAccessInviteApi* | [**get/invites**](Apis/BusinessAccessInviteApi.md#get/invites) | **GET** /businesses/{business_id}/invites | Get invites/requests |
*BusinessAccessInviteApi* | [**respondBusinessAccessInvites**](Apis/BusinessAccessInviteApi.md#respondbusinessaccessinvites) | **PATCH** /businesses/invites | Accept or decline an invite/request |
| *BusinessAccessRelationshipsApi* | [**deleteBusinessMembership**](Apis/BusinessAccessRelationshipsApi.md#deletebusinessmembership) | **DELETE** /businesses/{business_id}/members | Terminate business memberships |
*BusinessAccessRelationshipsApi* | [**deleteBusinessPartners**](Apis/BusinessAccessRelationshipsApi.md#deletebusinesspartners) | **DELETE** /businesses/{business_id}/partners | Terminate business partnerships |
*BusinessAccessRelationshipsApi* | [**get/businessEmployers**](Apis/BusinessAccessRelationshipsApi.md#get/businessemployers) | **GET** /businesses/employers | List business employers for user |
*BusinessAccessRelationshipsApi* | [**get/businessMembers**](Apis/BusinessAccessRelationshipsApi.md#get/businessmembers) | **GET** /businesses/{business_id}/members | Get business members |
*BusinessAccessRelationshipsApi* | [**get/businessPartners**](Apis/BusinessAccessRelationshipsApi.md#get/businesspartners) | **GET** /businesses/{business_id}/partners | Get business partners |
*BusinessAccessRelationshipsApi* | [**update/businessMemberships**](Apis/BusinessAccessRelationshipsApi.md#update/businessmemberships) | **PATCH** /businesses/{business_id}/members | Update member's business role |
| *CampaignsApi* | [**campaignTargetingAnalytics/get**](Apis/CampaignsApi.md#campaigntargetinganalytics/get) | **GET** /ad_accounts/{ad_account_id}/campaigns/targeting_analytics | Get targeting analytics for campaigns |
*CampaignsApi* | [**campaigns/analytics**](Apis/CampaignsApi.md#campaigns/analytics) | **GET** /ad_accounts/{ad_account_id}/campaigns/analytics | Get campaign analytics |
*CampaignsApi* | [**campaigns/create**](Apis/CampaignsApi.md#campaigns/create) | **POST** /ad_accounts/{ad_account_id}/campaigns | Create campaigns |
*CampaignsApi* | [**campaigns/get**](Apis/CampaignsApi.md#campaigns/get) | **GET** /ad_accounts/{ad_account_id}/campaigns/{campaign_id} | Get campaign |
*CampaignsApi* | [**campaigns/list**](Apis/CampaignsApi.md#campaigns/list) | **GET** /ad_accounts/{ad_account_id}/campaigns | List campaigns |
*CampaignsApi* | [**campaigns/update**](Apis/CampaignsApi.md#campaigns/update) | **PATCH** /ad_accounts/{ad_account_id}/campaigns | Update campaigns |
| *CatalogsApi* | [**catalogs/create**](Apis/CatalogsApi.md#catalogs/create) | **POST** /catalogs | Create catalog |
*CatalogsApi* | [**catalogs/list**](Apis/CatalogsApi.md#catalogs/list) | **GET** /catalogs | List catalogs |
*CatalogsApi* | [**catalogsProductGroupPins/list**](Apis/CatalogsApi.md#catalogsproductgrouppins/list) | **GET** /catalogs/product_groups/{product_group_id}/products | List products by product group |
*CatalogsApi* | [**catalogsProductGroups/create**](Apis/CatalogsApi.md#catalogsproductgroups/create) | **POST** /catalogs/product_groups | Create product group |
*CatalogsApi* | [**catalogsProductGroups/createMany**](Apis/CatalogsApi.md#catalogsproductgroups/createmany) | **POST** /catalogs/product_groups/multiple | Create product groups |
*CatalogsApi* | [**catalogsProductGroups/delete**](Apis/CatalogsApi.md#catalogsproductgroups/delete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group |
*CatalogsApi* | [**catalogsProductGroups/deleteMany**](Apis/CatalogsApi.md#catalogsproductgroups/deletemany) | **DELETE** /catalogs/product_groups/multiple | Delete product groups |
*CatalogsApi* | [**catalogsProductGroups/get**](Apis/CatalogsApi.md#catalogsproductgroups/get) | **GET** /catalogs/product_groups/{product_group_id} | Get product group |
*CatalogsApi* | [**catalogsProductGroups/list**](Apis/CatalogsApi.md#catalogsproductgroups/list) | **GET** /catalogs/product_groups | List product groups |
*CatalogsApi* | [**catalogsProductGroups/productCountsGet**](Apis/CatalogsApi.md#catalogsproductgroups/productcountsget) | **GET** /catalogs/product_groups/{product_group_id}/product_counts | Get product counts |
*CatalogsApi* | [**catalogsProductGroups/update**](Apis/CatalogsApi.md#catalogsproductgroups/update) | **PATCH** /catalogs/product_groups/{product_group_id} | Update single product group |
*CatalogsApi* | [**feedProcessingResults/list**](Apis/CatalogsApi.md#feedprocessingresults/list) | **GET** /catalogs/feeds/{feed_id}/processing_results | List feed processing results |
*CatalogsApi* | [**feeds/create**](Apis/CatalogsApi.md#feeds/create) | **POST** /catalogs/feeds | Create feed |
*CatalogsApi* | [**feeds/delete**](Apis/CatalogsApi.md#feeds/delete) | **DELETE** /catalogs/feeds/{feed_id} | Delete feed |
*CatalogsApi* | [**feeds/get**](Apis/CatalogsApi.md#feeds/get) | **GET** /catalogs/feeds/{feed_id} | Get feed |
*CatalogsApi* | [**feeds/ingest**](Apis/CatalogsApi.md#feeds/ingest) | **POST** /catalogs/feeds/{feed_id}/ingest | Ingest feed items |
*CatalogsApi* | [**feeds/list**](Apis/CatalogsApi.md#feeds/list) | **GET** /catalogs/feeds | List feeds |
*CatalogsApi* | [**feeds/update**](Apis/CatalogsApi.md#feeds/update) | **PATCH** /catalogs/feeds/{feed_id} | Update feed |
*CatalogsApi* | [**items/get**](Apis/CatalogsApi.md#items/get) | **GET** /catalogs/items | Get catalogs items |
*CatalogsApi* | [**items/post**](Apis/CatalogsApi.md#items/post) | **POST** /catalogs/items | Get catalogs items (POST) |
*CatalogsApi* | [**itemsBatch/get**](Apis/CatalogsApi.md#itemsbatch/get) | **GET** /catalogs/items/batch/{batch_id} | Get item batch status |
*CatalogsApi* | [**itemsBatch/post**](Apis/CatalogsApi.md#itemsbatch/post) | **POST** /catalogs/items/batch | Operate on item batch |
*CatalogsApi* | [**itemsIssues/list**](Apis/CatalogsApi.md#itemsissues/list) | **GET** /catalogs/processing_results/{processing_result_id}/item_issues | List item issues |
*CatalogsApi* | [**productsByProductGroupFilter/list**](Apis/CatalogsApi.md#productsbyproductgroupfilter/list) | **POST** /catalogs/products/get_by_product_group_filters | List products by filter |
*CatalogsApi* | [**reports/create**](Apis/CatalogsApi.md#reports/create) | **POST** /catalogs/reports | Build catalogs report |
*CatalogsApi* | [**reports/get**](Apis/CatalogsApi.md#reports/get) | **GET** /catalogs/reports | Get catalogs report |
*CatalogsApi* | [**reports/stats**](Apis/CatalogsApi.md#reports/stats) | **GET** /catalogs/reports/stats | List report stats |
| *ConversionEventsApi* | [**events/create**](Apis/ConversionEventsApi.md#events/create) | **POST** /ad_accounts/{ad_account_id}/events | Send conversions |
| *ConversionTagsApi* | [**conversionTags/create**](Apis/ConversionTagsApi.md#conversiontags/create) | **POST** /ad_accounts/{ad_account_id}/conversion_tags | Create conversion tag |
*ConversionTagsApi* | [**conversionTags/get**](Apis/ConversionTagsApi.md#conversiontags/get) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id} | Get conversion tag |
*ConversionTagsApi* | [**conversionTags/list**](Apis/ConversionTagsApi.md#conversiontags/list) | **GET** /ad_accounts/{ad_account_id}/conversion_tags | Get conversion tags |
*ConversionTagsApi* | [**ocpmEligibleConversionTags/get**](Apis/ConversionTagsApi.md#ocpmeligibleconversiontags/get) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible | Get Ocpm eligible conversion tags |
*ConversionTagsApi* | [**pageVisitConversionTags/get**](Apis/ConversionTagsApi.md#pagevisitconversiontags/get) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/page_visit | Get page visit conversion tags |
| *CustomerListsApi* | [**customerLists/create**](Apis/CustomerListsApi.md#customerlists/create) | **POST** /ad_accounts/{ad_account_id}/customer_lists | Create customer lists |
*CustomerListsApi* | [**customerLists/get**](Apis/CustomerListsApi.md#customerlists/get) | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Get customer list |
*CustomerListsApi* | [**customerLists/list**](Apis/CustomerListsApi.md#customerlists/list) | **GET** /ad_accounts/{ad_account_id}/customer_lists | Get customer lists |
*CustomerListsApi* | [**customerLists/update**](Apis/CustomerListsApi.md#customerlists/update) | **PATCH** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Update customer list |
| *IntegrationsApi* | [**integrations/getById**](Apis/IntegrationsApi.md#integrations/getbyid) | **GET** /integrations/{id} | Get integration metadata |
*IntegrationsApi* | [**integrations/getList**](Apis/IntegrationsApi.md#integrations/getlist) | **GET** /integrations | Get integration metadata list |
*IntegrationsApi* | [**integrationsCommerce/del**](Apis/IntegrationsApi.md#integrationscommerce/del) | **DELETE** /integrations/commerce/{external_business_id} | Delete commerce integration |
*IntegrationsApi* | [**integrationsCommerce/get**](Apis/IntegrationsApi.md#integrationscommerce/get) | **GET** /integrations/commerce/{external_business_id} | Get commerce integration |
*IntegrationsApi* | [**integrationsCommerce/patch**](Apis/IntegrationsApi.md#integrationscommerce/patch) | **PATCH** /integrations/commerce/{external_business_id} | Update commerce integration |
*IntegrationsApi* | [**integrationsCommerce/post**](Apis/IntegrationsApi.md#integrationscommerce/post) | **POST** /integrations/commerce | Create commerce integration |
*IntegrationsApi* | [**integrationsLogs/post**](Apis/IntegrationsApi.md#integrationslogs/post) | **POST** /integrations/logs | Receives batched logs from integration applications. |
| *KeywordsApi* | [**countryKeywordsMetrics/get**](Apis/KeywordsApi.md#countrykeywordsmetrics/get) | **GET** /ad_accounts/{ad_account_id}/keywords/metrics | Get country's keyword metrics |
*KeywordsApi* | [**keywords/create**](Apis/KeywordsApi.md#keywords/create) | **POST** /ad_accounts/{ad_account_id}/keywords | Create keywords |
*KeywordsApi* | [**keywords/get**](Apis/KeywordsApi.md#keywords/get) | **GET** /ad_accounts/{ad_account_id}/keywords | Get keywords |
*KeywordsApi* | [**keywords/update**](Apis/KeywordsApi.md#keywords/update) | **PATCH** /ad_accounts/{ad_account_id}/keywords | Update keywords |
*KeywordsApi* | [**trendingKeywords/list**](Apis/KeywordsApi.md#trendingkeywords/list) | **GET** /trends/keywords/{region}/top/{trend_type} | List trending keywords |
| *LeadAdsApi* | [**adAccountsSubscriptions/delById**](Apis/LeadAdsApi.md#adaccountssubscriptions/delbyid) | **DELETE** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Delete lead ads subscription |
*LeadAdsApi* | [**adAccountsSubscriptions/getById**](Apis/LeadAdsApi.md#adaccountssubscriptions/getbyid) | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Get lead ads subscription |
*LeadAdsApi* | [**adAccountsSubscriptions/getList**](Apis/LeadAdsApi.md#adaccountssubscriptions/getlist) | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions | Get lead ads subscriptions |
*LeadAdsApi* | [**adAccountsSubscriptions/post**](Apis/LeadAdsApi.md#adaccountssubscriptions/post) | **POST** /ad_accounts/{ad_account_id}/leads/subscriptions | Create lead ads subscription |
| *LeadFormsApi* | [**leadForm/get**](Apis/LeadFormsApi.md#leadform/get) | **GET** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id} | Get lead form by id |
*LeadFormsApi* | [**leadFormTest/create**](Apis/LeadFormsApi.md#leadformtest/create) | **POST** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test | Create lead form test data |
*LeadFormsApi* | [**leadForms/create**](Apis/LeadFormsApi.md#leadforms/create) | **POST** /ad_accounts/{ad_account_id}/lead_forms | Create lead forms |
*LeadFormsApi* | [**leadForms/list**](Apis/LeadFormsApi.md#leadforms/list) | **GET** /ad_accounts/{ad_account_id}/lead_forms | List lead forms |
*LeadFormsApi* | [**leadForms/update**](Apis/LeadFormsApi.md#leadforms/update) | **PATCH** /ad_accounts/{ad_account_id}/lead_forms | Update lead forms |
| *LeadsExportApi* | [**leadsExport/create**](Apis/LeadsExportApi.md#leadsexport/create) | **POST** /ad_accounts/{ad_account_id}/leads_export | Create a request to export leads collected from a lead ad |
*LeadsExportApi* | [**leadsExport/get**](Apis/LeadsExportApi.md#leadsexport/get) | **GET** /ad_accounts/{ad_account_id}/leads_export/{leads_export_id} | Get the lead export from the lead export create call |
| *MediaApi* | [**media/create**](Apis/MediaApi.md#media/create) | **POST** /media | Register media upload |
*MediaApi* | [**media/get**](Apis/MediaApi.md#media/get) | **GET** /media/{media_id} | Get media upload details |
*MediaApi* | [**media/list**](Apis/MediaApi.md#media/list) | **GET** /media | List media uploads |
| *OauthApi* | [**oauth/token**](Apis/OauthApi.md#oauth/token) | **POST** /oauth/token | Generate OAuth access token |
| *OrderLinesApi* | [**orderLines/get**](Apis/OrderLinesApi.md#orderlines/get) | **GET** /ad_accounts/{ad_account_id}/order_lines/{order_line_id} | Get order line |
*OrderLinesApi* | [**orderLines/list**](Apis/OrderLinesApi.md#orderlines/list) | **GET** /ad_accounts/{ad_account_id}/order_lines | Get order lines |
| *PinsApi* | [**multiPins/analytics**](Apis/PinsApi.md#multipins/analytics) | **GET** /pins/analytics | Get multiple Pin analytics |
*PinsApi* | [**pins/analytics**](Apis/PinsApi.md#pins/analytics) | **GET** /pins/{pin_id}/analytics | Get Pin analytics |
*PinsApi* | [**pins/create**](Apis/PinsApi.md#pins/create) | **POST** /pins | Create Pin |
*PinsApi* | [**pins/delete**](Apis/PinsApi.md#pins/delete) | **DELETE** /pins/{pin_id} | Delete Pin |
*PinsApi* | [**pins/get**](Apis/PinsApi.md#pins/get) | **GET** /pins/{pin_id} | Get Pin |
*PinsApi* | [**pins/list**](Apis/PinsApi.md#pins/list) | **GET** /pins | List Pins |
*PinsApi* | [**pins/save**](Apis/PinsApi.md#pins/save) | **POST** /pins/{pin_id}/save | Save Pin |
*PinsApi* | [**pins/update**](Apis/PinsApi.md#pins/update) | **PATCH** /pins/{pin_id} | Update Pin |
| *ProductGroupPromotionsApi* | [**productGroupPromotions/create**](Apis/ProductGroupPromotionsApi.md#productgrouppromotions/create) | **POST** /ad_accounts/{ad_account_id}/product_group_promotions | Create product group promotions |
*ProductGroupPromotionsApi* | [**productGroupPromotions/get**](Apis/ProductGroupPromotionsApi.md#productgrouppromotions/get) | **GET** /ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id} | Get a product group promotion by id |
*ProductGroupPromotionsApi* | [**productGroupPromotions/list**](Apis/ProductGroupPromotionsApi.md#productgrouppromotions/list) | **GET** /ad_accounts/{ad_account_id}/product_group_promotions | Get product group promotions |
*ProductGroupPromotionsApi* | [**productGroupPromotions/update**](Apis/ProductGroupPromotionsApi.md#productgrouppromotions/update) | **PATCH** /ad_accounts/{ad_account_id}/product_group_promotions | Update product group promotions |
*ProductGroupPromotionsApi* | [**productGroups/analytics**](Apis/ProductGroupPromotionsApi.md#productgroups/analytics) | **GET** /ad_accounts/{ad_account_id}/product_groups/analytics | Get product group analytics |
| *ResourcesApi* | [**adAccountCountries/get**](Apis/ResourcesApi.md#adaccountcountries/get) | **GET** /resources/ad_account_countries | Get ad accounts countries |
*ResourcesApi* | [**deliveryMetrics/get**](Apis/ResourcesApi.md#deliverymetrics/get) | **GET** /resources/delivery_metrics | Get available metrics' definitions |
*ResourcesApi* | [**interestTargetingOptions/get**](Apis/ResourcesApi.md#interesttargetingoptions/get) | **GET** /resources/targeting/interests/{interest_id} | Get interest details |
*ResourcesApi* | [**leadFormQuestions/get**](Apis/ResourcesApi.md#leadformquestions/get) | **GET** /resources/lead_form_questions | Get lead form questions |
*ResourcesApi* | [**metricsReadyState/get**](Apis/ResourcesApi.md#metricsreadystate/get) | **GET** /resources/metrics_ready_state | Get metrics ready state |
*ResourcesApi* | [**targetingOptions/get**](Apis/ResourcesApi.md#targetingoptions/get) | **GET** /resources/targeting/{targeting_type} | Get targeting options |
| *SearchApi* | [**searchPartnerPins**](Apis/SearchApi.md#searchpartnerpins) | **GET** /search/partner/pins | Search pins by a given search term |
*SearchApi* | [**searchUserBoards/get**](Apis/SearchApi.md#searchuserboards/get) | **GET** /search/boards | Search user's boards |
*SearchApi* | [**searchUserPins/list**](Apis/SearchApi.md#searchuserpins/list) | **GET** /search/pins | Search user's Pins |
| *TargetingTemplateApi* | [**targetingTemplate/create**](Apis/TargetingTemplateApi.md#targetingtemplate/create) | **POST** /ad_accounts/{ad_account_id}/targeting_templates | Create targeting templates |
*TargetingTemplateApi* | [**targetingTemplate/list**](Apis/TargetingTemplateApi.md#targetingtemplate/list) | **GET** /ad_accounts/{ad_account_id}/targeting_templates | List targeting templates |
*TargetingTemplateApi* | [**targetingTemplate/update**](Apis/TargetingTemplateApi.md#targetingtemplate/update) | **PATCH** /ad_accounts/{ad_account_id}/targeting_templates | Update targeting templates |
| *TermsApi* | [**termsRelated/list**](Apis/TermsApi.md#termsrelated/list) | **GET** /terms/related | List related terms |
*TermsApi* | [**termsSuggested/list**](Apis/TermsApi.md#termssuggested/list) | **GET** /terms/suggested | List suggested terms |
| *TermsOfServiceApi* | [**termsOfService/get**](Apis/TermsOfServiceApi.md#termsofservice/get) | **GET** /ad_accounts/{ad_account_id}/terms_of_service | Get terms of service |
| *UserAccountApi* | [**boardsUserFollows/list**](Apis/UserAccountApi.md#boardsuserfollows/list) | **GET** /user_account/following/boards | List following boards |
*UserAccountApi* | [**followUser/update**](Apis/UserAccountApi.md#followuser/update) | **POST** /user_account/following/{username} | Follow user |
*UserAccountApi* | [**followers/list**](Apis/UserAccountApi.md#followers/list) | **GET** /user_account/followers | List followers |
*UserAccountApi* | [**linkedBusinessAccounts/get**](Apis/UserAccountApi.md#linkedbusinessaccounts/get) | **GET** /user_account/businesses | List linked businesses |
*UserAccountApi* | [**unverifyWebsite/delete**](Apis/UserAccountApi.md#unverifywebsite/delete) | **DELETE** /user_account/websites | Unverify website |
*UserAccountApi* | [**userAccount/analytics**](Apis/UserAccountApi.md#useraccount/analytics) | **GET** /user_account/analytics | Get user account analytics |
*UserAccountApi* | [**userAccount/analytics/topPins**](Apis/UserAccountApi.md#useraccount/analytics/toppins) | **GET** /user_account/analytics/top_pins | Get user account top pins analytics |
*UserAccountApi* | [**userAccount/analytics/topVideoPins**](Apis/UserAccountApi.md#useraccount/analytics/topvideopins) | **GET** /user_account/analytics/top_video_pins | Get user account top video pins analytics |
*UserAccountApi* | [**userAccount/followedInterests**](Apis/UserAccountApi.md#useraccount/followedinterests) | **GET** /users/{username}/interests/follow | List following interests |
*UserAccountApi* | [**userAccount/get**](Apis/UserAccountApi.md#useraccount/get) | **GET** /user_account | Get user account |
*UserAccountApi* | [**userFollowing/get**](Apis/UserAccountApi.md#userfollowing/get) | **GET** /user_account/following | List following |
*UserAccountApi* | [**userWebsites/get**](Apis/UserAccountApi.md#userwebsites/get) | **GET** /user_account/websites | Get user websites |
*UserAccountApi* | [**verifyWebsite/update**](Apis/UserAccountApi.md#verifywebsite/update) | **POST** /user_account/websites | Verify website |
*UserAccountApi* | [**websiteVerification/get**](Apis/UserAccountApi.md#websiteverification/get) | **GET** /user_account/websites/verification | Get user verification code for website claiming |


<a name="documentation-for-models"></a>
## Documentation for Models

 - [Account](./Models/Account.md)
 - [ActionType](./Models/ActionType.md)
 - [AdAccount](./Models/AdAccount.md)
 - [AdAccountAnalyticsResponse_inner](./Models/AdAccountAnalyticsResponse_inner.md)
 - [AdAccountCreateRequest](./Models/AdAccountCreateRequest.md)
 - [AdAccountCreateSubscriptionRequest](./Models/AdAccountCreateSubscriptionRequest.md)
 - [AdAccountCreateSubscriptionRequest_partner_metadata](./Models/AdAccountCreateSubscriptionRequest_partner_metadata.md)
 - [AdAccountCreateSubscriptionResponse](./Models/AdAccountCreateSubscriptionResponse.md)
 - [AdAccountGetSubscriptionResponse](./Models/AdAccountGetSubscriptionResponse.md)
 - [AdAccountsCountryResponse](./Models/AdAccountsCountryResponse.md)
 - [AdAccountsCountryResponseData](./Models/AdAccountsCountryResponseData.md)
 - [AdArrayResponse](./Models/AdArrayResponse.md)
 - [AdArrayResponseElement](./Models/AdArrayResponseElement.md)
 - [AdCommon](./Models/AdCommon.md)
 - [AdCountry](./Models/AdCountry.md)
 - [AdCreateRequest](./Models/AdCreateRequest.md)
 - [AdGroupArrayResponse](./Models/AdGroupArrayResponse.md)
 - [AdGroupArrayResponseElement](./Models/AdGroupArrayResponseElement.md)
 - [AdGroupAudienceSizingRequest](./Models/AdGroupAudienceSizingRequest.md)
 - [AdGroupAudienceSizingRequest_keywords_inner](./Models/AdGroupAudienceSizingRequest_keywords_inner.md)
 - [AdGroupAudienceSizingResponse](./Models/AdGroupAudienceSizingResponse.md)
 - [AdGroupCommon](./Models/AdGroupCommon.md)
 - [AdGroupCreateRequest](./Models/AdGroupCreateRequest.md)
 - [AdGroupResponse](./Models/AdGroupResponse.md)
 - [AdGroupSummaryStatus](./Models/AdGroupSummaryStatus.md)
 - [AdGroupUpdateRequest](./Models/AdGroupUpdateRequest.md)
 - [AdGroupsAnalyticsResponse_inner](./Models/AdGroupsAnalyticsResponse_inner.md)
 - [AdPinId](./Models/AdPinId.md)
 - [AdPreviewCreateFromImage](./Models/AdPreviewCreateFromImage.md)
 - [AdPreviewCreateFromPin](./Models/AdPreviewCreateFromPin.md)
 - [AdPreviewRequest](./Models/AdPreviewRequest.md)
 - [AdPreviewURLResponse](./Models/AdPreviewURLResponse.md)
 - [AdResponse](./Models/AdResponse.md)
 - [AdUpdateRequest](./Models/AdUpdateRequest.md)
 - [Ad_account_owner](./Models/Ad_account_owner.md)
 - [AdsAnalyticsAdTargetingType](./Models/AdsAnalyticsAdTargetingType.md)
 - [AdsAnalyticsCampaignTargetingType](./Models/AdsAnalyticsCampaignTargetingType.md)
 - [AdsAnalyticsCreateAsyncRequest](./Models/AdsAnalyticsCreateAsyncRequest.md)
 - [AdsAnalyticsCreateAsyncResponse](./Models/AdsAnalyticsCreateAsyncResponse.md)
 - [AdsAnalyticsFilterColumn](./Models/AdsAnalyticsFilterColumn.md)
 - [AdsAnalyticsFilterOperator](./Models/AdsAnalyticsFilterOperator.md)
 - [AdsAnalyticsGetAsyncResponse](./Models/AdsAnalyticsGetAsyncResponse.md)
 - [AdsAnalyticsMetricsFilter](./Models/AdsAnalyticsMetricsFilter.md)
 - [AdsAnalyticsResponse_inner](./Models/AdsAnalyticsResponse_inner.md)
 - [AdsAnalyticsTargetingType](./Models/AdsAnalyticsTargetingType.md)
 - [AdsCreditDiscountsResponse](./Models/AdsCreditDiscountsResponse.md)
 - [AdsCreditRedeemRequest](./Models/AdsCreditRedeemRequest.md)
 - [AdsCreditRedeemResponse](./Models/AdsCreditRedeemResponse.md)
 - [AdvancedAuctionBidOptions](./Models/AdvancedAuctionBidOptions.md)
 - [AdvancedAuctionItem](./Models/AdvancedAuctionItem.md)
 - [AdvancedAuctionItems](./Models/AdvancedAuctionItems.md)
 - [AdvancedAuctionItemsGetRecord](./Models/AdvancedAuctionItemsGetRecord.md)
 - [AdvancedAuctionItemsGetRequest](./Models/AdvancedAuctionItemsGetRequest.md)
 - [AdvancedAuctionItemsSubmitDeleteRecord](./Models/AdvancedAuctionItemsSubmitDeleteRecord.md)
 - [AdvancedAuctionItemsSubmitRecord](./Models/AdvancedAuctionItemsSubmitRecord.md)
 - [AdvancedAuctionItemsSubmitRequest](./Models/AdvancedAuctionItemsSubmitRequest.md)
 - [AdvancedAuctionItemsSubmitUpsertRecord](./Models/AdvancedAuctionItemsSubmitUpsertRecord.md)
 - [AdvancedAuctionKey](./Models/AdvancedAuctionKey.md)
 - [AdvancedAuctionOperation](./Models/AdvancedAuctionOperation.md)
 - [AdvancedAuctionOperationError](./Models/AdvancedAuctionOperationError.md)
 - [AdvancedAuctionProcessedItem](./Models/AdvancedAuctionProcessedItem.md)
 - [AdvancedAuctionProcessedItems](./Models/AdvancedAuctionProcessedItems.md)
 - [AnalyticsDailyMetrics](./Models/AnalyticsDailyMetrics.md)
 - [AnalyticsMetricsResponse](./Models/AnalyticsMetricsResponse.md)
 - [AppTypeMultipliers](./Models/AppTypeMultipliers.md)
 - [AssetGroupBinding](./Models/AssetGroupBinding.md)
 - [AssetGroupType](./Models/AssetGroupType.md)
 - [AssetIdPermissions](./Models/AssetIdPermissions.md)
 - [Audience](./Models/Audience.md)
 - [AudienceAccountType](./Models/AudienceAccountType.md)
 - [AudienceCategory](./Models/AudienceCategory.md)
 - [AudienceCommon](./Models/AudienceCommon.md)
 - [AudienceCreateCustomRequest](./Models/AudienceCreateCustomRequest.md)
 - [AudienceCreateRequest](./Models/AudienceCreateRequest.md)
 - [AudienceCreateRequest_1_audience_type](./Models/AudienceCreateRequest_1_audience_type.md)
 - [AudienceDataParty](./Models/AudienceDataParty.md)
 - [AudienceDefinition](./Models/AudienceDefinition.md)
 - [AudienceDefinitionResponse](./Models/AudienceDefinitionResponse.md)
 - [AudienceDemographicValue](./Models/AudienceDemographicValue.md)
 - [AudienceDemographics](./Models/AudienceDemographics.md)
 - [AudienceInsightCategoryArrayResponse](./Models/AudienceInsightCategoryArrayResponse.md)
 - [AudienceInsightCategoryCommon](./Models/AudienceInsightCategoryCommon.md)
 - [AudienceInsightType](./Models/AudienceInsightType.md)
 - [AudienceInsightsResponse](./Models/AudienceInsightsResponse.md)
 - [AudienceRule](./Models/AudienceRule.md)
 - [AudienceShareType](./Models/AudienceShareType.md)
 - [AudienceSharingType](./Models/AudienceSharingType.md)
 - [AudienceSubcategory](./Models/AudienceSubcategory.md)
 - [AudienceType](./Models/AudienceType.md)
 - [AudienceUpdateOperationType](./Models/AudienceUpdateOperationType.md)
 - [AudienceUpdateRequest](./Models/AudienceUpdateRequest.md)
 - [AuthRespondInvitesBody](./Models/AuthRespondInvitesBody.md)
 - [AuthRespondInvitesBody_invites_inner](./Models/AuthRespondInvitesBody_invites_inner.md)
 - [AuthRespondInvitesBody_invites_inner_action](./Models/AuthRespondInvitesBody_invites_inner_action.md)
 - [AvailabilityFilter](./Models/AvailabilityFilter.md)
 - [BaseInviteDataResponse](./Models/BaseInviteDataResponse.md)
 - [BaseInviteDataResponse_invite_data](./Models/BaseInviteDataResponse_invite_data.md)
 - [BatchOperation](./Models/BatchOperation.md)
 - [BatchOperationStatus](./Models/BatchOperationStatus.md)
 - [BidFloor](./Models/BidFloor.md)
 - [BidFloorRequest](./Models/BidFloorRequest.md)
 - [BidFloorSpec](./Models/BidFloorSpec.md)
 - [BillingProfilesResponse](./Models/BillingProfilesResponse.md)
 - [Board](./Models/Board.md)
 - [BoardOwner](./Models/BoardOwner.md)
 - [BoardSection](./Models/BoardSection.md)
 - [BoardUpdate](./Models/BoardUpdate.md)
 - [Board_media](./Models/Board_media.md)
 - [BookClosedResponse](./Models/BookClosedResponse.md)
 - [BrandFilter](./Models/BrandFilter.md)
 - [BudgetType](./Models/BudgetType.md)
 - [BulkDownloadRequest](./Models/BulkDownloadRequest.md)
 - [BulkDownloadRequest_campaign_filter](./Models/BulkDownloadRequest_campaign_filter.md)
 - [BulkDownloadResponse](./Models/BulkDownloadResponse.md)
 - [BulkEntityType](./Models/BulkEntityType.md)
 - [BulkOutputFormat](./Models/BulkOutputFormat.md)
 - [BulkReportingJobStatus](./Models/BulkReportingJobStatus.md)
 - [BulkUpsertRequest](./Models/BulkUpsertRequest.md)
 - [BulkUpsertRequestCreate](./Models/BulkUpsertRequestCreate.md)
 - [BulkUpsertRequestUpdate](./Models/BulkUpsertRequestUpdate.md)
 - [BulkUpsertResponse](./Models/BulkUpsertResponse.md)
 - [BulkUpsertStatus](./Models/BulkUpsertStatus.md)
 - [BulkUpsertStatusResponse](./Models/BulkUpsertStatusResponse.md)
 - [BusinessAccessError](./Models/BusinessAccessError.md)
 - [BusinessAccessRole](./Models/BusinessAccessRole.md)
 - [BusinessAccessUserSummary](./Models/BusinessAccessUserSummary.md)
 - [BusinessMemberAssetsSummary](./Models/BusinessMemberAssetsSummary.md)
 - [BusinessMemberAssetsSummary_ad_accounts_inner](./Models/BusinessMemberAssetsSummary_ad_accounts_inner.md)
 - [BusinessMemberAssetsSummary_profiles_inner](./Models/BusinessMemberAssetsSummary_profiles_inner.md)
 - [BusinessRole](./Models/BusinessRole.md)
 - [BusinessRoleCheckMode](./Models/BusinessRoleCheckMode.md)
 - [BusinessRoleForMembers](./Models/BusinessRoleForMembers.md)
 - [BusinessSharedAudience](./Models/BusinessSharedAudience.md)
 - [BusinessSharedAudienceResponse](./Models/BusinessSharedAudienceResponse.md)
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
 - [CancelInvitesBody](./Models/CancelInvitesBody.md)
 - [Catalog](./Models/Catalog.md)
 - [CatalogsCreateCreativeAssetsItem](./Models/CatalogsCreateCreativeAssetsItem.md)
 - [CatalogsCreateHotelItem](./Models/CatalogsCreateHotelItem.md)
 - [CatalogsCreateReportResponse](./Models/CatalogsCreateReportResponse.md)
 - [CatalogsCreateRequest](./Models/CatalogsCreateRequest.md)
 - [CatalogsCreateRetailItem](./Models/CatalogsCreateRetailItem.md)
 - [CatalogsCreativeAssetsAttributes](./Models/CatalogsCreativeAssetsAttributes.md)
 - [CatalogsCreativeAssetsBatchItem](./Models/CatalogsCreativeAssetsBatchItem.md)
 - [CatalogsCreativeAssetsBatchRequest](./Models/CatalogsCreativeAssetsBatchRequest.md)
 - [CatalogsCreativeAssetsFeed](./Models/CatalogsCreativeAssetsFeed.md)
 - [CatalogsCreativeAssetsFeedsCreateRequest](./Models/CatalogsCreativeAssetsFeedsCreateRequest.md)
 - [CatalogsCreativeAssetsFeedsUpdateRequest](./Models/CatalogsCreativeAssetsFeedsUpdateRequest.md)
 - [CatalogsCreativeAssetsItemErrorResponse](./Models/CatalogsCreativeAssetsItemErrorResponse.md)
 - [CatalogsCreativeAssetsItemResponse](./Models/CatalogsCreativeAssetsItemResponse.md)
 - [CatalogsCreativeAssetsItemsBatch](./Models/CatalogsCreativeAssetsItemsBatch.md)
 - [CatalogsCreativeAssetsItemsFilter](./Models/CatalogsCreativeAssetsItemsFilter.md)
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
 - [CatalogsDbItem](./Models/CatalogsDbItem.md)
 - [CatalogsDeleteCreativeAssetsItem](./Models/CatalogsDeleteCreativeAssetsItem.md)
 - [CatalogsDeleteHotelItem](./Models/CatalogsDeleteHotelItem.md)
 - [CatalogsDeleteRetailItem](./Models/CatalogsDeleteRetailItem.md)
 - [CatalogsFeed](./Models/CatalogsFeed.md)
 - [CatalogsFeedCredentials](./Models/CatalogsFeedCredentials.md)
 - [CatalogsFeedIngestion](./Models/CatalogsFeedIngestion.md)
 - [CatalogsFeedIngestionDetails](./Models/CatalogsFeedIngestionDetails.md)
 - [CatalogsFeedIngestionErrors](./Models/CatalogsFeedIngestionErrors.md)
 - [CatalogsFeedIngestionInfo](./Models/CatalogsFeedIngestionInfo.md)
 - [CatalogsFeedIngestionWarnings](./Models/CatalogsFeedIngestionWarnings.md)
 - [CatalogsFeedProcessingResult](./Models/CatalogsFeedProcessingResult.md)
 - [CatalogsFeedProcessingSchedule](./Models/CatalogsFeedProcessingSchedule.md)
 - [CatalogsFeedProcessingStatus](./Models/CatalogsFeedProcessingStatus.md)
 - [CatalogsFeedProductCounts](./Models/CatalogsFeedProductCounts.md)
 - [CatalogsFeedValidationDetails](./Models/CatalogsFeedValidationDetails.md)
 - [CatalogsFeedValidationErrors](./Models/CatalogsFeedValidationErrors.md)
 - [CatalogsFeedValidationWarnings](./Models/CatalogsFeedValidationWarnings.md)
 - [CatalogsFeedsCreateRequest](./Models/CatalogsFeedsCreateRequest.md)
 - [CatalogsFeedsCreateRequest_default_locale](./Models/CatalogsFeedsCreateRequest_default_locale.md)
 - [CatalogsFeedsUpdateRequest](./Models/CatalogsFeedsUpdateRequest.md)
 - [CatalogsFormat](./Models/CatalogsFormat.md)
 - [CatalogsHotelAddress](./Models/CatalogsHotelAddress.md)
 - [CatalogsHotelAttributes](./Models/CatalogsHotelAttributes.md)
 - [CatalogsHotelAttributes_allOf_main_image](./Models/CatalogsHotelAttributes_allOf_main_image.md)
 - [CatalogsHotelBatchItem](./Models/CatalogsHotelBatchItem.md)
 - [CatalogsHotelBatchRequest](./Models/CatalogsHotelBatchRequest.md)
 - [CatalogsHotelFeed](./Models/CatalogsHotelFeed.md)
 - [CatalogsHotelFeedsCreateRequest](./Models/CatalogsHotelFeedsCreateRequest.md)
 - [CatalogsHotelFeedsUpdateRequest](./Models/CatalogsHotelFeedsUpdateRequest.md)
 - [CatalogsHotelGuestRatings](./Models/CatalogsHotelGuestRatings.md)
 - [CatalogsHotelItemErrorResponse](./Models/CatalogsHotelItemErrorResponse.md)
 - [CatalogsHotelItemResponse](./Models/CatalogsHotelItemResponse.md)
 - [CatalogsHotelItemsBatch](./Models/CatalogsHotelItemsBatch.md)
 - [CatalogsHotelItemsFilter](./Models/CatalogsHotelItemsFilter.md)
 - [CatalogsHotelItemsPostFilter](./Models/CatalogsHotelItemsPostFilter.md)
 - [CatalogsHotelListProductsByCatalogBasedFilterRequest](./Models/CatalogsHotelListProductsByCatalogBasedFilterRequest.md)
 - [CatalogsHotelProduct](./Models/CatalogsHotelProduct.md)
 - [CatalogsHotelProductGroup](./Models/CatalogsHotelProductGroup.md)
 - [CatalogsHotelProductGroupCreateRequest](./Models/CatalogsHotelProductGroupCreateRequest.md)
 - [CatalogsHotelProductGroupFilterKeys](./Models/CatalogsHotelProductGroupFilterKeys.md)
 - [CatalogsHotelProductGroupFilters](./Models/CatalogsHotelProductGroupFilters.md)
 - [CatalogsHotelProductGroupFiltersAllOf](./Models/CatalogsHotelProductGroupFiltersAllOf.md)
 - [CatalogsHotelProductGroupFiltersAnyOf](./Models/CatalogsHotelProductGroupFiltersAnyOf.md)
 - [CatalogsHotelProductGroupProductCounts](./Models/CatalogsHotelProductGroupProductCounts.md)
 - [CatalogsHotelProductGroupUpdateRequest](./Models/CatalogsHotelProductGroupUpdateRequest.md)
 - [CatalogsHotelProductMetadata](./Models/CatalogsHotelProductMetadata.md)
 - [CatalogsHotelReportParameters](./Models/CatalogsHotelReportParameters.md)
 - [CatalogsHotelReportParameters_report](./Models/CatalogsHotelReportParameters_report.md)
 - [CatalogsItemValidationDetails](./Models/CatalogsItemValidationDetails.md)
 - [CatalogsItemValidationErrors](./Models/CatalogsItemValidationErrors.md)
 - [CatalogsItemValidationIssue](./Models/CatalogsItemValidationIssue.md)
 - [CatalogsItemValidationIssues](./Models/CatalogsItemValidationIssues.md)
 - [CatalogsItemValidationWarnings](./Models/CatalogsItemValidationWarnings.md)
 - [CatalogsItems](./Models/CatalogsItems.md)
 - [CatalogsItemsBatch](./Models/CatalogsItemsBatch.md)
 - [CatalogsItemsBatchRequest](./Models/CatalogsItemsBatchRequest.md)
 - [CatalogsItemsCreateBatchRequest](./Models/CatalogsItemsCreateBatchRequest.md)
 - [CatalogsItemsDeleteBatchRequest](./Models/CatalogsItemsDeleteBatchRequest.md)
 - [CatalogsItemsDeleteDiscontinuedBatchRequest](./Models/CatalogsItemsDeleteDiscontinuedBatchRequest.md)
 - [CatalogsItemsFilters](./Models/CatalogsItemsFilters.md)
 - [CatalogsItemsPostFilters](./Models/CatalogsItemsPostFilters.md)
 - [CatalogsItemsRequest](./Models/CatalogsItemsRequest.md)
 - [CatalogsItemsRequest_language](./Models/CatalogsItemsRequest_language.md)
 - [CatalogsItemsUpdateBatchRequest](./Models/CatalogsItemsUpdateBatchRequest.md)
 - [CatalogsItemsUpsertBatchRequest](./Models/CatalogsItemsUpsertBatchRequest.md)
 - [CatalogsListProductsByFeedBasedFilter](./Models/CatalogsListProductsByFeedBasedFilter.md)
 - [CatalogsListProductsByFilterRequest](./Models/CatalogsListProductsByFilterRequest.md)
 - [CatalogsLocale](./Models/CatalogsLocale.md)
 - [CatalogsProduct](./Models/CatalogsProduct.md)
 - [CatalogsProductGroupCreateRequest](./Models/CatalogsProductGroupCreateRequest.md)
 - [CatalogsProductGroupCurrencyCriteria](./Models/CatalogsProductGroupCurrencyCriteria.md)
 - [CatalogsProductGroupFilterKeys](./Models/CatalogsProductGroupFilterKeys.md)
 - [CatalogsProductGroupFilters](./Models/CatalogsProductGroupFilters.md)
 - [CatalogsProductGroupFiltersAllOf](./Models/CatalogsProductGroupFiltersAllOf.md)
 - [CatalogsProductGroupFiltersAnyOf](./Models/CatalogsProductGroupFiltersAnyOf.md)
 - [CatalogsProductGroupFiltersRequest](./Models/CatalogsProductGroupFiltersRequest.md)
 - [CatalogsProductGroupFiltersRequest_anyOf](./Models/CatalogsProductGroupFiltersRequest_anyOf.md)
 - [CatalogsProductGroupFiltersRequest_anyOf_1](./Models/CatalogsProductGroupFiltersRequest_anyOf_1.md)
 - [CatalogsProductGroupMultipleCountriesCriteria](./Models/CatalogsProductGroupMultipleCountriesCriteria.md)
 - [CatalogsProductGroupMultipleGenderCriteria](./Models/CatalogsProductGroupMultipleGenderCriteria.md)
 - [CatalogsProductGroupMultipleMediaTypesCriteria](./Models/CatalogsProductGroupMultipleMediaTypesCriteria.md)
 - [CatalogsProductGroupMultipleStringCriteria](./Models/CatalogsProductGroupMultipleStringCriteria.md)
 - [CatalogsProductGroupMultipleStringListCriteria](./Models/CatalogsProductGroupMultipleStringListCriteria.md)
 - [CatalogsProductGroupPricingCriteria](./Models/CatalogsProductGroupPricingCriteria.md)
 - [CatalogsProductGroupProductCountsVertical](./Models/CatalogsProductGroupProductCountsVertical.md)
 - [CatalogsProductGroupStatus](./Models/CatalogsProductGroupStatus.md)
 - [CatalogsProductGroupType](./Models/CatalogsProductGroupType.md)
 - [CatalogsProductGroupUpdateRequest](./Models/CatalogsProductGroupUpdateRequest.md)
 - [CatalogsReport](./Models/CatalogsReport.md)
 - [CatalogsReportDistributionIssueFilter](./Models/CatalogsReportDistributionIssueFilter.md)
 - [CatalogsReportDistributionStats](./Models/CatalogsReportDistributionStats.md)
 - [CatalogsReportFeedIngestionFilter](./Models/CatalogsReportFeedIngestionFilter.md)
 - [CatalogsReportFeedIngestionStats](./Models/CatalogsReportFeedIngestionStats.md)
 - [CatalogsReportParameters](./Models/CatalogsReportParameters.md)
 - [CatalogsReportStats](./Models/CatalogsReportStats.md)
 - [CatalogsRetailBatchRequest](./Models/CatalogsRetailBatchRequest.md)
 - [CatalogsRetailBatchRequest_items_inner](./Models/CatalogsRetailBatchRequest_items_inner.md)
 - [CatalogsRetailFeed](./Models/CatalogsRetailFeed.md)
 - [CatalogsRetailFeedsCreateRequest](./Models/CatalogsRetailFeedsCreateRequest.md)
 - [CatalogsRetailFeedsUpdateRequest](./Models/CatalogsRetailFeedsUpdateRequest.md)
 - [CatalogsRetailItemErrorResponse](./Models/CatalogsRetailItemErrorResponse.md)
 - [CatalogsRetailItemResponse](./Models/CatalogsRetailItemResponse.md)
 - [CatalogsRetailItemsBatch](./Models/CatalogsRetailItemsBatch.md)
 - [CatalogsRetailItemsFilter](./Models/CatalogsRetailItemsFilter.md)
 - [CatalogsRetailItemsPostFilter](./Models/CatalogsRetailItemsPostFilter.md)
 - [CatalogsRetailListProductsByCatalogBasedFilterRequest](./Models/CatalogsRetailListProductsByCatalogBasedFilterRequest.md)
 - [CatalogsRetailProduct](./Models/CatalogsRetailProduct.md)
 - [CatalogsRetailProductGroup](./Models/CatalogsRetailProductGroup.md)
 - [CatalogsRetailProductGroupCreateRequest](./Models/CatalogsRetailProductGroupCreateRequest.md)
 - [CatalogsRetailProductGroupProductCounts](./Models/CatalogsRetailProductGroupProductCounts.md)
 - [CatalogsRetailProductGroupUpdateRequest](./Models/CatalogsRetailProductGroupUpdateRequest.md)
 - [CatalogsRetailProductMetadata](./Models/CatalogsRetailProductMetadata.md)
 - [CatalogsRetailReportParameters](./Models/CatalogsRetailReportParameters.md)
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
 - [ConditionFilter](./Models/ConditionFilter.md)
 - [ConversionApiResponse](./Models/ConversionApiResponse.md)
 - [ConversionApiResponse_events_inner](./Models/ConversionApiResponse_events_inner.md)
 - [ConversionAttributionWindowDays](./Models/ConversionAttributionWindowDays.md)
 - [ConversionEventResponse](./Models/ConversionEventResponse.md)
 - [ConversionEvents](./Models/ConversionEvents.md)
 - [ConversionEventsUserData](./Models/ConversionEventsUserData.md)
 - [ConversionEventsUserData_anyOf](./Models/ConversionEventsUserData_anyOf.md)
 - [ConversionEventsUserData_anyOf_1](./Models/ConversionEventsUserData_anyOf_1.md)
 - [ConversionEventsUserData_anyOf_2](./Models/ConversionEventsUserData_anyOf_2.md)
 - [ConversionEvents_data_inner](./Models/ConversionEvents_data_inner.md)
 - [ConversionEvents_data_inner_custom_data](./Models/ConversionEvents_data_inner_custom_data.md)
 - [ConversionEvents_data_inner_custom_data_contents_inner](./Models/ConversionEvents_data_inner_custom_data_contents_inner.md)
 - [ConversionReportAttributionType](./Models/ConversionReportAttributionType.md)
 - [ConversionReportTimeType](./Models/ConversionReportTimeType.md)
 - [ConversionTagCommon](./Models/ConversionTagCommon.md)
 - [ConversionTagConfigs](./Models/ConversionTagConfigs.md)
 - [ConversionTagCreate](./Models/ConversionTagCreate.md)
 - [ConversionTagListResponse](./Models/ConversionTagListResponse.md)
 - [ConversionTagResponse](./Models/ConversionTagResponse.md)
 - [ConversionTagType](./Models/ConversionTagType.md)
 - [Country](./Models/Country.md)
 - [CountryFilter](./Models/CountryFilter.md)
 - [CreateAssetAccessRequestBody](./Models/CreateAssetAccessRequestBody.md)
 - [CreateAssetAccessRequestBody_asset_requests_inner](./Models/CreateAssetAccessRequestBody_asset_requests_inner.md)
 - [CreateAssetAccessRequestErrorMessage_inner](./Models/CreateAssetAccessRequestErrorMessage_inner.md)
 - [CreateAssetAccessRequestResponse](./Models/CreateAssetAccessRequestResponse.md)
 - [CreateAssetGroupBody](./Models/CreateAssetGroupBody.md)
 - [CreateAssetGroupResponse](./Models/CreateAssetGroupResponse.md)
 - [CreateAssetInvitesRequest](./Models/CreateAssetInvitesRequest.md)
 - [CreateAssetInvitesRequestItem](./Models/CreateAssetInvitesRequestItem.md)
 - [CreateInvitesResultsResponseArray](./Models/CreateInvitesResultsResponseArray.md)
 - [CreateInvitesResultsResponseArray_items_inner](./Models/CreateInvitesResultsResponseArray_items_inner.md)
 - [CreateInvitesResultsResponseArray_items_inner_invite](./Models/CreateInvitesResultsResponseArray_items_inner_invite.md)
 - [CreateMMMReportRequest](./Models/CreateMMMReportRequest.md)
 - [CreateMMMReportResponse](./Models/CreateMMMReportResponse.md)
 - [CreateMMMReportResponseData](./Models/CreateMMMReportResponseData.md)
 - [CreateMembershipOrPartnershipInvitesBody](./Models/CreateMembershipOrPartnershipInvitesBody.md)
 - [CreativeAssetsIdFilter](./Models/CreativeAssetsIdFilter.md)
 - [CreativeAssetsProcessingRecord](./Models/CreativeAssetsProcessingRecord.md)
 - [CreativeAssetsVisibilityType](./Models/CreativeAssetsVisibilityType.md)
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
 - [DeleteAssetGroupBody](./Models/DeleteAssetGroupBody.md)
 - [DeleteAssetGroupResponse](./Models/DeleteAssetGroupResponse.md)
 - [DeleteAssetGroupResponse_exceptions_inner](./Models/DeleteAssetGroupResponse_exceptions_inner.md)
 - [DeleteInvitesResultsResponseArray](./Models/DeleteInvitesResultsResponseArray.md)
 - [DeleteInvitesResultsResponseArray_items_inner](./Models/DeleteInvitesResultsResponseArray_items_inner.md)
 - [DeleteInvitesResultsResponseArray_items_inner_exception](./Models/DeleteInvitesResultsResponseArray_items_inner_exception.md)
 - [DeleteMemberAccessResult](./Models/DeleteMemberAccessResult.md)
 - [DeleteMemberAccessResultsResponseArray](./Models/DeleteMemberAccessResultsResponseArray.md)
 - [DeletePartnerAssetAccessBody](./Models/DeletePartnerAssetAccessBody.md)
 - [DeletePartnerAssetAccessBody_accesses_inner](./Models/DeletePartnerAssetAccessBody_accesses_inner.md)
 - [DeletePartnerAssetsResult](./Models/DeletePartnerAssetsResult.md)
 - [DeletePartnerAssetsResultsResponseArray](./Models/DeletePartnerAssetsResultsResponseArray.md)
 - [DeletePartnersRequest](./Models/DeletePartnersRequest.md)
 - [DeletePartnersResponse](./Models/DeletePartnersResponse.md)
 - [DeletedMembersResponse](./Models/DeletedMembersResponse.md)
 - [DeliveryMetricsResponse](./Models/DeliveryMetricsResponse.md)
 - [DeliveryMetricsResponse_items_inner](./Models/DeliveryMetricsResponse_items_inner.md)
 - [DetailedError](./Models/DetailedError.md)
 - [EnhancedMatchStatusType](./Models/EnhancedMatchStatusType.md)
 - [EntityStatus](./Models/EntityStatus.md)
 - [Error](./Models/Error.md)
 - [Exception](./Models/Exception.md)
 - [FollowUserRequest](./Models/FollowUserRequest.md)
 - [Gender](./Models/Gender.md)
 - [GenderFilter](./Models/GenderFilter.md)
 - [GetAudiencesOrderBy](./Models/GetAudiencesOrderBy.md)
 - [GetBusinessAssetTypeResponse](./Models/GetBusinessAssetTypeResponse.md)
 - [GetBusinessAssetsResponse](./Models/GetBusinessAssetsResponse.md)
 - [GetMMMReportResponse](./Models/GetMMMReportResponse.md)
 - [GetMMMReportResponseData](./Models/GetMMMReportResponseData.md)
 - [GetPartnerAssetsResponse](./Models/GetPartnerAssetsResponse.md)
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
 - [ImageDetails](./Models/ImageDetails.md)
 - [ImageMetadata](./Models/ImageMetadata.md)
 - [ImageMetadata_images](./Models/ImageMetadata_images.md)
 - [IntegrationLog](./Models/IntegrationLog.md)
 - [IntegrationLogClientError](./Models/IntegrationLogClientError.md)
 - [IntegrationLogClientRequest](./Models/IntegrationLogClientRequest.md)
 - [IntegrationLogsInvalidLogResponse](./Models/IntegrationLogsInvalidLogResponse.md)
 - [IntegrationLogsInvalidLogResponse_rejected_logs_inner](./Models/IntegrationLogsInvalidLogResponse_rejected_logs_inner.md)
 - [IntegrationLogsRequest](./Models/IntegrationLogsRequest.md)
 - [IntegrationLogsSuccessResponse](./Models/IntegrationLogsSuccessResponse.md)
 - [IntegrationMetadata](./Models/IntegrationMetadata.md)
 - [IntegrationRecord](./Models/IntegrationRecord.md)
 - [IntegrationRequest](./Models/IntegrationRequest.md)
 - [IntegrationRequestPatch](./Models/IntegrationRequestPatch.md)
 - [Interest](./Models/Interest.md)
 - [InviteAssetsSummary](./Models/InviteAssetsSummary.md)
 - [InviteAssetsSummary_ad_accounts_inner](./Models/InviteAssetsSummary_ad_accounts_inner.md)
 - [InviteAssetsSummary_profiles_inner](./Models/InviteAssetsSummary_profiles_inner.md)
 - [InviteBusinessRoleBinding](./Models/InviteBusinessRoleBinding.md)
 - [InviteExceptionResponse](./Models/InviteExceptionResponse.md)
 - [InviteResponse](./Models/InviteResponse.md)
 - [InviteStatus](./Models/InviteStatus.md)
 - [InviteType](./Models/InviteType.md)
 - [ItemAttributes](./Models/ItemAttributes.md)
 - [ItemAttributesRequest](./Models/ItemAttributesRequest.md)
 - [ItemAttributesRequest_allOf_image_link](./Models/ItemAttributesRequest_allOf_image_link.md)
 - [ItemBatchRecord](./Models/ItemBatchRecord.md)
 - [ItemCreateBatchRecord](./Models/ItemCreateBatchRecord.md)
 - [ItemDeleteBatchRecord](./Models/ItemDeleteBatchRecord.md)
 - [ItemDeleteDiscontinuedBatchRecord](./Models/ItemDeleteDiscontinuedBatchRecord.md)
 - [ItemGroupIdFilter](./Models/ItemGroupIdFilter.md)
 - [ItemIdFilter](./Models/ItemIdFilter.md)
 - [ItemProcessingRecord](./Models/ItemProcessingRecord.md)
 - [ItemProcessingStatus](./Models/ItemProcessingStatus.md)
 - [ItemResponse](./Models/ItemResponse.md)
 - [ItemResponse_anyOf](./Models/ItemResponse_anyOf.md)
 - [ItemResponse_anyOf_1](./Models/ItemResponse_anyOf_1.md)
 - [ItemUpdateBatchRecord](./Models/ItemUpdateBatchRecord.md)
 - [ItemUpsertBatchRecord](./Models/ItemUpsertBatchRecord.md)
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
 - [LeadFormArrayResponse](./Models/LeadFormArrayResponse.md)
 - [LeadFormArrayResponse_items_inner](./Models/LeadFormArrayResponse_items_inner.md)
 - [LeadFormCommon](./Models/LeadFormCommon.md)
 - [LeadFormCommon_policy_links_inner](./Models/LeadFormCommon_policy_links_inner.md)
 - [LeadFormCreateRequest](./Models/LeadFormCreateRequest.md)
 - [LeadFormQuestion](./Models/LeadFormQuestion.md)
 - [LeadFormQuestionFieldType](./Models/LeadFormQuestionFieldType.md)
 - [LeadFormQuestionType](./Models/LeadFormQuestionType.md)
 - [LeadFormResponse](./Models/LeadFormResponse.md)
 - [LeadFormStatus](./Models/LeadFormStatus.md)
 - [LeadFormTestRequest](./Models/LeadFormTestRequest.md)
 - [LeadFormTestResponse](./Models/LeadFormTestResponse.md)
 - [LeadFormUpdateRequest](./Models/LeadFormUpdateRequest.md)
 - [LeadsExportCreateRequest](./Models/LeadsExportCreateRequest.md)
 - [LeadsExportCreateResponse](./Models/LeadsExportCreateResponse.md)
 - [LeadsExportResponseData](./Models/LeadsExportResponseData.md)
 - [LeadsExportStatus](./Models/LeadsExportStatus.md)
 - [LineItem](./Models/LineItem.md)
 - [LinkedBusiness](./Models/LinkedBusiness.md)
 - [MMMReportingColumn](./Models/MMMReportingColumn.md)
 - [MMMReportingTargetingType](./Models/MMMReportingTargetingType.md)
 - [MatchType](./Models/MatchType.md)
 - [MatchTypeResponse](./Models/MatchTypeResponse.md)
 - [MaxPriceFilter](./Models/MaxPriceFilter.md)
 - [MediaType](./Models/MediaType.md)
 - [MediaTypeFilter](./Models/MediaTypeFilter.md)
 - [MediaUpload](./Models/MediaUpload.md)
 - [MediaUploadDetails](./Models/MediaUploadDetails.md)
 - [MediaUploadRequest](./Models/MediaUploadRequest.md)
 - [MediaUploadStatus](./Models/MediaUploadStatus.md)
 - [MediaUploadType](./Models/MediaUploadType.md)
 - [MediaUpload_allOf_upload_parameters](./Models/MediaUpload_allOf_upload_parameters.md)
 - [MemberBusinessRole](./Models/MemberBusinessRole.md)
 - [MembersToDeleteBody](./Models/MembersToDeleteBody.md)
 - [MembersToDeleteBody_members_inner](./Models/MembersToDeleteBody_members_inner.md)
 - [MetricsReportingLevel](./Models/MetricsReportingLevel.md)
 - [MetricsResponse](./Models/MetricsResponse.md)
 - [MinPriceFilter](./Models/MinPriceFilter.md)
 - [NonNullableCatalogsCurrency](./Models/NonNullableCatalogsCurrency.md)
 - [NonNullableProductAvailabilityType](./Models/NonNullableProductAvailabilityType.md)
 - [NullableCatalogsItemFieldType](./Models/NullableCatalogsItemFieldType.md)
 - [NullableCurrency](./Models/NullableCurrency.md)
 - [OauthAccessTokenRequestClientCredentials](./Models/OauthAccessTokenRequestClientCredentials.md)
 - [OauthAccessTokenRequestCode](./Models/OauthAccessTokenRequestCode.md)
 - [OauthAccessTokenRequestRefresh](./Models/OauthAccessTokenRequestRefresh.md)
 - [OauthAccessTokenResponse](./Models/OauthAccessTokenResponse.md)
 - [OauthAccessTokenResponseClientCredentials](./Models/OauthAccessTokenResponseClientCredentials.md)
 - [OauthAccessTokenResponseCode](./Models/OauthAccessTokenResponseCode.md)
 - [OauthAccessTokenResponseEverlastingRefresh](./Models/OauthAccessTokenResponseEverlastingRefresh.md)
 - [OauthAccessTokenResponseIntegrationRefresh](./Models/OauthAccessTokenResponseIntegrationRefresh.md)
 - [OauthAccessTokenResponseRefresh](./Models/OauthAccessTokenResponseRefresh.md)
 - [ObjectiveType](./Models/ObjectiveType.md)
 - [OperationType](./Models/OperationType.md)
 - [OptimizationGoalMetadata](./Models/OptimizationGoalMetadata.md)
 - [OptimizationGoalMetadata_conversion_tag_v3_goal_metadata](./Models/OptimizationGoalMetadata_conversion_tag_v3_goal_metadata.md)
 - [OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows](./Models/OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows.md)
 - [OptimizationGoalMetadata_frequency_goal_metadata](./Models/OptimizationGoalMetadata_frequency_goal_metadata.md)
 - [OptimizationGoalMetadata_scrollup_goal_metadata](./Models/OptimizationGoalMetadata_scrollup_goal_metadata.md)
 - [OrderLine](./Models/OrderLine.md)
 - [OrderLineError](./Models/OrderLineError.md)
 - [OrderLinePaidType](./Models/OrderLinePaidType.md)
 - [OrderLineResponse](./Models/OrderLineResponse.md)
 - [OrderLineSingleResponse](./Models/OrderLineSingleResponse.md)
 - [OrderLineStatus](./Models/OrderLineStatus.md)
 - [OrderLines](./Models/OrderLines.md)
 - [OrderLinesArrayResponse](./Models/OrderLinesArrayResponse.md)
 - [PacingDeliveryType](./Models/PacingDeliveryType.md)
 - [Paginated](./Models/Paginated.md)
 - [PartnerType](./Models/PartnerType.md)
 - [Permissions](./Models/Permissions.md)
 - [PermissionsWithOwner](./Models/PermissionsWithOwner.md)
 - [Pin](./Models/Pin.md)
 - [PinAnalyticsMetricsResponse](./Models/PinAnalyticsMetricsResponse.md)
 - [PinAnalyticsMetricsResponse_daily_metrics_inner](./Models/PinAnalyticsMetricsResponse_daily_metrics_inner.md)
 - [PinCreate](./Models/PinCreate.md)
 - [PinMedia](./Models/PinMedia.md)
 - [PinMediaMetadata](./Models/PinMediaMetadata.md)
 - [PinMediaSource](./Models/PinMediaSource.md)
 - [PinMediaSourceImageBase64](./Models/PinMediaSourceImageBase64.md)
 - [PinMediaSourceImageURL](./Models/PinMediaSourceImageURL.md)
 - [PinMediaSourceImagesBase64](./Models/PinMediaSourceImagesBase64.md)
 - [PinMediaSourceImagesBase64_items_inner](./Models/PinMediaSourceImagesBase64_items_inner.md)
 - [PinMediaSourceImagesURL](./Models/PinMediaSourceImagesURL.md)
 - [PinMediaSourceImagesURL_items_inner](./Models/PinMediaSourceImagesURL_items_inner.md)
 - [PinMediaSourcePinURL](./Models/PinMediaSourcePinURL.md)
 - [PinMediaSourceVideoID](./Models/PinMediaSourceVideoID.md)
 - [PinMediaWithImage](./Models/PinMediaWithImage.md)
 - [PinMediaWithImageAndVideo](./Models/PinMediaWithImageAndVideo.md)
 - [PinMediaWithImage_allOf_images](./Models/PinMediaWithImage_allOf_images.md)
 - [PinMediaWithImages](./Models/PinMediaWithImages.md)
 - [PinMediaWithVideo](./Models/PinMediaWithVideo.md)
 - [PinMediaWithVideos](./Models/PinMediaWithVideos.md)
 - [PinPromotionSummaryStatus](./Models/PinPromotionSummaryStatus.md)
 - [PinUpdate](./Models/PinUpdate.md)
 - [PinUpdate_carousel_slots_inner](./Models/PinUpdate_carousel_slots_inner.md)
 - [PinterestTagEventData](./Models/PinterestTagEventData.md)
 - [PlacementGroupType](./Models/PlacementGroupType.md)
 - [PlacementMultipliers](./Models/PlacementMultipliers.md)
 - [PriceFilter](./Models/PriceFilter.md)
 - [ProductAvailabilityType](./Models/ProductAvailabilityType.md)
 - [ProductGroupAnalyticsResponse_inner](./Models/ProductGroupAnalyticsResponse_inner.md)
 - [ProductGroupPromotion](./Models/ProductGroupPromotion.md)
 - [ProductGroupPromotionCreateRequest](./Models/ProductGroupPromotionCreateRequest.md)
 - [ProductGroupPromotionCreateRequestElement](./Models/ProductGroupPromotionCreateRequestElement.md)
 - [ProductGroupPromotionResponse](./Models/ProductGroupPromotionResponse.md)
 - [ProductGroupPromotionResponseElement](./Models/ProductGroupPromotionResponseElement.md)
 - [ProductGroupPromotionResponseItem](./Models/ProductGroupPromotionResponseItem.md)
 - [ProductGroupPromotionUpdateRequest](./Models/ProductGroupPromotionUpdateRequest.md)
 - [ProductGroupReferenceFilter](./Models/ProductGroupReferenceFilter.md)
 - [ProductGroupSummaryStatus](./Models/ProductGroupSummaryStatus.md)
 - [ProductType0Filter](./Models/ProductType0Filter.md)
 - [ProductType1Filter](./Models/ProductType1Filter.md)
 - [ProductType2Filter](./Models/ProductType2Filter.md)
 - [ProductType3Filter](./Models/ProductType3Filter.md)
 - [ProductType4Filter](./Models/ProductType4Filter.md)
 - [QuizPinData](./Models/QuizPinData.md)
 - [QuizPinOption](./Models/QuizPinOption.md)
 - [QuizPinQuestion](./Models/QuizPinQuestion.md)
 - [QuizPinResult](./Models/QuizPinResult.md)
 - [RelatedTerms](./Models/RelatedTerms.md)
 - [RelatedTerms_related_terms_list_inner](./Models/RelatedTerms_related_terms_list_inner.md)
 - [ReportingColumnAsync](./Models/ReportingColumnAsync.md)
 - [RespondToInvitesResponseArray](./Models/RespondToInvitesResponseArray.md)
 - [RespondToInvitesResponseArray_items_inner](./Models/RespondToInvitesResponseArray_items_inner.md)
 - [Role](./Models/Role.md)
 - [SSIOAccountAddress](./Models/SSIOAccountAddress.md)
 - [SSIOAccountItem](./Models/SSIOAccountItem.md)
 - [SSIOAccountPMPName](./Models/SSIOAccountPMPName.md)
 - [SSIOAccountResponse](./Models/SSIOAccountResponse.md)
 - [SSIOCreateInsertionOrderRequest](./Models/SSIOCreateInsertionOrderRequest.md)
 - [SSIOCreateInsertionOrderResponse](./Models/SSIOCreateInsertionOrderResponse.md)
 - [SSIOEditInsertionOrderRequest](./Models/SSIOEditInsertionOrderRequest.md)
 - [SSIOEditInsertionOrderResponse](./Models/SSIOEditInsertionOrderResponse.md)
 - [SSIOInsertionOrderCommon](./Models/SSIOInsertionOrderCommon.md)
 - [SSIOInsertionOrderStatus](./Models/SSIOInsertionOrderStatus.md)
 - [SSIOInsertionOrderStatusResponse](./Models/SSIOInsertionOrderStatusResponse.md)
 - [SSIOOrderLine](./Models/SSIOOrderLine.md)
 - [SharedAudience](./Models/SharedAudience.md)
 - [SharedAudienceAccount](./Models/SharedAudienceAccount.md)
 - [SharedAudienceCommon](./Models/SharedAudienceCommon.md)
 - [SharedAudienceResponse](./Models/SharedAudienceResponse.md)
 - [SharedAudienceResponseCommon](./Models/SharedAudienceResponseCommon.md)
 - [SingleInterestTargetingOptionResponse](./Models/SingleInterestTargetingOptionResponse.md)
 - [SummaryPin](./Models/SummaryPin.md)
 - [TargetingAdvertiserCountry](./Models/TargetingAdvertiserCountry.md)
 - [TargetingSpec](./Models/TargetingSpec.md)
 - [TargetingSpecAppType](./Models/TargetingSpecAppType.md)
 - [TargetingSpec_SHOPPING_RETARGETING](./Models/TargetingSpec_SHOPPING_RETARGETING.md)
 - [TargetingTemplateAudienceSizing](./Models/TargetingTemplateAudienceSizing.md)
 - [TargetingTemplateAudienceSizing_reach_estimate](./Models/TargetingTemplateAudienceSizing_reach_estimate.md)
 - [TargetingTemplateCommon](./Models/TargetingTemplateCommon.md)
 - [TargetingTemplateCreate](./Models/TargetingTemplateCreate.md)
 - [TargetingTemplateGetResponseData](./Models/TargetingTemplateGetResponseData.md)
 - [TargetingTemplateKeyword](./Models/TargetingTemplateKeyword.md)
 - [TargetingTemplateResponseData](./Models/TargetingTemplateResponseData.md)
 - [TargetingTemplateUpdateRequest](./Models/TargetingTemplateUpdateRequest.md)
 - [TargetingTypeFilter](./Models/TargetingTypeFilter.md)
 - [TemplateResponse](./Models/TemplateResponse.md)
 - [TemplateResponse_date_range](./Models/TemplateResponse_date_range.md)
 - [TemplateResponse_date_range_absolute_date_range](./Models/TemplateResponse_date_range_absolute_date_range.md)
 - [TemplateResponse_date_range_dynamic_date_range](./Models/TemplateResponse_date_range_dynamic_date_range.md)
 - [TemplateResponse_date_range_relative_date_range](./Models/TemplateResponse_date_range_relative_date_range.md)
 - [TermsOfService](./Models/TermsOfService.md)
 - [TopPinsAnalyticsResponse](./Models/TopPinsAnalyticsResponse.md)
 - [TopPinsAnalyticsResponse_date_availability](./Models/TopPinsAnalyticsResponse_date_availability.md)
 - [TopPinsAnalyticsResponse_pins_inner](./Models/TopPinsAnalyticsResponse_pins_inner.md)
 - [TopVideoPinsAnalyticsResponse](./Models/TopVideoPinsAnalyticsResponse.md)
 - [TopVideoPinsAnalyticsResponse_pins_inner](./Models/TopVideoPinsAnalyticsResponse_pins_inner.md)
 - [TrackingUrls](./Models/TrackingUrls.md)
 - [TrendType](./Models/TrendType.md)
 - [TrendingKeywordsResponse](./Models/TrendingKeywordsResponse.md)
 - [TrendingKeywordsResponse_trends_inner](./Models/TrendingKeywordsResponse_trends_inner.md)
 - [TrendingKeywordsResponse_trends_inner_time_series](./Models/TrendingKeywordsResponse_trends_inner_time_series.md)
 - [TrendsSupportedRegion](./Models/TrendsSupportedRegion.md)
 - [UpdatableItemAttributes](./Models/UpdatableItemAttributes.md)
 - [UpdateAssetGroupBody](./Models/UpdateAssetGroupBody.md)
 - [UpdateAssetGroupBody_asset_groups_to_update_inner](./Models/UpdateAssetGroupBody_asset_groups_to_update_inner.md)
 - [UpdateAssetGroupResponse](./Models/UpdateAssetGroupResponse.md)
 - [UpdateAssetGroupResponse_exceptions_inner](./Models/UpdateAssetGroupResponse_exceptions_inner.md)
 - [UpdateInvitesResultsResponseArray](./Models/UpdateInvitesResultsResponseArray.md)
 - [UpdateInvitesResultsResponseArray_items_inner](./Models/UpdateInvitesResultsResponseArray_items_inner.md)
 - [UpdateMaskBidOptionField](./Models/UpdateMaskBidOptionField.md)
 - [UpdateMaskFieldType](./Models/UpdateMaskFieldType.md)
 - [UpdateMemberAssetAccessBody](./Models/UpdateMemberAssetAccessBody.md)
 - [UpdateMemberAssetAccessBody_accesses_inner](./Models/UpdateMemberAssetAccessBody_accesses_inner.md)
 - [UpdateMemberAssetsResultsResponseArray](./Models/UpdateMemberAssetsResultsResponseArray.md)
 - [UpdateMemberAssetsResultsResponseArray_items_inner](./Models/UpdateMemberAssetsResultsResponseArray_items_inner.md)
 - [UpdateMemberBusinessRoleBody](./Models/UpdateMemberBusinessRoleBody.md)
 - [UpdateMemberResult](./Models/UpdateMemberResult.md)
 - [UpdateMemberResultsResponseArray](./Models/UpdateMemberResultsResponseArray.md)
 - [UpdatePartnerAssetAccessBody](./Models/UpdatePartnerAssetAccessBody.md)
 - [UpdatePartnerAssetAccessBody_accesses_inner](./Models/UpdatePartnerAssetAccessBody_accesses_inner.md)
 - [UpdatePartnerAssetsResult](./Models/UpdatePartnerAssetsResult.md)
 - [UpdatePartnerAssetsResultsResponseArray](./Models/UpdatePartnerAssetsResultsResponseArray.md)
 - [UpdatePartnerResultsResponseArray](./Models/UpdatePartnerResultsResponseArray.md)
 - [UpdatePartnerResultsResponseArray_items_inner](./Models/UpdatePartnerResultsResponseArray_items_inner.md)
 - [UserBusinessRoleBinding](./Models/UserBusinessRoleBinding.md)
 - [UserFollowingFeedType](./Models/UserFollowingFeedType.md)
 - [UserListOperationType](./Models/UserListOperationType.md)
 - [UserListType](./Models/UserListType.md)
 - [UserSingleAssetBinding](./Models/UserSingleAssetBinding.md)
 - [UserSummary](./Models/UserSummary.md)
 - [UserWebsiteSummary](./Models/UserWebsiteSummary.md)
 - [UserWebsiteVerificationCode](./Models/UserWebsiteVerificationCode.md)
 - [UserWebsiteVerifyRequest](./Models/UserWebsiteVerifyRequest.md)
 - [UsersForIndividualAssetResponse](./Models/UsersForIndividualAssetResponse.md)
 - [VideoMetadata](./Models/VideoMetadata.md)
 - [ad_accounts_audiences_shared_accounts_list_200_response](./Models/ad_accounts_audiences_shared_accounts_list_200_response.md)
 - [ad_accounts_list_200_response](./Models/ad_accounts_list_200_response.md)
 - [ad_accounts_subscriptions_get_list_200_response](./Models/ad_accounts_subscriptions_get_list_200_response.md)
 - [ad_groups_list_200_response](./Models/ad_groups_list_200_response.md)
 - [ads_credits_discounts_get_200_response](./Models/ads_credits_discounts_get_200_response.md)
 - [ads_list_200_response](./Models/ads_list_200_response.md)
 - [audiences_list_200_response](./Models/audiences_list_200_response.md)
 - [billing_profiles_get_200_response](./Models/billing_profiles_get_200_response.md)
 - [board_sections_list_200_response](./Models/board_sections_list_200_response.md)
 - [boards_list_200_response](./Models/boards_list_200_response.md)
 - [boards_list_pins_200_response](./Models/boards_list_pins_200_response.md)
 - [boards_user_follows_list_200_response](./Models/boards_user_follows_list_200_response.md)
 - [business_asset_members_get_200_response](./Models/business_asset_members_get_200_response.md)
 - [business_asset_partners_get_200_response](./Models/business_asset_partners_get_200_response.md)
 - [business_assets_get_200_response](./Models/business_assets_get_200_response.md)
 - [business_member_assets_get_200_response](./Models/business_member_assets_get_200_response.md)
 - [business_members_asset_access_delete_request](./Models/business_members_asset_access_delete_request.md)
 - [business_members_asset_access_delete_request_accesses_inner](./Models/business_members_asset_access_delete_request_accesses_inner.md)
 - [business_partner_asset_access_get_200_response](./Models/business_partner_asset_access_get_200_response.md)
 - [campaigns_list_200_response](./Models/campaigns_list_200_response.md)
 - [catalogs_list_200_response](./Models/catalogs_list_200_response.md)
 - [catalogs_product_group_pins_list_200_response](./Models/catalogs_product_group_pins_list_200_response.md)
 - [catalogs_product_group_pricing_currency_criteria](./Models/catalogs_product_group_pricing_currency_criteria.md)
 - [catalogs_product_groups_list_200_response](./Models/catalogs_product_groups_list_200_response.md)
 - [catalogs_product_groups_update_request](./Models/catalogs_product_groups_update_request.md)
 - [customer_lists_list_200_response](./Models/customer_lists_list_200_response.md)
 - [feed_processing_results_list_200_response](./Models/feed_processing_results_list_200_response.md)
 - [feeds_create_request](./Models/feeds_create_request.md)
 - [feeds_list_200_response](./Models/feeds_list_200_response.md)
 - [feeds_update_request](./Models/feeds_update_request.md)
 - [followers_list_200_response](./Models/followers_list_200_response.md)
 - [get_business_employers_200_response](./Models/get_business_employers_200_response.md)
 - [get_business_members_200_response](./Models/get_business_members_200_response.md)
 - [get_business_partners_200_response](./Models/get_business_partners_200_response.md)
 - [get_invites_200_response](./Models/get_invites_200_response.md)
 - [integrations_get_list_200_response](./Models/integrations_get_list_200_response.md)
 - [items_batch_post_request](./Models/items_batch_post_request.md)
 - [items_issues_list_200_response](./Models/items_issues_list_200_response.md)
 - [keywords_get_200_response](./Models/keywords_get_200_response.md)
 - [lead_forms_list_200_response](./Models/lead_forms_list_200_response.md)
 - [media_list_200_response](./Models/media_list_200_response.md)
 - [multiple_product_groups_inner](./Models/multiple_product_groups_inner.md)
 - [order_lines_list_200_response](./Models/order_lines_list_200_response.md)
 - [page_visit_conversion_tags_get_200_response](./Models/page_visit_conversion_tags_get_200_response.md)
 - [pins_analytics_metric_types_parameter_inner](./Models/pins_analytics_metric_types_parameter_inner.md)
 - [pins_list_200_response](./Models/pins_list_200_response.md)
 - [pins_save_request](./Models/pins_save_request.md)
 - [product_group_promotions_list_200_response](./Models/product_group_promotions_list_200_response.md)
 - [reports_stats_200_response](./Models/reports_stats_200_response.md)
 - [search_partner_pins_200_response](./Models/search_partner_pins_200_response.md)
 - [search_user_boards_get_200_response](./Models/search_user_boards_get_200_response.md)
 - [ssio_insertion_orders_status_get_by_ad_account_200_response](./Models/ssio_insertion_orders_status_get_by_ad_account_200_response.md)
 - [ssio_order_lines_get_by_ad_account_200_response](./Models/ssio_order_lines_get_by_ad_account_200_response.md)
 - [targeting_template_list_200_response](./Models/targeting_template_list_200_response.md)
 - [templates_list_200_response](./Models/templates_list_200_response.md)
 - [user_account_followed_interests_200_response](./Models/user_account_followed_interests_200_response.md)
 - [user_following_get_200_response](./Models/user_following_get_200_response.md)
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
  - pins:read: See your public Pins
  - pins:read_secret: See your secret Pins
  - pins:write: Create, update, or delete your public Pins
  - pins:write_secret: Create, update, or delete your secret Pins
  - user_accounts:read: See your user accounts and followers
  - user_accounts:write: Update your user accounts and followers

