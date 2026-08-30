/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Create customer list upload
* Create a customer list upload request for multipart S3 upload.  Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.  **Please review the [update customer list endpoint](/docs/api/v5/customer_lists-update/) documentation for additional information.**
*
* adUnderscoreaccountUnderscoreid String 
* customerUnderscorelistUnderscoreid String Customer list ID.
* customerListUploadCreateRequest CustomerListUploadCreateRequest 
* returns CustomerListUploadCreateResponse
* */
const customer_list_uploads/create = ({ adUnderscoreaccountUnderscoreid, customerUnderscorelistUnderscoreid, customerListUploadCreateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        customerUnderscorelistUnderscoreid,
        customerListUploadCreateRequest,
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
* Get customer list upload
* Get the metadata for a given upload by its ID.
*
* adUnderscoreaccountUnderscoreid String 
* customerUnderscorelistUnderscoreid String Customer list ID.
* customerUnderscorelistUnderscoreuploadUnderscoreid String Customer List Upload ID.
* returns CustomerListUpload
* */
const customer_list_uploads/get = ({ adUnderscoreaccountUnderscoreid, customerUnderscorelistUnderscoreid, customerUnderscorelistUnderscoreuploadUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        customerUnderscorelistUnderscoreid,
        customerUnderscorelistUnderscoreuploadUnderscoreid,
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
* Run customer list upload
* Begin processing a customer list upload.
*
* adUnderscoreaccountUnderscoreid String 
* customerUnderscorelistUnderscoreid String Customer list ID.
* customerUnderscorelistUnderscoreuploadUnderscoreid String Customer List Upload ID.
* returns CustomerListUpload
* */
const customer_list_uploads/run = ({ adUnderscoreaccountUnderscoreid, customerUnderscorelistUnderscoreid, customerUnderscorelistUnderscoreuploadUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        customerUnderscorelistUnderscoreid,
        customerUnderscorelistUnderscoreuploadUnderscoreid,
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
  customer_list_uploads/create,
  customer_list_uploads/get,
  customer_list_uploads/run,
};
