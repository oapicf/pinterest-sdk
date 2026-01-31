/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Create customer list upload
* <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a>  <p>Create a customer list upload request for multipart S3 upload.</p> <p>Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.</p> <p><b>Please review the <u><a href=\"/docs/api/v5/customer_lists-update/\" target=\"_blank\">update customer list endpoint</a></u> documentation for additional information.</b></p>
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* customerUnderscorelistUnderscoreid String Unique identifier of a customer list
* customerListUploadCreateRequest CustomerListUploadCreateRequest Parameters to create a customer list upload request
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
* <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a> <p>Get the metadata for a given upload by its ID.</p>
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* customerUnderscorelistUnderscoreid String Unique identifier of a customer list
* customerUnderscorelistUnderscoreuploadUnderscoreid String Unique identifier of a customer list upload
* returns CustomerListUploadResponse
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
* <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a> <p>Begin processing a customer list upload.</p>
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* customerUnderscorelistUnderscoreid String Unique identifier of a customer list
* customerUnderscorelistUnderscoreuploadUnderscoreid String Unique identifier of a customer list upload
* returns CustomerListUploadResponse
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
