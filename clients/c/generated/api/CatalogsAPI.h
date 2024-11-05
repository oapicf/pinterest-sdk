#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/catalog.h"
#include "../model/catalogs_create_report_response.h"
#include "../model/catalogs_create_request.h"
#include "../model/catalogs_feed.h"
#include "../model/catalogs_feed_ingestion.h"
#include "../model/catalogs_item_validation_issue.h"
#include "../model/catalogs_items.h"
#include "../model/catalogs_items_batch.h"
#include "../model/catalogs_items_filters.h"
#include "../model/catalogs_items_request.h"
#include "../model/catalogs_list_200_response.h"
#include "../model/catalogs_list_products_by_filter_request.h"
#include "../model/catalogs_product_group_pins_list_200_response.h"
#include "../model/catalogs_product_group_product_counts_vertical.h"
#include "../model/catalogs_product_groups_list_200_response.h"
#include "../model/catalogs_product_groups_update_request.h"
#include "../model/catalogs_report.h"
#include "../model/catalogs_report_parameters.h"
#include "../model/catalogs_vertical_product_group.h"
#include "../model/error.h"
#include "../model/feed_processing_results_list_200_response.h"
#include "../model/feeds_create_request.h"
#include "../model/feeds_list_200_response.h"
#include "../model/feeds_update_request.h"
#include "../model/items_batch_post_request.h"
#include "../model/items_issues_list_200_response.h"
#include "../model/multiple_product_groups_inner.h"
#include "../model/reports_stats_200_response.h"

