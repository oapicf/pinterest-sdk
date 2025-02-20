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

import ApiClient from '../ApiClient';

/**
 * The AdAccountGetSubscriptionResponse model module.
 * @module model/AdAccountGetSubscriptionResponse
 * @version 1.1.1-pre.0
 */
class AdAccountGetSubscriptionResponse {
    /**
     * Constructs a new <code>AdAccountGetSubscriptionResponse</code>.
     * @alias module:model/AdAccountGetSubscriptionResponse
     */
    constructor() { 
        
        AdAccountGetSubscriptionResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>AdAccountGetSubscriptionResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/AdAccountGetSubscriptionResponse} obj Optional instance to populate.
     * @return {module:model/AdAccountGetSubscriptionResponse} The populated <code>AdAccountGetSubscriptionResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new AdAccountGetSubscriptionResponse();

            if (data.hasOwnProperty('lead_form_id')) {
                obj['lead_form_id'] = ApiClient.convertToType(data['lead_form_id'], 'String');
            }
            if (data.hasOwnProperty('webhook_url')) {
                obj['webhook_url'] = ApiClient.convertToType(data['webhook_url'], 'String');
            }
            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('user_account_id')) {
                obj['user_account_id'] = ApiClient.convertToType(data['user_account_id'], 'String');
            }
            if (data.hasOwnProperty('ad_account_id')) {
                obj['ad_account_id'] = ApiClient.convertToType(data['ad_account_id'], 'String');
            }
            if (data.hasOwnProperty('api_version')) {
                obj['api_version'] = ApiClient.convertToType(data['api_version'], 'String');
            }
            if (data.hasOwnProperty('cryptographic_key')) {
                obj['cryptographic_key'] = ApiClient.convertToType(data['cryptographic_key'], 'String');
            }
            if (data.hasOwnProperty('cryptographic_algorithm')) {
                obj['cryptographic_algorithm'] = ApiClient.convertToType(data['cryptographic_algorithm'], 'String');
            }
            if (data.hasOwnProperty('created_time')) {
                obj['created_time'] = ApiClient.convertToType(data['created_time'], 'Number');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>AdAccountGetSubscriptionResponse</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>AdAccountGetSubscriptionResponse</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['lead_form_id'] && !(typeof data['lead_form_id'] === 'string' || data['lead_form_id'] instanceof String)) {
            throw new Error("Expected the field `lead_form_id` to be a primitive type in the JSON string but got " + data['lead_form_id']);
        }
        // ensure the json data is a string
        if (data['webhook_url'] && !(typeof data['webhook_url'] === 'string' || data['webhook_url'] instanceof String)) {
            throw new Error("Expected the field `webhook_url` to be a primitive type in the JSON string but got " + data['webhook_url']);
        }
        // ensure the json data is a string
        if (data['id'] && !(typeof data['id'] === 'string' || data['id'] instanceof String)) {
            throw new Error("Expected the field `id` to be a primitive type in the JSON string but got " + data['id']);
        }
        // ensure the json data is a string
        if (data['user_account_id'] && !(typeof data['user_account_id'] === 'string' || data['user_account_id'] instanceof String)) {
            throw new Error("Expected the field `user_account_id` to be a primitive type in the JSON string but got " + data['user_account_id']);
        }
        // ensure the json data is a string
        if (data['ad_account_id'] && !(typeof data['ad_account_id'] === 'string' || data['ad_account_id'] instanceof String)) {
            throw new Error("Expected the field `ad_account_id` to be a primitive type in the JSON string but got " + data['ad_account_id']);
        }
        // ensure the json data is a string
        if (data['api_version'] && !(typeof data['api_version'] === 'string' || data['api_version'] instanceof String)) {
            throw new Error("Expected the field `api_version` to be a primitive type in the JSON string but got " + data['api_version']);
        }
        // ensure the json data is a string
        if (data['cryptographic_key'] && !(typeof data['cryptographic_key'] === 'string' || data['cryptographic_key'] instanceof String)) {
            throw new Error("Expected the field `cryptographic_key` to be a primitive type in the JSON string but got " + data['cryptographic_key']);
        }
        // ensure the json data is a string
        if (data['cryptographic_algorithm'] && !(typeof data['cryptographic_algorithm'] === 'string' || data['cryptographic_algorithm'] instanceof String)) {
            throw new Error("Expected the field `cryptographic_algorithm` to be a primitive type in the JSON string but got " + data['cryptographic_algorithm']);
        }

        return true;
    }


}



/**
 * Lead form ID.
 * @member {String} lead_form_id
 */
AdAccountGetSubscriptionResponse.prototype['lead_form_id'] = undefined;

/**
 * Standard HTTPS webhook URL.
 * @member {String} webhook_url
 */
AdAccountGetSubscriptionResponse.prototype['webhook_url'] = undefined;

/**
 * Subscription ID.
 * @member {String} id
 */
AdAccountGetSubscriptionResponse.prototype['id'] = undefined;

/**
 * User account used to subscribe lead data.
 * @member {String} user_account_id
 */
AdAccountGetSubscriptionResponse.prototype['user_account_id'] = undefined;

/**
 * The Ad Account ID that this lead form belongs to.
 * @member {String} ad_account_id
 */
AdAccountGetSubscriptionResponse.prototype['ad_account_id'] = undefined;

/**
 * API version.
 * @member {String} api_version
 */
AdAccountGetSubscriptionResponse.prototype['api_version'] = undefined;

/**
 * Base64 encoded key for client to decrypt lead data.
 * @member {String} cryptographic_key
 */
AdAccountGetSubscriptionResponse.prototype['cryptographic_key'] = undefined;

/**
 * Lead data encryption algorithm.
 * @member {String} cryptographic_algorithm
 */
AdAccountGetSubscriptionResponse.prototype['cryptographic_algorithm'] = undefined;

/**
 * Lead form creation time. Unix timestamp in milliseconds.
 * @member {Number} created_time
 */
AdAccountGetSubscriptionResponse.prototype['created_time'] = undefined;






export default AdAccountGetSubscriptionResponse;

