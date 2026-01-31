/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get advertiser defined events
* <p>Get advertiser defined events for the given ad account.</p>
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* returns AdvertiserDefinedEventsResponse
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

module.exports = {
  advertiser_defined_events/get,
};