// Enum  for CatalogsAPI_itemsIssuesList
typedef enum  { pinterest_rest_api_itemsIssuesList__NULL = 0, pinterest_rest_api_itemsIssuesList__AD_LINK_FORMAT_WARNING, pinterest_rest_api_itemsIssuesList__AD_LINK_SAME_AS_LINK, pinterest_rest_api_itemsIssuesList__ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG, pinterest_rest_api_itemsIssuesList__ADDITIONAL_IMAGE_LINK_WARNING, pinterest_rest_api_itemsIssuesList__ADULT_INVALID, pinterest_rest_api_itemsIssuesList__ADWORDS_FORMAT_INVALID, pinterest_rest_api_itemsIssuesList__ADWORDS_FORMAT_WARNING, pinterest_rest_api_itemsIssuesList__ADWORDS_SAME_AS_LINK, pinterest_rest_api_itemsIssuesList__AGE_GROUP_INVALID, pinterest_rest_api_itemsIssuesList__ANDROID_DEEP_LINK_INVALID, pinterest_rest_api_itemsIssuesList__AVAILABILITY_DATE_INVALID, pinterest_rest_api_itemsIssuesList__AVAILABILITY_INVALID, pinterest_rest_api_itemsIssuesList__BLOCKLISTED_IMAGE_SIGNATURE, pinterest_rest_api_itemsIssuesList__COUNTRY_DOES_NOT_MAP_TO_CURRENCY, pinterest_rest_api_itemsIssuesList__CUSTOM_LABEL_LENGTH_TOO_LONG, pinterest_rest_api_itemsIssuesList__DESCRIPTION_LENGTH_TOO_LONG, pinterest_rest_api_itemsIssuesList__DESCRIPTION_MISSING, pinterest_rest_api_itemsIssuesList__DUPLICATE_PRODUCTS, pinterest_rest_api_itemsIssuesList__EXPIRATION_DATE_INVALID, pinterest_rest_api_itemsIssuesList__GENDER_INVALID, pinterest_rest_api_itemsIssuesList__GTIN_INVALID, pinterest_rest_api_itemsIssuesList__IMAGE_LINK_INVALID, pinterest_rest_api_itemsIssuesList__IMAGE_LINK_LENGTH_TOO_LONG, pinterest_rest_api_itemsIssuesList__IMAGE_LINK_MISSING, pinterest_rest_api_itemsIssuesList__IMAGE_LINK_WARNING, pinterest_rest_api_itemsIssuesList__INVALID_DOMAIN, pinterest_rest_api_itemsIssuesList__IOS_DEEP_LINK_INVALID, pinterest_rest_api_itemsIssuesList__IS_BUNDLE_INVALID, pinterest_rest_api_itemsIssuesList__ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE, pinterest_rest_api_itemsIssuesList__ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE, pinterest_rest_api_itemsIssuesList__ITEMID_MISSING, pinterest_rest_api_itemsIssuesList__LINK_FORMAT_INVALID, pinterest_rest_api_itemsIssuesList__LINK_FORMAT_WARNING, pinterest_rest_api_itemsIssuesList__LINK_LENGTH_TOO_LONG, pinterest_rest_api_itemsIssuesList__LIST_PRICE_INVALID, pinterest_rest_api_itemsIssuesList__MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED, pinterest_rest_api_itemsIssuesList__MIN_AD_PRICE_INVALID, pinterest_rest_api_itemsIssuesList__MPN_INVALID, pinterest_rest_api_itemsIssuesList__MULTIPACK_INVALID, pinterest_rest_api_itemsIssuesList__OPTIONAL_CONDITION_INVALID, pinterest_rest_api_itemsIssuesList__OPTIONAL_CONDITION_MISSING, pinterest_rest_api_itemsIssuesList__OPTIONAL_PRODUCT_CATEGORY_INVALID, pinterest_rest_api_itemsIssuesList__OPTIONAL_PRODUCT_CATEGORY_MISSING, pinterest_rest_api_itemsIssuesList__PARSE_LINE_ERROR, pinterest_rest_api_itemsIssuesList__PINJOIN_CONTENT_UNSAFE, pinterest_rest_api_itemsIssuesList__PRICE_CANNOT_BE_DETERMINED, pinterest_rest_api_itemsIssuesList__PRICE_MISSING, pinterest_rest_api_itemsIssuesList__PRODUCT_CATEGORY_DEPTH_WARNING, pinterest_rest_api_itemsIssuesList__PRODUCT_LINK_MISSING, pinterest_rest_api_itemsIssuesList__PRODUCT_PRICE_INVALID, pinterest_rest_api_itemsIssuesList__PRODUCT_TYPE_LENGTH_TOO_LONG, pinterest_rest_api_itemsIssuesList__SALE_DATE_INVALID, pinterest_rest_api_itemsIssuesList__SALES_PRICE_INVALID, pinterest_rest_api_itemsIssuesList__SALES_PRICE_TOO_HIGH, pinterest_rest_api_itemsIssuesList__SALES_PRICE_TOO_LOW, pinterest_rest_api_itemsIssuesList__SHIPPING_INVALID, pinterest_rest_api_itemsIssuesList__SHIPPING_HEIGHT_INVALID, pinterest_rest_api_itemsIssuesList__SHIPPING_WEIGHT_INVALID, pinterest_rest_api_itemsIssuesList__SHIPPING_WIDTH_INVALID, pinterest_rest_api_itemsIssuesList__SIZE_SYSTEM_INVALID, pinterest_rest_api_itemsIssuesList__SIZE_TYPE_INVALID, pinterest_rest_api_itemsIssuesList__TAX_INVALID, pinterest_rest_api_itemsIssuesList__TITLE_LENGTH_TOO_LONG, pinterest_rest_api_itemsIssuesList__TITLE_MISSING, pinterest_rest_api_itemsIssuesList__TOO_MANY_ADDITIONAL_IMAGE_LINKS, pinterest_rest_api_itemsIssuesList__UTM_SOURCE_AUTO_CORRECTED, pinterest_rest_api_itemsIssuesList__WEIGHT_UNIT_INVALID } pinterest_rest_api_itemsIssuesList_item_validation_issue_e;


// Create catalog
//
// Create a new catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>  Note: this API only supports the catalog type of HOTEL for now.
//
catalog_t*
CatalogsAPI_catalogsCreate(apiClient_t *apiClient, catalogs_create_request_t *catalogs_create_request, char *ad_account_id);


// List catalogs
//
// Fetch catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>
//
catalogs_list_200_response_t*
CatalogsAPI_catalogsList(apiClient_t *apiClient, char *bookmark, int *page_size, char *ad_account_id);


