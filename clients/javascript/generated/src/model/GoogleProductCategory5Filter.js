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
import CatalogsProductGroupMultipleStringListCriteria from './CatalogsProductGroupMultipleStringListCriteria';

/**
 * The GoogleProductCategory5Filter model module.
 * @module model/GoogleProductCategory5Filter
 * @version 1.1.1-pre.0
 */
class GoogleProductCategory5Filter {
    /**
     * Constructs a new <code>GoogleProductCategory5Filter</code>.
     * @alias module:model/GoogleProductCategory5Filter
     * @param gOOGLEPRODUCTCATEGORY5 {module:model/CatalogsProductGroupMultipleStringListCriteria} 
     */
    constructor(gOOGLEPRODUCTCATEGORY5) { 
        
        GoogleProductCategory5Filter.initialize(this, gOOGLEPRODUCTCATEGORY5);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, gOOGLEPRODUCTCATEGORY5) { 
        obj['GOOGLE_PRODUCT_CATEGORY_5'] = gOOGLEPRODUCTCATEGORY5;
    }

    /**
     * Constructs a <code>GoogleProductCategory5Filter</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/GoogleProductCategory5Filter} obj Optional instance to populate.
     * @return {module:model/GoogleProductCategory5Filter} The populated <code>GoogleProductCategory5Filter</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GoogleProductCategory5Filter();

            if (data.hasOwnProperty('GOOGLE_PRODUCT_CATEGORY_5')) {
                obj['GOOGLE_PRODUCT_CATEGORY_5'] = CatalogsProductGroupMultipleStringListCriteria.constructFromObject(data['GOOGLE_PRODUCT_CATEGORY_5']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>GoogleProductCategory5Filter</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>GoogleProductCategory5Filter</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of GoogleProductCategory5Filter.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }

        return true;
    }


}

GoogleProductCategory5Filter.RequiredProperties = ["GOOGLE_PRODUCT_CATEGORY_5"];

/**
 * @member {module:model/CatalogsProductGroupMultipleStringListCriteria} GOOGLE_PRODUCT_CATEGORY_5
 */
GoogleProductCategory5Filter.prototype['GOOGLE_PRODUCT_CATEGORY_5'] = undefined;






export default GoogleProductCategory5Filter;
