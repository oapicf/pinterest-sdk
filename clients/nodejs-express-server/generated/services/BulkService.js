/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get advertiser entities in bulk
* Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, keywords, schedules,and/or labels; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* bulkDownloadCreate BulkDownloadCreate 
* returns BulkDownload
* */
const bulk_download/create = ({ adUnderscoreaccountUnderscoreid, bulkDownloadCreate }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        bulkDownloadCreate,
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
* Download advertiser entities in bulk
* Get the status of a bulk request by `request_id`, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, schedules, or keywords).
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* bulkUnderscorerequestUnderscoreid String Bulk request ID that is from one of the entities bulk endpoints
* includeUnderscoredetails Boolean If set to True then attach the errors/details to all the requests (optional)
* returns BulkJobData
* */
const bulk_request/get = ({ adUnderscoreaccountUnderscoreid, bulkUnderscorerequestUnderscoreid, includeUnderscoredetails }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        bulkUnderscorerequestUnderscoreid,
        includeUnderscoredetails,
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
* Create/update ad entities in bulk
* Either create or update any combination of campaigns, ad groups, product groups, ads, keywords, schedules, or labels. Note that this request will be processed asynchronously; the response will include a <code>request_id</code> that can be used to obtain the status of the request.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* bulkUpsertRequest BulkUpsertRequest Parameters to get create/update ad entities in bulk
* returns BulkUpsertResponse
* */
const bulk_upsert/create = ({ adUnderscoreaccountUnderscoreid, bulkUpsertRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        bulkUpsertRequest,
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
  bulk_download/create,
  bulk_request/get,
  bulk_upsert/create,
};
