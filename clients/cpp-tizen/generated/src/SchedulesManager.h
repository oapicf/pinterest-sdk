#ifndef _SchedulesManager_H_
#define _SchedulesManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "Pinterest.Lib.Error.h"
#include "Pinterest.Lib.PaginationOrder.h"
#include "Schedule.h"
#include "ScheduleBatchUpdate.h"
#include "ScheduleCreate.h"
#include "ScheduleStatus.h"
#include "ScheduleType.h"
#include "Schedules_create_200_response_inner.h"
#include "Schedules_list_200_response.h"
#include <list>
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Schedules Schedules
 * \ingroup Operations
 *  @{
 */
class SchedulesManager {
public:
	SchedulesManager();
	virtual ~SchedulesManager();

/*! \brief Create schedules. *Synchronous*
 *
 * Batch create schedules
 * \param adAccountId  *Required*
 * \param scheduleCreate  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool schedulesCreateSync(char * accessToken,
	std::string adAccountId, std::list<ScheduleCreate> scheduleCreate, 
	void(* handler)(std::list<Schedules_create_200_response_inner>, Error, void* )
	, void* userData);

/*! \brief Create schedules. *Asynchronous*
 *
 * Batch create schedules
 * \param adAccountId  *Required*
 * \param scheduleCreate  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool schedulesCreateAsync(char * accessToken,
	std::string adAccountId, std::list<ScheduleCreate> scheduleCreate, 
	void(* handler)(std::list<Schedules_create_200_response_inner>, Error, void* )
	, void* userData);


/*! \brief Get Schedules. *Synchronous*
 *
 * Get schedules for a specific advertiser
 * \param adAccountId  *Required*
 * \param entityIds List of Entity IDs, must be associated with the Ad Accound ID provided in the path. *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
 * \param order The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
 * \param scheduleStatuses Filter schedules by status (one or more)
 * \param scheduleType Filter schedules by a type
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool schedulesListSync(char * accessToken,
	std::string adAccountId, std::list<std::string> entityIds, std::string bookmark, int pageSize, Pinterest.Lib.PaginationOrder order, std::list<ScheduleStatus> scheduleStatuses, ScheduleType scheduleType, 
	void(* handler)(Schedules_list_200_response, Error, void* )
	, void* userData);

/*! \brief Get Schedules. *Asynchronous*
 *
 * Get schedules for a specific advertiser
 * \param adAccountId  *Required*
 * \param entityIds List of Entity IDs, must be associated with the Ad Accound ID provided in the path. *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
 * \param order The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
 * \param scheduleStatuses Filter schedules by status (one or more)
 * \param scheduleType Filter schedules by a type
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool schedulesListAsync(char * accessToken,
	std::string adAccountId, std::list<std::string> entityIds, std::string bookmark, int pageSize, Pinterest.Lib.PaginationOrder order, std::list<ScheduleStatus> scheduleStatuses, ScheduleType scheduleType, 
	void(* handler)(Schedules_list_200_response, Error, void* )
	, void* userData);


/*! \brief Update schedules. *Synchronous*
 *
 * Update one or more schedules
 * \param adAccountId  *Required*
 * \param scheduleBatchUpdate  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool schedulesUpdateSync(char * accessToken,
	std::string adAccountId, std::list<ScheduleBatchUpdate> scheduleBatchUpdate, 
	void(* handler)(std::list<Schedules_create_200_response_inner>, Error, void* )
	, void* userData);

/*! \brief Update schedules. *Asynchronous*
 *
 * Update one or more schedules
 * \param adAccountId  *Required*
 * \param scheduleBatchUpdate  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool schedulesUpdateAsync(char * accessToken,
	std::string adAccountId, std::list<ScheduleBatchUpdate> scheduleBatchUpdate, 
	void(* handler)(std::list<Schedules_create_200_response_inner>, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.pinterest.com/v5";
	}
};
/** @}*/

}
}
#endif /* SchedulesManager_H_ */
