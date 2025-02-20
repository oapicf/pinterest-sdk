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
* Enum class MatchType.
* @enum {}
* @readonly
*/
export default class MatchType {
    
        /**
         * value: "BROAD"
         * @const
         */
        "BROAD" = "BROAD";

    
        /**
         * value: "PHRASE"
         * @const
         */
        "PHRASE" = "PHRASE";

    
        /**
         * value: "EXACT"
         * @const
         */
        "EXACT" = "EXACT";

    
        /**
         * value: "EXACT_NEGATIVE"
         * @const
         */
        "EXACT_NEGATIVE" = "EXACT_NEGATIVE";

    
        /**
         * value: "PHRASE_NEGATIVE"
         * @const
         */
        "PHRASE_NEGATIVE" = "PHRASE_NEGATIVE";

    

    /**
    * Returns a <code>MatchType</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/MatchType} The enum <code>MatchType</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}

