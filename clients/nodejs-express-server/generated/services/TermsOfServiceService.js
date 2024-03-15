/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get terms of service
* Get the text of the terms of service and see whether the advertiser has accepted the terms of service.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* includeUnderscorehtml Boolean Return HTML in TOS text. (optional)
* tosUnderscoretype String Request type. (optional)
* returns TermsOfService
* */
const terms_of_service/get = ({ adUnderscoreaccountUnderscoreid, includeUnderscorehtml, tosUnderscoretype }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        includeUnderscorehtml,
        tosUnderscoretype,
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
  terms_of_service/get,
};
