# Pinterest REST API Bash client

## Overview

This is a Bash client script for accessing Pinterest REST API service.

The script uses cURL underneath for making all REST calls.

## Usage

```shell
# Make sure the script has executable rights
$ chmod u+x 

# Print the list of operations available on the service
$ ./ -h

# Print the service description
$ ./ --about

# Print detailed information about specific operation
$ ./ <operationId> -h

# Make GET request
./ --host http://<hostname>:<port> --accept xml <operationId> <queryParam1>=<value1> <header_key1>:<header_value2>

# Make GET request using arbitrary curl options (must be passed before <operationId>) to an SSL service using username:password
 -k -sS --tlsv1.2 --host https://<hostname> -u <user>:<password> --accept xml <operationId> <queryParam1>=<value1> <header_key1>:<header_value2>

# Make POST request
$ echo '<body_content>' |  --host <hostname> --content-type json <operationId> -

# Make POST request with simple JSON content, e.g.:
# {
#   "key1": "value1",
#   "key2": "value2",
#   "key3": 23
# }
$ echo '<body_content>' |  --host <hostname> --content-type json <operationId> key1==value1 key2=value2 key3:=23 -

# Make POST request with form data
$  --host <hostname> <operationId> key1:=value1 key2:=value2 key3:=23

# Preview the cURL command without actually executing it
$  --host http://<hostname>:<port> --dry-run <operationid>

```

## Docker image

You can easily create a Docker image containing a preconfigured environment
for using the REST Bash client including working autocompletion and short
welcome message with basic instructions, using the generated Dockerfile:

```shell
docker build -t my-rest-client .
docker run -it my-rest-client
```

By default you will be logged into a Zsh environment which has much more
advanced auto completion, but you can switch to Bash, where basic autocompletion
is also available.

## Shell completion

### Bash

The generated bash-completion script can be either directly loaded to the current Bash session using:

```shell
source .bash-completion
```

Alternatively, the script can be copied to the `/etc/bash-completion.d` (or on OSX with Homebrew to `/usr/local/etc/bash-completion.d`):

```shell
sudo cp .bash-completion /etc/bash-completion.d/
```

#### OS X

On OSX you might need to install bash-completion using Homebrew:

```shell
brew install bash-completion
```

and add the following to the `~/.bashrc`:

```shell
if [ -f $(brew --prefix)/etc/bash_completion ]; then
  . $(brew --prefix)/etc/bash_completion
fi
```

### Zsh

In Zsh, the generated `_` Zsh completion file must be copied to one of the folders under `$FPATH` variable.

## Documentation for API Endpoints

