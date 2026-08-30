#ifndef _AudiencesManager_H_
#define _AudiencesManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "AdAccountsAudience.h"
#include "AdAccountsAudienceCreate.h"
#include "AdAccountsAudienceUpdate.h"
#include "AudienceOwnershipType.h"
#include "Audiences_list_200_response.h"
#include "Pinterest.Lib.Error.h"
#include "Pinterest.Lib.PaginationOrder.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Audiences Audiences
 * \ingroup Operations
 *  @{
 */
class AudiencesManager {
public:
	AudiencesManager();
	virtual ~AudiencesManager();

/*! \brief Create audience. *Synchronous*
 *
 * Create a new audience for the ad account.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param adAccountsAudienceCreate  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool audiencesCreateSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<AdAccountsAudienceCreate> adAccountsAudienceCreate, 
	void(* handler)(AdAccountsAudience, Error, void* )
	, void* userData);

/*! \brief Create audience. *Asynchronous*
 *
 * Create a new audience for the ad account.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param adAccountsAudienceCreate  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool audiencesCreateAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<AdAccountsAudienceCreate> adAccountsAudienceCreate, 
	void(* handler)(AdAccountsAudience, Error, void* )
	, void* userData);


/*! \brief Get audience. *Synchronous*
 *
 * Get a specific audience given the audience ID.
 * \param audienceId Audience ID. *Required*
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool audiencesGetSync(char * accessToken,
	std::string audienceId, std::string adAccountId, 
	void(* handler)(AdAccountsAudience, Error, void* )
	, void* userData);

/*! \brief Get audience. *Asynchronous*
 *
 * Get a specific audience given the audience ID.
 * \param audienceId Audience ID. *Required*
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool audiencesGetAsync(char * accessToken,
	std::string audienceId, std::string adAccountId, 
	void(* handler)(AdAccountsAudience, Error, void* )
	, void* userData);


/*! \brief List audiences. *Synchronous*
 *
 * Get list of audiences for the ad account.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
 * \param order The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
 * \param ownershipType 
 * \param excludeNca When true, excludes audiences derived from new customer acquisition (expanded matching) customer lists from the result. Defaults to false (include all).
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool audiencesListSync(char * accessToken,
	std::string adAccountId, std::string bookmark, int pageSize, Pinterest.Lib.PaginationOrder order, AudienceOwnershipType ownershipType, bool excludeNca, 
	void(* handler)(Audiences_list_200_response, Error, void* )
	, void* userData);

/*! \brief List audiences. *Asynchronous*
 *
 * Get list of audiences for the ad account.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
 * \param order The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
 * \param ownershipType 
 * \param excludeNca When true, excludes audiences derived from new customer acquisition (expanded matching) customer lists from the result. Defaults to false (include all).
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool audiencesListAsync(char * accessToken,
	std::string adAccountId, std::string bookmark, int pageSize, Pinterest.Lib.PaginationOrder order, AudienceOwnershipType ownershipType, bool excludeNca, 
	void(* handler)(Audiences_list_200_response, Error, void* )
	, void* userData);


/*! \brief Update audience. *Synchronous*
 *
 * Update an existing audience for the ad account.
 * \param audienceId Audience ID. *Required*
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param adAccountsAudienceUpdate  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool audiencesUpdateSync(char * accessToken,
	std::string audienceId, std::string adAccountId, std::shared_ptr<AdAccountsAudienceUpdate> adAccountsAudienceUpdate, 
	void(* handler)(AdAccountsAudience, Error, void* )
	, void* userData);

/*! \brief Update audience. *Asynchronous*
 *
 * Update an existing audience for the ad account.
 * \param audienceId Audience ID. *Required*
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param adAccountsAudienceUpdate  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool audiencesUpdateAsync(char * accessToken,
	std::string audienceId, std::string adAccountId, std::shared_ptr<AdAccountsAudienceUpdate> adAccountsAudienceUpdate, 
	void(* handler)(AdAccountsAudience, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.pinterest.com/v5";
	}
};
/** @}*/

}
}
#endif /* AudiencesManager_H_ */
