#ifndef _AudiencesManager_H_
#define _AudiencesManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "Audience.h"
#include "AudienceCreateCustomRequest.h"
#include "AudienceCreateRequest.h"
#include "AudienceUpdateRequest.h"
#include "Audiences_list_200_response.h"
#include "Error.h"
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
 * Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with the ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude specific audience_ids when you create an ad group. <p/> For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param audienceCreateRequest List of ads to create, size limit [1, 30] *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool audiencesCreateSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<AudienceCreateRequest> audienceCreateRequest, 
	void(* handler)(Audience, Error, void* )
	, void* userData);

/*! \brief Create audience. *Asynchronous*
 *
 * Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with the ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude specific audience_ids when you create an ad group. <p/> For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param audienceCreateRequest List of ads to create, size limit [1, 30] *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool audiencesCreateAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<AudienceCreateRequest> audienceCreateRequest, 
	void(* handler)(Audience, Error, void* )
	, void* userData);


/*! \brief Create custom audience. *Synchronous*
 *
 * Create a custom audience and find the audiences you want your ads to reach.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param audienceCreateCustomRequest Custom audience to create. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool audiencesCreateCustomSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<AudienceCreateCustomRequest> audienceCreateCustomRequest, 
	void(* handler)(Audience, Error, void* )
	, void* userData);

/*! \brief Create custom audience. *Asynchronous*
 *
 * Create a custom audience and find the audiences you want your ads to reach.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param audienceCreateCustomRequest Custom audience to create. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool audiencesCreateCustomAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<AudienceCreateCustomRequest> audienceCreateCustomRequest, 
	void(* handler)(Audience, Error, void* )
	, void* userData);


/*! \brief Get audience. *Synchronous*
 *
 * Get a specific audience given the audience ID.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param audienceId Unique identifier of an audience *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool audiencesGetSync(char * accessToken,
	std::string adAccountId, std::string audienceId, 
	void(* handler)(Audience, Error, void* )
	, void* userData);

/*! \brief Get audience. *Asynchronous*
 *
 * Get a specific audience given the audience ID.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param audienceId Unique identifier of an audience *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool audiencesGetAsync(char * accessToken,
	std::string adAccountId, std::string audienceId, 
	void(* handler)(Audience, Error, void* )
	, void* userData);


/*! \brief List audiences. *Synchronous*
 *
 * Get list of audiences for the ad account.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. For received audiences, it is sorted by sharing event time. Note that higher-value IDs are associated with more-recently added items.
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
 * \param ownershipType <strong>This feature is currently in beta and not available to all apps.</strong> Filter audiences by ownership type.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool audiencesListSync(char * accessToken,
	std::string adAccountId, std::string bookmark, std::string order, int pageSize, std::string ownershipType, 
	void(* handler)(Audiences_list_200_response, Error, void* )
	, void* userData);

/*! \brief List audiences. *Asynchronous*
 *
 * Get list of audiences for the ad account.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. For received audiences, it is sorted by sharing event time. Note that higher-value IDs are associated with more-recently added items.
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
 * \param ownershipType <strong>This feature is currently in beta and not available to all apps.</strong> Filter audiences by ownership type.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool audiencesListAsync(char * accessToken,
	std::string adAccountId, std::string bookmark, std::string order, int pageSize, std::string ownershipType, 
	void(* handler)(Audiences_list_200_response, Error, void* )
	, void* userData);


/*! \brief Update audience. *Synchronous*
 *
 * Update (edit or remove) an existing targeting audience.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param audienceId Unique identifier of an audience *Required*
 * \param audienceUpdateRequest The audience to be updated.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool audiencesUpdateSync(char * accessToken,
	std::string adAccountId, std::string audienceId, std::shared_ptr<AudienceUpdateRequest> audienceUpdateRequest, 
	void(* handler)(Audience, Error, void* )
	, void* userData);

/*! \brief Update audience. *Asynchronous*
 *
 * Update (edit or remove) an existing targeting audience.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param audienceId Unique identifier of an audience *Required*
 * \param audienceUpdateRequest The audience to be updated.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool audiencesUpdateAsync(char * accessToken,
	std::string adAccountId, std::string audienceId, std::shared_ptr<AudienceUpdateRequest> audienceUpdateRequest, 
	void(* handler)(Audience, Error, void* )
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
