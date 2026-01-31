/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Send Measurement Source Of Truth (MSOT) attributed conversion events
* <strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong> <br> <p>Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their <code>ad_account_id</code>. The request body should be a JSON object.</p> - These events will NOT be used in Reporting.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* conversionMSOTEvents ConversionMSOTEvents Attributed MSOT conversion events
* no response value expected for this operation
* */
const msot_events/create = ({ adUnderscoreaccountUnderscoreid, conversionMSOTEvents }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        conversionMSOTEvents,
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
