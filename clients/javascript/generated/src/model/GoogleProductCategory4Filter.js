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
import CatalogsProductGroupMultipleStringListCriteria from './CatalogsProductGroupMultipleStringListCriteria';

/**
 * The GoogleProductCategory4Filter model module.
 * @module model/GoogleProductCategory4Filter
 * @version 1.1.1-pre.0
 */
class GoogleProductCategory4Filter {
    /**
     * Constructs a new <code>GoogleProductCategory4Filter</code>.
     * @alias module:model/GoogleProductCategory4Filter
     * @param gOOGLEPRODUCTCATEGORY4 {module:model/CatalogsProductGroupMultipleStringListCriteria} 
     */
    constructor(gOOGLEPRODUCTCATEGORY4) { 
        
        GoogleProductCategory4Filter.initialize(this, gOOGLEPRODUCTCATEGORY4);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, gOOGLEPRODUCTCATEGORY4) { 
        obj['GOOGLE_PRODUCT_CATEGORY_4'] = gOOGLEPRODUCTCATEGORY4;
    }

    /**
     * Constructs a <code>GoogleProductCategory4Filter</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/GoogleProductCategory4Filter} obj Optional instance to populate.
     * @return {module:model/GoogleProductCategory4Filter} The populated <code>GoogleProductCategory4Filter</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GoogleProductCategory4Filter();

            if (data.hasOwnProperty('GOOGLE_PRODUCT_CATEGORY_4')) {
                obj['GOOGLE_PRODUCT_CATEGORY_4'] = CatalogsProductGroupMultipleStringListCriteria.constructFromObject(data['GOOGLE_PRODUCT_CATEGORY_4']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>GoogleProductCategory4Filter</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>GoogleProductCategory4Filter</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of GoogleProductCategory4Filter.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }

        return true;
    }


}

GoogleProductCategory4Filter.RequiredProperties = ["GOOGLE_PRODUCT_CATEGORY_4"];

/**
 * @member {module:model/CatalogsProductGroupMultipleStringListCriteria} GOOGLE_PRODUCT_CATEGORY_4
 */
GoogleProductCategory4Filter.prototype['GOOGLE_PRODUCT_CATEGORY_4'] = undefined;






export default GoogleProductCategory4Filter;

