#ifndef _OrderLinesManager_H_
#define _OrderLinesManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "OrderLine.h"
#include "Order_lines_list_200_response.h"
#include "Pinterest.Lib.Error.h"
#include "Pinterest.Lib.PaginationOrder.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup OrderLines OrderLines
 * \ingroup Operations
 *  @{
 */
class OrderLinesManager {
public:
	OrderLinesManager();
	virtual ~OrderLinesManager();

/*! \brief Get order line. *Synchronous*
 *
 * Get a specific existing order line associated with an ad account.
 * \param orderLineId Order line ID. *Required*
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool orderLinesGetSync(char * accessToken,
	std::string orderLineId, std::string adAccountId, 
	void(* handler)(OrderLine, Error, void* )
	, void* userData);

/*! \brief Get order line. *Asynchronous*
 *
 * Get a specific existing order line associated with an ad account.
 * \param orderLineId Order line ID. *Required*
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool orderLinesGetAsync(char * accessToken,
	std::string orderLineId, std::string adAccountId, 
	void(* handler)(OrderLine, Error, void* )
	, void* userData);


/*! \brief Get order lines.. *Synchronous*
 *
 * List existing order lines associated with an ad account.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
 * \param order The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool orderLinesListSync(char * accessToken,
	std::string adAccountId, std::string bookmark, int pageSize, Pinterest.Lib.PaginationOrder order, 
	void(* handler)(Order_lines_list_200_response, Error, void* )
	, void* userData);

/*! \brief Get order lines.. *Asynchronous*
 *
 * List existing order lines associated with an ad account.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
 * \param order The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool orderLinesListAsync(char * accessToken,
	std::string adAccountId, std::string bookmark, int pageSize, Pinterest.Lib.PaginationOrder order, 
	void(* handler)(Order_lines_list_200_response, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.pinterest.com/v5";
	}
};
/** @}*/

}
}
#endif /* OrderLinesManager_H_ */
