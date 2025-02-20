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

/**
 * The AdsAnalyticsResponseInner model module.
 * @module model/AdsAnalyticsResponseInner
 * @version 1.1.1-pre.0
 */
class AdsAnalyticsResponseInner {
    /**
     * Constructs a new <code>AdsAnalyticsResponseInner</code>.
     * @alias module:model/AdsAnalyticsResponseInner
     * @extends Object
     * @param AD_ID {String} The ID of the ad that this metrics belongs to.
     */
    constructor(AD_ID) { 
        
        AdsAnalyticsResponseInner.initialize(this, AD_ID);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, AD_ID) { 
        obj['AD_ID'] = AD_ID;
    }

    /**
     * Constructs a <code>AdsAnalyticsResponseInner</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/AdsAnalyticsResponseInner} obj Optional instance to populate.
     * @return {module:model/AdsAnalyticsResponseInner} The populated <code>AdsAnalyticsResponseInner</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new AdsAnalyticsResponseInner();

            ApiClient.constructFromObject(data, obj, 'Object');
            

            if (data.hasOwnProperty('AD_ID')) {
                obj['AD_ID'] = ApiClient.convertToType(data['AD_ID'], 'String');
            }
            if (data.hasOwnProperty('DATE')) {
                obj['DATE'] = ApiClient.convertToType(data['DATE'], 'Date');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>AdsAnalyticsResponseInner</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>AdsAnalyticsResponseInner</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of AdsAnalyticsResponseInner.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['AD_ID'] && !(typeof data['AD_ID'] === 'string' || data['AD_ID'] instanceof String)) {
            throw new Error("Expected the field `AD_ID` to be a primitive type in the JSON string but got " + data['AD_ID']);
        }

        return true;
    }


}

AdsAnalyticsResponseInner.RequiredProperties = ["AD_ID"];

/**
 * The ID of the ad that this metrics belongs to.
 * @member {String} AD_ID
 */
AdsAnalyticsResponseInner.prototype['AD_ID'] = undefined;

/**
 * Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
 * @member {Date} DATE
 */
AdsAnalyticsResponseInner.prototype['DATE'] = undefined;






export default AdsAnalyticsResponseInner;

