#ifndef _OrderLinesManager_H_
#define _OrderLinesManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "Error.h"
#include "OrderLine.h"
#include "Order_lines_list_200_response.h"
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
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param orderLineId Unique identifier of an order line. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool orderLinesGetSync(char * accessToken,
	std::string adAccountId, std::string orderLineId, 
	void(* handler)(OrderLine, Error, void* )
	, void* userData);

/*! \brief Get order line. *Asynchronous*
 *
 * Get a specific existing order line associated with an ad account.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param orderLineId Unique identifier of an order line. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool orderLinesGetAsync(char * accessToken,
	std::string adAccountId, std::string orderLineId, 
	void(* handler)(OrderLine, Error, void* )
	, void* userData);


/*! \brief Get order lines. *Synchronous*
 *
 * List existing order lines associated with an ad account.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
 * \param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
 * \param bookmark Cursor used to fetch the next page of items
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool orderLinesListSync(char * accessToken,
	std::string adAccountId, int pageSize, std::string order, std::string bookmark, 
	void(* handler)(Order_lines_list_200_response, Error, void* )
	, void* userData);

/*! \brief Get order lines. *Asynchronous*
 *
 * List existing order lines associated with an ad account.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
 * \param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
 * \param bookmark Cursor used to fetch the next page of items
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool orderLinesListAsync(char * accessToken,
	std::string adAccountId, int pageSize, std::string order, std::string bookmark, 
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
