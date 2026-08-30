#ifndef TINY_CPP_CLIENT_SchedulesApi_H_
#define TINY_CPP_CLIENT_SchedulesApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "Pinterest.Lib.Error.h"
#include "Pinterest.Lib.PaginationOrder.h"
#include "Schedule.h"
#include "ScheduleBatchUpdate.h"
#include "ScheduleCreate.h"
#include "ScheduleStatus.h"
#include "ScheduleType.h"
#include "Schedules_create_200_response_inner.h"
#include "Schedules_list_200_response.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class SchedulesApi : public Service {
public:
    SchedulesApi() = default;

    virtual ~SchedulesApi();

    /**
    * Create schedules.
    *
    * Batch create schedules
    * \param adAccountId  *Required*
    * \param scheduleCreate  *Required*
    */
    Response<
                    std::list<Schedules_create_200_response_inner>
        >
    schedules_create(
            
            std::string adAccountId
            , 
            std::list<ScheduleCreate> scheduleCreate
            
            
    );
    /**
    * Get Schedules.
    *
    * Get schedules for a specific advertiser
    * \param adAccountId  *Required*
    * \param entityIds List of Entity IDs, must be associated with the Ad Accound ID provided in the path. *Required*
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    * \param order The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
    * \param scheduleStatuses Filter schedules by status (one or more)
    * \param scheduleType Filter schedules by a type
    */
    Response<
                Schedules_list_200_response
        >
    schedules_list(
            
            std::string adAccountId
            , 
            std::list<std::string> entityIds
            
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            , 
            
            Pinterest.Lib.PaginationOrder order
            , 
            std::list<ScheduleStatus> scheduleStatuses
            
            , 
            
            ScheduleType scheduleType
            
    );
    /**
    * Update schedules.
    *
    * Update one or more schedules
    * \param adAccountId  *Required*
    * \param scheduleBatchUpdate  *Required*
    */
    Response<
                    std::list<Schedules_create_200_response_inner>
        >
    schedules_update(
            
            std::string adAccountId
            , 
            std::list<ScheduleBatchUpdate> scheduleBatchUpdate
            
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_SchedulesApi_H_ */