All URIs are relative to */v5*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AdAccountsApi* | [**adAccountAnalytics**](docs/AdAccountsApi.md#adaccountanalytics) | **GET** /ad_accounts/{ad_account_id}/analytics | Get ad account analytics
*AdAccountsApi* | [**adAccountTargetingAnalyticsGet**](docs/AdAccountsApi.md#adaccounttargetinganalyticsget) | **GET** /ad_accounts/{ad_account_id}/targeting_analytics | Get targeting analytics for an ad account
*AdAccountsApi* | [**adAccountsCreate**](docs/AdAccountsApi.md#adaccountscreate) | **POST** /ad_accounts | Create ad account
*AdAccountsApi* | [**adAccountsGet**](docs/AdAccountsApi.md#adaccountsget) | **GET** /ad_accounts/{ad_account_id} | Get ad account
*AdAccountsApi* | [**adAccountsList**](docs/AdAccountsApi.md#adaccountslist) | **GET** /ad_accounts | List ad accounts
*AdAccountsApi* | [**analyticsCreateMmmReport**](docs/AdAccountsApi.md#analyticscreatemmmreport) | **POST** /ad_accounts/{ad_account_id}/mmm_reports | Create a request for a Marketing Mix Modeling (MMM) report
*AdAccountsApi* | [**analyticsCreateReport**](docs/AdAccountsApi.md#analyticscreatereport) | **POST** /ad_accounts/{ad_account_id}/reports | Create async request for an account analytics report
*AdAccountsApi* | [**analyticsCreateTemplateReport**](docs/AdAccountsApi.md#analyticscreatetemplatereport) | **POST** /ad_accounts/{ad_account_id}/templates/{template_id}/reports | Create async request for an analytics report using a template
*AdAccountsApi* | [**analyticsGetMmmReport**](docs/AdAccountsApi.md#analyticsgetmmmreport) | **GET** /ad_accounts/{ad_account_id}/mmm_reports | Get advertiser Marketing Mix Modeling (MMM) report.
*AdAccountsApi* | [**analyticsGetReport**](docs/AdAccountsApi.md#analyticsgetreport) | **GET** /ad_accounts/{ad_account_id}/reports | Get the account analytics report created by the async call
*AdAccountsApi* | [**sandboxDelete**](docs/AdAccountsApi.md#sandboxdelete) | **DELETE** /ad_accounts/{ad_account_id}/sandbox | Delete ads data for ad account in API Sandbox
*AdAccountsApi* | [**templatesList**](docs/AdAccountsApi.md#templateslist) | **GET** /ad_accounts/{ad_account_id}/templates | List templates
*AdGroupsApi* | [**adGroupsAnalytics**](docs/AdGroupsApi.md#adgroupsanalytics) | **GET** /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics
*AdGroupsApi* | [**adGroupsAudienceSizing**](docs/AdGroupsApi.md#adgroupsaudiencesizing) | **POST** /ad_accounts/{ad_account_id}/ad_groups/audience_sizing | Get audience sizing
*AdGroupsApi* | [**adGroupsBidFloorGet**](docs/AdGroupsApi.md#adgroupsbidfloorget) | **POST** /ad_accounts/{ad_account_id}/bid_floor | Get bid floors
*AdGroupsApi* | [**adGroupsCreate**](docs/AdGroupsApi.md#adgroupscreate) | **POST** /ad_accounts/{ad_account_id}/ad_groups | Create ad groups
*AdGroupsApi* | [**adGroupsGet**](docs/AdGroupsApi.md#adgroupsget) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id} | Get ad group
*AdGroupsApi* | [**adGroupsList**](docs/AdGroupsApi.md#adgroupslist) | **GET** /ad_accounts/{ad_account_id}/ad_groups | List ad groups
*AdGroupsApi* | [**adGroupsTargetingAnalyticsGet**](docs/AdGroupsApi.md#adgroupstargetinganalyticsget) | **GET** /ad_accounts/{ad_account_id}/ad_groups/targeting_analytics | Get targeting analytics for ad groups
*AdGroupsApi* | [**adGroupsUpdate**](docs/AdGroupsApi.md#adgroupsupdate) | **PATCH** /ad_accounts/{ad_account_id}/ad_groups | Update ad groups
*AdsApi* | [**adPreviewsCreate**](docs/AdsApi.md#adpreviewscreate) | **POST** /ad_accounts/{ad_account_id}/ad_previews | Create ad preview with pin or image
*AdsApi* | [**adTargetingAnalyticsGet**](docs/AdsApi.md#adtargetinganalyticsget) | **GET** /ad_accounts/{ad_account_id}/ads/targeting_analytics | Get targeting analytics for ads
*AdsApi* | [**adsAnalytics**](docs/AdsApi.md#adsanalytics) | **GET** /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics
*AdsApi* | [**adsCreate**](docs/AdsApi.md#adscreate) | **POST** /ad_accounts/{ad_account_id}/ads | Create ads
*AdsApi* | [**adsGet**](docs/AdsApi.md#adsget) | **GET** /ad_accounts/{ad_account_id}/ads/{ad_id} | Get ad
*AdsApi* | [**adsList**](docs/AdsApi.md#adslist) | **GET** /ad_accounts/{ad_account_id}/ads | List ads
*AdsApi* | [**adsUpdate**](docs/AdsApi.md#adsupdate) | **PATCH** /ad_accounts/{ad_account_id}/ads | Update ads
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
*AudiencesApi* | [**audiencesCreateCustom**](docs/AudiencesApi.md#audiencescreatecustom) | **POST** /ad_accounts/{ad_account_id}/audiences/custom | Create custom audience
*AudiencesApi* | [**audiencesGet**](docs/AudiencesApi.md#audiencesget) | **GET** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Get audience
*AudiencesApi* | [**audiencesList**](docs/AudiencesApi.md#audienceslist) | **GET** /ad_accounts/{ad_account_id}/audiences | List audiences
*AudiencesApi* | [**audiencesUpdate**](docs/AudiencesApi.md#audiencesupdate) | **PATCH** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Update audience
*BillingApi* | [**adsCreditRedeem**](docs/BillingApi.md#adscreditredeem) | **POST** /ad_accounts/{ad_account_id}/ads_credit/redeem | Redeem ad credits
*BillingApi* | [**adsCreditsDiscountsGet**](docs/BillingApi.md#adscreditsdiscountsget) | **GET** /ad_accounts/{ad_account_id}/ads_credit/discounts | Get ads credit discounts
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
*BusinessAccessInviteApi* | [**assetAccessRequestsCreate**](docs/BusinessAccessInviteApi.md#assetaccessrequestscreate) | **POST** /businesses/{business_id}/requests/assets/access | Create a request to access an existing partner&#39;s assets.
*BusinessAccessInviteApi* | [**cancelInvitesOrRequests**](docs/BusinessAccessInviteApi.md#cancelinvitesorrequests) | **DELETE** /businesses/{business_id}/invites | Cancel invites/requests
*BusinessAccessInviteApi* | [**createAssetInvites**](docs/BusinessAccessInviteApi.md#createassetinvites) | **POST** /businesses/{business_id}/invites/assets/access | Update invite/request with an asset permission
*BusinessAccessInviteApi* | [**createMembershipOrPartnershipInvites**](docs/BusinessAccessInviteApi.md#createmembershiporpartnershipinvites) | **POST** /businesses/{business_id}/invites | Create invites or requests
*BusinessAccessInviteApi* | [**getInvites**](docs/BusinessAccessInviteApi.md#getinvites) | **GET** /businesses/{business_id}/invites | Get invites/requests
*BusinessAccessInviteApi* | [**respondBusinessAccessInvites**](docs/BusinessAccessInviteApi.md#respondbusinessaccessinvites) | **PATCH** /businesses/invites | Accept or decline an invite/request
*BusinessAccessRelationshipsApi* | [**deleteBusinessMembership**](docs/BusinessAccessRelationshipsApi.md#deletebusinessmembership) | **DELETE** /businesses/{business_id}/members | Terminate business memberships
*BusinessAccessRelationshipsApi* | [**deleteBusinessPartners**](docs/BusinessAccessRelationshipsApi.md#deletebusinesspartners) | **DELETE** /businesses/{business_id}/partners | Terminate business partnerships
*BusinessAccessRelationshipsApi* | [**getBusinessEmployers**](docs/BusinessAccessRelationshipsApi.md#getbusinessemployers) | **GET** /businesses/employers | List business employers for user
*BusinessAccessRelationshipsApi* | [**getBusinessMembers**](docs/BusinessAccessRelationshipsApi.md#getbusinessmembers) | **GET** /businesses/{business_id}/members | Get business members
*BusinessAccessRelationshipsApi* | [**getBusinessPartners**](docs/BusinessAccessRelationshipsApi.md#getbusinesspartners) | **GET** /businesses/{business_id}/partners | Get business partners
*BusinessAccessRelationshipsApi* | [**updateBusinessMemberships**](docs/BusinessAccessRelationshipsApi.md#updatebusinessmemberships) | **PATCH** /businesses/{business_id}/members | Update member&#39;s business role
*CampaignsApi* | [**campaignTargetingAnalyticsGet**](docs/CampaignsApi.md#campaigntargetinganalyticsget) | **GET** /ad_accounts/{ad_account_id}/campaigns/targeting_analytics | Get targeting analytics for campaigns
*CampaignsApi* | [**campaignsAnalytics**](docs/CampaignsApi.md#campaignsanalytics) | **GET** /ad_accounts/{ad_account_id}/campaigns/analytics | Get campaign analytics
*CampaignsApi* | [**campaignsCreate**](docs/CampaignsApi.md#campaignscreate) | **POST** /ad_accounts/{ad_account_id}/campaigns | Create campaigns
*CampaignsApi* | [**campaignsGet**](docs/CampaignsApi.md#campaignsget) | **GET** /ad_accounts/{ad_account_id}/campaigns/{campaign_id} | Get campaign
*CampaignsApi* | [**campaignsList**](docs/CampaignsApi.md#campaignslist) | **GET** /ad_accounts/{ad_account_id}/campaigns | List campaigns
*CampaignsApi* | [**campaignsUpdate**](docs/CampaignsApi.md#campaignsupdate) | **PATCH** /ad_accounts/{ad_account_id}/campaigns | Update campaigns
*CatalogsApi* | [**catalogsCreate**](docs/CatalogsApi.md#catalogscreate) | **POST** /catalogs | Create catalog
*CatalogsApi* | [**catalogsList**](docs/CatalogsApi.md#catalogslist) | **GET** /catalogs | List catalogs
*CatalogsApi* | [**catalogsProductGroupPinsList**](docs/CatalogsApi.md#catalogsproductgrouppinslist) | **GET** /catalogs/product_groups/{product_group_id}/products | List products by product group
*CatalogsApi* | [**catalogsProductGroupsCreate**](docs/CatalogsApi.md#catalogsproductgroupscreate) | **POST** /catalogs/product_groups | Create product group
*CatalogsApi* | [**catalogsProductGroupsCreateMany**](docs/CatalogsApi.md#catalogsproductgroupscreatemany) | **POST** /catalogs/product_groups/multiple | Create product groups
*CatalogsApi* | [**catalogsProductGroupsDelete**](docs/CatalogsApi.md#catalogsproductgroupsdelete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group
*CatalogsApi* | [**catalogsProductGroupsDeleteMany**](docs/CatalogsApi.md#catalogsproductgroupsdeletemany) | **DELETE** /catalogs/product_groups/multiple | Delete product groups
*CatalogsApi* | [**catalogsProductGroupsGet**](docs/CatalogsApi.md#catalogsproductgroupsget) | **GET** /catalogs/product_groups/{product_group_id} | Get product group
*CatalogsApi* | [**catalogsProductGroupsList**](docs/CatalogsApi.md#catalogsproductgroupslist) | **GET** /catalogs/product_groups | List product groups
*CatalogsApi* | [**catalogsProductGroupsProductCountsGet**](docs/CatalogsApi.md#catalogsproductgroupsproductcountsget) | **GET** /catalogs/product_groups/{product_group_id}/product_counts | Get product counts
*CatalogsApi* | [**catalogsProductGroupsUpdate**](docs/CatalogsApi.md#catalogsproductgroupsupdate) | **PATCH** /catalogs/product_groups/{product_group_id} | Update single product group
*CatalogsApi* | [**feedProcessingResultsList**](docs/CatalogsApi.md#feedprocessingresultslist) | **GET** /catalogs/feeds/{feed_id}/processing_results | List feed processing results
*CatalogsApi* | [**feedsCreate**](docs/CatalogsApi.md#feedscreate) | **POST** /catalogs/feeds | Create feed
*CatalogsApi* | [**feedsDelete**](docs/CatalogsApi.md#feedsdelete) | **DELETE** /catalogs/feeds/{feed_id} | Delete feed
*CatalogsApi* | [**feedsGet**](docs/CatalogsApi.md#feedsget) | **GET** /catalogs/feeds/{feed_id} | Get feed
*CatalogsApi* | [**feedsIngest**](docs/CatalogsApi.md#feedsingest) | **POST** /catalogs/feeds/{feed_id}/ingest | Ingest feed items
*CatalogsApi* | [**feedsList**](docs/CatalogsApi.md#feedslist) | **GET** /catalogs/feeds | List feeds
*CatalogsApi* | [**feedsUpdate**](docs/CatalogsApi.md#feedsupdate) | **PATCH** /catalogs/feeds/{feed_id} | Update feed
*CatalogsApi* | [**itemsBatchGet**](docs/CatalogsApi.md#itemsbatchget) | **GET** /catalogs/items/batch/{batch_id} | Get item batch status
*CatalogsApi* | [**itemsBatchPost**](docs/CatalogsApi.md#itemsbatchpost) | **POST** /catalogs/items/batch | Operate on item batch
*CatalogsApi* | [**itemsGet**](docs/CatalogsApi.md#itemsget) | **GET** /catalogs/items | Get catalogs items
*CatalogsApi* | [**itemsIssuesList**](docs/CatalogsApi.md#itemsissueslist) | **GET** /catalogs/processing_results/{processing_result_id}/item_issues | List item issues
*CatalogsApi* | [**itemsPost**](docs/CatalogsApi.md#itemspost) | **POST** /catalogs/items | Get catalogs items (POST)
*CatalogsApi* | [**productsByProductGroupFilterList**](docs/CatalogsApi.md#productsbyproductgroupfilterlist) | **POST** /catalogs/products/get_by_product_group_filters | List products by filter
*CatalogsApi* | [**reportsCreate**](docs/CatalogsApi.md#reportscreate) | **POST** /catalogs/reports | Build catalogs report
*CatalogsApi* | [**reportsGet**](docs/CatalogsApi.md#reportsget) | **GET** /catalogs/reports | Get catalogs report
*CatalogsApi* | [**reportsStats**](docs/CatalogsApi.md#reportsstats) | **GET** /catalogs/reports/stats | List report stats
*ConversionEventsApi* | [**eventsCreate**](docs/ConversionEventsApi.md#eventscreate) | **POST** /ad_accounts/{ad_account_id}/events | Send conversions
*ConversionTagsApi* | [**conversionTagsCreate**](docs/ConversionTagsApi.md#conversiontagscreate) | **POST** /ad_accounts/{ad_account_id}/conversion_tags | Create conversion tag
*ConversionTagsApi* | [**conversionTagsGet**](docs/ConversionTagsApi.md#conversiontagsget) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id} | Get conversion tag
*ConversionTagsApi* | [**conversionTagsList**](docs/ConversionTagsApi.md#conversiontagslist) | **GET** /ad_accounts/{ad_account_id}/conversion_tags | Get conversion tags
*ConversionTagsApi* | [**ocpmEligibleConversionTagsGet**](docs/ConversionTagsApi.md#ocpmeligibleconversiontagsget) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible | Get Ocpm eligible conversion tags
*ConversionTagsApi* | [**pageVisitConversionTagsGet**](docs/ConversionTagsApi.md#pagevisitconversiontagsget) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/page_visit | Get page visit conversion tags
*CustomerListsApi* | [**customerListsCreate**](docs/CustomerListsApi.md#customerlistscreate) | **POST** /ad_accounts/{ad_account_id}/customer_lists | Create customer lists
*CustomerListsApi* | [**customerListsGet**](docs/CustomerListsApi.md#customerlistsget) | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Get customer list
*CustomerListsApi* | [**customerListsList**](docs/CustomerListsApi.md#customerlistslist) | **GET** /ad_accounts/{ad_account_id}/customer_lists | Get customer lists
*CustomerListsApi* | [**customerListsUpdate**](docs/CustomerListsApi.md#customerlistsupdate) | **PATCH** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Update customer list
*IntegrationsApi* | [**integrationsCommerceDel**](docs/IntegrationsApi.md#integrationscommercedel) | **DELETE** /integrations/commerce/{external_business_id} | Delete commerce integration
*IntegrationsApi* | [**integrationsCommerceGet**](docs/IntegrationsApi.md#integrationscommerceget) | **GET** /integrations/commerce/{external_business_id} | Get commerce integration
*IntegrationsApi* | [**integrationsCommercePatch**](docs/IntegrationsApi.md#integrationscommercepatch) | **PATCH** /integrations/commerce/{external_business_id} | Update commerce integration
*IntegrationsApi* | [**integrationsCommercePost**](docs/IntegrationsApi.md#integrationscommercepost) | **POST** /integrations/commerce | Create commerce integration
*IntegrationsApi* | [**integrationsGetById**](docs/IntegrationsApi.md#integrationsgetbyid) | **GET** /integrations/{id} | Get integration metadata
*IntegrationsApi* | [**integrationsGetList**](docs/IntegrationsApi.md#integrationsgetlist) | **GET** /integrations | Get integration metadata list
*IntegrationsApi* | [**integrationsLogsPost**](docs/IntegrationsApi.md#integrationslogspost) | **POST** /integrations/logs | Receives batched logs from integration applications.
*KeywordsApi* | [**countryKeywordsMetricsGet**](docs/KeywordsApi.md#countrykeywordsmetricsget) | **GET** /ad_accounts/{ad_account_id}/keywords/metrics | Get country&#39;s keyword metrics
*KeywordsApi* | [**keywordsCreate**](docs/KeywordsApi.md#keywordscreate) | **POST** /ad_accounts/{ad_account_id}/keywords | Create keywords
*KeywordsApi* | [**keywordsGet**](docs/KeywordsApi.md#keywordsget) | **GET** /ad_accounts/{ad_account_id}/keywords | Get keywords
*KeywordsApi* | [**keywordsUpdate**](docs/KeywordsApi.md#keywordsupdate) | **PATCH** /ad_accounts/{ad_account_id}/keywords | Update keywords
*KeywordsApi* | [**trendingKeywordsList**](docs/KeywordsApi.md#trendingkeywordslist) | **GET** /trends/keywords/{region}/top/{trend_type} | List trending keywords
*LeadAdsApi* | [**adAccountsSubscriptionsDelById**](docs/LeadAdsApi.md#adaccountssubscriptionsdelbyid) | **DELETE** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Delete lead ads subscription
*LeadAdsApi* | [**adAccountsSubscriptionsGetById**](docs/LeadAdsApi.md#adaccountssubscriptionsgetbyid) | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Get lead ads subscription
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
*OauthApi* | [**oauthToken**](docs/OauthApi.md#oauthtoken) | **POST** /oauth/token | Generate OAuth access token
*OrderLinesApi* | [**orderLinesGet**](docs/OrderLinesApi.md#orderlinesget) | **GET** /ad_accounts/{ad_account_id}/order_lines/{order_line_id} | Get order line
*OrderLinesApi* | [**orderLinesList**](docs/OrderLinesApi.md#orderlineslist) | **GET** /ad_accounts/{ad_account_id}/order_lines | Get order lines
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
*ResourcesApi* | [**adAccountCountriesGet**](docs/ResourcesApi.md#adaccountcountriesget) | **GET** /resources/ad_account_countries | Get ad accounts countries
*ResourcesApi* | [**deliveryMetricsGet**](docs/ResourcesApi.md#deliverymetricsget) | **GET** /resources/delivery_metrics | Get available metrics&#39; definitions
*ResourcesApi* | [**interestTargetingOptionsGet**](docs/ResourcesApi.md#interesttargetingoptionsget) | **GET** /resources/targeting/interests/{interest_id} | Get interest details
*ResourcesApi* | [**leadFormQuestionsGet**](docs/ResourcesApi.md#leadformquestionsget) | **GET** /resources/lead_form_questions | Get lead form questions
*ResourcesApi* | [**metricsReadyStateGet**](docs/ResourcesApi.md#metricsreadystateget) | **GET** /resources/metrics_ready_state | Get metrics ready state
*ResourcesApi* | [**targetingOptionsGet**](docs/ResourcesApi.md#targetingoptionsget) | **GET** /resources/targeting/{targeting_type} | Get targeting options
*SearchApi* | [**searchPartnerPins**](docs/SearchApi.md#searchpartnerpins) | **GET** /search/partner/pins | Search pins by a given search term
*SearchApi* | [**searchUserBoardsGet**](docs/SearchApi.md#searchuserboardsget) | **GET** /search/boards | Search user&#39;s boards
*SearchApi* | [**searchUserPinsList**](docs/SearchApi.md#searchuserpinslist) | **GET** /search/pins | Search user&#39;s Pins
*TargetingTemplateApi* | [**targetingTemplateCreate**](docs/TargetingTemplateApi.md#targetingtemplatecreate) | **POST** /ad_accounts/{ad_account_id}/targeting_templates | Create targeting templates
*TargetingTemplateApi* | [**targetingTemplateList**](docs/TargetingTemplateApi.md#targetingtemplatelist) | **GET** /ad_accounts/{ad_account_id}/targeting_templates | List targeting templates
*TargetingTemplateApi* | [**targetingTemplateUpdate**](docs/TargetingTemplateApi.md#targetingtemplateupdate) | **PATCH** /ad_accounts/{ad_account_id}/targeting_templates | Update targeting templates
*TermsApi* | [**termsRelatedList**](docs/TermsApi.md#termsrelatedlist) | **GET** /terms/related | List related terms
*TermsApi* | [**termsSuggestedList**](docs/TermsApi.md#termssuggestedlist) | **GET** /terms/suggested | List suggested terms
*TermsOfServiceApi* | [**termsOfServiceGet**](docs/TermsOfServiceApi.md#termsofserviceget) | **GET** /ad_accounts/{ad_account_id}/terms_of_service | Get terms of service
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


## Documentation For Models

 - [Account](docs/Account.md)
 - [ActionType](docs/ActionType.md)
 - [AdAccount](docs/AdAccount.md)
 - [AdAccountAnalyticsResponseInner](docs/AdAccountAnalyticsResponseInner.md)
 - [AdAccountCreateRequest](docs/AdAccountCreateRequest.md)
 - [AdAccountCreateSubscriptionRequest](docs/AdAccountCreateSubscriptionRequest.md)
 - [AdAccountCreateSubscriptionRequestPartnerMetadata](docs/AdAccountCreateSubscriptionRequestPartnerMetadata.md)
 - [AdAccountCreateSubscriptionResponse](docs/AdAccountCreateSubscriptionResponse.md)
 - [AdAccountGetSubscriptionResponse](docs/AdAccountGetSubscriptionResponse.md)
 - [AdAccountOwner](docs/AdAccountOwner.md)
 - [AdAccountsAudiencesSharedAccountsList200Response](docs/AdAccountsAudiencesSharedAccountsList200Response.md)
 - [AdAccountsCountryResponse](docs/AdAccountsCountryResponse.md)
 - [AdAccountsCountryResponseData](docs/AdAccountsCountryResponseData.md)
 - [AdAccountsList200Response](docs/AdAccountsList200Response.md)
 - [AdAccountsSubscriptionsGetList200Response](docs/AdAccountsSubscriptionsGetList200Response.md)
 - [AdArrayResponse](docs/AdArrayResponse.md)
 - [AdArrayResponseElement](docs/AdArrayResponseElement.md)
 - [AdCommon](docs/AdCommon.md)
 - [AdCountry](docs/AdCountry.md)
 - [AdCreateRequest](docs/AdCreateRequest.md)
 - [AdGroupArrayResponse](docs/AdGroupArrayResponse.md)
 - [AdGroupArrayResponseElement](docs/AdGroupArrayResponseElement.md)
 - [AdGroupAudienceSizingRequest](docs/AdGroupAudienceSizingRequest.md)
 - [AdGroupAudienceSizingRequestKeywordsInner](docs/AdGroupAudienceSizingRequestKeywordsInner.md)
 - [AdGroupAudienceSizingResponse](docs/AdGroupAudienceSizingResponse.md)
 - [AdGroupCommon](docs/AdGroupCommon.md)
 - [AdGroupCreateRequest](docs/AdGroupCreateRequest.md)
 - [AdGroupResponse](docs/AdGroupResponse.md)
 - [AdGroupSummaryStatus](docs/AdGroupSummaryStatus.md)
 - [AdGroupUpdateRequest](docs/AdGroupUpdateRequest.md)
 - [AdGroupsAnalyticsResponseInner](docs/AdGroupsAnalyticsResponseInner.md)
 - [AdGroupsList200Response](docs/AdGroupsList200Response.md)
 - [AdPinId](docs/AdPinId.md)
 - [AdPreviewCreateFromImage](docs/AdPreviewCreateFromImage.md)
 - [AdPreviewCreateFromPin](docs/AdPreviewCreateFromPin.md)
 - [AdPreviewRequest](docs/AdPreviewRequest.md)
 - [AdPreviewURLResponse](docs/AdPreviewURLResponse.md)
 - [AdResponse](docs/AdResponse.md)
 - [AdUpdateRequest](docs/AdUpdateRequest.md)
 - [AdsAnalyticsAdTargetingType](docs/AdsAnalyticsAdTargetingType.md)
 - [AdsAnalyticsCampaignTargetingType](docs/AdsAnalyticsCampaignTargetingType.md)
 - [AdsAnalyticsCreateAsyncRequest](docs/AdsAnalyticsCreateAsyncRequest.md)
 - [AdsAnalyticsCreateAsyncResponse](docs/AdsAnalyticsCreateAsyncResponse.md)
 - [AdsAnalyticsFilterColumn](docs/AdsAnalyticsFilterColumn.md)
 - [AdsAnalyticsFilterOperator](docs/AdsAnalyticsFilterOperator.md)
 - [AdsAnalyticsGetAsyncResponse](docs/AdsAnalyticsGetAsyncResponse.md)
 - [AdsAnalyticsMetricsFilter](docs/AdsAnalyticsMetricsFilter.md)
 - [AdsAnalyticsResponseInner](docs/AdsAnalyticsResponseInner.md)
 - [AdsAnalyticsTargetingType](docs/AdsAnalyticsTargetingType.md)
 - [AdsCreditDiscountsResponse](docs/AdsCreditDiscountsResponse.md)
 - [AdsCreditRedeemRequest](docs/AdsCreditRedeemRequest.md)
 - [AdsCreditRedeemResponse](docs/AdsCreditRedeemResponse.md)
 - [AdsCreditsDiscountsGet200Response](docs/AdsCreditsDiscountsGet200Response.md)
 - [AdsList200Response](docs/AdsList200Response.md)
 - [AdvancedAuctionBidOptions](docs/AdvancedAuctionBidOptions.md)
 - [AdvancedAuctionItem](docs/AdvancedAuctionItem.md)
 - [AdvancedAuctionItems](docs/AdvancedAuctionItems.md)
 - [AdvancedAuctionItemsGetRecord](docs/AdvancedAuctionItemsGetRecord.md)
 - [AdvancedAuctionItemsGetRequest](docs/AdvancedAuctionItemsGetRequest.md)
 - [AdvancedAuctionItemsSubmitDeleteRecord](docs/AdvancedAuctionItemsSubmitDeleteRecord.md)
 - [AdvancedAuctionItemsSubmitRecord](docs/AdvancedAuctionItemsSubmitRecord.md)
 - [AdvancedAuctionItemsSubmitRequest](docs/AdvancedAuctionItemsSubmitRequest.md)
 - [AdvancedAuctionItemsSubmitUpsertRecord](docs/AdvancedAuctionItemsSubmitUpsertRecord.md)
 - [AdvancedAuctionKey](docs/AdvancedAuctionKey.md)
 - [AdvancedAuctionOperation](docs/AdvancedAuctionOperation.md)
 - [AdvancedAuctionOperationError](docs/AdvancedAuctionOperationError.md)
 - [AdvancedAuctionProcessedItem](docs/AdvancedAuctionProcessedItem.md)
 - [AdvancedAuctionProcessedItems](docs/AdvancedAuctionProcessedItems.md)
 - [AnalyticsDailyMetrics](docs/AnalyticsDailyMetrics.md)
 - [AnalyticsMetricsResponse](docs/AnalyticsMetricsResponse.md)
 - [AppTypeMultipliers](docs/AppTypeMultipliers.md)
 - [AssetGroupBinding](docs/AssetGroupBinding.md)
 - [AssetGroupType](docs/AssetGroupType.md)
 - [AssetIdPermissions](docs/AssetIdPermissions.md)
 - [Audience](docs/Audience.md)
 - [AudienceAccountType](docs/AudienceAccountType.md)
 - [AudienceCategory](docs/AudienceCategory.md)
 - [AudienceCommon](docs/AudienceCommon.md)
 - [AudienceCreateCustomRequest](docs/AudienceCreateCustomRequest.md)
 - [AudienceCreateRequest](docs/AudienceCreateRequest.md)
 - [AudienceCreateRequest1AudienceType](docs/AudienceCreateRequest1AudienceType.md)
 - [AudienceDataParty](docs/AudienceDataParty.md)
 - [AudienceDefinition](docs/AudienceDefinition.md)
 - [AudienceDefinitionResponse](docs/AudienceDefinitionResponse.md)
 - [AudienceDemographicValue](docs/AudienceDemographicValue.md)
 - [AudienceDemographics](docs/AudienceDemographics.md)
 - [AudienceInsightCategoryArrayResponse](docs/AudienceInsightCategoryArrayResponse.md)
 - [AudienceInsightCategoryCommon](docs/AudienceInsightCategoryCommon.md)
 - [AudienceInsightType](docs/AudienceInsightType.md)
 - [AudienceInsightsResponse](docs/AudienceInsightsResponse.md)
 - [AudienceRule](docs/AudienceRule.md)
 - [AudienceShareType](docs/AudienceShareType.md)
 - [AudienceSharingType](docs/AudienceSharingType.md)
 - [AudienceSubcategory](docs/AudienceSubcategory.md)
 - [AudienceType](docs/AudienceType.md)
 - [AudienceUpdateOperationType](docs/AudienceUpdateOperationType.md)
 - [AudienceUpdateRequest](docs/AudienceUpdateRequest.md)
 - [AudiencesList200Response](docs/AudiencesList200Response.md)
 - [AuthRespondInvitesBody](docs/AuthRespondInvitesBody.md)
 - [AuthRespondInvitesBodyInvitesInner](docs/AuthRespondInvitesBodyInvitesInner.md)
 - [AuthRespondInvitesBodyInvitesInnerAction](docs/AuthRespondInvitesBodyInvitesInnerAction.md)
 - [AvailabilityFilter](docs/AvailabilityFilter.md)
 - [BaseInviteDataResponse](docs/BaseInviteDataResponse.md)
 - [BaseInviteDataResponseInviteData](docs/BaseInviteDataResponseInviteData.md)
 - [BatchOperation](docs/BatchOperation.md)
 - [BatchOperationStatus](docs/BatchOperationStatus.md)
 - [BidFloor](docs/BidFloor.md)
 - [BidFloorRequest](docs/BidFloorRequest.md)
 - [BidFloorSpec](docs/BidFloorSpec.md)
 - [BillingProfilesGet200Response](docs/BillingProfilesGet200Response.md)
 - [BillingProfilesResponse](docs/BillingProfilesResponse.md)
 - [Board](docs/Board.md)
 - [BoardMedia](docs/BoardMedia.md)
 - [BoardOwner](docs/BoardOwner.md)
 - [BoardSection](docs/BoardSection.md)
 - [BoardSectionsList200Response](docs/BoardSectionsList200Response.md)
 - [BoardUpdate](docs/BoardUpdate.md)
 - [BoardsList200Response](docs/BoardsList200Response.md)
 - [BoardsListPins200Response](docs/BoardsListPins200Response.md)
 - [BoardsUserFollowsList200Response](docs/BoardsUserFollowsList200Response.md)
 - [BookClosedResponse](docs/BookClosedResponse.md)
 - [BrandFilter](docs/BrandFilter.md)
 - [BudgetType](docs/BudgetType.md)
 - [BulkDownloadRequest](docs/BulkDownloadRequest.md)
 - [BulkDownloadRequestCampaignFilter](docs/BulkDownloadRequestCampaignFilter.md)
 - [BulkDownloadResponse](docs/BulkDownloadResponse.md)
 - [BulkEntityType](docs/BulkEntityType.md)
 - [BulkOutputFormat](docs/BulkOutputFormat.md)
 - [BulkReportingJobStatus](docs/BulkReportingJobStatus.md)
 - [BulkUpsertRequest](docs/BulkUpsertRequest.md)
 - [BulkUpsertRequestCreate](docs/BulkUpsertRequestCreate.md)
 - [BulkUpsertRequestUpdate](docs/BulkUpsertRequestUpdate.md)
 - [BulkUpsertResponse](docs/BulkUpsertResponse.md)
 - [BulkUpsertStatus](docs/BulkUpsertStatus.md)
 - [BulkUpsertStatusResponse](docs/BulkUpsertStatusResponse.md)
 - [BusinessAccessError](docs/BusinessAccessError.md)
 - [BusinessAccessRole](docs/BusinessAccessRole.md)
 - [BusinessAccessUserSummary](docs/BusinessAccessUserSummary.md)
 - [BusinessAssetMembersGet200Response](docs/BusinessAssetMembersGet200Response.md)
 - [BusinessAssetPartnersGet200Response](docs/BusinessAssetPartnersGet200Response.md)
 - [BusinessAssetsGet200Response](docs/BusinessAssetsGet200Response.md)
 - [BusinessMemberAssetsGet200Response](docs/BusinessMemberAssetsGet200Response.md)
 - [BusinessMemberAssetsSummary](docs/BusinessMemberAssetsSummary.md)
 - [BusinessMemberAssetsSummaryAdAccountsInner](docs/BusinessMemberAssetsSummaryAdAccountsInner.md)
 - [BusinessMemberAssetsSummaryProfilesInner](docs/BusinessMemberAssetsSummaryProfilesInner.md)
 - [BusinessMembersAssetAccessDeleteRequest](docs/BusinessMembersAssetAccessDeleteRequest.md)
 - [BusinessMembersAssetAccessDeleteRequestAccessesInner](docs/BusinessMembersAssetAccessDeleteRequestAccessesInner.md)
 - [BusinessPartnerAssetAccessGet200Response](docs/BusinessPartnerAssetAccessGet200Response.md)
 - [BusinessRole](docs/BusinessRole.md)
 - [BusinessRoleCheckMode](docs/BusinessRoleCheckMode.md)
 - [BusinessRoleForMembers](docs/BusinessRoleForMembers.md)
 - [BusinessSharedAudience](docs/BusinessSharedAudience.md)
 - [BusinessSharedAudienceResponse](docs/BusinessSharedAudienceResponse.md)
 - [CampaignCommon](docs/CampaignCommon.md)
 - [CampaignCreateCommon](docs/CampaignCreateCommon.md)
 - [CampaignCreateRequest](docs/CampaignCreateRequest.md)
 - [CampaignCreateResponse](docs/CampaignCreateResponse.md)
 - [CampaignCreateResponseData](docs/CampaignCreateResponseData.md)
 - [CampaignCreateResponseItem](docs/CampaignCreateResponseItem.md)
 - [CampaignId](docs/CampaignId.md)
 - [CampaignResponse](docs/CampaignResponse.md)
 - [CampaignSummaryStatus](docs/CampaignSummaryStatus.md)
 - [CampaignUpdateRequest](docs/CampaignUpdateRequest.md)
 - [CampaignUpdateResponse](docs/CampaignUpdateResponse.md)
 - [CampaignsAnalyticsResponseInner](docs/CampaignsAnalyticsResponseInner.md)
 - [CampaignsList200Response](docs/CampaignsList200Response.md)
 - [CancelInvitesBody](docs/CancelInvitesBody.md)
 - [Catalog](docs/Catalog.md)
 - [CatalogsCreateCreativeAssetsItem](docs/CatalogsCreateCreativeAssetsItem.md)
 - [CatalogsCreateHotelItem](docs/CatalogsCreateHotelItem.md)
 - [CatalogsCreateReportResponse](docs/CatalogsCreateReportResponse.md)
 - [CatalogsCreateRequest](docs/CatalogsCreateRequest.md)
 - [CatalogsCreateRetailItem](docs/CatalogsCreateRetailItem.md)
 - [CatalogsCreativeAssetsAttributes](docs/CatalogsCreativeAssetsAttributes.md)
 - [CatalogsCreativeAssetsBatchItem](docs/CatalogsCreativeAssetsBatchItem.md)
 - [CatalogsCreativeAssetsBatchRequest](docs/CatalogsCreativeAssetsBatchRequest.md)
 - [CatalogsCreativeAssetsFeed](docs/CatalogsCreativeAssetsFeed.md)
 - [CatalogsCreativeAssetsFeedsCreateRequest](docs/CatalogsCreativeAssetsFeedsCreateRequest.md)
 - [CatalogsCreativeAssetsFeedsUpdateRequest](docs/CatalogsCreativeAssetsFeedsUpdateRequest.md)
 - [CatalogsCreativeAssetsItemErrorResponse](docs/CatalogsCreativeAssetsItemErrorResponse.md)
 - [CatalogsCreativeAssetsItemResponse](docs/CatalogsCreativeAssetsItemResponse.md)
 - [CatalogsCreativeAssetsItemsBatch](docs/CatalogsCreativeAssetsItemsBatch.md)
 - [CatalogsCreativeAssetsItemsFilter](docs/CatalogsCreativeAssetsItemsFilter.md)
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
 - [CatalogsDbItem](docs/CatalogsDbItem.md)
 - [CatalogsDeleteCreativeAssetsItem](docs/CatalogsDeleteCreativeAssetsItem.md)
 - [CatalogsDeleteHotelItem](docs/CatalogsDeleteHotelItem.md)
 - [CatalogsDeleteRetailItem](docs/CatalogsDeleteRetailItem.md)
 - [CatalogsFeed](docs/CatalogsFeed.md)
 - [CatalogsFeedCredentials](docs/CatalogsFeedCredentials.md)
 - [CatalogsFeedIngestion](docs/CatalogsFeedIngestion.md)
 - [CatalogsFeedIngestionDetails](docs/CatalogsFeedIngestionDetails.md)
 - [CatalogsFeedIngestionErrors](docs/CatalogsFeedIngestionErrors.md)
 - [CatalogsFeedIngestionInfo](docs/CatalogsFeedIngestionInfo.md)
 - [CatalogsFeedIngestionWarnings](docs/CatalogsFeedIngestionWarnings.md)
 - [CatalogsFeedProcessingResult](docs/CatalogsFeedProcessingResult.md)
 - [CatalogsFeedProcessingSchedule](docs/CatalogsFeedProcessingSchedule.md)
 - [CatalogsFeedProcessingStatus](docs/CatalogsFeedProcessingStatus.md)
 - [CatalogsFeedProductCounts](docs/CatalogsFeedProductCounts.md)
 - [CatalogsFeedValidationDetails](docs/CatalogsFeedValidationDetails.md)
 - [CatalogsFeedValidationErrors](docs/CatalogsFeedValidationErrors.md)
 - [CatalogsFeedValidationWarnings](docs/CatalogsFeedValidationWarnings.md)
 - [CatalogsFeedsCreateRequest](docs/CatalogsFeedsCreateRequest.md)
 - [CatalogsFeedsCreateRequestDefaultLocale](docs/CatalogsFeedsCreateRequestDefaultLocale.md)
 - [CatalogsFeedsUpdateRequest](docs/CatalogsFeedsUpdateRequest.md)
 - [CatalogsFormat](docs/CatalogsFormat.md)
 - [CatalogsHotelAddress](docs/CatalogsHotelAddress.md)
 - [CatalogsHotelAttributes](docs/CatalogsHotelAttributes.md)
 - [CatalogsHotelAttributesAllOfMainImage](docs/CatalogsHotelAttributesAllOfMainImage.md)
 - [CatalogsHotelBatchItem](docs/CatalogsHotelBatchItem.md)
 - [CatalogsHotelBatchRequest](docs/CatalogsHotelBatchRequest.md)
 - [CatalogsHotelFeed](docs/CatalogsHotelFeed.md)
 - [CatalogsHotelFeedsCreateRequest](docs/CatalogsHotelFeedsCreateRequest.md)
 - [CatalogsHotelFeedsUpdateRequest](docs/CatalogsHotelFeedsUpdateRequest.md)
 - [CatalogsHotelGuestRatings](docs/CatalogsHotelGuestRatings.md)
 - [CatalogsHotelItemErrorResponse](docs/CatalogsHotelItemErrorResponse.md)
 - [CatalogsHotelItemResponse](docs/CatalogsHotelItemResponse.md)
 - [CatalogsHotelItemsBatch](docs/CatalogsHotelItemsBatch.md)
 - [CatalogsHotelItemsFilter](docs/CatalogsHotelItemsFilter.md)
 - [CatalogsHotelItemsPostFilter](docs/CatalogsHotelItemsPostFilter.md)
 - [CatalogsHotelListProductsByCatalogBasedFilterRequest](docs/CatalogsHotelListProductsByCatalogBasedFilterRequest.md)
 - [CatalogsHotelProduct](docs/CatalogsHotelProduct.md)
 - [CatalogsHotelProductGroup](docs/CatalogsHotelProductGroup.md)
 - [CatalogsHotelProductGroupCreateRequest](docs/CatalogsHotelProductGroupCreateRequest.md)
 - [CatalogsHotelProductGroupFilterKeys](docs/CatalogsHotelProductGroupFilterKeys.md)
 - [CatalogsHotelProductGroupFilters](docs/CatalogsHotelProductGroupFilters.md)
 - [CatalogsHotelProductGroupFiltersAllOf](docs/CatalogsHotelProductGroupFiltersAllOf.md)
 - [CatalogsHotelProductGroupFiltersAnyOf](docs/CatalogsHotelProductGroupFiltersAnyOf.md)
 - [CatalogsHotelProductGroupProductCounts](docs/CatalogsHotelProductGroupProductCounts.md)
 - [CatalogsHotelProductGroupUpdateRequest](docs/CatalogsHotelProductGroupUpdateRequest.md)
 - [CatalogsHotelProductMetadata](docs/CatalogsHotelProductMetadata.md)
 - [CatalogsHotelReportParameters](docs/CatalogsHotelReportParameters.md)
 - [CatalogsHotelReportParametersReport](docs/CatalogsHotelReportParametersReport.md)
 - [CatalogsItemValidationDetails](docs/CatalogsItemValidationDetails.md)
 - [CatalogsItemValidationErrors](docs/CatalogsItemValidationErrors.md)
 - [CatalogsItemValidationIssue](docs/CatalogsItemValidationIssue.md)
 - [CatalogsItemValidationIssues](docs/CatalogsItemValidationIssues.md)
 - [CatalogsItemValidationWarnings](docs/CatalogsItemValidationWarnings.md)
 - [CatalogsItems](docs/CatalogsItems.md)
 - [CatalogsItemsBatch](docs/CatalogsItemsBatch.md)
 - [CatalogsItemsBatchRequest](docs/CatalogsItemsBatchRequest.md)
 - [CatalogsItemsCreateBatchRequest](docs/CatalogsItemsCreateBatchRequest.md)
 - [CatalogsItemsDeleteBatchRequest](docs/CatalogsItemsDeleteBatchRequest.md)
 - [CatalogsItemsDeleteDiscontinuedBatchRequest](docs/CatalogsItemsDeleteDiscontinuedBatchRequest.md)
 - [CatalogsItemsFilters](docs/CatalogsItemsFilters.md)
 - [CatalogsItemsPostFilters](docs/CatalogsItemsPostFilters.md)
 - [CatalogsItemsRequest](docs/CatalogsItemsRequest.md)
 - [CatalogsItemsRequestLanguage](docs/CatalogsItemsRequestLanguage.md)
 - [CatalogsItemsUpdateBatchRequest](docs/CatalogsItemsUpdateBatchRequest.md)
 - [CatalogsItemsUpsertBatchRequest](docs/CatalogsItemsUpsertBatchRequest.md)
 - [CatalogsList200Response](docs/CatalogsList200Response.md)
 - [CatalogsListProductsByFeedBasedFilter](docs/CatalogsListProductsByFeedBasedFilter.md)
 - [CatalogsListProductsByFilterRequest](docs/CatalogsListProductsByFilterRequest.md)
 - [CatalogsLocale](docs/CatalogsLocale.md)
 - [CatalogsProduct](docs/CatalogsProduct.md)
 - [CatalogsProductGroupCreateRequest](docs/CatalogsProductGroupCreateRequest.md)
 - [CatalogsProductGroupCurrencyCriteria](docs/CatalogsProductGroupCurrencyCriteria.md)
 - [CatalogsProductGroupFilterKeys](docs/CatalogsProductGroupFilterKeys.md)
 - [CatalogsProductGroupFilters](docs/CatalogsProductGroupFilters.md)
 - [CatalogsProductGroupFiltersAllOf](docs/CatalogsProductGroupFiltersAllOf.md)
 - [CatalogsProductGroupFiltersAnyOf](docs/CatalogsProductGroupFiltersAnyOf.md)
 - [CatalogsProductGroupFiltersRequest](docs/CatalogsProductGroupFiltersRequest.md)
 - [CatalogsProductGroupFiltersRequestAnyOf](docs/CatalogsProductGroupFiltersRequestAnyOf.md)
 - [CatalogsProductGroupFiltersRequestAnyOf1](docs/CatalogsProductGroupFiltersRequestAnyOf1.md)
 - [CatalogsProductGroupMultipleCountriesCriteria](docs/CatalogsProductGroupMultipleCountriesCriteria.md)
 - [CatalogsProductGroupMultipleGenderCriteria](docs/CatalogsProductGroupMultipleGenderCriteria.md)
 - [CatalogsProductGroupMultipleMediaTypesCriteria](docs/CatalogsProductGroupMultipleMediaTypesCriteria.md)
 - [CatalogsProductGroupMultipleStringCriteria](docs/CatalogsProductGroupMultipleStringCriteria.md)
 - [CatalogsProductGroupMultipleStringListCriteria](docs/CatalogsProductGroupMultipleStringListCriteria.md)
 - [CatalogsProductGroupPinsList200Response](docs/CatalogsProductGroupPinsList200Response.md)
 - [CatalogsProductGroupPricingCriteria](docs/CatalogsProductGroupPricingCriteria.md)
 - [CatalogsProductGroupPricingCurrencyCriteria](docs/CatalogsProductGroupPricingCurrencyCriteria.md)
 - [CatalogsProductGroupProductCountsVertical](docs/CatalogsProductGroupProductCountsVertical.md)
 - [CatalogsProductGroupStatus](docs/CatalogsProductGroupStatus.md)
 - [CatalogsProductGroupType](docs/CatalogsProductGroupType.md)
 - [CatalogsProductGroupUpdateRequest](docs/CatalogsProductGroupUpdateRequest.md)
 - [CatalogsProductGroupsList200Response](docs/CatalogsProductGroupsList200Response.md)
 - [CatalogsProductGroupsUpdateRequest](docs/CatalogsProductGroupsUpdateRequest.md)
 - [CatalogsReport](docs/CatalogsReport.md)
 - [CatalogsReportDistributionIssueFilter](docs/CatalogsReportDistributionIssueFilter.md)
 - [CatalogsReportDistributionStats](docs/CatalogsReportDistributionStats.md)
 - [CatalogsReportFeedIngestionFilter](docs/CatalogsReportFeedIngestionFilter.md)
 - [CatalogsReportFeedIngestionStats](docs/CatalogsReportFeedIngestionStats.md)
 - [CatalogsReportParameters](docs/CatalogsReportParameters.md)
 - [CatalogsReportStats](docs/CatalogsReportStats.md)
 - [CatalogsRetailBatchRequest](docs/CatalogsRetailBatchRequest.md)
 - [CatalogsRetailBatchRequestItemsInner](docs/CatalogsRetailBatchRequestItemsInner.md)
 - [CatalogsRetailFeed](docs/CatalogsRetailFeed.md)
 - [CatalogsRetailFeedsCreateRequest](docs/CatalogsRetailFeedsCreateRequest.md)
 - [CatalogsRetailFeedsUpdateRequest](docs/CatalogsRetailFeedsUpdateRequest.md)
 - [CatalogsRetailItemErrorResponse](docs/CatalogsRetailItemErrorResponse.md)
 - [CatalogsRetailItemResponse](docs/CatalogsRetailItemResponse.md)
 - [CatalogsRetailItemsBatch](docs/CatalogsRetailItemsBatch.md)
 - [CatalogsRetailItemsFilter](docs/CatalogsRetailItemsFilter.md)
 - [CatalogsRetailItemsPostFilter](docs/CatalogsRetailItemsPostFilter.md)
 - [CatalogsRetailListProductsByCatalogBasedFilterRequest](docs/CatalogsRetailListProductsByCatalogBasedFilterRequest.md)
 - [CatalogsRetailProduct](docs/CatalogsRetailProduct.md)
 - [CatalogsRetailProductGroup](docs/CatalogsRetailProductGroup.md)
 - [CatalogsRetailProductGroupCreateRequest](docs/CatalogsRetailProductGroupCreateRequest.md)
 - [CatalogsRetailProductGroupProductCounts](docs/CatalogsRetailProductGroupProductCounts.md)
 - [CatalogsRetailProductGroupUpdateRequest](docs/CatalogsRetailProductGroupUpdateRequest.md)
 - [CatalogsRetailProductMetadata](docs/CatalogsRetailProductMetadata.md)
 - [CatalogsRetailReportParameters](docs/CatalogsRetailReportParameters.md)
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
 - [ConditionFilter](docs/ConditionFilter.md)
 - [ConversionApiResponse](docs/ConversionApiResponse.md)
 - [ConversionApiResponseEventsInner](docs/ConversionApiResponseEventsInner.md)
 - [ConversionAttributionWindowDays](docs/ConversionAttributionWindowDays.md)
 - [ConversionEventResponse](docs/ConversionEventResponse.md)
 - [ConversionEvents](docs/ConversionEvents.md)
 - [ConversionEventsDataInner](docs/ConversionEventsDataInner.md)
 - [ConversionEventsDataInnerCustomData](docs/ConversionEventsDataInnerCustomData.md)
 - [ConversionEventsDataInnerCustomDataContentsInner](docs/ConversionEventsDataInnerCustomDataContentsInner.md)
 - [ConversionEventsUserData](docs/ConversionEventsUserData.md)
 - [ConversionEventsUserDataAnyOf](docs/ConversionEventsUserDataAnyOf.md)
 - [ConversionEventsUserDataAnyOf1](docs/ConversionEventsUserDataAnyOf1.md)
 - [ConversionEventsUserDataAnyOf2](docs/ConversionEventsUserDataAnyOf2.md)
 - [ConversionReportAttributionType](docs/ConversionReportAttributionType.md)
 - [ConversionReportTimeType](docs/ConversionReportTimeType.md)
 - [ConversionTagCommon](docs/ConversionTagCommon.md)
 - [ConversionTagConfigs](docs/ConversionTagConfigs.md)
 - [ConversionTagCreate](docs/ConversionTagCreate.md)
 - [ConversionTagListResponse](docs/ConversionTagListResponse.md)
 - [ConversionTagResponse](docs/ConversionTagResponse.md)
 - [ConversionTagType](docs/ConversionTagType.md)
 - [Country](docs/Country.md)
 - [CountryFilter](docs/CountryFilter.md)
 - [CreateAssetAccessRequestBody](docs/CreateAssetAccessRequestBody.md)
 - [CreateAssetAccessRequestBodyAssetRequestsInner](docs/CreateAssetAccessRequestBodyAssetRequestsInner.md)
 - [CreateAssetAccessRequestErrorMessageInner](docs/CreateAssetAccessRequestErrorMessageInner.md)
 - [CreateAssetAccessRequestResponse](docs/CreateAssetAccessRequestResponse.md)
 - [CreateAssetGroupBody](docs/CreateAssetGroupBody.md)
 - [CreateAssetGroupResponse](docs/CreateAssetGroupResponse.md)
 - [CreateAssetInvitesRequest](docs/CreateAssetInvitesRequest.md)
 - [CreateAssetInvitesRequestItem](docs/CreateAssetInvitesRequestItem.md)
 - [CreateInvitesResultsResponseArray](docs/CreateInvitesResultsResponseArray.md)
 - [CreateInvitesResultsResponseArrayItemsInner](docs/CreateInvitesResultsResponseArrayItemsInner.md)
 - [CreateInvitesResultsResponseArrayItemsInnerInvite](docs/CreateInvitesResultsResponseArrayItemsInnerInvite.md)
 - [CreateMMMReportRequest](docs/CreateMMMReportRequest.md)
 - [CreateMMMReportResponse](docs/CreateMMMReportResponse.md)
 - [CreateMMMReportResponseData](docs/CreateMMMReportResponseData.md)
 - [CreateMembershipOrPartnershipInvitesBody](docs/CreateMembershipOrPartnershipInvitesBody.md)
 - [CreativeAssetsIdFilter](docs/CreativeAssetsIdFilter.md)
 - [CreativeAssetsProcessingRecord](docs/CreativeAssetsProcessingRecord.md)
 - [CreativeAssetsVisibilityType](docs/CreativeAssetsVisibilityType.md)
 - [CreativeType](docs/CreativeType.md)
 - [Currency](docs/Currency.md)
 - [CurrencyFilter](docs/CurrencyFilter.md)
 - [CustomLabel0Filter](docs/CustomLabel0Filter.md)
 - [CustomLabel1Filter](docs/CustomLabel1Filter.md)
 - [CustomLabel2Filter](docs/CustomLabel2Filter.md)
 - [CustomLabel3Filter](docs/CustomLabel3Filter.md)
 - [CustomLabel4Filter](docs/CustomLabel4Filter.md)
 - [CustomerList](docs/CustomerList.md)
 - [CustomerListRequest](docs/CustomerListRequest.md)
 - [CustomerListUpdateRequest](docs/CustomerListUpdateRequest.md)
 - [CustomerListsList200Response](docs/CustomerListsList200Response.md)
 - [DataOutputFormat](docs/DataOutputFormat.md)
 - [DataStatus](docs/DataStatus.md)
 - [DeleteAssetGroupBody](docs/DeleteAssetGroupBody.md)
 - [DeleteAssetGroupResponse](docs/DeleteAssetGroupResponse.md)
 - [DeleteAssetGroupResponseExceptionsInner](docs/DeleteAssetGroupResponseExceptionsInner.md)
 - [DeleteInvitesResultsResponseArray](docs/DeleteInvitesResultsResponseArray.md)
 - [DeleteInvitesResultsResponseArrayItemsInner](docs/DeleteInvitesResultsResponseArrayItemsInner.md)
 - [DeleteInvitesResultsResponseArrayItemsInnerException](docs/DeleteInvitesResultsResponseArrayItemsInnerException.md)
 - [DeleteMemberAccessResult](docs/DeleteMemberAccessResult.md)
 - [DeleteMemberAccessResultsResponseArray](docs/DeleteMemberAccessResultsResponseArray.md)
 - [DeletePartnerAssetAccessBody](docs/DeletePartnerAssetAccessBody.md)
 - [DeletePartnerAssetAccessBodyAccessesInner](docs/DeletePartnerAssetAccessBodyAccessesInner.md)
 - [DeletePartnerAssetsResult](docs/DeletePartnerAssetsResult.md)
 - [DeletePartnerAssetsResultsResponseArray](docs/DeletePartnerAssetsResultsResponseArray.md)
 - [DeletePartnersRequest](docs/DeletePartnersRequest.md)
 - [DeletePartnersResponse](docs/DeletePartnersResponse.md)
 - [DeletedMembersResponse](docs/DeletedMembersResponse.md)
 - [DeliveryMetricsResponse](docs/DeliveryMetricsResponse.md)
 - [DeliveryMetricsResponseItemsInner](docs/DeliveryMetricsResponseItemsInner.md)
 - [DetailedError](docs/DetailedError.md)
 - [EnhancedMatchStatusType](docs/EnhancedMatchStatusType.md)
 - [EntityStatus](docs/EntityStatus.md)
 - [Error](docs/Error.md)
 - [Exception](docs/Exception.md)
 - [FeedProcessingResultsList200Response](docs/FeedProcessingResultsList200Response.md)
 - [FeedsCreateRequest](docs/FeedsCreateRequest.md)
 - [FeedsList200Response](docs/FeedsList200Response.md)
 - [FeedsUpdateRequest](docs/FeedsUpdateRequest.md)
 - [FollowUserRequest](docs/FollowUserRequest.md)
 - [FollowersList200Response](docs/FollowersList200Response.md)
 - [Gender](docs/Gender.md)
 - [GenderFilter](docs/GenderFilter.md)
 - [GetAudiencesOrderBy](docs/GetAudiencesOrderBy.md)
 - [GetBusinessAssetTypeResponse](docs/GetBusinessAssetTypeResponse.md)
 - [GetBusinessAssetsResponse](docs/GetBusinessAssetsResponse.md)
 - [GetBusinessEmployers200Response](docs/GetBusinessEmployers200Response.md)
 - [GetBusinessMembers200Response](docs/GetBusinessMembers200Response.md)
 - [GetBusinessPartners200Response](docs/GetBusinessPartners200Response.md)
 - [GetInvites200Response](docs/GetInvites200Response.md)
 - [GetMMMReportResponse](docs/GetMMMReportResponse.md)
 - [GetMMMReportResponseData](docs/GetMMMReportResponseData.md)
 - [GetPartnerAssetsResponse](docs/GetPartnerAssetsResponse.md)
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
 - [ImageDetails](docs/ImageDetails.md)
 - [ImageMetadata](docs/ImageMetadata.md)
 - [ImageMetadataImages](docs/ImageMetadataImages.md)
 - [IntegrationLog](docs/IntegrationLog.md)
 - [IntegrationLogClientError](docs/IntegrationLogClientError.md)
 - [IntegrationLogClientRequest](docs/IntegrationLogClientRequest.md)
 - [IntegrationLogsInvalidLogResponse](docs/IntegrationLogsInvalidLogResponse.md)
 - [IntegrationLogsInvalidLogResponseRejectedLogsInner](docs/IntegrationLogsInvalidLogResponseRejectedLogsInner.md)
 - [IntegrationLogsRequest](docs/IntegrationLogsRequest.md)
 - [IntegrationLogsSuccessResponse](docs/IntegrationLogsSuccessResponse.md)
 - [IntegrationMetadata](docs/IntegrationMetadata.md)
 - [IntegrationRecord](docs/IntegrationRecord.md)
 - [IntegrationRequest](docs/IntegrationRequest.md)
 - [IntegrationRequestPatch](docs/IntegrationRequestPatch.md)
 - [IntegrationsGetList200Response](docs/IntegrationsGetList200Response.md)
 - [Interest](docs/Interest.md)
 - [InviteAssetsSummary](docs/InviteAssetsSummary.md)
 - [InviteAssetsSummaryAdAccountsInner](docs/InviteAssetsSummaryAdAccountsInner.md)
 - [InviteAssetsSummaryProfilesInner](docs/InviteAssetsSummaryProfilesInner.md)
 - [InviteBusinessRoleBinding](docs/InviteBusinessRoleBinding.md)
 - [InviteExceptionResponse](docs/InviteExceptionResponse.md)
 - [InviteResponse](docs/InviteResponse.md)
 - [InviteStatus](docs/InviteStatus.md)
 - [InviteType](docs/InviteType.md)
 - [ItemAttributes](docs/ItemAttributes.md)
 - [ItemAttributesRequest](docs/ItemAttributesRequest.md)
 - [ItemAttributesRequestAllOfImageLink](docs/ItemAttributesRequestAllOfImageLink.md)
 - [ItemBatchRecord](docs/ItemBatchRecord.md)
 - [ItemCreateBatchRecord](docs/ItemCreateBatchRecord.md)
 - [ItemDeleteBatchRecord](docs/ItemDeleteBatchRecord.md)
 - [ItemDeleteDiscontinuedBatchRecord](docs/ItemDeleteDiscontinuedBatchRecord.md)
 - [ItemGroupIdFilter](docs/ItemGroupIdFilter.md)
 - [ItemIdFilter](docs/ItemIdFilter.md)
 - [ItemProcessingRecord](docs/ItemProcessingRecord.md)
 - [ItemProcessingStatus](docs/ItemProcessingStatus.md)
 - [ItemResponse](docs/ItemResponse.md)
 - [ItemResponseAnyOf](docs/ItemResponseAnyOf.md)
 - [ItemResponseAnyOf1](docs/ItemResponseAnyOf1.md)
 - [ItemUpdateBatchRecord](docs/ItemUpdateBatchRecord.md)
 - [ItemUpsertBatchRecord](docs/ItemUpsertBatchRecord.md)
 - [ItemValidationEvent](docs/ItemValidationEvent.md)
 - [ItemsBatchPostRequest](docs/ItemsBatchPostRequest.md)
 - [ItemsIssuesList200Response](docs/ItemsIssuesList200Response.md)
 - [Keyword](docs/Keyword.md)
 - [KeywordError](docs/KeywordError.md)
 - [KeywordMetrics](docs/KeywordMetrics.md)
 - [KeywordMetricsResponse](docs/KeywordMetricsResponse.md)
 - [KeywordUpdate](docs/KeywordUpdate.md)
 - [KeywordUpdateBody](docs/KeywordUpdateBody.md)
 - [KeywordsCommon](docs/KeywordsCommon.md)
 - [KeywordsGet200Response](docs/KeywordsGet200Response.md)
 - [KeywordsMetricsArrayResponse](docs/KeywordsMetricsArrayResponse.md)
 - [KeywordsRequest](docs/KeywordsRequest.md)
 - [KeywordsResponse](docs/KeywordsResponse.md)
 - [Language](docs/Language.md)
 - [LeadFormArrayResponse](docs/LeadFormArrayResponse.md)
 - [LeadFormArrayResponseItemsInner](docs/LeadFormArrayResponseItemsInner.md)
 - [LeadFormCommon](docs/LeadFormCommon.md)
 - [LeadFormCommonPolicyLinksInner](docs/LeadFormCommonPolicyLinksInner.md)
 - [LeadFormCreateRequest](docs/LeadFormCreateRequest.md)
 - [LeadFormQuestion](docs/LeadFormQuestion.md)
 - [LeadFormQuestionFieldType](docs/LeadFormQuestionFieldType.md)
 - [LeadFormQuestionType](docs/LeadFormQuestionType.md)
 - [LeadFormResponse](docs/LeadFormResponse.md)
 - [LeadFormStatus](docs/LeadFormStatus.md)
 - [LeadFormTestRequest](docs/LeadFormTestRequest.md)
 - [LeadFormTestResponse](docs/LeadFormTestResponse.md)
 - [LeadFormUpdateRequest](docs/LeadFormUpdateRequest.md)
 - [LeadFormsList200Response](docs/LeadFormsList200Response.md)
 - [LeadsExportCreateRequest](docs/LeadsExportCreateRequest.md)
 - [LeadsExportCreateResponse](docs/LeadsExportCreateResponse.md)
 - [LeadsExportResponseData](docs/LeadsExportResponseData.md)
 - [LeadsExportStatus](docs/LeadsExportStatus.md)
 - [LineItem](docs/LineItem.md)
 - [LinkedBusiness](docs/LinkedBusiness.md)
 - [MMMReportingColumn](docs/MMMReportingColumn.md)
 - [MMMReportingTargetingType](docs/MMMReportingTargetingType.md)
 - [MatchType](docs/MatchType.md)
 - [MatchTypeResponse](docs/MatchTypeResponse.md)
 - [MaxPriceFilter](docs/MaxPriceFilter.md)
 - [MediaList200Response](docs/MediaList200Response.md)
 - [MediaType](docs/MediaType.md)
 - [MediaTypeFilter](docs/MediaTypeFilter.md)
 - [MediaUpload](docs/MediaUpload.md)
 - [MediaUploadAllOfUploadParameters](docs/MediaUploadAllOfUploadParameters.md)
 - [MediaUploadDetails](docs/MediaUploadDetails.md)
 - [MediaUploadRequest](docs/MediaUploadRequest.md)
 - [MediaUploadStatus](docs/MediaUploadStatus.md)
 - [MediaUploadType](docs/MediaUploadType.md)
 - [MemberBusinessRole](docs/MemberBusinessRole.md)
 - [MembersToDeleteBody](docs/MembersToDeleteBody.md)
 - [MembersToDeleteBodyMembersInner](docs/MembersToDeleteBodyMembersInner.md)
 - [MetricsReportingLevel](docs/MetricsReportingLevel.md)
 - [MetricsResponse](docs/MetricsResponse.md)
 - [MinPriceFilter](docs/MinPriceFilter.md)
 - [MultipleProductGroupsInner](docs/MultipleProductGroupsInner.md)
 - [NonNullableCatalogsCurrency](docs/NonNullableCatalogsCurrency.md)
 - [NonNullableProductAvailabilityType](docs/NonNullableProductAvailabilityType.md)
 - [NullableCatalogsItemFieldType](docs/NullableCatalogsItemFieldType.md)
 - [NullableCurrency](docs/NullableCurrency.md)
 - [OauthAccessTokenRequestClientCredentials](docs/OauthAccessTokenRequestClientCredentials.md)
 - [OauthAccessTokenRequestCode](docs/OauthAccessTokenRequestCode.md)
 - [OauthAccessTokenRequestRefresh](docs/OauthAccessTokenRequestRefresh.md)
 - [OauthAccessTokenResponse](docs/OauthAccessTokenResponse.md)
 - [OauthAccessTokenResponseClientCredentials](docs/OauthAccessTokenResponseClientCredentials.md)
 - [OauthAccessTokenResponseCode](docs/OauthAccessTokenResponseCode.md)
 - [OauthAccessTokenResponseEverlastingRefresh](docs/OauthAccessTokenResponseEverlastingRefresh.md)
 - [OauthAccessTokenResponseIntegrationRefresh](docs/OauthAccessTokenResponseIntegrationRefresh.md)
 - [OauthAccessTokenResponseRefresh](docs/OauthAccessTokenResponseRefresh.md)
 - [ObjectiveType](docs/ObjectiveType.md)
 - [OperationType](docs/OperationType.md)
 - [OptimizationGoalMetadata](docs/OptimizationGoalMetadata.md)
 - [OptimizationGoalMetadataConversionTagV3GoalMetadata](docs/OptimizationGoalMetadataConversionTagV3GoalMetadata.md)
 - [OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows](docs/OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows.md)
 - [OptimizationGoalMetadataFrequencyGoalMetadata](docs/OptimizationGoalMetadataFrequencyGoalMetadata.md)
 - [OptimizationGoalMetadataScrollupGoalMetadata](docs/OptimizationGoalMetadataScrollupGoalMetadata.md)
 - [OrderLine](docs/OrderLine.md)
 - [OrderLineError](docs/OrderLineError.md)
 - [OrderLinePaidType](docs/OrderLinePaidType.md)
 - [OrderLineResponse](docs/OrderLineResponse.md)
 - [OrderLineSingleResponse](docs/OrderLineSingleResponse.md)
 - [OrderLineStatus](docs/OrderLineStatus.md)
 - [OrderLines](docs/OrderLines.md)
 - [OrderLinesArrayResponse](docs/OrderLinesArrayResponse.md)
 - [OrderLinesList200Response](docs/OrderLinesList200Response.md)
 - [PacingDeliveryType](docs/PacingDeliveryType.md)
 - [PageVisitConversionTagsGet200Response](docs/PageVisitConversionTagsGet200Response.md)
 - [Paginated](docs/Paginated.md)
 - [PartnerType](docs/PartnerType.md)
 - [Permissions](docs/Permissions.md)
 - [PermissionsWithOwner](docs/PermissionsWithOwner.md)
 - [Pin](docs/Pin.md)
 - [PinAnalyticsMetricsResponse](docs/PinAnalyticsMetricsResponse.md)
 - [PinAnalyticsMetricsResponseDailyMetricsInner](docs/PinAnalyticsMetricsResponseDailyMetricsInner.md)
 - [PinCreate](docs/PinCreate.md)
 - [PinMedia](docs/PinMedia.md)
 - [PinMediaMetadata](docs/PinMediaMetadata.md)
 - [PinMediaSource](docs/PinMediaSource.md)
 - [PinMediaSourceImageBase64](docs/PinMediaSourceImageBase64.md)
 - [PinMediaSourceImageURL](docs/PinMediaSourceImageURL.md)
 - [PinMediaSourceImagesBase64](docs/PinMediaSourceImagesBase64.md)
 - [PinMediaSourceImagesBase64ItemsInner](docs/PinMediaSourceImagesBase64ItemsInner.md)
 - [PinMediaSourceImagesURL](docs/PinMediaSourceImagesURL.md)
 - [PinMediaSourceImagesURLItemsInner](docs/PinMediaSourceImagesURLItemsInner.md)
 - [PinMediaSourcePinURL](docs/PinMediaSourcePinURL.md)
 - [PinMediaSourceVideoID](docs/PinMediaSourceVideoID.md)
 - [PinMediaWithImage](docs/PinMediaWithImage.md)
 - [PinMediaWithImageAllOfImages](docs/PinMediaWithImageAllOfImages.md)
 - [PinMediaWithImageAndVideo](docs/PinMediaWithImageAndVideo.md)
 - [PinMediaWithImages](docs/PinMediaWithImages.md)
 - [PinMediaWithVideo](docs/PinMediaWithVideo.md)
 - [PinMediaWithVideos](docs/PinMediaWithVideos.md)
 - [PinPromotionSummaryStatus](docs/PinPromotionSummaryStatus.md)
 - [PinUpdate](docs/PinUpdate.md)
 - [PinUpdateCarouselSlotsInner](docs/PinUpdateCarouselSlotsInner.md)
 - [PinsAnalyticsMetricTypesParameterInner](docs/PinsAnalyticsMetricTypesParameterInner.md)
 - [PinsList200Response](docs/PinsList200Response.md)
 - [PinsSaveRequest](docs/PinsSaveRequest.md)
 - [PinterestTagEventData](docs/PinterestTagEventData.md)
 - [PlacementGroupType](docs/PlacementGroupType.md)
 - [PlacementMultipliers](docs/PlacementMultipliers.md)
 - [PriceFilter](docs/PriceFilter.md)
 - [ProductAvailabilityType](docs/ProductAvailabilityType.md)
 - [ProductGroupAnalyticsResponseInner](docs/ProductGroupAnalyticsResponseInner.md)
 - [ProductGroupPromotion](docs/ProductGroupPromotion.md)
 - [ProductGroupPromotionCreateRequest](docs/ProductGroupPromotionCreateRequest.md)
 - [ProductGroupPromotionCreateRequestElement](docs/ProductGroupPromotionCreateRequestElement.md)
 - [ProductGroupPromotionResponse](docs/ProductGroupPromotionResponse.md)
 - [ProductGroupPromotionResponseElement](docs/ProductGroupPromotionResponseElement.md)
 - [ProductGroupPromotionResponseItem](docs/ProductGroupPromotionResponseItem.md)
 - [ProductGroupPromotionUpdateRequest](docs/ProductGroupPromotionUpdateRequest.md)
 - [ProductGroupPromotionsList200Response](docs/ProductGroupPromotionsList200Response.md)
 - [ProductGroupReferenceFilter](docs/ProductGroupReferenceFilter.md)
 - [ProductGroupSummaryStatus](docs/ProductGroupSummaryStatus.md)
 - [ProductType0Filter](docs/ProductType0Filter.md)
 - [ProductType1Filter](docs/ProductType1Filter.md)
 - [ProductType2Filter](docs/ProductType2Filter.md)
 - [ProductType3Filter](docs/ProductType3Filter.md)
 - [ProductType4Filter](docs/ProductType4Filter.md)
 - [QuizPinData](docs/QuizPinData.md)
 - [QuizPinOption](docs/QuizPinOption.md)
 - [QuizPinQuestion](docs/QuizPinQuestion.md)
 - [QuizPinResult](docs/QuizPinResult.md)
 - [RelatedTerms](docs/RelatedTerms.md)
 - [RelatedTermsRelatedTermsListInner](docs/RelatedTermsRelatedTermsListInner.md)
 - [ReportingColumnAsync](docs/ReportingColumnAsync.md)
 - [ReportsStats200Response](docs/ReportsStats200Response.md)
 - [RespondToInvitesResponseArray](docs/RespondToInvitesResponseArray.md)
 - [RespondToInvitesResponseArrayItemsInner](docs/RespondToInvitesResponseArrayItemsInner.md)
 - [Role](docs/Role.md)
 - [SSIOAccountAddress](docs/SSIOAccountAddress.md)
 - [SSIOAccountItem](docs/SSIOAccountItem.md)
 - [SSIOAccountPMPName](docs/SSIOAccountPMPName.md)
 - [SSIOAccountResponse](docs/SSIOAccountResponse.md)
 - [SSIOCreateInsertionOrderRequest](docs/SSIOCreateInsertionOrderRequest.md)
 - [SSIOCreateInsertionOrderResponse](docs/SSIOCreateInsertionOrderResponse.md)
 - [SSIOEditInsertionOrderRequest](docs/SSIOEditInsertionOrderRequest.md)
 - [SSIOEditInsertionOrderResponse](docs/SSIOEditInsertionOrderResponse.md)
 - [SSIOInsertionOrderCommon](docs/SSIOInsertionOrderCommon.md)
 - [SSIOInsertionOrderStatus](docs/SSIOInsertionOrderStatus.md)
 - [SSIOInsertionOrderStatusResponse](docs/SSIOInsertionOrderStatusResponse.md)
 - [SSIOOrderLine](docs/SSIOOrderLine.md)
 - [SearchPartnerPins200Response](docs/SearchPartnerPins200Response.md)
 - [SearchUserBoardsGet200Response](docs/SearchUserBoardsGet200Response.md)
 - [SharedAudience](docs/SharedAudience.md)
 - [SharedAudienceAccount](docs/SharedAudienceAccount.md)
 - [SharedAudienceCommon](docs/SharedAudienceCommon.md)
 - [SharedAudienceResponse](docs/SharedAudienceResponse.md)
 - [SharedAudienceResponseCommon](docs/SharedAudienceResponseCommon.md)
 - [SingleInterestTargetingOptionResponse](docs/SingleInterestTargetingOptionResponse.md)
 - [SsioInsertionOrdersStatusGetByAdAccount200Response](docs/SsioInsertionOrdersStatusGetByAdAccount200Response.md)
 - [SsioOrderLinesGetByAdAccount200Response](docs/SsioOrderLinesGetByAdAccount200Response.md)
 - [SummaryPin](docs/SummaryPin.md)
 - [TargetingAdvertiserCountry](docs/TargetingAdvertiserCountry.md)
 - [TargetingSpec](docs/TargetingSpec.md)
 - [TargetingSpecAppType](docs/TargetingSpecAppType.md)
 - [TargetingSpecSHOPPINGRETARGETING](docs/TargetingSpecSHOPPINGRETARGETING.md)
 - [TargetingTemplateAudienceSizing](docs/TargetingTemplateAudienceSizing.md)
 - [TargetingTemplateAudienceSizingReachEstimate](docs/TargetingTemplateAudienceSizingReachEstimate.md)
 - [TargetingTemplateCommon](docs/TargetingTemplateCommon.md)
 - [TargetingTemplateCreate](docs/TargetingTemplateCreate.md)
 - [TargetingTemplateGetResponseData](docs/TargetingTemplateGetResponseData.md)
 - [TargetingTemplateKeyword](docs/TargetingTemplateKeyword.md)
 - [TargetingTemplateList200Response](docs/TargetingTemplateList200Response.md)
 - [TargetingTemplateResponseData](docs/TargetingTemplateResponseData.md)
 - [TargetingTemplateUpdateRequest](docs/TargetingTemplateUpdateRequest.md)
 - [TargetingTypeFilter](docs/TargetingTypeFilter.md)
 - [TemplateResponse](docs/TemplateResponse.md)
 - [TemplateResponseDateRange](docs/TemplateResponseDateRange.md)
 - [TemplateResponseDateRangeAbsoluteDateRange](docs/TemplateResponseDateRangeAbsoluteDateRange.md)
 - [TemplateResponseDateRangeDynamicDateRange](docs/TemplateResponseDateRangeDynamicDateRange.md)
 - [TemplateResponseDateRangeRelativeDateRange](docs/TemplateResponseDateRangeRelativeDateRange.md)
 - [TemplatesList200Response](docs/TemplatesList200Response.md)
 - [TermsOfService](docs/TermsOfService.md)
 - [TopPinsAnalyticsResponse](docs/TopPinsAnalyticsResponse.md)
 - [TopPinsAnalyticsResponseDateAvailability](docs/TopPinsAnalyticsResponseDateAvailability.md)
 - [TopPinsAnalyticsResponsePinsInner](docs/TopPinsAnalyticsResponsePinsInner.md)
 - [TopVideoPinsAnalyticsResponse](docs/TopVideoPinsAnalyticsResponse.md)
 - [TopVideoPinsAnalyticsResponsePinsInner](docs/TopVideoPinsAnalyticsResponsePinsInner.md)
 - [TrackingUrls](docs/TrackingUrls.md)
 - [TrendType](docs/TrendType.md)
 - [TrendingKeywordsResponse](docs/TrendingKeywordsResponse.md)
 - [TrendingKeywordsResponseTrendsInner](docs/TrendingKeywordsResponseTrendsInner.md)
 - [TrendingKeywordsResponseTrendsInnerTimeSeries](docs/TrendingKeywordsResponseTrendsInnerTimeSeries.md)
 - [TrendsSupportedRegion](docs/TrendsSupportedRegion.md)
 - [UpdatableItemAttributes](docs/UpdatableItemAttributes.md)
 - [UpdateAssetGroupBody](docs/UpdateAssetGroupBody.md)
 - [UpdateAssetGroupBodyAssetGroupsToUpdateInner](docs/UpdateAssetGroupBodyAssetGroupsToUpdateInner.md)
 - [UpdateAssetGroupResponse](docs/UpdateAssetGroupResponse.md)
 - [UpdateAssetGroupResponseExceptionsInner](docs/UpdateAssetGroupResponseExceptionsInner.md)
 - [UpdateInvitesResultsResponseArray](docs/UpdateInvitesResultsResponseArray.md)
 - [UpdateInvitesResultsResponseArrayItemsInner](docs/UpdateInvitesResultsResponseArrayItemsInner.md)
 - [UpdateMaskBidOptionField](docs/UpdateMaskBidOptionField.md)
 - [UpdateMaskFieldType](docs/UpdateMaskFieldType.md)
 - [UpdateMemberAssetAccessBody](docs/UpdateMemberAssetAccessBody.md)
 - [UpdateMemberAssetAccessBodyAccessesInner](docs/UpdateMemberAssetAccessBodyAccessesInner.md)
 - [UpdateMemberAssetsResultsResponseArray](docs/UpdateMemberAssetsResultsResponseArray.md)
 - [UpdateMemberAssetsResultsResponseArrayItemsInner](docs/UpdateMemberAssetsResultsResponseArrayItemsInner.md)
 - [UpdateMemberBusinessRoleBody](docs/UpdateMemberBusinessRoleBody.md)
 - [UpdateMemberResult](docs/UpdateMemberResult.md)
 - [UpdateMemberResultsResponseArray](docs/UpdateMemberResultsResponseArray.md)
 - [UpdatePartnerAssetAccessBody](docs/UpdatePartnerAssetAccessBody.md)
 - [UpdatePartnerAssetAccessBodyAccessesInner](docs/UpdatePartnerAssetAccessBodyAccessesInner.md)
 - [UpdatePartnerAssetsResult](docs/UpdatePartnerAssetsResult.md)
 - [UpdatePartnerAssetsResultsResponseArray](docs/UpdatePartnerAssetsResultsResponseArray.md)
 - [UpdatePartnerResultsResponseArray](docs/UpdatePartnerResultsResponseArray.md)
 - [UpdatePartnerResultsResponseArrayItemsInner](docs/UpdatePartnerResultsResponseArrayItemsInner.md)
 - [UserAccountFollowedInterests200Response](docs/UserAccountFollowedInterests200Response.md)
 - [UserBusinessRoleBinding](docs/UserBusinessRoleBinding.md)
 - [UserFollowingFeedType](docs/UserFollowingFeedType.md)
 - [UserFollowingGet200Response](docs/UserFollowingGet200Response.md)
 - [UserListOperationType](docs/UserListOperationType.md)
 - [UserListType](docs/UserListType.md)
 - [UserSingleAssetBinding](docs/UserSingleAssetBinding.md)
 - [UserSummary](docs/UserSummary.md)
 - [UserWebsiteSummary](docs/UserWebsiteSummary.md)
 - [UserWebsiteVerificationCode](docs/UserWebsiteVerificationCode.md)
 - [UserWebsiteVerifyRequest](docs/UserWebsiteVerifyRequest.md)
 - [UserWebsitesGet200Response](docs/UserWebsitesGet200Response.md)
 - [UsersForIndividualAssetResponse](docs/UsersForIndividualAssetResponse.md)
 - [VideoMetadata](docs/VideoMetadata.md)


## Documentation For Authorization


## pinterest_oauth2


- **Type**: OAuth
- **Flow**: accessCode
- **Authorization URL**: https://www.pinterest.com/oauth/
- **Token URL**: https://api.pinterest.com/v5/oauth/token
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

## conversion_token


- **Type**: HTTP Bearer Token authentication

## basic


- **Type**: HTTP basic authentication

## client_credentials


- **Type**: OAuth
- **Flow**: application
- **Token URL**: https://api.pinterest.com/v3/oauth/access_token/
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

