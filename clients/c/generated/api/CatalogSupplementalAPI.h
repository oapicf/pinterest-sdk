#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/catalogs_local_stores_create_200_response_inner.h"
#include "../model/catalogs_local_stores_delete_200_response_inner.h"
#include "../model/catalogs_local_stores_list_200_response.h"
#include "../model/local_inventory_items_batch.h"
#include "../model/local_inventory_items_batch_create.h"
#include "../model/local_inventory_items_get.h"
#include "../model/local_inventory_items_get_create.h"
#include "../model/local_store.h"
#include "../model/local_store_batch_update.h"
#include "../model/local_store_create.h"
#include "../model/pinterest_lib_error.h"
#include "../model/supplemental_items_batch_response.h"


// Operate on local inventory item batch
//
// Managing local inventory information in batches supporting CREATE, UPDATE, UPSERT, DELETE operations. Up to 1000 items per request to match catalogs/items.  - Must provide both item_id and store_code to identify a local inventory item.  - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
//
supplemental_items_batch_response_t*
CatalogSupplementalAPI_catalogsLocalInventoryItemsBatchOperate(apiClient_t *apiClient, char *catalog_id, local_inventory_items_batch_create_t *local_inventory_items_batch_create, char *ad_account_id);


// Get local inventory items (POST)
//
// Get local inventory items for a catalog owned by the \"operation user_account\".  - Must provide an array of {item_id, store_code} pairs in item filters to identify local inventory items.  - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
//
local_inventory_items_get_t*
CatalogSupplementalAPI_catalogsLocalInventoryItemsPost(apiClient_t *apiClient, char *catalog_id, local_inventory_items_get_create_t *local_inventory_items_get_create, char *ad_account_id);


// Create local stores
//
// Create a local store for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
//
list_t*
CatalogSupplementalAPI_catalogsLocalStoresCreate(apiClient_t *apiClient, char *catalog_id, list_t *local_store_create, char *ad_account_id);


// Delete local stores
//
//   Delete multiple local stores for a catalog owned by the \"operation user_account\".   - By default, the \"operation user_account\" is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)
//
list_t*
CatalogSupplementalAPI_catalogsLocalStoresDelete(apiClient_t *apiClient, char *catalog_id, list_t *ids, char *ad_account_id);


// List local stores
//
// Fetch local stores for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
//
catalogs_local_stores_list_200_response_t*
CatalogSupplementalAPI_catalogsLocalStoresList(apiClient_t *apiClient, char *catalog_id, list_t *ids, char *ad_account_id, char *bookmark, int *page_size);


// Update local stores
//
//   Update a local store for a catalog owned by the \"operation user_account\".   - By default, the \"operation user_account\" is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)
//
list_t*
CatalogSupplementalAPI_catalogsLocalStoresUpdate(apiClient_t *apiClient, char *catalog_id, list_t *local_store_batch_update, char *ad_account_id);


// Get supplemental items batch status
//
// Fetch the status and results of a supplemental items batch operation. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
//
supplemental_items_batch_response_t*
CatalogSupplementalAPI_catalogsSupplementalItemsBatchGet(apiClient_t *apiClient, char *catalog_id, char *batch_id, char *ad_account_id);


