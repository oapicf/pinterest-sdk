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
 * The AudienceDefinition model module.
 * @module model/AudienceDefinition
 * @version 1.1.1-pre.0
 */
class AudienceDefinition {
    /**
     * Constructs a new <code>AudienceDefinition</code>.
     * Queryable audience representation.
     * @alias module:model/AudienceDefinition
     */
    constructor() { 
        
        AudienceDefinition.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>AudienceDefinition</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/AudienceDefinition} obj Optional instance to populate.
     * @return {module:model/AudienceDefinition} The populated <code>AudienceDefinition</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new AudienceDefinition();

            if (data.hasOwnProperty('date')) {
                obj['date'] = ApiClient.convertToType(data['date'], 'String');
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
            if (data.hasOwnProperty('scope')) {
                obj['scope'] = ApiClient.convertToType(data['scope'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>AudienceDefinition</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>AudienceDefinition</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['date'] && !(typeof data['date'] === 'string' || data['date'] instanceof String)) {
            throw new Error("Expected the field `date` to be a primitive type in the JSON string but got " + data['date']);
        }

        return true;
    }


}



/**
 * Generation date
 * @member {String} date
 */
AudienceDefinition.prototype['date'] = undefined;

/**
 * Generated audience type to request.
 * @member {String} type
 */
AudienceDefinition.prototype['type'] = undefined;

/**
 * Generated audience scope to request.
 * @member {String} scope
 */
AudienceDefinition.prototype['scope'] = undefined;






export default AudienceDefinition;

