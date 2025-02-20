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
* Enum class AssetGroupType.
* @enum {}
* @readonly
*/
export default class AssetGroupType {
    
        /**
         * value: "BRAND"
         * @const
         */
        "BRAND" = "BRAND";

    
        /**
         * value: "LOCATION_OR_LANGUAGE"
         * @const
         */
        "LOCATION_OR_LANGUAGE" = "LOCATION_OR_LANGUAGE";

    
        /**
         * value: "PRODUCT_LINE"
         * @const
         */
        "PRODUCT_LINE" = "PRODUCT_LINE";

    
        /**
         * value: "OTHER"
         * @const
         */
        "OTHER" = "OTHER";

    

    /**
    * Returns a <code>AssetGroupType</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/AssetGroupType} The enum <code>AssetGroupType</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}

