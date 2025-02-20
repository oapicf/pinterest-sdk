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
import TargetingSpecAppType from './TargetingSpecAppType';

/**
 * The AppTypeMultipliers model module.
 * @module model/AppTypeMultipliers
 * @version 1.1.1-pre.0
 */
class AppTypeMultipliers {
    /**
     * Constructs a new <code>AppTypeMultipliers</code>.
     * This represents a mapping from app type targeting criteria to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified app type in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
     * @alias module:model/AppTypeMultipliers
     * @extends Object
     */
    constructor() { 
        
        AppTypeMultipliers.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>AppTypeMultipliers</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/AppTypeMultipliers} obj Optional instance to populate.
     * @return {module:model/AppTypeMultipliers} The populated <code>AppTypeMultipliers</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new AppTypeMultipliers();

            ApiClient.constructFromObject(data, obj, 'Number');
            

            if (data.hasOwnProperty('APP_TYPE')) {
                obj['APP_TYPE'] = TargetingSpecAppType.constructFromObject(data['APP_TYPE']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>AppTypeMultipliers</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>AppTypeMultipliers</code>.
     */
    static validateJSON(data) {

        return true;
    }


}



/**
 * @member {module:model/TargetingSpecAppType} APP_TYPE
 */
AppTypeMultipliers.prototype['APP_TYPE'] = undefined;






export default AppTypeMultipliers;

