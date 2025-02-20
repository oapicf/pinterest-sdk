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
import ConversionApiResponse from '../model/ConversionApiResponse';
import ConversionEvents from '../model/ConversionEvents';
import DetailedError from '../model/DetailedError';
import Error from '../model/Error';

/**
* ConversionEvents service.
* @module api/ConversionEventsApi
* @version 1.1.1-pre.0
*/
export default class ConversionEventsApi {

    /**
    * Constructs a new ConversionEventsApi. 
    * @alias module:api/ConversionEventsApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the eventsCreate operation.
     * @callback module:api/ConversionEventsApi~eventsCreateCallback
     * @param {String} error Error message, if any.
     * @param {module:model/ConversionApiResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Send conversions
     * The Pinterest API offers advertisers a way to send Pinterest their conversion information (including web conversions, in-app conversions, or even offline conversions) based on their <code>ad_account_id</code>. The request body should be a JSON object. - This endpoint requires an <code>access_token</code> be generated through Ads Manager. Review the <a href=\"/docs/api-features/conversion-overview/\">Conversions Guide</a> for more details. (Note that the authorization header required is <code>Authorization: Bearer &lt;access_token&gt;</code>). - The token's <code>user_account</code> must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Audience, Campaign. (Note that the token can be used across multiple ad accounts under an user ID.) - This endpoint has a rate limit of 5,000 calls per minute per ad account. - If the merchant is submitting this information using both Pinterest conversion tags and the Pinterest API, Pinterest will remove duplicate information before reporting. (Note that events that took place offline cannot be deduplicated.)
     * @param {String} adAccountId Unique identifier of an ad account.
     * @param {module:model/ConversionEvents} conversionEvents Conversion events.
     * @param {Object} opts Optional parameters
     * @param {Boolean} [test] Include query param ?test=true to mark the request as a test request. The events will not be recorded but the API will still return the same response messages. Use this mode to verify your requests are working and your events are constructed correctly. Warning: If you use this query parameter, be certain that it is off (set to false or deleted) before sending a legitimate (non-testing) request.
     * @param {module:api/ConversionEventsApi~eventsCreateCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/ConversionApiResponse}
     */
    eventsCreate(adAccountId, conversionEvents, opts, callback) {
      opts = opts || {};
      let postBody = conversionEvents;
      // verify the required parameter 'adAccountId' is set
      if (adAccountId === undefined || adAccountId === null) {
        throw new Error("Missing the required parameter 'adAccountId' when calling eventsCreate");
      }
      // verify the required parameter 'conversionEvents' is set
      if (conversionEvents === undefined || conversionEvents === null) {
        throw new Error("Missing the required parameter 'conversionEvents' when calling eventsCreate");
      }

      let pathParams = {
        'ad_account_id': adAccountId
      };
      let queryParams = {
        'test': opts['test']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['pinterest_oauth2', 'conversion_token'];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = ConversionApiResponse;
      return this.apiClient.callApi(
        '/ad_accounts/{ad_account_id}/events', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}
