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
import AdCountry from './AdCountry';

/**
 * The AdAccountsCountryResponseData model module.
 * @module model/AdAccountsCountryResponseData
 * @version 1.1.1-pre.0
 */
class AdAccountsCountryResponseData {
    /**
     * Constructs a new <code>AdAccountsCountryResponseData</code>.
     * @alias module:model/AdAccountsCountryResponseData
     */
    constructor() { 
        
        AdAccountsCountryResponseData.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>AdAccountsCountryResponseData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/AdAccountsCountryResponseData} obj Optional instance to populate.
     * @return {module:model/AdAccountsCountryResponseData} The populated <code>AdAccountsCountryResponseData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new AdAccountsCountryResponseData();

            if (data.hasOwnProperty('code')) {
                obj['code'] = AdCountry.constructFromObject(data['code']);
            }
            if (data.hasOwnProperty('currency')) {
                obj['currency'] = ApiClient.convertToType(data['currency'], 'String');
            }
            if (data.hasOwnProperty('index')) {
                obj['index'] = ApiClient.convertToType(data['index'], 'Number');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>AdAccountsCountryResponseData</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>AdAccountsCountryResponseData</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['code'] && !(typeof data['code'] === 'string' || data['code'] instanceof String)) {
            throw new Error("Expected the field `code` to be a primitive type in the JSON string but got " + data['code']);
        }
        // ensure the json data is a string
        if (data['currency'] && !(typeof data['currency'] === 'string' || data['currency'] instanceof String)) {
            throw new Error("Expected the field `currency` to be a primitive type in the JSON string but got " + data['currency']);
        }
        // ensure the json data is a string
        if (data['name'] && !(typeof data['name'] === 'string' || data['name'] instanceof String)) {
            throw new Error("Expected the field `name` to be a primitive type in the JSON string but got " + data['name']);
        }

        return true;
    }


}



/**
 * @member {module:model/AdCountry} code
 */
AdAccountsCountryResponseData.prototype['code'] = undefined;

/**
 * Country currency.
 * @member {String} currency
 */
AdAccountsCountryResponseData.prototype['currency'] = undefined;

/**
 * Country index
 * @member {Number} index
 */
AdAccountsCountryResponseData.prototype['index'] = undefined;

/**
 * Country name
 * @member {String} name
 */
AdAccountsCountryResponseData.prototype['name'] = undefined;






export default AdAccountsCountryResponseData;

