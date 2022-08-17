#ifndef _CatalogsManager_H_
#define _CatalogsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "CatalogsFeed.h"
#include "CatalogsFeedsCreateRequest.h"
#include "CatalogsFeedsUpdateRequest.h"
#include "CatalogsItemValidationIssue.h"
#include "CatalogsItems.h"
#include "CatalogsItemsBatch.h"
#include "CatalogsItemsBatchRequest.h"
#include "CatalogsListProductsByFilterRequest.h"
#include "CatalogsProductGroup.h"
#include "CatalogsProductGroupCreateRequest.h"
#include "CatalogsProductGroupProductCounts.h"
#include "CatalogsProductGroupUpdateRequest.h"
#include "Catalogs_product_groups_list_200_response.h"
#include "Error.h"
#include "Feed_processing_results_list_200_response.h"
#include "Feeds_list_200_response.h"
#include "Items_issues_list_200_response.h"
#include "Products_by_product_group_filter_list_200_response.h"
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

/*! \brief List products for a given product group. *Synchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/features/catalog-management/'>Learn more</a>.</strong>  Get a list of product pins for a given Catalogs Product Group Id.
 * \param productGroupId Unique identifier of a product group *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool catalogsProductGroupPinsListSync(char * accessToken,
	std::string productGroupId, std::string bookmark, int pageSize, 
	void(* handler)(Products_by_product_group_filter_list_200_response, Error, void* )
	, void* userData);

/*! \brief List products for a given product group. *Asynchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/features/catalog-management/'>Learn more</a>.</strong>  Get a list of product pins for a given Catalogs Product Group Id.
 * \param productGroupId Unique identifier of a product group *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool catalogsProductGroupPinsListAsync(char * accessToken,
	std::string productGroupId, std::string bookmark, int pageSize, 
	void(* handler)(Products_by_product_group_filter_list_200_response, Error, void* )
	, void* userData);


/*! \brief Create product group. *Synchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/features/catalog-management/'>Learn more</a>.</strong>  Create product group to use in Catalogs.
 * \param catalogsProductGroupCreateRequest Request object used to created a catalogs product group. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool catalogsProductGroupsCreateSync(char * accessToken,
	std::shared_ptr<CatalogsProductGroupCreateRequest> catalogsProductGroupCreateRequest, 
	void(* handler)(CatalogsProductGroup, Error, void* )
	, void* userData);

/*! \brief Create product group. *Asynchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/features/catalog-management/'>Learn more</a>.</strong>  Create product group to use in Catalogs.
 * \param catalogsProductGroupCreateRequest Request object used to created a catalogs product group. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool catalogsProductGroupsCreateAsync(char * accessToken,
	std::shared_ptr<CatalogsProductGroupCreateRequest> catalogsProductGroupCreateRequest, 
	void(* handler)(CatalogsProductGroup, Error, void* )
	, void* userData);


/*! \brief Delete product group. *Synchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/features/catalog-management/'>Learn more</a>.</strong>  Delete a product group from being in use in Catalogs.
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
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/features/catalog-management/'>Learn more</a>.</strong>  Delete a product group from being in use in Catalogs.
 * \param productGroupId Unique identifier of a product group *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool catalogsProductGroupsDeleteAsync(char * accessToken,
	std::string productGroupId, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Get a product group. *Synchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/features/catalog-management/'>Learn more</a>.</strong>  Get a singe product group for a given Catalogs Product Group Id.
 * \param productGroupId Unique identifier of a product group *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool catalogsProductGroupsGetSync(char * accessToken,
	std::string productGroupId, 
	void(* handler)(CatalogsProductGroup, Error, void* )
	, void* userData);

/*! \brief Get a product group. *Asynchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/features/catalog-management/'>Learn more</a>.</strong>  Get a singe product group for a given Catalogs Product Group Id.
 * \param productGroupId Unique identifier of a product group *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool catalogsProductGroupsGetAsync(char * accessToken,
	std::string productGroupId, 
	void(* handler)(CatalogsProductGroup, Error, void* )
	, void* userData);


/*! \brief Get product groups list. *Synchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/features/catalog-management/'>Learn more</a>.</strong>  Get a list of product groups for a given Catalogs Feed Id.
 * \param feedId Unique identifier of a feed *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool catalogsProductGroupsListSync(char * accessToken,
	std::string feedId, std::string bookmark, int pageSize, 
	void(* handler)(Catalogs_product_groups_list_200_response, Error, void* )
	, void* userData);

/*! \brief Get product groups list. *Asynchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/features/catalog-management/'>Learn more</a>.</strong>  Get a list of product groups for a given Catalogs Feed Id.
 * \param feedId Unique identifier of a feed *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool catalogsProductGroupsListAsync(char * accessToken,
	std::string feedId, std::string bookmark, int pageSize, 
	void(* handler)(Catalogs_product_groups_list_200_response, Error, void* )
	, void* userData);


/*! \brief Get product counts for a given product group. *Synchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/features/catalog-management/'>Learn more</a>.</strong> Get a product counts for a given Catalogs Product Group.
 * \param productGroupId Unique identifier of a product group *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool catalogsProductGroupsProductCountsGetSync(char * accessToken,
	std::string productGroupId, 
	void(* handler)(CatalogsProductGroupProductCounts, Error, void* )
	, void* userData);

/*! \brief Get product counts for a given product group. *Asynchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/features/catalog-management/'>Learn more</a>.</strong> Get a product counts for a given Catalogs Product Group.
 * \param productGroupId Unique identifier of a product group *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool catalogsProductGroupsProductCountsGetAsync(char * accessToken,
	std::string productGroupId, 
	void(* handler)(CatalogsProductGroupProductCounts, Error, void* )
	, void* userData);


/*! \brief Update product group. *Synchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/features/catalog-management/'>Learn more</a>.</strong>  Update product group to use in Catalogs.
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
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/features/catalog-management/'>Learn more</a>.</strong>  Update product group to use in Catalogs.
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
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/features/catalog-management/'>Learn more</a>.</strong>  Fetch a feed processing results owned by the owner user account. Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future.
 * \param feedId Unique identifier of a feed *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool feedProcessingResultsListSync(char * accessToken,
	std::string feedId, std::string bookmark, int pageSize, 
	void(* handler)(Feed_processing_results_list_200_response, Error, void* )
	, void* userData);

/*! \brief List processing results for a given feed. *Asynchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/features/catalog-management/'>Learn more</a>.</strong>  Fetch a feed processing results owned by the owner user account. Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future.
 * \param feedId Unique identifier of a feed *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool feedProcessingResultsListAsync(char * accessToken,
	std::string feedId, std::string bookmark, int pageSize, 
	void(* handler)(Feed_processing_results_list_200_response, Error, void* )
	, void* userData);


/*! \brief Create feed. *Synchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/features/catalog-management/'>Learn more</a>.</strong>  Create a new feed owned by the \"operating user_account\".
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
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/features/catalog-management/'>Learn more</a>.</strong>  Create a new feed owned by the \"operating user_account\".
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
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/features/catalog-management/'>Learn more</a>.</strong>  Delete a feed owned by the \"operating user_account\".
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
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/features/catalog-management/'>Learn more</a>.</strong>  Delete a feed owned by the \"operating user_account\".
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
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/features/catalog-management/'>Learn more</a>.</strong>  Get a single feed owned by the \"operating user_account\".
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
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/features/catalog-management/'>Learn more</a>.</strong>  Get a single feed owned by the \"operating user_account\".
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
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/features/catalog-management/'>Learn more</a>.</strong>  Fetch feeds owned by the \"operating user_account\".
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool feedsListSync(char * accessToken,
	std::string bookmark, int pageSize, 
	void(* handler)(Feeds_list_200_response, Error, void* )
	, void* userData);

/*! \brief List feeds. *Asynchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/features/catalog-management/'>Learn more</a>.</strong>  Fetch feeds owned by the \"operating user_account\".
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool feedsListAsync(char * accessToken,
	std::string bookmark, int pageSize, 
	void(* handler)(Feeds_list_200_response, Error, void* )
	, void* userData);


/*! \brief Update feed. *Synchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/features/catalog-management/'>Learn more</a>.</strong>  Update a feed owned by the \"operating user_account\".
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
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/features/catalog-management/'>Learn more</a>.</strong>  Update a feed owned by the \"operating user_account\".
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
 * Get a single catalogs items batch created by the \"operating user_account\". <a href=\"/docs/features/catalog-management/#Using%20batch%20updates%20for%20catalog%20management\" target=\"_blank\">See detailed documentation here.</a>
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
 * Get a single catalogs items batch created by the \"operating user_account\". <a href=\"/docs/features/catalog-management/#Using%20batch%20updates%20for%20catalog%20management\" target=\"_blank\">See detailed documentation here.</a>
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
 * This endpoint supports multiple operations on a set of one or more catalog items. <a href=\"/docs/features/catalog-management/#Using%20batch%20updates%20for%20catalog%20management\" target=\"_blank\">See detailed documentation here.</a>
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
 * This endpoint supports multiple operations on a set of one or more catalog items. <a href=\"/docs/features/catalog-management/#Using%20batch%20updates%20for%20catalog%20management\" target=\"_blank\">See detailed documentation here.</a>
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
 * Get the items of the catalog created by the \"operating user_account\". <a href=\"/docs/features/catalog-management/#Using%20batch%20updates%20for%20catalog%20management\" target=\"_blank\">See detailed documentation here.</a>
 * \param country Country for the Catalogs Items *Required*
 * \param itemIds Catalogs Item ids *Required*
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
 * Get the items of the catalog created by the \"operating user_account\". <a href=\"/docs/features/catalog-management/#Using%20batch%20updates%20for%20catalog%20management\" target=\"_blank\">See detailed documentation here.</a>
 * \param country Country for the Catalogs Items *Required*
 * \param itemIds Catalogs Item ids *Required*
 * \param language Language for the Catalogs Items *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool itemsGetAsync(char * accessToken,
	std::string country, std::list<std::string> itemIds, std::string language, 
	void(* handler)(CatalogsItems, Error, void* )
	, void* userData);


/*! \brief List item issues for a given processing result. *Synchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/features/catalog-management/'>Learn more</a>.</strong>  List item validation issues for a given feed processing result. Please note that for now query parameters 'item_numbers' and 'item_validation_issue' cannot be used simultaneously until it is implemented in some release in the future.
 * \param processingResultId Unique identifier of a feed processing result *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
 * \param itemNumbers Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation.
 * \param itemValidationIssue Filter item validation issues that have a given type of item validation issue.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool itemsIssuesListSync(char * accessToken,
	std::string processingResultId, std::string bookmark, int pageSize, std::list<int> itemNumbers, CatalogsItemValidationIssue itemValidationIssue, 
	void(* handler)(Items_issues_list_200_response, Error, void* )
	, void* userData);

/*! \brief List item issues for a given processing result. *Asynchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/features/catalog-management/'>Learn more</a>.</strong>  List item validation issues for a given feed processing result. Please note that for now query parameters 'item_numbers' and 'item_validation_issue' cannot be used simultaneously until it is implemented in some release in the future.
 * \param processingResultId Unique identifier of a feed processing result *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
 * \param itemNumbers Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation.
 * \param itemValidationIssue Filter item validation issues that have a given type of item validation issue.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool itemsIssuesListAsync(char * accessToken,
	std::string processingResultId, std::string bookmark, int pageSize, std::list<int> itemNumbers, CatalogsItemValidationIssue itemValidationIssue, 
	void(* handler)(Items_issues_list_200_response, Error, void* )
	, void* userData);


/*! \brief List products that meet the criteria of the filter you provide.. *Synchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/features/catalog-management/'>Learn more</a>.</strong> List products Pins that meet the criteria specified in the Catalogs Product Group Filter given in the request. Note: This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent.
 * \param catalogsListProductsByFilterRequest Object holding a group of filters for a catalog product group *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool productsByProductGroupFilterListSync(char * accessToken,
	std::shared_ptr<CatalogsListProductsByFilterRequest> catalogsListProductsByFilterRequest, std::string bookmark, int pageSize, 
	void(* handler)(Products_by_product_group_filter_list_200_response, Error, void* )
	, void* userData);

/*! \brief List products that meet the criteria of the filter you provide.. *Asynchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/features/catalog-management/'>Learn more</a>.</strong> List products Pins that meet the criteria specified in the Catalogs Product Group Filter given in the request. Note: This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent.
 * \param catalogsListProductsByFilterRequest Object holding a group of filters for a catalog product group *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool productsByProductGroupFilterListAsync(char * accessToken,
	std::shared_ptr<CatalogsListProductsByFilterRequest> catalogsListProductsByFilterRequest, std::string bookmark, int pageSize, 
	void(* handler)(Products_by_product_group_filter_list_200_response, Error, void* )
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
