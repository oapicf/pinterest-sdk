/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Create a request to export leads collected from a lead ad
* <strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Create an export of leads collected from a lead ad. This returns a lead_export_id  token that you can use to download the export when it is ready.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* leadsExportCreateRequest LeadsExportCreateRequest 
* returns LeadsExportCreateResponse
* */
const leads_export/create = ({ adUnderscoreaccountUnderscoreid, leadsExportCreateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        leadsExportCreateRequest,
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
* Get the lead export from the lead export create call
* <strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Get the export of leads collected from a lead ad. This returns a URL to a list of lead export given a lead_export_id token returned from the create a lead export call. You can use the URL to download the report.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* leadsUnderscoreexportUnderscoreid String lead_export_id token returned from the create a lead export endpoint
* returns LeadsExportResponseData
* */
const leads_export/get = ({ adUnderscoreaccountUnderscoreid, leadsUnderscoreexportUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        leadsUnderscoreexportUnderscoreid,
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
  leads_export/create,
  leads_export/get,
};
