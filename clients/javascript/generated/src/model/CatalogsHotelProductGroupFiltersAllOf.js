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
import CatalogsHotelProductGroupFilterKeys from './CatalogsHotelProductGroupFilterKeys';

/**
 * The CatalogsHotelProductGroupFiltersAllOf model module.
 * @module model/CatalogsHotelProductGroupFiltersAllOf
 * @version 1.1.1-pre.0
 */
class CatalogsHotelProductGroupFiltersAllOf {
    /**
     * Constructs a new <code>CatalogsHotelProductGroupFiltersAllOf</code>.
     * @alias module:model/CatalogsHotelProductGroupFiltersAllOf
     * @param allOf {Array.<module:model/CatalogsHotelProductGroupFilterKeys>} 
     */
    constructor(allOf) { 
        
        CatalogsHotelProductGroupFiltersAllOf.initialize(this, allOf);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, allOf) { 
        obj['all_of'] = allOf;
    }

    /**
     * Constructs a <code>CatalogsHotelProductGroupFiltersAllOf</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CatalogsHotelProductGroupFiltersAllOf} obj Optional instance to populate.
     * @return {module:model/CatalogsHotelProductGroupFiltersAllOf} The populated <code>CatalogsHotelProductGroupFiltersAllOf</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CatalogsHotelProductGroupFiltersAllOf();

            if (data.hasOwnProperty('all_of')) {
                obj['all_of'] = ApiClient.convertToType(data['all_of'], [CatalogsHotelProductGroupFilterKeys]);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>CatalogsHotelProductGroupFiltersAllOf</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>CatalogsHotelProductGroupFiltersAllOf</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of CatalogsHotelProductGroupFiltersAllOf.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is an array
        if (!Array.isArray(data['all_of'])) {
            throw new Error("Expected the field `all_of` to be an array in the JSON data but got " + data['all_of']);
        }

        return true;
    }


}

CatalogsHotelProductGroupFiltersAllOf.RequiredProperties = ["all_of"];

/**
 * @member {Array.<module:model/CatalogsHotelProductGroupFilterKeys>} all_of
 */
CatalogsHotelProductGroupFiltersAllOf.prototype['all_of'] = undefined;






export default CatalogsHotelProductGroupFiltersAllOf;