// List products by product group
//
// Get a list of product pins for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>
//
catalogs_product_group_pins_list_200_response_t*
CatalogsAPI_catalogsProductGroupPinsList(apiClient_t *apiClient, char *product_group_id, char *bookmark, int *page_size, char *ad_account_id, int *pin_metrics);


// Create product group
//
// Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
//
catalogs_vertical_product_group_t*
CatalogsAPI_catalogsProductGroupsCreate(apiClient_t *apiClient, multiple_product_groups_inner_t *multiple_product_groups_inner, char *ad_account_id);


// Create product groups
//
// Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
//
list_t*
CatalogsAPI_catalogsProductGroupsCreateMany(apiClient_t *apiClient, list_t *multiple_product_groups_inner, char *ad_account_id);


// Delete product group
//
// Delete a product group owned by the \"operation user_account\" from being in use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>
//
void
CatalogsAPI_catalogsProductGroupsDelete(apiClient_t *apiClient, char *product_group_id, char *ad_account_id);


// Delete product groups
//
// Delete product groups owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>
//
void
CatalogsAPI_catalogsProductGroupsDeleteMany(apiClient_t *apiClient, list_t *id, char *ad_account_id);


// Get product group
//
// Get a singe product group for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>
//
catalogs_vertical_product_group_t*
CatalogsAPI_catalogsProductGroupsGet(apiClient_t *apiClient, char *product_group_id, char *ad_account_id);


// List product groups
//
// Get a list of product groups for a given Catalogs Feed Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>
//
catalogs_product_groups_list_200_response_t*
CatalogsAPI_catalogsProductGroupsList(apiClient_t *apiClient, list_t *id, char *feed_id, char *catalog_id, char *bookmark, int *page_size, char *ad_account_id);


// Get product counts
//
// Get a product counts for a given Catalogs Product Group owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>
//
catalogs_product_group_product_counts_vertical_t*
CatalogsAPI_catalogsProductGroupsProductCountsGet(apiClient_t *apiClient, char *product_group_id, char *ad_account_id);


// Update single product group
//
// Update product group owned by the \"operation user_account\" to use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
//
catalogs_vertical_product_group_t*
CatalogsAPI_catalogsProductGroupsUpdate(apiClient_t *apiClient, char *product_group_id, catalogs_product_groups_update_request_t *catalogs_product_groups_update_request, char *ad_account_id);


// List feed processing results
//
// Fetch a feed processing results owned by the \"operation user_account\". Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>
//
feed_processing_results_list_200_response_t*
CatalogsAPI_feedProcessingResultsList(apiClient_t *apiClient, char *feed_id, char *bookmark, int *page_size, char *ad_account_id);


// Create feed
//
// Create a new feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/api-features/shopping-overview/'>Pinterest API for shopping</a>.  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
//
catalogs_feed_t*
CatalogsAPI_feedsCreate(apiClient_t *apiClient, feeds_create_request_t *feeds_create_request, char *ad_account_id);


// Delete feed
//
// Delete a feed owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/api-features/shopping-overview/'>Pinterest API for shopping</a>.
//
void
CatalogsAPI_feedsDelete(apiClient_t *apiClient, char *feed_id, char *ad_account_id);


// Get feed
//
// Get a single feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/api-features/shopping-overview/'>Pinterest API for shopping</a>.
//
catalogs_feed_t*
CatalogsAPI_feedsGet(apiClient_t *apiClient, char *feed_id, char *ad_account_id);


// Ingest feed items
//
// Ingest items for a given feed owned by the \"operation user_account\".  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>  Note: This endpoint is restricted to a specific group of users. If you require access, please reach out to your partner manager.
//
catalogs_feed_ingestion_t*
CatalogsAPI_feedsIngest(apiClient_t *apiClient, char *feed_id, char *ad_account_id);


// List feeds
//
// Fetch feeds owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/api-features/shopping-overview/'>Pinterest API for shopping</a>.
//
feeds_list_200_response_t*
CatalogsAPI_feedsList(apiClient_t *apiClient, char *bookmark, int *page_size, char *catalog_id, char *ad_account_id);


