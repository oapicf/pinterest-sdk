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
import Gender from './Gender';

/**
 * The CatalogsProductGroupMultipleGenderCriteria model module.
 * @module model/CatalogsProductGroupMultipleGenderCriteria
 * @version 1.1.1-pre.0
 */
class CatalogsProductGroupMultipleGenderCriteria {
    /**
     * Constructs a new <code>CatalogsProductGroupMultipleGenderCriteria</code>.
     * @alias module:model/CatalogsProductGroupMultipleGenderCriteria
     * @param values {Array.<module:model/Gender>} 
     */
    constructor(values) { 
        
        CatalogsProductGroupMultipleGenderCriteria.initialize(this, values);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, values) { 
        obj['values'] = values;
    }

    /**
     * Constructs a <code>CatalogsProductGroupMultipleGenderCriteria</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CatalogsProductGroupMultipleGenderCriteria} obj Optional instance to populate.
     * @return {module:model/CatalogsProductGroupMultipleGenderCriteria} The populated <code>CatalogsProductGroupMultipleGenderCriteria</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CatalogsProductGroupMultipleGenderCriteria();

            if (data.hasOwnProperty('values')) {
                obj['values'] = ApiClient.convertToType(data['values'], [Gender]);
            }
            if (data.hasOwnProperty('negated')) {
                obj['negated'] = ApiClient.convertToType(data['negated'], 'Boolean');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>CatalogsProductGroupMultipleGenderCriteria</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>CatalogsProductGroupMultipleGenderCriteria</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of CatalogsProductGroupMultipleGenderCriteria.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is an array
        if (!Array.isArray(data['values'])) {
            throw new Error("Expected the field `values` to be an array in the JSON data but got " + data['values']);
        }

        return true;
    }


}

CatalogsProductGroupMultipleGenderCriteria.RequiredProperties = ["values"];

/**
 * @member {Array.<module:model/Gender>} values
 */
CatalogsProductGroupMultipleGenderCriteria.prototype['values'] = undefined;

/**
 * @member {Boolean} negated
 * @default false
 */
CatalogsProductGroupMultipleGenderCriteria.prototype['negated'] = false;






export default CatalogsProductGroupMultipleGenderCriteria;
