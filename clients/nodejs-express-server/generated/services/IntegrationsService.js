/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get integration metadata
* Get integration metadata by ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
*
* id String Integration ID.
* returns IntegrationRecord
* */
const integrations/get_by_id = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
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
* Get integration metadata list
* Get integration metadata list. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
*
* bookmark String Cursor used to fetch the next page of items (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional)
* returns integrations_get_list_200_response
* */
const integrations/get_list = ({ bookmark, pageUnderscoresize }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        bookmark,
        pageUnderscoresize,
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
* Delete commerce integration
* Delete commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
*
* externalUnderscorebusinessUnderscoreid String External business ID for the integration.
* no response value expected for this operation
* */
const integrations_commerce/del = ({ externalUnderscorebusinessUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        externalUnderscorebusinessUnderscoreid,
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
* Get commerce integration
* Get commerce integration metadata associated with the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
*
* externalUnderscorebusinessUnderscoreid String External business ID for the integration.
* returns IntegrationMetadata
* */
const integrations_commerce/get = ({ externalUnderscorebusinessUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        externalUnderscorebusinessUnderscoreid,
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
* Update commerce integration
* Update commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
*
* externalUnderscorebusinessUnderscoreid String External business ID for the integration.
* integrationRequestPatch IntegrationRequestPatch Parameters to get create/update the Integration Metadata (optional)
* returns IntegrationMetadata
* */
const integrations_commerce/patch = ({ externalUnderscorebusinessUnderscoreid, integrationRequestPatch }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        externalUnderscorebusinessUnderscoreid,
        integrationRequestPatch,
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
* Create commerce integration
* Create commerce integration metadata to link an external business ID with a Pinterest merchant & ad account. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
*
* integrationRequest IntegrationRequest Parameters to get create/update the Integration Metadata (optional)
* returns IntegrationMetadata
* */
const integrations_commerce/post = ({ integrationRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        integrationRequest,
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
* Receives batched logs from integration applications.
* This endpoint receives batched logs from integration applications on partner platforms. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
*
* integrationLogsRequest IntegrationLogsRequest Ingest log information from external integration application.
* returns IntegrationLogsSuccessResponse
* */
const integrations_logs/post = ({ integrationLogsRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        integrationLogsRequest,
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
  integrations/get_by_id,
  integrations/get_list,
  integrations_commerce/del,
  integrations_commerce/get,
  integrations_commerce/patch,
  integrations_commerce/post,
  integrations_logs/post,
};
