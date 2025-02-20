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
* Enum class AudienceSharingType.
* @enum {}
* @readonly
*/
export default class AudienceSharingType {
    
        /**
         * value: "CUSTOM"
         * @const
         */
        "CUSTOM" = "CUSTOM";

    
        /**
         * value: "SYNDICATED"
         * @const
         */
        "SYNDICATED" = "SYNDICATED";

    

    /**
    * Returns a <code>AudienceSharingType</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/AudienceSharingType} The enum <code>AudienceSharingType</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}

