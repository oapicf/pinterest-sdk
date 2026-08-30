#ifndef _ConversionDeletionRequestsManager_H_
#define _ConversionDeletionRequestsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "ConversionDeletionRequest.h"
#include "ConversionDeletionRequestCreate.h"
#include "Conversion_deletion_request_list_200_response.h"
#include "Pinterest.Lib.Error.h"
#include "Pinterest.Lib.PaginationOrder.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup ConversionDeletionRequests ConversionDeletionRequests
 * \ingroup Operations
 *  @{
 */
class ConversionDeletionRequestsManager {
public:
	ConversionDeletionRequestsManager();
	virtual ~ConversionDeletionRequestsManager();

/*! \brief Create a conversion deletion request. *Synchronous*
 *
 * **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Create a request to delete conversion data for a list of user emails and/or EPIKs, limited to the specified `ad_account_id`. After 72 hours the request is processed and submitted to our deletion process. Then the deletion process ensures deletion within a 30 days period, once the request is submitted to the deletion process it cannot be canceled.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param conversionDeletionRequestCreate  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool conversionDeletionRequestCreateSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<ConversionDeletionRequestCreate> conversionDeletionRequestCreate, 
	void(* handler)(ConversionDeletionRequest, Error, void* )
	, void* userData);

/*! \brief Create a conversion deletion request. *Asynchronous*
 *
 * **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Create a request to delete conversion data for a list of user emails and/or EPIKs, limited to the specified `ad_account_id`. After 72 hours the request is processed and submitted to our deletion process. Then the deletion process ensures deletion within a 30 days period, once the request is submitted to the deletion process it cannot be canceled.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param conversionDeletionRequestCreate  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool conversionDeletionRequestCreateAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<ConversionDeletionRequestCreate> conversionDeletionRequestCreate, 
	void(* handler)(ConversionDeletionRequest, Error, void* )
	, void* userData);


/*! \brief Delete a conversion deletion request. *Synchronous*
 *
 * **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Delete a conversion deletion request from `ad_account_id` with `request_id`. This will cancel the request and prevent it from being processed. This can only be done if the request is in the `PENDING` status and before the 72 hours mark.
 * \param requestId Unique identifier of the conversion deletion request *Required*
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool conversionDeletionRequestDeleteSync(char * accessToken,
	std::string requestId, std::string adAccountId, 
	void(* handler)(ConversionDeletionRequest, Error, void* )
	, void* userData);

/*! \brief Delete a conversion deletion request. *Asynchronous*
 *
 * **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Delete a conversion deletion request from `ad_account_id` with `request_id`. This will cancel the request and prevent it from being processed. This can only be done if the request is in the `PENDING` status and before the 72 hours mark.
 * \param requestId Unique identifier of the conversion deletion request *Required*
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool conversionDeletionRequestDeleteAsync(char * accessToken,
	std::string requestId, std::string adAccountId, 
	void(* handler)(ConversionDeletionRequest, Error, void* )
	, void* userData);


/*! \brief Get a single conversion deletion request. *Synchronous*
 *
 * **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a single conversion deletion request from `ad_account_id` with `request_id`.
 * \param requestId Unique identifier of the conversion deletion request *Required*
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool conversionDeletionRequestGetSync(char * accessToken,
	std::string requestId, std::string adAccountId, 
	void(* handler)(ConversionDeletionRequest, Error, void* )
	, void* userData);

/*! \brief Get a single conversion deletion request. *Asynchronous*
 *
 * **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a single conversion deletion request from `ad_account_id` with `request_id`.
 * \param requestId Unique identifier of the conversion deletion request *Required*
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool conversionDeletionRequestGetAsync(char * accessToken,
	std::string requestId, std::string adAccountId, 
	void(* handler)(ConversionDeletionRequest, Error, void* )
	, void* userData);


/*! \brief List conversion deletion requests. *Synchronous*
 *
 * **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a list of the conversion deletion requests for the specified `ad_account_id`.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
 * \param order The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool conversionDeletionRequestListSync(char * accessToken,
	std::string adAccountId, std::string bookmark, int pageSize, Pinterest.Lib.PaginationOrder order, 
	void(* handler)(Conversion_deletion_request_list_200_response, Error, void* )
	, void* userData);

/*! \brief List conversion deletion requests. *Asynchronous*
 *
 * **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a list of the conversion deletion requests for the specified `ad_account_id`.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
 * \param order The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool conversionDeletionRequestListAsync(char * accessToken,
	std::string adAccountId, std::string bookmark, int pageSize, Pinterest.Lib.PaginationOrder order, 
	void(* handler)(Conversion_deletion_request_list_200_response, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.pinterest.com/v5";
	}
};
/** @}*/

}
}
#endif /* ConversionDeletionRequestsManager_H_ */
