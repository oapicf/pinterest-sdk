# php-base - PHP Slim 4 Server library for Pinterest REST API

* [OpenAPI Generator](https://openapi-generator.tech)
* [Slim 4 Documentation](https://www.slimframework.com/docs/v4/)

This server has been generated with [Slim PSR-7](https://github.com/slimphp/Slim-Psr7) implementation.
[PHP-DI](https://php-di.org/doc/frameworks/slim.html) package used as dependency container.

## Requirements

* Web server with URL rewriting
* PHP 8.1 or newer

This package contains `.htaccess` for Apache configuration.
If you use another server(Nginx, HHVM, IIS, lighttpd) check out [Web Servers](https://www.slimframework.com/docs/v3/start/web-servers.html) doc.

## Installation via [Composer](https://getcomposer.org/)

Navigate into your project's root directory and execute the bash command shown below.
This command downloads the Slim Framework and its third-party dependencies into your project's `vendor/` directory.
```bash
$ composer install
```

## Add configs

[PHP-DI package](https://php-di.org/doc/getting-started.html) helps to decouple configuration from implementation. App loads configuration files in straight order(`$env` can be `prod` or `dev`):
1. `config/$env/default.inc.php` (contains safe values, can be committed to vcs)
2. `config/$env/config.inc.php` (user config, excluded from vcs, can contain sensitive values, passwords etc.)
3. `lib/App/RegisterDependencies.php`

## Start devserver

Run the following command in terminal to start localhost web server, assuming `./php-slim-server/public/` is public-accessible directory with `index.php` file:
```bash
$ php -S localhost:8888 -t php-slim-server/public
```
> **Warning** This web server was designed to aid application development.
> It may also be useful for testing purposes or for application demonstrations that are run in controlled environments.
> It is not intended to be a full-featured web server. It should not be used on a public network.

## Tests

### PHPUnit

This package uses PHPUnit 8 or 9(depends from your PHP version) for unit testing.
[Test folder](tests) contains templates which you can fill with real test assertions.
How to write tests read at [2. Writing Tests for PHPUnit - PHPUnit 8.5 Manual](https://phpunit.readthedocs.io/en/8.5/writing-tests-for-phpunit.html).

#### Run

Command | Target
---- | ----
`$ composer test` | All tests
`$ composer test-apis` | Apis tests

#### Config

Package contains fully functional config `./phpunit.xml.dist` file. Create `./phpunit.xml` in root folder to override it.

Quote from [3. The Command-Line Test Runner — PHPUnit 8.5 Manual](https://phpunit.readthedocs.io/en/8.5/textui.html#command-line-options):

> If phpunit.xml or phpunit.xml.dist (in that order) exist in the current working directory and --configuration is not used, the configuration will be automatically read from that file.

### PHP CodeSniffer

[PHP CodeSniffer Documentation](https://github.com/squizlabs/PHP_CodeSniffer/wiki). This tool helps to follow coding style and avoid common PHP coding mistakes.

#### Run

```bash
$ composer phpcs
```

#### Config

Package contains fully functional config `./phpcs.xml.dist` file. It checks source code against PSR-1 and PSR-2 coding standards.
Create `./phpcs.xml` in root folder to override it. More info at [Using a Default Configuration File](https://github.com/squizlabs/PHP_CodeSniffer/wiki/Advanced-Usage#using-a-default-configuration-file)

### PHPLint

[PHPLint Documentation](https://github.com/overtrue/phplint). Checks PHP syntax only.

#### Run

```bash
$ composer phplint
```

## Show errors

Switch your app environment to development
- When using with some webserver => in `public/.htaccess` file:
```ini
## .htaccess
<IfModule mod_env.c>
    SetEnv APP_ENV 'development'
</IfModule>
```

- Or when using whatever else, set `APP_ENV` environment variable like this:
```bash
export APP_ENV=development
```
or simply
```bash
export APP_ENV=dev
```

## Mock Server
Since this feature should be used for development only, change environment to `development` and send additional HTTP header `X-OpenAPIServer-Mock: ping` with any request to get mocked response.
CURL example:
```console
curl --request GET \
    --url 'http://localhost:8888/v2/pet/findByStatus?status=available' \
    --header 'accept: application/json' \
    --header 'X-OpenAPIServer-Mock: ping'
[{"id":-8738629417578509312,"category":{"id":-4162503862215270400,"name":"Lorem ipsum dol"},"name":"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lorem i","photoUrls":["Lor"],"tags":[{"id":-3506202845849391104,"name":"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lorem ipsum dolor sit amet, consectet"}],"status":"pending"}]
```

Used packages:
* [Openapi Data Mocker](https://github.com/ybelenko/openapi-data-mocker) - first implementation of OAS3 fake data generator.
* [Openapi Data Mocker Server Middleware](https://github.com/ybelenko/openapi-data-mocker-server-middleware) - PSR-15 HTTP server middleware.
* [Openapi Data Mocker Interfaces](https://github.com/ybelenko/openapi-data-mocker-interfaces) - package with mocking interfaces.

## Logging

Build contains pre-configured [`monolog/monolog`](https://github.com/Seldaek/monolog) package. Make sure that `logs` folder is writable.
Add required log handlers/processors/formatters in `lib/App/RegisterDependencies.php`.

## API Endpoints

All URIs are relative to *https://api.pinterest.com/v5*

> Important! Do not modify abstract API controllers directly! Instead extend them by implementation classes like:

```php
// src/Api/PetApi.php

namespace OpenAPIServer\Api;

use OpenAPIServer\Api\AbstractPetApi;
use Psr\Http\Message\ServerRequestInterface;
use Psr\Http\Message\ResponseInterface;

class PetApi extends AbstractPetApi
{
    public function addPet(
        ServerRequestInterface $request,
        ResponseInterface $response
    ): ResponseInterface {
        // your implementation of addPet method here
    }
}
```

When you need to inject dependencies into API controller check [PHP-DI - Controllers as services](https://github.com/PHP-DI/Slim-Bridge#controllers-as-services) guide.

Place all your implementation classes in `./src` folder accordingly.
For instance, when abstract class located at `./lib/Api/AbstractPetApi.php` you need to create implementation class at `./src/Api/PetApi.php`.

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AbstractAdAccountsApi* | **adAccountsCreate** | **POST** /ad_accounts | Create ad account
*AbstractAdAccountsApi* | **adAccountsList** | **GET** /ad_accounts | List ad accounts
*AbstractAdAccountsApi* | **adAccountAnalytics** | **GET** /ad_accounts/{ad_account_id}/analytics | Get ad account analytics
*AbstractAdAccountsApi* | **adAccountTargetingAnalyticsGet** | **GET** /ad_accounts/{ad_account_id}/targeting_analytics | Get targeting analytics for an ad account
*AbstractAdAccountsApi* | **adAccountsGet** | **GET** /ad_accounts/{ad_account_id} | Get ad account
*AbstractAdAccountsApi* | **analyticsCreateConversionProductReport** | **POST** /ad_accounts/{ad_account_id}/reports/brand_category_sku | Create a request for a brand, category, SKU report
*AbstractAdAccountsApi* | **analyticsCreateMmmReport** | **POST** /ad_accounts/{ad_account_id}/mmm_reports | Create a request for a Marketing Mix Modeling (MMM) report
*AbstractAdAccountsApi* | **analyticsCreateReport** | **POST** /ad_accounts/{ad_account_id}/reports | Create async request for an account analytics report
*AbstractAdAccountsApi* | **analyticsCreateTemplateReport** | **POST** /ad_accounts/{ad_account_id}/templates/{template_id}/reports | Create async request for an analytics report using a template
*AbstractAdAccountsApi* | **analyticsGetConversionProductReport** | **GET** /ad_accounts/{ad_account_id}/reports/brand_category_sku | Get advertiser brand, category, SKU report
*AbstractAdAccountsApi* | **analyticsGetMmmReport** | **GET** /ad_accounts/{ad_account_id}/mmm_reports | Get advertiser Marketing Mix Modeling (MMM) report.
*AbstractAdAccountsApi* | **analyticsGetReport** | **GET** /ad_accounts/{ad_account_id}/reports | Get the account analytics report created by the async call
*AbstractAdAccountsApi* | **sandboxDelete** | **DELETE** /ad_accounts/{ad_account_id}/sandbox | Delete ads data for ad account in API Sandbox
*AbstractAdAccountsApi* | **templatesList** | **GET** /ad_accounts/{ad_account_id}/templates | List templates
*AbstractAdGroupsApi* | **adGroupsAnalytics** | **GET** /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics
*AbstractAdGroupsApi* | **adGroupsAudienceSizing** | **POST** /ad_accounts/{ad_account_id}/ad_groups/audience_sizing | Get audience sizing
*AbstractAdGroupsApi* | **adGroupsBidFloorGet** | **POST** /ad_accounts/{ad_account_id}/bid_floor | Get bid floors
*AbstractAdGroupsApi* | **adGroupsCreate** | **POST** /ad_accounts/{ad_account_id}/ad_groups | Create ad groups
*AbstractAdGroupsApi* | **adGroupsDynamicTitlesDownloadCsv** | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/csv | Get dynamic titles CSV download URL
*AbstractAdGroupsApi* | **adGroupsDynamicTitlesGetStatus** | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/status | Get dynamic titles status
*AbstractAdGroupsApi* | **adGroupsDynamicTitlesGetUploadUrl** | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/uploads | Get dynamic titles upload URL
*AbstractAdGroupsApi* | **adGroupsDynamicTitlesProcessCsv** | **POST** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles | Process dynamic titles CSV
*AbstractAdGroupsApi* | **adGroupsGet** | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id} | Get ad group
*AbstractAdGroupsApi* | **adGroupsList** | **GET** /ad_accounts/{ad_account_id}/ad_groups | List ad groups
*AbstractAdGroupsApi* | **adGroupsTargetingAnalyticsGet** | **GET** /ad_accounts/{ad_account_id}/ad_groups/targeting_analytics | Get targeting analytics for ad groups
*AbstractAdGroupsApi* | **adGroupsUpdate** | **PATCH** /ad_accounts/{ad_account_id}/ad_groups | Update ad groups
*AbstractAdGroupsApi* | **getAdGroupsByPromotionIdsList** | **GET** /ad_accounts/{ad_account_id}/promotion_applied_entities | List of ad groups using promotions IDs.
*AbstractAdsApi* | **adPreviewsCreate** | **POST** /ad_accounts/{ad_account_id}/ad_previews | Create ad preview with pin or image
*AbstractAdsApi* | **adTargetingAnalyticsGet** | **GET** /ad_accounts/{ad_account_id}/ads/targeting_analytics | Get targeting analytics for ads
*AbstractAdsApi* | **adsAnalytics** | **GET** /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics
*AbstractAdsApi* | **adsCreate** | **POST** /ad_accounts/{ad_account_id}/ads | Create ads
*AbstractAdsApi* | **adsGet** | **GET** /ad_accounts/{ad_account_id}/ads/{ad_id} | Get ad
*AbstractAdsApi* | **adsList** | **GET** /ad_accounts/{ad_account_id}/ads | List ads
*AbstractAdsApi* | **adsUpdate** | **PATCH** /ad_accounts/{ad_account_id}/ads | Update ads
*AbstractAdsApi* | **campaignAdPreviewCreate** | **POST** /ad_accounts/{ad_account_id}/campaign_ad_preview | Create ad preview records for one or more ad groups
*AbstractAdsApi* | **campaignAdPreviewDelete** | **DELETE** /ad_accounts/{ad_account_id}/campaign_ad_preview | Delete ad preview records for one or more ad groups
*AbstractAdsApi* | **campaignAdPreviewRead** | **GET** /ad_accounts/{ad_account_id}/campaign_ad_preview | Fetch ad preview records for one or more ad groups
*AbstractAdvancedAuctionApi* | **advancedAuctionItemsGetPost** | **POST** /advanced_auction/items/get | Get item bid options (POST)
*AbstractAdvancedAuctionApi* | **advancedAuctionItemsSubmitPost** | **POST** /advanced_auction/items/submit | Operate on item level bid options
*AbstractAudienceInsightsApi* | **audienceInsightsGet** | **GET** /ad_accounts/{ad_account_id}/audience_insights | Get audience insights
*AbstractAudienceInsightsApi* | **audienceInsightsScopeAndTypeGet** | **GET** /ad_accounts/{ad_account_id}/insights/audiences | Get audience insights scope and type
*AbstractAudienceSharingApi* | **adAccountsAudiencesSharedAccountsList** | **GET** /ad_accounts/{ad_account_id}/audiences/shared/accounts | List accounts with access to an audience owned by an ad account
*AbstractAudienceSharingApi* | **businessAccountAudiencesSharedAccountsList** | **GET** /businesses/{business_id}/audiences/shared/accounts | List accounts with access to an audience owned by a business
*AbstractAudienceSharingApi* | **sharedAudiencesForBusinessList** | **GET** /businesses/{business_id}/audiences | List received audiences for a business
*AbstractAudienceSharingApi* | **updateAdAccountToAdAccountSharedAudience** | **PATCH** /ad_accounts/{ad_account_id}/audiences/ad_accounts/shared | Update audience sharing between ad accounts
*AbstractAudienceSharingApi* | **updateAdAccountToBusinessSharedAudience** | **PATCH** /ad_accounts/{ad_account_id}/audiences/businesses/shared | Update audience sharing from an ad account to businesses
*AbstractAudienceSharingApi* | **updateBusinessToAdAccountSharedAudience** | **PATCH** /businesses/{business_id}/audiences/ad_accounts/shared | Update audience sharing from a business to ad accounts
*AbstractAudienceSharingApi* | **updateBusinessToBusinessSharedAudience** | **PATCH** /businesses/{business_id}/audiences/businesses/shared | Update audience sharing between businesses
*AbstractAudiencesApi* | **audiencesCreate** | **POST** /ad_accounts/{ad_account_id}/audiences | Create audience
*AbstractAudiencesApi* | **audiencesGet** | **GET** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Get audience
*AbstractAudiencesApi* | **audiencesList** | **GET** /ad_accounts/{ad_account_id}/audiences | List audiences
*AbstractAudiencesApi* | **audiencesUpdate** | **PATCH** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Update audience
*AbstractBillingApi* | **adsCreditRedeem** | **POST** /ad_accounts/{ad_account_id}/ads_credit/redeem | Redeem ad credits
*AbstractBillingApi* | **adsCreditsDiscountsGet** | **GET** /ad_accounts/{ad_account_id}/ads_credit/discounts | Get ads credit discounts
*AbstractBillingApi* | **billingInvoiceDownloadGet** | **GET** /ad_accounts/{ad_account_id}/billing_invoice/{billing_invoice_id}/download | Get download url for a billing invoice
*AbstractBillingApi* | **billingInvoicesGet** | **GET** /ad_accounts/{ad_account_id}/billing_invoices | Get billing invoices
*AbstractBillingApi* | **billingProfilesGet** | **GET** /ad_accounts/{ad_account_id}/billing_profiles | Get billing profiles
*AbstractBillingApi* | **ssioAccountsGet** | **GET** /ad_accounts/{ad_account_id}/ssio/accounts | Get Salesforce account details including bill-to information.
*AbstractBillingApi* | **ssioInsertionOrderCreate** | **POST** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Create insertion order through SSIO.
*AbstractBillingApi* | **ssioInsertionOrderEdit** | **PATCH** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Edit insertion order through SSIO.
*AbstractBillingApi* | **ssioInsertionOrdersStatusGetByAdAccount** | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/status | Get insertion order status by ad account id.
*AbstractBillingApi* | **ssioInsertionOrdersStatusGetByPinOrderId** | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status | Get insertion order status by pin order id.
*AbstractBillingApi* | **ssioOrderLinesGetByAdAccount** | **GET** /ad_accounts/{ad_account_id}/ssio/order_lines | Get Salesforce order lines by ad account id.
*AbstractBoardsApi* | **boardsCreate** | **POST** /boards | Create board
*AbstractBoardsApi* | **boardsList** | **GET** /boards | List boards
*AbstractBoardsApi* | **boardSectionsCreate** | **POST** /boards/{board_id}/sections | Create board section
*AbstractBoardsApi* | **boardSectionsDelete** | **DELETE** /boards/{board_id}/sections/{section_id} | Delete board section
*AbstractBoardsApi* | **boardSectionsList** | **GET** /boards/{board_id}/sections | List board sections
*AbstractBoardsApi* | **boardSectionsListPins** | **GET** /boards/{board_id}/sections/{section_id}/pins | List Pins on board section
*AbstractBoardsApi* | **boardSectionsUpdate** | **PATCH** /boards/{board_id}/sections/{section_id} | Update board section
*AbstractBoardsApi* | **boardsDelete** | **DELETE** /boards/{board_id} | Delete board
*AbstractBoardsApi* | **boardsGet** | **GET** /boards/{board_id} | Get board
*AbstractBoardsApi* | **boardsListPins** | **GET** /boards/{board_id}/pins | List Pins on board
*AbstractBoardsApi* | **boardsUpdate** | **PATCH** /boards/{board_id} | Update board
*AbstractBulkApi* | **bulkDownloadCreate** | **POST** /ad_accounts/{ad_account_id}/bulk/download | Get advertiser entities in bulk
*AbstractBulkApi* | **bulkRequestGet** | **GET** /ad_accounts/{ad_account_id}/bulk/{bulk_request_id} | Download advertiser entities in bulk
*AbstractBulkApi* | **bulkUpsertCreate** | **POST** /ad_accounts/{ad_account_id}/bulk/upsert | Create/update ad entities in bulk
*AbstractBusinessAccessAssetsApi* | **assetGroupCreate** | **POST** /businesses/{business_id}/asset_groups | Create a new asset group.
*AbstractBusinessAccessAssetsApi* | **assetGroupDelete** | **DELETE** /businesses/{business_id}/asset_groups | Delete asset groups.
*AbstractBusinessAccessAssetsApi* | **assetGroupUpdate** | **PATCH** /businesses/{business_id}/asset_groups | Update asset groups.
*AbstractBusinessAccessAssetsApi* | **businessAssetMembersGet** | **GET** /businesses/{business_id}/assets/{asset_id}/members | Get members with access to asset
*AbstractBusinessAccessAssetsApi* | **businessAssetPartnersGet** | **GET** /businesses/{business_id}/assets/{asset_id}/partners | Get partners with access to asset
*AbstractBusinessAccessAssetsApi* | **businessAssetsGet** | **GET** /businesses/{business_id}/assets | List business assets
*AbstractBusinessAccessAssetsApi* | **businessMemberAssetsGet** | **GET** /businesses/{business_id}/members/{member_id}/assets | Get assets assigned to a member
*AbstractBusinessAccessAssetsApi* | **businessMembersAssetAccessDelete** | **DELETE** /businesses/{business_id}/members/assets/access | Delete member access to asset
*AbstractBusinessAccessAssetsApi* | **businessMembersAssetAccessUpdate** | **PATCH** /businesses/{business_id}/members/assets/access | Assign/Update member asset permissions
*AbstractBusinessAccessAssetsApi* | **businessPartnerAssetAccessGet** | **GET** /businesses/{business_id}/partners/{partner_id}/assets | Get assets assigned to a partner or assets assigned by a partner
*AbstractBusinessAccessAssetsApi* | **deletePartnerAssetAccessHandlerImpl** | **DELETE** /businesses/{business_id}/partners/assets | Delete partner access to asset
*AbstractBusinessAccessAssetsApi* | **updatePartnerAssetAccessHandlerImpl** | **PATCH** /businesses/{business_id}/partners/assets | Assign/Update partner asset permissions
*AbstractBusinessAccessInviteApi* | **respondBusinessAccessInvites** | **PATCH** /businesses/invites | Accept or decline an invite/request
*AbstractBusinessAccessInviteApi* | **assetAccessRequestsCreate** | **POST** /businesses/{business_id}/requests/assets/access | Create a request to access an existing partner's assets.
*AbstractBusinessAccessInviteApi* | **cancelInvitesOrRequests** | **DELETE** /businesses/{business_id}/invites | Cancel invites/requests
*AbstractBusinessAccessInviteApi* | **createAssetInvites** | **POST** /businesses/{business_id}/invites/assets/access | Update invite/request with an asset permission
*AbstractBusinessAccessInviteApi* | **createMembershipOrPartnershipInvites** | **POST** /businesses/{business_id}/invites | Create invites or requests
*AbstractBusinessAccessInviteApi* | **getInvites** | **GET** /businesses/{business_id}/invites | Get invites/requests
*AbstractBusinessAccessRelationshipsApi* | **getBusinessEmployers** | **GET** /businesses/employers | List business employers for user
*AbstractBusinessAccessRelationshipsApi* | **brandAccountsCreate** | **POST** /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts | Create a Brand Account
*AbstractBusinessAccessRelationshipsApi* | **brandAccountsUpdate** | **PATCH** /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id} | Update a Brand Account
*AbstractBusinessAccessRelationshipsApi* | **deleteBusinessMembership** | **DELETE** /businesses/{business_id}/members | Terminate business memberships
*AbstractBusinessAccessRelationshipsApi* | **deleteBusinessPartners** | **DELETE** /businesses/{business_id}/partners | Terminate business partnerships
*AbstractBusinessAccessRelationshipsApi* | **getBusinessMembers** | **GET** /businesses/{business_id}/members | Get business members
*AbstractBusinessAccessRelationshipsApi* | **getBusinessPartners** | **GET** /businesses/{business_id}/partners | Get business partners
*AbstractBusinessAccessRelationshipsApi* | **systemUserUpdate** | **PATCH** /businesses/{business_id}/system_users/{system_user_id} | Update a system user information.
*AbstractBusinessAccessRelationshipsApi* | **updateBusinessMemberships** | **PATCH** /businesses/{business_id}/members | Update member's business role
*AbstractCampaignsApi* | **adPinsAnalytics** | **GET** /ad_accounts/{ad_account_id}/pins/analytics | Get pins analytics
*AbstractCampaignsApi* | **campaignTargetingAnalyticsGet** | **GET** /ad_accounts/{ad_account_id}/campaigns/targeting_analytics | Get targeting analytics for campaigns
*AbstractCampaignsApi* | **campaignsAnalytics** | **GET** /ad_accounts/{ad_account_id}/campaigns/analytics | Get campaign analytics
*AbstractCampaignsApi* | **campaignsCreate** | **POST** /ad_accounts/{ad_account_id}/campaigns | Create campaigns
*AbstractCampaignsApi* | **campaignsGet** | **GET** /ad_accounts/{ad_account_id}/campaigns/{campaign_id} | Get campaign
*AbstractCampaignsApi* | **campaignsList** | **GET** /ad_accounts/{ad_account_id}/campaigns | List campaigns
*AbstractCampaignsApi* | **campaignsUpdate** | **PATCH** /ad_accounts/{ad_account_id}/campaigns | Update campaigns
*AbstractCampaignsApi* | **getCampaignDeliveryEstimates** | **POST** /ad_accounts/{ad_account_id}/campaigns/delivery_estimates | Get campaign delivery estimates
*AbstractCatalogFeedsApi* | **feedsCreate** | **POST** /catalogs/feeds | Create feed
*AbstractCatalogFeedsApi* | **feedsList** | **GET** /catalogs/feeds | List feeds
*AbstractCatalogFeedsApi* | **feedProcessingResultsList** | **GET** /catalogs/feeds/{feed_id}/processing_results | List feed processing results
*AbstractCatalogFeedsApi* | **feedsDelete** | **DELETE** /catalogs/feeds/{feed_id} | Delete feed
*AbstractCatalogFeedsApi* | **feedsGet** | **GET** /catalogs/feeds/{feed_id} | Get feed
*AbstractCatalogFeedsApi* | **feedsIngest** | **POST** /catalogs/feeds/{feed_id}/ingest | Ingest feed items
*AbstractCatalogFeedsApi* | **feedsUpdate** | **PATCH** /catalogs/feeds/{feed_id} | Update feed
*AbstractCatalogFeedsApi* | **itemsIssuesList** | **GET** /catalogs/processing_results/{processing_result_id}/item_issues | List item issues
*AbstractCatalogItemsApi* | **itemsBatchPost** | **POST** /catalogs/items/batch | Operate on item batch
*AbstractCatalogItemsApi* | **itemsPost** | **POST** /catalogs/items | Get catalogs items (POST)
*AbstractCatalogItemsApi* | **itemsBatchGet** | **GET** /catalogs/items/batch/{batch_id} | Get item batch status
*AbstractCatalogProductGroupsApi* | **catalogsProductGroupsCreate** | **POST** /catalogs/product_groups | Create product group
*AbstractCatalogProductGroupsApi* | **catalogsProductGroupsCreateMany** | **POST** /catalogs/product_groups/multiple | Create product groups
*AbstractCatalogProductGroupsApi* | **catalogsProductGroupsDeleteMany** | **DELETE** /catalogs/product_groups/multiple | Delete product groups
*AbstractCatalogProductGroupsApi* | **catalogsProductGroupsList** | **GET** /catalogs/product_groups | List product groups
*AbstractCatalogProductGroupsApi* | **productsByProductGroupFilterList** | **POST** /catalogs/products/get_by_product_group_filters | List products by filter
*AbstractCatalogProductGroupsApi* | **catalogsProductGroupPinsList** | **GET** /catalogs/product_groups/{product_group_id}/products | List products by product group
*AbstractCatalogProductGroupsApi* | **catalogsProductGroupsDelete** | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group
*AbstractCatalogProductGroupsApi* | **catalogsProductGroupsGet** | **GET** /catalogs/product_groups/{product_group_id} | Get product group
*AbstractCatalogProductGroupsApi* | **catalogsProductGroupsProductCountsGet** | **GET** /catalogs/product_groups/{product_group_id}/product_counts | Get product counts
*AbstractCatalogProductGroupsApi* | **catalogsProductGroupsUpdate** | **PATCH** /catalogs/product_groups/{product_group_id} | Update single product group
*AbstractCatalogReportsApi* | **reportsCreate** | **POST** /catalogs/reports | Build catalogs report
*AbstractCatalogReportsApi* | **reportsGet** | **GET** /catalogs/reports | Get catalogs report
*AbstractCatalogReportsApi* | **reportsStats** | **GET** /catalogs/reports/stats | List report stats
*AbstractCatalogSupplementalApi* | **catalogsLocalInventoryItemsBatchOperate** | **POST** /catalogs/{catalog_id}/local_inventory_items/batch | Operate on local inventory item batch
*AbstractCatalogSupplementalApi* | **catalogsLocalInventoryItemsPost** | **POST** /catalogs/{catalog_id}/local_inventory_items/query | Get local inventory items (POST)
*AbstractCatalogSupplementalApi* | **catalogsLocalStoresCreate** | **POST** /catalogs/{catalog_id}/local_stores | Create local stores
*AbstractCatalogSupplementalApi* | **catalogsLocalStoresDelete** | **DELETE** /catalogs/{catalog_id}/local_stores | Delete local stores
*AbstractCatalogSupplementalApi* | **catalogsLocalStoresList** | **GET** /catalogs/{catalog_id}/local_stores | List local stores
*AbstractCatalogSupplementalApi* | **catalogsLocalStoresUpdate** | **PATCH** /catalogs/{catalog_id}/local_stores | Update local stores
*AbstractCatalogSupplementalApi* | **catalogsSupplementalItemsBatchGet** | **GET** /catalogs/{catalog_id}/supplemental_items/batch/{batch_id} | Get supplemental items batch status
*AbstractCatalogsApi* | **catalogsAvailableFilterValues** | **GET** /catalogs/available_filter_values | List available filter values
*AbstractCatalogsApi* | **catalogsCreate** | **POST** /catalogs | Create catalog
*AbstractCatalogsApi* | **catalogsList** | **GET** /catalogs | List catalogs
*AbstractConversionDeletionRequestsApi* | **conversionDeletionRequestCreate** | **POST** /ad_accounts/{ad_account_id}/conversion_deletion_requests | Create a conversion deletion request
*AbstractConversionDeletionRequestsApi* | **conversionDeletionRequestDelete** | **DELETE** /ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id} | Delete a conversion deletion request
*AbstractConversionDeletionRequestsApi* | **conversionDeletionRequestGet** | **GET** /ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id} | Get a single conversion deletion request
*AbstractConversionDeletionRequestsApi* | **conversionDeletionRequestList** | **GET** /ad_accounts/{ad_account_id}/conversion_deletion_requests | List conversion deletion requests
*AbstractConversionEqsApi* | **conversionEqsList** | **GET** /ad_accounts/{ad_account_id}/conversion_eqs | Get event quality score (EQS)
*AbstractConversionEventsApi* | **eventsCreate** | **POST** /ad_accounts/{ad_account_id}/events | Send conversions
*AbstractConversionTagsApi* | **conversionTagsCreate** | **POST** /ad_accounts/{ad_account_id}/conversion_tags | Create conversion tag
*AbstractConversionTagsApi* | **conversionTagsGet** | **GET** /ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id} | Get conversion tag
*AbstractConversionTagsApi* | **conversionTagsList** | **GET** /ad_accounts/{ad_account_id}/conversion_tags | List conversion tags
*AbstractConversionTagsApi* | **ocpmEligibleConversionTagsGet** | **GET** /ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible | Get Ocpm eligible conversion tags
*AbstractConversionTagsApi* | **pageVisitConversionTagsGet** | **GET** /ad_accounts/{ad_account_id}/conversion_tags/page_visit | Get page visit conversion tags
*AbstractConversionsApi* | **advertiserDefinedEventsCreate** | **POST** /ad_accounts/{ad_account_id}/advertiser_defined_events | Create advertiser defined events
*AbstractConversionsApi* | **advertiserDefinedEventsDelete** | **DELETE** /ad_accounts/{ad_account_id}/advertiser_defined_events | Delete advertiser defined events
*AbstractConversionsApi* | **advertiserDefinedEventsGet** | **GET** /ad_accounts/{ad_account_id}/advertiser_defined_events | Get advertiser defined events
*AbstractConversionsApi* | **advertiserDefinedEventsUpdate** | **PATCH** /ad_accounts/{ad_account_id}/advertiser_defined_events | Update advertiser defined events
*AbstractCustomerListUploadsApi* | **customerListUploadsCreate** | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads | Create customer list upload
*AbstractCustomerListUploadsApi* | **customerListUploadsGet** | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id} | Get customer list upload
*AbstractCustomerListUploadsApi* | **customerListUploadsRun** | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run | Run customer list upload
*AbstractCustomerListsApi* | **customerListsCreate** | **POST** /ad_accounts/{ad_account_id}/customer_lists | Create customer lists
*AbstractCustomerListsApi* | **customerListsGet** | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Get customer list
*AbstractCustomerListsApi* | **customerListsList** | **GET** /ad_accounts/{ad_account_id}/customer_lists | Get customer lists
*AbstractCustomerListsApi* | **customerListsUpdate** | **PATCH** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Update customer list
*AbstractCustomerSegmentApi* | **customerSegmentCreate** | **POST** /ad_accounts/{ad_account_id}/customer_segments | Create customer segments
*AbstractCustomerSegmentApi* | **customerSegmentList** | **GET** /ad_accounts/{ad_account_id}/customer_segments | List customer segments
*AbstractCustomerSegmentApi* | **customerSegmentUpdate** | **PATCH** /ad_accounts/{ad_account_id}/customer_segments | Update customer segments
*AbstractIntegrationsApi* | **integrationsCommercePost** | **POST** /integrations/commerce | Create commerce integration
*AbstractIntegrationsApi* | **integrationsGetList** | **GET** /integrations | Get integration metadata list
*AbstractIntegrationsApi* | **integrationsLogsPost** | **POST** /integrations/logs | Receives batched logs from integration applications.
*AbstractIntegrationsApi* | **integrationsCommerceDel** | **DELETE** /integrations/commerce/{external_business_id} | Delete commerce integration
*AbstractIntegrationsApi* | **integrationsCommerceGet** | **GET** /integrations/commerce/{external_business_id} | Get commerce integration
*AbstractIntegrationsApi* | **integrationsCommercePatch** | **PATCH** /integrations/commerce/{external_business_id} | Update commerce integration
*AbstractIntegrationsApi* | **integrationsGetById** | **GET** /integrations/{id} | Get integration metadata
*AbstractKeywordsApi* | **countryKeywordsMetricsGet** | **GET** /ad_accounts/{ad_account_id}/keywords/metrics | Get country's keyword metrics
*AbstractKeywordsApi* | **keywordsCreate** | **POST** /ad_accounts/{ad_account_id}/keywords | Create keywords
*AbstractKeywordsApi* | **keywordsGet** | **GET** /ad_accounts/{ad_account_id}/keywords | Get keywords
*AbstractKeywordsApi* | **keywordsUpdate** | **PATCH** /ad_accounts/{ad_account_id}/keywords | Update keywords
*AbstractKeywordsApi* | **trendingKeywordsList** | **GET** /trends/keywords/{region}/top/{trend_type} | List trending keywords
*AbstractLabelsApi* | **labelsApply** | **POST** /ad_accounts/{ad_account_id}/labels/{label_id}/apply | Apply label to entity
*AbstractLabelsApi* | **labelsCreate** | **POST** /ad_accounts/{ad_account_id}/labels | Create labels
*AbstractLabelsApi* | **labelsList** | **GET** /ad_accounts/{ad_account_id}/labels | List labels
*AbstractLabelsApi* | **labelsRemove** | **POST** /ad_accounts/{ad_account_id}/labels/{label_id}/remove | Remove label from entities
*AbstractLabelsApi* | **labelsUpdate** | **PATCH** /ad_accounts/{ad_account_id}/labels | Update labels
*AbstractLeadAdsApi* | **adAccountsSubscriptionsDelById** | **DELETE** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Delete lead ads subscription
*AbstractLeadAdsApi* | **adAccountsSubscriptionsGetById** | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Get lead ads subscription by ID
*AbstractLeadAdsApi* | **adAccountsSubscriptionsGetList** | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions | Get lead ads subscriptions
*AbstractLeadAdsApi* | **adAccountsSubscriptionsPost** | **POST** /ad_accounts/{ad_account_id}/leads/subscriptions | Create lead ads subscription
*AbstractLeadFormsApi* | **leadFormGet** | **GET** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id} | Get lead form by id
*AbstractLeadFormsApi* | **leadFormTestCreate** | **POST** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test | Create lead form test data
*AbstractLeadFormsApi* | **leadFormsCreate** | **POST** /ad_accounts/{ad_account_id}/lead_forms | Create lead forms
*AbstractLeadFormsApi* | **leadFormsList** | **GET** /ad_accounts/{ad_account_id}/lead_forms | List lead forms
*AbstractLeadFormsApi* | **leadFormsUpdate** | **PATCH** /ad_accounts/{ad_account_id}/lead_forms | Update lead forms
*AbstractLeadsExportApi* | **leadsExportCreate** | **POST** /ad_accounts/{ad_account_id}/leads_export | Create a request to export leads collected from a lead ad
*AbstractLeadsExportApi* | **leadsExportGet** | **GET** /ad_accounts/{ad_account_id}/leads_export/{leads_export_id} | Get the lead export from the lead export create call
*AbstractMediaApi* | **mediaCreate** | **POST** /media | Register media upload
*AbstractMediaApi* | **mediaList** | **GET** /media | List media uploads
*AbstractMediaApi* | **mediaGet** | **GET** /media/{media_id} | Get media upload details
*AbstractMsotEventsApi* | **msotEventsCreate** | **POST** /ad_accounts/{ad_account_id}/msot/events | Send Measurement Source Of Truth (MSOT) attributed conversion events
*AbstractNotificationApi* | **notificationPost** | **POST** /notifications | Receive notifications from external partners.
*AbstractOauthApi* | **oauthConversionToken** | **POST** /oauth/conversion_token | Generate OAuth access token for conversion API
*AbstractOauthApi* | **oauthToken** | **POST** /oauth/token | Generate OAuth access token
*AbstractOauthApi* | **tokenRevoke** | **POST** /oauth/token/revoke | Revoke a token
*AbstractOrderLinesApi* | **orderLinesGet** | **GET** /ad_accounts/{ad_account_id}/order_lines/{order_line_id} | Get order line
*AbstractOrderLinesApi* | **orderLinesList** | **GET** /ad_accounts/{ad_account_id}/order_lines | Get order lines.
*AbstractPinsApi* | **multiPinsAnalytics** | **GET** /pins/analytics | Get multiple Pin analytics
*AbstractPinsApi* | **pinsCreate** | **POST** /pins | Create Pin
*AbstractPinsApi* | **pinsList** | **GET** /pins | List Pins
*AbstractPinsApi* | **pinsAnalytics** | **GET** /pins/{pin_id}/analytics | Get Pin analytics
*AbstractPinsApi* | **pinsDelete** | **DELETE** /pins/{pin_id} | Delete Pin
*AbstractPinsApi* | **pinsGet** | **GET** /pins/{pin_id} | Get Pin
*AbstractPinsApi* | **pinsSave** | **POST** /pins/{pin_id}/save | Save Pin
*AbstractPinsApi* | **pinsUpdate** | **PATCH** /pins/{pin_id} | Update Pin
*AbstractProductGroupPromotionsApi* | **productGroupPromotionsCreate** | **POST** /ad_accounts/{ad_account_id}/product_group_promotions | Create product group promotions
*AbstractProductGroupPromotionsApi* | **productGroupPromotionsGet** | **GET** /ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id} | Get a product group promotion by id
*AbstractProductGroupPromotionsApi* | **productGroupPromotionsList** | **GET** /ad_accounts/{ad_account_id}/product_group_promotions | Get product group promotions
*AbstractProductGroupPromotionsApi* | **productGroupPromotionsUpdate** | **PATCH** /ad_accounts/{ad_account_id}/product_group_promotions | Update product group promotions
*AbstractProductGroupPromotionsApi* | **productGroupsAnalytics** | **GET** /ad_accounts/{ad_account_id}/product_groups/analytics | Get product group analytics
*AbstractProductTagsApi* | **productTagsBulkAdd** | **POST** /pins/{pin_id}/product_tags | Add product tags to pin
*AbstractProductTagsApi* | **productTagsBulkDelete** | **POST** /pins/{pin_id}/product_tags/bulk-delete | Delete product tags from pin
*AbstractProductTagsApi* | **productTagsList** | **GET** /pins/{pin_id}/product_tags | Get product tags for pin
*AbstractPromotionsApi* | **promotionsCreate** | **POST** /ad_accounts/{ad_account_id}/promotions | Create promotions
*AbstractPromotionsApi* | **promotionsDelete** | **DELETE** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Delete promotion by id
*AbstractPromotionsApi* | **promotionsGet** | **GET** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Get promotion by id
*AbstractPromotionsApi* | **promotionsList** | **GET** /ad_accounts/{ad_account_id}/promotions | Get promotions
*AbstractPromotionsApi* | **promotionsUpdate** | **PATCH** /ad_accounts/{ad_account_id}/promotions | Update promotions
*AbstractResourcesApi* | **adAccountCountriesGet** | **GET** /resources/ad_account_countries | Get ad accounts countries
*AbstractResourcesApi* | **deliveryMetricsGet** | **GET** /resources/delivery_metrics | Get available metrics' definitions
*AbstractResourcesApi* | **leadFormQuestionsGet** | **GET** /resources/lead_form_questions | Get lead form questions
*AbstractResourcesApi* | **metricsReadyStateGet** | **GET** /resources/metrics_ready_state | Get metrics ready state
*AbstractResourcesApi* | **interestTargetingOptionsGet** | **GET** /resources/targeting/interests/{interest_id} | Get interest details
*AbstractResourcesApi* | **targetingOptionsGet** | **GET** /resources/targeting/{targeting_type} | Get targeting options
*AbstractSchedulesApi* | **schedulesCreate** | **POST** /ad_accounts/{ad_account_id}/schedules | Create schedules
*AbstractSchedulesApi* | **schedulesList** | **GET** /ad_accounts/{ad_account_id}/schedules | Get Schedules
*AbstractSchedulesApi* | **schedulesUpdate** | **PATCH** /ad_accounts/{ad_account_id}/schedules | Update schedules
*AbstractSearchApi* | **searchPartnerPins** | **GET** /search/partner/pins | Search pins by a given search term
*AbstractSearchApi* | **searchUserBoardsGet** | **GET** /search/boards | Search user's boards
*AbstractSearchApi* | **searchUserPinsList** | **GET** /search/pins | Search user's Pins
*AbstractTargetingTemplateApi* | **targetingTemplateCreate** | **POST** /ad_accounts/{ad_account_id}/targeting_templates | Create targeting templates
*AbstractTargetingTemplateApi* | **targetingTemplateList** | **GET** /ad_accounts/{ad_account_id}/targeting_templates | List targeting templates
*AbstractTargetingTemplateApi* | **targetingTemplateUpdate** | **PATCH** /ad_accounts/{ad_account_id}/targeting_templates | Update targeting templates
*AbstractTermsApi* | **termsRelatedList** | **GET** /terms/related | List related terms
*AbstractTermsApi* | **termsSuggestedList** | **GET** /terms/suggested | List suggested terms
*AbstractTermsOfServiceApi* | **termsOfServiceGet** | **GET** /ad_accounts/{ad_account_id}/terms_of_service | Get terms of service
*AbstractTrendsApi* | **trendsEditorialArticlesList** | **GET** /trends/editorial_articles | Returns editorial articles for a given region
*AbstractTrendsApi* | **trendsFeaturedTopicsList** | **GET** /trends/topics/featured | Get featured topics
*AbstractTrendsApi* | **trendsProductCategoriesDetailsList** | **GET** /trends/product_categories/details | Get product category details
*AbstractTrendsApi* | **trendsProductCategoriesTrendingList** | **GET** /trends/product_categories/trending | Get a list of growing Shopping Product Categories
*AbstractUserAccountApi* | **boardsUserFollowsList** | **GET** /user_account/following/boards | List following boards
*AbstractUserAccountApi* | **followersList** | **GET** /user_account/followers | List followers
*AbstractUserAccountApi* | **linkedBusinessAccountsGet** | **GET** /user_account/businesses | List linked businesses
*AbstractUserAccountApi* | **unverifyWebsiteDelete** | **DELETE** /user_account/websites | Unverify website
*AbstractUserAccountApi* | **userAccountAnalytics** | **GET** /user_account/analytics | Get user account analytics
*AbstractUserAccountApi* | **userAccountAnalyticsTopPins** | **GET** /user_account/analytics/top_pins | Get user account top pins analytics
*AbstractUserAccountApi* | **userAccountAnalyticsTopVideoPins** | **GET** /user_account/analytics/top_video_pins | Get user account top video pins analytics
*AbstractUserAccountApi* | **userAccountGet** | **GET** /user_account | Get user account
*AbstractUserAccountApi* | **userFollowingGet** | **GET** /user_account/following | List following
*AbstractUserAccountApi* | **userWebsitesGet** | **GET** /user_account/websites | Get user websites
*AbstractUserAccountApi* | **verifyWebsiteUpdate** | **POST** /user_account/websites | Verify website
*AbstractUserAccountApi* | **websiteVerificationGet** | **GET** /user_account/websites/verification | Get user verification code for website claiming
*AbstractUserAccountApi* | **followUserUpdate** | **POST** /user_account/following/{username} | Follow user
*AbstractUserAccountApi* | **userAccountFollowedInterests** | **GET** /users/{username}/interests/follow | List following interests


## Models

* OpenAPIServer\Model\Account
* OpenAPIServer\Model\AccountTemplate
* OpenAPIServer\Model\ActionType
* OpenAPIServer\Model\Ad
* OpenAPIServer\Model\AdAccount
* OpenAPIServer\Model\AdAccountAnalyticsItems
* OpenAPIServer\Model\AdAccountCountriesGet200Response
* OpenAPIServer\Model\AdAccountCreate
* OpenAPIServer\Model\AdAccountEntityType
* OpenAPIServer\Model\AdAccountOwner
* OpenAPIServer\Model\AdAccountToAdAccountSharedAudience
* OpenAPIServer\Model\AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody
* OpenAPIServer\Model\AdAccountToBusinessSharedAudience
* OpenAPIServer\Model\AdAccountToBusinessSharedAudienceUpdateWithRequiredBody
* OpenAPIServer\Model\AdAccountsAudience
* OpenAPIServer\Model\AdAccountsAudienceCreate
* OpenAPIServer\Model\AdAccountsAudienceRule
* OpenAPIServer\Model\AdAccountsAudienceUpdate
* OpenAPIServer\Model\AdAccountsAudiencesSharedAccountsList200Response
* OpenAPIServer\Model\AdAccountsCountry
* OpenAPIServer\Model\AdAccountsList200Response
* OpenAPIServer\Model\AdAccountsSubscriptionsGetList200Response
* OpenAPIServer\Model\AdAdsAnalyticsAsyncTargetingTypes
* OpenAPIServer\Model\AdBatchItem
* OpenAPIServer\Model\AdBatchUpdate
* OpenAPIServer\Model\AdBatchWriteResponseModel
* OpenAPIServer\Model\AdCollectionsHeaderType
* OpenAPIServer\Model\AdCreate
* OpenAPIServer\Model\AdCreateRequest
* OpenAPIServer\Model\AdDisapprovalReasons
* OpenAPIServer\Model\AdGroup
* OpenAPIServer\Model\AdGroupAudienceSizing
* OpenAPIServer\Model\AdGroupAudienceSizingCreate
* OpenAPIServer\Model\AdGroupAudienceSizingCreativeTypes
* OpenAPIServer\Model\AdGroupAudienceSizingKeyword
* OpenAPIServer\Model\AdGroupBase
* OpenAPIServer\Model\AdGroupCreate
* OpenAPIServer\Model\AdGroupCreateCreate
* OpenAPIServer\Model\AdGroupCreateRequest
* OpenAPIServer\Model\AdGroupCreateRequestAllOf1
* OpenAPIServer\Model\AdGroupDeliveryEstimates
* OpenAPIServer\Model\AdGroupDeliveryEstimatesKeywordsItems
* OpenAPIServer\Model\AdGroupSummaryStatus
* OpenAPIServer\Model\AdGroupTrackingURLs
* OpenAPIServer\Model\AdGroupUpdate
* OpenAPIServer\Model\AdGroupUpdateBatchUpdate
* OpenAPIServer\Model\AdGroupUpdateRequest
* OpenAPIServer\Model\AdGroupUpdateRequestAllOf1
* OpenAPIServer\Model\AdGroupsAnalyticsMetrics
* OpenAPIServer\Model\AdGroupsCreate200Response
* OpenAPIServer\Model\AdGroupsCreate200ResponseItemsInner
* OpenAPIServer\Model\AdGroupsList200Response
* OpenAPIServer\Model\AdPinAnalytics
* OpenAPIServer\Model\AdPinPreviewCreativeType
* OpenAPIServer\Model\AdPreviewRequest
* OpenAPIServer\Model\AdPreviewShopping
* OpenAPIServer\Model\AdPreviewSourceImage
* OpenAPIServer\Model\AdPreviewSourcePinId
* OpenAPIServer\Model\AdPreviewURLResponse
* OpenAPIServer\Model\AdReviewStatus
* OpenAPIServer\Model\AdShoppingPreviewCreativeType
* OpenAPIServer\Model\AdUpdateRequest
* OpenAPIServer\Model\AdUpdateRequestAllOf1
* OpenAPIServer\Model\AdeColumnType
* OpenAPIServer\Model\AdgroupPlacementGroupType
* OpenAPIServer\Model\AdgroupTrackingFeatureType
* OpenAPIServer\Model\AdgroupTrackingFeatures
* OpenAPIServer\Model\AdsAnalytics
* OpenAPIServer\Model\AdsAnalyticsAccountTargetingType
* OpenAPIServer\Model\AdsAnalyticsAdGroupTargetingType
* OpenAPIServer\Model\AdsAnalyticsAdTargetingType
* OpenAPIServer\Model\AdsAnalyticsCampaignTargetingType
* OpenAPIServer\Model\AdsAnalyticsCreateAsyncRequest
* OpenAPIServer\Model\AdsAnalyticsCreateAsyncResponse
* OpenAPIServer\Model\AdsAnalyticsFilterColumn
* OpenAPIServer\Model\AdsAnalyticsFilterOperator
* OpenAPIServer\Model\AdsAnalyticsGetAsyncResponse
* OpenAPIServer\Model\AdsAnalyticsMetricsFilter
* OpenAPIServer\Model\AdsCreditDiscountType
* OpenAPIServer\Model\AdsCreditDiscountsResponse
* OpenAPIServer\Model\AdsCreditRedeem
* OpenAPIServer\Model\AdsCreditRedeemCreate
* OpenAPIServer\Model\AdsCreditsDiscountsGet200Response
* OpenAPIServer\Model\AdsList200Response
* OpenAPIServer\Model\AdvancedAuctionBidOptions
* OpenAPIServer\Model\AdvancedAuctionItem
* OpenAPIServer\Model\AdvancedAuctionItems
* OpenAPIServer\Model\AdvancedAuctionItemsGetRequest
* OpenAPIServer\Model\AdvancedAuctionItemsSubmitDeleteRecord
* OpenAPIServer\Model\AdvancedAuctionItemsSubmitRecord
* OpenAPIServer\Model\AdvancedAuctionItemsSubmitRequest
* OpenAPIServer\Model\AdvancedAuctionItemsSubmitUpsertRecord
* OpenAPIServer\Model\AdvancedAuctionKey
* OpenAPIServer\Model\AdvancedAuctionOperationError
* OpenAPIServer\Model\AdvancedAuctionProcessedItems
* OpenAPIServer\Model\AdvertiserDefinedEvent
* OpenAPIServer\Model\AdvertiserDefinedEventInput
* OpenAPIServer\Model\AdvertiserDefinedEventMappingType
* OpenAPIServer\Model\AdvertiserDefinedEventProcessingRecord
* OpenAPIServer\Model\AdvertiserDefinedEventsCreate200Response
* OpenAPIServer\Model\AdvertiserDefinedEventsCreateRequest
* OpenAPIServer\Model\AdvertiserDefinedEventsGet200Response
* OpenAPIServer\Model\AgeBucketMultipliers
* OpenAPIServer\Model\AgeTrendsBucket
* OpenAPIServer\Model\AggregatedPinComment
* OpenAPIServer\Model\AiDisclosureItem
* OpenAPIServer\Model\AiDisclosures
* OpenAPIServer\Model\AiDisclosuresUpdate
* OpenAPIServer\Model\AmazonConnectRequest
* OpenAPIServer\Model\AmazonConnectResponse
* OpenAPIServer\Model\AnalyticsDailyMetrics
* OpenAPIServer\Model\AnalyticsMetricsResponse
* OpenAPIServer\Model\AppTypeMultipliers
* OpenAPIServer\Model\AppsflyerAudience
* OpenAPIServer\Model\AppsflyerAudienceCreate
* OpenAPIServer\Model\AppsflyerAudienceSyncCreate
* OpenAPIServer\Model\AppsflyerPlatform
* OpenAPIServer\Model\AssetAccessRequestError
* OpenAPIServer\Model\AssetGroupBinding
* OpenAPIServer\Model\AssetGroupDeleteError
* OpenAPIServer\Model\AssetGroupDeletion
* OpenAPIServer\Model\AssetGroupDeletionDelete
* OpenAPIServer\Model\AssetGroupInput
* OpenAPIServer\Model\AssetGroupInputCreate
* OpenAPIServer\Model\AssetGroupModification
* OpenAPIServer\Model\AssetGroupModificationReadOrUpdate
* OpenAPIServer\Model\AssetGroupType
* OpenAPIServer\Model\AssetGroupUpdateError
* OpenAPIServer\Model\AssetGroupUpdateItemReadOrUpdateItem
* OpenAPIServer\Model\AssetIdPermissions
* OpenAPIServer\Model\AssetIdWithPermissions
* OpenAPIServer\Model\AssetPermissionType
* OpenAPIServer\Model\AssetSearchBy
* OpenAPIServer\Model\AssetSortBy
* OpenAPIServer\Model\AssetTypeResponse
* OpenAPIServer\Model\AttributionActionType
* OpenAPIServer\Model\AttributionMatchType
* OpenAPIServer\Model\AttributionModel
* OpenAPIServer\Model\AttributionScope
* OpenAPIServer\Model\AttributionWindows
* OpenAPIServer\Model\Audience
* OpenAPIServer\Model\AudienceAccountType
* OpenAPIServer\Model\AudienceCategory
* OpenAPIServer\Model\AudienceDefinition
* OpenAPIServer\Model\AudienceDemographicValue
* OpenAPIServer\Model\AudienceDemographics
* OpenAPIServer\Model\AudienceInsightType
* OpenAPIServer\Model\AudienceInsights
* OpenAPIServer\Model\AudienceInsightsScopeAndTypeGet200Response
* OpenAPIServer\Model\AudienceObjectiveType
* OpenAPIServer\Model\AudienceOwnershipType
* OpenAPIServer\Model\AudienceRule
* OpenAPIServer\Model\AudienceStatus
* OpenAPIServer\Model\AudienceSubcategory
* OpenAPIServer\Model\AudienceType
* OpenAPIServer\Model\AudienceUpdateOperationType
* OpenAPIServer\Model\AudiencesList200Response
* OpenAPIServer\Model\AuthRespondInviteAction
* OpenAPIServer\Model\AuthRespondInvitesBody
* OpenAPIServer\Model\AuthRespondInvitesBodyItem
* OpenAPIServer\Model\AvailabilityFilter
* OpenAPIServer\Model\BaseBusinessAssets
* OpenAPIServer\Model\BaseInviteDataResponse
* OpenAPIServer\Model\BasePreferredMediaType
* OpenAPIServer\Model\BatchOperationStatus
* OpenAPIServer\Model\BidFloor
* OpenAPIServer\Model\BidFloorCreate
* OpenAPIServer\Model\BidFloorObjectiveType
* OpenAPIServer\Model\BidFloorSpec
* OpenAPIServer\Model\BidOptionsAgeBucketMultipliers
* OpenAPIServer\Model\BidOptionsAppTypeMultipliers
* OpenAPIServer\Model\BidOptionsAudienceMultipliers
* OpenAPIServer\Model\BidOptionsGenderMultipliers
* OpenAPIServer\Model\BidOptionsPlacementMultipliers
* OpenAPIServer\Model\BidStrategyType
* OpenAPIServer\Model\BillingInvoice
* OpenAPIServer\Model\BillingInvoiceDocumentType
* OpenAPIServer\Model\BillingInvoiceDownloadResponse
* OpenAPIServer\Model\BillingInvoiceSortField
* OpenAPIServer\Model\BillingInvoiceStatus
* OpenAPIServer\Model\BillingInvoicesGet200Response
* OpenAPIServer\Model\BillingProfileCardType
* OpenAPIServer\Model\BillingProfilePaymentMethodBrand
* OpenAPIServer\Model\BillingProfileStatus
* OpenAPIServer\Model\BillingProfilesGet200Response
* OpenAPIServer\Model\BillingProfilesResponse
* OpenAPIServer\Model\BillingType
* OpenAPIServer\Model\Board
* OpenAPIServer\Model\BoardBase
* OpenAPIServer\Model\BoardCreate
* OpenAPIServer\Model\BoardMedia
* OpenAPIServer\Model\BoardOwner
* OpenAPIServer\Model\BoardPrivacy
* OpenAPIServer\Model\BoardPrivacyFilter
* OpenAPIServer\Model\BoardSection
* OpenAPIServer\Model\BoardSectionCreate
* OpenAPIServer\Model\BoardSectionUpdateWithRequiredBody
* OpenAPIServer\Model\BoardSectionsList200Response
* OpenAPIServer\Model\BoardUpdatePrivacy
* OpenAPIServer\Model\BoardWithUpdatePrivacy
* OpenAPIServer\Model\BoardWithUpdatePrivacyUpdate
* OpenAPIServer\Model\BoardsList200Response
* OpenAPIServer\Model\BoardsListPins200Response
* OpenAPIServer\Model\BookClosed
* OpenAPIServer\Model\BrandAccount
* OpenAPIServer\Model\BrandAccountCreate
* OpenAPIServer\Model\BrandAccountProfileImage
* OpenAPIServer\Model\BrandAccountProfileImageUpdate
* OpenAPIServer\Model\BrandAccountUpdate
* OpenAPIServer\Model\BrandFilter
* OpenAPIServer\Model\BudgetDurationType
* OpenAPIServer\Model\BudgetType
* OpenAPIServer\Model\BulkCampaignDeliveryEstimatesItem
* OpenAPIServer\Model\BulkCampaignDeliveryEstimatesResponse
* OpenAPIServer\Model\BulkDownload
* OpenAPIServer\Model\BulkDownloadCampaignFilter
* OpenAPIServer\Model\BulkDownloadCreate
* OpenAPIServer\Model\BulkEntityType
* OpenAPIServer\Model\BulkJobData
* OpenAPIServer\Model\BulkOutputFormat
* OpenAPIServer\Model\BulkReportingJobStatus
* OpenAPIServer\Model\BulkRequestStatus
* OpenAPIServer\Model\BulkUpsertRequest
* OpenAPIServer\Model\BulkUpsertRequestCreate
* OpenAPIServer\Model\BulkUpsertRequestCreateCatalogProductGroupsItems
* OpenAPIServer\Model\BulkUpsertRequestUpdate
* OpenAPIServer\Model\BulkUpsertRequestUpdateCatalogProductGroupsItems
* OpenAPIServer\Model\BulkUpsertResponse
* OpenAPIServer\Model\BusinessAccessRole
* OpenAPIServer\Model\BusinessAccessUserSummary
* OpenAPIServer\Model\BusinessAssetMembersGet200Response
* OpenAPIServer\Model\BusinessAssets
* OpenAPIServer\Model\BusinessAssetsGet200Response
* OpenAPIServer\Model\BusinessMemberAssetsGetResponse
* OpenAPIServer\Model\BusinessMemberAssetsSummary
* OpenAPIServer\Model\BusinessMemberSortBy
* OpenAPIServer\Model\BusinessMembersAssetAccessDeleteBody
* OpenAPIServer\Model\BusinessMembershipMember
* OpenAPIServer\Model\BusinessPartnerAssetAccessGet200Response
* OpenAPIServer\Model\BusinessRoleForInvite
* OpenAPIServer\Model\BusinessRoleForMembers
* OpenAPIServer\Model\BusinessSearchBy
* OpenAPIServer\Model\BusinessToAdAccountSharedAudience
* OpenAPIServer\Model\BusinessToAdAccountSharedAudienceUpdateWithRequiredBody
* OpenAPIServer\Model\BusinessToBusinessSharedAudience
* OpenAPIServer\Model\BusinessToBusinessSharedAudienceUpdateWithRequiredBody
* OpenAPIServer\Model\Campaign
* OpenAPIServer\Model\CampaignAdPreview
* OpenAPIServer\Model\CampaignAdPreviewCreate
* OpenAPIServer\Model\CampaignAdPreviewCreate200ResponseInner
* OpenAPIServer\Model\CampaignAdPreviewCreate200ResponseInnerData
* OpenAPIServer\Model\CampaignAdPreviewCreate200ResponseInnerDataOneOf
* OpenAPIServer\Model\CampaignAdPreviewDelete200ResponseInner
* OpenAPIServer\Model\CampaignAdPreviewDelete200ResponseInnerStatus
* OpenAPIServer\Model\CampaignAudienceMultipliers
* OpenAPIServer\Model\CampaignBatchItem
* OpenAPIServer\Model\CampaignBatchResponseData
* OpenAPIServer\Model\CampaignBatchUpdateItem
* OpenAPIServer\Model\CampaignBatchWriteResponseModel
* OpenAPIServer\Model\CampaignBidOptions
* OpenAPIServer\Model\CampaignBidOptionsCreate
* OpenAPIServer\Model\CampaignBidOptionsUpdate
* OpenAPIServer\Model\CampaignBidOptionsUpdateMaskItems
* OpenAPIServer\Model\CampaignCreateItem
* OpenAPIServer\Model\CampaignCreateRequest
* OpenAPIServer\Model\CampaignCreateRequestAllOf1
* OpenAPIServer\Model\CampaignDeliveryEstimatesCampaign
* OpenAPIServer\Model\CampaignDeliveryEstimatesDerivedMetrics
* OpenAPIServer\Model\CampaignDeliveryEstimatesResponse
* OpenAPIServer\Model\CampaignObjectiveType
* OpenAPIServer\Model\CampaignPlanningAdGroupAudienceSize
* OpenAPIServer\Model\CampaignPlanningBudgetRecommendation
* OpenAPIServer\Model\CampaignPlanningBudgetRecommendationPoint
* OpenAPIServer\Model\CampaignPlanningConfidenceLevelAlert
* OpenAPIServer\Model\CampaignPlanningConfidenceLevelAlertReason
* OpenAPIServer\Model\CampaignPlanningConfidenceLevelAlertSeverity
* OpenAPIServer\Model\CampaignPlanningConversionAttribution
* OpenAPIServer\Model\CampaignPlanningConversionAttributionWindowDays
* OpenAPIServer\Model\CampaignPlanningConversionEvent
* OpenAPIServer\Model\CampaignPlanningConversionRate
* OpenAPIServer\Model\CampaignPlanningCurveEstimate
* OpenAPIServer\Model\CampaignPlanningEstimationType
* OpenAPIServer\Model\CampaignPlanningExperimentBudgetRecommendation
* OpenAPIServer\Model\CampaignPlanningPointEstimate
* OpenAPIServer\Model\CampaignPlanningResponseError
* OpenAPIServer\Model\CampaignPlanningResponseErrorCode
* OpenAPIServer\Model\CampaignSummaryStatus
* OpenAPIServer\Model\CampaignUpdateRequest
* OpenAPIServer\Model\CampaignUpdateRequestAllOf2
* OpenAPIServer\Model\CampaignsAnalyticsMetrics
* OpenAPIServer\Model\CampaignsList200Response
* OpenAPIServer\Model\CancelInviteException
* OpenAPIServer\Model\CancelInviteResult
* OpenAPIServer\Model\CancelInviteResultItem
* OpenAPIServer\Model\CancelInviteResultUser
* OpenAPIServer\Model\CancelInvitesRequest
* OpenAPIServer\Model\CancelInvitesResponse
* OpenAPIServer\Model\CarouselSlot
* OpenAPIServer\Model\CartingProduct
* OpenAPIServer\Model\CartingRetailer
* OpenAPIServer\Model\Catalog
* OpenAPIServer\Model\CatalogBinding
* OpenAPIServer\Model\CatalogCreate
* OpenAPIServer\Model\CatalogUpdate
* OpenAPIServer\Model\CatalogsAiContentDisclosure
* OpenAPIServer\Model\CatalogsAiContentDisclosureLabel
* OpenAPIServer\Model\CatalogsAvailableFilterValues
* OpenAPIServer\Model\CatalogsBaseFilterKeys
* OpenAPIServer\Model\CatalogsBaseFiltersAllOf
* OpenAPIServer\Model\CatalogsBaseFiltersAnyOf
* OpenAPIServer\Model\CatalogsCreateCreativeAssetsItem
* OpenAPIServer\Model\CatalogsCreateHotelItem
* OpenAPIServer\Model\CatalogsCreateReportResponse
* OpenAPIServer\Model\CatalogsCreateRetailItem
* OpenAPIServer\Model\CatalogsCreativeAssetsAttributes
* OpenAPIServer\Model\CatalogsCreativeAssetsAvailableFilterValues
* OpenAPIServer\Model\CatalogsCreativeAssetsBatchItem
* OpenAPIServer\Model\CatalogsCreativeAssetsBatchRequest
* OpenAPIServer\Model\CatalogsCreativeAssetsFeed
* OpenAPIServer\Model\CatalogsCreativeAssetsFeedsCreateRequest
* OpenAPIServer\Model\CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale
* OpenAPIServer\Model\CatalogsCreativeAssetsFeedsUpdateRequest
* OpenAPIServer\Model\CatalogsCreativeAssetsFilterValuesMap
* OpenAPIServer\Model\CatalogsCreativeAssetsItemErrorResponse
* OpenAPIServer\Model\CatalogsCreativeAssetsItemResponse
* OpenAPIServer\Model\CatalogsCreativeAssetsItemsBatch
* OpenAPIServer\Model\CatalogsCreativeAssetsItemsPostFilter
* OpenAPIServer\Model\CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest
* OpenAPIServer\Model\CatalogsCreativeAssetsProduct
* OpenAPIServer\Model\CatalogsCreativeAssetsProductGroup
* OpenAPIServer\Model\CatalogsCreativeAssetsProductGroupCreateRequest
* OpenAPIServer\Model\CatalogsCreativeAssetsProductGroupFilterKeys
* OpenAPIServer\Model\CatalogsCreativeAssetsProductGroupFilters
* OpenAPIServer\Model\CatalogsCreativeAssetsProductGroupFiltersAllOf
* OpenAPIServer\Model\CatalogsCreativeAssetsProductGroupFiltersAnyOf
* OpenAPIServer\Model\CatalogsCreativeAssetsProductGroupProductCounts
* OpenAPIServer\Model\CatalogsCreativeAssetsProductGroupUpdateRequest
* OpenAPIServer\Model\CatalogsCreativeAssetsProductMetadata
* OpenAPIServer\Model\CatalogsDeleteCreativeAssetsItem
* OpenAPIServer\Model\CatalogsDeleteHotelItem
* OpenAPIServer\Model\CatalogsDeleteRetailItem
* OpenAPIServer\Model\CatalogsFeed
* OpenAPIServer\Model\CatalogsFeedCreateRequestSchema
* OpenAPIServer\Model\CatalogsFeedCredentials
* OpenAPIServer\Model\CatalogsFeedIngestion
* OpenAPIServer\Model\CatalogsFeedIngestionDetails
* OpenAPIServer\Model\CatalogsFeedIngestionErrors
* OpenAPIServer\Model\CatalogsFeedIngestionInfo
* OpenAPIServer\Model\CatalogsFeedIngestionWarnings
* OpenAPIServer\Model\CatalogsFeedProcessingResult
* OpenAPIServer\Model\CatalogsFeedProcessingSchedule
* OpenAPIServer\Model\CatalogsFeedProcessingScheduleTimezone
* OpenAPIServer\Model\CatalogsFeedProcessingStatus
* OpenAPIServer\Model\CatalogsFeedProductCounts
* OpenAPIServer\Model\CatalogsFeedUpdateRequestSchema
* OpenAPIServer\Model\CatalogsFeedValidationDetails
* OpenAPIServer\Model\CatalogsFeedValidationErrors
* OpenAPIServer\Model\CatalogsFeedValidationWarnings
* OpenAPIServer\Model\CatalogsFeedVideoCounts
* OpenAPIServer\Model\CatalogsFeedsCreateRequest
* OpenAPIServer\Model\CatalogsFeedsUpdateRequest
* OpenAPIServer\Model\CatalogsFormat
* OpenAPIServer\Model\CatalogsHotelAddress
* OpenAPIServer\Model\CatalogsHotelAttributes
* OpenAPIServer\Model\CatalogsHotelAvailableFilterValues
* OpenAPIServer\Model\CatalogsHotelBatchItem
* OpenAPIServer\Model\CatalogsHotelBatchRequest
* OpenAPIServer\Model\CatalogsHotelFeed
* OpenAPIServer\Model\CatalogsHotelFeedsCreateRequest
* OpenAPIServer\Model\CatalogsHotelFeedsUpdateRequest
* OpenAPIServer\Model\CatalogsHotelFilterValuesMap
* OpenAPIServer\Model\CatalogsHotelGuestRatings
* OpenAPIServer\Model\CatalogsHotelItemErrorResponse
* OpenAPIServer\Model\CatalogsHotelItemResponse
* OpenAPIServer\Model\CatalogsHotelItemsBatch
* OpenAPIServer\Model\CatalogsHotelItemsPostFilter
* OpenAPIServer\Model\CatalogsHotelListProductsByCatalogBasedFilterRequest
* OpenAPIServer\Model\CatalogsHotelMainImage
* OpenAPIServer\Model\CatalogsHotelProduct
* OpenAPIServer\Model\CatalogsHotelProductGroup
* OpenAPIServer\Model\CatalogsHotelProductGroupCreateRequest
* OpenAPIServer\Model\CatalogsHotelProductGroupFilterKeys
* OpenAPIServer\Model\CatalogsHotelProductGroupFilters
* OpenAPIServer\Model\CatalogsHotelProductGroupFiltersAllOf
* OpenAPIServer\Model\CatalogsHotelProductGroupFiltersAnyOf
* OpenAPIServer\Model\CatalogsHotelProductGroupProductCounts
* OpenAPIServer\Model\CatalogsHotelProductGroupType
* OpenAPIServer\Model\CatalogsHotelProductGroupUpdateRequest
* OpenAPIServer\Model\CatalogsHotelProductMetadata
* OpenAPIServer\Model\CatalogsHotelReportParameters
* OpenAPIServer\Model\CatalogsHotelReportParametersReport
* OpenAPIServer\Model\CatalogsHotelReportStatsParameters
* OpenAPIServer\Model\CatalogsHotelReportStatsParametersReport
* OpenAPIServer\Model\CatalogsItemValidationDetails
* OpenAPIServer\Model\CatalogsItemValidationErrors
* OpenAPIServer\Model\CatalogsItemValidationIssue
* OpenAPIServer\Model\CatalogsItemValidationIssues
* OpenAPIServer\Model\CatalogsItemValidationWarnings
* OpenAPIServer\Model\CatalogsItemsBatch
* OpenAPIServer\Model\CatalogsItemsBatchPostRequest
* OpenAPIServer\Model\CatalogsItemsBatchRequest
* OpenAPIServer\Model\CatalogsItemsCreateBatchRequest
* OpenAPIServer\Model\CatalogsItemsDeleteBatchRequest
* OpenAPIServer\Model\CatalogsItemsDeleteDiscontinuedBatchRequest
* OpenAPIServer\Model\CatalogsItemsPostFilters
* OpenAPIServer\Model\CatalogsItemsRequest
* OpenAPIServer\Model\CatalogsItemsUpdateBatchRequest
* OpenAPIServer\Model\CatalogsItemsUpsertBatchRequest
* OpenAPIServer\Model\CatalogsList200Response
* OpenAPIServer\Model\CatalogsListProductsByFeedBasedFilter
* OpenAPIServer\Model\CatalogsListProductsByFilterRequest
* OpenAPIServer\Model\CatalogsLocalStoresCreate200ResponseInner
* OpenAPIServer\Model\CatalogsLocalStoresCreate200ResponseInnerData
* OpenAPIServer\Model\CatalogsLocalStoresCreate200ResponseInnerDataOneOf
* OpenAPIServer\Model\CatalogsLocalStoresDelete200ResponseInner
* OpenAPIServer\Model\CatalogsLocalStoresList200Response
* OpenAPIServer\Model\CatalogsLocale
* OpenAPIServer\Model\CatalogsProduct
* OpenAPIServer\Model\CatalogsProductGroupCreateRequest
* OpenAPIServer\Model\CatalogsProductGroupCurrencyCriteria
* OpenAPIServer\Model\CatalogsProductGroupFilterKeys
* OpenAPIServer\Model\CatalogsProductGroupFilterOperatorTypeCriteria
* OpenAPIServer\Model\CatalogsProductGroupFilters
* OpenAPIServer\Model\CatalogsProductGroupFiltersAllOf
* OpenAPIServer\Model\CatalogsProductGroupFiltersAnyOf
* OpenAPIServer\Model\CatalogsProductGroupFiltersRequest
* OpenAPIServer\Model\CatalogsProductGroupFiltersRequestAnyOfItems0
* OpenAPIServer\Model\CatalogsProductGroupFiltersRequestAnyOfItems1
* OpenAPIServer\Model\CatalogsProductGroupMultipleCountriesCriteria
* OpenAPIServer\Model\CatalogsProductGroupMultipleGenderCriteria
* OpenAPIServer\Model\CatalogsProductGroupMultipleMediaTypesCriteria
* OpenAPIServer\Model\CatalogsProductGroupMultiplePinterestProductCategoryCriteria
* OpenAPIServer\Model\CatalogsProductGroupMultipleStringCriteria
* OpenAPIServer\Model\CatalogsProductGroupMultipleStringListCriteria
* OpenAPIServer\Model\CatalogsProductGroupPinsList200Response
* OpenAPIServer\Model\CatalogsProductGroupPricingCriteria
* OpenAPIServer\Model\CatalogsProductGroupProductCountsVertical
* OpenAPIServer\Model\CatalogsProductGroupStatus
* OpenAPIServer\Model\CatalogsProductGroupType
* OpenAPIServer\Model\CatalogsProductGroupUint32Criteria
* OpenAPIServer\Model\CatalogsProductGroupUpdateManyRequestItemsOneOfItems0
* OpenAPIServer\Model\CatalogsProductGroupUpdateRequest
* OpenAPIServer\Model\CatalogsProductGroupsCreateManyRequestItems
* OpenAPIServer\Model\CatalogsProductGroupsCreateRequestSchema
* OpenAPIServer\Model\CatalogsProductGroupsList200Response
* OpenAPIServer\Model\CatalogsProductGroupsUpdateRequestSchema
* OpenAPIServer\Model\CatalogsReport
* OpenAPIServer\Model\CatalogsReportDistributionIssueFilter
* OpenAPIServer\Model\CatalogsReportDistributionStats
* OpenAPIServer\Model\CatalogsReportFeedIngestionFilter
* OpenAPIServer\Model\CatalogsReportFeedIngestionStats
* OpenAPIServer\Model\CatalogsReportParameters
* OpenAPIServer\Model\CatalogsReportStats
* OpenAPIServer\Model\CatalogsReportStatsParameters
* OpenAPIServer\Model\CatalogsRetailAvailableFilterValues
* OpenAPIServer\Model\CatalogsRetailBatchRequest
* OpenAPIServer\Model\CatalogsRetailBatchRequestItemsItems
* OpenAPIServer\Model\CatalogsRetailFeed
* OpenAPIServer\Model\CatalogsRetailFeedsCreateRequest
* OpenAPIServer\Model\CatalogsRetailFeedsUpdateRequest
* OpenAPIServer\Model\CatalogsRetailFilterValuesMap
* OpenAPIServer\Model\CatalogsRetailItemErrorResponse
* OpenAPIServer\Model\CatalogsRetailItemResponse
* OpenAPIServer\Model\CatalogsRetailItemsBatch
* OpenAPIServer\Model\CatalogsRetailItemsPostFilter
* OpenAPIServer\Model\CatalogsRetailListProductsByCatalogBasedFilterRequest
* OpenAPIServer\Model\CatalogsRetailProduct
* OpenAPIServer\Model\CatalogsRetailProductGroup
* OpenAPIServer\Model\CatalogsRetailProductGroupCreateRequest
* OpenAPIServer\Model\CatalogsRetailProductGroupProductCounts
* OpenAPIServer\Model\CatalogsRetailProductGroupUpdateRequest
* OpenAPIServer\Model\CatalogsRetailProductMetadata
* OpenAPIServer\Model\CatalogsRetailReportAllItemsFilter
* OpenAPIServer\Model\CatalogsRetailReportParameters
* OpenAPIServer\Model\CatalogsRetailReportParametersReport
* OpenAPIServer\Model\CatalogsRetailReportStatsParameters
* OpenAPIServer\Model\CatalogsRetailReportStatsParametersReport
* OpenAPIServer\Model\CatalogsStatus
* OpenAPIServer\Model\CatalogsType
* OpenAPIServer\Model\CatalogsUpdatableCreativeAssetsAttributes
* OpenAPIServer\Model\CatalogsUpdatableHotelAttributes
* OpenAPIServer\Model\CatalogsUpdateCreativeAssetsItem
* OpenAPIServer\Model\CatalogsUpdateHotelItem
* OpenAPIServer\Model\CatalogsUpdateRetailItem
* OpenAPIServer\Model\CatalogsUpsertCreativeAssetsItem
* OpenAPIServer\Model\CatalogsUpsertHotelItem
* OpenAPIServer\Model\CatalogsUpsertRetailItem
* OpenAPIServer\Model\CatalogsVerticalBatchRequest
* OpenAPIServer\Model\CatalogsVerticalFeedsCreateRequest
* OpenAPIServer\Model\CatalogsVerticalFeedsUpdateRequest
* OpenAPIServer\Model\CatalogsVerticalProductGroup
* OpenAPIServer\Model\CatalogsVerticalProductGroupCreateRequest
* OpenAPIServer\Model\CatalogsVerticalProductGroupUpdateRequest
* OpenAPIServer\Model\CatalogsVerticalsListProductsByCatalogBasedFilterRequest
* OpenAPIServer\Model\ChangeHistoryDataType
* OpenAPIServer\Model\ChangeHistoryOperationType
* OpenAPIServer\Model\CollectionsHeaderType
* OpenAPIServer\Model\ConditionFilter
* OpenAPIServer\Model\ContentType
* OpenAPIServer\Model\ConversionAccessToken
* OpenAPIServer\Model\ConversionApiResponseEventsItems
* OpenAPIServer\Model\ConversionAttributionWindowDays
* OpenAPIServer\Model\ConversionDeletionRequest
* OpenAPIServer\Model\ConversionDeletionRequestCreate
* OpenAPIServer\Model\ConversionDeletionRequestEPIKTargets
* OpenAPIServer\Model\ConversionDeletionRequestList200Response
* OpenAPIServer\Model\ConversionDeletionRequestStatus
* OpenAPIServer\Model\ConversionDeletionRequestTargets
* OpenAPIServer\Model\ConversionDeletionRequestUserEmailTargets
* OpenAPIServer\Model\ConversionEvent
* OpenAPIServer\Model\ConversionEventAppInfo
* OpenAPIServer\Model\ConversionEventDeviceInfo
* OpenAPIServer\Model\ConversionEventIngestionSource
* OpenAPIServer\Model\ConversionEventResponse
* OpenAPIServer\Model\ConversionEvents
* OpenAPIServer\Model\ConversionEventsCreate
* OpenAPIServer\Model\ConversionEventsDataItems
* OpenAPIServer\Model\ConversionEventsDataItemsCustomData
* OpenAPIServer\Model\ConversionEventsDataItemsCustomDataContentsItems
* OpenAPIServer\Model\ConversionEventsUserDataProperties
* OpenAPIServer\Model\ConversionHealthSelectionItem
* OpenAPIServer\Model\ConversionLearningModeType
* OpenAPIServer\Model\ConversionMSOTEventsCreate
* OpenAPIServer\Model\ConversionObjectiveType
* OpenAPIServer\Model\ConversionProductAttributionType
* OpenAPIServer\Model\ConversionProductReport
* OpenAPIServer\Model\ConversionProductReportBreakdownType
* OpenAPIServer\Model\ConversionProductReportCreate
* OpenAPIServer\Model\ConversionProductReportGranularity
* OpenAPIServer\Model\ConversionProductReportLevel
* OpenAPIServer\Model\ConversionProductReportingColumn
* OpenAPIServer\Model\ConversionReportAttributionType
* OpenAPIServer\Model\ConversionReportTimeType
* OpenAPIServer\Model\ConversionTag
* OpenAPIServer\Model\ConversionTagCommon
* OpenAPIServer\Model\ConversionTagConfigs
* OpenAPIServer\Model\ConversionTagCreate
* OpenAPIServer\Model\ConversionTagResponse
* OpenAPIServer\Model\ConversionTagType
* OpenAPIServer\Model\ConversionTagTypeOptimal
* OpenAPIServer\Model\ConversionTagV3GoalMetadata
* OpenAPIServer\Model\ConversionTagsList200Response
* OpenAPIServer\Model\Country
* OpenAPIServer\Model\CountryFilter
* OpenAPIServer\Model\CreateAssetAccessRequestBody
* OpenAPIServer\Model\CreateAssetAccessRequestItem
* OpenAPIServer\Model\CreateAssetAccessRequestResponse
* OpenAPIServer\Model\CreateAssetInvitesRequest
* OpenAPIServer\Model\CreateAssetInvitesRequestItem
* OpenAPIServer\Model\CreateInvitesResultsResponseArray
* OpenAPIServer\Model\CreateMembershipOrPartnershipInvitesBody
* OpenAPIServer\Model\CreationSource
* OpenAPIServer\Model\CreativeAssetsIdFilter
* OpenAPIServer\Model\CreativeAssetsProcessingRecord
* OpenAPIServer\Model\CreativeAssetsVisibilityType
* OpenAPIServer\Model\CreativeType
* OpenAPIServer\Model\Currency
* OpenAPIServer\Model\CurrencyFilter
* OpenAPIServer\Model\CustomConversionEventMetrics
* OpenAPIServer\Model\CustomLabel0Filter
* OpenAPIServer\Model\CustomLabel1Filter
* OpenAPIServer\Model\CustomLabel2Filter
* OpenAPIServer\Model\CustomLabel3Filter
* OpenAPIServer\Model\CustomLabel4Filter
* OpenAPIServer\Model\CustomNumber0Filter
* OpenAPIServer\Model\CustomNumber1Filter
* OpenAPIServer\Model\CustomNumber2Filter
* OpenAPIServer\Model\CustomNumber3Filter
* OpenAPIServer\Model\CustomNumber4Filter
* OpenAPIServer\Model\CustomerList
* OpenAPIServer\Model\CustomerListCreate
* OpenAPIServer\Model\CustomerListRecordRow
* OpenAPIServer\Model\CustomerListStatus
* OpenAPIServer\Model\CustomerListUpdateWithRequiredBody
* OpenAPIServer\Model\CustomerListUpload
* OpenAPIServer\Model\CustomerListUploadCreateRequest
* OpenAPIServer\Model\CustomerListUploadCreateResponse
* OpenAPIServer\Model\CustomerListsList200Response
* OpenAPIServer\Model\CustomerSegment
* OpenAPIServer\Model\CustomerSegmentCreate
* OpenAPIServer\Model\CustomerSegmentList200Response
* OpenAPIServer\Model\CustomerSegmentUpdateRequestUpdateWithRequiredBody
* OpenAPIServer\Model\CustomizableCTAType
* OpenAPIServer\Model\DataOutputFormat
* OpenAPIServer\Model\DataStatus
* OpenAPIServer\Model\DeleteBusinessMembership200Response
* OpenAPIServer\Model\DeleteBusinessMembershipBody
* OpenAPIServer\Model\DeleteBusinessMembershipMember
* OpenAPIServer\Model\DeleteBusinessPartners
* OpenAPIServer\Model\DeleteBusinessPartnersDelete
* OpenAPIServer\Model\DeleteMemberAccessResult
* OpenAPIServer\Model\DeleteMemberAccessResultsResponseArray
* OpenAPIServer\Model\DeleteMemberAssetAccessItem
* OpenAPIServer\Model\DeletePartnerAssetAccessBody
* OpenAPIServer\Model\DeletePartnerAssetAccessItem
* OpenAPIServer\Model\DeletePartnerAssetAccessResult
* OpenAPIServer\Model\DeletePartnerAssetAccessResultsResponseArray
* OpenAPIServer\Model\DeliveryEstimateObjectiveType
* OpenAPIServer\Model\DeliveryMetricsGet200Response
* OpenAPIServer\Model\DeliveryMetricsResponseItemsItems
* OpenAPIServer\Model\DetailedError
* OpenAPIServer\Model\DisclosureType
* OpenAPIServer\Model\DiscountStatus
* OpenAPIServer\Model\DynamicTitlesDownloadCSV
* OpenAPIServer\Model\DynamicTitlesGetStatus
* OpenAPIServer\Model\DynamicTitlesProcessCSV
* OpenAPIServer\Model\DynamicTitlesProcessCSVCreate
* OpenAPIServer\Model\DynamicTitlesProcessCSVError
* OpenAPIServer\Model\DynamicTitlesUploadURL
* OpenAPIServer\Model\EnhancedMatchStatusType
* OpenAPIServer\Model\EntityDataChangeHistory
* OpenAPIServer\Model\EntityHistory
* OpenAPIServer\Model\EntityLabel
* OpenAPIServer\Model\EntityLabelError
* OpenAPIServer\Model\EntityLabelStatus
* OpenAPIServer\Model\EntityStatus
* OpenAPIServer\Model\ErrorDetail
* OpenAPIServer\Model\EventData
* OpenAPIServer\Model\EventProcessingStatus
* OpenAPIServer\Model\EventQualityScore
* OpenAPIServer\Model\Exception
* OpenAPIServer\Model\FeaturedTrend
* OpenAPIServer\Model\FeedProcessingResultsList200Response
* OpenAPIServer\Model\FeedsList200Response
* OpenAPIServer\Model\FilterOperatorType
* OpenAPIServer\Model\FollowUser
* OpenAPIServer\Model\FollowUserCreate
* OpenAPIServer\Model\FollowersList200Response
* OpenAPIServer\Model\FormFactor
* OpenAPIServer\Model\FreqBidMultiplierTimeWindow
* OpenAPIServer\Model\FrequencyGoalMetadata
* OpenAPIServer\Model\FrequencyGoalMetadataTimerange
* OpenAPIServer\Model\FrequencyMultipliers
* OpenAPIServer\Model\Gender
* OpenAPIServer\Model\GenderBucket
* OpenAPIServer\Model\GenderDemographics
* OpenAPIServer\Model\GenderFilter
* OpenAPIServer\Model\GenderMultipliers
* OpenAPIServer\Model\GetBusinessEmployers200Response
* OpenAPIServer\Model\GetInvites200Response
* OpenAPIServer\Model\GoogleProductCategory0Filter
* OpenAPIServer\Model\GoogleProductCategory1Filter
* OpenAPIServer\Model\GoogleProductCategory2Filter
* OpenAPIServer\Model\GoogleProductCategory3Filter
* OpenAPIServer\Model\GoogleProductCategory4Filter
* OpenAPIServer\Model\GoogleProductCategory5Filter
* OpenAPIServer\Model\GoogleProductCategory6Filter
* OpenAPIServer\Model\Granularity
* OpenAPIServer\Model\GridClickType
* OpenAPIServer\Model\HotelIdFilter
* OpenAPIServer\Model\HotelProcessingRecord
* OpenAPIServer\Model\HttpMethod
* OpenAPIServer\Model\ImageDetails
* OpenAPIServer\Model\ImageMetadata
* OpenAPIServer\Model\ImageSize
* OpenAPIServer\Model\IneligibleProductTagErrorItem
* OpenAPIServer\Model\IneligibleProductTagReason
* OpenAPIServer\Model\IneligibleProductTagsErrorDetails
* OpenAPIServer\Model\IngestionSource
* OpenAPIServer\Model\IngestionSourceOptions
* OpenAPIServer\Model\InnerProductCategoriesMetricsHighlights
* OpenAPIServer\Model\IntegrationLog
* OpenAPIServer\Model\IntegrationLogClientError
* OpenAPIServer\Model\IntegrationLogClientRequest
* OpenAPIServer\Model\IntegrationLogEventType
* OpenAPIServer\Model\IntegrationLogLevel
* OpenAPIServer\Model\IntegrationLogsInvalidLogResponse
* OpenAPIServer\Model\IntegrationLogsInvalidLogResponseRejectedLogsItems
* OpenAPIServer\Model\IntegrationLogsRequestCreate
* OpenAPIServer\Model\IntegrationLogsSuccessResponse
* OpenAPIServer\Model\IntegrationMetadata
* OpenAPIServer\Model\IntegrationMetadataCreate
* OpenAPIServer\Model\IntegrationMetadataUpdate
* OpenAPIServer\Model\IntegrationRecord
* OpenAPIServer\Model\IntegrationsGetList200Response
* OpenAPIServer\Model\IntendedPromotionType
* OpenAPIServer\Model\Interest
* OpenAPIServer\Model\InterestsEnum
* OpenAPIServer\Model\InviteActionResultItem
* OpenAPIServer\Model\InviteAssetsSummary
* OpenAPIServer\Model\InviteAssetsSummaryItem
* OpenAPIServer\Model\InviteBusinessRoleBinding
* OpenAPIServer\Model\InviteDataResponse
* OpenAPIServer\Model\InviteExceptionResponse
* OpenAPIServer\Model\InviteFilterStatus
* OpenAPIServer\Model\InviteResponse
* OpenAPIServer\Model\InviteStatus
* OpenAPIServer\Model\InviteType
* OpenAPIServer\Model\ItemAttributes
* OpenAPIServer\Model\ItemAttributesRequest
* OpenAPIServer\Model\ItemAttributesRequestImageLink
* OpenAPIServer\Model\ItemAvailability
* OpenAPIServer\Model\ItemCreateBatchRecord
* OpenAPIServer\Model\ItemDeleteBatchRecord
* OpenAPIServer\Model\ItemDeleteDiscontinuedBatchRecord
* OpenAPIServer\Model\ItemGroupIdFilter
* OpenAPIServer\Model\ItemIdFilter
* OpenAPIServer\Model\ItemIdStoreCodePair
* OpenAPIServer\Model\ItemProcessingRecord
* OpenAPIServer\Model\ItemProcessingStatus
* OpenAPIServer\Model\ItemResponse
* OpenAPIServer\Model\ItemUpdateBatchRecord
* OpenAPIServer\Model\ItemUpsertBatchRecord
* OpenAPIServer\Model\ItemValidationEvent
* OpenAPIServer\Model\ItemsIssuesList200Response
* OpenAPIServer\Model\ItemsPost200Response
* OpenAPIServer\Model\Keyword
* OpenAPIServer\Model\KeywordCreateItem
* OpenAPIServer\Model\KeywordError
* OpenAPIServer\Model\KeywordInfo
* OpenAPIServer\Model\KeywordMetrics
* OpenAPIServer\Model\KeywordMetricsResponse
* OpenAPIServer\Model\KeywordUpdateGenerated
* OpenAPIServer\Model\KeywordUpdateItem
* OpenAPIServer\Model\Keywords
* OpenAPIServer\Model\KeywordsCommon
* OpenAPIServer\Model\KeywordsCreate
* OpenAPIServer\Model\KeywordsGet200Response
* OpenAPIServer\Model\KeywordsMetricsArrayResponse
* OpenAPIServer\Model\KeywordsRequest
* OpenAPIServer\Model\KeywordsUpdate
* OpenAPIServer\Model\Label
* OpenAPIServer\Model\LabelBulkCreateRequest
* OpenAPIServer\Model\LabelBulkUpdateRequest
* OpenAPIServer\Model\LabelCreateItem
* OpenAPIServer\Model\LabelCreateRequest
* OpenAPIServer\Model\LabelError
* OpenAPIServer\Model\LabelErrorData
* OpenAPIServer\Model\LabelParentType
* OpenAPIServer\Model\LabelStatus
* OpenAPIServer\Model\LabelStatusBulkUpdate
* OpenAPIServer\Model\LabelType
* OpenAPIServer\Model\LabelUpdateItem
* OpenAPIServer\Model\LabelUpdateRequest
* OpenAPIServer\Model\LabeledEntities
* OpenAPIServer\Model\LabeledEntitiesCreate
* OpenAPIServer\Model\LabelsList200Response
* OpenAPIServer\Model\LabelsResponse
* OpenAPIServer\Model\Language
* OpenAPIServer\Model\LeadForm
* OpenAPIServer\Model\LeadFormBatchUpdate
* OpenAPIServer\Model\LeadFormCreate
* OpenAPIServer\Model\LeadFormPolicyLink
* OpenAPIServer\Model\LeadFormQuestion
* OpenAPIServer\Model\LeadFormQuestionFieldType
* OpenAPIServer\Model\LeadFormQuestionType
* OpenAPIServer\Model\LeadFormStatus
* OpenAPIServer\Model\LeadFormTest
* OpenAPIServer\Model\LeadFormTestCreate
* OpenAPIServer\Model\LeadFormsCreate200Response
* OpenAPIServer\Model\LeadFormsCreate200ResponseItemsInner
* OpenAPIServer\Model\LeadFormsList200Response
* OpenAPIServer\Model\LeadSubscription
* OpenAPIServer\Model\LeadSubscriptionCreate
* OpenAPIServer\Model\LeadSubscriptionPostParams
* OpenAPIServer\Model\LeadSubscriptionPostParamsCreate
* OpenAPIServer\Model\LeadsExportResponseData
* OpenAPIServer\Model\LeadsExportStatus
* OpenAPIServer\Model\LeadsExports
* OpenAPIServer\Model\LeadsExportsCreate
* OpenAPIServer\Model\LineItem
* OpenAPIServer\Model\LinkFilter
* OpenAPIServer\Model\LinkedBusiness
* OpenAPIServer\Model\LocalInventoryCreateOperation
* OpenAPIServer\Model\LocalInventoryDeleteOperation
* OpenAPIServer\Model\LocalInventoryItemResponse
* OpenAPIServer\Model\LocalInventoryItemsBatch
* OpenAPIServer\Model\LocalInventoryItemsBatchCreate
* OpenAPIServer\Model\LocalInventoryItemsGet
* OpenAPIServer\Model\LocalInventoryItemsGetCreate
* OpenAPIServer\Model\LocalInventoryOperation
* OpenAPIServer\Model\LocalInventoryOperationResult
* OpenAPIServer\Model\LocalInventoryUpdateOperation
* OpenAPIServer\Model\LocalInventoryUpsertOperation
* OpenAPIServer\Model\LocalStore
* OpenAPIServer\Model\LocalStoreBatchUpdate
* OpenAPIServer\Model\LocalStoreCreate
* OpenAPIServer\Model\LookbackPeriodOptions
* OpenAPIServer\Model\MMMReport
* OpenAPIServer\Model\MMMReportCreate
* OpenAPIServer\Model\MMMReportGranularity
* OpenAPIServer\Model\MMMReportLevel
* OpenAPIServer\Model\MMMReportingColumn
* OpenAPIServer\Model\MMMReportingTargetingType
* OpenAPIServer\Model\MatchType
* OpenAPIServer\Model\MatchTypeResponse
* OpenAPIServer\Model\MaxPriceFilter
* OpenAPIServer\Model\Media
* OpenAPIServer\Model\MediaList200Response
* OpenAPIServer\Model\MediaType
* OpenAPIServer\Model\MediaTypeFilter
* OpenAPIServer\Model\MediaUpload
* OpenAPIServer\Model\MediaUploadCreate
* OpenAPIServer\Model\MediaUploadParameters
* OpenAPIServer\Model\MediaUploadStatus
* OpenAPIServer\Model\MediaUploadType
* OpenAPIServer\Model\MemberBusinessRole
* OpenAPIServer\Model\MetricsReportingLevel
* OpenAPIServer\Model\MetricsReportingTemplateType
* OpenAPIServer\Model\MetricsResponse
* OpenAPIServer\Model\MetricsResponseDataItems
* OpenAPIServer\Model\MinPriceFilter
* OpenAPIServer\Model\MobileAppPlatform
* OpenAPIServer\Model\MsotEventName
* OpenAPIServer\Model\MultiPinsAnalyticsMetricTypesItem
* OpenAPIServer\Model\NetworkType
* OpenAPIServer\Model\NonDraftEntityStatus
* OpenAPIServer\Model\NonNullableCatalogsCurrency
* OpenAPIServer\Model\NotificationPostRequest
* OpenAPIServer\Model\NotificationResponse
* OpenAPIServer\Model\NullableCatalogsItemFieldType
* OpenAPIServer\Model\NullableCurrency
* OpenAPIServer\Model\NullableEntityStatus
* OpenAPIServer\Model\NullableLabelStatus
* OpenAPIServer\Model\NullableLabelType
* OpenAPIServer\Model\NullableOptimizationGoalMetadata
* OpenAPIServer\Model\NullablePartnerType
* OpenAPIServer\Model\NullalbleMatchType
* OpenAPIServer\Model\NumericFilterOperatorType
* OpenAPIServer\Model\OauthAccessToken
* OpenAPIServer\Model\ObjectiveType
* OpenAPIServer\Model\OperationType
* OpenAPIServer\Model\OptimizationGoalMetadata
* OpenAPIServer\Model\OptimizationType
* OpenAPIServer\Model\Order
* OpenAPIServer\Model\OrderLine
* OpenAPIServer\Model\OrderLineMutationError
* OpenAPIServer\Model\OrderLineMutationResponse
* OpenAPIServer\Model\OrderLineMutationResult
* OpenAPIServer\Model\OrderLinePaidType
* OpenAPIServer\Model\OrderLineStatus
* OpenAPIServer\Model\OrderLinesList200Response
* OpenAPIServer\Model\OsFamily
* OpenAPIServer\Model\OverallStatusOptions
* OpenAPIServer\Model\PacingDeliveryType
* OpenAPIServer\Model\PageVisitConversionTagsGet200Response
* OpenAPIServer\Model\PartnerMetadata
* OpenAPIServer\Model\PartnerType
* OpenAPIServer\Model\PerformancePlusCampaignSettings
* OpenAPIServer\Model\Permissions
* OpenAPIServer\Model\PermissionsWithOwner
* OpenAPIServer\Model\Pin
* OpenAPIServer\Model\PinAnalyticsDailyMetrics
* OpenAPIServer\Model\PinAnalyticsMetricsResponse
* OpenAPIServer\Model\PinBase
* OpenAPIServer\Model\PinCreate
* OpenAPIServer\Model\PinFilter
* OpenAPIServer\Model\PinMedia
* OpenAPIServer\Model\PinMediaMetadata
* OpenAPIServer\Model\PinMediaSource
* OpenAPIServer\Model\PinMediaSourceImageBase64
* OpenAPIServer\Model\PinMediaSourceImageURL
* OpenAPIServer\Model\PinMediaSourceImagesBase64
* OpenAPIServer\Model\PinMediaSourceImagesBase64Item
* OpenAPIServer\Model\PinMediaSourceImagesURL
* OpenAPIServer\Model\PinMediaSourceImagesURLItem
* OpenAPIServer\Model\PinMediaSourcePinURL
* OpenAPIServer\Model\PinMediaSourceVideoID
* OpenAPIServer\Model\PinMediaWithImage
* OpenAPIServer\Model\PinMediaWithImageAndVideo
* OpenAPIServer\Model\PinMediaWithImages
* OpenAPIServer\Model\PinMediaWithVideo
* OpenAPIServer\Model\PinMediaWithVideos
* OpenAPIServer\Model\PinPromotionSummaryStatus
* OpenAPIServer\Model\PinRead
* OpenAPIServer\Model\PinType
* OpenAPIServer\Model\PinUpdate
* OpenAPIServer\Model\PinnerListType
* OpenAPIServer\Model\PinsList200Response
* OpenAPIServer\Model\PinsSaveRequestCreate
* OpenAPIServer\Model\PinterestLibBatchItemException
* OpenAPIServer\Model\PinterestLibError
* OpenAPIServer\Model\PinterestLibPaginationOrder
* OpenAPIServer\Model\PinterestLibStatus204
* OpenAPIServer\Model\PinterestProductCategoriesFilter
* OpenAPIServer\Model\PlacementGroupType
* OpenAPIServer\Model\PlacementMultipliers
* OpenAPIServer\Model\PlacementTrafficType
* OpenAPIServer\Model\PlacementType
* OpenAPIServer\Model\PredictedTimeSeries
* OpenAPIServer\Model\PreferredMediaType
* OpenAPIServer\Model\PriceFilter
* OpenAPIServer\Model\PriceFilterPrice
* OpenAPIServer\Model\PrimarySort
* OpenAPIServer\Model\ProductAvailability
* OpenAPIServer\Model\ProductAvailabilityType
* OpenAPIServer\Model\ProductCategoriesDemographic
* OpenAPIServer\Model\ProductCategoriesEngagementType
* OpenAPIServer\Model\ProductCategoriesMetricsHighlights
* OpenAPIServer\Model\ProductCategoryDetailLookbackWindow
* OpenAPIServer\Model\ProductCategoryDetails
* OpenAPIServer\Model\ProductCategoryEnum
* OpenAPIServer\Model\ProductCategoryRegion
* OpenAPIServer\Model\ProductCondition
* OpenAPIServer\Model\ProductGroupAnalyticsItems
* OpenAPIServer\Model\ProductGroupPromotion
* OpenAPIServer\Model\ProductGroupPromotionCreateRequest
* OpenAPIServer\Model\ProductGroupPromotionCustomizableCTAType
* OpenAPIServer\Model\ProductGroupPromotionResponseItem
* OpenAPIServer\Model\ProductGroupPromotionUpdateRequest
* OpenAPIServer\Model\ProductGroupPromotions
* OpenAPIServer\Model\ProductGroupPromotionsCreate
* OpenAPIServer\Model\ProductGroupPromotionsList200Response
* OpenAPIServer\Model\ProductGroupPromotionsUpdateWithRequiredBody
* OpenAPIServer\Model\ProductGroupReferenceFilter
* OpenAPIServer\Model\ProductGroupSummaryStatus
* OpenAPIServer\Model\ProductTagItem
* OpenAPIServer\Model\ProductTagsBulkAddRequest
* OpenAPIServer\Model\ProductTagsBulkDeleteRequest
* OpenAPIServer\Model\ProductTagsError
* OpenAPIServer\Model\ProductTagsResponse
* OpenAPIServer\Model\ProductType0Filter
* OpenAPIServer\Model\ProductType1Filter
* OpenAPIServer\Model\ProductType2Filter
* OpenAPIServer\Model\ProductType3Filter
* OpenAPIServer\Model\ProductType4Filter
* OpenAPIServer\Model\Promotion
* OpenAPIServer\Model\PromotionApplicationLevel
* OpenAPIServer\Model\PromotionArrayElement
* OpenAPIServer\Model\PromotionBatchUpdate
* OpenAPIServer\Model\PromotionCreate
* OpenAPIServer\Model\PromotionTemplateValue
* OpenAPIServer\Model\PromotionType
* OpenAPIServer\Model\PromotionsList200Response
* OpenAPIServer\Model\PromotionsResponse
* OpenAPIServer\Model\PublicTargetingType
* OpenAPIServer\Model\QualityComponentDetails
* OpenAPIServer\Model\QualityComponentIssue
* OpenAPIServer\Model\QualityComponents
* OpenAPIServer\Model\QueryLabelEntityStatusesItems
* OpenAPIServer\Model\QueryLabelTypesItems
* OpenAPIServer\Model\QuerymetrictypesItems
* OpenAPIServer\Model\QuerypinanalyticsmetrictypesItems
* OpenAPIServer\Model\QueryvideopinmetrictypesItems
* OpenAPIServer\Model\QuizPinData
* OpenAPIServer\Model\QuizPinOption
* OpenAPIServer\Model\QuizPinQuestion
* OpenAPIServer\Model\QuizPinResult
* OpenAPIServer\Model\RecordCounts
* OpenAPIServer\Model\RelatedTerms
* OpenAPIServer\Model\RelatedTermsRelatedTermsListItems
* OpenAPIServer\Model\ReportType
* OpenAPIServer\Model\ReportingColumn
* OpenAPIServer\Model\ReportingColumnAsync
* OpenAPIServer\Model\ReportingColumnSync
* OpenAPIServer\Model\ReportingTimeZone
* OpenAPIServer\Model\ReportsStats200Response
* OpenAPIServer\Model\RespondToInviteResultItem
* OpenAPIServer\Model\RespondToInvitesResponseArray
* OpenAPIServer\Model\RetailLocalInventoryItemAttributes
* OpenAPIServer\Model\RetailLocalInventoryItemAttributesOptional
* OpenAPIServer\Model\Role
* OpenAPIServer\Model\S3FilePart
* OpenAPIServer\Model\S3MultipartUploadData
* OpenAPIServer\Model\SSIOAccount
* OpenAPIServer\Model\SSIOAccountAddress
* OpenAPIServer\Model\SSIOAccountItem
* OpenAPIServer\Model\SSIOAccountPMPName
* OpenAPIServer\Model\SSIOInsertionOrder
* OpenAPIServer\Model\SSIOInsertionOrderCreate
* OpenAPIServer\Model\SSIOInsertionOrderStatus
* OpenAPIServer\Model\SSIOInsertionOrderStatusResponse
* OpenAPIServer\Model\SSIOInsertionOrderUpdate
* OpenAPIServer\Model\SSIOOrderLine
* OpenAPIServer\Model\SSIOOrderLineType
* OpenAPIServer\Model\Schedule
* OpenAPIServer\Model\ScheduleAction
* OpenAPIServer\Model\ScheduleAgeBucketMultipliers
* OpenAPIServer\Model\ScheduleAppTypeMultipliers
* OpenAPIServer\Model\ScheduleAudienceMultipliers
* OpenAPIServer\Model\ScheduleBatchUpdate
* OpenAPIServer\Model\ScheduleBidMultipliers
* OpenAPIServer\Model\ScheduleBidOptions
* OpenAPIServer\Model\ScheduleBidOptionsGenderMultipliers
* OpenAPIServer\Model\ScheduleBidOptionsPlacementMultipliers
* OpenAPIServer\Model\ScheduleCommonDeltaValue
* OpenAPIServer\Model\ScheduleCreate
* OpenAPIServer\Model\ScheduleCreateRequest
* OpenAPIServer\Model\ScheduleCreateRequestAllOf1
* OpenAPIServer\Model\ScheduleDeltaValue
* OpenAPIServer\Model\ScheduleGenderMultipliers
* OpenAPIServer\Model\SchedulePlacementMultipliers
* OpenAPIServer\Model\ScheduleStatus
* OpenAPIServer\Model\ScheduleType
* OpenAPIServer\Model\ScheduleUpdateRequest
* OpenAPIServer\Model\ScheduleUpdateRequestAllOf1
* OpenAPIServer\Model\SchedulesCreate200ResponseInner
* OpenAPIServer\Model\SchedulesCreate200ResponseInnerData
* OpenAPIServer\Model\SchedulesCreate200ResponseInnerDataOneOf
* OpenAPIServer\Model\SchedulesList200Response
* OpenAPIServer\Model\ScrollupGoalMetadata
* OpenAPIServer\Model\SearchPartnerPins200Response
* OpenAPIServer\Model\SharedAudienceAccount
* OpenAPIServer\Model\SharedAudiencesForBusinessList200Response
* OpenAPIServer\Model\SingleInterestTargetingOption
* OpenAPIServer\Model\SourcePlatformOptions
* OpenAPIServer\Model\SsioInsertionOrdersStatusGetByAdAccount200Response
* OpenAPIServer\Model\SsioOrderLinesGetByAdAccount200Response
* OpenAPIServer\Model\StandardPinMetricTypes
* OpenAPIServer\Model\StoreMetadata
* OpenAPIServer\Model\SummaryPin
* OpenAPIServer\Model\SummaryStatus
* OpenAPIServer\Model\SupplementalItemBatchOperationStatus
* OpenAPIServer\Model\SupplementalItemProcessingStatus
* OpenAPIServer\Model\SupplementalItemValidationEvent
* OpenAPIServer\Model\SupplementalItemsBatchResponse
* OpenAPIServer\Model\SupplementalOperationResult
* OpenAPIServer\Model\SystemUserUpdateWithRequiredBody
* OpenAPIServer\Model\TargetingAdvertiserCountry
* OpenAPIServer\Model\TargetingSpec
* OpenAPIServer\Model\TargetingSpecAgeBucket
* OpenAPIServer\Model\TargetingSpecAppType
* OpenAPIServer\Model\TargetingSpecGender
* OpenAPIServer\Model\TargetingSpecListOperation
* OpenAPIServer\Model\TargetingSpecOperationAgeBucket
* OpenAPIServer\Model\TargetingSpecOperationAppType
* OpenAPIServer\Model\TargetingSpecOperationAudienceExclude
* OpenAPIServer\Model\TargetingSpecOperationAudienceInclude
* OpenAPIServer\Model\TargetingSpecOperationGender
* OpenAPIServer\Model\TargetingSpecOperationGeo
* OpenAPIServer\Model\TargetingSpecOperationGeoExclude
* OpenAPIServer\Model\TargetingSpecOperationInterest
* OpenAPIServer\Model\TargetingSpecOperationLocale
* OpenAPIServer\Model\TargetingSpecOperationLocation
* OpenAPIServer\Model\TargetingSpecOperationLocationExclude
* OpenAPIServer\Model\TargetingSpecOperationMaximumAge
* OpenAPIServer\Model\TargetingSpecOperationMinimumAge
* OpenAPIServer\Model\TargetingSpecOperationShoppingRetargeting
* OpenAPIServer\Model\TargetingSpecOperations
* OpenAPIServer\Model\TargetingSpecOptimal
* OpenAPIServer\Model\TargetingSpecShoppingRetargeting
* OpenAPIServer\Model\TargetingSpecTargetingStrategyItems
* OpenAPIServer\Model\TargetingStrategy
* OpenAPIServer\Model\TargetingTemplate
* OpenAPIServer\Model\TargetingTemplateAudienceSizing
* OpenAPIServer\Model\TargetingTemplateAudienceSizingReachEstimate
* OpenAPIServer\Model\TargetingTemplateCreate
* OpenAPIServer\Model\TargetingTemplateKeyword
* OpenAPIServer\Model\TargetingTemplateList200Response
* OpenAPIServer\Model\TargetingTemplateStatus
* OpenAPIServer\Model\TargetingTemplateUpdateRequestReadOrUpdate
* OpenAPIServer\Model\TemplateBasedReport
* OpenAPIServer\Model\TemplateBasedReportCreate
* OpenAPIServer\Model\TemplatesList200Response
* OpenAPIServer\Model\TermsOfService
* OpenAPIServer\Model\TieBreakerType
* OpenAPIServer\Model\TimeSeries
* OpenAPIServer\Model\TitleKeywordsFilter
* OpenAPIServer\Model\TokenGrantType
* OpenAPIServer\Model\TokenTypeHint
* OpenAPIServer\Model\TopPinsAnalyticsResponse
* OpenAPIServer\Model\TopPinsAnalyticsResponseDateAvailability
* OpenAPIServer\Model\TopPinsAnalyticsResponsePinsItems
* OpenAPIServer\Model\TopPinsSortBy
* OpenAPIServer\Model\TopVideoPinsAnalyticsResponse
* OpenAPIServer\Model\TopVideoPinsAnalyticsResponseDateAvailability
* OpenAPIServer\Model\TopVideoPinsAnalyticsResponsePinsItems
* OpenAPIServer\Model\TopVideoPinsSortBy
* OpenAPIServer\Model\TotalCountByEntityStatus
* OpenAPIServer\Model\TrackingUrls
* OpenAPIServer\Model\TrendType
* OpenAPIServer\Model\TrendingKeyword
* OpenAPIServer\Model\TrendingKeywordDemographics
* OpenAPIServer\Model\TrendingKeywordsResponse
* OpenAPIServer\Model\TrendingPin
* OpenAPIServer\Model\TrendingProductCategory
* OpenAPIServer\Model\TrendingTopic
* OpenAPIServer\Model\TrendsAgeBucket
* OpenAPIServer\Model\TrendsAgeDistribution
* OpenAPIServer\Model\TrendsEditorial
* OpenAPIServer\Model\TrendsGender
* OpenAPIServer\Model\TrendsGenderDistribution
* OpenAPIServer\Model\TrendsGenderFilter
* OpenAPIServer\Model\TrendsL1Interest
* OpenAPIServer\Model\TrendsSupportedRegion
* OpenAPIServer\Model\UpdatableItemAttributes
* OpenAPIServer\Model\UpdatableItemAttributesGtin
* OpenAPIServer\Model\UpdateBusinessMembershipsResponse
* OpenAPIServer\Model\UpdateInvitesResultsResponseArray
* OpenAPIServer\Model\UpdateMaskBidOptionField
* OpenAPIServer\Model\UpdateMaskFieldType
* OpenAPIServer\Model\UpdateMemberAssetAccessBody
* OpenAPIServer\Model\UpdateMemberAssetAccessItem
* OpenAPIServer\Model\UpdateMemberAssetResultItem
* OpenAPIServer\Model\UpdateMemberAssetsResultsResponseArray
* OpenAPIServer\Model\UpdatePartnerAssetAccessBody
* OpenAPIServer\Model\UpdatePartnerAssetAccessItem
* OpenAPIServer\Model\UpdatePartnerAssetsResult
* OpenAPIServer\Model\UpdatePartnerAssetsResultsResponseArray
* OpenAPIServer\Model\UserAccountFollowedInterests200Response
* OpenAPIServer\Model\UserAccountType
* OpenAPIServer\Model\UserBusinessRoleBinding
* OpenAPIServer\Model\UserFollowingFeedType
* OpenAPIServer\Model\UserListOperationType
* OpenAPIServer\Model\UserListType
* OpenAPIServer\Model\UserSingleAssetBinding
* OpenAPIServer\Model\UserWebsite
* OpenAPIServer\Model\UserWebsiteCreate
* OpenAPIServer\Model\UserWebsiteVerification
* OpenAPIServer\Model\UserWebsitesGet200Response
* OpenAPIServer\Model\UsersForIndividualAssetResponse
* OpenAPIServer\Model\VerticalProductCategory
* OpenAPIServer\Model\VideoMetadataWithItemType
* OpenAPIServer\Model\VideoPinMetricTypes
* OpenAPIServer\Model\WebsiteVerificationMethod
* OpenAPIServer\Model\WorkloadState


## Authentication

### Security schema `pinterest_oauth2`
> Important! To make OAuth authentication work you need to extend [\OpenAPIServer\Auth\AbstractAuthenticator](./lib/Auth/AbstractAuthenticator.php) class by [\OpenAPIServer\Auth\OAuthAuthenticator](./src/Auth/OAuthAuthenticator.php) class.

Scope list:
* `ads:read` - See all of your advertising data, including ads, ad groups, campaigns etc.
* `ads:write` - Create, update, or delete ads, ad groups, campaigns etc.
* `billing:read` - See all of your billing data, billing profile, etc.
* `billing:write` - Create, update, or delete billing data, billing profiles, etc.
* `biz_access:read` - See business access data
* `biz_access:write` - Create, update, or delete business access data
* `boards:read` - See your public boards, including group boards you join
* `boards:read_secret` - See your secret boards
* `boards:write` - Create, update, or delete your public boards
* `boards:write_secret` - Create, update, or delete your secret boards
* `catalogs:read` - See all of your catalogs data
* `catalogs:write` - Create, update, or delete your catalogs data
* `msot:write` - Create measurement source of truth events
* `pins:read` - See your public Pins
* `pins:read_secret` - See your secret Pins
* `pins:write` - Create, update, or delete your public Pins
* `pins:write_secret` - Create, update, or delete your secret Pins
* `user_accounts:read` - See your user accounts and followers
* `user_accounts:write` - Update your user accounts and followers

### Security schema `client_credentials`
> Important! To make OAuth authentication work you need to extend [\OpenAPIServer\Auth\AbstractAuthenticator](./lib/Auth/AbstractAuthenticator.php) class by [\OpenAPIServer\Auth\OAuthAuthenticator](./src/Auth/OAuthAuthenticator.php) class.

Scope list:
* `ads:read` - See all of your advertising data, including ads, ad groups, campaigns etc.
* `ads:write` - Create, update, or delete ads, ad groups, campaigns etc.
* `billing:read` - See all of your billing data, billing profile, etc.
* `billing:write` - Create, update, or delete billing data, billing profiles, etc.
* `biz_access:read` - See business access data
* `biz_access:write` - Create, update, or delete business access data
* `boards:read` - See your public boards, including group boards you join
* `boards:read_secret` - See your secret boards
* `boards:write` - Create, update, or delete your public boards
* `boards:write_secret` - Create, update, or delete your secret boards
* `catalogs:read` - See all of your catalogs data
* `catalogs:write` - Create, update, or delete your catalogs data
* `msot:write` - Create measurement source of truth events
* `pins:read` - See your public Pins
* `pins:read_secret` - See your secret Pins
* `pins:write` - Create, update, or delete your public Pins
* `pins:write_secret` - Create, update, or delete your secret Pins
* `user_accounts:read` - See your user accounts and followers
* `user_accounts:write` - Update your user accounts and followers

### Security schema `conversion_token`
> Important! To make Bearer authentication work you need to extend [\OpenAPIServer\Auth\AbstractAuthenticator](./lib/Auth/AbstractAuthenticator.php) class by [\OpenAPIServer\Auth\BearerAuthenticator](./src/Auth/BearerAuthenticator.php) class.

### Security schema `basic`
> Important! To make Basic authentication work you need to extend [\OpenAPIServer\Auth\AbstractAuthenticator](./lib/Auth/AbstractAuthenticator.php) class by [\OpenAPIServer\Auth\BasicAuthenticator](./src/Auth/BasicAuthenticator.php) class.

### Advanced middleware configuration
Ref to used Slim Token Middleware [dyorg/slim-token-authentication](https://github.com/dyorg/slim-token-authentication/tree/1.x#readme)
