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
import CatalogsProductGroupPricingCurrencyCriteria from './CatalogsProductGroupPricingCurrencyCriteria';

/**
 * The PriceFilter model module.
 * @module model/PriceFilter
 * @version 1.1.1-pre.0
 */
class PriceFilter {
    /**
     * Constructs a new <code>PriceFilter</code>.
     * @alias module:model/PriceFilter
     * @param PRICE {module:model/CatalogsProductGroupPricingCurrencyCriteria} 
     */
    constructor(PRICE) { 
        
        PriceFilter.initialize(this, PRICE);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, PRICE) { 
        obj['PRICE'] = PRICE;
    }

    /**
     * Constructs a <code>PriceFilter</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PriceFilter} obj Optional instance to populate.
     * @return {module:model/PriceFilter} The populated <code>PriceFilter</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PriceFilter();

            if (data.hasOwnProperty('PRICE')) {
                obj['PRICE'] = CatalogsProductGroupPricingCurrencyCriteria.constructFromObject(data['PRICE']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>PriceFilter</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>PriceFilter</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of PriceFilter.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // validate the optional field `PRICE`
        if (data['PRICE']) { // data not null
          CatalogsProductGroupPricingCurrencyCriteria.validateJSON(data['PRICE']);
        }

        return true;
    }


}

PriceFilter.RequiredProperties = ["PRICE"];

/**
 * @member {module:model/CatalogsProductGroupPricingCurrencyCriteria} PRICE
 */
PriceFilter.prototype['PRICE'] = undefined;






export default PriceFilter;

