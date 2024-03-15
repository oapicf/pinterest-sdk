#ifndef _ProductGroupsManager_H_
#define _ProductGroupsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "Ad_accounts_catalogs_product_groups_list_200_response.h"
#include "Error.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup ProductGroups ProductGroups
 * \ingroup Operations
 *  @{
 */
class ProductGroupsManager {
public:
	ProductGroupsManager();
	virtual ~ProductGroupsManager();

/*! \brief Get catalog product groups. *Synchronous*
 *
 * This endpoint is completely deprecated. Please use <a href='/docs/api/v5/#operation/catalogs_product_groups/list'>List product groups</a> from Catalogs API instead.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param feedProfileId The feed profile id whose catalog product groups we want to return.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adAccountsCatalogsProductGroupsListSync(char * accessToken,
	std::string adAccountId, std::string feedProfileId, 
	void(* handler)(Ad_accounts_catalogs_product_groups_list_200_response, Error, void* )
	, void* userData);

/*! \brief Get catalog product groups. *Asynchronous*
 *
 * This endpoint is completely deprecated. Please use <a href='/docs/api/v5/#operation/catalogs_product_groups/list'>List product groups</a> from Catalogs API instead.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param feedProfileId The feed profile id whose catalog product groups we want to return.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adAccountsCatalogsProductGroupsListAsync(char * accessToken,
	std::string adAccountId, std::string feedProfileId, 
	void(* handler)(Ad_accounts_catalogs_product_groups_list_200_response, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.pinterest.com/v5";
	}
};
/** @}*/

}
}
#endif /* ProductGroupsManager_H_ */