// Update feed
//
// Update a feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/api-features/shopping-overview/'>Pinterest API for shopping</a>.  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
//
catalogs_feed_t*
CatalogsAPI_feedsUpdate(apiClient_t *apiClient, char *feed_id, feeds_update_request_t *feeds_update_request, char *ad_account_id);


// Get item batch status
//
// Get a single catalogs items batch owned by the \"operating user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.
//
catalogs_items_batch_t*
CatalogsAPI_itemsBatchGet(apiClient_t *apiClient, char *batch_id, char *ad_account_id);


// Operate on item batch
//
// This endpoint supports multiple operations on a set of one or more catalog items owned by the \"operation user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: - Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager. - The item UPSERT operation is restricted to users without a feed data source. If you plan to migrate item ingestion from feeds to the API, please reach out to your partner manager to get assistance.
//
catalogs_items_batch_t*
CatalogsAPI_itemsBatchPost(apiClient_t *apiClient, items_batch_post_request_t *items_batch_post_request, char *ad_account_id);


// Get catalogs items
//
// Get the items of the catalog owned by the \"operation user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: this endpoint is deprecated and will be deleted soon. Please use <a href='/docs/api/v5/#operation/items/post'>Get catalogs items (POST)</a> instead.
//
catalogs_items_t*
CatalogsAPI_itemsGet(apiClient_t *apiClient, char *country, char *language, char *ad_account_id, list_t *item_ids, catalogs_items_filters_t *filters);


// List item issues
//
// List item validation issues for a given feed processing result owned by the \"operation user_account\". Up to 20 random samples of affected items are returned for each error and warning code. Please note that for now query parameters 'item_numbers' and 'item_validation_issue' cannot be used simultaneously until it is implemented in some release in the future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: To get a list of all affected items instead of sampled issues, please refer to <a href='/docs/api/v5/#operation/reports/create'>Build catalogs report</a> and <a href='/docs/api/v5/#operation/reports/get'>Get catalogs report</a> endpoints. Moreover, they support multiple types of catalogs.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>
//
items_issues_list_200_response_t*
CatalogsAPI_itemsIssuesList(apiClient_t *apiClient, char *processing_result_id, char *bookmark, int *page_size, list_t *item_numbers, catalogs_item_validation_issue_e item_validation_issue, char *ad_account_id);


// Get catalogs items (POST)
//
// Get the items of the catalog owned by the \"operation user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
//
catalogs_items_t*
CatalogsAPI_itemsPost(apiClient_t *apiClient, catalogs_items_request_t *catalogs_items_request, char *ad_account_id);


// List products by filter
//
// List products Pins owned by the \"operation user_account\" that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: This endpoint only supports RETAIL catalog at the moment.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>
//
catalogs_product_group_pins_list_200_response_t*
CatalogsAPI_productsByProductGroupFilterList(apiClient_t *apiClient, catalogs_list_products_by_filter_request_t *catalogs_list_products_by_filter_request, char *bookmark, int *page_size, char *ad_account_id, int *pin_metrics);


// Build catalogs report
//
// Async request to create a report of the catalog owned by the \"operation user_account\". This endpoint generates a report upon receiving the first approved request of the day. Any following requests with identical parameters will yield the same report even if data has changed. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.
//
catalogs_create_report_response_t*
CatalogsAPI_reportsCreate(apiClient_t *apiClient, catalogs_report_parameters_t *catalogs_report_parameters, char *ad_account_id);


// Get catalogs report
//
// This returns a URL to a report given a token returned from <a href='/docs/api/v5/#operation/reports/create'>Build catalogs report</a>. You can use the URL to download the report. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.
//
catalogs_report_t*
CatalogsAPI_reportsGet(apiClient_t *apiClient, char *token, char *ad_account_id);


// List report stats
//
// List aggregated numbers of issues for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.
//
reports_stats_200_response_t*
CatalogsAPI_reportsStats(apiClient_t *apiClient, catalogs_report_parameters_t *parameters, char *ad_account_id, int *page_size, char *bookmark);


