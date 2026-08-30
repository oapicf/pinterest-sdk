/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Create advertiser defined events
* Map advertiser defined events to standard events for the given ad account.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* advertiserDefinedEventsCreateRequest AdvertiserDefinedEventsCreateRequest 
* returns advertiser_defined_events_create_200_response
* */
const advertiser_defined_events/create = ({ adUnderscoreaccountUnderscoreid, advertiserDefinedEventsCreateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        advertiserDefinedEventsCreateRequest,
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
* Delete advertiser defined events
* Untrack advertiser defined events for the given ad account.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* eventUnderscorenames List List of event names to delete
* returns advertiser_defined_events_create_200_response
* */
const advertiser_defined_events/delete = ({ adUnderscoreaccountUnderscoreid, eventUnderscorenames }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        eventUnderscorenames,
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
* Get advertiser defined events
* Get advertiser defined events for the given ad account.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* returns advertiser_defined_events_get_200_response
* */
const advertiser_defined_events/get = ({ adUnderscoreaccountUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
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
* Update advertiser defined events
* Update advertiser defined event names or mappings for the given ad account.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* advertiserDefinedEventsCreateRequest AdvertiserDefinedEventsCreateRequest 
* returns advertiser_defined_events_create_200_response
* */
const advertiser_defined_events/update = ({ adUnderscoreaccountUnderscoreid, advertiserDefinedEventsCreateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        advertiserDefinedEventsCreateRequest,
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
  advertiser_defined_events/create,
  advertiser_defined_events/delete,
  advertiser_defined_events/get,
  advertiser_defined_events/update,
};
