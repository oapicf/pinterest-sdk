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
import CatalogsProductGroupPricingCriteria from './CatalogsProductGroupPricingCriteria';

/**
 * The MinPriceFilter model module.
 * @module model/MinPriceFilter
 * @version 1.1.1-pre.0
 */
class MinPriceFilter {
    /**
     * Constructs a new <code>MinPriceFilter</code>.
     * @alias module:model/MinPriceFilter
     * @param MIN_PRICE {module:model/CatalogsProductGroupPricingCriteria} 
     */
    constructor(MIN_PRICE) { 
        
        MinPriceFilter.initialize(this, MIN_PRICE);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, MIN_PRICE) { 
        obj['MIN_PRICE'] = MIN_PRICE;
    }

    /**
     * Constructs a <code>MinPriceFilter</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/MinPriceFilter} obj Optional instance to populate.
     * @return {module:model/MinPriceFilter} The populated <code>MinPriceFilter</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MinPriceFilter();

            if (data.hasOwnProperty('MIN_PRICE')) {
                obj['MIN_PRICE'] = CatalogsProductGroupPricingCriteria.constructFromObject(data['MIN_PRICE']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>MinPriceFilter</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>MinPriceFilter</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of MinPriceFilter.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }

        return true;
    }


}

MinPriceFilter.RequiredProperties = ["MIN_PRICE"];

/**
 * @member {module:model/CatalogsProductGroupPricingCriteria} MIN_PRICE
 */
MinPriceFilter.prototype['MIN_PRICE'] = undefined;






export default MinPriceFilter;
