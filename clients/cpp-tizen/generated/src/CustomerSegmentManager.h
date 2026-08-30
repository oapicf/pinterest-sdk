#ifndef _CustomerSegmentManager_H_
#define _CustomerSegmentManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "CustomerSegment.h"
#include "CustomerSegmentCreate.h"
#include "CustomerSegmentUpdateRequestUpdateWithRequiredBody.h"
#include "Customer_segment_list_200_response.h"
#include "Pinterest.Lib.Error.h"
#include "Pinterest.Lib.PaginationOrder.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup CustomerSegment CustomerSegment
 * \ingroup Operations
 *  @{
 */
class CustomerSegmentManager {
public:
	CustomerSegmentManager();
	virtual ~CustomerSegmentManager();

/*! \brief Create customer segments. *Synchronous*
 *
 * Customer segments allow advertisers to define existing customers for Pinterest Performance+ campaigns. Customer segments are made up of audience lists.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param customerSegmentCreate  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool customerSegmentCreateSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<CustomerSegmentCreate> customerSegmentCreate, 
	void(* handler)(CustomerSegment, Error, void* )
	, void* userData);

/*! \brief Create customer segments. *Asynchronous*
 *
 * Customer segments allow advertisers to define existing customers for Pinterest Performance+ campaigns. Customer segments are made up of audience lists.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param customerSegmentCreate  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool customerSegmentCreateAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<CustomerSegmentCreate> customerSegmentCreate, 
	void(* handler)(CustomerSegment, Error, void* )
	, void* userData);


/*! \brief List customer segments. *Synchronous*
 *
 * Get a list of the customer segments in the specified `ad_account_id`.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
 * \param order The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
 * \param includeSizing Include audience sizing in result or not
 * \param searchQuery Search query. Can contain pin description keywords or comma-separated pin IDs.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool customerSegmentListSync(char * accessToken,
	std::string adAccountId, std::string bookmark, int pageSize, Pinterest.Lib.PaginationOrder order, bool includeSizing, std::string searchQuery, 
	void(* handler)(Customer_segment_list_200_response, Error, void* )
	, void* userData);

/*! \brief List customer segments. *Asynchronous*
 *
 * Get a list of the customer segments in the specified `ad_account_id`.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
 * \param order The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
 * \param includeSizing Include audience sizing in result or not
 * \param searchQuery Search query. Can contain pin description keywords or comma-separated pin IDs.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool customerSegmentListAsync(char * accessToken,
	std::string adAccountId, std::string bookmark, int pageSize, Pinterest.Lib.PaginationOrder order, bool includeSizing, std::string searchQuery, 
	void(* handler)(Customer_segment_list_200_response, Error, void* )
	, void* userData);


/*! \brief Update customer segments. *Synchronous*
 *
 * Update the customer segment given advertiser ID and customer segment ID
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param customerSegmentUpdateRequestUpdateWithRequiredBody  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool customerSegmentUpdateSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<CustomerSegmentUpdateRequestUpdateWithRequiredBody> customerSegmentUpdateRequestUpdateWithRequiredBody, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Update customer segments. *Asynchronous*
 *
 * Update the customer segment given advertiser ID and customer segment ID
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param customerSegmentUpdateRequestUpdateWithRequiredBody  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool customerSegmentUpdateAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<CustomerSegmentUpdateRequestUpdateWithRequiredBody> customerSegmentUpdateRequestUpdateWithRequiredBody, 
	
	void(* handler)(Error, void* ) , void* userData);



	static std::string getBasePath()
	{
		return "https://api.pinterest.com/v5";
	}
};
/** @}*/

}
}
#endif /* CustomerSegmentManager_H_ */
