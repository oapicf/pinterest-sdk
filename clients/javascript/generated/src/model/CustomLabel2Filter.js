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
 * The CustomLabel2Filter model module.
 * @module model/CustomLabel2Filter
 * @version 1.1.1-pre.0
 */
class CustomLabel2Filter {
    /**
     * Constructs a new <code>CustomLabel2Filter</code>.
     * @alias module:model/CustomLabel2Filter
     * @param cUSTOMLABEL2 {module:model/CatalogsProductGroupMultipleStringCriteria} 
     */
    constructor(cUSTOMLABEL2) { 
        
        CustomLabel2Filter.initialize(this, cUSTOMLABEL2);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, cUSTOMLABEL2) { 
        obj['CUSTOM_LABEL_2'] = cUSTOMLABEL2;
    }

    /**
     * Constructs a <code>CustomLabel2Filter</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CustomLabel2Filter} obj Optional instance to populate.
     * @return {module:model/CustomLabel2Filter} The populated <code>CustomLabel2Filter</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CustomLabel2Filter();

            if (data.hasOwnProperty('CUSTOM_LABEL_2')) {
                obj['CUSTOM_LABEL_2'] = CatalogsProductGroupMultipleStringCriteria.constructFromObject(data['CUSTOM_LABEL_2']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>CustomLabel2Filter</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>CustomLabel2Filter</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of CustomLabel2Filter.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }

        return true;
    }


}

CustomLabel2Filter.RequiredProperties = ["CUSTOM_LABEL_2"];

/**
 * @member {module:model/CatalogsProductGroupMultipleStringCriteria} CUSTOM_LABEL_2
 */
CustomLabel2Filter.prototype['CUSTOM_LABEL_2'] = undefined;






export default CustomLabel2Filter;

