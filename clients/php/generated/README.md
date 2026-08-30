# OpenAPIClient-php

Pinterest's REST API

For more information, please visit [https://github.com/oapicf/pinterest-sdk](https://github.com/oapicf/pinterest-sdk).

## Installation & Usage

### Requirements

PHP 8.1 and later.

### Composer

To install the bindings via [Composer](https://getcomposer.org/), add the following to `composer.json`:

```json
{
  "repositories": [
    {
      "type": "vcs",
      "url": "https://github.com/oapicf/pinterest-sdk.git"
    }
  ],
  "require": {
    "oapicf/pinterest-sdk": "*@dev"
  }
}
```

Then run `composer install`

### Manual Installation

Download the files and include `autoload.php`:

```php
<?php
require_once('/path/to/OpenAPIClient-php/vendor/autoload.php');
```

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

// Configure OAuth2 access token for authorization: client_credentials
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdAccountsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$start_date = new \DateTime('2013-10-20T19:20:30+01:00'); // \DateTime | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
$end_date = new \DateTime('2013-10-20T19:20:30+01:00'); // \DateTime | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
$columns = array(new \OpenAPI\Client\Model\\OpenAPI\Client\Model\ReportingColumnSync()); // \OpenAPI\Client\Model\ReportingColumnSync[] | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
$granularity = new \OpenAPI\Client\Model\\OpenAPI\Client\Model\Granularity(); // \OpenAPI\Client\Model\Granularity | TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$click_window_days = 30; // float | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
$engagement_window_days = 30; // float | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
$view_window_days = 1; // float | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
$conversion_report_time = 'TIME_OF_AD_ACTION'; // string | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
$reporting_timezone = new \OpenAPI\Client\Model\\OpenAPI\Client\Model\ReportingTimeZone(); // \OpenAPI\Client\Model\ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.

try {
    $result = $apiInstance->adAccountAnalytics($start_date, $end_date, $columns, $granularity, $ad_account_id, $click_window_days, $engagement_window_days, $view_window_days, $conversion_report_time, $reporting_timezone);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdAccountsApi->adAccountAnalytics: ', $e->getMessage(), PHP_EOL;
}

```

## API Endpoints

All URIs are relative to *https://api.pinterest.com/v5*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AdAccountsApi* | [**adAccountAnalytics**](docs/Api/AdAccountsApi.md#adaccountanalytics) | **GET** /ad_accounts/{ad_account_id}/analytics | Get ad account analytics
*AdAccountsApi* | [**adAccountTargetingAnalyticsGet**](docs/Api/AdAccountsApi.md#adaccounttargetinganalyticsget) | **GET** /ad_accounts/{ad_account_id}/targeting_analytics | Get targeting analytics for an ad account
*AdAccountsApi* | [**adAccountsCreate**](docs/Api/AdAccountsApi.md#adaccountscreate) | **POST** /ad_accounts | Create ad account
*AdAccountsApi* | [**adAccountsGet**](docs/Api/AdAccountsApi.md#adaccountsget) | **GET** /ad_accounts/{ad_account_id} | Get ad account
*AdAccountsApi* | [**adAccountsList**](docs/Api/AdAccountsApi.md#adaccountslist) | **GET** /ad_accounts | List ad accounts
*AdAccountsApi* | [**analyticsCreateConversionProductReport**](docs/Api/AdAccountsApi.md#analyticscreateconversionproductreport) | **POST** /ad_accounts/{ad_account_id}/reports/brand_category_sku | Create a request for a brand, category, SKU report
*AdAccountsApi* | [**analyticsCreateMmmReport**](docs/Api/AdAccountsApi.md#analyticscreatemmmreport) | **POST** /ad_accounts/{ad_account_id}/mmm_reports | Create a request for a Marketing Mix Modeling (MMM) report
*AdAccountsApi* | [**analyticsCreateReport**](docs/Api/AdAccountsApi.md#analyticscreatereport) | **POST** /ad_accounts/{ad_account_id}/reports | Create async request for an account analytics report
*AdAccountsApi* | [**analyticsCreateTemplateReport**](docs/Api/AdAccountsApi.md#analyticscreatetemplatereport) | **POST** /ad_accounts/{ad_account_id}/templates/{template_id}/reports | Create async request for an analytics report using a template
*AdAccountsApi* | [**analyticsGetConversionProductReport**](docs/Api/AdAccountsApi.md#analyticsgetconversionproductreport) | **GET** /ad_accounts/{ad_account_id}/reports/brand_category_sku | Get advertiser brand, category, SKU report
*AdAccountsApi* | [**analyticsGetMmmReport**](docs/Api/AdAccountsApi.md#analyticsgetmmmreport) | **GET** /ad_accounts/{ad_account_id}/mmm_reports | Get advertiser Marketing Mix Modeling (MMM) report.
*AdAccountsApi* | [**analyticsGetReport**](docs/Api/AdAccountsApi.md#analyticsgetreport) | **GET** /ad_accounts/{ad_account_id}/reports | Get the account analytics report created by the async call
*AdAccountsApi* | [**sandboxDelete**](docs/Api/AdAccountsApi.md#sandboxdelete) | **DELETE** /ad_accounts/{ad_account_id}/sandbox | Delete ads data for ad account in API Sandbox
*AdAccountsApi* | [**templatesList**](docs/Api/AdAccountsApi.md#templateslist) | **GET** /ad_accounts/{ad_account_id}/templates | List templates
*AdGroupsApi* | [**adGroupsAnalytics**](docs/Api/AdGroupsApi.md#adgroupsanalytics) | **GET** /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics
*AdGroupsApi* | [**adGroupsAudienceSizing**](docs/Api/AdGroupsApi.md#adgroupsaudiencesizing) | **POST** /ad_accounts/{ad_account_id}/ad_groups/audience_sizing | Get audience sizing
*AdGroupsApi* | [**adGroupsBidFloorGet**](docs/Api/AdGroupsApi.md#adgroupsbidfloorget) | **POST** /ad_accounts/{ad_account_id}/bid_floor | Get bid floors
*AdGroupsApi* | [**adGroupsCreate**](docs/Api/AdGroupsApi.md#adgroupscreate) | **POST** /ad_accounts/{ad_account_id}/ad_groups | Create ad groups
*AdGroupsApi* | [**adGroupsDynamicTitlesDownloadCsv**](docs/Api/AdGroupsApi.md#adgroupsdynamictitlesdownloadcsv) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/csv | Get dynamic titles CSV download URL
*AdGroupsApi* | [**adGroupsDynamicTitlesGetStatus**](docs/Api/AdGroupsApi.md#adgroupsdynamictitlesgetstatus) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/status | Get dynamic titles status
*AdGroupsApi* | [**adGroupsDynamicTitlesGetUploadUrl**](docs/Api/AdGroupsApi.md#adgroupsdynamictitlesgetuploadurl) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/uploads | Get dynamic titles upload URL
*AdGroupsApi* | [**adGroupsDynamicTitlesProcessCsv**](docs/Api/AdGroupsApi.md#adgroupsdynamictitlesprocesscsv) | **POST** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles | Process dynamic titles CSV
*AdGroupsApi* | [**adGroupsGet**](docs/Api/AdGroupsApi.md#adgroupsget) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id} | Get ad group
*AdGroupsApi* | [**adGroupsList**](docs/Api/AdGroupsApi.md#adgroupslist) | **GET** /ad_accounts/{ad_account_id}/ad_groups | List ad groups
*AdGroupsApi* | [**adGroupsTargetingAnalyticsGet**](docs/Api/AdGroupsApi.md#adgroupstargetinganalyticsget) | **GET** /ad_accounts/{ad_account_id}/ad_groups/targeting_analytics | Get targeting analytics for ad groups
*AdGroupsApi* | [**adGroupsUpdate**](docs/Api/AdGroupsApi.md#adgroupsupdate) | **PATCH** /ad_accounts/{ad_account_id}/ad_groups | Update ad groups
*AdGroupsApi* | [**getAdGroupsByPromotionIdsList**](docs/Api/AdGroupsApi.md#getadgroupsbypromotionidslist) | **GET** /ad_accounts/{ad_account_id}/promotion_applied_entities | List of ad groups using promotions IDs.
*AdsApi* | [**adPreviewsCreate**](docs/Api/AdsApi.md#adpreviewscreate) | **POST** /ad_accounts/{ad_account_id}/ad_previews | Create ad preview with pin or image
*AdsApi* | [**adTargetingAnalyticsGet**](docs/Api/AdsApi.md#adtargetinganalyticsget) | **GET** /ad_accounts/{ad_account_id}/ads/targeting_analytics | Get targeting analytics for ads
*AdsApi* | [**adsAnalytics**](docs/Api/AdsApi.md#adsanalytics) | **GET** /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics
*AdsApi* | [**adsCreate**](docs/Api/AdsApi.md#adscreate) | **POST** /ad_accounts/{ad_account_id}/ads | Create ads
*AdsApi* | [**adsGet**](docs/Api/AdsApi.md#adsget) | **GET** /ad_accounts/{ad_account_id}/ads/{ad_id} | Get ad
*AdsApi* | [**adsList**](docs/Api/AdsApi.md#adslist) | **GET** /ad_accounts/{ad_account_id}/ads | List ads
*AdsApi* | [**adsUpdate**](docs/Api/AdsApi.md#adsupdate) | **PATCH** /ad_accounts/{ad_account_id}/ads | Update ads
*AdsApi* | [**campaignAdPreviewCreate**](docs/Api/AdsApi.md#campaignadpreviewcreate) | **POST** /ad_accounts/{ad_account_id}/campaign_ad_preview | Create ad preview records for one or more ad groups
*AdsApi* | [**campaignAdPreviewDelete**](docs/Api/AdsApi.md#campaignadpreviewdelete) | **DELETE** /ad_accounts/{ad_account_id}/campaign_ad_preview | Delete ad preview records for one or more ad groups
*AdsApi* | [**campaignAdPreviewRead**](docs/Api/AdsApi.md#campaignadpreviewread) | **GET** /ad_accounts/{ad_account_id}/campaign_ad_preview | Fetch ad preview records for one or more ad groups
*AdvancedAuctionApi* | [**advancedAuctionItemsGetPost**](docs/Api/AdvancedAuctionApi.md#advancedauctionitemsgetpost) | **POST** /advanced_auction/items/get | Get item bid options (POST)
*AdvancedAuctionApi* | [**advancedAuctionItemsSubmitPost**](docs/Api/AdvancedAuctionApi.md#advancedauctionitemssubmitpost) | **POST** /advanced_auction/items/submit | Operate on item level bid options
*AudienceInsightsApi* | [**audienceInsightsGet**](docs/Api/AudienceInsightsApi.md#audienceinsightsget) | **GET** /ad_accounts/{ad_account_id}/audience_insights | Get audience insights
*AudienceInsightsApi* | [**audienceInsightsScopeAndTypeGet**](docs/Api/AudienceInsightsApi.md#audienceinsightsscopeandtypeget) | **GET** /ad_accounts/{ad_account_id}/insights/audiences | Get audience insights scope and type
*AudienceSharingApi* | [**adAccountsAudiencesSharedAccountsList**](docs/Api/AudienceSharingApi.md#adaccountsaudiencessharedaccountslist) | **GET** /ad_accounts/{ad_account_id}/audiences/shared/accounts | List accounts with access to an audience owned by an ad account
*AudienceSharingApi* | [**businessAccountAudiencesSharedAccountsList**](docs/Api/AudienceSharingApi.md#businessaccountaudiencessharedaccountslist) | **GET** /businesses/{business_id}/audiences/shared/accounts | List accounts with access to an audience owned by a business
*AudienceSharingApi* | [**sharedAudiencesForBusinessList**](docs/Api/AudienceSharingApi.md#sharedaudiencesforbusinesslist) | **GET** /businesses/{business_id}/audiences | List received audiences for a business
*AudienceSharingApi* | [**updateAdAccountToAdAccountSharedAudience**](docs/Api/AudienceSharingApi.md#updateadaccounttoadaccountsharedaudience) | **PATCH** /ad_accounts/{ad_account_id}/audiences/ad_accounts/shared | Update audience sharing between ad accounts
*AudienceSharingApi* | [**updateAdAccountToBusinessSharedAudience**](docs/Api/AudienceSharingApi.md#updateadaccounttobusinesssharedaudience) | **PATCH** /ad_accounts/{ad_account_id}/audiences/businesses/shared | Update audience sharing from an ad account to businesses
*AudienceSharingApi* | [**updateBusinessToAdAccountSharedAudience**](docs/Api/AudienceSharingApi.md#updatebusinesstoadaccountsharedaudience) | **PATCH** /businesses/{business_id}/audiences/ad_accounts/shared | Update audience sharing from a business to ad accounts
*AudienceSharingApi* | [**updateBusinessToBusinessSharedAudience**](docs/Api/AudienceSharingApi.md#updatebusinesstobusinesssharedaudience) | **PATCH** /businesses/{business_id}/audiences/businesses/shared | Update audience sharing between businesses
*AudiencesApi* | [**audiencesCreate**](docs/Api/AudiencesApi.md#audiencescreate) | **POST** /ad_accounts/{ad_account_id}/audiences | Create audience
*AudiencesApi* | [**audiencesGet**](docs/Api/AudiencesApi.md#audiencesget) | **GET** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Get audience
*AudiencesApi* | [**audiencesList**](docs/Api/AudiencesApi.md#audienceslist) | **GET** /ad_accounts/{ad_account_id}/audiences | List audiences
*AudiencesApi* | [**audiencesUpdate**](docs/Api/AudiencesApi.md#audiencesupdate) | **PATCH** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Update audience
*BillingApi* | [**adsCreditRedeem**](docs/Api/BillingApi.md#adscreditredeem) | **POST** /ad_accounts/{ad_account_id}/ads_credit/redeem | Redeem ad credits
*BillingApi* | [**adsCreditsDiscountsGet**](docs/Api/BillingApi.md#adscreditsdiscountsget) | **GET** /ad_accounts/{ad_account_id}/ads_credit/discounts | Get ads credit discounts
*BillingApi* | [**billingInvoiceDownloadGet**](docs/Api/BillingApi.md#billinginvoicedownloadget) | **GET** /ad_accounts/{ad_account_id}/billing_invoice/{billing_invoice_id}/download | Get download url for a billing invoice
*BillingApi* | [**billingInvoicesGet**](docs/Api/BillingApi.md#billinginvoicesget) | **GET** /ad_accounts/{ad_account_id}/billing_invoices | Get billing invoices
*BillingApi* | [**billingProfilesGet**](docs/Api/BillingApi.md#billingprofilesget) | **GET** /ad_accounts/{ad_account_id}/billing_profiles | Get billing profiles
*BillingApi* | [**ssioAccountsGet**](docs/Api/BillingApi.md#ssioaccountsget) | **GET** /ad_accounts/{ad_account_id}/ssio/accounts | Get Salesforce account details including bill-to information.
*BillingApi* | [**ssioInsertionOrderCreate**](docs/Api/BillingApi.md#ssioinsertionordercreate) | **POST** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Create insertion order through SSIO.
*BillingApi* | [**ssioInsertionOrderEdit**](docs/Api/BillingApi.md#ssioinsertionorderedit) | **PATCH** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Edit insertion order through SSIO.
*BillingApi* | [**ssioInsertionOrdersStatusGetByAdAccount**](docs/Api/BillingApi.md#ssioinsertionordersstatusgetbyadaccount) | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/status | Get insertion order status by ad account id.
*BillingApi* | [**ssioInsertionOrdersStatusGetByPinOrderId**](docs/Api/BillingApi.md#ssioinsertionordersstatusgetbypinorderid) | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status | Get insertion order status by pin order id.
*BillingApi* | [**ssioOrderLinesGetByAdAccount**](docs/Api/BillingApi.md#ssioorderlinesgetbyadaccount) | **GET** /ad_accounts/{ad_account_id}/ssio/order_lines | Get Salesforce order lines by ad account id.
*BoardsApi* | [**boardSectionsCreate**](docs/Api/BoardsApi.md#boardsectionscreate) | **POST** /boards/{board_id}/sections | Create board section
*BoardsApi* | [**boardSectionsDelete**](docs/Api/BoardsApi.md#boardsectionsdelete) | **DELETE** /boards/{board_id}/sections/{section_id} | Delete board section
*BoardsApi* | [**boardSectionsList**](docs/Api/BoardsApi.md#boardsectionslist) | **GET** /boards/{board_id}/sections | List board sections
*BoardsApi* | [**boardSectionsListPins**](docs/Api/BoardsApi.md#boardsectionslistpins) | **GET** /boards/{board_id}/sections/{section_id}/pins | List Pins on board section
*BoardsApi* | [**boardSectionsUpdate**](docs/Api/BoardsApi.md#boardsectionsupdate) | **PATCH** /boards/{board_id}/sections/{section_id} | Update board section
*BoardsApi* | [**boardsCreate**](docs/Api/BoardsApi.md#boardscreate) | **POST** /boards | Create board
*BoardsApi* | [**boardsDelete**](docs/Api/BoardsApi.md#boardsdelete) | **DELETE** /boards/{board_id} | Delete board
*BoardsApi* | [**boardsGet**](docs/Api/BoardsApi.md#boardsget) | **GET** /boards/{board_id} | Get board
*BoardsApi* | [**boardsList**](docs/Api/BoardsApi.md#boardslist) | **GET** /boards | List boards
*BoardsApi* | [**boardsListPins**](docs/Api/BoardsApi.md#boardslistpins) | **GET** /boards/{board_id}/pins | List Pins on board
*BoardsApi* | [**boardsUpdate**](docs/Api/BoardsApi.md#boardsupdate) | **PATCH** /boards/{board_id} | Update board
*BulkApi* | [**bulkDownloadCreate**](docs/Api/BulkApi.md#bulkdownloadcreate) | **POST** /ad_accounts/{ad_account_id}/bulk/download | Get advertiser entities in bulk
*BulkApi* | [**bulkRequestGet**](docs/Api/BulkApi.md#bulkrequestget) | **GET** /ad_accounts/{ad_account_id}/bulk/{bulk_request_id} | Download advertiser entities in bulk
*BulkApi* | [**bulkUpsertCreate**](docs/Api/BulkApi.md#bulkupsertcreate) | **POST** /ad_accounts/{ad_account_id}/bulk/upsert | Create/update ad entities in bulk
*BusinessAccessAssetsApi* | [**assetGroupCreate**](docs/Api/BusinessAccessAssetsApi.md#assetgroupcreate) | **POST** /businesses/{business_id}/asset_groups | Create a new asset group.
*BusinessAccessAssetsApi* | [**assetGroupDelete**](docs/Api/BusinessAccessAssetsApi.md#assetgroupdelete) | **DELETE** /businesses/{business_id}/asset_groups | Delete asset groups.
*BusinessAccessAssetsApi* | [**assetGroupUpdate**](docs/Api/BusinessAccessAssetsApi.md#assetgroupupdate) | **PATCH** /businesses/{business_id}/asset_groups | Update asset groups.
*BusinessAccessAssetsApi* | [**businessAssetMembersGet**](docs/Api/BusinessAccessAssetsApi.md#businessassetmembersget) | **GET** /businesses/{business_id}/assets/{asset_id}/members | Get members with access to asset
*BusinessAccessAssetsApi* | [**businessAssetPartnersGet**](docs/Api/BusinessAccessAssetsApi.md#businessassetpartnersget) | **GET** /businesses/{business_id}/assets/{asset_id}/partners | Get partners with access to asset
*BusinessAccessAssetsApi* | [**businessAssetsGet**](docs/Api/BusinessAccessAssetsApi.md#businessassetsget) | **GET** /businesses/{business_id}/assets | List business assets
*BusinessAccessAssetsApi* | [**businessMemberAssetsGet**](docs/Api/BusinessAccessAssetsApi.md#businessmemberassetsget) | **GET** /businesses/{business_id}/members/{member_id}/assets | Get assets assigned to a member
*BusinessAccessAssetsApi* | [**businessMembersAssetAccessDelete**](docs/Api/BusinessAccessAssetsApi.md#businessmembersassetaccessdelete) | **DELETE** /businesses/{business_id}/members/assets/access | Delete member access to asset
*BusinessAccessAssetsApi* | [**businessMembersAssetAccessUpdate**](docs/Api/BusinessAccessAssetsApi.md#businessmembersassetaccessupdate) | **PATCH** /businesses/{business_id}/members/assets/access | Assign/Update member asset permissions
*BusinessAccessAssetsApi* | [**businessPartnerAssetAccessGet**](docs/Api/BusinessAccessAssetsApi.md#businesspartnerassetaccessget) | **GET** /businesses/{business_id}/partners/{partner_id}/assets | Get assets assigned to a partner or assets assigned by a partner
*BusinessAccessAssetsApi* | [**deletePartnerAssetAccessHandlerImpl**](docs/Api/BusinessAccessAssetsApi.md#deletepartnerassetaccesshandlerimpl) | **DELETE** /businesses/{business_id}/partners/assets | Delete partner access to asset
*BusinessAccessAssetsApi* | [**updatePartnerAssetAccessHandlerImpl**](docs/Api/BusinessAccessAssetsApi.md#updatepartnerassetaccesshandlerimpl) | **PATCH** /businesses/{business_id}/partners/assets | Assign/Update partner asset permissions
*BusinessAccessInviteApi* | [**assetAccessRequestsCreate**](docs/Api/BusinessAccessInviteApi.md#assetaccessrequestscreate) | **POST** /businesses/{business_id}/requests/assets/access | Create a request to access an existing partner&#39;s assets.
*BusinessAccessInviteApi* | [**cancelInvitesOrRequests**](docs/Api/BusinessAccessInviteApi.md#cancelinvitesorrequests) | **DELETE** /businesses/{business_id}/invites | Cancel invites/requests
*BusinessAccessInviteApi* | [**createAssetInvites**](docs/Api/BusinessAccessInviteApi.md#createassetinvites) | **POST** /businesses/{business_id}/invites/assets/access | Update invite/request with an asset permission
*BusinessAccessInviteApi* | [**createMembershipOrPartnershipInvites**](docs/Api/BusinessAccessInviteApi.md#createmembershiporpartnershipinvites) | **POST** /businesses/{business_id}/invites | Create invites or requests
*BusinessAccessInviteApi* | [**getInvites**](docs/Api/BusinessAccessInviteApi.md#getinvites) | **GET** /businesses/{business_id}/invites | Get invites/requests
*BusinessAccessInviteApi* | [**respondBusinessAccessInvites**](docs/Api/BusinessAccessInviteApi.md#respondbusinessaccessinvites) | **PATCH** /businesses/invites | Accept or decline an invite/request
*BusinessAccessRelationshipsApi* | [**brandAccountsCreate**](docs/Api/BusinessAccessRelationshipsApi.md#brandaccountscreate) | **POST** /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts | Create a Brand Account
*BusinessAccessRelationshipsApi* | [**brandAccountsUpdate**](docs/Api/BusinessAccessRelationshipsApi.md#brandaccountsupdate) | **PATCH** /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id} | Update a Brand Account
*BusinessAccessRelationshipsApi* | [**deleteBusinessMembership**](docs/Api/BusinessAccessRelationshipsApi.md#deletebusinessmembership) | **DELETE** /businesses/{business_id}/members | Terminate business memberships
*BusinessAccessRelationshipsApi* | [**deleteBusinessPartners**](docs/Api/BusinessAccessRelationshipsApi.md#deletebusinesspartners) | **DELETE** /businesses/{business_id}/partners | Terminate business partnerships
*BusinessAccessRelationshipsApi* | [**getBusinessEmployers**](docs/Api/BusinessAccessRelationshipsApi.md#getbusinessemployers) | **GET** /businesses/employers | List business employers for user
*BusinessAccessRelationshipsApi* | [**getBusinessMembers**](docs/Api/BusinessAccessRelationshipsApi.md#getbusinessmembers) | **GET** /businesses/{business_id}/members | Get business members
*BusinessAccessRelationshipsApi* | [**getBusinessPartners**](docs/Api/BusinessAccessRelationshipsApi.md#getbusinesspartners) | **GET** /businesses/{business_id}/partners | Get business partners
*BusinessAccessRelationshipsApi* | [**systemUserUpdate**](docs/Api/BusinessAccessRelationshipsApi.md#systemuserupdate) | **PATCH** /businesses/{business_id}/system_users/{system_user_id} | Update a system user information.
*BusinessAccessRelationshipsApi* | [**updateBusinessMemberships**](docs/Api/BusinessAccessRelationshipsApi.md#updatebusinessmemberships) | **PATCH** /businesses/{business_id}/members | Update member&#39;s business role
*CampaignsApi* | [**adPinsAnalytics**](docs/Api/CampaignsApi.md#adpinsanalytics) | **GET** /ad_accounts/{ad_account_id}/pins/analytics | Get pins analytics
*CampaignsApi* | [**campaignTargetingAnalyticsGet**](docs/Api/CampaignsApi.md#campaigntargetinganalyticsget) | **GET** /ad_accounts/{ad_account_id}/campaigns/targeting_analytics | Get targeting analytics for campaigns
*CampaignsApi* | [**campaignsAnalytics**](docs/Api/CampaignsApi.md#campaignsanalytics) | **GET** /ad_accounts/{ad_account_id}/campaigns/analytics | Get campaign analytics
*CampaignsApi* | [**campaignsCreate**](docs/Api/CampaignsApi.md#campaignscreate) | **POST** /ad_accounts/{ad_account_id}/campaigns | Create campaigns
*CampaignsApi* | [**campaignsGet**](docs/Api/CampaignsApi.md#campaignsget) | **GET** /ad_accounts/{ad_account_id}/campaigns/{campaign_id} | Get campaign
*CampaignsApi* | [**campaignsList**](docs/Api/CampaignsApi.md#campaignslist) | **GET** /ad_accounts/{ad_account_id}/campaigns | List campaigns
*CampaignsApi* | [**campaignsUpdate**](docs/Api/CampaignsApi.md#campaignsupdate) | **PATCH** /ad_accounts/{ad_account_id}/campaigns | Update campaigns
*CampaignsApi* | [**getCampaignDeliveryEstimates**](docs/Api/CampaignsApi.md#getcampaigndeliveryestimates) | **POST** /ad_accounts/{ad_account_id}/campaigns/delivery_estimates | Get campaign delivery estimates
*CatalogFeedsApi* | [**feedProcessingResultsList**](docs/Api/CatalogFeedsApi.md#feedprocessingresultslist) | **GET** /catalogs/feeds/{feed_id}/processing_results | List feed processing results
*CatalogFeedsApi* | [**feedsCreate**](docs/Api/CatalogFeedsApi.md#feedscreate) | **POST** /catalogs/feeds | Create feed
*CatalogFeedsApi* | [**feedsDelete**](docs/Api/CatalogFeedsApi.md#feedsdelete) | **DELETE** /catalogs/feeds/{feed_id} | Delete feed
*CatalogFeedsApi* | [**feedsGet**](docs/Api/CatalogFeedsApi.md#feedsget) | **GET** /catalogs/feeds/{feed_id} | Get feed
*CatalogFeedsApi* | [**feedsIngest**](docs/Api/CatalogFeedsApi.md#feedsingest) | **POST** /catalogs/feeds/{feed_id}/ingest | Ingest feed items
*CatalogFeedsApi* | [**feedsList**](docs/Api/CatalogFeedsApi.md#feedslist) | **GET** /catalogs/feeds | List feeds
*CatalogFeedsApi* | [**feedsUpdate**](docs/Api/CatalogFeedsApi.md#feedsupdate) | **PATCH** /catalogs/feeds/{feed_id} | Update feed
*CatalogFeedsApi* | [**itemsIssuesList**](docs/Api/CatalogFeedsApi.md#itemsissueslist) | **GET** /catalogs/processing_results/{processing_result_id}/item_issues | List item issues
*CatalogItemsApi* | [**itemsBatchGet**](docs/Api/CatalogItemsApi.md#itemsbatchget) | **GET** /catalogs/items/batch/{batch_id} | Get item batch status
*CatalogItemsApi* | [**itemsBatchPost**](docs/Api/CatalogItemsApi.md#itemsbatchpost) | **POST** /catalogs/items/batch | Operate on item batch
*CatalogItemsApi* | [**itemsPost**](docs/Api/CatalogItemsApi.md#itemspost) | **POST** /catalogs/items | Get catalogs items (POST)
*CatalogProductGroupsApi* | [**catalogsProductGroupPinsList**](docs/Api/CatalogProductGroupsApi.md#catalogsproductgrouppinslist) | **GET** /catalogs/product_groups/{product_group_id}/products | List products by product group
*CatalogProductGroupsApi* | [**catalogsProductGroupsCreate**](docs/Api/CatalogProductGroupsApi.md#catalogsproductgroupscreate) | **POST** /catalogs/product_groups | Create product group
*CatalogProductGroupsApi* | [**catalogsProductGroupsCreateMany**](docs/Api/CatalogProductGroupsApi.md#catalogsproductgroupscreatemany) | **POST** /catalogs/product_groups/multiple | Create product groups
*CatalogProductGroupsApi* | [**catalogsProductGroupsDelete**](docs/Api/CatalogProductGroupsApi.md#catalogsproductgroupsdelete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group
*CatalogProductGroupsApi* | [**catalogsProductGroupsDeleteMany**](docs/Api/CatalogProductGroupsApi.md#catalogsproductgroupsdeletemany) | **DELETE** /catalogs/product_groups/multiple | Delete product groups
*CatalogProductGroupsApi* | [**catalogsProductGroupsGet**](docs/Api/CatalogProductGroupsApi.md#catalogsproductgroupsget) | **GET** /catalogs/product_groups/{product_group_id} | Get product group
*CatalogProductGroupsApi* | [**catalogsProductGroupsList**](docs/Api/CatalogProductGroupsApi.md#catalogsproductgroupslist) | **GET** /catalogs/product_groups | List product groups
*CatalogProductGroupsApi* | [**catalogsProductGroupsProductCountsGet**](docs/Api/CatalogProductGroupsApi.md#catalogsproductgroupsproductcountsget) | **GET** /catalogs/product_groups/{product_group_id}/product_counts | Get product counts
*CatalogProductGroupsApi* | [**catalogsProductGroupsUpdate**](docs/Api/CatalogProductGroupsApi.md#catalogsproductgroupsupdate) | **PATCH** /catalogs/product_groups/{product_group_id} | Update single product group
*CatalogProductGroupsApi* | [**productsByProductGroupFilterList**](docs/Api/CatalogProductGroupsApi.md#productsbyproductgroupfilterlist) | **POST** /catalogs/products/get_by_product_group_filters | List products by filter
*CatalogReportsApi* | [**reportsCreate**](docs/Api/CatalogReportsApi.md#reportscreate) | **POST** /catalogs/reports | Build catalogs report
*CatalogReportsApi* | [**reportsGet**](docs/Api/CatalogReportsApi.md#reportsget) | **GET** /catalogs/reports | Get catalogs report
*CatalogReportsApi* | [**reportsStats**](docs/Api/CatalogReportsApi.md#reportsstats) | **GET** /catalogs/reports/stats | List report stats
*CatalogSupplementalApi* | [**catalogsLocalInventoryItemsBatchOperate**](docs/Api/CatalogSupplementalApi.md#catalogslocalinventoryitemsbatchoperate) | **POST** /catalogs/{catalog_id}/local_inventory_items/batch | Operate on local inventory item batch
*CatalogSupplementalApi* | [**catalogsLocalInventoryItemsPost**](docs/Api/CatalogSupplementalApi.md#catalogslocalinventoryitemspost) | **POST** /catalogs/{catalog_id}/local_inventory_items/query | Get local inventory items (POST)
*CatalogSupplementalApi* | [**catalogsLocalStoresCreate**](docs/Api/CatalogSupplementalApi.md#catalogslocalstorescreate) | **POST** /catalogs/{catalog_id}/local_stores | Create local stores
*CatalogSupplementalApi* | [**catalogsLocalStoresDelete**](docs/Api/CatalogSupplementalApi.md#catalogslocalstoresdelete) | **DELETE** /catalogs/{catalog_id}/local_stores | Delete local stores
*CatalogSupplementalApi* | [**catalogsLocalStoresList**](docs/Api/CatalogSupplementalApi.md#catalogslocalstoreslist) | **GET** /catalogs/{catalog_id}/local_stores | List local stores
*CatalogSupplementalApi* | [**catalogsLocalStoresUpdate**](docs/Api/CatalogSupplementalApi.md#catalogslocalstoresupdate) | **PATCH** /catalogs/{catalog_id}/local_stores | Update local stores
*CatalogSupplementalApi* | [**catalogsSupplementalItemsBatchGet**](docs/Api/CatalogSupplementalApi.md#catalogssupplementalitemsbatchget) | **GET** /catalogs/{catalog_id}/supplemental_items/batch/{batch_id} | Get supplemental items batch status
*CatalogsApi* | [**catalogsAvailableFilterValues**](docs/Api/CatalogsApi.md#catalogsavailablefiltervalues) | **GET** /catalogs/available_filter_values | List available filter values
*CatalogsApi* | [**catalogsCreate**](docs/Api/CatalogsApi.md#catalogscreate) | **POST** /catalogs | Create catalog
*CatalogsApi* | [**catalogsList**](docs/Api/CatalogsApi.md#catalogslist) | **GET** /catalogs | List catalogs
*ConversionDeletionRequestsApi* | [**conversionDeletionRequestCreate**](docs/Api/ConversionDeletionRequestsApi.md#conversiondeletionrequestcreate) | **POST** /ad_accounts/{ad_account_id}/conversion_deletion_requests | Create a conversion deletion request
*ConversionDeletionRequestsApi* | [**conversionDeletionRequestDelete**](docs/Api/ConversionDeletionRequestsApi.md#conversiondeletionrequestdelete) | **DELETE** /ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id} | Delete a conversion deletion request
*ConversionDeletionRequestsApi* | [**conversionDeletionRequestGet**](docs/Api/ConversionDeletionRequestsApi.md#conversiondeletionrequestget) | **GET** /ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id} | Get a single conversion deletion request
*ConversionDeletionRequestsApi* | [**conversionDeletionRequestList**](docs/Api/ConversionDeletionRequestsApi.md#conversiondeletionrequestlist) | **GET** /ad_accounts/{ad_account_id}/conversion_deletion_requests | List conversion deletion requests
*ConversionEqsApi* | [**conversionEqsList**](docs/Api/ConversionEqsApi.md#conversioneqslist) | **GET** /ad_accounts/{ad_account_id}/conversion_eqs | Get event quality score (EQS)
*ConversionEventsApi* | [**eventsCreate**](docs/Api/ConversionEventsApi.md#eventscreate) | **POST** /ad_accounts/{ad_account_id}/events | Send conversions
*ConversionTagsApi* | [**conversionTagsCreate**](docs/Api/ConversionTagsApi.md#conversiontagscreate) | **POST** /ad_accounts/{ad_account_id}/conversion_tags | Create conversion tag
*ConversionTagsApi* | [**conversionTagsGet**](docs/Api/ConversionTagsApi.md#conversiontagsget) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id} | Get conversion tag
*ConversionTagsApi* | [**conversionTagsList**](docs/Api/ConversionTagsApi.md#conversiontagslist) | **GET** /ad_accounts/{ad_account_id}/conversion_tags | List conversion tags
*ConversionTagsApi* | [**ocpmEligibleConversionTagsGet**](docs/Api/ConversionTagsApi.md#ocpmeligibleconversiontagsget) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible | Get Ocpm eligible conversion tags
*ConversionTagsApi* | [**pageVisitConversionTagsGet**](docs/Api/ConversionTagsApi.md#pagevisitconversiontagsget) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/page_visit | Get page visit conversion tags
*ConversionsApi* | [**advertiserDefinedEventsCreate**](docs/Api/ConversionsApi.md#advertiserdefinedeventscreate) | **POST** /ad_accounts/{ad_account_id}/advertiser_defined_events | Create advertiser defined events
*ConversionsApi* | [**advertiserDefinedEventsDelete**](docs/Api/ConversionsApi.md#advertiserdefinedeventsdelete) | **DELETE** /ad_accounts/{ad_account_id}/advertiser_defined_events | Delete advertiser defined events
*ConversionsApi* | [**advertiserDefinedEventsGet**](docs/Api/ConversionsApi.md#advertiserdefinedeventsget) | **GET** /ad_accounts/{ad_account_id}/advertiser_defined_events | Get advertiser defined events
*ConversionsApi* | [**advertiserDefinedEventsUpdate**](docs/Api/ConversionsApi.md#advertiserdefinedeventsupdate) | **PATCH** /ad_accounts/{ad_account_id}/advertiser_defined_events | Update advertiser defined events
*CustomerListUploadsApi* | [**customerListUploadsCreate**](docs/Api/CustomerListUploadsApi.md#customerlistuploadscreate) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads | Create customer list upload
*CustomerListUploadsApi* | [**customerListUploadsGet**](docs/Api/CustomerListUploadsApi.md#customerlistuploadsget) | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id} | Get customer list upload
*CustomerListUploadsApi* | [**customerListUploadsRun**](docs/Api/CustomerListUploadsApi.md#customerlistuploadsrun) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run | Run customer list upload
*CustomerListsApi* | [**customerListsCreate**](docs/Api/CustomerListsApi.md#customerlistscreate) | **POST** /ad_accounts/{ad_account_id}/customer_lists | Create customer lists
*CustomerListsApi* | [**customerListsGet**](docs/Api/CustomerListsApi.md#customerlistsget) | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Get customer list
*CustomerListsApi* | [**customerListsList**](docs/Api/CustomerListsApi.md#customerlistslist) | **GET** /ad_accounts/{ad_account_id}/customer_lists | Get customer lists
*CustomerListsApi* | [**customerListsUpdate**](docs/Api/CustomerListsApi.md#customerlistsupdate) | **PATCH** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Update customer list
*CustomerSegmentApi* | [**customerSegmentCreate**](docs/Api/CustomerSegmentApi.md#customersegmentcreate) | **POST** /ad_accounts/{ad_account_id}/customer_segments | Create customer segments
*CustomerSegmentApi* | [**customerSegmentList**](docs/Api/CustomerSegmentApi.md#customersegmentlist) | **GET** /ad_accounts/{ad_account_id}/customer_segments | List customer segments
*CustomerSegmentApi* | [**customerSegmentUpdate**](docs/Api/CustomerSegmentApi.md#customersegmentupdate) | **PATCH** /ad_accounts/{ad_account_id}/customer_segments | Update customer segments
*IntegrationsApi* | [**integrationsCommerceDel**](docs/Api/IntegrationsApi.md#integrationscommercedel) | **DELETE** /integrations/commerce/{external_business_id} | Delete commerce integration
*IntegrationsApi* | [**integrationsCommerceGet**](docs/Api/IntegrationsApi.md#integrationscommerceget) | **GET** /integrations/commerce/{external_business_id} | Get commerce integration
*IntegrationsApi* | [**integrationsCommercePatch**](docs/Api/IntegrationsApi.md#integrationscommercepatch) | **PATCH** /integrations/commerce/{external_business_id} | Update commerce integration
*IntegrationsApi* | [**integrationsCommercePost**](docs/Api/IntegrationsApi.md#integrationscommercepost) | **POST** /integrations/commerce | Create commerce integration
*IntegrationsApi* | [**integrationsGetById**](docs/Api/IntegrationsApi.md#integrationsgetbyid) | **GET** /integrations/{id} | Get integration metadata
*IntegrationsApi* | [**integrationsGetList**](docs/Api/IntegrationsApi.md#integrationsgetlist) | **GET** /integrations | Get integration metadata list
*IntegrationsApi* | [**integrationsLogsPost**](docs/Api/IntegrationsApi.md#integrationslogspost) | **POST** /integrations/logs | Receives batched logs from integration applications.
*KeywordsApi* | [**countryKeywordsMetricsGet**](docs/Api/KeywordsApi.md#countrykeywordsmetricsget) | **GET** /ad_accounts/{ad_account_id}/keywords/metrics | Get country&#39;s keyword metrics
*KeywordsApi* | [**keywordsCreate**](docs/Api/KeywordsApi.md#keywordscreate) | **POST** /ad_accounts/{ad_account_id}/keywords | Create keywords
*KeywordsApi* | [**keywordsGet**](docs/Api/KeywordsApi.md#keywordsget) | **GET** /ad_accounts/{ad_account_id}/keywords | Get keywords
*KeywordsApi* | [**keywordsUpdate**](docs/Api/KeywordsApi.md#keywordsupdate) | **PATCH** /ad_accounts/{ad_account_id}/keywords | Update keywords
*KeywordsApi* | [**trendingKeywordsList**](docs/Api/KeywordsApi.md#trendingkeywordslist) | **GET** /trends/keywords/{region}/top/{trend_type} | List trending keywords
*LabelsApi* | [**labelsApply**](docs/Api/LabelsApi.md#labelsapply) | **POST** /ad_accounts/{ad_account_id}/labels/{label_id}/apply | Apply label to entity
*LabelsApi* | [**labelsCreate**](docs/Api/LabelsApi.md#labelscreate) | **POST** /ad_accounts/{ad_account_id}/labels | Create labels
*LabelsApi* | [**labelsList**](docs/Api/LabelsApi.md#labelslist) | **GET** /ad_accounts/{ad_account_id}/labels | List labels
*LabelsApi* | [**labelsRemove**](docs/Api/LabelsApi.md#labelsremove) | **POST** /ad_accounts/{ad_account_id}/labels/{label_id}/remove | Remove label from entities
*LabelsApi* | [**labelsUpdate**](docs/Api/LabelsApi.md#labelsupdate) | **PATCH** /ad_accounts/{ad_account_id}/labels | Update labels
*LeadAdsApi* | [**adAccountsSubscriptionsDelById**](docs/Api/LeadAdsApi.md#adaccountssubscriptionsdelbyid) | **DELETE** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Delete lead ads subscription
*LeadAdsApi* | [**adAccountsSubscriptionsGetById**](docs/Api/LeadAdsApi.md#adaccountssubscriptionsgetbyid) | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Get lead ads subscription by ID
*LeadAdsApi* | [**adAccountsSubscriptionsGetList**](docs/Api/LeadAdsApi.md#adaccountssubscriptionsgetlist) | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions | Get lead ads subscriptions
*LeadAdsApi* | [**adAccountsSubscriptionsPost**](docs/Api/LeadAdsApi.md#adaccountssubscriptionspost) | **POST** /ad_accounts/{ad_account_id}/leads/subscriptions | Create lead ads subscription
*LeadFormsApi* | [**leadFormGet**](docs/Api/LeadFormsApi.md#leadformget) | **GET** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id} | Get lead form by id
*LeadFormsApi* | [**leadFormTestCreate**](docs/Api/LeadFormsApi.md#leadformtestcreate) | **POST** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test | Create lead form test data
*LeadFormsApi* | [**leadFormsCreate**](docs/Api/LeadFormsApi.md#leadformscreate) | **POST** /ad_accounts/{ad_account_id}/lead_forms | Create lead forms
*LeadFormsApi* | [**leadFormsList**](docs/Api/LeadFormsApi.md#leadformslist) | **GET** /ad_accounts/{ad_account_id}/lead_forms | List lead forms
*LeadFormsApi* | [**leadFormsUpdate**](docs/Api/LeadFormsApi.md#leadformsupdate) | **PATCH** /ad_accounts/{ad_account_id}/lead_forms | Update lead forms
*LeadsExportApi* | [**leadsExportCreate**](docs/Api/LeadsExportApi.md#leadsexportcreate) | **POST** /ad_accounts/{ad_account_id}/leads_export | Create a request to export leads collected from a lead ad
*LeadsExportApi* | [**leadsExportGet**](docs/Api/LeadsExportApi.md#leadsexportget) | **GET** /ad_accounts/{ad_account_id}/leads_export/{leads_export_id} | Get the lead export from the lead export create call
*MediaApi* | [**mediaCreate**](docs/Api/MediaApi.md#mediacreate) | **POST** /media | Register media upload
*MediaApi* | [**mediaGet**](docs/Api/MediaApi.md#mediaget) | **GET** /media/{media_id} | Get media upload details
*MediaApi* | [**mediaList**](docs/Api/MediaApi.md#medialist) | **GET** /media | List media uploads
*MsotEventsApi* | [**msotEventsCreate**](docs/Api/MsotEventsApi.md#msoteventscreate) | **POST** /ad_accounts/{ad_account_id}/msot/events | Send Measurement Source Of Truth (MSOT) attributed conversion events
*NotificationApi* | [**notificationPost**](docs/Api/NotificationApi.md#notificationpost) | **POST** /notifications | Receive notifications from external partners.
*OauthApi* | [**oauthConversionToken**](docs/Api/OauthApi.md#oauthconversiontoken) | **POST** /oauth/conversion_token | Generate OAuth access token for conversion API
*OauthApi* | [**oauthToken**](docs/Api/OauthApi.md#oauthtoken) | **POST** /oauth/token | Generate OAuth access token
*OauthApi* | [**tokenRevoke**](docs/Api/OauthApi.md#tokenrevoke) | **POST** /oauth/token/revoke | Revoke a token
*OrderLinesApi* | [**orderLinesGet**](docs/Api/OrderLinesApi.md#orderlinesget) | **GET** /ad_accounts/{ad_account_id}/order_lines/{order_line_id} | Get order line
*OrderLinesApi* | [**orderLinesList**](docs/Api/OrderLinesApi.md#orderlineslist) | **GET** /ad_accounts/{ad_account_id}/order_lines | Get order lines.
*PinsApi* | [**multiPinsAnalytics**](docs/Api/PinsApi.md#multipinsanalytics) | **GET** /pins/analytics | Get multiple Pin analytics
*PinsApi* | [**pinsAnalytics**](docs/Api/PinsApi.md#pinsanalytics) | **GET** /pins/{pin_id}/analytics | Get Pin analytics
*PinsApi* | [**pinsCreate**](docs/Api/PinsApi.md#pinscreate) | **POST** /pins | Create Pin
*PinsApi* | [**pinsDelete**](docs/Api/PinsApi.md#pinsdelete) | **DELETE** /pins/{pin_id} | Delete Pin
*PinsApi* | [**pinsGet**](docs/Api/PinsApi.md#pinsget) | **GET** /pins/{pin_id} | Get Pin
*PinsApi* | [**pinsList**](docs/Api/PinsApi.md#pinslist) | **GET** /pins | List Pins
*PinsApi* | [**pinsSave**](docs/Api/PinsApi.md#pinssave) | **POST** /pins/{pin_id}/save | Save Pin
*PinsApi* | [**pinsUpdate**](docs/Api/PinsApi.md#pinsupdate) | **PATCH** /pins/{pin_id} | Update Pin
*ProductGroupPromotionsApi* | [**productGroupPromotionsCreate**](docs/Api/ProductGroupPromotionsApi.md#productgrouppromotionscreate) | **POST** /ad_accounts/{ad_account_id}/product_group_promotions | Create product group promotions
*ProductGroupPromotionsApi* | [**productGroupPromotionsGet**](docs/Api/ProductGroupPromotionsApi.md#productgrouppromotionsget) | **GET** /ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id} | Get a product group promotion by id
*ProductGroupPromotionsApi* | [**productGroupPromotionsList**](docs/Api/ProductGroupPromotionsApi.md#productgrouppromotionslist) | **GET** /ad_accounts/{ad_account_id}/product_group_promotions | Get product group promotions
*ProductGroupPromotionsApi* | [**productGroupPromotionsUpdate**](docs/Api/ProductGroupPromotionsApi.md#productgrouppromotionsupdate) | **PATCH** /ad_accounts/{ad_account_id}/product_group_promotions | Update product group promotions
*ProductGroupPromotionsApi* | [**productGroupsAnalytics**](docs/Api/ProductGroupPromotionsApi.md#productgroupsanalytics) | **GET** /ad_accounts/{ad_account_id}/product_groups/analytics | Get product group analytics
*ProductTagsApi* | [**productTagsBulkAdd**](docs/Api/ProductTagsApi.md#producttagsbulkadd) | **POST** /pins/{pin_id}/product_tags | Add product tags to pin
*ProductTagsApi* | [**productTagsBulkDelete**](docs/Api/ProductTagsApi.md#producttagsbulkdelete) | **POST** /pins/{pin_id}/product_tags/bulk-delete | Delete product tags from pin
*ProductTagsApi* | [**productTagsList**](docs/Api/ProductTagsApi.md#producttagslist) | **GET** /pins/{pin_id}/product_tags | Get product tags for pin
*PromotionsApi* | [**promotionsCreate**](docs/Api/PromotionsApi.md#promotionscreate) | **POST** /ad_accounts/{ad_account_id}/promotions | Create promotions
*PromotionsApi* | [**promotionsDelete**](docs/Api/PromotionsApi.md#promotionsdelete) | **DELETE** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Delete promotion by id
*PromotionsApi* | [**promotionsGet**](docs/Api/PromotionsApi.md#promotionsget) | **GET** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Get promotion by id
*PromotionsApi* | [**promotionsList**](docs/Api/PromotionsApi.md#promotionslist) | **GET** /ad_accounts/{ad_account_id}/promotions | Get promotions
*PromotionsApi* | [**promotionsUpdate**](docs/Api/PromotionsApi.md#promotionsupdate) | **PATCH** /ad_accounts/{ad_account_id}/promotions | Update promotions
*ResourcesApi* | [**adAccountCountriesGet**](docs/Api/ResourcesApi.md#adaccountcountriesget) | **GET** /resources/ad_account_countries | Get ad accounts countries
*ResourcesApi* | [**deliveryMetricsGet**](docs/Api/ResourcesApi.md#deliverymetricsget) | **GET** /resources/delivery_metrics | Get available metrics&#39; definitions
*ResourcesApi* | [**interestTargetingOptionsGet**](docs/Api/ResourcesApi.md#interesttargetingoptionsget) | **GET** /resources/targeting/interests/{interest_id} | Get interest details
*ResourcesApi* | [**leadFormQuestionsGet**](docs/Api/ResourcesApi.md#leadformquestionsget) | **GET** /resources/lead_form_questions | Get lead form questions
*ResourcesApi* | [**metricsReadyStateGet**](docs/Api/ResourcesApi.md#metricsreadystateget) | **GET** /resources/metrics_ready_state | Get metrics ready state
*ResourcesApi* | [**targetingOptionsGet**](docs/Api/ResourcesApi.md#targetingoptionsget) | **GET** /resources/targeting/{targeting_type} | Get targeting options
*SchedulesApi* | [**schedulesCreate**](docs/Api/SchedulesApi.md#schedulescreate) | **POST** /ad_accounts/{ad_account_id}/schedules | Create schedules
*SchedulesApi* | [**schedulesList**](docs/Api/SchedulesApi.md#scheduleslist) | **GET** /ad_accounts/{ad_account_id}/schedules | Get Schedules
*SchedulesApi* | [**schedulesUpdate**](docs/Api/SchedulesApi.md#schedulesupdate) | **PATCH** /ad_accounts/{ad_account_id}/schedules | Update schedules
*SearchApi* | [**searchPartnerPins**](docs/Api/SearchApi.md#searchpartnerpins) | **GET** /search/partner/pins | Search pins by a given search term
*SearchApi* | [**searchUserBoardsGet**](docs/Api/SearchApi.md#searchuserboardsget) | **GET** /search/boards | Search user&#39;s boards
*SearchApi* | [**searchUserPinsList**](docs/Api/SearchApi.md#searchuserpinslist) | **GET** /search/pins | Search user&#39;s Pins
*TargetingTemplateApi* | [**targetingTemplateCreate**](docs/Api/TargetingTemplateApi.md#targetingtemplatecreate) | **POST** /ad_accounts/{ad_account_id}/targeting_templates | Create targeting templates
*TargetingTemplateApi* | [**targetingTemplateList**](docs/Api/TargetingTemplateApi.md#targetingtemplatelist) | **GET** /ad_accounts/{ad_account_id}/targeting_templates | List targeting templates
*TargetingTemplateApi* | [**targetingTemplateUpdate**](docs/Api/TargetingTemplateApi.md#targetingtemplateupdate) | **PATCH** /ad_accounts/{ad_account_id}/targeting_templates | Update targeting templates
*TermsApi* | [**termsRelatedList**](docs/Api/TermsApi.md#termsrelatedlist) | **GET** /terms/related | List related terms
*TermsApi* | [**termsSuggestedList**](docs/Api/TermsApi.md#termssuggestedlist) | **GET** /terms/suggested | List suggested terms
*TermsOfServiceApi* | [**termsOfServiceGet**](docs/Api/TermsOfServiceApi.md#termsofserviceget) | **GET** /ad_accounts/{ad_account_id}/terms_of_service | Get terms of service
*TrendsApi* | [**trendsEditorialArticlesList**](docs/Api/TrendsApi.md#trendseditorialarticleslist) | **GET** /trends/editorial_articles | Returns editorial articles for a given region
*TrendsApi* | [**trendsFeaturedTopicsList**](docs/Api/TrendsApi.md#trendsfeaturedtopicslist) | **GET** /trends/topics/featured | Get featured topics
*TrendsApi* | [**trendsProductCategoriesDetailsList**](docs/Api/TrendsApi.md#trendsproductcategoriesdetailslist) | **GET** /trends/product_categories/details | Get product category details
*TrendsApi* | [**trendsProductCategoriesTrendingList**](docs/Api/TrendsApi.md#trendsproductcategoriestrendinglist) | **GET** /trends/product_categories/trending | Get a list of growing Shopping Product Categories
*UserAccountApi* | [**boardsUserFollowsList**](docs/Api/UserAccountApi.md#boardsuserfollowslist) | **GET** /user_account/following/boards | List following boards
*UserAccountApi* | [**followUserUpdate**](docs/Api/UserAccountApi.md#followuserupdate) | **POST** /user_account/following/{username} | Follow user
*UserAccountApi* | [**followersList**](docs/Api/UserAccountApi.md#followerslist) | **GET** /user_account/followers | List followers
*UserAccountApi* | [**linkedBusinessAccountsGet**](docs/Api/UserAccountApi.md#linkedbusinessaccountsget) | **GET** /user_account/businesses | List linked businesses
*UserAccountApi* | [**unverifyWebsiteDelete**](docs/Api/UserAccountApi.md#unverifywebsitedelete) | **DELETE** /user_account/websites | Unverify website
*UserAccountApi* | [**userAccountAnalytics**](docs/Api/UserAccountApi.md#useraccountanalytics) | **GET** /user_account/analytics | Get user account analytics
*UserAccountApi* | [**userAccountAnalyticsTopPins**](docs/Api/UserAccountApi.md#useraccountanalyticstoppins) | **GET** /user_account/analytics/top_pins | Get user account top pins analytics
*UserAccountApi* | [**userAccountAnalyticsTopVideoPins**](docs/Api/UserAccountApi.md#useraccountanalyticstopvideopins) | **GET** /user_account/analytics/top_video_pins | Get user account top video pins analytics
*UserAccountApi* | [**userAccountFollowedInterests**](docs/Api/UserAccountApi.md#useraccountfollowedinterests) | **GET** /users/{username}/interests/follow | List following interests
*UserAccountApi* | [**userAccountGet**](docs/Api/UserAccountApi.md#useraccountget) | **GET** /user_account | Get user account
*UserAccountApi* | [**userFollowingGet**](docs/Api/UserAccountApi.md#userfollowingget) | **GET** /user_account/following | List following
*UserAccountApi* | [**userWebsitesGet**](docs/Api/UserAccountApi.md#userwebsitesget) | **GET** /user_account/websites | Get user websites
*UserAccountApi* | [**verifyWebsiteUpdate**](docs/Api/UserAccountApi.md#verifywebsiteupdate) | **POST** /user_account/websites | Verify website
*UserAccountApi* | [**websiteVerificationGet**](docs/Api/UserAccountApi.md#websiteverificationget) | **GET** /user_account/websites/verification | Get user verification code for website claiming

## Models

- [Account](docs/Model/Account.md)
- [AccountTemplate](docs/Model/AccountTemplate.md)
- [ActionType](docs/Model/ActionType.md)
- [Ad](docs/Model/Ad.md)
- [AdAccount](docs/Model/AdAccount.md)
- [AdAccountAnalyticsItems](docs/Model/AdAccountAnalyticsItems.md)
- [AdAccountCountriesGet200Response](docs/Model/AdAccountCountriesGet200Response.md)
- [AdAccountCreate](docs/Model/AdAccountCreate.md)
- [AdAccountEntityType](docs/Model/AdAccountEntityType.md)
- [AdAccountOwner](docs/Model/AdAccountOwner.md)
- [AdAccountToAdAccountSharedAudience](docs/Model/AdAccountToAdAccountSharedAudience.md)
- [AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody](docs/Model/AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody.md)
- [AdAccountToBusinessSharedAudience](docs/Model/AdAccountToBusinessSharedAudience.md)
- [AdAccountToBusinessSharedAudienceUpdateWithRequiredBody](docs/Model/AdAccountToBusinessSharedAudienceUpdateWithRequiredBody.md)
- [AdAccountsAudience](docs/Model/AdAccountsAudience.md)
- [AdAccountsAudienceCreate](docs/Model/AdAccountsAudienceCreate.md)
- [AdAccountsAudienceRule](docs/Model/AdAccountsAudienceRule.md)
- [AdAccountsAudienceUpdate](docs/Model/AdAccountsAudienceUpdate.md)
- [AdAccountsAudiencesSharedAccountsList200Response](docs/Model/AdAccountsAudiencesSharedAccountsList200Response.md)
- [AdAccountsCountry](docs/Model/AdAccountsCountry.md)
- [AdAccountsList200Response](docs/Model/AdAccountsList200Response.md)
- [AdAccountsSubscriptionsGetList200Response](docs/Model/AdAccountsSubscriptionsGetList200Response.md)
- [AdAdsAnalyticsAsyncTargetingTypes](docs/Model/AdAdsAnalyticsAsyncTargetingTypes.md)
- [AdBatchItem](docs/Model/AdBatchItem.md)
- [AdBatchUpdate](docs/Model/AdBatchUpdate.md)
- [AdBatchWriteResponseModel](docs/Model/AdBatchWriteResponseModel.md)
- [AdCollectionsHeaderType](docs/Model/AdCollectionsHeaderType.md)
- [AdCreate](docs/Model/AdCreate.md)
- [AdCreateRequest](docs/Model/AdCreateRequest.md)
- [AdDisapprovalReasons](docs/Model/AdDisapprovalReasons.md)
- [AdGroup](docs/Model/AdGroup.md)
- [AdGroupAudienceSizing](docs/Model/AdGroupAudienceSizing.md)
- [AdGroupAudienceSizingCreate](docs/Model/AdGroupAudienceSizingCreate.md)
- [AdGroupAudienceSizingCreativeTypes](docs/Model/AdGroupAudienceSizingCreativeTypes.md)
- [AdGroupAudienceSizingKeyword](docs/Model/AdGroupAudienceSizingKeyword.md)
- [AdGroupBase](docs/Model/AdGroupBase.md)
- [AdGroupCreate](docs/Model/AdGroupCreate.md)
- [AdGroupCreateCreate](docs/Model/AdGroupCreateCreate.md)
- [AdGroupCreateRequest](docs/Model/AdGroupCreateRequest.md)
- [AdGroupCreateRequestAllOf1](docs/Model/AdGroupCreateRequestAllOf1.md)
- [AdGroupDeliveryEstimates](docs/Model/AdGroupDeliveryEstimates.md)
- [AdGroupDeliveryEstimatesKeywordsItems](docs/Model/AdGroupDeliveryEstimatesKeywordsItems.md)
- [AdGroupSummaryStatus](docs/Model/AdGroupSummaryStatus.md)
- [AdGroupTrackingURLs](docs/Model/AdGroupTrackingURLs.md)
- [AdGroupUpdate](docs/Model/AdGroupUpdate.md)
- [AdGroupUpdateBatchUpdate](docs/Model/AdGroupUpdateBatchUpdate.md)
- [AdGroupUpdateRequest](docs/Model/AdGroupUpdateRequest.md)
- [AdGroupUpdateRequestAllOf1](docs/Model/AdGroupUpdateRequestAllOf1.md)
- [AdGroupsAnalyticsMetrics](docs/Model/AdGroupsAnalyticsMetrics.md)
- [AdGroupsCreate200Response](docs/Model/AdGroupsCreate200Response.md)
- [AdGroupsCreate200ResponseItemsInner](docs/Model/AdGroupsCreate200ResponseItemsInner.md)
- [AdGroupsList200Response](docs/Model/AdGroupsList200Response.md)
- [AdPinAnalytics](docs/Model/AdPinAnalytics.md)
- [AdPinPreviewCreativeType](docs/Model/AdPinPreviewCreativeType.md)
- [AdPreviewRequest](docs/Model/AdPreviewRequest.md)
- [AdPreviewShopping](docs/Model/AdPreviewShopping.md)
- [AdPreviewSourceImage](docs/Model/AdPreviewSourceImage.md)
- [AdPreviewSourcePinId](docs/Model/AdPreviewSourcePinId.md)
- [AdPreviewURLResponse](docs/Model/AdPreviewURLResponse.md)
- [AdReviewStatus](docs/Model/AdReviewStatus.md)
- [AdShoppingPreviewCreativeType](docs/Model/AdShoppingPreviewCreativeType.md)
- [AdUpdateRequest](docs/Model/AdUpdateRequest.md)
- [AdUpdateRequestAllOf1](docs/Model/AdUpdateRequestAllOf1.md)
- [AdeColumnType](docs/Model/AdeColumnType.md)
- [AdgroupPlacementGroupType](docs/Model/AdgroupPlacementGroupType.md)
- [AdgroupTrackingFeatureType](docs/Model/AdgroupTrackingFeatureType.md)
- [AdgroupTrackingFeatures](docs/Model/AdgroupTrackingFeatures.md)
- [AdsAnalytics](docs/Model/AdsAnalytics.md)
- [AdsAnalyticsAccountTargetingType](docs/Model/AdsAnalyticsAccountTargetingType.md)
- [AdsAnalyticsAdGroupTargetingType](docs/Model/AdsAnalyticsAdGroupTargetingType.md)
- [AdsAnalyticsAdTargetingType](docs/Model/AdsAnalyticsAdTargetingType.md)
- [AdsAnalyticsCampaignTargetingType](docs/Model/AdsAnalyticsCampaignTargetingType.md)
- [AdsAnalyticsCreateAsyncRequest](docs/Model/AdsAnalyticsCreateAsyncRequest.md)
- [AdsAnalyticsCreateAsyncResponse](docs/Model/AdsAnalyticsCreateAsyncResponse.md)
- [AdsAnalyticsFilterColumn](docs/Model/AdsAnalyticsFilterColumn.md)
- [AdsAnalyticsFilterOperator](docs/Model/AdsAnalyticsFilterOperator.md)
- [AdsAnalyticsGetAsyncResponse](docs/Model/AdsAnalyticsGetAsyncResponse.md)
- [AdsAnalyticsMetricsFilter](docs/Model/AdsAnalyticsMetricsFilter.md)
- [AdsCreditDiscountType](docs/Model/AdsCreditDiscountType.md)
- [AdsCreditDiscountsResponse](docs/Model/AdsCreditDiscountsResponse.md)
- [AdsCreditRedeem](docs/Model/AdsCreditRedeem.md)
- [AdsCreditRedeemCreate](docs/Model/AdsCreditRedeemCreate.md)
- [AdsCreditsDiscountsGet200Response](docs/Model/AdsCreditsDiscountsGet200Response.md)
- [AdsList200Response](docs/Model/AdsList200Response.md)
- [AdvancedAuctionBidOptions](docs/Model/AdvancedAuctionBidOptions.md)
- [AdvancedAuctionItem](docs/Model/AdvancedAuctionItem.md)
- [AdvancedAuctionItems](docs/Model/AdvancedAuctionItems.md)
- [AdvancedAuctionItemsGetRequest](docs/Model/AdvancedAuctionItemsGetRequest.md)
- [AdvancedAuctionItemsSubmitDeleteRecord](docs/Model/AdvancedAuctionItemsSubmitDeleteRecord.md)
- [AdvancedAuctionItemsSubmitRecord](docs/Model/AdvancedAuctionItemsSubmitRecord.md)
- [AdvancedAuctionItemsSubmitRequest](docs/Model/AdvancedAuctionItemsSubmitRequest.md)
- [AdvancedAuctionItemsSubmitUpsertRecord](docs/Model/AdvancedAuctionItemsSubmitUpsertRecord.md)
- [AdvancedAuctionKey](docs/Model/AdvancedAuctionKey.md)
- [AdvancedAuctionOperationError](docs/Model/AdvancedAuctionOperationError.md)
- [AdvancedAuctionProcessedItems](docs/Model/AdvancedAuctionProcessedItems.md)
- [AdvertiserDefinedEvent](docs/Model/AdvertiserDefinedEvent.md)
- [AdvertiserDefinedEventInput](docs/Model/AdvertiserDefinedEventInput.md)
- [AdvertiserDefinedEventMappingType](docs/Model/AdvertiserDefinedEventMappingType.md)
- [AdvertiserDefinedEventProcessingRecord](docs/Model/AdvertiserDefinedEventProcessingRecord.md)
- [AdvertiserDefinedEventsCreate200Response](docs/Model/AdvertiserDefinedEventsCreate200Response.md)
- [AdvertiserDefinedEventsCreateRequest](docs/Model/AdvertiserDefinedEventsCreateRequest.md)
- [AdvertiserDefinedEventsGet200Response](docs/Model/AdvertiserDefinedEventsGet200Response.md)
- [AgeBucketMultipliers](docs/Model/AgeBucketMultipliers.md)
- [AgeTrendsBucket](docs/Model/AgeTrendsBucket.md)
- [AggregatedPinComment](docs/Model/AggregatedPinComment.md)
- [AiDisclosureItem](docs/Model/AiDisclosureItem.md)
- [AiDisclosures](docs/Model/AiDisclosures.md)
- [AiDisclosuresUpdate](docs/Model/AiDisclosuresUpdate.md)
- [AmazonConnectRequest](docs/Model/AmazonConnectRequest.md)
- [AmazonConnectResponse](docs/Model/AmazonConnectResponse.md)
- [AnalyticsDailyMetrics](docs/Model/AnalyticsDailyMetrics.md)
- [AnalyticsMetricsResponse](docs/Model/AnalyticsMetricsResponse.md)
- [AppTypeMultipliers](docs/Model/AppTypeMultipliers.md)
- [AppsflyerAudience](docs/Model/AppsflyerAudience.md)
- [AppsflyerAudienceCreate](docs/Model/AppsflyerAudienceCreate.md)
- [AppsflyerAudienceSyncCreate](docs/Model/AppsflyerAudienceSyncCreate.md)
- [AppsflyerPlatform](docs/Model/AppsflyerPlatform.md)
- [AssetAccessRequestError](docs/Model/AssetAccessRequestError.md)
- [AssetGroupBinding](docs/Model/AssetGroupBinding.md)
- [AssetGroupDeleteError](docs/Model/AssetGroupDeleteError.md)
- [AssetGroupDeletion](docs/Model/AssetGroupDeletion.md)
- [AssetGroupDeletionDelete](docs/Model/AssetGroupDeletionDelete.md)
- [AssetGroupInput](docs/Model/AssetGroupInput.md)
- [AssetGroupInputCreate](docs/Model/AssetGroupInputCreate.md)
- [AssetGroupModification](docs/Model/AssetGroupModification.md)
- [AssetGroupModificationReadOrUpdate](docs/Model/AssetGroupModificationReadOrUpdate.md)
- [AssetGroupType](docs/Model/AssetGroupType.md)
- [AssetGroupUpdateError](docs/Model/AssetGroupUpdateError.md)
- [AssetGroupUpdateItemReadOrUpdateItem](docs/Model/AssetGroupUpdateItemReadOrUpdateItem.md)
- [AssetIdPermissions](docs/Model/AssetIdPermissions.md)
- [AssetIdWithPermissions](docs/Model/AssetIdWithPermissions.md)
- [AssetPermissionType](docs/Model/AssetPermissionType.md)
- [AssetSearchBy](docs/Model/AssetSearchBy.md)
- [AssetSortBy](docs/Model/AssetSortBy.md)
- [AssetTypeResponse](docs/Model/AssetTypeResponse.md)
- [AttributionActionType](docs/Model/AttributionActionType.md)
- [AttributionMatchType](docs/Model/AttributionMatchType.md)
- [AttributionModel](docs/Model/AttributionModel.md)
- [AttributionScope](docs/Model/AttributionScope.md)
- [AttributionWindows](docs/Model/AttributionWindows.md)
- [Audience](docs/Model/Audience.md)
- [AudienceAccountType](docs/Model/AudienceAccountType.md)
- [AudienceCategory](docs/Model/AudienceCategory.md)
- [AudienceDefinition](docs/Model/AudienceDefinition.md)
- [AudienceDemographicValue](docs/Model/AudienceDemographicValue.md)
- [AudienceDemographics](docs/Model/AudienceDemographics.md)
- [AudienceInsightType](docs/Model/AudienceInsightType.md)
- [AudienceInsights](docs/Model/AudienceInsights.md)
- [AudienceInsightsScopeAndTypeGet200Response](docs/Model/AudienceInsightsScopeAndTypeGet200Response.md)
- [AudienceObjectiveType](docs/Model/AudienceObjectiveType.md)
- [AudienceOwnershipType](docs/Model/AudienceOwnershipType.md)
- [AudienceRule](docs/Model/AudienceRule.md)
- [AudienceStatus](docs/Model/AudienceStatus.md)
- [AudienceSubcategory](docs/Model/AudienceSubcategory.md)
- [AudienceType](docs/Model/AudienceType.md)
- [AudienceUpdateOperationType](docs/Model/AudienceUpdateOperationType.md)
- [AudiencesList200Response](docs/Model/AudiencesList200Response.md)
- [AuthRespondInviteAction](docs/Model/AuthRespondInviteAction.md)
- [AuthRespondInvitesBody](docs/Model/AuthRespondInvitesBody.md)
- [AuthRespondInvitesBodyItem](docs/Model/AuthRespondInvitesBodyItem.md)
- [AvailabilityFilter](docs/Model/AvailabilityFilter.md)
- [BaseBusinessAssets](docs/Model/BaseBusinessAssets.md)
- [BaseInviteDataResponse](docs/Model/BaseInviteDataResponse.md)
- [BasePreferredMediaType](docs/Model/BasePreferredMediaType.md)
- [BatchOperationStatus](docs/Model/BatchOperationStatus.md)
- [BidFloor](docs/Model/BidFloor.md)
- [BidFloorCreate](docs/Model/BidFloorCreate.md)
- [BidFloorObjectiveType](docs/Model/BidFloorObjectiveType.md)
- [BidFloorSpec](docs/Model/BidFloorSpec.md)
- [BidOptionsAgeBucketMultipliers](docs/Model/BidOptionsAgeBucketMultipliers.md)
- [BidOptionsAppTypeMultipliers](docs/Model/BidOptionsAppTypeMultipliers.md)
- [BidOptionsAudienceMultipliers](docs/Model/BidOptionsAudienceMultipliers.md)
- [BidOptionsGenderMultipliers](docs/Model/BidOptionsGenderMultipliers.md)
- [BidOptionsPlacementMultipliers](docs/Model/BidOptionsPlacementMultipliers.md)
- [BidStrategyType](docs/Model/BidStrategyType.md)
- [BillingInvoice](docs/Model/BillingInvoice.md)
- [BillingInvoiceDocumentType](docs/Model/BillingInvoiceDocumentType.md)
- [BillingInvoiceDownloadResponse](docs/Model/BillingInvoiceDownloadResponse.md)
- [BillingInvoiceSortField](docs/Model/BillingInvoiceSortField.md)
- [BillingInvoiceStatus](docs/Model/BillingInvoiceStatus.md)
- [BillingInvoicesGet200Response](docs/Model/BillingInvoicesGet200Response.md)
- [BillingProfileCardType](docs/Model/BillingProfileCardType.md)
- [BillingProfilePaymentMethodBrand](docs/Model/BillingProfilePaymentMethodBrand.md)
- [BillingProfileStatus](docs/Model/BillingProfileStatus.md)
- [BillingProfilesGet200Response](docs/Model/BillingProfilesGet200Response.md)
- [BillingProfilesResponse](docs/Model/BillingProfilesResponse.md)
- [BillingType](docs/Model/BillingType.md)
- [Board](docs/Model/Board.md)
- [BoardBase](docs/Model/BoardBase.md)
- [BoardCreate](docs/Model/BoardCreate.md)
- [BoardMedia](docs/Model/BoardMedia.md)
- [BoardOwner](docs/Model/BoardOwner.md)
- [BoardPrivacy](docs/Model/BoardPrivacy.md)
- [BoardPrivacyFilter](docs/Model/BoardPrivacyFilter.md)
- [BoardSection](docs/Model/BoardSection.md)
- [BoardSectionCreate](docs/Model/BoardSectionCreate.md)
- [BoardSectionUpdateWithRequiredBody](docs/Model/BoardSectionUpdateWithRequiredBody.md)
- [BoardSectionsList200Response](docs/Model/BoardSectionsList200Response.md)
- [BoardUpdatePrivacy](docs/Model/BoardUpdatePrivacy.md)
- [BoardWithUpdatePrivacy](docs/Model/BoardWithUpdatePrivacy.md)
- [BoardWithUpdatePrivacyUpdate](docs/Model/BoardWithUpdatePrivacyUpdate.md)
- [BoardsList200Response](docs/Model/BoardsList200Response.md)
- [BoardsListPins200Response](docs/Model/BoardsListPins200Response.md)
- [BookClosed](docs/Model/BookClosed.md)
- [BrandAccount](docs/Model/BrandAccount.md)
- [BrandAccountCreate](docs/Model/BrandAccountCreate.md)
- [BrandAccountProfileImage](docs/Model/BrandAccountProfileImage.md)
- [BrandAccountProfileImageUpdate](docs/Model/BrandAccountProfileImageUpdate.md)
- [BrandAccountUpdate](docs/Model/BrandAccountUpdate.md)
- [BrandFilter](docs/Model/BrandFilter.md)
- [BudgetDurationType](docs/Model/BudgetDurationType.md)
- [BudgetType](docs/Model/BudgetType.md)
- [BulkCampaignDeliveryEstimatesItem](docs/Model/BulkCampaignDeliveryEstimatesItem.md)
- [BulkCampaignDeliveryEstimatesResponse](docs/Model/BulkCampaignDeliveryEstimatesResponse.md)
- [BulkDownload](docs/Model/BulkDownload.md)
- [BulkDownloadCampaignFilter](docs/Model/BulkDownloadCampaignFilter.md)
- [BulkDownloadCreate](docs/Model/BulkDownloadCreate.md)
- [BulkEntityType](docs/Model/BulkEntityType.md)
- [BulkJobData](docs/Model/BulkJobData.md)
- [BulkOutputFormat](docs/Model/BulkOutputFormat.md)
- [BulkReportingJobStatus](docs/Model/BulkReportingJobStatus.md)
- [BulkRequestStatus](docs/Model/BulkRequestStatus.md)
- [BulkUpsertRequest](docs/Model/BulkUpsertRequest.md)
- [BulkUpsertRequestCreate](docs/Model/BulkUpsertRequestCreate.md)
- [BulkUpsertRequestCreateCatalogProductGroupsItems](docs/Model/BulkUpsertRequestCreateCatalogProductGroupsItems.md)
- [BulkUpsertRequestUpdate](docs/Model/BulkUpsertRequestUpdate.md)
- [BulkUpsertRequestUpdateCatalogProductGroupsItems](docs/Model/BulkUpsertRequestUpdateCatalogProductGroupsItems.md)
- [BulkUpsertResponse](docs/Model/BulkUpsertResponse.md)
- [BusinessAccessRole](docs/Model/BusinessAccessRole.md)
- [BusinessAccessUserSummary](docs/Model/BusinessAccessUserSummary.md)
- [BusinessAssetMembersGet200Response](docs/Model/BusinessAssetMembersGet200Response.md)
- [BusinessAssets](docs/Model/BusinessAssets.md)
- [BusinessAssetsGet200Response](docs/Model/BusinessAssetsGet200Response.md)
- [BusinessMemberAssetsGetResponse](docs/Model/BusinessMemberAssetsGetResponse.md)
- [BusinessMemberAssetsSummary](docs/Model/BusinessMemberAssetsSummary.md)
- [BusinessMemberSortBy](docs/Model/BusinessMemberSortBy.md)
- [BusinessMembersAssetAccessDeleteBody](docs/Model/BusinessMembersAssetAccessDeleteBody.md)
- [BusinessMembershipMember](docs/Model/BusinessMembershipMember.md)
- [BusinessPartnerAssetAccessGet200Response](docs/Model/BusinessPartnerAssetAccessGet200Response.md)
- [BusinessRoleForInvite](docs/Model/BusinessRoleForInvite.md)
- [BusinessRoleForMembers](docs/Model/BusinessRoleForMembers.md)
- [BusinessSearchBy](docs/Model/BusinessSearchBy.md)
- [BusinessToAdAccountSharedAudience](docs/Model/BusinessToAdAccountSharedAudience.md)
- [BusinessToAdAccountSharedAudienceUpdateWithRequiredBody](docs/Model/BusinessToAdAccountSharedAudienceUpdateWithRequiredBody.md)
- [BusinessToBusinessSharedAudience](docs/Model/BusinessToBusinessSharedAudience.md)
- [BusinessToBusinessSharedAudienceUpdateWithRequiredBody](docs/Model/BusinessToBusinessSharedAudienceUpdateWithRequiredBody.md)
- [Campaign](docs/Model/Campaign.md)
- [CampaignAdPreview](docs/Model/CampaignAdPreview.md)
- [CampaignAdPreviewCreate](docs/Model/CampaignAdPreviewCreate.md)
- [CampaignAdPreviewCreate200ResponseInner](docs/Model/CampaignAdPreviewCreate200ResponseInner.md)
- [CampaignAdPreviewCreate200ResponseInnerData](docs/Model/CampaignAdPreviewCreate200ResponseInnerData.md)
- [CampaignAdPreviewCreate200ResponseInnerDataOneOf](docs/Model/CampaignAdPreviewCreate200ResponseInnerDataOneOf.md)
- [CampaignAdPreviewDelete200ResponseInner](docs/Model/CampaignAdPreviewDelete200ResponseInner.md)
- [CampaignAdPreviewDelete200ResponseInnerStatus](docs/Model/CampaignAdPreviewDelete200ResponseInnerStatus.md)
- [CampaignAudienceMultipliers](docs/Model/CampaignAudienceMultipliers.md)
- [CampaignBatchItem](docs/Model/CampaignBatchItem.md)
- [CampaignBatchResponseData](docs/Model/CampaignBatchResponseData.md)
- [CampaignBatchUpdateItem](docs/Model/CampaignBatchUpdateItem.md)
- [CampaignBatchWriteResponseModel](docs/Model/CampaignBatchWriteResponseModel.md)
- [CampaignBidOptions](docs/Model/CampaignBidOptions.md)
- [CampaignBidOptionsCreate](docs/Model/CampaignBidOptionsCreate.md)
- [CampaignBidOptionsUpdate](docs/Model/CampaignBidOptionsUpdate.md)
- [CampaignBidOptionsUpdateMaskItems](docs/Model/CampaignBidOptionsUpdateMaskItems.md)
- [CampaignCreateItem](docs/Model/CampaignCreateItem.md)
- [CampaignCreateRequest](docs/Model/CampaignCreateRequest.md)
- [CampaignCreateRequestAllOf1](docs/Model/CampaignCreateRequestAllOf1.md)
- [CampaignDeliveryEstimatesCampaign](docs/Model/CampaignDeliveryEstimatesCampaign.md)
- [CampaignDeliveryEstimatesDerivedMetrics](docs/Model/CampaignDeliveryEstimatesDerivedMetrics.md)
- [CampaignDeliveryEstimatesResponse](docs/Model/CampaignDeliveryEstimatesResponse.md)
- [CampaignObjectiveType](docs/Model/CampaignObjectiveType.md)
- [CampaignPlanningAdGroupAudienceSize](docs/Model/CampaignPlanningAdGroupAudienceSize.md)
- [CampaignPlanningBudgetRecommendation](docs/Model/CampaignPlanningBudgetRecommendation.md)
- [CampaignPlanningBudgetRecommendationPoint](docs/Model/CampaignPlanningBudgetRecommendationPoint.md)
- [CampaignPlanningConfidenceLevelAlert](docs/Model/CampaignPlanningConfidenceLevelAlert.md)
- [CampaignPlanningConfidenceLevelAlertReason](docs/Model/CampaignPlanningConfidenceLevelAlertReason.md)
- [CampaignPlanningConfidenceLevelAlertSeverity](docs/Model/CampaignPlanningConfidenceLevelAlertSeverity.md)
- [CampaignPlanningConversionAttribution](docs/Model/CampaignPlanningConversionAttribution.md)
- [CampaignPlanningConversionAttributionWindowDays](docs/Model/CampaignPlanningConversionAttributionWindowDays.md)
- [CampaignPlanningConversionEvent](docs/Model/CampaignPlanningConversionEvent.md)
- [CampaignPlanningConversionRate](docs/Model/CampaignPlanningConversionRate.md)
- [CampaignPlanningCurveEstimate](docs/Model/CampaignPlanningCurveEstimate.md)
- [CampaignPlanningEstimationType](docs/Model/CampaignPlanningEstimationType.md)
- [CampaignPlanningExperimentBudgetRecommendation](docs/Model/CampaignPlanningExperimentBudgetRecommendation.md)
- [CampaignPlanningPointEstimate](docs/Model/CampaignPlanningPointEstimate.md)
- [CampaignPlanningResponseError](docs/Model/CampaignPlanningResponseError.md)
- [CampaignPlanningResponseErrorCode](docs/Model/CampaignPlanningResponseErrorCode.md)
- [CampaignSummaryStatus](docs/Model/CampaignSummaryStatus.md)
- [CampaignUpdateRequest](docs/Model/CampaignUpdateRequest.md)
- [CampaignUpdateRequestAllOf2](docs/Model/CampaignUpdateRequestAllOf2.md)
- [CampaignsAnalyticsMetrics](docs/Model/CampaignsAnalyticsMetrics.md)
- [CampaignsList200Response](docs/Model/CampaignsList200Response.md)
- [CancelInviteException](docs/Model/CancelInviteException.md)
- [CancelInviteResult](docs/Model/CancelInviteResult.md)
- [CancelInviteResultItem](docs/Model/CancelInviteResultItem.md)
- [CancelInviteResultUser](docs/Model/CancelInviteResultUser.md)
- [CancelInvitesRequest](docs/Model/CancelInvitesRequest.md)
- [CancelInvitesResponse](docs/Model/CancelInvitesResponse.md)
- [CarouselSlot](docs/Model/CarouselSlot.md)
- [CartingProduct](docs/Model/CartingProduct.md)
- [CartingRetailer](docs/Model/CartingRetailer.md)
- [Catalog](docs/Model/Catalog.md)
- [CatalogBinding](docs/Model/CatalogBinding.md)
- [CatalogCreate](docs/Model/CatalogCreate.md)
- [CatalogUpdate](docs/Model/CatalogUpdate.md)
- [CatalogsAiContentDisclosure](docs/Model/CatalogsAiContentDisclosure.md)
- [CatalogsAiContentDisclosureLabel](docs/Model/CatalogsAiContentDisclosureLabel.md)
- [CatalogsAvailableFilterValues](docs/Model/CatalogsAvailableFilterValues.md)
- [CatalogsBaseFilterKeys](docs/Model/CatalogsBaseFilterKeys.md)
- [CatalogsBaseFiltersAllOf](docs/Model/CatalogsBaseFiltersAllOf.md)
- [CatalogsBaseFiltersAnyOf](docs/Model/CatalogsBaseFiltersAnyOf.md)
- [CatalogsCreateCreativeAssetsItem](docs/Model/CatalogsCreateCreativeAssetsItem.md)
- [CatalogsCreateHotelItem](docs/Model/CatalogsCreateHotelItem.md)
- [CatalogsCreateReportResponse](docs/Model/CatalogsCreateReportResponse.md)
- [CatalogsCreateRetailItem](docs/Model/CatalogsCreateRetailItem.md)
- [CatalogsCreativeAssetsAttributes](docs/Model/CatalogsCreativeAssetsAttributes.md)
- [CatalogsCreativeAssetsAvailableFilterValues](docs/Model/CatalogsCreativeAssetsAvailableFilterValues.md)
- [CatalogsCreativeAssetsBatchItem](docs/Model/CatalogsCreativeAssetsBatchItem.md)
- [CatalogsCreativeAssetsBatchRequest](docs/Model/CatalogsCreativeAssetsBatchRequest.md)
- [CatalogsCreativeAssetsFeed](docs/Model/CatalogsCreativeAssetsFeed.md)
- [CatalogsCreativeAssetsFeedsCreateRequest](docs/Model/CatalogsCreativeAssetsFeedsCreateRequest.md)
- [CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale](docs/Model/CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale.md)
- [CatalogsCreativeAssetsFeedsUpdateRequest](docs/Model/CatalogsCreativeAssetsFeedsUpdateRequest.md)
- [CatalogsCreativeAssetsFilterValuesMap](docs/Model/CatalogsCreativeAssetsFilterValuesMap.md)
- [CatalogsCreativeAssetsItemErrorResponse](docs/Model/CatalogsCreativeAssetsItemErrorResponse.md)
- [CatalogsCreativeAssetsItemResponse](docs/Model/CatalogsCreativeAssetsItemResponse.md)
- [CatalogsCreativeAssetsItemsBatch](docs/Model/CatalogsCreativeAssetsItemsBatch.md)
- [CatalogsCreativeAssetsItemsPostFilter](docs/Model/CatalogsCreativeAssetsItemsPostFilter.md)
- [CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest](docs/Model/CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest.md)
- [CatalogsCreativeAssetsProduct](docs/Model/CatalogsCreativeAssetsProduct.md)
- [CatalogsCreativeAssetsProductGroup](docs/Model/CatalogsCreativeAssetsProductGroup.md)
- [CatalogsCreativeAssetsProductGroupCreateRequest](docs/Model/CatalogsCreativeAssetsProductGroupCreateRequest.md)
- [CatalogsCreativeAssetsProductGroupFilterKeys](docs/Model/CatalogsCreativeAssetsProductGroupFilterKeys.md)
- [CatalogsCreativeAssetsProductGroupFilters](docs/Model/CatalogsCreativeAssetsProductGroupFilters.md)
- [CatalogsCreativeAssetsProductGroupFiltersAllOf](docs/Model/CatalogsCreativeAssetsProductGroupFiltersAllOf.md)
- [CatalogsCreativeAssetsProductGroupFiltersAnyOf](docs/Model/CatalogsCreativeAssetsProductGroupFiltersAnyOf.md)
- [CatalogsCreativeAssetsProductGroupProductCounts](docs/Model/CatalogsCreativeAssetsProductGroupProductCounts.md)
- [CatalogsCreativeAssetsProductGroupUpdateRequest](docs/Model/CatalogsCreativeAssetsProductGroupUpdateRequest.md)
- [CatalogsCreativeAssetsProductMetadata](docs/Model/CatalogsCreativeAssetsProductMetadata.md)
- [CatalogsDeleteCreativeAssetsItem](docs/Model/CatalogsDeleteCreativeAssetsItem.md)
- [CatalogsDeleteHotelItem](docs/Model/CatalogsDeleteHotelItem.md)
- [CatalogsDeleteRetailItem](docs/Model/CatalogsDeleteRetailItem.md)
- [CatalogsFeed](docs/Model/CatalogsFeed.md)
- [CatalogsFeedCreateRequestSchema](docs/Model/CatalogsFeedCreateRequestSchema.md)
- [CatalogsFeedCredentials](docs/Model/CatalogsFeedCredentials.md)
- [CatalogsFeedIngestion](docs/Model/CatalogsFeedIngestion.md)
- [CatalogsFeedIngestionDetails](docs/Model/CatalogsFeedIngestionDetails.md)
- [CatalogsFeedIngestionErrors](docs/Model/CatalogsFeedIngestionErrors.md)
- [CatalogsFeedIngestionInfo](docs/Model/CatalogsFeedIngestionInfo.md)
- [CatalogsFeedIngestionWarnings](docs/Model/CatalogsFeedIngestionWarnings.md)
- [CatalogsFeedProcessingResult](docs/Model/CatalogsFeedProcessingResult.md)
- [CatalogsFeedProcessingSchedule](docs/Model/CatalogsFeedProcessingSchedule.md)
- [CatalogsFeedProcessingScheduleTimezone](docs/Model/CatalogsFeedProcessingScheduleTimezone.md)
- [CatalogsFeedProcessingStatus](docs/Model/CatalogsFeedProcessingStatus.md)
- [CatalogsFeedProductCounts](docs/Model/CatalogsFeedProductCounts.md)
- [CatalogsFeedUpdateRequestSchema](docs/Model/CatalogsFeedUpdateRequestSchema.md)
- [CatalogsFeedValidationDetails](docs/Model/CatalogsFeedValidationDetails.md)
- [CatalogsFeedValidationErrors](docs/Model/CatalogsFeedValidationErrors.md)
- [CatalogsFeedValidationWarnings](docs/Model/CatalogsFeedValidationWarnings.md)
- [CatalogsFeedVideoCounts](docs/Model/CatalogsFeedVideoCounts.md)
- [CatalogsFeedsCreateRequest](docs/Model/CatalogsFeedsCreateRequest.md)
- [CatalogsFeedsUpdateRequest](docs/Model/CatalogsFeedsUpdateRequest.md)
- [CatalogsFormat](docs/Model/CatalogsFormat.md)
- [CatalogsHotelAddress](docs/Model/CatalogsHotelAddress.md)
- [CatalogsHotelAttributes](docs/Model/CatalogsHotelAttributes.md)
- [CatalogsHotelAvailableFilterValues](docs/Model/CatalogsHotelAvailableFilterValues.md)
- [CatalogsHotelBatchItem](docs/Model/CatalogsHotelBatchItem.md)
- [CatalogsHotelBatchRequest](docs/Model/CatalogsHotelBatchRequest.md)
- [CatalogsHotelFeed](docs/Model/CatalogsHotelFeed.md)
- [CatalogsHotelFeedsCreateRequest](docs/Model/CatalogsHotelFeedsCreateRequest.md)
- [CatalogsHotelFeedsUpdateRequest](docs/Model/CatalogsHotelFeedsUpdateRequest.md)
- [CatalogsHotelFilterValuesMap](docs/Model/CatalogsHotelFilterValuesMap.md)
- [CatalogsHotelGuestRatings](docs/Model/CatalogsHotelGuestRatings.md)
- [CatalogsHotelItemErrorResponse](docs/Model/CatalogsHotelItemErrorResponse.md)
- [CatalogsHotelItemResponse](docs/Model/CatalogsHotelItemResponse.md)
- [CatalogsHotelItemsBatch](docs/Model/CatalogsHotelItemsBatch.md)
- [CatalogsHotelItemsPostFilter](docs/Model/CatalogsHotelItemsPostFilter.md)
- [CatalogsHotelListProductsByCatalogBasedFilterRequest](docs/Model/CatalogsHotelListProductsByCatalogBasedFilterRequest.md)
- [CatalogsHotelMainImage](docs/Model/CatalogsHotelMainImage.md)
- [CatalogsHotelProduct](docs/Model/CatalogsHotelProduct.md)
- [CatalogsHotelProductGroup](docs/Model/CatalogsHotelProductGroup.md)
- [CatalogsHotelProductGroupCreateRequest](docs/Model/CatalogsHotelProductGroupCreateRequest.md)
- [CatalogsHotelProductGroupFilterKeys](docs/Model/CatalogsHotelProductGroupFilterKeys.md)
- [CatalogsHotelProductGroupFilters](docs/Model/CatalogsHotelProductGroupFilters.md)
- [CatalogsHotelProductGroupFiltersAllOf](docs/Model/CatalogsHotelProductGroupFiltersAllOf.md)
- [CatalogsHotelProductGroupFiltersAnyOf](docs/Model/CatalogsHotelProductGroupFiltersAnyOf.md)
- [CatalogsHotelProductGroupProductCounts](docs/Model/CatalogsHotelProductGroupProductCounts.md)
- [CatalogsHotelProductGroupType](docs/Model/CatalogsHotelProductGroupType.md)
- [CatalogsHotelProductGroupUpdateRequest](docs/Model/CatalogsHotelProductGroupUpdateRequest.md)
- [CatalogsHotelProductMetadata](docs/Model/CatalogsHotelProductMetadata.md)
- [CatalogsHotelReportParameters](docs/Model/CatalogsHotelReportParameters.md)
- [CatalogsHotelReportParametersReport](docs/Model/CatalogsHotelReportParametersReport.md)
- [CatalogsHotelReportStatsParameters](docs/Model/CatalogsHotelReportStatsParameters.md)
- [CatalogsHotelReportStatsParametersReport](docs/Model/CatalogsHotelReportStatsParametersReport.md)
- [CatalogsItemValidationDetails](docs/Model/CatalogsItemValidationDetails.md)
- [CatalogsItemValidationErrors](docs/Model/CatalogsItemValidationErrors.md)
- [CatalogsItemValidationIssue](docs/Model/CatalogsItemValidationIssue.md)
- [CatalogsItemValidationIssues](docs/Model/CatalogsItemValidationIssues.md)
- [CatalogsItemValidationWarnings](docs/Model/CatalogsItemValidationWarnings.md)
- [CatalogsItemsBatch](docs/Model/CatalogsItemsBatch.md)
- [CatalogsItemsBatchPostRequest](docs/Model/CatalogsItemsBatchPostRequest.md)
- [CatalogsItemsBatchRequest](docs/Model/CatalogsItemsBatchRequest.md)
- [CatalogsItemsCreateBatchRequest](docs/Model/CatalogsItemsCreateBatchRequest.md)
- [CatalogsItemsDeleteBatchRequest](docs/Model/CatalogsItemsDeleteBatchRequest.md)
- [CatalogsItemsDeleteDiscontinuedBatchRequest](docs/Model/CatalogsItemsDeleteDiscontinuedBatchRequest.md)
- [CatalogsItemsPostFilters](docs/Model/CatalogsItemsPostFilters.md)
- [CatalogsItemsRequest](docs/Model/CatalogsItemsRequest.md)
- [CatalogsItemsUpdateBatchRequest](docs/Model/CatalogsItemsUpdateBatchRequest.md)
- [CatalogsItemsUpsertBatchRequest](docs/Model/CatalogsItemsUpsertBatchRequest.md)
- [CatalogsList200Response](docs/Model/CatalogsList200Response.md)
- [CatalogsListProductsByFeedBasedFilter](docs/Model/CatalogsListProductsByFeedBasedFilter.md)
- [CatalogsListProductsByFilterRequest](docs/Model/CatalogsListProductsByFilterRequest.md)
- [CatalogsLocalStoresCreate200ResponseInner](docs/Model/CatalogsLocalStoresCreate200ResponseInner.md)
- [CatalogsLocalStoresCreate200ResponseInnerData](docs/Model/CatalogsLocalStoresCreate200ResponseInnerData.md)
- [CatalogsLocalStoresCreate200ResponseInnerDataOneOf](docs/Model/CatalogsLocalStoresCreate200ResponseInnerDataOneOf.md)
- [CatalogsLocalStoresDelete200ResponseInner](docs/Model/CatalogsLocalStoresDelete200ResponseInner.md)
- [CatalogsLocalStoresList200Response](docs/Model/CatalogsLocalStoresList200Response.md)
- [CatalogsLocale](docs/Model/CatalogsLocale.md)
- [CatalogsProduct](docs/Model/CatalogsProduct.md)
- [CatalogsProductGroupCreateRequest](docs/Model/CatalogsProductGroupCreateRequest.md)
- [CatalogsProductGroupCurrencyCriteria](docs/Model/CatalogsProductGroupCurrencyCriteria.md)
- [CatalogsProductGroupFilterKeys](docs/Model/CatalogsProductGroupFilterKeys.md)
- [CatalogsProductGroupFilterOperatorTypeCriteria](docs/Model/CatalogsProductGroupFilterOperatorTypeCriteria.md)
- [CatalogsProductGroupFilters](docs/Model/CatalogsProductGroupFilters.md)
- [CatalogsProductGroupFiltersAllOf](docs/Model/CatalogsProductGroupFiltersAllOf.md)
- [CatalogsProductGroupFiltersAnyOf](docs/Model/CatalogsProductGroupFiltersAnyOf.md)
- [CatalogsProductGroupFiltersRequest](docs/Model/CatalogsProductGroupFiltersRequest.md)
- [CatalogsProductGroupFiltersRequestAnyOfItems0](docs/Model/CatalogsProductGroupFiltersRequestAnyOfItems0.md)
- [CatalogsProductGroupFiltersRequestAnyOfItems1](docs/Model/CatalogsProductGroupFiltersRequestAnyOfItems1.md)
- [CatalogsProductGroupMultipleCountriesCriteria](docs/Model/CatalogsProductGroupMultipleCountriesCriteria.md)
- [CatalogsProductGroupMultipleGenderCriteria](docs/Model/CatalogsProductGroupMultipleGenderCriteria.md)
- [CatalogsProductGroupMultipleMediaTypesCriteria](docs/Model/CatalogsProductGroupMultipleMediaTypesCriteria.md)
- [CatalogsProductGroupMultiplePinterestProductCategoryCriteria](docs/Model/CatalogsProductGroupMultiplePinterestProductCategoryCriteria.md)
- [CatalogsProductGroupMultipleStringCriteria](docs/Model/CatalogsProductGroupMultipleStringCriteria.md)
- [CatalogsProductGroupMultipleStringListCriteria](docs/Model/CatalogsProductGroupMultipleStringListCriteria.md)
- [CatalogsProductGroupPinsList200Response](docs/Model/CatalogsProductGroupPinsList200Response.md)
- [CatalogsProductGroupPricingCriteria](docs/Model/CatalogsProductGroupPricingCriteria.md)
- [CatalogsProductGroupProductCountsVertical](docs/Model/CatalogsProductGroupProductCountsVertical.md)
- [CatalogsProductGroupStatus](docs/Model/CatalogsProductGroupStatus.md)
- [CatalogsProductGroupType](docs/Model/CatalogsProductGroupType.md)
- [CatalogsProductGroupUint32Criteria](docs/Model/CatalogsProductGroupUint32Criteria.md)
- [CatalogsProductGroupUpdateManyRequestItemsOneOfItems0](docs/Model/CatalogsProductGroupUpdateManyRequestItemsOneOfItems0.md)
- [CatalogsProductGroupUpdateRequest](docs/Model/CatalogsProductGroupUpdateRequest.md)
- [CatalogsProductGroupsCreateManyRequestItems](docs/Model/CatalogsProductGroupsCreateManyRequestItems.md)
- [CatalogsProductGroupsCreateRequestSchema](docs/Model/CatalogsProductGroupsCreateRequestSchema.md)
- [CatalogsProductGroupsList200Response](docs/Model/CatalogsProductGroupsList200Response.md)
- [CatalogsProductGroupsUpdateRequestSchema](docs/Model/CatalogsProductGroupsUpdateRequestSchema.md)
- [CatalogsReport](docs/Model/CatalogsReport.md)
- [CatalogsReportDistributionIssueFilter](docs/Model/CatalogsReportDistributionIssueFilter.md)
- [CatalogsReportDistributionStats](docs/Model/CatalogsReportDistributionStats.md)
- [CatalogsReportFeedIngestionFilter](docs/Model/CatalogsReportFeedIngestionFilter.md)
- [CatalogsReportFeedIngestionStats](docs/Model/CatalogsReportFeedIngestionStats.md)
- [CatalogsReportParameters](docs/Model/CatalogsReportParameters.md)
- [CatalogsReportStats](docs/Model/CatalogsReportStats.md)
- [CatalogsReportStatsParameters](docs/Model/CatalogsReportStatsParameters.md)
- [CatalogsRetailAvailableFilterValues](docs/Model/CatalogsRetailAvailableFilterValues.md)
- [CatalogsRetailBatchRequest](docs/Model/CatalogsRetailBatchRequest.md)
- [CatalogsRetailBatchRequestItemsItems](docs/Model/CatalogsRetailBatchRequestItemsItems.md)
- [CatalogsRetailFeed](docs/Model/CatalogsRetailFeed.md)
- [CatalogsRetailFeedsCreateRequest](docs/Model/CatalogsRetailFeedsCreateRequest.md)
- [CatalogsRetailFeedsUpdateRequest](docs/Model/CatalogsRetailFeedsUpdateRequest.md)
- [CatalogsRetailFilterValuesMap](docs/Model/CatalogsRetailFilterValuesMap.md)
- [CatalogsRetailItemErrorResponse](docs/Model/CatalogsRetailItemErrorResponse.md)
- [CatalogsRetailItemResponse](docs/Model/CatalogsRetailItemResponse.md)
- [CatalogsRetailItemsBatch](docs/Model/CatalogsRetailItemsBatch.md)
- [CatalogsRetailItemsPostFilter](docs/Model/CatalogsRetailItemsPostFilter.md)
- [CatalogsRetailListProductsByCatalogBasedFilterRequest](docs/Model/CatalogsRetailListProductsByCatalogBasedFilterRequest.md)
- [CatalogsRetailProduct](docs/Model/CatalogsRetailProduct.md)
- [CatalogsRetailProductGroup](docs/Model/CatalogsRetailProductGroup.md)
- [CatalogsRetailProductGroupCreateRequest](docs/Model/CatalogsRetailProductGroupCreateRequest.md)
- [CatalogsRetailProductGroupProductCounts](docs/Model/CatalogsRetailProductGroupProductCounts.md)
- [CatalogsRetailProductGroupUpdateRequest](docs/Model/CatalogsRetailProductGroupUpdateRequest.md)
- [CatalogsRetailProductMetadata](docs/Model/CatalogsRetailProductMetadata.md)
- [CatalogsRetailReportAllItemsFilter](docs/Model/CatalogsRetailReportAllItemsFilter.md)
- [CatalogsRetailReportParameters](docs/Model/CatalogsRetailReportParameters.md)
- [CatalogsRetailReportParametersReport](docs/Model/CatalogsRetailReportParametersReport.md)
- [CatalogsRetailReportStatsParameters](docs/Model/CatalogsRetailReportStatsParameters.md)
- [CatalogsRetailReportStatsParametersReport](docs/Model/CatalogsRetailReportStatsParametersReport.md)
- [CatalogsStatus](docs/Model/CatalogsStatus.md)
- [CatalogsType](docs/Model/CatalogsType.md)
- [CatalogsUpdatableCreativeAssetsAttributes](docs/Model/CatalogsUpdatableCreativeAssetsAttributes.md)
- [CatalogsUpdatableHotelAttributes](docs/Model/CatalogsUpdatableHotelAttributes.md)
- [CatalogsUpdateCreativeAssetsItem](docs/Model/CatalogsUpdateCreativeAssetsItem.md)
- [CatalogsUpdateHotelItem](docs/Model/CatalogsUpdateHotelItem.md)
- [CatalogsUpdateRetailItem](docs/Model/CatalogsUpdateRetailItem.md)
- [CatalogsUpsertCreativeAssetsItem](docs/Model/CatalogsUpsertCreativeAssetsItem.md)
- [CatalogsUpsertHotelItem](docs/Model/CatalogsUpsertHotelItem.md)
- [CatalogsUpsertRetailItem](docs/Model/CatalogsUpsertRetailItem.md)
- [CatalogsVerticalBatchRequest](docs/Model/CatalogsVerticalBatchRequest.md)
- [CatalogsVerticalFeedsCreateRequest](docs/Model/CatalogsVerticalFeedsCreateRequest.md)
- [CatalogsVerticalFeedsUpdateRequest](docs/Model/CatalogsVerticalFeedsUpdateRequest.md)
- [CatalogsVerticalProductGroup](docs/Model/CatalogsVerticalProductGroup.md)
- [CatalogsVerticalProductGroupCreateRequest](docs/Model/CatalogsVerticalProductGroupCreateRequest.md)
- [CatalogsVerticalProductGroupUpdateRequest](docs/Model/CatalogsVerticalProductGroupUpdateRequest.md)
- [CatalogsVerticalsListProductsByCatalogBasedFilterRequest](docs/Model/CatalogsVerticalsListProductsByCatalogBasedFilterRequest.md)
- [ChangeHistoryDataType](docs/Model/ChangeHistoryDataType.md)
- [ChangeHistoryOperationType](docs/Model/ChangeHistoryOperationType.md)
- [CollectionsHeaderType](docs/Model/CollectionsHeaderType.md)
- [ConditionFilter](docs/Model/ConditionFilter.md)
- [ContentType](docs/Model/ContentType.md)
- [ConversionAccessToken](docs/Model/ConversionAccessToken.md)
- [ConversionApiResponseEventsItems](docs/Model/ConversionApiResponseEventsItems.md)
- [ConversionAttributionWindowDays](docs/Model/ConversionAttributionWindowDays.md)
- [ConversionDeletionRequest](docs/Model/ConversionDeletionRequest.md)
- [ConversionDeletionRequestCreate](docs/Model/ConversionDeletionRequestCreate.md)
- [ConversionDeletionRequestEPIKTargets](docs/Model/ConversionDeletionRequestEPIKTargets.md)
- [ConversionDeletionRequestList200Response](docs/Model/ConversionDeletionRequestList200Response.md)
- [ConversionDeletionRequestStatus](docs/Model/ConversionDeletionRequestStatus.md)
- [ConversionDeletionRequestTargets](docs/Model/ConversionDeletionRequestTargets.md)
- [ConversionDeletionRequestUserEmailTargets](docs/Model/ConversionDeletionRequestUserEmailTargets.md)
- [ConversionEvent](docs/Model/ConversionEvent.md)
- [ConversionEventAppInfo](docs/Model/ConversionEventAppInfo.md)
- [ConversionEventDeviceInfo](docs/Model/ConversionEventDeviceInfo.md)
- [ConversionEventIngestionSource](docs/Model/ConversionEventIngestionSource.md)
- [ConversionEventResponse](docs/Model/ConversionEventResponse.md)
- [ConversionEvents](docs/Model/ConversionEvents.md)
- [ConversionEventsCreate](docs/Model/ConversionEventsCreate.md)
- [ConversionEventsDataItems](docs/Model/ConversionEventsDataItems.md)
- [ConversionEventsDataItemsCustomData](docs/Model/ConversionEventsDataItemsCustomData.md)
- [ConversionEventsDataItemsCustomDataContentsItems](docs/Model/ConversionEventsDataItemsCustomDataContentsItems.md)
- [ConversionEventsUserDataProperties](docs/Model/ConversionEventsUserDataProperties.md)
- [ConversionHealthSelectionItem](docs/Model/ConversionHealthSelectionItem.md)
- [ConversionLearningModeType](docs/Model/ConversionLearningModeType.md)
- [ConversionMSOTEventsCreate](docs/Model/ConversionMSOTEventsCreate.md)
- [ConversionObjectiveType](docs/Model/ConversionObjectiveType.md)
- [ConversionProductAttributionType](docs/Model/ConversionProductAttributionType.md)
- [ConversionProductReport](docs/Model/ConversionProductReport.md)
- [ConversionProductReportBreakdownType](docs/Model/ConversionProductReportBreakdownType.md)
- [ConversionProductReportCreate](docs/Model/ConversionProductReportCreate.md)
- [ConversionProductReportGranularity](docs/Model/ConversionProductReportGranularity.md)
- [ConversionProductReportLevel](docs/Model/ConversionProductReportLevel.md)
- [ConversionProductReportingColumn](docs/Model/ConversionProductReportingColumn.md)
- [ConversionReportAttributionType](docs/Model/ConversionReportAttributionType.md)
- [ConversionReportTimeType](docs/Model/ConversionReportTimeType.md)
- [ConversionTag](docs/Model/ConversionTag.md)
- [ConversionTagCommon](docs/Model/ConversionTagCommon.md)
- [ConversionTagConfigs](docs/Model/ConversionTagConfigs.md)
- [ConversionTagCreate](docs/Model/ConversionTagCreate.md)
- [ConversionTagResponse](docs/Model/ConversionTagResponse.md)
- [ConversionTagType](docs/Model/ConversionTagType.md)
- [ConversionTagTypeOptimal](docs/Model/ConversionTagTypeOptimal.md)
- [ConversionTagV3GoalMetadata](docs/Model/ConversionTagV3GoalMetadata.md)
- [ConversionTagsList200Response](docs/Model/ConversionTagsList200Response.md)
- [Country](docs/Model/Country.md)
- [CountryFilter](docs/Model/CountryFilter.md)
- [CreateAssetAccessRequestBody](docs/Model/CreateAssetAccessRequestBody.md)
- [CreateAssetAccessRequestItem](docs/Model/CreateAssetAccessRequestItem.md)
- [CreateAssetAccessRequestResponse](docs/Model/CreateAssetAccessRequestResponse.md)
- [CreateAssetInvitesRequest](docs/Model/CreateAssetInvitesRequest.md)
- [CreateAssetInvitesRequestItem](docs/Model/CreateAssetInvitesRequestItem.md)
- [CreateInvitesResultsResponseArray](docs/Model/CreateInvitesResultsResponseArray.md)
- [CreateMembershipOrPartnershipInvitesBody](docs/Model/CreateMembershipOrPartnershipInvitesBody.md)
- [CreationSource](docs/Model/CreationSource.md)
- [CreativeAssetsIdFilter](docs/Model/CreativeAssetsIdFilter.md)
- [CreativeAssetsProcessingRecord](docs/Model/CreativeAssetsProcessingRecord.md)
- [CreativeAssetsVisibilityType](docs/Model/CreativeAssetsVisibilityType.md)
- [CreativeType](docs/Model/CreativeType.md)
- [Currency](docs/Model/Currency.md)
- [CurrencyFilter](docs/Model/CurrencyFilter.md)
- [CustomConversionEventMetrics](docs/Model/CustomConversionEventMetrics.md)
- [CustomLabel0Filter](docs/Model/CustomLabel0Filter.md)
- [CustomLabel1Filter](docs/Model/CustomLabel1Filter.md)
- [CustomLabel2Filter](docs/Model/CustomLabel2Filter.md)
- [CustomLabel3Filter](docs/Model/CustomLabel3Filter.md)
- [CustomLabel4Filter](docs/Model/CustomLabel4Filter.md)
- [CustomNumber0Filter](docs/Model/CustomNumber0Filter.md)
- [CustomNumber1Filter](docs/Model/CustomNumber1Filter.md)
- [CustomNumber2Filter](docs/Model/CustomNumber2Filter.md)
- [CustomNumber3Filter](docs/Model/CustomNumber3Filter.md)
- [CustomNumber4Filter](docs/Model/CustomNumber4Filter.md)
- [CustomerList](docs/Model/CustomerList.md)
- [CustomerListCreate](docs/Model/CustomerListCreate.md)
- [CustomerListRecordRow](docs/Model/CustomerListRecordRow.md)
- [CustomerListStatus](docs/Model/CustomerListStatus.md)
- [CustomerListUpdateWithRequiredBody](docs/Model/CustomerListUpdateWithRequiredBody.md)
- [CustomerListUpload](docs/Model/CustomerListUpload.md)
- [CustomerListUploadCreateRequest](docs/Model/CustomerListUploadCreateRequest.md)
- [CustomerListUploadCreateResponse](docs/Model/CustomerListUploadCreateResponse.md)
- [CustomerListsList200Response](docs/Model/CustomerListsList200Response.md)
- [CustomerSegment](docs/Model/CustomerSegment.md)
- [CustomerSegmentCreate](docs/Model/CustomerSegmentCreate.md)
- [CustomerSegmentList200Response](docs/Model/CustomerSegmentList200Response.md)
- [CustomerSegmentUpdateRequestUpdateWithRequiredBody](docs/Model/CustomerSegmentUpdateRequestUpdateWithRequiredBody.md)
- [CustomizableCTAType](docs/Model/CustomizableCTAType.md)
- [DataOutputFormat](docs/Model/DataOutputFormat.md)
- [DataStatus](docs/Model/DataStatus.md)
- [DeleteBusinessMembership200Response](docs/Model/DeleteBusinessMembership200Response.md)
- [DeleteBusinessMembershipBody](docs/Model/DeleteBusinessMembershipBody.md)
- [DeleteBusinessMembershipMember](docs/Model/DeleteBusinessMembershipMember.md)
- [DeleteBusinessPartners](docs/Model/DeleteBusinessPartners.md)
- [DeleteBusinessPartnersDelete](docs/Model/DeleteBusinessPartnersDelete.md)
- [DeleteMemberAccessResult](docs/Model/DeleteMemberAccessResult.md)
- [DeleteMemberAccessResultsResponseArray](docs/Model/DeleteMemberAccessResultsResponseArray.md)
- [DeleteMemberAssetAccessItem](docs/Model/DeleteMemberAssetAccessItem.md)
- [DeletePartnerAssetAccessBody](docs/Model/DeletePartnerAssetAccessBody.md)
- [DeletePartnerAssetAccessItem](docs/Model/DeletePartnerAssetAccessItem.md)
- [DeletePartnerAssetAccessResult](docs/Model/DeletePartnerAssetAccessResult.md)
- [DeletePartnerAssetAccessResultsResponseArray](docs/Model/DeletePartnerAssetAccessResultsResponseArray.md)
- [DeliveryEstimateObjectiveType](docs/Model/DeliveryEstimateObjectiveType.md)
- [DeliveryMetricsGet200Response](docs/Model/DeliveryMetricsGet200Response.md)
- [DeliveryMetricsResponseItemsItems](docs/Model/DeliveryMetricsResponseItemsItems.md)
- [DetailedError](docs/Model/DetailedError.md)
- [DisclosureType](docs/Model/DisclosureType.md)
- [DiscountStatus](docs/Model/DiscountStatus.md)
- [DynamicTitlesDownloadCSV](docs/Model/DynamicTitlesDownloadCSV.md)
- [DynamicTitlesGetStatus](docs/Model/DynamicTitlesGetStatus.md)
- [DynamicTitlesProcessCSV](docs/Model/DynamicTitlesProcessCSV.md)
- [DynamicTitlesProcessCSVCreate](docs/Model/DynamicTitlesProcessCSVCreate.md)
- [DynamicTitlesProcessCSVError](docs/Model/DynamicTitlesProcessCSVError.md)
- [DynamicTitlesUploadURL](docs/Model/DynamicTitlesUploadURL.md)
- [EnhancedMatchStatusType](docs/Model/EnhancedMatchStatusType.md)
- [EntityDataChangeHistory](docs/Model/EntityDataChangeHistory.md)
- [EntityHistory](docs/Model/EntityHistory.md)
- [EntityLabel](docs/Model/EntityLabel.md)
- [EntityLabelError](docs/Model/EntityLabelError.md)
- [EntityLabelStatus](docs/Model/EntityLabelStatus.md)
- [EntityStatus](docs/Model/EntityStatus.md)
- [ErrorDetail](docs/Model/ErrorDetail.md)
- [EventData](docs/Model/EventData.md)
- [EventProcessingStatus](docs/Model/EventProcessingStatus.md)
- [EventQualityScore](docs/Model/EventQualityScore.md)
- [Exception](docs/Model/Exception.md)
- [FeaturedTrend](docs/Model/FeaturedTrend.md)
- [FeedProcessingResultsList200Response](docs/Model/FeedProcessingResultsList200Response.md)
- [FeedsList200Response](docs/Model/FeedsList200Response.md)
- [FilterOperatorType](docs/Model/FilterOperatorType.md)
- [FollowUser](docs/Model/FollowUser.md)
- [FollowUserCreate](docs/Model/FollowUserCreate.md)
- [FollowersList200Response](docs/Model/FollowersList200Response.md)
- [FormFactor](docs/Model/FormFactor.md)
- [FreqBidMultiplierTimeWindow](docs/Model/FreqBidMultiplierTimeWindow.md)
- [FrequencyGoalMetadata](docs/Model/FrequencyGoalMetadata.md)
- [FrequencyGoalMetadataTimerange](docs/Model/FrequencyGoalMetadataTimerange.md)
- [FrequencyMultipliers](docs/Model/FrequencyMultipliers.md)
- [Gender](docs/Model/Gender.md)
- [GenderBucket](docs/Model/GenderBucket.md)
- [GenderDemographics](docs/Model/GenderDemographics.md)
- [GenderFilter](docs/Model/GenderFilter.md)
- [GenderMultipliers](docs/Model/GenderMultipliers.md)
- [GetBusinessEmployers200Response](docs/Model/GetBusinessEmployers200Response.md)
- [GetInvites200Response](docs/Model/GetInvites200Response.md)
- [GoogleProductCategory0Filter](docs/Model/GoogleProductCategory0Filter.md)
- [GoogleProductCategory1Filter](docs/Model/GoogleProductCategory1Filter.md)
- [GoogleProductCategory2Filter](docs/Model/GoogleProductCategory2Filter.md)
- [GoogleProductCategory3Filter](docs/Model/GoogleProductCategory3Filter.md)
- [GoogleProductCategory4Filter](docs/Model/GoogleProductCategory4Filter.md)
- [GoogleProductCategory5Filter](docs/Model/GoogleProductCategory5Filter.md)
- [GoogleProductCategory6Filter](docs/Model/GoogleProductCategory6Filter.md)
- [Granularity](docs/Model/Granularity.md)
- [GridClickType](docs/Model/GridClickType.md)
- [HotelIdFilter](docs/Model/HotelIdFilter.md)
- [HotelProcessingRecord](docs/Model/HotelProcessingRecord.md)
- [HttpMethod](docs/Model/HttpMethod.md)
- [ImageDetails](docs/Model/ImageDetails.md)
- [ImageMetadata](docs/Model/ImageMetadata.md)
- [ImageSize](docs/Model/ImageSize.md)
- [IneligibleProductTagErrorItem](docs/Model/IneligibleProductTagErrorItem.md)
- [IneligibleProductTagReason](docs/Model/IneligibleProductTagReason.md)
- [IneligibleProductTagsErrorDetails](docs/Model/IneligibleProductTagsErrorDetails.md)
- [IngestionSource](docs/Model/IngestionSource.md)
- [IngestionSourceOptions](docs/Model/IngestionSourceOptions.md)
- [InnerProductCategoriesMetricsHighlights](docs/Model/InnerProductCategoriesMetricsHighlights.md)
- [IntegrationLog](docs/Model/IntegrationLog.md)
- [IntegrationLogClientError](docs/Model/IntegrationLogClientError.md)
- [IntegrationLogClientRequest](docs/Model/IntegrationLogClientRequest.md)
- [IntegrationLogEventType](docs/Model/IntegrationLogEventType.md)
- [IntegrationLogLevel](docs/Model/IntegrationLogLevel.md)
- [IntegrationLogsInvalidLogResponse](docs/Model/IntegrationLogsInvalidLogResponse.md)
- [IntegrationLogsInvalidLogResponseRejectedLogsItems](docs/Model/IntegrationLogsInvalidLogResponseRejectedLogsItems.md)
- [IntegrationLogsRequestCreate](docs/Model/IntegrationLogsRequestCreate.md)
- [IntegrationLogsSuccessResponse](docs/Model/IntegrationLogsSuccessResponse.md)
- [IntegrationMetadata](docs/Model/IntegrationMetadata.md)
- [IntegrationMetadataCreate](docs/Model/IntegrationMetadataCreate.md)
- [IntegrationMetadataUpdate](docs/Model/IntegrationMetadataUpdate.md)
- [IntegrationRecord](docs/Model/IntegrationRecord.md)
- [IntegrationsGetList200Response](docs/Model/IntegrationsGetList200Response.md)
- [IntendedPromotionType](docs/Model/IntendedPromotionType.md)
- [Interest](docs/Model/Interest.md)
- [InterestsEnum](docs/Model/InterestsEnum.md)
- [InviteActionResultItem](docs/Model/InviteActionResultItem.md)
- [InviteAssetsSummary](docs/Model/InviteAssetsSummary.md)
- [InviteAssetsSummaryItem](docs/Model/InviteAssetsSummaryItem.md)
- [InviteBusinessRoleBinding](docs/Model/InviteBusinessRoleBinding.md)
- [InviteDataResponse](docs/Model/InviteDataResponse.md)
- [InviteExceptionResponse](docs/Model/InviteExceptionResponse.md)
- [InviteFilterStatus](docs/Model/InviteFilterStatus.md)
- [InviteResponse](docs/Model/InviteResponse.md)
- [InviteStatus](docs/Model/InviteStatus.md)
- [InviteType](docs/Model/InviteType.md)
- [ItemAttributes](docs/Model/ItemAttributes.md)
- [ItemAttributesRequest](docs/Model/ItemAttributesRequest.md)
- [ItemAttributesRequestImageLink](docs/Model/ItemAttributesRequestImageLink.md)
- [ItemAvailability](docs/Model/ItemAvailability.md)
- [ItemCreateBatchRecord](docs/Model/ItemCreateBatchRecord.md)
- [ItemDeleteBatchRecord](docs/Model/ItemDeleteBatchRecord.md)
- [ItemDeleteDiscontinuedBatchRecord](docs/Model/ItemDeleteDiscontinuedBatchRecord.md)
- [ItemGroupIdFilter](docs/Model/ItemGroupIdFilter.md)
- [ItemIdFilter](docs/Model/ItemIdFilter.md)
- [ItemIdStoreCodePair](docs/Model/ItemIdStoreCodePair.md)
- [ItemProcessingRecord](docs/Model/ItemProcessingRecord.md)
- [ItemProcessingStatus](docs/Model/ItemProcessingStatus.md)
- [ItemResponse](docs/Model/ItemResponse.md)
- [ItemUpdateBatchRecord](docs/Model/ItemUpdateBatchRecord.md)
- [ItemUpsertBatchRecord](docs/Model/ItemUpsertBatchRecord.md)
- [ItemValidationEvent](docs/Model/ItemValidationEvent.md)
- [ItemsIssuesList200Response](docs/Model/ItemsIssuesList200Response.md)
- [ItemsPost200Response](docs/Model/ItemsPost200Response.md)
- [Keyword](docs/Model/Keyword.md)
- [KeywordCreateItem](docs/Model/KeywordCreateItem.md)
- [KeywordError](docs/Model/KeywordError.md)
- [KeywordInfo](docs/Model/KeywordInfo.md)
- [KeywordMetrics](docs/Model/KeywordMetrics.md)
- [KeywordMetricsResponse](docs/Model/KeywordMetricsResponse.md)
- [KeywordUpdateGenerated](docs/Model/KeywordUpdateGenerated.md)
- [KeywordUpdateItem](docs/Model/KeywordUpdateItem.md)
- [Keywords](docs/Model/Keywords.md)
- [KeywordsCommon](docs/Model/KeywordsCommon.md)
- [KeywordsCreate](docs/Model/KeywordsCreate.md)
- [KeywordsGet200Response](docs/Model/KeywordsGet200Response.md)
- [KeywordsMetricsArrayResponse](docs/Model/KeywordsMetricsArrayResponse.md)
- [KeywordsRequest](docs/Model/KeywordsRequest.md)
- [KeywordsUpdate](docs/Model/KeywordsUpdate.md)
- [Label](docs/Model/Label.md)
- [LabelBulkCreateRequest](docs/Model/LabelBulkCreateRequest.md)
- [LabelBulkUpdateRequest](docs/Model/LabelBulkUpdateRequest.md)
- [LabelCreateItem](docs/Model/LabelCreateItem.md)
- [LabelCreateRequest](docs/Model/LabelCreateRequest.md)
- [LabelError](docs/Model/LabelError.md)
- [LabelErrorData](docs/Model/LabelErrorData.md)
- [LabelParentType](docs/Model/LabelParentType.md)
- [LabelStatus](docs/Model/LabelStatus.md)
- [LabelStatusBulkUpdate](docs/Model/LabelStatusBulkUpdate.md)
- [LabelType](docs/Model/LabelType.md)
- [LabelUpdateItem](docs/Model/LabelUpdateItem.md)
- [LabelUpdateRequest](docs/Model/LabelUpdateRequest.md)
- [LabeledEntities](docs/Model/LabeledEntities.md)
- [LabeledEntitiesCreate](docs/Model/LabeledEntitiesCreate.md)
- [LabelsList200Response](docs/Model/LabelsList200Response.md)
- [LabelsResponse](docs/Model/LabelsResponse.md)
- [Language](docs/Model/Language.md)
- [LeadForm](docs/Model/LeadForm.md)
- [LeadFormBatchUpdate](docs/Model/LeadFormBatchUpdate.md)
- [LeadFormCreate](docs/Model/LeadFormCreate.md)
- [LeadFormPolicyLink](docs/Model/LeadFormPolicyLink.md)
- [LeadFormQuestion](docs/Model/LeadFormQuestion.md)
- [LeadFormQuestionFieldType](docs/Model/LeadFormQuestionFieldType.md)
- [LeadFormQuestionType](docs/Model/LeadFormQuestionType.md)
- [LeadFormStatus](docs/Model/LeadFormStatus.md)
- [LeadFormTest](docs/Model/LeadFormTest.md)
- [LeadFormTestCreate](docs/Model/LeadFormTestCreate.md)
- [LeadFormsCreate200Response](docs/Model/LeadFormsCreate200Response.md)
- [LeadFormsCreate200ResponseItemsInner](docs/Model/LeadFormsCreate200ResponseItemsInner.md)
- [LeadFormsList200Response](docs/Model/LeadFormsList200Response.md)
- [LeadSubscription](docs/Model/LeadSubscription.md)
- [LeadSubscriptionCreate](docs/Model/LeadSubscriptionCreate.md)
- [LeadSubscriptionPostParams](docs/Model/LeadSubscriptionPostParams.md)
- [LeadSubscriptionPostParamsCreate](docs/Model/LeadSubscriptionPostParamsCreate.md)
- [LeadsExportResponseData](docs/Model/LeadsExportResponseData.md)
- [LeadsExportStatus](docs/Model/LeadsExportStatus.md)
- [LeadsExports](docs/Model/LeadsExports.md)
- [LeadsExportsCreate](docs/Model/LeadsExportsCreate.md)
- [LineItem](docs/Model/LineItem.md)
- [LinkFilter](docs/Model/LinkFilter.md)
- [LinkedBusiness](docs/Model/LinkedBusiness.md)
- [LocalInventoryCreateOperation](docs/Model/LocalInventoryCreateOperation.md)
- [LocalInventoryDeleteOperation](docs/Model/LocalInventoryDeleteOperation.md)
- [LocalInventoryItemResponse](docs/Model/LocalInventoryItemResponse.md)
- [LocalInventoryItemsBatch](docs/Model/LocalInventoryItemsBatch.md)
- [LocalInventoryItemsBatchCreate](docs/Model/LocalInventoryItemsBatchCreate.md)
- [LocalInventoryItemsGet](docs/Model/LocalInventoryItemsGet.md)
- [LocalInventoryItemsGetCreate](docs/Model/LocalInventoryItemsGetCreate.md)
- [LocalInventoryOperation](docs/Model/LocalInventoryOperation.md)
- [LocalInventoryOperationResult](docs/Model/LocalInventoryOperationResult.md)
- [LocalInventoryUpdateOperation](docs/Model/LocalInventoryUpdateOperation.md)
- [LocalInventoryUpsertOperation](docs/Model/LocalInventoryUpsertOperation.md)
- [LocalStore](docs/Model/LocalStore.md)
- [LocalStoreBatchUpdate](docs/Model/LocalStoreBatchUpdate.md)
- [LocalStoreCreate](docs/Model/LocalStoreCreate.md)
- [LookbackPeriodOptions](docs/Model/LookbackPeriodOptions.md)
- [MMMReport](docs/Model/MMMReport.md)
- [MMMReportCreate](docs/Model/MMMReportCreate.md)
- [MMMReportGranularity](docs/Model/MMMReportGranularity.md)
- [MMMReportLevel](docs/Model/MMMReportLevel.md)
- [MMMReportingColumn](docs/Model/MMMReportingColumn.md)
- [MMMReportingTargetingType](docs/Model/MMMReportingTargetingType.md)
- [MatchType](docs/Model/MatchType.md)
- [MatchTypeResponse](docs/Model/MatchTypeResponse.md)
- [MaxPriceFilter](docs/Model/MaxPriceFilter.md)
- [Media](docs/Model/Media.md)
- [MediaList200Response](docs/Model/MediaList200Response.md)
- [MediaType](docs/Model/MediaType.md)
- [MediaTypeFilter](docs/Model/MediaTypeFilter.md)
- [MediaUpload](docs/Model/MediaUpload.md)
- [MediaUploadCreate](docs/Model/MediaUploadCreate.md)
- [MediaUploadParameters](docs/Model/MediaUploadParameters.md)
- [MediaUploadStatus](docs/Model/MediaUploadStatus.md)
- [MediaUploadType](docs/Model/MediaUploadType.md)
- [MemberBusinessRole](docs/Model/MemberBusinessRole.md)
- [MetricsReportingLevel](docs/Model/MetricsReportingLevel.md)
- [MetricsReportingTemplateType](docs/Model/MetricsReportingTemplateType.md)
- [MetricsResponse](docs/Model/MetricsResponse.md)
- [MetricsResponseDataItems](docs/Model/MetricsResponseDataItems.md)
- [MinPriceFilter](docs/Model/MinPriceFilter.md)
- [MobileAppPlatform](docs/Model/MobileAppPlatform.md)
- [MsotEventName](docs/Model/MsotEventName.md)
- [MultiPinsAnalyticsMetricTypesItem](docs/Model/MultiPinsAnalyticsMetricTypesItem.md)
- [NetworkType](docs/Model/NetworkType.md)
- [NonDraftEntityStatus](docs/Model/NonDraftEntityStatus.md)
- [NonNullableCatalogsCurrency](docs/Model/NonNullableCatalogsCurrency.md)
- [NotificationPostRequest](docs/Model/NotificationPostRequest.md)
- [NotificationResponse](docs/Model/NotificationResponse.md)
- [NullableCatalogsItemFieldType](docs/Model/NullableCatalogsItemFieldType.md)
- [NullableCurrency](docs/Model/NullableCurrency.md)
- [NullableEntityStatus](docs/Model/NullableEntityStatus.md)
- [NullableLabelStatus](docs/Model/NullableLabelStatus.md)
- [NullableLabelType](docs/Model/NullableLabelType.md)
- [NullableOptimizationGoalMetadata](docs/Model/NullableOptimizationGoalMetadata.md)
- [NullablePartnerType](docs/Model/NullablePartnerType.md)
- [NullalbleMatchType](docs/Model/NullalbleMatchType.md)
- [NumericFilterOperatorType](docs/Model/NumericFilterOperatorType.md)
- [OauthAccessToken](docs/Model/OauthAccessToken.md)
- [ObjectiveType](docs/Model/ObjectiveType.md)
- [OperationType](docs/Model/OperationType.md)
- [OptimizationGoalMetadata](docs/Model/OptimizationGoalMetadata.md)
- [OptimizationType](docs/Model/OptimizationType.md)
- [Order](docs/Model/Order.md)
- [OrderLine](docs/Model/OrderLine.md)
- [OrderLineMutationError](docs/Model/OrderLineMutationError.md)
- [OrderLineMutationResponse](docs/Model/OrderLineMutationResponse.md)
- [OrderLineMutationResult](docs/Model/OrderLineMutationResult.md)
- [OrderLinePaidType](docs/Model/OrderLinePaidType.md)
- [OrderLineStatus](docs/Model/OrderLineStatus.md)
- [OrderLinesList200Response](docs/Model/OrderLinesList200Response.md)
- [OsFamily](docs/Model/OsFamily.md)
- [OverallStatusOptions](docs/Model/OverallStatusOptions.md)
- [PacingDeliveryType](docs/Model/PacingDeliveryType.md)
- [PageVisitConversionTagsGet200Response](docs/Model/PageVisitConversionTagsGet200Response.md)
- [PartnerMetadata](docs/Model/PartnerMetadata.md)
- [PartnerType](docs/Model/PartnerType.md)
- [PerformancePlusCampaignSettings](docs/Model/PerformancePlusCampaignSettings.md)
- [Permissions](docs/Model/Permissions.md)
- [PermissionsWithOwner](docs/Model/PermissionsWithOwner.md)
- [Pin](docs/Model/Pin.md)
- [PinAnalyticsDailyMetrics](docs/Model/PinAnalyticsDailyMetrics.md)
- [PinAnalyticsMetricsResponse](docs/Model/PinAnalyticsMetricsResponse.md)
- [PinBase](docs/Model/PinBase.md)
- [PinCreate](docs/Model/PinCreate.md)
- [PinFilter](docs/Model/PinFilter.md)
- [PinMedia](docs/Model/PinMedia.md)
- [PinMediaMetadata](docs/Model/PinMediaMetadata.md)
- [PinMediaSource](docs/Model/PinMediaSource.md)
- [PinMediaSourceImageBase64](docs/Model/PinMediaSourceImageBase64.md)
- [PinMediaSourceImageURL](docs/Model/PinMediaSourceImageURL.md)
- [PinMediaSourceImagesBase64](docs/Model/PinMediaSourceImagesBase64.md)
- [PinMediaSourceImagesBase64Item](docs/Model/PinMediaSourceImagesBase64Item.md)
- [PinMediaSourceImagesURL](docs/Model/PinMediaSourceImagesURL.md)
- [PinMediaSourceImagesURLItem](docs/Model/PinMediaSourceImagesURLItem.md)
- [PinMediaSourcePinURL](docs/Model/PinMediaSourcePinURL.md)
- [PinMediaSourceVideoID](docs/Model/PinMediaSourceVideoID.md)
- [PinMediaWithImage](docs/Model/PinMediaWithImage.md)
- [PinMediaWithImageAndVideo](docs/Model/PinMediaWithImageAndVideo.md)
- [PinMediaWithImages](docs/Model/PinMediaWithImages.md)
- [PinMediaWithVideo](docs/Model/PinMediaWithVideo.md)
- [PinMediaWithVideos](docs/Model/PinMediaWithVideos.md)
- [PinPromotionSummaryStatus](docs/Model/PinPromotionSummaryStatus.md)
- [PinRead](docs/Model/PinRead.md)
- [PinType](docs/Model/PinType.md)
- [PinUpdate](docs/Model/PinUpdate.md)
- [PinnerListType](docs/Model/PinnerListType.md)
- [PinsList200Response](docs/Model/PinsList200Response.md)
- [PinsSaveRequestCreate](docs/Model/PinsSaveRequestCreate.md)
- [PinterestLibBatchItemException](docs/Model/PinterestLibBatchItemException.md)
- [PinterestLibError](docs/Model/PinterestLibError.md)
- [PinterestLibPaginationOrder](docs/Model/PinterestLibPaginationOrder.md)
- [PinterestLibStatus204](docs/Model/PinterestLibStatus204.md)
- [PinterestProductCategoriesFilter](docs/Model/PinterestProductCategoriesFilter.md)
- [PlacementGroupType](docs/Model/PlacementGroupType.md)
- [PlacementMultipliers](docs/Model/PlacementMultipliers.md)
- [PlacementTrafficType](docs/Model/PlacementTrafficType.md)
- [PlacementType](docs/Model/PlacementType.md)
- [PredictedTimeSeries](docs/Model/PredictedTimeSeries.md)
- [PreferredMediaType](docs/Model/PreferredMediaType.md)
- [PriceFilter](docs/Model/PriceFilter.md)
- [PriceFilterPrice](docs/Model/PriceFilterPrice.md)
- [PrimarySort](docs/Model/PrimarySort.md)
- [ProductAvailability](docs/Model/ProductAvailability.md)
- [ProductAvailabilityType](docs/Model/ProductAvailabilityType.md)
- [ProductCategoriesDemographic](docs/Model/ProductCategoriesDemographic.md)
- [ProductCategoriesEngagementType](docs/Model/ProductCategoriesEngagementType.md)
- [ProductCategoriesMetricsHighlights](docs/Model/ProductCategoriesMetricsHighlights.md)
- [ProductCategoryDetailLookbackWindow](docs/Model/ProductCategoryDetailLookbackWindow.md)
- [ProductCategoryDetails](docs/Model/ProductCategoryDetails.md)
- [ProductCategoryEnum](docs/Model/ProductCategoryEnum.md)
- [ProductCategoryRegion](docs/Model/ProductCategoryRegion.md)
- [ProductCondition](docs/Model/ProductCondition.md)
- [ProductGroupAnalyticsItems](docs/Model/ProductGroupAnalyticsItems.md)
- [ProductGroupPromotion](docs/Model/ProductGroupPromotion.md)
- [ProductGroupPromotionCreateRequest](docs/Model/ProductGroupPromotionCreateRequest.md)
- [ProductGroupPromotionCustomizableCTAType](docs/Model/ProductGroupPromotionCustomizableCTAType.md)
- [ProductGroupPromotionResponseItem](docs/Model/ProductGroupPromotionResponseItem.md)
- [ProductGroupPromotionUpdateRequest](docs/Model/ProductGroupPromotionUpdateRequest.md)
- [ProductGroupPromotions](docs/Model/ProductGroupPromotions.md)
- [ProductGroupPromotionsCreate](docs/Model/ProductGroupPromotionsCreate.md)
- [ProductGroupPromotionsList200Response](docs/Model/ProductGroupPromotionsList200Response.md)
- [ProductGroupPromotionsUpdateWithRequiredBody](docs/Model/ProductGroupPromotionsUpdateWithRequiredBody.md)
- [ProductGroupReferenceFilter](docs/Model/ProductGroupReferenceFilter.md)
- [ProductGroupSummaryStatus](docs/Model/ProductGroupSummaryStatus.md)
- [ProductTagItem](docs/Model/ProductTagItem.md)
- [ProductTagsBulkAddRequest](docs/Model/ProductTagsBulkAddRequest.md)
- [ProductTagsBulkDeleteRequest](docs/Model/ProductTagsBulkDeleteRequest.md)
- [ProductTagsError](docs/Model/ProductTagsError.md)
- [ProductTagsResponse](docs/Model/ProductTagsResponse.md)
- [ProductType0Filter](docs/Model/ProductType0Filter.md)
- [ProductType1Filter](docs/Model/ProductType1Filter.md)
- [ProductType2Filter](docs/Model/ProductType2Filter.md)
- [ProductType3Filter](docs/Model/ProductType3Filter.md)
- [ProductType4Filter](docs/Model/ProductType4Filter.md)
- [Promotion](docs/Model/Promotion.md)
- [PromotionApplicationLevel](docs/Model/PromotionApplicationLevel.md)
- [PromotionArrayElement](docs/Model/PromotionArrayElement.md)
- [PromotionBatchUpdate](docs/Model/PromotionBatchUpdate.md)
- [PromotionCreate](docs/Model/PromotionCreate.md)
- [PromotionTemplateValue](docs/Model/PromotionTemplateValue.md)
- [PromotionType](docs/Model/PromotionType.md)
- [PromotionsList200Response](docs/Model/PromotionsList200Response.md)
- [PromotionsResponse](docs/Model/PromotionsResponse.md)
- [PublicTargetingType](docs/Model/PublicTargetingType.md)
- [QualityComponentDetails](docs/Model/QualityComponentDetails.md)
- [QualityComponentIssue](docs/Model/QualityComponentIssue.md)
- [QualityComponents](docs/Model/QualityComponents.md)
- [QueryLabelEntityStatusesItems](docs/Model/QueryLabelEntityStatusesItems.md)
- [QueryLabelTypesItems](docs/Model/QueryLabelTypesItems.md)
- [QuerymetrictypesItems](docs/Model/QuerymetrictypesItems.md)
- [QuerypinanalyticsmetrictypesItems](docs/Model/QuerypinanalyticsmetrictypesItems.md)
- [QueryvideopinmetrictypesItems](docs/Model/QueryvideopinmetrictypesItems.md)
- [QuizPinData](docs/Model/QuizPinData.md)
- [QuizPinOption](docs/Model/QuizPinOption.md)
- [QuizPinQuestion](docs/Model/QuizPinQuestion.md)
- [QuizPinResult](docs/Model/QuizPinResult.md)
- [RecordCounts](docs/Model/RecordCounts.md)
- [RelatedTerms](docs/Model/RelatedTerms.md)
- [RelatedTermsRelatedTermsListItems](docs/Model/RelatedTermsRelatedTermsListItems.md)
- [ReportType](docs/Model/ReportType.md)
- [ReportingColumn](docs/Model/ReportingColumn.md)
- [ReportingColumnAsync](docs/Model/ReportingColumnAsync.md)
- [ReportingColumnSync](docs/Model/ReportingColumnSync.md)
- [ReportingTimeZone](docs/Model/ReportingTimeZone.md)
- [ReportsStats200Response](docs/Model/ReportsStats200Response.md)
- [RespondToInviteResultItem](docs/Model/RespondToInviteResultItem.md)
- [RespondToInvitesResponseArray](docs/Model/RespondToInvitesResponseArray.md)
- [RetailLocalInventoryItemAttributes](docs/Model/RetailLocalInventoryItemAttributes.md)
- [RetailLocalInventoryItemAttributesOptional](docs/Model/RetailLocalInventoryItemAttributesOptional.md)
- [Role](docs/Model/Role.md)
- [S3FilePart](docs/Model/S3FilePart.md)
- [S3MultipartUploadData](docs/Model/S3MultipartUploadData.md)
- [SSIOAccount](docs/Model/SSIOAccount.md)
- [SSIOAccountAddress](docs/Model/SSIOAccountAddress.md)
- [SSIOAccountItem](docs/Model/SSIOAccountItem.md)
- [SSIOAccountPMPName](docs/Model/SSIOAccountPMPName.md)
- [SSIOInsertionOrder](docs/Model/SSIOInsertionOrder.md)
- [SSIOInsertionOrderCreate](docs/Model/SSIOInsertionOrderCreate.md)
- [SSIOInsertionOrderStatus](docs/Model/SSIOInsertionOrderStatus.md)
- [SSIOInsertionOrderStatusResponse](docs/Model/SSIOInsertionOrderStatusResponse.md)
- [SSIOInsertionOrderUpdate](docs/Model/SSIOInsertionOrderUpdate.md)
- [SSIOOrderLine](docs/Model/SSIOOrderLine.md)
- [SSIOOrderLineType](docs/Model/SSIOOrderLineType.md)
- [Schedule](docs/Model/Schedule.md)
- [ScheduleAction](docs/Model/ScheduleAction.md)
- [ScheduleAgeBucketMultipliers](docs/Model/ScheduleAgeBucketMultipliers.md)
- [ScheduleAppTypeMultipliers](docs/Model/ScheduleAppTypeMultipliers.md)
- [ScheduleAudienceMultipliers](docs/Model/ScheduleAudienceMultipliers.md)
- [ScheduleBatchUpdate](docs/Model/ScheduleBatchUpdate.md)
- [ScheduleBidMultipliers](docs/Model/ScheduleBidMultipliers.md)
- [ScheduleBidOptions](docs/Model/ScheduleBidOptions.md)
- [ScheduleBidOptionsGenderMultipliers](docs/Model/ScheduleBidOptionsGenderMultipliers.md)
- [ScheduleBidOptionsPlacementMultipliers](docs/Model/ScheduleBidOptionsPlacementMultipliers.md)
- [ScheduleCommonDeltaValue](docs/Model/ScheduleCommonDeltaValue.md)
- [ScheduleCreate](docs/Model/ScheduleCreate.md)
- [ScheduleCreateRequest](docs/Model/ScheduleCreateRequest.md)
- [ScheduleCreateRequestAllOf1](docs/Model/ScheduleCreateRequestAllOf1.md)
- [ScheduleDeltaValue](docs/Model/ScheduleDeltaValue.md)
- [ScheduleGenderMultipliers](docs/Model/ScheduleGenderMultipliers.md)
- [SchedulePlacementMultipliers](docs/Model/SchedulePlacementMultipliers.md)
- [ScheduleStatus](docs/Model/ScheduleStatus.md)
- [ScheduleType](docs/Model/ScheduleType.md)
- [ScheduleUpdateRequest](docs/Model/ScheduleUpdateRequest.md)
- [ScheduleUpdateRequestAllOf1](docs/Model/ScheduleUpdateRequestAllOf1.md)
- [SchedulesCreate200ResponseInner](docs/Model/SchedulesCreate200ResponseInner.md)
- [SchedulesCreate200ResponseInnerData](docs/Model/SchedulesCreate200ResponseInnerData.md)
- [SchedulesCreate200ResponseInnerDataOneOf](docs/Model/SchedulesCreate200ResponseInnerDataOneOf.md)
- [SchedulesList200Response](docs/Model/SchedulesList200Response.md)
- [ScrollupGoalMetadata](docs/Model/ScrollupGoalMetadata.md)
- [SearchPartnerPins200Response](docs/Model/SearchPartnerPins200Response.md)
- [SharedAudienceAccount](docs/Model/SharedAudienceAccount.md)
- [SharedAudiencesForBusinessList200Response](docs/Model/SharedAudiencesForBusinessList200Response.md)
- [SingleInterestTargetingOption](docs/Model/SingleInterestTargetingOption.md)
- [SourcePlatformOptions](docs/Model/SourcePlatformOptions.md)
- [SsioInsertionOrdersStatusGetByAdAccount200Response](docs/Model/SsioInsertionOrdersStatusGetByAdAccount200Response.md)
- [SsioOrderLinesGetByAdAccount200Response](docs/Model/SsioOrderLinesGetByAdAccount200Response.md)
- [StandardPinMetricTypes](docs/Model/StandardPinMetricTypes.md)
- [StoreMetadata](docs/Model/StoreMetadata.md)
- [SummaryPin](docs/Model/SummaryPin.md)
- [SummaryStatus](docs/Model/SummaryStatus.md)
- [SupplementalItemBatchOperationStatus](docs/Model/SupplementalItemBatchOperationStatus.md)
- [SupplementalItemProcessingStatus](docs/Model/SupplementalItemProcessingStatus.md)
- [SupplementalItemValidationEvent](docs/Model/SupplementalItemValidationEvent.md)
- [SupplementalItemsBatchResponse](docs/Model/SupplementalItemsBatchResponse.md)
- [SupplementalOperationResult](docs/Model/SupplementalOperationResult.md)
- [SystemUserUpdateWithRequiredBody](docs/Model/SystemUserUpdateWithRequiredBody.md)
- [TargetingAdvertiserCountry](docs/Model/TargetingAdvertiserCountry.md)
- [TargetingSpec](docs/Model/TargetingSpec.md)
- [TargetingSpecAgeBucket](docs/Model/TargetingSpecAgeBucket.md)
- [TargetingSpecAppType](docs/Model/TargetingSpecAppType.md)
- [TargetingSpecGender](docs/Model/TargetingSpecGender.md)
- [TargetingSpecListOperation](docs/Model/TargetingSpecListOperation.md)
- [TargetingSpecOperationAgeBucket](docs/Model/TargetingSpecOperationAgeBucket.md)
- [TargetingSpecOperationAppType](docs/Model/TargetingSpecOperationAppType.md)
- [TargetingSpecOperationAudienceExclude](docs/Model/TargetingSpecOperationAudienceExclude.md)
- [TargetingSpecOperationAudienceInclude](docs/Model/TargetingSpecOperationAudienceInclude.md)
- [TargetingSpecOperationGender](docs/Model/TargetingSpecOperationGender.md)
- [TargetingSpecOperationGeo](docs/Model/TargetingSpecOperationGeo.md)
- [TargetingSpecOperationGeoExclude](docs/Model/TargetingSpecOperationGeoExclude.md)
- [TargetingSpecOperationInterest](docs/Model/TargetingSpecOperationInterest.md)
- [TargetingSpecOperationLocale](docs/Model/TargetingSpecOperationLocale.md)
- [TargetingSpecOperationLocation](docs/Model/TargetingSpecOperationLocation.md)
- [TargetingSpecOperationLocationExclude](docs/Model/TargetingSpecOperationLocationExclude.md)
- [TargetingSpecOperationMaximumAge](docs/Model/TargetingSpecOperationMaximumAge.md)
- [TargetingSpecOperationMinimumAge](docs/Model/TargetingSpecOperationMinimumAge.md)
- [TargetingSpecOperationShoppingRetargeting](docs/Model/TargetingSpecOperationShoppingRetargeting.md)
- [TargetingSpecOperations](docs/Model/TargetingSpecOperations.md)
- [TargetingSpecOptimal](docs/Model/TargetingSpecOptimal.md)
- [TargetingSpecShoppingRetargeting](docs/Model/TargetingSpecShoppingRetargeting.md)
- [TargetingSpecTargetingStrategyItems](docs/Model/TargetingSpecTargetingStrategyItems.md)
- [TargetingStrategy](docs/Model/TargetingStrategy.md)
- [TargetingTemplate](docs/Model/TargetingTemplate.md)
- [TargetingTemplateAudienceSizing](docs/Model/TargetingTemplateAudienceSizing.md)
- [TargetingTemplateAudienceSizingReachEstimate](docs/Model/TargetingTemplateAudienceSizingReachEstimate.md)
- [TargetingTemplateCreate](docs/Model/TargetingTemplateCreate.md)
- [TargetingTemplateKeyword](docs/Model/TargetingTemplateKeyword.md)
- [TargetingTemplateList200Response](docs/Model/TargetingTemplateList200Response.md)
- [TargetingTemplateStatus](docs/Model/TargetingTemplateStatus.md)
- [TargetingTemplateUpdateRequestReadOrUpdate](docs/Model/TargetingTemplateUpdateRequestReadOrUpdate.md)
- [TemplateBasedReport](docs/Model/TemplateBasedReport.md)
- [TemplateBasedReportCreate](docs/Model/TemplateBasedReportCreate.md)
- [TemplatesList200Response](docs/Model/TemplatesList200Response.md)
- [TermsOfService](docs/Model/TermsOfService.md)
- [TieBreakerType](docs/Model/TieBreakerType.md)
- [TimeSeries](docs/Model/TimeSeries.md)
- [TitleKeywordsFilter](docs/Model/TitleKeywordsFilter.md)
- [TokenGrantType](docs/Model/TokenGrantType.md)
- [TokenTypeHint](docs/Model/TokenTypeHint.md)
- [TopPinsAnalyticsResponse](docs/Model/TopPinsAnalyticsResponse.md)
- [TopPinsAnalyticsResponseDateAvailability](docs/Model/TopPinsAnalyticsResponseDateAvailability.md)
- [TopPinsAnalyticsResponsePinsItems](docs/Model/TopPinsAnalyticsResponsePinsItems.md)
- [TopPinsSortBy](docs/Model/TopPinsSortBy.md)
- [TopVideoPinsAnalyticsResponse](docs/Model/TopVideoPinsAnalyticsResponse.md)
- [TopVideoPinsAnalyticsResponseDateAvailability](docs/Model/TopVideoPinsAnalyticsResponseDateAvailability.md)
- [TopVideoPinsAnalyticsResponsePinsItems](docs/Model/TopVideoPinsAnalyticsResponsePinsItems.md)
- [TopVideoPinsSortBy](docs/Model/TopVideoPinsSortBy.md)
- [TotalCountByEntityStatus](docs/Model/TotalCountByEntityStatus.md)
- [TrackingUrls](docs/Model/TrackingUrls.md)
- [TrendType](docs/Model/TrendType.md)
- [TrendingKeyword](docs/Model/TrendingKeyword.md)
- [TrendingKeywordDemographics](docs/Model/TrendingKeywordDemographics.md)
- [TrendingKeywordsResponse](docs/Model/TrendingKeywordsResponse.md)
- [TrendingPin](docs/Model/TrendingPin.md)
- [TrendingProductCategory](docs/Model/TrendingProductCategory.md)
- [TrendingTopic](docs/Model/TrendingTopic.md)
- [TrendsAgeBucket](docs/Model/TrendsAgeBucket.md)
- [TrendsAgeDistribution](docs/Model/TrendsAgeDistribution.md)
- [TrendsEditorial](docs/Model/TrendsEditorial.md)
- [TrendsGender](docs/Model/TrendsGender.md)
- [TrendsGenderDistribution](docs/Model/TrendsGenderDistribution.md)
- [TrendsGenderFilter](docs/Model/TrendsGenderFilter.md)
- [TrendsL1Interest](docs/Model/TrendsL1Interest.md)
- [TrendsSupportedRegion](docs/Model/TrendsSupportedRegion.md)
- [UpdatableItemAttributes](docs/Model/UpdatableItemAttributes.md)
- [UpdatableItemAttributesGtin](docs/Model/UpdatableItemAttributesGtin.md)
- [UpdateBusinessMembershipsResponse](docs/Model/UpdateBusinessMembershipsResponse.md)
- [UpdateInvitesResultsResponseArray](docs/Model/UpdateInvitesResultsResponseArray.md)
- [UpdateMaskBidOptionField](docs/Model/UpdateMaskBidOptionField.md)
- [UpdateMaskFieldType](docs/Model/UpdateMaskFieldType.md)
- [UpdateMemberAssetAccessBody](docs/Model/UpdateMemberAssetAccessBody.md)
- [UpdateMemberAssetAccessItem](docs/Model/UpdateMemberAssetAccessItem.md)
- [UpdateMemberAssetResultItem](docs/Model/UpdateMemberAssetResultItem.md)
- [UpdateMemberAssetsResultsResponseArray](docs/Model/UpdateMemberAssetsResultsResponseArray.md)
- [UpdatePartnerAssetAccessBody](docs/Model/UpdatePartnerAssetAccessBody.md)
- [UpdatePartnerAssetAccessItem](docs/Model/UpdatePartnerAssetAccessItem.md)
- [UpdatePartnerAssetsResult](docs/Model/UpdatePartnerAssetsResult.md)
- [UpdatePartnerAssetsResultsResponseArray](docs/Model/UpdatePartnerAssetsResultsResponseArray.md)
- [UserAccountFollowedInterests200Response](docs/Model/UserAccountFollowedInterests200Response.md)
- [UserAccountType](docs/Model/UserAccountType.md)
- [UserBusinessRoleBinding](docs/Model/UserBusinessRoleBinding.md)
- [UserFollowingFeedType](docs/Model/UserFollowingFeedType.md)
- [UserListOperationType](docs/Model/UserListOperationType.md)
- [UserListType](docs/Model/UserListType.md)
- [UserSingleAssetBinding](docs/Model/UserSingleAssetBinding.md)
- [UserWebsite](docs/Model/UserWebsite.md)
- [UserWebsiteCreate](docs/Model/UserWebsiteCreate.md)
- [UserWebsiteVerification](docs/Model/UserWebsiteVerification.md)
- [UserWebsitesGet200Response](docs/Model/UserWebsitesGet200Response.md)
- [UsersForIndividualAssetResponse](docs/Model/UsersForIndividualAssetResponse.md)
- [VerticalProductCategory](docs/Model/VerticalProductCategory.md)
- [VideoMetadataWithItemType](docs/Model/VideoMetadataWithItemType.md)
- [VideoPinMetricTypes](docs/Model/VideoPinMetricTypes.md)
- [WebsiteVerificationMethod](docs/Model/WebsiteVerificationMethod.md)
- [WorkloadState](docs/Model/WorkloadState.md)

## Authorization

Authentication schemes defined for the API:
### pinterest_oauth2

- **Type**: `OAuth`
- **Flow**: `accessCode`
- **Authorization URL**: `https://www.pinterest.com/oauth/`
- **Scopes**: 
    - **ads:read**: See all of your advertising data, including ads, ad groups, campaigns etc.
    - **ads:write**: Create, update, or delete ads, ad groups, campaigns etc.
    - **billing:read**: See all of your billing data, billing profile, etc.
    - **billing:write**: Create, update, or delete billing data, billing profiles, etc.
    - **biz_access:read**: See business access data
    - **biz_access:write**: Create, update, or delete business access data
    - **boards:read**: See your public boards, including group boards you join
    - **boards:read_secret**: See your secret boards
    - **boards:write**: Create, update, or delete your public boards
    - **boards:write_secret**: Create, update, or delete your secret boards
    - **catalogs:read**: See all of your catalogs data
    - **catalogs:write**: Create, update, or delete your catalogs data
    - **msot:write**: Create measurement source of truth events
    - **pins:read**: See your public Pins
    - **pins:read_secret**: See your secret Pins
    - **pins:write**: Create, update, or delete your public Pins
    - **pins:write_secret**: Create, update, or delete your secret Pins
    - **user_accounts:read**: See your user accounts and followers
    - **user_accounts:write**: Update your user accounts and followers

### client_credentials

- **Type**: `OAuth`
- **Flow**: `application`
- **Authorization URL**: ``
- **Scopes**: 
    - **ads:read**: See all of your advertising data, including ads, ad groups, campaigns etc.
    - **ads:write**: Create, update, or delete ads, ad groups, campaigns etc.
    - **billing:read**: See all of your billing data, billing profile, etc.
    - **billing:write**: Create, update, or delete billing data, billing profiles, etc.
    - **biz_access:read**: See business access data
    - **biz_access:write**: Create, update, or delete business access data
    - **boards:read**: See your public boards, including group boards you join
    - **boards:read_secret**: See your secret boards
    - **boards:write**: Create, update, or delete your public boards
    - **boards:write_secret**: Create, update, or delete your secret boards
    - **catalogs:read**: See all of your catalogs data
    - **catalogs:write**: Create, update, or delete your catalogs data
    - **msot:write**: Create measurement source of truth events
    - **pins:read**: See your public Pins
    - **pins:read_secret**: See your secret Pins
    - **pins:write**: Create, update, or delete your public Pins
    - **pins:write_secret**: Create, update, or delete your secret Pins
    - **user_accounts:read**: See your user accounts and followers
    - **user_accounts:write**: Update your user accounts and followers

### conversion_token

- **Type**: Bearer authentication

### basic

- **Type**: HTTP basic authentication

## Tests

To run the tests, use:

```bash
composer install
vendor/bin/phpunit
```

## Author

blah+oapicf@cliffano.com

## About this package

This PHP package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: `5.28.0`
    - Generator version: `7.24.0`
- Build package: `org.openapitools.codegen.languages.PhpClientCodegen`
