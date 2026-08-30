#ifndef TINY_CPP_CLIENT_CatalogItemsApi_H_
#define TINY_CPP_CLIENT_CatalogItemsApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "CatalogsItemsBatch.h"
#include "CatalogsItemsBatchPostRequest.h"
#include "CatalogsItemsRequest.h"
#include "Items_post_200_response.h"
#include "Pinterest.Lib.Error.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class CatalogItemsApi : public Service {
public:
    CatalogItemsApi() = default;

    virtual ~CatalogItemsApi();

    /**
    * Get item batch status.
    *
    * Get a single catalogs items batch owned by the \"operating user_account\". [See detailed documentation here.](/docs/api-features/shopping-overview/#Update%20items%20in%20batch) - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
    * \param batchId Id of a catalogs items batch to fetch *Required*
    * \param adAccountId Unique identifier of an ad account.
    */
    Response<
                CatalogsItemsBatch
        >
    itemsBatch_get(
            
            std::string batchId
            , 
            
            std::string adAccountId
            
    );
    /**
    * Operate on item batch.
    *
    * This endpoint supports multiple operations on a set of one or more catalog items owned by the \"operation user_account\". [See detailed documentation here.](/docs/work-with-catalogs/modify-items-in-batch/) - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: - Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager. - The item UPSERT operation is restricted to users without a feed data source. If you plan to migrate item ingestion from feeds to the API, please reach out to your partner manager or via the Help Center to get assistance.
    * \param catalogsItemsBatchPostRequest  *Required*
    * \param adAccountId Unique identifier of an ad account.
    */
    Response<
                CatalogsItemsBatch
        >
    itemsBatch_post(
            
            CatalogsItemsBatchPostRequest catalogsItemsBatchPostRequest
            , 
            
            std::string adAccountId
            
    );
    /**
    * Get catalogs items (POST).
    *
    * Get the items of the catalog owned by the \"operation user_account\". [See detailed documentation here.](/docs/api-features/shopping-overview/#Update%20items%20in%20batch) - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
    * \param catalogsItemsRequest  *Required*
    * \param adAccountId Unique identifier of an ad account.
    */
    Response<
                Items_post_200_response
        >
    items_post(
            
            CatalogsItemsRequest catalogsItemsRequest
            , 
            
            std::string adAccountId
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_CatalogItemsApi_H_ */