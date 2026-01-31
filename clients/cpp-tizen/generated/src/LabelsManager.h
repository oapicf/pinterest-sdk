#ifndef _LabelsManager_H_
#define _LabelsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "Error.h"
#include "LabelCreateRequest.h"
#include "LabelUpdateRequest.h"
#include "LabelsResponse.h"
#include "Labels_list_200_response.h"
#include <list>
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Labels Labels
 * \ingroup Operations
 *  @{
 */
class LabelsManager {
public:
	LabelsManager();
	virtual ~LabelsManager();

/*! \brief Create labels. *Synchronous*
 *
 * <p> <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a> This endpoint is not available to all users. </p> <p>   Apply one or more labels to a campaign.   Currently, you can apply brand and custom labels. Future releases will provide more options.    <b>Note:</b> You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.  </p>
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param labelCreateRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool labelsCreateSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<LabelCreateRequest> labelCreateRequest, 
	void(* handler)(LabelsResponse, Error, void* )
	, void* userData);

/*! \brief Create labels. *Asynchronous*
 *
 * <p> <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a> This endpoint is not available to all users. </p> <p>   Apply one or more labels to a campaign.   Currently, you can apply brand and custom labels. Future releases will provide more options.    <b>Note:</b> You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.  </p>
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param labelCreateRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool labelsCreateAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<LabelCreateRequest> labelCreateRequest, 
	void(* handler)(LabelsResponse, Error, void* )
	, void* userData);


/*! \brief List labels. *Synchronous*
 *
 * <p>   <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>   This endpoint is not available to all users. </p> <p>   See a list of labels for assets that your account owns, and filter the list by different criteria. </p>
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param campaignIds List of Campaign Ids to use to filter the results.
 * \param labelIds List of Label Ids to use to filter the results.
 * \param entityStatuses Label entity status
 * \param labelTypes Label type.
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
 * \param bookmark Cursor used to fetch the next page of items
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool labelsListSync(char * accessToken,
	std::string adAccountId, std::list<std::string> campaignIds, std::list<std::string> labelIds, std::list<std::string> entityStatuses, std::list<std::string> labelTypes, int pageSize, std::string bookmark, 
	void(* handler)(Labels_list_200_response, Error, void* )
	, void* userData);

/*! \brief List labels. *Asynchronous*
 *
 * <p>   <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>   This endpoint is not available to all users. </p> <p>   See a list of labels for assets that your account owns, and filter the list by different criteria. </p>
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param campaignIds List of Campaign Ids to use to filter the results.
 * \param labelIds List of Label Ids to use to filter the results.
 * \param entityStatuses Label entity status
 * \param labelTypes Label type.
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
 * \param bookmark Cursor used to fetch the next page of items
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool labelsListAsync(char * accessToken,
	std::string adAccountId, std::list<std::string> campaignIds, std::list<std::string> labelIds, std::list<std::string> entityStatuses, std::list<std::string> labelTypes, int pageSize, std::string bookmark, 
	void(* handler)(Labels_list_200_response, Error, void* )
	, void* userData);


/*! \brief Update labels. *Synchronous*
 *
 * <p>   <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>   This endpoint is not available to all users. </p> <p>   Change the properties of one or more labels. </p>
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param labelUpdateRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool labelsUpdateSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<LabelUpdateRequest> labelUpdateRequest, 
	void(* handler)(LabelsResponse, Error, void* )
	, void* userData);

/*! \brief Update labels. *Asynchronous*
 *
 * <p>   <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>   This endpoint is not available to all users. </p> <p>   Change the properties of one or more labels. </p>
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param labelUpdateRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool labelsUpdateAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<LabelUpdateRequest> labelUpdateRequest, 
	void(* handler)(LabelsResponse, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.pinterest.com/v5";
	}
};
/** @}*/

}
}
#endif /* LabelsManager_H_ */
