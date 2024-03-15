/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get advertiser entities in bulk
* Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, and/or keywords; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* bulkDownloadRequest BulkDownloadRequest Parameters to get ad entities in bulk
* returns BulkDownloadResponse
* */
const bulk_download/create = ({ adUnderscoreaccountUnderscoreid, bulkDownloadRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        bulkDownloadRequest,
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
* Get the status of a bulk request by <code>request_id</code>, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, or keywords).
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* bulkUnderscorerequestUnderscoreid String Unique identifier of a bulk upsert request.
* includeUnderscoredetails Boolean if set to True then attach the errors/details to all the requests (optional)
* returns BulkUpsertStatusResponse
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
* Either create or update any combination of campaigns, ad groups, product groups, ads, or keywords. Note that this request will be processed asynchronously; the response will include a <code>request_id</code> that can be used to obtain the status of the request.
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
