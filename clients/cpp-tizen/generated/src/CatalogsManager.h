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
#include <list>
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

/*! \brief List products. *Synchronous*
 *
 * Get a list of product pins for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>
 * \param productGroupId Unique identifier of a product group *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool catalogsProductGroupPinsListSync(char * accessToken,
	std::string productGroupId, std::string bookmark, int pageSize, std::string adAccountId, 
	void(* handler)(Products_by_product_group_filter_list_200_response, Error, void* )
	, void* userData);

/*! \brief List products. *Asynchronous*
 *
 * Get a list of product pins for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>
 * \param productGroupId Unique identifier of a product group *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool catalogsProductGroupPinsListAsync(char * accessToken,
	std::string productGroupId, std::string bookmark, int pageSize, std::string adAccountId, 
	void(* handler)(Products_by_product_group_filter_list_200_response, Error, void* )
	, void* userData);


/*! \brief Create product group. *Synchronous*
 *
 * Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>
 * \param catalogsProductGroupCreateRequest Request object used to created a catalogs product group. *Required*
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool catalogsProductGroupsCreateSync(char * accessToken,
	std::shared_ptr<CatalogsProductGroupCreateRequest> catalogsProductGroupCreateRequest, std::string adAccountId, 
	void(* handler)(CatalogsProductGroup, Error, void* )
	, void* userData);

/*! \brief Create product group. *Asynchronous*
 *
 * Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>
 * \param catalogsProductGroupCreateRequest Request object used to created a catalogs product group. *Required*
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool catalogsProductGroupsCreateAsync(char * accessToken,
	std::shared_ptr<CatalogsProductGroupCreateRequest> catalogsProductGroupCreateRequest, std::string adAccountId, 
	void(* handler)(CatalogsProductGroup, Error, void* )
	, void* userData);


/*! \brief Delete product group. *Synchronous*
 *
 * Delete a product group owned by the \"operation user_account\" from being in use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>
 * \param productGroupId Unique identifier of a product group *Required*
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool catalogsProductGroupsDeleteSync(char * accessToken,
	std::string productGroupId, std::string adAccountId, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Delete product group. *Asynchronous*
 *
 * Delete a product group owned by the \"operation user_account\" from being in use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>
 * \param productGroupId Unique identifier of a product group *Required*
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool catalogsProductGroupsDeleteAsync(char * accessToken,
	std::string productGroupId, std::string adAccountId, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Get product group. *Synchronous*
 *
 * Get a singe product group for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>
 * \param productGroupId Unique identifier of a product group *Required*
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool catalogsProductGroupsGetSync(char * accessToken,
	std::string productGroupId, std::string adAccountId, 
	void(* handler)(CatalogsProductGroup, Error, void* )
	, void* userData);

/*! \brief Get product group. *Asynchronous*
 *
 * Get a singe product group for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>
 * \param productGroupId Unique identifier of a product group *Required*
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool catalogsProductGroupsGetAsync(char * accessToken,
	std::string productGroupId, std::string adAccountId, 
	void(* handler)(CatalogsProductGroup, Error, void* )
	, void* userData);


/*! \brief List product groups. *Synchronous*
 *
 * Get a list of product groups for a given Catalogs Feed Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>
 * \param feedId Unique identifier of a feed *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool catalogsProductGroupsListSync(char * accessToken,
	std::string feedId, std::string bookmark, int pageSize, std::string adAccountId, 
	void(* handler)(Catalogs_product_groups_list_200_response, Error, void* )
	, void* userData);

/*! \brief List product groups. *Asynchronous*
 *
 * Get a list of product groups for a given Catalogs Feed Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>
 * \param feedId Unique identifier of a feed *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool catalogsProductGroupsListAsync(char * accessToken,
	std::string feedId, std::string bookmark, int pageSize, std::string adAccountId, 
	void(* handler)(Catalogs_product_groups_list_200_response, Error, void* )
	, void* userData);


/*! \brief Get product counts. *Synchronous*
 *
 * Get a product counts for a given Catalogs Product Group owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>
 * \param productGroupId Unique identifier of a product group *Required*
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool catalogsProductGroupsProductCountsGetSync(char * accessToken,
	std::string productGroupId, std::string adAccountId, 
	void(* handler)(CatalogsProductGroupProductCounts, Error, void* )
	, void* userData);

/*! \brief Get product counts. *Asynchronous*
 *
 * Get a product counts for a given Catalogs Product Group owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>
 * \param productGroupId Unique identifier of a product group *Required*
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool catalogsProductGroupsProductCountsGetAsync(char * accessToken,
	std::string productGroupId, std::string adAccountId, 
	void(* handler)(CatalogsProductGroupProductCounts, Error, void* )
	, void* userData);


/*! \brief Update product group. *Synchronous*
 *
 * Update product group owned by the \"operation user_account\" to use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>
 * \param productGroupId Unique identifier of a product group *Required*
 * \param catalogsProductGroupUpdateRequest Request object used to Update a catalogs product group. *Required*
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool catalogsProductGroupsUpdateSync(char * accessToken,
	std::string productGroupId, std::shared_ptr<CatalogsProductGroupUpdateRequest> catalogsProductGroupUpdateRequest, std::string adAccountId, 
	void(* handler)(CatalogsProductGroup, Error, void* )
	, void* userData);

/*! \brief Update product group. *Asynchronous*
 *
 * Update product group owned by the \"operation user_account\" to use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>
 * \param productGroupId Unique identifier of a product group *Required*
 * \param catalogsProductGroupUpdateRequest Request object used to Update a catalogs product group. *Required*
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool catalogsProductGroupsUpdateAsync(char * accessToken,
	std::string productGroupId, std::shared_ptr<CatalogsProductGroupUpdateRequest> catalogsProductGroupUpdateRequest, std::string adAccountId, 
	void(* handler)(CatalogsProductGroup, Error, void* )
	, void* userData);


/*! \brief List processing results for a given feed. *Synchronous*
 *
 * Fetch a feed processing results owned by the \"operation user_account\". Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>
 * \param feedId Unique identifier of a feed *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool feedProcessingResultsListSync(char * accessToken,
	std::string feedId, std::string bookmark, int pageSize, std::string adAccountId, 
	void(* handler)(Feed_processing_results_list_200_response, Error, void* )
	, void* userData);

/*! \brief List processing results for a given feed. *Asynchronous*
 *
 * Fetch a feed processing results owned by the \"operation user_account\". Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>
 * \param feedId Unique identifier of a feed *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool feedProcessingResultsListAsync(char * accessToken,
	std::string feedId, std::string bookmark, int pageSize, std::string adAccountId, 
	void(* handler)(Feed_processing_results_list_200_response, Error, void* )
	, void* userData);


/*! \brief Create feed. *Synchronous*
 *
 * Create a new feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>
 * \param catalogsFeedsCreateRequest Request object used to created a feed. *Required*
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool feedsCreateSync(char * accessToken,
	std::shared_ptr<CatalogsFeedsCreateRequest> catalogsFeedsCreateRequest, std::string adAccountId, 
	void(* handler)(CatalogsFeed, Error, void* )
	, void* userData);

/*! \brief Create feed. *Asynchronous*
 *
 * Create a new feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>
 * \param catalogsFeedsCreateRequest Request object used to created a feed. *Required*
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool feedsCreateAsync(char * accessToken,
	std::shared_ptr<CatalogsFeedsCreateRequest> catalogsFeedsCreateRequest, std::string adAccountId, 
	void(* handler)(CatalogsFeed, Error, void* )
	, void* userData);


/*! \brief Delete feed. *Synchronous*
 *
 * Delete a feed owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>
 * \param feedId Unique identifier of a feed *Required*
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool feedsDeleteSync(char * accessToken,
	std::string feedId, std::string adAccountId, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Delete feed. *Asynchronous*
 *
 * Delete a feed owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>
 * \param feedId Unique identifier of a feed *Required*
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool feedsDeleteAsync(char * accessToken,
	std::string feedId, std::string adAccountId, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Get feed. *Synchronous*
 *
 * Get a single feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>
 * \param feedId Unique identifier of a feed *Required*
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool feedsGetSync(char * accessToken,
	std::string feedId, std::string adAccountId, 
	void(* handler)(CatalogsFeed, Error, void* )
	, void* userData);

/*! \brief Get feed. *Asynchronous*
 *
 * Get a single feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>
 * \param feedId Unique identifier of a feed *Required*
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool feedsGetAsync(char * accessToken,
	std::string feedId, std::string adAccountId, 
	void(* handler)(CatalogsFeed, Error, void* )
	, void* userData);


/*! \brief List feeds. *Synchronous*
 *
 * Fetch feeds owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool feedsListSync(char * accessToken,
	std::string bookmark, int pageSize, std::string adAccountId, 
	void(* handler)(Feeds_list_200_response, Error, void* )
	, void* userData);

/*! \brief List feeds. *Asynchronous*
 *
 * Fetch feeds owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool feedsListAsync(char * accessToken,
	std::string bookmark, int pageSize, std::string adAccountId, 
	void(* handler)(Feeds_list_200_response, Error, void* )
	, void* userData);


/*! \brief Update feed. *Synchronous*
 *
 * Update a feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>
 * \param feedId Unique identifier of a feed *Required*
 * \param catalogsFeedsUpdateRequest Request object used to update a feed. *Required*
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool feedsUpdateSync(char * accessToken,
	std::string feedId, std::shared_ptr<CatalogsFeedsUpdateRequest> catalogsFeedsUpdateRequest, std::string adAccountId, 
	void(* handler)(CatalogsFeed, Error, void* )
	, void* userData);

/*! \brief Update feed. *Asynchronous*
 *
 * Update a feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>
 * \param feedId Unique identifier of a feed *Required*
 * \param catalogsFeedsUpdateRequest Request object used to update a feed. *Required*
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool feedsUpdateAsync(char * accessToken,
	std::string feedId, std::shared_ptr<CatalogsFeedsUpdateRequest> catalogsFeedsUpdateRequest, std::string adAccountId, 
	void(* handler)(CatalogsFeed, Error, void* )
	, void* userData);


/*! \brief Get catalogs items batch. *Synchronous*
 *
 * Get a single catalogs items batch owned by the \"operating user_account\". <a href=\"/docs/shopping/catalog/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.
 * \param batchId Id of a catalogs items batch to fetch *Required*
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool itemsBatchGetSync(char * accessToken,
	std::string batchId, std::string adAccountId, 
	void(* handler)(CatalogsItemsBatch, Error, void* )
	, void* userData);

/*! \brief Get catalogs items batch. *Asynchronous*
 *
 * Get a single catalogs items batch owned by the \"operating user_account\". <a href=\"/docs/shopping/catalog/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.
 * \param batchId Id of a catalogs items batch to fetch *Required*
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool itemsBatchGetAsync(char * accessToken,
	std::string batchId, std::string adAccountId, 
	void(* handler)(CatalogsItemsBatch, Error, void* )
	, void* userData);


/*! \brief Operate on item batch. *Synchronous*
 *
 * This endpoint supports multiple operations on a set of one or more catalog items owned by the \"operation user_account\". <a href=\"/docs/shopping/catalog/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.
 * \param catalogsItemsBatchRequest Request object used to create catalogs items in a batch *Required*
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool itemsBatchPostSync(char * accessToken,
	std::shared_ptr<CatalogsItemsBatchRequest> catalogsItemsBatchRequest, std::string adAccountId, 
	void(* handler)(CatalogsItemsBatch, Error, void* )
	, void* userData);

/*! \brief Operate on item batch. *Asynchronous*
 *
 * This endpoint supports multiple operations on a set of one or more catalog items owned by the \"operation user_account\". <a href=\"/docs/shopping/catalog/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.
 * \param catalogsItemsBatchRequest Request object used to create catalogs items in a batch *Required*
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool itemsBatchPostAsync(char * accessToken,
	std::shared_ptr<CatalogsItemsBatchRequest> catalogsItemsBatchRequest, std::string adAccountId, 
	void(* handler)(CatalogsItemsBatch, Error, void* )
	, void* userData);


/*! \brief Get catalogs items. *Synchronous*
 *
 * Get the items of the catalog owned by the \"operation user_account\". <a href=\"/docs/shopping/catalog/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.
 * \param country Country for the Catalogs Items *Required*
 * \param itemIds Catalogs Item ids *Required*
 * \param language Language for the Catalogs Items *Required*
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool itemsGetSync(char * accessToken,
	std::string country, std::list<std::string> itemIds, std::string language, std::string adAccountId, 
	void(* handler)(CatalogsItems, Error, void* )
	, void* userData);

/*! \brief Get catalogs items. *Asynchronous*
 *
 * Get the items of the catalog owned by the \"operation user_account\". <a href=\"/docs/shopping/catalog/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.
 * \param country Country for the Catalogs Items *Required*
 * \param itemIds Catalogs Item ids *Required*
 * \param language Language for the Catalogs Items *Required*
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool itemsGetAsync(char * accessToken,
	std::string country, std::list<std::string> itemIds, std::string language, std::string adAccountId, 
	void(* handler)(CatalogsItems, Error, void* )
	, void* userData);


/*! \brief List item issues for a given processing result. *Synchronous*
 *
 * List item validation issues for a given feed processing result owned by the \"operation user_account\". Please note that for now query parameters 'item_numbers' and 'item_validation_issue' cannot be used simultaneously until it is implemented in some release in the future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>
 * \param processingResultId Unique identifier of a feed processing result *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
 * \param itemNumbers Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation.
 * \param itemValidationIssue Filter item validation issues that have a given type of item validation issue.
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool itemsIssuesListSync(char * accessToken,
	std::string processingResultId, std::string bookmark, int pageSize, std::list<int> itemNumbers, CatalogsItemValidationIssue itemValidationIssue, std::string adAccountId, 
	void(* handler)(Items_issues_list_200_response, Error, void* )
	, void* userData);

/*! \brief List item issues for a given processing result. *Asynchronous*
 *
 * List item validation issues for a given feed processing result owned by the \"operation user_account\". Please note that for now query parameters 'item_numbers' and 'item_validation_issue' cannot be used simultaneously until it is implemented in some release in the future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>
 * \param processingResultId Unique identifier of a feed processing result *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
 * \param itemNumbers Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation.
 * \param itemValidationIssue Filter item validation issues that have a given type of item validation issue.
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool itemsIssuesListAsync(char * accessToken,
	std::string processingResultId, std::string bookmark, int pageSize, std::list<int> itemNumbers, CatalogsItemValidationIssue itemValidationIssue, std::string adAccountId, 
	void(* handler)(Items_issues_list_200_response, Error, void* )
	, void* userData);


/*! \brief List filtered products. *Synchronous*
 *
 * List products Pins owned by the \"operation user_account\" that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>
 * \param catalogsListProductsByFilterRequest Object holding a group of filters for a catalog product group *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool productsByProductGroupFilterListSync(char * accessToken,
	std::shared_ptr<CatalogsListProductsByFilterRequest> catalogsListProductsByFilterRequest, std::string bookmark, int pageSize, std::string adAccountId, 
	void(* handler)(Products_by_product_group_filter_list_200_response, Error, void* )
	, void* userData);

/*! \brief List filtered products. *Asynchronous*
 *
 * List products Pins owned by the \"operation user_account\" that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>
 * \param catalogsListProductsByFilterRequest Object holding a group of filters for a catalog product group *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool productsByProductGroupFilterListAsync(char * accessToken,
	std::shared_ptr<CatalogsListProductsByFilterRequest> catalogsListProductsByFilterRequest, std::string bookmark, int pageSize, std::string adAccountId, 
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
