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
import CatalogsProductGroupMultipleStringCriteria from './CatalogsProductGroupMultipleStringCriteria';

/**
 * The ConditionFilter model module.
 * @module model/ConditionFilter
 * @version 1.1.1-pre.0
 */
class ConditionFilter {
    /**
     * Constructs a new <code>ConditionFilter</code>.
     * @alias module:model/ConditionFilter
     * @param CONDITION {module:model/CatalogsProductGroupMultipleStringCriteria} 
     */
    constructor(CONDITION) { 
        
        ConditionFilter.initialize(this, CONDITION);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, CONDITION) { 
        obj['CONDITION'] = CONDITION;
    }

    /**
     * Constructs a <code>ConditionFilter</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ConditionFilter} obj Optional instance to populate.
     * @return {module:model/ConditionFilter} The populated <code>ConditionFilter</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ConditionFilter();

            if (data.hasOwnProperty('CONDITION')) {
                obj['CONDITION'] = CatalogsProductGroupMultipleStringCriteria.constructFromObject(data['CONDITION']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>ConditionFilter</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>ConditionFilter</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of ConditionFilter.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }

        return true;
    }


}

ConditionFilter.RequiredProperties = ["CONDITION"];

/**
 * @member {module:model/CatalogsProductGroupMultipleStringCriteria} CONDITION
 */
ConditionFilter.prototype['CONDITION'] = undefined;






export default ConditionFilter;

