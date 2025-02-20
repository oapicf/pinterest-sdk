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
 * The DeletePartnersRequest model module.
 * @module model/DeletePartnersRequest
 * @version 1.1.1-pre.0
 */
class DeletePartnersRequest {
    /**
     * Constructs a new <code>DeletePartnersRequest</code>.
     * @alias module:model/DeletePartnersRequest
     * @param partnerIds {Array.<String>} 
     */
    constructor(partnerIds) { 
        
        DeletePartnersRequest.initialize(this, partnerIds);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, partnerIds) { 
        obj['partner_ids'] = partnerIds;
    }

    /**
     * Constructs a <code>DeletePartnersRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/DeletePartnersRequest} obj Optional instance to populate.
     * @return {module:model/DeletePartnersRequest} The populated <code>DeletePartnersRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new DeletePartnersRequest();

            if (data.hasOwnProperty('partner_ids')) {
                obj['partner_ids'] = ApiClient.convertToType(data['partner_ids'], ['String']);
            }
            if (data.hasOwnProperty('partner_type')) {
                obj['partner_type'] = ApiClient.convertToType(data['partner_type'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>DeletePartnersRequest</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>DeletePartnersRequest</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of DeletePartnersRequest.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is an array
        if (!Array.isArray(data['partner_ids'])) {
            throw new Error("Expected the field `partner_ids` to be an array in the JSON data but got " + data['partner_ids']);
        }
        // ensure the json data is a string
        if (data['partner_type'] && !(typeof data['partner_type'] === 'string' || data['partner_type'] instanceof String)) {
            throw new Error("Expected the field `partner_type` to be a primitive type in the JSON string but got " + data['partner_type']);
        }
        // validate the optional field `partner_type`
        if (data['partner_type']) { // data not null
          String.validateJSON(data['partner_type']);
        }

        return true;
    }


}

DeletePartnersRequest.RequiredProperties = ["partner_ids"];

/**
 * @member {Array.<String>} partner_ids
 */
DeletePartnersRequest.prototype['partner_ids'] = undefined;

/**
 * @member {String} partner_type
 */
DeletePartnersRequest.prototype['partner_type'] = undefined;






export default DeletePartnersRequest;

