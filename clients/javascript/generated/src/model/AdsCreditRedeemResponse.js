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
 * The AdsCreditRedeemResponse model module.
 * @module model/AdsCreditRedeemResponse
 * @version 1.1.1-pre.0
 */
class AdsCreditRedeemResponse {
    /**
     * Constructs a new <code>AdsCreditRedeemResponse</code>.
     * @alias module:model/AdsCreditRedeemResponse
     */
    constructor() { 
        
        AdsCreditRedeemResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>AdsCreditRedeemResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/AdsCreditRedeemResponse} obj Optional instance to populate.
     * @return {module:model/AdsCreditRedeemResponse} The populated <code>AdsCreditRedeemResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new AdsCreditRedeemResponse();

            if (data.hasOwnProperty('success')) {
                obj['success'] = ApiClient.convertToType(data['success'], 'Boolean');
            }
            if (data.hasOwnProperty('errorCode')) {
                obj['errorCode'] = ApiClient.convertToType(data['errorCode'], 'Number');
            }
            if (data.hasOwnProperty('errorMessage')) {
                obj['errorMessage'] = ApiClient.convertToType(data['errorMessage'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>AdsCreditRedeemResponse</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>AdsCreditRedeemResponse</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['errorMessage'] && !(typeof data['errorMessage'] === 'string' || data['errorMessage'] instanceof String)) {
            throw new Error("Expected the field `errorMessage` to be a primitive type in the JSON string but got " + data['errorMessage']);
        }

        return true;
    }


}



/**
 * Returns true if the offer code was successfully applied(validateOnly=false) or can be applied(validateOnly=true).
 * @member {Boolean} success
 */
AdsCreditRedeemResponse.prototype['success'] = undefined;

/**
 * Error code type if error occurs
 * @member {Number} errorCode
 */
AdsCreditRedeemResponse.prototype['errorCode'] = undefined;

/**
 * Reason for failure
 * @member {String} errorMessage
 */
AdsCreditRedeemResponse.prototype['errorMessage'] = undefined;






export default AdsCreditRedeemResponse;

