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

import ApiClient from '../ApiClient';

/**
 * The AdAccountCreateSubscriptionResponse model module.
 * @module model/AdAccountCreateSubscriptionResponse
 * @version 1.1.1-pre.0
 */
class AdAccountCreateSubscriptionResponse {
    /**
     * Constructs a new <code>AdAccountCreateSubscriptionResponse</code>.
     * @alias module:model/AdAccountCreateSubscriptionResponse
     */
    constructor() { 
        
        AdAccountCreateSubscriptionResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>AdAccountCreateSubscriptionResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/AdAccountCreateSubscriptionResponse} obj Optional instance to populate.
     * @return {module:model/AdAccountCreateSubscriptionResponse} The populated <code>AdAccountCreateSubscriptionResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new AdAccountCreateSubscriptionResponse();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
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
     * Validates the JSON data with respect to <code>AdAccountCreateSubscriptionResponse</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>AdAccountCreateSubscriptionResponse</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['id'] && !(typeof data['id'] === 'string' || data['id'] instanceof String)) {
            throw new Error("Expected the field `id` to be a primitive type in the JSON string but got " + data['id']);
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
 * Subscription ID.
 * @member {String} id
 */
AdAccountCreateSubscriptionResponse.prototype['id'] = undefined;

/**
 * Base64 encoded key for client to decrypt lead data.
 * @member {String} cryptographic_key
 */
AdAccountCreateSubscriptionResponse.prototype['cryptographic_key'] = undefined;

/**
 * Lead data encryption algorithm.
 * @member {String} cryptographic_algorithm
 */
AdAccountCreateSubscriptionResponse.prototype['cryptographic_algorithm'] = undefined;

/**
 * Subscription creation time. Unix timestamp in milliseconds.
 * @member {Number} created_time
 */
AdAccountCreateSubscriptionResponse.prototype['created_time'] = undefined;






export default AdAccountCreateSubscriptionResponse;
