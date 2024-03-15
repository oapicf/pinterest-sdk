# php-base - PHP Slim 4 Server library for Pinterest REST API

* [OpenAPI Generator](https://openapi-generator.tech)
* [Slim 4 Documentation](https://www.slimframework.com/docs/v4/)

This server has been generated with [Slim PSR-7](https://github.com/slimphp/Slim-Psr7) implementation.
[PHP-DI](https://php-di.org/doc/frameworks/slim.html) package used as dependency container.

## Requirements

* Web server with URL rewriting
* PHP 7.4 or newer

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
`$ composer test-models` | Models tests

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

Switch your app environment to development in `public/.htaccess` file:
```ini
## .htaccess
<IfModule mod_env.c>
    SetEnv APP_ENV 'development'
</IfModule>
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
*AbstractAdAccountsApi* | **analyticsCreateMmmReport** | **POST** /ad_accounts/{ad_account_id}/mmm_reports | Create a request for a Marketing Mix Modeling (MMM) report
*AbstractAdAccountsApi* | **analyticsCreateReport** | **POST** /ad_accounts/{ad_account_id}/reports | Create async request for an account analytics report
*AbstractAdAccountsApi* | **analyticsCreateTemplateReport** | **POST** /ad_accounts/{ad_account_id}/templates/{template_id}/reports | Create async request for an analytics report using a template
*AbstractAdAccountsApi* | **analyticsGetMmmReport** | **GET** /ad_accounts/{ad_account_id}/mmm_reports | Get advertiser Marketing Mix Modeling (MMM) report.
*AbstractAdAccountsApi* | **analyticsGetReport** | **GET** /ad_accounts/{ad_account_id}/reports | Get the account analytics report created by the async call
*AbstractAdAccountsApi* | **sandboxDelete** | **DELETE** /ad_accounts/{ad_account_id}/sandbox | Delete ads data for ad account in API Sandbox
*AbstractAdAccountsApi* | **templatesList** | **GET** /ad_accounts/{ad_account_id}/templates | List templates
*AbstractAdGroupsApi* | **adGroupsAnalytics** | **GET** /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics
*AbstractAdGroupsApi* | **adGroupsAudienceSizing** | **GET** /ad_accounts/{ad_account_id}/ad_groups/audience_sizing | Get audience sizing
*AbstractAdGroupsApi* | **adGroupsBidFloorGet** | **POST** /ad_accounts/{ad_account_id}/bid_floor | Get bid floors
*AbstractAdGroupsApi* | **adGroupsCreate** | **POST** /ad_accounts/{ad_account_id}/ad_groups | Create ad groups
*AbstractAdGroupsApi* | **adGroupsGet** | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id} | Get ad group
*AbstractAdGroupsApi* | **adGroupsList** | **GET** /ad_accounts/{ad_account_id}/ad_groups | List ad groups
*AbstractAdGroupsApi* | **adGroupsTargetingAnalyticsGet** | **GET** /ad_accounts/{ad_account_id}/ad_groups/targeting_analytics | Get targeting analytics for ad groups
*AbstractAdGroupsApi* | **adGroupsUpdate** | **PATCH** /ad_accounts/{ad_account_id}/ad_groups | Update ad groups
*AbstractAdsApi* | **adPreviewsCreate** | **POST** /ad_accounts/{ad_account_id}/ad_previews | Create ad preview with pin or image
*AbstractAdsApi* | **adTargetingAnalyticsGet** | **GET** /ad_accounts/{ad_account_id}/ads/targeting_analytics | Get targeting analytics for ads
*AbstractAdsApi* | **adsAnalytics** | **GET** /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics
*AbstractAdsApi* | **adsCreate** | **POST** /ad_accounts/{ad_account_id}/ads | Create ads
*AbstractAdsApi* | **adsGet** | **GET** /ad_accounts/{ad_account_id}/ads/{ad_id} | Get ad
*AbstractAdsApi* | **adsList** | **GET** /ad_accounts/{ad_account_id}/ads | List ads
*AbstractAdsApi* | **adsUpdate** | **PATCH** /ad_accounts/{ad_account_id}/ads | Update ads
*AbstractAudienceInsightsApi* | **audienceInsightsGet** | **GET** /ad_accounts/{ad_account_id}/audience_insights | Get audience insights
*AbstractAudienceInsightsApi* | **audienceInsightsScopeAndTypeGet** | **GET** /ad_accounts/{ad_account_id}/insights/audiences | Get audience insights scope and type
*AbstractAudiencesApi* | **audiencesCreate** | **POST** /ad_accounts/{ad_account_id}/audiences | Create audience
*AbstractAudiencesApi* | **audiencesCreateCustom** | **POST** /ad_accounts/{ad_account_id}/audiences/custom | Create custom audience
*AbstractAudiencesApi* | **audiencesGet** | **GET** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Get audience
*AbstractAudiencesApi* | **audiencesList** | **GET** /ad_accounts/{ad_account_id}/audiences | List audiences
*AbstractAudiencesApi* | **audiencesUpdate** | **PATCH** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Update audience
*AbstractBillingApi* | **adsCreditRedeem** | **POST** /ad_accounts/{ad_account_id}/ads_credit/redeem | Redeem ad credits
*AbstractBillingApi* | **adsCreditsDiscountsGet** | **GET** /ad_accounts/{ad_account_id}/ads_credit/discounts | Get ads credit discounts
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
*AbstractCampaignsApi* | **campaignTargetingAnalyticsGet** | **GET** /ad_accounts/{ad_account_id}/campaigns/targeting_analytics | Get targeting analytics for campaigns
*AbstractCampaignsApi* | **campaignsAnalytics** | **GET** /ad_accounts/{ad_account_id}/campaigns/analytics | Get campaign analytics
*AbstractCampaignsApi* | **campaignsCreate** | **POST** /ad_accounts/{ad_account_id}/campaigns | Create campaigns
*AbstractCampaignsApi* | **campaignsGet** | **GET** /ad_accounts/{ad_account_id}/campaigns/{campaign_id} | Get campaign
*AbstractCampaignsApi* | **campaignsList** | **GET** /ad_accounts/{ad_account_id}/campaigns | List campaigns
*AbstractCampaignsApi* | **campaignsUpdate** | **PATCH** /ad_accounts/{ad_account_id}/campaigns | Update campaigns
*AbstractCatalogsApi* | **catalogsList** | **GET** /catalogs | List catalogs
*AbstractCatalogsApi* | **catalogsProductGroupsCreate** | **POST** /catalogs/product_groups | Create product group
*AbstractCatalogsApi* | **catalogsProductGroupsList** | **GET** /catalogs/product_groups | List product groups
*AbstractCatalogsApi* | **feedsCreate** | **POST** /catalogs/feeds | Create feed
*AbstractCatalogsApi* | **feedsList** | **GET** /catalogs/feeds | List feeds
*AbstractCatalogsApi* | **itemsBatchPost** | **POST** /catalogs/items/batch | Operate on item batch
*AbstractCatalogsApi* | **itemsGet** | **GET** /catalogs/items | Get catalogs items
*AbstractCatalogsApi* | **productsByProductGroupFilterList** | **POST** /catalogs/products/get_by_product_group_filters | List filtered products
*AbstractCatalogsApi* | **catalogsProductGroupPinsList** | **GET** /catalogs/product_groups/{product_group_id}/products | List products for a Product Group
*AbstractCatalogsApi* | **catalogsProductGroupsDelete** | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group
*AbstractCatalogsApi* | **catalogsProductGroupsGet** | **GET** /catalogs/product_groups/{product_group_id} | Get product group
*AbstractCatalogsApi* | **catalogsProductGroupsProductCountsGet** | **GET** /catalogs/product_groups/{product_group_id}/product_counts | Get product counts for a Product Group
*AbstractCatalogsApi* | **catalogsProductGroupsUpdate** | **PATCH** /catalogs/product_groups/{product_group_id} | Update product group
*AbstractCatalogsApi* | **feedProcessingResultsList** | **GET** /catalogs/feeds/{feed_id}/processing_results | List processing results for a given feed
*AbstractCatalogsApi* | **feedsDelete** | **DELETE** /catalogs/feeds/{feed_id} | Delete feed
*AbstractCatalogsApi* | **feedsGet** | **GET** /catalogs/feeds/{feed_id} | Get feed
*AbstractCatalogsApi* | **feedsUpdate** | **PATCH** /catalogs/feeds/{feed_id} | Update feed
*AbstractCatalogsApi* | **itemsBatchGet** | **GET** /catalogs/items/batch/{batch_id} | Get catalogs item batch status
*AbstractCatalogsApi* | **itemsIssuesList** | **GET** /catalogs/processing_results/{processing_result_id}/item_issues | List item issues for a given processing result
*AbstractConversionEventsApi* | **eventsCreate** | **POST** /ad_accounts/{ad_account_id}/events | Send conversions
*AbstractConversionTagsApi* | **conversionTagsCreate** | **POST** /ad_accounts/{ad_account_id}/conversion_tags | Create conversion tag
*AbstractConversionTagsApi* | **conversionTagsGet** | **GET** /ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id} | Get conversion tag
*AbstractConversionTagsApi* | **conversionTagsList** | **GET** /ad_accounts/{ad_account_id}/conversion_tags | Get conversion tags
*AbstractConversionTagsApi* | **ocpmEligibleConversionTagsGet** | **GET** /ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible | Get Ocpm eligible conversion tags
*AbstractConversionTagsApi* | **pageVisitConversionTagsGet** | **GET** /ad_accounts/{ad_account_id}/conversion_tags/page_visit | Get page visit conversion tags
*AbstractCustomerListsApi* | **customerListsCreate** | **POST** /ad_accounts/{ad_account_id}/customer_lists | Create customer lists
*AbstractCustomerListsApi* | **customerListsGet** | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Get customer list
*AbstractCustomerListsApi* | **customerListsList** | **GET** /ad_accounts/{ad_account_id}/customer_lists | Get customer lists
*AbstractCustomerListsApi* | **customerListsUpdate** | **PATCH** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Update customer list
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
*AbstractLeadAdsApi* | **adAccountsSubscriptionsDelById** | **DELETE** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Delete lead ads subscription
*AbstractLeadAdsApi* | **adAccountsSubscriptionsGetById** | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Get lead ads subscription
*AbstractLeadAdsApi* | **adAccountsSubscriptionsGetList** | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions | Get lead ads subscriptions
*AbstractLeadAdsApi* | **adAccountsSubscriptionsPost** | **POST** /ad_accounts/{ad_account_id}/leads/subscriptions | Create lead ads subscription
*AbstractLeadFormsApi* | **leadFormGet** | **GET** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id} | Get lead form by id
*AbstractLeadFormsApi* | **leadFormTestCreate** | **POST** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test | Create lead form test data
*AbstractLeadFormsApi* | **leadFormsList** | **GET** /ad_accounts/{ad_account_id}/lead_forms | Get lead forms
*AbstractMediaApi* | **mediaCreate** | **POST** /media | Register media upload
*AbstractMediaApi* | **mediaList** | **GET** /media | List media uploads
*AbstractMediaApi* | **mediaGet** | **GET** /media/{media_id} | Get media upload details
*AbstractOauthApi* | **oauthToken** | **POST** /oauth/token | Generate OAuth access token
*AbstractOrderLinesApi* | **orderLinesGet** | **GET** /ad_accounts/{ad_account_id}/order_lines/{order_line_id} | Get order line
*AbstractOrderLinesApi* | **orderLinesList** | **GET** /ad_accounts/{ad_account_id}/order_lines | Get order lines
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
*AbstractProductGroupsApi* | **adAccountsCatalogsProductGroupsList** | **GET** /ad_accounts/{ad_account_id}/product_groups/catalogs | Get catalog product groups
*AbstractResourcesApi* | **adAccountCountriesGet** | **GET** /resources/ad_account_countries | Get ad accounts countries
*AbstractResourcesApi* | **deliveryMetricsGet** | **GET** /resources/delivery_metrics | Get available metrics' definitions
*AbstractResourcesApi* | **leadFormQuestionsGet** | **GET** /resources/lead_form_questions | Get lead form questions
*AbstractResourcesApi* | **metricsReadyStateGet** | **GET** /resources/metrics_ready_state | Get metrics ready state
*AbstractResourcesApi* | **interestTargetingOptionsGet** | **GET** /resources/targeting/interests/{interest_id} | Get interest details
*AbstractResourcesApi* | **targetingOptionsGet** | **GET** /resources/targeting/{targeting_type} | Get targeting options
*AbstractSearchApi* | **searchPartnerPins** | **GET** /search/partner/pins | Search pins by a given search term
*AbstractSearchApi* | **searchUserBoardsGet** | **GET** /search/boards | Search user's boards
*AbstractSearchApi* | **searchUserPinsList** | **GET** /search/pins | Search user's Pins
*AbstractTermsApi* | **termsRelatedList** | **GET** /terms/related | List related terms
*AbstractTermsApi* | **termsSuggestedList** | **GET** /terms/suggested | List suggested terms
*AbstractTermsOfServiceApi* | **termsOfServiceGet** | **GET** /ad_accounts/{ad_account_id}/terms_of_service | Get terms of service
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
* OpenAPIServer\Model\ActionType
* OpenAPIServer\Model\AdAccount
* OpenAPIServer\Model\AdAccountAnalyticsResponseInner
* OpenAPIServer\Model\AdAccountCreateRequest
* OpenAPIServer\Model\AdAccountCreateSubscriptionRequest
* OpenAPIServer\Model\AdAccountCreateSubscriptionResponse
* OpenAPIServer\Model\AdAccountGetSubscriptionResponse
* OpenAPIServer\Model\AdAccountOwner
* OpenAPIServer\Model\AdAccountsCatalogsProductGroupsList200Response
* OpenAPIServer\Model\AdAccountsCountryResponse
* OpenAPIServer\Model\AdAccountsCountryResponseData
* OpenAPIServer\Model\AdAccountsList200Response
* OpenAPIServer\Model\AdAccountsSubscriptionsGetList200Response
* OpenAPIServer\Model\AdArrayResponse
* OpenAPIServer\Model\AdArrayResponseElement
* OpenAPIServer\Model\AdCommon
* OpenAPIServer\Model\AdCommonQuizPinData
* OpenAPIServer\Model\AdCommonTrackingUrls
* OpenAPIServer\Model\AdCountry
* OpenAPIServer\Model\AdCreateRequest
* OpenAPIServer\Model\AdGroupArrayResponse
* OpenAPIServer\Model\AdGroupArrayResponseElement
* OpenAPIServer\Model\AdGroupAudienceSizingRequest
* OpenAPIServer\Model\AdGroupAudienceSizingRequestKeywordsInner
* OpenAPIServer\Model\AdGroupAudienceSizingResponse
* OpenAPIServer\Model\AdGroupCommon
* OpenAPIServer\Model\AdGroupCommonOptimizationGoalMetadata
* OpenAPIServer\Model\AdGroupCommonTrackingUrls
* OpenAPIServer\Model\AdGroupCreateRequest
* OpenAPIServer\Model\AdGroupResponse
* OpenAPIServer\Model\AdGroupSummaryStatus
* OpenAPIServer\Model\AdGroupUpdateRequest
* OpenAPIServer\Model\AdGroupsAnalyticsResponseInner
* OpenAPIServer\Model\AdGroupsList200Response
* OpenAPIServer\Model\AdPinId
* OpenAPIServer\Model\AdPreviewCreateFromImage
* OpenAPIServer\Model\AdPreviewCreateFromPin
* OpenAPIServer\Model\AdPreviewRequest
* OpenAPIServer\Model\AdPreviewURLResponse
* OpenAPIServer\Model\AdResponse
* OpenAPIServer\Model\AdUpdateRequest
* OpenAPIServer\Model\AdsAnalyticsCreateAsyncRequest
* OpenAPIServer\Model\AdsAnalyticsCreateAsyncResponse
* OpenAPIServer\Model\AdsAnalyticsFilterColumn
* OpenAPIServer\Model\AdsAnalyticsFilterOperator
* OpenAPIServer\Model\AdsAnalyticsGetAsyncResponse
* OpenAPIServer\Model\AdsAnalyticsMetricsFilter
* OpenAPIServer\Model\AdsAnalyticsResponseInner
* OpenAPIServer\Model\AdsAnalyticsTargetingType
* OpenAPIServer\Model\AdsCreditDiscountsResponse
* OpenAPIServer\Model\AdsCreditRedeemRequest
* OpenAPIServer\Model\AdsCreditRedeemResponse
* OpenAPIServer\Model\AdsCreditsDiscountsGet200Response
* OpenAPIServer\Model\AdsList200Response
* OpenAPIServer\Model\AnalyticsDailyMetrics
* OpenAPIServer\Model\AnalyticsMetricsResponse
* OpenAPIServer\Model\Audience
* OpenAPIServer\Model\AudienceCategory
* OpenAPIServer\Model\AudienceCommon
* OpenAPIServer\Model\AudienceCreateCustomRequest
* OpenAPIServer\Model\AudienceCreateRequest
* OpenAPIServer\Model\AudienceCreateRequest1AudienceType
* OpenAPIServer\Model\AudienceDataParty
* OpenAPIServer\Model\AudienceDefinition
* OpenAPIServer\Model\AudienceDefinitionResponse
* OpenAPIServer\Model\AudienceDemographicValue
* OpenAPIServer\Model\AudienceDemographics
* OpenAPIServer\Model\AudienceInsightCategoryArrayResponse
* OpenAPIServer\Model\AudienceInsightCategoryCommon
* OpenAPIServer\Model\AudienceInsightType
* OpenAPIServer\Model\AudienceInsightsResponse
* OpenAPIServer\Model\AudienceRule
* OpenAPIServer\Model\AudienceSharingType
* OpenAPIServer\Model\AudienceSubcategory
* OpenAPIServer\Model\AudienceType
* OpenAPIServer\Model\AudienceUpdateOperationType
* OpenAPIServer\Model\AudienceUpdateRequest
* OpenAPIServer\Model\AudiencesList200Response
* OpenAPIServer\Model\AvailabilityFilter
* OpenAPIServer\Model\BatchOperation
* OpenAPIServer\Model\BatchOperationStatus
* OpenAPIServer\Model\BidFloor
* OpenAPIServer\Model\BidFloorRequest
* OpenAPIServer\Model\BidFloorSpec
* OpenAPIServer\Model\BillingProfilesGet200Response
* OpenAPIServer\Model\BillingProfilesResponse
* OpenAPIServer\Model\Board
* OpenAPIServer\Model\BoardMedia
* OpenAPIServer\Model\BoardOwner
* OpenAPIServer\Model\BoardSection
* OpenAPIServer\Model\BoardSectionsList200Response
* OpenAPIServer\Model\BoardUpdate
* OpenAPIServer\Model\BoardsList200Response
* OpenAPIServer\Model\BoardsListPins200Response
* OpenAPIServer\Model\BoardsUserFollowsList200Response
* OpenAPIServer\Model\BookClosedResponse
* OpenAPIServer\Model\BrandFilter
* OpenAPIServer\Model\BudgetType
* OpenAPIServer\Model\BulkDownloadRequest
* OpenAPIServer\Model\BulkDownloadRequestCampaignFilter
* OpenAPIServer\Model\BulkDownloadResponse
* OpenAPIServer\Model\BulkEntityType
* OpenAPIServer\Model\BulkOutputFormat
* OpenAPIServer\Model\BulkReportingJobStatus
* OpenAPIServer\Model\BulkUpsertRequest
* OpenAPIServer\Model\BulkUpsertRequestCreate
* OpenAPIServer\Model\BulkUpsertRequestUpdate
* OpenAPIServer\Model\BulkUpsertResponse
* OpenAPIServer\Model\BulkUpsertStatus
* OpenAPIServer\Model\BulkUpsertStatusResponse
* OpenAPIServer\Model\BusinessAccessRole
* OpenAPIServer\Model\CampaignCommon
* OpenAPIServer\Model\CampaignCreateCommon
* OpenAPIServer\Model\CampaignCreateRequest
* OpenAPIServer\Model\CampaignCreateResponse
* OpenAPIServer\Model\CampaignCreateResponseData
* OpenAPIServer\Model\CampaignCreateResponseItem
* OpenAPIServer\Model\CampaignId
* OpenAPIServer\Model\CampaignResponse
* OpenAPIServer\Model\CampaignSummaryStatus
* OpenAPIServer\Model\CampaignUpdateRequest
* OpenAPIServer\Model\CampaignUpdateResponse
* OpenAPIServer\Model\CampaignsAnalyticsResponseInner
* OpenAPIServer\Model\CampaignsList200Response
* OpenAPIServer\Model\Catalog
* OpenAPIServer\Model\CatalogProductGroup
* OpenAPIServer\Model\CatalogsCreateHotelItem
* OpenAPIServer\Model\CatalogsCreateRetailItem
* OpenAPIServer\Model\CatalogsDbItem
* OpenAPIServer\Model\CatalogsDeleteHotelItem
* OpenAPIServer\Model\CatalogsDeleteRetailItem
* OpenAPIServer\Model\CatalogsFeed
* OpenAPIServer\Model\CatalogsFeedCredentials
* OpenAPIServer\Model\CatalogsFeedIngestionDetails
* OpenAPIServer\Model\CatalogsFeedIngestionErrors
* OpenAPIServer\Model\CatalogsFeedIngestionInfo
* OpenAPIServer\Model\CatalogsFeedIngestionWarnings
* OpenAPIServer\Model\CatalogsFeedProcessingResult
* OpenAPIServer\Model\CatalogsFeedProcessingSchedule
* OpenAPIServer\Model\CatalogsFeedProcessingStatus
* OpenAPIServer\Model\CatalogsFeedProductCounts
* OpenAPIServer\Model\CatalogsFeedValidationDetails
* OpenAPIServer\Model\CatalogsFeedValidationErrors
* OpenAPIServer\Model\CatalogsFeedValidationWarnings
* OpenAPIServer\Model\CatalogsFeedsCreateRequest
* OpenAPIServer\Model\CatalogsFeedsCreateRequestDefaultLocale
* OpenAPIServer\Model\CatalogsFeedsUpdateRequest
* OpenAPIServer\Model\CatalogsFormat
* OpenAPIServer\Model\CatalogsHotelAddress
* OpenAPIServer\Model\CatalogsHotelAttributes
* OpenAPIServer\Model\CatalogsHotelAttributesAllOfMainImage
* OpenAPIServer\Model\CatalogsHotelBatchItem
* OpenAPIServer\Model\CatalogsHotelBatchRequest
* OpenAPIServer\Model\CatalogsHotelFeed
* OpenAPIServer\Model\CatalogsHotelFeedsCreateRequest
* OpenAPIServer\Model\CatalogsHotelFeedsUpdateRequest
* OpenAPIServer\Model\CatalogsHotelGuestRatings
* OpenAPIServer\Model\CatalogsHotelItemErrorResponse
* OpenAPIServer\Model\CatalogsHotelItemResponse
* OpenAPIServer\Model\CatalogsHotelItemsBatch
* OpenAPIServer\Model\CatalogsHotelItemsFilter
* OpenAPIServer\Model\CatalogsHotelProductGroup
* OpenAPIServer\Model\CatalogsHotelProductGroupCreateRequest
* OpenAPIServer\Model\CatalogsHotelProductGroupFilterKeys
* OpenAPIServer\Model\CatalogsHotelProductGroupFilters
* OpenAPIServer\Model\CatalogsHotelProductGroupFiltersAllOf
* OpenAPIServer\Model\CatalogsHotelProductGroupFiltersAnyOf
* OpenAPIServer\Model\CatalogsHotelProductGroupUpdateRequest
* OpenAPIServer\Model\CatalogsItemValidationDetails
* OpenAPIServer\Model\CatalogsItemValidationErrors
* OpenAPIServer\Model\CatalogsItemValidationIssue
* OpenAPIServer\Model\CatalogsItemValidationIssues
* OpenAPIServer\Model\CatalogsItemValidationWarnings
* OpenAPIServer\Model\CatalogsItems
* OpenAPIServer\Model\CatalogsItemsBatch
* OpenAPIServer\Model\CatalogsItemsBatchRequest
* OpenAPIServer\Model\CatalogsItemsCreateBatchRequest
* OpenAPIServer\Model\CatalogsItemsDeleteBatchRequest
* OpenAPIServer\Model\CatalogsItemsDeleteDiscontinuedBatchRequest
* OpenAPIServer\Model\CatalogsItemsFilters
* OpenAPIServer\Model\CatalogsItemsUpdateBatchRequest
* OpenAPIServer\Model\CatalogsItemsUpsertBatchRequest
* OpenAPIServer\Model\CatalogsList200Response
* OpenAPIServer\Model\CatalogsListProductsByFilterRequest
* OpenAPIServer\Model\CatalogsListProductsByFilterRequestOneOf
* OpenAPIServer\Model\CatalogsLocale
* OpenAPIServer\Model\CatalogsProduct
* OpenAPIServer\Model\CatalogsProductGroup
* OpenAPIServer\Model\CatalogsProductGroupCreateRequest
* OpenAPIServer\Model\CatalogsProductGroupCurrencyCriteria
* OpenAPIServer\Model\CatalogsProductGroupFilterKeys
* OpenAPIServer\Model\CatalogsProductGroupFilters
* OpenAPIServer\Model\CatalogsProductGroupFiltersAllOf
* OpenAPIServer\Model\CatalogsProductGroupFiltersAnyOf
* OpenAPIServer\Model\CatalogsProductGroupFiltersRequest
* OpenAPIServer\Model\CatalogsProductGroupFiltersRequestAnyOf
* OpenAPIServer\Model\CatalogsProductGroupFiltersRequestAnyOf1
* OpenAPIServer\Model\CatalogsProductGroupMultipleCountriesCriteria
* OpenAPIServer\Model\CatalogsProductGroupMultipleGenderCriteria
* OpenAPIServer\Model\CatalogsProductGroupMultipleStringCriteria
* OpenAPIServer\Model\CatalogsProductGroupMultipleStringListCriteria
* OpenAPIServer\Model\CatalogsProductGroupPinsList200Response
* OpenAPIServer\Model\CatalogsProductGroupPricingCriteria
* OpenAPIServer\Model\CatalogsProductGroupPricingCurrencyCriteria
* OpenAPIServer\Model\CatalogsProductGroupProductCounts
* OpenAPIServer\Model\CatalogsProductGroupStatus
* OpenAPIServer\Model\CatalogsProductGroupType
* OpenAPIServer\Model\CatalogsProductGroupUpdateRequest
* OpenAPIServer\Model\CatalogsProductGroupsCreate201Response
* OpenAPIServer\Model\CatalogsProductGroupsCreateRequest
* OpenAPIServer\Model\CatalogsProductGroupsList200Response
* OpenAPIServer\Model\CatalogsProductGroupsList200ResponseAllOfItemsInner
* OpenAPIServer\Model\CatalogsProductGroupsUpdateRequest
* OpenAPIServer\Model\CatalogsProductMetadata
* OpenAPIServer\Model\CatalogsRetailBatchRequest
* OpenAPIServer\Model\CatalogsRetailBatchRequestItemsInner
* OpenAPIServer\Model\CatalogsRetailFeed
* OpenAPIServer\Model\CatalogsRetailFeedsCreateRequest
* OpenAPIServer\Model\CatalogsRetailFeedsUpdateRequest
* OpenAPIServer\Model\CatalogsRetailItemErrorResponse
* OpenAPIServer\Model\CatalogsRetailItemResponse
* OpenAPIServer\Model\CatalogsRetailItemsBatch
* OpenAPIServer\Model\CatalogsRetailItemsFilter
* OpenAPIServer\Model\CatalogsRetailProductGroup
* OpenAPIServer\Model\CatalogsStatus
* OpenAPIServer\Model\CatalogsType
* OpenAPIServer\Model\CatalogsUpdatableHotelAttributes
* OpenAPIServer\Model\CatalogsUpdateHotelItem
* OpenAPIServer\Model\CatalogsUpdateRetailItem
* OpenAPIServer\Model\CatalogsUpsertHotelItem
* OpenAPIServer\Model\CatalogsUpsertRetailItem
* OpenAPIServer\Model\CatalogsVerticalBatchRequest
* OpenAPIServer\Model\CatalogsVerticalFeedsCreateRequest
* OpenAPIServer\Model\CatalogsVerticalFeedsUpdateRequest
* OpenAPIServer\Model\CatalogsVerticalProductGroup
* OpenAPIServer\Model\CatalogsVerticalProductGroupCreateRequest
* OpenAPIServer\Model\CatalogsVerticalProductGroupUpdateRequest
* OpenAPIServer\Model\ConditionFilter
* OpenAPIServer\Model\ConversionApiResponse
* OpenAPIServer\Model\ConversionApiResponseEventsInner
* OpenAPIServer\Model\ConversionAttributionWindowDays
* OpenAPIServer\Model\ConversionEventResponse
* OpenAPIServer\Model\ConversionEvents
* OpenAPIServer\Model\ConversionEventsDataInner
* OpenAPIServer\Model\ConversionEventsDataInnerCustomData
* OpenAPIServer\Model\ConversionEventsDataInnerCustomDataContentsInner
* OpenAPIServer\Model\ConversionEventsUserData
* OpenAPIServer\Model\ConversionReportAttributionType
* OpenAPIServer\Model\ConversionReportTimeType
* OpenAPIServer\Model\ConversionTagCommon
* OpenAPIServer\Model\ConversionTagConfigs
* OpenAPIServer\Model\ConversionTagCreate
* OpenAPIServer\Model\ConversionTagListResponse
* OpenAPIServer\Model\ConversionTagResponse
* OpenAPIServer\Model\ConversionTagType
* OpenAPIServer\Model\Country
* OpenAPIServer\Model\CountryFilter
* OpenAPIServer\Model\CreateMMMReportRequest
* OpenAPIServer\Model\CreateMMMReportResponse
* OpenAPIServer\Model\CreateMMMReportResponseData
* OpenAPIServer\Model\CreativeType
* OpenAPIServer\Model\Currency
* OpenAPIServer\Model\CurrencyFilter
* OpenAPIServer\Model\CustomLabel0Filter
* OpenAPIServer\Model\CustomLabel1Filter
* OpenAPIServer\Model\CustomLabel2Filter
* OpenAPIServer\Model\CustomLabel3Filter
* OpenAPIServer\Model\CustomLabel4Filter
* OpenAPIServer\Model\CustomerList
* OpenAPIServer\Model\CustomerListRequest
* OpenAPIServer\Model\CustomerListUpdateRequest
* OpenAPIServer\Model\CustomerListsList200Response
* OpenAPIServer\Model\DataOutputFormat
* OpenAPIServer\Model\DataStatus
* OpenAPIServer\Model\DeliveryMetricsResponse
* OpenAPIServer\Model\DeliveryMetricsResponseItemsInner
* OpenAPIServer\Model\DetailedError
* OpenAPIServer\Model\EnhancedMatchStatusType
* OpenAPIServer\Model\EntityStatus
* OpenAPIServer\Model\Error
* OpenAPIServer\Model\Exception
* OpenAPIServer\Model\FeedProcessingResultsList200Response
* OpenAPIServer\Model\FeedsCreateRequest
* OpenAPIServer\Model\FeedsList200Response
* OpenAPIServer\Model\FeedsUpdateRequest
* OpenAPIServer\Model\FollowUserRequest
* OpenAPIServer\Model\FollowersList200Response
* OpenAPIServer\Model\Gender
* OpenAPIServer\Model\GenderFilter
* OpenAPIServer\Model\GetAudiencesOrderBy
* OpenAPIServer\Model\GetMMMReportResponse
* OpenAPIServer\Model\GetMMMReportResponseData
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
* OpenAPIServer\Model\ImageDetails
* OpenAPIServer\Model\ImageMetadata
* OpenAPIServer\Model\ImageMetadataImages
* OpenAPIServer\Model\IntegrationLog
* OpenAPIServer\Model\IntegrationLogClientError
* OpenAPIServer\Model\IntegrationLogClientRequest
* OpenAPIServer\Model\IntegrationLogsInvalidLogResponse
* OpenAPIServer\Model\IntegrationLogsInvalidLogResponseRejectedLogsInner
* OpenAPIServer\Model\IntegrationLogsRequest
* OpenAPIServer\Model\IntegrationLogsSuccessResponse
* OpenAPIServer\Model\IntegrationMetadata
* OpenAPIServer\Model\IntegrationRecord
* OpenAPIServer\Model\IntegrationRequest
* OpenAPIServer\Model\IntegrationRequestPatch
* OpenAPIServer\Model\IntegrationsGetList200Response
* OpenAPIServer\Model\Interest
* OpenAPIServer\Model\ItemAttributes
* OpenAPIServer\Model\ItemBatchRecord
* OpenAPIServer\Model\ItemCreateBatchRecord
* OpenAPIServer\Model\ItemDeleteBatchRecord
* OpenAPIServer\Model\ItemDeleteDiscontinuedBatchRecord
* OpenAPIServer\Model\ItemGroupIdFilter
* OpenAPIServer\Model\ItemIdFilter
* OpenAPIServer\Model\ItemProcessingRecord
* OpenAPIServer\Model\ItemProcessingStatus
* OpenAPIServer\Model\ItemResponse
* OpenAPIServer\Model\ItemResponseAnyOf
* OpenAPIServer\Model\ItemResponseAnyOf1
* OpenAPIServer\Model\ItemUpdateBatchRecord
* OpenAPIServer\Model\ItemUpsertBatchRecord
* OpenAPIServer\Model\ItemValidationEvent
* OpenAPIServer\Model\ItemsBatchPostRequest
* OpenAPIServer\Model\ItemsIssuesList200Response
* OpenAPIServer\Model\Keyword
* OpenAPIServer\Model\KeywordError
* OpenAPIServer\Model\KeywordMetrics
* OpenAPIServer\Model\KeywordMetricsResponse
* OpenAPIServer\Model\KeywordUpdate
* OpenAPIServer\Model\KeywordUpdateBody
* OpenAPIServer\Model\KeywordsCommon
* OpenAPIServer\Model\KeywordsGet200Response
* OpenAPIServer\Model\KeywordsMetricsArrayResponse
* OpenAPIServer\Model\KeywordsRequest
* OpenAPIServer\Model\KeywordsResponse
* OpenAPIServer\Model\Language
* OpenAPIServer\Model\LeadFormCommon
* OpenAPIServer\Model\LeadFormQuestion
* OpenAPIServer\Model\LeadFormQuestionFieldType
* OpenAPIServer\Model\LeadFormQuestionType
* OpenAPIServer\Model\LeadFormResponse
* OpenAPIServer\Model\LeadFormStatus
* OpenAPIServer\Model\LeadFormTestRequest
* OpenAPIServer\Model\LeadFormTestResponse
* OpenAPIServer\Model\LeadFormsList200Response
* OpenAPIServer\Model\LineItem
* OpenAPIServer\Model\LinkedBusiness
* OpenAPIServer\Model\MMMReportingColumn
* OpenAPIServer\Model\MMMReportingTargetingType
* OpenAPIServer\Model\MatchType
* OpenAPIServer\Model\MatchTypeResponse
* OpenAPIServer\Model\MaxPriceFilter
* OpenAPIServer\Model\MediaList200Response
* OpenAPIServer\Model\MediaUpload
* OpenAPIServer\Model\MediaUploadAllOfUploadParameters
* OpenAPIServer\Model\MediaUploadDetails
* OpenAPIServer\Model\MediaUploadRequest
* OpenAPIServer\Model\MediaUploadStatus
* OpenAPIServer\Model\MediaUploadType
* OpenAPIServer\Model\MetricsReportingLevel
* OpenAPIServer\Model\MetricsResponse
* OpenAPIServer\Model\MinPriceFilter
* OpenAPIServer\Model\NonNullableCatalogsCurrency
* OpenAPIServer\Model\NonNullableProductAvailabilityType
* OpenAPIServer\Model\NullableCatalogsItemFieldType
* OpenAPIServer\Model\NullableCurrency
* OpenAPIServer\Model\OauthAccessTokenRequestCode
* OpenAPIServer\Model\OauthAccessTokenRequestRefresh
* OpenAPIServer\Model\OauthAccessTokenResponse
* OpenAPIServer\Model\OauthAccessTokenResponseCode
* OpenAPIServer\Model\OauthAccessTokenResponseEverlastingRefresh
* OpenAPIServer\Model\OauthAccessTokenResponseIntegrationRefresh
* OpenAPIServer\Model\OauthAccessTokenResponseRefresh
* OpenAPIServer\Model\ObjectiveType
* OpenAPIServer\Model\OptimizationGoalMetadata
* OpenAPIServer\Model\OptimizationGoalMetadataConversionTagV3GoalMetadata
* OpenAPIServer\Model\OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows
* OpenAPIServer\Model\OptimizationGoalMetadataFrequencyGoalMetadata
* OpenAPIServer\Model\OptimizationGoalMetadataScrollupGoalMetadata
* OpenAPIServer\Model\OrderLine
* OpenAPIServer\Model\OrderLineError
* OpenAPIServer\Model\OrderLinePaidType
* OpenAPIServer\Model\OrderLineResponse
* OpenAPIServer\Model\OrderLineSingleResponse
* OpenAPIServer\Model\OrderLineStatus
* OpenAPIServer\Model\OrderLines
* OpenAPIServer\Model\OrderLinesArrayResponse
* OpenAPIServer\Model\OrderLinesList200Response
* OpenAPIServer\Model\PacingDeliveryType
* OpenAPIServer\Model\PageVisitConversionTagsGet200Response
* OpenAPIServer\Model\Paginated
* OpenAPIServer\Model\PartnerType
* OpenAPIServer\Model\Pin
* OpenAPIServer\Model\PinAnalyticsMetricsResponse
* OpenAPIServer\Model\PinAnalyticsMetricsResponseDailyMetricsInner
* OpenAPIServer\Model\PinCreate
* OpenAPIServer\Model\PinMedia
* OpenAPIServer\Model\PinMediaMetadata
* OpenAPIServer\Model\PinMediaSource
* OpenAPIServer\Model\PinMediaSourceImageBase64
* OpenAPIServer\Model\PinMediaSourceImageURL
* OpenAPIServer\Model\PinMediaSourceImagesBase64
* OpenAPIServer\Model\PinMediaSourceImagesBase64ItemsInner
* OpenAPIServer\Model\PinMediaSourceImagesURL
* OpenAPIServer\Model\PinMediaSourceImagesURLItemsInner
* OpenAPIServer\Model\PinMediaSourcePinURL
* OpenAPIServer\Model\PinMediaSourceVideoID
* OpenAPIServer\Model\PinMediaWithImage
* OpenAPIServer\Model\PinMediaWithImageAndVideo
* OpenAPIServer\Model\PinMediaWithImages
* OpenAPIServer\Model\PinMediaWithVideo
* OpenAPIServer\Model\PinMediaWithVideos
* OpenAPIServer\Model\PinPromotionSummaryStatus
* OpenAPIServer\Model\PinUpdate
* OpenAPIServer\Model\PinUpdateCarouselSlotsInner
* OpenAPIServer\Model\PinsAnalyticsMetricTypesParameterInner
* OpenAPIServer\Model\PinsList200Response
* OpenAPIServer\Model\PinsSaveRequest
* OpenAPIServer\Model\PinterestTagEventData
* OpenAPIServer\Model\PlacementGroupType
* OpenAPIServer\Model\PriceFilter
* OpenAPIServer\Model\ProductAvailabilityType
* OpenAPIServer\Model\ProductGroupAnalyticsResponseInner
* OpenAPIServer\Model\ProductGroupPromotion
* OpenAPIServer\Model\ProductGroupPromotionCreateRequest
* OpenAPIServer\Model\ProductGroupPromotionResponse
* OpenAPIServer\Model\ProductGroupPromotionResponseItem
* OpenAPIServer\Model\ProductGroupPromotionUpdateRequest
* OpenAPIServer\Model\ProductGroupPromotionsList200Response
* OpenAPIServer\Model\ProductGroupSummaryStatus
* OpenAPIServer\Model\ProductType0Filter
* OpenAPIServer\Model\ProductType1Filter
* OpenAPIServer\Model\ProductType2Filter
* OpenAPIServer\Model\ProductType3Filter
* OpenAPIServer\Model\ProductType4Filter
* OpenAPIServer\Model\QuizPinData
* OpenAPIServer\Model\QuizPinOption
* OpenAPIServer\Model\QuizPinQuestion
* OpenAPIServer\Model\QuizPinResult
* OpenAPIServer\Model\RelatedTerms
* OpenAPIServer\Model\RelatedTermsRelatedTermsListInner
* OpenAPIServer\Model\ReportingColumnAsync
* OpenAPIServer\Model\Role
* OpenAPIServer\Model\SSIOAccountAddress
* OpenAPIServer\Model\SSIOAccountItem
* OpenAPIServer\Model\SSIOAccountPMPName
* OpenAPIServer\Model\SSIOAccountResponse
* OpenAPIServer\Model\SSIOCreateInsertionOrderRequest
* OpenAPIServer\Model\SSIOCreateInsertionOrderResponse
* OpenAPIServer\Model\SSIOEditInsertionOrderRequest
* OpenAPIServer\Model\SSIOEditInsertionOrderResponse
* OpenAPIServer\Model\SSIOInsertionOrderCommon
* OpenAPIServer\Model\SSIOInsertionOrderStatus
* OpenAPIServer\Model\SSIOInsertionOrderStatusResponse
* OpenAPIServer\Model\SSIOOrderLine
* OpenAPIServer\Model\SearchPartnerPins200Response
* OpenAPIServer\Model\SearchUserBoardsGet200Response
* OpenAPIServer\Model\SingleInterestTargetingOptionResponse
* OpenAPIServer\Model\SsioInsertionOrdersStatusGetByAdAccount200Response
* OpenAPIServer\Model\SsioOrderLinesGetByAdAccount200Response
* OpenAPIServer\Model\SummaryPin
* OpenAPIServer\Model\SummaryPinMedia
* OpenAPIServer\Model\TargetingAdvertiserCountry
* OpenAPIServer\Model\TargetingSpec
* OpenAPIServer\Model\TargetingSpecSHOPPINGRETARGETING
* OpenAPIServer\Model\TargetingTypeFilter
* OpenAPIServer\Model\TemplateResponse
* OpenAPIServer\Model\TemplateResponseDateRange
* OpenAPIServer\Model\TemplateResponseDateRangeAbsoluteDateRange
* OpenAPIServer\Model\TemplateResponseDateRangeDynamicDateRange
* OpenAPIServer\Model\TemplateResponseDateRangeRelativeDateRange
* OpenAPIServer\Model\TemplatesList200Response
* OpenAPIServer\Model\TermsOfService
* OpenAPIServer\Model\TopPinsAnalyticsResponse
* OpenAPIServer\Model\TopPinsAnalyticsResponseDateAvailability
* OpenAPIServer\Model\TopPinsAnalyticsResponsePinsInner
* OpenAPIServer\Model\TopVideoPinsAnalyticsResponse
* OpenAPIServer\Model\TopVideoPinsAnalyticsResponsePinsInner
* OpenAPIServer\Model\TrackingUrls
* OpenAPIServer\Model\TrendType
* OpenAPIServer\Model\TrendingKeywordsResponse
* OpenAPIServer\Model\TrendingKeywordsResponseTrendsInner
* OpenAPIServer\Model\TrendingKeywordsResponseTrendsInnerTimeSeries
* OpenAPIServer\Model\TrendsSupportedRegion
* OpenAPIServer\Model\UpdatableItemAttributes
* OpenAPIServer\Model\UpdateMaskFieldType
* OpenAPIServer\Model\UserAccountFollowedInterests200Response
* OpenAPIServer\Model\UserFollowingFeedType
* OpenAPIServer\Model\UserFollowingGet200Response
* OpenAPIServer\Model\UserListOperationType
* OpenAPIServer\Model\UserListType
* OpenAPIServer\Model\UserSummary
* OpenAPIServer\Model\UserWebsiteSummary
* OpenAPIServer\Model\UserWebsiteVerificationCode
* OpenAPIServer\Model\UserWebsiteVerifyRequest
* OpenAPIServer\Model\UserWebsitesGet200Response
* OpenAPIServer\Model\VideoMetadata


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
* `pins:read` - See your public Pins
* `pins:read_secret` - See your secret Pins
* `pins:write` - Create, update, or delete your public Pins
* `pins:write_secret` - Create, update, or delete your secret Pins
* `user_accounts:read` - See your user accounts and followers
* `user_accounts:write` - Update your user accounts and followers

### Security schema `basic`
> Important! To make Basic authentication work you need to extend [\OpenAPIServer\Auth\AbstractAuthenticator](./lib/Auth/AbstractAuthenticator.php) class by [\OpenAPIServer\Auth\BasicAuthenticator](./src/Auth/BasicAuthenticator.php) class.

### Advanced middleware configuration
Ref to used Slim Token Middleware [dyorg/slim-token-authentication](https://github.com/dyorg/slim-token-authentication/tree/1.x#readme)
