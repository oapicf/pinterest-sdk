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
 * The LeadFormTestRequest model module.
 * @module model/LeadFormTestRequest
 * @version 1.1.1-pre.0
 */
class LeadFormTestRequest {
    /**
     * Constructs a new <code>LeadFormTestRequest</code>.
     * Request to create test data for lead data test API.
     * @alias module:model/LeadFormTestRequest
     * @param answers {Array.<String>} Test lead answers. Should follow the creation order.
     */
    constructor(answers) { 
        
        LeadFormTestRequest.initialize(this, answers);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, answers) { 
        obj['answers'] = answers;
    }

    /**
     * Constructs a <code>LeadFormTestRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/LeadFormTestRequest} obj Optional instance to populate.
     * @return {module:model/LeadFormTestRequest} The populated <code>LeadFormTestRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new LeadFormTestRequest();

            if (data.hasOwnProperty('answers')) {
                obj['answers'] = ApiClient.convertToType(data['answers'], ['String']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>LeadFormTestRequest</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>LeadFormTestRequest</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of LeadFormTestRequest.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is an array
        if (!Array.isArray(data['answers'])) {
            throw new Error("Expected the field `answers` to be an array in the JSON data but got " + data['answers']);
        }

        return true;
    }


}

LeadFormTestRequest.RequiredProperties = ["answers"];

/**
 * Test lead answers. Should follow the creation order.
 * @member {Array.<String>} answers
 */
LeadFormTestRequest.prototype['answers'] = undefined;






export default LeadFormTestRequest;
