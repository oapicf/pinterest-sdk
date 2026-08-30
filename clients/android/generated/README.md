# openapi-android-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>org.openapitools</groupId>
    <artifactId>openapi-android-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-android-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

- target/openapi-android-client-1.0.0.jar
- target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import org.openapitools.client.api.AdAccountsApi;

public class AdAccountsApiExample {

    public static void main(String[] args) {
        AdAccountsApi apiInstance = new AdAccountsApi();
        Date startDate = null; // Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
        Date endDate = null; // Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
        List<ReportingColumnSync> columns = null; // List<ReportingColumnSync> | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
        Granularity granularity = null; // Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
        String adAccountId = null; // String | Unique identifier of an ad account.
        BigDecimal clickWindowDays = 30; // BigDecimal | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
        BigDecimal engagementWindowDays = 30; // BigDecimal | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
        BigDecimal viewWindowDays = 1; // BigDecimal | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
        String conversionReportTime = TIME_OF_AD_ACTION; // String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
        ReportingTimeZone reportingTimezone = null; // ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
        try {
            List<AdAccountAnalyticsItems> result = apiInstance.adAccountAnalytics(startDate, endDate, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, reportingTimezone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdAccountsApi#adAccountAnalytics");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.pinterest.com/v5*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AdAccountsApi* | [**adAccountAnalytics**](docs/AdAccountsApi.md#adAccountAnalytics) | **GET** /ad_accounts/{ad_account_id}/analytics | Get ad account analytics
*AdAccountsApi* | [**adAccountTargetingAnalyticsGet**](docs/AdAccountsApi.md#adAccountTargetingAnalyticsGet) | **GET** /ad_accounts/{ad_account_id}/targeting_analytics | Get targeting analytics for an ad account
*AdAccountsApi* | [**adAccountsCreate**](docs/AdAccountsApi.md#adAccountsCreate) | **POST** /ad_accounts | Create ad account
*AdAccountsApi* | [**adAccountsGet**](docs/AdAccountsApi.md#adAccountsGet) | **GET** /ad_accounts/{ad_account_id} | Get ad account
*AdAccountsApi* | [**adAccountsList**](docs/AdAccountsApi.md#adAccountsList) | **GET** /ad_accounts | List ad accounts
*AdAccountsApi* | [**analyticsCreateConversionProductReport**](docs/AdAccountsApi.md#analyticsCreateConversionProductReport) | **POST** /ad_accounts/{ad_account_id}/reports/brand_category_sku | Create a request for a brand, category, SKU report
*AdAccountsApi* | [**analyticsCreateMmmReport**](docs/AdAccountsApi.md#analyticsCreateMmmReport) | **POST** /ad_accounts/{ad_account_id}/mmm_reports | Create a request for a Marketing Mix Modeling (MMM) report
*AdAccountsApi* | [**analyticsCreateReport**](docs/AdAccountsApi.md#analyticsCreateReport) | **POST** /ad_accounts/{ad_account_id}/reports | Create async request for an account analytics report
*AdAccountsApi* | [**analyticsCreateTemplateReport**](docs/AdAccountsApi.md#analyticsCreateTemplateReport) | **POST** /ad_accounts/{ad_account_id}/templates/{template_id}/reports | Create async request for an analytics report using a template
*AdAccountsApi* | [**analyticsGetConversionProductReport**](docs/AdAccountsApi.md#analyticsGetConversionProductReport) | **GET** /ad_accounts/{ad_account_id}/reports/brand_category_sku | Get advertiser brand, category, SKU report
*AdAccountsApi* | [**analyticsGetMmmReport**](docs/AdAccountsApi.md#analyticsGetMmmReport) | **GET** /ad_accounts/{ad_account_id}/mmm_reports | Get advertiser Marketing Mix Modeling (MMM) report.
*AdAccountsApi* | [**analyticsGetReport**](docs/AdAccountsApi.md#analyticsGetReport) | **GET** /ad_accounts/{ad_account_id}/reports | Get the account analytics report created by the async call
*AdAccountsApi* | [**sandboxDelete**](docs/AdAccountsApi.md#sandboxDelete) | **DELETE** /ad_accounts/{ad_account_id}/sandbox | Delete ads data for ad account in API Sandbox
*AdAccountsApi* | [**templatesList**](docs/AdAccountsApi.md#templatesList) | **GET** /ad_accounts/{ad_account_id}/templates | List templates
*AdGroupsApi* | [**adGroupsAnalytics**](docs/AdGroupsApi.md#adGroupsAnalytics) | **GET** /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics
*AdGroupsApi* | [**adGroupsAudienceSizing**](docs/AdGroupsApi.md#adGroupsAudienceSizing) | **POST** /ad_accounts/{ad_account_id}/ad_groups/audience_sizing | Get audience sizing
*AdGroupsApi* | [**adGroupsBidFloorGet**](docs/AdGroupsApi.md#adGroupsBidFloorGet) | **POST** /ad_accounts/{ad_account_id}/bid_floor | Get bid floors
*AdGroupsApi* | [**adGroupsCreate**](docs/AdGroupsApi.md#adGroupsCreate) | **POST** /ad_accounts/{ad_account_id}/ad_groups | Create ad groups
*AdGroupsApi* | [**adGroupsDynamicTitlesDownloadCsv**](docs/AdGroupsApi.md#adGroupsDynamicTitlesDownloadCsv) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/csv | Get dynamic titles CSV download URL
*AdGroupsApi* | [**adGroupsDynamicTitlesGetStatus**](docs/AdGroupsApi.md#adGroupsDynamicTitlesGetStatus) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/status | Get dynamic titles status
*AdGroupsApi* | [**adGroupsDynamicTitlesGetUploadUrl**](docs/AdGroupsApi.md#adGroupsDynamicTitlesGetUploadUrl) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/uploads | Get dynamic titles upload URL
*AdGroupsApi* | [**adGroupsDynamicTitlesProcessCsv**](docs/AdGroupsApi.md#adGroupsDynamicTitlesProcessCsv) | **POST** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles | Process dynamic titles CSV
*AdGroupsApi* | [**adGroupsGet**](docs/AdGroupsApi.md#adGroupsGet) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id} | Get ad group
*AdGroupsApi* | [**adGroupsList**](docs/AdGroupsApi.md#adGroupsList) | **GET** /ad_accounts/{ad_account_id}/ad_groups | List ad groups
*AdGroupsApi* | [**adGroupsTargetingAnalyticsGet**](docs/AdGroupsApi.md#adGroupsTargetingAnalyticsGet) | **GET** /ad_accounts/{ad_account_id}/ad_groups/targeting_analytics | Get targeting analytics for ad groups
*AdGroupsApi* | [**adGroupsUpdate**](docs/AdGroupsApi.md#adGroupsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/ad_groups | Update ad groups
*AdGroupsApi* | [**getAdGroupsByPromotionIdsList**](docs/AdGroupsApi.md#getAdGroupsByPromotionIdsList) | **GET** /ad_accounts/{ad_account_id}/promotion_applied_entities | List of ad groups using promotions IDs.
*AdsApi* | [**adPreviewsCreate**](docs/AdsApi.md#adPreviewsCreate) | **POST** /ad_accounts/{ad_account_id}/ad_previews | Create ad preview with pin or image
*AdsApi* | [**adTargetingAnalyticsGet**](docs/AdsApi.md#adTargetingAnalyticsGet) | **GET** /ad_accounts/{ad_account_id}/ads/targeting_analytics | Get targeting analytics for ads
*AdsApi* | [**adsAnalytics**](docs/AdsApi.md#adsAnalytics) | **GET** /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics
*AdsApi* | [**adsCreate**](docs/AdsApi.md#adsCreate) | **POST** /ad_accounts/{ad_account_id}/ads | Create ads
*AdsApi* | [**adsGet**](docs/AdsApi.md#adsGet) | **GET** /ad_accounts/{ad_account_id}/ads/{ad_id} | Get ad
*AdsApi* | [**adsList**](docs/AdsApi.md#adsList) | **GET** /ad_accounts/{ad_account_id}/ads | List ads
*AdsApi* | [**adsUpdate**](docs/AdsApi.md#adsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/ads | Update ads
*AdsApi* | [**campaignAdPreviewCreate**](docs/AdsApi.md#campaignAdPreviewCreate) | **POST** /ad_accounts/{ad_account_id}/campaign_ad_preview | Create ad preview records for one or more ad groups
*AdsApi* | [**campaignAdPreviewDelete**](docs/AdsApi.md#campaignAdPreviewDelete) | **DELETE** /ad_accounts/{ad_account_id}/campaign_ad_preview | Delete ad preview records for one or more ad groups
*AdsApi* | [**campaignAdPreviewRead**](docs/AdsApi.md#campaignAdPreviewRead) | **GET** /ad_accounts/{ad_account_id}/campaign_ad_preview | Fetch ad preview records for one or more ad groups
*AdvancedAuctionApi* | [**advancedAuctionItemsGetPost**](docs/AdvancedAuctionApi.md#advancedAuctionItemsGetPost) | **POST** /advanced_auction/items/get | Get item bid options (POST)
*AdvancedAuctionApi* | [**advancedAuctionItemsSubmitPost**](docs/AdvancedAuctionApi.md#advancedAuctionItemsSubmitPost) | **POST** /advanced_auction/items/submit | Operate on item level bid options
*AudienceInsightsApi* | [**audienceInsightsGet**](docs/AudienceInsightsApi.md#audienceInsightsGet) | **GET** /ad_accounts/{ad_account_id}/audience_insights | Get audience insights
*AudienceInsightsApi* | [**audienceInsightsScopeAndTypeGet**](docs/AudienceInsightsApi.md#audienceInsightsScopeAndTypeGet) | **GET** /ad_accounts/{ad_account_id}/insights/audiences | Get audience insights scope and type
*AudienceSharingApi* | [**adAccountsAudiencesSharedAccountsList**](docs/AudienceSharingApi.md#adAccountsAudiencesSharedAccountsList) | **GET** /ad_accounts/{ad_account_id}/audiences/shared/accounts | List accounts with access to an audience owned by an ad account
*AudienceSharingApi* | [**businessAccountAudiencesSharedAccountsList**](docs/AudienceSharingApi.md#businessAccountAudiencesSharedAccountsList) | **GET** /businesses/{business_id}/audiences/shared/accounts | List accounts with access to an audience owned by a business
*AudienceSharingApi* | [**sharedAudiencesForBusinessList**](docs/AudienceSharingApi.md#sharedAudiencesForBusinessList) | **GET** /businesses/{business_id}/audiences | List received audiences for a business
*AudienceSharingApi* | [**updateAdAccountToAdAccountSharedAudience**](docs/AudienceSharingApi.md#updateAdAccountToAdAccountSharedAudience) | **PATCH** /ad_accounts/{ad_account_id}/audiences/ad_accounts/shared | Update audience sharing between ad accounts
*AudienceSharingApi* | [**updateAdAccountToBusinessSharedAudience**](docs/AudienceSharingApi.md#updateAdAccountToBusinessSharedAudience) | **PATCH** /ad_accounts/{ad_account_id}/audiences/businesses/shared | Update audience sharing from an ad account to businesses
*AudienceSharingApi* | [**updateBusinessToAdAccountSharedAudience**](docs/AudienceSharingApi.md#updateBusinessToAdAccountSharedAudience) | **PATCH** /businesses/{business_id}/audiences/ad_accounts/shared | Update audience sharing from a business to ad accounts
*AudienceSharingApi* | [**updateBusinessToBusinessSharedAudience**](docs/AudienceSharingApi.md#updateBusinessToBusinessSharedAudience) | **PATCH** /businesses/{business_id}/audiences/businesses/shared | Update audience sharing between businesses
*AudiencesApi* | [**audiencesCreate**](docs/AudiencesApi.md#audiencesCreate) | **POST** /ad_accounts/{ad_account_id}/audiences | Create audience
*AudiencesApi* | [**audiencesGet**](docs/AudiencesApi.md#audiencesGet) | **GET** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Get audience
*AudiencesApi* | [**audiencesList**](docs/AudiencesApi.md#audiencesList) | **GET** /ad_accounts/{ad_account_id}/audiences | List audiences
*AudiencesApi* | [**audiencesUpdate**](docs/AudiencesApi.md#audiencesUpdate) | **PATCH** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Update audience
*BillingApi* | [**adsCreditRedeem**](docs/BillingApi.md#adsCreditRedeem) | **POST** /ad_accounts/{ad_account_id}/ads_credit/redeem | Redeem ad credits
*BillingApi* | [**adsCreditsDiscountsGet**](docs/BillingApi.md#adsCreditsDiscountsGet) | **GET** /ad_accounts/{ad_account_id}/ads_credit/discounts | Get ads credit discounts
*BillingApi* | [**billingInvoiceDownloadGet**](docs/BillingApi.md#billingInvoiceDownloadGet) | **GET** /ad_accounts/{ad_account_id}/billing_invoice/{billing_invoice_id}/download | Get download url for a billing invoice
*BillingApi* | [**billingInvoicesGet**](docs/BillingApi.md#billingInvoicesGet) | **GET** /ad_accounts/{ad_account_id}/billing_invoices | Get billing invoices
*BillingApi* | [**billingProfilesGet**](docs/BillingApi.md#billingProfilesGet) | **GET** /ad_accounts/{ad_account_id}/billing_profiles | Get billing profiles
*BillingApi* | [**ssioAccountsGet**](docs/BillingApi.md#ssioAccountsGet) | **GET** /ad_accounts/{ad_account_id}/ssio/accounts | Get Salesforce account details including bill-to information.
*BillingApi* | [**ssioInsertionOrderCreate**](docs/BillingApi.md#ssioInsertionOrderCreate) | **POST** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Create insertion order through SSIO.
*BillingApi* | [**ssioInsertionOrderEdit**](docs/BillingApi.md#ssioInsertionOrderEdit) | **PATCH** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Edit insertion order through SSIO.
*BillingApi* | [**ssioInsertionOrdersStatusGetByAdAccount**](docs/BillingApi.md#ssioInsertionOrdersStatusGetByAdAccount) | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/status | Get insertion order status by ad account id.
*BillingApi* | [**ssioInsertionOrdersStatusGetByPinOrderId**](docs/BillingApi.md#ssioInsertionOrdersStatusGetByPinOrderId) | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status | Get insertion order status by pin order id.
*BillingApi* | [**ssioOrderLinesGetByAdAccount**](docs/BillingApi.md#ssioOrderLinesGetByAdAccount) | **GET** /ad_accounts/{ad_account_id}/ssio/order_lines | Get Salesforce order lines by ad account id.
*BoardsApi* | [**boardSectionsCreate**](docs/BoardsApi.md#boardSectionsCreate) | **POST** /boards/{board_id}/sections | Create board section
*BoardsApi* | [**boardSectionsDelete**](docs/BoardsApi.md#boardSectionsDelete) | **DELETE** /boards/{board_id}/sections/{section_id} | Delete board section
*BoardsApi* | [**boardSectionsList**](docs/BoardsApi.md#boardSectionsList) | **GET** /boards/{board_id}/sections | List board sections
*BoardsApi* | [**boardSectionsListPins**](docs/BoardsApi.md#boardSectionsListPins) | **GET** /boards/{board_id}/sections/{section_id}/pins | List Pins on board section
*BoardsApi* | [**boardSectionsUpdate**](docs/BoardsApi.md#boardSectionsUpdate) | **PATCH** /boards/{board_id}/sections/{section_id} | Update board section
*BoardsApi* | [**boardsCreate**](docs/BoardsApi.md#boardsCreate) | **POST** /boards | Create board
*BoardsApi* | [**boardsDelete**](docs/BoardsApi.md#boardsDelete) | **DELETE** /boards/{board_id} | Delete board
*BoardsApi* | [**boardsGet**](docs/BoardsApi.md#boardsGet) | **GET** /boards/{board_id} | Get board
*BoardsApi* | [**boardsList**](docs/BoardsApi.md#boardsList) | **GET** /boards | List boards
*BoardsApi* | [**boardsListPins**](docs/BoardsApi.md#boardsListPins) | **GET** /boards/{board_id}/pins | List Pins on board
*BoardsApi* | [**boardsUpdate**](docs/BoardsApi.md#boardsUpdate) | **PATCH** /boards/{board_id} | Update board
*BulkApi* | [**bulkDownloadCreate**](docs/BulkApi.md#bulkDownloadCreate) | **POST** /ad_accounts/{ad_account_id}/bulk/download | Get advertiser entities in bulk
*BulkApi* | [**bulkRequestGet**](docs/BulkApi.md#bulkRequestGet) | **GET** /ad_accounts/{ad_account_id}/bulk/{bulk_request_id} | Download advertiser entities in bulk
*BulkApi* | [**bulkUpsertCreate**](docs/BulkApi.md#bulkUpsertCreate) | **POST** /ad_accounts/{ad_account_id}/bulk/upsert | Create/update ad entities in bulk
*BusinessAccessAssetsApi* | [**assetGroupCreate**](docs/BusinessAccessAssetsApi.md#assetGroupCreate) | **POST** /businesses/{business_id}/asset_groups | Create a new asset group.
*BusinessAccessAssetsApi* | [**assetGroupDelete**](docs/BusinessAccessAssetsApi.md#assetGroupDelete) | **DELETE** /businesses/{business_id}/asset_groups | Delete asset groups.
*BusinessAccessAssetsApi* | [**assetGroupUpdate**](docs/BusinessAccessAssetsApi.md#assetGroupUpdate) | **PATCH** /businesses/{business_id}/asset_groups | Update asset groups.
*BusinessAccessAssetsApi* | [**businessAssetMembersGet**](docs/BusinessAccessAssetsApi.md#businessAssetMembersGet) | **GET** /businesses/{business_id}/assets/{asset_id}/members | Get members with access to asset
*BusinessAccessAssetsApi* | [**businessAssetPartnersGet**](docs/BusinessAccessAssetsApi.md#businessAssetPartnersGet) | **GET** /businesses/{business_id}/assets/{asset_id}/partners | Get partners with access to asset
*BusinessAccessAssetsApi* | [**businessAssetsGet**](docs/BusinessAccessAssetsApi.md#businessAssetsGet) | **GET** /businesses/{business_id}/assets | List business assets
*BusinessAccessAssetsApi* | [**businessMemberAssetsGet**](docs/BusinessAccessAssetsApi.md#businessMemberAssetsGet) | **GET** /businesses/{business_id}/members/{member_id}/assets | Get assets assigned to a member
*BusinessAccessAssetsApi* | [**businessMembersAssetAccessDelete**](docs/BusinessAccessAssetsApi.md#businessMembersAssetAccessDelete) | **DELETE** /businesses/{business_id}/members/assets/access | Delete member access to asset
*BusinessAccessAssetsApi* | [**businessMembersAssetAccessUpdate**](docs/BusinessAccessAssetsApi.md#businessMembersAssetAccessUpdate) | **PATCH** /businesses/{business_id}/members/assets/access | Assign/Update member asset permissions
*BusinessAccessAssetsApi* | [**businessPartnerAssetAccessGet**](docs/BusinessAccessAssetsApi.md#businessPartnerAssetAccessGet) | **GET** /businesses/{business_id}/partners/{partner_id}/assets | Get assets assigned to a partner or assets assigned by a partner
*BusinessAccessAssetsApi* | [**deletePartnerAssetAccessHandlerImpl**](docs/BusinessAccessAssetsApi.md#deletePartnerAssetAccessHandlerImpl) | **DELETE** /businesses/{business_id}/partners/assets | Delete partner access to asset
*BusinessAccessAssetsApi* | [**updatePartnerAssetAccessHandlerImpl**](docs/BusinessAccessAssetsApi.md#updatePartnerAssetAccessHandlerImpl) | **PATCH** /businesses/{business_id}/partners/assets | Assign/Update partner asset permissions
*BusinessAccessInviteApi* | [**assetAccessRequestsCreate**](docs/BusinessAccessInviteApi.md#assetAccessRequestsCreate) | **POST** /businesses/{business_id}/requests/assets/access | Create a request to access an existing partner&#39;s assets.
*BusinessAccessInviteApi* | [**cancelInvitesOrRequests**](docs/BusinessAccessInviteApi.md#cancelInvitesOrRequests) | **DELETE** /businesses/{business_id}/invites | Cancel invites/requests
*BusinessAccessInviteApi* | [**createAssetInvites**](docs/BusinessAccessInviteApi.md#createAssetInvites) | **POST** /businesses/{business_id}/invites/assets/access | Update invite/request with an asset permission
*BusinessAccessInviteApi* | [**createMembershipOrPartnershipInvites**](docs/BusinessAccessInviteApi.md#createMembershipOrPartnershipInvites) | **POST** /businesses/{business_id}/invites | Create invites or requests
*BusinessAccessInviteApi* | [**getInvites**](docs/BusinessAccessInviteApi.md#getInvites) | **GET** /businesses/{business_id}/invites | Get invites/requests
*BusinessAccessInviteApi* | [**respondBusinessAccessInvites**](docs/BusinessAccessInviteApi.md#respondBusinessAccessInvites) | **PATCH** /businesses/invites | Accept or decline an invite/request
*BusinessAccessRelationshipsApi* | [**brandAccountsCreate**](docs/BusinessAccessRelationshipsApi.md#brandAccountsCreate) | **POST** /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts | Create a Brand Account
*BusinessAccessRelationshipsApi* | [**brandAccountsUpdate**](docs/BusinessAccessRelationshipsApi.md#brandAccountsUpdate) | **PATCH** /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id} | Update a Brand Account
*BusinessAccessRelationshipsApi* | [**deleteBusinessMembership**](docs/BusinessAccessRelationshipsApi.md#deleteBusinessMembership) | **DELETE** /businesses/{business_id}/members | Terminate business memberships
*BusinessAccessRelationshipsApi* | [**deleteBusinessPartners**](docs/BusinessAccessRelationshipsApi.md#deleteBusinessPartners) | **DELETE** /businesses/{business_id}/partners | Terminate business partnerships
*BusinessAccessRelationshipsApi* | [**getBusinessEmployers**](docs/BusinessAccessRelationshipsApi.md#getBusinessEmployers) | **GET** /businesses/employers | List business employers for user
*BusinessAccessRelationshipsApi* | [**getBusinessMembers**](docs/BusinessAccessRelationshipsApi.md#getBusinessMembers) | **GET** /businesses/{business_id}/members | Get business members
*BusinessAccessRelationshipsApi* | [**getBusinessPartners**](docs/BusinessAccessRelationshipsApi.md#getBusinessPartners) | **GET** /businesses/{business_id}/partners | Get business partners
*BusinessAccessRelationshipsApi* | [**systemUserUpdate**](docs/BusinessAccessRelationshipsApi.md#systemUserUpdate) | **PATCH** /businesses/{business_id}/system_users/{system_user_id} | Update a system user information.
*BusinessAccessRelationshipsApi* | [**updateBusinessMemberships**](docs/BusinessAccessRelationshipsApi.md#updateBusinessMemberships) | **PATCH** /businesses/{business_id}/members | Update member&#39;s business role
*CampaignsApi* | [**adPinsAnalytics**](docs/CampaignsApi.md#adPinsAnalytics) | **GET** /ad_accounts/{ad_account_id}/pins/analytics | Get pins analytics
*CampaignsApi* | [**campaignTargetingAnalyticsGet**](docs/CampaignsApi.md#campaignTargetingAnalyticsGet) | **GET** /ad_accounts/{ad_account_id}/campaigns/targeting_analytics | Get targeting analytics for campaigns
*CampaignsApi* | [**campaignsAnalytics**](docs/CampaignsApi.md#campaignsAnalytics) | **GET** /ad_accounts/{ad_account_id}/campaigns/analytics | Get campaign analytics
*CampaignsApi* | [**campaignsCreate**](docs/CampaignsApi.md#campaignsCreate) | **POST** /ad_accounts/{ad_account_id}/campaigns | Create campaigns
*CampaignsApi* | [**campaignsGet**](docs/CampaignsApi.md#campaignsGet) | **GET** /ad_accounts/{ad_account_id}/campaigns/{campaign_id} | Get campaign
*CampaignsApi* | [**campaignsList**](docs/CampaignsApi.md#campaignsList) | **GET** /ad_accounts/{ad_account_id}/campaigns | List campaigns
*CampaignsApi* | [**campaignsUpdate**](docs/CampaignsApi.md#campaignsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/campaigns | Update campaigns
*CampaignsApi* | [**getCampaignDeliveryEstimates**](docs/CampaignsApi.md#getCampaignDeliveryEstimates) | **POST** /ad_accounts/{ad_account_id}/campaigns/delivery_estimates | Get campaign delivery estimates
*CatalogFeedsApi* | [**feedProcessingResultsList**](docs/CatalogFeedsApi.md#feedProcessingResultsList) | **GET** /catalogs/feeds/{feed_id}/processing_results | List feed processing results
*CatalogFeedsApi* | [**feedsCreate**](docs/CatalogFeedsApi.md#feedsCreate) | **POST** /catalogs/feeds | Create feed
*CatalogFeedsApi* | [**feedsDelete**](docs/CatalogFeedsApi.md#feedsDelete) | **DELETE** /catalogs/feeds/{feed_id} | Delete feed
*CatalogFeedsApi* | [**feedsGet**](docs/CatalogFeedsApi.md#feedsGet) | **GET** /catalogs/feeds/{feed_id} | Get feed
*CatalogFeedsApi* | [**feedsIngest**](docs/CatalogFeedsApi.md#feedsIngest) | **POST** /catalogs/feeds/{feed_id}/ingest | Ingest feed items
*CatalogFeedsApi* | [**feedsList**](docs/CatalogFeedsApi.md#feedsList) | **GET** /catalogs/feeds | List feeds
*CatalogFeedsApi* | [**feedsUpdate**](docs/CatalogFeedsApi.md#feedsUpdate) | **PATCH** /catalogs/feeds/{feed_id} | Update feed
*CatalogFeedsApi* | [**itemsIssuesList**](docs/CatalogFeedsApi.md#itemsIssuesList) | **GET** /catalogs/processing_results/{processing_result_id}/item_issues | List item issues
*CatalogItemsApi* | [**itemsBatchGet**](docs/CatalogItemsApi.md#itemsBatchGet) | **GET** /catalogs/items/batch/{batch_id} | Get item batch status
*CatalogItemsApi* | [**itemsBatchPost**](docs/CatalogItemsApi.md#itemsBatchPost) | **POST** /catalogs/items/batch | Operate on item batch
*CatalogItemsApi* | [**itemsPost**](docs/CatalogItemsApi.md#itemsPost) | **POST** /catalogs/items | Get catalogs items (POST)
*CatalogProductGroupsApi* | [**catalogsProductGroupPinsList**](docs/CatalogProductGroupsApi.md#catalogsProductGroupPinsList) | **GET** /catalogs/product_groups/{product_group_id}/products | List products by product group
*CatalogProductGroupsApi* | [**catalogsProductGroupsCreate**](docs/CatalogProductGroupsApi.md#catalogsProductGroupsCreate) | **POST** /catalogs/product_groups | Create product group
*CatalogProductGroupsApi* | [**catalogsProductGroupsCreateMany**](docs/CatalogProductGroupsApi.md#catalogsProductGroupsCreateMany) | **POST** /catalogs/product_groups/multiple | Create product groups
*CatalogProductGroupsApi* | [**catalogsProductGroupsDelete**](docs/CatalogProductGroupsApi.md#catalogsProductGroupsDelete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group
*CatalogProductGroupsApi* | [**catalogsProductGroupsDeleteMany**](docs/CatalogProductGroupsApi.md#catalogsProductGroupsDeleteMany) | **DELETE** /catalogs/product_groups/multiple | Delete product groups
*CatalogProductGroupsApi* | [**catalogsProductGroupsGet**](docs/CatalogProductGroupsApi.md#catalogsProductGroupsGet) | **GET** /catalogs/product_groups/{product_group_id} | Get product group
*CatalogProductGroupsApi* | [**catalogsProductGroupsList**](docs/CatalogProductGroupsApi.md#catalogsProductGroupsList) | **GET** /catalogs/product_groups | List product groups
*CatalogProductGroupsApi* | [**catalogsProductGroupsProductCountsGet**](docs/CatalogProductGroupsApi.md#catalogsProductGroupsProductCountsGet) | **GET** /catalogs/product_groups/{product_group_id}/product_counts | Get product counts
*CatalogProductGroupsApi* | [**catalogsProductGroupsUpdate**](docs/CatalogProductGroupsApi.md#catalogsProductGroupsUpdate) | **PATCH** /catalogs/product_groups/{product_group_id} | Update single product group
*CatalogProductGroupsApi* | [**productsByProductGroupFilterList**](docs/CatalogProductGroupsApi.md#productsByProductGroupFilterList) | **POST** /catalogs/products/get_by_product_group_filters | List products by filter
*CatalogReportsApi* | [**reportsCreate**](docs/CatalogReportsApi.md#reportsCreate) | **POST** /catalogs/reports | Build catalogs report
*CatalogReportsApi* | [**reportsGet**](docs/CatalogReportsApi.md#reportsGet) | **GET** /catalogs/reports | Get catalogs report
*CatalogReportsApi* | [**reportsStats**](docs/CatalogReportsApi.md#reportsStats) | **GET** /catalogs/reports/stats | List report stats
*CatalogSupplementalApi* | [**catalogsLocalInventoryItemsBatchOperate**](docs/CatalogSupplementalApi.md#catalogsLocalInventoryItemsBatchOperate) | **POST** /catalogs/{catalog_id}/local_inventory_items/batch | Operate on local inventory item batch
*CatalogSupplementalApi* | [**catalogsLocalInventoryItemsPost**](docs/CatalogSupplementalApi.md#catalogsLocalInventoryItemsPost) | **POST** /catalogs/{catalog_id}/local_inventory_items/query | Get local inventory items (POST)
*CatalogSupplementalApi* | [**catalogsLocalStoresCreate**](docs/CatalogSupplementalApi.md#catalogsLocalStoresCreate) | **POST** /catalogs/{catalog_id}/local_stores | Create local stores
*CatalogSupplementalApi* | [**catalogsLocalStoresDelete**](docs/CatalogSupplementalApi.md#catalogsLocalStoresDelete) | **DELETE** /catalogs/{catalog_id}/local_stores | Delete local stores
*CatalogSupplementalApi* | [**catalogsLocalStoresList**](docs/CatalogSupplementalApi.md#catalogsLocalStoresList) | **GET** /catalogs/{catalog_id}/local_stores | List local stores
*CatalogSupplementalApi* | [**catalogsLocalStoresUpdate**](docs/CatalogSupplementalApi.md#catalogsLocalStoresUpdate) | **PATCH** /catalogs/{catalog_id}/local_stores | Update local stores
*CatalogSupplementalApi* | [**catalogsSupplementalItemsBatchGet**](docs/CatalogSupplementalApi.md#catalogsSupplementalItemsBatchGet) | **GET** /catalogs/{catalog_id}/supplemental_items/batch/{batch_id} | Get supplemental items batch status
*CatalogsApi* | [**catalogsAvailableFilterValues**](docs/CatalogsApi.md#catalogsAvailableFilterValues) | **GET** /catalogs/available_filter_values | List available filter values
*CatalogsApi* | [**catalogsCreate**](docs/CatalogsApi.md#catalogsCreate) | **POST** /catalogs | Create catalog
*CatalogsApi* | [**catalogsList**](docs/CatalogsApi.md#catalogsList) | **GET** /catalogs | List catalogs
*ConversionDeletionRequestsApi* | [**conversionDeletionRequestCreate**](docs/ConversionDeletionRequestsApi.md#conversionDeletionRequestCreate) | **POST** /ad_accounts/{ad_account_id}/conversion_deletion_requests | Create a conversion deletion request
*ConversionDeletionRequestsApi* | [**conversionDeletionRequestDelete**](docs/ConversionDeletionRequestsApi.md#conversionDeletionRequestDelete) | **DELETE** /ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id} | Delete a conversion deletion request
*ConversionDeletionRequestsApi* | [**conversionDeletionRequestGet**](docs/ConversionDeletionRequestsApi.md#conversionDeletionRequestGet) | **GET** /ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id} | Get a single conversion deletion request
*ConversionDeletionRequestsApi* | [**conversionDeletionRequestList**](docs/ConversionDeletionRequestsApi.md#conversionDeletionRequestList) | **GET** /ad_accounts/{ad_account_id}/conversion_deletion_requests | List conversion deletion requests
*ConversionEqsApi* | [**conversionEqsList**](docs/ConversionEqsApi.md#conversionEqsList) | **GET** /ad_accounts/{ad_account_id}/conversion_eqs | Get event quality score (EQS)
*ConversionEventsApi* | [**eventsCreate**](docs/ConversionEventsApi.md#eventsCreate) | **POST** /ad_accounts/{ad_account_id}/events | Send conversions
*ConversionTagsApi* | [**conversionTagsCreate**](docs/ConversionTagsApi.md#conversionTagsCreate) | **POST** /ad_accounts/{ad_account_id}/conversion_tags | Create conversion tag
*ConversionTagsApi* | [**conversionTagsGet**](docs/ConversionTagsApi.md#conversionTagsGet) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id} | Get conversion tag
*ConversionTagsApi* | [**conversionTagsList**](docs/ConversionTagsApi.md#conversionTagsList) | **GET** /ad_accounts/{ad_account_id}/conversion_tags | List conversion tags
*ConversionTagsApi* | [**ocpmEligibleConversionTagsGet**](docs/ConversionTagsApi.md#ocpmEligibleConversionTagsGet) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible | Get Ocpm eligible conversion tags
*ConversionTagsApi* | [**pageVisitConversionTagsGet**](docs/ConversionTagsApi.md#pageVisitConversionTagsGet) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/page_visit | Get page visit conversion tags
*ConversionsApi* | [**advertiserDefinedEventsCreate**](docs/ConversionsApi.md#advertiserDefinedEventsCreate) | **POST** /ad_accounts/{ad_account_id}/advertiser_defined_events | Create advertiser defined events
*ConversionsApi* | [**advertiserDefinedEventsDelete**](docs/ConversionsApi.md#advertiserDefinedEventsDelete) | **DELETE** /ad_accounts/{ad_account_id}/advertiser_defined_events | Delete advertiser defined events
*ConversionsApi* | [**advertiserDefinedEventsGet**](docs/ConversionsApi.md#advertiserDefinedEventsGet) | **GET** /ad_accounts/{ad_account_id}/advertiser_defined_events | Get advertiser defined events
*ConversionsApi* | [**advertiserDefinedEventsUpdate**](docs/ConversionsApi.md#advertiserDefinedEventsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/advertiser_defined_events | Update advertiser defined events
*CustomerListUploadsApi* | [**customerListUploadsCreate**](docs/CustomerListUploadsApi.md#customerListUploadsCreate) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads | Create customer list upload
*CustomerListUploadsApi* | [**customerListUploadsGet**](docs/CustomerListUploadsApi.md#customerListUploadsGet) | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id} | Get customer list upload
*CustomerListUploadsApi* | [**customerListUploadsRun**](docs/CustomerListUploadsApi.md#customerListUploadsRun) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run | Run customer list upload
*CustomerListsApi* | [**customerListsCreate**](docs/CustomerListsApi.md#customerListsCreate) | **POST** /ad_accounts/{ad_account_id}/customer_lists | Create customer lists
*CustomerListsApi* | [**customerListsGet**](docs/CustomerListsApi.md#customerListsGet) | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Get customer list
*CustomerListsApi* | [**customerListsList**](docs/CustomerListsApi.md#customerListsList) | **GET** /ad_accounts/{ad_account_id}/customer_lists | Get customer lists
*CustomerListsApi* | [**customerListsUpdate**](docs/CustomerListsApi.md#customerListsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Update customer list
*CustomerSegmentApi* | [**customerSegmentCreate**](docs/CustomerSegmentApi.md#customerSegmentCreate) | **POST** /ad_accounts/{ad_account_id}/customer_segments | Create customer segments
*CustomerSegmentApi* | [**customerSegmentList**](docs/CustomerSegmentApi.md#customerSegmentList) | **GET** /ad_accounts/{ad_account_id}/customer_segments | List customer segments
*CustomerSegmentApi* | [**customerSegmentUpdate**](docs/CustomerSegmentApi.md#customerSegmentUpdate) | **PATCH** /ad_accounts/{ad_account_id}/customer_segments | Update customer segments
*IntegrationsApi* | [**integrationsCommerceDel**](docs/IntegrationsApi.md#integrationsCommerceDel) | **DELETE** /integrations/commerce/{external_business_id} | Delete commerce integration
*IntegrationsApi* | [**integrationsCommerceGet**](docs/IntegrationsApi.md#integrationsCommerceGet) | **GET** /integrations/commerce/{external_business_id} | Get commerce integration
*IntegrationsApi* | [**integrationsCommercePatch**](docs/IntegrationsApi.md#integrationsCommercePatch) | **PATCH** /integrations/commerce/{external_business_id} | Update commerce integration
*IntegrationsApi* | [**integrationsCommercePost**](docs/IntegrationsApi.md#integrationsCommercePost) | **POST** /integrations/commerce | Create commerce integration
*IntegrationsApi* | [**integrationsGetById**](docs/IntegrationsApi.md#integrationsGetById) | **GET** /integrations/{id} | Get integration metadata
*IntegrationsApi* | [**integrationsGetList**](docs/IntegrationsApi.md#integrationsGetList) | **GET** /integrations | Get integration metadata list
*IntegrationsApi* | [**integrationsLogsPost**](docs/IntegrationsApi.md#integrationsLogsPost) | **POST** /integrations/logs | Receives batched logs from integration applications.
*KeywordsApi* | [**countryKeywordsMetricsGet**](docs/KeywordsApi.md#countryKeywordsMetricsGet) | **GET** /ad_accounts/{ad_account_id}/keywords/metrics | Get country&#39;s keyword metrics
*KeywordsApi* | [**keywordsCreate**](docs/KeywordsApi.md#keywordsCreate) | **POST** /ad_accounts/{ad_account_id}/keywords | Create keywords
*KeywordsApi* | [**keywordsGet**](docs/KeywordsApi.md#keywordsGet) | **GET** /ad_accounts/{ad_account_id}/keywords | Get keywords
*KeywordsApi* | [**keywordsUpdate**](docs/KeywordsApi.md#keywordsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/keywords | Update keywords
*KeywordsApi* | [**trendingKeywordsList**](docs/KeywordsApi.md#trendingKeywordsList) | **GET** /trends/keywords/{region}/top/{trend_type} | List trending keywords
*LabelsApi* | [**labelsApply**](docs/LabelsApi.md#labelsApply) | **POST** /ad_accounts/{ad_account_id}/labels/{label_id}/apply | Apply label to entity
*LabelsApi* | [**labelsCreate**](docs/LabelsApi.md#labelsCreate) | **POST** /ad_accounts/{ad_account_id}/labels | Create labels
*LabelsApi* | [**labelsList**](docs/LabelsApi.md#labelsList) | **GET** /ad_accounts/{ad_account_id}/labels | List labels
*LabelsApi* | [**labelsRemove**](docs/LabelsApi.md#labelsRemove) | **POST** /ad_accounts/{ad_account_id}/labels/{label_id}/remove | Remove label from entities
*LabelsApi* | [**labelsUpdate**](docs/LabelsApi.md#labelsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/labels | Update labels
*LeadAdsApi* | [**adAccountsSubscriptionsDelById**](docs/LeadAdsApi.md#adAccountsSubscriptionsDelById) | **DELETE** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Delete lead ads subscription
*LeadAdsApi* | [**adAccountsSubscriptionsGetById**](docs/LeadAdsApi.md#adAccountsSubscriptionsGetById) | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Get lead ads subscription by ID
*LeadAdsApi* | [**adAccountsSubscriptionsGetList**](docs/LeadAdsApi.md#adAccountsSubscriptionsGetList) | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions | Get lead ads subscriptions
*LeadAdsApi* | [**adAccountsSubscriptionsPost**](docs/LeadAdsApi.md#adAccountsSubscriptionsPost) | **POST** /ad_accounts/{ad_account_id}/leads/subscriptions | Create lead ads subscription
*LeadFormsApi* | [**leadFormGet**](docs/LeadFormsApi.md#leadFormGet) | **GET** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id} | Get lead form by id
*LeadFormsApi* | [**leadFormTestCreate**](docs/LeadFormsApi.md#leadFormTestCreate) | **POST** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test | Create lead form test data
*LeadFormsApi* | [**leadFormsCreate**](docs/LeadFormsApi.md#leadFormsCreate) | **POST** /ad_accounts/{ad_account_id}/lead_forms | Create lead forms
*LeadFormsApi* | [**leadFormsList**](docs/LeadFormsApi.md#leadFormsList) | **GET** /ad_accounts/{ad_account_id}/lead_forms | List lead forms
*LeadFormsApi* | [**leadFormsUpdate**](docs/LeadFormsApi.md#leadFormsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/lead_forms | Update lead forms
*LeadsExportApi* | [**leadsExportCreate**](docs/LeadsExportApi.md#leadsExportCreate) | **POST** /ad_accounts/{ad_account_id}/leads_export | Create a request to export leads collected from a lead ad
*LeadsExportApi* | [**leadsExportGet**](docs/LeadsExportApi.md#leadsExportGet) | **GET** /ad_accounts/{ad_account_id}/leads_export/{leads_export_id} | Get the lead export from the lead export create call
*MediaApi* | [**mediaCreate**](docs/MediaApi.md#mediaCreate) | **POST** /media | Register media upload
*MediaApi* | [**mediaGet**](docs/MediaApi.md#mediaGet) | **GET** /media/{media_id} | Get media upload details
*MediaApi* | [**mediaList**](docs/MediaApi.md#mediaList) | **GET** /media | List media uploads
*MsotEventsApi* | [**msotEventsCreate**](docs/MsotEventsApi.md#msotEventsCreate) | **POST** /ad_accounts/{ad_account_id}/msot/events | Send Measurement Source Of Truth (MSOT) attributed conversion events
*NotificationApi* | [**notificationPost**](docs/NotificationApi.md#notificationPost) | **POST** /notifications | Receive notifications from external partners.
*OauthApi* | [**oauthConversionToken**](docs/OauthApi.md#oauthConversionToken) | **POST** /oauth/conversion_token | Generate OAuth access token for conversion API
*OauthApi* | [**oauthToken**](docs/OauthApi.md#oauthToken) | **POST** /oauth/token | Generate OAuth access token
*OauthApi* | [**tokenRevoke**](docs/OauthApi.md#tokenRevoke) | **POST** /oauth/token/revoke | Revoke a token
*OrderLinesApi* | [**orderLinesGet**](docs/OrderLinesApi.md#orderLinesGet) | **GET** /ad_accounts/{ad_account_id}/order_lines/{order_line_id} | Get order line
*OrderLinesApi* | [**orderLinesList**](docs/OrderLinesApi.md#orderLinesList) | **GET** /ad_accounts/{ad_account_id}/order_lines | Get order lines.
*PinsApi* | [**multiPinsAnalytics**](docs/PinsApi.md#multiPinsAnalytics) | **GET** /pins/analytics | Get multiple Pin analytics
*PinsApi* | [**pinsAnalytics**](docs/PinsApi.md#pinsAnalytics) | **GET** /pins/{pin_id}/analytics | Get Pin analytics
*PinsApi* | [**pinsCreate**](docs/PinsApi.md#pinsCreate) | **POST** /pins | Create Pin
*PinsApi* | [**pinsDelete**](docs/PinsApi.md#pinsDelete) | **DELETE** /pins/{pin_id} | Delete Pin
*PinsApi* | [**pinsGet**](docs/PinsApi.md#pinsGet) | **GET** /pins/{pin_id} | Get Pin
*PinsApi* | [**pinsList**](docs/PinsApi.md#pinsList) | **GET** /pins | List Pins
*PinsApi* | [**pinsSave**](docs/PinsApi.md#pinsSave) | **POST** /pins/{pin_id}/save | Save Pin
*PinsApi* | [**pinsUpdate**](docs/PinsApi.md#pinsUpdate) | **PATCH** /pins/{pin_id} | Update Pin
*ProductGroupPromotionsApi* | [**productGroupPromotionsCreate**](docs/ProductGroupPromotionsApi.md#productGroupPromotionsCreate) | **POST** /ad_accounts/{ad_account_id}/product_group_promotions | Create product group promotions
*ProductGroupPromotionsApi* | [**productGroupPromotionsGet**](docs/ProductGroupPromotionsApi.md#productGroupPromotionsGet) | **GET** /ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id} | Get a product group promotion by id
*ProductGroupPromotionsApi* | [**productGroupPromotionsList**](docs/ProductGroupPromotionsApi.md#productGroupPromotionsList) | **GET** /ad_accounts/{ad_account_id}/product_group_promotions | Get product group promotions
*ProductGroupPromotionsApi* | [**productGroupPromotionsUpdate**](docs/ProductGroupPromotionsApi.md#productGroupPromotionsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/product_group_promotions | Update product group promotions
*ProductGroupPromotionsApi* | [**productGroupsAnalytics**](docs/ProductGroupPromotionsApi.md#productGroupsAnalytics) | **GET** /ad_accounts/{ad_account_id}/product_groups/analytics | Get product group analytics
*ProductTagsApi* | [**productTagsBulkAdd**](docs/ProductTagsApi.md#productTagsBulkAdd) | **POST** /pins/{pin_id}/product_tags | Add product tags to pin
*ProductTagsApi* | [**productTagsBulkDelete**](docs/ProductTagsApi.md#productTagsBulkDelete) | **POST** /pins/{pin_id}/product_tags/bulk-delete | Delete product tags from pin
*ProductTagsApi* | [**productTagsList**](docs/ProductTagsApi.md#productTagsList) | **GET** /pins/{pin_id}/product_tags | Get product tags for pin
*PromotionsApi* | [**promotionsCreate**](docs/PromotionsApi.md#promotionsCreate) | **POST** /ad_accounts/{ad_account_id}/promotions | Create promotions
*PromotionsApi* | [**promotionsDelete**](docs/PromotionsApi.md#promotionsDelete) | **DELETE** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Delete promotion by id
*PromotionsApi* | [**promotionsGet**](docs/PromotionsApi.md#promotionsGet) | **GET** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Get promotion by id
*PromotionsApi* | [**promotionsList**](docs/PromotionsApi.md#promotionsList) | **GET** /ad_accounts/{ad_account_id}/promotions | Get promotions
*PromotionsApi* | [**promotionsUpdate**](docs/PromotionsApi.md#promotionsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/promotions | Update promotions
*ResourcesApi* | [**adAccountCountriesGet**](docs/ResourcesApi.md#adAccountCountriesGet) | **GET** /resources/ad_account_countries | Get ad accounts countries
*ResourcesApi* | [**deliveryMetricsGet**](docs/ResourcesApi.md#deliveryMetricsGet) | **GET** /resources/delivery_metrics | Get available metrics&#39; definitions
*ResourcesApi* | [**interestTargetingOptionsGet**](docs/ResourcesApi.md#interestTargetingOptionsGet) | **GET** /resources/targeting/interests/{interest_id} | Get interest details
*ResourcesApi* | [**leadFormQuestionsGet**](docs/ResourcesApi.md#leadFormQuestionsGet) | **GET** /resources/lead_form_questions | Get lead form questions
*ResourcesApi* | [**metricsReadyStateGet**](docs/ResourcesApi.md#metricsReadyStateGet) | **GET** /resources/metrics_ready_state | Get metrics ready state
*ResourcesApi* | [**targetingOptionsGet**](docs/ResourcesApi.md#targetingOptionsGet) | **GET** /resources/targeting/{targeting_type} | Get targeting options
*SchedulesApi* | [**schedulesCreate**](docs/SchedulesApi.md#schedulesCreate) | **POST** /ad_accounts/{ad_account_id}/schedules | Create schedules
*SchedulesApi* | [**schedulesList**](docs/SchedulesApi.md#schedulesList) | **GET** /ad_accounts/{ad_account_id}/schedules | Get Schedules
*SchedulesApi* | [**schedulesUpdate**](docs/SchedulesApi.md#schedulesUpdate) | **PATCH** /ad_accounts/{ad_account_id}/schedules | Update schedules
*SearchApi* | [**searchPartnerPins**](docs/SearchApi.md#searchPartnerPins) | **GET** /search/partner/pins | Search pins by a given search term
*SearchApi* | [**searchUserBoardsGet**](docs/SearchApi.md#searchUserBoardsGet) | **GET** /search/boards | Search user&#39;s boards
*SearchApi* | [**searchUserPinsList**](docs/SearchApi.md#searchUserPinsList) | **GET** /search/pins | Search user&#39;s Pins
*TargetingTemplateApi* | [**targetingTemplateCreate**](docs/TargetingTemplateApi.md#targetingTemplateCreate) | **POST** /ad_accounts/{ad_account_id}/targeting_templates | Create targeting templates
*TargetingTemplateApi* | [**targetingTemplateList**](docs/TargetingTemplateApi.md#targetingTemplateList) | **GET** /ad_accounts/{ad_account_id}/targeting_templates | List targeting templates
*TargetingTemplateApi* | [**targetingTemplateUpdate**](docs/TargetingTemplateApi.md#targetingTemplateUpdate) | **PATCH** /ad_accounts/{ad_account_id}/targeting_templates | Update targeting templates
*TermsApi* | [**termsRelatedList**](docs/TermsApi.md#termsRelatedList) | **GET** /terms/related | List related terms
*TermsApi* | [**termsSuggestedList**](docs/TermsApi.md#termsSuggestedList) | **GET** /terms/suggested | List suggested terms
*TermsOfServiceApi* | [**termsOfServiceGet**](docs/TermsOfServiceApi.md#termsOfServiceGet) | **GET** /ad_accounts/{ad_account_id}/terms_of_service | Get terms of service
*TrendsApi* | [**trendsEditorialArticlesList**](docs/TrendsApi.md#trendsEditorialArticlesList) | **GET** /trends/editorial_articles | Returns editorial articles for a given region
*TrendsApi* | [**trendsFeaturedTopicsList**](docs/TrendsApi.md#trendsFeaturedTopicsList) | **GET** /trends/topics/featured | Get featured topics
*TrendsApi* | [**trendsProductCategoriesDetailsList**](docs/TrendsApi.md#trendsProductCategoriesDetailsList) | **GET** /trends/product_categories/details | Get product category details
*TrendsApi* | [**trendsProductCategoriesTrendingList**](docs/TrendsApi.md#trendsProductCategoriesTrendingList) | **GET** /trends/product_categories/trending | Get a list of growing Shopping Product Categories
*UserAccountApi* | [**boardsUserFollowsList**](docs/UserAccountApi.md#boardsUserFollowsList) | **GET** /user_account/following/boards | List following boards
*UserAccountApi* | [**followUserUpdate**](docs/UserAccountApi.md#followUserUpdate) | **POST** /user_account/following/{username} | Follow user
*UserAccountApi* | [**followersList**](docs/UserAccountApi.md#followersList) | **GET** /user_account/followers | List followers
*UserAccountApi* | [**linkedBusinessAccountsGet**](docs/UserAccountApi.md#linkedBusinessAccountsGet) | **GET** /user_account/businesses | List linked businesses
*UserAccountApi* | [**unverifyWebsiteDelete**](docs/UserAccountApi.md#unverifyWebsiteDelete) | **DELETE** /user_account/websites | Unverify website
*UserAccountApi* | [**userAccountAnalytics**](docs/UserAccountApi.md#userAccountAnalytics) | **GET** /user_account/analytics | Get user account analytics
*UserAccountApi* | [**userAccountAnalyticsTopPins**](docs/UserAccountApi.md#userAccountAnalyticsTopPins) | **GET** /user_account/analytics/top_pins | Get user account top pins analytics
*UserAccountApi* | [**userAccountAnalyticsTopVideoPins**](docs/UserAccountApi.md#userAccountAnalyticsTopVideoPins) | **GET** /user_account/analytics/top_video_pins | Get user account top video pins analytics
*UserAccountApi* | [**userAccountFollowedInterests**](docs/UserAccountApi.md#userAccountFollowedInterests) | **GET** /users/{username}/interests/follow | List following interests
*UserAccountApi* | [**userAccountGet**](docs/UserAccountApi.md#userAccountGet) | **GET** /user_account | Get user account
*UserAccountApi* | [**userFollowingGet**](docs/UserAccountApi.md#userFollowingGet) | **GET** /user_account/following | List following
*UserAccountApi* | [**userWebsitesGet**](docs/UserAccountApi.md#userWebsitesGet) | **GET** /user_account/websites | Get user websites
*UserAccountApi* | [**verifyWebsiteUpdate**](docs/UserAccountApi.md#verifyWebsiteUpdate) | **POST** /user_account/websites | Verify website
*UserAccountApi* | [**websiteVerificationGet**](docs/UserAccountApi.md#websiteVerificationGet) | **GET** /user_account/websites/verification | Get user verification code for website claiming


## Documentation for Models

 - [Account](docs/Account.md)
 - [AccountTemplate](docs/AccountTemplate.md)
 - [ActionType](docs/ActionType.md)
 - [Ad](docs/Ad.md)
 - [AdAccount](docs/AdAccount.md)
 - [AdAccountAnalyticsItems](docs/AdAccountAnalyticsItems.md)
 - [AdAccountCountriesGet200Response](docs/AdAccountCountriesGet200Response.md)
 - [AdAccountCreate](docs/AdAccountCreate.md)
 - [AdAccountEntityType](docs/AdAccountEntityType.md)
 - [AdAccountOwner](docs/AdAccountOwner.md)
 - [AdAccountToAdAccountSharedAudience](docs/AdAccountToAdAccountSharedAudience.md)
 - [AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody](docs/AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody.md)
 - [AdAccountToBusinessSharedAudience](docs/AdAccountToBusinessSharedAudience.md)
 - [AdAccountToBusinessSharedAudienceUpdateWithRequiredBody](docs/AdAccountToBusinessSharedAudienceUpdateWithRequiredBody.md)
 - [AdAccountsAudience](docs/AdAccountsAudience.md)
 - [AdAccountsAudienceCreate](docs/AdAccountsAudienceCreate.md)
 - [AdAccountsAudienceRule](docs/AdAccountsAudienceRule.md)
 - [AdAccountsAudienceUpdate](docs/AdAccountsAudienceUpdate.md)
 - [AdAccountsAudiencesSharedAccountsList200Response](docs/AdAccountsAudiencesSharedAccountsList200Response.md)
 - [AdAccountsCountry](docs/AdAccountsCountry.md)
 - [AdAccountsList200Response](docs/AdAccountsList200Response.md)
 - [AdAccountsSubscriptionsGetList200Response](docs/AdAccountsSubscriptionsGetList200Response.md)
 - [AdAdsAnalyticsAsyncTargetingTypes](docs/AdAdsAnalyticsAsyncTargetingTypes.md)
 - [AdBatchItem](docs/AdBatchItem.md)
 - [AdBatchUpdate](docs/AdBatchUpdate.md)
 - [AdBatchWriteResponseModel](docs/AdBatchWriteResponseModel.md)
 - [AdCollectionsHeaderType](docs/AdCollectionsHeaderType.md)
 - [AdCreate](docs/AdCreate.md)
 - [AdCreateRequest](docs/AdCreateRequest.md)
 - [AdDisapprovalReasons](docs/AdDisapprovalReasons.md)
 - [AdGroup](docs/AdGroup.md)
 - [AdGroupAudienceSizing](docs/AdGroupAudienceSizing.md)
 - [AdGroupAudienceSizingCreate](docs/AdGroupAudienceSizingCreate.md)
 - [AdGroupAudienceSizingCreativeTypes](docs/AdGroupAudienceSizingCreativeTypes.md)
 - [AdGroupAudienceSizingKeyword](docs/AdGroupAudienceSizingKeyword.md)
 - [AdGroupBase](docs/AdGroupBase.md)
 - [AdGroupCreate](docs/AdGroupCreate.md)
 - [AdGroupCreateCreate](docs/AdGroupCreateCreate.md)
 - [AdGroupCreateRequest](docs/AdGroupCreateRequest.md)
 - [AdGroupCreateRequestAllOf1](docs/AdGroupCreateRequestAllOf1.md)
 - [AdGroupDeliveryEstimates](docs/AdGroupDeliveryEstimates.md)
 - [AdGroupDeliveryEstimatesKeywordsItems](docs/AdGroupDeliveryEstimatesKeywordsItems.md)
 - [AdGroupSummaryStatus](docs/AdGroupSummaryStatus.md)
 - [AdGroupTrackingURLs](docs/AdGroupTrackingURLs.md)
 - [AdGroupUpdate](docs/AdGroupUpdate.md)
 - [AdGroupUpdateBatchUpdate](docs/AdGroupUpdateBatchUpdate.md)
 - [AdGroupUpdateRequest](docs/AdGroupUpdateRequest.md)
 - [AdGroupUpdateRequestAllOf1](docs/AdGroupUpdateRequestAllOf1.md)
 - [AdGroupsAnalyticsMetrics](docs/AdGroupsAnalyticsMetrics.md)
 - [AdGroupsCreate200Response](docs/AdGroupsCreate200Response.md)
 - [AdGroupsCreate200ResponseItemsInner](docs/AdGroupsCreate200ResponseItemsInner.md)
 - [AdGroupsList200Response](docs/AdGroupsList200Response.md)
 - [AdPinAnalytics](docs/AdPinAnalytics.md)
 - [AdPinPreviewCreativeType](docs/AdPinPreviewCreativeType.md)
 - [AdPreviewRequest](docs/AdPreviewRequest.md)
 - [AdPreviewShopping](docs/AdPreviewShopping.md)
 - [AdPreviewSourceImage](docs/AdPreviewSourceImage.md)
 - [AdPreviewSourcePinId](docs/AdPreviewSourcePinId.md)
 - [AdPreviewURLResponse](docs/AdPreviewURLResponse.md)
 - [AdReviewStatus](docs/AdReviewStatus.md)
 - [AdShoppingPreviewCreativeType](docs/AdShoppingPreviewCreativeType.md)
 - [AdUpdateRequest](docs/AdUpdateRequest.md)
 - [AdUpdateRequestAllOf1](docs/AdUpdateRequestAllOf1.md)
 - [AdeColumnType](docs/AdeColumnType.md)
 - [AdgroupPlacementGroupType](docs/AdgroupPlacementGroupType.md)
 - [AdgroupTrackingFeatureType](docs/AdgroupTrackingFeatureType.md)
 - [AdgroupTrackingFeatures](docs/AdgroupTrackingFeatures.md)
 - [AdsAnalytics](docs/AdsAnalytics.md)
 - [AdsAnalyticsAccountTargetingType](docs/AdsAnalyticsAccountTargetingType.md)
 - [AdsAnalyticsAdGroupTargetingType](docs/AdsAnalyticsAdGroupTargetingType.md)
 - [AdsAnalyticsAdTargetingType](docs/AdsAnalyticsAdTargetingType.md)
 - [AdsAnalyticsCampaignTargetingType](docs/AdsAnalyticsCampaignTargetingType.md)
 - [AdsAnalyticsCreateAsyncRequest](docs/AdsAnalyticsCreateAsyncRequest.md)
 - [AdsAnalyticsCreateAsyncResponse](docs/AdsAnalyticsCreateAsyncResponse.md)
 - [AdsAnalyticsFilterColumn](docs/AdsAnalyticsFilterColumn.md)
 - [AdsAnalyticsFilterOperator](docs/AdsAnalyticsFilterOperator.md)
 - [AdsAnalyticsGetAsyncResponse](docs/AdsAnalyticsGetAsyncResponse.md)
 - [AdsAnalyticsMetricsFilter](docs/AdsAnalyticsMetricsFilter.md)
 - [AdsCreditDiscountType](docs/AdsCreditDiscountType.md)
 - [AdsCreditDiscountsResponse](docs/AdsCreditDiscountsResponse.md)
 - [AdsCreditRedeem](docs/AdsCreditRedeem.md)
 - [AdsCreditRedeemCreate](docs/AdsCreditRedeemCreate.md)
 - [AdsCreditsDiscountsGet200Response](docs/AdsCreditsDiscountsGet200Response.md)
 - [AdsList200Response](docs/AdsList200Response.md)
 - [AdvancedAuctionBidOptions](docs/AdvancedAuctionBidOptions.md)
 - [AdvancedAuctionItem](docs/AdvancedAuctionItem.md)
 - [AdvancedAuctionItems](docs/AdvancedAuctionItems.md)
 - [AdvancedAuctionItemsGetRequest](docs/AdvancedAuctionItemsGetRequest.md)
 - [AdvancedAuctionItemsSubmitDeleteRecord](docs/AdvancedAuctionItemsSubmitDeleteRecord.md)
 - [AdvancedAuctionItemsSubmitRecord](docs/AdvancedAuctionItemsSubmitRecord.md)
 - [AdvancedAuctionItemsSubmitRequest](docs/AdvancedAuctionItemsSubmitRequest.md)
 - [AdvancedAuctionItemsSubmitUpsertRecord](docs/AdvancedAuctionItemsSubmitUpsertRecord.md)
 - [AdvancedAuctionKey](docs/AdvancedAuctionKey.md)
 - [AdvancedAuctionOperationError](docs/AdvancedAuctionOperationError.md)
 - [AdvancedAuctionProcessedItems](docs/AdvancedAuctionProcessedItems.md)
 - [AdvertiserDefinedEvent](docs/AdvertiserDefinedEvent.md)
 - [AdvertiserDefinedEventInput](docs/AdvertiserDefinedEventInput.md)
 - [AdvertiserDefinedEventMappingType](docs/AdvertiserDefinedEventMappingType.md)
 - [AdvertiserDefinedEventProcessingRecord](docs/AdvertiserDefinedEventProcessingRecord.md)
 - [AdvertiserDefinedEventsCreate200Response](docs/AdvertiserDefinedEventsCreate200Response.md)
 - [AdvertiserDefinedEventsCreateRequest](docs/AdvertiserDefinedEventsCreateRequest.md)
 - [AdvertiserDefinedEventsGet200Response](docs/AdvertiserDefinedEventsGet200Response.md)
 - [AgeBucketMultipliers](docs/AgeBucketMultipliers.md)
 - [AgeTrendsBucket](docs/AgeTrendsBucket.md)
 - [AggregatedPinComment](docs/AggregatedPinComment.md)
 - [AiDisclosureItem](docs/AiDisclosureItem.md)
 - [AiDisclosures](docs/AiDisclosures.md)
 - [AiDisclosuresUpdate](docs/AiDisclosuresUpdate.md)
 - [AmazonConnectRequest](docs/AmazonConnectRequest.md)
 - [AmazonConnectResponse](docs/AmazonConnectResponse.md)
 - [AnalyticsDailyMetrics](docs/AnalyticsDailyMetrics.md)
 - [AnalyticsMetricsResponse](docs/AnalyticsMetricsResponse.md)
 - [AppTypeMultipliers](docs/AppTypeMultipliers.md)
 - [AppsflyerAudience](docs/AppsflyerAudience.md)
 - [AppsflyerAudienceCreate](docs/AppsflyerAudienceCreate.md)
 - [AppsflyerAudienceSyncCreate](docs/AppsflyerAudienceSyncCreate.md)
 - [AppsflyerPlatform](docs/AppsflyerPlatform.md)
 - [AssetAccessRequestError](docs/AssetAccessRequestError.md)
 - [AssetGroupBinding](docs/AssetGroupBinding.md)
 - [AssetGroupDeleteError](docs/AssetGroupDeleteError.md)
 - [AssetGroupDeletion](docs/AssetGroupDeletion.md)
 - [AssetGroupDeletionDelete](docs/AssetGroupDeletionDelete.md)
 - [AssetGroupInput](docs/AssetGroupInput.md)
 - [AssetGroupInputCreate](docs/AssetGroupInputCreate.md)
 - [AssetGroupModification](docs/AssetGroupModification.md)
 - [AssetGroupModificationReadOrUpdate](docs/AssetGroupModificationReadOrUpdate.md)
 - [AssetGroupType](docs/AssetGroupType.md)
 - [AssetGroupUpdateError](docs/AssetGroupUpdateError.md)
 - [AssetGroupUpdateItemReadOrUpdateItem](docs/AssetGroupUpdateItemReadOrUpdateItem.md)
 - [AssetIdPermissions](docs/AssetIdPermissions.md)
 - [AssetIdWithPermissions](docs/AssetIdWithPermissions.md)
 - [AssetPermissionType](docs/AssetPermissionType.md)
 - [AssetSearchBy](docs/AssetSearchBy.md)
 - [AssetSortBy](docs/AssetSortBy.md)
 - [AssetTypeResponse](docs/AssetTypeResponse.md)
 - [AttributionActionType](docs/AttributionActionType.md)
 - [AttributionMatchType](docs/AttributionMatchType.md)
 - [AttributionModel](docs/AttributionModel.md)
 - [AttributionScope](docs/AttributionScope.md)
 - [AttributionWindows](docs/AttributionWindows.md)
 - [Audience](docs/Audience.md)
 - [AudienceAccountType](docs/AudienceAccountType.md)
 - [AudienceCategory](docs/AudienceCategory.md)
 - [AudienceDefinition](docs/AudienceDefinition.md)
 - [AudienceDemographicValue](docs/AudienceDemographicValue.md)
 - [AudienceDemographics](docs/AudienceDemographics.md)
 - [AudienceInsightType](docs/AudienceInsightType.md)
 - [AudienceInsights](docs/AudienceInsights.md)
 - [AudienceInsightsScopeAndTypeGet200Response](docs/AudienceInsightsScopeAndTypeGet200Response.md)
 - [AudienceObjectiveType](docs/AudienceObjectiveType.md)
 - [AudienceOwnershipType](docs/AudienceOwnershipType.md)
 - [AudienceRule](docs/AudienceRule.md)
 - [AudienceStatus](docs/AudienceStatus.md)
 - [AudienceSubcategory](docs/AudienceSubcategory.md)
 - [AudienceType](docs/AudienceType.md)
 - [AudienceUpdateOperationType](docs/AudienceUpdateOperationType.md)
 - [AudiencesList200Response](docs/AudiencesList200Response.md)
 - [AuthRespondInviteAction](docs/AuthRespondInviteAction.md)
 - [AuthRespondInvitesBody](docs/AuthRespondInvitesBody.md)
 - [AuthRespondInvitesBodyItem](docs/AuthRespondInvitesBodyItem.md)
 - [AvailabilityFilter](docs/AvailabilityFilter.md)
 - [BaseBusinessAssets](docs/BaseBusinessAssets.md)
 - [BaseInviteDataResponse](docs/BaseInviteDataResponse.md)
 - [BasePreferredMediaType](docs/BasePreferredMediaType.md)
 - [BatchOperationStatus](docs/BatchOperationStatus.md)
 - [BidFloor](docs/BidFloor.md)
 - [BidFloorCreate](docs/BidFloorCreate.md)
 - [BidFloorObjectiveType](docs/BidFloorObjectiveType.md)
 - [BidFloorSpec](docs/BidFloorSpec.md)
 - [BidOptionsAgeBucketMultipliers](docs/BidOptionsAgeBucketMultipliers.md)
 - [BidOptionsAppTypeMultipliers](docs/BidOptionsAppTypeMultipliers.md)
 - [BidOptionsAudienceMultipliers](docs/BidOptionsAudienceMultipliers.md)
 - [BidOptionsGenderMultipliers](docs/BidOptionsGenderMultipliers.md)
 - [BidOptionsPlacementMultipliers](docs/BidOptionsPlacementMultipliers.md)
 - [BidStrategyType](docs/BidStrategyType.md)
 - [BillingInvoice](docs/BillingInvoice.md)
 - [BillingInvoiceDocumentType](docs/BillingInvoiceDocumentType.md)
 - [BillingInvoiceDownloadResponse](docs/BillingInvoiceDownloadResponse.md)
 - [BillingInvoiceSortField](docs/BillingInvoiceSortField.md)
 - [BillingInvoiceStatus](docs/BillingInvoiceStatus.md)
 - [BillingInvoicesGet200Response](docs/BillingInvoicesGet200Response.md)
 - [BillingProfileCardType](docs/BillingProfileCardType.md)
 - [BillingProfilePaymentMethodBrand](docs/BillingProfilePaymentMethodBrand.md)
 - [BillingProfileStatus](docs/BillingProfileStatus.md)
 - [BillingProfilesGet200Response](docs/BillingProfilesGet200Response.md)
 - [BillingProfilesResponse](docs/BillingProfilesResponse.md)
 - [BillingType](docs/BillingType.md)
 - [Board](docs/Board.md)
 - [BoardBase](docs/BoardBase.md)
 - [BoardCreate](docs/BoardCreate.md)
 - [BoardMedia](docs/BoardMedia.md)
 - [BoardOwner](docs/BoardOwner.md)
 - [BoardPrivacy](docs/BoardPrivacy.md)
 - [BoardPrivacyFilter](docs/BoardPrivacyFilter.md)
 - [BoardSection](docs/BoardSection.md)
 - [BoardSectionCreate](docs/BoardSectionCreate.md)
 - [BoardSectionUpdateWithRequiredBody](docs/BoardSectionUpdateWithRequiredBody.md)
 - [BoardSectionsList200Response](docs/BoardSectionsList200Response.md)
 - [BoardUpdatePrivacy](docs/BoardUpdatePrivacy.md)
 - [BoardWithUpdatePrivacy](docs/BoardWithUpdatePrivacy.md)
 - [BoardWithUpdatePrivacyUpdate](docs/BoardWithUpdatePrivacyUpdate.md)
 - [BoardsList200Response](docs/BoardsList200Response.md)
 - [BoardsListPins200Response](docs/BoardsListPins200Response.md)
 - [BookClosed](docs/BookClosed.md)
 - [BrandAccount](docs/BrandAccount.md)
 - [BrandAccountCreate](docs/BrandAccountCreate.md)
 - [BrandAccountProfileImage](docs/BrandAccountProfileImage.md)
 - [BrandAccountProfileImageUpdate](docs/BrandAccountProfileImageUpdate.md)
 - [BrandAccountUpdate](docs/BrandAccountUpdate.md)
 - [BrandFilter](docs/BrandFilter.md)
 - [BudgetDurationType](docs/BudgetDurationType.md)
 - [BudgetType](docs/BudgetType.md)
 - [BulkCampaignDeliveryEstimatesItem](docs/BulkCampaignDeliveryEstimatesItem.md)
 - [BulkCampaignDeliveryEstimatesResponse](docs/BulkCampaignDeliveryEstimatesResponse.md)
 - [BulkDownload](docs/BulkDownload.md)
 - [BulkDownloadCampaignFilter](docs/BulkDownloadCampaignFilter.md)
 - [BulkDownloadCreate](docs/BulkDownloadCreate.md)
 - [BulkEntityType](docs/BulkEntityType.md)
 - [BulkJobData](docs/BulkJobData.md)
 - [BulkOutputFormat](docs/BulkOutputFormat.md)
 - [BulkReportingJobStatus](docs/BulkReportingJobStatus.md)
 - [BulkRequestStatus](docs/BulkRequestStatus.md)
 - [BulkUpsertRequest](docs/BulkUpsertRequest.md)
 - [BulkUpsertRequestCreate](docs/BulkUpsertRequestCreate.md)
 - [BulkUpsertRequestCreateCatalogProductGroupsItems](docs/BulkUpsertRequestCreateCatalogProductGroupsItems.md)
 - [BulkUpsertRequestUpdate](docs/BulkUpsertRequestUpdate.md)
 - [BulkUpsertRequestUpdateCatalogProductGroupsItems](docs/BulkUpsertRequestUpdateCatalogProductGroupsItems.md)
 - [BulkUpsertResponse](docs/BulkUpsertResponse.md)
 - [BusinessAccessRole](docs/BusinessAccessRole.md)
 - [BusinessAccessUserSummary](docs/BusinessAccessUserSummary.md)
 - [BusinessAssetMembersGet200Response](docs/BusinessAssetMembersGet200Response.md)
 - [BusinessAssets](docs/BusinessAssets.md)
 - [BusinessAssetsGet200Response](docs/BusinessAssetsGet200Response.md)
 - [BusinessMemberAssetsGetResponse](docs/BusinessMemberAssetsGetResponse.md)
 - [BusinessMemberAssetsSummary](docs/BusinessMemberAssetsSummary.md)
 - [BusinessMemberSortBy](docs/BusinessMemberSortBy.md)
 - [BusinessMembersAssetAccessDeleteBody](docs/BusinessMembersAssetAccessDeleteBody.md)
 - [BusinessMembershipMember](docs/BusinessMembershipMember.md)
 - [BusinessPartnerAssetAccessGet200Response](docs/BusinessPartnerAssetAccessGet200Response.md)
 - [BusinessRoleForInvite](docs/BusinessRoleForInvite.md)
 - [BusinessRoleForMembers](docs/BusinessRoleForMembers.md)
 - [BusinessSearchBy](docs/BusinessSearchBy.md)
 - [BusinessToAdAccountSharedAudience](docs/BusinessToAdAccountSharedAudience.md)
 - [BusinessToAdAccountSharedAudienceUpdateWithRequiredBody](docs/BusinessToAdAccountSharedAudienceUpdateWithRequiredBody.md)
 - [BusinessToBusinessSharedAudience](docs/BusinessToBusinessSharedAudience.md)
 - [BusinessToBusinessSharedAudienceUpdateWithRequiredBody](docs/BusinessToBusinessSharedAudienceUpdateWithRequiredBody.md)
 - [Campaign](docs/Campaign.md)
 - [CampaignAdPreview](docs/CampaignAdPreview.md)
 - [CampaignAdPreviewCreate](docs/CampaignAdPreviewCreate.md)
 - [CampaignAdPreviewCreate200ResponseInner](docs/CampaignAdPreviewCreate200ResponseInner.md)
 - [CampaignAdPreviewCreate200ResponseInnerData](docs/CampaignAdPreviewCreate200ResponseInnerData.md)
 - [CampaignAdPreviewCreate200ResponseInnerDataOneOf](docs/CampaignAdPreviewCreate200ResponseInnerDataOneOf.md)
 - [CampaignAdPreviewDelete200ResponseInner](docs/CampaignAdPreviewDelete200ResponseInner.md)
 - [CampaignAdPreviewDelete200ResponseInnerStatus](docs/CampaignAdPreviewDelete200ResponseInnerStatus.md)
 - [CampaignAudienceMultipliers](docs/CampaignAudienceMultipliers.md)
 - [CampaignBatchItem](docs/CampaignBatchItem.md)
 - [CampaignBatchResponseData](docs/CampaignBatchResponseData.md)
 - [CampaignBatchUpdateItem](docs/CampaignBatchUpdateItem.md)
 - [CampaignBatchWriteResponseModel](docs/CampaignBatchWriteResponseModel.md)
 - [CampaignBidOptions](docs/CampaignBidOptions.md)
 - [CampaignBidOptionsCreate](docs/CampaignBidOptionsCreate.md)
 - [CampaignBidOptionsUpdate](docs/CampaignBidOptionsUpdate.md)
 - [CampaignBidOptionsUpdateMaskItems](docs/CampaignBidOptionsUpdateMaskItems.md)
 - [CampaignCreateItem](docs/CampaignCreateItem.md)
 - [CampaignCreateRequest](docs/CampaignCreateRequest.md)
 - [CampaignCreateRequestAllOf1](docs/CampaignCreateRequestAllOf1.md)
 - [CampaignDeliveryEstimatesCampaign](docs/CampaignDeliveryEstimatesCampaign.md)
 - [CampaignDeliveryEstimatesDerivedMetrics](docs/CampaignDeliveryEstimatesDerivedMetrics.md)
 - [CampaignDeliveryEstimatesResponse](docs/CampaignDeliveryEstimatesResponse.md)
 - [CampaignObjectiveType](docs/CampaignObjectiveType.md)
 - [CampaignPlanningAdGroupAudienceSize](docs/CampaignPlanningAdGroupAudienceSize.md)
 - [CampaignPlanningBudgetRecommendation](docs/CampaignPlanningBudgetRecommendation.md)
 - [CampaignPlanningBudgetRecommendationPoint](docs/CampaignPlanningBudgetRecommendationPoint.md)
 - [CampaignPlanningConfidenceLevelAlert](docs/CampaignPlanningConfidenceLevelAlert.md)
 - [CampaignPlanningConfidenceLevelAlertReason](docs/CampaignPlanningConfidenceLevelAlertReason.md)
 - [CampaignPlanningConfidenceLevelAlertSeverity](docs/CampaignPlanningConfidenceLevelAlertSeverity.md)
 - [CampaignPlanningConversionAttribution](docs/CampaignPlanningConversionAttribution.md)
 - [CampaignPlanningConversionAttributionWindowDays](docs/CampaignPlanningConversionAttributionWindowDays.md)
 - [CampaignPlanningConversionEvent](docs/CampaignPlanningConversionEvent.md)
 - [CampaignPlanningConversionRate](docs/CampaignPlanningConversionRate.md)
 - [CampaignPlanningCurveEstimate](docs/CampaignPlanningCurveEstimate.md)
 - [CampaignPlanningEstimationType](docs/CampaignPlanningEstimationType.md)
 - [CampaignPlanningExperimentBudgetRecommendation](docs/CampaignPlanningExperimentBudgetRecommendation.md)
 - [CampaignPlanningPointEstimate](docs/CampaignPlanningPointEstimate.md)
 - [CampaignPlanningResponseError](docs/CampaignPlanningResponseError.md)
 - [CampaignPlanningResponseErrorCode](docs/CampaignPlanningResponseErrorCode.md)
 - [CampaignSummaryStatus](docs/CampaignSummaryStatus.md)
 - [CampaignUpdateRequest](docs/CampaignUpdateRequest.md)
 - [CampaignUpdateRequestAllOf2](docs/CampaignUpdateRequestAllOf2.md)
 - [CampaignsAnalyticsMetrics](docs/CampaignsAnalyticsMetrics.md)
 - [CampaignsList200Response](docs/CampaignsList200Response.md)
 - [CancelInviteException](docs/CancelInviteException.md)
 - [CancelInviteResult](docs/CancelInviteResult.md)
 - [CancelInviteResultItem](docs/CancelInviteResultItem.md)
 - [CancelInviteResultUser](docs/CancelInviteResultUser.md)
 - [CancelInvitesRequest](docs/CancelInvitesRequest.md)
 - [CancelInvitesResponse](docs/CancelInvitesResponse.md)
 - [CarouselSlot](docs/CarouselSlot.md)
 - [CartingProduct](docs/CartingProduct.md)
 - [CartingRetailer](docs/CartingRetailer.md)
 - [Catalog](docs/Catalog.md)
 - [CatalogBinding](docs/CatalogBinding.md)
 - [CatalogCreate](docs/CatalogCreate.md)
 - [CatalogUpdate](docs/CatalogUpdate.md)
 - [CatalogsAiContentDisclosure](docs/CatalogsAiContentDisclosure.md)
 - [CatalogsAiContentDisclosureLabel](docs/CatalogsAiContentDisclosureLabel.md)
 - [CatalogsAvailableFilterValues](docs/CatalogsAvailableFilterValues.md)
 - [CatalogsBaseFilterKeys](docs/CatalogsBaseFilterKeys.md)
 - [CatalogsBaseFiltersAllOf](docs/CatalogsBaseFiltersAllOf.md)
 - [CatalogsBaseFiltersAnyOf](docs/CatalogsBaseFiltersAnyOf.md)
 - [CatalogsCreateCreativeAssetsItem](docs/CatalogsCreateCreativeAssetsItem.md)
 - [CatalogsCreateHotelItem](docs/CatalogsCreateHotelItem.md)
 - [CatalogsCreateReportResponse](docs/CatalogsCreateReportResponse.md)
 - [CatalogsCreateRetailItem](docs/CatalogsCreateRetailItem.md)
 - [CatalogsCreativeAssetsAttributes](docs/CatalogsCreativeAssetsAttributes.md)
 - [CatalogsCreativeAssetsAvailableFilterValues](docs/CatalogsCreativeAssetsAvailableFilterValues.md)
 - [CatalogsCreativeAssetsBatchItem](docs/CatalogsCreativeAssetsBatchItem.md)
 - [CatalogsCreativeAssetsBatchRequest](docs/CatalogsCreativeAssetsBatchRequest.md)
 - [CatalogsCreativeAssetsFeed](docs/CatalogsCreativeAssetsFeed.md)
 - [CatalogsCreativeAssetsFeedsCreateRequest](docs/CatalogsCreativeAssetsFeedsCreateRequest.md)
 - [CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale](docs/CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale.md)
 - [CatalogsCreativeAssetsFeedsUpdateRequest](docs/CatalogsCreativeAssetsFeedsUpdateRequest.md)
 - [CatalogsCreativeAssetsFilterValuesMap](docs/CatalogsCreativeAssetsFilterValuesMap.md)
 - [CatalogsCreativeAssetsItemErrorResponse](docs/CatalogsCreativeAssetsItemErrorResponse.md)
 - [CatalogsCreativeAssetsItemResponse](docs/CatalogsCreativeAssetsItemResponse.md)
 - [CatalogsCreativeAssetsItemsBatch](docs/CatalogsCreativeAssetsItemsBatch.md)
 - [CatalogsCreativeAssetsItemsPostFilter](docs/CatalogsCreativeAssetsItemsPostFilter.md)
 - [CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest](docs/CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest.md)
 - [CatalogsCreativeAssetsProduct](docs/CatalogsCreativeAssetsProduct.md)
 - [CatalogsCreativeAssetsProductGroup](docs/CatalogsCreativeAssetsProductGroup.md)
 - [CatalogsCreativeAssetsProductGroupCreateRequest](docs/CatalogsCreativeAssetsProductGroupCreateRequest.md)
 - [CatalogsCreativeAssetsProductGroupFilterKeys](docs/CatalogsCreativeAssetsProductGroupFilterKeys.md)
 - [CatalogsCreativeAssetsProductGroupFilters](docs/CatalogsCreativeAssetsProductGroupFilters.md)
 - [CatalogsCreativeAssetsProductGroupFiltersAllOf](docs/CatalogsCreativeAssetsProductGroupFiltersAllOf.md)
 - [CatalogsCreativeAssetsProductGroupFiltersAnyOf](docs/CatalogsCreativeAssetsProductGroupFiltersAnyOf.md)
 - [CatalogsCreativeAssetsProductGroupProductCounts](docs/CatalogsCreativeAssetsProductGroupProductCounts.md)
 - [CatalogsCreativeAssetsProductGroupUpdateRequest](docs/CatalogsCreativeAssetsProductGroupUpdateRequest.md)
 - [CatalogsCreativeAssetsProductMetadata](docs/CatalogsCreativeAssetsProductMetadata.md)
 - [CatalogsDeleteCreativeAssetsItem](docs/CatalogsDeleteCreativeAssetsItem.md)
 - [CatalogsDeleteHotelItem](docs/CatalogsDeleteHotelItem.md)
 - [CatalogsDeleteRetailItem](docs/CatalogsDeleteRetailItem.md)
 - [CatalogsFeed](docs/CatalogsFeed.md)
 - [CatalogsFeedCreateRequestSchema](docs/CatalogsFeedCreateRequestSchema.md)
 - [CatalogsFeedCredentials](docs/CatalogsFeedCredentials.md)
 - [CatalogsFeedIngestion](docs/CatalogsFeedIngestion.md)
 - [CatalogsFeedIngestionDetails](docs/CatalogsFeedIngestionDetails.md)
 - [CatalogsFeedIngestionErrors](docs/CatalogsFeedIngestionErrors.md)
 - [CatalogsFeedIngestionInfo](docs/CatalogsFeedIngestionInfo.md)
 - [CatalogsFeedIngestionWarnings](docs/CatalogsFeedIngestionWarnings.md)
 - [CatalogsFeedProcessingResult](docs/CatalogsFeedProcessingResult.md)
 - [CatalogsFeedProcessingSchedule](docs/CatalogsFeedProcessingSchedule.md)
 - [CatalogsFeedProcessingScheduleTimezone](docs/CatalogsFeedProcessingScheduleTimezone.md)
 - [CatalogsFeedProcessingStatus](docs/CatalogsFeedProcessingStatus.md)
 - [CatalogsFeedProductCounts](docs/CatalogsFeedProductCounts.md)
 - [CatalogsFeedUpdateRequestSchema](docs/CatalogsFeedUpdateRequestSchema.md)
 - [CatalogsFeedValidationDetails](docs/CatalogsFeedValidationDetails.md)
 - [CatalogsFeedValidationErrors](docs/CatalogsFeedValidationErrors.md)
 - [CatalogsFeedValidationWarnings](docs/CatalogsFeedValidationWarnings.md)
 - [CatalogsFeedVideoCounts](docs/CatalogsFeedVideoCounts.md)
 - [CatalogsFeedsCreateRequest](docs/CatalogsFeedsCreateRequest.md)
 - [CatalogsFeedsUpdateRequest](docs/CatalogsFeedsUpdateRequest.md)
 - [CatalogsFormat](docs/CatalogsFormat.md)
 - [CatalogsHotelAddress](docs/CatalogsHotelAddress.md)
 - [CatalogsHotelAttributes](docs/CatalogsHotelAttributes.md)
 - [CatalogsHotelAvailableFilterValues](docs/CatalogsHotelAvailableFilterValues.md)
 - [CatalogsHotelBatchItem](docs/CatalogsHotelBatchItem.md)
 - [CatalogsHotelBatchRequest](docs/CatalogsHotelBatchRequest.md)
 - [CatalogsHotelFeed](docs/CatalogsHotelFeed.md)
 - [CatalogsHotelFeedsCreateRequest](docs/CatalogsHotelFeedsCreateRequest.md)
 - [CatalogsHotelFeedsUpdateRequest](docs/CatalogsHotelFeedsUpdateRequest.md)
 - [CatalogsHotelFilterValuesMap](docs/CatalogsHotelFilterValuesMap.md)
 - [CatalogsHotelGuestRatings](docs/CatalogsHotelGuestRatings.md)
 - [CatalogsHotelItemErrorResponse](docs/CatalogsHotelItemErrorResponse.md)
 - [CatalogsHotelItemResponse](docs/CatalogsHotelItemResponse.md)
 - [CatalogsHotelItemsBatch](docs/CatalogsHotelItemsBatch.md)
 - [CatalogsHotelItemsPostFilter](docs/CatalogsHotelItemsPostFilter.md)
 - [CatalogsHotelListProductsByCatalogBasedFilterRequest](docs/CatalogsHotelListProductsByCatalogBasedFilterRequest.md)
 - [CatalogsHotelMainImage](docs/CatalogsHotelMainImage.md)
 - [CatalogsHotelProduct](docs/CatalogsHotelProduct.md)
 - [CatalogsHotelProductGroup](docs/CatalogsHotelProductGroup.md)
 - [CatalogsHotelProductGroupCreateRequest](docs/CatalogsHotelProductGroupCreateRequest.md)
 - [CatalogsHotelProductGroupFilterKeys](docs/CatalogsHotelProductGroupFilterKeys.md)
 - [CatalogsHotelProductGroupFilters](docs/CatalogsHotelProductGroupFilters.md)
 - [CatalogsHotelProductGroupFiltersAllOf](docs/CatalogsHotelProductGroupFiltersAllOf.md)
 - [CatalogsHotelProductGroupFiltersAnyOf](docs/CatalogsHotelProductGroupFiltersAnyOf.md)
 - [CatalogsHotelProductGroupProductCounts](docs/CatalogsHotelProductGroupProductCounts.md)
 - [CatalogsHotelProductGroupType](docs/CatalogsHotelProductGroupType.md)
 - [CatalogsHotelProductGroupUpdateRequest](docs/CatalogsHotelProductGroupUpdateRequest.md)
 - [CatalogsHotelProductMetadata](docs/CatalogsHotelProductMetadata.md)
 - [CatalogsHotelReportParameters](docs/CatalogsHotelReportParameters.md)
 - [CatalogsHotelReportParametersReport](docs/CatalogsHotelReportParametersReport.md)
 - [CatalogsHotelReportStatsParameters](docs/CatalogsHotelReportStatsParameters.md)
 - [CatalogsHotelReportStatsParametersReport](docs/CatalogsHotelReportStatsParametersReport.md)
 - [CatalogsItemValidationDetails](docs/CatalogsItemValidationDetails.md)
 - [CatalogsItemValidationErrors](docs/CatalogsItemValidationErrors.md)
 - [CatalogsItemValidationIssue](docs/CatalogsItemValidationIssue.md)
 - [CatalogsItemValidationIssues](docs/CatalogsItemValidationIssues.md)
 - [CatalogsItemValidationWarnings](docs/CatalogsItemValidationWarnings.md)
 - [CatalogsItemsBatch](docs/CatalogsItemsBatch.md)
 - [CatalogsItemsBatchPostRequest](docs/CatalogsItemsBatchPostRequest.md)
 - [CatalogsItemsBatchRequest](docs/CatalogsItemsBatchRequest.md)
 - [CatalogsItemsCreateBatchRequest](docs/CatalogsItemsCreateBatchRequest.md)
 - [CatalogsItemsDeleteBatchRequest](docs/CatalogsItemsDeleteBatchRequest.md)
 - [CatalogsItemsDeleteDiscontinuedBatchRequest](docs/CatalogsItemsDeleteDiscontinuedBatchRequest.md)
 - [CatalogsItemsPostFilters](docs/CatalogsItemsPostFilters.md)
 - [CatalogsItemsRequest](docs/CatalogsItemsRequest.md)
 - [CatalogsItemsUpdateBatchRequest](docs/CatalogsItemsUpdateBatchRequest.md)
 - [CatalogsItemsUpsertBatchRequest](docs/CatalogsItemsUpsertBatchRequest.md)
 - [CatalogsList200Response](docs/CatalogsList200Response.md)
 - [CatalogsListProductsByFeedBasedFilter](docs/CatalogsListProductsByFeedBasedFilter.md)
 - [CatalogsListProductsByFilterRequest](docs/CatalogsListProductsByFilterRequest.md)
 - [CatalogsLocalStoresCreate200ResponseInner](docs/CatalogsLocalStoresCreate200ResponseInner.md)
 - [CatalogsLocalStoresCreate200ResponseInnerData](docs/CatalogsLocalStoresCreate200ResponseInnerData.md)
 - [CatalogsLocalStoresCreate200ResponseInnerDataOneOf](docs/CatalogsLocalStoresCreate200ResponseInnerDataOneOf.md)
 - [CatalogsLocalStoresDelete200ResponseInner](docs/CatalogsLocalStoresDelete200ResponseInner.md)
 - [CatalogsLocalStoresList200Response](docs/CatalogsLocalStoresList200Response.md)
 - [CatalogsLocale](docs/CatalogsLocale.md)
 - [CatalogsProduct](docs/CatalogsProduct.md)
 - [CatalogsProductGroupCreateRequest](docs/CatalogsProductGroupCreateRequest.md)
 - [CatalogsProductGroupCurrencyCriteria](docs/CatalogsProductGroupCurrencyCriteria.md)
 - [CatalogsProductGroupFilterKeys](docs/CatalogsProductGroupFilterKeys.md)
 - [CatalogsProductGroupFilterOperatorTypeCriteria](docs/CatalogsProductGroupFilterOperatorTypeCriteria.md)
 - [CatalogsProductGroupFilters](docs/CatalogsProductGroupFilters.md)
 - [CatalogsProductGroupFiltersAllOf](docs/CatalogsProductGroupFiltersAllOf.md)
 - [CatalogsProductGroupFiltersAnyOf](docs/CatalogsProductGroupFiltersAnyOf.md)
 - [CatalogsProductGroupFiltersRequest](docs/CatalogsProductGroupFiltersRequest.md)
 - [CatalogsProductGroupFiltersRequestAnyOfItems0](docs/CatalogsProductGroupFiltersRequestAnyOfItems0.md)
 - [CatalogsProductGroupFiltersRequestAnyOfItems1](docs/CatalogsProductGroupFiltersRequestAnyOfItems1.md)
 - [CatalogsProductGroupMultipleCountriesCriteria](docs/CatalogsProductGroupMultipleCountriesCriteria.md)
 - [CatalogsProductGroupMultipleGenderCriteria](docs/CatalogsProductGroupMultipleGenderCriteria.md)
 - [CatalogsProductGroupMultipleMediaTypesCriteria](docs/CatalogsProductGroupMultipleMediaTypesCriteria.md)
 - [CatalogsProductGroupMultiplePinterestProductCategoryCriteria](docs/CatalogsProductGroupMultiplePinterestProductCategoryCriteria.md)
 - [CatalogsProductGroupMultipleStringCriteria](docs/CatalogsProductGroupMultipleStringCriteria.md)
 - [CatalogsProductGroupMultipleStringListCriteria](docs/CatalogsProductGroupMultipleStringListCriteria.md)
 - [CatalogsProductGroupPinsList200Response](docs/CatalogsProductGroupPinsList200Response.md)
 - [CatalogsProductGroupPricingCriteria](docs/CatalogsProductGroupPricingCriteria.md)
 - [CatalogsProductGroupProductCountsVertical](docs/CatalogsProductGroupProductCountsVertical.md)
 - [CatalogsProductGroupStatus](docs/CatalogsProductGroupStatus.md)
 - [CatalogsProductGroupType](docs/CatalogsProductGroupType.md)
 - [CatalogsProductGroupUint32Criteria](docs/CatalogsProductGroupUint32Criteria.md)
 - [CatalogsProductGroupUpdateManyRequestItemsOneOfItems0](docs/CatalogsProductGroupUpdateManyRequestItemsOneOfItems0.md)
 - [CatalogsProductGroupUpdateRequest](docs/CatalogsProductGroupUpdateRequest.md)
 - [CatalogsProductGroupsCreateManyRequestItems](docs/CatalogsProductGroupsCreateManyRequestItems.md)
 - [CatalogsProductGroupsCreateRequestSchema](docs/CatalogsProductGroupsCreateRequestSchema.md)
 - [CatalogsProductGroupsList200Response](docs/CatalogsProductGroupsList200Response.md)
 - [CatalogsProductGroupsUpdateRequestSchema](docs/CatalogsProductGroupsUpdateRequestSchema.md)
 - [CatalogsReport](docs/CatalogsReport.md)
 - [CatalogsReportDistributionIssueFilter](docs/CatalogsReportDistributionIssueFilter.md)
 - [CatalogsReportDistributionStats](docs/CatalogsReportDistributionStats.md)
 - [CatalogsReportFeedIngestionFilter](docs/CatalogsReportFeedIngestionFilter.md)
 - [CatalogsReportFeedIngestionStats](docs/CatalogsReportFeedIngestionStats.md)
 - [CatalogsReportParameters](docs/CatalogsReportParameters.md)
 - [CatalogsReportStats](docs/CatalogsReportStats.md)
 - [CatalogsReportStatsParameters](docs/CatalogsReportStatsParameters.md)
 - [CatalogsRetailAvailableFilterValues](docs/CatalogsRetailAvailableFilterValues.md)
 - [CatalogsRetailBatchRequest](docs/CatalogsRetailBatchRequest.md)
 - [CatalogsRetailBatchRequestItemsItems](docs/CatalogsRetailBatchRequestItemsItems.md)
 - [CatalogsRetailFeed](docs/CatalogsRetailFeed.md)
 - [CatalogsRetailFeedsCreateRequest](docs/CatalogsRetailFeedsCreateRequest.md)
 - [CatalogsRetailFeedsUpdateRequest](docs/CatalogsRetailFeedsUpdateRequest.md)
 - [CatalogsRetailFilterValuesMap](docs/CatalogsRetailFilterValuesMap.md)
 - [CatalogsRetailItemErrorResponse](docs/CatalogsRetailItemErrorResponse.md)
 - [CatalogsRetailItemResponse](docs/CatalogsRetailItemResponse.md)
 - [CatalogsRetailItemsBatch](docs/CatalogsRetailItemsBatch.md)
 - [CatalogsRetailItemsPostFilter](docs/CatalogsRetailItemsPostFilter.md)
 - [CatalogsRetailListProductsByCatalogBasedFilterRequest](docs/CatalogsRetailListProductsByCatalogBasedFilterRequest.md)
 - [CatalogsRetailProduct](docs/CatalogsRetailProduct.md)
 - [CatalogsRetailProductGroup](docs/CatalogsRetailProductGroup.md)
 - [CatalogsRetailProductGroupCreateRequest](docs/CatalogsRetailProductGroupCreateRequest.md)
 - [CatalogsRetailProductGroupProductCounts](docs/CatalogsRetailProductGroupProductCounts.md)
 - [CatalogsRetailProductGroupUpdateRequest](docs/CatalogsRetailProductGroupUpdateRequest.md)
 - [CatalogsRetailProductMetadata](docs/CatalogsRetailProductMetadata.md)
 - [CatalogsRetailReportAllItemsFilter](docs/CatalogsRetailReportAllItemsFilter.md)
 - [CatalogsRetailReportParameters](docs/CatalogsRetailReportParameters.md)
 - [CatalogsRetailReportParametersReport](docs/CatalogsRetailReportParametersReport.md)
 - [CatalogsRetailReportStatsParameters](docs/CatalogsRetailReportStatsParameters.md)
 - [CatalogsRetailReportStatsParametersReport](docs/CatalogsRetailReportStatsParametersReport.md)
 - [CatalogsStatus](docs/CatalogsStatus.md)
 - [CatalogsType](docs/CatalogsType.md)
 - [CatalogsUpdatableCreativeAssetsAttributes](docs/CatalogsUpdatableCreativeAssetsAttributes.md)
 - [CatalogsUpdatableHotelAttributes](docs/CatalogsUpdatableHotelAttributes.md)
 - [CatalogsUpdateCreativeAssetsItem](docs/CatalogsUpdateCreativeAssetsItem.md)
 - [CatalogsUpdateHotelItem](docs/CatalogsUpdateHotelItem.md)
 - [CatalogsUpdateRetailItem](docs/CatalogsUpdateRetailItem.md)
 - [CatalogsUpsertCreativeAssetsItem](docs/CatalogsUpsertCreativeAssetsItem.md)
 - [CatalogsUpsertHotelItem](docs/CatalogsUpsertHotelItem.md)
 - [CatalogsUpsertRetailItem](docs/CatalogsUpsertRetailItem.md)
 - [CatalogsVerticalBatchRequest](docs/CatalogsVerticalBatchRequest.md)
 - [CatalogsVerticalFeedsCreateRequest](docs/CatalogsVerticalFeedsCreateRequest.md)
 - [CatalogsVerticalFeedsUpdateRequest](docs/CatalogsVerticalFeedsUpdateRequest.md)
 - [CatalogsVerticalProductGroup](docs/CatalogsVerticalProductGroup.md)
 - [CatalogsVerticalProductGroupCreateRequest](docs/CatalogsVerticalProductGroupCreateRequest.md)
 - [CatalogsVerticalProductGroupUpdateRequest](docs/CatalogsVerticalProductGroupUpdateRequest.md)
 - [CatalogsVerticalsListProductsByCatalogBasedFilterRequest](docs/CatalogsVerticalsListProductsByCatalogBasedFilterRequest.md)
 - [ChangeHistoryDataType](docs/ChangeHistoryDataType.md)
 - [ChangeHistoryOperationType](docs/ChangeHistoryOperationType.md)
 - [CollectionsHeaderType](docs/CollectionsHeaderType.md)
 - [ConditionFilter](docs/ConditionFilter.md)
 - [ContentType](docs/ContentType.md)
 - [ConversionAccessToken](docs/ConversionAccessToken.md)
 - [ConversionApiResponseEventsItems](docs/ConversionApiResponseEventsItems.md)
 - [ConversionAttributionWindowDays](docs/ConversionAttributionWindowDays.md)
 - [ConversionDeletionRequest](docs/ConversionDeletionRequest.md)
 - [ConversionDeletionRequestCreate](docs/ConversionDeletionRequestCreate.md)
 - [ConversionDeletionRequestEPIKTargets](docs/ConversionDeletionRequestEPIKTargets.md)
 - [ConversionDeletionRequestList200Response](docs/ConversionDeletionRequestList200Response.md)
 - [ConversionDeletionRequestStatus](docs/ConversionDeletionRequestStatus.md)
 - [ConversionDeletionRequestTargets](docs/ConversionDeletionRequestTargets.md)
 - [ConversionDeletionRequestUserEmailTargets](docs/ConversionDeletionRequestUserEmailTargets.md)
 - [ConversionEvent](docs/ConversionEvent.md)
 - [ConversionEventAppInfo](docs/ConversionEventAppInfo.md)
 - [ConversionEventDeviceInfo](docs/ConversionEventDeviceInfo.md)
 - [ConversionEventIngestionSource](docs/ConversionEventIngestionSource.md)
 - [ConversionEventResponse](docs/ConversionEventResponse.md)
 - [ConversionEvents](docs/ConversionEvents.md)
 - [ConversionEventsCreate](docs/ConversionEventsCreate.md)
 - [ConversionEventsDataItems](docs/ConversionEventsDataItems.md)
 - [ConversionEventsDataItemsCustomData](docs/ConversionEventsDataItemsCustomData.md)
 - [ConversionEventsDataItemsCustomDataContentsItems](docs/ConversionEventsDataItemsCustomDataContentsItems.md)
 - [ConversionEventsUserDataProperties](docs/ConversionEventsUserDataProperties.md)
 - [ConversionHealthSelectionItem](docs/ConversionHealthSelectionItem.md)
 - [ConversionLearningModeType](docs/ConversionLearningModeType.md)
 - [ConversionMSOTEventsCreate](docs/ConversionMSOTEventsCreate.md)
 - [ConversionObjectiveType](docs/ConversionObjectiveType.md)
 - [ConversionProductAttributionType](docs/ConversionProductAttributionType.md)
 - [ConversionProductReport](docs/ConversionProductReport.md)
 - [ConversionProductReportBreakdownType](docs/ConversionProductReportBreakdownType.md)
 - [ConversionProductReportCreate](docs/ConversionProductReportCreate.md)
 - [ConversionProductReportGranularity](docs/ConversionProductReportGranularity.md)
 - [ConversionProductReportLevel](docs/ConversionProductReportLevel.md)
 - [ConversionProductReportingColumn](docs/ConversionProductReportingColumn.md)
 - [ConversionReportAttributionType](docs/ConversionReportAttributionType.md)
 - [ConversionReportTimeType](docs/ConversionReportTimeType.md)
 - [ConversionTag](docs/ConversionTag.md)
 - [ConversionTagCommon](docs/ConversionTagCommon.md)
 - [ConversionTagConfigs](docs/ConversionTagConfigs.md)
 - [ConversionTagCreate](docs/ConversionTagCreate.md)
 - [ConversionTagResponse](docs/ConversionTagResponse.md)
 - [ConversionTagType](docs/ConversionTagType.md)
 - [ConversionTagTypeOptimal](docs/ConversionTagTypeOptimal.md)
 - [ConversionTagV3GoalMetadata](docs/ConversionTagV3GoalMetadata.md)
 - [ConversionTagsList200Response](docs/ConversionTagsList200Response.md)
 - [Country](docs/Country.md)
 - [CountryFilter](docs/CountryFilter.md)
 - [CreateAssetAccessRequestBody](docs/CreateAssetAccessRequestBody.md)
 - [CreateAssetAccessRequestItem](docs/CreateAssetAccessRequestItem.md)
 - [CreateAssetAccessRequestResponse](docs/CreateAssetAccessRequestResponse.md)
 - [CreateAssetInvitesRequest](docs/CreateAssetInvitesRequest.md)
 - [CreateAssetInvitesRequestItem](docs/CreateAssetInvitesRequestItem.md)
 - [CreateInvitesResultsResponseArray](docs/CreateInvitesResultsResponseArray.md)
 - [CreateMembershipOrPartnershipInvitesBody](docs/CreateMembershipOrPartnershipInvitesBody.md)
 - [CreationSource](docs/CreationSource.md)
 - [CreativeAssetsIdFilter](docs/CreativeAssetsIdFilter.md)
 - [CreativeAssetsProcessingRecord](docs/CreativeAssetsProcessingRecord.md)
 - [CreativeAssetsVisibilityType](docs/CreativeAssetsVisibilityType.md)
 - [CreativeType](docs/CreativeType.md)
 - [Currency](docs/Currency.md)
 - [CurrencyFilter](docs/CurrencyFilter.md)
 - [CustomConversionEventMetrics](docs/CustomConversionEventMetrics.md)
 - [CustomLabel0Filter](docs/CustomLabel0Filter.md)
 - [CustomLabel1Filter](docs/CustomLabel1Filter.md)
 - [CustomLabel2Filter](docs/CustomLabel2Filter.md)
 - [CustomLabel3Filter](docs/CustomLabel3Filter.md)
 - [CustomLabel4Filter](docs/CustomLabel4Filter.md)
 - [CustomNumber0Filter](docs/CustomNumber0Filter.md)
 - [CustomNumber1Filter](docs/CustomNumber1Filter.md)
 - [CustomNumber2Filter](docs/CustomNumber2Filter.md)
 - [CustomNumber3Filter](docs/CustomNumber3Filter.md)
 - [CustomNumber4Filter](docs/CustomNumber4Filter.md)
 - [CustomerList](docs/CustomerList.md)
 - [CustomerListCreate](docs/CustomerListCreate.md)
 - [CustomerListRecordRow](docs/CustomerListRecordRow.md)
 - [CustomerListStatus](docs/CustomerListStatus.md)
 - [CustomerListUpdateWithRequiredBody](docs/CustomerListUpdateWithRequiredBody.md)
 - [CustomerListUpload](docs/CustomerListUpload.md)
 - [CustomerListUploadCreateRequest](docs/CustomerListUploadCreateRequest.md)
 - [CustomerListUploadCreateResponse](docs/CustomerListUploadCreateResponse.md)
 - [CustomerListsList200Response](docs/CustomerListsList200Response.md)
 - [CustomerSegment](docs/CustomerSegment.md)
 - [CustomerSegmentCreate](docs/CustomerSegmentCreate.md)
 - [CustomerSegmentList200Response](docs/CustomerSegmentList200Response.md)
 - [CustomerSegmentUpdateRequestUpdateWithRequiredBody](docs/CustomerSegmentUpdateRequestUpdateWithRequiredBody.md)
 - [CustomizableCTAType](docs/CustomizableCTAType.md)
 - [DataOutputFormat](docs/DataOutputFormat.md)
 - [DataStatus](docs/DataStatus.md)
 - [DeleteBusinessMembership200Response](docs/DeleteBusinessMembership200Response.md)
 - [DeleteBusinessMembershipBody](docs/DeleteBusinessMembershipBody.md)
 - [DeleteBusinessMembershipMember](docs/DeleteBusinessMembershipMember.md)
 - [DeleteBusinessPartners](docs/DeleteBusinessPartners.md)
 - [DeleteBusinessPartnersDelete](docs/DeleteBusinessPartnersDelete.md)
 - [DeleteMemberAccessResult](docs/DeleteMemberAccessResult.md)
 - [DeleteMemberAccessResultsResponseArray](docs/DeleteMemberAccessResultsResponseArray.md)
 - [DeleteMemberAssetAccessItem](docs/DeleteMemberAssetAccessItem.md)
 - [DeletePartnerAssetAccessBody](docs/DeletePartnerAssetAccessBody.md)
 - [DeletePartnerAssetAccessItem](docs/DeletePartnerAssetAccessItem.md)
 - [DeletePartnerAssetAccessResult](docs/DeletePartnerAssetAccessResult.md)
 - [DeletePartnerAssetAccessResultsResponseArray](docs/DeletePartnerAssetAccessResultsResponseArray.md)
 - [DeliveryEstimateObjectiveType](docs/DeliveryEstimateObjectiveType.md)
 - [DeliveryMetricsGet200Response](docs/DeliveryMetricsGet200Response.md)
 - [DeliveryMetricsResponseItemsItems](docs/DeliveryMetricsResponseItemsItems.md)
 - [DetailedError](docs/DetailedError.md)
 - [DisclosureType](docs/DisclosureType.md)
 - [DiscountStatus](docs/DiscountStatus.md)
 - [DynamicTitlesDownloadCSV](docs/DynamicTitlesDownloadCSV.md)
 - [DynamicTitlesGetStatus](docs/DynamicTitlesGetStatus.md)
 - [DynamicTitlesProcessCSV](docs/DynamicTitlesProcessCSV.md)
 - [DynamicTitlesProcessCSVCreate](docs/DynamicTitlesProcessCSVCreate.md)
 - [DynamicTitlesProcessCSVError](docs/DynamicTitlesProcessCSVError.md)
 - [DynamicTitlesUploadURL](docs/DynamicTitlesUploadURL.md)
 - [EnhancedMatchStatusType](docs/EnhancedMatchStatusType.md)
 - [EntityDataChangeHistory](docs/EntityDataChangeHistory.md)
 - [EntityHistory](docs/EntityHistory.md)
 - [EntityLabel](docs/EntityLabel.md)
 - [EntityLabelError](docs/EntityLabelError.md)
 - [EntityLabelStatus](docs/EntityLabelStatus.md)
 - [EntityStatus](docs/EntityStatus.md)
 - [ErrorDetail](docs/ErrorDetail.md)
 - [EventData](docs/EventData.md)
 - [EventProcessingStatus](docs/EventProcessingStatus.md)
 - [EventQualityScore](docs/EventQualityScore.md)
 - [Exception](docs/Exception.md)
 - [FeaturedTrend](docs/FeaturedTrend.md)
 - [FeedProcessingResultsList200Response](docs/FeedProcessingResultsList200Response.md)
 - [FeedsList200Response](docs/FeedsList200Response.md)
 - [FilterOperatorType](docs/FilterOperatorType.md)
 - [FollowUser](docs/FollowUser.md)
 - [FollowUserCreate](docs/FollowUserCreate.md)
 - [FollowersList200Response](docs/FollowersList200Response.md)
 - [FormFactor](docs/FormFactor.md)
 - [FreqBidMultiplierTimeWindow](docs/FreqBidMultiplierTimeWindow.md)
 - [FrequencyGoalMetadata](docs/FrequencyGoalMetadata.md)
 - [FrequencyGoalMetadataTimerange](docs/FrequencyGoalMetadataTimerange.md)
 - [FrequencyMultipliers](docs/FrequencyMultipliers.md)
 - [Gender](docs/Gender.md)
 - [GenderBucket](docs/GenderBucket.md)
 - [GenderDemographics](docs/GenderDemographics.md)
 - [GenderFilter](docs/GenderFilter.md)
 - [GenderMultipliers](docs/GenderMultipliers.md)
 - [GetBusinessEmployers200Response](docs/GetBusinessEmployers200Response.md)
 - [GetInvites200Response](docs/GetInvites200Response.md)
 - [GoogleProductCategory0Filter](docs/GoogleProductCategory0Filter.md)
 - [GoogleProductCategory1Filter](docs/GoogleProductCategory1Filter.md)
 - [GoogleProductCategory2Filter](docs/GoogleProductCategory2Filter.md)
 - [GoogleProductCategory3Filter](docs/GoogleProductCategory3Filter.md)
 - [GoogleProductCategory4Filter](docs/GoogleProductCategory4Filter.md)
 - [GoogleProductCategory5Filter](docs/GoogleProductCategory5Filter.md)
 - [GoogleProductCategory6Filter](docs/GoogleProductCategory6Filter.md)
 - [Granularity](docs/Granularity.md)
 - [GridClickType](docs/GridClickType.md)
 - [HotelIdFilter](docs/HotelIdFilter.md)
 - [HotelProcessingRecord](docs/HotelProcessingRecord.md)
 - [HttpMethod](docs/HttpMethod.md)
 - [ImageDetails](docs/ImageDetails.md)
 - [ImageMetadata](docs/ImageMetadata.md)
 - [ImageSize](docs/ImageSize.md)
 - [IneligibleProductTagErrorItem](docs/IneligibleProductTagErrorItem.md)
 - [IneligibleProductTagReason](docs/IneligibleProductTagReason.md)
 - [IneligibleProductTagsErrorDetails](docs/IneligibleProductTagsErrorDetails.md)
 - [IngestionSource](docs/IngestionSource.md)
 - [IngestionSourceOptions](docs/IngestionSourceOptions.md)
 - [InnerProductCategoriesMetricsHighlights](docs/InnerProductCategoriesMetricsHighlights.md)
 - [IntegrationLog](docs/IntegrationLog.md)
 - [IntegrationLogClientError](docs/IntegrationLogClientError.md)
 - [IntegrationLogClientRequest](docs/IntegrationLogClientRequest.md)
 - [IntegrationLogEventType](docs/IntegrationLogEventType.md)
 - [IntegrationLogLevel](docs/IntegrationLogLevel.md)
 - [IntegrationLogsInvalidLogResponse](docs/IntegrationLogsInvalidLogResponse.md)
 - [IntegrationLogsInvalidLogResponseRejectedLogsItems](docs/IntegrationLogsInvalidLogResponseRejectedLogsItems.md)
 - [IntegrationLogsRequestCreate](docs/IntegrationLogsRequestCreate.md)
 - [IntegrationLogsSuccessResponse](docs/IntegrationLogsSuccessResponse.md)
 - [IntegrationMetadata](docs/IntegrationMetadata.md)
 - [IntegrationMetadataCreate](docs/IntegrationMetadataCreate.md)
 - [IntegrationMetadataUpdate](docs/IntegrationMetadataUpdate.md)
 - [IntegrationRecord](docs/IntegrationRecord.md)
 - [IntegrationsGetList200Response](docs/IntegrationsGetList200Response.md)
 - [IntendedPromotionType](docs/IntendedPromotionType.md)
 - [Interest](docs/Interest.md)
 - [InterestsEnum](docs/InterestsEnum.md)
 - [InviteActionResultItem](docs/InviteActionResultItem.md)
 - [InviteAssetsSummary](docs/InviteAssetsSummary.md)
 - [InviteAssetsSummaryItem](docs/InviteAssetsSummaryItem.md)
 - [InviteBusinessRoleBinding](docs/InviteBusinessRoleBinding.md)
 - [InviteDataResponse](docs/InviteDataResponse.md)
 - [InviteExceptionResponse](docs/InviteExceptionResponse.md)
 - [InviteFilterStatus](docs/InviteFilterStatus.md)
 - [InviteResponse](docs/InviteResponse.md)
 - [InviteStatus](docs/InviteStatus.md)
 - [InviteType](docs/InviteType.md)
 - [ItemAttributes](docs/ItemAttributes.md)
 - [ItemAttributesRequest](docs/ItemAttributesRequest.md)
 - [ItemAttributesRequestImageLink](docs/ItemAttributesRequestImageLink.md)
 - [ItemAvailability](docs/ItemAvailability.md)
 - [ItemCreateBatchRecord](docs/ItemCreateBatchRecord.md)
 - [ItemDeleteBatchRecord](docs/ItemDeleteBatchRecord.md)
 - [ItemDeleteDiscontinuedBatchRecord](docs/ItemDeleteDiscontinuedBatchRecord.md)
 - [ItemGroupIdFilter](docs/ItemGroupIdFilter.md)
 - [ItemIdFilter](docs/ItemIdFilter.md)
 - [ItemIdStoreCodePair](docs/ItemIdStoreCodePair.md)
 - [ItemProcessingRecord](docs/ItemProcessingRecord.md)
 - [ItemProcessingStatus](docs/ItemProcessingStatus.md)
 - [ItemResponse](docs/ItemResponse.md)
 - [ItemUpdateBatchRecord](docs/ItemUpdateBatchRecord.md)
 - [ItemUpsertBatchRecord](docs/ItemUpsertBatchRecord.md)
 - [ItemValidationEvent](docs/ItemValidationEvent.md)
 - [ItemsIssuesList200Response](docs/ItemsIssuesList200Response.md)
 - [ItemsPost200Response](docs/ItemsPost200Response.md)
 - [Keyword](docs/Keyword.md)
 - [KeywordCreateItem](docs/KeywordCreateItem.md)
 - [KeywordError](docs/KeywordError.md)
 - [KeywordInfo](docs/KeywordInfo.md)
 - [KeywordMetrics](docs/KeywordMetrics.md)
 - [KeywordMetricsResponse](docs/KeywordMetricsResponse.md)
 - [KeywordUpdateGenerated](docs/KeywordUpdateGenerated.md)
 - [KeywordUpdateItem](docs/KeywordUpdateItem.md)
 - [Keywords](docs/Keywords.md)
 - [KeywordsCommon](docs/KeywordsCommon.md)
 - [KeywordsCreate](docs/KeywordsCreate.md)
 - [KeywordsGet200Response](docs/KeywordsGet200Response.md)
 - [KeywordsMetricsArrayResponse](docs/KeywordsMetricsArrayResponse.md)
 - [KeywordsRequest](docs/KeywordsRequest.md)
 - [KeywordsUpdate](docs/KeywordsUpdate.md)
 - [Label](docs/Label.md)
 - [LabelBulkCreateRequest](docs/LabelBulkCreateRequest.md)
 - [LabelBulkUpdateRequest](docs/LabelBulkUpdateRequest.md)
 - [LabelCreateItem](docs/LabelCreateItem.md)
 - [LabelCreateRequest](docs/LabelCreateRequest.md)
 - [LabelError](docs/LabelError.md)
 - [LabelErrorData](docs/LabelErrorData.md)
 - [LabelParentType](docs/LabelParentType.md)
 - [LabelStatus](docs/LabelStatus.md)
 - [LabelStatusBulkUpdate](docs/LabelStatusBulkUpdate.md)
 - [LabelType](docs/LabelType.md)
 - [LabelUpdateItem](docs/LabelUpdateItem.md)
 - [LabelUpdateRequest](docs/LabelUpdateRequest.md)
 - [LabeledEntities](docs/LabeledEntities.md)
 - [LabeledEntitiesCreate](docs/LabeledEntitiesCreate.md)
 - [LabelsList200Response](docs/LabelsList200Response.md)
 - [LabelsResponse](docs/LabelsResponse.md)
 - [Language](docs/Language.md)
 - [LeadForm](docs/LeadForm.md)
 - [LeadFormBatchUpdate](docs/LeadFormBatchUpdate.md)
 - [LeadFormCreate](docs/LeadFormCreate.md)
 - [LeadFormPolicyLink](docs/LeadFormPolicyLink.md)
 - [LeadFormQuestion](docs/LeadFormQuestion.md)
 - [LeadFormQuestionFieldType](docs/LeadFormQuestionFieldType.md)
 - [LeadFormQuestionType](docs/LeadFormQuestionType.md)
 - [LeadFormStatus](docs/LeadFormStatus.md)
 - [LeadFormTest](docs/LeadFormTest.md)
 - [LeadFormTestCreate](docs/LeadFormTestCreate.md)
 - [LeadFormsCreate200Response](docs/LeadFormsCreate200Response.md)
 - [LeadFormsCreate200ResponseItemsInner](docs/LeadFormsCreate200ResponseItemsInner.md)
 - [LeadFormsList200Response](docs/LeadFormsList200Response.md)
 - [LeadSubscription](docs/LeadSubscription.md)
 - [LeadSubscriptionCreate](docs/LeadSubscriptionCreate.md)
 - [LeadSubscriptionPostParams](docs/LeadSubscriptionPostParams.md)
 - [LeadSubscriptionPostParamsCreate](docs/LeadSubscriptionPostParamsCreate.md)
 - [LeadsExportResponseData](docs/LeadsExportResponseData.md)
 - [LeadsExportStatus](docs/LeadsExportStatus.md)
 - [LeadsExports](docs/LeadsExports.md)
 - [LeadsExportsCreate](docs/LeadsExportsCreate.md)
 - [LineItem](docs/LineItem.md)
 - [LinkFilter](docs/LinkFilter.md)
 - [LinkedBusiness](docs/LinkedBusiness.md)
 - [LocalInventoryCreateOperation](docs/LocalInventoryCreateOperation.md)
 - [LocalInventoryDeleteOperation](docs/LocalInventoryDeleteOperation.md)
 - [LocalInventoryItemResponse](docs/LocalInventoryItemResponse.md)
 - [LocalInventoryItemsBatch](docs/LocalInventoryItemsBatch.md)
 - [LocalInventoryItemsBatchCreate](docs/LocalInventoryItemsBatchCreate.md)
 - [LocalInventoryItemsGet](docs/LocalInventoryItemsGet.md)
 - [LocalInventoryItemsGetCreate](docs/LocalInventoryItemsGetCreate.md)
 - [LocalInventoryOperation](docs/LocalInventoryOperation.md)
 - [LocalInventoryOperationResult](docs/LocalInventoryOperationResult.md)
 - [LocalInventoryUpdateOperation](docs/LocalInventoryUpdateOperation.md)
 - [LocalInventoryUpsertOperation](docs/LocalInventoryUpsertOperation.md)
 - [LocalStore](docs/LocalStore.md)
 - [LocalStoreBatchUpdate](docs/LocalStoreBatchUpdate.md)
 - [LocalStoreCreate](docs/LocalStoreCreate.md)
 - [LookbackPeriodOptions](docs/LookbackPeriodOptions.md)
 - [MMMReport](docs/MMMReport.md)
 - [MMMReportCreate](docs/MMMReportCreate.md)
 - [MMMReportGranularity](docs/MMMReportGranularity.md)
 - [MMMReportLevel](docs/MMMReportLevel.md)
 - [MMMReportingColumn](docs/MMMReportingColumn.md)
 - [MMMReportingTargetingType](docs/MMMReportingTargetingType.md)
 - [MatchType](docs/MatchType.md)
 - [MatchTypeResponse](docs/MatchTypeResponse.md)
 - [MaxPriceFilter](docs/MaxPriceFilter.md)
 - [Media](docs/Media.md)
 - [MediaList200Response](docs/MediaList200Response.md)
 - [MediaType](docs/MediaType.md)
 - [MediaTypeFilter](docs/MediaTypeFilter.md)
 - [MediaUpload](docs/MediaUpload.md)
 - [MediaUploadCreate](docs/MediaUploadCreate.md)
 - [MediaUploadParameters](docs/MediaUploadParameters.md)
 - [MediaUploadStatus](docs/MediaUploadStatus.md)
 - [MediaUploadType](docs/MediaUploadType.md)
 - [MemberBusinessRole](docs/MemberBusinessRole.md)
 - [MetricsReportingLevel](docs/MetricsReportingLevel.md)
 - [MetricsReportingTemplateType](docs/MetricsReportingTemplateType.md)
 - [MetricsResponse](docs/MetricsResponse.md)
 - [MetricsResponseDataItems](docs/MetricsResponseDataItems.md)
 - [MinPriceFilter](docs/MinPriceFilter.md)
 - [MobileAppPlatform](docs/MobileAppPlatform.md)
 - [MsotEventName](docs/MsotEventName.md)
 - [MultiPinsAnalyticsMetricTypesItem](docs/MultiPinsAnalyticsMetricTypesItem.md)
 - [NetworkType](docs/NetworkType.md)
 - [NonDraftEntityStatus](docs/NonDraftEntityStatus.md)
 - [NonNullableCatalogsCurrency](docs/NonNullableCatalogsCurrency.md)
 - [NotificationPostRequest](docs/NotificationPostRequest.md)
 - [NotificationResponse](docs/NotificationResponse.md)
 - [NullableCatalogsItemFieldType](docs/NullableCatalogsItemFieldType.md)
 - [NullableCurrency](docs/NullableCurrency.md)
 - [NullableEntityStatus](docs/NullableEntityStatus.md)
 - [NullableLabelStatus](docs/NullableLabelStatus.md)
 - [NullableLabelType](docs/NullableLabelType.md)
 - [NullableOptimizationGoalMetadata](docs/NullableOptimizationGoalMetadata.md)
 - [NullablePartnerType](docs/NullablePartnerType.md)
 - [NullalbleMatchType](docs/NullalbleMatchType.md)
 - [NumericFilterOperatorType](docs/NumericFilterOperatorType.md)
 - [OauthAccessToken](docs/OauthAccessToken.md)
 - [ObjectiveType](docs/ObjectiveType.md)
 - [OperationType](docs/OperationType.md)
 - [OptimizationGoalMetadata](docs/OptimizationGoalMetadata.md)
 - [OptimizationType](docs/OptimizationType.md)
 - [Order](docs/Order.md)
 - [OrderLine](docs/OrderLine.md)
 - [OrderLineMutationError](docs/OrderLineMutationError.md)
 - [OrderLineMutationResponse](docs/OrderLineMutationResponse.md)
 - [OrderLineMutationResult](docs/OrderLineMutationResult.md)
 - [OrderLinePaidType](docs/OrderLinePaidType.md)
 - [OrderLineStatus](docs/OrderLineStatus.md)
 - [OrderLinesList200Response](docs/OrderLinesList200Response.md)
 - [OsFamily](docs/OsFamily.md)
 - [OverallStatusOptions](docs/OverallStatusOptions.md)
 - [PacingDeliveryType](docs/PacingDeliveryType.md)
 - [PageVisitConversionTagsGet200Response](docs/PageVisitConversionTagsGet200Response.md)
 - [PartnerMetadata](docs/PartnerMetadata.md)
 - [PartnerType](docs/PartnerType.md)
 - [PerformancePlusCampaignSettings](docs/PerformancePlusCampaignSettings.md)
 - [Permissions](docs/Permissions.md)
 - [PermissionsWithOwner](docs/PermissionsWithOwner.md)
 - [Pin](docs/Pin.md)
 - [PinAnalyticsDailyMetrics](docs/PinAnalyticsDailyMetrics.md)
 - [PinAnalyticsMetricsResponse](docs/PinAnalyticsMetricsResponse.md)
 - [PinBase](docs/PinBase.md)
 - [PinCreate](docs/PinCreate.md)
 - [PinFilter](docs/PinFilter.md)
 - [PinMedia](docs/PinMedia.md)
 - [PinMediaMetadata](docs/PinMediaMetadata.md)
 - [PinMediaSource](docs/PinMediaSource.md)
 - [PinMediaSourceImageBase64](docs/PinMediaSourceImageBase64.md)
 - [PinMediaSourceImageURL](docs/PinMediaSourceImageURL.md)
 - [PinMediaSourceImagesBase64](docs/PinMediaSourceImagesBase64.md)
 - [PinMediaSourceImagesBase64Item](docs/PinMediaSourceImagesBase64Item.md)
 - [PinMediaSourceImagesURL](docs/PinMediaSourceImagesURL.md)
 - [PinMediaSourceImagesURLItem](docs/PinMediaSourceImagesURLItem.md)
 - [PinMediaSourcePinURL](docs/PinMediaSourcePinURL.md)
 - [PinMediaSourceVideoID](docs/PinMediaSourceVideoID.md)
 - [PinMediaWithImage](docs/PinMediaWithImage.md)
 - [PinMediaWithImageAndVideo](docs/PinMediaWithImageAndVideo.md)
 - [PinMediaWithImages](docs/PinMediaWithImages.md)
 - [PinMediaWithVideo](docs/PinMediaWithVideo.md)
 - [PinMediaWithVideos](docs/PinMediaWithVideos.md)
 - [PinPromotionSummaryStatus](docs/PinPromotionSummaryStatus.md)
 - [PinRead](docs/PinRead.md)
 - [PinType](docs/PinType.md)
 - [PinUpdate](docs/PinUpdate.md)
 - [PinnerListType](docs/PinnerListType.md)
 - [PinsList200Response](docs/PinsList200Response.md)
 - [PinsSaveRequestCreate](docs/PinsSaveRequestCreate.md)
 - [PinterestLibBatchItemException](docs/PinterestLibBatchItemException.md)
 - [PinterestLibError](docs/PinterestLibError.md)
 - [PinterestLibPaginationOrder](docs/PinterestLibPaginationOrder.md)
 - [PinterestLibStatus204](docs/PinterestLibStatus204.md)
 - [PinterestProductCategoriesFilter](docs/PinterestProductCategoriesFilter.md)
 - [PlacementGroupType](docs/PlacementGroupType.md)
 - [PlacementMultipliers](docs/PlacementMultipliers.md)
 - [PlacementTrafficType](docs/PlacementTrafficType.md)
 - [PlacementType](docs/PlacementType.md)
 - [PredictedTimeSeries](docs/PredictedTimeSeries.md)
 - [PreferredMediaType](docs/PreferredMediaType.md)
 - [PriceFilter](docs/PriceFilter.md)
 - [PriceFilterPrice](docs/PriceFilterPrice.md)
 - [PrimarySort](docs/PrimarySort.md)
 - [ProductAvailability](docs/ProductAvailability.md)
 - [ProductAvailabilityType](docs/ProductAvailabilityType.md)
 - [ProductCategoriesDemographic](docs/ProductCategoriesDemographic.md)
 - [ProductCategoriesEngagementType](docs/ProductCategoriesEngagementType.md)
 - [ProductCategoriesMetricsHighlights](docs/ProductCategoriesMetricsHighlights.md)
 - [ProductCategoryDetailLookbackWindow](docs/ProductCategoryDetailLookbackWindow.md)
 - [ProductCategoryDetails](docs/ProductCategoryDetails.md)
 - [ProductCategoryEnum](docs/ProductCategoryEnum.md)
 - [ProductCategoryRegion](docs/ProductCategoryRegion.md)
 - [ProductCondition](docs/ProductCondition.md)
 - [ProductGroupAnalyticsItems](docs/ProductGroupAnalyticsItems.md)
 - [ProductGroupPromotion](docs/ProductGroupPromotion.md)
 - [ProductGroupPromotionCreateRequest](docs/ProductGroupPromotionCreateRequest.md)
 - [ProductGroupPromotionCustomizableCTAType](docs/ProductGroupPromotionCustomizableCTAType.md)
 - [ProductGroupPromotionResponseItem](docs/ProductGroupPromotionResponseItem.md)
 - [ProductGroupPromotionUpdateRequest](docs/ProductGroupPromotionUpdateRequest.md)
 - [ProductGroupPromotions](docs/ProductGroupPromotions.md)
 - [ProductGroupPromotionsCreate](docs/ProductGroupPromotionsCreate.md)
 - [ProductGroupPromotionsList200Response](docs/ProductGroupPromotionsList200Response.md)
 - [ProductGroupPromotionsUpdateWithRequiredBody](docs/ProductGroupPromotionsUpdateWithRequiredBody.md)
 - [ProductGroupReferenceFilter](docs/ProductGroupReferenceFilter.md)
 - [ProductGroupSummaryStatus](docs/ProductGroupSummaryStatus.md)
 - [ProductTagItem](docs/ProductTagItem.md)
 - [ProductTagsBulkAddRequest](docs/ProductTagsBulkAddRequest.md)
 - [ProductTagsBulkDeleteRequest](docs/ProductTagsBulkDeleteRequest.md)
 - [ProductTagsError](docs/ProductTagsError.md)
 - [ProductTagsResponse](docs/ProductTagsResponse.md)
 - [ProductType0Filter](docs/ProductType0Filter.md)
 - [ProductType1Filter](docs/ProductType1Filter.md)
 - [ProductType2Filter](docs/ProductType2Filter.md)
 - [ProductType3Filter](docs/ProductType3Filter.md)
 - [ProductType4Filter](docs/ProductType4Filter.md)
 - [Promotion](docs/Promotion.md)
 - [PromotionApplicationLevel](docs/PromotionApplicationLevel.md)
 - [PromotionArrayElement](docs/PromotionArrayElement.md)
 - [PromotionBatchUpdate](docs/PromotionBatchUpdate.md)
 - [PromotionCreate](docs/PromotionCreate.md)
 - [PromotionTemplateValue](docs/PromotionTemplateValue.md)
 - [PromotionType](docs/PromotionType.md)
 - [PromotionsList200Response](docs/PromotionsList200Response.md)
 - [PromotionsResponse](docs/PromotionsResponse.md)
 - [PublicTargetingType](docs/PublicTargetingType.md)
 - [QualityComponentDetails](docs/QualityComponentDetails.md)
 - [QualityComponentIssue](docs/QualityComponentIssue.md)
 - [QualityComponents](docs/QualityComponents.md)
 - [QueryLabelEntityStatusesItems](docs/QueryLabelEntityStatusesItems.md)
 - [QueryLabelTypesItems](docs/QueryLabelTypesItems.md)
 - [QuerymetrictypesItems](docs/QuerymetrictypesItems.md)
 - [QuerypinanalyticsmetrictypesItems](docs/QuerypinanalyticsmetrictypesItems.md)
 - [QueryvideopinmetrictypesItems](docs/QueryvideopinmetrictypesItems.md)
 - [QuizPinData](docs/QuizPinData.md)
 - [QuizPinOption](docs/QuizPinOption.md)
 - [QuizPinQuestion](docs/QuizPinQuestion.md)
 - [QuizPinResult](docs/QuizPinResult.md)
 - [RecordCounts](docs/RecordCounts.md)
 - [RelatedTerms](docs/RelatedTerms.md)
 - [RelatedTermsRelatedTermsListItems](docs/RelatedTermsRelatedTermsListItems.md)
 - [ReportType](docs/ReportType.md)
 - [ReportingColumn](docs/ReportingColumn.md)
 - [ReportingColumnAsync](docs/ReportingColumnAsync.md)
 - [ReportingColumnSync](docs/ReportingColumnSync.md)
 - [ReportingTimeZone](docs/ReportingTimeZone.md)
 - [ReportsStats200Response](docs/ReportsStats200Response.md)
 - [RespondToInviteResultItem](docs/RespondToInviteResultItem.md)
 - [RespondToInvitesResponseArray](docs/RespondToInvitesResponseArray.md)
 - [RetailLocalInventoryItemAttributes](docs/RetailLocalInventoryItemAttributes.md)
 - [RetailLocalInventoryItemAttributesOptional](docs/RetailLocalInventoryItemAttributesOptional.md)
 - [Role](docs/Role.md)
 - [S3FilePart](docs/S3FilePart.md)
 - [S3MultipartUploadData](docs/S3MultipartUploadData.md)
 - [SSIOAccount](docs/SSIOAccount.md)
 - [SSIOAccountAddress](docs/SSIOAccountAddress.md)
 - [SSIOAccountItem](docs/SSIOAccountItem.md)
 - [SSIOAccountPMPName](docs/SSIOAccountPMPName.md)
 - [SSIOInsertionOrder](docs/SSIOInsertionOrder.md)
 - [SSIOInsertionOrderCreate](docs/SSIOInsertionOrderCreate.md)
 - [SSIOInsertionOrderStatus](docs/SSIOInsertionOrderStatus.md)
 - [SSIOInsertionOrderStatusResponse](docs/SSIOInsertionOrderStatusResponse.md)
 - [SSIOInsertionOrderUpdate](docs/SSIOInsertionOrderUpdate.md)
 - [SSIOOrderLine](docs/SSIOOrderLine.md)
 - [SSIOOrderLineType](docs/SSIOOrderLineType.md)
 - [Schedule](docs/Schedule.md)
 - [ScheduleAction](docs/ScheduleAction.md)
 - [ScheduleAgeBucketMultipliers](docs/ScheduleAgeBucketMultipliers.md)
 - [ScheduleAppTypeMultipliers](docs/ScheduleAppTypeMultipliers.md)
 - [ScheduleAudienceMultipliers](docs/ScheduleAudienceMultipliers.md)
 - [ScheduleBatchUpdate](docs/ScheduleBatchUpdate.md)
 - [ScheduleBidMultipliers](docs/ScheduleBidMultipliers.md)
 - [ScheduleBidOptions](docs/ScheduleBidOptions.md)
 - [ScheduleBidOptionsGenderMultipliers](docs/ScheduleBidOptionsGenderMultipliers.md)
 - [ScheduleBidOptionsPlacementMultipliers](docs/ScheduleBidOptionsPlacementMultipliers.md)
 - [ScheduleCommonDeltaValue](docs/ScheduleCommonDeltaValue.md)
 - [ScheduleCreate](docs/ScheduleCreate.md)
 - [ScheduleCreateRequest](docs/ScheduleCreateRequest.md)
 - [ScheduleCreateRequestAllOf1](docs/ScheduleCreateRequestAllOf1.md)
 - [ScheduleDeltaValue](docs/ScheduleDeltaValue.md)
 - [ScheduleGenderMultipliers](docs/ScheduleGenderMultipliers.md)
 - [SchedulePlacementMultipliers](docs/SchedulePlacementMultipliers.md)
 - [ScheduleStatus](docs/ScheduleStatus.md)
 - [ScheduleType](docs/ScheduleType.md)
 - [ScheduleUpdateRequest](docs/ScheduleUpdateRequest.md)
 - [ScheduleUpdateRequestAllOf1](docs/ScheduleUpdateRequestAllOf1.md)
 - [SchedulesCreate200ResponseInner](docs/SchedulesCreate200ResponseInner.md)
 - [SchedulesCreate200ResponseInnerData](docs/SchedulesCreate200ResponseInnerData.md)
 - [SchedulesCreate200ResponseInnerDataOneOf](docs/SchedulesCreate200ResponseInnerDataOneOf.md)
 - [SchedulesList200Response](docs/SchedulesList200Response.md)
 - [ScrollupGoalMetadata](docs/ScrollupGoalMetadata.md)
 - [SearchPartnerPins200Response](docs/SearchPartnerPins200Response.md)
 - [SharedAudienceAccount](docs/SharedAudienceAccount.md)
 - [SharedAudiencesForBusinessList200Response](docs/SharedAudiencesForBusinessList200Response.md)
 - [SingleInterestTargetingOption](docs/SingleInterestTargetingOption.md)
 - [SourcePlatformOptions](docs/SourcePlatformOptions.md)
 - [SsioInsertionOrdersStatusGetByAdAccount200Response](docs/SsioInsertionOrdersStatusGetByAdAccount200Response.md)
 - [SsioOrderLinesGetByAdAccount200Response](docs/SsioOrderLinesGetByAdAccount200Response.md)
 - [StandardPinMetricTypes](docs/StandardPinMetricTypes.md)
 - [StoreMetadata](docs/StoreMetadata.md)
 - [SummaryPin](docs/SummaryPin.md)
 - [SummaryStatus](docs/SummaryStatus.md)
 - [SupplementalItemBatchOperationStatus](docs/SupplementalItemBatchOperationStatus.md)
 - [SupplementalItemProcessingStatus](docs/SupplementalItemProcessingStatus.md)
 - [SupplementalItemValidationEvent](docs/SupplementalItemValidationEvent.md)
 - [SupplementalItemsBatchResponse](docs/SupplementalItemsBatchResponse.md)
 - [SupplementalOperationResult](docs/SupplementalOperationResult.md)
 - [SystemUserUpdateWithRequiredBody](docs/SystemUserUpdateWithRequiredBody.md)
 - [TargetingAdvertiserCountry](docs/TargetingAdvertiserCountry.md)
 - [TargetingSpec](docs/TargetingSpec.md)
 - [TargetingSpecAgeBucket](docs/TargetingSpecAgeBucket.md)
 - [TargetingSpecAppType](docs/TargetingSpecAppType.md)
 - [TargetingSpecGender](docs/TargetingSpecGender.md)
 - [TargetingSpecListOperation](docs/TargetingSpecListOperation.md)
 - [TargetingSpecOperationAgeBucket](docs/TargetingSpecOperationAgeBucket.md)
 - [TargetingSpecOperationAppType](docs/TargetingSpecOperationAppType.md)
 - [TargetingSpecOperationAudienceExclude](docs/TargetingSpecOperationAudienceExclude.md)
 - [TargetingSpecOperationAudienceInclude](docs/TargetingSpecOperationAudienceInclude.md)
 - [TargetingSpecOperationGender](docs/TargetingSpecOperationGender.md)
 - [TargetingSpecOperationGeo](docs/TargetingSpecOperationGeo.md)
 - [TargetingSpecOperationGeoExclude](docs/TargetingSpecOperationGeoExclude.md)
 - [TargetingSpecOperationInterest](docs/TargetingSpecOperationInterest.md)
 - [TargetingSpecOperationLocale](docs/TargetingSpecOperationLocale.md)
 - [TargetingSpecOperationLocation](docs/TargetingSpecOperationLocation.md)
 - [TargetingSpecOperationLocationExclude](docs/TargetingSpecOperationLocationExclude.md)
 - [TargetingSpecOperationMaximumAge](docs/TargetingSpecOperationMaximumAge.md)
 - [TargetingSpecOperationMinimumAge](docs/TargetingSpecOperationMinimumAge.md)
 - [TargetingSpecOperationShoppingRetargeting](docs/TargetingSpecOperationShoppingRetargeting.md)
 - [TargetingSpecOperations](docs/TargetingSpecOperations.md)
 - [TargetingSpecOptimal](docs/TargetingSpecOptimal.md)
 - [TargetingSpecShoppingRetargeting](docs/TargetingSpecShoppingRetargeting.md)
 - [TargetingSpecTargetingStrategyItems](docs/TargetingSpecTargetingStrategyItems.md)
 - [TargetingStrategy](docs/TargetingStrategy.md)
 - [TargetingTemplate](docs/TargetingTemplate.md)
 - [TargetingTemplateAudienceSizing](docs/TargetingTemplateAudienceSizing.md)
 - [TargetingTemplateAudienceSizingReachEstimate](docs/TargetingTemplateAudienceSizingReachEstimate.md)
 - [TargetingTemplateCreate](docs/TargetingTemplateCreate.md)
 - [TargetingTemplateKeyword](docs/TargetingTemplateKeyword.md)
 - [TargetingTemplateList200Response](docs/TargetingTemplateList200Response.md)
 - [TargetingTemplateStatus](docs/TargetingTemplateStatus.md)
 - [TargetingTemplateUpdateRequestReadOrUpdate](docs/TargetingTemplateUpdateRequestReadOrUpdate.md)
 - [TemplateBasedReport](docs/TemplateBasedReport.md)
 - [TemplateBasedReportCreate](docs/TemplateBasedReportCreate.md)
 - [TemplatesList200Response](docs/TemplatesList200Response.md)
 - [TermsOfService](docs/TermsOfService.md)
 - [TieBreakerType](docs/TieBreakerType.md)
 - [TimeSeries](docs/TimeSeries.md)
 - [TitleKeywordsFilter](docs/TitleKeywordsFilter.md)
 - [TokenGrantType](docs/TokenGrantType.md)
 - [TokenTypeHint](docs/TokenTypeHint.md)
 - [TopPinsAnalyticsResponse](docs/TopPinsAnalyticsResponse.md)
 - [TopPinsAnalyticsResponseDateAvailability](docs/TopPinsAnalyticsResponseDateAvailability.md)
 - [TopPinsAnalyticsResponsePinsItems](docs/TopPinsAnalyticsResponsePinsItems.md)
 - [TopPinsSortBy](docs/TopPinsSortBy.md)
 - [TopVideoPinsAnalyticsResponse](docs/TopVideoPinsAnalyticsResponse.md)
 - [TopVideoPinsAnalyticsResponseDateAvailability](docs/TopVideoPinsAnalyticsResponseDateAvailability.md)
 - [TopVideoPinsAnalyticsResponsePinsItems](docs/TopVideoPinsAnalyticsResponsePinsItems.md)
 - [TopVideoPinsSortBy](docs/TopVideoPinsSortBy.md)
 - [TotalCountByEntityStatus](docs/TotalCountByEntityStatus.md)
 - [TrackingUrls](docs/TrackingUrls.md)
 - [TrendType](docs/TrendType.md)
 - [TrendingKeyword](docs/TrendingKeyword.md)
 - [TrendingKeywordDemographics](docs/TrendingKeywordDemographics.md)
 - [TrendingKeywordsResponse](docs/TrendingKeywordsResponse.md)
 - [TrendingPin](docs/TrendingPin.md)
 - [TrendingProductCategory](docs/TrendingProductCategory.md)
 - [TrendingTopic](docs/TrendingTopic.md)
 - [TrendsAgeBucket](docs/TrendsAgeBucket.md)
 - [TrendsAgeDistribution](docs/TrendsAgeDistribution.md)
 - [TrendsEditorial](docs/TrendsEditorial.md)
 - [TrendsGender](docs/TrendsGender.md)
 - [TrendsGenderDistribution](docs/TrendsGenderDistribution.md)
 - [TrendsGenderFilter](docs/TrendsGenderFilter.md)
 - [TrendsL1Interest](docs/TrendsL1Interest.md)
 - [TrendsSupportedRegion](docs/TrendsSupportedRegion.md)
 - [UpdatableItemAttributes](docs/UpdatableItemAttributes.md)
 - [UpdatableItemAttributesGtin](docs/UpdatableItemAttributesGtin.md)
 - [UpdateBusinessMembershipsResponse](docs/UpdateBusinessMembershipsResponse.md)
 - [UpdateInvitesResultsResponseArray](docs/UpdateInvitesResultsResponseArray.md)
 - [UpdateMaskBidOptionField](docs/UpdateMaskBidOptionField.md)
 - [UpdateMaskFieldType](docs/UpdateMaskFieldType.md)
 - [UpdateMemberAssetAccessBody](docs/UpdateMemberAssetAccessBody.md)
 - [UpdateMemberAssetAccessItem](docs/UpdateMemberAssetAccessItem.md)
 - [UpdateMemberAssetResultItem](docs/UpdateMemberAssetResultItem.md)
 - [UpdateMemberAssetsResultsResponseArray](docs/UpdateMemberAssetsResultsResponseArray.md)
 - [UpdatePartnerAssetAccessBody](docs/UpdatePartnerAssetAccessBody.md)
 - [UpdatePartnerAssetAccessItem](docs/UpdatePartnerAssetAccessItem.md)
 - [UpdatePartnerAssetsResult](docs/UpdatePartnerAssetsResult.md)
 - [UpdatePartnerAssetsResultsResponseArray](docs/UpdatePartnerAssetsResultsResponseArray.md)
 - [UserAccountFollowedInterests200Response](docs/UserAccountFollowedInterests200Response.md)
 - [UserAccountType](docs/UserAccountType.md)
 - [UserBusinessRoleBinding](docs/UserBusinessRoleBinding.md)
 - [UserFollowingFeedType](docs/UserFollowingFeedType.md)
 - [UserListOperationType](docs/UserListOperationType.md)
 - [UserListType](docs/UserListType.md)
 - [UserSingleAssetBinding](docs/UserSingleAssetBinding.md)
 - [UserWebsite](docs/UserWebsite.md)
 - [UserWebsiteCreate](docs/UserWebsiteCreate.md)
 - [UserWebsiteVerification](docs/UserWebsiteVerification.md)
 - [UserWebsitesGet200Response](docs/UserWebsitesGet200Response.md)
 - [UsersForIndividualAssetResponse](docs/UsersForIndividualAssetResponse.md)
 - [VerticalProductCategory](docs/VerticalProductCategory.md)
 - [VideoMetadataWithItemType](docs/VideoMetadataWithItemType.md)
 - [VideoPinMetricTypes](docs/VideoPinMetricTypes.md)
 - [WebsiteVerificationMethod](docs/WebsiteVerificationMethod.md)
 - [WorkloadState](docs/WorkloadState.md)


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


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

blah+oapicf@cliffano.com

