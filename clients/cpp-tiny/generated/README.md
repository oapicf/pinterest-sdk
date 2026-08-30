# Documentation for OpenAPI Petstore
This is a client generator for microcontrollers on the Espressif32 platform and the Arduino framework
After the client have been generated, you have to change these following variables:
- root.cert | Provide your service root certificate.
- src/main.cpp | Change wifi name
- src/main.cpp | Change wifi password
- lib/service/AbstractService.h | Change to your url

# Documentation for Pinterest REST API 5.28.0 Tiny client cpp (Arduino) 

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
|*analytics_createConversionProductReport* | *POST* /ad_accounts/{ad_account_id}/reports/brand_category_sku | Create a request for a brand, category, SKU report.|
|*analytics_createMmmReport* | *POST* /ad_accounts/{ad_account_id}/mmm_reports | Create a request for a Marketing Mix Modeling (MMM) report.|
|*analytics_createReport* | *POST* /ad_accounts/{ad_account_id}/reports | Create async request for an account analytics report.|
|*analytics_createTemplateReport* | *POST* /ad_accounts/{ad_account_id}/templates/{template_id}/reports | Create async request for an analytics report using a template.|
|*analytics_getConversionProductReport* | *GET* /ad_accounts/{ad_account_id}/reports/brand_category_sku | Get advertiser brand, category, SKU report.|
|*analytics_getMmmReport* | *GET* /ad_accounts/{ad_account_id}/mmm_reports | Get advertiser Marketing Mix Modeling (MMM) report..|
|*analytics_getReport* | *GET* /ad_accounts/{ad_account_id}/reports | Get the account analytics report created by the async call.|
|*sandbox_delete* | *DELETE* /ad_accounts/{ad_account_id}/sandbox | Delete ads data for ad account in API Sandbox.|
|*templates_list* | *GET* /ad_accounts/{ad_account_id}/templates | List templates.|

### AdGroupsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*adGroupsBidFloor_get* | *POST* /ad_accounts/{ad_account_id}/bid_floor | Get bid floors.|
|*adGroupsDynamicTitles_downloadCsv* | *GET* /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/csv | Get dynamic titles CSV download URL.|
|*adGroupsDynamicTitles_getStatus* | *GET* /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/status | Get dynamic titles status.|
|*adGroupsDynamicTitles_getUploadUrl* | *GET* /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/uploads | Get dynamic titles upload URL.|
|*adGroupsDynamicTitles_processCsv* | *POST* /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles | Process dynamic titles CSV.|
|*adGroupsTargetingAnalytics_get* | *GET* /ad_accounts/{ad_account_id}/ad_groups/targeting_analytics | Get targeting analytics for ad groups.|
|*adGroups_analytics* | *GET* /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics.|
|*adGroups_audienceSizing* | *POST* /ad_accounts/{ad_account_id}/ad_groups/audience_sizing | Get audience sizing.|
|*adGroups_create* | *POST* /ad_accounts/{ad_account_id}/ad_groups | Create ad groups.|
|*adGroups_get* | *GET* /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id} | Get ad group.|
|*adGroups_list* | *GET* /ad_accounts/{ad_account_id}/ad_groups | List ad groups.|
|*adGroups_update* | *PATCH* /ad_accounts/{ad_account_id}/ad_groups | Update ad groups.|
|*getAdGroupsByPromotionIds_list* | *GET* /ad_accounts/{ad_account_id}/promotion_applied_entities | List of ad groups using promotions IDs..|

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
|*campaignAdPreview_create* | *POST* /ad_accounts/{ad_account_id}/campaign_ad_preview | Create ad preview records for one or more ad groups.|
|*campaignAdPreview_delete* | *DELETE* /ad_accounts/{ad_account_id}/campaign_ad_preview | Delete ad preview records for one or more ad groups.|
|*campaignAdPreview_read* | *GET* /ad_accounts/{ad_account_id}/campaign_ad_preview | Fetch ad preview records for one or more ad groups.|

### AdvancedAuctionApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*advancedAuctionItemsGet_post* | *POST* /advanced_auction/items/get | Get item bid options (POST).|
|*advancedAuctionItemsSubmit_post* | *POST* /advanced_auction/items/submit | Operate on item level bid options.|

### AudienceInsightsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*audienceInsightsScopeAndType_get* | *GET* /ad_accounts/{ad_account_id}/insights/audiences | Get audience insights scope and type.|
|*audienceInsights_get* | *GET* /ad_accounts/{ad_account_id}/audience_insights | Get audience insights.|

### AudienceSharingApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*adAccountsAudiencesSharedAccounts_list* | *GET* /ad_accounts/{ad_account_id}/audiences/shared/accounts | List accounts with access to an audience owned by an ad account.|
|*businessAccountAudiencesSharedAccounts_list* | *GET* /businesses/{business_id}/audiences/shared/accounts | List accounts with access to an audience owned by a business.|
|*sharedAudiencesForBusiness_list* | *GET* /businesses/{business_id}/audiences | List received audiences for a business.|
|*updateAdAccountToAdAccountSharedAudience* | *PATCH* /ad_accounts/{ad_account_id}/audiences/ad_accounts/shared | Update audience sharing between ad accounts.|
|*updateAdAccountToBusinessSharedAudience* | *PATCH* /ad_accounts/{ad_account_id}/audiences/businesses/shared | Update audience sharing from an ad account to businesses.|
|*updateBusinessToAdAccountSharedAudience* | *PATCH* /businesses/{business_id}/audiences/ad_accounts/shared | Update audience sharing from a business to ad accounts.|
|*updateBusinessToBusinessSharedAudience* | *PATCH* /businesses/{business_id}/audiences/businesses/shared | Update audience sharing between businesses.|

### AudiencesApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*audiences_create* | *POST* /ad_accounts/{ad_account_id}/audiences | Create audience.|
|*audiences_get* | *GET* /ad_accounts/{ad_account_id}/audiences/{audience_id} | Get audience.|
|*audiences_list* | *GET* /ad_accounts/{ad_account_id}/audiences | List audiences.|
|*audiences_update* | *PATCH* /ad_accounts/{ad_account_id}/audiences/{audience_id} | Update audience.|

### BillingApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*adsCredit_redeem* | *POST* /ad_accounts/{ad_account_id}/ads_credit/redeem | Redeem ad credits.|
|*adsCreditsDiscounts_get* | *GET* /ad_accounts/{ad_account_id}/ads_credit/discounts | Get ads credit discounts.|
|*billingInvoiceDownload_get* | *GET* /ad_accounts/{ad_account_id}/billing_invoice/{billing_invoice_id}/download | Get download url for a billing invoice.|
|*billingInvoices_get* | *GET* /ad_accounts/{ad_account_id}/billing_invoices | Get billing invoices.|
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

### BusinessAccessAssetsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*assetGroup_create* | *POST* /businesses/{business_id}/asset_groups | Create a new asset group..|
|*assetGroup_delete* | *DELETE* /businesses/{business_id}/asset_groups | Delete asset groups..|
|*assetGroup_update* | *PATCH* /businesses/{business_id}/asset_groups | Update asset groups..|
|*businessAssetMembers_get* | *GET* /businesses/{business_id}/assets/{asset_id}/members | Get members with access to asset.|
|*businessAssetPartners_get* | *GET* /businesses/{business_id}/assets/{asset_id}/partners | Get partners with access to asset.|
|*businessAssets_get* | *GET* /businesses/{business_id}/assets | List business assets.|
|*businessMemberAssets_get* | *GET* /businesses/{business_id}/members/{member_id}/assets | Get assets assigned to a member.|
|*businessMembersAssetAccess_delete* | *DELETE* /businesses/{business_id}/members/assets/access | Delete member access to asset.|
|*businessMembersAssetAccess_update* | *PATCH* /businesses/{business_id}/members/assets/access | Assign/Update member asset permissions.|
|*businessPartnerAssetAccess_get* | *GET* /businesses/{business_id}/partners/{partner_id}/assets | Get assets assigned to a partner or assets assigned by a partner.|
|*deletePartnerAssetAccessHandlerImpl* | *DELETE* /businesses/{business_id}/partners/assets | Delete partner access to asset.|
|*updatePartnerAssetAccessHandlerImpl* | *PATCH* /businesses/{business_id}/partners/assets | Assign/Update partner asset permissions.|

### BusinessAccessInviteApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*assetAccessRequests_create* | *POST* /businesses/{business_id}/requests/assets/access | Create a request to access an existing partner's assets..|
|*cancelInvitesOrRequests* | *DELETE* /businesses/{business_id}/invites | Cancel invites/requests.|
|*createAssetInvites* | *POST* /businesses/{business_id}/invites/assets/access | Update invite/request with an asset permission.|
|*createMembershipOrPartnershipInvites* | *POST* /businesses/{business_id}/invites | Create invites or requests.|
|*get_invites* | *GET* /businesses/{business_id}/invites | Get invites/requests.|
|*respondBusinessAccessInvites* | *PATCH* /businesses/invites | Accept or decline an invite/request.|

### BusinessAccessRelationshipsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*brandAccounts_create* | *POST* /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts | Create a Brand Account.|
|*brandAccounts_update* | *PATCH* /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id} | Update a Brand Account.|
|*deleteBusinessMembership* | *DELETE* /businesses/{business_id}/members | Terminate business memberships.|
|*deleteBusinessPartners* | *DELETE* /businesses/{business_id}/partners | Terminate business partnerships.|
|*get_businessEmployers* | *GET* /businesses/employers | List business employers for user.|
|*get_businessMembers* | *GET* /businesses/{business_id}/members | Get business members.|
|*get_businessPartners* | *GET* /businesses/{business_id}/partners | Get business partners.|
|*systemUser_update* | *PATCH* /businesses/{business_id}/system_users/{system_user_id} | Update a system user information..|
|*update_businessMemberships* | *PATCH* /businesses/{business_id}/members | Update member's business role.|

### CampaignsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*adPins_analytics* | *GET* /ad_accounts/{ad_account_id}/pins/analytics | Get pins analytics.|
|*campaignTargetingAnalytics_get* | *GET* /ad_accounts/{ad_account_id}/campaigns/targeting_analytics | Get targeting analytics for campaigns.|
|*campaigns_analytics* | *GET* /ad_accounts/{ad_account_id}/campaigns/analytics | Get campaign analytics.|
|*campaigns_create* | *POST* /ad_accounts/{ad_account_id}/campaigns | Create campaigns.|
|*campaigns_get* | *GET* /ad_accounts/{ad_account_id}/campaigns/{campaign_id} | Get campaign.|
|*campaigns_list* | *GET* /ad_accounts/{ad_account_id}/campaigns | List campaigns.|
|*campaigns_update* | *PATCH* /ad_accounts/{ad_account_id}/campaigns | Update campaigns.|
|*getCampaignDeliveryEstimates* | *POST* /ad_accounts/{ad_account_id}/campaigns/delivery_estimates | Get campaign delivery estimates.|

### CatalogFeedsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*feedProcessingResults_list* | *GET* /catalogs/feeds/{feed_id}/processing_results | List feed processing results.|
|*feeds_create* | *POST* /catalogs/feeds | Create feed.|
|*feeds_delete* | *DELETE* /catalogs/feeds/{feed_id} | Delete feed.|
|*feeds_get* | *GET* /catalogs/feeds/{feed_id} | Get feed.|
|*feeds_ingest* | *POST* /catalogs/feeds/{feed_id}/ingest | Ingest feed items.|
|*feeds_list* | *GET* /catalogs/feeds | List feeds.|
|*feeds_update* | *PATCH* /catalogs/feeds/{feed_id} | Update feed.|
|*itemsIssues_list* | *GET* /catalogs/processing_results/{processing_result_id}/item_issues | List item issues.|

### CatalogItemsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*itemsBatch_get* | *GET* /catalogs/items/batch/{batch_id} | Get item batch status.|
|*itemsBatch_post* | *POST* /catalogs/items/batch | Operate on item batch.|
|*items_post* | *POST* /catalogs/items | Get catalogs items (POST).|

### CatalogProductGroupsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*catalogsProductGroupPins_list* | *GET* /catalogs/product_groups/{product_group_id}/products | List products by product group.|
|*catalogsProductGroups_create* | *POST* /catalogs/product_groups | Create product group.|
|*catalogsProductGroups_createMany* | *POST* /catalogs/product_groups/multiple | Create product groups.|
|*catalogsProductGroups_delete* | *DELETE* /catalogs/product_groups/{product_group_id} | Delete product group.|
|*catalogsProductGroups_deleteMany* | *DELETE* /catalogs/product_groups/multiple | Delete product groups.|
|*catalogsProductGroups_get* | *GET* /catalogs/product_groups/{product_group_id} | Get product group.|
|*catalogsProductGroups_list* | *GET* /catalogs/product_groups | List product groups.|
|*catalogsProductGroups_productCountsGet* | *GET* /catalogs/product_groups/{product_group_id}/product_counts | Get product counts.|
|*catalogsProductGroups_update* | *PATCH* /catalogs/product_groups/{product_group_id} | Update single product group.|
|*productsByProductGroupFilter_list* | *POST* /catalogs/products/get_by_product_group_filters | List products by filter.|

### CatalogReportsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*reports_create* | *POST* /catalogs/reports | Build catalogs report.|
|*reports_get* | *GET* /catalogs/reports | Get catalogs report.|
|*reports_stats* | *GET* /catalogs/reports/stats | List report stats.|

### CatalogSupplementalApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*catalogsLocalInventoryItemsBatch_operate* | *POST* /catalogs/{catalog_id}/local_inventory_items/batch | Operate on local inventory item batch.|
|*catalogsLocalInventoryItems_post* | *POST* /catalogs/{catalog_id}/local_inventory_items/query | Get local inventory items (POST).|
|*catalogsLocalStores_create* | *POST* /catalogs/{catalog_id}/local_stores | Create local stores.|
|*catalogsLocalStores_delete* | *DELETE* /catalogs/{catalog_id}/local_stores | Delete local stores.|
|*catalogsLocalStores_list* | *GET* /catalogs/{catalog_id}/local_stores | List local stores.|
|*catalogsLocalStores_update* | *PATCH* /catalogs/{catalog_id}/local_stores | Update local stores.|
|*catalogsSupplementalItemsBatch_get* | *GET* /catalogs/{catalog_id}/supplemental_items/batch/{batch_id} | Get supplemental items batch status.|

### CatalogsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*catalogs_availableFilterValues* | *GET* /catalogs/available_filter_values | List available filter values.|
|*catalogs_create* | *POST* /catalogs | Create catalog.|
|*catalogs_list* | *GET* /catalogs | List catalogs.|

### ConversionDeletionRequestsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*conversionDeletionRequest_create* | *POST* /ad_accounts/{ad_account_id}/conversion_deletion_requests | Create a conversion deletion request.|
|*conversionDeletionRequest_delete* | *DELETE* /ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id} | Delete a conversion deletion request.|
|*conversionDeletionRequest_get* | *GET* /ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id} | Get a single conversion deletion request.|
|*conversionDeletionRequest_list* | *GET* /ad_accounts/{ad_account_id}/conversion_deletion_requests | List conversion deletion requests.|

### ConversionEqsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*conversionEqs_list* | *GET* /ad_accounts/{ad_account_id}/conversion_eqs | Get event quality score (EQS).|

### ConversionEventsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*events_create* | *POST* /ad_accounts/{ad_account_id}/events | Send conversions.|

### ConversionTagsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*conversionTags_create* | *POST* /ad_accounts/{ad_account_id}/conversion_tags | Create conversion tag.|
|*conversionTags_get* | *GET* /ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id} | Get conversion tag.|
|*conversionTags_list* | *GET* /ad_accounts/{ad_account_id}/conversion_tags | List conversion tags.|
|*ocpmEligibleConversionTags_get* | *GET* /ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible | Get Ocpm eligible conversion tags.|
|*pageVisitConversionTags_get* | *GET* /ad_accounts/{ad_account_id}/conversion_tags/page_visit | Get page visit conversion tags.|

### ConversionsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*advertiserDefinedEvents_create* | *POST* /ad_accounts/{ad_account_id}/advertiser_defined_events | Create advertiser defined events.|
|*advertiserDefinedEvents_delete* | *DELETE* /ad_accounts/{ad_account_id}/advertiser_defined_events | Delete advertiser defined events.|
|*advertiserDefinedEvents_get* | *GET* /ad_accounts/{ad_account_id}/advertiser_defined_events | Get advertiser defined events.|
|*advertiserDefinedEvents_update* | *PATCH* /ad_accounts/{ad_account_id}/advertiser_defined_events | Update advertiser defined events.|

### CustomerListUploadsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*customerListUploads_create* | *POST* /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads | Create customer list upload.|
|*customerListUploads_get* | *GET* /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id} | Get customer list upload.|
|*customerListUploads_run* | *POST* /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run | Run customer list upload.|

### CustomerListsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*customerLists_create* | *POST* /ad_accounts/{ad_account_id}/customer_lists | Create customer lists.|
|*customerLists_get* | *GET* /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Get customer list.|
|*customerLists_list* | *GET* /ad_accounts/{ad_account_id}/customer_lists | Get customer lists.|
|*customerLists_update* | *PATCH* /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Update customer list.|

### CustomerSegmentApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*customerSegment_create* | *POST* /ad_accounts/{ad_account_id}/customer_segments | Create customer segments.|
|*customerSegment_list* | *GET* /ad_accounts/{ad_account_id}/customer_segments | List customer segments.|
|*customerSegment_update* | *PATCH* /ad_accounts/{ad_account_id}/customer_segments | Update customer segments.|

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

### LabelsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*labels_apply* | *POST* /ad_accounts/{ad_account_id}/labels/{label_id}/apply | Apply label to entity.|
|*labels_create* | *POST* /ad_accounts/{ad_account_id}/labels | Create labels.|
|*labels_list* | *GET* /ad_accounts/{ad_account_id}/labels | List labels.|
|*labels_remove* | *POST* /ad_accounts/{ad_account_id}/labels/{label_id}/remove | Remove label from entities.|
|*labels_update* | *PATCH* /ad_accounts/{ad_account_id}/labels | Update labels.|

### LeadAdsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*adAccountsSubscriptions_delById* | *DELETE* /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Delete lead ads subscription.|
|*adAccountsSubscriptions_getById* | *GET* /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Get lead ads subscription by ID.|
|*adAccountsSubscriptions_getList* | *GET* /ad_accounts/{ad_account_id}/leads/subscriptions | Get lead ads subscriptions.|
|*adAccountsSubscriptions_post* | *POST* /ad_accounts/{ad_account_id}/leads/subscriptions | Create lead ads subscription.|

### LeadFormsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*leadFormTest_create* | *POST* /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test | Create lead form test data.|
|*leadForm_get* | *GET* /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id} | Get lead form by id.|
|*leadForms_create* | *POST* /ad_accounts/{ad_account_id}/lead_forms | Create lead forms.|
|*leadForms_list* | *GET* /ad_accounts/{ad_account_id}/lead_forms | List lead forms.|
|*leadForms_update* | *PATCH* /ad_accounts/{ad_account_id}/lead_forms | Update lead forms.|

### LeadsExportApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*leadsExport_create* | *POST* /ad_accounts/{ad_account_id}/leads_export | Create a request to export leads collected from a lead ad.|
|*leadsExport_get* | *GET* /ad_accounts/{ad_account_id}/leads_export/{leads_export_id} | Get the lead export from the lead export create call.|

### MediaApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*media_create* | *POST* /media | Register media upload.|
|*media_get* | *GET* /media/{media_id} | Get media upload details.|
|*media_list* | *GET* /media | List media uploads.|

### MsotEventsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*msotEvents_create* | *POST* /ad_accounts/{ad_account_id}/msot/events | Send Measurement Source Of Truth (MSOT) attributed conversion events.|

### NotificationApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*notification_post* | *POST* /notifications | Receive notifications from external partners..|

### OauthApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*oauth_conversionToken* | *POST* /oauth/conversion_token | Generate OAuth access token for conversion API.|
|*oauth_token* | *POST* /oauth/token | Generate OAuth access token.|
|*token_revoke* | *POST* /oauth/token/revoke | Revoke a token.|

### OrderLinesApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*orderLines_get* | *GET* /ad_accounts/{ad_account_id}/order_lines/{order_line_id} | Get order line.|
|*orderLines_list* | *GET* /ad_accounts/{ad_account_id}/order_lines | Get order lines..|

### PinsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*multiPins_analytics* | *GET* /pins/analytics | Get multiple Pin analytics.|
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

### ProductTagsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*productTags_bulkAdd* | *POST* /pins/{pin_id}/product_tags | Add product tags to pin.|
|*productTags_bulkDelete* | *POST* /pins/{pin_id}/product_tags/bulk-delete | Delete product tags from pin.|
|*productTags_list* | *GET* /pins/{pin_id}/product_tags | Get product tags for pin.|

### PromotionsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*promotions_create* | *POST* /ad_accounts/{ad_account_id}/promotions | Create promotions.|
|*promotions_delete* | *DELETE* /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Delete promotion by id.|
|*promotions_get* | *GET* /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Get promotion by id.|
|*promotions_list* | *GET* /ad_accounts/{ad_account_id}/promotions | Get promotions.|
|*promotions_update* | *PATCH* /ad_accounts/{ad_account_id}/promotions | Update promotions.|

### ResourcesApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*adAccountCountries_get* | *GET* /resources/ad_account_countries | Get ad accounts countries.|
|*deliveryMetrics_get* | *GET* /resources/delivery_metrics | Get available metrics' definitions.|
|*interestTargetingOptions_get* | *GET* /resources/targeting/interests/{interest_id} | Get interest details.|
|*leadFormQuestions_get* | *GET* /resources/lead_form_questions | Get lead form questions.|
|*metricsReadyState_get* | *GET* /resources/metrics_ready_state | Get metrics ready state.|
|*targetingOptions_get* | *GET* /resources/targeting/{targeting_type} | Get targeting options.|

### SchedulesApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*schedules_create* | *POST* /ad_accounts/{ad_account_id}/schedules | Create schedules.|
|*schedules_list* | *GET* /ad_accounts/{ad_account_id}/schedules | Get Schedules.|
|*schedules_update* | *PATCH* /ad_accounts/{ad_account_id}/schedules | Update schedules.|

### SearchApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*searchPartnerPins* | *GET* /search/partner/pins | Search pins by a given search term.|
|*searchUserBoards_get* | *GET* /search/boards | Search user's boards.|
|*searchUserPins_list* | *GET* /search/pins | Search user's Pins.|

### TargetingTemplateApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*targetingTemplate_create* | *POST* /ad_accounts/{ad_account_id}/targeting_templates | Create targeting templates.|
|*targetingTemplate_list* | *GET* /ad_accounts/{ad_account_id}/targeting_templates | List targeting templates.|
|*targetingTemplate_update* | *PATCH* /ad_accounts/{ad_account_id}/targeting_templates | Update targeting templates.|

### TermsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*termsRelated_list* | *GET* /terms/related | List related terms.|
|*termsSuggested_list* | *GET* /terms/suggested | List suggested terms.|

### TermsOfServiceApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*termsOfService_get* | *GET* /ad_accounts/{ad_account_id}/terms_of_service | Get terms of service.|

### TrendsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*trendsEditorialArticles_list* | *GET* /trends/editorial_articles | Returns editorial articles for a given region.|
|*trendsFeaturedTopics_list* | *GET* /trends/topics/featured | Get featured topics.|
|*trendsProductCategoriesDetails_list* | *GET* /trends/product_categories/details | Get product category details.|
|*trendsProductCategoriesTrending_list* | *GET* /trends/product_categories/trending | Get a list of growing Shopping Product Categories.|

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
|*Account* | User account model containing properties related to a user's account.|
|*AccountTemplate* | |
|*ActionType* | Ad group billable event type. For update, only draft ad groups may update billable event.|
|*Ad* | |
|*AdAccount* | |
|*AdAccountAnalyticsItems* | |
|*AdAccountCreate* | Resource create operation model.|
|*AdAccountEntityType* | Specify the entity type to get summary information|
|*AdAccountOwner* | |
|*AdAccountToAdAccountSharedAudience* | |
|*AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody* | Resource create or update operation model with required body fields (no OptionalProperties).|
|*AdAccountToBusinessSharedAudience* | |
|*AdAccountToBusinessSharedAudienceUpdateWithRequiredBody* | Resource create or update operation model with required body fields (no OptionalProperties).|
|*AdAccountsAudience* | |
|*AdAccountsAudienceCreate* | Resource create operation model.|
|*AdAccountsAudienceRule* | JSON object defining targeted audience users. Example rule formats per audience type: CUSTOMER_LIST: { \"customer_list_id\": \"<customer list ID>\"} ACTALIKE: { \"seed_id\": [\"<audience ID>\"], \"country\": \"US\", \"percentage\": \"10\" } (Valid countries include: \"US\", \"CA\", and \"GB\". Percentage should be 1-10. The targeted audience should be this % size across Pinterest.) VISITOR: { \"visitor_source_id\": [\"<conversion tag ID>\"], \"retention_days\": \"180\", \"event_source\": {\"=\": [\"web\", \"mobile\"]}, \"ingestion_source\": {\"=\": [\"tag\"]}} (Retention days should be 1-540. Retention applies to specific customers.) ENGAGEMENT: {\"engagement_domain\": [\"www.example.com\"], \"engager_type\": 1} Learn more about [engagement audiences](/docs/work-with-targets-and-audiences/create-audiences/#engagement-audience).|
|*AdAccountsAudienceUpdate* | Resource create or update operation model.|
|*AdAccountsCountry* | |
|*AdAdsAnalyticsAsyncTargetingTypes* | Reporting targeting type|
|*AdBatchItem* | |
|*AdBatchUpdate* | |
|*AdBatchWriteResponseModel* | |
|*AdCollectionsHeaderType* | Collections ad header type for ads|
|*AdCreate* | Resource create operation model.|
|*AdCreateRequest* | |
|*AdDisapprovalReasons* | ad disapproval reasons|
|*AdGroup* | |
|*AdGroupAudienceSizing* | |
|*AdGroupAudienceSizingCreate* | Resource create operation model.|
|*AdGroupAudienceSizingCreativeTypes* | |
|*AdGroupAudienceSizingKeyword* | |
|*AdGroupBase* | |
|*AdGroupCreate* | |
|*AdGroupCreateCreate* | Resource create operation model.|
|*AdGroupCreateRequest* | |
|*AdGroupCreateRequestAllOf1* | |
|*AdGroupDeliveryEstimates* | Ad group configuration for delivery estimates.|
|*AdGroupDeliveryEstimatesKeywordsItems* | |
|*AdGroupSummaryStatus* | Summary status for ad group|
|*AdGroupTrackingURLs* |   Third-party tracking URLs. Up to three tracking URLs - with a max length of 2,000 - are supported for   each event type. Tracking URLs set at the ad group or ad level can override   those set at the campaign level. For more information, see [Third-party and dynamic tracking](https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking).|
|*AdGroupUpdate* | |
|*AdGroupUpdateBatchUpdate* | |
|*AdGroupUpdateRequest* | |
|*AdGroupUpdateRequestAllOf1* | |
|*AdGroupsAnalyticsMetrics* | |
|*AdPinAnalytics* | |
|*AdPinPreviewCreativeType* | |
|*AdPreviewRequest* | |
|*AdPreviewShopping* | Ad preview from a catalog product group (shopping).|
|*AdPreviewSourceImage* | Ad preview source from an image URL.|
|*AdPreviewSourcePinId* | Ad preview source from an existing Pin.|
|*AdPreviewURLResponse* | |
|*AdReviewStatus* | Ad review status|
|*AdShoppingPreviewCreativeType* | |
|*AdUpdateRequest* | |
|*AdUpdateRequestAllOf1* | |
|*Ad_account_countries_get_200_response* | |
|*Ad_accounts_audiences_shared_accounts_list_200_response* | |
|*Ad_accounts_list_200_response* | |
|*Ad_accounts_subscriptions_get_list_200_response* | |
|*Ad_groups_create_200_response* | |
|*Ad_groups_create_200_response_items_inner* | |
|*Ad_groups_list_200_response* | |
|*AdeColumnType* | Metrics for custom defined conversion event.|
|*AdgroupPlacementGroupType* | Campaign placement group type|
|*AdgroupTrackingFeatureType* | |
|*AdgroupTrackingFeatures* | |
|*AdsAnalytics* | |
|*AdsAnalyticsAccountTargetingType* | Reporting targeting type|
|*AdsAnalyticsAdGroupTargetingType* | Reporting targeting type for ad groups|
|*AdsAnalyticsAdTargetingType* | Reporting targeting type for ads|
|*AdsAnalyticsCampaignTargetingType* | Reporting targeting type for campaigns|
|*AdsAnalyticsCreateAsyncRequest* | |
|*AdsAnalyticsCreateAsyncResponse* | |
|*AdsAnalyticsFilterColumn* | Reporting columns for sync reporting data filter|
|*AdsAnalyticsFilterOperator* | Filter operator for sync reporting|
|*AdsAnalyticsGetAsyncResponse* | |
|*AdsAnalyticsMetricsFilter* | |
|*AdsCreditDiscountType* | |
|*AdsCreditDiscountsResponse* | |
|*AdsCreditRedeem* | Ads credit redemption|
|*AdsCreditRedeemCreate* | Resource create operation model.|
|*Ads_credits_discounts_get_200_response* | |
|*Ads_list_200_response* | |
|*AdvancedAuctionBidOptions* | Object describing a retail catalog item's bid options (bid price and bid multipliers).|
|*AdvancedAuctionItem* | |
|*AdvancedAuctionItems* | Response object containing item bid options|
|*AdvancedAuctionItemsGetRequest* | Request object used to get bid options values for a batch of retail catalog items|
|*AdvancedAuctionItemsSubmitDeleteRecord* | Object describing an item bid option deletion operation|
|*AdvancedAuctionItemsSubmitRecord* | Object describing an item bid option operation|
|*AdvancedAuctionItemsSubmitRequest* | Request containing operations to perform on bid prices and bid multipliers for a batch of retail catalog items|
|*AdvancedAuctionItemsSubmitUpsertRecord* | Object describing an item bid option upsert operation|
|*AdvancedAuctionKey* | Object uniquely identifying a retail catalog item|
|*AdvancedAuctionOperationError* | Error which occurred when applying a bid options operation to a specific item.|
|*AdvancedAuctionProcessedItems* | Response object containing the results of an operation on an item bid option|
|*AdvertiserDefinedEvent* | Advertiser defined event|
|*AdvertiserDefinedEventInput* | Advertiser defined event input for create/update operations|
|*AdvertiserDefinedEventMappingType* | Pinterest standard event types that a custom event can be mapped to. Restricted to event types that are valid ads optimization goals.|
|*AdvertiserDefinedEventProcessingRecord* | Processing record for an advertiser defined event operation|
|*AdvertiserDefinedEventsCreateRequest* | Request body for creating or updating advertiser defined events|
|*Advertiser_defined_events_create_200_response* | |
|*Advertiser_defined_events_get_200_response* | |
|*AgeBucketMultipliers* | This represents a mapping from age bucket to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified age bucket in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. All age bucket multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).|
|*AgeTrendsBucket* | |
|*AggregatedPinComment* | |
|*AiDisclosureItem* | AI disclosure declaration the creator has made about the Pin.|
|*AiDisclosures* | AI disclosure declarations the creator has made about the Pin.|
|*AiDisclosuresUpdate* | AI disclosure declarations the creator has made about the Pin.|
|*AmazonConnectRequest* | Request containing OTP and Amazon storefront info called by Amazon|
|*AmazonConnectResponse* | |
|*AnalyticsDailyMetrics* | |
|*AnalyticsMetricsResponse* | |
|*AppTypeMultipliers* | This represents a mapping from app type targeting criteria to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified app type in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).|
|*AppsflyerAudience* | Request model for creating an AppsFlyer audience|
|*AppsflyerAudienceCreate* | Resource create operation model.|
|*AppsflyerAudienceSyncCreate* | Resource create operation model.|
|*AppsflyerPlatform* | Platform options for AppsFlyer audience|
|*AssetAccessRequestError* | |
|*AssetGroupBinding* | |
|*AssetGroupDeleteError* | |
|*AssetGroupDeletion* | |
|*AssetGroupDeletionDelete* | |
|*AssetGroupInput* | |
|*AssetGroupInputCreate* | |
|*AssetGroupModification* | |
|*AssetGroupModificationReadOrUpdate* | |
|*AssetGroupType* | Asset group type.|
|*AssetGroupUpdateError* | |
|*AssetGroupUpdateItemReadOrUpdateItem* | |
|*AssetIdPermissions* | An object containing the permissions a business member has on the asset.|
|*AssetIdWithPermissions* | Asset ID with permission levels.|
|*AssetPermissionType* | Permission aggregation type for asset access|
|*AssetSearchBy* | The field to search member assets by|
|*AssetSortBy* | The field to sort member assets by|
|*AssetTypeResponse* | Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.|
|*AttributionActionType* | Type of an attributed action.|
|*AttributionMatchType* | Match type for an attributed event. P for probabilistic, D for deterministic, NA for Not applicable.|
|*AttributionModel* | Attribution model used to attribute the conversion event.|
|*AttributionScope* | Ad event type used for attribution.|
|*AttributionWindows* | |
|*Audience* | |
|*AudienceAccountType* | Account type filter for audience sharing.|
|*AudienceCategory* | |
|*AudienceDefinition* | Queryable audience representation.|
|*AudienceDemographicValue* | Demographic detail for a single audience demographic|
|*AudienceDemographics* | Audience demographics|
|*AudienceInsightType* | |
|*AudienceInsights* | Audience interests and demographics.|
|*AudienceObjectiveType* | Objective for engagement audience filter. Used only on ad account audience rule; matches baseline ObjectiveType (no VIDEO_VIEW, WEB_SESSIONS).|
|*AudienceOwnershipType* | Filter audiences by ownership type.|
|*AudienceRule* | JSON object defining targeted audience users. Example rule formats per audience type:  CUSTOMER_LIST: { \"customer_list_id\": \"&lt;customer list ID&gt;\"}  ACTALIKE: { \"seed_id\": [\"&lt;audience ID&gt;\"], \"country\": \"US\", \"percentage\": \"10\" } (Valid countries include: \"US\", \"CA\", and \"GB\". Percentage should be 1-10. The targeted audience should be this % size across Pinterest.)  VISITOR: { \"visitor_source_id\": [\"&lt;conversion tag ID&gt;\"], \"retention_days\": \"180\", \"event_source\": {\"=\": [\"web\", \"mobile\"]}, \"ingestion_source\": {\"=\": [\"tag\"]}} (Retention days should be 1-540. Retention applies to specific customers.)  ENGAGEMENT: {\"engagement_domain\": [\"www.example.com\"], \"engager_type\": 1} Learn more about [engagement audiences](/docs/work-with-targets-and-audiences/create-audiences/#engagement-audience).|
|*AudienceStatus* | Audience processing status|
|*AudienceSubcategory* | |
|*AudienceType* | Audience type|
|*AudienceUpdateOperationType* | Audience operation type (update or remove).|
|*Audience_insights_scope_and_type_get_200_response* | |
|*Audiences_list_200_response* | |
|*AuthRespondInviteAction* | |
|*AuthRespondInvitesBody* | An object with a list of all the invites the user would like to respond to and the action to take.|
|*AuthRespondInvitesBodyItem* | |
|*AvailabilityFilter* | |
|*BaseBusinessAssets* | An object containing the permissions a business has on the asset.|
|*BaseInviteDataResponse* | Common invite/request data returned by the business access endpoints.|
|*BasePreferredMediaType* | |
|*BatchOperationStatus* | The status of the operation performed by the batch|
|*BidFloor* | Bid floor request and response model.|
|*BidFloorCreate* | Resource create operation model.|
|*BidFloorObjectiveType* | Intended result of the campaign. You can only update objectives for draft campaigns. `WEB_SESSIONS` and `VIDEO_VIEW` objectives are deprecated. We recommend using `VIDEO_COMPLETION` as an alternative for the latter.|
|*BidFloorSpec* | Bid floor specification for a given campaign configuration.|
|*BidOptionsAgeBucketMultipliers* | This represents a mapping from age bucket to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All age bucket multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.|
|*BidOptionsAppTypeMultipliers* | This represents a mapping from app type targeting criteria to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.|
|*BidOptionsAudienceMultipliers* | This represents a mapping from Audience ID to a bid price change value. This is paired with the bid_multipliers schedule type  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All audience multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.|
|*BidOptionsGenderMultipliers* | This represents a mapping from gender targeting criteria to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment.  All gender multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.|
|*BidOptionsPlacementMultipliers* | This represents a mapping from placement to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.|
|*BidStrategyType* | Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID, also known as \"Pinterest Performance+ bidding\".|
|*BillingInvoice* | A billing invoice in the advertiser account.|
|*BillingInvoiceDocumentType* | The type of a billing invoice document.|
|*BillingInvoiceDownloadResponse* | |
|*BillingInvoiceSortField* | Field by which to sort billing invoices.|
|*BillingInvoiceStatus* | The status of a billing invoice.|
|*BillingProfileCardType* | Type of the credit card.|
|*BillingProfilePaymentMethodBrand* | Brand of the payment method.|
|*BillingProfileStatus* | Billing profile status|
|*BillingProfilesResponse* | |
|*BillingType* | Advertisers billing type|
|*Billing_invoices_get_200_response* | |
|*Billing_profiles_get_200_response* | |
|*Board* | |
|*BoardBase* | |
|*BoardCreate* | Resource create operation model.|
|*BoardMedia* | |
|*BoardOwner* | |
|*BoardPrivacy* | |
|*BoardPrivacyFilter* | |
|*BoardSection* | Sections help organize pins within a board.|
|*BoardSectionCreate* | Resource create operation model.|
|*BoardSectionUpdateWithRequiredBody* | Resource create or update operation model with required body fields (no OptionalProperties).|
|*BoardUpdatePrivacy* | |
|*BoardWithUpdatePrivacy* | |
|*BoardWithUpdatePrivacyUpdate* | Resource create or update operation model.|
|*Board_sections_list_200_response* | |
|*Boards_list_200_response* | |
|*Boards_list_pins_200_response* | |
|*BookClosed* | |
|*BrandAccount* | |
|*BrandAccountCreate* | Resource create operation model.|
|*BrandAccountProfileImage* | Base64-encoded image media source|
|*BrandAccountProfileImageUpdate* | Base64-encoded image media source|
|*BrandAccountUpdate* | Resource create or update operation model.|
|*BrandFilter* | |
|*BudgetDurationType* | Budget duration type for delivery estimates.|
|*BudgetType* | Budget type. If DAILY, an ad group's daily spend will not exceed the budget parameter value. If LIFETIME, the end_time parameter is **REQUIRED**, and the ad group spend is spread evenly between the ad group `start_time` and `end_time` range. A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. For CBO campaigns, only \"CBO_ADGROUP\" is allowed. For WEB_SESSIONS campaigns, only \"LIFETIME\" is allowed. For update, only draft ad groups may update budget type.|
|*BulkCampaignDeliveryEstimatesItem* | Delivery estimate result for a single campaign within a bulk request.|
|*BulkCampaignDeliveryEstimatesResponse* | Bulk campaign delivery estimates response.|
|*BulkDownload* | Ad entities to get in bulk request.|
|*BulkDownloadCampaignFilter* | |
|*BulkDownloadCreate* | Resource create operation model.|
|*BulkEntityType* | Refers ads entity type.|
|*BulkJobData* | Bulk request result data.|
|*BulkOutputFormat* | Bulk file output format|
|*BulkReportingJobStatus* | Possible status for a bulk reporting job|
|*BulkRequestStatus* | Bulk request status|
|*BulkUpsertRequest* | Two set of objects to be managed asyncronusly by bulk. One for creations, one for modifications.|
|*BulkUpsertRequestCreate* | Request for creation of entities in bulk.|
|*BulkUpsertRequestCreateCatalogProductGroupsItems* | |
|*BulkUpsertRequestUpdate* | Request for creation of entities in bulk.|
|*BulkUpsertRequestUpdateCatalogProductGroupsItems* | |
|*BulkUpsertResponse* | ID of the bulk request.|
|*BusinessAccessRole* | Permission role for business access.|
|*BusinessAccessUserSummary* | Metadata of the member/partner that has access to the asset.|
|*BusinessAssets* | |
|*BusinessMemberAssetsGetResponse* | Paginated response for business member assets with total count metadata.|
|*BusinessMemberAssetsSummary* | Ad accounts and profiles the business member/partner has access to.|
|*BusinessMemberSortBy* | The name of field that businesses are sorted by|
|*BusinessMembersAssetAccessDeleteBody* | An object with a list of member asset accesses to delete.|
|*BusinessMembershipMember* | A business member identified by `member_id` with their `business_role` in the business.|
|*BusinessRoleForInvite* | The business access level to grant member/partner. Note, values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - PARTNER: Can only view and access assets you assign them to/or they assign to you.|
|*BusinessRoleForMembers* | The access level a member has to the business. Values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign to them. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access.|
|*BusinessSearchBy* | The names of fields that business accounts are searched by|
|*BusinessToAdAccountSharedAudience* | |
|*BusinessToAdAccountSharedAudienceUpdateWithRequiredBody* | Resource create or update operation model with required body fields (no OptionalProperties).|
|*BusinessToBusinessSharedAudience* | |
|*BusinessToBusinessSharedAudienceUpdateWithRequiredBody* | Resource create or update operation model with required body fields (no OptionalProperties).|
|*Business_asset_members_get_200_response* | |
|*Business_assets_get_200_response* | |
|*Business_partner_asset_access_get_200_response* | |
|*Campaign* | |
|*CampaignAdPreview* | Campaign ad preview record.|
|*CampaignAdPreviewCreate* | Resource create operation model.|
|*CampaignAudienceMultipliers* | This represents a mapping from Audience ID to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified audience in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. All audience multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).|
|*CampaignBatchItem* | Item in a batch campaign response.|
|*CampaignBatchResponseData* | Campaign data in batch response, with all fields optional to support error cases where data may be empty.|
|*CampaignBatchUpdateItem* | Single campaign update item with update-specific bid options.|
|*CampaignBatchWriteResponseModel* | Response model for batch campaign write operations.|
|*CampaignBidOptions* | Object describing the campaign level bid multipliers.|
|*CampaignBidOptionsCreate* | Object describing the campaign level bid multipliers for create operations.|
|*CampaignBidOptionsUpdate* | Object describing an update to the campaign level bid multipliers.|
|*CampaignBidOptionsUpdateMaskItems* | Fields that can be updated in campaign bid options.|
|*CampaignCreateItem* | Single campaign create item with create-specific defaults.|
|*CampaignCreateRequest* | |
|*CampaignCreateRequestAllOf1* | |
|*CampaignDeliveryEstimatesCampaign* | Campaign configuration for delivery estimates.|
|*CampaignDeliveryEstimatesDerivedMetrics* | Derived metrics for an ad campaign.|
|*CampaignDeliveryEstimatesResponse* | Delivery estimates response for a campaign.|
|*CampaignObjectiveType* | Campaign objective type. If set as one of [\"AWARENESS\", \"CONSIDERATION\", \"WEB_CONVERSION\", \"CATALOG_SALES\", \"VIDEO_COMPLETION\", \"CTV_CONSIDERATION\"] the campaign is considered as a Campaign Budget Optimization (CBO) campaign, meaning budget needs to be set at the campaign level rather than at the ad group level. [\"WEB_SESSIONS\"] is DEPRECATED. `VIDEO_VIEW` is deprecated; use `VIDEO_COMPLETION` instead. `CTV_CONSIDERATION` is in BETA. For update, only draft campaigns may update objective type.|
|*CampaignPlanningAdGroupAudienceSize* | Range audience size for an ad group.|
|*CampaignPlanningBudgetRecommendation* | Budget recommendation response containing recommended budget, estimated days, and point estimations.|
|*CampaignPlanningBudgetRecommendationPoint* | A point estimation containing the estimate data and estimation type for a budget recommendation.|
|*CampaignPlanningConfidenceLevelAlert* | A confidence level alert for the delivery estimates provided in the response.|
|*CampaignPlanningConfidenceLevelAlertReason* | Reason for a confidence level alert on delivery estimates.|
|*CampaignPlanningConfidenceLevelAlertSeverity* | Severity of a confidence level alert on delivery estimates.|
|*CampaignPlanningConversionAttribution* | Attribution windows for a conversion event.|
|*CampaignPlanningConversionAttributionWindowDays* | Conversion attribution window in days.|
|*CampaignPlanningConversionEvent* | Conversion event for which a conversion rate estimate is computed.|
|*CampaignPlanningConversionRate* | Conversion rate estimate for a specific conversion event and attribution window combination.|
|*CampaignPlanningCurveEstimate* | |
|*CampaignPlanningEstimationType* | Estimation type for campaign planning estimated curve|
|*CampaignPlanningExperimentBudgetRecommendation* | Experimental budget recommendation for a single experiment version.|
|*CampaignPlanningPointEstimate* | A JSON object that represents a single estimation point. An estimation point contains the expected budget used and the estimated result, Y, along with an expected range based for the budget.|
|*CampaignPlanningResponseError* | Error encountered while estimating delivery for a campaign.|
|*CampaignPlanningResponseErrorCode* | Error code returned for a campaign planning estimate failure.|
|*CampaignSummaryStatus* | |
|*CampaignUpdateRequest* | |
|*CampaignUpdateRequestAllOf2* | |
|*Campaign_ad_preview_create_200_response_inner* | |
|*Campaign_ad_preview_create_200_response_inner_data* | Created/updated resource on success or error details on failure|
|*Campaign_ad_preview_create_200_response_inner_data_oneOf* | |
|*Campaign_ad_preview_delete_200_response_inner* | |
|*Campaign_ad_preview_delete_200_response_inner_status* | |
|*CampaignsAnalyticsMetrics* | |
|*Campaigns_list_200_response* | |
|*CancelInviteException* | An exception object if there is an error performing the cancellation. It will only be provided if there is an error.|
|*CancelInviteResult* | |
|*CancelInviteResultItem* | |
|*CancelInviteResultUser* | Metadata of the member/partner that has access to the asset.|
|*CancelInvitesRequest* | An object with the list of invite/request ids to cancel.|
|*CancelInvitesResponse* | |
|*CarouselSlot* | |
|*CartingProduct* | |
|*CartingRetailer* | |
|*Catalog* | Catalog entity|
|*CatalogBinding* | Information about a catalog asset.|
|*CatalogCreate* | Resource create operation model.|
|*CatalogUpdate* | Resource create or update operation model.|
|*CatalogsAiContentDisclosure* | AI content disclosure for a single asset of a catalog item.|
|*CatalogsAiContentDisclosureLabel* | Disclosure label for AI-generated or AI-modified content in a catalog item asset.|
|*CatalogsAvailableFilterValues* | Object holding available filter values for each filter key|
|*CatalogsBaseFilterKeys* | Base filter keys shared across catalog filtering|
|*CatalogsBaseFiltersAllOf* | |
|*CatalogsBaseFiltersAnyOf* | |
|*CatalogsCreateCreativeAssetsItem* | A creative assets item to be created.|
|*CatalogsCreateHotelItem* | A hotel item to be created.|
|*CatalogsCreateReportResponse* | |
|*CatalogsCreateRetailItem* | An item to be created|
|*CatalogsCreativeAssetsAttributes* | |
|*CatalogsCreativeAssetsAvailableFilterValues* | |
|*CatalogsCreativeAssetsBatchItem* | Creative assets batch item|
|*CatalogsCreativeAssetsBatchRequest* | Request object to update catalogs creative assets items|
|*CatalogsCreativeAssetsFeed* | Catalogs Creative Asset Feed object|
|*CatalogsCreativeAssetsFeedsCreateRequest* | Request object for creating a feed.|
|*CatalogsCreativeAssetsFeedsCreateRequest_default_locale* | The locale used within a feed for product descriptions.|
|*CatalogsCreativeAssetsFeedsUpdateRequest* | Request object for updating a feed.|
|*CatalogsCreativeAssetsFilterValuesMap* | A map of filter attributes to their available values.|
|*CatalogsCreativeAssetsItemErrorResponse* | Object describing a creative assets item error|
|*CatalogsCreativeAssetsItemResponse* | Object describing a creative assets item record|
|*CatalogsCreativeAssetsItemsBatch* | Object describing the catalogs creative assets items batch|
|*CatalogsCreativeAssetsItemsPostFilter* | |
|*CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest* | Request object to list products for a given creative assets catalog_id and product group filter.|
|*CatalogsCreativeAssetsProduct* | |
|*CatalogsCreativeAssetsProductGroup* | |
|*CatalogsCreativeAssetsProductGroupCreateRequest* | Request object for creating a creative assets product group.|
|*CatalogsCreativeAssetsProductGroupFilterKeys* | |
|*CatalogsCreativeAssetsProductGroupFilters* | Object holding a group of filters for a creative assets product group|
|*CatalogsCreativeAssetsProductGroupFiltersAllOf* | |
|*CatalogsCreativeAssetsProductGroupFiltersAnyOf* | |
|*CatalogsCreativeAssetsProductGroupProductCounts* | Product counts for a Creative Assets CatalogsProductGroup|
|*CatalogsCreativeAssetsProductGroupUpdateRequest* | Request object for updating a creative assets product group.|
|*CatalogsCreativeAssetsProductMetadata* | Creative assets product metadata entity|
|*CatalogsDeleteCreativeAssetsItem* | A creative assets item to be deleted|
|*CatalogsDeleteHotelItem* | A hotel item to be deleted|
|*CatalogsDeleteRetailItem* | An item to be deleted|
|*CatalogsFeed* | Catalogs Feed object|
|*CatalogsFeedCreateRequestSchema* | |
|*CatalogsFeedCredentials* | This field is **OPTIONAL**. Use this if your feed file requires username and password.|
|*CatalogsFeedIngestion* | |
|*CatalogsFeedIngestionDetails* | |
|*CatalogsFeedIngestionErrors* | |
|*CatalogsFeedIngestionInfo* | |
|*CatalogsFeedIngestionWarnings* | |
|*CatalogsFeedProcessingResult* | |
|*CatalogsFeedProcessingSchedule* | Daily processing schedule. This field is **OPTIONAL**. Use this to configure the preferred time for processing a feed (otherwise random).|
|*CatalogsFeedProcessingScheduleTimezone* | The timezone selected for the processing schedule time|
|*CatalogsFeedProcessingStatus* | |
|*CatalogsFeedProductCounts* | The counts can be null early in the process.|
|*CatalogsFeedUpdateRequestSchema* | |
|*CatalogsFeedValidationDetails* | |
|*CatalogsFeedValidationErrors* | |
|*CatalogsFeedValidationWarnings* | |
|*CatalogsFeedVideoCounts* | Counts of total, ingested, and not ingested videos in the feed file. The counts may not appear early in the process.|
|*CatalogsFeedsCreateRequest* | Request object for creating a feed. Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.|
|*CatalogsFeedsUpdateRequest* | Request object for updating a feed.|
|*CatalogsFormat* | The file format of a feed.|
|*CatalogsHotelAddress* | |
|*CatalogsHotelAttributes* | |
|*CatalogsHotelAvailableFilterValues* | |
|*CatalogsHotelBatchItem* | Hotel batch item|
|*CatalogsHotelBatchRequest* | Request object to update catalogs hotel items|
|*CatalogsHotelFeed* | Catalogs Hotel Feed object|
|*CatalogsHotelFeedsCreateRequest* | Request object for creating a feed. Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.|
|*CatalogsHotelFeedsUpdateRequest* | Request object for updating a feed.|
|*CatalogsHotelFilterValuesMap* | A map of filter attributes to their available values.|
|*CatalogsHotelGuestRatings* | |
|*CatalogsHotelItemErrorResponse* | Object describing a hotel item error|
|*CatalogsHotelItemResponse* | Object describing a hotel record|
|*CatalogsHotelItemsBatch* | Object describing the catalogs hotel items batch. If specified, you must provide all properties.|
|*CatalogsHotelItemsPostFilter* | |
|*CatalogsHotelListProductsByCatalogBasedFilterRequest* | Request object to list products for a given hotel catalog_id and product group filter.|
|*CatalogsHotelMainImage* | The main hotel image|
|*CatalogsHotelProduct* | |
|*CatalogsHotelProductGroup* | |
|*CatalogsHotelProductGroupCreateRequest* | Request object for creating a hotel product group.|
|*CatalogsHotelProductGroupFilterKeys* | |
|*CatalogsHotelProductGroupFilters* | Object holding a group of filters for a hotel product group|
|*CatalogsHotelProductGroupFiltersAllOf* | |
|*CatalogsHotelProductGroupFiltersAnyOf* | |
|*CatalogsHotelProductGroupProductCounts* | Product counts for a Hotel CatalogsProductGroup|
|*CatalogsHotelProductGroupType* | Catalog hotel product group type|
|*CatalogsHotelProductGroupUpdateRequest* | Request object for updating a hotel product group.|
|*CatalogsHotelProductMetadata* | Hotel product metadata entity|
|*CatalogsHotelReportParameters* | Parameters for hotel report|
|*CatalogsHotelReportParametersReport* | |
|*CatalogsHotelReportStatsParameters* | Parameters for hotel report|
|*CatalogsHotelReportStatsParametersReport* | |
|*CatalogsItemValidationDetails* | |
|*CatalogsItemValidationErrors* | |
|*CatalogsItemValidationIssue* | |
|*CatalogsItemValidationIssues* | |
|*CatalogsItemValidationWarnings* | |
|*CatalogsItemsBatch* | Object describing the catalogs items batch|
|*CatalogsItemsBatchPostRequest* | |
|*CatalogsItemsBatchRequest* | Request object of catalogs items batch|
|*CatalogsItemsCreateBatchRequest* | Request object to create catalogs items|
|*CatalogsItemsDeleteBatchRequest* | Request object to delete catalogs items|
|*CatalogsItemsDeleteDiscontinuedBatchRequest* | Request object to discontinue catalogs items|
|*CatalogsItemsPostFilters* | |
|*CatalogsItemsRequest* | Request object of catalogs items|
|*CatalogsItemsUpdateBatchRequest* | Request object to update catalogs items|
|*CatalogsItemsUpsertBatchRequest* | Request object to upsert catalogs items|
|*CatalogsListProductsByFeedBasedFilter* | Request object to list products for a given feed_id and product group filter.|
|*CatalogsListProductsByFilterRequest* | Request object to list products for a given product group filter.|
|*CatalogsLocale* | |
|*CatalogsProduct* | |
|*CatalogsProductGroupCreateRequest* | Request object for creating a product group.|
|*CatalogsProductGroupCurrencyCriteria* | A currency filter. This filter cannot be negated|
|*CatalogsProductGroupFilterKeys* | |
|*CatalogsProductGroupFilterOperatorTypeCriteria* | |
|*CatalogsProductGroupFilters* | Object holding a group of filters for a catalog product group|
|*CatalogsProductGroupFiltersAllOf* | |
|*CatalogsProductGroupFiltersAnyOf* | |
|*CatalogsProductGroupFiltersRequest* | Object holding a group of filters for request on catalog product group.  This is a distinct schema. It is not possible to create or update a Product Group with empty filters. But some automatically generated Product Groups might have empty filters.|
|*CatalogsProductGroupFiltersRequestAnyOfItems0* | |
|*CatalogsProductGroupFiltersRequestAnyOfItems1* | |
|*CatalogsProductGroupMultipleCountriesCriteria* | |
|*CatalogsProductGroupMultipleGenderCriteria* | |
|*CatalogsProductGroupMultipleMediaTypesCriteria* | |
|*CatalogsProductGroupMultiplePinterestProductCategoryCriteria* | |
|*CatalogsProductGroupMultipleStringCriteria* | |
|*CatalogsProductGroupMultipleStringListCriteria* | |
|*CatalogsProductGroupPricingCriteria* | |
|*CatalogsProductGroupProductCountsVertical* | Product counts for a CatalogsProductGroup|
|*CatalogsProductGroupStatus* | |
|*CatalogsProductGroupType* | Catalog product group type  - **MERCHANT_CREATED**: Product groups created by merchants. - **ALL_PRODUCTS**: Consists of every product in your latest successful feed upload. - **BEST_DEALS**: Consists of products with the deepest drop in price. - **PINNER_FAVORITES**: Consists of products that are resonating most with people on Pinterest, based on engagement. - **TOP_SELLERS**: Consists of products with the highest conversion rate, if you have the conversion tag installed. - **BACK_IN_STOCK**: Consists of products that were previously out of stock and are now in stock. - **NEW_ARRIVALS**: Consists of products that are new to your Catalog. - **SHOPIFY_COLLECTIONS**: Product groups created based on Shopify Product Collections. - **I2PC**: Product groups created based on predicted product category. - **CATALOG_EXPANSION**: Consists of high-potential, recommended products from your catalog.|
|*CatalogsProductGroupUint32Criteria* | |
|*CatalogsProductGroupUpdateManyRequestItemsOneOfItems0* | |
|*CatalogsProductGroupUpdateRequest* | Request object for updating a product group.|
|*CatalogsProductGroupsCreateManyRequestItems* | |
|*CatalogsProductGroupsCreateRequestSchema* | |
|*CatalogsProductGroupsUpdateRequestSchema* | |
|*CatalogsReport* | |
|*CatalogsReportDistributionIssueFilter* | |
|*CatalogsReportDistributionStats* | |
|*CatalogsReportFeedIngestionFilter* | |
|*CatalogsReportFeedIngestionStats* | |
|*CatalogsReportParameters* | Report parameters|
|*CatalogsReportStats* | Diagnostics aggregated numbers|
|*CatalogsReportStatsParameters* | Report stats parameters|
|*CatalogsRetailAvailableFilterValues* | |
|*CatalogsRetailBatchRequest* | A request object that can have multiple operations on a single retail batch|
|*CatalogsRetailBatchRequestItemsItems* | |
|*CatalogsRetailFeed* | Catalogs Retail Feed object|
|*CatalogsRetailFeedsCreateRequest* | Request object for creating a retail feed.|
|*CatalogsRetailFeedsUpdateRequest* | Request object for updating a feed.|
|*CatalogsRetailFilterValuesMap* | A map of filter attributes to their available values.|
|*CatalogsRetailItemErrorResponse* | Object describing a retail item error|
|*CatalogsRetailItemResponse* | Object describing a retail item record|
|*CatalogsRetailItemsBatch* | Object describing the catalogs retail items batch|
|*CatalogsRetailItemsPostFilter* | |
|*CatalogsRetailListProductsByCatalogBasedFilterRequest* | Request object to list products for a given retail catalog_id and product group filter.|
|*CatalogsRetailProduct* | |
|*CatalogsRetailProductGroup* | |
|*CatalogsRetailProductGroupCreateRequest* | Request object for creating a product group.|
|*CatalogsRetailProductGroupProductCounts* | Product counts for a Retail CatalogsProductGroup|
|*CatalogsRetailProductGroupUpdateRequest* | Request object for updating a retail product group.|
|*CatalogsRetailProductMetadata* | Retail product metadata entity|
|*CatalogsRetailReportAllItemsFilter* | ALL_ITEMS filter for retail catalogs. Optional product_group_id scopes the report to items in that product group. If omitted, all items are included.|
|*CatalogsRetailReportParameters* | Parameters for retail report|
|*CatalogsRetailReportParametersReport* | |
|*CatalogsRetailReportStatsParameters* | Parameters for retail report|
|*CatalogsRetailReportStatsParametersReport* | |
|*CatalogsStatus* | Status for catalogs entities. Present in catalogs_feed values. When a feed is deleted, the response will inform DELETED as status.|
|*CatalogsType* | Type of the catalog entity.|
|*CatalogsUpdatableCreativeAssetsAttributes* | |
|*CatalogsUpdatableHotelAttributes* | |
|*CatalogsUpdateCreativeAssetsItem* | A creative assets item to be updated.|
|*CatalogsUpdateHotelItem* | Object describing an hotel item batch record|
|*CatalogsUpdateRetailItem* | An item to be updated|
|*CatalogsUpsertCreativeAssetsItem* | A creative assets item to be upserted.|
|*CatalogsUpsertHotelItem* | A hotel item to be upserted.|
|*CatalogsUpsertRetailItem* | An item to be upserted|
|*CatalogsVerticalBatchRequest* | A request object that can have multiple operations on a single batch|
|*CatalogsVerticalFeedsCreateRequest* | Request object for creating a feed.|
|*CatalogsVerticalFeedsUpdateRequest* | Request object for updating a feed.|
|*CatalogsVerticalProductGroup* | |
|*CatalogsVerticalProductGroupCreateRequest* | Request object for creating a catalog based product group.|
|*CatalogsVerticalProductGroupUpdateRequest* | Request object for updating a catalog based product group.|
|*CatalogsVerticalsListProductsByCatalogBasedFilterRequest* | Request object to list products for a given catalog_id and product group filter.|
|*Catalogs_list_200_response* | |
|*Catalogs_local_stores_create_200_response_inner* | |
|*Catalogs_local_stores_create_200_response_inner_data* | Created/updated resource on success or error details on failure|
|*Catalogs_local_stores_create_200_response_inner_data_oneOf* | |
|*Catalogs_local_stores_delete_200_response_inner* | |
|*Catalogs_local_stores_list_200_response* | |
|*Catalogs_product_group_pins_list_200_response* | |
|*Catalogs_product_groups_list_200_response* | |
|*ChangeHistoryDataType* | |
|*ChangeHistoryOperationType* | |
|*CollectionsHeaderType* | Collections ad header type|
|*ConditionFilter* | |
|*ContentType* | |
|*ConversionAccessToken* | A successful conversion access token response.|
|*ConversionApiResponseEventsItems* | |
|*ConversionAttributionWindowDays* | |
|*ConversionDeletionRequest* | Conversion deletion request|
|*ConversionDeletionRequestCreate* | Resource create operation model.|
|*ConversionDeletionRequestEPIKTargets* | |
|*ConversionDeletionRequestStatus* | Represents the status of the conversion deletion request. \"PENDING\" or \"SUBMITTED\". \"PENDING\" meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. \"SUBMITTED\" meaning that the Data Deletion process has begun and can no longer be canceled.|
|*ConversionDeletionRequestTargets* | |
|*ConversionDeletionRequestUserEmailTargets* | |
|*ConversionEvent* | |
|*ConversionEventAppInfo* | Object containing information about the application where event occurred.|
|*ConversionEventDeviceInfo* | Object containing information about the device where event occurred.|
|*ConversionEventIngestionSource* | The source of conversion events ingestion|
|*ConversionEventResponse* | |
|*ConversionEvents* | Conversion events.|
|*ConversionEventsCreate* | Conversion events.|
|*ConversionEventsDataItems* | |
|*ConversionEventsDataItemsCustomData* | Object containing other custom data.|
|*ConversionEventsDataItemsCustomDataContentsItems* | |
|*ConversionEventsUserDataProperties* | |
|*ConversionHealthSelectionItem* | User selection of conversion health criteria for a single feature|
|*ConversionLearningModeType* | oCPM learn mode.|
|*ConversionMSOTEventsCreate* | Resource create operation model.|
|*ConversionObjectiveType* | Intended result of the campaign. You can only update objectives for draft campaigns. `WEB_SESSIONS` and `VIDEO_VIEW` objectives are deprecated. We recommend using `VIDEO_COMPLETION` as an alternative for the latter.|
|*ConversionProductAttributionType* | Conversion product attribution level|
|*ConversionProductReport* | |
|*ConversionProductReportBreakdownType* | |
|*ConversionProductReportCreate* | Resource create operation model.|
|*ConversionProductReportGranularity* | Report granularity for time-based aggregation: - TOTAL: Metrics are aggregated over the specified date range - WEEK: Metrics are broken down weekly - MONTH: Metrics are broken down monthly|
|*ConversionProductReportLevel* | Level of the report|
|*ConversionProductReportingColumn* | Conversion Product Reporting columns|
|*ConversionReportAttributionType* | Attribution type. Refers to the Pinterest Tag endpoints|
|*ConversionReportTimeType* | Conversion report time type|
|*ConversionTag* | |
|*ConversionTagCommon* | |
|*ConversionTagConfigs* | |
|*ConversionTagCreate* | Resource create operation model.|
|*ConversionTagResponse* | |
|*ConversionTagType* | conversion tag type|
|*ConversionTagTypeOptimal* | Conversion tag type|
|*ConversionTagV3GoalMetadata* | |
|*Conversion_deletion_request_list_200_response* | |
|*Conversion_tags_list_200_response* | |
|*Country* | Country ID from ISO 3166-1 alpha-2.|
|*CountryFilter* | |
|*CreateAssetAccessRequestBody* | An object containing a list of all the asset access requests|
|*CreateAssetAccessRequestItem* | |
|*CreateAssetAccessRequestResponse* | |
|*CreateAssetInvitesRequest* | Request body for updating asset roles for existing invites.|
|*CreateAssetInvitesRequestItem* | Object declaring an asset role update to an invite.|
|*CreateInvitesResultsResponseArray* | |
|*CreateMembershipOrPartnershipInvitesBody* | Body to be used on path to send Members or Partners Invite or Request|
|*CreationSource* | The source of conversion events ingestion|
|*CreativeAssetsIdFilter* | |
|*CreativeAssetsProcessingRecord* | Object describing an item processing record|
|*CreativeAssetsVisibilityType* | Creative assets visibility.|
|*CreativeType* | Ad creative type enum. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.|
|*Currency* | Currency Codes from ISO 4217|
|*CurrencyFilter* | |
|*CustomConversionEventMetrics* | |
|*CustomLabel0Filter* | |
|*CustomLabel1Filter* | |
|*CustomLabel2Filter* | |
|*CustomLabel3Filter* | |
|*CustomLabel4Filter* | |
|*CustomNumber0Filter* | |
|*CustomNumber1Filter* | |
|*CustomNumber2Filter* | |
|*CustomNumber3Filter* | |
|*CustomNumber4Filter* | |
|*CustomerList* | |
|*CustomerListCreate* | Resource create operation model.|
|*CustomerListRecordRow* | A single row in a multi-field customer list (v2 format).|
|*CustomerListStatus* | Customer list status. `TOO_SMALL` means the list has fewer than 100 Pinterest users.|
|*CustomerListUpdateWithRequiredBody* | Resource create or update operation model with required body fields (no OptionalProperties).|
|*CustomerListUpload* | |
|*CustomerListUploadCreateRequest* | |
|*CustomerListUploadCreateResponse* | |
|*CustomerSegment* | |
|*CustomerSegmentCreate* | Resource create operation model.|
|*CustomerSegmentUpdateRequestUpdateWithRequiredBody* | Resource create or update operation model with required body fields (no OptionalProperties).|
|*Customer_lists_list_200_response* | |
|*Customer_segment_list_200_response* | |
|*CustomizableCTAType* | Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_SITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only)|
|*DataOutputFormat* | Format of generated report|
|*DataStatus* | Metrics availablity, e.g., \"READY\".|
|*DeleteBusinessMembershipBody* | List of members with role to delete.|
|*DeleteBusinessMembershipMember* | Single instance of a business member to be removed from the business.|
|*DeleteBusinessPartners* | |
|*DeleteBusinessPartnersDelete* | |
|*DeleteMemberAccessResult* | The terminated asset access.|
|*DeleteMemberAccessResultsResponseArray* | |
|*DeleteMemberAssetAccessItem* | |
|*DeletePartnerAssetAccessBody* | An object with a list of partner asset accesses to delete.|
|*DeletePartnerAssetAccessItem* | |
|*DeletePartnerAssetAccessResult* | The terminated asset access.|
|*DeletePartnerAssetAccessResultsResponseArray* | |
|*Delete_business_membership_200_response* | |
|*DeliveryEstimateObjectiveType* | Objective type for delivery estimates.|
|*DeliveryMetricsResponseItemsItems* | |
|*Delivery_metrics_get_200_response* | |
|*DetailedError* | Used for including extra details to a base error|
|*DisclosureType* | Type of information in the page referenced by `disclosure_url`, provided either by the Food and Drug Administration (FDA) or the manufacturer.|
|*DiscountStatus* | Discount status based on the current time and start and end time of discount|
|*DynamicTitlesDownloadCSV* | |
|*DynamicTitlesGetStatus* | |
|*DynamicTitlesProcessCSV* | |
|*DynamicTitlesProcessCSVCreate* | Resource create operation model.|
|*DynamicTitlesProcessCSVError* | |
|*DynamicTitlesUploadURL* | |
|*EnhancedMatchStatusType* | |
|*EntityDataChangeHistory* | |
|*EntityHistory* | |
|*EntityLabel* | |
|*EntityLabelError* | |
|*EntityLabelStatus* | |
|*EntityStatus* | Entity status|
|*ErrorDetail* | |
|*EventData* |     Optional for VISITOR `audience_type`.     With the Pinterest tag, you can use event data to capture event details from your website.     This object lists all the available predefined event data fields in the Pinterest tag.     You can include these event data fields as part of a VISITOR audience’s `rule`; however, you **must** specify an `event` for the `event_data` fields to be evaluated.     Besides what’s listed, you can also create your own set of `event_data` fields and define their usages or purposes according to your website needs.     However, the benefit of using the predefined event data fields is that we can provide various metrics based on those fields' data.     Examples per `event` type:     `pagevisit`     \"event_data\": { \"page_name\": \"My online store 123 | view items | shoe\" }     `signup`     \"event_data\": { \"lead_type\": \"New release promotion\" }     `checkout`     \"event_data\": { \"value\": 116, \"order_quantity\": 2, \"currency\": \"USD\", \"line_items\": [ { \"product_name\": \"Pillows (Set of 2)\", \"product_id\": \"11\", \"product_price\": 48, \"product_quantity\": 1 }, { \"product_name\": \"Pillows, Large (Set of 2)\", \"product_id\": \"15\", \"product_price\": 68, \"product_quantity\": 1 } ] }     `addtocart`     \"event_data\": { \"value\": 499, \"order_quantity\": 1, \"currency\": \"USD\", \"line_items\": [ { \"product_name\": \"Red leather boots\", \"product_id\": \"3486\", \"product_category\": \"shoe\", \"product_variant_id\": \"JB11103000\", \"product_price\": 499, \"product_quantity\": \"1\", \"product_brand\": \"My brand\" }]}     `watchvideo`     \"event_data\": { \"video_title\" : \"My Product Video 01\" }     `lead`     \"event_data\": { \"lead_type\": \"Newsletter\" }|
|*EventProcessingStatus* | Status of a single event in the response.|
|*EventQualityScore* | Schema for GET Conversion EQS response.|
|*Exception* | |
|*FeaturedTrend* | Featured trending topics for a specific interest and market|
|*Feed_processing_results_list_200_response* | |
|*Feeds_list_200_response* | |
|*FilterOperatorType* | |
|*FollowUser* | |
|*FollowUserCreate* | Resource create operation model.|
|*Followers_list_200_response* | |
|*FormFactor* | Device form factor|
|*FreqBidMultiplierTimeWindow* | The time window for frequency bid multipliers.|
|*FrequencyGoalMetadata* | Frequency target can only be between 2 and 20|
|*FrequencyGoalMetadataTimerange* | |
|*FrequencyMultipliers* | This represents a mapping from impression count to a bid price adjustment for frequency-based bidding.  Keys are impression counts (0-10) representing how many times a user has seen the ad. Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price. A value of 0 will stop distribution for this impression count. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).|
|*Gender* | |
|*GenderBucket* | |
|*GenderDemographics* | Gender demographic distribution|
|*GenderFilter* | |
|*GenderMultipliers* | This represents a mapping from gender targeting criteria to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified gender in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. All gender multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).|
|*Get_business_employers_200_response* | |
|*Get_invites_200_response* | |
|*GoogleProductCategory0Filter* | |
|*GoogleProductCategory1Filter* | |
|*GoogleProductCategory2Filter* | |
|*GoogleProductCategory3Filter* | |
|*GoogleProductCategory4Filter* | |
|*GoogleProductCategory5Filter* | |
|*GoogleProductCategory6Filter* | |
|*Granularity* | Specifies the time interval at which analytics data is broken down. Determines how metrics are grouped within the requested date range. **Note:** The `HOUR` enum no longer provides data for conversion metrics, but it still returns data for non-conversion metrics. All other enums are unchanged.|
|*GridClickType* | Where a user is taken after clicking on an ad in grid.  **Note:**  This parameter is read-only and is set to `DIRECT_TO_DESTINATION` by default for direct links supported ads. `grid_click_type` values provided will be ignored.|
|*HotelIdFilter* | |
|*HotelProcessingRecord* | Object describing an item processing record|
|*HttpMethod* | HTTP request method.|
|*ImageDetails* | |
|*ImageMetadata* | |
|*ImageSize* | |
|*IneligibleProductTagErrorItem* | Error item for a product tag that failed eligibility check.|
|*IneligibleProductTagReason* | Reason why a product pin is ineligible for tagging.|
|*IneligibleProductTagsErrorDetails* | Details about ineligible product tags in the request.|
|*IngestionSource* | |
|*IngestionSourceOptions* | List of ingestion sources for a conversion event.|
|*InnerProductCategoriesMetricsHighlights* | |
|*IntegrationLog* | Schema for log sent from an integration application.|
|*IntegrationLogClientError* | System error details included in the log sent by the client.|
|*IntegrationLogClientRequest* | HTTP request details included in the log sent by the client.|
|*IntegrationLogEventType* | Log event type for integration applications.|
|*IntegrationLogLevel* | Log level type for integration applications.|
|*IntegrationLogsInvalidLogResponse* | Schema describing the response when a log has invalid fields.|
|*IntegrationLogsInvalidLogResponseRejectedLogsItems* | |
|*IntegrationLogsRequestCreate* | Resource create operation model.|
|*IntegrationLogsSuccessResponse* | Response when logs are successfully processed.|
|*IntegrationMetadata* | Integration metadata|
|*IntegrationMetadataCreate* | Resource create operation model.|
|*IntegrationMetadataUpdate* | Resource create or update operation model.|
|*IntegrationRecord* | Integration record|
|*Integrations_get_list_200_response* | |
|*IntendedPromotionType* | Specifies the intended promotion type for the campaign.  Note: This field is immutable unless the campaign is in draft status.  **STANDARD_AD** - For ads derived from Pins. - Supported for all objective types except for current CATALOG\\_SALES and WEB\\_CONVERSION, which are being deprecated. - For simplified objective types.  **CATALOG** - For creating product group promotions. - Supported for CONSIDERATION and SALES objective types. - For simplified objective types.  **LEGACY** - Intended only for maintaining backward compatibility. - Must be used for CATALOG\\_SALES and WEB\\_CONVERSION. - Supported for CATALOG\\_SALES and WEB\\_CONVERSION objective types.  **If you do not provide this parameter, the default is:** - LEGACY for CATALOG\\_SALES and WEB\\_CONVERSION - STANDARD_AD for other objective types|
|*Interest* | |
|*InterestsEnum* | |
|*InviteActionResultItem* | An item representing the result of an invite/request action. Contains either an exception (on error) or an invite binding (on success).|
|*InviteAssetsSummary* | Ad accounts and profiles the member/partner will be granted access to with this invite/request.|
|*InviteAssetsSummaryItem* | |
|*InviteBusinessRoleBinding* | An invite object if the invite/request was successfully updated. Will only be provided if the an invite/request is successfully updated.|
|*InviteDataResponse* | Metadata for the invite/request.|
|*InviteExceptionResponse* | An exception object if there is an error performing the action. Will only be provided if there is an error.|
|*InviteFilterStatus* | Invite statuses used for filters.|
|*InviteResponse* | A user's username or email OR a partner id that caused the error.|
|*InviteStatus* | The current status of an invite or request.|
|*InviteType* | The type of invite. MEMBER_INVITE invites a member to access your business assets. PARTNER_INVITE invites a partner to access your business assets. PARTNER_REQUEST requests access to a partner's business assets.|
|*ItemAttributes* | |
|*ItemAttributesRequest* | |
|*ItemAttributesRequestImageLink* | <= 2000 characters The links to the main product images. Images should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your product. The URL of your image_link must be accessible by the Pinterest user-agent, and send the accurate images. Please make sure there are no template or placeholder images at the link. Must start with http:// or https://.|
|*ItemAvailability* | Availability of the item|
|*ItemCreateBatchRecord* | Object describing an item batch record to create items|
|*ItemDeleteBatchRecord* | Object describing an item batch record to delete items|
|*ItemDeleteDiscontinuedBatchRecord* | Object describing an item batch record to discontinue items|
|*ItemGroupIdFilter* | |
|*ItemIdFilter* | |
|*ItemIdStoreCodePair* | A pair of item_id and store_code that uniquely identifies a local inventory item|
|*ItemProcessingRecord* | Object describing an item processing record|
|*ItemProcessingStatus* | The status of the item processing record|
|*ItemResponse* | Object describing an item record or error. Discriminated by `item_response_kind` (one unique value per leaf).|
|*ItemUpdateBatchRecord* | Object describing an item batch record to update items|
|*ItemUpsertBatchRecord* | Object describing an item batch record to upsert items|
|*ItemValidationEvent* | Object describing an item validation event|
|*Items_issues_list_200_response* | |
|*Items_post_200_response* | |
|*Keyword* | |
|*KeywordCreateItem* | |
|*KeywordError* | |
|*KeywordInfo* | Related Keyword information of the editorial article|
|*KeywordMetrics* | Keyword metrics JSON|
|*KeywordMetricsResponse* | |
|*KeywordUpdateGenerated* | |
|*KeywordUpdateItem* | |
|*Keywords* | |
|*KeywordsCommon* | |
|*KeywordsCreate* | Resource create operation model.|
|*KeywordsMetricsArrayResponse* | |
|*KeywordsRequest* | |
|*KeywordsUpdate* | Resource create or update operation model.|
|*Keywords_get_200_response* | |
|*Label* | |
|*LabelBulkCreateRequest* | |
|*LabelBulkUpdateRequest* | |
|*LabelCreateItem* | |
|*LabelCreateRequest* | |
|*LabelError* | |
|*LabelErrorData* | |
|*LabelParentType* | Label parent entity type.|
|*LabelStatus* | Label status values.|
|*LabelStatusBulkUpdate* | Set status to `ARCHIVED` to remove the label from the parent entity.|
|*LabelType* | Label type values.|
|*LabelUpdateItem* | |
|*LabelUpdateRequest* | |
|*LabeledEntities* | |
|*LabeledEntitiesCreate* | Resource create operation model.|
|*LabelsResponse* | |
|*Labels_list_200_response* | |
|*Language* | Language code, which is among the official ISO 639-1 language list.|
|*LeadForm* | |
|*LeadFormBatchUpdate* | |
|*LeadFormCreate* | Resource create operation model.|
|*LeadFormPolicyLink* | |
|*LeadFormQuestion* | |
|*LeadFormQuestionFieldType* | Lead form question field type|
|*LeadFormQuestionType* | Lead form question type|
|*LeadFormStatus* | Status of the lead form|
|*LeadFormTest* | Lead form test action: submit sample answers and receive the resulting subscription id.|
|*LeadFormTestCreate* | Resource create operation model.|
|*LeadSubscription* | |
|*LeadSubscriptionCreate* | |
|*LeadSubscriptionPostParams* | |
|*LeadSubscriptionPostParamsCreate* | |
|*Lead_forms_create_200_response* | |
|*Lead_forms_create_200_response_items_inner* | |
|*Lead_forms_list_200_response* | |
|*LeadsExportResponseData* | |
|*LeadsExportStatus* | Status of a leads export job|
|*LeadsExports* | |
|*LeadsExportsCreate* | Resource create operation model.|
|*LineItem* | |
|*LinkFilter* | |
|*LinkedBusiness* | |
|*LocalInventoryCreateOperation* | Create operation for local inventory item|
|*LocalInventoryDeleteOperation* | Delete operation for local inventory item|
|*LocalInventoryItemResponse* | Local inventory item response|
|*LocalInventoryItemsBatch* | Unified model for local inventory items batch operation|
|*LocalInventoryItemsBatchCreate* | Resource create operation model.|
|*LocalInventoryItemsGet* | Model for getting local inventory items|
|*LocalInventoryItemsGetCreate* | Resource create operation model.|
|*LocalInventoryOperation* | |
|*LocalInventoryOperationResult* | Result model for local inventory operation|
|*LocalInventoryUpdateOperation* | Update operation for local inventory item|
|*LocalInventoryUpsertOperation* | Upsert operation for local inventory item|
|*LocalStore* | Local store entity|
|*LocalStoreBatchUpdate* | |
|*LocalStoreCreate* | Resource create operation model.|
|*LookbackPeriodOptions* | Days in lookback window in the GET Conversion EQS response.|
|*MMMReport* | |
|*MMMReportCreate* | Resource create operation model.|
|*MMMReportGranularity* | |
|*MMMReportLevel* | |
|*MMMReportingColumn* | Marketing Mix Modeling (MMM) Reporting Columns|
|*MMMReportingTargetingType* | Ad targeting types for MMM report|
|*MatchType* | Keyword match type|
|*MatchTypeResponse* | Keyword match type|
|*MaxPriceFilter* | |
|*Media* | |
|*MediaType* | |
|*MediaTypeFilter* | |
|*MediaUpload* | Media upload that has been registered but not uploaded/processed yet.|
|*MediaUploadCreate* | Resource create operation model.|
|*MediaUploadParameters* | |
|*MediaUploadStatus* | |
|*MediaUploadType* | |
|*Media_list_200_response* | |
|*MemberBusinessRole* | The access level a member/partner has to the business. Values are case-sensitive. - EMPLOYEE: Can only view and access ad accounts you assign to them. They cannot see details about other employees, external partners or other ad accounts. - BIZ_ADMIN: Have full control of roles and can add employees, external partners as well as grant ad account access.|
|*MetricsReportingLevel* | Level of the reporting request|
|*MetricsReportingTemplateType* | Reporting template type|
|*MetricsResponse* | |
|*MetricsResponseDataItems* | |
|*MinPriceFilter* | |
|*MobileAppPlatform* | [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Platform of the mobile app for an `APP_INSTALL` campaign.|
|*MsotEventName* | Type of user conversion event.|
|*MultiPinsAnalyticsMetricTypesItem* | Pin metric type for multi-pin analytics|
|*NetworkType* | Type of network connection.|
|*NonDraftEntityStatus* | Entity status|
|*NonNullableCatalogsCurrency* | Currency Codes from ISO 4217.|
|*NotificationPostRequest* | Notification request body. Can be either a batch of notification objects or a single notification object.|
|*NotificationResponse* | |
|*NullableCatalogsItemFieldType* | Product item fields|
|*NullableCurrency* | Currency Codes from ISO 4217.|
|*NullableEntityStatus* | Entity status|
|*NullableLabelStatus* | The new status you want to give the label, either `ACTIVE` (in use) or no longer in use (`ARCHIVED`).|
|*NullableLabelType* | Category for the labeled items. You can apply one BRAND label to a campaign. You can apply 30 CUSTOM labels to a campaign.|
|*NullableOptimizationGoalMetadata* | |
|*NullablePartnerType* | |
|*NullalbleMatchType* | Keyword match type allowing null|
|*NumericFilterOperatorType* | |
|*OauthAccessToken* | Describes the valid schema for possible OAuth access token requests.|
|*ObjectiveType* | Advertiser campaign objective type. You can only update objectives for draft campaigns. `CTV_CONSIDERATION` is in BETA. `WEB_SESSIONS` and `VIDEO_VIEW` objectives are deprecated. We recommend using `VIDEO_COMPLETION` as an alternative for the latter.|
|*OperationType* | Operation type to share a specific audience or revoke access to a previously shared audience|
|*OptimizationGoalMetadata* | |
|*OptimizationType* | Optimization type for ad group delivery estimates. Supported types vary by objective.|
|*Order* | |
|*OrderLine* | |
|*OrderLineMutationError* | |
|*OrderLineMutationResponse* | |
|*OrderLineMutationResult* | |
|*OrderLinePaidType* | Order Line Paid Type|
|*OrderLineStatus* | Order Line Status|
|*Order_lines_list_200_response* | |
|*OsFamily* | Operating system family.|
|*OverallStatusOptions* | Overall status of event quality score.|
|*PacingDeliveryType* | Ad group pacing delivery type. With ACCELERATED, an ad group budget is spent as fast as possible. With STANDARD, an ad group budget is spent smoothly over a day. When using CBO, only the STANDARD pacing delivery type is allowed.|
|*Page_visit_conversion_tags_get_200_response* | |
|*PartnerMetadata* | |
|*PartnerType* | |
|*PerformancePlusCampaignSettings* | Pinterest Performance+ campaign settings.|
|*Permissions* | Permission levels available on a business asset.|
|*PermissionsWithOwner* | Permission levels including the OWNER role.|
|*Pin* | |
|*PinAnalyticsDailyMetrics* | |
|*PinAnalyticsMetricsResponse* | |
|*PinBase* | |
|*PinCreate* | Resource create operation model.|
|*PinFilter* | |
|*PinMedia* | Pin media that can be an image, video, or a mix of both.|
|*PinMediaMetadata* | Per-item entry inside `PinMedia.items` for mixed image/video pins. Discriminated by `item_type`.|
|*PinMediaSource* | Pin media source that can be an image, video, or a mix of both passed in as a request.|
|*PinMediaSourceImageBase64* | Image Base64-based media source.|
|*PinMediaSourceImageURL* | Image URL-based media source.|
|*PinMediaSourceImagesBase64* | Multiple Base64-based images media source|
|*PinMediaSourceImagesBase64Item* | |
|*PinMediaSourceImagesURL* | Multiple URL-based images media source|
|*PinMediaSourceImagesURLItem* | |
|*PinMediaSourcePinURL* | Pin URL-based media source for product pin creation. Currently the field is only available to a list of beta users.|
|*PinMediaSourceVideoID* | Video ID-based media source.|
|*PinMediaWithImage* | Pin with image.|
|*PinMediaWithImageAndVideo* | Pin with a mix of images and videos.|
|*PinMediaWithImages* | Pin with multiple images.|
|*PinMediaWithVideo* | Pin with video.|
|*PinMediaWithVideos* | Pin with multiple videos.|
|*PinPromotionSummaryStatus* | Summary status for pin promotions|
|*PinRead* | |
|*PinType* | |
|*PinUpdate* | Resource create or update operation model.|
|*PinnerListType* | Audience type|
|*PinsSaveRequestCreate* | Resource create operation model.|
|*Pins_list_200_response* | |
|*Pinterest.Lib.BatchItemException* | Exception details for a batch operation item.|
|*Pinterest.Lib.Error* | Default error response|
|*Pinterest.Lib.PaginationOrder* | |
|*Pinterest.Lib.Status204* | The resource was successfully deleted.|
|*PinterestProductCategoriesFilter* | |
|*PlacementGroupType* | Campaign placement group type|
|*PlacementMultipliers* | This represents a mapping from placement to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified placement in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).|
|*PlacementTrafficType* | A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both.|
|*PlacementType* | Placement type for bid multiplier targeting.|
|*PredictedTimeSeries* | |
|*PreferredMediaType* | Select whether to promote the image or video pin by default for items in the promoted product group. If selecting IMAGE, image will be promoted for all ads in the product group, and when selecting VIDEO, video will be promoted when present, otherwise fall back to image. This is applicable for standard shopping ads only.|
|*PriceFilter* | |
|*PriceFilterPrice* | |
|*PrimarySort* | Whether to first sort the report by date or by ID|
|*ProductAvailability* | Product availability.|
|*ProductAvailabilityType* | Default availability for products in a feed.|
|*ProductCategoriesDemographic* | Age and gender distribution who engaged with this product category in the past 3 months|
|*ProductCategoriesEngagementType* | |
|*ProductCategoriesMetricsHighlights* | Key performance metrics highlights for this product category|
|*ProductCategoryDetailLookbackWindow* | |
|*ProductCategoryDetails* | Product category details|
|*ProductCategoryEnum* | List of product category details|
|*ProductCategoryRegion* | |
|*ProductCondition* | |
|*ProductGroupAnalyticsItems* | |
|*ProductGroupPromotion* | |
|*ProductGroupPromotionCreateRequest* | |
|*ProductGroupPromotionCustomizableCTAType* | Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are SHOP_NOW, BOOK_NOW, ON_SALE, GET_DEAL, BUY_ONLINE_PICKUP_IN_STORE|
|*ProductGroupPromotionResponseItem* | |
|*ProductGroupPromotionUpdateRequest* | |
|*ProductGroupPromotions* | Wrapper model for ProductGroupPromotion.|
|*ProductGroupPromotionsCreate* | Resource create operation model.|
|*ProductGroupPromotionsUpdateWithRequiredBody* | Resource create or update operation model with required body fields (no OptionalProperties).|
|*ProductGroupReferenceFilter* | |
|*ProductGroupSummaryStatus* | Summary status for product group|
|*ProductTagItem* | Product tag request item containing the pin_id of the product to tag.|
|*ProductTagsBulkAddRequest* | Request body for bulk adding product tags to a pin.|
|*ProductTagsBulkDeleteRequest* | Request body for bulk deleting product tags from a pin.|
|*ProductTagsError* | Error response for requests containing ineligible product tags.|
|*ProductTagsResponse* | Response containing a list of product tags for a pin.|
|*ProductType0Filter* | |
|*ProductType1Filter* | |
|*ProductType2Filter* | |
|*ProductType3Filter* | |
|*ProductType4Filter* | |
|*Product_group_promotions_list_200_response* | |
|*Promotion* | |
|*PromotionApplicationLevel* | Specify if the promotion is applied at ad group or item level.|
|*PromotionArrayElement* | |
|*PromotionBatchUpdate* | |
|*PromotionCreate* | Resource create operation model.|
|*PromotionTemplateValue* | |
|*PromotionType* | Determines the displayed promotion text along with what parameters (if any) are needed to complete the template.|
|*PromotionsResponse* | |
|*Promotions_list_200_response* | |
|*PublicTargetingType* | Public ad targeting type with external names|
|*QualityComponentDetails* | Metrics for a specific event type within a quality component.|
|*QualityComponentIssue* | Details of an issue with a quality component.|
|*QualityComponents* | Set of quality components, with each component containing a event coverage and details.|
|*QueryLabelEntityStatusesItems* | |
|*QueryLabelTypesItems* | |
|*QuerymetrictypesItems* | |
|*QuerypinanalyticsmetrictypesItems* | |
|*QueryvideopinmetrictypesItems* | |
|*QuizPinData* | This field includes all quiz data including questions, options, and results.|
|*QuizPinOption* | This field contains multiple options to a quiz question.|
|*QuizPinQuestion* | A specific quiz inquiry.|
|*QuizPinResult* | The result, and link out, based on the user’s choice.|
|*RecordCounts* | |
|*RelatedTerms* | |
|*RelatedTermsRelatedTermsListItems* | |
|*ReportType* | |
|*ReportingColumn* | Reporting Columns|
|*ReportingColumnAsync* | Reporting columns|
|*ReportingColumnSync* | Reporting columns for sync reporting endpoints|
|*ReportingTimeZone* | Specify the timezone to be applied for the reporting.|
|*Reports_stats_200_response* | |
|*RespondToInviteResultItem* | |
|*RespondToInvitesResponseArray* | |
|*RetailLocalInventoryItemAttributes* | Local inventory attributes for retail items (required fields for create/upsert)|
|*RetailLocalInventoryItemAttributesOptional* | Local inventory attributes for retail items (all fields optional for update/get)|
|*Role* | An internal role type used on business access, EMPLOYEE, ADMIN.|
|*S3FilePart* | |
|*S3MultipartUploadData* | |
|*SSIOAccount* | Salesforce account details including bill-to information.|
|*SSIOAccountAddress* | Salesforce address information.|
|*SSIOAccountItem* | Salesforce account item with billing and terms information.|
|*SSIOAccountPMPName* | Pinterest marketing partner name.|
|*SSIOInsertionOrder* | An SSIO insertion order.|
|*SSIOInsertionOrderCreate* | Resource create operation model.|
|*SSIOInsertionOrderStatus* | SSIO insertion order status item in a list response.|
|*SSIOInsertionOrderStatusResponse* | SSIO insertion order status response for a single pin order id lookup.|
|*SSIOInsertionOrderUpdate* | Resource create or update operation model.|
|*SSIOOrderLine* | A Salesforce SSIO order line.|
|*SSIOOrderLineType* | The type of an SSIO order line.|
|*Schedule* | |
|*ScheduleAction* | The schedule action|
|*ScheduleAgeBucketMultipliers* | This represents a mapping from age bucket to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All age bucket multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.|
|*ScheduleAppTypeMultipliers* | This represents a mapping from app type targeting criteria to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.|
|*ScheduleAudienceMultipliers* | This represents a mapping from Audience ID to a bid price change value. This is paired with the bid_multipliers schedule type. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All audience multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.|
|*ScheduleBatchUpdate* | |
|*ScheduleBidMultipliers* | The value of the bid changes. This must be provided when the schedule type is CAMPAIGN_BID_MULTIPLIERS.|
|*ScheduleBidOptions* | Object describing the schedule level bid level changes.|
|*ScheduleBidOptions_gender_multipliers* | This represents a mapping from gender targeting criteria to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All gender multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.|
|*ScheduleBidOptions_placement_multipliers* | This represents a mapping from placement to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.|
|*ScheduleCommonDeltaValue* | |
|*ScheduleCreate* | Resource create operation model.|
|*ScheduleCreateRequest* | |
|*ScheduleCreateRequestAllOf1* | |
|*ScheduleGenderMultipliers* | This represents a mapping from gender targeting criteria to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All gender multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.|
|*SchedulePlacementMultipliers* | This represents a mapping from placement to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.|
|*ScheduleStatus* | Schedule status|
|*ScheduleType* | The schedule type|
|*ScheduleUpdateRequest* | |
|*ScheduleUpdateRequestAllOf1* | |
|*Schedule_delta_value* | The value of the scheduled adjustment.|
|*Schedules_create_200_response_inner* | |
|*Schedules_create_200_response_inner_data* | Created/updated resource on success or error details on failure|
|*Schedules_create_200_response_inner_data_oneOf* | |
|*Schedules_list_200_response* | |
|*ScrollupGoalMetadata* | |
|*Search_partner_pins_200_response* | |
|*SharedAudienceAccount* | |
|*Shared_audiences_for_business_list_200_response* | |
|*SingleInterestTargetingOption* | |
|*SourcePlatformOptions* | List of source platforms for a conversion event.|
|*Ssio_insertion_orders_status_get_by_ad_account_200_response* | |
|*Ssio_order_lines_get_by_ad_account_200_response* | |
|*StandardPinMetricTypes* | Standard Pin metric types|
|*StoreMetadata* | Store metadata for a specific store location|
|*SummaryPin* | Summarized pin information|
|*SummaryStatus* | Summary status for campaign|
|*SupplementalItemBatchOperationStatus* | The status of the batch operation|
|*SupplementalItemProcessingStatus* | The status of the item processing record|
|*SupplementalItemValidationEvent* | Item validation event|
|*SupplementalItemsBatchResponse* | Response model for supplemental items batch operation|
|*SupplementalOperationResult* | Result of a supplemental item operation, discriminated by supplemental_type|
|*SystemUserUpdateWithRequiredBody* | Resource create or update operation model with required body fields (no OptionalProperties).|
|*TargetingAdvertiserCountry* | Advertiser's ISO two character country code.|
|*TargetingSpec* | Ad group targeting specification defining the ad group target audience. For example, `{\"APPTYPE\":[\"iphone\"], \"GENDER\":[\"male\"], \"LOCALE\":[\"en-US\"], \"LOCATION\":[\"501\"], \"MINIMUM_AGE\":\"18\", \"MAXIMUM_AGE\":\"65+\"}`|
|*TargetingSpecAgeBucket* | |
|*TargetingSpecAppType* | |
|*TargetingSpecGender* | |
|*TargetingSpecListOperation* | |
|*TargetingSpecOperationAgeBucket* | |
|*TargetingSpecOperationAppType* | |
|*TargetingSpecOperationAudienceExclude* | |
|*TargetingSpecOperationAudienceInclude* | |
|*TargetingSpecOperationGender* | |
|*TargetingSpecOperationGeo* | |
|*TargetingSpecOperationGeoExclude* | |
|*TargetingSpecOperationInterest* | |
|*TargetingSpecOperationLocale* | |
|*TargetingSpecOperationLocation* | |
|*TargetingSpecOperationLocationExclude* | |
|*TargetingSpecOperationMaximumAge* | |
|*TargetingSpecOperationMinimumAge* | |
|*TargetingSpecOperationShoppingRetargeting* | |
|*TargetingSpecOperations* | |
|*TargetingSpecOptimal* | |
|*TargetingSpecShoppingRetargeting* | |
|*TargetingSpecTargetingStrategyItems* | |
|*TargetingStrategy* | |
|*TargetingTemplate* | |
|*TargetingTemplateAudienceSizing* | Gets an audience size estimate for a set of given targeting spec data. **Returns:** An object containing an audience size estimate that has a reach estimate (number of unique users) against the given targeting template. This by default provides a monthly estimate.|
|*TargetingTemplateAudienceSizingReachEstimate* | |
|*TargetingTemplateCreate* | Resource create operation model.|
|*TargetingTemplateKeyword* | |
|*TargetingTemplateStatus* | Indicate targeting template is active or Deleted|
|*TargetingTemplateUpdateRequestReadOrUpdate* | |
|*Targeting_template_list_200_response* | |
|*TemplateBasedReport* | |
|*TemplateBasedReportCreate* | Resource create operation model.|
|*Templates_list_200_response* | |
|*TermsOfService* | The ID of the ad account.|
|*TieBreakerType* | Quiz ad tie breaker type, default is RANDOM|
|*TimeSeries* | |
|*TitleKeywordsFilter* | |
|*TokenGrantType* | The type of OAuth grant being requested.|
|*TokenTypeHint* | The type of token to revoke.|
|*TopPinsAnalyticsResponse* | |
|*TopPinsAnalyticsResponseDateAvailability* | |
|*TopPinsAnalyticsResponsePinsItems* | Array with metrics, status, and pin id for the requested metric|
|*TopPinsSortBy* | Sort metric for top pins analytics.|
|*TopVideoPinsAnalyticsResponse* | |
|*TopVideoPinsAnalyticsResponseDateAvailability* | |
|*TopVideoPinsAnalyticsResponsePinsItems* | Array with metrics, status, and pin id for the requested metric|
|*TopVideoPinsSortBy* | Sort metric for top video pins analytics.|
|*TotalCountByEntityStatus* | Breakdown of asset counts by entity status.|
|*TrackingUrls* |   Third-party tracking URLs. Up to three tracking URLs - with a max length of 2,000 - are supported for   each event type. Tracking URLs set at the ad group or ad level can override   those set at the campaign level. For more information, see [Third-party and dynamic tracking](https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking).|
|*TrendType* | |
|*TrendingKeyword* | |
|*TrendingKeywordDemographics* | A mapping of demographic dimensions (e.g. \"gender\", \"age\") to their category distributions. For each dimension: Key: The category (e.g., \"female\", \"18-24\"). Value: The proportion of search volume (e.g., 0.12 for 12%). Values less than 0.05 are set to 0.04 for privacy. The sum for all categories in a dimension will approximately equal 1. Only applicable when `include_demographics` query parameter is set to `true`.|
|*TrendingKeywordsResponse* | |
|*TrendingPin* | Pin image data for trending topics|
|*TrendingProductCategory* | Trending shopping product category|
|*TrendingTopic* | Individual trending topic within an interest category|
|*TrendsAgeBucket* | |
|*TrendsAgeDistribution* | This represents a mapping from age bucket to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.|
|*TrendsEditorial* | Information of the published editorial article.|
|*TrendsGender* | Gender category for trends demographic distribution.|
|*TrendsGenderDistribution* | This represents a mapping from gender to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.|
|*TrendsGenderFilter* | Gender category for trends demographic distribution.|
|*TrendsL1Interest* | L1 interest categories for filtering trends.|
|*TrendsSupportedRegion* | |
|*UpdatableItemAttributes* | |
|*UpdatableItemAttributesGtin* | The unique universal product identifier.|
|*UpdateBusinessMembershipsResponse* | |
|*UpdateInvitesResultsResponseArray* | |
|*UpdateMaskBidOptionField* | bid option field to apply operation updates to|
|*UpdateMaskFieldType* | The field types supported by the update mask|
|*UpdateMemberAssetAccessBody* | An object with a list of all the new member asset accesses.|
|*UpdateMemberAssetAccessItem* | |
|*UpdateMemberAssetResultItem* | |
|*UpdateMemberAssetsResultsResponseArray* | |
|*UpdatePartnerAssetAccessBody* | An object with a list of partner asset accesses to assign or update.|
|*UpdatePartnerAssetAccessItem* | |
|*UpdatePartnerAssetsResult* | An object containing the permissions a business partner has on the asset.|
|*UpdatePartnerAssetsResultsResponseArray* | |
|*UserAccountType* | |
|*UserBusinessRoleBinding* | |
|*UserFollowingFeedType* | Specifies the type of followees to be kept when filtering them.|
|*UserListOperationType* | User list operation type (add or remove)|
|*UserListType* | User list type|
|*UserSingleAssetBinding* | An object containing the permissions a business member/partner has on the asset.|
|*UserWebsite* | |
|*UserWebsiteCreate* | Resource create operation model.|
|*UserWebsiteVerification* | |
|*User_account_followed_interests_200_response* | |
|*User_websites_get_200_response* | |
|*UsersForIndividualAssetResponse* | An object containing the permissions a business member has on the asset.|
|*VerticalProductCategory* | List of verticals for product categories.|
|*VideoMetadataWithItemType* | |
|*VideoPinMetricTypes* | Video Pin metric types|
|*WebsiteVerificationMethod* | Method used to verify website ownership.|
|*WorkloadState* | Workload processing state|

