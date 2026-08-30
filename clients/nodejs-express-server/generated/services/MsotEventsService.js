/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Send Measurement Source Of Truth (MSOT) attributed conversion events
* **This feature is currently in beta and not available to all apps.** If you are interested in joining the beta, reach out to your Pinterest account manager.  Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their `ad_account_id`. The request body should be a JSON object.  - These events will not be used in Reporting.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* conversionMSOTEventsCreate ConversionMSOTEventsCreate 
* no response value expected for this operation
* */
const msot_events/create = ({ adUnderscoreaccountUnderscoreid, conversionMSOTEventsCreate }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        conversionMSOTEventsCreate,
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
  msot_events/create,
};
