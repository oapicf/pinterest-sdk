/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get local inventory items (POST)
* Get local inventory items for a catalog owned by the \"operation user_account\".  - Must provide an array of {item_id, store_code} pairs in item filters to identify local inventory items.  - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
*
* catalogUnderscoreid String Unique identifier of a catalog.
* localInventoryItemsGetCreate LocalInventoryItemsGetCreate 
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account. (optional)
* returns LocalInventoryItemsGet
* */
const catalogs_local_inventory_items/post = ({ catalogUnderscoreid, localInventoryItemsGetCreate, adUnderscoreaccountUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        catalogUnderscoreid,
        localInventoryItemsGetCreate,
        adUnderscoreaccountUnderscoreid,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Operate on local inventory item batch
* Managing local inventory information in batches supporting CREATE, UPDATE, UPSERT, DELETE operations. Up to 1000 items per request to match catalogs/items.  - Must provide both item_id and store_code to identify a local inventory item.  - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
*
* catalogUnderscoreid String Unique identifier of a catalog.
* localInventoryItemsBatchCreate LocalInventoryItemsBatchCreate 
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account. (optional)
* returns SupplementalItemsBatchResponse
* */
const catalogs_local_inventory_items_batch/operate = ({ catalogUnderscoreid, localInventoryItemsBatchCreate, adUnderscoreaccountUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        catalogUnderscoreid,
        localInventoryItemsBatchCreate,
        adUnderscoreaccountUnderscoreid,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Create local stores
* Create a local store for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
*
* catalogUnderscoreid String Unique identifier of a catalog.
* localStoreCreate List 
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account. (optional)
* returns List
* */
const catalogs_local_stores/create = ({ catalogUnderscoreid, localStoreCreate, adUnderscoreaccountUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        catalogUnderscoreid,
        localStoreCreate,
        adUnderscoreaccountUnderscoreid,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Delete local stores
*   Delete multiple local stores for a catalog owned by the \"operation user_account\".   - By default, the \"operation user_account\" is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)
*
* catalogUnderscoreid String Unique identifier of a catalog.
* ids List List of local store IDs to filter by.
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account. (optional)
* returns List
* */
const catalogs_local_stores/delete = ({ catalogUnderscoreid, ids, adUnderscoreaccountUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        catalogUnderscoreid,
        ids,
        adUnderscoreaccountUnderscoreid,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* List local stores
* Fetch local stores for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
*
* catalogUnderscoreid String Unique identifier of a catalog.
* ids List List of local store IDs to filter by. (optional)
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account. (optional)
* bookmark String Cursor used to fetch the next page of items (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
* returns catalogs_local_stores_list_200_response
* */
const catalogs_local_stores/list = ({ catalogUnderscoreid, ids, adUnderscoreaccountUnderscoreid, bookmark, pageUnderscoresize }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        catalogUnderscoreid,
        ids,
        adUnderscoreaccountUnderscoreid,
        bookmark,
        pageUnderscoresize,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Update local stores
*   Update a local store for a catalog owned by the \"operation user_account\".   - By default, the \"operation user_account\" is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)
*
* catalogUnderscoreid String Unique identifier of a catalog.
* localStoreBatchUpdate List 
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account. (optional)
* returns List
* */
const catalogs_local_stores/update = ({ catalogUnderscoreid, localStoreBatchUpdate, adUnderscoreaccountUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        catalogUnderscoreid,
        localStoreBatchUpdate,
        adUnderscoreaccountUnderscoreid,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get supplemental items batch status
* Fetch the status and results of a supplemental items batch operation. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
*
* catalogUnderscoreid String Unique identifier of a catalog.
* batchUnderscoreid String Unique identifier of an items batch operation.
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account. (optional)
* returns SupplementalItemsBatchResponse
* */
const catalogs_supplemental_items_batch/get = ({ catalogUnderscoreid, batchUnderscoreid, adUnderscoreaccountUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        catalogUnderscoreid,
        batchUnderscoreid,
        adUnderscoreaccountUnderscoreid,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);

module.exports = {
  catalogs_local_inventory_items/post,
  catalogs_local_inventory_items_batch/operate,
  catalogs_local_stores/create,
  catalogs_local_stores/delete,
  catalogs_local_stores/list,
  catalogs_local_stores/update,
  catalogs_supplemental_items_batch/get,
};
