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
import Error from '../model/Error';
import TargetingTemplateCreate from '../model/TargetingTemplateCreate';
import TargetingTemplateGetResponseData from '../model/TargetingTemplateGetResponseData';
import TargetingTemplateList200Response from '../model/TargetingTemplateList200Response';
import TargetingTemplateUpdateRequest from '../model/TargetingTemplateUpdateRequest';

/**
* TargetingTemplate service.
* @module api/TargetingTemplateApi
* @version 1.1.1-pre.0
*/
export default class TargetingTemplateApi {

    /**
    * Constructs a new TargetingTemplateApi. 
    * @alias module:api/TargetingTemplateApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the targetingTemplateCreate operation.
     * @callback module:api/TargetingTemplateApi~targetingTemplateCreateCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TargetingTemplateGetResponseData} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create targeting templates
     * <p>Targeting templates allow advertisers to save a set of targeting details including audience lists,  keywords & interest, demographics, and placements to use more than once during the campaign creation process.</p>  <p>Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse   performance targeting from prior campaigns for new campaigns.</p>
     * @param {String} adAccountId Unique identifier of an ad account.
     * @param {module:model/TargetingTemplateCreate} targetingTemplateCreate targeting template creation entity
     * @param {module:api/TargetingTemplateApi~targetingTemplateCreateCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TargetingTemplateGetResponseData}
     */
    targetingTemplateCreate(adAccountId, targetingTemplateCreate, callback) {
      let postBody = targetingTemplateCreate;
      // verify the required parameter 'adAccountId' is set
      if (adAccountId === undefined || adAccountId === null) {
        throw new Error("Missing the required parameter 'adAccountId' when calling targetingTemplateCreate");
      }
      // verify the required parameter 'targetingTemplateCreate' is set
      if (targetingTemplateCreate === undefined || targetingTemplateCreate === null) {
        throw new Error("Missing the required parameter 'targetingTemplateCreate' when calling targetingTemplateCreate");
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
      let returnType = TargetingTemplateGetResponseData;
      return this.apiClient.callApi(
        '/ad_accounts/{ad_account_id}/targeting_templates', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the targetingTemplateList operation.
     * @callback module:api/TargetingTemplateApi~targetingTemplateListCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TargetingTemplateList200Response} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * List targeting templates
     * Get a list of the targeting templates in the specified <code>ad_account_id</code>
     * @param {String} adAccountId Unique identifier of an ad account.
     * @param {Object} opts Optional parameters
     * @param {module:model/String} [order] The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
     * @param {Boolean} [includeSizing = false)] Include audience sizing in result or not
     * @param {String} [searchQuery] Search keyword for targeting templates
     * @param {Number} [pageSize = 25)] Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
     * @param {String} [bookmark] Cursor used to fetch the next page of items
     * @param {module:api/TargetingTemplateApi~targetingTemplateListCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TargetingTemplateList200Response}
     */
    targetingTemplateList(adAccountId, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'adAccountId' is set
      if (adAccountId === undefined || adAccountId === null) {
        throw new Error("Missing the required parameter 'adAccountId' when calling targetingTemplateList");
      }

      let pathParams = {
        'ad_account_id': adAccountId
      };
      let queryParams = {
        'order': opts['order'],
        'include_sizing': opts['includeSizing'],
        'search_query': opts['searchQuery'],
        'page_size': opts['pageSize'],
        'bookmark': opts['bookmark']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['pinterest_oauth2'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = TargetingTemplateList200Response;
      return this.apiClient.callApi(
        '/ad_accounts/{ad_account_id}/targeting_templates', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the targetingTemplateUpdate operation.
     * @callback module:api/TargetingTemplateApi~targetingTemplateUpdateCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Update targeting templates
     * <p>Update the targeting template given advertiser ID and targeting template ID</p>
     * @param {String} adAccountId Unique identifier of an ad account.
     * @param {module:model/TargetingTemplateUpdateRequest} targetingTemplateUpdateRequest Operation type and targeting template ID
     * @param {module:api/TargetingTemplateApi~targetingTemplateUpdateCallback} callback The callback function, accepting three arguments: error, data, response
     */
    targetingTemplateUpdate(adAccountId, targetingTemplateUpdateRequest, callback) {
      let postBody = targetingTemplateUpdateRequest;
      // verify the required parameter 'adAccountId' is set
      if (adAccountId === undefined || adAccountId === null) {
        throw new Error("Missing the required parameter 'adAccountId' when calling targetingTemplateUpdate");
      }
      // verify the required parameter 'targetingTemplateUpdateRequest' is set
      if (targetingTemplateUpdateRequest === undefined || targetingTemplateUpdateRequest === null) {
        throw new Error("Missing the required parameter 'targetingTemplateUpdateRequest' when calling targetingTemplateUpdate");
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
      let returnType = null;
      return this.apiClient.callApi(
        '/ad_accounts/{ad_account_id}/targeting_templates', 'PATCH',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}
