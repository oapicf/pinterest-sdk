/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get event quality score (EQS)
* Get the Event Quality Score (EQS) of your conversion signals.  [Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user.
*
* lookbackUnderscoreperiod LookbackPeriodOptions Lookback window (number of days).
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* sourceUnderscoreplatform SourcePlatformOptions Source platform of event. (optional)
* ingestionUnderscoresource IngestionSourceOptions Ingestion source of event. (optional)
* returns List
* */
const conversion_eqs/list = ({ lookbackUnderscoreperiod, adUnderscoreaccountUnderscoreid, sourceUnderscoreplatform, ingestionUnderscoresource }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        lookbackUnderscoreperiod,
        adUnderscoreaccountUnderscoreid,
        sourceUnderscoreplatform,
        ingestionUnderscoresource,
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
  conversion_eqs/list,
};
