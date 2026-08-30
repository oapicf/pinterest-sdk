/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Create schedules
* Batch create schedules
*
* adUnderscoreaccountUnderscoreid String 
* scheduleCreate List 
* returns List
* */
const schedules/create = ({ adUnderscoreaccountUnderscoreid, scheduleCreate }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        scheduleCreate,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get Schedules
* Get schedules for a specific advertiser
*
* adUnderscoreaccountUnderscoreid String 
* entityUnderscoreids List List of Entity IDs, must be associated with the Ad Accound ID provided in the path.
* bookmark String Cursor used to fetch the next page of items (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
* order PinterestLibPaginationOrder The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
* scheduleUnderscorestatuses List Filter schedules by status (one or more) (optional)
* scheduleUnderscoretype ScheduleType Filter schedules by a type (optional)
* returns schedules_list_200_response
* */
const schedules/list = ({ adUnderscoreaccountUnderscoreid, entityUnderscoreids, bookmark, pageUnderscoresize, order, scheduleUnderscorestatuses, scheduleUnderscoretype }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        entityUnderscoreids,
        bookmark,
        pageUnderscoresize,
        order,
        scheduleUnderscorestatuses,
        scheduleUnderscoretype,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Update schedules
* Update one or more schedules
*
* adUnderscoreaccountUnderscoreid String 
* scheduleBatchUpdate List 
* returns List
* */
const schedules/update = ({ adUnderscoreaccountUnderscoreid, scheduleBatchUpdate }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        scheduleBatchUpdate,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);

module.exports = {
  schedules/create,
  schedules/list,
  schedules/update,
};
