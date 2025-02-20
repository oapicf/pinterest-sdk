/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import AudienceDefinitionResponse from '../model/AudienceDefinitionResponse';
import AudienceInsightType from '../model/AudienceInsightType';
import AudienceInsightsResponse from '../model/AudienceInsightsResponse';
import Error from '../model/Error';

/**
* AudienceInsights service.
* @module api/AudienceInsightsApi
* @version 1.1.1-pre.0
*/
export default class AudienceInsightsApi {

    /**
    * Constructs a new AudienceInsightsApi. 
    * @alias module:api/AudienceInsightsApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the audienceInsightsGet operation.
     * @callback module:api/AudienceInsightsApi~audienceInsightsGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/AudienceInsightsResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get audience insights
     * Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the ad account's engaged audience on Pinterest, the ad account's total audience on Pinterest and Pinterest's total audience.<p/> <a href=\"https://help.pinterest.com/en/business/article/audience-insights\" target=\"_blank\">Learn more about Audience Insights</a>.
     * @param {String} adAccountId Unique identifier of an ad account.
     * @param {module:model/AudienceInsightType} audienceInsightType Type of audience insights.
     * @param {module:api/AudienceInsightsApi~audienceInsightsGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/AudienceInsightsResponse}
     */
    audienceInsightsGet(adAccountId, audienceInsightType, callback) {
      let postBody = null;
      // verify the required parameter 'adAccountId' is set
      if (adAccountId === undefined || adAccountId === null) {
        throw new Error("Missing the required parameter 'adAccountId' when calling audienceInsightsGet");
      }
      // verify the required parameter 'audienceInsightType' is set
      if (audienceInsightType === undefined || audienceInsightType === null) {
        throw new Error("Missing the required parameter 'audienceInsightType' when calling audienceInsightsGet");
      }

      let pathParams = {
        'ad_account_id': adAccountId
      };
      let queryParams = {
        'audience_insight_type': audienceInsightType
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['pinterest_oauth2'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = AudienceInsightsResponse;
      return this.apiClient.callApi(
        '/ad_accounts/{ad_account_id}/audience_insights', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the audienceInsightsScopeAndTypeGet operation.
     * @callback module:api/AudienceInsightsApi~audienceInsightsScopeAndTypeGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/AudienceDefinitionResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get audience insights scope and type
     * Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience.
     * @param {String} adAccountId Unique identifier of an ad account.
     * @param {module:api/AudienceInsightsApi~audienceInsightsScopeAndTypeGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/AudienceDefinitionResponse}
     */
    audienceInsightsScopeAndTypeGet(adAccountId, callback) {
      let postBody = null;
      // verify the required parameter 'adAccountId' is set
      if (adAccountId === undefined || adAccountId === null) {
        throw new Error("Missing the required parameter 'adAccountId' when calling audienceInsightsScopeAndTypeGet");
      }

      let pathParams = {
        'ad_account_id': adAccountId
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['pinterest_oauth2'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = AudienceDefinitionResponse;
      return this.apiClient.callApi(
        '/ad_accounts/{ad_account_id}/insights/audiences', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}
