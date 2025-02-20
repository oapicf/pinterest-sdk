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
* Enum class AdsAnalyticsFilterColumn.
* @enum {}
* @readonly
*/
export default class AdsAnalyticsFilterColumn {
    
        /**
         * value: "SPEND_IN_DOLLAR"
         * @const
         */
        "SPEND_IN_DOLLAR" = "SPEND_IN_DOLLAR";

    
        /**
         * value: "TOTAL_IMPRESSION"
         * @const
         */
        "TOTAL_IMPRESSION" = "TOTAL_IMPRESSION";

    

    /**
    * Returns a <code>AdsAnalyticsFilterColumn</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/AdsAnalyticsFilterColumn} The enum <code>AdsAnalyticsFilterColumn</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}

