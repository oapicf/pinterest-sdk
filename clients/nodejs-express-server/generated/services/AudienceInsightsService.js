/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get audience insights
* Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the ad account's engaged audience on Pinterest, the ad account's total audience on Pinterest and Pinterest's total audience.<p/> <a href=\"https://help.pinterest.com/en/business/article/audience-insights\" target=\"_blank\">Learn more about Audience Insights</a>.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* audienceUnderscoreinsightUnderscoretype AudienceInsightType Type of audience insights.
* returns AudienceInsightsResponse
* */
const audience_insights/get = ({ adUnderscoreaccountUnderscoreid, audienceUnderscoreinsightUnderscoretype }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adUnderscoreaccountUnderscoreid,
        audienceUnderscoreinsightUnderscoretype,
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
* Get audience insights scope and type
* Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience.
*
* adUnderscoreaccountUnderscoreid String Unique identifier of an ad account.
* returns AudienceDefinitionResponse
* */
const audience_insights_scope_and_type/get = ({ adUnderscoreaccountUnderscoreid }) => new Promise(
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
  audience_insights/get,
  audience_insights_scope_and_type/get,
};
