#ifndef _CatalogsManager_H_
#define _CatalogsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "CatalogsFeed.h"
#include "CatalogsFeedsCreateRequest.h"
#include "CatalogsFeedsUpdateRequest.h"
#include "CatalogsItems.h"
#include "CatalogsItemsBatch.h"
#include "CatalogsItemsBatchRequest.h"
#include "CatalogsProductGroup.h"
#include "CatalogsProductGroupCreateRequest.h"
#include "CatalogsProductGroupUpdateRequest.h"
#include "Error.h"
#include "Paginated.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Catalogs Catalogs
 * \ingroup Operations
 *  @{
 */
class CatalogsManager {
public:
	CatalogsManager();
	virtual ~CatalogsManager();

/*! \brief Create product group. *Synchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Create product group to use in Catalogs.
 * \param catalogsProductGroupCreateRequest Request object used to created a catalogs product group. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool catalogsProductGroupsCreateSync(char * accessToken,
	std::shared_ptr<CatalogsProductGroupCreateRequest> catalogsProductGroupCreateRequest, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief Create product group. *Asynchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Create product group to use in Catalogs.
 * \param catalogsProductGroupCreateRequest Request object used to created a catalogs product group. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool catalogsProductGroupsCreateAsync(char * accessToken,
	std::shared_ptr<CatalogsProductGroupCreateRequest> catalogsProductGroupCreateRequest, 
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief Delete product group. *Synchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Delete a product group from being in use in Catalogs.
 * \param productGroupId Unique identifier of a product group *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool catalogsProductGroupsDeleteSync(char * accessToken,
	std::string productGroupId, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Delete product group. *Asynchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Delete a product group from being in use in Catalogs.
 * \param productGroupId Unique identifier of a product group *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool catalogsProductGroupsDeleteAsync(char * accessToken,
	std::string productGroupId, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Get product groups list. *Synchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a list of product groups for a given Catalogs Feed Id.
 * \param feedId Unique identifier of a feed *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool catalogsProductGroupsListSync(char * accessToken,
	std::string feedId, std::string bookmark, int pageSize, 
	void(* handler)(Paginated, Error, void* )
	, void* userData);

/*! \brief Get product groups list. *Asynchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a list of product groups for a given Catalogs Feed Id.
 * \param feedId Unique identifier of a feed *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool catalogsProductGroupsListAsync(char * accessToken,
	std::string feedId, std::string bookmark, int pageSize, 
	void(* handler)(Paginated, Error, void* )
	, void* userData);


/*! \brief Update product group. *Synchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Update product group to use in Catalogs.
 * \param productGroupId Unique identifier of a product group *Required*
 * \param catalogsProductGroupUpdateRequest Request object used to Update a catalogs product group. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool catalogsProductGroupsUpdateSync(char * accessToken,
	std::string productGroupId, std::shared_ptr<CatalogsProductGroupUpdateRequest> catalogsProductGroupUpdateRequest, 
	void(* handler)(CatalogsProductGroup, Error, void* )
	, void* userData);

/*! \brief Update product group. *Asynchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Update product group to use in Catalogs.
 * \param productGroupId Unique identifier of a product group *Required*
 * \param catalogsProductGroupUpdateRequest Request object used to Update a catalogs product group. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool catalogsProductGroupsUpdateAsync(char * accessToken,
	std::string productGroupId, std::shared_ptr<CatalogsProductGroupUpdateRequest> catalogsProductGroupUpdateRequest, 
	void(* handler)(CatalogsProductGroup, Error, void* )
	, void* userData);


/*! \brief List processing results for a given feed. *Synchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Fetch a feed processing results owned by the owner user account.
 * \param feedId Unique identifier of a feed *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool feedProcessingResultsListSync(char * accessToken,
	std::string feedId, std::string bookmark, int pageSize, 
	void(* handler)(Paginated, Error, void* )
	, void* userData);

/*! \brief List processing results for a given feed. *Asynchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Fetch a feed processing results owned by the owner user account.
 * \param feedId Unique identifier of a feed *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool feedProcessingResultsListAsync(char * accessToken,
	std::string feedId, std::string bookmark, int pageSize, 
	void(* handler)(Paginated, Error, void* )
	, void* userData);


/*! \brief Create feed. *Synchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Create a new feed owned by the \"operating user_account\".
 * \param catalogsFeedsCreateRequest Request object used to created a feed. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool feedsCreateSync(char * accessToken,
	std::shared_ptr<CatalogsFeedsCreateRequest> catalogsFeedsCreateRequest, 
	void(* handler)(CatalogsFeed, Error, void* )
	, void* userData);

/*! \brief Create feed. *Asynchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Create a new feed owned by the \"operating user_account\".
 * \param catalogsFeedsCreateRequest Request object used to created a feed. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool feedsCreateAsync(char * accessToken,
	std::shared_ptr<CatalogsFeedsCreateRequest> catalogsFeedsCreateRequest, 
	void(* handler)(CatalogsFeed, Error, void* )
	, void* userData);


/*! \brief Delete feed. *Synchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Delete a feed owned by the \"operating user_account\".
 * \param feedId Unique identifier of a feed *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool feedsDeleteSync(char * accessToken,
	std::string feedId, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Delete feed. *Asynchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Delete a feed owned by the \"operating user_account\".
 * \param feedId Unique identifier of a feed *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool feedsDeleteAsync(char * accessToken,
	std::string feedId, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Get feed. *Synchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a single feed owned by the \"operating user_account\".
 * \param feedId Unique identifier of a feed *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool feedsGetSync(char * accessToken,
	std::string feedId, 
	void(* handler)(CatalogsFeed, Error, void* )
	, void* userData);

/*! \brief Get feed. *Asynchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a single feed owned by the \"operating user_account\".
 * \param feedId Unique identifier of a feed *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool feedsGetAsync(char * accessToken,
	std::string feedId, 
	void(* handler)(CatalogsFeed, Error, void* )
	, void* userData);


/*! \brief List feeds. *Synchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Fetch feeds owned by the \"operating user_account\".
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool feedsListSync(char * accessToken,
	std::string bookmark, int pageSize, 
	void(* handler)(Paginated, Error, void* )
	, void* userData);

/*! \brief List feeds. *Asynchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Fetch feeds owned by the \"operating user_account\".
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool feedsListAsync(char * accessToken,
	std::string bookmark, int pageSize, 
	void(* handler)(Paginated, Error, void* )
	, void* userData);


/*! \brief Update feed. *Synchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Update a feed owned by the \"operating user_account\".
 * \param feedId Unique identifier of a feed *Required*
 * \param catalogsFeedsUpdateRequest Request object used to update a feed. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool feedsUpdateSync(char * accessToken,
	std::string feedId, std::shared_ptr<CatalogsFeedsUpdateRequest> catalogsFeedsUpdateRequest, 
	void(* handler)(CatalogsFeed, Error, void* )
	, void* userData);

/*! \brief Update feed. *Asynchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Update a feed owned by the \"operating user_account\".
 * \param feedId Unique identifier of a feed *Required*
 * \param catalogsFeedsUpdateRequest Request object used to update a feed. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool feedsUpdateAsync(char * accessToken,
	std::string feedId, std::shared_ptr<CatalogsFeedsUpdateRequest> catalogsFeedsUpdateRequest, 
	void(* handler)(CatalogsFeed, Error, void* )
	, void* userData);


/*! \brief Get catalogs items batch. *Synchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a single catalogs items batch created by the \"operating user_account\".
 * \param batchId Id of a catalogs items batch to fetch *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool itemsBatchGetSync(char * accessToken,
	std::string batchId, 
	void(* handler)(CatalogsItemsBatch, Error, void* )
	, void* userData);

/*! \brief Get catalogs items batch. *Asynchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a single catalogs items batch created by the \"operating user_account\".
 * \param batchId Id of a catalogs items batch to fetch *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool itemsBatchGetAsync(char * accessToken,
	std::string batchId, 
	void(* handler)(CatalogsItemsBatch, Error, void* )
	, void* userData);


/*! \brief Perform an operation on an item batch. *Synchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  This endpoint supports multiple operations on a set of one or more catalog items.
 * \param catalogsItemsBatchRequest Request object used to create catalogs items in a batch *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool itemsBatchPostSync(char * accessToken,
	std::shared_ptr<CatalogsItemsBatchRequest> catalogsItemsBatchRequest, 
	void(* handler)(CatalogsItemsBatch, Error, void* )
	, void* userData);

/*! \brief Perform an operation on an item batch. *Asynchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  This endpoint supports multiple operations on a set of one or more catalog items.
 * \param catalogsItemsBatchRequest Request object used to create catalogs items in a batch *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool itemsBatchPostAsync(char * accessToken,
	std::shared_ptr<CatalogsItemsBatchRequest> catalogsItemsBatchRequest, 
	void(* handler)(CatalogsItemsBatch, Error, void* )
	, void* userData);


/*! \brief Get catalogs items. *Synchronous*
 *
 * Get the items of the catalog created by the \"operating user_account\"
 * \param country Country for the Catalogs Items *Required*
 * \param itemIds Catalos Item ids *Required*
 * \param language Language for the Catalogs Items *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool itemsGetSync(char * accessToken,
	std::string country, std::list<std::string> itemIds, std::string language, 
	void(* handler)(CatalogsItems, Error, void* )
	, void* userData);

/*! \brief Get catalogs items. *Asynchronous*
 *
 * Get the items of the catalog created by the \"operating user_account\"
 * \param country Country for the Catalogs Items *Required*
 * \param itemIds Catalos Item ids *Required*
 * \param language Language for the Catalogs Items *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool itemsGetAsync(char * accessToken,
	std::string country, std::list<std::string> itemIds, std::string language, 
	void(* handler)(CatalogsItems, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.pinterest.com/v5";
	}
};
/** @}*/

}
}
#endif /* CatalogsManager_H_ */
