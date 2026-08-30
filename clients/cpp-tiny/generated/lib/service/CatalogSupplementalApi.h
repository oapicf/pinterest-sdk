#ifndef TINY_CPP_CLIENT_CatalogSupplementalApi_H_
#define TINY_CPP_CLIENT_CatalogSupplementalApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "Catalogs_local_stores_create_200_response_inner.h"
#include "Catalogs_local_stores_delete_200_response_inner.h"
#include "Catalogs_local_stores_list_200_response.h"
#include "LocalInventoryItemsBatch.h"
#include "LocalInventoryItemsBatchCreate.h"
#include "LocalInventoryItemsGet.h"
#include "LocalInventoryItemsGetCreate.h"
#include "LocalStore.h"
#include "LocalStoreBatchUpdate.h"
#include "LocalStoreCreate.h"
#include "Pinterest.Lib.Error.h"
#include "SupplementalItemsBatchResponse.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class CatalogSupplementalApi : public Service {
public:
    CatalogSupplementalApi() = default;

    virtual ~CatalogSupplementalApi();

    /**
    * Operate on local inventory item batch.
    *
    * Managing local inventory information in batches supporting CREATE, UPDATE, UPSERT, DELETE operations. Up to 1000 items per request to match catalogs/items.  - Must provide both item_id and store_code to identify a local inventory item.  - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
    * \param catalogId Unique identifier of a catalog. *Required*
    * \param localInventoryItemsBatchCreate  *Required*
    * \param adAccountId Unique identifier of an ad account.
    */
    Response<
                SupplementalItemsBatchResponse
        >
    catalogsLocalInventoryItemsBatch_operate(
            
            std::string catalogId
            , 
            
            LocalInventoryItemsBatchCreate localInventoryItemsBatchCreate
            , 
            
            std::string adAccountId
            
    );
    /**
    * Get local inventory items (POST).
    *
    * Get local inventory items for a catalog owned by the \"operation user_account\".  - Must provide an array of {item_id, store_code} pairs in item filters to identify local inventory items.  - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
    * \param catalogId Unique identifier of a catalog. *Required*
    * \param localInventoryItemsGetCreate  *Required*
    * \param adAccountId Unique identifier of an ad account.
    */
    Response<
                LocalInventoryItemsGet
        >
    catalogsLocalInventoryItems_post(
            
            std::string catalogId
            , 
            
            LocalInventoryItemsGetCreate localInventoryItemsGetCreate
            , 
            
            std::string adAccountId
            
    );
    /**
    * Create local stores.
    *
    * Create a local store for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
    * \param catalogId Unique identifier of a catalog. *Required*
    * \param localStoreCreate  *Required*
    * \param adAccountId Unique identifier of an ad account.
    */
    Response<
                    std::list<Catalogs_local_stores_create_200_response_inner>
        >
    catalogsLocalStores_create(
            
            std::string catalogId
            , 
            std::list<LocalStoreCreate> localStoreCreate
            
            , 
            
            std::string adAccountId
            
    );
    /**
    * Delete local stores.
    *
    *   Delete multiple local stores for a catalog owned by the \"operation user_account\".   - By default, the \"operation user_account\" is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)
    * \param catalogId Unique identifier of a catalog. *Required*
    * \param ids List of local store IDs to filter by. *Required*
    * \param adAccountId Unique identifier of an ad account.
    */
    Response<
                    std::list<Catalogs_local_stores_delete_200_response_inner>
        >
    catalogsLocalStores_delete(
            
            std::string catalogId
            , 
            std::list<std::string> ids
            
            , 
            
            std::string adAccountId
            
    );
    /**
    * List local stores.
    *
    * Fetch local stores for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
    * \param catalogId Unique identifier of a catalog. *Required*
    * \param ids List of local store IDs to filter by.
    * \param adAccountId Unique identifier of an ad account.
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    */
    Response<
                Catalogs_local_stores_list_200_response
        >
    catalogsLocalStores_list(
            
            std::string catalogId
            , 
            std::list<std::string> ids
            
            , 
            
            std::string adAccountId
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            
    );
    /**
    * Update local stores.
    *
    *   Update a local store for a catalog owned by the \"operation user_account\".   - By default, the \"operation user_account\" is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)
    * \param catalogId Unique identifier of a catalog. *Required*
    * \param localStoreBatchUpdate  *Required*
    * \param adAccountId Unique identifier of an ad account.
    */
    Response<
                    std::list<Catalogs_local_stores_create_200_response_inner>
        >
    catalogsLocalStores_update(
            
            std::string catalogId
            , 
            std::list<LocalStoreBatchUpdate> localStoreBatchUpdate
            
            , 
            
            std::string adAccountId
            
    );
    /**
    * Get supplemental items batch status.
    *
    * Fetch the status and results of a supplemental items batch operation. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
    * \param catalogId Unique identifier of a catalog. *Required*
    * \param batchId Unique identifier of an items batch operation. *Required*
    * \param adAccountId Unique identifier of an ad account.
    */
    Response<
                SupplementalItemsBatchResponse
        >
    catalogsSupplementalItemsBatch_get(
            
            std::string catalogId
            , 
            
            std::string batchId
            , 
            
            std::string adAccountId
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_CatalogSupplementalApi_H_ */