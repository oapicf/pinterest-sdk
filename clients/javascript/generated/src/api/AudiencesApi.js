/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import Audience from '../model/Audience';
import AudienceCreateCustomRequest from '../model/AudienceCreateCustomRequest';
import AudienceCreateRequest from '../model/AudienceCreateRequest';
import AudienceUpdateRequest from '../model/AudienceUpdateRequest';
import AudiencesList200Response from '../model/AudiencesList200Response';
import Error from '../model/Error';

/**
* Audiences service.
* @module api/AudiencesApi
* @version 1.1.1-pre.0
*/
export default class AudiencesApi {

    /**
    * Constructs a new AudiencesApi. 
    * @alias module:api/AudiencesApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the audiencesCreate operation.
     * @callback module:api/AudiencesApi~audiencesCreateCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Audience} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create audience
     * Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with the ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude specific audience_ids when you create an ad group. <p/> For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>.
     * @param {String} adAccountId Unique identifier of an ad account.
     * @param {module:model/AudienceCreateRequest} audienceCreateRequest List of ads to create, size limit [1, 30]
     * @param {module:api/AudiencesApi~audiencesCreateCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Audience}
     */
    audiencesCreate(adAccountId, audienceCreateRequest, callback) {
      let postBody = audienceCreateRequest;
      // verify the required parameter 'adAccountId' is set
      if (adAccountId === undefined || adAccountId === null) {
        throw new Error("Missing the required parameter 'adAccountId' when calling audiencesCreate");
      }
      // verify the required parameter 'audienceCreateRequest' is set
      if (audienceCreateRequest === undefined || audienceCreateRequest === null) {
        throw new Error("Missing the required parameter 'audienceCreateRequest' when calling audiencesCreate");
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
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = Audience;
      return this.apiClient.callApi(
        '/ad_accounts/{ad_account_id}/audiences', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the audiencesCreateCustom operation.
     * @callback module:api/AudiencesApi~audiencesCreateCustomCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Audience} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create custom audience
     * Create a custom audience and find the audiences you want your ads to reach.
     * @param {String} adAccountId Unique identifier of an ad account.
     * @param {module:model/AudienceCreateCustomRequest} audienceCreateCustomRequest Custom audience to create.
     * @param {module:api/AudiencesApi~audiencesCreateCustomCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Audience}
     */
    audiencesCreateCustom(adAccountId, audienceCreateCustomRequest, callback) {
      let postBody = audienceCreateCustomRequest;
      // verify the required parameter 'adAccountId' is set
      if (adAccountId === undefined || adAccountId === null) {
        throw new Error("Missing the required parameter 'adAccountId' when calling audiencesCreateCustom");
      }
      // verify the required parameter 'audienceCreateCustomRequest' is set
      if (audienceCreateCustomRequest === undefined || audienceCreateCustomRequest === null) {
        throw new Error("Missing the required parameter 'audienceCreateCustomRequest' when calling audiencesCreateCustom");
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
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = Audience;
      return this.apiClient.callApi(
        '/ad_accounts/{ad_account_id}/audiences/custom', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the audiencesGet operation.
     * @callback module:api/AudiencesApi~audiencesGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Audience} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get audience
     * Get a specific audience given the audience ID.
     * @param {String} adAccountId Unique identifier of an ad account.
     * @param {String} audienceId Unique identifier of an audience
     * @param {module:api/AudiencesApi~audiencesGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Audience}
     */
    audiencesGet(adAccountId, audienceId, callback) {
      let postBody = null;
      // verify the required parameter 'adAccountId' is set
      if (adAccountId === undefined || adAccountId === null) {
        throw new Error("Missing the required parameter 'adAccountId' when calling audiencesGet");
      }
      // verify the required parameter 'audienceId' is set
      if (audienceId === undefined || audienceId === null) {
        throw new Error("Missing the required parameter 'audienceId' when calling audiencesGet");
      }

      let pathParams = {
        'ad_account_id': adAccountId,
        'audience_id': audienceId
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
      let returnType = Audience;
      return this.apiClient.callApi(
        '/ad_accounts/{ad_account_id}/audiences/{audience_id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the audiencesList operation.
     * @callback module:api/AudiencesApi~audiencesListCallback
     * @param {String} error Error message, if any.
     * @param {module:model/AudiencesList200Response} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * List audiences
     * Get list of audiences for the ad account.
     * @param {String} adAccountId Unique identifier of an ad account.
     * @param {Object} opts Optional parameters
     * @param {String} [bookmark] Cursor used to fetch the next page of items
     * @param {module:model/String} [order] The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. For received audiences, it is sorted by sharing event time. Note that higher-value IDs are associated with more-recently added items.
     * @param {Number} [pageSize = 25)] Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
     * @param {module:model/String} [ownershipType = 'OWNED')] <strong>This feature is currently in beta and not available to all apps.</strong> Filter audiences by ownership type.
     * @param {module:api/AudiencesApi~audiencesListCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/AudiencesList200Response}
     */
    audiencesList(adAccountId, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'adAccountId' is set
      if (adAccountId === undefined || adAccountId === null) {
        throw new Error("Missing the required parameter 'adAccountId' when calling audiencesList");
      }

      let pathParams = {
        'ad_account_id': adAccountId
      };
      let queryParams = {
        'bookmark': opts['bookmark'],
        'order': opts['order'],
        'page_size': opts['pageSize'],
        'ownership_type': opts['ownershipType']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['pinterest_oauth2'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = AudiencesList200Response;
      return this.apiClient.callApi(
        '/ad_accounts/{ad_account_id}/audiences', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the audiencesUpdate operation.
     * @callback module:api/AudiencesApi~audiencesUpdateCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Audience} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Update audience
     * Update (edit or remove) an existing targeting audience.
     * @param {String} adAccountId Unique identifier of an ad account.
     * @param {String} audienceId Unique identifier of an audience
     * @param {Object} opts Optional parameters
     * @param {module:model/AudienceUpdateRequest} [audienceUpdateRequest] The audience to be updated.
     * @param {module:api/AudiencesApi~audiencesUpdateCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Audience}
     */
    audiencesUpdate(adAccountId, audienceId, opts, callback) {
      opts = opts || {};
      let postBody = opts['audienceUpdateRequest'];
      // verify the required parameter 'adAccountId' is set
      if (adAccountId === undefined || adAccountId === null) {
        throw new Error("Missing the required parameter 'adAccountId' when calling audiencesUpdate");
      }
      // verify the required parameter 'audienceId' is set
      if (audienceId === undefined || audienceId === null) {
        throw new Error("Missing the required parameter 'audienceId' when calling audiencesUpdate");
      }

      let pathParams = {
        'ad_account_id': adAccountId,
        'audience_id': audienceId
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['pinterest_oauth2'];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = Audience;
      return this.apiClient.callApi(
        '/ad_accounts/{ad_account_id}/audiences/{audience_id}', 'PATCH',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}