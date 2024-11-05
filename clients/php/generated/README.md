# OpenAPIClient-php

Pinterest's REST API

For more information, please visit [https://github.com/oapicf/pinterest-sdk](https://github.com/oapicf/pinterest-sdk).

## Installation & Usage

### Requirements

PHP 7.4 and later.
Should also work with PHP 8.0.

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


$apiInstance = new OpenAPI\Client\Api\AdAccountsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$start_date = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
$end_date = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
$columns = array('columns_example'); // string[] | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
$granularity = DAY; // \OpenAPI\Client\Model\Granularity | TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
$click_window_days = 1; // int | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
$engagement_window_days = 30; // int | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
$view_window_days = 1; // int | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
$conversion_report_time = TIME_OF_AD_ACTION; // string | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.

try {
    $result = $apiInstance->adAccountAnalytics($ad_account_id, $start_date, $end_date, $columns, $granularity, $click_window_days, $engagement_window_days, $view_window_days, $conversion_report_time);
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
*AdAccountsApi* | [**analyticsCreateMmmReport**](docs/Api/AdAccountsApi.md#analyticscreatemmmreport) | **POST** /ad_accounts/{ad_account_id}/mmm_reports | Create a request for a Marketing Mix Modeling (MMM) report
*AdAccountsApi* | [**analyticsCreateReport**](docs/Api/AdAccountsApi.md#analyticscreatereport) | **POST** /ad_accounts/{ad_account_id}/reports | Create async request for an account analytics report
*AdAccountsApi* | [**analyticsCreateTemplateReport**](docs/Api/AdAccountsApi.md#analyticscreatetemplatereport) | **POST** /ad_accounts/{ad_account_id}/templates/{template_id}/reports | Create async request for an analytics report using a template
*AdAccountsApi* | [**analyticsGetMmmReport**](docs/Api/AdAccountsApi.md#analyticsgetmmmreport) | **GET** /ad_accounts/{ad_account_id}/mmm_reports | Get advertiser Marketing Mix Modeling (MMM) report.
*AdAccountsApi* | [**analyticsGetReport**](docs/Api/AdAccountsApi.md#analyticsgetreport) | **GET** /ad_accounts/{ad_account_id}/reports | Get the account analytics report created by the async call
*AdAccountsApi* | [**sandboxDelete**](docs/Api/AdAccountsApi.md#sandboxdelete) | **DELETE** /ad_accounts/{ad_account_id}/sandbox | Delete ads data for ad account in API Sandbox
*AdAccountsApi* | [**templatesList**](docs/Api/AdAccountsApi.md#templateslist) | **GET** /ad_accounts/{ad_account_id}/templates | List templates
*AdGroupsApi* | [**adGroupsAnalytics**](docs/Api/AdGroupsApi.md#adgroupsanalytics) | **GET** /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics
*AdGroupsApi* | [**adGroupsAudienceSizing**](docs/Api/AdGroupsApi.md#adgroupsaudiencesizing) | **POST** /ad_accounts/{ad_account_id}/ad_groups/audience_sizing | Get audience sizing
*AdGroupsApi* | [**adGroupsBidFloorGet**](docs/Api/AdGroupsApi.md#adgroupsbidfloorget) | **POST** /ad_accounts/{ad_account_id}/bid_floor | Get bid floors
*AdGroupsApi* | [**adGroupsCreate**](docs/Api/AdGroupsApi.md#adgroupscreate) | **POST** /ad_accounts/{ad_account_id}/ad_groups | Create ad groups
*AdGroupsApi* | [**adGroupsGet**](docs/Api/AdGroupsApi.md#adgroupsget) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id} | Get ad group
*AdGroupsApi* | [**adGroupsList**](docs/Api/AdGroupsApi.md#adgroupslist) | **GET** /ad_accounts/{ad_account_id}/ad_groups | List ad groups
*AdGroupsApi* | [**adGroupsTargetingAnalyticsGet**](docs/Api/AdGroupsApi.md#adgroupstargetinganalyticsget) | **GET** /ad_accounts/{ad_account_id}/ad_groups/targeting_analytics | Get targeting analytics for ad groups
*AdGroupsApi* | [**adGroupsUpdate**](docs/Api/AdGroupsApi.md#adgroupsupdate) | **PATCH** /ad_accounts/{ad_account_id}/ad_groups | Update ad groups
*AdsApi* | [**adPreviewsCreate**](docs/Api/AdsApi.md#adpreviewscreate) | **POST** /ad_accounts/{ad_account_id}/ad_previews | Create ad preview with pin or image
*AdsApi* | [**adTargetingAnalyticsGet**](docs/Api/AdsApi.md#adtargetinganalyticsget) | **GET** /ad_accounts/{ad_account_id}/ads/targeting_analytics | Get targeting analytics for ads
*AdsApi* | [**adsAnalytics**](docs/Api/AdsApi.md#adsanalytics) | **GET** /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics
*AdsApi* | [**adsCreate**](docs/Api/AdsApi.md#adscreate) | **POST** /ad_accounts/{ad_account_id}/ads | Create ads
*AdsApi* | [**adsGet**](docs/Api/AdsApi.md#adsget) | **GET** /ad_accounts/{ad_account_id}/ads/{ad_id} | Get ad
*AdsApi* | [**adsList**](docs/Api/AdsApi.md#adslist) | **GET** /ad_accounts/{ad_account_id}/ads | List ads
*AdsApi* | [**adsUpdate**](docs/Api/AdsApi.md#adsupdate) | **PATCH** /ad_accounts/{ad_account_id}/ads | Update ads
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
*AudiencesApi* | [**audiencesCreateCustom**](docs/Api/AudiencesApi.md#audiencescreatecustom) | **POST** /ad_accounts/{ad_account_id}/audiences/custom | Create custom audience
*AudiencesApi* | [**audiencesGet**](docs/Api/AudiencesApi.md#audiencesget) | **GET** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Get audience
*AudiencesApi* | [**audiencesList**](docs/Api/AudiencesApi.md#audienceslist) | **GET** /ad_accounts/{ad_account_id}/audiences | List audiences
*AudiencesApi* | [**audiencesUpdate**](docs/Api/AudiencesApi.md#audiencesupdate) | **PATCH** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Update audience
*BillingApi* | [**adsCreditRedeem**](docs/Api/BillingApi.md#adscreditredeem) | **POST** /ad_accounts/{ad_account_id}/ads_credit/redeem | Redeem ad credits
*BillingApi* | [**adsCreditsDiscountsGet**](docs/Api/BillingApi.md#adscreditsdiscountsget) | **GET** /ad_accounts/{ad_account_id}/ads_credit/discounts | Get ads credit discounts
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
*BusinessAccessRelationshipsApi* | [**deleteBusinessMembership**](docs/Api/BusinessAccessRelationshipsApi.md#deletebusinessmembership) | **DELETE** /businesses/{business_id}/members | Terminate business memberships
*BusinessAccessRelationshipsApi* | [**deleteBusinessPartners**](docs/Api/BusinessAccessRelationshipsApi.md#deletebusinesspartners) | **DELETE** /businesses/{business_id}/partners | Terminate business partnerships
*BusinessAccessRelationshipsApi* | [**getBusinessEmployers**](docs/Api/BusinessAccessRelationshipsApi.md#getbusinessemployers) | **GET** /businesses/employers | List business employers for user
*BusinessAccessRelationshipsApi* | [**getBusinessMembers**](docs/Api/BusinessAccessRelationshipsApi.md#getbusinessmembers) | **GET** /businesses/{business_id}/members | Get business members
*BusinessAccessRelationshipsApi* | [**getBusinessPartners**](docs/Api/BusinessAccessRelationshipsApi.md#getbusinesspartners) | **GET** /businesses/{business_id}/partners | Get business partners
*BusinessAccessRelationshipsApi* | [**updateBusinessMemberships**](docs/Api/BusinessAccessRelationshipsApi.md#updatebusinessmemberships) | **PATCH** /businesses/{business_id}/members | Update member&#39;s business role
*CampaignsApi* | [**campaignTargetingAnalyticsGet**](docs/Api/CampaignsApi.md#campaigntargetinganalyticsget) | **GET** /ad_accounts/{ad_account_id}/campaigns/targeting_analytics | Get targeting analytics for campaigns
*CampaignsApi* | [**campaignsAnalytics**](docs/Api/CampaignsApi.md#campaignsanalytics) | **GET** /ad_accounts/{ad_account_id}/campaigns/analytics | Get campaign analytics
*CampaignsApi* | [**campaignsCreate**](docs/Api/CampaignsApi.md#campaignscreate) | **POST** /ad_accounts/{ad_account_id}/campaigns | Create campaigns
*CampaignsApi* | [**campaignsGet**](docs/Api/CampaignsApi.md#campaignsget) | **GET** /ad_accounts/{ad_account_id}/campaigns/{campaign_id} | Get campaign
*CampaignsApi* | [**campaignsList**](docs/Api/CampaignsApi.md#campaignslist) | **GET** /ad_accounts/{ad_account_id}/campaigns | List campaigns
*CampaignsApi* | [**campaignsUpdate**](docs/Api/CampaignsApi.md#campaignsupdate) | **PATCH** /ad_accounts/{ad_account_id}/campaigns | Update campaigns
*CatalogsApi* | [**catalogsCreate**](docs/Api/CatalogsApi.md#catalogscreate) | **POST** /catalogs | Create catalog
*CatalogsApi* | [**catalogsList**](docs/Api/CatalogsApi.md#catalogslist) | **GET** /catalogs | List catalogs
*CatalogsApi* | [**catalogsProductGroupPinsList**](docs/Api/CatalogsApi.md#catalogsproductgrouppinslist) | **GET** /catalogs/product_groups/{product_group_id}/products | List products by product group
*CatalogsApi* | [**catalogsProductGroupsCreate**](docs/Api/CatalogsApi.md#catalogsproductgroupscreate) | **POST** /catalogs/product_groups | Create product group
*CatalogsApi* | [**catalogsProductGroupsCreateMany**](docs/Api/CatalogsApi.md#catalogsproductgroupscreatemany) | **POST** /catalogs/product_groups/multiple | Create product groups
*CatalogsApi* | [**catalogsProductGroupsDelete**](docs/Api/CatalogsApi.md#catalogsproductgroupsdelete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group
*CatalogsApi* | [**catalogsProductGroupsDeleteMany**](docs/Api/CatalogsApi.md#catalogsproductgroupsdeletemany) | **DELETE** /catalogs/product_groups/multiple | Delete product groups
*CatalogsApi* | [**catalogsProductGroupsGet**](docs/Api/CatalogsApi.md#catalogsproductgroupsget) | **GET** /catalogs/product_groups/{product_group_id} | Get product group
*CatalogsApi* | [**catalogsProductGroupsList**](docs/Api/CatalogsApi.md#catalogsproductgroupslist) | **GET** /catalogs/product_groups | List product groups
*CatalogsApi* | [**catalogsProductGroupsProductCountsGet**](docs/Api/CatalogsApi.md#catalogsproductgroupsproductcountsget) | **GET** /catalogs/product_groups/{product_group_id}/product_counts | Get product counts
*CatalogsApi* | [**catalogsProductGroupsUpdate**](docs/Api/CatalogsApi.md#catalogsproductgroupsupdate) | **PATCH** /catalogs/product_groups/{product_group_id} | Update single product group
*CatalogsApi* | [**feedProcessingResultsList**](docs/Api/CatalogsApi.md#feedprocessingresultslist) | **GET** /catalogs/feeds/{feed_id}/processing_results | List feed processing results
*CatalogsApi* | [**feedsCreate**](docs/Api/CatalogsApi.md#feedscreate) | **POST** /catalogs/feeds | Create feed
*CatalogsApi* | [**feedsDelete**](docs/Api/CatalogsApi.md#feedsdelete) | **DELETE** /catalogs/feeds/{feed_id} | Delete feed
*CatalogsApi* | [**feedsGet**](docs/Api/CatalogsApi.md#feedsget) | **GET** /catalogs/feeds/{feed_id} | Get feed
*CatalogsApi* | [**feedsIngest**](docs/Api/CatalogsApi.md#feedsingest) | **POST** /catalogs/feeds/{feed_id}/ingest | Ingest feed items
*CatalogsApi* | [**feedsList**](docs/Api/CatalogsApi.md#feedslist) | **GET** /catalogs/feeds | List feeds
*CatalogsApi* | [**feedsUpdate**](docs/Api/CatalogsApi.md#feedsupdate) | **PATCH** /catalogs/feeds/{feed_id} | Update feed
*CatalogsApi* | [**itemsBatchGet**](docs/Api/CatalogsApi.md#itemsbatchget) | **GET** /catalogs/items/batch/{batch_id} | Get item batch status
*CatalogsApi* | [**itemsBatchPost**](docs/Api/CatalogsApi.md#itemsbatchpost) | **POST** /catalogs/items/batch | Operate on item batch
*CatalogsApi* | [**itemsGet**](docs/Api/CatalogsApi.md#itemsget) | **GET** /catalogs/items | Get catalogs items
*CatalogsApi* | [**itemsIssuesList**](docs/Api/CatalogsApi.md#itemsissueslist) | **GET** /catalogs/processing_results/{processing_result_id}/item_issues | List item issues
*CatalogsApi* | [**itemsPost**](docs/Api/CatalogsApi.md#itemspost) | **POST** /catalogs/items | Get catalogs items (POST)
*CatalogsApi* | [**productsByProductGroupFilterList**](docs/Api/CatalogsApi.md#productsbyproductgroupfilterlist) | **POST** /catalogs/products/get_by_product_group_filters | List products by filter
*CatalogsApi* | [**reportsCreate**](docs/Api/CatalogsApi.md#reportscreate) | **POST** /catalogs/reports | Build catalogs report
*CatalogsApi* | [**reportsGet**](docs/Api/CatalogsApi.md#reportsget) | **GET** /catalogs/reports | Get catalogs report
*CatalogsApi* | [**reportsStats**](docs/Api/CatalogsApi.md#reportsstats) | **GET** /catalogs/reports/stats | List report stats
*ConversionEventsApi* | [**eventsCreate**](docs/Api/ConversionEventsApi.md#eventscreate) | **POST** /ad_accounts/{ad_account_id}/events | Send conversions
*ConversionTagsApi* | [**conversionTagsCreate**](docs/Api/ConversionTagsApi.md#conversiontagscreate) | **POST** /ad_accounts/{ad_account_id}/conversion_tags | Create conversion tag
*ConversionTagsApi* | [**conversionTagsGet**](docs/Api/ConversionTagsApi.md#conversiontagsget) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id} | Get conversion tag
*ConversionTagsApi* | [**conversionTagsList**](docs/Api/ConversionTagsApi.md#conversiontagslist) | **GET** /ad_accounts/{ad_account_id}/conversion_tags | Get conversion tags
*ConversionTagsApi* | [**ocpmEligibleConversionTagsGet**](docs/Api/ConversionTagsApi.md#ocpmeligibleconversiontagsget) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible | Get Ocpm eligible conversion tags
*ConversionTagsApi* | [**pageVisitConversionTagsGet**](docs/Api/ConversionTagsApi.md#pagevisitconversiontagsget) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/page_visit | Get page visit conversion tags
*CustomerListsApi* | [**customerListsCreate**](docs/Api/CustomerListsApi.md#customerlistscreate) | **POST** /ad_accounts/{ad_account_id}/customer_lists | Create customer lists
*CustomerListsApi* | [**customerListsGet**](docs/Api/CustomerListsApi.md#customerlistsget) | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Get customer list
*CustomerListsApi* | [**customerListsList**](docs/Api/CustomerListsApi.md#customerlistslist) | **GET** /ad_accounts/{ad_account_id}/customer_lists | Get customer lists
*CustomerListsApi* | [**customerListsUpdate**](docs/Api/CustomerListsApi.md#customerlistsupdate) | **PATCH** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Update customer list
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
*LeadAdsApi* | [**adAccountsSubscriptionsDelById**](docs/Api/LeadAdsApi.md#adaccountssubscriptionsdelbyid) | **DELETE** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Delete lead ads subscription
*LeadAdsApi* | [**adAccountsSubscriptionsGetById**](docs/Api/LeadAdsApi.md#adaccountssubscriptionsgetbyid) | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Get lead ads subscription
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
*OauthApi* | [**oauthToken**](docs/Api/OauthApi.md#oauthtoken) | **POST** /oauth/token | Generate OAuth access token
*OrderLinesApi* | [**orderLinesGet**](docs/Api/OrderLinesApi.md#orderlinesget) | **GET** /ad_accounts/{ad_account_id}/order_lines/{order_line_id} | Get order line
*OrderLinesApi* | [**orderLinesList**](docs/Api/OrderLinesApi.md#orderlineslist) | **GET** /ad_accounts/{ad_account_id}/order_lines | Get order lines
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
*ResourcesApi* | [**adAccountCountriesGet**](docs/Api/ResourcesApi.md#adaccountcountriesget) | **GET** /resources/ad_account_countries | Get ad accounts countries
*ResourcesApi* | [**deliveryMetricsGet**](docs/Api/ResourcesApi.md#deliverymetricsget) | **GET** /resources/delivery_metrics | Get available metrics&#39; definitions
*ResourcesApi* | [**interestTargetingOptionsGet**](docs/Api/ResourcesApi.md#interesttargetingoptionsget) | **GET** /resources/targeting/interests/{interest_id} | Get interest details
*ResourcesApi* | [**leadFormQuestionsGet**](docs/Api/ResourcesApi.md#leadformquestionsget) | **GET** /resources/lead_form_questions | Get lead form questions
*ResourcesApi* | [**metricsReadyStateGet**](docs/Api/ResourcesApi.md#metricsreadystateget) | **GET** /resources/metrics_ready_state | Get metrics ready state
*ResourcesApi* | [**targetingOptionsGet**](docs/Api/ResourcesApi.md#targetingoptionsget) | **GET** /resources/targeting/{targeting_type} | Get targeting options
*SearchApi* | [**searchPartnerPins**](docs/Api/SearchApi.md#searchpartnerpins) | **GET** /search/partner/pins | Search pins by a given search term
*SearchApi* | [**searchUserBoardsGet**](docs/Api/SearchApi.md#searchuserboardsget) | **GET** /search/boards | Search user&#39;s boards
*SearchApi* | [**searchUserPinsList**](docs/Api/SearchApi.md#searchuserpinslist) | **GET** /search/pins | Search user&#39;s Pins
*TargetingTemplateApi* | [**targetingTemplateCreate**](docs/Api/TargetingTemplateApi.md#targetingtemplatecreate) | **POST** /ad_accounts/{ad_account_id}/targeting_templates | Create targeting templates
*TargetingTemplateApi* | [**targetingTemplateList**](docs/Api/TargetingTemplateApi.md#targetingtemplatelist) | **GET** /ad_accounts/{ad_account_id}/targeting_templates | List targeting templates
*TargetingTemplateApi* | [**targetingTemplateUpdate**](docs/Api/TargetingTemplateApi.md#targetingtemplateupdate) | **PATCH** /ad_accounts/{ad_account_id}/targeting_templates | Update targeting templates
*TermsApi* | [**termsRelatedList**](docs/Api/TermsApi.md#termsrelatedlist) | **GET** /terms/related | List related terms
*TermsApi* | [**termsSuggestedList**](docs/Api/TermsApi.md#termssuggestedlist) | **GET** /terms/suggested | List suggested terms
*TermsOfServiceApi* | [**termsOfServiceGet**](docs/Api/TermsOfServiceApi.md#termsofserviceget) | **GET** /ad_accounts/{ad_account_id}/terms_of_service | Get terms of service
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
- [ActionType](docs/Model/ActionType.md)
- [AdAccount](docs/Model/AdAccount.md)
- [AdAccountAnalyticsResponseInner](docs/Model/AdAccountAnalyticsResponseInner.md)
- [AdAccountCreateRequest](docs/Model/AdAccountCreateRequest.md)
- [AdAccountCreateSubscriptionRequest](docs/Model/AdAccountCreateSubscriptionRequest.md)
- [AdAccountCreateSubscriptionRequestPartnerMetadata](docs/Model/AdAccountCreateSubscriptionRequestPartnerMetadata.md)
- [AdAccountCreateSubscriptionResponse](docs/Model/AdAccountCreateSubscriptionResponse.md)
- [AdAccountGetSubscriptionResponse](docs/Model/AdAccountGetSubscriptionResponse.md)
- [AdAccountOwner](docs/Model/AdAccountOwner.md)
- [AdAccountsAudiencesSharedAccountsList200Response](docs/Model/AdAccountsAudiencesSharedAccountsList200Response.md)
- [AdAccountsCountryResponse](docs/Model/AdAccountsCountryResponse.md)
- [AdAccountsCountryResponseData](docs/Model/AdAccountsCountryResponseData.md)
- [AdAccountsList200Response](docs/Model/AdAccountsList200Response.md)
- [AdAccountsSubscriptionsGetList200Response](docs/Model/AdAccountsSubscriptionsGetList200Response.md)
- [AdArrayResponse](docs/Model/AdArrayResponse.md)
- [AdArrayResponseElement](docs/Model/AdArrayResponseElement.md)
- [AdCommon](docs/Model/AdCommon.md)
- [AdCountry](docs/Model/AdCountry.md)
- [AdCreateRequest](docs/Model/AdCreateRequest.md)
- [AdGroupArrayResponse](docs/Model/AdGroupArrayResponse.md)
- [AdGroupArrayResponseElement](docs/Model/AdGroupArrayResponseElement.md)
- [AdGroupAudienceSizingRequest](docs/Model/AdGroupAudienceSizingRequest.md)
- [AdGroupAudienceSizingRequestKeywordsInner](docs/Model/AdGroupAudienceSizingRequestKeywordsInner.md)
- [AdGroupAudienceSizingResponse](docs/Model/AdGroupAudienceSizingResponse.md)
- [AdGroupCommon](docs/Model/AdGroupCommon.md)
- [AdGroupCreateRequest](docs/Model/AdGroupCreateRequest.md)
- [AdGroupResponse](docs/Model/AdGroupResponse.md)
- [AdGroupSummaryStatus](docs/Model/AdGroupSummaryStatus.md)
- [AdGroupUpdateRequest](docs/Model/AdGroupUpdateRequest.md)
- [AdGroupsAnalyticsResponseInner](docs/Model/AdGroupsAnalyticsResponseInner.md)
- [AdGroupsList200Response](docs/Model/AdGroupsList200Response.md)
- [AdPinId](docs/Model/AdPinId.md)
- [AdPreviewCreateFromImage](docs/Model/AdPreviewCreateFromImage.md)
- [AdPreviewCreateFromPin](docs/Model/AdPreviewCreateFromPin.md)
- [AdPreviewRequest](docs/Model/AdPreviewRequest.md)
- [AdPreviewURLResponse](docs/Model/AdPreviewURLResponse.md)
- [AdResponse](docs/Model/AdResponse.md)
- [AdUpdateRequest](docs/Model/AdUpdateRequest.md)
- [AdsAnalyticsAdTargetingType](docs/Model/AdsAnalyticsAdTargetingType.md)
- [AdsAnalyticsCampaignTargetingType](docs/Model/AdsAnalyticsCampaignTargetingType.md)
- [AdsAnalyticsCreateAsyncRequest](docs/Model/AdsAnalyticsCreateAsyncRequest.md)
- [AdsAnalyticsCreateAsyncResponse](docs/Model/AdsAnalyticsCreateAsyncResponse.md)
- [AdsAnalyticsFilterColumn](docs/Model/AdsAnalyticsFilterColumn.md)
- [AdsAnalyticsFilterOperator](docs/Model/AdsAnalyticsFilterOperator.md)
- [AdsAnalyticsGetAsyncResponse](docs/Model/AdsAnalyticsGetAsyncResponse.md)
- [AdsAnalyticsMetricsFilter](docs/Model/AdsAnalyticsMetricsFilter.md)
- [AdsAnalyticsResponseInner](docs/Model/AdsAnalyticsResponseInner.md)
- [AdsAnalyticsTargetingType](docs/Model/AdsAnalyticsTargetingType.md)
- [AdsCreditDiscountsResponse](docs/Model/AdsCreditDiscountsResponse.md)
- [AdsCreditRedeemRequest](docs/Model/AdsCreditRedeemRequest.md)
- [AdsCreditRedeemResponse](docs/Model/AdsCreditRedeemResponse.md)
- [AdsCreditsDiscountsGet200Response](docs/Model/AdsCreditsDiscountsGet200Response.md)
- [AdsList200Response](docs/Model/AdsList200Response.md)
- [AdvancedAuctionBidOptions](docs/Model/AdvancedAuctionBidOptions.md)
- [AdvancedAuctionItem](docs/Model/AdvancedAuctionItem.md)
- [AdvancedAuctionItems](docs/Model/AdvancedAuctionItems.md)
- [AdvancedAuctionItemsGetRecord](docs/Model/AdvancedAuctionItemsGetRecord.md)
- [AdvancedAuctionItemsGetRequest](docs/Model/AdvancedAuctionItemsGetRequest.md)
- [AdvancedAuctionItemsSubmitDeleteRecord](docs/Model/AdvancedAuctionItemsSubmitDeleteRecord.md)
- [AdvancedAuctionItemsSubmitRecord](docs/Model/AdvancedAuctionItemsSubmitRecord.md)
- [AdvancedAuctionItemsSubmitRequest](docs/Model/AdvancedAuctionItemsSubmitRequest.md)
- [AdvancedAuctionItemsSubmitUpsertRecord](docs/Model/AdvancedAuctionItemsSubmitUpsertRecord.md)
- [AdvancedAuctionKey](docs/Model/AdvancedAuctionKey.md)
- [AdvancedAuctionOperation](docs/Model/AdvancedAuctionOperation.md)
- [AdvancedAuctionOperationError](docs/Model/AdvancedAuctionOperationError.md)
- [AdvancedAuctionProcessedItem](docs/Model/AdvancedAuctionProcessedItem.md)
- [AdvancedAuctionProcessedItems](docs/Model/AdvancedAuctionProcessedItems.md)
- [AnalyticsDailyMetrics](docs/Model/AnalyticsDailyMetrics.md)
- [AnalyticsMetricsResponse](docs/Model/AnalyticsMetricsResponse.md)
- [AppTypeMultipliers](docs/Model/AppTypeMultipliers.md)
- [AssetGroupBinding](docs/Model/AssetGroupBinding.md)
- [AssetGroupType](docs/Model/AssetGroupType.md)
- [AssetIdPermissions](docs/Model/AssetIdPermissions.md)
- [Audience](docs/Model/Audience.md)
- [AudienceAccountType](docs/Model/AudienceAccountType.md)
- [AudienceCategory](docs/Model/AudienceCategory.md)
- [AudienceCommon](docs/Model/AudienceCommon.md)
- [AudienceCreateCustomRequest](docs/Model/AudienceCreateCustomRequest.md)
- [AudienceCreateRequest](docs/Model/AudienceCreateRequest.md)
- [AudienceCreateRequest1AudienceType](docs/Model/AudienceCreateRequest1AudienceType.md)
- [AudienceDataParty](docs/Model/AudienceDataParty.md)
- [AudienceDefinition](docs/Model/AudienceDefinition.md)
- [AudienceDefinitionResponse](docs/Model/AudienceDefinitionResponse.md)
- [AudienceDemographicValue](docs/Model/AudienceDemographicValue.md)
- [AudienceDemographics](docs/Model/AudienceDemographics.md)
- [AudienceInsightCategoryArrayResponse](docs/Model/AudienceInsightCategoryArrayResponse.md)
- [AudienceInsightCategoryCommon](docs/Model/AudienceInsightCategoryCommon.md)
- [AudienceInsightType](docs/Model/AudienceInsightType.md)
- [AudienceInsightsResponse](docs/Model/AudienceInsightsResponse.md)
- [AudienceRule](docs/Model/AudienceRule.md)
- [AudienceShareType](docs/Model/AudienceShareType.md)
- [AudienceSharingType](docs/Model/AudienceSharingType.md)
- [AudienceSubcategory](docs/Model/AudienceSubcategory.md)
- [AudienceType](docs/Model/AudienceType.md)
- [AudienceUpdateOperationType](docs/Model/AudienceUpdateOperationType.md)
- [AudienceUpdateRequest](docs/Model/AudienceUpdateRequest.md)
- [AudiencesList200Response](docs/Model/AudiencesList200Response.md)
- [AuthRespondInvitesBody](docs/Model/AuthRespondInvitesBody.md)
- [AuthRespondInvitesBodyInvitesInner](docs/Model/AuthRespondInvitesBodyInvitesInner.md)
- [AuthRespondInvitesBodyInvitesInnerAction](docs/Model/AuthRespondInvitesBodyInvitesInnerAction.md)
- [AvailabilityFilter](docs/Model/AvailabilityFilter.md)
- [BaseInviteDataResponse](docs/Model/BaseInviteDataResponse.md)
- [BaseInviteDataResponseInviteData](docs/Model/BaseInviteDataResponseInviteData.md)
- [BatchOperation](docs/Model/BatchOperation.md)
- [BatchOperationStatus](docs/Model/BatchOperationStatus.md)
- [BidFloor](docs/Model/BidFloor.md)
- [BidFloorRequest](docs/Model/BidFloorRequest.md)
- [BidFloorSpec](docs/Model/BidFloorSpec.md)
- [BillingProfilesGet200Response](docs/Model/BillingProfilesGet200Response.md)
- [BillingProfilesResponse](docs/Model/BillingProfilesResponse.md)
- [Board](docs/Model/Board.md)
- [BoardMedia](docs/Model/BoardMedia.md)
- [BoardOwner](docs/Model/BoardOwner.md)
- [BoardSection](docs/Model/BoardSection.md)
- [BoardSectionsList200Response](docs/Model/BoardSectionsList200Response.md)
- [BoardUpdate](docs/Model/BoardUpdate.md)
- [BoardsList200Response](docs/Model/BoardsList200Response.md)
- [BoardsListPins200Response](docs/Model/BoardsListPins200Response.md)
- [BoardsUserFollowsList200Response](docs/Model/BoardsUserFollowsList200Response.md)
- [BookClosedResponse](docs/Model/BookClosedResponse.md)
- [BrandFilter](docs/Model/BrandFilter.md)
- [BudgetType](docs/Model/BudgetType.md)
- [BulkDownloadRequest](docs/Model/BulkDownloadRequest.md)
- [BulkDownloadRequestCampaignFilter](docs/Model/BulkDownloadRequestCampaignFilter.md)
- [BulkDownloadResponse](docs/Model/BulkDownloadResponse.md)
- [BulkEntityType](docs/Model/BulkEntityType.md)
- [BulkOutputFormat](docs/Model/BulkOutputFormat.md)
- [BulkReportingJobStatus](docs/Model/BulkReportingJobStatus.md)
- [BulkUpsertRequest](docs/Model/BulkUpsertRequest.md)
- [BulkUpsertRequestCreate](docs/Model/BulkUpsertRequestCreate.md)
- [BulkUpsertRequestUpdate](docs/Model/BulkUpsertRequestUpdate.md)
- [BulkUpsertResponse](docs/Model/BulkUpsertResponse.md)
- [BulkUpsertStatus](docs/Model/BulkUpsertStatus.md)
- [BulkUpsertStatusResponse](docs/Model/BulkUpsertStatusResponse.md)
- [BusinessAccessError](docs/Model/BusinessAccessError.md)
- [BusinessAccessRole](docs/Model/BusinessAccessRole.md)
- [BusinessAccessUserSummary](docs/Model/BusinessAccessUserSummary.md)
- [BusinessAssetMembersGet200Response](docs/Model/BusinessAssetMembersGet200Response.md)
- [BusinessAssetPartnersGet200Response](docs/Model/BusinessAssetPartnersGet200Response.md)
- [BusinessAssetsGet200Response](docs/Model/BusinessAssetsGet200Response.md)
- [BusinessMemberAssetsGet200Response](docs/Model/BusinessMemberAssetsGet200Response.md)
- [BusinessMemberAssetsSummary](docs/Model/BusinessMemberAssetsSummary.md)
- [BusinessMemberAssetsSummaryAdAccountsInner](docs/Model/BusinessMemberAssetsSummaryAdAccountsInner.md)
- [BusinessMemberAssetsSummaryProfilesInner](docs/Model/BusinessMemberAssetsSummaryProfilesInner.md)
- [BusinessMembersAssetAccessDeleteRequest](docs/Model/BusinessMembersAssetAccessDeleteRequest.md)
- [BusinessMembersAssetAccessDeleteRequestAccessesInner](docs/Model/BusinessMembersAssetAccessDeleteRequestAccessesInner.md)
- [BusinessPartnerAssetAccessGet200Response](docs/Model/BusinessPartnerAssetAccessGet200Response.md)
- [BusinessRole](docs/Model/BusinessRole.md)
- [BusinessRoleCheckMode](docs/Model/BusinessRoleCheckMode.md)
- [BusinessRoleForMembers](docs/Model/BusinessRoleForMembers.md)
- [BusinessSharedAudience](docs/Model/BusinessSharedAudience.md)
- [BusinessSharedAudienceResponse](docs/Model/BusinessSharedAudienceResponse.md)
- [CampaignCommon](docs/Model/CampaignCommon.md)
- [CampaignCreateCommon](docs/Model/CampaignCreateCommon.md)
- [CampaignCreateRequest](docs/Model/CampaignCreateRequest.md)
- [CampaignCreateResponse](docs/Model/CampaignCreateResponse.md)
- [CampaignCreateResponseData](docs/Model/CampaignCreateResponseData.md)
- [CampaignCreateResponseItem](docs/Model/CampaignCreateResponseItem.md)
- [CampaignId](docs/Model/CampaignId.md)
- [CampaignResponse](docs/Model/CampaignResponse.md)
- [CampaignSummaryStatus](docs/Model/CampaignSummaryStatus.md)
- [CampaignUpdateRequest](docs/Model/CampaignUpdateRequest.md)
- [CampaignUpdateResponse](docs/Model/CampaignUpdateResponse.md)
- [CampaignsAnalyticsResponseInner](docs/Model/CampaignsAnalyticsResponseInner.md)
- [CampaignsList200Response](docs/Model/CampaignsList200Response.md)
- [CancelInvitesBody](docs/Model/CancelInvitesBody.md)
- [Catalog](docs/Model/Catalog.md)
- [CatalogsCreateCreativeAssetsItem](docs/Model/CatalogsCreateCreativeAssetsItem.md)
- [CatalogsCreateHotelItem](docs/Model/CatalogsCreateHotelItem.md)
- [CatalogsCreateReportResponse](docs/Model/CatalogsCreateReportResponse.md)
- [CatalogsCreateRequest](docs/Model/CatalogsCreateRequest.md)
- [CatalogsCreateRetailItem](docs/Model/CatalogsCreateRetailItem.md)
- [CatalogsCreativeAssetsAttributes](docs/Model/CatalogsCreativeAssetsAttributes.md)
- [CatalogsCreativeAssetsBatchItem](docs/Model/CatalogsCreativeAssetsBatchItem.md)
- [CatalogsCreativeAssetsBatchRequest](docs/Model/CatalogsCreativeAssetsBatchRequest.md)
- [CatalogsCreativeAssetsFeed](docs/Model/CatalogsCreativeAssetsFeed.md)
- [CatalogsCreativeAssetsFeedsCreateRequest](docs/Model/CatalogsCreativeAssetsFeedsCreateRequest.md)
- [CatalogsCreativeAssetsFeedsUpdateRequest](docs/Model/CatalogsCreativeAssetsFeedsUpdateRequest.md)
- [CatalogsCreativeAssetsItemErrorResponse](docs/Model/CatalogsCreativeAssetsItemErrorResponse.md)
- [CatalogsCreativeAssetsItemResponse](docs/Model/CatalogsCreativeAssetsItemResponse.md)
- [CatalogsCreativeAssetsItemsBatch](docs/Model/CatalogsCreativeAssetsItemsBatch.md)
- [CatalogsCreativeAssetsItemsFilter](docs/Model/CatalogsCreativeAssetsItemsFilter.md)
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
- [CatalogsDbItem](docs/Model/CatalogsDbItem.md)
- [CatalogsDeleteCreativeAssetsItem](docs/Model/CatalogsDeleteCreativeAssetsItem.md)
- [CatalogsDeleteHotelItem](docs/Model/CatalogsDeleteHotelItem.md)
- [CatalogsDeleteRetailItem](docs/Model/CatalogsDeleteRetailItem.md)
- [CatalogsFeed](docs/Model/CatalogsFeed.md)
- [CatalogsFeedCredentials](docs/Model/CatalogsFeedCredentials.md)
- [CatalogsFeedIngestion](docs/Model/CatalogsFeedIngestion.md)
- [CatalogsFeedIngestionDetails](docs/Model/CatalogsFeedIngestionDetails.md)
- [CatalogsFeedIngestionErrors](docs/Model/CatalogsFeedIngestionErrors.md)
- [CatalogsFeedIngestionInfo](docs/Model/CatalogsFeedIngestionInfo.md)
- [CatalogsFeedIngestionWarnings](docs/Model/CatalogsFeedIngestionWarnings.md)
- [CatalogsFeedProcessingResult](docs/Model/CatalogsFeedProcessingResult.md)
- [CatalogsFeedProcessingSchedule](docs/Model/CatalogsFeedProcessingSchedule.md)
- [CatalogsFeedProcessingStatus](docs/Model/CatalogsFeedProcessingStatus.md)
- [CatalogsFeedProductCounts](docs/Model/CatalogsFeedProductCounts.md)
- [CatalogsFeedValidationDetails](docs/Model/CatalogsFeedValidationDetails.md)
- [CatalogsFeedValidationErrors](docs/Model/CatalogsFeedValidationErrors.md)
- [CatalogsFeedValidationWarnings](docs/Model/CatalogsFeedValidationWarnings.md)
- [CatalogsFeedsCreateRequest](docs/Model/CatalogsFeedsCreateRequest.md)
- [CatalogsFeedsCreateRequestDefaultLocale](docs/Model/CatalogsFeedsCreateRequestDefaultLocale.md)
- [CatalogsFeedsUpdateRequest](docs/Model/CatalogsFeedsUpdateRequest.md)
- [CatalogsFormat](docs/Model/CatalogsFormat.md)
- [CatalogsHotelAddress](docs/Model/CatalogsHotelAddress.md)
- [CatalogsHotelAttributes](docs/Model/CatalogsHotelAttributes.md)
- [CatalogsHotelAttributesAllOfMainImage](docs/Model/CatalogsHotelAttributesAllOfMainImage.md)
- [CatalogsHotelBatchItem](docs/Model/CatalogsHotelBatchItem.md)
- [CatalogsHotelBatchRequest](docs/Model/CatalogsHotelBatchRequest.md)
- [CatalogsHotelFeed](docs/Model/CatalogsHotelFeed.md)
- [CatalogsHotelFeedsCreateRequest](docs/Model/CatalogsHotelFeedsCreateRequest.md)
- [CatalogsHotelFeedsUpdateRequest](docs/Model/CatalogsHotelFeedsUpdateRequest.md)
- [CatalogsHotelGuestRatings](docs/Model/CatalogsHotelGuestRatings.md)
- [CatalogsHotelItemErrorResponse](docs/Model/CatalogsHotelItemErrorResponse.md)
- [CatalogsHotelItemResponse](docs/Model/CatalogsHotelItemResponse.md)
- [CatalogsHotelItemsBatch](docs/Model/CatalogsHotelItemsBatch.md)
- [CatalogsHotelItemsFilter](docs/Model/CatalogsHotelItemsFilter.md)
- [CatalogsHotelItemsPostFilter](docs/Model/CatalogsHotelItemsPostFilter.md)
- [CatalogsHotelListProductsByCatalogBasedFilterRequest](docs/Model/CatalogsHotelListProductsByCatalogBasedFilterRequest.md)
- [CatalogsHotelProduct](docs/Model/CatalogsHotelProduct.md)
- [CatalogsHotelProductGroup](docs/Model/CatalogsHotelProductGroup.md)
- [CatalogsHotelProductGroupCreateRequest](docs/Model/CatalogsHotelProductGroupCreateRequest.md)
- [CatalogsHotelProductGroupFilterKeys](docs/Model/CatalogsHotelProductGroupFilterKeys.md)
- [CatalogsHotelProductGroupFilters](docs/Model/CatalogsHotelProductGroupFilters.md)
- [CatalogsHotelProductGroupFiltersAllOf](docs/Model/CatalogsHotelProductGroupFiltersAllOf.md)
- [CatalogsHotelProductGroupFiltersAnyOf](docs/Model/CatalogsHotelProductGroupFiltersAnyOf.md)
- [CatalogsHotelProductGroupProductCounts](docs/Model/CatalogsHotelProductGroupProductCounts.md)
- [CatalogsHotelProductGroupUpdateRequest](docs/Model/CatalogsHotelProductGroupUpdateRequest.md)
- [CatalogsHotelProductMetadata](docs/Model/CatalogsHotelProductMetadata.md)
- [CatalogsHotelReportParameters](docs/Model/CatalogsHotelReportParameters.md)
- [CatalogsHotelReportParametersReport](docs/Model/CatalogsHotelReportParametersReport.md)
- [CatalogsItemValidationDetails](docs/Model/CatalogsItemValidationDetails.md)
- [CatalogsItemValidationErrors](docs/Model/CatalogsItemValidationErrors.md)
- [CatalogsItemValidationIssue](docs/Model/CatalogsItemValidationIssue.md)
- [CatalogsItemValidationIssues](docs/Model/CatalogsItemValidationIssues.md)
- [CatalogsItemValidationWarnings](docs/Model/CatalogsItemValidationWarnings.md)
- [CatalogsItems](docs/Model/CatalogsItems.md)
- [CatalogsItemsBatch](docs/Model/CatalogsItemsBatch.md)
- [CatalogsItemsBatchRequest](docs/Model/CatalogsItemsBatchRequest.md)
- [CatalogsItemsCreateBatchRequest](docs/Model/CatalogsItemsCreateBatchRequest.md)
- [CatalogsItemsDeleteBatchRequest](docs/Model/CatalogsItemsDeleteBatchRequest.md)
- [CatalogsItemsDeleteDiscontinuedBatchRequest](docs/Model/CatalogsItemsDeleteDiscontinuedBatchRequest.md)
- [CatalogsItemsFilters](docs/Model/CatalogsItemsFilters.md)
- [CatalogsItemsPostFilters](docs/Model/CatalogsItemsPostFilters.md)
- [CatalogsItemsRequest](docs/Model/CatalogsItemsRequest.md)
- [CatalogsItemsRequestLanguage](docs/Model/CatalogsItemsRequestLanguage.md)
- [CatalogsItemsUpdateBatchRequest](docs/Model/CatalogsItemsUpdateBatchRequest.md)
- [CatalogsItemsUpsertBatchRequest](docs/Model/CatalogsItemsUpsertBatchRequest.md)
- [CatalogsList200Response](docs/Model/CatalogsList200Response.md)
- [CatalogsListProductsByFeedBasedFilter](docs/Model/CatalogsListProductsByFeedBasedFilter.md)
- [CatalogsListProductsByFilterRequest](docs/Model/CatalogsListProductsByFilterRequest.md)
- [CatalogsLocale](docs/Model/CatalogsLocale.md)
- [CatalogsProduct](docs/Model/CatalogsProduct.md)
- [CatalogsProductGroupCreateRequest](docs/Model/CatalogsProductGroupCreateRequest.md)
- [CatalogsProductGroupCurrencyCriteria](docs/Model/CatalogsProductGroupCurrencyCriteria.md)
- [CatalogsProductGroupFilterKeys](docs/Model/CatalogsProductGroupFilterKeys.md)
- [CatalogsProductGroupFilters](docs/Model/CatalogsProductGroupFilters.md)
- [CatalogsProductGroupFiltersAllOf](docs/Model/CatalogsProductGroupFiltersAllOf.md)
- [CatalogsProductGroupFiltersAnyOf](docs/Model/CatalogsProductGroupFiltersAnyOf.md)
- [CatalogsProductGroupFiltersRequest](docs/Model/CatalogsProductGroupFiltersRequest.md)
- [CatalogsProductGroupFiltersRequestAnyOf](docs/Model/CatalogsProductGroupFiltersRequestAnyOf.md)
- [CatalogsProductGroupFiltersRequestAnyOf1](docs/Model/CatalogsProductGroupFiltersRequestAnyOf1.md)
- [CatalogsProductGroupMultipleCountriesCriteria](docs/Model/CatalogsProductGroupMultipleCountriesCriteria.md)
- [CatalogsProductGroupMultipleGenderCriteria](docs/Model/CatalogsProductGroupMultipleGenderCriteria.md)
- [CatalogsProductGroupMultipleMediaTypesCriteria](docs/Model/CatalogsProductGroupMultipleMediaTypesCriteria.md)
- [CatalogsProductGroupMultipleStringCriteria](docs/Model/CatalogsProductGroupMultipleStringCriteria.md)
- [CatalogsProductGroupMultipleStringListCriteria](docs/Model/CatalogsProductGroupMultipleStringListCriteria.md)
- [CatalogsProductGroupPinsList200Response](docs/Model/CatalogsProductGroupPinsList200Response.md)
- [CatalogsProductGroupPricingCriteria](docs/Model/CatalogsProductGroupPricingCriteria.md)
- [CatalogsProductGroupPricingCurrencyCriteria](docs/Model/CatalogsProductGroupPricingCurrencyCriteria.md)
- [CatalogsProductGroupProductCountsVertical](docs/Model/CatalogsProductGroupProductCountsVertical.md)
- [CatalogsProductGroupStatus](docs/Model/CatalogsProductGroupStatus.md)
- [CatalogsProductGroupType](docs/Model/CatalogsProductGroupType.md)
- [CatalogsProductGroupUpdateRequest](docs/Model/CatalogsProductGroupUpdateRequest.md)
- [CatalogsProductGroupsList200Response](docs/Model/CatalogsProductGroupsList200Response.md)
- [CatalogsProductGroupsUpdateRequest](docs/Model/CatalogsProductGroupsUpdateRequest.md)
- [CatalogsReport](docs/Model/CatalogsReport.md)
- [CatalogsReportDistributionIssueFilter](docs/Model/CatalogsReportDistributionIssueFilter.md)
- [CatalogsReportDistributionStats](docs/Model/CatalogsReportDistributionStats.md)
- [CatalogsReportFeedIngestionFilter](docs/Model/CatalogsReportFeedIngestionFilter.md)
- [CatalogsReportFeedIngestionStats](docs/Model/CatalogsReportFeedIngestionStats.md)
- [CatalogsReportParameters](docs/Model/CatalogsReportParameters.md)
- [CatalogsReportStats](docs/Model/CatalogsReportStats.md)
- [CatalogsRetailBatchRequest](docs/Model/CatalogsRetailBatchRequest.md)
- [CatalogsRetailBatchRequestItemsInner](docs/Model/CatalogsRetailBatchRequestItemsInner.md)
- [CatalogsRetailFeed](docs/Model/CatalogsRetailFeed.md)
- [CatalogsRetailFeedsCreateRequest](docs/Model/CatalogsRetailFeedsCreateRequest.md)
- [CatalogsRetailFeedsUpdateRequest](docs/Model/CatalogsRetailFeedsUpdateRequest.md)
- [CatalogsRetailItemErrorResponse](docs/Model/CatalogsRetailItemErrorResponse.md)
- [CatalogsRetailItemResponse](docs/Model/CatalogsRetailItemResponse.md)
- [CatalogsRetailItemsBatch](docs/Model/CatalogsRetailItemsBatch.md)
- [CatalogsRetailItemsFilter](docs/Model/CatalogsRetailItemsFilter.md)
- [CatalogsRetailItemsPostFilter](docs/Model/CatalogsRetailItemsPostFilter.md)
- [CatalogsRetailListProductsByCatalogBasedFilterRequest](docs/Model/CatalogsRetailListProductsByCatalogBasedFilterRequest.md)
- [CatalogsRetailProduct](docs/Model/CatalogsRetailProduct.md)
- [CatalogsRetailProductGroup](docs/Model/CatalogsRetailProductGroup.md)
- [CatalogsRetailProductGroupCreateRequest](docs/Model/CatalogsRetailProductGroupCreateRequest.md)
- [CatalogsRetailProductGroupProductCounts](docs/Model/CatalogsRetailProductGroupProductCounts.md)
- [CatalogsRetailProductGroupUpdateRequest](docs/Model/CatalogsRetailProductGroupUpdateRequest.md)
- [CatalogsRetailProductMetadata](docs/Model/CatalogsRetailProductMetadata.md)
- [CatalogsRetailReportParameters](docs/Model/CatalogsRetailReportParameters.md)
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
- [ConditionFilter](docs/Model/ConditionFilter.md)
- [ConversionApiResponse](docs/Model/ConversionApiResponse.md)
- [ConversionApiResponseEventsInner](docs/Model/ConversionApiResponseEventsInner.md)
- [ConversionAttributionWindowDays](docs/Model/ConversionAttributionWindowDays.md)
- [ConversionEventResponse](docs/Model/ConversionEventResponse.md)
- [ConversionEvents](docs/Model/ConversionEvents.md)
- [ConversionEventsDataInner](docs/Model/ConversionEventsDataInner.md)
- [ConversionEventsDataInnerCustomData](docs/Model/ConversionEventsDataInnerCustomData.md)
- [ConversionEventsDataInnerCustomDataContentsInner](docs/Model/ConversionEventsDataInnerCustomDataContentsInner.md)
- [ConversionEventsUserData](docs/Model/ConversionEventsUserData.md)
- [ConversionEventsUserDataAnyOf](docs/Model/ConversionEventsUserDataAnyOf.md)
- [ConversionEventsUserDataAnyOf1](docs/Model/ConversionEventsUserDataAnyOf1.md)
- [ConversionEventsUserDataAnyOf2](docs/Model/ConversionEventsUserDataAnyOf2.md)
- [ConversionReportAttributionType](docs/Model/ConversionReportAttributionType.md)
- [ConversionReportTimeType](docs/Model/ConversionReportTimeType.md)
- [ConversionTagCommon](docs/Model/ConversionTagCommon.md)
- [ConversionTagConfigs](docs/Model/ConversionTagConfigs.md)
- [ConversionTagCreate](docs/Model/ConversionTagCreate.md)
- [ConversionTagListResponse](docs/Model/ConversionTagListResponse.md)
- [ConversionTagResponse](docs/Model/ConversionTagResponse.md)
- [ConversionTagType](docs/Model/ConversionTagType.md)
- [Country](docs/Model/Country.md)
- [CountryFilter](docs/Model/CountryFilter.md)
- [CreateAssetAccessRequestBody](docs/Model/CreateAssetAccessRequestBody.md)
- [CreateAssetAccessRequestBodyAssetRequestsInner](docs/Model/CreateAssetAccessRequestBodyAssetRequestsInner.md)
- [CreateAssetAccessRequestErrorMessageInner](docs/Model/CreateAssetAccessRequestErrorMessageInner.md)
- [CreateAssetAccessRequestResponse](docs/Model/CreateAssetAccessRequestResponse.md)
- [CreateAssetGroupBody](docs/Model/CreateAssetGroupBody.md)
- [CreateAssetGroupResponse](docs/Model/CreateAssetGroupResponse.md)
- [CreateAssetInvitesRequest](docs/Model/CreateAssetInvitesRequest.md)
- [CreateAssetInvitesRequestItem](docs/Model/CreateAssetInvitesRequestItem.md)
- [CreateInvitesResultsResponseArray](docs/Model/CreateInvitesResultsResponseArray.md)
- [CreateInvitesResultsResponseArrayItemsInner](docs/Model/CreateInvitesResultsResponseArrayItemsInner.md)
- [CreateInvitesResultsResponseArrayItemsInnerInvite](docs/Model/CreateInvitesResultsResponseArrayItemsInnerInvite.md)
- [CreateMMMReportRequest](docs/Model/CreateMMMReportRequest.md)
- [CreateMMMReportResponse](docs/Model/CreateMMMReportResponse.md)
- [CreateMMMReportResponseData](docs/Model/CreateMMMReportResponseData.md)
- [CreateMembershipOrPartnershipInvitesBody](docs/Model/CreateMembershipOrPartnershipInvitesBody.md)
- [CreativeAssetsIdFilter](docs/Model/CreativeAssetsIdFilter.md)
- [CreativeAssetsProcessingRecord](docs/Model/CreativeAssetsProcessingRecord.md)
- [CreativeAssetsVisibilityType](docs/Model/CreativeAssetsVisibilityType.md)
- [CreativeType](docs/Model/CreativeType.md)
- [Currency](docs/Model/Currency.md)
- [CurrencyFilter](docs/Model/CurrencyFilter.md)
- [CustomLabel0Filter](docs/Model/CustomLabel0Filter.md)
- [CustomLabel1Filter](docs/Model/CustomLabel1Filter.md)
- [CustomLabel2Filter](docs/Model/CustomLabel2Filter.md)
- [CustomLabel3Filter](docs/Model/CustomLabel3Filter.md)
- [CustomLabel4Filter](docs/Model/CustomLabel4Filter.md)
- [CustomerList](docs/Model/CustomerList.md)
- [CustomerListRequest](docs/Model/CustomerListRequest.md)
- [CustomerListUpdateRequest](docs/Model/CustomerListUpdateRequest.md)
- [CustomerListsList200Response](docs/Model/CustomerListsList200Response.md)
- [DataOutputFormat](docs/Model/DataOutputFormat.md)
- [DataStatus](docs/Model/DataStatus.md)
- [DeleteAssetGroupBody](docs/Model/DeleteAssetGroupBody.md)
- [DeleteAssetGroupResponse](docs/Model/DeleteAssetGroupResponse.md)
- [DeleteAssetGroupResponseExceptionsInner](docs/Model/DeleteAssetGroupResponseExceptionsInner.md)
- [DeleteInvitesResultsResponseArray](docs/Model/DeleteInvitesResultsResponseArray.md)
- [DeleteInvitesResultsResponseArrayItemsInner](docs/Model/DeleteInvitesResultsResponseArrayItemsInner.md)
- [DeleteInvitesResultsResponseArrayItemsInnerException](docs/Model/DeleteInvitesResultsResponseArrayItemsInnerException.md)
- [DeleteMemberAccessResult](docs/Model/DeleteMemberAccessResult.md)
- [DeleteMemberAccessResultsResponseArray](docs/Model/DeleteMemberAccessResultsResponseArray.md)
- [DeletePartnerAssetAccessBody](docs/Model/DeletePartnerAssetAccessBody.md)
- [DeletePartnerAssetAccessBodyAccessesInner](docs/Model/DeletePartnerAssetAccessBodyAccessesInner.md)
- [DeletePartnerAssetsResult](docs/Model/DeletePartnerAssetsResult.md)
- [DeletePartnerAssetsResultsResponseArray](docs/Model/DeletePartnerAssetsResultsResponseArray.md)
- [DeletePartnersRequest](docs/Model/DeletePartnersRequest.md)
- [DeletePartnersResponse](docs/Model/DeletePartnersResponse.md)
- [DeletedMembersResponse](docs/Model/DeletedMembersResponse.md)
- [DeliveryMetricsResponse](docs/Model/DeliveryMetricsResponse.md)
- [DeliveryMetricsResponseItemsInner](docs/Model/DeliveryMetricsResponseItemsInner.md)
- [DetailedError](docs/Model/DetailedError.md)
- [EnhancedMatchStatusType](docs/Model/EnhancedMatchStatusType.md)
- [EntityStatus](docs/Model/EntityStatus.md)
- [Error](docs/Model/Error.md)
- [Exception](docs/Model/Exception.md)
- [FeedProcessingResultsList200Response](docs/Model/FeedProcessingResultsList200Response.md)
- [FeedsCreateRequest](docs/Model/FeedsCreateRequest.md)
- [FeedsList200Response](docs/Model/FeedsList200Response.md)
- [FeedsUpdateRequest](docs/Model/FeedsUpdateRequest.md)
- [FollowUserRequest](docs/Model/FollowUserRequest.md)
- [FollowersList200Response](docs/Model/FollowersList200Response.md)
- [Gender](docs/Model/Gender.md)
- [GenderFilter](docs/Model/GenderFilter.md)
- [GetAudiencesOrderBy](docs/Model/GetAudiencesOrderBy.md)
- [GetBusinessAssetTypeResponse](docs/Model/GetBusinessAssetTypeResponse.md)
- [GetBusinessAssetsResponse](docs/Model/GetBusinessAssetsResponse.md)
- [GetBusinessEmployers200Response](docs/Model/GetBusinessEmployers200Response.md)
- [GetBusinessMembers200Response](docs/Model/GetBusinessMembers200Response.md)
- [GetBusinessPartners200Response](docs/Model/GetBusinessPartners200Response.md)
- [GetInvites200Response](docs/Model/GetInvites200Response.md)
- [GetMMMReportResponse](docs/Model/GetMMMReportResponse.md)
- [GetMMMReportResponseData](docs/Model/GetMMMReportResponseData.md)
- [GetPartnerAssetsResponse](docs/Model/GetPartnerAssetsResponse.md)
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
- [ImageDetails](docs/Model/ImageDetails.md)
- [ImageMetadata](docs/Model/ImageMetadata.md)
- [ImageMetadataImages](docs/Model/ImageMetadataImages.md)
- [IntegrationLog](docs/Model/IntegrationLog.md)
- [IntegrationLogClientError](docs/Model/IntegrationLogClientError.md)
- [IntegrationLogClientRequest](docs/Model/IntegrationLogClientRequest.md)
- [IntegrationLogsInvalidLogResponse](docs/Model/IntegrationLogsInvalidLogResponse.md)
- [IntegrationLogsInvalidLogResponseRejectedLogsInner](docs/Model/IntegrationLogsInvalidLogResponseRejectedLogsInner.md)
- [IntegrationLogsRequest](docs/Model/IntegrationLogsRequest.md)
- [IntegrationLogsSuccessResponse](docs/Model/IntegrationLogsSuccessResponse.md)
- [IntegrationMetadata](docs/Model/IntegrationMetadata.md)
- [IntegrationRecord](docs/Model/IntegrationRecord.md)
- [IntegrationRequest](docs/Model/IntegrationRequest.md)
- [IntegrationRequestPatch](docs/Model/IntegrationRequestPatch.md)
- [IntegrationsGetList200Response](docs/Model/IntegrationsGetList200Response.md)
- [Interest](docs/Model/Interest.md)
- [InviteAssetsSummary](docs/Model/InviteAssetsSummary.md)
- [InviteAssetsSummaryAdAccountsInner](docs/Model/InviteAssetsSummaryAdAccountsInner.md)
- [InviteAssetsSummaryProfilesInner](docs/Model/InviteAssetsSummaryProfilesInner.md)
- [InviteBusinessRoleBinding](docs/Model/InviteBusinessRoleBinding.md)
- [InviteExceptionResponse](docs/Model/InviteExceptionResponse.md)
- [InviteResponse](docs/Model/InviteResponse.md)
- [InviteStatus](docs/Model/InviteStatus.md)
- [InviteType](docs/Model/InviteType.md)
- [ItemAttributes](docs/Model/ItemAttributes.md)
- [ItemAttributesRequest](docs/Model/ItemAttributesRequest.md)
- [ItemAttributesRequestAllOfImageLink](docs/Model/ItemAttributesRequestAllOfImageLink.md)
- [ItemBatchRecord](docs/Model/ItemBatchRecord.md)
- [ItemCreateBatchRecord](docs/Model/ItemCreateBatchRecord.md)
- [ItemDeleteBatchRecord](docs/Model/ItemDeleteBatchRecord.md)
- [ItemDeleteDiscontinuedBatchRecord](docs/Model/ItemDeleteDiscontinuedBatchRecord.md)
- [ItemGroupIdFilter](docs/Model/ItemGroupIdFilter.md)
- [ItemIdFilter](docs/Model/ItemIdFilter.md)
- [ItemProcessingRecord](docs/Model/ItemProcessingRecord.md)
- [ItemProcessingStatus](docs/Model/ItemProcessingStatus.md)
- [ItemResponse](docs/Model/ItemResponse.md)
- [ItemResponseAnyOf](docs/Model/ItemResponseAnyOf.md)
- [ItemResponseAnyOf1](docs/Model/ItemResponseAnyOf1.md)
- [ItemUpdateBatchRecord](docs/Model/ItemUpdateBatchRecord.md)
- [ItemUpsertBatchRecord](docs/Model/ItemUpsertBatchRecord.md)
- [ItemValidationEvent](docs/Model/ItemValidationEvent.md)
- [ItemsBatchPostRequest](docs/Model/ItemsBatchPostRequest.md)
- [ItemsIssuesList200Response](docs/Model/ItemsIssuesList200Response.md)
- [Keyword](docs/Model/Keyword.md)
- [KeywordError](docs/Model/KeywordError.md)
- [KeywordMetrics](docs/Model/KeywordMetrics.md)
- [KeywordMetricsResponse](docs/Model/KeywordMetricsResponse.md)
- [KeywordUpdate](docs/Model/KeywordUpdate.md)
- [KeywordUpdateBody](docs/Model/KeywordUpdateBody.md)
- [KeywordsCommon](docs/Model/KeywordsCommon.md)
- [KeywordsGet200Response](docs/Model/KeywordsGet200Response.md)
- [KeywordsMetricsArrayResponse](docs/Model/KeywordsMetricsArrayResponse.md)
- [KeywordsRequest](docs/Model/KeywordsRequest.md)
- [KeywordsResponse](docs/Model/KeywordsResponse.md)
- [Language](docs/Model/Language.md)
- [LeadFormArrayResponse](docs/Model/LeadFormArrayResponse.md)
- [LeadFormArrayResponseItemsInner](docs/Model/LeadFormArrayResponseItemsInner.md)
- [LeadFormCommon](docs/Model/LeadFormCommon.md)
- [LeadFormCommonPolicyLinksInner](docs/Model/LeadFormCommonPolicyLinksInner.md)
- [LeadFormCreateRequest](docs/Model/LeadFormCreateRequest.md)
- [LeadFormQuestion](docs/Model/LeadFormQuestion.md)
- [LeadFormQuestionFieldType](docs/Model/LeadFormQuestionFieldType.md)
- [LeadFormQuestionType](docs/Model/LeadFormQuestionType.md)
- [LeadFormResponse](docs/Model/LeadFormResponse.md)
- [LeadFormStatus](docs/Model/LeadFormStatus.md)
- [LeadFormTestRequest](docs/Model/LeadFormTestRequest.md)
- [LeadFormTestResponse](docs/Model/LeadFormTestResponse.md)
- [LeadFormUpdateRequest](docs/Model/LeadFormUpdateRequest.md)
- [LeadFormsList200Response](docs/Model/LeadFormsList200Response.md)
- [LeadsExportCreateRequest](docs/Model/LeadsExportCreateRequest.md)
- [LeadsExportCreateResponse](docs/Model/LeadsExportCreateResponse.md)
- [LeadsExportResponseData](docs/Model/LeadsExportResponseData.md)
- [LeadsExportStatus](docs/Model/LeadsExportStatus.md)
- [LineItem](docs/Model/LineItem.md)
- [LinkedBusiness](docs/Model/LinkedBusiness.md)
- [MMMReportingColumn](docs/Model/MMMReportingColumn.md)
- [MMMReportingTargetingType](docs/Model/MMMReportingTargetingType.md)
- [MatchType](docs/Model/MatchType.md)
- [MatchTypeResponse](docs/Model/MatchTypeResponse.md)
- [MaxPriceFilter](docs/Model/MaxPriceFilter.md)
- [MediaList200Response](docs/Model/MediaList200Response.md)
- [MediaType](docs/Model/MediaType.md)
- [MediaTypeFilter](docs/Model/MediaTypeFilter.md)
- [MediaUpload](docs/Model/MediaUpload.md)
- [MediaUploadAllOfUploadParameters](docs/Model/MediaUploadAllOfUploadParameters.md)
- [MediaUploadDetails](docs/Model/MediaUploadDetails.md)
- [MediaUploadRequest](docs/Model/MediaUploadRequest.md)
- [MediaUploadStatus](docs/Model/MediaUploadStatus.md)
- [MediaUploadType](docs/Model/MediaUploadType.md)
- [MemberBusinessRole](docs/Model/MemberBusinessRole.md)
- [MembersToDeleteBody](docs/Model/MembersToDeleteBody.md)
- [MembersToDeleteBodyMembersInner](docs/Model/MembersToDeleteBodyMembersInner.md)
- [MetricsReportingLevel](docs/Model/MetricsReportingLevel.md)
- [MetricsResponse](docs/Model/MetricsResponse.md)
- [MinPriceFilter](docs/Model/MinPriceFilter.md)
- [MultipleProductGroupsInner](docs/Model/MultipleProductGroupsInner.md)
- [NonNullableCatalogsCurrency](docs/Model/NonNullableCatalogsCurrency.md)
- [NonNullableProductAvailabilityType](docs/Model/NonNullableProductAvailabilityType.md)
- [NullableCatalogsItemFieldType](docs/Model/NullableCatalogsItemFieldType.md)
- [NullableCurrency](docs/Model/NullableCurrency.md)
- [OauthAccessTokenRequestClientCredentials](docs/Model/OauthAccessTokenRequestClientCredentials.md)
- [OauthAccessTokenRequestCode](docs/Model/OauthAccessTokenRequestCode.md)
- [OauthAccessTokenRequestRefresh](docs/Model/OauthAccessTokenRequestRefresh.md)
- [OauthAccessTokenResponse](docs/Model/OauthAccessTokenResponse.md)
- [OauthAccessTokenResponseClientCredentials](docs/Model/OauthAccessTokenResponseClientCredentials.md)
- [OauthAccessTokenResponseCode](docs/Model/OauthAccessTokenResponseCode.md)
- [OauthAccessTokenResponseEverlastingRefresh](docs/Model/OauthAccessTokenResponseEverlastingRefresh.md)
- [OauthAccessTokenResponseIntegrationRefresh](docs/Model/OauthAccessTokenResponseIntegrationRefresh.md)
- [OauthAccessTokenResponseRefresh](docs/Model/OauthAccessTokenResponseRefresh.md)
- [ObjectiveType](docs/Model/ObjectiveType.md)
- [OperationType](docs/Model/OperationType.md)
- [OptimizationGoalMetadata](docs/Model/OptimizationGoalMetadata.md)
- [OptimizationGoalMetadataConversionTagV3GoalMetadata](docs/Model/OptimizationGoalMetadataConversionTagV3GoalMetadata.md)
- [OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows](docs/Model/OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows.md)
- [OptimizationGoalMetadataFrequencyGoalMetadata](docs/Model/OptimizationGoalMetadataFrequencyGoalMetadata.md)
- [OptimizationGoalMetadataScrollupGoalMetadata](docs/Model/OptimizationGoalMetadataScrollupGoalMetadata.md)
- [OrderLine](docs/Model/OrderLine.md)
- [OrderLineError](docs/Model/OrderLineError.md)
- [OrderLinePaidType](docs/Model/OrderLinePaidType.md)
- [OrderLineResponse](docs/Model/OrderLineResponse.md)
- [OrderLineSingleResponse](docs/Model/OrderLineSingleResponse.md)
- [OrderLineStatus](docs/Model/OrderLineStatus.md)
- [OrderLines](docs/Model/OrderLines.md)
- [OrderLinesArrayResponse](docs/Model/OrderLinesArrayResponse.md)
- [OrderLinesList200Response](docs/Model/OrderLinesList200Response.md)
- [PacingDeliveryType](docs/Model/PacingDeliveryType.md)
- [PageVisitConversionTagsGet200Response](docs/Model/PageVisitConversionTagsGet200Response.md)
- [Paginated](docs/Model/Paginated.md)
- [PartnerType](docs/Model/PartnerType.md)
- [Permissions](docs/Model/Permissions.md)
- [PermissionsWithOwner](docs/Model/PermissionsWithOwner.md)
- [Pin](docs/Model/Pin.md)
- [PinAnalyticsMetricsResponse](docs/Model/PinAnalyticsMetricsResponse.md)
- [PinAnalyticsMetricsResponseDailyMetricsInner](docs/Model/PinAnalyticsMetricsResponseDailyMetricsInner.md)
- [PinCreate](docs/Model/PinCreate.md)
- [PinMedia](docs/Model/PinMedia.md)
- [PinMediaMetadata](docs/Model/PinMediaMetadata.md)
- [PinMediaSource](docs/Model/PinMediaSource.md)
- [PinMediaSourceImageBase64](docs/Model/PinMediaSourceImageBase64.md)
- [PinMediaSourceImageURL](docs/Model/PinMediaSourceImageURL.md)
- [PinMediaSourceImagesBase64](docs/Model/PinMediaSourceImagesBase64.md)
- [PinMediaSourceImagesBase64ItemsInner](docs/Model/PinMediaSourceImagesBase64ItemsInner.md)
- [PinMediaSourceImagesURL](docs/Model/PinMediaSourceImagesURL.md)
- [PinMediaSourceImagesURLItemsInner](docs/Model/PinMediaSourceImagesURLItemsInner.md)
- [PinMediaSourcePinURL](docs/Model/PinMediaSourcePinURL.md)
- [PinMediaSourceVideoID](docs/Model/PinMediaSourceVideoID.md)
- [PinMediaWithImage](docs/Model/PinMediaWithImage.md)
- [PinMediaWithImageAllOfImages](docs/Model/PinMediaWithImageAllOfImages.md)
- [PinMediaWithImageAndVideo](docs/Model/PinMediaWithImageAndVideo.md)
- [PinMediaWithImages](docs/Model/PinMediaWithImages.md)
- [PinMediaWithVideo](docs/Model/PinMediaWithVideo.md)
- [PinMediaWithVideos](docs/Model/PinMediaWithVideos.md)
- [PinPromotionSummaryStatus](docs/Model/PinPromotionSummaryStatus.md)
- [PinUpdate](docs/Model/PinUpdate.md)
- [PinUpdateCarouselSlotsInner](docs/Model/PinUpdateCarouselSlotsInner.md)
- [PinsAnalyticsMetricTypesParameterInner](docs/Model/PinsAnalyticsMetricTypesParameterInner.md)
- [PinsList200Response](docs/Model/PinsList200Response.md)
- [PinsSaveRequest](docs/Model/PinsSaveRequest.md)
- [PinterestTagEventData](docs/Model/PinterestTagEventData.md)
- [PlacementGroupType](docs/Model/PlacementGroupType.md)
- [PlacementMultipliers](docs/Model/PlacementMultipliers.md)
- [PriceFilter](docs/Model/PriceFilter.md)
- [ProductAvailabilityType](docs/Model/ProductAvailabilityType.md)
- [ProductGroupAnalyticsResponseInner](docs/Model/ProductGroupAnalyticsResponseInner.md)
- [ProductGroupPromotion](docs/Model/ProductGroupPromotion.md)
- [ProductGroupPromotionCreateRequest](docs/Model/ProductGroupPromotionCreateRequest.md)
- [ProductGroupPromotionCreateRequestElement](docs/Model/ProductGroupPromotionCreateRequestElement.md)
- [ProductGroupPromotionResponse](docs/Model/ProductGroupPromotionResponse.md)
- [ProductGroupPromotionResponseElement](docs/Model/ProductGroupPromotionResponseElement.md)
- [ProductGroupPromotionResponseItem](docs/Model/ProductGroupPromotionResponseItem.md)
- [ProductGroupPromotionUpdateRequest](docs/Model/ProductGroupPromotionUpdateRequest.md)
- [ProductGroupPromotionsList200Response](docs/Model/ProductGroupPromotionsList200Response.md)
- [ProductGroupReferenceFilter](docs/Model/ProductGroupReferenceFilter.md)
- [ProductGroupSummaryStatus](docs/Model/ProductGroupSummaryStatus.md)
- [ProductType0Filter](docs/Model/ProductType0Filter.md)
- [ProductType1Filter](docs/Model/ProductType1Filter.md)
- [ProductType2Filter](docs/Model/ProductType2Filter.md)
- [ProductType3Filter](docs/Model/ProductType3Filter.md)
- [ProductType4Filter](docs/Model/ProductType4Filter.md)
- [QuizPinData](docs/Model/QuizPinData.md)
- [QuizPinOption](docs/Model/QuizPinOption.md)
- [QuizPinQuestion](docs/Model/QuizPinQuestion.md)
- [QuizPinResult](docs/Model/QuizPinResult.md)
- [RelatedTerms](docs/Model/RelatedTerms.md)
- [RelatedTermsRelatedTermsListInner](docs/Model/RelatedTermsRelatedTermsListInner.md)
- [ReportingColumnAsync](docs/Model/ReportingColumnAsync.md)
- [ReportsStats200Response](docs/Model/ReportsStats200Response.md)
- [RespondToInvitesResponseArray](docs/Model/RespondToInvitesResponseArray.md)
- [RespondToInvitesResponseArrayItemsInner](docs/Model/RespondToInvitesResponseArrayItemsInner.md)
- [Role](docs/Model/Role.md)
- [SSIOAccountAddress](docs/Model/SSIOAccountAddress.md)
- [SSIOAccountItem](docs/Model/SSIOAccountItem.md)
- [SSIOAccountPMPName](docs/Model/SSIOAccountPMPName.md)
- [SSIOAccountResponse](docs/Model/SSIOAccountResponse.md)
- [SSIOCreateInsertionOrderRequest](docs/Model/SSIOCreateInsertionOrderRequest.md)
- [SSIOCreateInsertionOrderResponse](docs/Model/SSIOCreateInsertionOrderResponse.md)
- [SSIOEditInsertionOrderRequest](docs/Model/SSIOEditInsertionOrderRequest.md)
- [SSIOEditInsertionOrderResponse](docs/Model/SSIOEditInsertionOrderResponse.md)
- [SSIOInsertionOrderCommon](docs/Model/SSIOInsertionOrderCommon.md)
- [SSIOInsertionOrderStatus](docs/Model/SSIOInsertionOrderStatus.md)
- [SSIOInsertionOrderStatusResponse](docs/Model/SSIOInsertionOrderStatusResponse.md)
- [SSIOOrderLine](docs/Model/SSIOOrderLine.md)
- [SearchPartnerPins200Response](docs/Model/SearchPartnerPins200Response.md)
- [SearchUserBoardsGet200Response](docs/Model/SearchUserBoardsGet200Response.md)
- [SharedAudience](docs/Model/SharedAudience.md)
- [SharedAudienceAccount](docs/Model/SharedAudienceAccount.md)
- [SharedAudienceCommon](docs/Model/SharedAudienceCommon.md)
- [SharedAudienceResponse](docs/Model/SharedAudienceResponse.md)
- [SharedAudienceResponseCommon](docs/Model/SharedAudienceResponseCommon.md)
- [SingleInterestTargetingOptionResponse](docs/Model/SingleInterestTargetingOptionResponse.md)
- [SsioInsertionOrdersStatusGetByAdAccount200Response](docs/Model/SsioInsertionOrdersStatusGetByAdAccount200Response.md)
- [SsioOrderLinesGetByAdAccount200Response](docs/Model/SsioOrderLinesGetByAdAccount200Response.md)
- [SummaryPin](docs/Model/SummaryPin.md)
- [TargetingAdvertiserCountry](docs/Model/TargetingAdvertiserCountry.md)
- [TargetingSpec](docs/Model/TargetingSpec.md)
- [TargetingSpecAppType](docs/Model/TargetingSpecAppType.md)
- [TargetingSpecSHOPPINGRETARGETING](docs/Model/TargetingSpecSHOPPINGRETARGETING.md)
- [TargetingTemplateAudienceSizing](docs/Model/TargetingTemplateAudienceSizing.md)
- [TargetingTemplateAudienceSizingReachEstimate](docs/Model/TargetingTemplateAudienceSizingReachEstimate.md)
- [TargetingTemplateCommon](docs/Model/TargetingTemplateCommon.md)
- [TargetingTemplateCreate](docs/Model/TargetingTemplateCreate.md)
- [TargetingTemplateGetResponseData](docs/Model/TargetingTemplateGetResponseData.md)
- [TargetingTemplateKeyword](docs/Model/TargetingTemplateKeyword.md)
- [TargetingTemplateList200Response](docs/Model/TargetingTemplateList200Response.md)
- [TargetingTemplateResponseData](docs/Model/TargetingTemplateResponseData.md)
- [TargetingTemplateUpdateRequest](docs/Model/TargetingTemplateUpdateRequest.md)
- [TargetingTypeFilter](docs/Model/TargetingTypeFilter.md)
- [TemplateResponse](docs/Model/TemplateResponse.md)
- [TemplateResponseDateRange](docs/Model/TemplateResponseDateRange.md)
- [TemplateResponseDateRangeAbsoluteDateRange](docs/Model/TemplateResponseDateRangeAbsoluteDateRange.md)
- [TemplateResponseDateRangeDynamicDateRange](docs/Model/TemplateResponseDateRangeDynamicDateRange.md)
- [TemplateResponseDateRangeRelativeDateRange](docs/Model/TemplateResponseDateRangeRelativeDateRange.md)
- [TemplatesList200Response](docs/Model/TemplatesList200Response.md)
- [TermsOfService](docs/Model/TermsOfService.md)
- [TopPinsAnalyticsResponse](docs/Model/TopPinsAnalyticsResponse.md)
- [TopPinsAnalyticsResponseDateAvailability](docs/Model/TopPinsAnalyticsResponseDateAvailability.md)
- [TopPinsAnalyticsResponsePinsInner](docs/Model/TopPinsAnalyticsResponsePinsInner.md)
- [TopVideoPinsAnalyticsResponse](docs/Model/TopVideoPinsAnalyticsResponse.md)
- [TopVideoPinsAnalyticsResponsePinsInner](docs/Model/TopVideoPinsAnalyticsResponsePinsInner.md)
- [TrackingUrls](docs/Model/TrackingUrls.md)
- [TrendType](docs/Model/TrendType.md)
- [TrendingKeywordsResponse](docs/Model/TrendingKeywordsResponse.md)
- [TrendingKeywordsResponseTrendsInner](docs/Model/TrendingKeywordsResponseTrendsInner.md)
- [TrendingKeywordsResponseTrendsInnerTimeSeries](docs/Model/TrendingKeywordsResponseTrendsInnerTimeSeries.md)
- [TrendsSupportedRegion](docs/Model/TrendsSupportedRegion.md)
- [UpdatableItemAttributes](docs/Model/UpdatableItemAttributes.md)
- [UpdateAssetGroupBody](docs/Model/UpdateAssetGroupBody.md)
- [UpdateAssetGroupBodyAssetGroupsToUpdateInner](docs/Model/UpdateAssetGroupBodyAssetGroupsToUpdateInner.md)
- [UpdateAssetGroupResponse](docs/Model/UpdateAssetGroupResponse.md)
- [UpdateAssetGroupResponseExceptionsInner](docs/Model/UpdateAssetGroupResponseExceptionsInner.md)
- [UpdateInvitesResultsResponseArray](docs/Model/UpdateInvitesResultsResponseArray.md)
- [UpdateInvitesResultsResponseArrayItemsInner](docs/Model/UpdateInvitesResultsResponseArrayItemsInner.md)
- [UpdateMaskBidOptionField](docs/Model/UpdateMaskBidOptionField.md)
- [UpdateMaskFieldType](docs/Model/UpdateMaskFieldType.md)
- [UpdateMemberAssetAccessBody](docs/Model/UpdateMemberAssetAccessBody.md)
- [UpdateMemberAssetAccessBodyAccessesInner](docs/Model/UpdateMemberAssetAccessBodyAccessesInner.md)
- [UpdateMemberAssetsResultsResponseArray](docs/Model/UpdateMemberAssetsResultsResponseArray.md)
- [UpdateMemberAssetsResultsResponseArrayItemsInner](docs/Model/UpdateMemberAssetsResultsResponseArrayItemsInner.md)
- [UpdateMemberBusinessRoleBody](docs/Model/UpdateMemberBusinessRoleBody.md)
- [UpdateMemberResult](docs/Model/UpdateMemberResult.md)
- [UpdateMemberResultsResponseArray](docs/Model/UpdateMemberResultsResponseArray.md)
- [UpdatePartnerAssetAccessBody](docs/Model/UpdatePartnerAssetAccessBody.md)
- [UpdatePartnerAssetAccessBodyAccessesInner](docs/Model/UpdatePartnerAssetAccessBodyAccessesInner.md)
- [UpdatePartnerAssetsResult](docs/Model/UpdatePartnerAssetsResult.md)
- [UpdatePartnerAssetsResultsResponseArray](docs/Model/UpdatePartnerAssetsResultsResponseArray.md)
- [UpdatePartnerResultsResponseArray](docs/Model/UpdatePartnerResultsResponseArray.md)
- [UpdatePartnerResultsResponseArrayItemsInner](docs/Model/UpdatePartnerResultsResponseArrayItemsInner.md)
- [UserAccountFollowedInterests200Response](docs/Model/UserAccountFollowedInterests200Response.md)
- [UserBusinessRoleBinding](docs/Model/UserBusinessRoleBinding.md)
- [UserFollowingFeedType](docs/Model/UserFollowingFeedType.md)
- [UserFollowingGet200Response](docs/Model/UserFollowingGet200Response.md)
- [UserListOperationType](docs/Model/UserListOperationType.md)
- [UserListType](docs/Model/UserListType.md)
- [UserSingleAssetBinding](docs/Model/UserSingleAssetBinding.md)
- [UserSummary](docs/Model/UserSummary.md)
- [UserWebsiteSummary](docs/Model/UserWebsiteSummary.md)
- [UserWebsiteVerificationCode](docs/Model/UserWebsiteVerificationCode.md)
- [UserWebsiteVerifyRequest](docs/Model/UserWebsiteVerifyRequest.md)
- [UserWebsitesGet200Response](docs/Model/UserWebsitesGet200Response.md)
- [UsersForIndividualAssetResponse](docs/Model/UsersForIndividualAssetResponse.md)
- [VideoMetadata](docs/Model/VideoMetadata.md)

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
    - **pins:read**: See your public Pins
    - **pins:read_secret**: See your secret Pins
    - **pins:write**: Create, update, or delete your public Pins
    - **pins:write_secret**: Create, update, or delete your secret Pins
    - **user_accounts:read**: See your user accounts and followers
    - **user_accounts:write**: Update your user accounts and followers

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

- API version: `5.14.0`
    - Generator version: `7.9.0`
- Build package: `org.openapitools.codegen.languages.PhpClientCodegen`
