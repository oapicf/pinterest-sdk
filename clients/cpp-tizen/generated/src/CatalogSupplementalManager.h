#ifndef _CatalogSupplementalManager_H_
#define _CatalogSupplementalManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
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
#include <list>
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup CatalogSupplemental CatalogSupplemental
 * \ingroup Operations
 *  @{
 */
class CatalogSupplementalManager {
public:
	CatalogSupplementalManager();
	virtual ~CatalogSupplementalManager();

/*! \brief Operate on local inventory item batch. *Synchronous*
 *
 * Managing local inventory information in batches supporting CREATE, UPDATE, UPSERT, DELETE operations. Up to 1000 items per request to match catalogs/items.  - Must provide both item_id and store_code to identify a local inventory item.  - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
 * \param catalogId Unique identifier of a catalog. *Required*
 * \param localInventoryItemsBatchCreate  *Required*
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool catalogsLocalInventoryItemsBatchOperateSync(char * accessToken,
	std::string catalogId, std::shared_ptr<LocalInventoryItemsBatchCreate> localInventoryItemsBatchCreate, std::string adAccountId, 
	void(* handler)(SupplementalItemsBatchResponse, Error, void* )
	, void* userData);

/*! \brief Operate on local inventory item batch. *Asynchronous*
 *
 * Managing local inventory information in batches supporting CREATE, UPDATE, UPSERT, DELETE operations. Up to 1000 items per request to match catalogs/items.  - Must provide both item_id and store_code to identify a local inventory item.  - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
 * \param catalogId Unique identifier of a catalog. *Required*
 * \param localInventoryItemsBatchCreate  *Required*
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool catalogsLocalInventoryItemsBatchOperateAsync(char * accessToken,
	std::string catalogId, std::shared_ptr<LocalInventoryItemsBatchCreate> localInventoryItemsBatchCreate, std::string adAccountId, 
	void(* handler)(SupplementalItemsBatchResponse, Error, void* )
	, void* userData);


/*! \brief Get local inventory items (POST). *Synchronous*
 *
 * Get local inventory items for a catalog owned by the \"operation user_account\".  - Must provide an array of {item_id, store_code} pairs in item filters to identify local inventory items.  - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
 * \param catalogId Unique identifier of a catalog. *Required*
 * \param localInventoryItemsGetCreate  *Required*
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool catalogsLocalInventoryItemsPostSync(char * accessToken,
	std::string catalogId, std::shared_ptr<LocalInventoryItemsGetCreate> localInventoryItemsGetCreate, std::string adAccountId, 
	void(* handler)(LocalInventoryItemsGet, Error, void* )
	, void* userData);

/*! \brief Get local inventory items (POST). *Asynchronous*
 *
 * Get local inventory items for a catalog owned by the \"operation user_account\".  - Must provide an array of {item_id, store_code} pairs in item filters to identify local inventory items.  - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
 * \param catalogId Unique identifier of a catalog. *Required*
 * \param localInventoryItemsGetCreate  *Required*
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool catalogsLocalInventoryItemsPostAsync(char * accessToken,
	std::string catalogId, std::shared_ptr<LocalInventoryItemsGetCreate> localInventoryItemsGetCreate, std::string adAccountId, 
	void(* handler)(LocalInventoryItemsGet, Error, void* )
	, void* userData);


/*! \brief Create local stores. *Synchronous*
 *
 * Create a local store for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
 * \param catalogId Unique identifier of a catalog. *Required*
 * \param localStoreCreate  *Required*
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool catalogsLocalStoresCreateSync(char * accessToken,
	std::string catalogId, std::list<LocalStoreCreate> localStoreCreate, std::string adAccountId, 
	void(* handler)(std::list<Catalogs_local_stores_create_200_response_inner>, Error, void* )
	, void* userData);

/*! \brief Create local stores. *Asynchronous*
 *
 * Create a local store for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
 * \param catalogId Unique identifier of a catalog. *Required*
 * \param localStoreCreate  *Required*
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool catalogsLocalStoresCreateAsync(char * accessToken,
	std::string catalogId, std::list<LocalStoreCreate> localStoreCreate, std::string adAccountId, 
	void(* handler)(std::list<Catalogs_local_stores_create_200_response_inner>, Error, void* )
	, void* userData);


/*! \brief Delete local stores. *Synchronous*
 *
 *   Delete multiple local stores for a catalog owned by the \"operation user_account\".   - By default, the \"operation user_account\" is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)
 * \param catalogId Unique identifier of a catalog. *Required*
 * \param ids List of local store IDs to filter by. *Required*
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool catalogsLocalStoresDeleteSync(char * accessToken,
	std::string catalogId, std::list<std::string> ids, std::string adAccountId, 
	void(* handler)(std::list<Catalogs_local_stores_delete_200_response_inner>, Error, void* )
	, void* userData);

/*! \brief Delete local stores. *Asynchronous*
 *
 *   Delete multiple local stores for a catalog owned by the \"operation user_account\".   - By default, the \"operation user_account\" is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)
 * \param catalogId Unique identifier of a catalog. *Required*
 * \param ids List of local store IDs to filter by. *Required*
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool catalogsLocalStoresDeleteAsync(char * accessToken,
	std::string catalogId, std::list<std::string> ids, std::string adAccountId, 
	void(* handler)(std::list<Catalogs_local_stores_delete_200_response_inner>, Error, void* )
	, void* userData);


/*! \brief List local stores. *Synchronous*
 *
 * Fetch local stores for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
 * \param catalogId Unique identifier of a catalog. *Required*
 * \param ids List of local store IDs to filter by.
 * \param adAccountId Unique identifier of an ad account.
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool catalogsLocalStoresListSync(char * accessToken,
	std::string catalogId, std::list<std::string> ids, std::string adAccountId, std::string bookmark, int pageSize, 
	void(* handler)(Catalogs_local_stores_list_200_response, Error, void* )
	, void* userData);

/*! \brief List local stores. *Asynchronous*
 *
 * Fetch local stores for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
 * \param catalogId Unique identifier of a catalog. *Required*
 * \param ids List of local store IDs to filter by.
 * \param adAccountId Unique identifier of an ad account.
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool catalogsLocalStoresListAsync(char * accessToken,
	std::string catalogId, std::list<std::string> ids, std::string adAccountId, std::string bookmark, int pageSize, 
	void(* handler)(Catalogs_local_stores_list_200_response, Error, void* )
	, void* userData);


/*! \brief Update local stores. *Synchronous*
 *
 *   Update a local store for a catalog owned by the \"operation user_account\".   - By default, the \"operation user_account\" is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)
 * \param catalogId Unique identifier of a catalog. *Required*
 * \param localStoreBatchUpdate  *Required*
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool catalogsLocalStoresUpdateSync(char * accessToken,
	std::string catalogId, std::list<LocalStoreBatchUpdate> localStoreBatchUpdate, std::string adAccountId, 
	void(* handler)(std::list<Catalogs_local_stores_create_200_response_inner>, Error, void* )
	, void* userData);

/*! \brief Update local stores. *Asynchronous*
 *
 *   Update a local store for a catalog owned by the \"operation user_account\".   - By default, the \"operation user_account\" is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)
 * \param catalogId Unique identifier of a catalog. *Required*
 * \param localStoreBatchUpdate  *Required*
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool catalogsLocalStoresUpdateAsync(char * accessToken,
	std::string catalogId, std::list<LocalStoreBatchUpdate> localStoreBatchUpdate, std::string adAccountId, 
	void(* handler)(std::list<Catalogs_local_stores_create_200_response_inner>, Error, void* )
	, void* userData);


/*! \brief Get supplemental items batch status. *Synchronous*
 *
 * Fetch the status and results of a supplemental items batch operation. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
 * \param catalogId Unique identifier of a catalog. *Required*
 * \param batchId Unique identifier of an items batch operation. *Required*
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool catalogsSupplementalItemsBatchGetSync(char * accessToken,
	std::string catalogId, std::string batchId, std::string adAccountId, 
	void(* handler)(SupplementalItemsBatchResponse, Error, void* )
	, void* userData);

/*! \brief Get supplemental items batch status. *Asynchronous*
 *
 * Fetch the status and results of a supplemental items batch operation. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
 * \param catalogId Unique identifier of a catalog. *Required*
 * \param batchId Unique identifier of an items batch operation. *Required*
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool catalogsSupplementalItemsBatchGetAsync(char * accessToken,
	std::string catalogId, std::string batchId, std::string adAccountId, 
	void(* handler)(SupplementalItemsBatchResponse, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.pinterest.com/v5";
	}
};
/** @}*/

}
}
#endif /* CatalogSupplementalManager_H_ */
